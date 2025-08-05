package com.taobao.tao.navigation;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String A;
    public String B;

    /* renamed from: a  reason: collision with root package name */
    private String f20804a;
    private String b;
    private Pair<Object, Object> c;
    private NavigationTabIconSourceType d;
    private boolean e;
    private String f;
    private NavigationTabMsgMode g;
    private String h;
    private String i;
    private String j;
    private Pair<Boolean, Boolean> k;
    private Map<String, String> l;
    private Map<String, String> m;
    private int n;
    private int o;
    private Drawable p;
    private Drawable q;
    private boolean r;
    private boolean s;
    private int t;
    private String u;
    private boolean v;
    private boolean w;
    private Bundle x;
    private Integer y;
    private String z;

    public static /* synthetic */ String a(g gVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cff72849", new Object[]{gVar, str});
        }
        gVar.z = str;
        return str;
    }

    private g() {
        this.d = NavigationTabIconSourceType.DRAWABLE;
        this.e = false;
        this.g = NavigationTabMsgMode.DEFAULT;
        this.k = new Pair<>(false, true);
        this.n = Color.parseColor("#444444");
        this.o = Color.parseColor("#ff5000");
        this.p = null;
        this.q = null;
        this.r = true;
        this.s = true;
        this.v = false;
        this.w = false;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.n;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.n = i;
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.o;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f20804a;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f20804a = str;
        }
    }

    public Pair d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("bbe3e075", new Object[]{this}) : this.c;
    }

    public void a(Pair pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a82db72", new Object[]{this, pair});
        } else {
            this.c = pair;
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.b;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.r;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.s;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    public Map<String, String> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3fbd54e4", new Object[]{this}) : this.l;
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.l = map;
        }
    }

    public Map<String, String> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this}) : this.m;
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else {
            this.m = map;
        }
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.h;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.i;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public NavigationTabMsgMode l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NavigationTabMsgMode) ipChange.ipc$dispatch("25dee594", new Object[]{this}) : this.g;
    }

    public void a(NavigationTabMsgMode navigationTabMsgMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185c47f9", new Object[]{this, navigationTabMsgMode});
        } else {
            this.g = navigationTabMsgMode;
        }
    }

    public String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : this.f;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public NavigationTabIconSourceType n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NavigationTabIconSourceType) ipChange.ipc$dispatch("9fd9f3f2", new Object[]{this}) : this.d;
    }

    public void a(NavigationTabIconSourceType navigationTabIconSourceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb906a5", new Object[]{this, navigationTabIconSourceType});
        } else {
            this.d = navigationTabIconSourceType;
        }
    }

    public int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue() : this.t;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.t = i;
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.u = str;
        }
    }

    public void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
        } else {
            this.y = num;
        }
    }

    public Integer p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("5ecabc5e", new Object[]{this}) : this.y;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        if (!a(this.g, this.f)) {
            return false;
        }
        if (this.d == NavigationTabIconSourceType.DRAWABLE && (!(this.c.first instanceof Integer) || !(this.c.second instanceof Integer))) {
            TLog.loge(com.taobao.tao.navigation.a.a(), "NavigationTab", "icon type is not drawable");
            return false;
        } else if (this.d != NavigationTabIconSourceType.URL || ((this.c.first instanceof String) && (this.c.second instanceof String))) {
            return true;
        } else {
            TLog.loge(com.taobao.tao.navigation.a.a(), "NavigationTab", "icon type is not URL");
            return false;
        }
    }

    public boolean a(NavigationTabMsgMode navigationTabMsgMode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f6c587", new Object[]{this, navigationTabMsgMode, str})).booleanValue();
        }
        if (str != null && navigationTabMsgMode == NavigationTabMsgMode.DEFAULT) {
            try {
                Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                Log.e("NavigationTab", "Message is not number, please check!");
                return false;
            }
        }
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.valueOf(this.f20804a);
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : this.e;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.e = false;
        }
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : this.v;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    public String t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("abe3bf05", new Object[]{this}) : this.j;
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : this.w;
    }

    public Bundle v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("e7b51181", new Object[]{this}) : this.x;
    }

    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
        } else {
            this.x = bundle;
        }
    }

    public Drawable w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("9b0bd77c", new Object[]{this}) : this.p;
    }

    public void a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
        } else {
            this.p = drawable;
        }
    }

    public Drawable x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("f229c85b", new Object[]{this}) : this.q;
    }

    public void b(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a3a68d", new Object[]{this, drawable});
        } else {
            this.q = drawable;
        }
    }

    public String y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4c806420", new Object[]{this}) : this.z;
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            this.z = str;
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private g f20805a = new g();

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6b091a", new Object[]{this, str});
            }
            this.f20805a.a(str);
            return this;
        }

        public a a(Pair<Object, Object> pair) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("55685a", new Object[]{this, pair});
            }
            this.f20805a.a((Pair) pair);
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8da5ba9b", new Object[]{this, str});
            }
            this.f20805a.b(str);
            return this;
        }

        public a a(NavigationTabMsgMode navigationTabMsgMode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("37ab6ea1", new Object[]{this, navigationTabMsgMode});
            }
            this.f20805a.a(navigationTabMsgMode);
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1ae06c1c", new Object[]{this, str});
            }
            this.f20805a.e(str);
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a81b1d9d", new Object[]{this, str});
            }
            this.f20805a.c(str);
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3555cf1e", new Object[]{this, str});
            }
            this.f20805a.d(str);
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c290809f", new Object[]{this, str});
            }
            this.f20805a.g(str);
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("69fdaed4", new Object[]{this, new Boolean(z)});
            }
            this.f20805a.a(z);
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("de3ce733", new Object[]{this, new Boolean(z)});
            }
            this.f20805a.b(z);
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("eaa32c3", new Object[]{this, new Integer(i)});
            }
            this.f20805a.c(i);
            return this;
        }

        public a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("798fe1c5", new Object[]{this, map});
            }
            this.f20805a.a(map);
            return this;
        }

        public a b(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6b3987e4", new Object[]{this, map});
            }
            this.f20805a.b(map);
            return this;
        }

        public a a(NavigationTabIconSourceType navigationTabIconSourceType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e40e384d", new Object[]{this, navigationTabIconSourceType});
            }
            this.f20805a.a(navigationTabIconSourceType);
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("527c1f92", new Object[]{this, new Boolean(z)});
            }
            this.f20805a.c(z);
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c6bb57f1", new Object[]{this, new Boolean(z)});
            }
            this.f20805a.d(z);
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4fcb3220", new Object[]{this, str});
            }
            g.a(this.f20805a, str);
            return this;
        }

        public g a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("b378186d", new Object[]{this});
            }
            if (this.f20805a.q()) {
                return this.f20805a;
            }
            return null;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            g gVar = (g) obj;
            if (this.t != gVar.t || !TextUtils.equals(this.b, gVar.b) || !TextUtils.equals(this.h, gVar.h) || !TextUtils.equals(this.i, gVar.i)) {
                return false;
            }
            String str = this.j;
            if (str != null) {
                return str.equals(gVar.j);
            }
            if (gVar.j == null) {
                return true;
            }
        }
        return false;
    }

    public boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            g gVar = (g) obj;
            if (this.e == gVar.e && this.n == gVar.n && this.o == gVar.o && this.r == gVar.r && this.s == gVar.s && this.t == gVar.t && this.v == gVar.v && this.w == gVar.w && a(this.f20804a, gVar.f20804a) && a(this.b, gVar.b) && a(this.c, gVar.c) && this.d == gVar.d && a(this.f, gVar.f) && this.g == gVar.g && a(this.h, gVar.h) && a(this.i, gVar.i) && a(this.j, gVar.j) && a(this.k, gVar.k) && a(this.l, gVar.l) && a(this.m, gVar.m) && a(this.p, gVar.p) && a(this.q, gVar.q) && a(this.u, gVar.u) && a(this.x, gVar.x)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{this, obj, obj2})).booleanValue() : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        g gVar = new g();
        gVar.f20804a = this.f20804a;
        gVar.b = this.b;
        Pair<Object, Object> pair = this.c;
        if (pair != null) {
            gVar.c = new Pair<>(pair.first, this.c.second);
        }
        gVar.d = this.d;
        gVar.e = this.e;
        gVar.f = this.f;
        gVar.g = this.g;
        gVar.h = this.h;
        gVar.i = this.i;
        gVar.j = this.j;
        gVar.A = this.A;
        gVar.B = this.B;
        Bundle bundle = this.x;
        if (bundle != null) {
            gVar.x = new Bundle(bundle.size());
            gVar.x.putAll(this.x);
        }
        Pair<Boolean, Boolean> pair2 = this.k;
        if (pair2 != null) {
            gVar.k = new Pair<>(pair2.first, this.k.second);
        }
        if (this.l != null) {
            gVar.l = new HashMap();
            gVar.l.putAll(this.l);
        }
        if (this.m != null) {
            gVar.m = new HashMap();
            gVar.m.putAll(this.m);
        }
        gVar.n = this.n;
        gVar.o = this.o;
        gVar.r = this.r;
        gVar.s = this.s;
        gVar.t = this.t;
        gVar.u = this.u;
        gVar.v = this.v;
        gVar.w = this.w;
        Drawable drawable = this.p;
        if (drawable != null && this.q != null) {
            gVar.p = drawable.getConstantState().newDrawable();
            gVar.q = this.q.getConstantState().newDrawable();
        }
        gVar.z = this.z;
        return gVar;
    }
}
