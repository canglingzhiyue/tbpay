package com.ali.user.open.core.service.impl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.service.MemberExecutorService;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.CommonUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes2.dex */
public final class ExecutorServiceImpl implements MemberExecutorService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Handler handler;
    private ThreadPoolExecutor mExecutor;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final BlockingQueue<Runnable> mPoolWorkQueue = new LinkedBlockingQueue(128);
    private final HandlerThread handlerThread = new HandlerThread("SDK Looper Thread");

    static {
        kge.a(1125766237);
        kge.a(223675710);
    }

    public ExecutorServiceImpl() {
        CommonUtils.sendUT("init_step_ucc_init_executor");
        this.handlerThread.start();
        synchronized (this.handlerThread) {
            while (this.handlerThread.getLooper() == null) {
                try {
                    this.handlerThread.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        this.handler = new Handler(this.handlerThread.getLooper());
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.ali.user.open.core.service.impl.ExecutorServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "ExecutorTask #" + this.mCount.getAndIncrement());
            }
        };
        TimeUnit timeUnit = TimeUnit.SECONDS;
        BlockingQueue<Runnable> blockingQueue = this.mPoolWorkQueue;
        this.mExecutor = new ThreadPoolExecutor(4, 8, 1, timeUnit, blockingQueue, threadFactory, new CoordinatorRejectHandler(blockingQueue));
    }

    @Override // com.ali.user.open.core.service.MemberExecutorService
    public void postHandlerTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1cbfb4", new Object[]{this, runnable});
        } else {
            this.handler.post(runnable);
        }
    }

    @Override // com.ali.user.open.core.service.MemberExecutorService
    public void postUITask(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b517155e", new Object[]{this, runnable});
        } else {
            this.mainHandler.post(new Runnable() { // from class: com.ali.user.open.core.service.impl.ExecutorServiceImpl.2
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
                    } catch (Throwable th) {
                        SDKLogger.e(KernelContext.TAG, th.getMessage(), th);
                    }
                }
            });
        }
    }

    @Override // com.ali.user.open.core.service.MemberExecutorService
    public void postTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a3198ca", new Object[]{this, runnable});
        } else if (ExecutorServiceInjectManager.getInjectThreadPoolExecutor() != null) {
            ExecutorServiceInjectManager.getInjectThreadPoolExecutor().execute(runnable);
        } else {
            this.mExecutor.execute(runnable);
        }
    }

    /* loaded from: classes2.dex */
    public static class CoordinatorRejectHandler implements RejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private BlockingQueue<Runnable> mPoolWorkQueue;

        static {
            kge.a(-1870629918);
            kge.a(211959016);
        }

        public CoordinatorRejectHandler(BlockingQueue<Runnable> blockingQueue) {
            this.mPoolWorkQueue = blockingQueue;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                return;
            }
            Object[] array = this.mPoolWorkQueue.toArray();
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (Object obj : array) {
                if (obj.getClass().isAnonymousClass()) {
                    sb.append(getOuterClass(obj));
                    sb.append(',');
                    sb.append(' ');
                } else {
                    sb.append(obj.getClass());
                    sb.append(',');
                    sb.append(' ');
                }
            }
            sb.append(']');
            throw new RejectedExecutionException("Task " + runnable.toString() + " rejected from " + threadPoolExecutor.toString() + " in " + sb.toString());
        }

        private Object getOuterClass(Object obj) {
            try {
                Field declaredField = obj.getClass().getDeclaredField("this$0");
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (Exception e) {
                e.printStackTrace();
                return obj;
            }
        }
    }

    @Override // com.ali.user.open.core.service.MemberExecutorService
    public Looper getDefaultLooper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Looper) ipChange.ipc$dispatch("7fd2ccd8", new Object[]{this}) : this.handlerThread.getLooper();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            this.mExecutor.execute(runnable);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
        } else {
            this.mExecutor.shutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("eb98c640", new Object[]{this}) : this.mExecutor.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ede5622b", new Object[]{this})).booleanValue() : this.mExecutor.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d97450f8", new Object[]{this})).booleanValue() : this.mExecutor.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("db874a4d", new Object[]{this, new Long(j), timeUnit})).booleanValue() : this.mExecutor.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b2277828", new Object[]{this, callable}) : this.mExecutor.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("f26f004f", new Object[]{this, runnable, t}) : this.mExecutor.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{this, runnable}) : this.mExecutor.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0aab466", new Object[]{this, collection}) : this.mExecutor.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e74164f2", new Object[]{this, collection, new Long(j), timeUnit}) : this.mExecutor.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("8c2ecc66", new Object[]{this, collection}) : (T) this.mExecutor.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("9962f5f2", new Object[]{this, collection, new Long(j), timeUnit}) : (T) this.mExecutor.invokeAny(collection, j, timeUnit);
    }
}
