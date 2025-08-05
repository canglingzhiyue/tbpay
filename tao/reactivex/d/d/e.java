package tao.reactivex.d.d;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.jdz;
import tb.jev;
import tb.jew;
import tb.kge;
import tb.mux;

/* loaded from: classes9.dex */
public final class e<T> extends AtomicReference<jdz> implements tao.reactivex.j<T>, jdz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final jew<? super T> f25097a;
    public final jew<? super Throwable> b;
    public final jev c;
    public final jew<? super jdz> d;

    static {
        kge.a(-1471015054);
        kge.a(1964944663);
        kge.a(-605775859);
    }

    public e(jew<? super T> jewVar, jew<? super Throwable> jewVar2, jev jevVar, jew<? super jdz> jewVar3) {
        this.f25097a = jewVar;
        this.b = jewVar2;
        this.c = jevVar;
        this.d = jewVar3;
    }

    @Override // tb.jdz
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : get() == tao.reactivex.d.a.a.DISPOSED;
    }

    @Override // tb.jdz
    public void b_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
        } else {
            tao.reactivex.d.a.a.a((AtomicReference<jdz>) this);
        }
    }

    @Override // tao.reactivex.j
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
        } else if (b()) {
        } else {
            lazySet(tao.reactivex.d.a.a.DISPOSED);
        }
    }

    @Override // tao.reactivex.j
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
        } else if (b()) {
        } else {
            lazySet(tao.reactivex.d.a.a.DISPOSED);
            try {
                this.b.accept(th);
            } catch (Throwable th2) {
                tao.reactivex.b.b.a(th2);
                mux.a(new tao.reactivex.b.a(th, th2));
            }
        }
    }

    @Override // tao.reactivex.j
    public void onNext(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
        } else if (b()) {
        } else {
            try {
                this.f25097a.accept(t);
            } catch (Throwable th) {
                tao.reactivex.b.b.a(th);
                get().b_();
                onError(th);
            }
        }
    }

    @Override // tao.reactivex.j
    public void onSubscribe(jdz jdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940fff22", new Object[]{this, jdzVar});
        } else if (!tao.reactivex.d.a.a.b(this, jdzVar)) {
        } else {
            try {
                this.d.accept(this);
            } catch (Throwable th) {
                tao.reactivex.b.b.a(th);
                jdzVar.b_();
                onError(th);
            }
        }
    }
}
