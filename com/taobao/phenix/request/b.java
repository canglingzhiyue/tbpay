package com.taobao.phenix.request;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import tb.kge;
import tb.nhx;
import tb.nia;
import tb.nir;

/* loaded from: classes7.dex */
public class b extends com.taobao.rxm.request.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int A;
    private boolean B;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.phenix.intf.c f18938a;
    private String b;
    private c c;
    private long d;
    private ImageStatistics e;
    private long f;
    private boolean g;
    private c h;
    private String i;
    private int j;
    private int k;
    private int l;
    private int m;
    private Map<String, String> n;
    private Map<String, String> o;
    private Future<?> p;
    private PexodeOptions q;
    private int r;
    private int s;
    private boolean t;
    private nia[] u;
    private int v;
    private String w;
    private boolean x;
    private boolean y;
    private boolean z;

    static {
        kge.a(1147196768);
    }

    public static boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{new Integer(i), new Integer(i2)})).booleanValue() : (i & i2) > 0;
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == 74368342) {
            super.O();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public b(String str, com.taobao.phenix.cache.a aVar, boolean z) {
        super(z);
        this.r = 17;
        this.A = 17;
        this.s = 17;
        this.B = false;
        this.v = 0;
        this.c = new c(str, aVar);
        this.e = new ImageStatistics(this.c);
        this.f18938a = new com.taobao.phenix.intf.c(this);
        this.d = System.currentTimeMillis();
        this.j = 1;
        nhx.a(b());
        this.e.a(this.r);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public synchronized ImageStatistics b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStatistics) ipChange.ipc$dispatch("9cb1c2e8", new Object[]{this});
        }
        return this.e;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.j;
    }

    public void a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c190d17", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        if (z) {
            this.j |= i;
        } else {
            this.j &= ~i;
        }
        Q();
    }

    private synchronized void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (this.w == null) {
                this.w = str;
            } else {
                this.w += str;
            }
            Q();
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.v |= 4;
        } else {
            this.v &= -5;
        }
        Q();
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.v |= 2;
        } else {
            this.v &= -3;
        }
        Q();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.v |= 1;
        Q();
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.t;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : (this.v & 4) > 0;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : (this.v & 2) > 0;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : (this.v & 1) > 0;
    }

    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        d i2 = y().i();
        i2.m = i;
        i2.n = z;
        StringBuilder sb = new StringBuilder();
        sb.append("#THUMBNAIL$");
        if (z) {
            i *= 10000;
        }
        sb.append(i);
        String sb2 = sb.toString();
        y().a(sb2);
        d(sb2);
    }

    public void a(nia[] niaVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("829394d7", new Object[]{this, niaVarArr});
            return;
        }
        String str = "";
        for (nia niaVar : niaVarArr) {
            str = str + "#PROCESSOR_" + niaVar.getClass().hashCode();
            String id = niaVar.getId();
            if (!StringUtils.isEmpty(id)) {
                str = str + "$" + id;
            }
        }
        this.u = niaVarArr;
        y().a(str);
        d(str);
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
        } else {
            this.B = z;
        }
    }

    public boolean U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[]{this})).booleanValue() : this.B;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.l == i) {
        } else {
            this.l = i;
            this.c.a(this.l, this.m);
            Q();
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (this.m == i) {
        } else {
            this.m = i;
            this.c.a(this.l, this.m);
            Q();
        }
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.k;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.s;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.s = i;
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.r;
        if (i2 == i) {
            return;
        }
        this.A = i2;
        this.r = i;
        this.e.a(this.r);
        Q();
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.y;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : this.r;
    }

    public int V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4d169d0", new Object[]{this})).intValue() : this.A;
    }

    public synchronized com.taobao.phenix.intf.c m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.phenix.intf.c) ipChange.ipc$dispatch("752cd73a", new Object[]{this});
        }
        return this.f18938a;
    }

    public nia[] n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nia[]) ipChange.ipc$dispatch("6f3c0424", new Object[]{this}) : this.u;
    }

    private synchronized void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[]{this});
            return;
        }
        if (this.i != null) {
            this.i = null;
        }
    }

    @Override // com.taobao.rxm.request.c
    public synchronized String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this});
        }
        if (this.i == null) {
            String c = this.c.c();
            StringBuilder sb = new StringBuilder(c.length() + 30);
            sb.append("#SLEVEL$");
            sb.append(this.j);
            sb.append("#FLAGS$");
            sb.append(this.v);
            sb.append("#MAXW$");
            sb.append(this.l);
            sb.append("#MAXH$");
            sb.append(this.m);
            sb.append("#SPRIOR$");
            sb.append(I());
            sb.append("#DPRIOR$");
            sb.append(this.r);
            sb.append("#CATALOG$");
            sb.append(c);
            sb.append(this.c.d());
            if (this.h != null) {
                sb.append("#SECOND$");
                sb.append(this.h.c());
                sb.append('$');
                sb.append(this.h.d());
            }
            if (this.w != null) {
                sb.append(this.w);
            }
            this.i = sb.substring(0);
        }
        return this.i;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this}) : this.c.g();
    }

    public int q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue() : this.l;
    }

    public int r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue() : this.m;
    }

    public long s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66a136e", new Object[]{this})).longValue() : this.d;
    }

    public long t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aef", new Object[]{this})).longValue() : this.f;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.f = j;
        }
    }

    public String u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("326979a4", new Object[]{this}) : this.c.a();
    }

    public String v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this}) : this.c.b();
    }

    public String w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f74eee2", new Object[]{this}) : this.c.c();
    }

    public int x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b088f2", new Object[]{this})).intValue() : this.c.d();
    }

    public int R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4990bcc", new Object[]{this})).intValue() : this.c.n();
    }

    public c y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("526fcb3a", new Object[]{this}) : this.c;
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        } else {
            this.h = null;
        }
    }

    public c A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("cb3eab02", new Object[]{this}) : this.h;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.h = new c(str, this.c.e());
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
            return;
        }
        this.z = z;
        this.c.a(z);
        c cVar = this.h;
        if (cVar == null) {
            return;
        }
        cVar.a(z);
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a7235e", new Object[]{this})).booleanValue() : this.z;
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b53adf", new Object[]{this})).booleanValue() : this.c.o();
    }

    public Map<String, String> B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b872d23e", new Object[]{this}) : this.n;
    }

    public synchronized void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        if (this.n == null) {
            this.n = new HashMap();
            this.e.a(this.n);
        }
        this.n.put(str, str2);
    }

    public synchronized void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        this.o = map;
        this.e.b(this.o);
    }

    public Future<?> C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("f63857e0", new Object[]{this}) : this.p;
    }

    public void a(Future<?> future) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f9effe", new Object[]{this, future});
        } else {
            this.p = future;
        }
    }

    public PexodeOptions D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PexodeOptions) ipChange.ipc$dispatch("d4dcfd5a", new Object[]{this}) : this.q;
    }

    public void a(PexodeOptions pexodeOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12765737", new Object[]{this, pexodeOptions});
        } else {
            this.q = pexodeOptions;
        }
    }

    public Map<String, Long> E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2171f781", new Object[]{this});
        }
        if (P() == null) {
            return new HashMap();
        }
        return ((nir) P()).a();
    }

    @Override // com.taobao.rxm.request.c
    public void a(com.taobao.rxm.request.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ebd0ef", new Object[]{this, cVar});
            return;
        }
        b bVar = (b) cVar;
        ImageStatistics b = bVar.b();
        this.e.e(true);
        this.e.a(b.b());
        this.e.a(b.n());
        this.e.b(b.c());
        Map<String, Long> E = E();
        for (Map.Entry<String, Long> entry : bVar.E().entrySet()) {
            if (!E.containsKey(entry.getKey())) {
                E.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : this.g;
    }

    public synchronized void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        super.O();
        this.g = true;
        this.d = System.currentTimeMillis();
        this.h = null;
        this.p = null;
        if (!str.equals(this.c.g())) {
            this.c = new c(str, this.c.e());
            this.i = null;
        }
        String str2 = this.e != null ? this.e.f18937a : "";
        this.e = new ImageStatistics(this.c, true);
        if (!StringUtils.isEmpty(str2)) {
            this.e.f18937a = str2;
        }
        nhx.a(this.e);
        if (this.n != null) {
            this.n.remove("inner_is_async_http");
            this.n.put("retry_request", "true");
            this.e.a(this.n);
        }
        this.e.a(this.r);
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.x = z;
        if (!this.x) {
            return;
        }
        y().a("#FSTATIC");
        d("#FSTATIC");
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue() : this.x;
    }
}
