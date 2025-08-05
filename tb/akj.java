package tb;

/* loaded from: classes2.dex */
public class akj {

    /* renamed from: a  reason: collision with root package name */
    private float f25392a;
    private int b;

    public void a(float f) {
        this.f25392a += f;
        this.b++;
        int i = this.b;
        if (i == Integer.MAX_VALUE) {
            this.f25392a /= 2.0f;
            this.b = i / 2;
        }
    }
}
