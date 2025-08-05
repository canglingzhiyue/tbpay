package tb;

import com.airbnb.lottie.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ahg<K, A> {
    protected ako<A> c;
    private final c<K> e;

    /* renamed from: a  reason: collision with root package name */
    final List<a> f25338a = new ArrayList(1);
    private boolean d = false;
    protected float b = 0.0f;
    private A f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    /* loaded from: classes2.dex */
    public interface a {
        void onValueChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class b<T> implements c<T> {
        private b() {
        }

        @Override // tb.ahg.c
        public boolean a() {
            return true;
        }

        @Override // tb.ahg.c
        public boolean a(float f) {
            return false;
        }

        @Override // tb.ahg.c
        public akm<T> b() {
            akh.c("not implemented");
            return null;
        }

        @Override // tb.ahg.c
        public boolean b(float f) {
            akh.c("not implemented");
            return false;
        }

        @Override // tb.ahg.c
        public float c() {
            return 0.0f;
        }

        @Override // tb.ahg.c
        public float d() {
            return 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface c<T> {
        boolean a();

        boolean a(float f);

        akm<T> b();

        boolean b(float f);

        float c();

        float d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class d<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        private final List<? extends akm<T>> f25339a;
        private akm<T> c = null;
        private float d = -1.0f;
        private akm<T> b = c(0.0f);

        d(List<? extends akm<T>> list) {
            this.f25339a = list;
        }

        private akm<T> c(float f) {
            List<? extends akm<T>> list;
            akm<T> akmVar = this.f25339a.get(list.size() - 1);
            if (f >= akmVar.c()) {
                return akmVar;
            }
            for (int size = this.f25339a.size() - 2; size > 0; size--) {
                akm<T> akmVar2 = this.f25339a.get(size);
                if (this.b != akmVar2 && akmVar2.a(f)) {
                    return akmVar2;
                }
            }
            return this.f25339a.get(0);
        }

        @Override // tb.ahg.c
        public boolean a() {
            return false;
        }

        @Override // tb.ahg.c
        public boolean a(float f) {
            if (this.b.a(f)) {
                return !this.b.e();
            }
            this.b = c(f);
            return true;
        }

        @Override // tb.ahg.c
        public akm<T> b() {
            return this.b;
        }

        @Override // tb.ahg.c
        public boolean b(float f) {
            if (this.c == this.b && this.d == f) {
                return true;
            }
            this.c = this.b;
            this.d = f;
            return false;
        }

        @Override // tb.ahg.c
        public float c() {
            return this.f25339a.get(0).c();
        }

        @Override // tb.ahg.c
        public float d() {
            List<? extends akm<T>> list = this.f25339a;
            return list.get(list.size() - 1).d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class e<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        private final akm<T> f25340a;
        private float b = -1.0f;

        e(List<? extends akm<T>> list) {
            this.f25340a = list.get(0);
        }

        @Override // tb.ahg.c
        public boolean a() {
            return false;
        }

        @Override // tb.ahg.c
        public boolean a(float f) {
            return !this.f25340a.e();
        }

        @Override // tb.ahg.c
        public akm<T> b() {
            return this.f25340a;
        }

        @Override // tb.ahg.c
        public boolean b(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // tb.ahg.c
        public float c() {
            return this.f25340a.c();
        }

        @Override // tb.ahg.c
        public float d() {
            return this.f25340a.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ahg(List<? extends akm<K>> list) {
        this.e = a(list);
    }

    private static <T> c<T> a(List<? extends akm<T>> list) {
        return list.isEmpty() ? new b() : list.size() == 1 ? new e(list) : new d(list);
    }

    private float i() {
        if (this.g == -1.0f) {
            this.g = this.e.c();
        }
        return this.g;
    }

    abstract A a(akm<K> akmVar, float f);

    protected A a(akm<K> akmVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void a() {
        this.d = true;
    }

    public void a(float f) {
        if (this.e.a()) {
            return;
        }
        if (f < i()) {
            f = i();
        } else if (f > f()) {
            f = f();
        }
        if (f == this.b) {
            return;
        }
        this.b = f;
        if (!this.e.a(f)) {
            return;
        }
        b();
    }

    public void a(a aVar) {
        this.f25338a.add(aVar);
    }

    public void a(ako<A> akoVar) {
        ako<A> akoVar2 = this.c;
        if (akoVar2 != null) {
            akoVar2.a((ahg<?, ?>) null);
        }
        this.c = akoVar;
        if (akoVar != null) {
            akoVar.a((ahg<?, ?>) this);
        }
    }

    public void b() {
        for (int i = 0; i < this.f25338a.size(); i++) {
            this.f25338a.get(i).onValueChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public akm<K> c() {
        f.a("BaseKeyframeAnimation#getCurrentKeyframe");
        akm<K> b2 = this.e.b();
        f.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        if (this.d) {
            return 0.0f;
        }
        akm<K> c2 = c();
        if (c2 == null) {
            akh.c("The result of BaseKeyframeAnimation#getCurrentKeyframe is null!!");
            return 0.0f;
        } else if (!c2.e()) {
            return (this.b - c2.c()) / (c2.d() - c2.c());
        } else {
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float e() {
        akm<K> c2 = c();
        if (c2.e()) {
            return 0.0f;
        }
        return c2.c.getInterpolation(d());
    }

    float f() {
        if (this.h == -1.0f) {
            this.h = this.e.d();
        }
        return this.h;
    }

    public A g() {
        float d2 = d();
        if (this.c != null || !this.e.b(d2)) {
            akm<K> c2 = c();
            A a2 = (c2.d == null || c2.e == null) ? a(c2, e()) : a(c2, d2, c2.d.getInterpolation(d2), c2.e.getInterpolation(d2));
            this.f = a2;
            return a2;
        }
        return this.f;
    }

    public float h() {
        return this.b;
    }
}
