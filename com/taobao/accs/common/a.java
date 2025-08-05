package com.taobao.accs.common;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kao;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile ScheduledThreadPoolExecutor f8210a;
    private static volatile ScheduledThreadPoolExecutor b;
    private static volatile ScheduledThreadPoolExecutor c;
    private static volatile ScheduledThreadPoolExecutor d;
    private static volatile ScheduledThreadPoolExecutor e;
    private static volatile ScheduledThreadPoolExecutor f;
    private static volatile ScheduledThreadPoolExecutor g;
    private static volatile ScheduledThreadPoolExecutor h;
    private static volatile ScheduledThreadPoolExecutor i;
    private static final AtomicInteger j;

    public static /* synthetic */ AtomicInteger j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("15a5c59b", new Object[0]) : j;
    }

    static {
        kge.a(-57159849);
        f8210a = kao.a(1, "ACCS-SCHEDULE");
        b = kao.a(1, "ACCS-SCHEDULE-V2");
        c = kao.a(1, "ACCS-SEND");
        d = kao.a(1, "ACCS-SEND-V2");
        e = kao.a(1, "ACCS-IO");
        f = kao.a(1, "ACCS-CB");
        g = kao.a(1, "ACCS-CB-V2");
        h = kao.a(1, "ACCS-ACCEPT");
        i = kao.a(1, "ACCS-API");
        j = new AtomicInteger();
    }

    /* renamed from: com.taobao.accs.common.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class ThreadFactoryC0314a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f8211a;

        static {
            kge.a(411449477);
            kge.a(-1938806936);
        }

        public ThreadFactoryC0314a(String str) {
            this.f8211a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = a.j().getAndIncrement();
            Thread thread = new Thread(runnable, this.f8211a + andIncrement);
            thread.setPriority(5);
            return thread;
        }
    }

    public static ScheduledThreadPoolExecutor a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("f6ff4fcf", new Object[0]) : f8210a;
    }

    public static ScheduledThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("111ace6e", new Object[0]) : b;
    }

    public static ScheduledFuture<?> a(Runnable runnable, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("92aa8ed3", new Object[]{runnable, new Long(j2), timeUnit});
        }
        try {
            return a().schedule(runnable, j2, timeUnit);
        } catch (Throwable th) {
            ALog.e("ThreadPoolExecutorFactory", "ThreadPoolExecutorFactory schedule", th, new Object[0]);
            return null;
        }
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
            return;
        }
        try {
            a().execute(runnable);
        } catch (Throwable th) {
            ALog.e("ThreadPoolExecutorFactory", "ThreadPoolExecutorFactory execute", th, new Object[0]);
        }
    }

    public static ScheduledThreadPoolExecutor c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("2b364d0d", new Object[0]) : c;
    }

    public static ScheduledThreadPoolExecutor d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("4551cbac", new Object[0]) : d;
    }

    public static ScheduledThreadPoolExecutor e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("5f6d4a4b", new Object[0]) : e;
    }

    public static ScheduledThreadPoolExecutor f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("7988c8ea", new Object[0]) : i;
    }

    public static ScheduledThreadPoolExecutor g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("93a44789", new Object[0]) : f;
    }

    public static ScheduledThreadPoolExecutor h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("adbfc628", new Object[0]) : g;
    }

    public static ScheduledThreadPoolExecutor i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("c7db44c7", new Object[0]) : h;
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{runnable});
            return;
        }
        try {
            g().execute(runnable);
        } catch (Throwable th) {
            ALog.e("ThreadPoolExecutorFactory", "ThreadPoolExecutorFactory execute", th, new Object[0]);
        }
    }
}
