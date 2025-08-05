package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMRequester;
import com.taobao.android.ultron.datamodel.imp.NextRpcRequester;
import com.taobao.android.ultron.datamodel.imp.d;
import com.taobao.android.ultron.datamodel.imp.j;
import java.util.List;
import java.util.Map;
import tb.jnx;

/* loaded from: classes6.dex */
public class jnw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAMESPACE = "trade_debug";
    public boolean A;
    public boolean B;
    public NextRpcRequester.NextRpcAttachedResponseStrategy E;
    private List<jnx.a> M;

    /* renamed from: a  reason: collision with root package name */
    public String f29651a;
    public String b;
    public String e;
    public String f;
    public int g;
    public Map<String, String> j;
    public Map<String, String> k;
    public String m;
    public jny n;
    public IDMComponent q;
    public Class<?> r;
    public String u;
    public Context x;
    public SharedPreferences y;
    public boolean c = true;
    public boolean d = true;
    public boolean h = true;
    public boolean i = false;
    public String l = "default";
    public String N = "";
    public boolean o = false;
    public boolean p = false;
    public boolean s = true;
    public boolean t = false;
    public boolean v = false;
    public boolean w = true;
    public boolean z = true;
    public boolean C = true;
    public double D = 30.0d;
    private boolean F = false;
    private boolean G = false;
    private boolean H = false;
    private boolean I = true;
    private boolean J = true;
    private boolean K = true;
    private Handler L = null;
    private boolean O = false;
    private boolean P = false;

    static {
        kge.a(544351181);
    }

    public Class<?> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("5d842d15", new Object[]{this}) : this.r;
    }

    public IDMComponent b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("d245ed6d", new Object[]{this}) : this.q;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.o;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.p;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        if (jpx.a(this.x)) {
            SharedPreferences sharedPreferences = this.y;
            String str = this.f29651a;
            return sharedPreferences.getString(str, str);
        }
        return this.f29651a;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        if (jpx.a(this.x)) {
            SharedPreferences sharedPreferences = this.y;
            return sharedPreferences.getString(this.f29651a + ".version", this.b);
        }
        return this.b;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.c;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.d;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.e;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.f;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.g;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.h;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.t;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.i;
    }

    public Map<String, String> o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("df66012b", new Object[]{this}) : this.j;
    }

    public Map<String, String> p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ad1062ec", new Object[]{this}) : this.k;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : this.l;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this}) : this.m;
    }

    public String R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ce20f5e7", new Object[]{this}) : this.N;
    }

    public jny s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jny) ipChange.ipc$dispatch("998420b7", new Object[]{this}) : this.n;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.s;
    }

    public String u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("326979a4", new Object[]{this}) : this.u;
    }

    public double v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("69459eb", new Object[]{this})).doubleValue() : this.D;
    }

    public NextRpcRequester.NextRpcAttachedResponseStrategy w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NextRpcRequester.NextRpcAttachedResponseStrategy) ipChange.ipc$dispatch("1a12cc3c", new Object[]{this}) : this.E;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : this.z;
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : this.B;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : this.C;
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : this.A;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue() : this.I;
    }

    public jnw r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("f5f75ad8", new Object[]{this, new Boolean(z)});
        }
        this.O = z;
        return this;
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[]{this})).booleanValue() : this.O;
    }

    public jnw(Context context) {
        this.x = context;
        if (jpx.a(this.x)) {
            this.y = this.x.getApplicationContext().getSharedPreferences(NAMESPACE, 0);
        }
    }

    public Context C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9e374c42", new Object[]{this}) : this.x;
    }

    public jnw a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("7c7128c1", new Object[]{this, str});
        }
        this.f29651a = str;
        return this;
    }

    public jnw b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("7d1dd460", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public jnw a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("e6636938", new Object[]{this, new Integer(i)});
        }
        this.g = i;
        return this;
    }

    public jnw a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("1f43ec47", new Object[]{this, new Boolean(z)});
        }
        this.h = z;
        return this;
    }

    public jnw b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("dc6f2c8", new Object[]{this, new Boolean(z)});
        }
        this.t = z;
        return this;
    }

    public jnw c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("fc49f949", new Object[]{this, new Boolean(z)});
        }
        this.i = z;
        return this;
    }

    public jnw d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("eaccffca", new Object[]{this, new Boolean(z)});
        }
        this.c = z;
        return this;
    }

    public jnw e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("d950064b", new Object[]{this, new Boolean(z)});
        }
        this.d = z;
        return this;
    }

    public jnw f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("c7d30ccc", new Object[]{this, new Boolean(z)});
        }
        this.w = z;
        return this;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue() : this.w;
    }

    public jnw c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("7dca7fff", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public jnw d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("7e772b9e", new Object[]{this, str});
        }
        this.f = str;
        return this;
    }

    public jnw a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("24b1f476", new Object[]{this, map});
        }
        this.j = map;
        return this;
    }

    public jnw b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("5e030537", new Object[]{this, map});
        }
        this.k = map;
        return this;
    }

    public jnw e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("7f23d73d", new Object[]{this, str});
        }
        this.l = str;
        return this;
    }

    public jnw g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("807d2e7b", new Object[]{this, str});
        }
        this.N = str;
        return this;
    }

    public jnw g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("b656134d", new Object[]{this, new Boolean(z)});
        }
        this.F = z;
        return this;
    }

    public jnw h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("a4d919ce", new Object[]{this, new Boolean(z)});
        }
        this.G = z;
        return this;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue() : this.v;
    }

    public jnw i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("935c204f", new Object[]{this, new Boolean(z)});
        }
        this.v = z;
        return this;
    }

    public jnw j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("81df26d0", new Object[]{this, new Boolean(z)});
        }
        this.H = z;
        return this;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : this.J;
    }

    public jnw k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("70622d51", new Object[]{this, new Boolean(z)});
        }
        this.J = z;
        return this;
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue() : this.H;
    }

    public jnw f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("7fd082dc", new Object[]{this, str});
        }
        this.u = str;
        return this;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue() : this.G;
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue() : this.F;
    }

    public jnw l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("5ee533d2", new Object[]{this, new Boolean(z)});
        }
        this.z = z;
        return this;
    }

    public jnw m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("4d683a53", new Object[]{this, new Boolean(z)});
        }
        this.B = z;
        return this;
    }

    public jnw n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("3beb40d4", new Object[]{this, new Boolean(z)});
        }
        this.C = z;
        return this;
    }

    public jnw o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("2a6e4755", new Object[]{this, new Boolean(z)});
        }
        this.A = z;
        return this;
    }

    public jnw p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("18f14dd6", new Object[]{this, new Boolean(z)});
        }
        this.I = z;
        return this;
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue() : this.K;
    }

    public Handler K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("7f49234", new Object[]{this}) : this.L;
    }

    public jnw a(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("24505e9b", new Object[]{this, handler});
        }
        this.L = handler;
        return this;
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue() : this.P;
    }

    public NextRpcRequester a(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NextRpcRequester) ipChange.ipc$dispatch("46e7997d", new Object[]{this, jnyVar});
        }
        if (!Q() || jnyVar == null) {
            return null;
        }
        this.n = jnyVar;
        return new NextRpcRequester(this);
    }

    public j N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("67317d17", new Object[]{this});
        }
        if (Q()) {
            return new j(this);
        }
        return null;
    }

    public j b(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("d438606", new Object[]{this, jnyVar});
        }
        if (!Q() || jnyVar == null) {
            return null;
        }
        this.n = jnyVar;
        return new j(this);
    }

    public j a(IDMComponent iDMComponent, jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("d0cec349", new Object[]{this, iDMComponent, jnyVar});
        }
        if (!Q() || jnyVar == null) {
            return null;
        }
        this.q = iDMComponent;
        this.o = true;
        this.n = jnyVar;
        return new j(this);
    }

    public jnt q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnt) ipChange.ipc$dispatch("77453fa", new Object[]{this, new Boolean(z)});
        }
        this.K = z;
        return new d(this);
    }

    public jnz c(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnz) ipChange.ipc$dispatch("3afc49eb", new Object[]{this, jnyVar});
        }
        if (!Q() || jnyVar == null) {
            return null;
        }
        this.n = jnyVar;
        return new DMRequester(this);
    }

    private boolean Q() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[]{this})).booleanValue();
        }
        String str2 = this.f29651a;
        return str2 != null && str2.length() > 0 && (str = this.b) != null && str.length() > 0;
    }

    public List<jnx.a> P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b6cc90", new Object[]{this}) : this.M;
    }
}
