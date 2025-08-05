package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jpt extends jps<jpt> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String c;
    private boolean d;
    private Map<String, String> e;
    private Map<String, String> f;
    private int g;
    private boolean h;
    private String i;

    static {
        kge.a(826857875);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [tb.jpt, java.lang.Object] */
    @Override // tb.jps
    public /* synthetic */ jpt b(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("30ede31b", new Object[]{this, new Float(f)}) : a(f);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [tb.jpt, java.lang.Object] */
    @Override // tb.jps
    public /* synthetic */ jpt d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("1c8a47dd", new Object[]{this, str}) : a(str);
    }

    public jpt(String str, String str2, String str3, String str4) {
        super(str, str3, str4);
        this.g = -1;
        this.h = false;
        this.c = str2;
    }

    public static jpt a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jpt) ipChange.ipc$dispatch("953bc75c", new Object[]{str, str2}) : new jpt(str, str2, "27659-tracker", "http://taobao.com/jstracker/android/ultron.html");
    }

    public static jpt a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jpt) ipChange.ipc$dispatch("249e41c8", new Object[]{str, str2, str3, str4}) : new jpt(str, str2, str3, str4);
    }

    public jpt a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jpt) ipChange.ipc$dispatch("1f43f36c", new Object[]{this, new Boolean(z)});
        }
        this.d = z;
        return this;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.c;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.i;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.d;
    }

    public Map<String, String> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3fbd54e4", new Object[]{this}) : this.e;
    }

    public Map<String, String> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this}) : this.f;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.g;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.h;
    }

    public jpt a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jpt) ipChange.ipc$dispatch("7c712fe6", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public jpt c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jpt) ipChange.ipc$dispatch("7dca8724", new Object[]{this, str});
        }
        this.i = str;
        return this;
    }

    public jpt a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jpt) ipChange.ipc$dispatch("9871d00", new Object[]{this, new Float(f)});
        }
        this.f29685a = f;
        return this;
    }

    public jpt a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jpt) ipChange.ipc$dispatch("e663705d", new Object[]{this, new Integer(i)});
        }
        this.g = i;
        return this;
    }

    public jpt b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jpt) ipChange.ipc$dispatch("dc6f9ed", new Object[]{this, new Boolean(z)});
        }
        this.h = z;
        return this;
    }

    public jpt d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jpt) ipChange.ipc$dispatch("429bacf9", new Object[]{this, str, str2});
        }
        if (str != null && str2 != null) {
            if (this.e == null) {
                this.e = new HashMap();
            }
            this.e.put(str, str2);
        }
        return this;
    }

    public jpt c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jpt) ipChange.ipc$dispatch("8d10b1a", new Object[]{this, str, str2});
        }
        if (str != null && str2 != null) {
            if (this.f == null) {
                this.f = new HashMap();
            }
            this.f.put(str, str2);
        }
        return this;
    }
}
