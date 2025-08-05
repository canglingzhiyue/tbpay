package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.performance.cpu.g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class mkm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long b;
    private StackTraceElement[] c;
    private List<g> d;
    private g e;
    private g f;
    private long h;
    private StackTraceElement[] i;
    private List<g> j;
    private g k;
    private g l;
    private long m;
    private String n;
    private long o;

    /* renamed from: a  reason: collision with root package name */
    private final String f31067a = String.valueOf(System.currentTimeMillis());
    private final Map<String, Object> p = new HashMap();

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f31067a;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.b;
    }

    public mkm a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkm) ipChange.ipc$dispatch("daae2afb", new Object[]{this, new Long(j)});
        }
        this.b = j;
        return this;
    }

    public StackTraceElement[] c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StackTraceElement[]) ipChange.ipc$dispatch("a65039ad", new Object[]{this}) : this.c;
    }

    public mkm a(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkm) ipChange.ipc$dispatch("e126868e", new Object[]{this, stackTraceElementArr});
        }
        this.c = stackTraceElementArr;
        return this;
    }

    public g d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("28308641", new Object[]{this}) : this.e;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : e(this.e);
    }

    public mkm a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkm) ipChange.ipc$dispatch("43b5c1b9", new Object[]{this, gVar});
        }
        this.e = gVar;
        return this;
    }

    public List<g> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.d;
    }

    public g m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("6abf6458", new Object[]{this}) : this.f;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this}) : e(this.f);
    }

    public void b(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead8691f", new Object[]{this, gVar});
        } else {
            this.f = gVar;
        }
    }

    public long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue() : this.h;
    }

    public mkm b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkm) ipChange.ipc$dispatch("c931317c", new Object[]{this, new Long(j)});
        }
        this.h = j;
        return this;
    }

    public StackTraceElement[] h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StackTraceElement[]) ipChange.ipc$dispatch("d7ef0e48", new Object[]{this}) : this.i;
    }

    public mkm b(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkm) ipChange.ipc$dispatch("e88bbbad", new Object[]{this, stackTraceElementArr});
        }
        this.i = stackTraceElementArr;
        return this;
    }

    public List<g> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9f84bbd7", new Object[]{this}) : this.j;
    }

    public g p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("80ef03b5", new Object[]{this}) : this.l;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : e(this.l);
    }

    public void c(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d019d7e0", new Object[]{this, gVar});
        } else {
            this.l = gVar;
        }
    }

    public g j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("548fc4fb", new Object[]{this}) : this.k;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this}) : e(this.k);
    }

    public mkm d(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkm) ipChange.ipc$dispatch("18b2b416", new Object[]{this, gVar});
        }
        this.k = gVar;
        return this;
    }

    public long k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95766", new Object[]{this})).longValue() : this.m;
    }

    public mkm c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkm) ipChange.ipc$dispatch("b7b437fd", new Object[]{this, new Long(j)});
        }
        this.m = j;
        return this;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.n;
    }

    public mkm a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkm) ipChange.ipc$dispatch("7c727965", new Object[]{this, str});
        }
        this.n = str;
        return this;
    }

    public mkm d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkm) ipChange.ipc$dispatch("a6373e7e", new Object[]{this, new Long(j)});
        }
        this.o = j;
        return this;
    }

    public Map<String, Object> n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("11bb9f6a", new Object[]{this}) : this.p;
    }

    public mkm a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkm) ipChange.ipc$dispatch("24b3451a", new Object[]{this, map});
        }
        this.p.putAll(map);
        return this;
    }

    private String e(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ed66f7e", new Object[]{this, gVar});
        }
        if (gVar == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) Long.valueOf(gVar.c));
        jSONObject.put("name", (Object) gVar.d);
        jSONObject.put("stat", (Object) gVar.e);
        jSONObject.put("utime", (Object) Long.valueOf(gVar.f));
        jSONObject.put("stime", (Object) Long.valueOf(gVar.g));
        jSONObject.put("cutime", (Object) Long.valueOf(gVar.h));
        jSONObject.put("newAddFlag", (Object) Boolean.valueOf(gVar.j));
        return jSONObject.toString();
    }
}
