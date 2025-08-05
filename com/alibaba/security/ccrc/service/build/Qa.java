package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.wukong.config.WuKongBizConfigData;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Qa implements InterfaceC1248sb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC1248sb f3270a;
    public final /* synthetic */ Ra b;

    public Qa(Ra ra, InterfaceC1248sb interfaceC1248sb) {
        this.b = ra;
        this.f3270a = interfaceC1248sb;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1248sb
    public void a(boolean z, String str, WuKongBizConfigData wuKongBizConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d25c8a8", new Object[]{this, new Boolean(z), str, wuKongBizConfigData});
            return;
        }
        InterfaceC1248sb interfaceC1248sb = this.f3270a;
        if (interfaceC1248sb == null) {
            return;
        }
        interfaceC1248sb.a(z, str, wuKongBizConfigData);
    }
}
