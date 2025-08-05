package com.alipay.mobile.verifyidentity.utils.task;

import com.alipay.mobile.verifyidentity.log.LoggerFactory;
import com.alipay.mobile.verifyidentity.log.VITraceLogger;
import com.alipay.mobile.verifyidentity.utils.task.pool.NamedRunnable;
import com.alipay.mobile.verifyidentity.utils.task.transaction.Transaction;
import com.alipay.mobile.verifyidentity.utils.task.transaction.TransactionExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.riy;

/* loaded from: classes3.dex */
public class AsyncTaskExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static AsyncTaskExecutor INSTANCE = null;
    public static final String TAG = "AsyncTaskExecutor";

    /* renamed from: a  reason: collision with root package name */
    private static final int f6103a;
    private static final int b;
    private static final ThreadFactory c;
    public final TransactionExecutor TRANSACTION_EXECUTOR = new TransactionExecutor();
    public final ThreadPoolExecutor PARALLEL_EXECUTOR = (ThreadPoolExecutor) Executors.newCachedThreadPool(c);
    public final ScheduledThreadPoolExecutor SCHEDULED_EXECUTOR = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(b, c);

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f6103a = availableProcessors;
        b = availableProcessors + 1;
        c = new ThreadFactory() { // from class: com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final AtomicInteger f6104a = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                String str = "AsyncTaskExecutor_thread_" + this.f6104a.incrementAndGet();
                LoggerFactory.getTraceLogger().warn("AsyncTaskExecutor", "ThreadFactory.newThread(" + str + riy.BRACKET_END_STR);
                return new Thread(runnable, str);
            }
        };
        INSTANCE = new AsyncTaskExecutor();
    }

    private AsyncTaskExecutor() {
        this.SCHEDULED_EXECUTOR.setKeepAliveTime(60L, TimeUnit.SECONDS);
        this.SCHEDULED_EXECUTOR.allowCoreThreadTimeOut(true);
        this.SCHEDULED_EXECUTOR.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        this.PARALLEL_EXECUTOR.setKeepAliveTime(5L, TimeUnit.SECONDS);
        this.PARALLEL_EXECUTOR.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
    }

    public static AsyncTaskExecutor getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AsyncTaskExecutor) ipChange.ipc$dispatch("fa0a43b9", new Object[0]) : INSTANCE;
    }

    public final Executor getExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Executor) ipChange.ipc$dispatch("64056156", new Object[]{this}) : this.PARALLEL_EXECUTOR;
    }

    public void execute(Runnable runnable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745a6d44", new Object[]{this, runnable, str});
            return;
        }
        try {
            VITraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.verbose("AsyncTaskExecutor", "AsyncTaskExecutor.execute(Runnable, threadName=" + str + riy.BRACKET_END_STR);
            this.PARALLEL_EXECUTOR.execute(NamedRunnable.TASK_POOL.obtain(runnable, str));
        } catch (Throwable th) {
            VITraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
            traceLogger2.verbose("AsyncTaskExecutor", "asyncTask execute error:" + th.getMessage());
        }
    }

    public ScheduledFuture<?> schedule(Runnable runnable, String str, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("5a2783d3", new Object[]{this, runnable, str, new Long(j), timeUnit});
        }
        VITraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.verbose("AsyncTaskExecutor", "AsyncTaskExecutor.schedule(Runnable, threadName=" + str + riy.BRACKET_END_STR);
        return this.SCHEDULED_EXECUTOR.schedule(NamedRunnable.TASK_POOL.obtain(runnable, str), j, timeUnit);
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("6d910264", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        LoggerFactory.getTraceLogger().verbose("AsyncTaskExecutor", "AsyncTaskExecutor.scheduleAtFixedRate(Runnable)");
        return this.SCHEDULED_EXECUTOR.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("953370c6", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit}) : this.SCHEDULED_EXECUTOR.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        this.TRANSACTION_EXECUTOR.shutdown();
        this.PARALLEL_EXECUTOR.shutdown();
        this.SCHEDULED_EXECUTOR.shutdown();
    }

    public String addTransaction(Transaction transaction) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("47b551e6", new Object[]{this, transaction}) : this.TRANSACTION_EXECUTOR.addTransaction(transaction);
    }

    public void removeTransaction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d931acb", new Object[]{this, str});
        } else {
            this.TRANSACTION_EXECUTOR.removeTransaction(str);
        }
    }
}
