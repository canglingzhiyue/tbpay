package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class qpy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_ID = "appId";
    public static final String PLUGIN_ID = "pluginId";

    /* renamed from: a  reason: collision with root package name */
    private String f33029a;
    private String b;
    private Map<String, String> c;
    private byte[] d;
    private long e;
    private Map<String, String> f;

    static {
        kge.a(376447225);
    }

    public static /* synthetic */ long a(qpy qpyVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d906c1a", new Object[]{qpyVar, new Long(j)})).longValue();
        }
        qpyVar.e = j;
        return j;
    }

    public static /* synthetic */ String a(qpy qpyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9b474f8", new Object[]{qpyVar, str});
        }
        qpyVar.f33029a = str;
        return str;
    }

    public static /* synthetic */ Map a(qpy qpyVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("967acf5c", new Object[]{qpyVar, map});
        }
        qpyVar.c = map;
        return map;
    }

    public static /* synthetic */ byte[] a(qpy qpyVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5c2049d8", new Object[]{qpyVar, bArr});
        }
        qpyVar.d = bArr;
        return bArr;
    }

    public static /* synthetic */ String b(qpy qpyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e37f16d7", new Object[]{qpyVar, str});
        }
        qpyVar.b = str;
        return str;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("737472c7", new Object[0]) : new a();
    }

    private qpy() {
        this.f = new HashMap();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f33029a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : StringUtils.isEmpty(this.b) ? "GET" : this.b;
    }

    public Map<String, String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.c;
    }

    public byte[] e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("aef483f1", new Object[]{this}) : this.d;
    }

    public long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue() : this.e;
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private qpy f33030a = new qpy();

        static {
            kge.a(2005331664);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("30d8b63d", new Object[]{this, str});
            }
            qpy.a(this.f33030a, str);
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b908f61c", new Object[]{this, str});
            }
            qpy.b(this.f33030a, str);
            return this;
        }

        public a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cc1568b2", new Object[]{this, map});
            }
            qpy.a(this.f33030a, map);
            return this;
        }

        public a a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7bd7a7e0", new Object[]{this, bArr});
            }
            qpy.a(this.f33030a, bArr);
            return this;
        }

        public a a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("eeee5a53", new Object[]{this, new Long(j)});
            }
            qpy.a(this.f33030a, j);
            return this;
        }

        public qpy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (qpy) ipChange.ipc$dispatch("f09b624", new Object[]{this}) : this.f33030a;
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        if (this.f == null) {
            this.f = new HashMap();
        }
        this.f.put(str, str2);
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        Map<String, String> map = this.f;
        return (map == null || !map.containsKey(str)) ? "" : this.f.get(str);
    }
}
