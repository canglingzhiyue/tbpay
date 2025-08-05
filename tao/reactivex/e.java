package tao.reactivex;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import tao.reactivex.d.e.b.l;
import tao.reactivex.d.e.b.m;
import tao.reactivex.d.e.b.n;
import tao.reactivex.d.e.b.o;
import tao.reactivex.d.e.b.p;
import tao.reactivex.d.e.b.q;
import tao.reactivex.d.e.b.r;
import tao.reactivex.d.e.b.s;
import tb.jdz;
import tb.jev;
import tb.jew;
import tb.jgn;
import tb.jrg;
import tb.kea;
import tb.kge;
import tb.kgk;
import tb.muo;
import tb.mux;

/* loaded from: classes9.dex */
public abstract class e<T> implements h<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-605775864);
        kge.a(-605775861);
    }

    public static <T> e<T> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("96225991", new Object[0]) : (e<T>) tao.reactivex.d.e.b.g.f25118a;
    }

    public static e<Long> a(long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("b5d55179", new Object[]{new Long(j), new Long(j2), timeUnit}) : a(j, j2, timeUnit, tao.reactivex.f.k.a());
    }

    public static e<Long> a(long j, long j2, TimeUnit timeUnit, k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("631a1bcc", new Object[]{new Long(j), new Long(j2), timeUnit, kVar});
        }
        kgk.a(timeUnit, "unit is null");
        kgk.a(kVar, "scheduler is null");
        return new m(Math.max(0L, j), Math.max(0L, j2), timeUnit, kVar);
    }

    public static e<Long> a(long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("eb55e85", new Object[]{new Long(j), timeUnit}) : a(j, timeUnit, tao.reactivex.f.k.a());
    }

    public static e<Long> a(long j, TimeUnit timeUnit, k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("858c4840", new Object[]{new Long(j), timeUnit, kVar});
        }
        kgk.a(timeUnit, "unit is null");
        kgk.a(kVar, "scheduler is null");
        return new s(Math.max(j, 0L), timeUnit, kVar);
    }

    public static <T> e<T> a(Iterable<? extends T> iterable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("ea76e09a", new Object[]{iterable});
        }
        kgk.a(iterable, "source is null");
        return new tao.reactivex.d.e.b.k(iterable);
    }

    public static <T> e<T> a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("94ebc76d", new Object[]{t});
        }
        kgk.a((Object) t, "The item is null");
        return new n(t);
    }

    public static <T> e<T> a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("c285dbb6", new Object[]{th});
        }
        kgk.a(th, "e is null");
        return a((Callable<? extends Throwable>) kea.a(th));
    }

    public static <T> e<T> a(Callable<? extends Throwable> callable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("6c6525d2", new Object[]{callable});
        }
        kgk.a(callable, "errorSupplier is null");
        return new tao.reactivex.d.e.b.h(callable);
    }

    public static <T> e<T> a(g<T> gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("e4a3ed38", new Object[]{gVar});
        }
        kgk.a(gVar, "source is null");
        return new tao.reactivex.d.e.b.c(gVar);
    }

    public static <T> e<T> a(h<T> hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("cc45c397", new Object[]{hVar});
        }
        kgk.a(hVar, "source is null");
        return hVar instanceof e ? (e) hVar : new l(hVar);
    }

    private e<T> a(jew<? super T> jewVar, jew<? super Throwable> jewVar2, jev jevVar, jev jevVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("1a23ad23", new Object[]{this, jewVar, jewVar2, jevVar, jevVar2});
        }
        kgk.a(jewVar, "onNext is null");
        kgk.a(jewVar2, "onError is null");
        kgk.a(jevVar, "onComplete is null");
        kgk.a(jevVar2, "onAfterTerminate is null");
        return new tao.reactivex.d.e.b.e(this, jewVar, jewVar2, jevVar, jevVar2);
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : c.a();
    }

    public final c<T> a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("76d8e6c0", new Object[]{this, aVar}) : new tao.reactivex.d.e.a.c(this).c();
    }

    public final e<List<T>> a(long j, TimeUnit timeUnit, k kVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("1f54a1f5", new Object[]{this, new Long(j), timeUnit, kVar, new Integer(i)}) : (e<List<T>>) a(j, timeUnit, kVar, i, tao.reactivex.d.h.b.a(), false);
    }

    public final <U extends Collection<? super T>> e<U> a(long j, TimeUnit timeUnit, k kVar, int i, Callable<U> callable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("d23facd8", new Object[]{this, new Long(j), timeUnit, kVar, new Integer(i), callable, new Boolean(z)});
        }
        kgk.a(timeUnit, "unit is null");
        kgk.a(kVar, "scheduler is null");
        kgk.a(callable, "bufferSupplier is null");
        kgk.a(i, "count");
        return new tao.reactivex.d.e.b.b(this, j, j, timeUnit, kVar, callable, i, z);
    }

    public final <R> e<R> a(i<? super T, ? extends R> iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("b3e799f6", new Object[]{this, iVar}) : a(((i) kgk.a(iVar, "composer is null")).b(this));
    }

    public final e<T> a(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("832b46b4", new Object[]{this, kVar}) : a(kVar, false, b());
    }

    public final e<T> a(k kVar, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("322feca3", new Object[]{this, kVar, new Boolean(z), new Integer(i)});
        }
        kgk.a(kVar, "scheduler is null");
        kgk.a(i, "bufferSize");
        return new p(this, kVar, z, i);
    }

    public final e<T> a(jew<? super Throwable> jewVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("384bc3e5", new Object[]{this, jewVar});
        }
        jew<? super T> a2 = kea.a();
        jev jevVar = kea.f30000a;
        return a(a2, jewVar, jevVar, jevVar);
    }

    public final e<T> a(jew<? super jdz> jewVar, jev jevVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("b63dc3da", new Object[]{this, jewVar, jevVar});
        }
        kgk.a(jewVar, "onSubscribe is null");
        kgk.a(jevVar, "onDispose is null");
        return new tao.reactivex.d.e.b.f(this, jewVar, jevVar);
    }

    public final <R> e<R> a(jgn<? super T, ? extends h<? extends R>> jgnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("2ccd2590", new Object[]{this, jgnVar}) : a((jgn) jgnVar, false);
    }

    public final <R> e<R> a(jgn<? super T, ? extends h<? extends R>> jgnVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("87fec76", new Object[]{this, jgnVar, new Boolean(z)}) : a(jgnVar, z, Integer.MAX_VALUE);
    }

    public final <R> e<R> a(jgn<? super T, ? extends h<? extends R>> jgnVar, boolean z, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("fad5847f", new Object[]{this, jgnVar, new Boolean(z), new Integer(i)}) : a(jgnVar, z, i, b());
    }

    public final <R> e<R> a(jgn<? super T, ? extends h<? extends R>> jgnVar, boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("5332ed96", new Object[]{this, jgnVar, new Boolean(z), new Integer(i), new Integer(i2)});
        }
        kgk.a(jgnVar, "mapper is null");
        kgk.a(i, "maxConcurrency");
        kgk.a(i2, "bufferSize");
        if (!(this instanceof muo)) {
            return new tao.reactivex.d.e.b.j(this, jgnVar, z, i, i2);
        }
        Object call = ((muo) this).call();
        return call == null ? a() : q.a(call, jgnVar);
    }

    public final e<T> a(jrg<? super T> jrgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("61f2d582", new Object[]{this, jrgVar});
        }
        kgk.a(jrgVar, "predicate is null");
        return new tao.reactivex.d.e.b.i(this, jrgVar);
    }

    public final jdz a(jew<? super T> jewVar, jew<? super Throwable> jewVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jdz) ipChange.ipc$dispatch("6d463cf6", new Object[]{this, jewVar, jewVar2}) : a(jewVar, jewVar2, kea.f30000a, kea.a());
    }

    public final jdz a(jew<? super T> jewVar, jew<? super Throwable> jewVar2, jev jevVar, jew<? super jdz> jewVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdz) ipChange.ipc$dispatch("503c0d8d", new Object[]{this, jewVar, jewVar2, jevVar, jewVar3});
        }
        kgk.a(jewVar, "onNext is null");
        kgk.a(jewVar2, "onError is null");
        kgk.a(jevVar, "onComplete is null");
        kgk.a(jewVar3, "onSubscribe is null");
        tao.reactivex.d.d.e eVar = new tao.reactivex.d.d.e(jewVar, jewVar2, jevVar, jewVar3);
        b(eVar);
        return eVar;
    }

    public abstract void a(j<? super T> jVar);

    public final e<List<T>> b(long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("9bf01006", new Object[]{this, new Long(j), timeUnit}) : a(j, timeUnit, tao.reactivex.f.k.a(), Integer.MAX_VALUE);
    }

    public final e<T> b(long j, TimeUnit timeUnit, k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("be6ca8df", new Object[]{this, new Long(j), timeUnit, kVar}) : b(a(j, timeUnit, kVar));
    }

    public final <U> e<T> b(h<U> hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("2d986036", new Object[]{this, hVar});
        }
        kgk.a(hVar, "other is null");
        return new tao.reactivex.d.e.b.d(this, hVar);
    }

    public final e<T> b(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("e47de353", new Object[]{this, kVar});
        }
        kgk.a(kVar, "scheduler is null");
        return new r(this, kVar);
    }

    public final e<T> b(jew<? super jdz> jewVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("619ba866", new Object[]{this, jewVar}) : a(jewVar, kea.f30000a);
    }

    public final <R> e<R> b(jgn<? super T, ? extends R> jgnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("561d0a11", new Object[]{this, jgnVar});
        }
        kgk.a(jgnVar, "mapper is null");
        return new o(this, jgnVar);
    }

    @Override // tao.reactivex.h
    public final void b(j<? super T> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314745cb", new Object[]{this, jVar});
            return;
        }
        kgk.a(jVar, "observer is null");
        try {
            a((j) jVar);
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

    public final e<T> c(long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("292ac187", new Object[]{this, new Long(j), timeUnit}) : b(j, timeUnit, tao.reactivex.f.k.a());
    }

    public final jdz c(jew<? super T> jewVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jdz) ipChange.ipc$dispatch("cbf3ee88", new Object[]{this, jewVar}) : a(jewVar, kea.b, kea.f30000a, kea.a());
    }
}
