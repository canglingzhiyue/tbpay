package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Va implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f3281a;
    public final /* synthetic */ InterfaceC1257vb b;
    public final /* synthetic */ C1198bb c;

    public Va(C1198bb c1198bb, String str, InterfaceC1257vb interfaceC1257vb) {
        this.c = c1198bb;
        this.f3281a = str;
        this.b = interfaceC1257vb;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            C1198bb.a(this.c, this.f3281a, this.b);
        }
    }
}
