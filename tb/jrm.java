package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.e;
import com.taobao.android.virtual_thread.stub.StubExecutors;
import io.reactivex.ac;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class jrm extends ac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final jrp f29735a;
    public static final jrp b;
    public static final c c;
    public static final a e;
    private static final TimeUnit f;
    public final AtomicReference<a> d = new AtomicReference<>(e);

    static {
        kge.a(-441072316);
        f = TimeUnit.SECONDS;
        a aVar = new a(0L, null);
        e = aVar;
        aVar.d();
        c cVar = new c(new jrp("RxCachedThreadSchedulerShutdown"));
        c = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f29735a = new jrp("RxCachedThreadScheduler", max);
        b = new jrp("RxCachedWorkerPoolEvictor", max);
    }

    /* loaded from: classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final io.reactivex.disposables.a f29736a;
        private final long b;
        private final ConcurrentLinkedQueue<c> c;
        private final ScheduledExecutorService d;
        private final Future<?> e;

        static {
            kge.a(1379169020);
            kge.a(-1390502639);
        }

        public a(long j, TimeUnit timeUnit) {
            ScheduledFuture<?> scheduledFuture;
            this.b = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.c = new ConcurrentLinkedQueue<>();
            this.f29736a = new io.reactivex.disposables.a();
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = StubExecutors.newScheduledThreadPool(1, jrm.b);
                long j2 = this.b;
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.d = scheduledExecutorService;
            this.e = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b();
            }
        }

        public c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("6799413a", new Object[]{this});
            }
            if (this.f29736a.isDisposed()) {
                return jrm.c;
            }
            while (!this.c.isEmpty()) {
                c poll = this.c.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(jrm.f29735a);
            this.f29736a.add(cVar);
            return cVar;
        }

        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b16eacb4", new Object[]{this, cVar});
                return;
            }
            cVar.a(c() + this.b);
            this.c.offer(cVar);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (this.c.isEmpty()) {
            } else {
                long c = c();
                Iterator<c> it = this.c.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next.a() > c) {
                        return;
                    }
                    if (this.c.remove(next)) {
                        this.f29736a.remove(next);
                    }
                }
            }
        }

        public long c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : System.nanoTime();
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            this.f29736a.dispose();
            Future<?> future = this.e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.d;
            if (scheduledExecutorService == null) {
                return;
            }
            scheduledExecutorService.shutdownNow();
        }
    }

    public jrm() {
        start();
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        a aVar = new a(60L, f);
        if (this.d.compareAndSet(e, aVar)) {
            return;
        }
        aVar.d();
    }

    public void shutdown() {
        a aVar;
        a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        do {
            aVar = this.d.get();
            aVar2 = e;
            if (aVar == aVar2) {
                return;
            }
        } while (!this.d.compareAndSet(aVar, aVar2));
        aVar.d();
    }

    public ac.b createWorker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ac.b) ipChange.ipc$dispatch("113cb2d9", new Object[]{this}) : new b(this.d.get());
    }

    /* loaded from: classes6.dex */
    public static final class b extends ac.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicBoolean f29737a = new AtomicBoolean();
        private final io.reactivex.disposables.a b = new io.reactivex.disposables.a();
        private final a c;
        private final c d;

        static {
            kge.a(-2033092100);
        }

        public b(a aVar) {
            this.c = aVar;
            this.d = aVar.a();
        }

        public void dispose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("226c8326", new Object[]{this});
            } else if (!this.f29737a.compareAndSet(false, true)) {
            } else {
                this.b.dispose();
                this.c.a(this.d);
            }
        }

        public boolean isDisposed() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("be7a7a", new Object[]{this})).booleanValue() : this.f29737a.get();
        }

        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Disposable) ipChange.ipc$dispatch("4603eaac", new Object[]{this, runnable, new Long(j), timeUnit});
            }
            if (this.b.isDisposed()) {
                return EmptyDisposable.INSTANCE;
            }
            return this.d.a(runnable, j, timeUnit, (DisposableContainer) this.b);
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends jrn {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long b;

        static {
            kge.a(-371702360);
        }

        public c(e eVar) {
            super(eVar);
            this.b = 0L;
        }

        public long a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.b;
        }

        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            } else {
                this.b = j;
            }
        }
    }
}
