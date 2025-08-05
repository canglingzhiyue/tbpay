package com.alipay.mobile.common.logging.util;

import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.framework.MpaasClassInfo;
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

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class LoggingAsyncTaskExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadPoolExecutor f5459a = new ThreadPoolExecutor(3, Integer.MAX_VALUE, 6, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.DiscardOldestPolicy());
    private static final ThreadPoolExecutor b = new ThreadPoolExecutor(6, 8, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
    private static final ThreadPoolExecutor c = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
    private static final ThreadPoolExecutor d = new ThreadPoolExecutor(3, 3, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
    private static final ThreadPoolExecutor e = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
    private static final ThreadPoolExecutor f = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
    private static final ThreadPoolExecutor g = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardOldestPolicy());
    private static final ThreadPoolExecutor h = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardOldestPolicy());
    private static final ScheduledThreadPoolExecutor i = new ScheduledThreadPoolExecutor(1);
    private static volatile int j = 0;

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public static class LoggingThreadFactory implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String name;
        public ThreadPoolExecutor threadPoolExecutor;

        public LoggingThreadFactory(String str, ThreadPoolExecutor threadPoolExecutor) {
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
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("26a27dec", new Object[0])).intValue() : j;
    }

    public static /* synthetic */ int access$202(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b117655b", new Object[]{new Integer(i2)})).intValue();
        }
        j = i2;
        return i2;
    }

    public static /* synthetic */ int access$204() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26dadbf0", new Object[0])).intValue();
        }
        int i2 = j + 1;
        j = i2;
        return i2;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = f5459a;
        threadPoolExecutor.setThreadFactory(new LoggingThreadFactory("LogThread", threadPoolExecutor));
        f5459a.allowCoreThreadTimeOut(true);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = i;
        scheduledThreadPoolExecutor.setThreadFactory(new LoggingThreadFactory("LogSchedule", scheduledThreadPoolExecutor));
        i.setKeepAliveTime(6L, TimeUnit.SECONDS);
        i.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor2 = c;
        threadPoolExecutor2.setThreadFactory(new LoggingThreadFactory("SeriLogThread", threadPoolExecutor2));
        c.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor3 = b;
        threadPoolExecutor3.setThreadFactory(new LoggingThreadFactory("IOLogThread", threadPoolExecutor3));
        b.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor4 = d;
        threadPoolExecutor4.setThreadFactory(new LoggingThreadFactory("LowPriLogThread", threadPoolExecutor4));
        d.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor5 = e;
        threadPoolExecutor5.setThreadFactory(new LoggingThreadFactory("DispatchLogThread", threadPoolExecutor5));
        e.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor6 = f;
        threadPoolExecutor6.setThreadFactory(new LoggingThreadFactory("LogAppendDispatchThread", threadPoolExecutor6));
        f.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor7 = g;
        threadPoolExecutor7.setThreadFactory(new LoggingThreadFactory("HttpUpThread", threadPoolExecutor7));
        g.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor8 = h;
        threadPoolExecutor8.setThreadFactory(new LoggingThreadFactory("HttpUpThread2", threadPoolExecutor8));
        h.allowCoreThreadTimeOut(true);
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
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("LoggingAsyncTaskExecutor", "executeIO e:" + th.toString());
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
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("LoggingAsyncTaskExecutor", "executeLowPri e:" + th.toString());
        }
    }

    public static final void executeDispatch(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac03c394", new Object[]{runnable});
            return;
        }
        try {
            e.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("LoggingAsyncTaskExecutor", "executeDispatch e:" + th.toString());
        }
    }

    public static final void executeLogAppendDispatch(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94213a8", new Object[]{runnable});
            return;
        }
        try {
            f.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("LoggingAsyncTaskExecutor", "executeLogAppendDispatch e:" + th.toString());
        }
    }

    public static final void executeHttpUpload(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e88d83", new Object[]{runnable});
            return;
        }
        try {
            g.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("LoggingAsyncTaskExecutor", "executeHttpUpload e:" + th.toString());
        }
    }

    public static final void executeHttpUpload2(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea34779", new Object[]{runnable});
            return;
        }
        try {
            h.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("LoggingAsyncTaskExecutor", "executeHttpUpload2 e:" + th.toString());
        }
    }

    public static final void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
            return;
        }
        try {
            f5459a.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("LoggingAsyncTaskExecutor", "execute e:" + th.toString());
        }
    }

    public static final Future<?> submit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{runnable}) : f5459a.submit(new NetworkRunnable(runnable));
    }

    public static <T> Future<T> submit(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b2277828", new Object[]{callable}) : f5459a.submit(new NetworkCallable(callable));
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
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("LoggingAsyncTaskExecutor", "executeSerial e:" + th.toString());
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

    public static ScheduledFuture<?> schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("7e00205d", new Object[]{runnable, new Long(j2), timeUnit}) : i.schedule(new NetworkRunnable(runnable), j2, timeUnit);
    }

    public static <V> ScheduledFuture<V> schedule(Callable<V> callable, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("b810b526", new Object[]{callable, new Long(j2), timeUnit}) : i.schedule(new NetworkCallable(callable), j2, timeUnit);
    }

    public static ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("6d910264", new Object[]{runnable, new Long(j2), new Long(j3), timeUnit}) : i.scheduleAtFixedRate(new NetworkRunnable(runnable), j2, j3, timeUnit);
    }

    public static ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("953370c6", new Object[]{runnable, new Long(j2), new Long(j3), timeUnit}) : i.scheduleWithFixedDelay(new NetworkRunnable(runnable), j2, j3, timeUnit);
    }

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
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
            int i = -1;
            try {
                if (this.runnable == null) {
                    return;
                }
                if (LoggingAsyncTaskExecutor.access$200() >= Integer.MAX_VALUE) {
                    LoggingAsyncTaskExecutor.access$202(0);
                }
                i = LoggingAsyncTaskExecutor.access$204();
                this.runnable.run();
            } catch (Throwable th) {
                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                traceLogger.error("LoggingAsyncTaskExecutor", "taskId=[" + i + "] run ex:" + th.toString());
            }
        }
    }

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
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
            try {
                if (LoggingAsyncTaskExecutor.access$200() >= Integer.MAX_VALUE) {
                    LoggingAsyncTaskExecutor.access$202(0);
                }
                LoggingAsyncTaskExecutor.access$204();
                return this.callable.call();
            } catch (Exception e) {
                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                traceLogger.error("LoggingAsyncTaskExecutor", "taskId=[-1] call ex:" + e.toString());
                throw e;
            }
        }
    }
}
