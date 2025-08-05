package com.taobao.android.order.core;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.constants.OrderBizCode;
import java.util.HashMap;
import java.util.Map;
import tb.hzj;
import tb.hzp;
import tb.hzv;
import tb.hzw;
import tb.iau;
import tb.jnr;
import tb.kge;
import tb.ria;

/* loaded from: classes6.dex */
public class OrderConfigs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BACKGROUND = "background";
    public static final String BOTTOM = "bottom";
    public static final String FOREGROUND = "foreground";
    public static final String RECYCLERVIEW = "recyclerView";
    public static final String TOP = "top";
    public static final String VIEWPAGER = "viewPager";
    private boolean A;
    private boolean B;
    private UltronWeex2DialogFragment C;

    /* renamed from: a  reason: collision with root package name */
    public h f14610a;
    public Map<String, ViewGroup> b;
    public hzv c;
    public Context d;
    public d e;
    public BizNameType f;
    public String g;
    public jnr h;
    private JSONArray i;
    private JSONObject j;
    private hzj k;
    private final String l;
    private View m;
    private boolean n;
    private UltronWeex2DialogFragment o;
    private final String p;
    private String q;
    private boolean r;
    private ria s;
    private boolean t;
    private hzp u;
    private boolean v;
    private boolean w;
    private Bundle x;
    private boolean y;
    private boolean z;

    /* loaded from: classes6.dex */
    public enum BizNameType {
        ORDER_DETAIL(OrderBizCode.orderDetail),
        ORDER_LIST(OrderBizCode.orderList);
        
        String bizName;

        BizNameType(String str) {
            this.bizName = str;
        }

        public String getBizName() {
            return this.bizName;
        }
    }

    static {
        kge.a(1804190239);
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : this.y;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public hzj a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hzj) ipChange.ipc$dispatch("f05c286", new Object[]{this}) : this.k;
    }

    public h b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("c6103b6e", new Object[]{this}) : this.f14610a;
    }

    public Map<String, ViewGroup> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.b;
    }

    public d d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("ed5fe1f4", new Object[]{this}) : this.e;
    }

    public hzv r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hzv) ipChange.ipc$dispatch("91d1bf49", new Object[]{this}) : this.c;
    }

    public BizNameType e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BizNameType) ipChange.ipc$dispatch("51344a86", new Object[]{this}) : this.f;
    }

    public hzp t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hzp) ipChange.ipc$dispatch("a135094d", new Object[]{this}) : this.u;
    }

    public JSONArray f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("215b3ab1", new Object[]{this}) : this.i;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.g;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.q = str;
        }
    }

    public void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else {
            this.i = jSONArray;
        }
    }

    public void a(hzp hzpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf80c7a", new Object[]{this, hzpVar});
        } else {
            this.u = hzpVar;
        }
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            this.b.put("top", viewGroup);
        }
    }

    public void b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3684528", new Object[]{this, viewGroup});
        } else {
            this.b.put("bottom", viewGroup);
        }
    }

    public void a(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2029c714", new Object[]{this, viewPager});
        } else {
            this.b.put(VIEWPAGER, viewPager);
        }
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b39531", new Object[]{this, dVar});
        } else {
            this.e = dVar;
        }
    }

    public void a(jnr jnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb98c6a", new Object[]{this, jnrVar});
        } else {
            this.h = jnrVar;
        }
    }

    public void a(UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a59ccde2", new Object[]{this, ultronWeex2DialogFragment});
        } else {
            this.o = ultronWeex2DialogFragment;
        }
    }

    public void b(UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96ee5d63", new Object[]{this, ultronWeex2DialogFragment});
        } else {
            this.C = ultronWeex2DialogFragment;
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    public void c(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb829a9", new Object[]{this, viewGroup});
        } else {
            this.b.put("foreground", viewGroup);
        }
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.b.put(RECYCLERVIEW, (ViewGroup) view);
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.d = context;
        }
    }

    public Context u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("afd1ed74", new Object[]{this}) : this.d;
    }

    public jnr h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jnr) ipChange.ipc$dispatch("44e204c9", new Object[]{this}) : this.h;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : this.t;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.l;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this}) : this.p;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this}) : this.q;
    }

    public ria q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ria) ipChange.ipc$dispatch("8a246344", new Object[]{this}) : this.s;
    }

    public void a(ria riaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd12218e", new Object[]{this, riaVar});
        } else {
            this.s = riaVar;
        }
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.n;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            b(this.m);
        }
    }

    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        ViewGroup viewGroup = this.b.get(RECYCLERVIEW);
        if (!(viewGroup instanceof RecyclerView) || view == null) {
            return;
        }
        ((RecyclerView) viewGroup).setAdapter(new iau(view));
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.r;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.m != null;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
        } else {
            this.m = view;
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
        } else {
            this.z = z;
        }
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : this.z;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.w = z;
        }
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue() : this.w;
    }

    public UltronWeex2DialogFragment m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UltronWeex2DialogFragment) ipChange.ipc$dispatch("5dafe1c", new Object[]{this}) : this.o;
    }

    public UltronWeex2DialogFragment B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UltronWeex2DialogFragment) ipChange.ipc$dispatch("bf619a27", new Object[]{this}) : this.C;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : this.v;
    }

    public Bundle x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("7c184403", new Object[]{this}) : this.x;
    }

    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
        } else {
            this.x = bundle;
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.A = z;
        }
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : this.B;
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else {
            this.B = z;
        }
    }

    private OrderConfigs(a aVar) {
        this.b = new HashMap();
        this.n = false;
        this.r = false;
        this.y = false;
        this.A = false;
        this.B = false;
        this.f = a.a(aVar);
        this.f14610a = a.b(aVar);
        this.b = a.c(aVar);
        this.d = a.d(aVar);
        this.c = new hzw();
        this.e = a.e(aVar);
        this.i = a.f(aVar);
        this.j = a.g(aVar);
        this.g = a.h(aVar);
        this.k = a.i(aVar);
        this.h = a.j(aVar);
        this.t = a.k(aVar);
        this.l = a.l(aVar);
        this.p = a.m(aVar);
        this.m = a.n(aVar);
        this.s = a.o(aVar);
        this.n = a.p(aVar);
        this.r = a.q(aVar);
        this.o = a.r(aVar);
        this.C = a.s(aVar);
        this.v = a.t(aVar);
    }

    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f14611a;
        private h b;
        private BizNameType d;
        private JSONObject e;
        private d f;
        private JSONArray g;
        private String h;
        private hzj i;
        private jnr j;
        private String k;
        private View m;
        private UltronWeex2DialogFragment n;
        private String o;
        private boolean q;
        private ria s;
        private UltronWeex2DialogFragment t;
        private Map<String, ViewGroup> c = new HashMap();
        private boolean l = false;
        private boolean p = false;
        private boolean r = false;

        static {
            kge.a(-1348990474);
        }

        public static /* synthetic */ BizNameType a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BizNameType) ipChange.ipc$dispatch("af1e37d7", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ h b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("f0640981", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ Map c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ba7abf32", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ Context d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("cca0de76", new Object[]{aVar}) : aVar.f14611a;
        }

        public static /* synthetic */ d e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("e6d79648", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ JSONArray f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("98e4a53e", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ JSONObject g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("f40659e1", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ String h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cc3ab85e", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ hzj i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (hzj) ipChange.ipc$dispatch("9ae7444b", new Object[]{aVar}) : aVar.i;
        }

        public static /* synthetic */ jnr j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (jnr) ipChange.ipc$dispatch("27d51814", new Object[]{aVar}) : aVar.j;
        }

        public static /* synthetic */ boolean k(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("629769c9", new Object[]{aVar})).booleanValue() : aVar.q;
        }

        public static /* synthetic */ String l(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3df2a9da", new Object[]{aVar}) : aVar.k;
        }

        public static /* synthetic */ String m(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("da60a639", new Object[]{aVar}) : aVar.o;
        }

        public static /* synthetic */ View n(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("2d7fa94a", new Object[]{aVar}) : aVar.m;
        }

        public static /* synthetic */ ria o(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ria) ipChange.ipc$dispatch("e87a19d3", new Object[]{aVar}) : aVar.s;
        }

        public static /* synthetic */ boolean p(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b44efe8e", new Object[]{aVar})).booleanValue() : aVar.l;
        }

        public static /* synthetic */ boolean q(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7da1c4f", new Object[]{aVar})).booleanValue() : aVar.p;
        }

        public static /* synthetic */ UltronWeex2DialogFragment r(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UltronWeex2DialogFragment) ipChange.ipc$dispatch("41fb3784", new Object[]{aVar}) : aVar.n;
        }

        public static /* synthetic */ UltronWeex2DialogFragment s(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UltronWeex2DialogFragment) ipChange.ipc$dispatch("fda465a3", new Object[]{aVar}) : aVar.t;
        }

        public static /* synthetic */ boolean t(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c27b7592", new Object[]{aVar})).booleanValue() : aVar.r;
        }

        public a(Context context) {
            this.f14611a = context;
        }

        public a a(BizNameType bizNameType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dece0125", new Object[]{this, bizNameType});
            }
            this.d = bizNameType;
            return this;
        }

        public a a(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5a0d2edc", new Object[]{this, hVar});
            }
            this.b = hVar;
            return this;
        }

        public a a(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f6c98e70", new Object[]{this, linearLayout, recyclerView, linearLayout2, viewGroup});
            }
            this.c.put("top", linearLayout);
            this.c.put(OrderConfigs.RECYCLERVIEW, recyclerView);
            this.c.put("bottom", linearLayout2);
            this.c.put("background", viewGroup);
            return this;
        }

        public a a(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a8c4b24f", new Object[]{this, linearLayout, recyclerView, linearLayout2});
            }
            this.c.put("top", linearLayout);
            this.c.put(OrderConfigs.RECYCLERVIEW, recyclerView);
            this.c.put("bottom", linearLayout2);
            return this;
        }

        public a a(LinearLayout linearLayout, ViewPager viewPager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a31e6cec", new Object[]{this, linearLayout, viewPager});
            }
            this.c.put("top", linearLayout);
            this.c.put(OrderConfigs.VIEWPAGER, viewPager);
            return this;
        }

        public a a(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("521344d9", new Object[]{this, jSONArray});
            }
            this.g = jSONArray;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8ee8fd77", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fe2927ff", new Object[]{this, new Boolean(z)});
            }
            this.q = z;
            return this;
        }

        public a a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5be6c6d8", new Object[]{this, dVar});
            }
            this.f = dVar;
            return this;
        }

        public a a(hzj hzjVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dbd57629", new Object[]{this, hzjVar});
            }
            this.i = hzjVar;
            return this;
        }

        public a a(jnr jnrVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b44b83f", new Object[]{this, jnrVar});
            }
            this.j = jnrVar;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2b56f9d6", new Object[]{this, str});
            }
            this.k = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c7c4f635", new Object[]{this, str});
            }
            this.o = str;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7712ec7d", new Object[]{this, new Boolean(z)});
            }
            this.l = z;
            return this;
        }

        public a a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fc1dc13f", new Object[]{this, view});
            }
            this.m = view;
            return this;
        }

        public a a(ria riaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("772a2d9b", new Object[]{this, riaVar});
            }
            this.s = riaVar;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ba9e0a3e", new Object[]{this, new Boolean(z)});
            }
            this.p = z;
            return this;
        }

        public a a(UltronWeex2DialogFragment ultronWeex2DialogFragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("554179c7", new Object[]{this, ultronWeex2DialogFragment});
            }
            this.n = ultronWeex2DialogFragment;
            return this;
        }

        public a b(UltronWeex2DialogFragment ultronWeex2DialogFragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("10eaa7e6", new Object[]{this, ultronWeex2DialogFragment});
            }
            this.t = ultronWeex2DialogFragment;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("41b445c0", new Object[]{this, new Boolean(z)});
            }
            this.r = z;
            return this;
        }

        public OrderConfigs a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (OrderConfigs) ipChange.ipc$dispatch("a40546de", new Object[]{this}) : new OrderConfigs(this);
        }
    }
}
