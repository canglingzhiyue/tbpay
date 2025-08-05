package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.common.log.Logging;
import com.android.alibaba.ip.runtime.IpChange;

/* renamed from: com.alibaba.security.ccrc.service.build.h  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1214h implements InterfaceC1226l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3307a = "HttpCallbackWrapper";
    public final InterfaceC1226l b;

    public C1214h(InterfaceC1226l interfaceC1226l) {
        this.b = interfaceC1226l;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1226l
    public void a(BaseRequest baseRequest, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3756a450", new Object[]{this, baseRequest, obj});
            return;
        }
        InterfaceC1229m interfaceC1229m = (InterfaceC1229m) baseRequest.getClass().getAnnotation(InterfaceC1229m.class);
        if (interfaceC1229m != null) {
            StringBuilder a2 = Yb.a("mtop request ");
            a2.append(interfaceC1229m.apiName());
            a2.append(" success");
            Logging.d(f3307a, a2.toString());
        }
        InterfaceC1226l interfaceC1226l = this.b;
        if (interfaceC1226l == null) {
            return;
        }
        interfaceC1226l.a(baseRequest, obj);
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1226l
    public void a(BaseRequest baseRequest, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afe53488", new Object[]{this, baseRequest, str, str2});
            return;
        }
        InterfaceC1229m interfaceC1229m = (InterfaceC1229m) baseRequest.getClass().getAnnotation(InterfaceC1229m.class);
        if (interfaceC1229m != null) {
            StringBuilder a2 = Yb.a("mtop request ");
            a2.append(interfaceC1229m.apiName());
            a2.append(" fail,errorMsg ");
            a2.append(str2);
            Logging.e(f3307a, a2.toString());
        }
        InterfaceC1226l interfaceC1226l = this.b;
        if (interfaceC1226l == null) {
            return;
        }
        interfaceC1226l.a(baseRequest, str, str2);
    }
}
