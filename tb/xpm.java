package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class xpm extends xpl<xpm> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String c;
    private String d;
    private boolean e;
    private Map<String, String> f;
    private Map<String, String> g;
    private int h;
    private boolean i;

    static {
        kge.a(-1887782340);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [tb.xpm, java.lang.Object] */
    @Override // tb.xpl
    public /* synthetic */ xpm a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e6bc49da", new Object[]{this, new Float(f)}) : b(f);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [tb.xpm, java.lang.Object] */
    @Override // tb.xpl
    public /* synthetic */ xpm a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("17307540", new Object[]{this, str}) : c(str);
    }

    public xpm(String str, String str2, String str3, String str4) {
        super(str, str3, str4);
        this.h = -1;
        this.i = false;
        this.c = str2;
    }

    public static xpm a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xpm) ipChange.ipc$dispatch("24a49e21", new Object[]{str, str2, str3, str4}) : new xpm(str, str2, str3, str4);
    }

    public xpm a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpm) ipChange.ipc$dispatch("1f4a4fc5", new Object[]{this, new Boolean(z)});
        }
        this.e = z;
        return this;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.c;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.d;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.e;
    }

    public Map<String, String> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("db121866", new Object[]{this}) : this.f;
    }

    public Map<String, String> k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a8bc7a27", new Object[]{this}) : this.g;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : this.h;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.i;
    }

    public xpm c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpm) ipChange.ipc$dispatch("7dd0e37d", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public xpm b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpm) ipChange.ipc$dispatch("f8107fda", new Object[]{this, new Float(f)});
        }
        this.f34460a = f;
        return this;
    }

    public xpm a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpm) ipChange.ipc$dispatch("e669ccb6", new Object[]{this, new Integer(i)});
        }
        this.h = i;
        return this;
    }

    public xpm a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpm) ipChange.ipc$dispatch("954223b5", new Object[]{this, str, str2});
        }
        if (str != null && str2 != null) {
            if (this.f == null) {
                this.f = new HashMap();
            }
            this.f.put(str, str2);
        }
        return this;
    }

    public xpm b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpm) ipChange.ipc$dispatch("cf0cc594", new Object[]{this, str, str2});
        }
        if (str != null && str2 != null) {
            if (this.g == null) {
                this.g = new HashMap();
            }
            this.g.put(str, str2);
        }
        return this;
    }
}
