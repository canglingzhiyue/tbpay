package com.taobao.android.diagnose.common;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f11700a = (ScheduledThreadPoolExecutor) VExecutors.newScheduledThreadPool(2, new h() { // from class: com.taobao.android.diagnose.common.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.virtual_thread.face.h
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "diagnose-thread";
        }
    });
    private final ThreadPoolExecutor b;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final c f11703a;

        static {
            kge.a(463679037);
            f11703a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b5103240", new Object[0]) : f11703a;
        }
    }

    static {
        kge.a(1661442410);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b5103240", new Object[0]) : a.a();
    }

    public c() {
        this.f11700a.setKeepAliveTime(3L, TimeUnit.SECONDS);
        this.f11700a.allowCoreThreadTimeOut(true);
        this.b = (ThreadPoolExecutor) VExecutors.getThreadPoolFactory().a(1, 1, 3L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new h() { // from class: com.taobao.android.diagnose.common.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.virtual_thread.face.h
            public String newThreadName() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "diagnose-logger-thread";
            }
        }, new ThreadPoolExecutor.AbortPolicy());
        this.b.allowCoreThreadTimeOut(true);
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.f11700a.execute(runnable);
        }
    }

    public void a(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aab07da", new Object[]{this, runnable, new Long(j), timeUnit});
        } else {
            this.f11700a.schedule(runnable, j, timeUnit);
        }
    }

    public void a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42c6d592", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        } else {
            this.f11700a.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }
    }

    public Executor b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Executor) ipChange.ipc$dispatch("291d652f", new Object[]{this}) : this.b;
    }
}
