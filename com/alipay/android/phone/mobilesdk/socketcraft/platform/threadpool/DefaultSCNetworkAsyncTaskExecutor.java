package com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class DefaultSCNetworkAsyncTaskExecutor implements SCNetworkAsyncTaskExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ThreadPoolExecutor f5117a = new ThreadPoolExecutor(7, Integer.MAX_VALUE, 2, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.DiscardOldestPolicy());
    private final ScheduledThreadPoolExecutor b = new ScheduledThreadPoolExecutor(1);

    public DefaultSCNetworkAsyncTaskExecutor() {
        this.f5117a.allowCoreThreadTimeOut(true);
        this.b.setKeepAliveTime(6L, TimeUnit.SECONDS);
        this.b.allowCoreThreadTimeOut(true);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public void executeIO(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb33be0", new Object[]{this, runnable});
        } else {
            this.f5117a.execute(runnable);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public void executeLowPri(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de336c0d", new Object[]{this, runnable});
        } else {
            this.f5117a.execute(runnable);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public void executeLazy(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c3570e", new Object[]{this, runnable});
        } else {
            this.f5117a.execute(runnable);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            this.f5117a.execute(runnable);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public Future<?> submit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{this, runnable}) : this.f5117a.submit(runnable);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public Future<?> submitLazy(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("bbcf7947", new Object[]{this, runnable}) : this.f5117a.submit(runnable);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public void executeSerial(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97c5104e", new Object[]{this, runnable});
        } else {
            this.f5117a.execute(runnable);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public Future<?> submitSerial(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("353875c7", new Object[]{this, runnable}) : this.f5117a.submit(runnable);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public <T> Future<T> submit(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b2277828", new Object[]{this, callable}) : this.f5117a.submit(callable);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("7e00205d", new Object[]{this, runnable, new Long(j), timeUnit}) : this.b.schedule(runnable, j, timeUnit);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("b810b526", new Object[]{this, callable, new Long(j), timeUnit}) : this.b.schedule(callable, j, timeUnit);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("6d910264", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit}) : this.b.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("953370c6", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit}) : this.b.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }
}
