package com.alipay.mobile.common.transport.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.riy;

/* loaded from: classes3.dex */
public class NetworkAsyncTaskExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadPoolExecutor f5630a = new ThreadPoolExecutor(7, Integer.MAX_VALUE, 2, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.DiscardOldestPolicy());
    private static final ThreadPoolExecutor b = new ThreadPoolExecutor(4, 6, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
    private static final ThreadPoolExecutor c = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
    private static final ThreadPoolExecutor d = new ThreadPoolExecutor(3, 6, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
    private static final ThreadPoolExecutor e = new ThreadPoolExecutor(3, 3, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
    private static final ThreadPoolExecutor f = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
    private static final ThreadPoolExecutor g = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
    private static final ScheduledThreadPoolExecutor h = new ScheduledThreadPoolExecutor(1);
    private static volatile int i = 0;

    /* loaded from: classes3.dex */
    public static class NetworkThreadFactory implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String name;
        public ThreadPoolExecutor threadPoolExecutor;

        public NetworkThreadFactory(String str, ThreadPoolExecutor threadPoolExecutor) {
            this.name = "";
            this.name = str;
            this.threadPoolExecutor = threadPoolExecutor;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.name);
            if (this.threadPoolExecutor != null) {
                sb.append("#" + (this.threadPoolExecutor.getActiveCount() + 1));
            }
            return new Thread(runnable, sb.toString());
        }
    }

    public static /* synthetic */ int access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("26a27dec", new Object[0])).intValue() : i;
    }

    public static /* synthetic */ int access$202(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b117655b", new Object[]{new Integer(i2)})).intValue();
        }
        i = i2;
        return i2;
    }

    public static /* synthetic */ int access$204() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26dadbf0", new Object[0])).intValue();
        }
        int i2 = i + 1;
        i = i2;
        return i2;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = f5630a;
        threadPoolExecutor.setThreadFactory(new NetworkThreadFactory("NetworkThread", threadPoolExecutor));
        f5630a.allowCoreThreadTimeOut(true);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = h;
        scheduledThreadPoolExecutor.setThreadFactory(new NetworkThreadFactory("NetworkSchedule", scheduledThreadPoolExecutor));
        h.setKeepAliveTime(6L, TimeUnit.SECONDS);
        h.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor2 = c;
        threadPoolExecutor2.setThreadFactory(new NetworkThreadFactory("SeriNetworkThread", threadPoolExecutor2));
        c.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor3 = g;
        threadPoolExecutor3.setThreadFactory(new NetworkThreadFactory("HSeriNetworkThread", threadPoolExecutor3));
        g.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor4 = b;
        threadPoolExecutor4.setThreadFactory(new NetworkThreadFactory("IONetworkThread", threadPoolExecutor4));
        b.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor5 = d;
        threadPoolExecutor5.setThreadFactory(new NetworkThreadFactory("LowPriNetworkThread", threadPoolExecutor5));
        d.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor6 = e;
        threadPoolExecutor6.setThreadFactory(new NetworkThreadFactory("LazyNetworkThread", threadPoolExecutor6));
        e.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor7 = f;
        threadPoolExecutor7.setThreadFactory(new NetworkThreadFactory("DispatchNetworkThread", threadPoolExecutor7));
        f.allowCoreThreadTimeOut(true);
    }

    public static final void executeIO(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb33be0", new Object[]{runnable});
            return;
        }
        try {
            b.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            LogCatUtil.warn("NetworkAsyncTaskExecutor", "executeIO fail", th);
        }
    }

    public static final void executeLowPri(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de336c0d", new Object[]{runnable});
            return;
        }
        try {
            d.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            LogCatUtil.warn("NetworkAsyncTaskExecutor", "executeLowPri fail", th);
        }
    }

    public static final void executeLazy(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c3570e", new Object[]{runnable});
            return;
        }
        try {
            e.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            LogCatUtil.warn("NetworkAsyncTaskExecutor", "executeLazy fail", th);
        }
    }

    public static final void executeDispatch(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac03c394", new Object[]{runnable});
            return;
        }
        try {
            f.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            LogCatUtil.warn("NetworkAsyncTaskExecutor", "executeDispatch fail", th);
        }
    }

    public static final void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
            return;
        }
        try {
            f5630a.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            LogCatUtil.warn("NetworkAsyncTaskExecutor", "execute fail", th);
        }
    }

    public static final Future<?> submit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{runnable}) : f5630a.submit(new NetworkRunnable(runnable));
    }

    public static final Future<?> submitLazy(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("bbcf7947", new Object[]{runnable}) : e.submit(new NetworkRunnable(runnable));
    }

    public static <T> Future<T> submit(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b2277828", new Object[]{callable}) : f5630a.submit(new NetworkCallable(callable));
    }

    public static final void executeSerial(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97c5104e", new Object[]{runnable});
            return;
        }
        try {
            c.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            LogCatUtil.warn("NetworkAsyncTaskExecutor", "executeSerial fail", th);
        }
    }

    public static final void executeHighSerial(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ea40010", new Object[]{runnable});
            return;
        }
        try {
            g.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            LogCatUtil.warn("NetworkAsyncTaskExecutor", "executeHighSerial fail", th);
        }
    }

    public static final Future<?> submitSerial(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("353875c7", new Object[]{runnable}) : c.submit(new NetworkRunnable(runnable));
    }

    public static <T> Future<T> submitSerial(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("5f404d94", new Object[]{callable}) : c.submit(new NetworkCallable(callable));
    }

    public static ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("7e00205d", new Object[]{runnable, new Long(j), timeUnit}) : h.schedule(new NetworkRunnable(runnable), j, timeUnit);
    }

    public static <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("b810b526", new Object[]{callable, new Long(j), timeUnit}) : h.schedule(new NetworkCallable(callable), j, timeUnit);
    }

    public static ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("6d910264", new Object[]{runnable, new Long(j), new Long(j2), timeUnit}) : h.scheduleAtFixedRate(new NetworkRunnable(runnable), j, j2, timeUnit);
    }

    public static ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("953370c6", new Object[]{runnable, new Long(j), new Long(j2), timeUnit}) : h.scheduleWithFixedDelay(new NetworkRunnable(runnable), j, j2, timeUnit);
    }

    /* loaded from: classes3.dex */
    public static class NetworkRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Runnable runnable;

        private NetworkRunnable(Runnable runnable) {
            this.runnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Thread.currentThread().setPriority(5);
            try {
                if (this.runnable == null) {
                    LogCatUtil.error("NetworkRunnable", " this.runnable is null !");
                    return;
                }
                if (NetworkAsyncTaskExecutor.access$200() >= Integer.MAX_VALUE) {
                    NetworkAsyncTaskExecutor.access$202(0);
                }
                int access$204 = NetworkAsyncTaskExecutor.access$204();
                LogCatUtil.debug("NetworkRunnable", "taskId=[" + access$204 + "] start execute. class=[" + this.runnable.getClass().getName() + riy.ARRAY_END_STR);
                this.runnable.run();
                LogCatUtil.debugOrLose("NetworkRunnable", "taskId=[" + access$204 + "] execute finish.");
            } catch (Throwable th) {
                try {
                    LogCatUtil.error("NetworkRunnable", "taskId=[-1] run exception. ", th);
                } finally {
                    LogCatUtil.debugOrLose("NetworkRunnable", "taskId=[-1] execute finish.");
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class NetworkCallable<V> implements Callable<V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Callable<V> callable;

        private NetworkCallable(Callable<V> callable) {
            this.callable = callable;
        }

        @Override // java.util.concurrent.Callable
        public V call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            int i = -1;
            try {
                try {
                    if (NetworkAsyncTaskExecutor.access$200() >= Integer.MAX_VALUE) {
                        NetworkAsyncTaskExecutor.access$202(0);
                    }
                    i = NetworkAsyncTaskExecutor.access$204();
                    LogCatUtil.debug("NetworkRunnable", "taskId=[" + i + "] start execute. class=[" + this.callable.getClass().getName() + riy.ARRAY_END_STR);
                    return this.callable.call();
                } catch (Exception e) {
                    LogCatUtil.error("NetworkRunnable", "taskId=[" + i + "] call exception. " + e.toString());
                    throw e;
                }
            } finally {
                LogCatUtil.debugOrLose("NetworkRunnable", "taskId=[" + i + "] execute finish.");
            }
        }
    }
}
