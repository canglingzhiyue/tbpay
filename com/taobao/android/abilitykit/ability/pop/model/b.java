package com.taobao.android.abilitykit.ability.pop.model;

import android.graphics.Color;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import tb.dmo;
import tb.dmr;
import tb.ffz;
import tb.kge;
import tb.rwf;

/* loaded from: classes4.dex */
public final class b implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTACH_MODE_ACTIVITY = "activity";
    public static final String ATTACH_MODE_VIEW = "view";
    public static final String ATTACH_MODE_WINDOW = "popWindow";
    public static final a Companion;
    public static final String DROID_PAN_ENABLE = "droidPanEnable";
    private static boolean E = false;
    public static final int PERCENT_100 = 10000;
    public static final float SIZE_FULL = 1.0f;
    public static final float SIZE_MATCH_CONTENT = -2.0f;
    public static final String TAK_ABILITY_MATCH_CONTENT = "matchContent";
    public static final String TAK_ABILITY_SHOW_POP_MAX_HEIGHT = "maxHeight";
    public static final String TAK_ABILITY_SHOW_POP_MAX_WIDTH = "maxWidth";
    private String A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean F;
    private int G;
    private boolean H;
    private boolean I;
    private String J;
    private float K;
    private float L;
    private float M;
    private float N;
    private String O;
    private int P;

    /* renamed from: a  reason: collision with root package name */
    private boolean f8912a;
    private boolean b;
    private String c;
    private int d;
    private int e;
    private int f;
    private int g;
    private String h;
    private String i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private String n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private String s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    static {
        kge.a(-453312240);
        kge.a(-723128125);
        Companion = new a(null);
    }

    @JvmStatic
    public static final b a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c07fbb10", new Object[]{jSONObject}) : Companion.a(jSONObject);
    }

    public /* synthetic */ b(o oVar) {
        this();
    }

    public static final /* synthetic */ boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[0])).booleanValue() : E;
    }

    public static final /* synthetic */ void a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c23f54fa", new Object[]{bVar, str});
        } else {
            bVar.h = str;
        }
    }

    public static final /* synthetic */ void a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a5401a4", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.f8912a = z;
        }
    }

    public static final /* synthetic */ void b(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fe80aa5", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.b = z;
        }
    }

    public static final /* synthetic */ void c(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7214738", new Object[]{bVar, str});
        } else {
            bVar.i = str;
        }
    }

    public static final /* synthetic */ void c(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c57c13a6", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.l = z;
        }
    }

    public static final /* synthetic */ void d(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11924057", new Object[]{bVar, str});
        } else {
            bVar.n = str;
        }
    }

    public static final /* synthetic */ void d(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb101ca7", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.p = z;
        }
    }

    public static final /* synthetic */ void e(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a425a8", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.z = z;
        }
    }

    public static final /* synthetic */ void f(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36382ea9", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.r = z;
        }
    }

    public static final /* synthetic */ void g(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bcc37aa", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.t = z;
        }
    }

    public static final /* synthetic */ void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{new Boolean(z)});
        } else {
            E = z;
        }
    }

    public static final /* synthetic */ void h(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816040ab", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.u = z;
        }
    }

    public static final /* synthetic */ void i(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6f449ac", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.v = z;
        }
    }

    public static final /* synthetic */ void j(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc8852ad", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.w = z;
        }
    }

    public static final /* synthetic */ void k(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f21c5bae", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.x = z;
        }
    }

    public static final /* synthetic */ void l(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17b064af", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.y = z;
        }
    }

    public static final /* synthetic */ void m(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d446db0", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.F = z;
        }
    }

    private b() {
        this.f8912a = true;
        this.x = true;
        this.H = true;
        this.G = -1;
        this.P = -1;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f8912a;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public final String I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("136d6650", new Object[]{this}) : this.J;
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.J = str;
        }
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.e;
    }

    public final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.f;
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.g;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.h;
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.i;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.j;
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.k;
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.l;
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : this.m;
    }

    public final String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this}) : this.n;
    }

    public final void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public final int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue() : this.o;
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.p;
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.q;
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : this.r;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.s = str;
        }
    }

    public final String s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("255e0466", new Object[]{this}) : this.s;
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.t;
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : this.u;
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : this.v;
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue() : this.w;
    }

    public final boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : this.x;
    }

    public final boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : this.z;
    }

    public final boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : this.y;
    }

    public final boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : this.F;
    }

    public final String A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("df3f9158", new Object[]{this}) : this.A;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.A = str;
        }
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue() : this.B;
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.B = z;
        }
    }

    public final boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue() : this.C;
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.C = z;
        }
    }

    public final boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue() : this.D;
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.D = z;
        }
    }

    public final boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue() : this.H;
    }

    public final void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
        } else {
            this.H = z;
        }
    }

    public final boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue() : this.I;
    }

    public final void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
        } else {
            this.I = z;
        }
    }

    public final int O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("46ec549", new Object[]{this})).intValue() : this.G;
    }

    public final void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else {
            this.G = i;
        }
    }

    public final int P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("47cdcca", new Object[]{this})).intValue() : this.P;
    }

    public final void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
        } else {
            this.P = i;
        }
    }

    public final float J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4284fc1", new Object[]{this})).floatValue() : this.K;
    }

    public final void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.K = f;
        }
    }

    public final float K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4366742", new Object[]{this})).floatValue() : this.L;
    }

    public final void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else {
            this.L = f;
        }
    }

    public final float L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4447ec3", new Object[]{this})).floatValue() : this.M;
    }

    public final void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f)});
        } else {
            this.M = f;
        }
    }

    public final float M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4529644", new Object[]{this})).floatValue() : this.N;
    }

    public final void d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401235", new Object[]{this, new Float(f)});
        } else {
            this.N = f;
        }
    }

    public final String N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b40a0b6b", new Object[]{this}) : this.O;
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.O = str;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-674703272);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                b.g(z);
            }
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : b.E();
        }

        @JvmStatic
        public final b a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c07fbb10", new Object[]{this, jSONObject});
            }
            b bVar = new b(null);
            b.a(bVar, dmo.a(jSONObject, "backgroundMode", "normal"));
            bVar.a(dmo.a(jSONObject, "animation", (String) null));
            b.c(bVar, dmo.a(jSONObject, "backgroundStyle", ""));
            b.a(bVar, dmo.a(jSONObject, "tapEnable", true));
            b.b(bVar, dmo.a(jSONObject, "panEnable", dmr.c()));
            bVar.a(dmo.a(jSONObject, b.TAK_ABILITY_MATCH_CONTENT, false));
            float f = 10000;
            int c = rwf.c(0, (int) (dmo.a(jSONObject, "offset", 0.0f) * f));
            if (jSONObject != null && jSONObject.containsKey("originHeight")) {
                float a2 = dmo.a(jSONObject, "originHeight", 0.9f);
                bVar.a((int) (a2 * f));
                bVar.b((int) (dmo.a(jSONObject, "maxHeight", a2) * f));
            } else {
                bVar.b((int) (dmo.a(jSONObject, "maxHeight", 0.9f) * f));
                bVar.a(bVar.e() - c);
            }
            bVar.b(rwf.d(10000, rwf.c(0, bVar.e())));
            bVar.a(rwf.d(bVar.e(), rwf.c(0, bVar.d())));
            if (jSONObject != null && jSONObject.containsKey("originWidth")) {
                float a3 = dmo.a(jSONObject, "originWidth", 1.0f);
                bVar.c((int) (a3 * f));
                bVar.d((int) (dmo.a(jSONObject, "maxWidth", a3) * f));
            } else {
                bVar.d((int) (dmo.a(jSONObject, "maxWidth", 1.0f) * f));
                bVar.c(bVar.g() - c);
            }
            bVar.d(rwf.d(10000, rwf.c(0, bVar.g())));
            bVar.c(rwf.d(bVar.g(), rwf.c(0, bVar.f())));
            bVar.b(dmo.a(jSONObject, "shouldBlockClose", false));
            b.c(bVar, dmo.a(jSONObject, "showLoading", false));
            String a4 = dmo.a(jSONObject, "contentBackColor", (String) null);
            if (a4 != null) {
                try {
                    bVar.e(Color.parseColor(a4));
                } catch (IllegalArgumentException unused) {
                }
            }
            b.d(bVar, dmo.a(jSONObject, "attachMode", "view"));
            bVar.f(dmo.a(jSONObject, "cornerRadius", ffz.b()));
            if (bVar.o() < 0) {
                bVar.f(0);
            }
            b.d(bVar, dmo.a(jSONObject, "autoKeyboard", true));
            bVar.c(dmo.a(jSONObject, b.DROID_PAN_ENABLE, false));
            b.f(bVar, dmo.a(jSONObject, "droidFullScreen", true));
            bVar.b(dmo.a(jSONObject, "gravity", (String) null));
            b.g(bVar, dmo.a(jSONObject, "isOpaque", true));
            b.h(bVar, dmo.a(jSONObject, m.SKIP_PAGE, false));
            b.i(bVar, dmo.a(jSONObject, "shouldShowClose", false));
            b.j(bVar, dmo.a(jSONObject, "useH5UTFlag", false));
            b.k(bVar, dmo.a(jSONObject, com.taobao.android.detail.wrapper.nav.c.STDPOP_CONFIG_BACK, true));
            b.l(bVar, dmo.a(jSONObject, "enableSendEventToFromPage", false));
            bVar.c(dmo.a(jSONObject, "drawerMode", (String) null));
            bVar.d(dmo.a(jSONObject, "drawerNotModal", false));
            bVar.e(dmo.a(jSONObject, "autoRotate", a()));
            bVar.f(dmo.a(jSONObject, "adaptSpecificPadPop", false));
            b.e(bVar, dmo.a(jSONObject, "droidBlockHandleBack", false));
            b.m(bVar, dmo.a(jSONObject, com.taobao.android.detail.wrapper.nav.c.STDPOP_CONFIG_WINDOW_NOTIFY, false));
            bVar.h(dmo.a(jSONObject, com.taobao.android.detail.wrapper.nav.c.STDPOP_ANIM_BACKGROUND, true));
            bVar.i(dmo.a(jSONObject, "enableBindingX", false));
            bVar.e(dmo.a(jSONObject, "landScapeAnimation", (String) null));
            bVar.b(dmo.a(jSONObject, "leftMargin", 0.0f));
            bVar.a(dmo.a(jSONObject, "topMargin", 0.0f));
            bVar.c(dmo.a(jSONObject, "bottomMargin", 0.0f));
            bVar.d(dmo.a(jSONObject, "rightMargin", 0.0f));
            bVar.f(dmo.a(jSONObject, "title", (String) null));
            bVar.g(dmo.a(jSONObject, "popContainerId", -1));
            bVar.h(dmo.a(jSONObject, "enterAnimDuration", -1));
            return bVar;
        }
    }

    public Object clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : super.clone();
    }
}
