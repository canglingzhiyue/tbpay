package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class rjb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_ARRAY = 7;
    public static final int TYPE_BLOCK = 6;
    public static final int TYPE_DOUBLE = 2;
    public static final int TYPE_IDENTIFIER = 0;
    public static final int TYPE_INT = 1;
    public static final int TYPE_KEYWORD = 4;
    public static final int TYPE_OPERATOR = 5;
    public static final int TYPE_STRING = 3;

    /* renamed from: a  reason: collision with root package name */
    private String f33179a;
    private int b;

    static {
        kge.a(-1113284400);
    }

    public rjb(String str, int i) {
        this.f33179a = str;
        this.b = i;
    }

    public Object a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9798556e", new Object[]{this, obj});
        }
        int i = this.b;
        if (i == 0) {
            return riy.a(obj, this.f33179a);
        }
        if (i == 3) {
            return this.f33179a;
        }
        if (i == 1) {
            try {
                return Integer.valueOf(Integer.parseInt(this.f33179a));
            } catch (Exception unused) {
                return 0;
            }
        } else if (i == 2) {
            try {
                return Double.valueOf(Double.parseDouble(this.f33179a));
            } catch (Exception unused2) {
                return 0;
            }
        } else if (i == 4) {
            return riy.KEYWORDS.get(this.f33179a);
        } else {
            throw new IllegalArgumentException("unhandled token type " + this.b);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return riy.BLOCK_START_STR + this.f33179a + "," + this.b + '}';
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f33179a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }
}
