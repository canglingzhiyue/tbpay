package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import tb.kge;
import tb.kgk;

/* loaded from: classes9.dex */
public final class k<T> extends tao.reactivex.e<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Iterable<? extends T> f25122a;

    /* loaded from: classes9.dex */
    public static final class a<T> extends tao.reactivex.d.d.c<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final tao.reactivex.j<? super T> f25123a;
        public final Iterator<? extends T> b;
        public volatile boolean c;
        public boolean d;
        public boolean e;
        public boolean f;

        static {
            kge.a(-1366821111);
        }

        public a(tao.reactivex.j<? super T> jVar, Iterator<? extends T> it) {
            this.f25123a = jVar;
            this.b = it;
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
            this.d = true;
            return 1;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            while (!b()) {
                try {
                    this.f25123a.onNext(kgk.a((Object) this.b.next(), "The iterator returned a null value"));
                    if (b()) {
                        return;
                    }
                    try {
                        if (!this.b.hasNext()) {
                            if (b()) {
                                return;
                            }
                            this.f25123a.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        tao.reactivex.b.b.a(th);
                        this.f25123a.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    tao.reactivex.b.b.a(th2);
                    this.f25123a.onError(th2);
                    return;
                }
            }
        }

        @Override // tb.jdz
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c;
        }

        @Override // tb.jdz
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else {
                this.c = true;
            }
        }

        @Override // tb.muw
        public T c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
            }
            if (this.e) {
                return null;
            }
            if (!this.f) {
                this.f = true;
            } else if (!this.b.hasNext()) {
                this.e = true;
                return null;
            }
            return (T) kgk.a((Object) this.b.next(), "The iterator returned a null value");
        }

        @Override // tb.muw
        public boolean d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.e;
        }

        @Override // tb.muw
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else {
                this.e = true;
            }
        }
    }

    static {
        kge.a(-600304308);
    }

    public k(Iterable<? extends T> iterable) {
        this.f25122a = iterable;
    }

    @Override // tao.reactivex.e
    public void a(tao.reactivex.j<? super T> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac18b2c", new Object[]{this, jVar});
            return;
        }
        try {
            Iterator<? extends T> it = this.f25122a.iterator();
            try {
                if (!it.hasNext()) {
                    tao.reactivex.d.a.b.a((tao.reactivex.j<?>) jVar);
                    return;
                }
                a aVar = new a(jVar, it);
                jVar.onSubscribe(aVar);
                if (aVar.d) {
                    return;
                }
                aVar.a();
            } catch (Throwable th) {
                tao.reactivex.b.b.a(th);
                tao.reactivex.d.a.b.a(th, jVar);
            }
        } catch (Throwable th2) {
            tao.reactivex.b.b.a(th2);
            tao.reactivex.d.a.b.a(th2, jVar);
        }
    }
}
