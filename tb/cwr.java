package tb;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class cwr {

    /* renamed from: a  reason: collision with root package name */
    private final int f26573a;
    public static final cwr UNKNOWN = new cwr(0);
    public static final cwr CHINA = new cwr(1);
    public static final cwr GERMANY = new cwr(2);
    public static final cwr RUSSIA = new cwr(3);
    public static final cwr SINGAPORE = new cwr(4);

    private cwr(int i) {
        this.f26573a = i;
    }

    private int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public String a() {
        int i = this.f26573a;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "SG" : "RU" : "DE" : "CN";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f26573a == ((cwr) obj).f26573a;
    }

    public int hashCode() {
        return a(Integer.valueOf(this.f26573a));
    }
}
