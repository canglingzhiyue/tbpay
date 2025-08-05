package tao.reactivex.d.g;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mux;
import tb.muz;
import tb.nam;

/* loaded from: classes9.dex */
public final class e<T> implements tao.reactivex.d<T>, nam {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final muz<? super T> f25140a;
    public final boolean b;
    public nam c;
    public boolean d;
    public tao.reactivex.d.h.a<Object> e;
    public volatile boolean f;

    static {
        kge.a(-1471012171);
        kge.a(-605775865);
        kge.a(1964950430);
    }

    public e(muz<? super T> muzVar) {
        this(muzVar, false);
    }

    public e(muz<? super T> muzVar, boolean z) {
        this.f25140a = muzVar;
        this.b = z;
    }

    @Override // tb.nam
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c.a();
        }
    }

    @Override // tb.nam
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.c.a(j);
        }
    }

    public void b() {
        tao.reactivex.d.h.a<Object> aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
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
        } while (!aVar.a((muz<? super T>) this.f25140a));
    }

    @Override // tb.muz
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
                    this.f25140a.onComplete();
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

    @Override // tb.muz
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
                    this.f25140a.onError(th);
                }
            }
        }
    }

    @Override // tb.muz
    public void onNext(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
        } else if (this.f) {
        } else {
            if (t == null) {
                this.c.a();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (this.f) {
                    return;
                }
                if (!this.d) {
                    this.d = true;
                    this.f25140a.onNext(t);
                    b();
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

    @Override // tao.reactivex.d, tb.muz
    public void onSubscribe(nam namVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab33248", new Object[]{this, namVar});
        } else if (!g.a(this.c, namVar)) {
        } else {
            this.c = namVar;
            this.f25140a.onSubscribe(this);
        }
    }
}
