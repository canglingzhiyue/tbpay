package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jgn;
import tb.kge;
import tb.kgk;

/* loaded from: classes9.dex */
public final class o<T, U> extends tao.reactivex.d.e.b.a<T, U> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final jgn<? super T, ? extends U> b;

    /* loaded from: classes9.dex */
    public static final class a<T, U> extends tao.reactivex.d.d.a<T, U> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final jgn<? super T, ? extends U> f;

        static {
            kge.a(-1366817267);
        }

        public a(tao.reactivex.j<? super U> jVar, jgn<? super T, ? extends U> jgnVar) {
            super(jVar);
            this.f = jgnVar;
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
            T c = this.c.c();
            if (c == null) {
                return null;
            }
            return (U) kgk.a(this.f.apply(c), "The mapper function returned a null value.");
        }

        @Override // tao.reactivex.j
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (this.d) {
            } else {
                if (this.e != 0) {
                    this.f25095a.onNext(null);
                    return;
                }
                try {
                    this.f25095a.onNext(kgk.a(this.f.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    a(th);
                }
            }
        }
    }

    static {
        kge.a(-600304304);
    }

    public o(tao.reactivex.h<T> hVar, jgn<? super T, ? extends U> jgnVar) {
        super(hVar);
        this.b = jgnVar;
    }

    @Override // tao.reactivex.e
    public void a(tao.reactivex.j<? super U> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac18b2c", new Object[]{this, jVar});
        } else {
            this.f25109a.b(new a(jVar, this.b));
        }
    }
}
