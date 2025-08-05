package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.stub.StubExecutors;
import io.reactivex.ac;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class jrr extends ac {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jrp b;
    public static final ScheduledExecutorService c;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService> f29742a = new AtomicReference<>();

    static {
        kge.a(2110035461);
        ScheduledExecutorService newScheduledThreadPool = StubExecutors.newScheduledThreadPool(0, new jrp("Rx"));
        c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        b = new jrp("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())));
    }

    public jrr() {
        this.f29742a.lazySet(a());
    }

    public static ScheduledExecutorService a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("7a4b6c8c", new Object[0]) : jrq.a(b);
    }

    public void start() {
        ScheduledExecutorService scheduledExecutorService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = this.f29742a.get();
            if (scheduledExecutorService != c) {
                if (scheduledExecutorService2 == null) {
                    return;
                }
                scheduledExecutorService2.shutdown();
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = a();
            }
        } while (!this.f29742a.compareAndSet(scheduledExecutorService, scheduledExecutorService2));
    }

    public void shutdown() {
        ScheduledExecutorService andSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        ScheduledExecutorService scheduledExecutorService = this.f29742a.get();
        ScheduledExecutorService scheduledExecutorService2 = c;
        if (scheduledExecutorService == scheduledExecutorService2 || (andSet = this.f29742a.getAndSet(scheduledExecutorService2)) == c) {
            return;
        }
        andSet.shutdownNow();
    }

    public ac.b createWorker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ac.b) ipChange.ipc$dispatch("113cb2d9", new Object[]{this}) : new a(this.f29742a.get());
    }

    public Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Disposable) ipChange.ipc$dispatch("38285f5", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        Runnable a2 = rsy.a(runnable);
        try {
            if (j <= 0) {
                schedule = this.f29742a.get().submit(a2);
            } else {
                schedule = this.f29742a.get().schedule(a2, j, timeUnit);
            }
            return b.a(schedule);
        } catch (RejectedExecutionException e) {
            rsy.a(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    public Disposable schedulePeriodicallyDirect(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Disposable) ipChange.ipc$dispatch("f7b7b3fc", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        try {
            return b.a(this.f29742a.get().scheduleAtFixedRate(rsy.a(runnable), j, j2, timeUnit));
        } catch (RejectedExecutionException e) {
            rsy.a(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    /* loaded from: classes6.dex */
    public static final class a extends ac.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ScheduledExecutorService f29743a;
        public final io.reactivex.disposables.a b = new io.reactivex.disposables.a();
        public volatile boolean c;

        static {
            kge.a(1329127884);
        }

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.f29743a = scheduledExecutorService;
        }

        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            Future schedule;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Disposable) ipChange.ipc$dispatch("4603eaac", new Object[]{this, runnable, new Long(j), timeUnit});
            }
            if (this.c) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(rsy.a(runnable), this.b);
            this.b.add(scheduledRunnable);
            try {
                if (j <= 0) {
                    schedule = this.f29743a.submit((Callable) scheduledRunnable);
                } else {
                    schedule = this.f29743a.schedule((Callable) scheduledRunnable, j, timeUnit);
                }
                scheduledRunnable.setFuture(schedule);
                return scheduledRunnable;
            } catch (RejectedExecutionException e) {
                dispose();
                rsy.a(e);
                return EmptyDisposable.INSTANCE;
            }
        }

        public void dispose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("226c8326", new Object[]{this});
            } else if (this.c) {
            } else {
                this.c = true;
                this.b.dispose();
            }
        }

        public boolean isDisposed() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("be7a7a", new Object[]{this})).booleanValue() : this.c;
        }
    }
}
