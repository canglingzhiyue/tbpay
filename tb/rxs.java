package tb;

import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.stat.IMtopMonitor;
import mtopsdk.mtop.stat.MtopMonitor;
import mtopsdk.mtop.util.FullTraceHelper;
import mtopsdk.mtop.util.MtopStatistics;

/* loaded from: classes.dex */
public class rxs implements rxm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1859853642);
        kge.a(-2079716300);
    }

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtopsdk.ExecuteCallbackAfterFilter";
    }

    @Override // tb.rxm
    public String a(a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b93eb6d", new Object[]{this, aVar});
        }
        MtopStatistics mtopStatistics = aVar.g;
        MtopResponse mtopResponse = aVar.c;
        FullTraceHelper.recordRspCbDispatch(mtopStatistics);
        String str = aVar.h;
        MtopFinishEvent mtopFinishEvent = new MtopFinishEvent(mtopResponse);
        mtopFinishEvent.seqNo = str;
        mtopStatistics.serverTraceId = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), HttpHeaderConstant.SERVER_TRACE_ID);
        mtopStatistics.eagleEyeTraceId = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), "eagleeye-traceid");
        mtopStatistics.parseServerStat(mtopResponse.getHeaderFields());
        mtopStatistics.retCode = mtopResponse.getRetCode();
        mtopStatistics.statusCode = mtopResponse.getResponseCode();
        mtopStatistics.mappingCode = mtopResponse.getMappingCode();
        MtopListener mtopListener = aVar.e;
        try {
            if (aVar.o instanceof MtopBusiness) {
                if (aVar.d.handler != null) {
                    mtopStatistics.isMain = aVar.d.handler.getLooper().equals(Looper.getMainLooper());
                }
                z = false;
            } else {
                mtopStatistics.isMain = false;
            }
            mtopStatistics.onEndAndCommit();
            if (z) {
                FullTraceHelper.recordRspCbStart(mtopStatistics);
            }
            if (mtopListener instanceof MtopCallback.MtopFinishListener) {
                ((MtopCallback.MtopFinishListener) mtopListener).onFinished(mtopFinishEvent, aVar.d.reqContext);
            } else if (mtopListener instanceof MtopCallback.MtopStreamListener) {
                ((MtopCallback.MtopStreamListener) mtopListener).onFinish(mtopFinishEvent, aVar.d.reqContext);
            }
            if (MtopMonitor.getInstance() != null) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put(IMtopMonitor.DATA_RESPONSE, aVar.c.getResponseLog());
                hashMap.put(IMtopMonitor.DATA_SEQ, aVar.h);
                MtopMonitor.getInstance().onCommit(IMtopMonitor.MtopMonitorType.TYPE_RESPONSE, hashMap);
            }
            if (MtopMonitor.getHeaderMonitor() != null) {
                String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(aVar.c.getHeaderFields(), HttpHeaderConstant.X_AB);
                if (!TextUtils.isEmpty(singleHeaderFieldByKey)) {
                    HashMap<String, String> hashMap2 = new HashMap<>();
                    hashMap2.put(HttpHeaderConstant.X_AB, singleHeaderFieldByKey);
                    hashMap2.put(IMtopMonitor.DATA_SEQ, aVar.h);
                    MtopMonitor.getHeaderMonitor().onCommit(IMtopMonitor.MtopMonitorType.TYPE_RESPONSE, hashMap2);
                }
            }
            if (SwitchConfig.getInstance().getEnableResponseHeader() && MtopMonitor.getResponseHeaderMonitors() != null) {
                for (Map.Entry<String, IMtopMonitor> entry : MtopMonitor.getResponseHeaderMonitors().entrySet()) {
                    String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(aVar.c.getHeaderFields(), entry.getKey());
                    if (StringUtils.isNotBlank(singleHeaderFieldByKey2)) {
                        HashMap<String, String> hashMap3 = new HashMap<>();
                        hashMap3.put(entry.getKey(), singleHeaderFieldByKey2);
                        hashMap3.put(IMtopMonitor.DATA_SEQ, aVar.h);
                        entry.getValue().onCommit(IMtopMonitor.MtopMonitorType.TYPE_RESPONSE, hashMap3);
                    }
                }
            }
            if (!z) {
                return FilterResult.CONTINUE;
            }
            FullTraceHelper.recordRspCbEnd(mtopStatistics);
            mtopStatistics.commitFullTrace();
            return FilterResult.CONTINUE;
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.ExecuteCallbackAfterFilter", str, "call MtopFinishListener error,apiKey=" + aVar.b.getKey(), th);
            return FilterResult.CONTINUE;
        }
    }
}
