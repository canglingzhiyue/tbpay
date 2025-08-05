package com.alibaba.android.bindingx.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes2.dex */
public class j implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Runnable> f2251a;

    static {
        kge.a(198036298);
        kge.a(-1390502639);
    }

    public j(Runnable runnable) {
        this.f2251a = new WeakReference<>(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Runnable runnable = this.f2251a.get();
        if (runnable == null) {
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            h.d(th.getMessage());
        }
    }
}
