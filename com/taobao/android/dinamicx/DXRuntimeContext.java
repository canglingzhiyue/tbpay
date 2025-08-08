package com.taobao.android.dinamicx;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.fut;
import tb.fzm;
import tb.gbg;
import tb.ggx;
import tb.kge;

/* loaded from: classes.dex */
public class DXRuntimeContext implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REFRESH_ALL = 0;
    public static final int REFRESH_PART = 1;
    public static final int REFRESH_PART_FROM_WINDOW_CHANGED = 2;
    private WeakReference<JSONObject> I;
    private Map<String, com.taobao.android.dinamicx.expression.expr_v2.f> K;
    private com.taobao.android.dinamicx.eventchain.h P;

    /* renamed from: a  reason: collision with root package name */
    public by f11781a;
    public com.taobao.android.dinamicx.widget.bg b;
    public a c;
    public DXTemplateItem d;
    public DXWidgetNode e;
    public Object h;
    public int j;
    public String r;
    public String s;
    public s t;
    public int x;
    public int y;
    private int L = 0;
    private int S = -1;
    private int w = -1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DXRefreshType {
    }

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public DXTemplateItem f11782a;
        public JSONObject b;
        public s c;

        static {
            kge.a(-1251553035);
        }
    }

    static {
        kge.a(-1663550914);
        kge.a(-723128125);
    }

    public DXRuntimeContext(r rVar) {
    }

    public void a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea75199", new Object[]{this, sVar});
        } else {
            this.t = sVar;
        }
    }

    public DXRuntimeContext a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("49858920", new Object[]{this, dXWidgetNode});
        }
        DXRuntimeContext dXRuntimeContext = new DXRuntimeContext(C());
        dXRuntimeContext.f11781a = this.f11781a;
        dXRuntimeContext.c = this.c;
        dXRuntimeContext.e = dXWidgetNode;
        dXRuntimeContext.I = this.I;
        dXRuntimeContext.h = this.h;
        dXRuntimeContext.j = this.j;
        dXRuntimeContext.t = this.t;
        dXRuntimeContext.c(this.L);
        dXRuntimeContext.y = this.y;
        dXRuntimeContext.x = this.x;
        dXRuntimeContext.K = this.K;
        dXRuntimeContext.S = this.S;
        dXRuntimeContext.d = this.d;
        dXRuntimeContext.w = this.w;
        dXRuntimeContext.b = this.b;
        return dXRuntimeContext;
    }

    @Deprecated
    public Object a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f11781a.m;
    }

    public ba b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ba) ipChange.ipc$dispatch("de76436a", new Object[]{this}) : this.f11781a.n;
    }

    public DXTemplateItem c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("2be3aa95", new Object[]{this});
        }
        a aVar = this.c;
        if (aVar != null) {
            return aVar.f11782a;
        }
        return this.d;
    }

    public DXWidgetNode d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("7fa6ce0a", new Object[]{this});
        }
        DXWidgetNode dXWidgetNode = this.e;
        if (dXWidgetNode == null) {
            return null;
        }
        if (!dXWidgetNode.isFlatten()) {
            return this.e;
        }
        return this.e.getReferenceNode();
    }

    private DXWidgetNode S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("1ec10479", new Object[]{this});
        }
        DXWidgetNode dXWidgetNode = this.e;
        if (dXWidgetNode == null) {
            return null;
        }
        if (dXWidgetNode.isFlatten()) {
            return this.e;
        }
        return this.e.getReferenceNode();
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        a aVar = this.c;
        if (aVar != null) {
            return aVar.b;
        }
        WeakReference<JSONObject> weakReference = this.I;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public Object f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5dd0ace5", new Object[]{this}) : this.h;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.I = new WeakReference<>(jSONObject);
        }
    }

    public Map<String, com.taobao.android.dinamicx.expression.expr_v2.f> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this}) : this.K;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.x;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.x = i;
        }
    }

    public void a(Map<String, com.taobao.android.dinamicx.expression.expr_v2.f> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.K = map;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.h = obj;
        }
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.j;
    }

    public com.taobao.android.dinamicx.model.b<com.taobao.android.dinamicx.widget.ak> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.model.b) ipChange.ipc$dispatch("d0da9df9", new Object[]{this}) : this.f11781a.e;
    }

    public com.taobao.android.dinamicx.model.b<bn> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.model.b) ipChange.ipc$dispatch("5d7ac8fa", new Object[]{this});
        }
        if (this.f11781a.g == null) {
            return null;
        }
        return this.f11781a.g.get();
    }

    public com.taobao.android.dinamicx.model.b<fut> l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.model.b) ipChange.ipc$dispatch("ea1af3fb", new Object[]{this}) : this.f11781a.f;
    }

    public void b(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b577266", new Object[]{this, dXWidgetNode});
        } else {
            this.e = dXWidgetNode;
        }
    }

    public Context m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6552c96c", new Object[]{this});
        }
        if (this.f11781a.h != null && this.f11781a.h.get() != null) {
            return this.f11781a.h.get();
        }
        return DinamicXEngine.i();
    }

    public s n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("d95619e6", new Object[]{this});
        }
        a aVar = this.c;
        if (aVar != null) {
            return aVar.c;
        }
        return this.t;
    }

    public boolean o() {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        a aVar = this.c;
        if (aVar != null) {
            sVar = aVar.c;
        } else {
            sVar = this.t;
        }
        return (sVar == null || sVar.c == null || sVar.c.size() <= 0) ? false : true;
    }

    public com.taobao.analysis.v3.h p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.analysis.v3.h) ipChange.ipc$dispatch("177d4958", new Object[]{this}) : this.f11781a.o;
    }

    public void a(com.taobao.analysis.v3.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d506d41", new Object[]{this, hVar});
        } else {
            this.f11781a.o = hVar;
        }
    }

    public bn a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bn) ipChange.ipc$dispatch("6959832a", new Object[]{this, new Long(j)});
        }
        if (this.f11781a.g != null && this.f11781a.g.get() != null) {
            return this.f11781a.g.get().get(j);
        }
        return null;
    }

    public fzm q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fzm) ipChange.ipc$dispatch("8a1f3015", new Object[]{this});
        }
        if (this.f11781a.i != null) {
            return this.f11781a.i.get();
        }
        return null;
    }

    public am r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (am) ipChange.ipc$dispatch("2269c70d", new Object[]{this});
        }
        if (this.f11781a.j != null) {
            return this.f11781a.j.get();
        }
        return null;
    }

    public bo U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bo) ipChange.ipc$dispatch("f7406849", new Object[]{this});
        }
        if (this.f11781a.r != null) {
            return this.f11781a.r.get();
        }
        return null;
    }

    public DXRootView s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("55a5bd1d", new Object[]{this});
        }
        if (this.f11781a.q != null) {
            return this.f11781a.q.get();
        }
        return null;
    }

    public void a(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc619e9", new Object[]{this, dXRootView});
            return;
        }
        by byVar = this.f11781a;
        if (byVar == null) {
            return;
        }
        byVar.q = new WeakReference<>(dXRootView);
    }

    public String V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e837e063", new Object[]{this});
        }
        if (c() == null || e() == null) {
            return "";
        }
        return c().f11925a + "_" + c().b + "_" + System.identityHashCode(e()) + "w:" + y() + "h:" + z();
    }

    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abe3bf05", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.r) && c() != null && e() != null) {
            this.r = c().f11925a + "_" + c().b + "_" + System.identityHashCode(e()) + "w:" + y() + "h:" + z();
        }
        return this.r;
    }

    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("326979a4", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.s) && c() != null && f() != null) {
            this.s = c().f11925a + "_" + c().b + "_" + System.identityHashCode(f()) + "w:" + y() + "h:" + z();
        }
        return this.s;
    }

    public View v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2f714cff", new Object[]{this});
        }
        DXWidgetNode dXWidgetNode = this.e;
        if (dXWidgetNode == null) {
            return null;
        }
        if (this.c != null) {
            return dXWidgetNode.getNativeView();
        }
        if (bx.p()) {
            DXWidgetNode dXWidgetNode2 = this.e;
            if (dXWidgetNode2 != null && dXWidgetNode2.getFlattenNode() != null) {
                return this.e.getFlattenNode().d();
            }
            return null;
        }
        DXWidgetNode S = S();
        if (S != null && S.getWRView() != null) {
            return S.getWRView().get();
        }
        return null;
    }

    public int w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a27171", new Object[]{this})).intValue() : this.L;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.L = i;
        }
    }

    public int x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b088f2", new Object[]{this})).intValue() : this.f11781a.c;
    }

    public void a(WeakReference<am> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9cf36", new Object[]{this, weakReference});
        } else {
            this.f11781a.j = weakReference;
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.f11781a.h = new WeakReference<>(context);
        }
    }

    public void a(bo boVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156b33b7", new Object[]{this, boVar});
        } else {
            this.f11781a.r = new WeakReference<>(boVar);
        }
    }

    public int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bea073", new Object[]{this})).intValue();
        }
        if (this.f11781a.f11832a == 0) {
            return gbg.a();
        }
        return this.f11781a.f11832a;
    }

    public int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ccb7f4", new Object[]{this})).intValue();
        }
        if (this.f11781a.b == 0) {
            return gbg.b();
        }
        return this.f11781a.b;
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            this.f11781a.b = i;
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else {
            this.f11781a.f11832a = i;
        }
    }

    public String A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("df3f9158", new Object[]{this}) : this.f11781a.d;
    }

    public DXEngineConfig B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("3f523311", new Object[]{this});
        }
        if (C() != null) {
            return C().a();
        }
        return null;
    }

    public r C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("92ede45c", new Object[]{this}) : this.f11781a.l;
    }

    public DinamicXEngine D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("c14b0c5c", new Object[]{this});
        }
        r C = C();
        if (C != null) {
            return C.b();
        }
        return null;
    }

    public com.taobao.android.dinamicx.eventchain.h E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.eventchain.h) ipChange.ipc$dispatch("98343e86", new Object[]{this}) : this.P;
    }

    public void a(com.taobao.android.dinamicx.eventchain.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee034764", new Object[]{this, hVar});
        } else {
            this.P = hVar;
        }
    }

    public void a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a042611", new Object[]{this, dXTemplateItem});
        } else {
            this.d = dXTemplateItem;
        }
    }

    public int F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3eff1c0", new Object[]{this})).intValue() : this.y;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.y = i;
        }
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue();
        }
        int i = this.y;
        return i == 1 || i == 2;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue();
        }
        if (C() != null && C().a() != null && C().a().l()) {
            return true;
        }
        return d() != null && d().isOpenNewFastReturnLogic();
    }

    public DXWidgetNode I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("9a76156f", new Object[]{this});
        }
        if (s() != null) {
            return s().getExpandWidgetNode();
        }
        return null;
    }

    public DXRuntimeContext a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("a295b18b", new Object[]{this, str, str2});
        }
        if (this.f11781a.p == null) {
            this.f11781a.p = new ConcurrentHashMap();
        }
        this.f11781a.p.put(str, str2);
        return this;
    }

    public Map<String, String> J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("25c5e046", new Object[]{this}) : this.f11781a.p;
    }

    public String K() {
        DXTemplateItem dXTemplateItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2078db8e", new Object[]{this});
        }
        a aVar = this.c;
        if (aVar != null) {
            dXTemplateItem = aVar.f11782a;
        } else {
            dXTemplateItem = this.d;
        }
        return dXTemplateItem == null ? "tplNUll" : dXTemplateItem.b();
    }

    public bj M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bj) ipChange.ipc$dispatch("5546a4b6", new Object[]{this});
        }
        if (C() != null) {
            return C().j();
        }
        return null;
    }

    public ggx N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggx) ipChange.ipc$dispatch("7cd5c279", new Object[]{this});
        }
        if (C() != null) {
            return C().k();
        }
        return null;
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue() : M() != null;
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.S = i;
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
        } else {
            this.w = i;
        }
    }

    public int Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("48af44b", new Object[]{this})).intValue() : this.S;
    }

    public int T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4b53ace", new Object[]{this})).intValue() : this.w;
    }

    public String R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce20f5e7", new Object[]{this});
        }
        if (this.f11781a.e == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < this.f11781a.e.size(); i++) {
            jSONObject.put(String.valueOf(this.f11781a.e.keyAt(i)), (Object) this.f11781a.e.valueAt(i).getClass().getName());
        }
        return jSONObject.toJSONString();
    }

    public by L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (by) ipChange.ipc$dispatch("e1076e28", new Object[]{this}) : this.f11781a;
    }

    public void a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487cd5d9", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext == null) {
        } else {
            this.f11781a = dXRuntimeContext.f11781a;
        }
    }

    public com.taobao.android.dinamicx.widget.bg P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.widget.bg) ipChange.ipc$dispatch("2ed9e56b", new Object[]{this}) : this.b;
    }

    public void a(com.taobao.android.dinamicx.widget.bg bgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf5d4fc", new Object[]{this, bgVar});
        } else {
            this.b = bgVar;
        }
    }
}
