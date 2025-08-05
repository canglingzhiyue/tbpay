package com.taobao.adaemon;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kao;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f8336a;
    private static ScheduledThreadPoolExecutor b;
    private static ScheduledThreadPoolExecutor c;
    private static ScheduledThreadPoolExecutor d;
    private static ScheduledThreadPoolExecutor e;
    private static ScheduledThreadPoolExecutor f;

    static {
        kge.a(614973034);
        f8336a = null;
        b = null;
        c = null;
        e = null;
        d = null;
        f = null;
    }

    private static ScheduledThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("111ace6e", new Object[0]);
        }
        if (f8336a == null) {
            f8336a = kao.a(1, "adaemon-schedule");
        }
        return f8336a;
    }

    public static ScheduledThreadPoolExecutor c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("2b364d0d", new Object[0]);
        }
        if (b == null) {
            b = kao.a(1, "adaemon-reporter");
        }
        return b;
    }

    public static ScheduledThreadPoolExecutor a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("f6ff4fcf", new Object[0]);
        }
        if (c == null) {
            c = kao.a(1, "adaemon-action");
        }
        return c;
    }

    public static ScheduledThreadPoolExecutor e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("5f6d4a4b", new Object[0]);
        }
        if (e == null) {
            e = kao.a(2, "adaemon-io");
        }
        return e;
    }

    private static ScheduledThreadPoolExecutor d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("4551cbac", new Object[0]);
        }
        if (d == null) {
            d = kao.a(1, "adaemon-memArt");
        }
        return d;
    }

    public static ScheduledThreadPoolExecutor f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("7988c8ea", new Object[0]);
        }
        if (f == null) {
            f = kao.a(1, "adaemon-frame");
        }
        return f;
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
            return;
        }
        try {
            b().schedule(runnable, 0L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            e.a("AThreadPool", "submitSingleTask", th, new Object[0]);
        }
    }

    public static void a(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aab07da", new Object[]{runnable, new Long(j), timeUnit});
            return;
        }
        try {
            b().schedule(runnable, j, timeUnit);
        } catch (Throwable th) {
            e.a("AThreadPool", "submitScheduledTask", th, new Object[0]);
        }
    }

    public static void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1ace8", new Object[]{runnable});
            return;
        }
        try {
            b().execute(runnable);
        } catch (Throwable th) {
            e.a("AThreadPool", "execute err", th, new Object[0]);
        }
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{runnable});
            return;
        }
        try {
            c().submit(runnable);
        } catch (Throwable th) {
            e.a("AThreadPool", "submitReporterTask", th, new Object[0]);
        }
    }

    public static void b(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03f10db", new Object[]{runnable, new Long(j), timeUnit});
            return;
        }
        try {
            d().schedule(runnable, j, timeUnit);
        } catch (Throwable th) {
            e.a("AThreadPool", "memArtCleanTask", th, new Object[0]);
        }
    }
}
