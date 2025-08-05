package com.meizu.cloud.pushsdk.d.m;

import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadPoolExecutor f7889a;

    /* loaded from: classes4.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private static a f7890a = new a();
    }

    private a() {
        this.f7889a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new d().a("io-pool-%d").a());
    }

    public static a a() {
        return b.f7890a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f7889a.execute(runnable);
    }
}
