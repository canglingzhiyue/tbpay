package com.alibaba.android.split.core.tasks;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public final class b implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final h f2479a;
    private final c b;

    static {
        kge.a(1542462348);
        kge.a(-1390502639);
    }

    public b(c cVar, h hVar) {
        this.b = cVar;
        this.f2479a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        synchronized (c.a(this.b)) {
            if (c.b(this.b) != null) {
                c.b(this.b).onFailure(this.f2479a.d());
            }
        }
    }
}
