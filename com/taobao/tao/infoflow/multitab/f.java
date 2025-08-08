package com.taobao.tao.infoflow.multitab;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import com.taobao.tao.infoflow.multitab.c;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a;
import com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.uc.webview.export.media.MessageID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.ksk;
import tb.kss;
import tb.lar;
import tb.lbo;
import tb.lbq;
import tb.ldf;
import tb.ldg;
import tb.ldk;
import tb.lgq;
import tb.ljw;
import tb.oiy;
import tb.ojk;
import tb.ojl;
import tb.ojr;
import tb.okc;
import tb.oqc;
import tb.oql;
import tb.ovm;
import tb.ovn;
import tb.ovp;
import tb.ovr;
import tb.qut;
import tb.sye;
import tb.teb;
import tb.tmv;

/* loaded from: classes8.dex */
public class f implements ovm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean u;

    /* renamed from: a  reason: collision with root package name */
    private int f20638a;
    private final ljw b;
    private JSONObject c;
    private JSONObject d;
    private c e;
    private final i f;
    private final com.taobao.tao.topmultitab.protocol.c g;
    private final okc h;
    private final IHomeSubTabController i;
    private View j;
    private OnScreenChangedListener l;
    private String o;
    private final IMultiTabPerformanceListener q;
    private String s;
    private boolean t;
    private a.d w;
    private boolean k = false;
    private boolean r = false;
    private final a.b p = new a.b() { // from class: com.taobao.tao.infoflow.multitab.f.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            IHomeSubTabController a2 = f.this.a();
            if (a2 == null) {
                return;
            }
            a2.onPullRefresh();
        }

        @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.b
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            IHomeSubTabController a2 = f.this.a();
            if (a2 == null) {
                return;
            }
            a2.onPullDistance(i);
        }

        @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.b
        public void a(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8961210", new Object[]{this, refreshState, refreshState2});
                return;
            }
            IHomeSubTabController a2 = f.this.a();
            if (a2 == null) {
                return;
            }
            a2.onRefreshStateChanged(com.taobao.tao.topmultitab.c.a().a(refreshState), com.taobao.tao.topmultitab.c.a().a(refreshState2));
        }
    };
    private final ovn.a m = new ovn.a() { // from class: com.taobao.tao.infoflow.multitab.f.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ovn.a
        public void a(IHomeSubTabController iHomeSubTabController) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6cd2679", new Object[]{this, iHomeSubTabController});
                return;
            }
            g.a("MultiTabHelper", "OnBundleLoadListener subscribeTab assign");
            f.a(f.this).b(iHomeSubTabController);
            int b = f.a(f.this).b();
            if (b == -1) {
                g.a("MultiTabHelper", "OnBundleLoadListener subscribeTab not create");
                return;
            }
            f.a(f.this).i(b);
            f.b(f.this).a(b, true);
            if (f.c(f.this) != b) {
                return;
            }
            iHomeSubTabController.onPageSelected();
            ovp.e();
        }
    };
    private final c.a n = new c.a() { // from class: com.taobao.tao.infoflow.multitab.f.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.infoflow.multitab.c.a
        public boolean a(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
            }
            if ("coldStart".equals(str2)) {
                f.u = true;
                g.a("MultiTabHelper", "冷启请求完成");
            }
            if (!"coldStart".equals(str) || !z || f.d(f.this) == null || !f.e(f.this)) {
                return true;
            }
            g.a("MultiTabHelper", "冷启之后缓存上屏，直接丢弃");
            f.f(f.this);
            return false;
        }

        @Override // com.taobao.tao.infoflow.multitab.c.a
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            g.a("MultiTabHelper", "onBaseRefresh onProcess ");
            f.a(f.this, jSONObject);
            f fVar = f.this;
            f.b(fVar, f.d(fVar));
            f.g(f.this);
            f.b(f.this).f();
        }

        @Override // com.taobao.tao.infoflow.multitab.c.a
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
                return;
            }
            f.a(f.this, jSONObject);
            g.a("MultiTabHelper", "onDeltaRefresh onProcess ");
            boolean a2 = e.a(f.b(f.this).b(), e.a(f.d(f.this)));
            g.a("MultiTabHelper", "onProcess different：" + a2);
            if (a2) {
                f fVar = f.this;
                f.b(fVar, f.d(fVar));
            }
            f.b(f.this).f();
        }
    };

    static {
        kge.a(722843786);
        kge.a(1527958550);
    }

    public static /* synthetic */ int a(f fVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10f011a5", new Object[]{fVar, new Integer(i)})).intValue();
        }
        fVar.f20638a = i;
        return i;
    }

    public static /* synthetic */ JSONObject a(f fVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("74a7ccbf", new Object[]{fVar, jSONObject});
        }
        fVar.d = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ i a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("dff5e62b", new Object[]{fVar}) : fVar.f;
    }

    public static /* synthetic */ void a(f fVar, IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3789d0", new Object[]{fVar, iHomeSubTabController});
        } else {
            fVar.a(iHomeSubTabController);
        }
    }

    public static /* synthetic */ void a(f fVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fedefb", new Object[]{fVar, str});
        } else {
            fVar.e(str);
        }
    }

    public static /* synthetic */ void a(f fVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a86755", new Object[]{fVar, str, jSONObject});
        } else {
            fVar.a(str, jSONObject);
        }
    }

    public static /* synthetic */ boolean a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10f05187", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.k = z;
        return z;
    }

    public static /* synthetic */ String b(f fVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed32b864", new Object[]{fVar, str});
        }
        fVar.o = str;
        return str;
    }

    public static /* synthetic */ ljw b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljw) ipChange.ipc$dispatch("70f94c3b", new Object[]{fVar}) : fVar.b;
    }

    public static /* synthetic */ void b(f fVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a9056be", new Object[]{fVar, jSONObject});
        } else {
            fVar.a(jSONObject);
        }
    }

    public static /* synthetic */ int c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("539aa566", new Object[]{fVar})).intValue() : fVar.f20638a;
    }

    public static /* synthetic */ JSONObject c(f fVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4f8146fd", new Object[]{fVar, jSONObject});
        }
        fVar.c = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ JSONObject d(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("befaab94", new Object[]{fVar}) : fVar.d;
    }

    public static /* synthetic */ void d(f fVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7248fc", new Object[]{fVar, jSONObject});
        } else {
            fVar.b(jSONObject);
        }
    }

    public static /* synthetic */ boolean e(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6cdafb79", new Object[]{fVar})).booleanValue() : fVar.x();
    }

    public static /* synthetic */ void f(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97b2676", new Object[]{fVar});
        } else {
            fVar.i();
        }
    }

    public static /* synthetic */ void g(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861b5177", new Object[]{fVar});
        } else {
            fVar.p();
        }
    }

    public static /* synthetic */ IMultiTabPerformanceListener h(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMultiTabPerformanceListener) ipChange.ipc$dispatch("e869eaf7", new Object[]{fVar}) : fVar.q;
    }

    public static /* synthetic */ boolean i(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f5ba77d", new Object[]{fVar})).booleanValue() : fVar.k;
    }

    public static /* synthetic */ Activity j(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("b7f6386e", new Object[]{fVar}) : fVar.l();
    }

    public static /* synthetic */ Map k(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("877b5c70", new Object[]{fVar}) : fVar.q();
    }

    public static /* synthetic */ String l(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a57c53a4", new Object[]{fVar}) : fVar.o;
    }

    public f(com.taobao.tao.topmultitab.protocol.c cVar, JSONObject jSONObject, IHomeSubTabController iHomeSubTabController) {
        this.f20638a = -2;
        this.d = jSONObject;
        this.i = iHomeSubTabController;
        this.g = new ojk(this, new ojl(iHomeSubTabController, cVar));
        this.f = new i(this.g, this.m);
        this.q = new lgq(this.f);
        teb tebVar = new teb(this.f);
        this.f.a(this.q);
        this.f.a(tebVar);
        this.f.a(jSONObject, f());
        i iVar = this.f;
        iVar.a(new sye(iVar));
        this.h = new okc();
        this.b = new ljw(this.f, jSONObject, this.g, this.q);
        this.b.a(t());
        this.b.a(this.p);
        this.f20638a = e.g(this.d);
        h();
        v();
        if (u) {
            this.t = true;
        }
        this.q.b(ovr.HOME_MULTI_TAB);
    }

    public IHomeSubTabController f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("1bbf9be", new Object[]{this});
        }
        IHomeSubTabController iHomeSubTabController = this.i;
        if (!(iHomeSubTabController instanceof qut)) {
            return null;
        }
        IHomeSubTabController defaultSubController = ((qut) iHomeSubTabController).getDefaultSubController();
        if (defaultSubController == null) {
            defaultSubController = new ojr(this.g, ovr.TAB_ID_MAINLAND_RECOMMEND_MICROSERVICES);
        }
        ((qut) this.i).setDefaultSubTabController(defaultSubController);
        return defaultSubController;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b.a(z);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.b.b(z);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        View view = this.j;
        if (view != null && view.getParent() != null) {
            ((ViewGroup) this.j.getParent()).removeView(this.j);
        }
        this.f.e();
        this.b.c();
        IHomeSubTabController f = f();
        if (f != null) {
            f.onDestroy();
        }
        j();
        w();
    }

    @Override // tb.ovm
    public IHomeSubTabController a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHomeSubTabController) ipChange.ipc$dispatch("3fee6479", new Object[]{this}) : this.f.a(this.f20638a);
    }

    public View a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fef0fbf4", new Object[]{this, str});
        }
        ljw ljwVar = this.b;
        if (ljwVar == null) {
            return null;
        }
        return ljwVar.a(str);
    }

    public IHomeSubTabController c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("92a9bfc5", new Object[]{this, str});
        }
        i iVar = this.f;
        if (iVar == null) {
            return null;
        }
        return iVar.b(str);
    }

    public ojr c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ojr) ipChange.ipc$dispatch("1e6c00c5", new Object[]{this});
        }
        IHomeSubTabController a2 = this.f.a();
        if (!(a2 instanceof ojr)) {
            return null;
        }
        return (ojr) a2;
    }

    public JSONObject m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5c7d6194", new Object[]{this}) : this.f.c(this.f20638a);
    }

    public String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this}) : this.f.n(this.f20638a);
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.f.b(this.f20638a);
    }

    public View a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context}) : this.b.a(context);
    }

    public View b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c13a4681", new Object[]{this, context});
        }
        this.j = this.b.b(context);
        return this.j;
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        g.a("MultiTabHelper", "onStart");
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.a();
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        g.a("MultiTabHelper", MessageID.onStop);
        c cVar = this.e;
        if (cVar != null) {
            cVar.b();
        }
        IMultiTabPerformanceListener iMultiTabPerformanceListener = this.q;
        if (iMultiTabPerformanceListener == null) {
            return;
        }
        iMultiTabPerformanceListener.a();
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.b.a();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.b.a(this.f.c(), -1);
        }
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.f20638a == -2 || this.f.c() == this.f20638a;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.f.b() == this.f20638a;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : this.f.i() == this.f.b();
    }

    public void a(Uri uri, String str, a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("114d0ae0", new Object[]{this, uri, str, dVar});
            return;
        }
        g.a("MultiTabHelper", "外链拉起: " + uri);
        String queryParameter = uri.getQueryParameter("categoryTabId");
        this.w = dVar;
        if (StringUtils.isEmpty(queryParameter)) {
            e();
            a.d dVar2 = this.w;
            if (dVar2 == null) {
                return;
            }
            dVar2.a();
        } else if (x()) {
            if (this.t) {
                g(queryParameter);
                g.a("MultiTabHelper", "外链唤起，tab已刷新过了，直接跳转: " + queryParameter);
                return;
            }
            this.s = queryParameter;
            g.a("MultiTabHelper", "外链唤起，tab尚未锚定过，等待补偿: " + queryParameter);
        } else {
            g(queryParameter);
        }
    }

    public Map<String, String> f(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2185406c", new Object[]{this, str});
        }
        JSONObject jSONObject3 = this.c;
        if (jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject(e.KEY_SMART_CONTENT)) == null || (jSONObject2 = jSONObject.getJSONObject("searchParams")) == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        if (StringUtils.equals("MultiTabSelect", str) && !this.r) {
            z = false;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.a(jSONObject2, z);
        hashMap.put(ovr.HOME_MULTI_TAB, JSON.toJSONString(jSONObject2));
        this.r = false;
        return hashMap;
    }

    public List<String> a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c95c185f", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            String a2 = this.f.a(this.f20638a, false);
            if (!StringUtils.isEmpty(a2)) {
                arrayList.add(a2);
            }
        }
        if (z2) {
            String a3 = this.f.a(this.f20638a, true);
            if (!StringUtils.isEmpty(a3)) {
                arrayList.add(a3);
            }
        }
        return arrayList;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        if (this.e == null) {
            this.e = new c(this.n);
        }
        oql.a().i().a(this.e, ksk.NEW_FACE_PARENT.f30287a);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            ldk.a("Page_Home", "", "1.0", "MultiTab_Discard_Cache", "", null);
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (!u) {
        } else {
            this.t = true;
            if (StringUtils.isEmpty(this.s) || !x()) {
                return;
            }
            g.a("MultiTabHelper", "外链拉起补偿: " + this.s);
            g(this.s);
            this.s = null;
        }
    }

    private a.b t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.b) ipChange.ipc$dispatch("66ca8d56", new Object[]{this}) : new a.b() { // from class: com.taobao.tao.infoflow.multitab.f.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.b
            public void a(int i, JSONObject jSONObject, boolean z) {
                IpChange ipChange2 = $ipChange;
                boolean z2 = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8252c2bf", new Object[]{this, new Integer(i), jSONObject, new Boolean(z)});
                    return;
                }
                f.c(f.this, jSONObject);
                f.a(f.this, i);
                f.h(f.this).a("tabSelected");
                com.taobao.tao.topmultitab.c.a().f(false);
                IHomeSubTabController a2 = f.this.a();
                if (a2 == null) {
                    g.a("MultiTabHelper", "current tab controller is null, pos: " + i);
                    return;
                }
                a2.onTabClicked();
                f.b(f.this).a(false);
                if (e.e(jSONObject)) {
                    f.b(f.this).a(a2);
                    if (f.i(f.this)) {
                        a2.onPageSelected();
                        f.d(f.this, jSONObject);
                        f.a(f.this, a2);
                        f.a(f.this, false);
                    } else {
                        kss.a(f.j(f.this), f.k(f.this));
                    }
                } else {
                    f.d(f.this, jSONObject);
                    View k = f.a(f.this).k(f.c(f.this));
                    if (k instanceof SubWrapFrameLayout) {
                        z2 = ((SubWrapFrameLayout) k).isRealView();
                    }
                    if (!f.a(f.this).d(f.c(f.this)) && z2) {
                        f.b(f.this).a(a2);
                        g.a("MultiTabHelper", "MultiTabHelp -> onPageSelected " + f.c(f.this));
                        a2.onPageSelected();
                        f.a(f.this).e(-1);
                    } else {
                        g.a("MultiTabHelper", "MultiTabHelp -> reRenderTabView " + f.c(f.this));
                        f.a(f.this).e(f.c(f.this));
                        f.b(f.this).a(f.c(f.this), false);
                    }
                    f.a(f.this, a2);
                }
                if (z) {
                    kss.b(f.d(f.this), jSONObject);
                }
                f.a(f.this, e.l(jSONObject), jSONObject);
                f fVar = f.this;
                f.a(fVar, fVar.r());
            }

            @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.b
            public void b(int i, JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1787bdf6", new Object[]{this, new Integer(i), jSONObject});
                    return;
                }
                f fVar = f.this;
                f.b(fVar, f.a(fVar).n(i));
                IHomeSubTabController a2 = f.a(f.this).a(i);
                if (a2 != null) {
                    a2.onPageUnSelected();
                }
                if (e.e(jSONObject)) {
                    f.a(f.this, true);
                }
                f.h(f.this).b(f.l(f.this), i);
                g.a("MultiTabHelper", "onTabUnSelected: " + i + ", controller: " + a2);
            }
        };
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (!e.k(jSONObject)) {
            g.a("MultiTabHelper", "不需要发请求");
        } else {
            this.r = true;
            oqc.a().r();
        }
    }

    private void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        g.a("MultiTabHelper", "commitMessiah leaveTabId: " + this.o + ", enterTabId: " + str);
        if (StringUtils.isEmpty(this.o)) {
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("extKey1", this.o);
        hashMap.put("extKey2", str);
        this.o = null;
        ldg.b("QPS", "Page_MultiTab", hashMap);
    }

    private void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        lbq b = oiy.a().b();
        if (b == null) {
            return;
        }
        lbo homePageManager = b.getHomePageManager();
        if (homePageManager == null || str == null) {
            ldf.d("MultiTabHelper", "通知tab变化了，当前tab类型为空");
            return;
        }
        homePageManager.y().a(str, e.a(jSONObject, this.d));
        ldf.d("MultiTabHelper", "通知tab变化了，当前tab类型：" + str);
    }

    private void a(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6cd2679", new Object[]{this, iHomeSubTabController});
        } else if (iHomeSubTabController == null) {
        } else {
            this.h.a();
            this.h.b(iHomeSubTabController);
            kss.a(q());
            this.h.a(iHomeSubTabController);
        }
    }

    private Map<String, String> q() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7abac4ad", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject2 = this.c;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("passOnTrack")) != null) {
            for (String str : jSONObject.keySet()) {
                Object obj = jSONObject.get(str);
                hashMap.put(str, obj == null ? "" : obj.toString());
            }
        }
        return hashMap;
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        g.a("MultiTabHelper", "refreshTabs");
        lar.e("MultiTab.refreshTabs");
        this.k = false;
        this.f.a(jSONObject, f());
        this.b.a(jSONObject);
        lar.f("MultiTab.refreshTabs");
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.e == null) {
        } else {
            oql.a().i().b(this.e, oqc.a().l());
        }
    }

    private Activity l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("35b95195", new Object[]{this});
        }
        lbq b = oiy.a().b();
        if (b == null) {
            g.a("MultiTabHelper", "pageProvider == null");
            return null;
        }
        return b.getCurActivity();
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        ljw ljwVar = this.b;
        if (ljwVar == null) {
            return;
        }
        ljwVar.b(str);
    }

    private void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        ljw ljwVar = this.b;
        if (ljwVar == null) {
            return;
        }
        ljwVar.a(str, this.w);
    }

    public void a(tmv tmvVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c90002f", new Object[]{this, tmvVar, str, str2});
        } else if (StringUtils.equals(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.TAB_SECTION_CODE, str)) {
            a(tmvVar, str2);
        } else {
            b(tmvVar, str, str2);
        }
    }

    public JSONObject b(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("bc6d7578", new Object[]{this, iHomeSubTabController}) : this.f.a(iHomeSubTabController);
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else if (!com.taobao.homepage.utils.b.b() && !com.taobao.homepage.utils.b.c()) {
        } else {
            if (this.l == null) {
                this.l = new OnScreenChangedListener() { // from class: com.taobao.tao.infoflow.multitab.f.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.autosize.OnScreenChangedListener
                    public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                        OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
                    }

                    @Override // com.taobao.android.autosize.OnScreenChangedListener
                    public void onScreenChanged(int i, Configuration configuration) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                        } else {
                            f.this.u();
                        }
                    }
                };
            }
            h.a().c(this.l);
        }
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else if (this.l == null) {
        } else {
            h.a().d(this.l);
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        ljw ljwVar = this.b;
        if (ljwVar == null) {
            return;
        }
        ljwVar.h();
    }

    private void a(tmv tmvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543515a5", new Object[]{this, tmvVar, str});
            return;
        }
        IHomeSubTabController a2 = this.f.a(this.f.a(str));
        if (a2 == null) {
            return;
        }
        a2.passThroughData(tmvVar, null, null);
    }

    private void b(tmv tmvVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c199a30", new Object[]{this, tmvVar, str, str2});
            return;
        }
        IHomeSubTabController a2 = this.f.a();
        if (a2 == null) {
            return;
        }
        a2.passThroughData(tmvVar, str, str2);
    }

    private boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : com.taobao.android.home.component.utils.j.a("enableMultiTabOutLinkCompensate", true);
    }
}
