package tao.reactivex.f;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import tb.jdz;
import tb.kea;
import tb.kge;

/* loaded from: classes9.dex */
public final class c implements Callable<Void>, jdz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final FutureTask<Void> f;

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f25155a;
    public final ExecutorService d;
    public Thread e;
    public final AtomicReference<Future<?>> c = new AtomicReference<>();
    public final AtomicReference<Future<?>> b = new AtomicReference<>();

    static {
        kge.a(1964949469);
        kge.a(-119797776);
        kge.a(1964944663);
        f = new FutureTask<>(kea.c, null);
    }

    public c(Runnable runnable, ExecutorService executorService) {
        this.f25155a = runnable;
        this.d = executorService;
    }

    public Void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("ca430795", new Object[]{this});
        }
        try {
            this.e = Thread.currentThread();
            this.f25155a.run();
            b(this.d.submit(this));
            return null;
        } finally {
            this.e = null;
        }
    }

    public void a(Future<?> future) {
        Future<?> future2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f9effe", new Object[]{this, future});
            return;
        }
        do {
            future2 = this.c.get();
            if (future2 == f) {
                future.cancel(this.e != Thread.currentThread());
            }
        } while (!this.c.compareAndSet(future2, future));
    }

    public void b(Future<?> future) {
        Future<?> future2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3419b41d", new Object[]{this, future});
            return;
        }
        do {
            future2 = this.b.get();
            if (future2 == f) {
                future.cancel(this.e != Thread.currentThread());
            }
        } while (!this.b.compareAndSet(future2, future));
    }

    @Override // tb.jdz
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c.get() == f;
    }

    @Override // tb.jdz
    public void b_() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            return;
        }
        Future<?> andSet = this.c.getAndSet(f);
        if (andSet != null && andSet != f) {
            andSet.cancel(this.e != Thread.currentThread());
        }
        Future<?> andSet2 = this.b.getAndSet(f);
        if (andSet2 == null || andSet2 == f) {
            return;
        }
        if (this.e != Thread.currentThread()) {
            z = true;
        }
        andSet2.cancel(z);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Void, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public /* synthetic */ Void call() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6d249ded", new Object[]{this}) : a();
    }
}
