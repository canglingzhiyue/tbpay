package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.android.alibaba.ip.runtime.IpChange;

/* renamed from: com.alibaba.security.ccrc.service.build.a  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1193a implements InterfaceC1226l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f3291a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C1196b c;

    public C1193a(C1196b c1196b, String str, String str2) {
        this.c = c1196b;
        this.f3291a = str;
        this.b = str2;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1226l
    public void a(BaseRequest baseRequest, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3756a450", new Object[]{this, baseRequest, obj});
        } else {
            C1196b.a(this.c, true, obj, (String) null, this.f3291a, this.b);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1226l
    public void a(BaseRequest baseRequest, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afe53488", new Object[]{this, baseRequest, str, str2});
        } else {
            C1196b.a(this.c, false, (Object) null, str2, this.f3291a, this.b);
        }
    }
}
