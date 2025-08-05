package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.e;
import io.reactivex.ac;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class jrn extends ac.b implements Disposable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f29738a;
    private final ScheduledExecutorService b;

    static {
        kge.a(-876440422);
        kge.a(-697388747);
    }

    public jrn(e eVar) {
        this.b = jrq.a(eVar);
    }

    public Disposable schedule(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Disposable) ipChange.ipc$dispatch("2b50b7b8", new Object[]{this, runnable}) : schedule(runnable, 0L, null);
    }

    public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Disposable) ipChange.ipc$dispatch("4603eaac", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        if (this.f29738a) {
            return EmptyDisposable.INSTANCE;
        }
        return a(runnable, j, timeUnit, (DisposableContainer) null);
    }

    public Disposable a(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Disposable) ipChange.ipc$dispatch("67b6d576", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        Runnable a2 = rsy.a(runnable);
        try {
            if (j <= 0) {
                schedule = this.b.submit(a2);
            } else {
                schedule = this.b.schedule(a2, j, timeUnit);
            }
            return b.a(schedule);
        } catch (RejectedExecutionException e) {
            rsy.a(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    public Disposable a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Disposable) ipChange.ipc$dispatch("e350272e", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        try {
            return b.a(this.b.scheduleAtFixedRate(rsy.a(runnable), j, j2, timeUnit));
        } catch (RejectedExecutionException e) {
            rsy.a(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    public ScheduledRunnable a(Runnable runnable, long j, TimeUnit timeUnit, DisposableContainer disposableContainer) {
        Future schedule;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledRunnable) ipChange.ipc$dispatch("6fc8c7fe", new Object[]{this, runnable, new Long(j), timeUnit, disposableContainer});
        }
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(rsy.a(runnable), disposableContainer);
        if (disposableContainer != null && !disposableContainer.add(scheduledRunnable)) {
            return scheduledRunnable;
        }
        try {
            if (j <= 0) {
                schedule = this.b.submit((Callable) scheduledRunnable);
            } else {
                schedule = this.b.schedule((Callable) scheduledRunnable, j, timeUnit);
            }
            scheduledRunnable.setFuture(schedule);
        } catch (RejectedExecutionException e) {
            disposableContainer.remove(scheduledRunnable);
            rsy.a(e);
        }
        return scheduledRunnable;
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else if (this.f29738a) {
        } else {
            this.f29738a = true;
            this.b.shutdownNow();
        }
    }

    public boolean isDisposed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("be7a7a", new Object[]{this})).booleanValue() : this.f29738a;
    }
}
