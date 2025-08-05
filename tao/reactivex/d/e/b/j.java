package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import tb.jdz;
import tb.jgn;
import tb.kge;
import tb.kgk;
import tb.khl;
import tb.mup;
import tb.muw;
import tb.mux;

/* loaded from: classes9.dex */
public final class j<T, U> extends tao.reactivex.d.e.b.a<T, U> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final jgn<? super T, ? extends tao.reactivex.h<? extends U>> b;
    public final boolean c;
    public final int d;
    public final int e;

    /* loaded from: classes9.dex */
    public static final class a<T, U> extends AtomicReference<jdz> implements tao.reactivex.j<U> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final long f25120a;
        public final b<T, U> b;
        public volatile boolean c;
        public volatile muw<U> d;
        public int e;

        static {
            kge.a(-1366822072);
            kge.a(-605775859);
        }

        public a(b<T, U> bVar, long j) {
            this.f25120a = j;
            this.b = bVar;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                tao.reactivex.d.a.a.a(this);
            }
        }

        @Override // tao.reactivex.j
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            this.c = true;
            this.b.c();
        }

        @Override // tao.reactivex.j
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else if (!this.b.h.a(th)) {
                mux.a(th);
            } else {
                if (!this.b.c) {
                    this.b.f();
                }
                this.c = true;
                this.b.c();
            }
        }

        @Override // tao.reactivex.j
        public void onNext(U u) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, u});
            } else if (this.e == 0) {
                this.b.a(u, this);
            } else {
                this.b.c();
            }
        }

        @Override // tao.reactivex.j
        public void onSubscribe(jdz jdzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("940fff22", new Object[]{this, jdzVar});
            } else if (!tao.reactivex.d.a.a.b(this, jdzVar) || !(jdzVar instanceof khl)) {
            } else {
                khl khlVar = (khl) jdzVar;
                int a2 = khlVar.a(7);
                if (a2 == 1) {
                    this.e = a2;
                    this.d = khlVar;
                    this.c = true;
                    this.b.c();
                } else if (a2 != 2) {
                } else {
                    this.e = a2;
                    this.d = khlVar;
                }
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class b<T, U> extends AtomicInteger implements tao.reactivex.j<T>, jdz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a<?, ?>[] k;
        public static final a<?, ?>[] l;

        /* renamed from: a  reason: collision with root package name */
        public final tao.reactivex.j<? super U> f25121a;
        public final jgn<? super T, ? extends tao.reactivex.h<? extends U>> b;
        public final boolean c;
        public final int d;
        public final int e;
        public volatile mup<U> f;
        public volatile boolean g;
        public final tao.reactivex.d.h.c h = new tao.reactivex.d.h.c();
        public volatile boolean i;
        public final AtomicReference<a<?, ?>[]> j;
        public jdz m;
        public long n;
        public long o;
        public int p;
        public Queue<tao.reactivex.h<? extends U>> q;
        public int r;

        static {
            kge.a(-1366822071);
            kge.a(1964944663);
            kge.a(-605775859);
            k = new a[0];
            l = new a[0];
        }

        public b(tao.reactivex.j<? super U> jVar, jgn<? super T, ? extends tao.reactivex.h<? extends U>> jgnVar, boolean z, int i, int i2) {
            this.f25121a = jVar;
            this.b = jgnVar;
            this.c = z;
            this.d = i;
            this.e = i2;
            if (i != Integer.MAX_VALUE) {
                this.q = new ArrayDeque(i);
            }
            this.j = new AtomicReference<>(k);
        }

        public void a(U u, a<T, U> aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78d16ab5", new Object[]{this, u, aVar});
                return;
            }
            if (get() != 0 || !compareAndSet(0, 1)) {
                muw muwVar = aVar.d;
                if (muwVar == null) {
                    muwVar = new tao.reactivex.d.f.c(this.e);
                    aVar.d = muwVar;
                }
                muwVar.a(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                this.f25121a.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            d();
        }

        public void a(Callable<? extends U> callable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d29daa9", new Object[]{this, callable});
                return;
            }
            try {
                U call = callable.call();
                if (call == null) {
                    return;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    mup<U> mupVar = this.f;
                    if (mupVar == null) {
                        int i = this.d;
                        mupVar = i == Integer.MAX_VALUE ? new tao.reactivex.d.f.c<>(this.e) : new tao.reactivex.d.f.b(i);
                        this.f = mupVar;
                    }
                    if (!mupVar.a(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    } else if (getAndIncrement() != 0) {
                        return;
                    }
                } else {
                    this.f25121a.onNext(call);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                d();
            } catch (Throwable th) {
                tao.reactivex.b.b.a(th);
                this.h.a(th);
                c();
            }
        }

        public void a(tao.reactivex.h<? extends U> hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aac0a26e", new Object[]{this, hVar});
                return;
            }
            while (hVar instanceof Callable) {
                a((Callable) hVar);
                if (this.d == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    hVar = this.q.poll();
                    if (hVar == null) {
                        this.r--;
                        return;
                    }
                }
            }
            long j = this.n;
            this.n = 1 + j;
            a<T, U> aVar = new a<>(this, j);
            if (!a(aVar)) {
                return;
            }
            hVar.b(aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean a(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b1330115", new Object[]{this, aVar})).booleanValue();
            }
            do {
                aVarArr = this.j.get();
                if (aVarArr == l) {
                    aVar.a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.j.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        public void b(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1dfacb0", new Object[]{this, aVar});
                return;
            }
            do {
                aVarArr = this.j.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = k;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                    System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!this.j.compareAndSet(aVarArr, aVarArr2));
        }

        @Override // tb.jdz
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.i;
        }

        @Override // tb.jdz
        public void b_() {
            Throwable a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else if (this.i) {
            } else {
                this.i = true;
                if (!f() || (a2 = this.h.a()) == null || a2 == tao.reactivex.d.h.e.f25145a) {
                    return;
                }
                mux.a(a2);
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (getAndIncrement() != 0) {
            } else {
                d();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:65:0x00b9, code lost:
            if (r11 == null) goto L63;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d() {
            /*
                Method dump skipped, instructions count: 303
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tao.reactivex.d.e.b.j.b.d():void");
        }

        public boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
            }
            if (this.i) {
                return true;
            }
            Throwable th = this.h.get();
            if (this.c || th == null) {
                return false;
            }
            f();
            Throwable a2 = this.h.a();
            if (a2 != tao.reactivex.d.h.e.f25145a) {
                this.f25121a.onError(a2);
            }
            return true;
        }

        public boolean f() {
            a<?, ?>[] andSet;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
            }
            this.m.b_();
            a<?, ?>[] aVarArr = this.j.get();
            a<?, ?>[] aVarArr2 = l;
            if (aVarArr == aVarArr2 || (andSet = this.j.getAndSet(aVarArr2)) == l) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.a();
            }
            return true;
        }

        @Override // tao.reactivex.j
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            } else if (this.g) {
            } else {
                this.g = true;
                c();
            }
        }

        @Override // tao.reactivex.j
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else if (this.g) {
                mux.a(th);
            } else if (!this.h.a(th)) {
                mux.a(th);
            } else {
                this.g = true;
                c();
            }
        }

        @Override // tao.reactivex.j
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (this.g) {
            } else {
                try {
                    tao.reactivex.h<? extends U> hVar = (tao.reactivex.h) kgk.a(this.b.apply(t), "The mapper returned a null ObservableSource");
                    if (this.d != Integer.MAX_VALUE) {
                        synchronized (this) {
                            if (this.r == this.d) {
                                this.q.offer(hVar);
                                return;
                            }
                            this.r++;
                        }
                    }
                    a(hVar);
                } catch (Throwable th) {
                    tao.reactivex.b.b.a(th);
                    this.m.b_();
                    onError(th);
                }
            }
        }

        @Override // tao.reactivex.j
        public void onSubscribe(jdz jdzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("940fff22", new Object[]{this, jdzVar});
            } else if (!tao.reactivex.d.a.a.a(this.m, jdzVar)) {
            } else {
                this.m = jdzVar;
                this.f25121a.onSubscribe(this);
            }
        }
    }

    static {
        kge.a(-600304309);
    }

    public j(tao.reactivex.h<T> hVar, jgn<? super T, ? extends tao.reactivex.h<? extends U>> jgnVar, boolean z, int i, int i2) {
        super(hVar);
        this.b = jgnVar;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    @Override // tao.reactivex.e
    public void a(tao.reactivex.j<? super U> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac18b2c", new Object[]{this, jVar});
        } else if (q.a(this.f25109a, jVar, this.b)) {
        } else {
            this.f25109a.b(new b(jVar, this.b, this.c, this.d, this.e));
        }
    }
}
