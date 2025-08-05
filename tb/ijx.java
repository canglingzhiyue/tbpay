package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class ijx implements ijz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f29103a;
    private final ScheduledThreadPoolExecutor b = new ScheduledThreadPoolExecutor(20);

    public static /* synthetic */ String a(ijx ijxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5fec6bf", new Object[]{ijxVar}) : ijxVar.f29103a;
    }

    public static /* synthetic */ ScheduledThreadPoolExecutor b(ijx ijxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("ae45c4f5", new Object[]{ijxVar}) : ijxVar.b;
    }

    public ijx(String str) {
        this.f29103a = str;
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            this.b.setKeepAliveTime(2L, TimeUnit.SECONDS);
            this.b.allowCoreThreadTimeOut(true);
            this.b.setThreadFactory(new ThreadFactory() { // from class: tb.ijx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, ijx.a(ijx.this));
                }
            });
            this.b.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: tb.ijx.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.RejectedExecutionHandler
                public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                    } else {
                        ikq.a("error_task_manager", "task dropped");
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
            this.b.schedule(new Runnable() { // from class: tb.ijx.3
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
                        RSoLog.c("task-> after runnable, , duration=" + ((iky.a() - a2) - j) + ", poolSize=" + ijx.b(ijx.this).getPoolSize() + ", run=" + runnable + ", deley=" + j);
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
        return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d060f65f", new Object[]{this}) : Thread.currentThread();
    }
}
