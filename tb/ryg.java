package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.abtest.ABTestCenter;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.intf.MtopPrefetch;
import mtopsdk.mtop.util.FullTraceHelper;
import mtopsdk.mtop.util.MtopStatistics;

/* loaded from: classes.dex */
public class ryg implements rxm, rxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1407296277);
        kge.a(178679831);
        kge.a(-2079716300);
    }

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtopsdk.PrefetchDuplexFilter";
    }

    @Override // tb.rxn
    public String b(a aVar) {
        MtopBuilder mtopBuilder;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d3d918c", new Object[]{this, aVar});
        }
        try {
            if (b() || aVar.d.streamMode) {
                return FilterResult.CONTINUE;
            }
            if (aVar.o.getMtopPrefetch() != null) {
                aVar.f25000a.addPrefetchBuilderToMap(aVar.o, aVar.b.getKey());
                return FilterResult.CONTINUE;
            } else if (aVar.d.useCache || a(aVar.b.dataParams) || (mtopBuilder = aVar.f25000a.getPrefetchBuilderMap().get(aVar.b.getKey())) == null || mtopBuilder.getMtopPrefetch().isLocalMode()) {
                return FilterResult.CONTINUE;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                MtopPrefetch.CompareResult compare = mtopBuilder.getMtopPrefetch().getComparator().compare(aVar.o, mtopBuilder);
                HashMap<String, String> hashMap = null;
                if (compare == null || !compare.isSame()) {
                    MtopPrefetch mtopPrefetch = mtopBuilder.getMtopPrefetch();
                    if (compare != null) {
                        hashMap = compare.getData();
                    }
                    MtopPrefetch.onPrefetchAndCommit("TYPE_MISS", mtopPrefetch, aVar, hashMap);
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                        TBSdkLog.d("mtopsdk.PrefetchDuplexFilter", aVar.h + "not hit, miss not the same request");
                    }
                    return FilterResult.CONTINUE;
                }
                mtopBuilder.getMtopPrefetch().lock.lock();
                if (!mtopBuilder.getMtopPrefetch().response.get() && mtopBuilder.getMtopPrefetch().mergeContext == null) {
                    mtopBuilder.getMtopPrefetch().mergeContext = aVar;
                    mtopBuilder.getMtopPrefetch().lock.unlock();
                    return "STOP";
                }
                mtopBuilder.getMtopPrefetch().lock.unlock();
                if (currentTimeMillis - mtopBuilder.getMtopPrefetch().prefetchResponseTime > mtopBuilder.getMtopPrefetch().getPrefetchExpireTime()) {
                    MtopPrefetch.onPrefetchAndCommit("TYPE_EXPIRE", mtopBuilder.getMtopPrefetch(), aVar, null);
                    aVar.f25000a.getPrefetchBuilderMap().remove(aVar.b.getKey());
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                        TBSdkLog.d("mtopsdk.PrefetchDuplexFilter", aVar.h + "not hit, time expired");
                    }
                    return FilterResult.CONTINUE;
                }
                MtopStatistics mtopStatistics = aVar.g;
                MtopResponse mtopResponse = mtopBuilder.getMtopContext().c;
                mtopResponse.setMtopStat(mtopStatistics);
                FullTraceHelper.recordRspCbDispatch(mtopStatistics);
                mtopStatistics.isPrefetch = true;
                MtopFinishEvent mtopFinishEvent = new MtopFinishEvent(mtopResponse);
                mtopFinishEvent.seqNo = aVar.h;
                mtopStatistics.serverTraceId = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), HttpHeaderConstant.SERVER_TRACE_ID);
                mtopStatistics.eagleEyeTraceId = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), "eagleeye-traceid");
                mtopStatistics.retCode = mtopResponse.getRetCode();
                mtopStatistics.statusCode = mtopResponse.getResponseCode();
                mtopStatistics.mappingCode = mtopResponse.getMappingCode();
                mtopStatistics.onEndAndCommit();
                MtopListener mtopListener = aVar.e;
                if (!(aVar.o instanceof MtopBusiness)) {
                    z = true;
                }
                if (z) {
                    FullTraceHelper.recordRspCbStart(mtopStatistics);
                }
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    TBSdkLog.d("mtopsdk.PrefetchDuplexFilter", aVar.h + "hit cache");
                }
                if (mtopListener instanceof MtopCallback.MtopFinishListener) {
                    ((MtopCallback.MtopFinishListener) mtopListener).onFinished(mtopFinishEvent, aVar.d.reqContext);
                }
                if (z) {
                    FullTraceHelper.recordRspCbEnd(aVar.g);
                    mtopStatistics.commitFullTrace();
                }
                mtopBuilder.getMtopPrefetch().prefetchHitTime = currentTimeMillis;
                MtopPrefetch.onPrefetchAndCommit("TYPE_HIT", mtopBuilder.getMtopPrefetch(), aVar, null);
                aVar.f25000a.getPrefetchBuilderMap().remove(aVar.b.getKey());
                return "STOP";
            }
        } catch (Throwable th) {
            String str = aVar.h;
            TBSdkLog.e("mtopsdk.PrefetchDuplexFilter", str, "call prefetch filter before error,apiKey=" + aVar.b.getKey(), th);
        }
        return FilterResult.CONTINUE;
    }

    @Override // tb.rxm
    public String a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b93eb6d", new Object[]{this, aVar});
        }
        try {
        } catch (Throwable th) {
            String str = aVar.h;
            TBSdkLog.e("mtopsdk.PrefetchDuplexFilter", str, "checking after error " + th);
        }
        if (b() || aVar.d.streamMode || aVar.d.useCache) {
            return FilterResult.CONTINUE;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (aVar.o.getMtopPrefetch() != null) {
            MtopPrefetch mtopPrefetch = aVar.o.getMtopPrefetch();
            if (mtopPrefetch.isLocalMode() || mtopPrefetch.response.get()) {
                return FilterResult.CONTINUE;
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                TBSdkLog.d("mtopsdk.PrefetchDuplexFilter", aVar.h + "save prefetch request and get response " + aVar.b.getKey());
            }
            if (aVar.c != null) {
                mtopPrefetch.prefetchResponseTime = currentTimeMillis;
                aVar.f25000a.lastPrefetchResponseTime = currentTimeMillis;
                ReentrantLock reentrantLock = mtopPrefetch.lock;
                reentrantLock.lock();
                mtopPrefetch.response.compareAndSet(false, true);
                if (mtopPrefetch.mergeContext != null) {
                    mtopPrefetch.prefetchHitTime = currentTimeMillis;
                    MtopPrefetch.onPrefetchAndCommit("TYPE_MERGE", mtopPrefetch, aVar, null);
                    aVar.f25000a.getPrefetchBuilderMap().remove(aVar.b.getKey());
                    aVar.e = mtopPrefetch.mergeContext.e;
                    aVar.o = mtopPrefetch.mergeContext.o;
                    aVar.g.isPrefetch = true;
                }
                reentrantLock.unlock();
            }
        }
        return FilterResult.CONTINUE;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!RemoteConfig.getInstance().prefetch || !Mtop.mIsFullTrackValid) {
            return true;
        }
        return !ABTestCenter.isTBSpeedEdition("tsEnable") && !ABTestCenter.isTBSpeedEdition(RemoteConfig.TB_SPEED_U_LAND);
    }

    private boolean a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue();
        }
        if (map != null && !map.isEmpty() && SwitchConfig.getInstance().isEnablePrefetchIgnore()) {
            return StringUtils.equals(map.get(MtopJSBridge.MtopJSParam.IGNORE_PREFETCH), "true");
        }
        return false;
    }
}
