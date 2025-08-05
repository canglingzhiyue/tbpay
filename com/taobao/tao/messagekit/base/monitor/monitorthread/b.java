package com.taobao.tao.messagekit.base.monitor.monitorthread;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile ScheduledThreadPoolExecutor f20767a;
    private static final AtomicInteger b;

    /* loaded from: classes8.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f20768a;

        static {
            kge.a(-1291685856);
            kge.a(-1938806936);
        }

        public a(String str) {
            this.f20768a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = b.b().getAndIncrement();
            Thread thread = new Thread(runnable, this.f20768a + andIncrement);
            thread.setPriority(5);
            return thread;
        }
    }

    static {
        kge.a(-79373791);
        b = new AtomicInteger();
    }

    public static ScheduledThreadPoolExecutor a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("f6ff4fcf", new Object[0]);
        }
        if (f20767a == null) {
            synchronized (b.class) {
                if (f20767a == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("PM-SEND"));
                    f20767a = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.SECONDS);
                    f20767a.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f20767a;
    }

    public static /* synthetic */ AtomicInteger b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("69d49393", new Object[0]) : b;
    }
}
