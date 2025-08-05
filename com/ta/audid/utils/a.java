package com.ta.audid.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicInteger b;

    /* renamed from: a  reason: collision with root package name */
    private ScheduledThreadPoolExecutor f8136a;

    public static /* synthetic */ AtomicInteger a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("f45a6d52", new Object[0]) : b;
    }

    static {
        kge.a(-1619478671);
        b = new AtomicInteger();
    }

    /* renamed from: com.ta.audid.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class ThreadFactoryC0308a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(779550697);
            kge.a(-1938806936);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = a.a().getAndIncrement();
            return new Thread(runnable, "UtdidHandlerThread:" + andIncrement);
        }
    }

    public a() {
        this.f8136a = null;
        if (this.f8136a == null) {
            this.f8136a = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0308a());
            this.f8136a.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
            this.f8136a.allowCoreThreadTimeOut(true);
        }
    }

    public ScheduledFuture a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("3a56c08f", new Object[]{this, runnable, new Long(j)}) : this.f8136a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
