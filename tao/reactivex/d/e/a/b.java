package tao.reactivex.d.e.a;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jrg;
import tb.kge;
import tb.khk;
import tb.mun;
import tb.muz;

/* loaded from: classes9.dex */
public final class b<T> extends tao.reactivex.d.e.a.a<T, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final jrg<? super T> c;

    /* loaded from: classes9.dex */
    public static final class a<T> extends tao.reactivex.d.g.a<T, T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final jrg<? super T> f25100a;

        static {
            kge.a(-1367753281);
        }

        public a(khk<? super T> khkVar, jrg<? super T> jrgVar) {
            super(khkVar);
            this.f25100a = jrgVar;
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
            if (this.f != 0) {
                return this.b.b(null);
            }
            try {
                return this.f25100a.test(t) && this.b.b(t);
            } catch (Throwable th) {
                a(th);
                return true;
            }
        }

        @Override // tb.muw
        public T c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
            }
            mun<T> munVar = this.d;
            jrg<? super T> jrgVar = this.f25100a;
            while (true) {
                T c = munVar.c();
                if (c == null) {
                    return null;
                }
                if (jrgVar.test(c)) {
                    return c;
                }
                if (this.f == 2) {
                    munVar.a(1L);
                }
            }
        }

        @Override // tb.muz
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (b((a<T>) t)) {
            } else {
                this.c.a(1L);
            }
        }
    }

    /* renamed from: tao.reactivex.d.e.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C1076b<T> extends tao.reactivex.d.g.b<T, T> implements khk<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final jrg<? super T> f25101a;

        static {
            kge.a(-1367753280);
            kge.a(-1471016019);
        }

        public C1076b(muz<? super T> muzVar, jrg<? super T> jrgVar) {
            super(muzVar);
            this.f25101a = jrgVar;
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
            if (this.f != 0) {
                this.b.onNext(null);
                return true;
            }
            try {
                boolean test = this.f25101a.test(t);
                if (test) {
                    this.b.onNext(t);
                }
                return test;
            } catch (Throwable th) {
                a(th);
                return true;
            }
        }

        @Override // tb.muw
        public T c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
            }
            mun<T> munVar = this.d;
            jrg<? super T> jrgVar = this.f25101a;
            while (true) {
                T c = munVar.c();
                if (c == null) {
                    return null;
                }
                if (jrgVar.test(c)) {
                    return c;
                }
                if (this.f == 2) {
                    munVar.a(1L);
                }
            }
        }

        @Override // tb.muz
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (b((C1076b<T>) t)) {
            } else {
                this.c.a(1L);
            }
        }
    }

    static {
        kge.a(-600305278);
    }

    public b(tao.reactivex.c<T> cVar, jrg<? super T> jrgVar) {
        super(cVar);
        this.c = jrgVar;
    }

    @Override // tao.reactivex.c
    public void b(muz<? super T> muzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c16447", new Object[]{this, muzVar});
        } else if (muzVar instanceof khk) {
            this.b.a((tao.reactivex.d) new a((khk) muzVar, this.c));
        } else {
            this.b.a((tao.reactivex.d) new C1076b(muzVar, this.c));
        }
    }
}
