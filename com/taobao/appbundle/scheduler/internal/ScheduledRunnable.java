package com.taobao.appbundle.scheduler.internal;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements c, Runnable, Callable<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Object ASYNC_DISPOSED;
    public static final Object DONE;
    public static final int FUTURE_INDEX = 1;
    public static final Object PARENT_DISPOSED;
    public static final int PARENT_INDEX = 0;
    public static final Object SYNC_DISPOSED;
    public static final int THREAD_INDEX = 2;
    private static final long serialVersionUID = -6120223772001106981L;
    public final Runnable actual;

    static {
        kge.a(872669035);
        kge.a(-1390502639);
        kge.a(-119797776);
        kge.a(-495609857);
        PARENT_DISPOSED = new Object();
        SYNC_DISPOSED = new Object();
        ASYNC_DISPOSED = new Object();
        DONE = new Object();
    }

    public ScheduledRunnable(Runnable runnable, d dVar) {
        super(3);
        this.actual = runnable;
        lazySet(0, dVar);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        run();
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        lazySet(2, Thread.currentThread());
        try {
            this.actual.run();
            Object obj3 = get(0);
            if (obj3 != PARENT_DISPOSED && compareAndSet(0, obj3, DONE) && obj3 != null) {
                ((d) obj3).b(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == SYNC_DISPOSED || obj2 == ASYNC_DISPOSED) {
                    break;
                }
            } while (!compareAndSet(1, obj2, DONE));
            lazySet(2, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Object obj4 = get(0);
                if (obj4 != PARENT_DISPOSED && compareAndSet(0, obj4, DONE) && obj4 != null) {
                    ((d) obj4).b(this);
                }
                do {
                    obj = get(1);
                    if (obj == SYNC_DISPOSED || obj == ASYNC_DISPOSED) {
                        break;
                    }
                } while (!compareAndSet(1, obj, DONE));
                lazySet(2, null);
                throw th2;
            }
        }
    }

    public void setFuture(Future<?> future) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792d281a", new Object[]{this, future});
            return;
        }
        do {
            obj = get(1);
            if (obj == DONE) {
                return;
            }
            if (obj == SYNC_DISPOSED) {
                future.cancel(false);
                return;
            } else if (obj == ASYNC_DISPOSED) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // com.taobao.appbundle.scheduler.internal.c
    public void dispose() {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        while (true) {
            Object obj3 = get(1);
            if (obj3 == DONE || obj3 == SYNC_DISPOSED || obj3 == ASYNC_DISPOSED) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (compareAndSet(1, obj3, z ? ASYNC_DISPOSED : SYNC_DISPOSED)) {
                if (obj3 != null) {
                    ((Future) obj3).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == DONE || obj == (obj2 = PARENT_DISPOSED) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((d) obj).b(this);
    }

    public boolean isDisposed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be7a7a", new Object[]{this})).booleanValue();
        }
        Object obj = get(0);
        return obj == PARENT_DISPOSED || obj == DONE;
    }

    @Override // java.util.concurrent.atomic.AtomicReferenceArray
    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        Object obj = get(1);
        if (obj == DONE) {
            str = "Finished";
        } else if (obj == SYNC_DISPOSED) {
            str = "Disposed(Sync)";
        } else if (obj == ASYNC_DISPOSED) {
            str = "Disposed(Async)";
        } else {
            Object obj2 = get(2);
            if (obj2 == null) {
                str = "Waiting";
            } else {
                str = "Running on " + obj2;
            }
        }
        return getClass().getSimpleName() + riy.ARRAY_START_STR + str + riy.ARRAY_END_STR;
    }
}
