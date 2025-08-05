package com.tmall.android.dai.internal.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static b f23711a;
    private static ScheduledExecutorService b;
    private static int c;
    private static final AtomicInteger d;
    private ExecutorService e;

    public static /* synthetic */ AtomicInteger c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("df4eb9d4", new Object[0]) : d;
    }

    static {
        kge.a(-50573615);
        c = 1;
        d = new AtomicInteger();
    }

    public ExecutorService a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("13131fb3", new Object[]{this}) : this.e;
    }

    /* loaded from: classes9.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f23713a;

        static {
            kge.a(-2030009345);
            kge.a(-1938806936);
        }

        public a(int i) {
            this.f23713a = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = b.c().getAndIncrement();
            Thread thread = new Thread(runnable, "walle_c_:" + andIncrement);
            thread.setPriority(this.f23713a);
            return thread;
        }
    }

    private b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 3000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.tmall.android.dai.internal.util.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int b = 0;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                StringBuilder sb = new StringBuilder();
                sb.append("jvs_init_t");
                int i = this.b;
                this.b = i + 1;
                sb.append(i);
                return new Thread(runnable, sb.toString());
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.e = threadPoolExecutor;
    }

    private static synchronized ScheduledExecutorService d() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ScheduledExecutorService) ipChange.ipc$dispatch("44ecc5cf", new Object[0]);
            }
            if (b == null) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(com.tmall.android.dai.internal.config.d.a().f(), new a(c));
                scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                b = scheduledThreadPoolExecutor;
            }
            return b;
        }
    }

    public static synchronized b b() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("cc738fcb", new Object[0]);
            }
            if (f23711a == null) {
                f23711a = new b();
            }
            return f23711a;
        }
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        try {
            d().submit(runnable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
