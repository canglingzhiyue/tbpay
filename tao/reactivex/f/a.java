package tao.reactivex.f;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import tb.jdz;
import tb.kea;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class a extends AtomicReference<Future<?>> implements jdz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final FutureTask<Void> c;
    public static final FutureTask<Void> d;

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f25151a;
    public Thread b;

    static {
        kge.a(1964949467);
        kge.a(1964944663);
        c = new FutureTask<>(kea.c, null);
        d = new FutureTask<>(kea.c, null);
    }

    public a(Runnable runnable) {
        this.f25151a = runnable;
    }

    public final void a(Future<?> future) {
        Future<?> future2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f9effe", new Object[]{this, future});
            return;
        }
        do {
            future2 = get();
            if (future2 == c) {
                return;
            }
            if (future2 == d) {
                if (this.b == Thread.currentThread()) {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // tb.jdz
    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Future<?> future = get();
        return future == c || future == d;
    }

    @Override // tb.jdz
    public final void b_() {
        FutureTask<Void> futureTask;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            return;
        }
        Future<?> future = get();
        if (future == c || future == (futureTask = d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        if (this.b != Thread.currentThread()) {
            z = true;
        }
        future.cancel(z);
    }
}
