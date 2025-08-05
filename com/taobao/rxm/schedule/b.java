package com.taobao.rxm.schedule;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.qol;

/* loaded from: classes.dex */
public class b implements c, j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ThreadPoolExecutor f19005a;
    private final AtomicInteger b = new AtomicInteger(1);
    private final CentralSchedulerQueue c;
    private final String d;

    @Override // com.taobao.rxm.schedule.j
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ String a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6e0a182c", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ AtomicInteger b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("7177adfd", new Object[]{bVar}) : bVar.b;
    }

    public b(String str, int i, int i2, int i3, int i4, int i5) {
        boolean z = false;
        com.taobao.tcommon.core.b.a(i >= 0, "corePoolSize must be >=0");
        com.taobao.tcommon.core.b.a(i2 >= i ? true : z, "maxPoolSize shouldn't be less than corePoolSize");
        this.d = str;
        this.c = new CentralSchedulerQueue(this, i4, i5);
        this.f19005a = new ThreadPoolExecutor(i, i2, i3, TimeUnit.SECONDS, this.c, new ThreadFactory() { // from class: com.taobao.rxm.schedule.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                Thread thread = new Thread(runnable, b.a(b.this) + b.b(b.this).getAndIncrement());
                if (thread.isDaemon()) {
                    thread.setDaemon(false);
                }
                if (thread.getPriority() != 5) {
                    thread.setPriority(5);
                }
                return thread;
            }
        }, new RejectedExecutionHandler() { // from class: com.taobao.rxm.schedule.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                    return;
                }
                qol.e("RxSysLog", "queue is full and no more available thread, directly run in thread(%s)", Thread.currentThread().getName());
                if (threadPoolExecutor.isShutdown()) {
                    return;
                }
                runnable.run();
            }
        });
        this.f19005a.allowCoreThreadTimeOut(true);
    }

    @Override // com.taobao.rxm.schedule.j
    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5e8cf", new Object[]{this, gVar});
            return;
        }
        if (qol.a(3)) {
            qol.e("RxSysLog", a(), new Object[0]);
        }
        this.f19005a.execute(gVar);
    }

    @Override // com.taobao.rxm.schedule.c, com.taobao.rxm.schedule.j
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return this.d + " status: queue=" + this.c.size() + " active=" + this.f19005a.getActiveCount() + " pool=" + this.f19005a.getPoolSize() + " largest=" + this.f19005a.getLargestPoolSize();
    }

    @Override // com.taobao.rxm.schedule.j
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c.size();
    }

    @Override // com.taobao.rxm.schedule.c
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f19005a.getPoolSize() < this.f19005a.getMaximumPoolSize();
    }
}
