package tao.reactivex.d.f;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.kge;
import tb.mup;

/* loaded from: classes9.dex */
public final class a<T> implements mup<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<C1081a<T>> f25135a = new AtomicReference<>();
    private final AtomicReference<C1081a<T>> b = new AtomicReference<>();

    /* renamed from: tao.reactivex.d.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C1081a<E> extends AtomicReference<C1081a<E>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private E f25136a;

        static {
            kge.a(-599382099);
        }

        public C1081a() {
        }

        public C1081a(E e) {
            a((C1081a<E>) e);
        }

        public E a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (E) ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
            }
            E b = b();
            a((C1081a<E>) null);
            return b;
        }

        public void a(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, e});
            } else {
                this.f25136a = e;
            }
        }

        public void a(C1081a<E> c1081a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c14a6cc", new Object[]{this, c1081a});
            } else {
                lazySet(c1081a);
            }
        }

        public E b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (E) ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.f25136a;
        }

        public C1081a<E> c() {
            IpChange ipChange = $ipChange;
            return (C1081a) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("366aa18e", new Object[]{this}) : get());
        }
    }

    static {
        kge.a(-1471013136);
        kge.a(-1471016014);
    }

    public a() {
        C1081a<T> c1081a = new C1081a<>();
        b(c1081a);
        a((C1081a) c1081a);
    }

    public C1081a<T> a() {
        IpChange ipChange = $ipChange;
        return (C1081a) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("c3c8800c", new Object[]{this}) : this.f25135a.get());
    }

    public C1081a<T> a(C1081a<T> c1081a) {
        IpChange ipChange = $ipChange;
        return (C1081a) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("a4891770", new Object[]{this, c1081a}) : this.f25135a.getAndSet(c1081a));
    }

    @Override // tb.muw
    public boolean a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, t})).booleanValue();
        }
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        C1081a<T> c1081a = new C1081a<>(t);
        a((C1081a) c1081a).a(c1081a);
        return true;
    }

    public C1081a<T> b() {
        IpChange ipChange = $ipChange;
        return (C1081a) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("fd1990cd", new Object[]{this}) : this.b.get());
    }

    public void b(C1081a<T> c1081a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce5ae2b", new Object[]{this, c1081a});
        } else {
            this.b.lazySet(c1081a);
        }
    }

    @Override // tb.mup, tb.muw
    public T c() {
        C1081a<T> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
        }
        C1081a<T> f = f();
        C1081a<T> c2 = f.c();
        if (c2 != null) {
            T a2 = c2.a();
            b(c2);
            return a2;
        } else if (f == a()) {
            return null;
        } else {
            do {
                c = f.c();
            } while (c == null);
            T a3 = c.a();
            b(c);
            return a3;
        }
    }

    @Override // tb.muw
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : b() == a();
    }

    @Override // tb.muw
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        while (c() != null && !d()) {
        }
    }

    public C1081a<T> f() {
        IpChange ipChange = $ipChange;
        return (C1081a) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("e25dd3d1", new Object[]{this}) : this.b.get());
    }
}
