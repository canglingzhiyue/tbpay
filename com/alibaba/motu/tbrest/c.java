package com.alibaba.motu.tbrest;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static final AtomicInteger INTEGER;

    /* renamed from: a  reason: collision with root package name */
    public static ScheduledExecutorService f3149a;
    public static int b;
    private static boolean d;
    public Integer c = 2;

    /* loaded from: classes.dex */
    static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private int f3150a;

        static {
            kge.a(1267576953);
            kge.a(-1938806936);
        }

        public a(int i) {
            this.f3150a = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            int andIncrement = c.INTEGER.getAndIncrement();
            Thread thread = new Thread(runnable, "RestSend:" + andIncrement);
            thread.setPriority(this.f3150a);
            return thread;
        }
    }

    static {
        kge.a(-1675246971);
        b = 1;
        INTEGER = new AtomicInteger();
        d = false;
    }

    public static void a(boolean z) {
        d = z;
    }

    public static boolean a() {
        return d;
    }

    public synchronized void a(Runnable runnable) {
        try {
            if (f3149a == null) {
                f3149a = Executors.newScheduledThreadPool(this.c.intValue(), new a(b));
                if (d && (f3149a instanceof ThreadPoolExecutor)) {
                    ((ThreadPoolExecutor) f3149a).setKeepAliveTime(1L, TimeUnit.SECONDS);
                    ((ThreadPoolExecutor) f3149a).allowCoreThreadTimeOut(true);
                }
            }
            f3149a.submit(runnable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
