package tao.reactivex.d.e.a;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import tao.reactivex.k;
import tb.kge;
import tb.muy;
import tb.muz;
import tb.nam;

/* loaded from: classes9.dex */
public final class h<T> extends tao.reactivex.d.e.a.a<T, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final k c;
    public final boolean d;

    /* loaded from: classes9.dex */
    public static final class a<T> extends AtomicReference<Thread> implements Runnable, tao.reactivex.d<T>, nam {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final muz<? super T> f25107a;
        public final k.c b;
        public final AtomicReference<nam> c = new AtomicReference<>();
        public final AtomicLong d = new AtomicLong();
        public final boolean e;
        public muy<T> f;

        /* renamed from: tao.reactivex.d.e.a.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public static final class RunnableC1077a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final nam f25108a;
            private final long b;

            static {
                kge.a(-145368126);
                kge.a(-1390502639);
            }

            public RunnableC1077a(nam namVar, long j) {
                this.f25108a = namVar;
                this.b = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f25108a.a(this.b);
                }
            }
        }

        static {
            kge.a(-1367747515);
            kge.a(-1390502639);
            kge.a(-605775865);
            kge.a(1964950430);
        }

        public a(muz<? super T> muzVar, k.c cVar, muy<T> muyVar, boolean z) {
            this.f25107a = muzVar;
            this.b = cVar;
            this.f = muyVar;
            this.e = !z;
        }

        @Override // tb.nam
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            tao.reactivex.d.g.g.a(this.c);
            this.b.b_();
        }

        @Override // tb.nam
        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            } else if (!tao.reactivex.d.g.g.b(j)) {
            } else {
                nam namVar = this.c.get();
                if (namVar != null) {
                    a(j, namVar);
                    return;
                }
                tao.reactivex.d.h.d.a(this.d, j);
                nam namVar2 = this.c.get();
                if (namVar2 == null) {
                    return;
                }
                long andSet = this.d.getAndSet(0L);
                if (andSet == 0) {
                    return;
                }
                a(andSet, namVar2);
            }
        }

        public void a(long j, nam namVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ef86e72", new Object[]{this, new Long(j), namVar});
            } else if (this.e || Thread.currentThread() == get()) {
                namVar.a(j);
            } else {
                this.b.a(new RunnableC1077a(namVar, j));
            }
        }

        @Override // tb.muz
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            this.f25107a.onComplete();
            this.b.b_();
        }

        @Override // tb.muz
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            this.f25107a.onError(th);
            this.b.b_();
        }

        @Override // tb.muz
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else {
                this.f25107a.onNext(t);
            }
        }

        @Override // tao.reactivex.d, tb.muz
        public void onSubscribe(nam namVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ab33248", new Object[]{this, namVar});
            } else if (!tao.reactivex.d.g.g.a(this.c, namVar)) {
            } else {
                long andSet = this.d.getAndSet(0L);
                if (andSet == 0) {
                    return;
                }
                a(andSet, namVar);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            lazySet(Thread.currentThread());
            muy<T> muyVar = this.f;
            this.f = null;
            muyVar.a(this);
        }
    }

    static {
        kge.a(-600305272);
    }

    public h(tao.reactivex.c<T> cVar, k kVar, boolean z) {
        super(cVar);
        this.c = kVar;
        this.d = z;
    }

    @Override // tao.reactivex.c
    public void b(muz<? super T> muzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c16447", new Object[]{this, muzVar});
            return;
        }
        k.c a2 = this.c.a();
        a aVar = new a(muzVar, a2, this.b, this.d);
        muzVar.onSubscribe(aVar);
        a2.a(aVar);
    }
}
