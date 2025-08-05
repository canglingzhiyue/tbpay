package com.alipay.mobile.common.transport.concurrent;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes3.dex */
public class ZFutureTask<V> extends FutureTask<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TASK_STATE_AFTER_RUN = 2;
    public static final int TASK_STATE_BEFORE_RUN = 0;
    public static final int TASK_STATE_DONE = 4;
    public static final int TASK_STATE_READY = -1;
    public static final int TASK_STATE_RUNNING = 1;
    public Callable<V> callable;
    public Observable mObservable;
    public boolean mOtcWaitTask;
    public String mTaskId;
    public int mTaskState;
    public int mTaskType;

    /* loaded from: classes3.dex */
    public class DoneObservable extends Observable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public DoneObservable() {
        }

        public static /* synthetic */ Object ipc$super(DoneObservable doneObservable, String str, Object... objArr) {
            if (str.hashCode() == -310743881) {
                super.notifyObservers(objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // java.util.Observable
        public void notifyObservers(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed7a6cb7", new Object[]{this, obj});
                return;
            }
            setChanged();
            super.notifyObservers(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(ZFutureTask zFutureTask, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1619161865:
                return new Boolean(super.cancel(((Boolean) objArr[0]).booleanValue()));
            case -165451899:
                super.set(objArr[0]);
                return null;
            case 1159927561:
                super.done();
                return null;
            case 1548812690:
                super.run();
                return null;
            case 1677774945:
                super.setException((Throwable) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public ZFutureTask(Callable<V> callable, int i) {
        super(callable);
        this.mTaskState = -1;
        this.mTaskType = i;
        this.callable = callable;
    }

    public ZFutureTask(Runnable runnable, V v, int i) {
        this(Executors.callable(runnable, v), i);
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        this.mTaskState = 1;
        super.run();
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45231709", new Object[]{this});
            return;
        }
        this.mTaskState = 4;
        this.mObservable.notifyObservers(this);
        super.done();
    }

    @Override // java.util.concurrent.FutureTask
    public void set(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6236785", new Object[]{this, v});
        } else {
            super.set(v);
        }
    }

    @Override // java.util.concurrent.FutureTask
    public void setException(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6400d061", new Object[]{this, th});
        } else {
            super.setException(th);
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f7d8cf7", new Object[]{this, new Boolean(z)})).booleanValue() : super.cancel(z);
    }

    public void fail(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("473a2070", new Object[]{this, th});
        } else {
            setException(th);
        }
    }

    public void addDoneObserver(Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c4bff9", new Object[]{this, observer});
            return;
        }
        if (this.mObservable == null) {
            this.mObservable = new DoneObservable();
        }
        this.mObservable.addObserver(observer);
    }

    public int getTaskState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b388a4d0", new Object[]{this})).intValue() : this.mTaskState;
    }

    public void setTaskState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8582d1d2", new Object[]{this, new Integer(i)});
        } else {
            this.mTaskState = i;
        }
    }

    public void setTaskType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee4d71b", new Object[]{this, new Integer(i)});
        } else {
            this.mTaskType = i;
        }
    }

    public int getTaskType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d929bdcf", new Object[]{this})).intValue() : this.mTaskType;
    }

    public String getTaskId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54ada043", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mTaskId)) {
            this.mTaskId = String.valueOf(this.callable.hashCode());
        }
        return this.mTaskId;
    }

    public boolean isOtcWaitTask() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e91d7d9", new Object[]{this})).booleanValue() : this.mOtcWaitTask;
    }

    public void setOtcWaitTask(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("659614d7", new Object[]{this, new Boolean(z)});
        } else {
            this.mOtcWaitTask = z;
        }
    }

    public boolean isRunning() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue() : !isDone() && this.mTaskState == 1;
    }

    public boolean isReady() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("52d16a4", new Object[]{this})).booleanValue() : !isDone() && this.mTaskState == -1;
    }

    public boolean isBeforeRun() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d94f140d", new Object[]{this})).booleanValue() : !isDone() && this.mTaskState == 0;
    }
}
