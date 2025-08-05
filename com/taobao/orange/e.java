package com.taobao.orange;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.util.OLog;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PRIORITY = 2;

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f18581a;
    private static ScheduledThreadPoolExecutor b;
    private static ScheduledThreadPoolExecutor c;
    private static ScheduledThreadPoolExecutor d;

    /* loaded from: classes.dex */
    public static class c extends ScheduledThreadPoolExecutor {
        static {
            kge.a(-752099956);
        }

        public c(int i, ThreadFactory threadFactory) {
            super(i, threadFactory);
            setKeepAliveTime(10L, TimeUnit.SECONDS);
            allowCoreThreadTimeOut(true);
        }
    }

    public static /* synthetic */ AtomicInteger a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("f45a6d52", new Object[0]) : f18581a;
    }

    public static /* synthetic */ ScheduledThreadPoolExecutor d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("4551cbac", new Object[0]) : b;
    }

    static {
        kge.a(-807978689);
        f18581a = new AtomicInteger();
        b = new c(2, new b());
        c = new c(1, new a());
        d = new c(1, new ThreadFactory() { // from class: com.taobao.orange.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                Thread thread = new Thread(runnable, "Orange_Critical_Fetch");
                thread.setPriority(5);
                return thread;
            }
        });
    }

    /* loaded from: classes.dex */
    public static class b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1911061647);
            kge.a(-1938806936);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = e.a().getAndIncrement();
            Thread thread = new Thread(runnable, "Orange:" + andIncrement);
            OLog.i("OThreadPool", "newThread", "index", Integer.valueOf(andIncrement), "poolSize", Integer.valueOf(e.d().getPoolSize()));
            thread.setPriority(5);
            return thread;
        }
    }

    /* loaded from: classes.dex */
    public static class a extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(109426878);
        }

        @Override // com.taobao.orange.e.b, java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, "Orange_Disk");
            thread.setPriority(5);
            return thread;
        }
    }

    private static ScheduledThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("111ace6e", new Object[0]) : b;
    }

    private static ScheduledThreadPoolExecutor c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("2b364d0d", new Object[0]) : c;
    }

    private static ScheduledThreadPoolExecutor e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("5f6d4a4b", new Object[0]) : d;
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            a(runnable, 0L);
        }
    }

    public static void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{runnable, new Long(j)});
            return;
        }
        try {
            b().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            OLog.e("OThreadPool", com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE, th, new Object[0]);
        }
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{runnable});
        } else {
            b(runnable, 0L);
        }
    }

    public static void b(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706b13bd", new Object[]{runnable, new Long(j)});
            return;
        }
        try {
            c().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            OLog.e("OThreadPool", "execute_config_disk", th, new Object[0]);
        }
    }

    public static void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1ace8", new Object[]{runnable});
        } else {
            c(runnable, 0L);
        }
    }

    public static void c(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724466dc", new Object[]{runnable, new Long(j)});
            return;
        }
        try {
            e().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            OLog.e("OThreadPool", "execute_config_net", th, new Object[0]);
        }
    }
}
