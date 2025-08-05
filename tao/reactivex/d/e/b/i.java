package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jrg;
import tb.kge;

/* loaded from: classes9.dex */
public final class i<T> extends tao.reactivex.d.e.b.a<T, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final jrg<? super T> b;

    /* loaded from: classes9.dex */
    public static final class a<T> extends tao.reactivex.d.d.a<T, T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final jrg<? super T> f;

        static {
            kge.a(-1366823033);
        }

        public a(tao.reactivex.j<? super T> jVar, jrg<? super T> jrgVar) {
            super(jVar);
            this.f = jrgVar;
        }

        @Override // tb.miv
        public int a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : b(i);
        }

        @Override // tb.muw
        public T c() {
            T c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
            }
            do {
                c = this.c.c();
                if (c == null) {
                    break;
                }
            } while (!this.f.test(c));
            return c;
        }

        @Override // tao.reactivex.j
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (this.e != 0) {
                this.f25095a.onNext(null);
            } else {
                try {
                    if (!this.f.test(t)) {
                        return;
                    }
                    this.f25095a.onNext(t);
                } catch (Throwable th) {
                    a(th);
                }
            }
        }
    }

    static {
        kge.a(-600304310);
    }

    public i(tao.reactivex.h<T> hVar, jrg<? super T> jrgVar) {
        super(hVar);
        this.b = jrgVar;
    }

    @Override // tao.reactivex.e
    public void a(tao.reactivex.j<? super T> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac18b2c", new Object[]{this, jVar});
        } else {
            this.f25109a.b(new a(jVar, this.b));
        }
    }
}
