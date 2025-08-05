package com.taobao.android.virtual_thread.stub;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.ScheduledVirtualThreadPoolExecutor;
import com.taobao.android.virtual_thread.VRejectedExecutionHandler;
import com.taobao.android.virtual_thread.VirtualThreadPoolExecutor;
import com.taobao.android.virtual_thread.e;
import com.taobao.android.virtual_thread.stub.StubThreadPoolExecutor;
import com.taobao.android.virtual_thread.stub.annotation.Exchange;
import com.taobao.android.virtual_thread.stub.config.StubConfig;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import tb.jrk;
import tb.jrs;
import tb.kge;

@Exchange({ScheduledThreadPoolExecutor.class, ScheduledVirtualThreadPoolExecutor.class})
/* loaded from: classes6.dex */
public class StubScheduledThreadPoolExecutor extends ScheduledThreadPoolExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "StubScheduledThreadPoolExecutor";
    private final boolean isExcludeThreadPool;
    private final boolean isVirtualThreadPool;
    private final String name;
    private final ScheduledVirtualThreadPoolExecutor vExecutor;

    static {
        kge.a(-326738763);
    }

    public static /* synthetic */ Object ipc$super(StubScheduledThreadPoolExecutor stubScheduledThreadPoolExecutor, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2140224945:
                return new Long(super.getTaskCount());
            case -2128160755:
                return super.toString();
            case -1791790906:
                return super.scheduleWithFixedDelay((Runnable) objArr[0], ((Number) objArr[1]).longValue(), ((Number) objArr[2]).longValue(), (TimeUnit) objArr[3]);
            case -1790623879:
                return new Boolean(super.getExecuteExistingDelayedTasksAfterShutdownPolicy());
            case -1681365070:
                super.purge();
                return null;
            case -1458887754:
                return super.getRejectedExecutionHandler();
            case -1258595344:
                return new Boolean(super.getRemoveOnCancelPolicy());
            case -1206864602:
                return super.schedule((Callable) objArr[0], ((Number) objArr[1]).longValue(), (TimeUnit) objArr[2]);
            case -646688520:
                return new Boolean(super.isTerminated());
            case -611890611:
                return new Boolean(super.awaitTermination(((Number) objArr[0]).longValue(), (TimeUnit) objArr[1]));
            case -489736769:
                return super.getQueue();
            case -404338179:
                return new Integer(super.getLargestPoolSize());
            case -351366643:
                return new Boolean(super.remove((Runnable) objArr[0]));
            case -342309312:
                return super.shutdownNow();
            case -315942893:
                return new Boolean(super.prestartCoreThread());
            case -303734229:
                return new Boolean(super.isShutdown());
            case -53530963:
                return new Integer(super.getPoolSize());
            case 89969246:
                super.allowCoreThreadTimeOut(((Boolean) objArr[0]).booleanValue());
                return null;
            case 171684908:
                super.setThreadFactory((ThreadFactory) objArr[0]);
                return null;
            case 399870064:
                return new Long(super.getCompletedTaskCount());
            case 457600989:
                super.shutdown();
                return null;
            case 604972194:
                return new Integer(super.prestartAllCoreThreads());
            case 763465964:
                return new Integer(super.getCorePoolSize());
            case 799218956:
                return super.getThreadFactory();
            case 853088576:
                super.setRejectedExecutionHandler((RejectedExecutionHandler) objArr[0]);
                return null;
            case 876424412:
                super.setRemoveOnCancelPolicy(((Boolean) objArr[0]).booleanValue());
                return null;
            case 969227993:
                return new Boolean(super.allowsCoreThreadTimeOut());
            case 1021648351:
                return new Boolean(super.isTerminating());
            case 1074435814:
                return new Long(super.getKeepAliveTime((TimeUnit) objArr[0]));
            case 1187821697:
                super.setMaximumPoolSize(((Number) objArr[0]).intValue());
                return null;
            case 1286426995:
                super.setExecuteExistingDelayedTasksAfterShutdownPolicy(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1323020141:
                return new Integer(super.getActiveCount());
            case 1438562916:
                return new Boolean(super.getContinueExistingPeriodicTasksAfterShutdownPolicy());
            case 1581714846:
                super.setCorePoolSize(((Number) objArr[0]).intValue());
                return null;
            case 1773228865:
                return new Integer(super.getMaximumPoolSize());
            case 1838219876:
                return super.scheduleAtFixedRate((Runnable) objArr[0], ((Number) objArr[1]).longValue(), ((Number) objArr[2]).longValue(), (TimeUnit) objArr[3]);
            case 1870685678:
                super.setKeepAliveTime(((Number) objArr[0]).longValue(), (TimeUnit) objArr[1]);
                return null;
            case 1889871592:
                super.setContinueExistingPeriodicTasksAfterShutdownPolicy(((Boolean) objArr[0]).booleanValue());
                return null;
            case 2113937501:
                return super.schedule((Runnable) objArr[0], ((Number) objArr[1]).longValue(), (TimeUnit) objArr[2]);
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("464b0a37", new Object[]{this, runnable, th});
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45eb7bec", new Object[]{this, thread, runnable});
        }
    }

    public static /* synthetic */ void access$000(StubScheduledThreadPoolExecutor stubScheduledThreadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18012b51", new Object[]{stubScheduledThreadPoolExecutor});
        } else {
            stubScheduledThreadPoolExecutor.terminated();
        }
    }

    public StubScheduledThreadPoolExecutor(int i) {
        super(i);
        this.name = jrs.a();
        this.isExcludeThreadPool = StubConfig.isExcludeThread(this.name);
        this.isVirtualThreadPool = !this.isExcludeThreadPool && StubConfig.isVirtualThreadPool();
        this.vExecutor = this.isVirtualThreadPool ? initVirtualThread(i, StubExecutors.defaultThreadFactory(), null) : null;
    }

    public StubScheduledThreadPoolExecutor(int i, e eVar) {
        super(i, eVar);
        this.name = jrs.a(eVar);
        this.isExcludeThreadPool = StubConfig.isExcludeThread(this.name);
        this.isVirtualThreadPool = !this.isExcludeThreadPool && StubConfig.isVirtualThreadPool();
        this.vExecutor = this.isVirtualThreadPool ? initVirtualThread(i, eVar, null) : null;
    }

    public StubScheduledThreadPoolExecutor(int i, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, rejectedExecutionHandler);
        this.name = jrs.a();
        this.isExcludeThreadPool = StubConfig.isExcludeThread(this.name);
        this.isVirtualThreadPool = !this.isExcludeThreadPool && StubConfig.isVirtualThreadPool();
        this.vExecutor = this.isVirtualThreadPool ? initVirtualThread(i, StubExecutors.defaultThreadFactory(), rejectedExecutionHandler) : null;
    }

    public StubScheduledThreadPoolExecutor(int i, e eVar, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, eVar, rejectedExecutionHandler);
        this.name = jrs.a(eVar);
        this.isExcludeThreadPool = StubConfig.isExcludeThread(this.name);
        this.isVirtualThreadPool = !this.isExcludeThreadPool && StubConfig.isVirtualThreadPool();
        this.vExecutor = this.isVirtualThreadPool ? initVirtualThread(i, eVar, rejectedExecutionHandler) : null;
    }

    private VRejectedExecutionHandler makeHandler(RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VRejectedExecutionHandler) ipChange.ipc$dispatch("cddebfff", new Object[]{this, rejectedExecutionHandler}) : rejectedExecutionHandler != null ? new StubThreadPoolExecutor.a(rejectedExecutionHandler, this) : VirtualThreadPoolExecutor.defaultHandler;
    }

    private ScheduledVirtualThreadPoolExecutor initVirtualThread(int i, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledVirtualThreadPoolExecutor) ipChange.ipc$dispatch("9937bd15", new Object[]{this, new Integer(i), threadFactory, rejectedExecutionHandler});
        }
        jrk.b(TAG, this.name, "in virtual thread");
        return new ScheduledVirtualThreadPoolExecutor(i, threadFactory, makeHandler(rejectedExecutionHandler)) { // from class: com.taobao.android.virtual_thread.stub.StubScheduledThreadPoolExecutor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.virtual_thread.VirtualThreadPoolExecutor
            public void beforeExecute(Thread thread, Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("45eb7bec", new Object[]{this, thread, runnable});
                } else {
                    StubScheduledThreadPoolExecutor.this.beforeExecute(thread, runnable);
                }
            }

            @Override // com.taobao.android.virtual_thread.VirtualThreadPoolExecutor
            public void afterExecute(Runnable runnable, Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("464b0a37", new Object[]{this, runnable, th});
                } else {
                    StubScheduledThreadPoolExecutor.this.afterExecute(runnable, th);
                }
            }

            @Override // com.taobao.android.virtual_thread.VirtualThreadPoolExecutor
            public void terminated() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32c8c92a", new Object[]{this});
                } else {
                    StubScheduledThreadPoolExecutor.access$000(StubScheduledThreadPoolExecutor.this);
                }
            }
        };
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("7e00205d", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        if (this.isVirtualThreadPool && StubConfig.isVirtualThreadPool()) {
            return this.vExecutor.schedule(runnable, j, timeUnit);
        }
        return super.schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("b810b526", new Object[]{this, callable, new Long(j), timeUnit});
        }
        if (this.isVirtualThreadPool && StubConfig.isVirtualThreadPool()) {
            return this.vExecutor.schedule(callable, j, timeUnit);
        }
        return super.schedule(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("6d910264", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        if (this.isVirtualThreadPool && StubConfig.isVirtualThreadPool()) {
            return this.vExecutor.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }
        return super.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("953370c6", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        if (this.isVirtualThreadPool && StubConfig.isVirtualThreadPool()) {
            return this.vExecutor.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }
        return super.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    public void setContinueExistingPeriodicTasksAfterShutdownPolicy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a526e8", new Object[]{this, new Boolean(z)});
        } else if (this.isVirtualThreadPool) {
            this.vExecutor.setContinueExistingPeriodicTasksAfterShutdownPolicy(z);
        } else {
            super.setContinueExistingPeriodicTasksAfterShutdownPolicy(z);
        }
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    public boolean getContinueExistingPeriodicTasksAfterShutdownPolicy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55beba64", new Object[]{this})).booleanValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.getContinueExistingPeriodicTasksAfterShutdownPolicy();
        }
        return super.getContinueExistingPeriodicTasksAfterShutdownPolicy();
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    public void setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cad5173", new Object[]{this, new Boolean(z)});
        } else if (this.isVirtualThreadPool) {
            this.vExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(z);
        } else {
            super.setExecuteExistingDelayedTasksAfterShutdownPolicy(z);
        }
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    public boolean getExecuteExistingDelayedTasksAfterShutdownPolicy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95453f79", new Object[]{this})).booleanValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.getExecuteExistingDelayedTasksAfterShutdownPolicy();
        }
        return super.getExecuteExistingDelayedTasksAfterShutdownPolicy();
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    public void setRemoveOnCancelPolicy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343d2cdc", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.isVirtualThreadPool) {
            this.vExecutor.setRemoveOnCancelPolicy(z);
        }
        super.setRemoveOnCancelPolicy(z);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    public boolean getRemoveOnCancelPolicy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4fb5bf0", new Object[]{this})).booleanValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.getRemoveOnCancelPolicy();
        }
        return super.getRemoveOnCancelPolicy();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void allowCoreThreadTimeOut(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55cd25e", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.isVirtualThreadPool) {
            this.vExecutor.allowCoreThreadTimeOut(z);
        }
        super.allowCoreThreadTimeOut(z);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void setKeepAliveTime(long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f8065ee", new Object[]{this, new Long(j), timeUnit});
            return;
        }
        if (this.isVirtualThreadPool) {
            this.vExecutor.setKeepAliveTime(j, timeUnit);
        }
        super.setKeepAliveTime(j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            schedule(runnable, 0L, TimeUnit.NANOSECONDS);
        }
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{this, runnable}) : schedule(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("f26f004f", new Object[]{this, runnable, t}) : schedule(Executors.callable(runnable, t), 0L, TimeUnit.NANOSECONDS);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b2277828", new Object[]{this, callable}) : schedule(callable, 0L, TimeUnit.NANOSECONDS);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
        } else if (this.isVirtualThreadPool) {
            this.vExecutor.shutdown();
        } else {
            super.shutdown();
        }
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb98c640", new Object[]{this});
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.shutdownNow();
        }
        return super.shutdownNow();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ede5622b", new Object[]{this})).booleanValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.isShutdown();
        }
        return super.isShutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public boolean isTerminating() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ce51ddf", new Object[]{this})).booleanValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.isTerminating();
        }
        return super.isTerminating();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d97450f8", new Object[]{this})).booleanValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.isTerminated();
        }
        return super.isTerminated();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db874a4d", new Object[]{this, new Long(j), timeUnit})).booleanValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.awaitTermination(j, timeUnit);
        }
        return super.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void setThreadFactory(ThreadFactory threadFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3bb42c", new Object[]{this, threadFactory});
        } else if (this.isVirtualThreadPool) {
            this.vExecutor.setThreadFactory(threadFactory);
        } else {
            super.setThreadFactory(threadFactory);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public ThreadFactory getThreadFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadFactory) ipChange.ipc$dispatch("2fa31d0c", new Object[]{this});
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.getThreadFactory();
        }
        return super.getThreadFactory();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void setRejectedExecutionHandler(RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d91940", new Object[]{this, rejectedExecutionHandler});
        } else if (this.isVirtualThreadPool) {
            this.vExecutor.setRejectedExecutionHandler(new StubThreadPoolExecutor.a(rejectedExecutionHandler, this));
        } else {
            super.setRejectedExecutionHandler(rejectedExecutionHandler);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public RejectedExecutionHandler getRejectedExecutionHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RejectedExecutionHandler) ipChange.ipc$dispatch("a90b23b6", new Object[]{this});
        }
        if (this.isVirtualThreadPool) {
            return ((StubThreadPoolExecutor.a) this.vExecutor.getRejectedExecutionHandler()).f15824a;
        }
        return super.getRejectedExecutionHandler();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void setCorePoolSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e470d9e", new Object[]{this, new Integer(i)});
        } else if (this.isVirtualThreadPool) {
            this.vExecutor.setCorePoolSize(i);
        } else {
            super.setCorePoolSize(i);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public int getCorePoolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d8190ec", new Object[]{this})).intValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.getCorePoolSize();
        }
        return super.getCorePoolSize();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public boolean prestartCoreThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed2b1813", new Object[]{this})).booleanValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.prestartCoreThread();
        }
        return super.prestartCoreThread();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public int prestartAllCoreThreads() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("240f24a2", new Object[]{this})).intValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.prestartAllCoreThreads();
        }
        return super.prestartAllCoreThreads();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public boolean allowsCoreThreadTimeOut() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39c53ed9", new Object[]{this})).booleanValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.allowsCoreThreadTimeOut();
        }
        return super.allowsCoreThreadTimeOut();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void setMaximumPoolSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ccb881", new Object[]{this, new Integer(i)});
        } else if (this.isVirtualThreadPool) {
            this.vExecutor.setMaximumPoolSize(i);
        } else {
            super.setMaximumPoolSize(i);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public int getMaximumPoolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69b15341", new Object[]{this})).intValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.getMaximumPoolSize();
        }
        return super.getMaximumPoolSize();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public long getKeepAliveTime(TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("400a96e6", new Object[]{this, timeUnit})).longValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.getKeepAliveTime(timeUnit);
        }
        return super.getKeepAliveTime(timeUnit);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor
    public BlockingQueue<Runnable> getQueue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BlockingQueue) ipChange.ipc$dispatch("e2cf35bf", new Object[]{this});
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.getQueue();
        }
        return super.getQueue();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public boolean remove(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb0e920d", new Object[]{this, runnable})).booleanValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.remove(runnable);
        }
        return super.remove(runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void purge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc867b2", new Object[]{this});
        } else if (this.isVirtualThreadPool) {
            this.vExecutor.purge();
        } else {
            super.purge();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public int getPoolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fccf2ead", new Object[]{this})).intValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.getPoolSize();
        }
        return super.getPoolSize();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public int getActiveCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4edbaf6d", new Object[]{this})).intValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.getActiveCount();
        }
        return super.getActiveCount();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public int getLargestPoolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7e649fd", new Object[]{this})).intValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.getLargestPoolSize();
        }
        return super.getLargestPoolSize();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public long getTaskCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("806ec24f", new Object[]{this})).longValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.getTaskCount();
        }
        return super.getTaskCount();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public long getCompletedTaskCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17d58870", new Object[]{this})).longValue();
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.getCompletedTaskCount();
        }
        return super.getCompletedTaskCount();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (this.isVirtualThreadPool) {
            return this.vExecutor.toString();
        }
        return super.toString();
    }
}
