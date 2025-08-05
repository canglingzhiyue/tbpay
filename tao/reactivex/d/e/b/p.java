package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.IpChange;
import tao.reactivex.k;
import tb.jdz;
import tb.kge;
import tb.khl;
import tb.muw;
import tb.mux;

/* loaded from: classes9.dex */
public final class p<T> extends tao.reactivex.d.e.b.a<T, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final tao.reactivex.k b;
    public final boolean c;
    public final int d;

    /* loaded from: classes9.dex */
    public static final class a<T> extends tao.reactivex.d.d.b<T> implements Runnable, tao.reactivex.j<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final tao.reactivex.j<? super T> f25128a;
        public final k.c b;
        public final boolean c;
        public final int d;
        public muw<T> e;
        public jdz f;
        public Throwable g;
        public volatile boolean h;
        public volatile boolean i;
        public int j;
        public boolean k;

        static {
            kge.a(-1366816306);
            kge.a(-1390502639);
            kge.a(-605775859);
        }

        public a(tao.reactivex.j<? super T> jVar, k.c cVar, boolean z, int i) {
            this.f25128a = jVar;
            this.b = cVar;
            this.c = z;
            this.d = i;
        }

        @Override // tb.miv
        public int a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
            }
            if ((i & 2) == 0) {
                return 0;
            }
            this.k = true;
            return 2;
        }

        public boolean a(boolean z, boolean z2, tao.reactivex.j<? super T> jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f061bab0", new Object[]{this, new Boolean(z), new Boolean(z2), jVar})).booleanValue();
            }
            if (this.i) {
                this.e.e();
                return true;
            }
            if (z) {
                Throwable th = this.g;
                if (this.c) {
                    if (z2) {
                        if (th != null) {
                            jVar.onError(th);
                        } else {
                            jVar.onComplete();
                        }
                        this.b.b_();
                        return true;
                    }
                } else if (th != null) {
                    this.e.e();
                    jVar.onError(th);
                    this.b.b_();
                    return true;
                } else if (z2) {
                    jVar.onComplete();
                    this.b.b_();
                    return true;
                }
            }
            return false;
        }

        @Override // tb.jdz
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.i;
        }

        @Override // tb.jdz
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else if (this.i) {
            } else {
                this.i = true;
                this.f.b_();
                this.b.b_();
                if (getAndIncrement() != 0) {
                    return;
                }
                this.e.e();
            }
        }

        @Override // tb.muw
        public T c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this}) : this.e.c();
        }

        @Override // tb.muw
        public boolean d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.e.d();
        }

        @Override // tb.muw
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else {
                this.e.e();
            }
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            } else if (getAndIncrement() != 0) {
            } else {
                this.b.a(this);
            }
        }

        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
                return;
            }
            muw<T> muwVar = this.e;
            tao.reactivex.j<? super T> jVar = this.f25128a;
            int i = 1;
            while (!a(this.h, muwVar.d(), jVar)) {
                while (true) {
                    boolean z = this.h;
                    try {
                        Object obj = (T) muwVar.c();
                        boolean z2 = obj == null;
                        if (a(z, z2, jVar)) {
                            return;
                        }
                        if (!z2) {
                            jVar.onNext(obj);
                        } else {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        tao.reactivex.b.b.a(th);
                        this.f.b_();
                        muwVar.e();
                        jVar.onError(th);
                        this.b.b_();
                        return;
                    }
                }
            }
        }

        public void h() {
            IpChange ipChange = $ipChange;
            int i = 1;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
                return;
            }
            while (!this.i) {
                boolean z = this.h;
                Throwable th = this.g;
                if (!this.c && z && th != null) {
                    this.f25128a.onError(th);
                    this.b.b_();
                    return;
                }
                this.f25128a.onNext(null);
                if (z) {
                    Throwable th2 = this.g;
                    if (th2 != null) {
                        this.f25128a.onError(th2);
                    } else {
                        this.f25128a.onComplete();
                    }
                    this.b.b_();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // tao.reactivex.j
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            } else if (this.h) {
            } else {
                this.h = true;
                f();
            }
        }

        @Override // tao.reactivex.j
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else if (this.h) {
                mux.a(th);
            } else {
                this.g = th;
                this.h = true;
                f();
            }
        }

        @Override // tao.reactivex.j
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (this.h) {
            } else {
                if (this.j != 2) {
                    this.e.a(t);
                }
                f();
            }
        }

        @Override // tao.reactivex.j
        public void onSubscribe(jdz jdzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("940fff22", new Object[]{this, jdzVar});
            } else if (!tao.reactivex.d.a.a.a(this.f, jdzVar)) {
            } else {
                this.f = jdzVar;
                if (jdzVar instanceof khl) {
                    khl khlVar = (khl) jdzVar;
                    int a2 = khlVar.a(7);
                    if (a2 == 1) {
                        this.j = a2;
                        this.e = khlVar;
                        this.h = true;
                        this.f25128a.onSubscribe(this);
                        f();
                        return;
                    } else if (a2 == 2) {
                        this.j = a2;
                        this.e = khlVar;
                        this.f25128a.onSubscribe(this);
                        return;
                    }
                }
                this.e = new tao.reactivex.d.f.c(this.d);
                this.f25128a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.k) {
                h();
            } else {
                g();
            }
        }
    }

    static {
        kge.a(-600304303);
    }

    public p(tao.reactivex.h<T> hVar, tao.reactivex.k kVar, boolean z, int i) {
        super(hVar);
        this.b = kVar;
        this.c = z;
        this.d = i;
    }

    @Override // tao.reactivex.e
    public void a(tao.reactivex.j<? super T> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac18b2c", new Object[]{this, jVar});
        } else {
            this.f25109a.b(new a(jVar, this.b.a(), this.c, this.d));
        }
    }
}
