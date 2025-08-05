package com.taobao.android.behavix.utils;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.dsb;
import tb.kge;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static f f9216a;
    private static ScheduledExecutorService b;
    private static int c;
    private static final AtomicInteger d;

    public static /* synthetic */ AtomicInteger b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("69d49393", new Object[0]) : d;
    }

    static {
        kge.a(-849255185);
        c = 1;
        d = new AtomicInteger();
    }

    private f() {
    }

    private static synchronized ScheduledExecutorService c() {
        synchronized (f.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ScheduledExecutorService) ipChange.ipc$dispatch("161a80e", new Object[0]);
            }
            if (b == null) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new a(c));
                scheduledThreadPoolExecutor.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
                if (Build.VERSION.SDK_INT >= 9) {
                    scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                b = scheduledThreadPoolExecutor;
            }
            return b;
        }
    }

    public static synchronized f a() {
        synchronized (f.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("d4a2978e", new Object[0]);
            }
            if (f9216a == null) {
                f9216a = new f();
            }
            return f9216a;
        }
    }

    public final ScheduledFuture a(ScheduledFuture scheduledFuture, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("767f23a6", new Object[]{this, scheduledFuture, runnable, new Long(j)});
        }
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            scheduledFuture.cancel(true);
        }
        return c().schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        try {
            c().submit(runnable);
        } catch (Throwable th) {
            dsb.a("TaskExecutor.submit", null, null, th);
        }
    }

    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f9217a;

        static {
            kge.a(-94265827);
            kge.a(-1938806936);
        }

        public a(int i) {
            this.f9217a = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = f.b().getAndIncrement();
            Thread thread = new Thread(runnable, "bhx_task" + andIncrement);
            thread.setPriority(this.f9217a);
            return thread;
        }
    }
}
