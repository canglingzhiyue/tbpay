package tb;

/* loaded from: classes.dex */
public class byq<T> {

    /* renamed from: a  reason: collision with root package name */
    private int f26185a = 0;
    private int b = 0;
    private final Object[] c;
    private final int d;

    static {
        kge.a(17330736);
    }

    public byq(int i) {
        this.c = new Object[i];
        this.d = i;
    }

    public T a() {
        if (b()) {
            return null;
        }
        int i = this.f26185a;
        int i2 = this.b;
        int i3 = this.d;
        int i4 = ((i - i2) + i3) % i3;
        Object[] objArr = this.c;
        T t = (T) objArr[i4];
        objArr[i4] = null;
        this.b = i2 - 1;
        return t;
    }

    public T a(T t) {
        Object[] objArr = this.c;
        int i = this.f26185a;
        T t2 = (T) objArr[i];
        objArr[i] = t;
        int i2 = i + 1;
        this.f26185a = i2;
        int i3 = this.d;
        this.f26185a = i2 % i3;
        int i4 = this.b;
        if (i4 < i3) {
            this.b = i4 + 1;
        }
        return t2;
    }

    public boolean b() {
        return this.b == 0;
    }
}
