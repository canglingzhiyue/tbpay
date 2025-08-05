package tao.reactivex.d.d;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jdz;
import tb.kge;
import tb.mux;

/* loaded from: classes9.dex */
public final class k<T> implements tao.reactivex.j<T>, jdz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final tao.reactivex.j<? super T> f25099a;
    public final boolean b;
    public jdz c;
    public boolean d;
    public tao.reactivex.d.h.a<Object> e;
    public volatile boolean f;

    static {
        kge.a(-1471015048);
        kge.a(1964944663);
        kge.a(-605775859);
    }

    public k(tao.reactivex.j<? super T> jVar) {
        this(jVar, false);
    }

    public k(tao.reactivex.j<? super T> jVar, boolean z) {
        this.f25099a = jVar;
        this.b = z;
    }

    public void a() {
        tao.reactivex.d.h.a<Object> aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        do {
            synchronized (this) {
                aVar = this.e;
                if (aVar == null) {
                    this.d = false;
                    return;
                }
                this.e = null;
            }
        } while (!aVar.a((tao.reactivex.j<? super T>) this.f25099a));
    }

    @Override // tb.jdz
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c.b();
    }

    @Override // tb.jdz
    public void b_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
        } else {
            this.c.b_();
        }
    }

    @Override // tao.reactivex.j
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
        } else if (this.f) {
        } else {
            synchronized (this) {
                if (this.f) {
                    return;
                }
                if (!this.d) {
                    this.f = true;
                    this.d = true;
                    this.f25099a.onComplete();
                    return;
                }
                tao.reactivex.d.h.a<Object> aVar = this.e;
                if (aVar == null) {
                    aVar = new tao.reactivex.d.h.a<>(4);
                    this.e = aVar;
                }
                aVar.a((tao.reactivex.d.h.a<Object>) tao.reactivex.d.h.g.a());
            }
        }
    }

    @Override // tao.reactivex.j
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
        } else if (this.f) {
            mux.a(th);
        } else {
            synchronized (this) {
                if (this.f) {
                    z = true;
                } else if (this.d) {
                    this.f = true;
                    tao.reactivex.d.h.a<Object> aVar = this.e;
                    if (aVar == null) {
                        aVar = new tao.reactivex.d.h.a<>(4);
                        this.e = aVar;
                    }
                    Object a2 = tao.reactivex.d.h.g.a(th);
                    if (this.b) {
                        aVar.a((tao.reactivex.d.h.a<Object>) a2);
                    } else {
                        aVar.b(a2);
                    }
                    return;
                } else {
                    this.f = true;
                    this.d = true;
                }
                if (z) {
                    mux.a(th);
                } else {
                    this.f25099a.onError(th);
                }
            }
        }
    }

    @Override // tao.reactivex.j
    public void onNext(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
        } else if (this.f) {
        } else {
            if (t == null) {
                this.c.b_();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (this.f) {
                    return;
                }
                if (!this.d) {
                    this.d = true;
                    this.f25099a.onNext(t);
                    a();
                    return;
                }
                tao.reactivex.d.h.a<Object> aVar = this.e;
                if (aVar == null) {
                    aVar = new tao.reactivex.d.h.a<>(4);
                    this.e = aVar;
                }
                aVar.a((tao.reactivex.d.h.a<Object>) tao.reactivex.d.h.g.a(t));
            }
        }
    }

    @Override // tao.reactivex.j
    public void onSubscribe(jdz jdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940fff22", new Object[]{this, jdzVar});
        } else if (!tao.reactivex.d.a.a.a(this.c, jdzVar)) {
        } else {
            this.c = jdzVar;
            this.f25099a.onSubscribe(this);
        }
    }
}
