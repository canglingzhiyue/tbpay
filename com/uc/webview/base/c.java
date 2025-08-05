package com.uc.webview.base;

import android.os.SystemClock;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public long f23776a = System.currentTimeMillis();
    private long b = SystemClock.currentThreadTimeMillis();

    public final long a() {
        return System.currentTimeMillis() - this.f23776a;
    }

    public final String toString() {
        return String.format("milis: %d/%d", Long.valueOf(a()), Long.valueOf(SystemClock.currentThreadTimeMillis() - this.b));
    }
}
