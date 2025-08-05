package com.vivo.push;

import android.os.SystemClock;

/* loaded from: classes9.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private volatile long f24273a = -1;

    public final synchronized boolean a() {
        boolean z;
        long j = this.f24273a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        z = j != -1 && elapsedRealtime > j && elapsedRealtime < j + 2000;
        this.f24273a = SystemClock.elapsedRealtime();
        return z;
    }
}
