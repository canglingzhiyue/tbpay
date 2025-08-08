package com.alipay.mobile.common.transport.concurrent;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.transport.http.HttpTask;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public class ActThreadPoolExecutor extends ThreadPoolExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5521a;
    private int b;
    public Condition mPauseCondition;
    public ReentrantLock mPauseLock;
    public boolean mPaused;

    public static /* synthetic */ Object ipc$super(ActThreadPoolExecutor actThreadPoolExecutor, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1173060588) {
            super.beforeExecute((Thread) objArr[0], (Runnable) objArr[1]);
            return null;
        } else if (hashCode != 1179322935) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.afterExecute((Runnable) objArr[0], (Throwable) objArr[1]);
            return null;
        }
    }

    public ActThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        super(i, i2, j, timeUnit, blockingQueue);
        this.f5521a = "";
        this.mPaused = false;
        this.mPauseLock = new ReentrantLock();
        this.mPauseCondition = this.mPauseLock.newCondition();
    }

    public ActThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
        this.f5521a = "";
        this.mPaused = false;
        this.mPauseLock = new ReentrantLock();
        this.mPauseCondition = this.mPauseLock.newCondition();
    }

    public ActThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, rejectedExecutionHandler);
        this.f5521a = "";
        this.mPaused = false;
        this.mPauseLock = new ReentrantLock();
        this.mPauseCondition = this.mPauseLock.newCondition();
    }

    public ActThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.f5521a = "";
        this.mPaused = false;
        this.mPauseLock = new ReentrantLock();
        this.mPauseCondition = this.mPauseLock.newCondition();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45eb7bec", new Object[]{this, thread, runnable});
            return;
        }
        this.mPauseLock.lock();
        try {
            try {
                if (runnable instanceof HttpTask) {
                    ((HttpTask) runnable).setTaskState(0);
                }
                if (isPaused()) {
                    b(runnable);
                    this.mPauseCondition.await();
                }
                super.beforeExecute(thread, runnable);
            } catch (InterruptedException e) {
                LogCatUtil.warn("ActThreadPoolExecutor", e);
                thread.interrupt();
            }
            this.mPauseLock.unlock();
            a(runnable);
        } catch (Throwable th) {
            this.mPauseLock.unlock();
            throw th;
        }
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (!(runnable instanceof HttpTask)) {
        } else {
            HttpTask httpTask = (HttpTask) runnable;
            if (!StringUtils.isEmpty(httpTask.getOperationType())) {
                LogCatUtil.debug("ActThreadPoolExecutor", "beforeExecute: " + this.f5521a + "," + httpTask.getOperationType());
                return;
            }
            LogCatUtil.debug("ActThreadPoolExecutor", "beforeExecute: " + this.f5521a + "," + httpTask.getUrl());
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("464b0a37", new Object[]{this, runnable, th});
            return;
        }
        if (runnable instanceof HttpTask) {
            ((HttpTask) runnable).setTaskState(2);
        }
        super.afterExecute(runnable, th);
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        this.mPauseLock.lock();
        try {
            LogCatUtil.debug("ActThreadPoolExecutor", "mTaskTypeName：" + this.f5521a + ", pause");
            a();
        } finally {
            this.mPauseLock.unlock();
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        this.mPauseLock.lock();
        try {
            LogCatUtil.debug("ActThreadPoolExecutor", "mTaskTypeName：" + this.f5521a + ",resume");
            b();
            this.mPauseCondition.signalAll();
        } finally {
            this.mPauseLock.unlock();
        }
    }

    public String getTaskTypeName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f0db06f9", new Object[]{this}) : this.f5521a;
    }

    public void setTaskTypeName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb244c9d", new Object[]{this, str});
        } else {
            this.f5521a = str;
        }
    }

    public int getTaskType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d929bdcf", new Object[]{this})).intValue() : this.b;
    }

    public void setTaskType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee4d71b", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public boolean isHighPriorityThreadPool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdfefaa1", new Object[]{this})).booleanValue();
        }
        int i = this.b;
        return i == 0 || i == 4 || i == 5 || i == 6 || i == 8;
    }

    public boolean isPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ec0d383", new Object[]{this})).booleanValue();
        }
        this.mPauseLock.lock();
        try {
            return this.mPaused;
        } finally {
            this.mPauseLock.unlock();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.mPaused = true;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.mPaused = false;
        }
    }

    private void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
        } else if (!(runnable instanceof HttpTask)) {
        } else {
            HttpTask httpTask = (HttpTask) runnable;
            if (!StringUtils.isEmpty(httpTask.getOperationType())) {
                LogCatUtil.debug("ActThreadPoolExecutor", "beforeExecute.await: " + this.f5521a + "," + httpTask.getOperationType());
                return;
            }
            LogCatUtil.debug("ActThreadPoolExecutor", "beforeExecute.await: " + this.f5521a + "," + httpTask.getUrl());
        }
    }
}
