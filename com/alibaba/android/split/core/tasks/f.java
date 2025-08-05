package com.alibaba.android.split.core.tasks;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public final class f implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final h f2481a;
    private final g b;

    static {
        kge.a(1993580805);
        kge.a(-1390502639);
    }

    public f(g gVar, h hVar) {
        this.b = gVar;
        this.f2481a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        synchronized (g.a(this.b)) {
            if (g.b(this.b) != null) {
                g.b(this.b).onSuccess(this.f2481a.c());
            }
        }
    }
}
