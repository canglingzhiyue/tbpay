package com.taobao.android.searchbaseframe.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class i implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile String f15016a;

    static {
        kge.a(-1201480279);
        kge.a(-1390502639);
    }

    public abstract void a();

    public i() {
        this.f15016a = "RUNNABLE";
    }

    public i(String str) {
        this.f15016a = "RUNNABLE";
        this.f15016a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            a();
        } catch (Throwable th) {
            k.a("RunnableEx", "Runnable Exception: " + this.f15016a, th);
        }
    }
}
