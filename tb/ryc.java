package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.RequestPoolManager;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;

/* loaded from: classes.dex */
public class ryc implements rxm, rxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1116187362);
        kge.a(178679831);
        kge.a(-2079716300);
    }

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtopsdk.CheckAuthDuplexFilter";
    }

    @Override // tb.rxn
    public String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d3d918c", new Object[]{this, aVar});
        }
        MtopBuilder mtopBuilder = aVar.o;
        if (!(mtopBuilder instanceof MtopBusiness)) {
            return FilterResult.CONTINUE;
        }
        MtopBusiness mtopBusiness = (MtopBusiness) mtopBuilder;
        MtopRequest mtopRequest = aVar.b;
        Mtop mtop = aVar.f25000a;
        boolean isNeedEcode = mtopRequest.isNeedEcode();
        boolean isNeedAuth = mtopBusiness.isNeedAuth();
        if (isNeedEcode && isNeedAuth) {
            try {
                if (mtopBusiness.getRetryTime() < 3) {
                    otx otxVar = new otx(mtopBusiness.mtopProp.openAppKey, mtopBusiness.authParam, mtopBusiness.showAuthUI);
                    if (!oua.b(mtop, otxVar)) {
                        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                            TBSdkLog.i("mtopsdk.CheckAuthDuplexFilter", aVar.h, " execute CheckAuthBeforeFilter.isAuthInfoValid = false");
                        }
                        RequestPoolManager.a(RequestPoolManager.Type.AUTH).a(mtop, otxVar.f32420a, mtopBusiness);
                        oua.a(mtop, otxVar);
                        return "STOP";
                    }
                    String concatStr = StringUtils.concatStr(mtop.getInstanceId(), otxVar.f32420a);
                    if (StringUtils.isBlank(mtopsdk.xstate.a.a(concatStr, "accessToken"))) {
                        String c = oua.c(mtop, otxVar);
                        if (StringUtils.isNotBlank(c)) {
                            mtopsdk.xstate.a.a(concatStr, "accessToken", c);
                        } else {
                            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                                TBSdkLog.i("mtopsdk.CheckAuthDuplexFilter", aVar.h, " execute CheckAuthBeforeFilter.isAuthInfoValid = true,getAuthToken is null.");
                            }
                            RequestPoolManager.a(RequestPoolManager.Type.AUTH).a(mtop, otxVar.f32420a, mtopBusiness);
                            oua.a(mtop, otxVar);
                            return "STOP";
                        }
                    }
                }
            } catch (Exception e) {
                TBSdkLog.e("mtopsdk.CheckAuthDuplexFilter", aVar.h, " execute CheckAuthBeforeFilter error.", e);
            }
        }
        return FilterResult.CONTINUE;
    }

    @Override // tb.rxm
    public String a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b93eb6d", new Object[]{this, aVar});
        }
        MtopBuilder mtopBuilder = aVar.o;
        if (!(mtopBuilder instanceof MtopBusiness)) {
            return FilterResult.CONTINUE;
        }
        MtopBusiness mtopBusiness = (MtopBusiness) mtopBuilder;
        Mtop mtop = aVar.f25000a;
        MtopResponse mtopResponse = aVar.c;
        String retCode = mtopResponse.getRetCode();
        try {
            if (mtopBusiness.isNeedAuth() && mtopBusiness.getRetryTime() < 3 && SwitchConfig.authErrorCodeSet.contains(retCode)) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("mtopsdk.CheckAuthDuplexFilter", aVar.h, " execute CheckAuthAfterFilter.");
                }
                otx otxVar = new otx(mtopBusiness.mtopProp.openAppKey, mtopBusiness.authParam, mtopBusiness.showAuthUI);
                otxVar.d = mtopBusiness.request.getKey();
                if (mtopBusiness.mtopProp.isInnerOpen) {
                    otxVar.e = retCode;
                } else {
                    otxVar.e = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), HttpHeaderConstant.X_ACT_HINT);
                }
                RequestPoolManager.a(RequestPoolManager.Type.AUTH).a(mtop, otxVar.f32420a, mtopBusiness);
                oua.a(mtop, otxVar);
                return "STOP";
            }
        } catch (Exception e) {
            TBSdkLog.e("mtopsdk.CheckAuthDuplexFilter", aVar.h, " execute CheckAuthAfterFilter error.", e);
        }
        return FilterResult.CONTINUE;
    }
}
