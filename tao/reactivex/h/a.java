package tao.reactivex.h;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import tao.reactivex.j;
import tb.jdz;
import tb.kge;
import tb.kgk;
import tb.mux;

/* loaded from: classes9.dex */
public final class a<T> extends c<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final C1084a[] f25165a;
    public static final C1084a[] b;
    public final AtomicReference<C1084a<T>[]> c = new AtomicReference<>(b);
    public Throwable d;

    /* renamed from: tao.reactivex.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C1084a<T> extends AtomicBoolean implements jdz {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final j<? super T> f25166a;
        public final a<T> b;

        static {
            kge.a(-1467324198);
            kge.a(1964944663);
        }

        public C1084a(j<? super T> jVar, a<T> aVar) {
            this.f25166a = jVar;
            this.b = aVar;
        }

        public void a(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
            } else if (get()) {
            } else {
                this.f25166a.onNext(t);
            }
        }

        public void a(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            } else if (get()) {
                mux.a(th);
            } else {
                this.f25166a.onError(th);
            }
        }

        @Override // tb.jdz
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : get();
        }

        @Override // tb.jdz
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else if (!compareAndSet(false, true)) {
            } else {
                this.b.b(this);
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (get()) {
            } else {
                this.f25166a.onComplete();
            }
        }
    }

    static {
        kge.a(1964951389);
        f25165a = new C1084a[0];
        b = new C1084a[0];
    }

    public static <T> a<T> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2b56a7de", new Object[0]) : new a<>();
    }

    @Override // tao.reactivex.e
    public void a(j<? super T> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac18b2c", new Object[]{this, jVar});
            return;
        }
        C1084a<T> c1084a = new C1084a<>(jVar, this);
        jVar.onSubscribe(c1084a);
        if (a((C1084a) c1084a)) {
            if (!c1084a.b()) {
                return;
            }
            b(c1084a);
            return;
        }
        Throwable th = this.d;
        if (th != null) {
            jVar.onError(th);
        } else {
            jVar.onComplete();
        }
    }

    public boolean a(C1084a<T> c1084a) {
        C1084a<T>[] c1084aArr;
        C1084a<T>[] c1084aArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ddebac3", new Object[]{this, c1084a})).booleanValue();
        }
        do {
            c1084aArr = this.c.get();
            if (c1084aArr == f25165a) {
                return false;
            }
            int length = c1084aArr.length;
            c1084aArr2 = new C1084a[length + 1];
            System.arraycopy(c1084aArr, 0, c1084aArr2, 0, length);
            c1084aArr2[length] = c1084a;
        } while (!this.c.compareAndSet(c1084aArr, c1084aArr2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(C1084a<T> c1084a) {
        C1084a<T>[] c1084aArr;
        C1084a[] c1084aArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb80dde", new Object[]{this, c1084a});
            return;
        }
        do {
            c1084aArr = this.c.get();
            if (c1084aArr == f25165a || c1084aArr == b) {
                return;
            }
            int length = c1084aArr.length;
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (c1084aArr[i2] == c1084a) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c1084aArr2 = b;
            } else {
                C1084a[] c1084aArr3 = new C1084a[length - 1];
                System.arraycopy(c1084aArr, 0, c1084aArr3, 0, i);
                System.arraycopy(c1084aArr, i + 1, c1084aArr3, i, (length - i) - 1);
                c1084aArr2 = c1084aArr3;
            }
        } while (!this.c.compareAndSet(c1084aArr, c1084aArr2));
    }

    @Override // tao.reactivex.j
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            return;
        }
        C1084a<T>[] c1084aArr = this.c.get();
        C1084a<T>[] c1084aArr2 = f25165a;
        if (c1084aArr == c1084aArr2) {
            return;
        }
        for (C1084a<T> c1084a : this.c.getAndSet(c1084aArr2)) {
            c1084a.c();
        }
    }

    @Override // tao.reactivex.j
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            return;
        }
        kgk.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C1084a<T>[] c1084aArr = this.c.get();
        C1084a<T>[] c1084aArr2 = f25165a;
        if (c1084aArr == c1084aArr2) {
            mux.a(th);
            return;
        }
        this.d = th;
        for (C1084a<T> c1084a : this.c.getAndSet(c1084aArr2)) {
            c1084a.a(th);
        }
    }

    @Override // tao.reactivex.j
    public void onNext(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            return;
        }
        kgk.a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.c.get() == f25165a) {
            return;
        }
        for (C1084a<T> c1084a : this.c.get()) {
            c1084a.a((C1084a<T>) t);
        }
    }

    @Override // tao.reactivex.j
    public void onSubscribe(jdz jdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940fff22", new Object[]{this, jdzVar});
        } else if (this.c.get() != f25165a) {
        } else {
            jdzVar.b_();
        }
    }
}
