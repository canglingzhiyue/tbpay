package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.jdz;
import tb.kge;

/* loaded from: classes9.dex */
public final class r<T> extends tao.reactivex.d.e.b.a<T, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final tao.reactivex.k b;

    /* loaded from: classes9.dex */
    public static final class a<T> extends AtomicReference<jdz> implements tao.reactivex.j<T>, jdz {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final tao.reactivex.j<? super T> f25131a;
        public final AtomicReference<jdz> b = new AtomicReference<>();

        static {
            kge.a(-1366814384);
            kge.a(1964944663);
            kge.a(-605775859);
        }

        public a(tao.reactivex.j<? super T> jVar) {
            this.f25131a = jVar;
        }

        public void a(jdz jdzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef304458", new Object[]{this, jdzVar});
            } else {
                tao.reactivex.d.a.a.b(this, jdzVar);
            }
        }

        @Override // tb.jdz
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : tao.reactivex.d.a.a.a(get());
        }

        @Override // tb.jdz
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
                return;
            }
            tao.reactivex.d.a.a.a(this.b);
            tao.reactivex.d.a.a.a((AtomicReference<jdz>) this);
        }

        @Override // tao.reactivex.j
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            } else {
                this.f25131a.onComplete();
            }
        }

        @Override // tao.reactivex.j
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else {
                this.f25131a.onError(th);
            }
        }

        @Override // tao.reactivex.j
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else {
                this.f25131a.onNext(t);
            }
        }

        @Override // tao.reactivex.j
        public void onSubscribe(jdz jdzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("940fff22", new Object[]{this, jdzVar});
            } else {
                tao.reactivex.d.a.a.b(this.b, jdzVar);
            }
        }
    }

    /* loaded from: classes9.dex */
    public final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final a<T> b;

        static {
            kge.a(-1366814383);
            kge.a(-1390502639);
        }

        public b(a<T> aVar) {
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                r.this.f25109a.b(this.b);
            }
        }
    }

    static {
        kge.a(-600304301);
    }

    public r(tao.reactivex.h<T> hVar, tao.reactivex.k kVar) {
        super(hVar);
        this.b = kVar;
    }

    @Override // tao.reactivex.e
    public void a(tao.reactivex.j<? super T> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac18b2c", new Object[]{this, jVar});
            return;
        }
        a aVar = new a(jVar);
        jVar.onSubscribe(aVar);
        aVar.a(this.b.a(new b(aVar)));
    }
}
