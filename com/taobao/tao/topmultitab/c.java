package com.taobao.tao.topmultitab;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.expression.event.DXViewAppearEvent;
import com.taobao.android.dinamicx.expression.event.DXViewDisappearEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.home.component.utils.i;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.view.widgets.ViewPagerFakeDragView;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.share.taopassword.busniess.model.g;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.view.HomeViewPager;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ept;
import tb.kge;
import tb.ksp;
import tb.ksr;
import tb.kss;
import tb.kuk;
import tb.lap;
import tb.laq;
import tb.las;
import tb.lbl;
import tb.lbo;
import tb.lbq;
import tb.ldf;
import tb.ldg;
import tb.ldk;
import tb.ljk;
import tb.llh;
import tb.mjx;
import tb.ohv;
import tb.oiy;
import tb.oqc;
import tb.oql;
import tb.ovk;
import tb.ovl;
import tb.ovn;
import tb.ovp;
import tb.ovr;
import tb.ovt;
import tb.qut;
import tb.riy;
import tb.sqg;
import tb.ssm;
import tb.tgr;
import tb.xpd;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_EX_CONTENT = "exContent";
    public static final String ATTR_SUB_CONTAINER_PARAMS = "subContainerParam";
    public static final String HOME_TAB_ID_CAMPAIGN = "campaign";
    public static final String HOME_TAB_ID_HOME = "home";
    public static final String HOME_TAB_ID_HOUR_DELIVERY = "hourlyDelivery";
    public static final String HOME_TAB_ID_RECOMMEND = "recommend";
    public static final String HOME_TAB_ID_SUBSCRIBE = "subscribe";
    public static final String SERVICE_REALTIME_PASS_PARAMS = "realtimePassParams";

    /* renamed from: a  reason: collision with root package name */
    private int f21146a;
    private com.taobao.tao.topmultitab.protocol.c b;
    private ConcurrentHashMap<String, IHomeSubTabController> c;
    private FrameLayout d;
    private HomeViewPager e;
    private com.taobao.tao.topmultitab.view.a f;
    private TopMultiTabBindingXMsg g;
    private boolean h;
    private Map<String, String> i;
    private IHomeSubTabController j;
    private b k;
    private com.taobao.tao.topmultitab.a l;
    private final ovr m;
    private ovl n;
    private ovk o;
    private boolean p;
    private JSONObject q;
    private float r;
    private d s;
    private boolean t;
    private final ovn.a u;
    private final com.taobao.tao.homepage.revision.c v;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static c f21152a;

        static {
            kge.a(1255169368);
            f21152a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("fa2d54d8", new Object[0]) : f21152a;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f21153a;
        public String b;

        static {
            kge.a(-772378027);
        }
    }

    static {
        kge.a(345020090);
    }

    public static /* synthetic */ float a(c cVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("433b399e", new Object[]{cVar, new Float(f)})).floatValue();
        }
        cVar.r = f;
        return f;
    }

    public static /* synthetic */ void a(c cVar, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("242c6f15", new Object[]{cVar, new Float(f), new Integer(i)});
        } else {
            cVar.a(f, i);
        }
    }

    public static /* synthetic */ void a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("433b44f1", new Object[]{cVar, new Integer(i)});
        } else {
            cVar.e(i);
        }
    }

    public static /* synthetic */ void a(c cVar, IHomeSubTabController iHomeSubTabController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9025c65", new Object[]{cVar, iHomeSubTabController, new Boolean(z)});
        } else {
            cVar.a(iHomeSubTabController, z);
        }
    }

    public static /* synthetic */ void a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b406b19c", new Object[]{cVar, str});
        } else {
            cVar.h(str);
        }
    }

    public static /* synthetic */ void a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("433b84c2", new Object[]{cVar, new Boolean(z)});
        } else {
            cVar.b(z);
        }
    }

    public static /* synthetic */ boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("864c3856", new Object[]{cVar})).booleanValue() : cVar.d();
    }

    public static /* synthetic */ boolean a(c cVar, IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a6053", new Object[]{cVar, iHomeSubTabController})).booleanValue() : cVar.b(iHomeSubTabController);
    }

    public static /* synthetic */ void b(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77a7d50", new Object[]{cVar, new Integer(i)});
        } else {
            cVar.c(i);
        }
    }

    public static /* synthetic */ void b(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77abd21", new Object[]{cVar, new Boolean(z)});
        } else {
            cVar.e(z);
        }
    }

    public static /* synthetic */ boolean b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ed24f817", new Object[]{cVar})).booleanValue() : cVar.V();
    }

    public static /* synthetic */ int c(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2bb9b5a2", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.f21146a = i;
        return i;
    }

    public static /* synthetic */ lbo c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lbo) ipChange.ipc$dispatch("367a7d99", new Object[]{cVar}) : cVar.T();
    }

    public static /* synthetic */ boolean c(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bb9f584", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.h = z;
        return z;
    }

    public static /* synthetic */ ovl d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ovl) ipChange.ipc$dispatch("3de15a8c", new Object[]{cVar}) : cVar.n;
    }

    public static /* synthetic */ boolean d(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ff92de3", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.t = z;
        return z;
    }

    public static /* synthetic */ com.taobao.homepage.view.widgets.bgcontainer.c e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.homepage.view.widgets.bgcontainer.c) ipChange.ipc$dispatch("33dba49b", new Object[]{cVar}) : cVar.b();
    }

    public static /* synthetic */ com.taobao.tao.topmultitab.view.a f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.topmultitab.view.a) ipChange.ipc$dispatch("84dd7df3", new Object[]{cVar}) : cVar.f;
    }

    public static /* synthetic */ HomeViewPager g(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HomeViewPager) ipChange.ipc$dispatch("ccd9ccb6", new Object[]{cVar}) : cVar.e;
    }

    public static /* synthetic */ ovk h(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ovk) ipChange.ipc$dispatch("5b762ee9", new Object[]{cVar}) : cVar.o;
    }

    public static /* synthetic */ float i(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bd12364a", new Object[]{cVar})).floatValue() : cVar.r;
    }

    public static /* synthetic */ boolean j(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("23eaf61f", new Object[]{cVar})).booleanValue() : cVar.t;
    }

    public static /* synthetic */ int k(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ac3b5cf", new Object[]{cVar})).intValue() : cVar.f21146a;
    }

    private c() {
        this.f21146a = 1;
        this.r = -1.0f;
        this.t = false;
        this.u = new ovn.a() { // from class: com.taobao.tao.topmultitab.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ovn.a
            public void a(IHomeSubTabController iHomeSubTabController) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d6cd2679", new Object[]{this, iHomeSubTabController});
                    return;
                }
                c.a().a("subscribe", iHomeSubTabController);
                c.a().N();
                if (c.a().z() != iHomeSubTabController) {
                    return;
                }
                iHomeSubTabController.onPageSelected();
                ovp.e();
            }
        };
        this.c = new ConcurrentHashMap<>(2);
        this.g = new TopMultiTabBindingXMsg();
        this.k = new b();
        this.m = new ovr();
        this.v = new com.taobao.tao.homepage.revision.b();
        com.taobao.tao.recommend3.tracelog.c.d("start[1], TopMultiTabManager");
        P();
        new xpd();
        com.taobao.tao.recommend3.tracelog.c.d("end[1], TopMultiTabManager");
    }

    private void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
            return;
        }
        SystemClock.uptimeMillis();
        this.b = U();
        this.s = new d(this.b);
        this.n = new ovl();
        this.o = new ovk();
        this.l = new com.taobao.tao.topmultitab.a(this);
        this.m.a(this, this.b, ovr.TAB_ID_MAINLAND_RECOMMEND_MICROSERVICES);
        a("subscribe", new ovn(this.b, this.u));
        this.l.a(this.b);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("fa2d54d8", new Object[0]) : a.a();
    }

    public boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue() : this.l.a(jSONObject);
    }

    public com.taobao.tao.homepage.revision.c c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.homepage.revision.c) ipChange.ipc$dispatch("2270886b", new Object[]{this}) : this.v;
    }

    public ViewGroup e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("4fb55629", new Object[]{this}) : this.d;
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        lap.a("TopTabBar", ept.SUB_CREATE_VIEW, "创建多TAB相关视图");
        this.l.a(this.b);
        b(view);
        c(view);
        g();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.l.a(this.b);
        }
    }

    private void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else {
            ovr.a(view.getContext());
        }
    }

    private void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
            return;
        }
        if (this.e == null) {
            this.e = new HomeViewPager(view.getContext());
            this.e.setOverScrollMode(2);
            if (Build.VERSION.SDK_INT >= 21) {
                this.e.setNestedScrollingEnabled(false);
            }
            this.e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f = new com.taobao.tao.topmultitab.view.a(this.e);
        }
        d(this.e);
        this.f.e();
        this.e.clearOnPageChangeListeners();
        this.t = false;
        this.e.addOnPageChangeListener(W());
        this.e.setAdapter(this.f);
        this.d = (FrameLayout) view.findViewById(R.id.rv_main_container_wrapper);
        this.d.addView(this.e);
        lap.a("TopTabBar", "createHomeViewPager", "TopMultiTabManager.createHomeViewPager;创建首页ViewPager");
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.q;
        if (jSONObject != null) {
            b(jSONObject);
        } else if (com.taobao.tao.topmultitab.a.c()) {
        } else {
            JSONObject Q = Q();
            if (Q == null) {
                ksp.b("TopMultiTabManager", "updateDefaultData, use default data");
                Q = R();
            }
            b(Q);
        }
    }

    private JSONObject Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("36223f78", new Object[]{this}) : sqg.d();
    }

    private JSONObject R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("49ca12f9", new Object[]{this});
        }
        JSONObject a2 = sqg.a(sqg.a());
        if (a2 != null) {
            return a2.getJSONObject("item");
        }
        return null;
    }

    private void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89069007", new Object[]{this, view});
        } else if (view == null || !(view.getParent() instanceof ViewGroup)) {
        } else {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        if (this.e != null) {
            return this.h;
        }
        return false;
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        laq c = laq.a().a("TopTabBar").b("updateTabs").c("TopMultiTabManager.updateHomeTabs");
        this.q = jSONObject;
        this.s.a(jSONObject, this.e, this.f, this.c);
        c.b();
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else if (this.f == null || jSONObject == null || jSONObject.isEmpty()) {
        } else {
            this.f.c(jSONObject);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.f == null) {
        } else {
            IHomeSubTabController b2 = b(str);
            IHomeSubTabController z = z();
            if (b2 == null || b2.equals(z)) {
                return;
            }
            this.f.a(str);
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        if (com.taobao.tao.topmultitab.a.c() && this.f.b(str) == 0) {
            IHomeSubTabController iHomeSubTabController = this.j;
            if (iHomeSubTabController != null) {
                iHomeSubTabController.onPageUnSelected();
            }
            IHomeSubTabController c = this.f.c(0);
            if (c != null) {
                this.j = c;
                c.onPageSelected();
                d(c.isEnableToSecondFloor());
            }
        }
        if (this.q.size() != 1) {
            return;
        }
        com.taobao.android.home.component.utils.e.e("TopMultiTabManager", "补偿一次onPageSelected");
        e(0);
    }

    public IHomeSubTabController b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHomeSubTabController) ipChange.ipc$dispatch("b23069c4", new Object[]{this, str}) : c(ovr.a(str));
    }

    public IHomeSubTabController c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("92a9bfc5", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return this.c.get(str);
        }
        return null;
    }

    public boolean a(String str, IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7e1a6073", new Object[]{this, str, iHomeSubTabController})).booleanValue() : (TextUtils.isEmpty(str) || iHomeSubTabController == null || this.c.put(str, iHomeSubTabController) == null) ? false : true;
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue() : !TextUtils.isEmpty(str) && this.c.remove(str) != null;
    }

    public void j() {
        IHomeSubTabController c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        ksp.b("TopMultiTabManager", "TopMultiTabManager onCreate");
        com.taobao.tao.topmultitab.view.a aVar = this.f;
        if (aVar == null || (c = aVar.c()) == null) {
            return;
        }
        c.onCreate();
    }

    public void i() {
        IHomeSubTabController c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        com.taobao.tao.topmultitab.view.a aVar = this.f;
        if (aVar == null || (c = aVar.c()) == null) {
            return;
        }
        c.onFirstFrameVisible();
    }

    public void k() {
        IHomeSubTabController c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        ksp.b("TopMultiTabManager", "TopMultiTabManager onStart");
        lbo T = T();
        if (T != null) {
            T.y().i();
        }
        com.taobao.tao.topmultitab.view.a aVar = this.f;
        if (aVar == null || (c = aVar.c()) == null) {
            return;
        }
        c.onStart();
    }

    public void e(String str) {
        IHomeSubTabController c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        ksp.b("TopMultiTabManager", "TopMultiTabManager onResume");
        lbo T = T();
        if (T != null) {
            T.y().a(str);
        }
        com.taobao.tao.topmultitab.view.a aVar = this.f;
        if (aVar == null || (c = aVar.c()) == null) {
            return;
        }
        if ("coldStart".equals(str)) {
            c.onColdStartResume();
            ksp.b("TopMultiTabManager", "冷启不传给子容器，维持原状");
            return;
        }
        c.onResume();
        if (com.taobao.homepage.page.weexv2.a.d()) {
            return;
        }
        f(c);
    }

    public void l() {
        IHomeSubTabController c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        ksp.b("TopMultiTabManager", "TopMultiTabManager onNewIntent");
        com.taobao.tao.topmultitab.view.a aVar = this.f;
        if (aVar == null || (c = aVar.c()) == null) {
            return;
        }
        f(c);
    }

    public void m() {
        IHomeSubTabController c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        lbo T = T();
        if (T != null) {
            T.y().k();
        }
        if (j.a("enableStatisticsOptimize", false)) {
            com.taobao.gateway.dispatch.a.b().a(new Runnable() { // from class: com.taobao.tao.topmultitab.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ksp.b("TopMultiTabManager", "TopMultiTabManager onPause");
                    }
                }
            });
        } else {
            ksp.b("TopMultiTabManager", "TopMultiTabManager onPause");
        }
        com.taobao.tao.topmultitab.view.a aVar = this.f;
        if (aVar == null || (c = aVar.c()) == null) {
            return;
        }
        c.onPause();
        if (com.taobao.homepage.page.weexv2.a.d()) {
            return;
        }
        Y();
    }

    public void n() {
        IHomeSubTabController c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        lbo T = T();
        if (T != null) {
            T.y().l();
        }
        if (j.a("enableStatisticsOptimize", false)) {
            com.taobao.gateway.dispatch.a.b().a(new Runnable() { // from class: com.taobao.tao.topmultitab.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ksp.b("TopMultiTabManager", "TopMultiTabManager onStop");
                    }
                }
            });
        } else {
            ksp.b("TopMultiTabManager", "TopMultiTabManager onStop");
        }
        com.taobao.tao.topmultitab.view.a aVar = this.f;
        if (aVar == null || (c = aVar.c()) == null) {
            return;
        }
        c.onStop();
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        ksp.b("TopMultiTabManager", "TopMultiTabManager onDestroy");
        com.taobao.tao.topmultitab.view.a aVar = this.f;
        if (aVar != null) {
            aVar.d();
        }
        this.l.b();
    }

    public void p() {
        IHomeSubTabController c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        lbo T = T();
        if (T != null) {
            T.y().g();
        }
        ksp.b("TopMultiTabManager", "TopMultiTabManager onAppToBackground");
        com.taobao.tao.topmultitab.view.a aVar = this.f;
        if (aVar == null || (c = aVar.c()) == null) {
            return;
        }
        c.onAppToBackground();
    }

    public void q() {
        IHomeSubTabController c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        lbo T = T();
        if (T != null) {
            T.y().h();
        }
        ksp.b("TopMultiTabManager", "TopMultiTabManager onAppToFront");
        com.taobao.tao.topmultitab.view.a aVar = this.f;
        if (aVar == null || (c = aVar.c()) == null) {
            return;
        }
        c.onAppToFront();
    }

    public void a(int i, int i2, Intent intent) {
        IHomeSubTabController c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        ksp.b("TopMultiTabManager", "TopMultiTabManager onActivityResult");
        com.taobao.tao.topmultitab.view.a aVar = this.f;
        if (aVar == null || (c = aVar.c()) == null) {
            return;
        }
        c.onActivityResult(i, i2, intent);
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        ksp.b("TopMultiTabManager", "TopMultiTabManager onPullRefresh");
        IHomeSubTabController z = z();
        if (z == null) {
            return;
        }
        z.onPullRefresh();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        IHomeSubTabController z = z();
        if (z == null) {
            return;
        }
        z.onPullDistance(i);
    }

    public void a(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8961210", new Object[]{this, refreshState, refreshState2});
            return;
        }
        IHomeSubTabController z = z();
        if (z == null) {
            return;
        }
        z.onRefreshStateChanged(a(refreshState), a(refreshState2));
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        lap.a("TopTabBar", "onClickRocket", "点击小火箭");
        if (h()) {
            lap.a("TopTabBar", "onClickRocket", "viewpager 滚动中不允许点击小火箭");
            return;
        }
        IHomeSubTabController z = z();
        if (z == null) {
            return;
        }
        z.onClickRocket();
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController z = z();
        if (z != null) {
            return z.isReachTop();
        }
        return false;
    }

    public int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("686426f", new Object[]{this})).intValue();
        }
        IHomeSubTabController z = z();
        if (z != null) {
            return z.getSubContainerScrollY();
        }
        return 0;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController z = z();
        if (z != null) {
            return z.isHandleUpAndDownScrollingEvent();
        }
        return false;
    }

    public void a(String str, Intent intent, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a609f9", new Object[]{this, str, intent, str2});
            return;
        }
        lbo T = T();
        if (T != null) {
            T.y().a(str, intent, str2);
        }
        IHomeSubTabController b2 = b(str);
        com.taobao.tao.topmultitab.view.a aVar = this.f;
        if (aVar != null) {
            a(aVar.b(str), str, "outLink");
        }
        if (b2 == null) {
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        b2.notifyOutLinkParams(intent, str2);
    }

    public void a(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d6c9b8", new Object[]{this, tBLocationDTO});
            return;
        }
        lap.a("TopTabBar", "locationChange", "通知位置发生变化");
        IHomeSubTabController z = z();
        if (z == null) {
            return;
        }
        z.locationChange(tBLocationDTO);
    }

    public int f(String str) {
        IHomeSubTabController b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("669e4a6a", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str) || (b2 = b(str)) == null) {
            return 0;
        }
        lap.a("TopTabBar", "getTabLayoutType", "获取指定的tab布局类型为：" + b2.getTabLayoutType());
        return b2.getTabLayoutType();
    }

    public void a(String str, ThemeData themeData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c881ee6", new Object[]{this, str, themeData, new Boolean(z)});
            return;
        }
        ConcurrentHashMap<String, IHomeSubTabController> concurrentHashMap = this.c;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        for (Map.Entry<String, IHomeSubTabController> entry : this.c.entrySet()) {
            String key = entry.getKey();
            IHomeSubTabController value = entry.getValue();
            if (value != null) {
                lap.a("TopTabBar", "onCustomGlobalThemeChanged", "controller name = " + key);
                value.onCustomGlobalThemeChanged(str, themeData, z);
            }
        }
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue();
        }
        if (d()) {
            return ((qut) z()).c();
        }
        return ovr.c();
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        lbo T = T();
        if (T == null) {
            return;
        }
        TLog.loge("TopMultiTabManager", "postScrollMessage, offset=" + i);
        ohv e = T.e();
        if (e == null) {
            return;
        }
        this.g.postMessage(e.a(), Math.max(0, i));
    }

    private void S() {
        ohv e;
        DXRootView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
            return;
        }
        lbo T = T();
        if (T == null || (e = T.e()) == null || (a2 = e.a()) == null) {
            return;
        }
        a(a2);
        lap.a("TopTabBar", "postScrollEndMessage", "发送滚动结束的事件");
        this.g.postMessageEnd(a2);
    }

    private void a(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc619e9", new Object[]{this, dXRootView});
            return;
        }
        DXWidgetNode expandWidgetNode = dXRootView == null ? null : dXRootView.getExpandWidgetNode();
        if (expandWidgetNode == null) {
            return;
        }
        DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId("localSearchBar");
        DXWidgetNode queryWidgetNodeByUserId2 = expandWidgetNode.queryWidgetNodeByUserId(ssm.UI_MODULE_SEARCH_BAR);
        if (queryWidgetNodeByUserId != null) {
            queryWidgetNodeByUserId.sendBroadcastEvent(new DXViewDisappearEvent(5388973340095122049L));
            queryWidgetNodeByUserId.setEventResponseMode(3);
        }
        if (queryWidgetNodeByUserId2 == null) {
            return;
        }
        queryWidgetNodeByUserId2.setEventResponseMode(0);
        queryWidgetNodeByUserId2.sendBroadcastEvent(new DXViewAppearEvent(5288671110273408574L));
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
        } else if (T() == null || this.e == null) {
        } else {
            if (com.taobao.homepage.utils.b.b() || com.taobao.homepage.utils.b.c()) {
                c(y() * h.a().a(this.e.getContext()));
            } else {
                c(y() * this.e.getWidth());
            }
        }
    }

    public int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bea073", new Object[]{this})).intValue();
        }
        HomeViewPager homeViewPager = this.e;
        if (homeViewPager != null) {
            return homeViewPager.getCurrentItem();
        }
        return -1;
    }

    private lbo T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lbo) ipChange.ipc$dispatch("ab01d4b2", new Object[]{this});
        }
        lbq b2 = oiy.a().b();
        if (b2 == null) {
            return null;
        }
        return b2.getHomePageManager();
    }

    private com.taobao.tao.topmultitab.protocol.c U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.topmultitab.protocol.c) ipChange.ipc$dispatch("a6a1c163", new Object[]{this}) : new com.taobao.tao.topmultitab.protocol.c() { // from class: com.taobao.tao.topmultitab.c.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.topmultitab.protocol.c
            public void a(IHomeSubTabController iHomeSubTabController, boolean z) {
                IpChange ipChange2 = $ipChange;
                boolean z2 = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2d85b7b", new Object[]{this, iHomeSubTabController, new Boolean(z)});
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("enablePullReFresh self : ");
                sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
                sb.append(", isEnable : ");
                sb.append(z);
                ksp.b("TopMultiTabManager", sb.toString());
                if (!c.a(c.this, iHomeSubTabController)) {
                    return;
                }
                if (c.a(c.this)) {
                    qut qutVar = (qut) c.this.z();
                    boolean c = qutVar.c();
                    c.this.c(c && z);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("enablePullReFresh TopPullRefresh : ");
                    sb2.append(c && z);
                    sb2.append(", isMultiTab : ");
                    sb2.append(!c && z);
                    ksp.b("TopMultiTabManager", sb2.toString());
                    if (c || !z) {
                        z2 = false;
                    }
                    qutVar.b(z2);
                    return;
                }
                c.this.c(z);
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public void a(IHomeSubTabController iHomeSubTabController) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d6cd2679", new Object[]{this, iHomeSubTabController});
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("IHomeSubTabController self : ");
                sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
                ksp.b("TopMultiTabManager", sb.toString());
                if (!c.a(c.this, iHomeSubTabController)) {
                    return;
                }
                if (c.a(c.this)) {
                    qut qutVar = (qut) c.this.z();
                    if (!qutVar.c()) {
                        qutVar.a(true);
                        return;
                    } else {
                        c.a(c.this, true);
                        return;
                    }
                }
                c.a(c.this, true);
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public void b(IHomeSubTabController iHomeSubTabController, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5097d37c", new Object[]{this, iHomeSubTabController, new Boolean(z)});
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("enableSecondFloor self : ");
                sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
                sb.append(", isEnable : ");
                sb.append(z);
                ksp.b("TopMultiTabManager", sb.toString());
                if (!c.a(c.this, iHomeSubTabController)) {
                    return;
                }
                c.this.d(z);
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public void b(IHomeSubTabController iHomeSubTabController) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("552e2a58", new Object[]{this, iHomeSubTabController});
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("refreshFinish self : ");
                sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
                ksp.b("TopMultiTabManager", sb.toString());
                if (!c.a(c.this, iHomeSubTabController)) {
                    return;
                }
                if (c.a(c.this)) {
                    qut qutVar = (qut) c.this.z();
                    if (!qutVar.c()) {
                        qutVar.a(false);
                        return;
                    } else {
                        c.a(c.this, false);
                        return;
                    }
                }
                c.a(c.this, false);
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public boolean c(IHomeSubTabController iHomeSubTabController) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d38f2e3b", new Object[]{this, iHomeSubTabController})).booleanValue();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("isRefreshing self : ");
                sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
                ksp.b("TopMultiTabManager", sb.toString());
                if (c.a(c.this, iHomeSubTabController)) {
                    return c.b(c.this);
                }
                return false;
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public void c(IHomeSubTabController iHomeSubTabController, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9e574b7d", new Object[]{this, iHomeSubTabController, new Boolean(z)});
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("setRocketState self : ");
                sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
                sb.append(", isRocket : ");
                sb.append(z);
                ksp.b("TopMultiTabManager", sb.toString());
                if (!c.a(c.this, iHomeSubTabController)) {
                    return;
                }
                c.b(c.this, z);
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public void a(IHomeSubTabController iHomeSubTabController, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a05d0403", new Object[]{this, iHomeSubTabController, str});
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("setTabBarActionButtonState self : ");
                sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
                sb.append(", TabBarButtonShowState : ");
                sb.append(str);
                ksp.b("TopMultiTabManager", sb.toString());
                if (!c.a(c.this, iHomeSubTabController)) {
                    return;
                }
                c.a(c.this, str);
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public void a(IHomeSubTabController iHomeSubTabController, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("92c5d3ec", new Object[]{this, iHomeSubTabController, map});
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("updatePageProperties self : ");
                sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
                sb.append(", aProperties : ");
                sb.append(map);
                ksp.b("TopMultiTabManager", sb.toString());
                if (!c.a(c.this, iHomeSubTabController)) {
                    kss.a("Page_Home", 19999, "Page_HomePage_Subscribe_updateProperty", "");
                    return;
                }
                lbq b2 = oiy.a().b();
                if (b2 == null) {
                    return;
                }
                kss.a(b2.getCurActivity(), map);
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public void b(IHomeSubTabController iHomeSubTabController, String str) {
                lbq b2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cf0e6e22", new Object[]{this, iHomeSubTabController, str});
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("updatePageUtparam self : ");
                sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
                sb.append(", aPageUtparam : ");
                sb.append(str);
                ksp.b("TopMultiTabManager", sb.toString());
                if (!c.a(c.this, iHomeSubTabController) || (b2 = oiy.a().b()) == null) {
                    return;
                }
                kss.a(b2.getCurActivity(), str);
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public void d(IHomeSubTabController iHomeSubTabController, boolean z) {
                lbo c;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ec16c37e", new Object[]{this, iHomeSubTabController, new Boolean(z)});
                    return;
                }
                ksp.b("TopMultiTabManager", "onReachTopChanged() called with: isReachTop = [" + z + riy.ARRAY_END_STR);
                if (!c.a(c.this, iHomeSubTabController) || (c = c.c(c.this)) == null || c.d() == null) {
                    return;
                }
                c.d().c();
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public JSONObject d(IHomeSubTabController iHomeSubTabController) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (JSONObject) ipChange2.ipc$dispatch("7d710536", new Object[]{this, iHomeSubTabController}) : c.d(c.this).a(iHomeSubTabController);
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public JSONObject i(IHomeSubTabController iHomeSubTabController) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (JSONObject) ipChange2.ipc$dispatch("dff9ec91", new Object[]{this, iHomeSubTabController}) : c.d(c.this).b(iHomeSubTabController);
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public void k(IHomeSubTabController iHomeSubTabController) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c6974d2f", new Object[]{this, iHomeSubTabController});
                } else if (!c.a(c.this)) {
                    c.d(c.this).c(iHomeSubTabController);
                } else if (TextUtils.equals(iHomeSubTabController.getCurrentSubContainerType(), "subscribe")) {
                } else {
                    c.d(c.this).c(iHomeSubTabController);
                }
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public int b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : c.d(c.this).a();
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public int e(IHomeSubTabController iHomeSubTabController) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("d05135e8", new Object[]{this, iHomeSubTabController})).intValue();
                }
                com.taobao.homepage.view.widgets.bgcontainer.c e = c.e(c.this);
                if (e != null) {
                    return e.b();
                }
                return 0;
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public JSONObject f(IHomeSubTabController iHomeSubTabController) {
                JSONObject ext;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (JSONObject) ipChange2.ipc$dispatch("3e7494f4", new Object[]{this, iHomeSubTabController});
                }
                AwesomeGetContainerData b2 = com.taobao.tao.homepage.d.a().b(oqc.a().l());
                if (b2 != null && (ext = b2.getExt()) != null) {
                    return ext.getJSONObject("globalTheme");
                }
                return null;
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public int h(IHomeSubTabController iHomeSubTabController) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("4b744185", new Object[]{this, iHomeSubTabController})).intValue();
                }
                com.taobao.homepage.view.widgets.bgcontainer.c e = c.e(c.this);
                if (e == null) {
                    com.taobao.android.home.component.utils.e.e("TopMultiTabManager", "getCurrentBgViewId bgContainerManager == null");
                    return -1;
                }
                return e.e();
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public void a(IHomeSubTabController iHomeSubTabController, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f2225b9", new Object[]{this, iHomeSubTabController, view});
                    return;
                }
                com.taobao.homepage.view.widgets.bgcontainer.c e = c.e(c.this);
                if (e == null) {
                    com.taobao.android.home.component.utils.e.e("TopMultiTabManager", "setBgView bgContainerManager == null");
                } else {
                    e.a(view);
                }
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public float j(IHomeSubTabController iHomeSubTabController) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("48364940", new Object[]{this, iHomeSubTabController})).floatValue();
                }
                if (iHomeSubTabController instanceof qut) {
                    qut qutVar = (qut) iHomeSubTabController;
                    boolean e = qutVar.e();
                    boolean f = qutVar.f();
                    ldf.d("TopMultiTabManager", "subscribe -> getSearchBarHeight isSelectSubscribe:" + e + ",isCreatingSubscribe:" + f);
                    if (qutVar.d() && (e || f)) {
                        return 0.0f;
                    }
                    return c.d(c.this).b();
                }
                return c.d(c.this).b();
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public Map<String, Integer> a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Map) ipChange2.ipc$dispatch("c27656b1", new Object[]{this, str, str2}) : c.d(c.this).a(str, str2);
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public void a(llh llhVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f30282f0", new Object[]{this, llhVar});
                } else {
                    kuk.a(llhVar);
                }
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public Context c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Context) ipChange2.ipc$dispatch("c833dc62", new Object[]{this});
                }
                lbo c = c.c(c.this);
                if (c != null) {
                    return c.a().getCurActivity();
                }
                return null;
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public String d() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("43881515", new Object[]{this});
                }
                if (c.f(c.this) != null && c.g(c.this) != null) {
                    return c.f(c.this).b(c.g(c.this).getCurrentItem());
                }
                return null;
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public String e() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("ca0dcfb4", new Object[]{this}) : ovr.a("home");
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public boolean a(View view, ViewGroup.LayoutParams layoutParams) {
                lbo c;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("a8549977", new Object[]{this, view, layoutParams})).booleanValue();
                }
                if (view == null || (c = c.c(c.this)) == null) {
                    return false;
                }
                View rootView = c.a().getRootView();
                if (!(rootView instanceof ViewGroup)) {
                    return false;
                }
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-2, -2);
                }
                ((ViewGroup) rootView).addView(view, layoutParams);
                return true;
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public boolean f() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : c.h(c.this).a();
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public JSONObject h() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (JSONObject) ipChange2.ipc$dispatch("fa36400f", new Object[]{this});
                }
                JSONObject c = com.taobao.tao.homepage.d.a().c();
                if (c != null) {
                    return c.getJSONObject(c.SERVICE_REALTIME_PASS_PARAMS);
                }
                return null;
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public boolean k() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : com.taobao.homepage.utils.b.a();
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public boolean l() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
                }
                JSONObject c = com.taobao.tao.homepage.d.a().c();
                if (c != null) {
                    return c.getBooleanValue("enableInfoFlowScale");
                }
                return false;
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public JSONObject g(IHomeSubTabController iHomeSubTabController) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (JSONObject) ipChange2.ipc$dispatch("1ef65cd3", new Object[]{this, iHomeSubTabController});
                }
                ldf.d("TopMultiTabManager", "getSelfTabInformation,self: " + iHomeSubTabController);
                String a2 = c.a().a(iHomeSubTabController);
                if (TextUtils.isEmpty(a2)) {
                    ldf.d("TopMultiTabManager", "subType == null");
                    return null;
                }
                return c.d(c.this).a(c.f(c.this).b(a2));
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public View a(String str) {
                ohv e;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("fef0fbf4", new Object[]{this, str});
                }
                lbo c = c.c(c.this);
                if (c != null && (e = c.e()) != null && TextUtils.equals(str, sqg.b())) {
                    return e.a();
                }
                return null;
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public Fragment j() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Fragment) ipChange2.ipc$dispatch("c48dc553", new Object[]{this});
                }
                lbq b2 = oiy.a().b();
                if (!(b2 instanceof Fragment)) {
                    return null;
                }
                return (Fragment) b2;
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public String g() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("d71944f2", new Object[]{this}) : sqg.e() ? com.taobao.tao.infoflow.multitab.e.KEY_EMBED_SEARCH_BAR : "topMutliTab";
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public List<String> b(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (List) ipChange2.ipc$dispatch("89cdf874", new Object[]{this, str});
                }
                if (!TextUtils.equals(str, "getSelectPopWebUrl")) {
                    return null;
                }
                return sqg.f();
            }

            @Override // com.taobao.tao.topmultitab.protocol.c
            public void a(IHomeSubTabController iHomeSubTabController, JSONObject jSONObject) {
                lbo c;
                ohv e;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a18797", new Object[]{this, iHomeSubTabController, jSONObject});
                } else if (!c.a(c.this, iHomeSubTabController) || !sqg.e() || (c = c.c(c.this)) == null || (e = c.e()) == null) {
                } else {
                    e.a(jSONObject, false);
                }
            }
        };
    }

    public String a(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6916f47", new Object[]{this, iHomeSubTabController});
        }
        if (iHomeSubTabController == null) {
            return null;
        }
        for (Map.Entry<String, IHomeSubTabController> entry : this.c.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue().equals(iHomeSubTabController)) {
                return ovr.b(key);
            }
        }
        return null;
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController z = z();
        if (!(z instanceof qut)) {
            return false;
        }
        return ((qut) z).b();
    }

    private void b(final boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        final lbq b2 = oiy.a().b();
        if (b2 == null) {
            ksp.c("TopMultiTabManager", "setRefreshing pageProvider == null");
            return;
        }
        Activity curActivity = b2.getCurActivity();
        if (b2.getCurActivity() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("setRefreshing activity is null ?  ");
            if (curActivity != null) {
                z2 = false;
            }
            sb.append(z2);
            ksp.c("TopMultiTabManager", sb.toString());
            return;
        }
        curActivity.runOnUiThread(new Runnable() { // from class: com.taobao.tao.topmultitab.c.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                mjx i = b2.getHomePageManager().i();
                if (i == null) {
                    ksp.c("TopMultiTabManager", "setRefreshing manager == null");
                } else if (z) {
                    if (i.b()) {
                        ksp.c("TopMultiTabManager", "正在刷新中 不用再设置刷新中了");
                    } else {
                        i.a(true);
                    }
                } else if (com.taobao.homepage.page.weexv2.a.d()) {
                    ksp.c("TopMultiTabManager", "当前在二楼");
                } else {
                    i.a(false);
                }
            }
        });
    }

    private boolean b(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("552e2a5c", new Object[]{this, iHomeSubTabController})).booleanValue();
        }
        if (c(iHomeSubTabController)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("【异常】不在当前页调用了回调！！! ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        ksp.c("TopMultiTabManager", sb.toString());
        return false;
    }

    public void c(boolean z) {
        lbo homePageManager;
        mjx i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        lbq b2 = oiy.a().b();
        if (b2 == null || (homePageManager = b2.getHomePageManager()) == null || (i = homePageManager.i()) == null) {
            return;
        }
        i.c(z);
    }

    private boolean V() {
        lbo homePageManager;
        mjx i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d169e1", new Object[]{this})).booleanValue();
        }
        lbq b2 = oiy.a().b();
        if (b2 != null && (homePageManager = b2.getHomePageManager()) != null && (i = homePageManager.i()) != null) {
            return i.b();
        }
        return false;
    }

    public void d(boolean z) {
        lbo homePageManager;
        mjx i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        lbq b2 = oiy.a().b();
        if (b2 == null || (homePageManager = b2.getHomePageManager()) == null || (i = homePageManager.i()) == null) {
            return;
        }
        lap.a("TopTabBar", "setEnableToSecondFloor", "设置是否出二楼： " + z);
        i.b(z);
    }

    private void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else if (z) {
            h(NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_ROCKET);
        } else {
            h(g.TAO);
        }
    }

    private void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
            return;
        }
        lbo T = T();
        if (T == null) {
            lap.a("BottomTabBar", "setTabBarActionButtonState", "homePageManager == null");
        } else if (TextUtils.equals(NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_ROCKET, str)) {
            T.g().b();
        } else {
            T.g().c();
        }
    }

    private boolean c(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d38f2e3b", new Object[]{this, iHomeSubTabController})).booleanValue();
        }
        com.taobao.tao.topmultitab.view.a aVar = this.f;
        return (aVar == null || iHomeSubTabController == null || iHomeSubTabController != aVar.c()) ? false : true;
    }

    public IHomeSubTabController z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("8f24ed2", new Object[]{this});
        }
        com.taobao.tao.topmultitab.view.a aVar = this.f;
        if (aVar != null) {
            return aVar.c();
        }
        return null;
    }

    @Deprecated
    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df3f9158", new Object[]{this});
        }
        HomeViewPager homeViewPager = this.e;
        if (homeViewPager != null && this.f != null) {
            int currentItem = homeViewPager.getCurrentItem();
            List<JSONObject> a2 = this.f.a();
            if (a2 != null && currentItem >= 0 && currentItem < a2.size()) {
                return com.taobao.tao.topmultitab.view.a.b(a2.get(currentItem));
            }
        }
        return null;
    }

    public b B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("10836119", new Object[]{this}) : this.k;
    }

    private ViewPager.OnPageChangeListener W() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewPager.OnPageChangeListener) ipChange.ipc$dispatch("ca2b00d6", new Object[]{this}) : new ViewPager.OnPageChangeListener() { // from class: com.taobao.tao.topmultitab.c.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                    return;
                }
                if (c.i(c.this) >= 0.0f) {
                    if (f > c.i(c.this)) {
                        c.f(c.this).a(i + 1);
                    } else if (f < c.i(c.this)) {
                        c.f(c.this).a(i);
                    }
                }
                c.a(c.this, f);
                IHomeSubTabController c = c.f(c.this).c(i);
                if (c != null) {
                    c.onPageScrolled(f, i2);
                }
                c.a(c.this, i, i2);
                c cVar = c.this;
                c.b(cVar, (c.g(cVar).getWidth() * i) + i2);
                laq a2 = laq.a().a("UITabSwitch").b("TopBarOnPageScrolled").c("TopMultiTabManager.onPageScrolled").a("滑动至position", i);
                a2.a("偏移距离比例positionOffset", f + "").a("偏移距离pixels值", i2).b();
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    return;
                }
                c.f(c.this).a(i);
                c.a(c.this, i);
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                    return;
                }
                if (i == 0) {
                    c.a(c.this, -1.0f);
                }
                c.c(c.this, i != 0);
                IHomeSubTabController c = c.f(c.this).c(c.g(c.this).getCurrentItem());
                if (i != 0) {
                    if (i != 1) {
                        return;
                    }
                    c.d(c.this, true);
                    c cVar = c.this;
                    c.c(cVar, c.g(cVar).getCurrentItem());
                    return;
                }
                if (c.j(c.this)) {
                    c cVar2 = c.this;
                    if (c.g(cVar2).getCurrentItem() != c.k(c.this)) {
                        z = false;
                    }
                    c.a(cVar2, c, z);
                }
                c.d(c.this, false);
            }
        };
    }

    private void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        f(true);
        laq a2 = laq.a().a("UITabSwitch").b("TopBarOnPageSelected").c("TopMultiTabManager.onPageSelected").c("顶部tab被选中.").a("选中position", i);
        IHomeSubTabController c = this.f.c(i);
        if (c != null && c != this.j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.taobao.tao.infoflow.multitab.e.KEY_IS_RECOMMEND_TAB, (Object) Boolean.valueOf(a().w()));
                jSONObject.put("isHome", (Object) true);
                com.taobao.tao.recommend3.a.a().b().l().b().a("TRY_SHOW_POP", jSONObject);
            } catch (Exception unused) {
            }
            String a3 = a(this.j);
            String a4 = a(c);
            this.k.b = this.f.c(a4);
            this.k.f21153a = this.f.c(a3);
            a(C());
            a2.a("当前tab名称", this.k.b).a("上一个tab名称", this.k.f21153a);
            IHomeSubTabController iHomeSubTabController = this.j;
            if (iHomeSubTabController != null) {
                iHomeSubTabController.onPageUnSelected();
            }
            i(a4);
            a(i, a4, this.t ? WXBasicComponentType.SLIDER : "click");
            a(c, i);
            Y();
            c.onPageSelected();
            this.j = c;
            f(c);
            c(c.isEnablePullReFresh());
            a2.a("下拉控件是否可下拉", c.isEnablePullReFresh() ? "允许使用下拉刷新;" : "不允许使用下拉刷新");
            d(c.isEnableToSecondFloor());
            a2.a("二楼样式是否可见", c.isEnableToSecondFloor() + "");
            d(c);
            S();
            X();
            this.e.onPageSelected();
            a2.b();
        }
        oql.a().a(i);
        com.taobao.android.home.component.utils.e.e("TopMultiTabManager", "onPageSelected: " + i);
    }

    public void a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8114572f", new Object[]{this, new Integer(i), str, str2});
        } else if (TextUtils.equals("home", str) || TextUtils.isEmpty(str)) {
        } else {
            this.n.a(i);
            HashMap hashMap = new HashMap();
            hashMap.put("extKey1", str);
            hashMap.put("extkey2", str2);
            ldg.b("QPS", "Page_DynamicTab", new HashMap(hashMap));
            ldk.a("containerSelect", str, "1.0", ljk.MAIN_BIZ_NAME, "homeSubTab", hashMap);
            com.taobao.android.home.component.utils.e.e("TopMultiTabManager", "umbrellaCommit currentType: " + str + " source：" + str2 + " position：" + i);
        }
    }

    public ovt.a C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ovt.a) ipChange.ipc$dispatch("f85f6812", new Object[]{this}) : this.m.b();
    }

    private void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed98df", new Object[]{this});
            return;
        }
        com.taobao.homepage.view.widgets.bgcontainer.c b2 = b();
        if (b2 == null) {
            com.taobao.android.home.component.utils.e.e("TopMultiTabManager", "updateBgView bgContainerManager == null");
        } else {
            b2.c();
        }
    }

    private void d(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f03216", new Object[]{this, iHomeSubTabController});
        } else if (iHomeSubTabController instanceof qut) {
            h(iHomeSubTabController.getTabBarButtonShowState());
            lap.a("UITabSwitch", "TopBarOnPageSelected", "当前底部bar状态" + iHomeSubTabController.getTabBarButtonShowState());
        } else {
            e(iHomeSubTabController.isOnRocketState());
            StringBuilder sb = new StringBuilder();
            sb.append("当前底部bar状态");
            sb.append(iHomeSubTabController.isOnRocketState() ? "小火箭图标" : "淘字");
            lap.a("UITabSwitch", "TopBarOnPageSelected", sb.toString());
        }
    }

    private void a(IHomeSubTabController iHomeSubTabController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d85b7b", new Object[]{this, iHomeSubTabController, new Boolean(z)});
            return;
        }
        try {
            IHomeSubTabController b2 = b("home");
            IHomeSubTabController b3 = b("subscribe");
            if (!z) {
                e(iHomeSubTabController);
            } else if (iHomeSubTabController.equals(b2) && z) {
                kss.a("Page_Home", 19999, ViewPagerFakeDragView.isLastIsTouchFakeDragView() ? "Page_Home_Tuijian_SlideNavito-tabtuijian" : "Page_Home_Tuijian_Slideto-tabtuijian", "");
            } else if (!iHomeSubTabController.equals(b3) || !z) {
            } else {
                kss.a("Page_DingYueIndexAll", 19999, ViewPagerFakeDragView.isLastIsTouchFakeDragView() ? "Page_Home_Dingyue_SlideNavito-tabdingyue" : "Page_Home_Dingyue_Slideto-tabdingyue", "");
            }
        } catch (Throwable th) {
            ksp.c("TopMultiTabManager", "viewPagerSliderTrack error : " + th.getMessage());
        }
    }

    private void e(IHomeSubTabController iHomeSubTabController) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d05135f5", new Object[]{this, iHomeSubTabController});
            return;
        }
        boolean isLastIsTouchFakeDragView = ViewPagerFakeDragView.isLastIsTouchFakeDragView();
        String str2 = "home";
        String str3 = "Page_Home";
        String str4 = null;
        if (b(str2, iHomeSubTabController)) {
            str4 = isLastIsTouchFakeDragView ? "Page_Home_SlideNavito-tabtuijian" : "Page_Home_Slideto-tabtuijian";
            str = "spm=a21acg.b41183928.c1600427199067.d1600427199067";
        } else if (b("subscribe", iHomeSubTabController)) {
            str4 = isLastIsTouchFakeDragView ? "Page_Home_SlideNavito-tabdingyue" : "Page_Home_Slideto-tabdingyue";
            str3 = "Page_DingYueIndexAll";
            str = "spm=a2141.1.searchbar.dingyue";
            str2 = "subscribe";
        } else if (b(com.taobao.tao.topmultitab.a.HOME_TAB_ID_LITE_TAO, iHomeSubTabController)) {
            str4 = isLastIsTouchFakeDragView ? "Page_Home_SlideNavito-tabtaote" : "Page_Home_Slideto-tabtaote";
            str3 = "Page_Home_taotetab";
            str = "a2141.1.searchbar.taote";
            str2 = com.taobao.tao.topmultitab.a.HOME_TAB_ID_LITE_TAO;
        } else if (b(com.taobao.tao.topmultitab.a.HOME_TAB_ID_DYNAMIC, iHomeSubTabController)) {
            str4 = isLastIsTouchFakeDragView ? "Page_Home_SlideNavito-tabdynamic" : "Page_Home_Slideto-tabdynamic";
            str3 = "Page_TMGHomeDynamic";
            str = "a2141.1.searchbar.dynamic";
            str2 = com.taobao.tao.topmultitab.a.HOME_TAB_ID_DYNAMIC;
        } else if (b("campaign", iHomeSubTabController)) {
            str3 = "Page_HomeSale";
            str4 = "Page_Home_Button-slide2dacu";
            str = "spm=a2141.1.searchbar.dacu";
            str2 = "campaign";
        } else if (b(HOME_TAB_ID_HOUR_DELIVERY, iHomeSubTabController)) {
            str4 = "Page_Home_Button-slide2LBS";
            str = "spm=a2141.1.searchbar.lbs";
            str2 = HOME_TAB_ID_HOUR_DELIVERY;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        int i = 2101;
        JSONObject c = sqg.c();
        if (c == null) {
            kss.a(str3, 2101, str4, str);
        }
        JSONObject a2 = a(c, str2);
        if (a2 != null) {
            try {
                if (a2.getJSONObject("clickParam") != null && !TextUtils.isEmpty(a2.getJSONObject("clickParam").getString("page")) && a2.getJSONObject("clickParam").getInteger("eventId") != null) {
                    String string = a2.getJSONObject("clickParam").getString("page");
                    try {
                        int intValue = a2.getJSONObject("clickParam").getInteger("eventId").intValue();
                        try {
                            kss.a(string, intValue, str4, a2.getJSONObject("clickParam").getString("arg2"), a2.getJSONObject("clickParam").getString("arg3"), a2.getJSONObject("clickParam").getJSONObject("args"));
                            return;
                        } catch (Exception e) {
                            e = e;
                            i = intValue;
                            str3 = string;
                            e.printStackTrace();
                            ksp.a("TopMultiTabManager", "commitSlideUt  exception", e);
                            kss.a(str3, i, str4, str);
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        kss.a(str3, i, str4, str);
    }

    private boolean b(String str, IHomeSubTabController iHomeSubTabController) {
        IHomeSubTabController b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("accbca92", new Object[]{this, str, iHomeSubTabController})).booleanValue();
        }
        if (iHomeSubTabController != null && (b2 = b(str)) != null) {
            return b2.equals(iHomeSubTabController);
        }
        return false;
    }

    private JSONObject a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5543672", new Object[]{this, jSONObject, str});
        }
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("subSection").getJSONObject("tabBar").getJSONObject("item");
                if (jSONObject3 != null && jSONObject3.size() > 0) {
                    for (String str2 : jSONObject3.keySet()) {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject(str2);
                        if (jSONObject4 != null && (jSONObject2 = jSONObject4.getJSONObject("content")) != null && str.equals(jSONObject2.getString("type"))) {
                            return jSONObject4;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                ksp.a("TopMultiTabManager", "parse multi tab searchBar section exception", e);
            }
        }
        return null;
    }

    public void f(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb239d4", new Object[]{this, iHomeSubTabController});
            return;
        }
        lbq b2 = oiy.a().b();
        if (b2 == null) {
            ksp.c("TopMultiTabManager", "pageProvider == null");
            return;
        }
        ksp.b("TopMultiTabManager", "utWrite");
        las.a((Object) b2.getCurActivity());
        String updatePageName = iHomeSubTabController.getUpdatePageName();
        if (!TextUtils.isEmpty(updatePageName)) {
            ksp.b("TopMultiTabManager", "utWrite pageName : " + updatePageName);
            las.a(b2.getCurActivity(), updatePageName);
        } else {
            ksp.b("TopMultiTabManager", "utWrite default pageName : " + updatePageName);
            las.a((Context) b2.getCurActivity());
        }
        String a2 = i.a();
        String updatePageUtParam = iHomeSubTabController.getUpdatePageUtParam();
        if (updatePageUtParam != null) {
            kss.a(b2.getCurActivity(), updatePageUtParam);
        } else {
            kss.a(b2.getCurActivity(), lbo.b().a(a2).c());
        }
        this.i = iHomeSubTabController.getUpdatePageProperties();
        a(iHomeSubTabController, this.i);
        Map<String, String> map = this.i;
        if (map != null) {
            this.i = new HashMap(map);
            kss.a(b2.getCurActivity(), this.i);
            return;
        }
        kss.a(b2.getCurActivity(), lbo.b().a(a2).a());
    }

    public void a(IHomeSubTabController iHomeSubTabController, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d81baa", new Object[]{this, iHomeSubTabController, new Integer(i)});
        } else if (iHomeSubTabController instanceof qut) {
            Map<String, String> updateNextPageProperties = iHomeSubTabController.getUpdateNextPageProperties();
            if (updateNextPageProperties == null) {
                return;
            }
            kss.a(updateNextPageProperties);
        } else {
            try {
                kss.a(b(i));
            } catch (Throwable th) {
                TLog.loge("TopMultiTabManager", "UnExcepted exception.", th);
            }
        }
    }

    public Map<String, String> b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1d9190ef", new Object[]{this, new Integer(i)});
        }
        HashMap hashMap = new HashMap();
        JSONObject d = d(i);
        if (d == null) {
            return null;
        }
        JSONObject jSONObject = d.getJSONObject("passOnTrack");
        if (jSONObject != null) {
            for (String str : jSONObject.keySet()) {
                hashMap.put(str, jSONObject.get(str) == null ? "" : jSONObject.get(str).toString());
            }
        }
        return hashMap;
    }

    private JSONObject d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("12eae898", new Object[]{this, new Integer(i)});
        }
        String valueOf = String.valueOf(i);
        JSONObject d = sqg.d();
        if (d == null) {
            com.taobao.android.home.component.utils.e.e("TopMultiTabManager", "getTabBarSection item == null");
            return null;
        }
        return d.getJSONObject(valueOf);
    }

    public void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbb060", new Object[]{this});
            return;
        }
        lbq b2 = oiy.a().b();
        if (b2 == null) {
            ksp.c("TopMultiTabManager", "pageProvider == null");
            return;
        }
        las.b((Object) b2.getCurActivity());
        TLog.loge("TopMultiTabManager", "clearUt");
        Map<String, String> map = this.i;
        if (map == null || map.isEmpty()) {
            ksp.c("TopMultiTabManager", "lastPageProperties == null || lastPageProperties.isEmpty()");
            return;
        }
        for (Map.Entry<String, String> entry : this.i.entrySet()) {
            entry.setValue(null);
        }
        kss.a(b2.getCurActivity(), this.i);
        this.i = null;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue() : w();
    }

    private void a(IHomeSubTabController iHomeSubTabController, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92c5d3ec", new Object[]{this, iHomeSubTabController, map});
        } else if (iHomeSubTabController == null || iHomeSubTabController != c("subscribe")) {
        } else {
            if (map != null && !map.isEmpty() && map.containsKey("spm-cnt")) {
                return;
            }
            ksr.b("TopMultiTabManager", "2.0", "home_subscribe", "lastPageProperties is null", map == null ? null : JSON.toJSONString(map), null);
        }
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue();
        }
        if (d()) {
            qut qutVar = (qut) z();
            if (qutVar.d()) {
                return qutVar.e();
            }
        }
        return this.c.get("subscribe") == this.j;
    }

    public List<String> F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f4646cda", new Object[]{this});
        }
        com.taobao.tao.topmultitab.view.a aVar = this.f;
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    private com.taobao.homepage.view.widgets.bgcontainer.c b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.homepage.view.widgets.bgcontainer.c) ipChange.ipc$dispatch("a419cba8", new Object[]{this});
        }
        lbo T = T();
        if (T != null) {
            return T.d();
        }
        return null;
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        lbo T = T();
        if (T != null) {
            T.y().m();
        }
        IHomeSubTabController z = z();
        if (z == null) {
            return;
        }
        z.onWillExit();
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        IHomeSubTabController z = z();
        if (z == null) {
            return;
        }
        z.onFestivalRefresh();
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
            return;
        }
        IHomeSubTabController z = z();
        if (z == null) {
            return;
        }
        z.onEnterPullSecondFloor();
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        IHomeSubTabController z = z();
        if (z == null) {
            return;
        }
        z.onExitPullSecondFloor();
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
            return;
        }
        IHomeSubTabController z = z();
        if ((z instanceof qut) && ((qut) z).d()) {
            ksp.c("TopMultiTabManager", "checkLoadSubscribeBundle 分类tab不触发 远程化下载");
            return;
        }
        ksp.c("TopMultiTabManager", "checkLoadSubscribeBundle 触发 远程化下载");
        IHomeSubTabController c = c("subscribe");
        if (!(c instanceof ovn)) {
            ksp.c("TopMultiTabManager", "订阅已经最新，无需加载");
            return;
        }
        ovn ovnVar = (ovn) c;
        lbq b2 = oiy.a().b();
        if (b2 == null || b2.getCurActivity() == null) {
            ksp.c("TopMultiTabManager", "首页 Activity 未准备好，无法加载订阅bundle");
        } else {
            ovnVar.a(b2.getCurActivity());
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
        } else if (this.f == null) {
        } else {
            IHomeSubTabController z = a().z();
            if (z == c("subscribe")) {
                this.j = z;
            }
            this.f.d("subscribe");
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
            return;
        }
        com.taobao.tao.topmultitab.view.a aVar = this.f;
        if (aVar == null) {
            return;
        }
        aVar.d(str);
    }

    public String O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a8fc60a", new Object[]{this});
        }
        IHomeSubTabController iHomeSubTabController = this.c.get(ovr.TAB_ID_MAINLAND_RECOMMEND_MICROSERVICES);
        return iHomeSubTabController instanceof qut ? iHomeSubTabController.getCurrentSubContainerType() : "recommend";
    }

    public void aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf280a7", new Object[]{this});
            return;
        }
        com.taobao.tao.topmultitab.view.a aVar = this.f;
        if (aVar == null) {
            return;
        }
        aVar.f();
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public boolean ab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[]{this})).booleanValue() : this.p;
    }

    public Map<String, String> k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83cc61f1", new Object[]{this, str});
        }
        IHomeSubTabController z = z();
        if (z == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String a2 = a(z);
        if (!TextUtils.isEmpty(a2)) {
            hashMap.put("selectTab", a2);
            TLog.loge("TopMultiTabManager", "获取当前的上行参数，currentTab：" + a2);
        }
        Map<String, String> requestUpstreamBizParam = z.getRequestUpstreamBizParam(str);
        if (requestUpstreamBizParam != null) {
            hashMap.putAll(requestUpstreamBizParam);
        }
        return hashMap;
    }

    public void a(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e86c6b5", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        IHomeSubTabController b2 = b("home");
        if (b2 == null) {
            return;
        }
        b2.triggerPopShowByMain(i, jSONObject);
    }

    public void a(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("958129b3", new Object[]{this, aVar});
            return;
        }
        IHomeSubTabController b2 = b("home");
        if (b2 == null) {
            return;
        }
        b2.addPopMessageListenerByMain(aVar);
    }

    public void b(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ef2612", new Object[]{this, aVar});
            return;
        }
        IHomeSubTabController b2 = b("home");
        if (b2 == null) {
            return;
        }
        b2.removePopMessageListenerByMain(aVar);
    }

    private void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            return;
        }
        lbo T = T();
        if (T == null || str == null) {
            ksp.c("TopMultiTabManager", "通知tab变化了，当前tab类型为空");
            return;
        }
        T.y().a(str, (tgr) null);
        ksp.c("TopMultiTabManager", "通知tab变化了，当前tab类型：" + str);
    }

    private void a(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0ff5ab", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        lbo T = T();
        if (T == null) {
            return;
        }
        T.y().a(f, i);
    }

    public String a(TBRefreshHeader.RefreshState refreshState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3f67ae4", new Object[]{this, refreshState});
        }
        switch (refreshState) {
            case NONE:
                return "NONE";
            case PULL_TO_REFRESH:
                return "PULL_TO_REFRESH";
            case RELEASE_TO_REFRESH:
                return "RELEASE_TO_REFRESH";
            case REFRESHING:
                return "REFRESHING";
            case PREPARE_TO_SECOND_FLOOR:
            case SECOND_FLOOR_START:
                return "SECOND_FLOOR_START";
            case SECOND_FLOOR_END:
                return "SECOND_FLOOR_END";
            default:
                return "unknown";
        }
    }

    private void a(ovt.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("985e7dae", new Object[]{this, aVar});
        } else if (lbl.a()) {
        } else {
            kuk.a("tabSwitched").a("targetTabName", HomePageUtility.a(this.k.b, aVar.b)).a("sourceTabName", HomePageUtility.a(this.k.f21153a, aVar.f32469a)).b();
            ksp.c("TopMultiTabManager", "当前orange开关关闭，通知poplayer当前的tab行为");
        }
    }
}
