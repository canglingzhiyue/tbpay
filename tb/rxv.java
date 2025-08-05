package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes.dex */
public class rxv implements rxm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1499976493);
        kge.a(-2079716300);
    }

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtopsdk.TimeCalibrationAfterFilter";
    }

    @Override // tb.rxm
    public String a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b93eb6d", new Object[]{this, aVar});
        }
        MtopResponse mtopResponse = aVar.c;
        MtopNetworkProp mtopNetworkProp = aVar.d;
        if (!mtopResponse.isExpiredRequest() || mtopNetworkProp.timeCalibrated) {
            return FilterResult.CONTINUE;
        }
        mtopNetworkProp.timeCalibrated = true;
        mtopNetworkProp.skipCacheCallback = true;
        try {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), HttpHeaderConstant.X_SYSTIME);
            if (!StringUtils.isNotBlank(singleHeaderFieldByKey)) {
                return FilterResult.CONTINUE;
            }
            mtopsdk.xstate.a.c("t_offset", String.valueOf(Long.parseLong(singleHeaderFieldByKey) - (System.currentTimeMillis() / 1000)));
            ryh ryhVar = aVar.f25000a.getMtopConfig().filterManager;
            if (ryhVar == null) {
                return FilterResult.CONTINUE;
            }
            ryhVar.a(new rxz(null).a(), aVar);
            return "STOP";
        } catch (Exception e) {
            TBSdkLog.e("mtopsdk.TimeCalibrationAfterFilter", aVar.h, "parse x-systime from mtop response header error", e);
            return FilterResult.CONTINUE;
        }
    }
}
