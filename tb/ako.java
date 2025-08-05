package tb;

/* loaded from: classes2.dex */
public class ako<T> {

    /* renamed from: a  reason: collision with root package name */
    private final akn<T> f25397a;
    private ahg<?, ?> b;
    protected T e;

    public ako() {
        this.f25397a = new akn<>();
        this.e = null;
    }

    public ako(T t) {
        this.f25397a = new akn<>();
        this.e = null;
        this.e = t;
    }

    public final T a(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return a(this.f25397a.a(f, f2, t, t2, f3, f4, f5));
    }

    public T a(akn<T> aknVar) {
        return this.e;
    }

    public final void a(ahg<?, ?> ahgVar) {
        this.b = ahgVar;
    }
}
