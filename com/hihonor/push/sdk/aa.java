package com.hihonor.push.sdk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class aa {
    public static final aa f = new aa();

    /* renamed from: a  reason: collision with root package name */
    public final int f7260a;
    public final int b;
    public volatile Executor c;
    public volatile ExecutorService d;
    public final Object e = new Object();

    /* loaded from: classes4.dex */
    public static class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public aa() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        this.f7260a = availableProcessors + 1;
        this.b = (availableProcessors << 1) + 1;
    }

    public static ExecutorService a() {
        return f.c();
    }

    public static void a(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            b().execute(runnable);
        }
    }

    public static Executor b() {
        aa aaVar = f;
        if (aaVar.c == null) {
            synchronized (aaVar.e) {
                if (aaVar.c == null) {
                    aaVar.c = new a();
                }
            }
        }
        return aaVar.c;
    }

    public final ExecutorService c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f7260a, this.b, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
