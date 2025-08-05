package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes6.dex */
public class sda extends jps<sda> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String c;
    private String d;
    private boolean e;
    private long f;
    private Map<String, String> g;

    static {
        kge.a(657461340);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, tb.sda] */
    @Override // tb.jps
    public /* synthetic */ sda b(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("30ede31b", new Object[]{this, new Float(f)}) : a(f);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, tb.sda] */
    @Override // tb.jps
    public /* synthetic */ sda d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("1c8a47dd", new Object[]{this, str}) : b(str);
    }

    public sda(String str, String str2, String str3, String str4, boolean z) {
        super(str, str2, str3);
        this.d = str4;
        this.e = z;
    }

    public static sda a(String str, String str2, boolean z, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sda) ipChange.ipc$dispatch("ba6e60ea", new Object[]{str, str2, new Boolean(z), str3, str4}) : new sda(str, str3, str4, str2, z);
    }

    public sda a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sda) ipChange.ipc$dispatch("7c7517e4", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public sda a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sda) ipChange.ipc$dispatch("dab0c97a", new Object[]{this, new Long(j)});
        }
        this.f = j;
        return this;
    }

    public sda a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sda) ipChange.ipc$dispatch("24b5e399", new Object[]{this, map});
        }
        this.g = map;
        return this;
    }

    public sda b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sda) ipChange.ipc$dispatch("7d21c383", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public sda a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sda) ipChange.ipc$dispatch("98b04fe", new Object[]{this, new Float(f)});
        }
        this.f29685a = f;
        return this;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.c;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.d;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.e;
    }

    public long i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2864", new Object[]{this})).longValue() : this.f;
    }

    public Map<String, String> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("db121866", new Object[]{this}) : this.g;
    }
}
