package tao.reactivex.d.d;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jdz;
import tb.jev;
import tb.jew;
import tb.kge;
import tb.mux;

/* loaded from: classes9.dex */
public final class d<T> implements tao.reactivex.j<T>, jdz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final tao.reactivex.j<? super T> f25096a;
    public final jew<? super jdz> b;
    public final jev c;
    public jdz d;

    static {
        kge.a(-1471015055);
        kge.a(1964944663);
        kge.a(-605775859);
    }

    public d(tao.reactivex.j<? super T> jVar, jew<? super jdz> jewVar, jev jevVar) {
        this.f25096a = jVar;
        this.b = jewVar;
        this.c = jevVar;
    }

    @Override // tb.jdz
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.d.b();
    }

    @Override // tb.jdz
    public void b_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
        } else {
            this.d.b_();
        }
    }

    @Override // tao.reactivex.j
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
        } else if (this.d == tao.reactivex.d.a.a.DISPOSED) {
        } else {
            this.f25096a.onComplete();
        }
    }

    @Override // tao.reactivex.j
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
        } else if (this.d != tao.reactivex.d.a.a.DISPOSED) {
            this.f25096a.onError(th);
        } else {
            mux.a(th);
        }
    }

    @Override // tao.reactivex.j
    public void onNext(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
        } else {
            this.f25096a.onNext(t);
        }
    }

    @Override // tao.reactivex.j
    public void onSubscribe(jdz jdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940fff22", new Object[]{this, jdzVar});
            return;
        }
        try {
            this.b.accept(jdzVar);
            if (!tao.reactivex.d.a.a.a(this.d, jdzVar)) {
                return;
            }
            this.d = jdzVar;
            this.f25096a.onSubscribe(this);
        } catch (Throwable th) {
            tao.reactivex.b.b.a(th);
            jdzVar.b_();
            this.d = tao.reactivex.d.a.a.DISPOSED;
            tao.reactivex.d.a.b.a(th, this.f25096a);
        }
    }
}
