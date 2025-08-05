package dagger.internal;

/* loaded from: classes9.dex */
public final class c<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final c<Object> f24765a = new c<>(null);
    private final T b;

    private c(T t) {
        this.b = t;
    }

    public static <T> b<T> a(T t) {
        return new c(e.a(t, "instance cannot be null"));
    }

    @Override // javax.inject.a
    public T get() {
        return this.b;
    }
}
