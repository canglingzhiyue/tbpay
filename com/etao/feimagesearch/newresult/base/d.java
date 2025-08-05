package com.etao.feimagesearch.newresult.base;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TITLE_BAR_COMMON = "common";
    public static final String TITLE_TEXT = "text";

    /* renamed from: a  reason: collision with root package name */
    private String f6817a;
    private float b;
    private boolean h;
    private float k;
    private boolean c = true;
    private boolean d = true;
    private boolean e = true;
    private String f = "common";
    private boolean g = true;
    private float i = 254.0f;
    private boolean j = true;
    private String l = "";

    static {
        kge.a(-1167036160);
        Companion = new a(null);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-555279288);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final d a(IrpDatasource datasource) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("d5a6ebb4", new Object[]{this, datasource});
            }
            q.c(datasource, "datasource");
            d dVar = new d();
            d.a(dVar, datasource.d().get("UIMode"));
            if (datasource.m()) {
                dVar.a(false);
                dVar.b(false);
                dVar.d(false);
                dVar.f(false);
                dVar.a("text");
                dVar.c(0.0f);
                dVar.b("https://gw.alicdn.com/imgextra/i4/O1CN01bcKBsP24QqDxt5tlK_!!6000000007386-0-tps-750-1624.jpg");
                return dVar;
            } else if (dVar.b() || datasource.z()) {
                dVar.b(false);
                dVar.d(false);
                dVar.c(false);
                dVar.a(30.0f);
                dVar.e(true);
                dVar.b(195.0f);
                dVar.c(0.6f);
                dVar.f(true);
                return dVar;
            } else {
                dVar.d(!com.alibaba.ability.localization.b.c());
                return dVar;
            }
        }
    }

    public static final /* synthetic */ void a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3684e5c", new Object[]{dVar, str});
        } else {
            dVar.f6817a = str;
        }
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String str = this.f6817a;
        return str == null ? "" : str;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : q.a((Object) "listOnly", (Object) a());
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.k == 0.0f;
    }

    public final void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.b = f;
        }
    }

    public final float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : this.b;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.c;
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.d;
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.e;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.f = str;
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.f;
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.g;
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.h;
    }

    public final void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else {
            this.i = f;
        }
    }

    public final float l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee3", new Object[]{this})).floatValue() : this.i;
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.j;
    }

    public final void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f)});
        } else {
            this.k = f;
        }
    }

    public final float n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de5", new Object[]{this})).floatValue() : this.k;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.l = str;
    }
}
