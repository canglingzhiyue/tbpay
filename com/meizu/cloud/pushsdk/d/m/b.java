package com.meizu.cloud.pushsdk.d.m;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class b implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadPoolExecutor f7891a;

    /* renamed from: com.meizu.cloud.pushsdk.d.m.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static class C0277b {

        /* renamed from: a  reason: collision with root package name */
        private static b f7892a = new b();
    }

    private b() {
        this.f7891a = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new d().a((Integer) 10).a("message-pool-%d").a());
    }

    public static b a() {
        return C0277b.f7892a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f7891a.execute(runnable);
    }
}
