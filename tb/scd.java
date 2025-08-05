package tb;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.login.e;
import com.taobao.tao.remotebusiness.login.h;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes9.dex */
public class scd implements rxm, rxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(695769469);
        kge.a(178679831);
        kge.a(-2079716300);
    }

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "qmtopsdk.CheckSessionDuplexFilter";
    }

    @Override // tb.rxn
    public String b(a aVar) {
        String str;
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
        try {
            str = mtopBusiness.mtopProp.userInfo;
        } catch (Exception e) {
            TBSdkLog.e("qmtopsdk.CheckSessionDuplexFilter", aVar.h, " execute CheckSessionBeforeFilter error.", e);
        }
        if (isNeedEcode && !h.a(mtop, str)) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                TBSdkLog.e("qmtopsdk.CheckSessionDuplexFilter", aVar.h, "execute CheckSessionBeforeFilter.isSessionInvalid = false");
            }
            aVar.c = new MtopResponse(mtopBusiness.request.getApiName(), mtopBusiness.request.getVersion(), ErrorConstant.ERRCODE_ANDROID_SYS_LOGIN_FAIL, ErrorConstant.ERRMSG_ANDROID_SYS_LOGIN_FAIL);
            ryl.a(aVar);
            return "STOP";
        }
        if (isNeedEcode && StringUtils.isBlank(mtop.getMultiAccountSid(str))) {
            e b = h.b(mtop, str);
            if (b != null && !StringUtils.isBlank(b.f21035a)) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e("qmtopsdk.CheckSessionDuplexFilter", aVar.h, "session in loginContext is valid but mtopInstance's sid is null");
                }
                mtop.registerMultiAccountSession(str, b.f21035a, b.b);
            } else {
                aVar.c = new MtopResponse(mtopBusiness.request.getApiName(), mtopBusiness.request.getVersion(), ErrorConstant.ERRCODE_ANDROID_SYS_LOGIN_FAIL, ErrorConstant.ERRMSG_ANDROID_SYS_LOGIN_FAIL);
                ryl.a(aVar);
                return "STOP";
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
        if (!(aVar.o instanceof MtopBusiness)) {
            return FilterResult.CONTINUE;
        }
        Mtop mtop = aVar.f25000a;
        MtopResponse mtopResponse = aVar.c;
        if (mtop.getMtopConfig().notifySessionResult) {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), HttpHeaderConstant.X_SESSION_RET);
            if (StringUtils.isNotBlank(singleHeaderFieldByKey)) {
                Bundle bundle = new Bundle();
                bundle.putString(HttpHeaderConstant.X_SESSION_RET, singleHeaderFieldByKey);
                bundle.putString("Date", HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), "Date"));
                h.a(mtop, bundle);
            }
        }
        return FilterResult.CONTINUE;
    }
}
