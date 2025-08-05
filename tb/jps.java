package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public abstract class jps<M> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f29685a = 0.001f;
    public String b;
    private final String c;
    private final String d;
    private final String e;
    private String f;

    static {
        kge.a(-748907277);
    }

    public jps(String str, String str2, String str3) {
        this.c = str2;
        this.d = str == null ? "Ultron" : str;
        this.e = str3;
    }

    public M d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ipChange.ipc$dispatch("1c8a47dd", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : this.f;
    }

    public jps<M> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jps) ipChange.ipc$dispatch("7f23de43", new Object[]{this, str});
        }
        this.f = str;
        return this;
    }

    public M b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ipChange.ipc$dispatch("30ede31b", new Object[]{this, new Float(f)});
        }
        this.f29685a = f;
        return this;
    }

    public float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : this.f29685a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.d;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        String str = this.b;
        return str == null ? "" : str;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
    }
}
