package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes.dex */
public class rxt implements rxm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1249572962);
        kge.a(-2079716300);
    }

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtopsdk.NetworkErrorAfterFilter";
    }

    @Override // tb.rxm
    public String a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b93eb6d", new Object[]{this, aVar});
        }
        MtopResponse mtopResponse = aVar.c;
        if (mtopResponse.getResponseCode() < 0) {
            if (aVar.f != null && aVar.f.getCall() != null && (aVar.f.getCall() instanceof rym) && ((rym) aVar.f.getCall()).a(mtopResponse.getResponseCode())) {
                mtopResponse.setRetCode(ErrorConstant.ERRCODE_NO_NETWORK);
                mtopResponse.setRetMsg(ErrorConstant.ERRMSG_NO_NETWORK);
            } else if (mtopResponse.getResponseCode() == -9) {
                mtopResponse.setRetCode(ErrorConstant.ERRCODE_SYS_STREAM_BODY_TIMEOUT);
                mtopResponse.setRetMsg(ErrorConstant.ERRMSG_SYS_STREAM_BODY_TIMEOUT);
            } else {
                mtopResponse.setRetCode("ANDROID_SYS_NETWORK_ERROR");
                mtopResponse.setRetMsg("网络错误");
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                StringBuilder sb = new StringBuilder(128);
                sb.append("api=");
                sb.append(mtopResponse.getApi());
                sb.append(",v=");
                sb.append(mtopResponse.getV());
                sb.append(",retCode =");
                sb.append(mtopResponse.getRetCode());
                sb.append(",responseCode =");
                sb.append(mtopResponse.getResponseCode());
                sb.append(",responseHeader=");
                sb.append(mtopResponse.getHeaderFields());
                TBSdkLog.e("mtopsdk.NetworkErrorAfterFilter", aVar.h, sb.toString());
            }
            ryl.a(aVar);
            return "STOP";
        }
        int responseCode = mtopResponse.getResponseCode();
        if (!SwitchConfig.getInstance().isEnableLongParamOptimize()) {
            return FilterResult.CONTINUE;
        }
        if ((responseCode != 400 && responseCode != 414 && responseCode != 431 && responseCode != 500) || aVar.p <= 8192) {
            return FilterResult.CONTINUE;
        }
        mtopResponse.setRetCode(ErrorConstant.ERRCODE_SYS_PARAM_TOO_LONG);
        mtopResponse.setRetMsg(ErrorConstant.ERRMSG_SYS_PARAM_TOO_LONG);
        ryl.a(aVar);
        return "STOP";
    }
}
