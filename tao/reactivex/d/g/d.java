package tao.reactivex.d.g;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.jdz;
import tb.jev;
import tb.jew;
import tb.kge;
import tb.mux;
import tb.nam;

/* loaded from: classes9.dex */
public final class d<T> extends AtomicReference<nam> implements tao.reactivex.d<T>, jdz, nam {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final jew<? super T> f25139a;
    public final jew<? super Throwable> b;
    public final jev c;
    public final jew<? super nam> d;

    static {
        kge.a(-1471012172);
        kge.a(1964944663);
        kge.a(-605775865);
        kge.a(1964950430);
    }

    public d(jew<? super T> jewVar, jew<? super Throwable> jewVar2, jev jevVar, jew<? super nam> jewVar3) {
        this.f25139a = jewVar;
        this.b = jewVar2;
        this.c = jevVar;
        this.d = jewVar3;
    }

    @Override // tb.nam
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            g.a(this);
        }
    }

    @Override // tb.nam
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            get().a(j);
        }
    }

    @Override // tb.jdz
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : get() == g.CANCELLED;
    }

    @Override // tb.jdz
    public void b_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
        } else {
            a();
        }
    }

    @Override // tb.muz
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
        } else if (get() == g.CANCELLED) {
        } else {
            lazySet(g.CANCELLED);
        }
    }

    @Override // tb.muz
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
        } else if (get() == g.CANCELLED) {
            mux.a(th);
        } else {
            lazySet(g.CANCELLED);
            try {
                this.b.accept(th);
            } catch (Throwable th2) {
                tao.reactivex.b.b.a(th2);
                mux.a(new tao.reactivex.b.a(th, th2));
            }
        }
    }

    @Override // tb.muz
    public void onNext(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
        } else if (b()) {
        } else {
            try {
                this.f25139a.accept(t);
            } catch (Throwable th) {
                tao.reactivex.b.b.a(th);
                get().a();
                onError(th);
            }
        }
    }

    @Override // tao.reactivex.d, tb.muz
    public void onSubscribe(nam namVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab33248", new Object[]{this, namVar});
        } else if (!g.a((AtomicReference<nam>) this, namVar)) {
        } else {
            try {
                this.d.accept(this);
            } catch (Throwable th) {
                tao.reactivex.b.b.a(th);
                namVar.a();
                onError(th);
            }
        }
    }
}
