package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.component.u;
import com.taobao.tao.flexbox.layoutmanager.component.v;
import com.taobao.tao.flexbox.layoutmanager.component.w;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.ai;
import com.taobao.tao.flexbox.layoutmanager.core.c;
import com.taobao.tao.flexbox.layoutmanager.view.NestViewPager;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;
import tb.ipv;
import tb.kge;
import tb.mou;
import tb.odx;
import tb.oeb;
import tb.oec;
import tb.ofw;
import tb.ofx;
import tb.ofy;
import tb.ogg;
import tb.ogl;
import tb.ogt;

/* loaded from: classes8.dex */
public class TabBarControllerComponent extends Component<ViewPager, c> implements ViewPager.OnPageChangeListener, w.a, com.taobao.tao.flexbox.layoutmanager.core.ae, ai, com.taobao.tao.flexbox.layoutmanager.core.g, com.taobao.tao.flexbox.layoutmanager.core.s, ofw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SELECTED_INDEX_STATE_NAME = "TabBarController:selectedIndex";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f20080a;
    private a b;
    private w g;
    private int j;
    private MessageQueue.IdleHandler u = null;
    private int c = 0;
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private int h = 0;
    private int i = 0;
    private boolean k = false;
    private final Map<com.taobao.tao.flexbox.layoutmanager.core.aa, IPage> l = new HashMap();
    private int m = 0;
    private ofx n = new ofx();
    private ofy o = new ofy();
    private int p = -1;
    private float q = 0.0f;
    private boolean r = true;
    private c.a s = new c.a<NestViewPager, c>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, c cVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2fbbc07e", new Object[]{this, aaVar, cVar, str, obj});
            } else if (cVar == null || !StringUtils.equals(str, "scroll")) {
            } else {
                cVar.d = oec.a(obj, true);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, NestViewPager nestViewPager, c cVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9895c972", new Object[]{this, fVar, nestViewPager, cVar, dVar});
                return;
            }
            TabBarControllerComponent tabBarControllerComponent = TabBarControllerComponent.this;
            TabBarControllerComponent.a(tabBarControllerComponent, ((c) TabBarControllerComponent.b(tabBarControllerComponent)).d);
        }
    };
    private c.a t = new c.a<NestViewPager, c>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, c cVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2fbbc07e", new Object[]{this, aaVar, cVar, str, obj});
            } else if (cVar == null || !StringUtils.equals(str, "edgepan")) {
            } else {
                c.a(cVar, obj);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, NestViewPager nestViewPager, c cVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9895c972", new Object[]{this, fVar, nestViewPager, cVar, dVar});
            } else {
                nestViewPager.setEdgePan(((c) TabBarControllerComponent.c(TabBarControllerComponent.this)).j);
            }
        }
    };

    /* loaded from: classes8.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public String f20090a;
        public String b;
        public Map c;

        static {
            kge.a(757538318);
        }

        public d(String str, String str2, Map map) {
            this.f20090a = str;
            this.b = str2;
            this.c = map;
        }
    }

    public static /* synthetic */ Object ipc$super(TabBarControllerComponent tabBarControllerComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2141646649:
                super.applyAttrForView((View) objArr[0], (ogl) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -1926757943:
                super.onLayoutComplete();
                return null;
            case -1346446914:
                super.onSaveInstanceState((Map) objArr[0]);
                return null;
            case -670057321:
                super.handleChildDeleted((com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[0], ((Number) objArr[1]).intValue(), (com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[2]);
                return null;
            case -542260307:
                return new Boolean(super.sendViewAppearForAdd((com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[0]));
            case 258418204:
                return new Boolean(super.invoke((g.c) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (g.d) objArr[3]));
            case 505817802:
                return super.getAttributeHandler((String) objArr[0]);
            case 1015965122:
                super.onLayoutChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Boolean) objArr[4]).booleanValue());
                return null;
            case 1123088784:
                return new Boolean(super.onPrepareComponent((Context) objArr[0]));
            case 1964402429:
                super.onRenderCompleted();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ void applyAttrForView(ViewPager viewPager, c cVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805910c7", new Object[]{this, viewPager, cVar, map, new Boolean(z)});
        } else {
            a(viewPager, cVar, map, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [tb.ogl, com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent$c] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ c mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : e();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View, android.support.v4.view.ViewPager] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ ViewPager onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa a(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("311f25cf", new Object[]{tabBarControllerComponent}) : tabBarControllerComponent.k();
    }

    public static /* synthetic */ void a(TabBarControllerComponent tabBarControllerComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb4dc94", new Object[]{tabBarControllerComponent, new Integer(i)});
        } else {
            tabBarControllerComponent.b(i);
        }
    }

    public static /* synthetic */ void a(TabBarControllerComponent tabBarControllerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6466ae", new Object[]{tabBarControllerComponent, aaVar, map});
        } else {
            tabBarControllerComponent.e(aaVar, map);
        }
    }

    public static /* synthetic */ void a(TabBarControllerComponent tabBarControllerComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb51c65", new Object[]{tabBarControllerComponent, new Boolean(z)});
        } else {
            tabBarControllerComponent.a(z);
        }
    }

    public static /* synthetic */ boolean a(TabBarControllerComponent tabBarControllerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b987a7fb", new Object[]{tabBarControllerComponent, aaVar})).booleanValue() : tabBarControllerComponent.e(aaVar);
    }

    public static /* synthetic */ ogl b(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("b696d6e2", new Object[]{tabBarControllerComponent}) : tabBarControllerComponent.viewParams;
    }

    public static /* synthetic */ void b(TabBarControllerComponent tabBarControllerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2478c078", new Object[]{tabBarControllerComponent, aaVar});
        } else {
            tabBarControllerComponent.f(aaVar);
        }
    }

    public static /* synthetic */ void b(TabBarControllerComponent tabBarControllerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a11c0d", new Object[]{tabBarControllerComponent, aaVar, map});
        } else {
            tabBarControllerComponent.b(aaVar, map);
        }
    }

    public static /* synthetic */ boolean b(TabBarControllerComponent tabBarControllerComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eda88248", new Object[]{tabBarControllerComponent, new Boolean(z)})).booleanValue();
        }
        tabBarControllerComponent.k = z;
        return z;
    }

    public static /* synthetic */ ogl c(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("fc381981", new Object[]{tabBarControllerComponent}) : tabBarControllerComponent.viewParams;
    }

    public static /* synthetic */ void c(TabBarControllerComponent tabBarControllerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f69d8f9", new Object[]{tabBarControllerComponent, aaVar});
        } else {
            tabBarControllerComponent.d(aaVar);
        }
    }

    public static /* synthetic */ void c(TabBarControllerComponent tabBarControllerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43ddd16c", new Object[]{tabBarControllerComponent, aaVar, map});
        } else {
            tabBarControllerComponent.c(aaVar, map);
        }
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa d(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("85cb1fec", new Object[]{tabBarControllerComponent}) : tabBarControllerComponent.node;
    }

    public static /* synthetic */ String d(TabBarControllerComponent tabBarControllerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1184e666", new Object[]{tabBarControllerComponent, aaVar}) : tabBarControllerComponent.b(aaVar);
    }

    public static /* synthetic */ void d(TabBarControllerComponent tabBarControllerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d01a86cb", new Object[]{tabBarControllerComponent, aaVar, map});
        } else {
            tabBarControllerComponent.d(aaVar, map);
        }
    }

    public static /* synthetic */ boolean e(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("14e32957", new Object[]{tabBarControllerComponent})).booleanValue() : tabBarControllerComponent.r;
    }

    public static /* synthetic */ boolean f(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c0c0b98", new Object[]{tabBarControllerComponent})).booleanValue() : tabBarControllerComponent.e;
    }

    public static /* synthetic */ View g(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c1f59ad7", new Object[]{tabBarControllerComponent}) : tabBarControllerComponent.view;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa h(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("f6b06d68", new Object[]{tabBarControllerComponent}) : tabBarControllerComponent.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa i(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("12e9c0c7", new Object[]{tabBarControllerComponent}) : tabBarControllerComponent.node;
    }

    public static /* synthetic */ boolean j(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38af949c", new Object[]{tabBarControllerComponent})).booleanValue() : tabBarControllerComponent.k;
    }

    public static /* synthetic */ boolean k(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fd876dd", new Object[]{tabBarControllerComponent})).booleanValue() : tabBarControllerComponent.attached;
    }

    public static /* synthetic */ a l(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("baf78c06", new Object[]{tabBarControllerComponent}) : tabBarControllerComponent.b;
    }

    public static /* synthetic */ boolean m(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4e2a3b5f", new Object[]{tabBarControllerComponent})).booleanValue() : tabBarControllerComponent.n();
    }

    public static /* synthetic */ View n(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ff806de", new Object[]{tabBarControllerComponent}) : tabBarControllerComponent.view;
    }

    public static /* synthetic */ View o(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3faf3adf", new Object[]{tabBarControllerComponent}) : tabBarControllerComponent.view;
    }

    static {
        kge.a(-117496056);
        kge.a(1848919473);
        kge.a(-1420926486);
        kge.a(328095190);
        kge.a(863201962);
        kge.a(-906966987);
        kge.a(-1778869774);
        kge.a(724366362);
        f20080a = false;
    }

    public ViewPager a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("b95340cc", new Object[]{this, context});
        }
        NestViewPager nestViewPager = new NestViewPager(context, this.node);
        nestViewPager.addOnPageChangeListener(this);
        nestViewPager.setId(oec.g());
        return nestViewPager;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onViewCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6b63ab", new Object[]{this});
            return;
        }
        v a2 = x.a(this.node, ((c) this.viewParams).c, false);
        ab.e S = this.node.S();
        if (S != null) {
            S.a("selectTab", this);
            S.a("weexfoldtab", this);
            S.a("foldtab", this);
            S.a("onpagemsg", this);
            if (a2 != null && ((v.a) a2.getViewParams()).b) {
                S.a("onscroll", this);
                S.a("canscrollvertical", this);
            }
            S.a("onnestscroll", this);
        }
        this.g = w.a(this.node.k(), this, ((c) this.viewParams).c);
        this.g.a(this);
        int b2 = this.g.b();
        ((NestViewPager) this.view).setNestScrollDistance(b2);
        if (b2 <= 0 || a2 == null || !((v.a) a2.getViewParams()).c) {
            return;
        }
        ((NestViewPager) this.view).fullNestScroll();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutChanged(int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8e65c2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        super.onLayoutChanged(i, i2, i3, i4, z);
        if (i == i3 || z) {
            return;
        }
        this.h = this.i;
        if (this.view != 0) {
            ((ViewPager) this.view).setTranslationY(0.0f);
        }
        w wVar = this.g;
        if (wVar == null) {
            return;
        }
        wVar.c();
    }

    @Override // tb.ofw
    public ofx a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ofx) ipChange.ipc$dispatch("f08a7bd", new Object[]{this}) : this.n;
    }

    @Override // tb.ofw
    public ofy b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ofy) ipChange.ipc$dispatch("16ba4d3b", new Object[]{this}) : this.o;
    }

    @Override // tb.ofw
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.m;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.a((List<com.taobao.tao.flexbox.layoutmanager.core.aa>) null);
        }
        if (this.view != 0 && ((ViewPager) this.view).getParent() != null) {
            ((ViewGroup) ((ViewPager) this.view).getParent()).removeView(this.view);
        }
        this.view = null;
        this.attached = false;
        w wVar = this.g;
        if (wVar != null) {
            wVar.b(this);
        }
        ab.e S = this.node.S();
        if (S != null) {
            S.b("selectTab", this);
            S.b("weexfoldtab", this);
            S.b("foldtab", this);
            S.b("onpagemsg", this);
            S.b("onnestscroll", this);
            S.b("onscroll", this);
            S.b("canscrollvertical", this);
        }
        int i = this.c;
        if (i != -1 && (a2 = a(i)) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("type", "page");
            c(a2, hashMap);
            d(a2, hashMap);
        }
        if (this.node.d == null) {
            return;
        }
        for (int i2 = 0; i2 < this.node.d.size(); i2++) {
            this.node.d.get(i2).d(z);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        this.p = i;
        this.q = i2;
        if (this.e) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("positionOffset", Float.valueOf(f));
        hashMap.put("positionOffsetPixels", Integer.valueOf(i2));
        hashMap.put("group", ((c) this.viewParams).c);
        hashMap.put("width", Integer.valueOf(this.measureResult.f20361a));
        hashMap.put("height", Integer.valueOf(this.measureResult.b));
        hashMap.put("offsetx", Integer.valueOf(i2));
        sendMessage(getNode(), "onpagescroll", null, hashMap, null);
        if (StringUtils.equals(((c) this.viewParams).h, "none") || this.b == null || this.view == 0 || i2 <= 1) {
            return;
        }
        int currentItem = ((ViewPager) this.view).getCurrentItem();
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = null;
        if (i == currentItem - 1) {
            aaVar = a(i);
        } else if (i == currentItem) {
            i++;
            aaVar = a(i);
        }
        if (aaVar == null || aaVar.w()) {
            return;
        }
        a.a(this.b, (ViewGroup) this.view, this.b.a((ViewGroup) this.view, i), aaVar, false);
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else if (this.f) {
        } else {
            if (!((c) this.viewParams).f) {
                ogt.a(ogt.TASK_TAB_SELECT);
            }
            ogg.c("TabBarController", "onPageSelected, oldIndex: " + this.c + " newIndex:" + i + " group:" + ((c) this.viewParams).c);
            i();
            f20080a = false;
            HashMap hashMap = new HashMap();
            hashMap.put("oldIndex", Integer.valueOf(this.c));
            hashMap.put("newIndex", Integer.valueOf(i));
            hashMap.put("group", ((c) this.viewParams).c);
            if (!this.e) {
                sendMessage(getNode(), "onpageselected", null, hashMap, null);
            } else {
                u a2 = x.a(this.node, ((c) this.viewParams).c);
                if (a2 != null) {
                    sendMessage(a2.getNode(), "ontabselected", null, hashMap, null);
                }
            }
            if (this.e) {
                oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            TabBarControllerComponent.a(TabBarControllerComponent.this, i);
                        }
                    }
                });
            } else {
                b(i);
            }
            if (((c) this.viewParams).f) {
                return;
            }
            ogt.a(ogt.TASK_TAB_SELECT, new JSONObject(hashMap));
        }
    }

    private void i() {
        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        int i = this.c;
        if (i == -1 || (a2 = a(i)) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sourcePage", "tab");
        hashMap.put("type", "tab");
        c(a2, hashMap);
        d(a2, hashMap);
    }

    private void b(int i) {
        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        if (f()) {
            int currentItem = ((ViewPager) this.view).getCurrentItem();
            if (this.b != null && (a2 = a(currentItem)) != null && a2.I() != null && a2.G() != null) {
                a2.l();
                a2.b(a2.N());
            }
        } else {
            d(this.h);
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa a3 = a(i);
        if (a3 == null) {
            return;
        }
        this.c = i;
        HashMap hashMap = new HashMap();
        hashMap.put("source", 2);
        hashMap.put("sourcePage", "tab");
        hashMap.put("type", "tab");
        if (a3.x() == null) {
            a3.a((Map) hashMap);
        } else {
            e(a3, hashMap);
            b(a3, hashMap);
        }
        this.node.k().s().a(this);
        this.n.a(this, i);
        j();
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.view != 0) {
            int currentItem = ((ViewPager) this.view).getCurrentItem();
            if (((c) this.viewParams).b >= Integer.MAX_VALUE) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.node.R(); i++) {
                if (i == currentItem) {
                    arrayList.add(Integer.valueOf(i));
                } else {
                    com.taobao.tao.flexbox.layoutmanager.core.aa b2 = this.node.b(i);
                    if (b2 != null && b2.w()) {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
            }
            if (arrayList.size() <= ((c) this.viewParams).b) {
                return;
            }
            int size = arrayList.size() - 1;
            int i2 = 0;
            for (int size2 = arrayList.size() - ((c) this.viewParams).b; size2 > 0; size2--) {
                int intValue = ((Integer) arrayList.get(i2)).intValue();
                int intValue2 = ((Integer) arrayList.get(size)).intValue();
                if (Math.abs(intValue - currentItem) >= Math.abs(intValue2 - currentItem)) {
                    this.node.b(intValue).d(false);
                    i2++;
                } else {
                    this.node.b(intValue2).d(false);
                    size--;
                }
            }
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            return;
        }
        this.m = i;
        this.o.a(this, i);
        HashMap hashMap = new HashMap();
        hashMap.put("state", Integer.valueOf(i));
        sendMessage(this.node, "onscrollstatechanged", null, hashMap, null);
        if (!oeb.A() || this.view == 0 || (a2 = a(((ViewPager) this.view).getCurrentItem())) == null) {
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("state", Integer.valueOf(i));
        a(a2, hashMap2);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutComplete() {
        com.taobao.tao.flexbox.layoutmanager.core.aa k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
            return;
        }
        super.onLayoutComplete();
        if (this.i != this.measureResult.b && this.measureResult.b > 0) {
            int i = this.i > 0 ? this.measureResult.b - this.i : 0;
            this.i = this.measureResult.b;
            if (this.h <= 0) {
                this.h = this.i;
            }
            if (i != 0) {
                this.h += i;
                w wVar = this.g;
                if (wVar != null) {
                    wVar.e();
                }
            }
        }
        if (this.h > 0) {
            this.measureResult.b = this.h;
        }
        if (!oeb.a() || (k = k()) == null || k.w() || !c(k)) {
            return;
        }
        k.m();
        k.c(this.node.G().f20361a, this.node.G().b);
        k.b(false);
    }

    private void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fbcd83f", new Object[]{this, aaVar, map, new Boolean(z)});
            return;
        }
        int a2 = oec.a(aaVar.a(5), 0);
        if (z) {
            int i = a2 + 1;
            aaVar.a(5, Integer.valueOf(i));
            aaVar.a(6, Long.valueOf(System.currentTimeMillis()));
            map.put(UiUtil.INPUT_TYPE_VALUE_NUM, Integer.valueOf(i));
        } else {
            long a3 = oec.a(aaVar.a(6), 0L);
            map.put(UiUtil.INPUT_TYPE_VALUE_NUM, Integer.valueOf(a2));
            map.put("duration", Long.valueOf(System.currentTimeMillis() - a3));
        }
        map.put("index", Integer.valueOf(this.node.a(aaVar)));
    }

    private void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c40135", new Object[]{this, aaVar, map});
        } else if (aaVar.I() == null) {
        } else {
            aaVar.I().sendMessage(2, aaVar, "onpagescrollstatechanged", null, map, null);
        }
    }

    private void b(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f38954", new Object[]{this, aaVar, map});
        } else if (oec.a(aaVar.a(3), false) || !l()) {
        } else {
            a(aaVar, map, true);
            aaVar.I().sendMessage(130, aaVar, "onpageappear", null, map, null);
            if (!((c) this.viewParams).f) {
                d f = f(aaVar, map);
                com.taobao.tao.flexbox.layoutmanager.container.i renderIntercept = getRenderIntercept();
                if (renderIntercept != null) {
                    renderIntercept.a(((ViewPager) this.view).getContext(), aaVar, f.f20090a, f.b, f.c);
                }
                a(aaVar, true, f.f20090a);
                g(aaVar);
            }
            aaVar.a(3, (Object) true);
            aaVar.a((Map) null);
        }
    }

    private String b(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2276aaf", new Object[]{this, aaVar});
        }
        String a2 = oec.a(aaVar.e(Component.KEY_PAGE_NAME), (String) null);
        return StringUtils.isEmpty(a2) ? (String) aaVar.a(1) : a2;
    }

    private void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, final boolean z, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("465e1d4e", new Object[]{this, aaVar, new Boolean(z), str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "pageAppear:" : "pageDisAppear:");
        sb.append(str);
        ogg.c("TabBarController", sb.toString());
        final Object D = aaVar.D();
        aaVar.k().a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Object obj = D;
                if (!(obj instanceof Map)) {
                    return;
                }
                String a2 = oec.a(((Map) obj).get("type"), (String) null);
                String a3 = oec.a(((Map) D).get("id"), (String) null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z ? "pageAppear:" : "pageDisAppear:");
                sb2.append(str);
                sb2.append(" id:");
                sb2.append(a3);
                sb2.append("  type:");
                sb2.append(a2);
                ogg.c("TabBarController", sb2.toString());
            }
        });
    }

    public void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, String str, Map map, String str2, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("232f97b0", new Object[]{this, aaVar, str, map, str2, map2});
            return;
        }
        String a2 = str2 != null ? str2 : oec.a(aaVar.e(Component.KEY_PAGE_NAME), (String) null);
        Map map3 = map2 != null ? map2 : (Map) aaVar.a(4);
        if (StringUtils.isEmpty(a2)) {
            a2 = (String) aaVar.a(1);
        }
        Object a3 = aaVar.a(101);
        if (!(a3 instanceof b)) {
            return;
        }
        b bVar = (b) a3;
        if (!oec.a(aaVar.a(3), false)) {
            return;
        }
        if (!StringUtils.equals(str, a2) && !StringUtils.isEmpty(str)) {
            if (!StringUtils.isEmpty(str)) {
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().b(this.node, a2);
            }
            if (map3 != null && map3.size() > 0) {
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(aaVar, map3);
            }
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(this.node);
            h(aaVar);
            aaVar.a(3, (Object) false);
            if (!StringUtils.isEmpty(str)) {
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().b(this.node, str);
            }
            if (map != null && map.size() > 0) {
                String a4 = oec.a(map.get("spm"), (String) null);
                String a5 = oec.a(map.get("spm-url"), (String) null);
                String a6 = oec.a(map.get("spm-cnt"), (String) null);
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(aaVar, map);
                if (bVar != null) {
                    bVar.a(str, a4, a5, a6, map);
                    aaVar.a(101, bVar);
                }
            }
            g(aaVar);
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().d(aaVar, str);
            aaVar.a(3, (Object) true);
        }
        aaVar.a((Map) null);
    }

    private void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6dd1cf9", new Object[]{this, aaVar, bVar});
            return;
        }
        try {
            a(aaVar, oec.a(aaVar.e(Component.KEY_PAGE_NAME), (String) null), oec.a(aaVar.a(4), (Map) null), bVar.f20088a, bVar.e);
        } catch (Throwable unused) {
            ogg.a("TabBarController", "syncPageCompo Error");
        }
    }

    private z i(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z) ipChange.ipc$dispatch("603148e", new Object[]{this, aaVar});
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa a2 = aaVar.a(z.class, (aa.c) new aa.c<com.taobao.tao.flexbox.layoutmanager.core.aa>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
            public boolean b(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("aca84e15", new Object[]{this, aaVar2})).booleanValue();
                }
                return false;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
            public boolean a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("691d3054", new Object[]{this, aaVar2})).booleanValue() : ((z) aaVar2.I()).d();
            }
        }, false);
        if (a2 == null) {
            return null;
        }
        return (z) a2.I();
    }

    private void j(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        z i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9013c19", new Object[]{this, aaVar});
        } else if (!k(aaVar) || ((c) this.viewParams).f || (i = i(aaVar)) == null) {
        } else {
            i.a(true);
        }
    }

    private boolean k(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8c59de", new Object[]{this, aaVar})).booleanValue();
        }
        return !l(aaVar) || oeb.a("enableChildPageTrack", true);
    }

    private boolean l(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5017779f", new Object[]{this, aaVar})).booleanValue() : oec.a(aaVar.e("disabled-page-track"), false);
    }

    private d f(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("32ef7ded", new Object[]{this, aaVar, map});
        }
        String b2 = b(aaVar);
        String a2 = oec.a(aaVar.e("spm"), (String) null);
        String a3 = oec.a(aaVar.e("spm-url"), (String) null);
        HashMap hashMap = new HashMap();
        if (!StringUtils.isEmpty(a2)) {
            hashMap.put("spm-cnt", a2);
        }
        if (!StringUtils.isEmpty(a3)) {
            hashMap.put("spm-url", a3);
        }
        if (oeb.d()) {
            Object a4 = aaVar.a(4);
            if (a4 instanceof Map) {
                hashMap.putAll((Map) a4);
            }
        }
        boolean l = l(aaVar);
        boolean a5 = oec.a(map.get("ignorePageTrack"), false);
        if (k(aaVar) && !a5) {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().d(aaVar, b2);
            if (!StringUtils.isEmpty(b2)) {
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().b(this.node, b2);
            }
            if (hashMap.size() > 0 && !l) {
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(aaVar, hashMap);
            }
            z i = i(aaVar);
            if (i != null) {
                i.b();
            }
        }
        return new d(b2, a2, hashMap);
    }

    private void g(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e131ef", new Object[]{this, aaVar, map});
            return;
        }
        boolean a2 = oec.a(map.get("ignorePageTrack"), false);
        if (!k(aaVar) || a2) {
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(aaVar);
        z i = i(aaVar);
        if (i == null) {
            return;
        }
        i.c();
    }

    private void c(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d231173", new Object[]{this, aaVar, map});
        } else if (!oec.a(aaVar.a(3), false)) {
        } else {
            a(aaVar, map, false);
            String a2 = oec.a(map.get("type"), (String) null);
            if (!StringUtils.equals(a2, "tab") && !StringUtils.equals(a2, "page")) {
                z = false;
            }
            if (!z) {
                a2 = "page";
            }
            map.put("type", a2);
            aaVar.I().sendMessage(130, aaVar, "onpagedisappear", null, map, null);
            if (!((c) this.viewParams).f) {
                g(aaVar, map);
                a(aaVar, false, b(aaVar));
                h(aaVar);
            }
            aaVar.a(3, (Object) false);
        }
    }

    private boolean c(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0336bd6", new Object[]{this, aaVar})).booleanValue();
        }
        boolean n = aaVar.n();
        if (n) {
            return n;
        }
        com.taobao.tao.flexbox.layoutmanager.core.r G = aaVar.G();
        return (G != null && G.f20361a == this.node.G().f20361a && G.b == this.h) ? false : true;
    }

    private com.taobao.tao.flexbox.layoutmanager.core.aa k() {
        int max;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("6d9b2b8c", new Object[]{this});
        }
        u a2 = x.a(this.node, ((c) this.viewParams).c);
        if (a2 != null && (max = Math.max(a2.b(), a2.getViewParams().g)) < this.node.d.size()) {
            return this.node.d.get(max);
        }
        return null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean interceptVNodeDiff(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b7f54970", new Object[]{this, str})).booleanValue() : "onunfold".equals(str) || "onfold".equals(str);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean onPrepareComponent(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42f0f990", new Object[]{this, context})).booleanValue();
        }
        boolean onPrepareComponent = super.onPrepareComponent(context);
        if (onPrepareComponent) {
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.taobao.tao.flexbox.layoutmanager.core.aa a2 = TabBarControllerComponent.a(TabBarControllerComponent.this);
                    if (a2 == null) {
                        return;
                    }
                    a2.a(context);
                }
            });
        }
        return onPrepareComponent;
    }

    public int a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("691d3043", new Object[]{this, aaVar})).intValue();
        }
        while (aaVar.J() != null && !(aaVar.J().I() instanceof TabBarControllerComponent)) {
            aaVar = aaVar.J();
        }
        if (aaVar == null) {
            return -1;
        }
        for (int i = 0; i < this.node.d.size(); i++) {
            if (this.node.d.get(i) == aaVar) {
                return i;
            }
        }
        return -1;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onRenderCompleted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751666fd", new Object[]{this});
        } else {
            super.onRenderCompleted();
        }
    }

    private void d(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33be8993", new Object[]{this, aaVar});
        } else if (aaVar.a(101) == null) {
            b bVar = new b();
            bVar.f20088a = oec.a(aaVar.e(Component.KEY_PAGE_NAME), (String) null);
            bVar.b = oec.a(aaVar.e("spm"), (String) null);
            bVar.c = oec.a(aaVar.e("spm-url"), (String) null);
            bVar.d = oec.a(aaVar.e("spm-cnt"), (String) null);
            HashMap hashMap = new HashMap();
            Object a2 = aaVar.a(4);
            if (a2 instanceof Map) {
                hashMap.putAll((Map) a2);
            }
            bVar.e = hashMap;
            aaVar.a(101, bVar);
        } else {
            b bVar2 = (b) aaVar.a(101);
            String a3 = oec.a(aaVar.e(Component.KEY_PAGE_NAME), (String) null);
            String a4 = oec.a(aaVar.e("spm"), (String) null);
            if (a3 == null) {
                return;
            }
            if (StringUtils.equals(bVar2.f20088a, a3) && StringUtils.equals(bVar2.b, a4)) {
                return;
            }
            a(aaVar, bVar2);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public com.taobao.tao.flexbox.layoutmanager.core.c getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.c) ipChange.ipc$dispatch("1e262aca", new Object[]{this, str});
        }
        if (oeb.a("optTabbarControllerAttr", true)) {
            if (StringUtils.equals(str, "scroll")) {
                return this.s;
            }
            if (StringUtils.equals(str, "edgepan")) {
                return this.t;
            }
        }
        return super.getAttributeHandler(str);
    }

    public void a(ViewPager viewPager, c cVar, Map map, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc5c920b", new Object[]{this, viewPager, cVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(viewPager, cVar, map, z);
        NestViewPager nestViewPager = (NestViewPager) viewPager;
        nestViewPager.setEnableSwipe(((c) this.viewParams).d);
        nestViewPager.setEdgePan(((c) this.viewParams).j);
        if (this.b == null) {
            this.b = new a();
        }
        this.b.a(this.node.d);
        if (((ViewPager) this.view).getAdapter() == null) {
            ((ViewPager) this.view).setAdapter(this.b);
            u a2 = x.a(this.node, ((c) this.viewParams).c);
            if (a2 == null) {
                return;
            }
            u.a viewParams = a2.getViewParams();
            int max = Math.max(a2.b(), viewParams.g);
            if (max > 0) {
                this.f = true;
            }
            this.c = max;
            ((ViewPager) this.view).setCurrentItem(max);
            this.f = false;
            this.d = max;
            this.j = viewParams.l;
            if (this.node == null || this.node.d == null || max < 0 || max >= this.node.d.size()) {
                return;
            }
            this.b.instantiateItem((ViewGroup) this.view, max);
            return;
        }
        int currentItem = ((ViewPager) this.view).getCurrentItem();
        e(a(currentItem));
        if (this.q <= 1.0f || (i = this.p) < 0) {
            return;
        }
        if (currentItem > i) {
            e(a(currentItem - 1));
        } else if (currentItem != i) {
        } else {
            e(a(currentItem + 1));
        }
    }

    private boolean e(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7749a758", new Object[]{this, aaVar})).booleanValue();
        }
        if (aaVar != null) {
            boolean c2 = c(aaVar);
            if (c2) {
                aaVar.m();
                aaVar.c(aaVar.J().G().f20361a, this.h);
            }
            boolean w = aaVar.w();
            if (!w || c2 || aaVar.s()) {
                if (!w) {
                    j(aaVar);
                }
                aaVar.a(((ViewPager) this.view).getContext(), this.node.b());
                return true;
            }
        }
        return false;
    }

    public c e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("86e803b2", new Object[]{this}) : new c();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
        com.taobao.tao.flexbox.layoutmanager.core.aa b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        if (str.equals("ontabselected")) {
            return a(map);
        }
        if (str.equals("onnestscroll")) {
            int a3 = oec.a(map.get("nestY"), 0);
            int a4 = oec.a(map.get("maxNestY"), 0);
            if (odx.a(((c) this.viewParams).c, oec.a(map.get("group"), (String[]) null))) {
                this.g.a(a3, a4, false);
            }
        } else if (str.equals("onforcerefresh")) {
            if (this.view != 0 && this.g != null) {
                int currentItem = ((ViewPager) this.view).getCurrentItem();
                if (this.b != null) {
                    com.taobao.tao.flexbox.layoutmanager.core.aa a5 = a(currentItem);
                    if (a5 != null) {
                        sendMessage(2, a5, str, null, null, null);
                    }
                    this.g.d();
                }
            }
            return true;
        } else if (str.equals("onpageappear")) {
            c(map);
            return true;
        } else if (str.equals("onpagedisappear")) {
            b(map);
            return true;
        } else if (str.equals("onpagescrollstatechanged")) {
            if (this.view != 0) {
                int currentItem2 = ((ViewPager) this.view).getCurrentItem();
                if (this.b != null && (b2 = aaVar2.b(currentItem2)) != null) {
                    a(b2, map);
                }
            }
            return true;
        } else if (str.equals("onpagemsg")) {
            if (this.view != 0) {
                int currentItem3 = ((ViewPager) this.view).getCurrentItem();
                if (this.b != null && (a2 = a(currentItem3)) != null) {
                    sendMessage(34, a2, str, str2 != null ? str2 : (String) a2.e(str), null, null);
                }
            }
            return true;
        } else {
            x.a(str, map, this, ((c) this.viewParams).c, this.g);
        }
        return false;
    }

    private boolean a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue();
        }
        if (!odx.a(oec.a(map.get("group"), (String[]) null), ((c) this.viewParams).c)) {
            return false;
        }
        int intValue = ((Integer) map.get("newIndex")).intValue();
        if (this.view != 0 && intValue != ((ViewPager) this.view).getCurrentItem()) {
            this.e = true;
            ((ViewPager) this.view).setCurrentItem(intValue, !((c) this.viewParams).e);
            this.e = false;
        }
        return true;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.view == 0) {
        } else {
            ((NestViewPager) this.view).setEnableSwipe(z);
        }
    }

    private void d(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7529992", new Object[]{this, aaVar, map});
        } else if (aaVar == null) {
        } else {
            ogg.c("TabBarController", "sendChildPageStop, node:" + aaVar);
            HashMap hashMap = new HashMap(map);
            if (aaVar.I() == null) {
                return;
            }
            aaVar.I().sendMessage(130, aaVar, "onstop", null, hashMap, null);
        }
    }

    private void e(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518221b1", new Object[]{this, aaVar, map});
        } else if (aaVar == null) {
        } else {
            ogg.c("TabBarController", "sendChildPageStart, node:" + aaVar);
            aaVar.I().sendMessage(130, aaVar, "onstart", null, new HashMap(map), null);
        }
    }

    private void b(Map map) {
        com.taobao.tao.flexbox.layoutmanager.core.aa b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (this.view == 0) {
        } else {
            int currentItem = ((ViewPager) this.view).getCurrentItem();
            if (this.b == null || (b2 = this.node.b(currentItem)) == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            c(b2, hashMap);
        }
    }

    public com.taobao.tao.flexbox.layoutmanager.core.aa p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("25eb6a27", new Object[]{this});
        }
        if (this.view == 0) {
            return null;
        }
        return a(((ViewPager) this.view).getCurrentItem());
    }

    private void c(Map map) {
        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
        } else if (this.view == 0) {
        } else {
            int currentItem = ((ViewPager) this.view).getCurrentItem();
            if (this.b == null || (a2 = a(currentItem)) == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            if (f20080a) {
                hashMap.put("source", 1);
            } else {
                hashMap.put("source", 2);
            }
            hashMap.put("sourcePage", map.get("sourcePage") != null ? map.get("sourcePage") : "page");
            String a3 = oec.a(map.get("type"), (String) null);
            if (StringUtils.equals(a3, "tab") || StringUtils.equals(a3, "page")) {
                z = true;
            }
            if (!z) {
                a3 = "page";
            }
            hashMap.put("type", a3);
            if (a2.x() == null) {
                a2.a((Map) hashMap);
            } else {
                b(a2, hashMap);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue();
        }
        if (eVar.c.equals("selectTab")) {
            a(eVar.d);
        } else if (eVar.c.equals("onwillappear")) {
            c(eVar.d);
        } else if (eVar.c.equals("onwilldisappear")) {
            b(eVar.d);
        } else if (eVar.c.equals("onstart")) {
            e(p(), eVar.d);
            return true;
        } else if (eVar.c.equals("onstop")) {
            d(p(), eVar.d);
            return true;
        } else {
            return onHandleTNodeMessage(eVar.f20300a, eVar.b, eVar.c, null, eVar.d, eVar.e);
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void setWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
        } else if (this.measureResult.f20361a == i) {
        } else {
            this.measureResult.f20361a = i;
            this.node.b(((ViewPager) this.view).getContext());
            c(i);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void setHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
        } else if (this.h == i) {
        } else {
            this.h = i;
            if (this.measureResult.b == i) {
                return;
            }
            this.measureResult.b = i;
            this.node.b(((ViewPager) this.view).getContext());
            d(i);
        }
    }

    public com.taobao.tao.flexbox.layoutmanager.core.aa a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("e5ca1e03", new Object[]{this, new Integer(i)}) : this.node.b(i);
    }

    private void c(int i) {
        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (this.view == 0) {
        } else {
            int currentItem = ((ViewPager) this.view).getCurrentItem();
            if (this.b == null || (a2 = a(currentItem)) == null || a2.I() == null || a2.G() == null) {
                return;
            }
            if (a2.G().f20361a == i && (a2.x() == null || a2.x().getWidth() == i)) {
                return;
            }
            a2.G().f20361a = i;
            a2.m();
            a2.c(i, a2.G().b);
            a2.b(((ViewPager) this.view).getContext());
        }
    }

    private void d(int i) {
        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (this.view == 0) {
        } else {
            int currentItem = ((ViewPager) this.view).getCurrentItem();
            if (this.b == null || (a2 = a(currentItem)) == null || a2.I() == null || a2.G() == null) {
                return;
            }
            if (a2.G().b == i && (a2.x() == null || a2.x().getHeight() <= 0 || a2.x().getHeight() == i)) {
                return;
            }
            a2.G().b = i;
            a2.m();
            a2.a(i);
            a2.b(((ViewPager) this.view).getContext());
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.w.a
    public void a(int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1660f9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
        } else if (f() || this.view == 0) {
        } else {
            int i4 = -i;
            int i5 = i - ((this.j * i4) / i2);
            ((ViewPager) this.view).setTranslationY(i5);
            if (z) {
                if (this.g.a() == 1) {
                    setHeight(this.i + i2 + this.j);
                } else if (this.g.a() == 0 && this.g.g() == 2) {
                    setHeight(this.i);
                }
            } else {
                setHeight(this.i - i5);
            }
            if (!((c) this.viewParams).g) {
                return;
            }
            if (i4 <= 0) {
                ((NestViewPager) this.view).setEnableSwipe(true);
            } else if (i4 < i2) {
            } else {
                ((NestViewPager) this.view).setEnableSwipe(false);
            }
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : getViewParams() != null && getViewParams().f20089a;
    }

    public void g() {
        w wVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.view == 0 || (wVar = this.g) == null || wVar.a() != 0) {
        } else {
            float f = -((ViewPager) this.view).getTranslationY();
            if (f >= this.g.b() / 2 && f < this.g.b() + this.j) {
                HashMap hashMap = new HashMap();
                hashMap.put("foldTab", true);
                hashMap.put("group", ((c) this.viewParams).c);
                sendMessage(getNode(), "foldtab", null, hashMap, null);
            } else if (f >= this.g.b() / 2 || f <= 0.0f) {
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("foldTab", false);
                hashMap2.put("group", ((c) this.viewParams).c);
                sendMessage(getNode(), "foldtab", null, hashMap2, null);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class c extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String MODE_FAST = "fast";
        public static final String MODE_IDLE = "idle";
        public static final String MODE_NONE = "none";
        public static final String MODE_PRELOAD = "preload";
        public String[] c;

        /* renamed from: a  reason: collision with root package name */
        public boolean f20089a = false;
        public int b = Integer.MAX_VALUE;
        public boolean d = true;
        public boolean e = true;
        public boolean f = false;
        public boolean g = false;
        public String h = "none";
        public boolean i = false;
        public int j = 0;

        static {
            kge.a(-1223264804);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ void a(c cVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0851d4c", new Object[]{cVar, obj});
            } else {
                cVar.a(obj);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
            if (r9.equals("scroll") != false) goto L11;
         */
        @Override // tb.ogl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 286
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent.c.a(android.content.Context, java.lang.String, java.lang.Object):void");
        }

        private void a(Object obj) {
            String[] split;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                return;
            }
            this.j = 0;
            String a2 = oec.a(obj, (String) null);
            if (a2 == null) {
                return;
            }
            for (String str : a2.split(SymbolExpUtil.SYMBOL_VERTICALBAR)) {
                if (str.equals("left")) {
                    this.j |= 1;
                } else if (str.equals("right")) {
                    this.j |= 16;
                }
            }
        }
    }

    /* loaded from: classes8.dex */
    public class a extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private com.taobao.tao.flexbox.layoutmanager.core.aa b;
        private List<FrameLayout> c;
        private List<Integer> d;

        static {
            kge.a(2047439658);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v4.view.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view == obj;
        }

        public a() {
        }

        public static /* synthetic */ List a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e90c5755", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ void a(a aVar, ViewGroup viewGroup, ViewGroup viewGroup2, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e18efbc", new Object[]{aVar, viewGroup, viewGroup2, aaVar, new Boolean(z)});
            } else {
                aVar.a(viewGroup, viewGroup2, aaVar, z);
            }
        }

        public View a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
            }
            com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = this.b;
            if (aaVar == null) {
                return null;
            }
            return aaVar.x();
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : TabBarControllerComponent.d(TabBarControllerComponent.this).d.size();
        }

        @Override // android.support.v4.view.PagerAdapter
        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.core.aa a2 = TabBarControllerComponent.this.a(i);
            if (a2 == null || a2 == this.b) {
                return;
            }
            a(viewGroup, a(viewGroup, i), a2, true);
            this.b = a2;
        }

        private void a(ViewGroup viewGroup, ViewGroup viewGroup2, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, boolean z) {
            Map hashMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2360fd46", new Object[]{this, viewGroup, viewGroup2, aaVar, new Boolean(z)});
                return;
            }
            TabBarControllerComponent.a(TabBarControllerComponent.this, aaVar);
            if (TabBarControllerComponent.e(TabBarControllerComponent.this) || z) {
                TabBarControllerComponent.b(TabBarControllerComponent.this, aaVar);
            }
            ViewGroup viewGroup3 = (ViewGroup) aaVar.x().getParent();
            if (viewGroup2 != viewGroup3) {
                viewGroup2.removeAllViews();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(aaVar.x());
                }
                viewGroup2.addView(aaVar.x());
            }
            if (aaVar.i() != null || z) {
                if (aaVar.i() != null) {
                    hashMap = aaVar.i();
                } else {
                    hashMap = new HashMap();
                    if (TabBarControllerComponent.f20080a) {
                        hashMap.put("source", 1);
                    } else {
                        hashMap.put("source", 2);
                    }
                }
                if (TabBarControllerComponent.f(TabBarControllerComponent.this)) {
                    hashMap.put("sourcePage", "tab");
                    hashMap.put("type", "tab");
                } else if (!hashMap.containsKey("sourcePage")) {
                    hashMap.put("sourcePage", "page");
                    hashMap.put("type", "page");
                }
                if (!TabBarControllerComponent.f(TabBarControllerComponent.this)) {
                    TabBarControllerComponent.a(TabBarControllerComponent.this, aaVar, hashMap);
                    TabBarControllerComponent.b(TabBarControllerComponent.this, aaVar, hashMap);
                }
            }
            if (!oec.a(aaVar.e("dynamicPage"), false) || aaVar.I() == null) {
                return;
            }
            aaVar.I().registerRenderCompleteListener("tabChild", new com.taobao.tao.flexbox.layoutmanager.event.d() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.event.d
                public void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, Component component) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("543ff3b", new Object[]{this, aaVar2, component});
                        return;
                    }
                    try {
                        TabBarControllerComponent.c(TabBarControllerComponent.this, aaVar2);
                    } catch (Throwable th) {
                        ogg.a("dynamicPageCallBack", th.toString());
                    }
                }
            });
        }

        public FrameLayout a(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FrameLayout) ipChange.ipc$dispatch("f3213c1d", new Object[]{this, viewGroup, new Integer(i)});
            }
            FrameLayout frameLayout = this.c.get(i);
            if (frameLayout == null) {
                frameLayout = new FrameLayout(viewGroup.getContext());
                this.c.set(i, frameLayout);
            }
            if (frameLayout.getParent() != viewGroup) {
                if (frameLayout.getParent() != null) {
                    ((ViewGroup) frameLayout.getParent()).removeView(frameLayout);
                }
                viewGroup.addView(frameLayout);
            }
            frameLayout.setTag(TabBarControllerComponent.i(TabBarControllerComponent.this).d.get(i));
            frameLayout.setTag(R.id.layout_manager_tabbar_position_id, Integer.valueOf(i));
            return frameLayout;
        }

        @Override // android.support.v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            FrameLayout a2 = a(viewGroup, i);
            if (i == ((ViewPager) TabBarControllerComponent.g(TabBarControllerComponent.this)).getCurrentItem()) {
                com.taobao.tao.flexbox.layoutmanager.core.aa a3 = TabBarControllerComponent.this.a(i);
                if (a3 != null) {
                    a(viewGroup, a2, a3, false);
                }
            } else {
                if (this.d == null) {
                    this.d = new ArrayList();
                }
                if (!this.d.contains(Integer.valueOf(i))) {
                    this.d.add(Integer.valueOf(i));
                }
            }
            return a2;
        }

        @Override // android.support.v4.view.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
                return;
            }
            View view = (View) obj;
            viewGroup.removeView(view);
            Object tag = view.getTag();
            if (!(tag instanceof com.taobao.tao.flexbox.layoutmanager.core.aa)) {
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = (com.taobao.tao.flexbox.layoutmanager.core.aa) tag;
            String a2 = oec.a((Object) TabBarControllerComponent.d(TabBarControllerComponent.this, aaVar), "");
            String a3 = oec.a(aaVar.e("id"), "");
            ogg.c("TabBarController", "destroyItem, pageName:" + a2 + " id:" + a3);
            if (!oeb.a("enableFixDestroyItemDisappear", true)) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("type", "tab");
            TabBarControllerComponent.c(TabBarControllerComponent.this, aaVar, hashMap);
            TabBarControllerComponent.d(TabBarControllerComponent.this, aaVar, hashMap);
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getItemPosition(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
            }
            View view = (View) obj;
            Object tag = view.getTag();
            int intValue = ((Integer) view.getTag(R.id.layout_manager_tabbar_position_id)).intValue();
            int i = tag == TabBarControllerComponent.this.a(intValue) ? -1 : -2;
            if (i == -1 && this.c.get(intValue) == null) {
                this.c.set(intValue, (FrameLayout) view);
            }
            return i;
        }

        public void a(List<com.taobao.tao.flexbox.layoutmanager.core.aa> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            } else if (list != null) {
                int size = list.size();
                if (this.c == null) {
                    this.c = new ArrayList(5);
                }
                if (this.c.size() != size) {
                    this.c.clear();
                    for (int i = 0; i < size; i++) {
                        this.c.add(null);
                    }
                }
                if (list.size() == TabBarControllerComponent.h(TabBarControllerComponent.this).d.size() && !TabBarControllerComponent.j(TabBarControllerComponent.this)) {
                    return;
                }
                TabBarControllerComponent.b(TabBarControllerComponent.this, false);
                notifyDataSetChanged();
            }
        }
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        return oec.d((View) this.view) && ((!oeb.by() || this.node.k().h() == null) ? true : this.node.k().h().isContainerResumed());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildAdded(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc32990", new Object[]{this, aaVar, new Integer(i), aaVar2});
        } else {
            this.k = true;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildDeleted(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80fbc97", new Object[]{this, aaVar, new Integer(i), aaVar2});
            return;
        }
        if (oeb.cd()) {
            super.handleChildDeleted(aaVar, i, aaVar2);
        }
        this.k = true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildMoved(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, int i2, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f8fdf6", new Object[]{this, aaVar, new Integer(i), new Integer(i2), aaVar2});
        } else {
            this.k = true;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onPatchCompleted() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2dd229", new Object[]{this});
        } else if (!this.k || this.view == 0 || (aVar = this.b) == null) {
        } else {
            aVar.a(this.node.d);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component, com.taobao.tao.flexbox.layoutmanager.core.b
    public boolean sendViewAppearForAdd(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfadc3ad", new Object[]{this, aaVar})).booleanValue();
        }
        if (!oeb.bQ()) {
            return super.sendViewAppearForAdd(aaVar);
        }
        return aaVar == this.node.b(this.view != 0 ? ((ViewPager) this.view).getCurrentItem() : 0);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.view == 0) {
        } else {
            ((NestViewPager) this.view).setEnablePullIntercept(z);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        m();
        if (this.u == null) {
            return;
        }
        Looper.myQueue().removeIdleHandler(this.u);
        this.u = null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean invoke(g.c cVar, String str, JSONObject jSONObject, g.d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f67261c", new Object[]{this, cVar, str, jSONObject, dVar})).booleanValue();
        }
        char c2 = 65535;
        if (str.hashCode() == -318476791 && str.equals("preload")) {
            c2 = 0;
        }
        if (c2 != 0) {
            z = false;
        } else {
            Integer num = null;
            if (jSONObject != null) {
                num = jSONObject.getInteger("index");
            }
            if (num != null) {
                e(num.intValue());
            } else {
                List<Integer> a2 = a.a(this.b);
                if (a2 != null) {
                    for (Integer num2 : a2) {
                        e(num2.intValue());
                    }
                }
            }
        }
        return !z ? super.invoke(cVar, str, jSONObject, dVar) : z;
    }

    private void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            Looper.myQueue().addIdleHandler(f(i));
        }
    }

    private MessageQueue.IdleHandler f(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageQueue.IdleHandler) ipChange.ipc$dispatch("746edf20", new Object[]{this, new Integer(i)});
        }
        MessageQueue.IdleHandler idleHandler = this.u;
        if (idleHandler != null) {
            return idleHandler;
        }
        this.u = new MessageQueue.IdleHandler() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.MessageQueue.IdleHandler
            public boolean queueIdle() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                }
                com.taobao.tao.flexbox.layoutmanager.core.aa a2 = TabBarControllerComponent.this.a(i);
                if (TabBarControllerComponent.k(TabBarControllerComponent.this) && TabBarControllerComponent.l(TabBarControllerComponent.this) != null && a2 != null && !a2.w()) {
                    if (!TabBarControllerComponent.m(TabBarControllerComponent.this)) {
                        return true;
                    }
                    a.a(TabBarControllerComponent.l(TabBarControllerComponent.this), (ViewGroup) TabBarControllerComponent.o(TabBarControllerComponent.this), TabBarControllerComponent.l(TabBarControllerComponent.this).a((ViewGroup) TabBarControllerComponent.n(TabBarControllerComponent.this), i), a2, false);
                }
                return false;
            }
        };
        return this.u;
    }

    private boolean n() {
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        if (oeb.cx()) {
            z = Build.VERSION.SDK_INT >= 23 ? Looper.myQueue().isIdle() : true;
            if (z) {
                z = !((NestViewPager) this.view).isTouchOnView();
                RecyclerView o = o();
                if (o != null) {
                    ogg.c("TabBarController", "recyclerView:" + o + " scrollState:" + o.getScrollState());
                    if (o.getScrollState() == 0) {
                        z2 = true;
                    }
                    z &= z2;
                }
            }
        } else {
            z = true;
        }
        ogg.c("TabBarController", "inIdle:" + z);
        return z;
    }

    private RecyclerView o() {
        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("9f176a8e", new Object[]{this});
        }
        if (this.view == 0 || (a2 = a(((ViewPager) this.view).getCurrentItem())) == null) {
            return null;
        }
        View x = a2.x();
        if (!(x instanceof ViewGroup)) {
            return null;
        }
        return a((ViewGroup) x);
    }

    private RecyclerView a(ViewGroup viewGroup) {
        RecyclerView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("c1117a3d", new Object[]{this, viewGroup});
        }
        if (viewGroup instanceof RecyclerView) {
            return (RecyclerView) viewGroup;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof RecyclerView) {
                return (RecyclerView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (a2 = a((ViewGroup) childAt)) != null) {
                return a2;
            }
        }
        return null;
    }

    private void f(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IPage iPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad4c515", new Object[]{this, aaVar});
        } else if (((c) this.viewParams).f || this.l.get(aaVar) != null) {
        } else {
            String str = aaVar.c().a().f20266a;
            HashMap hashMap = new HashMap();
            boolean z = this.r;
            Object g = aaVar.k().g();
            if (z && (g instanceof Fragment)) {
                iPage = com.taobao.monitor.procedure.m.a().a((Fragment) g, ogt.a(aaVar), str, aaVar.x(), true);
                a(aaVar.k(), iPage);
            } else {
                IPage a2 = com.taobao.monitor.procedure.m.a().a(aaVar.x(), true);
                a(aaVar.k(), a2);
                a2.d().a(ogt.a(aaVar), str, hashMap);
                iPage = a2;
            }
            if (z) {
                iPage.g().a("isTNodeFirstPage", (Object) true);
            }
            if (g instanceof Fragment) {
                iPage.g().a("isTNodeFragmentMode", (Object) true);
                iPage.g().a("isTNodeRecovery", Boolean.valueOf(((Fragment) g).getArguments().getBoolean("isTNodeRecovery", false)));
            }
            this.r = false;
            aaVar.a(iPage);
            this.l.put(aaVar, iPage);
            try {
                aaVar.x().setTag(com.taobao.monitor.procedure.v.APM_PAGE_ROOT_VIEW, true);
            } catch (Exception unused) {
            }
            ogg.c("TabBarController", "onAPMPageCreate, node:" + aaVar + " firstRender:" + z);
        }
    }

    private void a(ab abVar, IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3926b1ea", new Object[]{this, abVar, iPage});
        } else if (!oeb.cr()) {
        } else {
            try {
                new ipv(abVar, (mou) iPage);
            } catch (Exception e) {
                ogg.a("TabBarController", "APM_INIT error, " + e.getMessage());
            }
        }
    }

    private void g(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5fe2d6", new Object[]{this, aaVar});
        } else if (((c) this.viewParams).f) {
        } else {
            IPage iPage = this.l.get(aaVar);
            if (iPage == null) {
                f(aaVar);
                iPage = this.l.get(aaVar);
            }
            if (iPage == null) {
                return;
            }
            iPage.d().a();
            ogg.c("TabBarController", "onAPMPageAppear, node:" + aaVar);
        }
    }

    private void h(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IPage iPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41eb0097", new Object[]{this, aaVar});
        } else if (((c) this.viewParams).f || (iPage = this.l.get(aaVar)) == null) {
        } else {
            iPage.d().c();
            ogg.c("TabBarController", "onAPMPageDisappear, node:" + aaVar);
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (!((c) this.viewParams).f && this.l.values() != null) {
            for (IPage iPage : this.l.values()) {
                iPage.d().d();
            }
            this.l.clear();
            ogg.c("TabBarController", "onAPMPageDestroy");
        }
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f20088a;
        public String b;
        public String c;
        public String d;
        public Map e;
        public boolean f;

        static {
            kge.a(-581157413);
        }

        private b() {
            this.f = false;
        }

        public void a(String str, String str2, String str3, String str4, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb3d74f5", new Object[]{this, str, str2, str3, str4, map});
                return;
            }
            this.f20088a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = map;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onSaveInstanceState(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afbed9be", new Object[]{this, map});
            return;
        }
        super.onSaveInstanceState(map);
        if (this.view == 0) {
            return;
        }
        int currentItem = ((ViewPager) this.view).getCurrentItem();
        if (getNode().b(currentItem) == null) {
            return;
        }
        map.put(SELECTED_INDEX_STATE_NAME, Integer.valueOf(currentItem));
    }
}
