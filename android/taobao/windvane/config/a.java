package android.taobao.windvane.config;

import android.app.Application;
import android.taobao.windvane.config.f;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_TTID = "hybrid@windvane_android_8.5.0";
    public static final String DEFAULT_UA = " WindVane/8.5.0";
    public static final String VERSION = "8.5.0";

    /* renamed from: a  reason: collision with root package name */
    public static EnvEnum f1556a;
    public static boolean b;
    public static String c;
    public static int d;
    public static boolean e;
    public static Application f;
    private static a t;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o = null;
    private boolean p = false;
    private boolean q = false;
    private String[] r = null;
    private boolean s = false;
    private f u = new f();
    private f.a v = new f.a();
    private boolean w = true;
    private boolean x = true;
    private boolean y = false;
    private int z = 4000;
    private int A = 0;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private int E = -1;

    static {
        kge.a(751035470);
        f1556a = EnvEnum.ONLINE;
        b = false;
        c = "3";
        d = 0;
        e = true;
    }

    private a() {
    }

    public static synchronized a a() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f8254605", new Object[0]);
            }
            if (t == null) {
                t = new a();
            }
            return t;
        }
    }

    public boolean a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c10fe25c", new Object[]{this, hVar})).booleanValue();
        }
        if (hVar == null) {
            return false;
        }
        if (StringUtils.isEmpty(hVar.e)) {
            throw new NullPointerException("initParams error, appKey is empty");
        }
        if (StringUtils.isEmpty(hVar.f1560a)) {
            this.g = DEFAULT_TTID;
        } else {
            this.g = hVar.f1560a;
        }
        this.h = hVar.b;
        this.i = hVar.c;
        this.j = hVar.d;
        this.k = hVar.e;
        this.l = hVar.f;
        this.m = hVar.g;
        this.n = hVar.h;
        a(hVar.i);
        if (!StringUtils.isEmpty(hVar.l)) {
            this.o = hVar.l;
        }
        this.p = hVar.m;
        this.s = hVar.n;
        if (hVar.j != null) {
            this.u = hVar.j;
        }
        if (hVar.k != null) {
            this.v = hVar.k;
        }
        this.w = hVar.q;
        this.x = hVar.r;
        this.y = hVar.s;
        this.D = hVar.t;
        this.q = hVar.v;
        this.z = hVar.w;
        this.A = hVar.x;
        this.B = hVar.y;
        this.C = hVar.z;
        return true;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.g;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.j;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.k;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.m;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.n;
    }

    public String[] j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("632f5980", new Object[]{this}) : this.r;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.o;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.p;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.q;
    }

    public void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
        } else if (strArr == null) {
        } else {
            this.r = strArr;
        }
    }

    public static String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ccd489", new Object[0]);
        }
        String str = EnvEnum.ONLINE.equals(f1556a) ? "https://h5." : "http://h5.";
        return str + f1556a.getValue() + ".taobao.com";
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.s;
    }

    public f r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("6ea1ad2f", new Object[]{this}) : this.u;
    }

    public f.a s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f.a) ipChange.ipc$dispatch("a408c3f1", new Object[]{this}) : this.v;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.y;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : this.C;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : this.D;
    }
}
