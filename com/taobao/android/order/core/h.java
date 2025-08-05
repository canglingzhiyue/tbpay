package com.taobao.android.order.core;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.hzb;
import tb.iad;
import tb.jnw;
import tb.jpx;
import tb.kge;

/* loaded from: classes6.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f14631a;
    private String b;
    private String e;
    private int g;
    private Map<String, String> j;
    private Map<String, String> k;
    private Context p;
    private SharedPreferences q;
    private iad w;
    private boolean x;
    private boolean c = true;
    private boolean d = true;
    private String f = "UNIT_TRADE";
    private boolean h = true;
    private boolean i = false;
    private String l = "order_ultron";
    private boolean m = false;
    private boolean n = false;
    private boolean o = true;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private String u = hzb.b;
    private String v = "";
    private String y = "";

    static {
        kge.a(-205195691);
    }

    public iad a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iad) ipChange.ipc$dispatch("f05d852", new Object[]{this}) : this.w;
    }

    public void a(iad iadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed47250c", new Object[]{this, iadVar});
        } else {
            this.w = iadVar;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (!jpx.a(this.p)) {
            return this.f14631a;
        }
        SharedPreferences sharedPreferences = this.q;
        String str = this.f14631a;
        return sharedPreferences.getString(str, str);
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.v;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        if (!jpx.a(this.p)) {
            return this.b;
        }
        SharedPreferences sharedPreferences = this.q;
        return sharedPreferences.getString(this.f14631a + ".version", this.b);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.c;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.d;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.e;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.f;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.g;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.h;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.i;
    }

    public Map<String, String> l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7666dbe8", new Object[]{this}) : this.j;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : this.u;
    }

    public Map<String, String> n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("11bb9f6a", new Object[]{this}) : this.k;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this}) : this.l;
    }

    public h(Context context) {
        this.p = context;
        if (jpx.a(this.p)) {
            this.q = this.p.getSharedPreferences(jnw.NAMESPACE, 0);
        }
    }

    public h a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("b5a09fb7", new Object[]{this, str});
        }
        this.f14631a = str;
        return this;
    }

    public h b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("def4f4f8", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public h a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("520bef1", new Object[]{this, new Boolean(z)});
        }
        this.h = z;
        return this;
    }

    public h c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("8494a39", new Object[]{this, str});
        }
        this.v = str;
        return this;
    }

    public h d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("319d9f7a", new Object[]{this, str});
        }
        this.f = str;
        return this;
    }

    public h a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("78f1f9a2", new Object[]{this, map});
        }
        this.j = map;
        return this;
    }

    public h b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("a6ca9401", new Object[]{this, map});
        }
        this.k = map;
        return this;
    }

    public h b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("66735b90", new Object[]{this, new Boolean(z)});
        }
        this.s = z;
        return this;
    }

    public h c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("c7c5f82f", new Object[]{this, new Boolean(z)});
        }
        this.t = z;
        return this;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.s;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.r;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : this.t;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : this.x;
    }

    public h d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("291894ce", new Object[]{this, new Boolean(z)});
        }
        this.x = z;
        return this;
    }

    public String t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("abe3bf05", new Object[]{this}) : this.y;
    }

    public h e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("5af1f4bb", new Object[]{this, str});
        }
        this.y = str;
        return this;
    }
}
