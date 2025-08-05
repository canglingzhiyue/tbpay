package anet.channel.strategy.utils;

import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes.dex */
public class AmdcThreadPoolExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.AmdcThreadPoolExecutor";
    private static ScheduledThreadPoolExecutor localDnsThreadPoolExecutor;
    private static AtomicInteger seq;
    private static ScheduledThreadPoolExecutor threadPoolExecutor;

    public static /* synthetic */ AtomicInteger access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("6567c5a1", new Object[0]) : seq;
    }

    static {
        kge.a(1041614431);
        seq = new AtomicInteger(0);
        threadPoolExecutor = null;
        localDnsThreadPoolExecutor = null;
    }

    public static ScheduledThreadPoolExecutor getThreadPoolExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("871c36c1", new Object[0]);
        }
        if (threadPoolExecutor == null) {
            synchronized (AmdcThreadPoolExecutor.class) {
                if (threadPoolExecutor == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new ThreadFactory() { // from class: anet.channel.strategy.utils.AmdcThreadPoolExecutor.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                            }
                            Thread thread = new Thread(runnable, "AMDC" + AmdcThreadPoolExecutor.access$000().incrementAndGet());
                            ALog.i("awcn.AmdcThreadPoolExecutor", "thread created!", null, "name", thread.getName());
                            thread.setPriority(5);
                            return thread;
                        }
                    });
                    threadPoolExecutor = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return threadPoolExecutor;
    }

    public static ScheduledThreadPoolExecutor getLocalDnsThreadPoolExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("72281123", new Object[0]);
        }
        if (localDnsThreadPoolExecutor == null) {
            synchronized (AmdcThreadPoolExecutor.class) {
                if (localDnsThreadPoolExecutor == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new ThreadFactory() { // from class: anet.channel.strategy.utils.AmdcThreadPoolExecutor.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                            }
                            Thread thread = new Thread(runnable, "AMDC_LOCAL" + AmdcThreadPoolExecutor.access$000().incrementAndGet());
                            ALog.i("awcn.AmdcThreadPoolExecutor", "thread created!", null, "name", thread.getName());
                            thread.setPriority(5);
                            return thread;
                        }
                    });
                    localDnsThreadPoolExecutor = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
                    localDnsThreadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return localDnsThreadPoolExecutor;
    }

    public static void submitTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfdbdc42", new Object[]{runnable});
            return;
        }
        try {
            getThreadPoolExecutor().submit(runnable);
        } catch (Exception e) {
            ALog.e("awcn.AmdcThreadPoolExecutor", "submit task failed", null, e, new Object[0]);
        }
    }

    public static void scheduleTask(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38f834a3", new Object[]{runnable, new Long(j)});
            return;
        }
        try {
            getThreadPoolExecutor().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            ALog.e("awcn.AmdcThreadPoolExecutor", "schedule task failed", null, e, new Object[0]);
        }
    }

    public static void submitLocalDnsTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe6c120", new Object[]{runnable});
            return;
        }
        try {
            getLocalDnsThreadPoolExecutor().submit(runnable);
        } catch (Exception e) {
            ALog.e("awcn.AmdcThreadPoolExecutor", "submitLocalDnsTask failed", null, e, new Object[0]);
        }
    }
}
