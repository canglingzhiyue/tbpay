package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import mtopsdk.common.util.StringUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaConstants;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ai;
import com.taobao.tao.flexbox.layoutmanager.core.c;
import com.taobao.tao.flexbox.layoutmanager.view.SpeedEdgePanViewPager;
import com.taobao.tao.flexbox.layoutmanager.view.edgepan.EdgePanViewPager;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ofw;
import tb.ofx;
import tb.ofy;
import tb.ogg;
import tb.ogl;
import tb.ohd;

/* loaded from: classes8.dex */
public class DrawerComponent extends Component<ViewPager, b> implements ViewPager.OnPageChangeListener, com.taobao.tao.flexbox.layoutmanager.core.ae, ai, com.taobao.tao.flexbox.layoutmanager.core.g, com.taobao.tao.flexbox.layoutmanager.core.s, SpeedEdgePanViewPager.a, ofw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.tao.flexbox.layoutmanager.core.aa f19989a;
    private a b;
    private ContentContainer k;
    private com.taobao.tao.flexbox.layoutmanager.core.aa l;
    private com.taobao.tao.flexbox.layoutmanager.core.aa p;
    private Map q;
    private int c = 0;
    private boolean d = false;
    private boolean e = false;
    private boolean n = false;
    private boolean f = false;
    private int h = 0;
    private ofx i = new ofx();
    private ofy j = new ofy();
    private float m = 0.0f;
    private c.a g = new c.a<SpeedEdgePanViewPager, b>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.5
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
        public void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, b bVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee1978d6", new Object[]{this, aaVar, bVar, str, obj});
            } else if (bVar == null || !StringUtils.equals(str, "scroll")) {
            } else {
                bVar.f19998a = oec.a(obj, true);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, SpeedEdgePanViewPager speedEdgePanViewPager, b bVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99d3d58b", new Object[]{this, fVar, speedEdgePanViewPager, bVar, dVar});
            } else {
                speedEdgePanViewPager.setEnableSwipe(((b) DrawerComponent.b(DrawerComponent.this)).f19998a);
            }
        }
    };
    private c.a o = new c.a<SpeedEdgePanViewPager, b>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.6
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
        public void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, b bVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee1978d6", new Object[]{this, aaVar, bVar, str, obj});
            } else if (bVar == null || !StringUtils.equals(str, "edgepan")) {
            } else {
                b.a(bVar, obj);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, SpeedEdgePanViewPager speedEdgePanViewPager, b bVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99d3d58b", new Object[]{this, fVar, speedEdgePanViewPager, bVar, dVar});
            } else {
                speedEdgePanViewPager.setEdgePan(((b) DrawerComponent.c(DrawerComponent.this)).d);
            }
        }
    };

    static {
        kge.a(570079409);
        kge.a(1848919473);
        kge.a(-1420926486);
        kge.a(328095190);
        kge.a(863201962);
        kge.a(-1778869774);
        kge.a(724366362);
        kge.a(1270839311);
    }

    public static /* synthetic */ Object ipc$super(DrawerComponent drawerComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2141646649:
                super.applyAttrForView((View) objArr[0], (ogl) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -1926757943:
                super.onLayoutComplete();
                return null;
            case -670057321:
                super.handleChildDeleted((com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[0], ((Number) objArr[1]).intValue(), (com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[2]);
                return null;
            case -542260307:
                return new Boolean(super.sendViewAppearForAdd((com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[0]));
            case 112483626:
                super.onCreate((com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[0]);
                return null;
            case 258418204:
                return new Boolean(super.invoke((g.c) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (g.d) objArr[3]));
            case 505817802:
                return super.getAttributeHandler((String) objArr[0]);
            case 1015965122:
                super.onLayoutChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Boolean) objArr[4]).booleanValue());
                return null;
            case 1123088784:
                return new Boolean(super.onPrepareComponent((Context) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ void applyAttrForView(ViewPager viewPager, b bVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805910c7", new Object[]{this, viewPager, bVar, map, new Boolean(z)});
        } else {
            a(viewPager, bVar, map, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [tb.ogl, com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent$b] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ b mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : d();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View, android.support.v4.view.ViewPager] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ ViewPager onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    public static /* synthetic */ ContentContainer a(DrawerComponent drawerComponent, ContentContainer contentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentContainer) ipChange.ipc$dispatch("fe6263f6", new Object[]{drawerComponent, contentContainer});
        }
        drawerComponent.k = contentContainer;
        return contentContainer;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa a(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("df5682b8", new Object[]{drawerComponent}) : drawerComponent.k();
    }

    public static /* synthetic */ String a(DrawerComponent drawerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5b81ae32", new Object[]{drawerComponent, aaVar}) : drawerComponent.d(aaVar);
    }

    public static /* synthetic */ void a(DrawerComponent drawerComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("580572fd", new Object[]{drawerComponent, new Integer(i)});
        } else {
            drawerComponent.b(i);
        }
    }

    public static /* synthetic */ void a(DrawerComponent drawerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fed197", new Object[]{drawerComponent, aaVar, map});
        } else {
            drawerComponent.c(aaVar, map);
        }
    }

    public static /* synthetic */ boolean a(DrawerComponent drawerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7541d06a", new Object[]{drawerComponent, aaVar, new Boolean(z)})).booleanValue() : drawerComponent.a(aaVar, z);
    }

    public static /* synthetic */ boolean a(DrawerComponent drawerComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5805b2d2", new Object[]{drawerComponent, new Boolean(z)})).booleanValue();
        }
        drawerComponent.f = z;
        return z;
    }

    public static /* synthetic */ int b(DrawerComponent drawerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8bb87de2", new Object[]{drawerComponent, aaVar})).intValue() : drawerComponent.g(aaVar);
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa b(DrawerComponent drawerComponent, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("8656ba2", new Object[]{drawerComponent, new Integer(i)}) : drawerComponent.a(i);
    }

    public static /* synthetic */ ogl b(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("1883254b", new Object[]{drawerComponent}) : drawerComponent.viewParams;
    }

    public static /* synthetic */ void b(DrawerComponent drawerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("961de1b6", new Object[]{drawerComponent, aaVar, map});
        } else {
            drawerComponent.d(aaVar, map);
        }
    }

    public static /* synthetic */ boolean b(DrawerComponent drawerComponent, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("90e61371", new Object[]{drawerComponent, new Boolean(z)})).booleanValue() : drawerComponent.c(z);
    }

    public static /* synthetic */ String c(DrawerComponent drawerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6cb8b6f0", new Object[]{drawerComponent, aaVar}) : drawerComponent.e(aaVar);
    }

    public static /* synthetic */ ogl c(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("5a9a52aa", new Object[]{drawerComponent}) : drawerComponent.viewParams;
    }

    public static /* synthetic */ void c(DrawerComponent drawerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a3cf1d5", new Object[]{drawerComponent, aaVar, map});
        } else {
            drawerComponent.e(aaVar, map);
        }
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa d(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("12520d15", new Object[]{drawerComponent}) : drawerComponent.f19989a;
    }

    public static /* synthetic */ void d(DrawerComponent drawerComponent, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5c01f4", new Object[]{drawerComponent, aaVar, map});
        } else {
            drawerComponent.b(aaVar, map);
        }
    }

    public static /* synthetic */ boolean e(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("650456ce", new Object[]{drawerComponent})).booleanValue() : drawerComponent.attached;
    }

    public static /* synthetic */ a f(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7e63baac", new Object[]{drawerComponent}) : drawerComponent.b;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa g(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("454d9772", new Object[]{drawerComponent}) : drawerComponent.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa h(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("f6c591", new Object[]{drawerComponent}) : drawerComponent.node;
    }

    public static /* synthetic */ ogl i(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("e72562e4", new Object[]{drawerComponent}) : drawerComponent.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa j(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("784921cf", new Object[]{drawerComponent}) : drawerComponent.node;
    }

    public static /* synthetic */ ogl k(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("6b53bda2", new Object[]{drawerComponent}) : drawerComponent.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa l(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("ef9b7e0d", new Object[]{drawerComponent}) : drawerComponent.l;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa m(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("ab44ac2c", new Object[]{drawerComponent}) : drawerComponent.node;
    }

    public static /* synthetic */ ogl n(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("319945bf", new Object[]{drawerComponent}) : drawerComponent.viewParams;
    }

    public static /* synthetic */ View o(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("2b113d16", new Object[]{drawerComponent}) : drawerComponent.view;
    }

    public static /* synthetic */ int p(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c3858148", new Object[]{drawerComponent})).intValue() : drawerComponent.j();
    }

    public static /* synthetic */ View q(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("81f5f98", new Object[]{drawerComponent}) : drawerComponent.view;
    }

    public static /* synthetic */ boolean r(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a628a05b", new Object[]{drawerComponent})).booleanValue() : drawerComponent.d;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa s(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("113bc0e6", new Object[]{drawerComponent}) : drawerComponent.p;
    }

    public static /* synthetic */ ogl t(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("be2455f9", new Object[]{drawerComponent}) : drawerComponent.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa u(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("888e1d24", new Object[]{drawerComponent}) : drawerComponent.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa v(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("44374b43", new Object[]{drawerComponent}) : drawerComponent.node;
    }

    public static /* synthetic */ boolean w(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cc06de0", new Object[]{drawerComponent})).booleanValue() : drawerComponent.f;
    }

    public static /* synthetic */ ContentContainer x(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ContentContainer) ipChange.ipc$dispatch("99120b33", new Object[]{drawerComponent}) : drawerComponent.k;
    }

    public static /* synthetic */ ogl y(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("89838d4", new Object[]{drawerComponent}) : drawerComponent.viewParams;
    }

    public static /* synthetic */ ogl z(DrawerComponent drawerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("4aaf6633", new Object[]{drawerComponent}) : drawerComponent.viewParams;
    }

    private com.taobao.tao.flexbox.layoutmanager.core.aa o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("3441c408", new Object[]{this});
        }
        if (this.node.d == null) {
            return null;
        }
        for (com.taobao.tao.flexbox.layoutmanager.core.aa aaVar : this.node.d) {
            if (oec.a(aaVar.e("main-content"), false)) {
                return aaVar;
            }
        }
        return null;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.p = o();
        int indexOf = this.node.d.indexOf(this.p);
        if (indexOf >= 0) {
            this.f19989a = a(indexOf - 1);
            this.l = a(indexOf + 1);
            return;
        }
        this.l = null;
        this.f19989a = null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onCreate(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b45d2a", new Object[]{this, aaVar});
            return;
        }
        super.onCreate(aaVar);
        e();
    }

    public ViewPager a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("b95340cc", new Object[]{this, context});
        }
        SpeedEdgePanViewPager speedEdgePanViewPager = new SpeedEdgePanViewPager(context, 800);
        speedEdgePanViewPager.addOnPageChangeListener(this);
        speedEdgePanViewPager.setId(oec.g());
        if (b.a((b) this.viewParams) < 1.0f || b.b((b) this.viewParams) < 1.0f) {
            speedEdgePanViewPager.setPageTransformer(false, new c());
            speedEdgePanViewPager.setDrawOrderDelegate(this);
        }
        return speedEdgePanViewPager;
    }

    @Override // tb.ofw
    public ofx a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ofx) ipChange.ipc$dispatch("f08a7bd", new Object[]{this}) : this.i;
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
            aVar.a(null);
        }
        if (this.view != 0 && ((ViewPager) this.view).getParent() != null) {
            ((ViewGroup) ((ViewPager) this.view).getParent()).removeView(this.view);
        }
        this.view = null;
        this.attached = false;
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

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        ContentContainer contentContainer = this.k;
        if (contentContainer != null) {
            contentContainer.updateShowPercent(1.0f - f);
        }
        if (Float.compare(this.m, 0.0f) <= 0) {
            Float.compare(f, 0.0f);
        }
        if (Float.compare(this.m, 1.0f) < 0) {
            Float.compare(f, 1.0f);
        }
        if (Float.compare(this.m, 1.0f) >= 0) {
            Float.compare(f, 1.0f);
        }
        if (Float.compare(this.m, 0.0f) > 0) {
            Float.compare(f, 0.0f);
        }
        this.m = f;
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        } else if (this.node.d == null) {
        } else {
            if (this.node.d.size() < 2) {
                a(0.0f);
                return;
            }
            if (f > 0.99d && oeb.a("fixDrawerOffset", true)) {
                f = 1.0f;
            }
            if (i == 0) {
                f = 1.0f - f;
            }
            a(f);
            if (this.d || StringUtils.equals(((b) this.viewParams).c, "none") || this.b == null || this.view == 0 || i2 <= 1) {
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
            a.a(this.b, i, true, false);
        }
    }

    private String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24c7dce7", new Object[]{this, new Integer(i)});
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa a2 = a(i);
        return a2 == this.f19989a ? "left" : a2 == this.l ? "right" : a2 == this.p ? "main" : "none";
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else if (this.e || this.n) {
        } else {
            d(i);
            String str = i == j() ? "onclose" : "onopen";
            if (this.node.e(str) != null) {
                int i2 = i == j() ? this.c : i;
                HashMap hashMap = new HashMap();
                hashMap.put("position", c(i2));
                sendMessage(this.node, str, null, hashMap, null);
            }
            if (this.d) {
                oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            DrawerComponent.a(DrawerComponent.this, i);
                        }
                    }
                });
            } else {
                b(i);
            }
        }
    }

    private void d(int i) {
        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.c;
        if (i2 == -1 || (a2 = a(i2)) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sourcePage", "tab");
        hashMap.put("type", "tab");
        hashMap.put("from", c(i()));
        com.taobao.tao.flexbox.layoutmanager.core.aa a3 = a(i);
        if (e(a3) != null) {
            z = false;
        }
        hashMap.put("ignorePageTrack", Boolean.valueOf(z));
        this.q = z ? com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().g(this.node) : null;
        c(a2, hashMap);
        if (h(a2) > h(a3)) {
            return;
        }
        d(a2, hashMap);
    }

    private int h(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41eb008a", new Object[]{this, aaVar})).intValue();
        }
        if (aaVar != null && aaVar.G() != null) {
            return aaVar.G().f20361a;
        }
        return 0;
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa a2 = a(i);
        if (a2 == null) {
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa b2 = this.node.b(this.c);
        HashMap hashMap = new HashMap();
        hashMap.put("source", 2);
        hashMap.put("sourcePage", "tab");
        hashMap.put("type", "tab");
        hashMap.put("from", c(this.c));
        if (e(b2) != null) {
            z = false;
        }
        hashMap.put("ignorePageTrack", Boolean.valueOf(z));
        this.c = i;
        if (a2.x() == null) {
            a2.a((Map) hashMap);
        } else {
            e(a2, hashMap);
            b(a2, hashMap);
        }
        this.i.a(this, i);
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
        ContentContainer contentContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            return;
        }
        this.h = i;
        this.j.a(this, i);
        if (i == 0 && ((ViewPager) this.view).getScrollX() == 0 && (contentContainer = this.k) != null) {
            contentContainer.updateShowPercent(1.0f);
        }
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

    @Override // tb.ofw
    public ofy b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ofy) ipChange.ipc$dispatch("16ba4d3b", new Object[]{this}) : this.j;
    }

    @Override // tb.ofw
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.h;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutChanged(int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8e65c2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        super.onLayoutChanged(i, i2, i3, i4, z);
        a(false);
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
        if (!g() || (k = k()) == null || k.w()) {
            return;
        }
        a(k);
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        IDeviceInfo w = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().w();
        if (w != null && w.c()) {
            return false;
        }
        return oeb.a("prelayoutForDrawer", true);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.node.d != null && this.node.d.size() != 0) {
            for (int i = 0; i < this.node.d.size(); i++) {
                a(a(i), z);
            }
        }
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

    private com.taobao.tao.flexbox.layoutmanager.core.aa n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("42981de9", new Object[]{this});
        }
        if (this.view == 0) {
            return null;
        }
        return a(((ViewPager) this.view).getCurrentItem());
    }

    private void d(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7529992", new Object[]{this, aaVar, map});
        } else if (aaVar == null) {
        } else {
            ogg.c("Drawer", "sendChildPageStop, node:" + aaVar);
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
            ogg.c("Drawer", "sendChildPageStart, node:" + aaVar);
            aaVar.I().sendMessage(130, aaVar, "onstart", null, new HashMap(map), null);
        }
    }

    private void b(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f38954", new Object[]{this, aaVar, map});
        } else if (oec.a(aaVar.a(3), false) || !l()) {
        } else {
            a(aaVar, map, true);
            aaVar.I().sendMessage(130, aaVar, oeb.M() ? "onpageappear" : "onwillappear", null, map, null);
            if (!((b) this.viewParams).b) {
                f(aaVar, map);
            }
            aaVar.a(3, (Object) true);
            aaVar.a((Map) null);
        }
    }

    private z b(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z) ipChange.ipc$dispatch("fa29d1f5", new Object[]{this, aaVar});
        }
        if (aaVar != null && (a2 = aaVar.a(z.class, (aa.c) new aa.c<com.taobao.tao.flexbox.layoutmanager.core.aa>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.2
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
        }, false)) != null) {
            return (z) a2.I();
        }
        return null;
    }

    private void c(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        z b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0336bd2", new Object[]{this, aaVar});
        } else if (((b) this.viewParams).b || (b2 = b(aaVar)) == null) {
        } else {
            b2.a(true);
        }
    }

    private String d(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b03636d", new Object[]{this, aaVar});
        }
        if (aaVar == null) {
            return null;
        }
        String a2 = oec.a(aaVar.e(Component.KEY_PAGE_NAME), (String) null);
        return StringUtils.isEmpty(a2) ? (String) aaVar.a(1) : a2;
    }

    private String e(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        z b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7715fcc", new Object[]{this, aaVar});
        }
        String d = d(aaVar);
        return (!StringUtils.isEmpty(d) || (b2 = b(aaVar)) == null) ? d : b2.e();
    }

    private boolean c(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2985bedf", new Object[]{this, map})).booleanValue() : StringUtils.equals(oec.a(map.get("type"), (String) null), "tab");
    }

    private com.taobao.tao.flexbox.layoutmanager.core.aa f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("b54aecf1", new Object[]{this});
        }
        if (this.p == null) {
            return null;
        }
        final ArrayList arrayList = new ArrayList();
        this.p.a(new aa.c<com.taobao.tao.flexbox.layoutmanager.core.aa>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
            public boolean a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("691d3054", new Object[]{this, aaVar})).booleanValue();
                }
                if (DrawerComponent.a(DrawerComponent.this, aaVar) != null) {
                    return true;
                }
                if (aaVar.I() instanceof TabBarControllerComponent) {
                    ((TabBarControllerComponent) aaVar.I()).p().a(this, arrayList, 2);
                }
                return false;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
            public boolean b(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("aca84e15", new Object[]{this, aaVar})).booleanValue() : arrayList.size() > 0 || (aaVar.I() instanceof TabBarControllerComponent);
            }
        }, arrayList, 2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (com.taobao.tao.flexbox.layoutmanager.core.aa) arrayList.get(0);
    }

    private void f(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        com.taobao.tao.flexbox.layoutmanager.core.aa f;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb1a9d0", new Object[]{this, aaVar, map});
            return;
        }
        String e = e(aaVar);
        if (c(map) && StringUtils.isEmpty(e)) {
            return;
        }
        if (StringUtils.isEmpty(e) && aaVar != this.p && (f = f()) != null) {
            z = oeb.a("recoverPageProperty", true);
            aaVar = f;
        }
        b(aaVar, z);
        ogg.c("Drawer", "pageAppear:" + e);
    }

    private void b(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, boolean z) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e86226e3", new Object[]{this, aaVar, new Boolean(z)});
            return;
        }
        String e = e(aaVar);
        com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().d(aaVar, e);
        if (!StringUtils.isEmpty(e)) {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().b(this.node, e);
        }
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
        if (z && (map = this.q) != null) {
            hashMap.putAll(map);
        }
        if (hashMap.size() > 0) {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(aaVar, hashMap);
        }
        z b2 = b(aaVar);
        if (b2 == null) {
            return;
        }
        b2.b();
    }

    private void g(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e131ef", new Object[]{this, aaVar, map});
            return;
        }
        String e = e(aaVar);
        if (c(map) && StringUtils.isEmpty(e)) {
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(aaVar);
        z b2 = b(aaVar);
        if (b2 != null) {
            b2.c();
        }
        ogg.c("Drawer", "pageDisAppear");
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
            aaVar.I().sendMessage(130, aaVar, oeb.M() ? "onpagedisappear" : "onwilldisappear", null, map, null);
            if (!((b) this.viewParams).b) {
                g(aaVar, map);
            }
            aaVar.a(3, (Object) false);
        }
    }

    private float f(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bad4c505", new Object[]{this, aaVar})).floatValue();
        }
        if (aaVar == this.f19989a) {
            if (this.node.e("left-drawer-width") != null) {
                return ((b) this.viewParams).i;
            }
            if (this.node.e("drawer-width") == null) {
                return Float.NaN;
            }
            return ((b) this.viewParams).f;
        } else if (aaVar == this.l) {
            if (this.node.e("right-drawer-width") == null) {
                return Float.NaN;
            }
            return ((b) this.viewParams).j;
        } else {
            return this.node.G().f20361a;
        }
    }

    private boolean a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("691d3054", new Object[]{this, aaVar})).booleanValue();
        }
        if (aaVar == null) {
            return false;
        }
        boolean n = aaVar.n();
        float f = f(aaVar);
        int i = this.node.G().b;
        if ((b.c((b) this.viewParams) && aaVar == this.f19989a) || (b.d((b) this.viewParams) && aaVar == this.l)) {
            i = ohd.g(this.node.N());
        }
        if (!n) {
            com.taobao.tao.flexbox.layoutmanager.core.r G = aaVar.G();
            if (G != null && ((G.f20361a == f || YogaConstants.isUndefined(f)) && G.b == i)) {
                z = false;
            }
        } else {
            z = n;
        }
        if (z) {
            aaVar.m();
            aaVar.c(f, i);
        }
        return z;
    }

    private int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : (!((b) this.viewParams).e.equals("close") || this.node.d == null || this.node.d.size() <= 1) ? 0 : 1;
    }

    private int g(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fe5fe2c9", new Object[]{this, aaVar})).intValue() : this.node.d.indexOf(aaVar);
    }

    private int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.node.d.indexOf(this.p);
    }

    private com.taobao.tao.flexbox.layoutmanager.core.aa k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("6d9b2b8c", new Object[]{this}) : a(h());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean onPrepareComponent(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42f0f990", new Object[]{this, context})).booleanValue();
        }
        boolean onPrepareComponent = super.onPrepareComponent(context);
        if (onPrepareComponent) {
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.taobao.tao.flexbox.layoutmanager.core.aa a2 = DrawerComponent.a(DrawerComponent.this);
                    if (a2 == null) {
                        return;
                    }
                    a2.a(context);
                }
            });
        }
        return onPrepareComponent;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public com.taobao.tao.flexbox.layoutmanager.core.c getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.c) ipChange.ipc$dispatch("1e262aca", new Object[]{this, str});
        }
        if (oeb.a("optDrawerAttr", true)) {
            if (StringUtils.equals(str, "scroll")) {
                return this.g;
            }
            if (StringUtils.equals(str, "edgepan")) {
                return this.o;
            }
        }
        return super.getAttributeHandler(str);
    }

    public void a(ViewPager viewPager, b bVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1b4b63", new Object[]{this, viewPager, bVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(viewPager, bVar, map, z);
        EdgePanViewPager edgePanViewPager = (EdgePanViewPager) viewPager;
        edgePanViewPager.setEnableSwipe(((b) this.viewParams).f19998a);
        edgePanViewPager.setEdgePan(((b) this.viewParams).d);
        ContentContainer contentContainer = this.k;
        if (contentContainer != null) {
            contentContainer.setMaskLayerColor(((b) this.viewParams).g);
        }
        if (this.b == null || this.node.r()) {
            this.b = new a();
        }
        this.b.a(this.node.d);
        boolean z2 = ((ViewPager) this.view).getAdapter() == null;
        if (z2 || ((ViewPager) this.view).getAdapter() != this.b) {
            int currentItem = ((ViewPager) this.view).getCurrentItem();
            ((ViewPager) this.view).setAdapter(this.b);
            if (z2) {
                int h = h();
                if (h > 0) {
                    this.e = true;
                }
                this.c = h;
                ((ViewPager) this.view).setCurrentItem(h);
                this.e = false;
                if (this.node == null || this.node.d == null || h < 0 || h >= this.node.d.size()) {
                    return;
                }
                this.b.instantiateItem((ViewGroup) this.view, h);
                return;
            }
            this.n = true;
            ((ViewPager) this.view).setCurrentItem(currentItem);
            this.n = false;
            a(false);
            return;
        }
        a(false);
    }

    private boolean a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba898c88", new Object[]{this, aaVar, new Boolean(z)})).booleanValue();
        }
        if (aaVar != null && (z || aaVar.x() != null)) {
            boolean a2 = a(aaVar);
            boolean w = aaVar.w();
            if (this.view != 0 && (z || w || a2 || aaVar.s())) {
                if (!w) {
                    c(aaVar);
                }
                aaVar.a(((ViewPager) this.view).getContext(), getNode().b());
                return true;
            }
        }
        return false;
    }

    public b d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f551822b", new Object[]{this}) : new b();
    }

    private boolean b(int i, boolean z) {
        int g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f7cdde", new Object[]{this, new Integer(i), new Boolean(z)})).booleanValue();
        }
        if (i == 0) {
            g = g(this.f19989a);
        } else {
            g = i == 1 ? g(this.l) : -1;
        }
        if (g != -1) {
            return a(g, z);
        }
        ogg.c("Drawer", "target drawer node not found, position:" + i);
        return false;
    }

    private boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8b84ae", new Object[]{this, new Boolean(z)})).booleanValue() : a(j(), z);
    }

    private boolean a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c11929d", new Object[]{this, new Integer(i), new Boolean(z)})).booleanValue();
        }
        if (this.view == 0 || i == ((ViewPager) this.view).getCurrentItem()) {
            return false;
        }
        this.d = true;
        ((ViewPager) this.view).setCurrentItem(i, z);
        this.d = false;
        return true;
    }

    private void a(Map map) {
        com.taobao.tao.flexbox.layoutmanager.core.aa b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
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

    private void b(Map map) {
        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (this.view == 0) {
        } else {
            int currentItem = ((ViewPager) this.view).getCurrentItem();
            if (this.b == null || (a2 = a(currentItem)) == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sourcePage", map.get("sourcePage") != null ? map.get("sourcePage") : "page");
            String a3 = oec.a(map.get("type"), (String) null);
            if (!StringUtils.equals(a3, "tab") && !StringUtils.equals(a3, "page")) {
                z = false;
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
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
        com.taobao.tao.flexbox.layoutmanager.core.aa a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        if (str.equals("onpageappear")) {
            b(map);
            return true;
        } else if (str.equals("onpagedisappear")) {
            a(map);
            return true;
        } else if (str.equals("onforcerefresh")) {
            if (this.view == 0) {
                return true;
            }
            int currentItem = ((ViewPager) this.view).getCurrentItem();
            if (this.b != null && (a3 = a(currentItem)) != null) {
                sendMessage(2, a3, str, null, null, null);
            }
            return true;
        } else if (!str.equals("onpagemsg")) {
            return false;
        } else {
            if (this.view != 0) {
                int currentItem2 = ((ViewPager) this.view).getCurrentItem();
                if (this.b != null && (a2 = a(currentItem2)) != null) {
                    sendMessage(34, a2, str, str2 != null ? str2 : (String) a2.e(str), null, null);
                }
            }
            return true;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue();
        }
        if (eVar.c.equals("onwillappear")) {
            b(eVar.d);
        } else if (eVar.c.equals("onwilldisappear")) {
            a(eVar.d);
        } else if ("onbackclick".equals(eVar.c)) {
            if (((b) this.viewParams).h && c(true)) {
                eVar.d.put("handled", true);
                return true;
            }
        } else if (eVar.c.equals("onstart")) {
            a(eVar);
            return true;
        } else if (eVar.c.equals("onstop")) {
            b(eVar);
            return true;
        } else {
            return onHandleTNodeMessage(eVar.f20300a, eVar.b, eVar.c, null, eVar.d, eVar.e);
        }
        return false;
    }

    private void a(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("956925ef", new Object[]{this, eVar});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa n = n();
        e(n, eVar.d);
        if (n == this.p || h(this.p) <= h(n)) {
            return;
        }
        e(this.p, eVar.d);
    }

    private void b(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a3d770", new Object[]{this, eVar});
            return;
        }
        for (com.taobao.tao.flexbox.layoutmanager.core.aa aaVar : getNode().H()) {
            d(aaVar, eVar.d);
        }
    }

    private com.taobao.tao.flexbox.layoutmanager.core.aa a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("e5ca1e03", new Object[]{this, new Integer(i)}) : this.node.b(i);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.SpeedEdgePanViewPager.a
    public int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = (com.taobao.tao.flexbox.layoutmanager.core.aa) ((ViewPager) this.view).getChildAt(i2).getTag();
        return aaVar == this.f19989a ? i - 1 : (aaVar != this.p && aaVar == this.l) ? 1 : 0;
    }

    /* loaded from: classes8.dex */
    public static class b extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String MODE_FAST = "fast";
        public static final String MODE_IDLE = "idle";
        public static final String MODE_NONE = "none";
        public static final String MODE_PRELOAD = "preload";

        /* renamed from: a  reason: collision with root package name */
        public boolean f19998a = true;
        public boolean b = false;
        public String c = "fast";
        public int d = 0;
        public String e = "close";
        public float f = 0.0f;
        public float i = 0.0f;
        public float j = 0.0f;
        public int g = 0;
        public boolean h = true;
        private float k = 1.0f;
        private float l = 1.0f;
        private boolean m = false;
        private boolean n = false;

        static {
            kge.a(1863160586);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ float a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a7706bb8", new Object[]{bVar})).floatValue() : bVar.k;
        }

        public static /* synthetic */ void a(b bVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4abf9a4", new Object[]{bVar, obj});
            } else {
                bVar.a(obj);
            }
        }

        public static /* synthetic */ float b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8a9c1ef9", new Object[]{bVar})).floatValue() : bVar.l;
        }

        public static /* synthetic */ boolean c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6dc7d24e", new Object[]{bVar})).booleanValue() : bVar.m;
        }

        public static /* synthetic */ boolean d(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("50f3858f", new Object[]{bVar})).booleanValue() : bVar.n;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00b3, code lost:
            if (r9.equals("edgepan") != false) goto L11;
         */
        @Override // tb.ogl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 408
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.b.a(android.content.Context, java.lang.String, java.lang.Object):void");
        }

        private void a(Object obj) {
            String[] split;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                return;
            }
            this.d = 0;
            String a2 = oec.a(obj, (String) null);
            if (a2 == null) {
                return;
            }
            for (String str : a2.split(SymbolExpUtil.SYMBOL_VERTICALBAR)) {
                if (str.equals("left")) {
                    this.d |= 1;
                } else if (str.equals("right")) {
                    this.d |= 16;
                }
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
            this.f = true;
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
        this.f = true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildMoved(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, int i2, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f8fdf6", new Object[]{this, aaVar, new Integer(i), new Integer(i2), aaVar2});
        } else {
            this.f = true;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onPatchCompleted() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2dd229", new Object[]{this});
            return;
        }
        e();
        if (!this.f || this.view == 0 || (aVar = this.b) == null) {
            return;
        }
        aVar.a(this.node.d);
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        if (this.view == 0) {
            return 0;
        }
        return ((ViewPager) this.view).getCurrentItem();
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

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean invoke(g.c cVar, String str, JSONObject jSONObject, g.d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f67261c", new Object[]{this, cVar, str, jSONObject, dVar})).booleanValue();
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -318476791) {
            if (hashCode != 3417674) {
                if (hashCode == 94756344 && str.equals("close")) {
                    c2 = 2;
                }
            } else if (str.equals("open")) {
                c2 = 1;
            }
        } else if (str.equals("preload")) {
            c2 = 0;
        }
        if (c2 == 0) {
            m();
        } else if (c2 == 1) {
            b(b(jSONObject), a(jSONObject));
        } else if (c2 != 2) {
            z = false;
        } else {
            int b2 = b(jSONObject);
            int currentItem = ((ViewPager) this.view).getCurrentItem();
            if (jSONObject != null && jSONObject.containsKey("position") && ((b2 == 0 && g(this.f19989a) != currentItem) || (b2 == 1 && g(this.l) != currentItem))) {
                ogg.c("Drawer", "close wrong drawer: current:" + currentItem + " position:" + b2);
            }
            c(a(jSONObject));
        }
        return !z ? super.invoke(cVar, str, jSONObject, dVar) : z;
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.getBooleanValue("animated");
    }

    private int b(JSONObject jSONObject) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63b9981a", new Object[]{this, jSONObject})).intValue();
        }
        if (jSONObject != null && (string = jSONObject.getString("position")) != null) {
            return StringUtils.equals(string, "right") ? 1 : 0;
        }
        return 0;
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                    }
                    DrawerComponent drawerComponent = DrawerComponent.this;
                    com.taobao.tao.flexbox.layoutmanager.core.aa b2 = DrawerComponent.b(DrawerComponent.this, DrawerComponent.b(drawerComponent, DrawerComponent.d(drawerComponent)));
                    if (DrawerComponent.e(DrawerComponent.this) && DrawerComponent.f(DrawerComponent.this) != null && b2 != null && !b2.w()) {
                        DrawerComponent.a(DrawerComponent.this, b2, true);
                    }
                    return false;
                }
            });
        }
    }

    /* loaded from: classes8.dex */
    public class a extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private com.taobao.tao.flexbox.layoutmanager.core.aa b;
        private List<FrameLayout> c;

        static {
            kge.a(-1428553584);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 190603819) {
                return new Float(super.getPageWidth(((Number) objArr[0]).intValue()));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v4.view.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view == obj;
        }

        public a() {
        }

        public static /* synthetic */ void a(a aVar, int i, boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e06e7cba", new Object[]{aVar, new Integer(i), new Boolean(z), new Boolean(z2)});
            } else {
                aVar.a(i, z, z2);
            }
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : DrawerComponent.g(DrawerComponent.this).d.size();
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private float b(com.taobao.tao.flexbox.layoutmanager.core.aa r4) {
            /*
                r3 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L1c
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r3
                r2 = 1
                r1[r2] = r4
                java.lang.String r4 = "aca84e01"
                java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
                java.lang.Number r4 = (java.lang.Number) r4
                float r4 = r4.floatValue()
                return r4
            L1c:
                com.taobao.tao.flexbox.layoutmanager.core.r r0 = r4.G()
                if (r0 == 0) goto L2a
                com.taobao.tao.flexbox.layoutmanager.core.r r4 = r4.G()
                int r4 = r4.f20361a
            L28:
                float r4 = (float) r4
                goto L93
            L2a:
                com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent r0 = com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.this
                com.taobao.tao.flexbox.layoutmanager.core.aa r0 = com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.d(r0)
                r1 = 0
                if (r4 != r0) goto L66
                com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent r0 = com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.this
                com.taobao.tao.flexbox.layoutmanager.core.aa r0 = com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.h(r0)
                java.lang.String r2 = "left-drawer-width"
                java.lang.Object r0 = r0.e(r2)
                if (r0 == 0) goto L4d
                com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent r0 = com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.this
                tb.ogl r0 = com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.i(r0)
                com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent$b r0 = (com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.b) r0
                float r0 = r0.i
                goto L89
            L4d:
                com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent r0 = com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.this
                com.taobao.tao.flexbox.layoutmanager.core.aa r0 = com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.j(r0)
                java.lang.String r2 = "drawer-width"
                java.lang.Object r0 = r0.e(r2)
                if (r0 == 0) goto L88
                com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent r0 = com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.this
                tb.ogl r0 = com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.k(r0)
                com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent$b r0 = (com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.b) r0
                float r0 = r0.f
                goto L89
            L66:
                com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent r0 = com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.this
                com.taobao.tao.flexbox.layoutmanager.core.aa r0 = com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.l(r0)
                if (r4 != r0) goto L88
                com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent r0 = com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.this
                com.taobao.tao.flexbox.layoutmanager.core.aa r0 = com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.m(r0)
                java.lang.String r2 = "right-drawer-width"
                java.lang.Object r0 = r0.e(r2)
                if (r0 == 0) goto L88
                com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent r0 = com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.this
                tb.ogl r0 = com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.n(r0)
                com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent$b r0 = (com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.b) r0
                float r0 = r0.j
                goto L89
            L88:
                r0 = 0
            L89:
                int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r1 != 0) goto L92
                int r4 = com.taobao.tao.flexbox.layoutmanager.core.ad.k(r4)
                goto L28
            L92:
                r4 = r0
            L93:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent.a.b(com.taobao.tao.flexbox.layoutmanager.core.aa):float");
        }

        @Override // android.support.v4.view.PagerAdapter
        public float getPageWidth(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b5c622b", new Object[]{this, new Integer(i)})).floatValue();
            }
            DrawerComponent drawerComponent = DrawerComponent.this;
            if (DrawerComponent.b(drawerComponent, DrawerComponent.d(drawerComponent)) == i && DrawerComponent.this.getMeasureResult() != null) {
                return (b(DrawerComponent.d(DrawerComponent.this)) * 1.0f) / DrawerComponent.this.getMeasureResult().f20361a;
            }
            DrawerComponent drawerComponent2 = DrawerComponent.this;
            if (DrawerComponent.b(drawerComponent2, DrawerComponent.l(drawerComponent2)) == i && DrawerComponent.this.getMeasureResult() != null) {
                return (b(DrawerComponent.l(DrawerComponent.this)) * 1.0f) / DrawerComponent.this.getMeasureResult().f20361a;
            }
            return super.getPageWidth(i);
        }

        @Override // android.support.v4.view.PagerAdapter
        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.core.aa b = DrawerComponent.b(DrawerComponent.this, i);
            if (b == null || b == this.b) {
                return;
            }
            a(i, true, true);
            this.b = b;
        }

        @Override // android.support.v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            FrameLayout a2 = a(viewGroup, i);
            if (i == ((ViewPager) DrawerComponent.o(DrawerComponent.this)).getCurrentItem() || DrawerComponent.p(DrawerComponent.this) == i) {
                a(i, true, false);
            }
            return a2;
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
            int i = tag == DrawerComponent.b(DrawerComponent.this, intValue) ? -1 : -2;
            if (i == -1 && this.c.get(intValue) == null) {
                this.c.set(intValue, (FrameLayout) view);
            }
            return i;
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
            String a2 = oec.a((Object) DrawerComponent.c(DrawerComponent.this, aaVar), "");
            String a3 = oec.a(aaVar.e("id"), "");
            ogg.c("Drawer", "destroyItem, pageName:" + a2 + " id:" + a3);
            if (!oeb.a("enableFixDrawerDestroyItemDisappear", true)) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("type", "tab");
            DrawerComponent.a(DrawerComponent.this, aaVar, hashMap);
            DrawerComponent.b(DrawerComponent.this, aaVar, hashMap);
        }

        private void a(int i, boolean z, boolean z2) {
            Map hashMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2621735b", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
                return;
            }
            FrameLayout a2 = a((ViewGroup) DrawerComponent.q(DrawerComponent.this), i);
            com.taobao.tao.flexbox.layoutmanager.core.aa b = DrawerComponent.b(DrawerComponent.this, i);
            if (b == null) {
                return;
            }
            DrawerComponent.a(DrawerComponent.this, b, z);
            if (a2 instanceof ContentContainer) {
                ((ContentContainer) a2).setContentView(b);
            } else {
                ViewGroup viewGroup = (ViewGroup) b.x().getParent();
                if (a2 != viewGroup) {
                    a2.removeAllViews();
                    if (viewGroup != null) {
                        viewGroup.removeView(b.x());
                    }
                    a2.addView(b.x());
                }
            }
            if (b.i() == null && !z2) {
                return;
            }
            if (b.i() != null) {
                hashMap = b.i();
            } else {
                hashMap = new HashMap();
            }
            if (DrawerComponent.r(DrawerComponent.this)) {
                hashMap.put("sourcePage", "tab");
                hashMap.put("type", "tab");
            } else if (!hashMap.containsKey("sourcePage")) {
                hashMap.put("sourcePage", "page");
                hashMap.put("type", "page");
            }
            if (DrawerComponent.r(DrawerComponent.this)) {
                return;
            }
            DrawerComponent.c(DrawerComponent.this, b, hashMap);
            DrawerComponent.d(DrawerComponent.this, b, hashMap);
        }

        public FrameLayout a(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FrameLayout) ipChange.ipc$dispatch("f3213c1d", new Object[]{this, viewGroup, new Integer(i)});
            }
            FrameLayout frameLayout = this.c.get(i);
            if (frameLayout == null) {
                if (DrawerComponent.s(DrawerComponent.this) == DrawerComponent.b(DrawerComponent.this, i)) {
                    frameLayout = new ContentContainer(viewGroup.getContext());
                    ContentContainer contentContainer = (ContentContainer) frameLayout;
                    contentContainer.setMaskLayerColor(((b) DrawerComponent.t(DrawerComponent.this)).g);
                    DrawerComponent.a(DrawerComponent.this, contentContainer);
                } else {
                    frameLayout = new FrameLayout(viewGroup.getContext());
                }
                this.c.set(i, frameLayout);
            }
            if (frameLayout.getParent() != viewGroup) {
                if (frameLayout.getParent() != null) {
                    ((ViewGroup) frameLayout.getParent()).removeView(frameLayout);
                }
                viewGroup.addView(frameLayout);
            }
            frameLayout.setTag(DrawerComponent.u(DrawerComponent.this).d.get(i));
            frameLayout.setTag(R.id.layout_manager_tabbar_position_id, Integer.valueOf(i));
            return frameLayout;
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
                if (list.size() == DrawerComponent.v(DrawerComponent.this).d.size() && !DrawerComponent.w(DrawerComponent.this)) {
                    return;
                }
                notifyDataSetChanged();
                DrawerComponent.a(DrawerComponent.this, false);
            }
        }
    }

    /* loaded from: classes8.dex */
    public class ContentContainer extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private View mContentView;
        private View mObscurationView;
        private float mShowPercent;

        static {
            kge.a(538856379);
        }

        public static /* synthetic */ Object ipc$super(ContentContainer contentContainer, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -1447998406) {
                if (hashCode == -407533570) {
                    return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
                }
                if (hashCode != 2075560917) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }

        public ContentContainer(Context context) {
            super(context);
            this.mObscurationView = new View(context);
            addView(this.mObscurationView, new FrameLayout.LayoutParams(-1, -1));
        }

        public void setContentView(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e44ec2b", new Object[]{this, aaVar});
                return;
            }
            View x = aaVar.x();
            if (x == null) {
                return;
            }
            if (x.getParent() == this) {
                this.mContentView = x;
            } else {
                View view = this.mContentView;
                if (view != null) {
                    removeView(view);
                }
                if (x.getParent() instanceof ViewGroup) {
                    ((ViewGroup) x.getParent()).removeView(x);
                }
                addView(x, 0, new FrameLayout.LayoutParams(-1, -1));
                this.mContentView = x;
            }
            if (aaVar.b(u.class) != null) {
                z = true;
            }
            ((SpeedEdgePanViewPager) DrawerComponent.this.getView()).setDragCrossItemsEnable(!z);
        }

        public void setMaskLayerColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d718dbc", new Object[]{this, new Integer(i)});
                return;
            }
            View view = this.mObscurationView;
            if (view == null) {
                return;
            }
            view.setBackgroundColor(i);
        }

        public void updateShowPercent(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81ab597a", new Object[]{this, new Float(f)});
                return;
            }
            View view = this.mObscurationView;
            if (view != null) {
                view.setAlpha(1.0f - f);
            }
            if (f < 1.0f) {
                setTag(R.id.layout_manager_vp_canscroll_tag, false);
            } else {
                setTag(R.id.layout_manager_vp_canscroll_tag, null);
            }
            this.mShowPercent = f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue() : super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
            }
            if (this.mShowPercent >= 1.0f) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    DrawerComponent.b(DrawerComponent.this, true);
                } else {
                    return super.onTouchEvent(motionEvent);
                }
            }
            return true;
        }
    }

    /* loaded from: classes8.dex */
    public class c implements ViewPager.PageTransformer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1441070183);
            kge.a(941956907);
        }

        private c() {
        }

        @Override // android.support.v4.view.ViewPager.PageTransformer
        public void transformPage(View view, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b6a8f50", new Object[]{this, view, new Float(f)});
            } else if (view != DrawerComponent.x(DrawerComponent.this)) {
            } else {
                if (f > 0.0f) {
                    view.setTranslationX(view.getWidth() * (-f) * (1.0f - b.a((b) DrawerComponent.y(DrawerComponent.this))));
                } else if (f >= 0.0f) {
                } else {
                    view.setTranslationX(view.getWidth() * (-f) * (1.0f - b.b((b) DrawerComponent.z(DrawerComponent.this))));
                }
            }
        }
    }
}
