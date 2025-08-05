package com.alibaba.android.split.core.splitcompat;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes.dex */
public final class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadPoolExecutor f2460a;
    private static final ScheduledThreadPoolExecutor b;

    public static Executor a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Executor) ipChange.ipc$dispatch("c244a56e", new Object[0]) : f2460a;
    }

    public static ScheduledThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("111ace6e", new Object[0]) : b;
    }

    static {
        kge.a(1209545719);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        o oVar = new o();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, timeUnit, linkedBlockingQueue, oVar);
        f2460a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = new ScheduledThreadPoolExecutor(1, oVar);
    }
}
