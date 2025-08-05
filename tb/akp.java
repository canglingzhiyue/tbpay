package tb;

/* loaded from: classes2.dex */
public class akp {

    /* renamed from: a  reason: collision with root package name */
    private float f25398a;
    private float b;

    public akp() {
        this(1.0f, 1.0f);
    }

    public akp(float f, float f2) {
        this.f25398a = f;
        this.b = f2;
    }

    public float a() {
        return this.f25398a;
    }

    public void a(float f, float f2) {
        this.f25398a = f;
        this.b = f2;
    }

    public float b() {
        return this.b;
    }

    public boolean b(float f, float f2) {
        return this.f25398a == f && this.b == f2;
    }

    public String toString() {
        return a() + "x" + b();
    }
}
