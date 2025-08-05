package mtopsdk.mtop.cache.handler;

import android.os.Handler;
import anetwork.network.cache.RpcCache;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ResponseSource;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.network.domain.Request;
import tb.kge;
import tb.ryl;

/* loaded from: classes9.dex */
public class ExpiredCacheParser implements ICacheParser {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.ExpiredCacheParser";

    static {
        kge.a(-933671912);
        kge.a(868916564);
    }

    @Override // mtopsdk.mtop.cache.handler.ICacheParser
    public void parse(ResponseSource responseSource, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0249bc", new Object[]{this, responseSource, handler});
            return;
        }
        final String str = responseSource.seqNo;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, str, "[parse]ExpiredCacheParser parse called");
        }
        a aVar = responseSource.mtopContext;
        MtopStatistics mtopStatistics = aVar.g;
        mtopStatistics.cacheHitType = 2;
        mtopStatistics.cacheResponseParseStartTime = mtopStatistics.currentTimeMillis();
        RpcCache rpcCache = responseSource.rpcCache;
        MtopResponse initResponseFromCache = CacheStatusHandler.initResponseFromCache(rpcCache, aVar.b);
        initResponseFromCache.setSource(MtopResponse.ResponseSource.EXPIRED_CACHE);
        mtopStatistics.cacheResponseParseEndTime = mtopStatistics.currentTimeMillis();
        initResponseFromCache.setMtopStat(mtopStatistics);
        final MtopListener mtopListener = aVar.e;
        final Object obj = aVar.d.reqContext;
        if (mtopListener instanceof MtopCallback.MtopCacheListener) {
            final MtopCacheEvent mtopCacheEvent = new MtopCacheEvent(initResponseFromCache);
            mtopCacheEvent.seqNo = str;
            mtopStatistics.cacheReturnTime = mtopStatistics.currentTimeMillis();
            CacheStatusHandler.finishMtopStatisticsOnExpiredCache(mtopStatistics, initResponseFromCache);
            if (!aVar.d.skipCacheCallback) {
                ryl.a(handler, new Runnable() { // from class: mtopsdk.mtop.cache.handler.ExpiredCacheParser.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            ((MtopCallback.MtopCacheListener) mtopListener).onCached(mtopCacheEvent, obj);
                        } catch (Exception e) {
                            TBSdkLog.e(ExpiredCacheParser.TAG, str, "do onCached callback error.", e);
                        }
                    }
                }, aVar.h.hashCode());
            }
        }
        mtopStatistics.cacheHitType = 3;
        Request request = aVar.k;
        if (request != null) {
            if (StringUtils.isNotBlank(rpcCache.lastModified)) {
                request.a(HttpHeaderConstant.IF_MODIFIED_SINCE, rpcCache.lastModified);
            }
            if (StringUtils.isNotBlank(rpcCache.etag)) {
                request.a(HttpHeaderConstant.IF_NONE_MATCH, rpcCache.etag);
            }
        }
        responseSource.cacheResponse = initResponseFromCache;
    }
}
