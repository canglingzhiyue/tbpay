package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.util.Log;
import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.common.http.model.BaseResponse;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;

/* renamed from: com.alibaba.security.ccrc.service.build.j  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1220j implements InterfaceC1223k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3312a = "MTopHttpHelper";
    public static final String b = "1.0";
    public final Mtop c;

    public C1220j(Context context) {
        this.c = Mtop.instance((String) null, context);
    }

    public static /* synthetic */ void a(C1220j c1220j, BaseRequest baseRequest, MtopResponse mtopResponse, InterfaceC1226l interfaceC1226l, InterfaceC1229m interfaceC1229m) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d640e5e6", new Object[]{c1220j, baseRequest, mtopResponse, interfaceC1226l, interfaceC1229m});
        } else {
            c1220j.a(baseRequest, mtopResponse, interfaceC1226l, interfaceC1229m);
        }
    }

    private void b(BaseRequest baseRequest, InterfaceC1226l interfaceC1226l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c53313cd", new Object[]{this, baseRequest, interfaceC1226l});
            return;
        }
        InterfaceC1229m interfaceC1229m = (InterfaceC1229m) baseRequest.getClass().getAnnotation(InterfaceC1229m.class);
        if (interfaceC1229m == null) {
            Logging.e(f3312a, "request is not annotated by api");
            return;
        }
        if (interfaceC1229m.intercept()) {
            C1261x.a(baseRequest);
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(interfaceC1229m.apiName());
        mtopRequest.setVersion("1.0");
        mtopRequest.setData(baseRequest.body());
        MtopBusiness build = MtopBusiness.build(this.c, mtopRequest);
        build.mo1335useWua();
        if (!interfaceC1229m.isAsync()) {
            a(baseRequest, build.mo1305reqMethod(MethodEnum.POST).syncRequest(), interfaceC1226l, interfaceC1229m);
            return;
        }
        build.registerListener((IRemoteListener) new C1217i(this, baseRequest, interfaceC1226l, interfaceC1229m));
        build.mo1305reqMethod(MethodEnum.POST).startRequest();
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1223k
    public void a(BaseRequest baseRequest, InterfaceC1226l interfaceC1226l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ab70cc", new Object[]{this, baseRequest, interfaceC1226l});
        } else {
            b(baseRequest, interfaceC1226l);
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            Mtop mtop = Mtop.getInstance(null);
            if (mtop != null) {
                return mtop.getMtopConfig().envMode == EnvModeEnum.ONLINE;
            }
        } catch (Throwable th) {
            Logging.e(f3312a, "mtop env", th);
        }
        return true;
    }

    private void a(BaseRequest baseRequest, MtopResponse mtopResponse, InterfaceC1226l interfaceC1226l, InterfaceC1229m interfaceC1229m) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e3dbd8", new Object[]{this, baseRequest, mtopResponse, interfaceC1226l, interfaceC1229m});
            return;
        }
        C1214h c1214h = new C1214h(interfaceC1226l);
        if (mtopResponse == null) {
            c1214h.a(baseRequest, "DATA_ERROR", "response is null");
        } else if (!mtopResponse.isApiSuccess()) {
            c1214h.a(baseRequest, mtopResponse.getRetCode(), mtopResponse.toString());
        } else {
            try {
                c1214h.a(baseRequest, a(mtopResponse.getDataJsonObject().toString(), interfaceC1229m.responseType()));
            } catch (Throwable th) {
                String retCode = mtopResponse.getRetCode();
                StringBuilder a2 = Yb.a("MTop error:");
                a2.append(Log.getStackTraceString(th));
                c1214h.a(baseRequest, retCode, a2.toString());
            }
        }
    }

    private Object a(String str, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("21de4147", new Object[]{this, str, cls});
        }
        BaseResponse baseResponse = (BaseResponse) JsonUtils.parseObject(str, (Class<Object>) BaseResponse.class);
        if (baseResponse != null) {
            C1261x.a(baseResponse);
            return JsonUtils.parseObject(JsonUtils.toJSONString(baseResponse.data), (Class<Object>) cls);
        }
        throw new Exception("数据为空");
    }
}
