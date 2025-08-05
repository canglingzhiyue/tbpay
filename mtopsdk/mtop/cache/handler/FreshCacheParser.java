package mtopsdk.mtop.cache.handler;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ResponseSource;
import mtopsdk.mtop.util.MtopStatistics;
import tb.kge;
import tb.ryl;

/* loaded from: classes9.dex */
public class FreshCacheParser implements ICacheParser {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.FreshCacheParser";

    static {
        kge.a(-1255855761);
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
            TBSdkLog.i(TAG, str, "[parse]FreshCacheParser parse called");
        }
        responseSource.requireConnection = false;
        a aVar = responseSource.mtopContext;
        MtopRequest mtopRequest = aVar.b;
        MtopStatistics mtopStatistics = aVar.g;
        mtopStatistics.cacheHitType = 1;
        mtopStatistics.cacheResponseParseStartTime = mtopStatistics.currentTimeMillis();
        MtopResponse initResponseFromCache = CacheStatusHandler.initResponseFromCache(responseSource.rpcCache, mtopRequest);
        initResponseFromCache.setSource(MtopResponse.ResponseSource.FRESH_CACHE);
        mtopStatistics.cacheResponseParseEndTime = mtopStatistics.currentTimeMillis();
        initResponseFromCache.setMtopStat(mtopStatistics);
        responseSource.cacheResponse = initResponseFromCache;
        mtopStatistics.cacheReturnTime = mtopStatistics.currentTimeMillis();
        if (!aVar.d.forceRefreshCache) {
            return;
        }
        responseSource.requireConnection = true;
        final MtopListener mtopListener = aVar.e;
        if (!(mtopListener instanceof MtopCallback.MtopCacheListener)) {
            return;
        }
        final Object obj = aVar.d.reqContext;
        final MtopCacheEvent mtopCacheEvent = new MtopCacheEvent(initResponseFromCache);
        mtopCacheEvent.seqNo = str;
        CacheStatusHandler.finishMtopStatisticsOnExpiredCache(mtopStatistics, initResponseFromCache);
        if (!aVar.d.skipCacheCallback) {
            ryl.a(handler, new Runnable() { // from class: mtopsdk.mtop.cache.handler.FreshCacheParser.1
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
                        TBSdkLog.e(FreshCacheParser.TAG, str, "do onCached callback error.", e);
                    }
                }
            }, aVar.h.hashCode());
        }
        mtopStatistics.cacheHitType = 3;
    }
}
