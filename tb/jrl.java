package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.e;
import io.reactivex.ac;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class jrl extends ac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final b f29732a;
    public static final jrp b;
    public static final int c;
    public static final c d;
    public final AtomicReference<b> e = new AtomicReference<>(f29732a);

    /* loaded from: classes6.dex */
    public static final class c extends jrn {
        static {
            kge.a(-939481387);
        }

        public c(e eVar) {
            super(eVar);
        }
    }

    public static int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue() : (i2 <= 0 || i2 > i) ? i : i2;
    }

    static {
        kge.a(-931705975);
        f29732a = new b(0);
        c = a(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());
        c cVar = new c(new jrp("RxComputationShutdown"));
        d = cVar;
        cVar.dispose();
        b = new jrp("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())));
    }

    /* loaded from: classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f29734a;
        public final c[] b;
        public long c;

        static {
            kge.a(-28834434);
        }

        public b(int i) {
            this.f29734a = i;
            this.b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new c(jrl.b);
            }
        }

        public c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("6798ccdb", new Object[]{this});
            }
            int i = this.f29734a;
            if (i == 0) {
                return jrl.d;
            }
            c[] cVarArr = this.b;
            long j = this.c;
            this.c = 1 + j;
            return cVarArr[(int) (j % i)];
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            for (c cVar : this.b) {
                cVar.dispose();
            }
        }
    }

    public jrl() {
        start();
    }

    public ac.b createWorker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ac.b) ipChange.ipc$dispatch("113cb2d9", new Object[]{this}) : new a(this.e.get().a());
    }

    public Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Disposable) ipChange.ipc$dispatch("38285f5", new Object[]{this, runnable, new Long(j), timeUnit}) : this.e.get().a().a(runnable, j, timeUnit);
    }

    public Disposable schedulePeriodicallyDirect(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Disposable) ipChange.ipc$dispatch("f7b7b3fc", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit}) : this.e.get().a().a(runnable, j, j2, timeUnit);
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        b bVar = new b(c);
        if (this.e.compareAndSet(f29732a, bVar)) {
            return;
        }
        bVar.b();
    }

    public void shutdown() {
        b bVar;
        b bVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        do {
            bVar = this.e.get();
            bVar2 = f29732a;
            if (bVar == bVar2) {
                return;
            }
        } while (!this.e.compareAndSet(bVar, bVar2));
        bVar.b();
    }

    /* loaded from: classes6.dex */
    public static final class a extends ac.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f29733a;
        private final ListCompositeDisposable b = new ListCompositeDisposable();
        private final io.reactivex.disposables.a c = new io.reactivex.disposables.a();
        private final ListCompositeDisposable d = new ListCompositeDisposable();
        private final c e;

        static {
            kge.a(1871697473);
        }

        public a(c cVar) {
            this.e = cVar;
            this.d.add(this.b);
            this.d.add(this.c);
        }

        public void dispose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("226c8326", new Object[]{this});
            } else if (this.f29733a) {
            } else {
                this.f29733a = true;
                this.d.dispose();
            }
        }

        public boolean isDisposed() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("be7a7a", new Object[]{this})).booleanValue() : this.f29733a;
        }

        public Disposable schedule(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Disposable) ipChange.ipc$dispatch("2b50b7b8", new Object[]{this, runnable});
            }
            if (this.f29733a) {
                return EmptyDisposable.INSTANCE;
            }
            return this.e.a(runnable, 0L, (TimeUnit) null, (DisposableContainer) this.b);
        }

        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Disposable) ipChange.ipc$dispatch("4603eaac", new Object[]{this, runnable, new Long(j), timeUnit});
            }
            if (this.f29733a) {
                return EmptyDisposable.INSTANCE;
            }
            return this.e.a(runnable, j, timeUnit, (DisposableContainer) this.c);
        }
    }
}
