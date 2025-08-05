package mtopsdk.mtop.cache.handler;

import android.os.Handler;
import anetwork.network.cache.RpcCache;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ResponseSource;
import mtopsdk.mtop.util.MtopStatistics;
import tb.kge;
import tb.ryl;

/* loaded from: classes9.dex */
public class CacheStatusHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.CacheStatusHandler";

    static {
        kge.a(111871186);
    }

    public static void handleCacheStatus(ResponseSource responseSource, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae996e55", new Object[]{responseSource, handler});
        } else if (responseSource == null) {
        } else {
            if (responseSource.rpcCache != null) {
                CacheParserFactory.createCacheParser(responseSource.rpcCache.cacheStatus).parse(responseSource, handler);
            } else {
                TBSdkLog.i(TAG, responseSource.seqNo, "[handleCacheStatus]Didn't  hit local cache ");
            }
        }
    }

    public static MtopResponse initResponseFromCache(RpcCache rpcCache, MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("168ee586", new Object[]{rpcCache, mtopRequest});
        }
        MtopResponse mtopResponse = new MtopResponse();
        mtopResponse.setApi(mtopRequest.getApiName());
        mtopResponse.setV(mtopRequest.getVersion());
        mtopResponse.setBytedata(rpcCache.body);
        mtopResponse.setHeaderFields(rpcCache.header);
        mtopResponse.setResponseCode(200);
        ryl.a(mtopResponse);
        return mtopResponse;
    }

    public static void finishMtopStatisticsOnExpiredCache(MtopStatistics mtopStatistics, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60776da7", new Object[]{mtopStatistics, mtopResponse});
        } else if (mtopStatistics == null || mtopResponse == null) {
        } else {
            MtopStatistics mtopStatistics2 = null;
            try {
                mtopStatistics2 = (MtopStatistics) mtopStatistics.clone();
            } catch (Exception e) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e(TAG, mtopStatistics.seqNo, "[finishMtopStatisticsOnCache] clone MtopStatistics error.", e);
                }
            }
            if (mtopStatistics2 == null) {
                return;
            }
            mtopResponse.setMtopStat(mtopStatistics2);
            mtopStatistics2.serverTraceId = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), HttpHeaderConstant.SERVER_TRACE_ID);
            mtopStatistics2.statusCode = mtopResponse.getResponseCode();
            mtopStatistics2.retCode = mtopResponse.getRetCode();
            mtopStatistics2.onEndAndCommit();
        }
    }
}
