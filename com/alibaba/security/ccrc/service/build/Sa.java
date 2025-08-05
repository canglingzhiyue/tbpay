package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class Sa implements InterfaceC1257vb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC1257vb f3274a;
    public final /* synthetic */ Ta b;

    public Sa(Ta ta, InterfaceC1257vb interfaceC1257vb) {
        this.b = ta;
        this.f3274a = interfaceC1257vb;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1257vb
    public void a(boolean z, String str, Map<String, Object> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2499ee8f", new Object[]{this, new Boolean(z), str, map});
            return;
        }
        Ta ta = this.b;
        if (z) {
            str2 = "激活成功";
        } else {
            str2 = "激活失败:" + str;
        }
        Ta.a(ta, z, str2);
        this.f3274a.a(z, str, map);
    }
}
