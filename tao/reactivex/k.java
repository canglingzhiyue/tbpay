package tao.reactivex;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import tb.jdz;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long g;

    /* loaded from: classes9.dex */
    public static final class a implements Runnable, jdz {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f25168a;
        public final c b;
        public Thread c;

        static {
            kge.a(1964953931);
            kge.a(-1390502639);
            kge.a(1964944663);
        }

        public a(Runnable runnable, c cVar) {
            this.f25168a = runnable;
            this.b = cVar;
        }

        @Override // tb.jdz
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b.b();
        }

        @Override // tb.jdz
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
                return;
            }
            if (this.c == Thread.currentThread()) {
                c cVar = this.b;
                if (cVar instanceof tao.reactivex.f.e) {
                    ((tao.reactivex.f.e) cVar).c();
                    return;
                }
            }
            this.b.b_();
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.c = Thread.currentThread();
            try {
                this.f25168a.run();
            } finally {
                b_();
                this.c = null;
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class b implements Runnable, jdz {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f25169a;
        public final c b;
        public volatile boolean c;

        static {
            kge.a(1964953932);
            kge.a(-1390502639);
            kge.a(1964944663);
        }

        public b(Runnable runnable, c cVar) {
            this.f25169a = runnable;
            this.b = cVar;
        }

        @Override // tb.jdz
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c;
        }

        @Override // tb.jdz
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
                return;
            }
            this.c = true;
            this.b.b_();
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.c) {
            } else {
                try {
                    this.f25169a.run();
                } catch (Throwable th) {
                    tao.reactivex.b.b.a(th);
                    this.b.b_();
                    throw tao.reactivex.d.h.e.a(th);
                }
            }
        }
    }

    /* loaded from: classes9.dex */
    public static abstract class c implements jdz {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes9.dex */
        public final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final Runnable f25170a;
            public final tao.reactivex.d.a.d b;
            public final long c;
            public long d;
            public long e;
            public long f;

            static {
                kge.a(-1464879414);
                kge.a(-1390502639);
            }

            public a(long j, Runnable runnable, long j2, tao.reactivex.d.a.d dVar, long j3) {
                this.f25170a = runnable;
                this.b = dVar;
                this.c = j3;
                this.e = j2;
                this.f = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                long j;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                this.f25170a.run();
                if (this.b.b()) {
                    return;
                }
                long a2 = c.this.a(TimeUnit.NANOSECONDS);
                long j2 = this.e;
                if (k.g + a2 < j2 || a2 >= j2 + this.c + k.g) {
                    long j3 = this.c;
                    long j4 = a2 + j3;
                    long j5 = this.d + 1;
                    this.d = j5;
                    this.f = j4 - (j3 * j5);
                    j = j4;
                } else {
                    long j6 = this.f;
                    long j7 = this.d + 1;
                    this.d = j7;
                    j = j6 + (j7 * this.c);
                }
                this.e = a2;
                this.b.b(c.this.a(this, j - a2, TimeUnit.NANOSECONDS));
            }
        }

        static {
            kge.a(1964953933);
            kge.a(1964944663);
        }

        public long a(TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("594d62c4", new Object[]{this, timeUnit})).longValue() : timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public jdz a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (jdz) ipChange.ipc$dispatch("c44f0a60", new Object[]{this, runnable}) : a(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract jdz a(Runnable runnable, long j, TimeUnit timeUnit);

        public jdz b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jdz) ipChange.ipc$dispatch("ac84a635", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
            }
            tao.reactivex.d.a.d dVar = new tao.reactivex.d.a.d();
            tao.reactivex.d.a.d dVar2 = new tao.reactivex.d.a.d(dVar);
            long nanos = timeUnit.toNanos(j2);
            long a2 = a(TimeUnit.NANOSECONDS);
            jdz a3 = a(new a(a2 + timeUnit.toNanos(j), runnable, a2, dVar2, nanos), j, timeUnit);
            if (a3 == tao.reactivex.d.a.b.INSTANCE) {
                return a3;
            }
            dVar.b(a3);
            return dVar2;
        }
    }

    static {
        kge.a(-605775858);
        g = TimeUnit.MINUTES.toNanos(15L);
    }

    public abstract c a();

    public jdz a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jdz) ipChange.ipc$dispatch("c44f0a60", new Object[]{this, runnable}) : a(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public jdz a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdz) ipChange.ipc$dispatch("5ec52e34", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        c a2 = a();
        b bVar = new b(runnable, a2);
        jdz b2 = a2.b(bVar, j, j2, timeUnit);
        return b2 == tao.reactivex.d.a.b.INSTANCE ? b2 : bVar;
    }

    public jdz a(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdz) ipChange.ipc$dispatch("50795aec", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        c a2 = a();
        a aVar = new a(runnable, a2);
        a2.a(aVar, j, timeUnit);
        return aVar;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }
}
