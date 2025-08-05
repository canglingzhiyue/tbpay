package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.antiattack.ApiLockHelper;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKUtils;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes.dex */
public class ryf implements rxm, rxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1881048129);
        kge.a(178679831);
        kge.a(-2079716300);
    }

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtopsdk.FlowLimitDuplexFilter";
    }

    @Override // tb.rxn
    public String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d3d918c", new Object[]{this, aVar});
        }
        if (aVar.d != null && aVar.d.priorityFlag) {
            return FilterResult.CONTINUE;
        }
        MtopRequest mtopRequest = aVar.b;
        String key = mtopRequest.getKey();
        if (MtopUtils.apiWhiteList.contains(key) || !ApiLockHelper.iSApiLocked(key, SDKUtils.getCorrectionTime())) {
            return FilterResult.CONTINUE;
        }
        aVar.c = new MtopResponse(mtopRequest.getApiName(), mtopRequest.getVersion(), "ANDROID_SYS_API_FLOW_LIMIT_LOCKED", ErrorConstant.ERRMSG_API_FLOW_LIMIT_LOCKED);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
            String str = aVar.h;
            TBSdkLog.w("mtopsdk.FlowLimitDuplexFilter", str, "[doBefore] execute FlowLimitDuplexFilter apiKey=" + key);
        }
        ryl.a(aVar);
        return "STOP";
    }

    @Override // tb.rxm
    public String a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b93eb6d", new Object[]{this, aVar});
        }
        MtopResponse mtopResponse = aVar.c;
        if (420 != mtopResponse.getResponseCode()) {
            return FilterResult.CONTINUE;
        }
        String key = aVar.b.getKey();
        ApiLockHelper.lock(key, SDKUtils.getCorrectionTime(), 0L);
        ryl.a(mtopResponse);
        if (StringUtils.isBlank(mtopResponse.getRetCode())) {
            aVar.c.setRetCode("ANDROID_SYS_API_FLOW_LIMIT_LOCKED");
            aVar.c.setRetMsg(ErrorConstant.ERRMSG_API_FLOW_LIMIT_LOCKED);
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
            String str = aVar.h;
            TBSdkLog.w("mtopsdk.FlowLimitDuplexFilter", str, "[doAfter] execute FlowLimitDuplexFilter apiKey=" + key + " ,retCode=" + mtopResponse.getRetCode());
        }
        ryl.a(aVar);
        return "STOP";
    }
}
