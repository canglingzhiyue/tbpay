package tao.reactivex.d.e.a;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jgn;
import tb.kge;
import tb.kgk;
import tb.khk;
import tb.muz;

/* loaded from: classes9.dex */
public final class e<T, U> extends tao.reactivex.d.e.a.a<T, U> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final jgn<? super T, ? extends U> c;

    /* loaded from: classes9.dex */
    public static final class a<T, U> extends tao.reactivex.d.g.a<T, U> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final jgn<? super T, ? extends U> f25104a;

        static {
            kge.a(-1367750398);
        }

        public a(khk<? super U> khkVar, jgn<? super T, ? extends U> jgnVar) {
            super(khkVar);
            this.f25104a = jgnVar;
        }

        @Override // tb.miv
        public int a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : b(i);
        }

        @Override // tb.khk
        public boolean b(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{this, t})).booleanValue();
            }
            if (this.e) {
                return false;
            }
            try {
                return this.b.b(kgk.a(this.f25104a.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                a(th);
                return true;
            }
        }

        @Override // tb.muw
        public U c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (U) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
            }
            T c = this.d.c();
            if (c == null) {
                return null;
            }
            return (U) kgk.a(this.f25104a.apply(c), "The mapper function returned a null value.");
        }

        @Override // tb.muz
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (this.e) {
            } else {
                if (this.f != 0) {
                    this.b.onNext(null);
                    return;
                }
                try {
                    this.b.onNext(kgk.a(this.f25104a.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    a(th);
                }
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class b<T, U> extends tao.reactivex.d.g.b<T, U> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final jgn<? super T, ? extends U> f25105a;

        static {
            kge.a(-1367750397);
        }

        public b(muz<? super U> muzVar, jgn<? super T, ? extends U> jgnVar) {
            super(muzVar);
            this.f25105a = jgnVar;
        }

        @Override // tb.miv
        public int a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : b(i);
        }

        @Override // tb.muw
        public U c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (U) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
            }
            T c = this.d.c();
            if (c == null) {
                return null;
            }
            return (U) kgk.a(this.f25105a.apply(c), "The mapper function returned a null value.");
        }

        @Override // tb.muz
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (this.e) {
            } else {
                if (this.f != 0) {
                    this.b.onNext(null);
                    return;
                }
                try {
                    this.b.onNext(kgk.a(this.f25105a.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    a(th);
                }
            }
        }
    }

    static {
        kge.a(-600305275);
    }

    public e(tao.reactivex.c<T> cVar, jgn<? super T, ? extends U> jgnVar) {
        super(cVar);
        this.c = jgnVar;
    }

    @Override // tao.reactivex.c
    public void b(muz<? super U> muzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c16447", new Object[]{this, muzVar});
        } else if (muzVar instanceof khk) {
            this.b.a((tao.reactivex.d) new a((khk) muzVar, this.c));
        } else {
            this.b.a((tao.reactivex.d) new b(muzVar, this.c));
        }
    }
}
