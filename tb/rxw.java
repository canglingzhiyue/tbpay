package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes.dex */
public class rxw implements rxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1392476810);
        kge.a(178679831);
    }

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtopsdk.CheckRequestParamBeforeFilter";
    }

    @Override // tb.rxn
    public String b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d3d918c", new Object[]{this, aVar}) : a(aVar) ? FilterResult.CONTINUE : "STOP";
    }

    private boolean a(a aVar) {
        MtopResponse mtopResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6ed0197", new Object[]{this, aVar})).booleanValue();
        }
        MtopRequest mtopRequest = aVar.b;
        MtopNetworkProp mtopNetworkProp = aVar.d;
        String str = aVar.h;
        String str2 = null;
        if (mtopRequest == null) {
            str2 = "mtopRequest is invalid.mtopRequest=null";
            mtopResponse = new MtopResponse(ErrorConstant.ERRCODE_MTOPCONTEXT_INIT_ERROR, str2);
        } else if (!mtopRequest.isLegalRequest()) {
            str2 = "mtopRequest is invalid. " + mtopRequest.toString();
            mtopResponse = new MtopResponse(mtopRequest.getApiName(), mtopRequest.getVersion(), ErrorConstant.ERRCODE_MTOPCONTEXT_INIT_ERROR, str2);
        } else if (mtopNetworkProp == null) {
            str2 = "MtopNetworkProp is invalid.property=null";
            mtopResponse = new MtopResponse(mtopRequest.getApiName(), mtopRequest.getVersion(), ErrorConstant.ERRCODE_MTOPCONTEXT_INIT_ERROR, str2);
        } else {
            mtopResponse = null;
        }
        aVar.c = mtopResponse;
        if (StringUtils.isNotBlank(str2) && TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
            TBSdkLog.e("mtopsdk.CheckRequestParamBeforeFilter", str, "[checkRequiredParam]" + str2);
        }
        if (mtopRequest != null && TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.CheckRequestParamBeforeFilter", str, "[checkRequiredParam]" + mtopRequest.toString());
        }
        ryl.a(aVar);
        if (!SwitchConfig.getInstance().isGlobalSpdySslSwitchOpen()) {
            TBSdkLog.w("mtopsdk.CheckRequestParamBeforeFilter", str, "[checkRequiredParam]MTOP SSL switch is false");
            aVar.d.protocol = ProtocolEnum.HTTP;
        }
        return mtopResponse == null;
    }
}
