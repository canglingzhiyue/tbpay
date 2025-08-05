package com.uc.webview.base.task;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import com.uc.webview.base.Log;
import java.lang.Thread;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f23802a = "e";
    private static final Thread.UncaughtExceptionHandler b = new Thread.UncaughtExceptionHandler() { // from class: com.uc.webview.base.task.e.1
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            String str = e.f23802a;
            Log.w(str, thread.getName() + " uncaughtException", th);
        }
    };

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public HandlerThread f23803a;
        public Handler b;

        public a(String str) {
            this.f23803a = new HandlerThread(str, 0);
            this.f23803a.start();
            this.b = new Handler(this.f23803a.getLooper());
        }

        protected final void finalize() throws Throwable {
            this.f23803a.quit();
        }
    }

    /* loaded from: classes9.dex */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicInteger f23804a;
        final ScheduledThreadPoolExecutor b;

        /* loaded from: classes9.dex */
        static final class a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f23807a = new b((byte) 0);
        }

        private b() {
            this.f23804a = new AtomicInteger(0);
            this.b = new ScheduledThreadPoolExecutor(3, new ThreadFactory() { // from class: com.uc.webview.base.task.e.b.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return e.a("pool-" + String.valueOf(b.this.f23804a.incrementAndGet()), runnable);
                }
            }, new RejectedExecutionHandler() { // from class: com.uc.webview.base.task.e.b.2
                @Override // java.util.concurrent.RejectedExecutionHandler
                public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                    Log.w(e.f23802a, "no available resource for ".concat(String.valueOf(runnable)));
                    AsyncTask.execute(runnable);
                }
            });
            try {
                this.b.setMaximumPoolSize(5);
                this.b.setKeepAliveTime(35L, TimeUnit.SECONDS);
                this.b.allowCoreThreadTimeOut(true);
            } catch (Throwable th) {
                Log.w(e.f23802a, "config executor failed", th);
            }
        }

        /* synthetic */ b(byte b) {
            this();
        }
    }

    public static final a a(String str) {
        String b2 = b(str);
        a aVar = new a(b2);
        Log.d(f23802a, "createHandlerThread: ".concat(String.valueOf(b2)));
        return aVar;
    }

    static /* synthetic */ Thread a(String str, Runnable runnable) {
        String b2 = b(str);
        Thread thread = new Thread(runnable, b2);
        thread.setUncaughtExceptionHandler(b);
        Log.d(f23802a, "createThread: ".concat(String.valueOf(b2)));
        return thread;
    }

    public static final void a(Runnable runnable) {
        b.a.f23807a.b.execute(runnable);
    }

    public static final void a(Runnable runnable, long j) {
        b.a.f23807a.b.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public static final String b(String str) {
        return String.format("%s-%s", "u4sdk", str);
    }
}
