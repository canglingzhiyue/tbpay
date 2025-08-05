package tao.reactivex.h;

import com.android.alibaba.ip.runtime.IpChange;
import tao.reactivex.d.h.a;
import tao.reactivex.d.h.g;
import tao.reactivex.j;
import tb.jdz;
import tb.kge;
import tb.mux;

/* loaded from: classes9.dex */
public final class b<T> extends c<T> implements a.InterfaceC1082a<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final c<T> f25167a;
    public boolean b;
    public tao.reactivex.d.h.a<Object> c;
    public volatile boolean d;

    static {
        kge.a(1964951390);
        kge.a(-597535057);
    }

    public b(c<T> cVar) {
        this.f25167a = cVar;
    }

    @Override // tao.reactivex.e
    public void a(j<? super T> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac18b2c", new Object[]{this, jVar});
        } else {
            this.f25167a.b(jVar);
        }
    }

    public void c() {
        tao.reactivex.d.h.a<Object> aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        while (true) {
            synchronized (this) {
                aVar = this.c;
                if (aVar == null) {
                    this.b = false;
                    return;
                }
                this.c = null;
            }
            aVar.a((a.InterfaceC1082a<? super Object>) this);
        }
    }

    @Override // tao.reactivex.j
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
        } else if (this.d) {
        } else {
            synchronized (this) {
                if (this.d) {
                    return;
                }
                this.d = true;
                if (!this.b) {
                    this.b = true;
                    this.f25167a.onComplete();
                    return;
                }
                tao.reactivex.d.h.a<Object> aVar = this.c;
                if (aVar == null) {
                    aVar = new tao.reactivex.d.h.a<>(4);
                    this.c = aVar;
                }
                aVar.a((tao.reactivex.d.h.a<Object>) g.a());
            }
        }
    }

    @Override // tao.reactivex.j
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
        } else if (this.d) {
            mux.a(th);
        } else {
            synchronized (this) {
                if (this.d) {
                    z = true;
                } else {
                    this.d = true;
                    if (this.b) {
                        tao.reactivex.d.h.a<Object> aVar = this.c;
                        if (aVar == null) {
                            aVar = new tao.reactivex.d.h.a<>(4);
                            this.c = aVar;
                        }
                        aVar.b(g.a(th));
                        return;
                    }
                    this.b = true;
                }
                if (z) {
                    mux.a(th);
                } else {
                    this.f25167a.onError(th);
                }
            }
        }
    }

    @Override // tao.reactivex.j
    public void onNext(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
        } else if (this.d) {
        } else {
            synchronized (this) {
                if (this.d) {
                    return;
                }
                if (!this.b) {
                    this.b = true;
                    this.f25167a.onNext(t);
                    c();
                    return;
                }
                tao.reactivex.d.h.a<Object> aVar = this.c;
                if (aVar == null) {
                    aVar = new tao.reactivex.d.h.a<>(4);
                    this.c = aVar;
                }
                aVar.a((tao.reactivex.d.h.a<Object>) g.a(t));
            }
        }
    }

    @Override // tao.reactivex.j
    public void onSubscribe(jdz jdzVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940fff22", new Object[]{this, jdzVar});
            return;
        }
        if (!this.d) {
            synchronized (this) {
                if (!this.d) {
                    if (this.b) {
                        tao.reactivex.d.h.a<Object> aVar = this.c;
                        if (aVar == null) {
                            aVar = new tao.reactivex.d.h.a<>(4);
                            this.c = aVar;
                        }
                        aVar.a((tao.reactivex.d.h.a<Object>) g.a(jdzVar));
                        return;
                    }
                    this.b = true;
                    z = false;
                }
            }
        }
        if (z) {
            jdzVar.b_();
            return;
        }
        this.f25167a.onSubscribe(jdzVar);
        c();
    }

    @Override // tao.reactivex.d.h.a.InterfaceC1082a, tb.jrg
    public boolean test(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a0eabb9", new Object[]{this, obj})).booleanValue() : g.a(obj, this.f25167a);
    }
}
