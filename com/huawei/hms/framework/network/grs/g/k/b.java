package com.huawei.hms.framework.network.grs.g.k;

import android.os.SystemClock;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Future<com.huawei.hms.framework.network.grs.g.d> f7434a;
    private final long b = SystemClock.elapsedRealtime();

    public b(Future<com.huawei.hms.framework.network.grs.g.d> future) {
        this.f7434a = future;
    }

    public Future<com.huawei.hms.framework.network.grs.g.d> a() {
        return this.f7434a;
    }

    public boolean b() {
        return SystemClock.elapsedRealtime() - this.b <= 300000;
    }
}
