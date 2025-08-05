package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes3.dex */
public class Wa implements InterfaceC1232n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f3283a;
    public final /* synthetic */ C1198bb b;

    public Wa(C1198bb c1198bb, List list) {
        this.b = c1198bb;
        this.f3283a = list;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1232n
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b.a(this.f3283a);
    }
}
