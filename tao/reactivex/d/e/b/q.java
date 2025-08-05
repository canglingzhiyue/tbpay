package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import tb.jgn;
import tb.kge;
import tb.kgk;
import tb.khl;

/* loaded from: classes9.dex */
public final class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public static final class a<T> extends AtomicInteger implements Runnable, khl<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final tao.reactivex.j<? super T> f25129a;
        public final T b;

        static {
            kge.a(-1366815345);
            kge.a(-1390502639);
            kge.a(-1471016018);
        }

        public a(tao.reactivex.j<? super T> jVar, T t) {
            this.f25129a = jVar;
            this.b = t;
        }

        @Override // tb.miv
        public int a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
            }
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // tb.muw
        public boolean a(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, t})).booleanValue();
            }
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // tb.jdz
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : get() == 3;
        }

        @Override // tb.jdz
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else {
                set(3);
            }
        }

        @Override // tb.muw
        public T c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
            }
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.b;
        }

        @Override // tb.muw
        public boolean d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : get() != 1;
        }

        @Override // tb.muw
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else {
                lazySet(3);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (get() != 0 || !compareAndSet(0, 2)) {
            } else {
                this.f25129a.onNext((T) this.b);
                if (get() != 2) {
                    return;
                }
                lazySet(3);
                this.f25129a.onComplete();
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class b<T, R> extends tao.reactivex.e<R> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final T f25130a;
        public final jgn<? super T, ? extends tao.reactivex.h<? extends R>> b;

        static {
            kge.a(-1366815344);
        }

        public b(T t, jgn<? super T, ? extends tao.reactivex.h<? extends R>> jgnVar) {
            this.f25130a = t;
            this.b = jgnVar;
        }

        @Override // tao.reactivex.e
        public void a(tao.reactivex.j<? super R> jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aac18b2c", new Object[]{this, jVar});
                return;
            }
            try {
                tao.reactivex.h hVar = (tao.reactivex.h) kgk.a(this.b.apply((T) this.f25130a), "The mapper returned a null ObservableSource");
                if (!(hVar instanceof Callable)) {
                    hVar.b(jVar);
                    return;
                }
                try {
                    Object call = ((Callable) hVar).call();
                    if (call == null) {
                        tao.reactivex.d.a.b.a((tao.reactivex.j<?>) jVar);
                        return;
                    }
                    a aVar = new a(jVar, call);
                    jVar.onSubscribe(aVar);
                    aVar.run();
                } catch (Throwable th) {
                    tao.reactivex.b.b.a(th);
                    tao.reactivex.d.a.b.a(th, jVar);
                }
            } catch (Throwable th2) {
                tao.reactivex.d.a.b.a(th2, jVar);
            }
        }
    }

    static {
        kge.a(-600304302);
    }

    public static <T, U> tao.reactivex.e<U> a(T t, jgn<? super T, ? extends tao.reactivex.h<? extends U>> jgnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tao.reactivex.e) ipChange.ipc$dispatch("e0a8f76c", new Object[]{t, jgnVar}) : new b(t, jgnVar);
    }

    public static <T, R> boolean a(tao.reactivex.h<T> hVar, tao.reactivex.j<? super R> jVar, jgn<? super T, ? extends tao.reactivex.h<? extends R>> jgnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cddade9", new Object[]{hVar, jVar, jgnVar})).booleanValue();
        }
        if (!(hVar instanceof Callable)) {
            return false;
        }
        try {
            Object obj = (Object) ((Callable) hVar).call();
            if (obj == 0) {
                tao.reactivex.d.a.b.a((tao.reactivex.j<?>) jVar);
                return true;
            }
            tao.reactivex.h hVar2 = (tao.reactivex.h) kgk.a(jgnVar.apply(obj), "The mapper returned a null ObservableSource");
            if (hVar2 instanceof Callable) {
                Object call = ((Callable) hVar2).call();
                if (call == null) {
                    tao.reactivex.d.a.b.a((tao.reactivex.j<?>) jVar);
                    return true;
                }
                a aVar = new a(jVar, call);
                jVar.onSubscribe(aVar);
                aVar.run();
            } else {
                hVar2.b(jVar);
            }
            return true;
        } catch (Throwable th) {
            tao.reactivex.b.b.a(th);
            tao.reactivex.d.a.b.a(th, jVar);
            return true;
        }
    }
}
