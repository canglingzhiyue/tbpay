package tao.reactivex.f;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import tao.reactivex.k;
import tb.irs;
import tb.jdz;
import tb.kge;

/* loaded from: classes9.dex */
public final class d extends tao.reactivex.k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final f f25156a;
    public static final f b;
    public static final c c;
    public static final a f;
    private static final TimeUnit h;
    public final ThreadFactory d;
    public final AtomicReference<a> e;

    /* loaded from: classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final irs f25157a;
        private final long b;
        private final ConcurrentLinkedQueue<c> c;
        private final ScheduledExecutorService d;
        private final Future<?> e;
        private final ThreadFactory f;

        static {
            kge.a(-1469168357);
            kge.a(-1390502639);
        }

        public a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            this.b = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.c = new ConcurrentLinkedQueue<>();
            this.f25157a = new irs();
            this.f = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, d.b);
                long j2 = this.b;
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.d = scheduledExecutorService;
            this.e = scheduledFuture;
        }

        public c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("a482f01c", new Object[]{this});
            }
            if (this.f25157a.b()) {
                return d.c;
            }
            while (!this.c.isEmpty()) {
                c poll = this.c.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(this.f);
            this.f25157a.a(cVar);
            return cVar;
        }

        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("533bd39c", new Object[]{this, cVar});
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
                        this.f25157a.b(next);
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
            this.f25157a.b_();
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

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b();
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class b extends k.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicBoolean f25158a = new AtomicBoolean();
        private final irs b = new irs();
        private final a c;
        private final c d;

        static {
            kge.a(-1469168356);
        }

        public b(a aVar) {
            this.c = aVar;
            this.d = aVar.a();
        }

        @Override // tao.reactivex.k.c
        public jdz a(Runnable runnable, long j, TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (jdz) ipChange.ipc$dispatch("50795aec", new Object[]{this, runnable, new Long(j), timeUnit}) : this.b.b() ? tao.reactivex.d.a.b.INSTANCE : this.d.a(runnable, j, timeUnit, this.b);
        }

        @Override // tb.jdz
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f25158a.get();
        }

        @Override // tb.jdz
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else if (!this.f25158a.compareAndSet(false, true)) {
            } else {
                this.b.b_();
                this.c.a(this.d);
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class c extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long b;

        static {
            kge.a(-1469168355);
        }

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
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

    static {
        kge.a(1964949470);
        h = TimeUnit.SECONDS;
        c cVar = new c(new f("PmCachedThreadSchedulerShutdown"));
        c = cVar;
        cVar.b_();
        f25156a = new f("PmCachedThreadScheduler", 5);
        b = new f("PmCachedWorkerPoolEvictor", 5);
        a aVar = new a(0L, null, f25156a);
        f = aVar;
        aVar.d();
    }

    public d() {
        this(f25156a);
    }

    public d(ThreadFactory threadFactory) {
        this.d = threadFactory;
        this.e = new AtomicReference<>(f);
        b();
    }

    @Override // tao.reactivex.k
    public k.c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k.c) ipChange.ipc$dispatch("96f4a96c", new Object[]{this}) : new b(this.e.get());
    }

    @Override // tao.reactivex.k
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a aVar = new a(60L, h, this.d);
        if (this.e.compareAndSet(f, aVar)) {
            return;
        }
        aVar.d();
    }
}
