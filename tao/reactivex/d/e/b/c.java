package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.jdz;
import tb.kge;
import tb.mux;

/* loaded from: classes9.dex */
public final class c<T> extends tao.reactivex.e<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final tao.reactivex.g<T> f25112a;

    /* loaded from: classes9.dex */
    public static final class a<T> extends AtomicReference<jdz> implements tao.reactivex.f<T>, jdz {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final tao.reactivex.j<? super T> f25113a;

        static {
            kge.a(-1366828799);
            kge.a(1964944663);
            kge.a(-605775863);
        }

        public a(tao.reactivex.j<? super T> jVar) {
            this.f25113a = jVar;
        }

        @Override // tao.reactivex.b
        public void a(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
            } else if (t == null) {
                a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (b()) {
            } else {
                this.f25113a.onNext(t);
            }
        }

        public void a(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            } else if (b(th)) {
            } else {
                mux.a(th);
            }
        }

        @Override // tao.reactivex.b
        public void a_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aad651a5", new Object[]{this});
            } else if (b()) {
            } else {
                try {
                    this.f25113a.onComplete();
                } finally {
                    b_();
                }
            }
        }

        @Override // tb.jdz
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : tao.reactivex.d.a.a.a(get());
        }

        public boolean b(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fd742bb0", new Object[]{this, th})).booleanValue();
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (b()) {
                return false;
            }
            try {
                this.f25113a.onError(th);
                return true;
            } finally {
                b_();
            }
        }

        @Override // tb.jdz
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else {
                tao.reactivex.d.a.a.a((AtomicReference<jdz>) this);
            }
        }
    }

    static {
        kge.a(-600304316);
    }

    public c(tao.reactivex.g<T> gVar) {
        this.f25112a = gVar;
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
        try {
            this.f25112a.a(aVar);
        } catch (Throwable th) {
            tao.reactivex.b.b.a(th);
            aVar.a(th);
        }
    }
}
