package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tao.reactivex.k;
import tb.jdz;
import tb.kge;
import tb.kgk;

/* loaded from: classes9.dex */
public final class b<T, U extends Collection<? super T>> extends tao.reactivex.d.e.b.a<T, U> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final long b;
    public final long c;
    public final TimeUnit d;
    public final tao.reactivex.k e;
    public final Callable<U> f;
    public final int g;
    public final boolean h;

    /* loaded from: classes9.dex */
    public static final class a<T, U extends Collection<? super T>> extends tao.reactivex.d.d.g<T, U, U> implements Runnable, jdz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Callable<U> g;
        public final long h;
        public final TimeUnit i;
        public final int j;
        public final boolean k;
        public final k.c l;
        public U m;
        public jdz n;
        public jdz o;
        public long p;
        public long q;

        static {
            kge.a(-1366829760);
            kge.a(-1390502639);
            kge.a(1964944663);
        }

        public a(tao.reactivex.j<? super U> jVar, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, k.c cVar) {
            super(jVar, new tao.reactivex.d.f.a());
            this.g = callable;
            this.h = j;
            this.i = timeUnit;
            this.j = i;
            this.k = z;
            this.l = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tao.reactivex.d.d.g, tao.reactivex.d.h.h
        public /* bridge */ /* synthetic */ void a(tao.reactivex.j jVar, Object obj) {
            a((tao.reactivex.j<? super tao.reactivex.j>) jVar, (tao.reactivex.j) ((Collection) obj));
        }

        public void a(tao.reactivex.j<? super U> jVar, U u) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38086fdd", new Object[]{this, jVar, u});
            } else {
                jVar.onNext(u);
            }
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
            } else if (this.c) {
            } else {
                this.c = true;
                this.o.b_();
                this.l.b_();
                synchronized (this) {
                    this.m = null;
                }
            }
        }

        @Override // tao.reactivex.j
        public void onComplete() {
            U u;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            this.l.b_();
            synchronized (this) {
                u = this.m;
                this.m = null;
            }
            this.b.a(u);
            this.d = true;
            if (!d()) {
                return;
            }
            tao.reactivex.d.d.f.a(this.b, this.f25098a, false, this, this);
        }

        @Override // tao.reactivex.j
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            synchronized (this) {
                this.m = null;
            }
            this.f25098a.onError(th);
            this.l.b_();
        }

        @Override // tao.reactivex.j
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
                return;
            }
            synchronized (this) {
                U u = this.m;
                if (u == null) {
                    return;
                }
                u.add(t);
                if (u.size() < this.j) {
                    return;
                }
                this.m = null;
                this.p++;
                if (this.k) {
                    this.n.b_();
                }
                b(u, false, this);
                try {
                    U u2 = (U) kgk.a(this.g.call(), "The buffer supplied is null");
                    synchronized (this) {
                        this.m = u2;
                        this.q++;
                    }
                    if (!this.k) {
                        return;
                    }
                    k.c cVar = this.l;
                    long j = this.h;
                    this.n = cVar.b(this, j, j, this.i);
                } catch (Throwable th) {
                    tao.reactivex.b.b.a(th);
                    this.f25098a.onError(th);
                    b_();
                }
            }
        }

        @Override // tao.reactivex.j
        public void onSubscribe(jdz jdzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("940fff22", new Object[]{this, jdzVar});
            } else if (!tao.reactivex.d.a.a.a(this.o, jdzVar)) {
            } else {
                this.o = jdzVar;
                try {
                    this.m = (U) kgk.a(this.g.call(), "The buffer supplied is null");
                    this.f25098a.onSubscribe(this);
                    k.c cVar = this.l;
                    long j = this.h;
                    this.n = cVar.b(this, j, j, this.i);
                } catch (Throwable th) {
                    tao.reactivex.b.b.a(th);
                    jdzVar.b_();
                    tao.reactivex.d.a.b.a(th, this.f25098a);
                    this.l.b_();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                U u = (U) kgk.a(this.g.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u2 = this.m;
                    if (u2 != null && this.p == this.q) {
                        this.m = u;
                        b(u2, false, this);
                    }
                }
            } catch (Throwable th) {
                tao.reactivex.b.b.a(th);
                b_();
                this.f25098a.onError(th);
            }
        }
    }

    /* renamed from: tao.reactivex.d.e.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class RunnableC1078b<T, U extends Collection<? super T>> extends tao.reactivex.d.d.g<T, U, U> implements Runnable, jdz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Callable<U> g;
        public final long h;
        public final TimeUnit i;
        public final tao.reactivex.k j;
        public jdz k;
        public U l;
        public final AtomicReference<jdz> m;

        static {
            kge.a(-1366829759);
            kge.a(-1390502639);
            kge.a(1964944663);
        }

        public RunnableC1078b(tao.reactivex.j<? super U> jVar, Callable<U> callable, long j, TimeUnit timeUnit, tao.reactivex.k kVar) {
            super(jVar, new tao.reactivex.d.f.a());
            this.m = new AtomicReference<>();
            this.g = callable;
            this.h = j;
            this.i = timeUnit;
            this.j = kVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tao.reactivex.d.d.g, tao.reactivex.d.h.h
        public /* bridge */ /* synthetic */ void a(tao.reactivex.j jVar, Object obj) {
            a((tao.reactivex.j<? super tao.reactivex.j>) jVar, (tao.reactivex.j) ((Collection) obj));
        }

        public void a(tao.reactivex.j<? super U> jVar, U u) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38086fdd", new Object[]{this, jVar, u});
            } else {
                this.f25098a.onNext(u);
            }
        }

        @Override // tb.jdz
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.m.get() == tao.reactivex.d.a.a.DISPOSED;
        }

        @Override // tb.jdz
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
                return;
            }
            tao.reactivex.d.a.a.a(this.m);
            this.k.b_();
        }

        @Override // tao.reactivex.j
        public void onComplete() {
            U u;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            synchronized (this) {
                u = this.l;
                this.l = null;
            }
            if (u != null) {
                this.b.a(u);
                this.d = true;
                if (d()) {
                    tao.reactivex.d.d.f.a(this.b, this.f25098a, false, null, this);
                }
            }
            tao.reactivex.d.a.a.a(this.m);
        }

        @Override // tao.reactivex.j
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            synchronized (this) {
                this.l = null;
            }
            this.f25098a.onError(th);
            tao.reactivex.d.a.a.a(this.m);
        }

        @Override // tao.reactivex.j
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
                return;
            }
            synchronized (this) {
                U u = this.l;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // tao.reactivex.j
        public void onSubscribe(jdz jdzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("940fff22", new Object[]{this, jdzVar});
            } else if (!tao.reactivex.d.a.a.a(this.k, jdzVar)) {
            } else {
                this.k = jdzVar;
                try {
                    this.l = (U) kgk.a(this.g.call(), "The buffer supplied is null");
                    this.f25098a.onSubscribe(this);
                    if (this.c) {
                        return;
                    }
                    tao.reactivex.k kVar = this.j;
                    long j = this.h;
                    jdz a2 = kVar.a(this, j, j, this.i);
                    if (this.m.compareAndSet(null, a2)) {
                        return;
                    }
                    a2.b_();
                } catch (Throwable th) {
                    tao.reactivex.b.b.a(th);
                    b_();
                    tao.reactivex.d.a.b.a(th, this.f25098a);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            U u;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                U u2 = (U) kgk.a(this.g.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    u = this.l;
                    if (u != null) {
                        this.l = u2;
                    }
                }
                if (u == null) {
                    tao.reactivex.d.a.a.a(this.m);
                } else {
                    a(u, false, this);
                }
            } catch (Throwable th) {
                tao.reactivex.b.b.a(th);
                this.f25098a.onError(th);
                b_();
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class c<T, U extends Collection<? super T>> extends tao.reactivex.d.d.g<T, U, U> implements Runnable, jdz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Callable<U> g;
        public final long h;
        public final long i;
        public final TimeUnit j;
        public final k.c k;
        public final List<U> l;
        public jdz m;

        /* loaded from: classes9.dex */
        public final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final U b;

            static {
                kge.a(736596351);
                kge.a(-1390502639);
            }

            public a(U u) {
                this.b = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (c.this) {
                    c.this.l.remove(this.b);
                }
                c cVar = c.this;
                c.a(cVar, this.b, false, cVar.k);
            }
        }

        /* renamed from: tao.reactivex.d.e.b.b$c$b  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public final class RunnableC1079b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final U b;

            static {
                kge.a(736596352);
                kge.a(-1390502639);
            }

            public RunnableC1079b(U u) {
                this.b = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (c.this) {
                    c.this.l.remove(this.b);
                }
                c cVar = c.this;
                c.b(cVar, this.b, false, cVar.k);
            }
        }

        static {
            kge.a(-1366829758);
            kge.a(-1390502639);
            kge.a(1964944663);
        }

        public c(tao.reactivex.j<? super U> jVar, Callable<U> callable, long j, long j2, TimeUnit timeUnit, k.c cVar) {
            super(jVar, new tao.reactivex.d.f.a());
            this.g = callable;
            this.h = j;
            this.i = j2;
            this.j = timeUnit;
            this.k = cVar;
            this.l = new LinkedList();
        }

        public static /* synthetic */ void a(c cVar, Object obj, boolean z, jdz jdzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbd1331", new Object[]{cVar, obj, new Boolean(z), jdzVar});
            } else {
                cVar.b(obj, z, jdzVar);
            }
        }

        public static /* synthetic */ void b(c cVar, Object obj, boolean z, jdz jdzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35511c32", new Object[]{cVar, obj, new Boolean(z), jdzVar});
            } else {
                cVar.b(obj, z, jdzVar);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tao.reactivex.d.d.g, tao.reactivex.d.h.h
        public /* bridge */ /* synthetic */ void a(tao.reactivex.j jVar, Object obj) {
            a((tao.reactivex.j<? super tao.reactivex.j>) jVar, (tao.reactivex.j) ((Collection) obj));
        }

        public void a(tao.reactivex.j<? super U> jVar, U u) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38086fdd", new Object[]{this, jVar, u});
            } else {
                jVar.onNext(u);
            }
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
            } else if (this.c) {
            } else {
                this.c = true;
                f();
                this.m.b_();
                this.k.b_();
            }
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
                return;
            }
            synchronized (this) {
                this.l.clear();
            }
        }

        @Override // tao.reactivex.j
        public void onComplete() {
            ArrayList<Collection> arrayList;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            synchronized (this) {
                arrayList = new ArrayList(this.l);
                this.l.clear();
            }
            for (Collection collection : arrayList) {
                this.b.a(collection);
            }
            this.d = true;
            if (!d()) {
                return;
            }
            tao.reactivex.d.d.f.a(this.b, this.f25098a, false, this.k, this);
        }

        @Override // tao.reactivex.j
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            this.d = true;
            f();
            this.f25098a.onError(th);
            this.k.b_();
        }

        @Override // tao.reactivex.j
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
                return;
            }
            synchronized (this) {
                for (U u : this.l) {
                    u.add(t);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tao.reactivex.j
        public void onSubscribe(jdz jdzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("940fff22", new Object[]{this, jdzVar});
            } else if (!tao.reactivex.d.a.a.a(this.m, jdzVar)) {
            } else {
                this.m = jdzVar;
                try {
                    Collection collection = (Collection) kgk.a(this.g.call(), "The buffer supplied is null");
                    this.l.add(collection);
                    this.f25098a.onSubscribe(this);
                    k.c cVar = this.k;
                    long j = this.i;
                    cVar.b(this, j, j, this.j);
                    this.k.a(new RunnableC1079b(collection), this.h, this.j);
                } catch (Throwable th) {
                    tao.reactivex.b.b.a(th);
                    jdzVar.b_();
                    tao.reactivex.d.a.b.a(th, this.f25098a);
                    this.k.b_();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.c) {
            } else {
                try {
                    Collection collection = (Collection) kgk.a(this.g.call(), "The bufferSupplier returned a null buffer");
                    synchronized (this) {
                        if (this.c) {
                            return;
                        }
                        this.l.add(collection);
                        this.k.a(new a(collection), this.h, this.j);
                    }
                } catch (Throwable th) {
                    tao.reactivex.b.b.a(th);
                    this.f25098a.onError(th);
                    b_();
                }
            }
        }
    }

    static {
        kge.a(-600304317);
    }

    public b(tao.reactivex.h<T> hVar, long j, long j2, TimeUnit timeUnit, tao.reactivex.k kVar, Callable<U> callable, int i, boolean z) {
        super(hVar);
        this.b = j;
        this.c = j2;
        this.d = timeUnit;
        this.e = kVar;
        this.f = callable;
        this.g = i;
        this.h = z;
    }

    @Override // tao.reactivex.e
    public void a(tao.reactivex.j<? super U> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac18b2c", new Object[]{this, jVar});
        } else if (this.b == this.c && this.g == Integer.MAX_VALUE) {
            this.f25109a.b(new RunnableC1078b(new tao.reactivex.d.d.k(jVar), this.f, this.b, this.d, this.e));
        } else {
            k.c a2 = this.e.a();
            if (this.b == this.c) {
                this.f25109a.b(new a(new tao.reactivex.d.d.k(jVar), this.f, this.b, this.d, this.g, this.h, a2));
            } else {
                this.f25109a.b(new c(new tao.reactivex.d.d.k(jVar), this.f, this.b, this.c, this.d, a2));
            }
        }
    }
}
