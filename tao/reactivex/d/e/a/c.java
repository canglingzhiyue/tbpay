package tao.reactivex.d.e.a;

import com.android.alibaba.ip.runtime.IpChange;
import tao.reactivex.j;
import tb.jdz;
import tb.kge;
import tb.muz;
import tb.nam;

/* loaded from: classes9.dex */
public final class c<T> extends tao.reactivex.c<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final tao.reactivex.e<T> b;

    /* loaded from: classes9.dex */
    public static class a<T> implements j<T>, nam {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final muz<? super T> f25102a;
        private jdz b;

        static {
            kge.a(-1367752320);
            kge.a(1964950430);
            kge.a(-605775859);
        }

        public a(muz<? super T> muzVar) {
            this.f25102a = muzVar;
        }

        @Override // tb.nam
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.b.b_();
            }
        }

        @Override // tb.nam
        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            }
        }

        @Override // tao.reactivex.j
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            } else {
                this.f25102a.onComplete();
            }
        }

        @Override // tao.reactivex.j
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else {
                this.f25102a.onError(th);
            }
        }

        @Override // tao.reactivex.j
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else {
                this.f25102a.onNext(t);
            }
        }

        @Override // tao.reactivex.j
        public void onSubscribe(jdz jdzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("940fff22", new Object[]{this, jdzVar});
                return;
            }
            this.b = jdzVar;
            this.f25102a.onSubscribe(this);
        }
    }

    static {
        kge.a(-600305277);
    }

    public c(tao.reactivex.e<T> eVar) {
        this.b = eVar;
    }

    @Override // tao.reactivex.c
    public void b(muz<? super T> muzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c16447", new Object[]{this, muzVar});
        } else {
            this.b.b(new a(muzVar));
        }
    }
}
