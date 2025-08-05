package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class J implements InterfaceC1257vb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f3249a;
    public final /* synthetic */ long b;
    public final /* synthetic */ InterfaceC1257vb c;
    public final /* synthetic */ M d;

    public J(M m, String str, long j, InterfaceC1257vb interfaceC1257vb) {
        this.d = m;
        this.f3249a = str;
        this.b = j;
        this.c = interfaceC1257vb;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1257vb
    public void a(boolean z, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2499ee8f", new Object[]{this, new Boolean(z), str, map});
            return;
        }
        M.a(this.d, CcrcContextImpl.getContext());
        M m = this.d;
        P p = M.$ipChange;
        String str2 = this.f3249a;
        M m2 = this.d;
        p.a(str2, M.$ipChange, z, str, this.b);
        InterfaceC1257vb interfaceC1257vb = this.c;
        if (interfaceC1257vb != null) {
            interfaceC1257vb.a(z, str, map);
        }
        M m3 = this.d;
        M.$ipChange.a(z, str, map);
    }
}
