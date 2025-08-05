package com.taobao.android.remoteso.tbadapter.ext;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.ijz;
import tb.ikq;
import tb.iky;

/* loaded from: classes6.dex */
public class p implements ijz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f14873a = VExecutors.newScheduledThreadPool(20, new com.taobao.android.virtual_thread.face.h() { // from class: com.taobao.android.remoteso.tbadapter.ext.p.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.virtual_thread.face.h
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "rso-inner-vt";
        }
    });

    public p() {
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f14873a;
            scheduledThreadPoolExecutor.setKeepAliveTime(2L, TimeUnit.SECONDS);
            scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
            scheduledThreadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: com.taobao.android.remoteso.tbadapter.ext.p.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.RejectedExecutionHandler
                public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                    } else {
                        ikq.a("error_v_task_manager", "task dropped");
                    }
                }
            });
        } catch (Throwable th) {
            ikq.a("task-manager init() error", th);
        }
    }

    @Override // tb.ijz
    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            a(runnable, 0L);
        }
    }

    @Override // tb.ijz
    public void a(final Runnable runnable, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{this, runnable, new Long(j)});
            return;
        }
        final long a2 = iky.a();
        try {
            this.f14873a.schedule(new Runnable() { // from class: com.taobao.android.remoteso.tbadapter.ext.p.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        runnable.run();
                        RSoLog.c("vtask-> after runnable, , duration=" + ((iky.a() - a2) - j) + ", run=" + runnable + ", deley=" + j);
                    } catch (Throwable th) {
                        ikq.a("task -> run into error ", th);
                    }
                }
            }, j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            ikq.a("task-manager submitDelayed() error", th);
        }
    }

    @Override // tb.ijz
    public Thread a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d060f65f", new Object[]{this}) : VExecutors.currentThread();
    }
}
