package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class mzn implements mys {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f31334a;
    private final String b;
    private final String c;

    static {
        kge.a(1237800283);
        kge.a(-1347507322);
    }

    public mzn(String str, String str2, Map<String, String> map) {
        this.f31334a = map != null ? new HashMap(map) : new HashMap();
        this.c = str;
        this.b = str2;
    }

    @Override // tb.mys
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.c;
    }

    @Override // tb.mys
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    @Override // tb.mys
    public Iterable<Map.Entry<String, String>> c() {
        Set entrySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterable) ipChange.ipc$dispatch("1a1b2735", new Object[]{this});
        }
        synchronized (this) {
            entrySet = new HashMap(this.f31334a).entrySet();
        }
        return entrySet;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            synchronized (this) {
                if (StringUtils.isEmpty(str2)) {
                    this.f31334a.remove(str);
                } else {
                    this.f31334a.put(str, str2);
                }
            }
        }
    }

    public String a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        synchronized (this) {
            str2 = this.f31334a.get(str);
        }
        return str2;
    }

    public int d() {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        synchronized (this) {
            size = this.f31334a.size();
        }
        return size;
    }

    public Map<String, String> e() {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this});
        }
        synchronized (this) {
            hashMap = new HashMap(this.f31334a);
        }
        return hashMap;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "traceId:" + this.c + ", spanId:" + this.b;
    }
}
