package com.alibaba.android.split.core.tasks;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public final class o implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final h f2489a;
    private final p b;

    static {
        kge.a(1688197969);
        kge.a(-1390502639);
    }

    public o(p pVar, h hVar) {
        this.b = pVar;
        this.f2489a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        synchronized (p.a(this.b)) {
            if (p.b(this.b) != null) {
                p.b(this.b).a(this.f2489a);
            }
        }
    }
}
