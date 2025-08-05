package com.taobao.accs.asp;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f8177a;
    private static ThreadPoolExecutor b;
    private static ThreadPoolExecutor c;
    private static ThreadPoolExecutor d;

    public static /* synthetic */ AtomicInteger a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("f45a6d52", new Object[0]) : f8177a;
    }

    static {
        kge.a(-1603340020);
        f8177a = new AtomicInteger(0);
        b = null;
        c = null;
        d = null;
    }

    private static ThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("c0e939c9", new Object[0]);
        }
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, Integer.MAX_VALUE, 3L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0312a("aprefs-file-load"));
                    d = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return d;
    }

    private static ThreadPoolExecutor c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("5b89fc4a", new Object[0]);
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 3L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0312a("aprefs-file-write"));
                    b = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return b;
    }

    private static ThreadPoolExecutor d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("f62abecb", new Object[0]);
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 3L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0312a("aprefs-stat"));
                    c = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return c;
    }

    /* renamed from: com.taobao.accs.asp.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class ThreadFactoryC0312a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f8178a;

        static {
            kge.a(463690615);
            kge.a(-1938806936);
        }

        public ThreadFactoryC0312a(String str) {
            this.f8178a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, this.f8178a + a.a().incrementAndGet());
            thread.setPriority(5);
            return thread;
        }
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
            return;
        }
        try {
            b().submit(runnable);
        } catch (Exception unused) {
        }
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{runnable});
            return;
        }
        try {
            d().submit(runnable);
        } catch (Exception unused) {
        }
    }

    public static void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1ace8", new Object[]{runnable});
            return;
        }
        try {
            c().submit(runnable);
        } catch (Exception unused) {
        }
    }
}
