package dagger.internal;

/* loaded from: classes9.dex */
public final class a<T> implements javax.inject.a<T> {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f24764a = !a.class.desiredAssertionStatus();
    private static final Object b = new Object();
    private volatile javax.inject.a<T> c;
    private volatile Object d = b;

    private a(javax.inject.a<T> aVar) {
        if (f24764a || aVar != null) {
            this.c = aVar;
            return;
        }
        throw new AssertionError();
    }

    public static Object a(Object obj, Object obj2) {
        if (!(obj != b && !(obj instanceof d)) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public static <P extends javax.inject.a<T>, T> javax.inject.a<T> a(P p) {
        e.a(p);
        return p instanceof a ? p : new a(p);
    }

    @Override // javax.inject.a
    public T get() {
        T t = (T) this.d;
        if (t == b) {
            synchronized (this) {
                t = this.d;
                if (t == b) {
                    t = this.c.get();
                    this.d = a(this.d, t);
                    this.c = null;
                }
            }
        }
        return t;
    }
}
