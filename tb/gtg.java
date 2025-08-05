package tb;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.gte;

/* loaded from: classes.dex */
public class gtg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static gte a(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gte) ipChange.ipc$dispatch("5d8ed21d", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3)}) : a(str, i, i2, i3, null);
    }

    public static gte a(final String str, int i, int i2, final int i3, gte.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gte) ipChange.ipc$dispatch("c72bee82", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), aVar}) : new gte(i, i2, aVar, new ThreadFactory() { // from class: tb.gtg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final AtomicInteger c = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(final Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                Runnable runnable2 = new Runnable() { // from class: tb.gtg.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Thread.currentThread().setPriority(5);
                        Process.setThreadPriority(i3);
                        if ("launcher-async".equals(str)) {
                            gso.a();
                        }
                        runnable.run();
                    }
                };
                return new Thread(runnable2, str + "-" + this.c.getAndIncrement());
            }
        });
    }

    public static ScheduledExecutorService a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("86793ad6", new Object[]{str});
        }
        if (guc.a(LauncherRuntime.g, "next_launch_thread_opt")) {
            return c(str);
        }
        return b(str);
    }

    private static ScheduledExecutorService b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("77caca57", new Object[]{str});
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: tb.gtg.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, str + "-scheduled-launcher");
            }
        });
        scheduledThreadPoolExecutor.setKeepAliveTime(30L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    private static ScheduledExecutorService c(final String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("691c59d8", new Object[]{str}) : Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: tb.gtg.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, str + "-scheduled-launcher");
            }
        });
    }
}
