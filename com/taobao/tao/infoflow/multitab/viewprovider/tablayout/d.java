package com.taobao.tao.infoflow.multitab.viewprovider.tablayout;

import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.support.design.widget.TabLayout;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.homepage.utils.n;
import com.taobao.homepage.view.widgets.TailFadeFrameLayout;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.i;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a;
import com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.kss;
import tb.kvw;
import tb.lar;
import tb.law;
import tb.lbo;
import tb.lbq;
import tb.lmt;
import tb.mjx;
import tb.ohv;
import tb.oiy;
import tb.onq;
import tb.oqk;
import tb.oql;
import tb.tad;
import tb.tea;

/* loaded from: classes8.dex */
public class d implements a, a.InterfaceC0865a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout A;
    private JSONObject B;
    private final tad E;
    private final IMultiTabPerformanceListener H;

    /* renamed from: a  reason: collision with root package name */
    private MultiTabLayout f20654a;
    private FrameLayout b;
    private TUrlImageView c;
    private TUrlImageView d;
    private List<JSONObject> e;
    private final lmt i;
    private final b k;
    private final kvw l;
    private LinearLayout m;
    private View n;
    private TailFadeFrameLayout o;
    private final e p;
    private final c r;
    private final i s;
    private boolean t;
    private boolean w;
    private boolean x;
    private boolean y;
    private com.taobao.homepage.view.manager.lifecycle.listener.d z;
    private final List<a.b> f = new CopyOnWriteArrayList();
    private final List<a.InterfaceC0864a> g = new CopyOnWriteArrayList();
    private final List<TBSwipeRefreshLayout.OnPullRefreshListener> C = new CopyOnWriteArrayList();
    private final List<oqk> D = new CopyOnWriteArrayList();
    private int h = -1;
    private int j = 0;
    private final List<a.InterfaceC0865a> q = new CopyOnWriteArrayList();
    private int I = -1;
    private final a.InterfaceC0864a u = new a.InterfaceC0864a() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.d.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.InterfaceC0864a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            int d = d.d(d.this);
            if (d != -1) {
                d dVar = d.this;
                d.a(dVar, d, d.c(dVar));
                g.a("TabLayoutProvider", "last index: " + d);
            }
            d.e(d.this);
            for (a.InterfaceC0864a interfaceC0864a : d.f(d.this)) {
                interfaceC0864a.a();
            }
        }

        @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.InterfaceC0864a
        public void l_(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5d8e1c9", new Object[]{this, new Integer(i)});
                return;
            }
            for (a.InterfaceC0864a interfaceC0864a : d.f(d.this)) {
                interfaceC0864a.l_(i);
            }
        }
    };
    private final a.e J = new a.e() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.d.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.e
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            g.a("TabLayoutProvider", "onPreCreate tabIndex:" + i);
            d.a(d.this, i);
        }
    };
    private final TabLayout.b v = new TabLayout.b() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.d.7
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.design.widget.TabLayout.b
        public void onTabReselected(TabLayout.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("802b1091", new Object[]{this, dVar});
            }
        }

        @Override // android.support.design.widget.TabLayout.b
        public void onTabSelected(TabLayout.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6b72ea4", new Object[]{this, dVar});
                return;
            }
            d.a(d.this, dVar.d());
            if (!n.n().e()) {
                return;
            }
            d.g(d.this);
        }

        @Override // android.support.design.widget.TabLayout.b
        public void onTabUnselected(TabLayout.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbd0156b", new Object[]{this, dVar});
                return;
            }
            d.b(d.this, dVar.d());
            if (n.n().e()) {
                return;
            }
            d.g(d.this);
        }
    };
    private final oqk F = new oqk() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.d.9
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.oqk
        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
                return;
            }
            d.j(d.this);
            d.k(d.this);
            for (oqk oqkVar : d.n(d.this)) {
                oqkVar.g();
            }
        }

        @Override // tb.oqk
        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
                return;
            }
            for (oqk oqkVar : d.n(d.this)) {
                oqkVar.h();
            }
            d.l(d.this);
            d.p(d.this);
        }
    };
    private final TBSwipeRefreshLayout.OnPullRefreshListener G = new TBSwipeRefreshLayout.OnPullRefreshListener() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.d.11
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
                return;
            }
            for (TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener : d.q(d.this)) {
                onPullRefreshListener.onRefresh();
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onPullDistance(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
                return;
            }
            for (TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener : d.q(d.this)) {
                onPullRefreshListener.onPullDistance(i);
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                return;
            }
            for (TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener : d.q(d.this)) {
                onPullRefreshListener.onRefreshStateChanged(refreshState, refreshState2);
            }
        }
    };

    static {
        kge.a(1651915271);
        kge.a(-1171176329);
        kge.a(1169888983);
    }

    public static /* synthetic */ MultiTabLayout a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MultiTabLayout) ipChange.ipc$dispatch("a969c558", new Object[]{dVar}) : dVar.f20654a;
    }

    public static /* synthetic */ void a(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d50d45e5", new Object[]{dVar, new Integer(i)});
        } else {
            dVar.c(i);
        }
    }

    public static /* synthetic */ void a(d dVar, int i, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c568d6", new Object[]{dVar, new Integer(i), list});
        } else {
            dVar.a(i, list);
        }
    }

    public static /* synthetic */ void a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d50d85b6", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.a(z);
        }
    }

    public static /* synthetic */ int b(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22ccbdd9", new Object[]{dVar, new Integer(i)})).intValue();
        }
        dVar.I = i;
        return i;
    }

    public static /* synthetic */ tad b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tad) ipChange.ipc$dispatch("e2a1de72", new Object[]{dVar}) : dVar.E;
    }

    public static /* synthetic */ List c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("afc0b62b", new Object[]{dVar}) : dVar.e;
    }

    public static /* synthetic */ void c(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708c35e7", new Object[]{dVar, new Integer(i)});
        } else {
            dVar.b(i);
        }
    }

    public static /* synthetic */ int d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f59f546e", new Object[]{dVar})).intValue() : dVar.c();
    }

    public static /* synthetic */ void e(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7400585a", new Object[]{dVar});
        } else {
            dVar.t();
        }
    }

    public static /* synthetic */ List f(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c53b5cee", new Object[]{dVar}) : dVar.g;
    }

    public static /* synthetic */ void g(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c26018", new Object[]{dVar});
        } else {
            dVar.d();
        }
    }

    public static /* synthetic */ boolean h(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ef2363fb", new Object[]{dVar})).booleanValue() : dVar.y;
    }

    public static /* synthetic */ boolean i(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6d8467da", new Object[]{dVar})).booleanValue() : dVar.w;
    }

    public static /* synthetic */ void j(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe56bb5", new Object[]{dVar});
        } else {
            dVar.h();
        }
    }

    public static /* synthetic */ void k(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a466f94", new Object[]{dVar});
        } else {
            dVar.q();
        }
    }

    public static /* synthetic */ void l(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a77373", new Object[]{dVar});
        } else {
            dVar.i();
        }
    }

    public static /* synthetic */ i m(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("51aeeaaa", new Object[]{dVar}) : dVar.s;
    }

    public static /* synthetic */ List n(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fe826ef6", new Object[]{dVar}) : dVar.D;
    }

    public static /* synthetic */ e o(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("51eecce5", new Object[]{dVar}) : dVar.p;
    }

    public static /* synthetic */ void p(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22b82ef", new Object[]{dVar});
        } else {
            dVar.r();
        }
    }

    public static /* synthetic */ List q(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("13fd15b9", new Object[]{dVar}) : dVar.C;
    }

    public d(kvw kvwVar, i iVar, IMultiTabPerformanceListener iMultiTabPerformanceListener) {
        this.l = kvwVar;
        this.s = iVar;
        this.i = new lmt(this.s);
        this.k = new b(this.i);
        this.H = iMultiTabPerformanceListener;
        this.p = new e(this.i, this.k, iVar);
        this.E = new tad(kvwVar, this.s);
        this.r = new c(this.i, this.l, this.s);
        o();
        m();
        n();
    }

    @Override // tb.ksi
    public void a(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920f557f", new Object[]{this, linearLayout});
            return;
        }
        this.b = (FrameLayout) LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.homepage_recommend_multi_tab_view, (ViewGroup) null);
        this.A = (FrameLayout) this.b.findViewById(R.id.tab_layout_container);
        this.f20654a = (MultiTabLayout) this.b.findViewById(R.id.multi_tab);
        this.c = (TUrlImageView) this.b.findViewById(R.id.tab_bg_img);
        this.m = (LinearLayout) this.b.findViewById(R.id.multi_sub_container);
        this.n = this.b.findViewById(R.id.more_tab_container);
        this.d = (TUrlImageView) this.b.findViewById(R.id.iv_more_tab);
        this.o = (TailFadeFrameLayout) this.b.findViewById(R.id.fade_container);
        l();
        if (!n.n().e()) {
            com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) this.l.a(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY);
            if (aVar != null) {
                this.f20654a.setupWithViewPager(aVar.b(), false);
            }
        } else {
            this.f20654a.setPreCreateListener(this.J);
        }
        this.f20654a.addOnTabSelectedListener(this.v);
        this.f20654a.setScrollListener(this.u);
        linearLayout.addView(this.b);
        this.t = true;
        this.x = true;
    }

    @Override // tb.ksi
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.q.clear();
        this.f.clear();
        this.g.clear();
        this.C.clear();
        this.D.clear();
        p();
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a
    public void a(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6446c03", new Object[]{this, bVar});
        } else {
            this.f.add(bVar);
        }
    }

    public void a(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c644e062", new Object[]{this, cVar});
        } else {
            this.r.a(cVar);
        }
    }

    public void a(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c68eb31c", new Object[]{this, onPullRefreshListener});
        } else {
            this.C.add(onPullRefreshListener);
        }
    }

    public void a(oqk oqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f868df6f", new Object[]{this, oqkVar});
        } else {
            this.D.add(oqkVar);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a
    public View a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fef0fbf4", new Object[]{this, str});
        }
        if (this.t && !StringUtils.isEmpty(str)) {
            return this.f20654a.getChildTabView(this.s.a(str));
        }
        return null;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!this.t) {
        } else {
            this.j = i2;
            TabLayout.d tabAt = this.f20654a.getTabAt(i);
            if (tabAt == null) {
                return;
            }
            tabAt.f();
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a
    public void b(String str) {
        TabLayout.d tabAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!this.t || StringUtils.isEmpty(str) || this.f20654a == null || (tabAt = this.f20654a.getTabAt(this.s.a(str))) == null) {
        } else {
            tabAt.f();
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a
    public void a(String str, final a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf2be937", new Object[]{this, str, dVar});
        } else if (!this.t || StringUtils.isEmpty(str) || this.f20654a == null) {
        } else {
            final int a2 = this.s.a(str);
            this.f20654a.post(new Runnable() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TabLayout.d tabAt = d.a(d.this).getTabAt(a2);
                    if (tabAt == null) {
                        return;
                    }
                    tabAt.f();
                    a.d dVar2 = dVar;
                    if (dVar2 == null) {
                        return;
                    }
                    dVar2.a();
                }
            });
        }
    }

    public void a(a.InterfaceC0864a interfaceC0864a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c643f7a4", new Object[]{this, interfaceC0864a});
        } else {
            this.g.add(interfaceC0864a);
        }
    }

    @Override // tb.ksi
    public void a(JSONObject jSONObject, List<JSONObject> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f72497b", new Object[]{this, jSONObject, list, new Boolean(z)});
        } else if (!this.t || jSONObject == null || list == null || list.isEmpty()) {
        } else {
            lar.e("TabLayout.uiRefresh");
            this.e = list;
            this.B = jSONObject;
            this.i.a(jSONObject, this.f20654a.getContext());
            b(jSONObject);
            int a2 = a(list, z);
            if (a2 == this.s.c()) {
                this.p.a(this.f20654a, this.b, this.m, a2);
            }
            this.r.a(jSONObject, list, this.f20654a, this.n, this.o, this.d);
            boolean m = com.taobao.tao.infoflow.multitab.e.m(jSONObject);
            g.a("TabLayoutProvider", "updateTabData isCurEmbed:" + m);
            if (m != this.w || this.x || !this.y) {
                this.w = m;
                this.x = false;
                a(this.w);
            }
            lar.f("TabLayout.uiRefresh");
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A.getLayoutParams();
        layoutParams.height = f.a(this.A.getContext(), 34.0f);
        this.A.setLayoutParams(layoutParams);
        MultiTabLayout multiTabLayout = this.f20654a;
        multiTabLayout.setPadding(0, 0, 0, f.a(multiTabLayout.getContext(), 4.0f));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
        marginLayoutParams.width = f.a(this.d.getContext(), 18.0f);
        marginLayoutParams.topMargin = f.a(this.f20654a.getContext(), 5.5f);
        marginLayoutParams.setMarginStart(f.a(this.f20654a.getContext(), 6.0f));
        marginLayoutParams.setMarginEnd(f.a(this.f20654a.getContext(), 9.0f));
        this.d.setLayoutParams(marginLayoutParams);
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        FrameLayout frameLayout = this.b;
        if (frameLayout == null || !(frameLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        int a2 = a(this.b.getContext(), jSONObject);
        if (marginLayoutParams.topMargin == a2) {
            return;
        }
        marginLayoutParams.topMargin = a2;
        this.b.setLayoutParams(marginLayoutParams);
    }

    public static int a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cb6e283", new Object[]{context, jSONObject})).intValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        float f = 0.0f;
        if (jSONObject2 != null) {
            String string = jSONObject2.getString("marginTop");
            if (!StringUtils.isEmpty(string)) {
                try {
                    f = Integer.parseInt(string);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return f.a(context, f);
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        MultiTabLayout multiTabLayout = this.f20654a;
        if (multiTabLayout == null || this.e == null) {
            return;
        }
        this.i.a(multiTabLayout.getContext(), this.e);
        this.r.b();
        b(this.e);
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        g.a("TabLayoutProvider", "isEmbedTopBar: " + this.w);
        return this.w;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a
    public int[] c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("792658b0", new Object[]{this, str});
        }
        View a2 = a(str);
        int[] iArr = new int[2];
        if (a2 == null) {
            return iArr;
        }
        a2.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + (a2.getWidth() / 2);
        if (StringUtils.equals(str, this.s.n(0))) {
            iArr[0] = iArr[0] + this.i.E;
        }
        iArr[1] = iArr[1] + a2.getHeight();
        return iArr;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        g.a("TabLayoutProvider", "triggerCustomPanelShow  triggerCustomPanelShow");
        this.r.a(this.B, this.f20654a, jSONObject);
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        MultiTabLayout multiTabLayout = this.f20654a;
        if (multiTabLayout == null) {
            return;
        }
        multiTabLayout.post(new Runnable() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    d.b(d.this).a(0L);
                }
            }
        });
    }

    private void b(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        final int selectedTabPosition = this.f20654a.getSelectedTabPosition();
        try {
            this.f20654a.removeAllTabs();
        } catch (Exception e) {
            g.a("TabLayoutProvider", "rebuildTabLayout removeAllTabs error", e);
        }
        int i = 0;
        while (i < list.size()) {
            if (list.get(i).getJSONObject("content") == null) {
                MultiTabLayout multiTabLayout = this.f20654a;
                multiTabLayout.addTab(multiTabLayout.newTab());
            } else {
                boolean z = i == selectedTabPosition;
                TabLayout.d newTab = this.f20654a.newTab();
                newTab.a(this.k.a(this.f20654a.getContext(), i, z));
                this.f20654a.addTab(newTab, z);
            }
            i++;
        }
        this.f20654a.post(new Runnable() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.d.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TabLayout.d tabAt = d.a(d.this).getTabAt(selectedTabPosition);
                if (tabAt != null) {
                    tabAt.f();
                }
                d.a(d.this).updateIndicatorPosition(selectedTabPosition, 0.0f);
            }
        });
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        e eVar = this.p;
        if (eVar == null) {
            return;
        }
        this.q.add(eVar);
        a((a.InterfaceC0864a) this.p);
        a((a.b) this.p);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        tad tadVar = this.E;
        if (tadVar == null) {
            return;
        }
        this.q.add(tadVar);
        a((a.c) this.E);
        a((oqk) this.E);
        a((a.InterfaceC0864a) this.E);
        a((a.b) this.E);
        a((TBSwipeRefreshLayout.OnPullRefreshListener) this.E);
    }

    private int a(final List<JSONObject> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19a0b48e", new Object[]{this, list, new Boolean(z)})).intValue();
        }
        lar.e("TabLayout.refreshTabUi");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        g.a("TabLayoutProvider", "refreshTabUi start");
        this.b.setBackgroundColor(this.i.g);
        if (!StringUtils.isEmpty(this.i.l)) {
            onq.a(this.c, this.i.l, "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
            this.c.setImageUrl(this.i.l);
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
        try {
            this.f20654a.removeAllTabs();
        } catch (Exception e) {
            g.a("TabLayoutProvider", "refreshTabUi removeAllTabs error", e);
        }
        int i = 0;
        final int i2 = 1;
        while (i < list.size()) {
            JSONObject jSONObject = list.get(i).getJSONObject("content");
            if (jSONObject == null) {
                MultiTabLayout multiTabLayout = this.f20654a;
                multiTabLayout.addTab(multiTabLayout.newTab());
            } else {
                if (z) {
                    i2 = jSONObject.getBooleanValue(com.taobao.tao.infoflow.multitab.e.KEY_DEFAULT_SELECTED) ? i : this.s.c();
                } else {
                    i2 = this.s.h();
                }
                g.a("TabLayoutProvider", "refreshTabUi currentTabRemoved :" + z + ",selectedPos:" + i2);
                TabLayout.d newTab = this.f20654a.newTab();
                newTab.a(this.k.a(this.f20654a.getContext(), i, i2 == i));
                this.f20654a.addTab(newTab, false);
            }
            i++;
        }
        this.f20654a.setShowIndicator(this.i.m);
        this.f20654a.setIndicatorColor(this.i.b());
        MultiTabLayout multiTabLayout2 = this.f20654a;
        multiTabLayout2.setIndicatorBottomOffset(DensityUtil.dip2px(multiTabLayout2.getContext(), 4.0f));
        this.f20654a.post(new Runnable() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.d.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TabLayout.d tabAt = d.a(d.this).getTabAt(i2);
                if (tabAt != null) {
                    tabAt.f();
                }
                d.a(d.this, d.d(d.this), list);
                d.a(d.this).updateIndicatorPosition(i2, 0.0f);
            }
        });
        g.a("TabLayoutProvider", "refreshTabUi end:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        lar.f("TabLayout.refreshTabUi");
        return i2;
    }

    private void a(int i, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52638a8c", new Object[]{this, new Integer(i), list});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        g.a("TabLayoutProvider", "reportTabExposure start");
        if (list == null || list.isEmpty() || i <= 0 || i >= list.size()) {
            return;
        }
        for (int i2 = 0; i2 <= i; i2++) {
            JSONObject jSONObject = list.get(i2);
            if (!jSONObject.getBooleanValue("isTracked")) {
                kss.b(jSONObject);
            }
        }
        g.a("TabLayoutProvider", "reportTabExposure end:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    private int c() {
        View b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        g.a("TabLayoutProvider", "getLastVisibleTabIndex start");
        Rect rect = new Rect();
        int tabCount = this.f20654a.getTabCount();
        int i = -1;
        for (int i2 = 0; i2 < tabCount; i2++) {
            TabLayout.d tabAt = this.f20654a.getTabAt(i2);
            if (tabAt != null && (b = tabAt.b()) != null && b.getLocalVisibleRect(rect)) {
                i = i2;
            }
        }
        g.a("TabLayoutProvider", "getLastVisibleTabIndex end:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        return i;
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        g.a("TabLayoutProvider", "updateTabSelectStyle");
        if (this.f20654a == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f20654a.getTabCount()) {
            TabLayout.d tabAt = this.f20654a.getTabAt(i2);
            if (tabAt != null && tabAt.b() != null) {
                View b = tabAt.b();
                lmt.a aVar = this.i.u.get(Integer.valueOf(i2));
                if (aVar != null) {
                    a(b, i2);
                    String str = aVar.f30723a;
                    if (!StringUtils.isEmpty(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(",");
                        sb.append(i == i2 ? "已选中" : "未选中");
                        b.setContentDescription(sb.toString());
                    }
                    a(b, i2, i == i2);
                }
            }
            i2++;
        }
        f();
        g();
    }

    private void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
            return;
        }
        int c = this.i.c();
        if (tea.a(tea.TAB_BG + i, c)) {
            return;
        }
        view.setBackgroundColor(c);
    }

    private void a(View view, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c25511b", new Object[]{this, view, new Integer(i), new Boolean(z)});
            return;
        }
        if (view instanceof TUrlImageView) {
            String a2 = this.i.a(i, z);
            if (!tea.a(tea.TAB_IMAGE + i, a2)) {
                TUrlImageView tUrlImageView = (TUrlImageView) view;
                onq.a(tUrlImageView, a2, "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
                tUrlImageView.setImageUrl(a2);
            }
        }
        if (!(view instanceof TextView)) {
            return;
        }
        int a3 = this.i.a(z);
        if (!tea.a(tea.TAB_TEXT_COLOR + i, a3)) {
            ((TextView) view).setTextColor(a3);
        }
        int i2 = z ? this.i.i : this.i.h;
        if (tea.a(tea.TAB_TEXT_SIZE + i, i2)) {
            return;
        }
        ((TextView) view).setTextSize(0, f.a(view.getContext(), i2));
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        int b = this.i.b();
        if (tea.a(tea.INDICATOR_COLOR, b)) {
            return;
        }
        this.f20654a.setIndicatorColor(b);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        String b = this.i.b(true);
        if (StringUtils.isEmpty(b) || tea.a(tea.MORE_IMAGE, b)) {
            return;
        }
        onq.a(this.d, b, "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
        this.d.setImageUrl(b);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        g.a("TabLayoutProvider", "updateTabData checkTabParent");
        if (z) {
            this.y = a(this.b);
        }
        g.a("TabLayoutProvider", "updateTabData checkTabParent time:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    private void t() {
        int tabCount;
        View childTabView;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        MultiTabLayout multiTabLayout = this.f20654a;
        if (multiTabLayout == null || this.o == null || this.d == null || (tabCount = multiTabLayout.getTabCount() - 1) < 0 || (childTabView = this.f20654a.getChildTabView(tabCount)) == null) {
            return;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = childTabView.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        boolean globalVisibleRect2 = this.d.getGlobalVisibleRect(rect2);
        if (globalVisibleRect && globalVisibleRect2) {
            int width = childTabView.getWidth();
            int i = rect.right;
            int i2 = rect.left;
            if (i > rect2.left || i - i2 < width) {
                z = true;
            }
            this.o.showFade(z);
        }
        if (globalVisibleRect) {
            return;
        }
        this.o.showFade(true);
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.InterfaceC0865a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        TabLayout.d tabAt = this.f20654a.getTabAt(i);
        if (tabAt == null) {
            return;
        }
        tabAt.f();
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (this.h == i) {
            g.a("TabLayoutProvider", "onTabSelected pos already select ");
        } else {
            this.h = i;
            this.s.g(i);
            JSONObject c = this.s.c(i);
            if (c == null) {
                return;
            }
            b(i);
            this.H.a(this.s.n(i), i);
            com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) this.l.a(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY);
            boolean z = i == this.s.c() && i > 0 && this.s.b() == i + (-1);
            if (aVar != null) {
                aVar.a(i);
                aVar.a(z);
            }
            for (a.b bVar : this.f) {
                bVar.a(i, c, this.j == 0);
            }
            this.j = 0;
            this.f20654a.post(new Runnable() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.d.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (d.h(d.this)) {
                    } else {
                        d dVar = d.this;
                        d.a(dVar, d.i(dVar));
                    }
                }
            });
        }
    }

    private void d() {
        JSONObject c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        int i = this.I;
        if (i == -1 || (c = this.s.c(i)) == null) {
            return;
        }
        for (a.b bVar : this.f) {
            bVar.b(this.I, c);
        }
        this.I = -1;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.InterfaceC0865a
    public void n_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa5584b", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == 1) {
            this.j = 2;
        }
        for (a.InterfaceC0865a interfaceC0865a : this.q) {
            interfaceC0865a.n_(i);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.InterfaceC0865a
    public void a(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26181c1e", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        this.f20654a.updateIndicatorPosition(i, f);
        for (a.InterfaceC0865a interfaceC0865a : this.q) {
            interfaceC0865a.a(i, f, i2);
        }
    }

    private boolean a(View view) {
        lbo homePageManager;
        ohv e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        lbq b = oiy.a().b();
        if (b == null || (homePageManager = b.getHomePageManager()) == null || (e = homePageManager.e()) == null) {
            return false;
        }
        e.a(view);
        return true;
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            oql.a().a(this.F);
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else {
            oql.a().b(this.F);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        law k = k();
        if (k == null) {
            return;
        }
        this.z = j();
        k.o().a(this.z);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        law k = k();
        if (k == null || this.z == null) {
            return;
        }
        k.o().b(this.z);
    }

    private com.taobao.homepage.view.manager.lifecycle.listener.d j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.homepage.view.manager.lifecycle.listener.d) ipChange.ipc$dispatch("b7a4f7f6", new Object[]{this}) : new com.taobao.homepage.view.manager.lifecycle.listener.d() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.d.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.homepage.view.manager.lifecycle.listener.d
            public void p() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("63fccf7", new Object[]{this});
                    return;
                }
                d dVar = d.this;
                d.c(dVar, d.m(dVar).h());
                d.o(d.this).b();
            }
        };
    }

    private law k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (law) ipChange.ipc$dispatch("5bf7ad72", new Object[]{this});
        }
        lbo u = u();
        if (u != null) {
            return u.y();
        }
        return null;
    }

    private lbo u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lbo) ipChange.ipc$dispatch("a8e825f1", new Object[]{this});
        }
        lbq b = oiy.a().b();
        if (b != null) {
            return b.getHomePageManager();
        }
        return null;
    }

    private void q() {
        mjx i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        lbo u = u();
        if (u == null || (i = u.i()) == null) {
            return;
        }
        i.a(this.G);
    }

    private void r() {
        mjx i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        lbo u = u();
        if (u == null || (i = u.i()) == null) {
            return;
        }
        i.b(this.G);
    }
}
