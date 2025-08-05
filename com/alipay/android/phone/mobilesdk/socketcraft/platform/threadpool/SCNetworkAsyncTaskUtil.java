package com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class SCNetworkAsyncTaskUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final void executeIO(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb33be0", new Object[]{runnable});
        } else {
            getThreadPool().executeIO(runnable);
        }
    }

    public static final void executeLowPri(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de336c0d", new Object[]{runnable});
        } else {
            getThreadPool().executeLowPri(runnable);
        }
    }

    public static final void executeLazy(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c3570e", new Object[]{runnable});
        } else {
            getThreadPool().executeLazy(runnable);
        }
    }

    public static final void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
        } else {
            getThreadPool().execute(runnable);
        }
    }

    public static final Future<?> submit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{runnable}) : getThreadPool().submit(runnable);
    }

    public static final Future<?> submitLazy(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("bbcf7947", new Object[]{runnable}) : getThreadPool().submitLazy(runnable);
    }

    public static final void executeSerial(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97c5104e", new Object[]{runnable});
        } else {
            getThreadPool().executeSerial(runnable);
        }
    }

    public static final Future<?> submitSerial(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("353875c7", new Object[]{runnable}) : getThreadPool().submitSerial(runnable);
    }

    public static final <T> Future<T> submit(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b2277828", new Object[]{callable}) : getThreadPool().submit(callable);
    }

    public static final ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("7e00205d", new Object[]{runnable, new Long(j), timeUnit}) : getThreadPool().schedule(runnable, j, timeUnit);
    }

    public static final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("b810b526", new Object[]{callable, new Long(j), timeUnit}) : getThreadPool().schedule(callable, j, timeUnit);
    }

    public static final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("6d910264", new Object[]{runnable, new Long(j), new Long(j2), timeUnit}) : getThreadPool().scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    public static final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("953370c6", new Object[]{runnable, new Long(j), new Long(j2), timeUnit}) : getThreadPool().scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    public static final SCNetworkAsyncTaskExecutor getThreadPool() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SCNetworkAsyncTaskExecutor) ipChange.ipc$dispatch("32494a80", new Object[0]) : SCNetworkAsyncTaskExecutorFactory.getInstance();
    }
}
