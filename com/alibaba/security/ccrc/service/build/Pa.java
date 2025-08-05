package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Pa implements InterfaceC1226l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f3267a;
    public final /* synthetic */ String b;
    public final /* synthetic */ InterfaceC1248sb c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Ra e;

    public Pa(Ra ra, long j, String str, InterfaceC1248sb interfaceC1248sb, boolean z) {
        this.e = ra;
        this.f3267a = j;
        this.b = str;
        this.c = interfaceC1248sb;
        this.d = z;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1226l
    public void a(BaseRequest baseRequest, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3756a450", new Object[]{this, baseRequest, obj});
        } else {
            Ra.a(this.e, obj, this.b, Ra.$ipChange, this.c, System.currentTimeMillis() - this.f3267a, this.d);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1226l
    public void a(BaseRequest baseRequest, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afe53488", new Object[]{this, baseRequest, str, str2});
            return;
        }
        Ra ra = this.e;
        String str3 = this.b;
        String str4 = Ra.$ipChange;
        Ra.a(ra, str3, str4, false, null, "biz callback fail: " + str2, System.currentTimeMillis() - this.f3267a, null, this.d, null);
        this.c.a(false, str2, null);
    }
}
