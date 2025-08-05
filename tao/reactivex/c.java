package tao.reactivex;

import com.android.alibaba.ip.runtime.IpChange;
import tao.reactivex.d.e.a.d;
import tb.iqv;
import tb.jdz;
import tb.jev;
import tb.jew;
import tb.jgn;
import tb.jrg;
import tb.kea;
import tb.kge;
import tb.kgk;
import tb.mux;
import tb.muy;
import tb.muz;
import tb.nam;

/* loaded from: classes9.dex */
public abstract class c<T> implements muy<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f25091a;

    static {
        kge.a(-605775866);
        kge.a(1964950428);
        f25091a = Math.max(1, iqv.a().d());
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : f25091a;
    }

    public final c<T> a(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("39491a46", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        }
        kgk.a(i, "bufferSize");
        return new tao.reactivex.d.e.a.f(this, i, z2, z, kea.f30000a);
    }

    public final c<T> a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("832b4676", new Object[]{this, kVar});
        }
        kgk.a(kVar, "scheduler is null");
        return a(kVar, true);
    }

    public final c<T> a(k kVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("7de5ef94", new Object[]{this, kVar, new Boolean(z)});
        }
        kgk.a(kVar, "scheduler is null");
        return new tao.reactivex.d.e.a.h(this, kVar, z);
    }

    public final <R> c<R> a(jgn<? super T, ? extends R> jgnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("2ccd2552", new Object[]{this, jgnVar});
        }
        kgk.a(jgnVar, "mapper is null");
        return new tao.reactivex.d.e.a.e(this, jgnVar);
    }

    public final c<T> a(jrg<? super T> jrgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("61f2d544", new Object[]{this, jrgVar});
        }
        kgk.a(jrgVar, "predicate is null");
        return new tao.reactivex.d.e.a.b(this, jrgVar);
    }

    public final jdz a(jew<? super T> jewVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jdz) ipChange.ipc$dispatch("fcb041ca", new Object[]{this, jewVar}) : a(jewVar, kea.b, kea.f30000a, d.a.INSTANCE);
    }

    public final jdz a(jew<? super T> jewVar, jew<? super Throwable> jewVar2, jev jevVar, jew<? super nam> jewVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdz) ipChange.ipc$dispatch("503c0d8d", new Object[]{this, jewVar, jewVar2, jevVar, jewVar3});
        }
        kgk.a(jewVar, "onNext is null");
        kgk.a(jewVar2, "onError is null");
        kgk.a(jevVar, "onComplete is null");
        kgk.a(jewVar3, "onSubscribe is null");
        tao.reactivex.d.g.d dVar = new tao.reactivex.d.g.d(jewVar, jewVar2, jevVar, jewVar3);
        a((d) dVar);
        return dVar;
    }

    public final void a(d<? super T> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aabed0f2", new Object[]{this, dVar});
            return;
        }
        kgk.a(dVar, "s is null");
        try {
            kgk.a(dVar, "Plugin returned null Subscriber");
            b(dVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            tao.reactivex.b.b.a(th);
            mux.a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @Override // tb.muy
    public final void a(muz<? super T> muzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f53e5dc6", new Object[]{this, muzVar});
        } else if (muzVar instanceof d) {
            a((d) ((d) muzVar));
        } else {
            kgk.a(muzVar, "s is null");
            a((d) new tao.reactivex.d.g.f(muzVar));
        }
    }

    public final c<T> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("a2bb4ed4", new Object[]{this}) : new tao.reactivex.d.e.a.g(this);
    }

    public abstract void b(muz<? super T> muzVar);

    public final c<T> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("af544455", new Object[]{this}) : a(a(), false, true);
    }
}
