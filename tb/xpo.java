package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes9.dex */
public class xpo extends xpl<xpo> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String c;
    private String d;
    private boolean e;
    private long f;
    private Map<String, String> g;

    static {
        kge.a(176424773);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, tb.xpo] */
    @Override // tb.xpl
    public /* synthetic */ xpo a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e6bc49da", new Object[]{this, new Float(f)}) : b(f);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, tb.xpo] */
    @Override // tb.xpl
    public /* synthetic */ xpo a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("17307540", new Object[]{this, str}) : d(str);
    }

    public xpo(String str, String str2, String str3, String str4, boolean z) {
        super(str, str2, str3);
        this.d = str4;
        this.e = z;
    }

    public xpo c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpo) ipChange.ipc$dispatch("7dd0e3bb", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public xpo a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpo) ipChange.ipc$dispatch("dab33e13", new Object[]{this, new Long(j)});
        }
        this.f = j;
        return this;
    }

    public xpo a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpo) ipChange.ipc$dispatch("24b85832", new Object[]{this, map});
        }
        this.g = map;
        return this;
    }

    public xpo d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpo) ipChange.ipc$dispatch("7e7d8f5a", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public xpo b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpo) ipChange.ipc$dispatch("f8108018", new Object[]{this, new Float(f)});
        }
        this.f34460a = f;
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

    public long j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe5", new Object[]{this})).longValue() : this.f;
    }

    public Map<String, String> k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a8bc7a27", new Object[]{this}) : this.g;
    }
}
