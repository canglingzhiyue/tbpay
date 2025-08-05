package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jdz;
import tb.kge;
import tb.mux;

/* loaded from: classes9.dex */
public final class d<T, U> extends tao.reactivex.e<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final tao.reactivex.h<? extends T> f25114a;
    public final tao.reactivex.h<U> b;

    /* loaded from: classes9.dex */
    public final class a implements tao.reactivex.j<U> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final tao.reactivex.d.a.d f25115a;
        public final tao.reactivex.j<? super T> b;
        public boolean c;

        /* renamed from: tao.reactivex.d.e.b.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public final class C1080a implements tao.reactivex.j<T> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                kge.a(738441471);
                kge.a(-605775859);
            }

            public C1080a() {
            }

            @Override // tao.reactivex.j
            public void onComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                } else {
                    a.this.b.onComplete();
                }
            }

            @Override // tao.reactivex.j
            public void onError(Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                } else {
                    a.this.b.onError(th);
                }
            }

            @Override // tao.reactivex.j
            public void onNext(T t) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
                } else {
                    a.this.b.onNext(t);
                }
            }

            @Override // tao.reactivex.j
            public void onSubscribe(jdz jdzVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("940fff22", new Object[]{this, jdzVar});
                } else {
                    a.this.f25115a.a(jdzVar);
                }
            }
        }

        static {
            kge.a(-1366827838);
            kge.a(-605775859);
        }

        public a(tao.reactivex.d.a.d dVar, tao.reactivex.j<? super T> jVar) {
            this.f25115a = dVar;
            this.b = jVar;
        }

        @Override // tao.reactivex.j
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            } else if (this.c) {
            } else {
                this.c = true;
                d.this.f25114a.b(new C1080a());
            }
        }

        @Override // tao.reactivex.j
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else if (this.c) {
                mux.a(th);
            } else {
                this.c = true;
                this.b.onError(th);
            }
        }

        @Override // tao.reactivex.j
        public void onNext(U u) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, u});
            } else {
                onComplete();
            }
        }

        @Override // tao.reactivex.j
        public void onSubscribe(jdz jdzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("940fff22", new Object[]{this, jdzVar});
            } else {
                this.f25115a.a(jdzVar);
            }
        }
    }

    static {
        kge.a(-600304315);
    }

    public d(tao.reactivex.h<? extends T> hVar, tao.reactivex.h<U> hVar2) {
        this.f25114a = hVar;
        this.b = hVar2;
    }

    @Override // tao.reactivex.e
    public void a(tao.reactivex.j<? super T> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac18b2c", new Object[]{this, jVar});
            return;
        }
        tao.reactivex.d.a.d dVar = new tao.reactivex.d.a.d();
        jVar.onSubscribe(dVar);
        this.b.b(new a(dVar, jVar));
    }
}
