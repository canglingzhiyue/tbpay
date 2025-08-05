package com.taobao.android.icart.theme;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.icart.widget.CartRecyclerView;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.android.tbtheme.kit.g;
import com.taobao.android.tbtheme.kit.j;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.ptr.PtrBase;
import com.taobao.ptr.PullBase;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.abj;
import tb.bbz;
import tb.bcb;
import tb.bdx;
import tb.bek;
import tb.bew;
import tb.bpl;
import tb.dcn;
import tb.gbg;
import tb.gnx;
import tb.jnv;
import tb.jny;
import tb.kge;

/* loaded from: classes5.dex */
public class CartThemeManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Boolean A;
    private boolean B;
    private int C;

    /* renamed from: a  reason: collision with root package name */
    private final Context f12856a;
    private final PtrBase b;
    private final ViewGroup c;
    private boolean d;
    private final bbz e;
    private final CartRecyclerView f;
    private ThemeFrameLayout g;
    private ViewGroup h;
    private View i;
    private ThemeBroadcastReceiver j;
    private int k;
    private int l;
    private int m;
    private int n;
    private FrameLayout p;
    private int q;
    private int r = 4;
    private int s;
    private ViewGroup t;
    private g u;
    private LinearLayout v;
    private View w;
    private View x;
    private ThemeFrameLayout y;
    private int z;

    static {
        kge.a(-1675317597);
    }

    public static /* synthetic */ int a(CartThemeManager cartThemeManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e912ce0", new Object[]{cartThemeManager, new Integer(i)})).intValue();
        }
        cartThemeManager.z = i;
        return i;
    }

    public static /* synthetic */ Context a(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("69281dce", new Object[]{cartThemeManager}) : cartThemeManager.f12856a;
    }

    public static /* synthetic */ void a(CartThemeManager cartThemeManager, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e9121aa", new Object[]{cartThemeManager, new Float(f)});
        } else {
            cartThemeManager.a(f);
        }
    }

    public static /* synthetic */ int b(CartThemeManager cartThemeManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7e58221", new Object[]{cartThemeManager, new Integer(i)})).intValue();
        }
        cartThemeManager.C = i;
        return i;
    }

    public static /* synthetic */ boolean b(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("26f6df79", new Object[]{cartThemeManager})).booleanValue() : cartThemeManager.t();
    }

    public static /* synthetic */ int c(CartThemeManager cartThemeManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e139d762", new Object[]{cartThemeManager, new Integer(i)})).intValue();
        }
        cartThemeManager.l = i;
        return i;
    }

    public static /* synthetic */ ViewGroup c(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("cfb82581", new Object[]{cartThemeManager}) : cartThemeManager.h;
    }

    public static /* synthetic */ int d(CartThemeManager cartThemeManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8e2ca3", new Object[]{cartThemeManager, new Integer(i)})).intValue();
        }
        cartThemeManager.k = i;
        return i;
    }

    public static /* synthetic */ void d(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2ddcb3", new Object[]{cartThemeManager});
        } else {
            cartThemeManager.p();
        }
    }

    public static /* synthetic */ int e(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("75495b45", new Object[]{cartThemeManager})).intValue() : cartThemeManager.l;
    }

    public static /* synthetic */ void e(CartThemeManager cartThemeManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33e281f1", new Object[]{cartThemeManager, new Integer(i)});
        } else {
            cartThemeManager.a(i);
        }
    }

    public static /* synthetic */ void f(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64d9f1", new Object[]{cartThemeManager});
        } else {
            cartThemeManager.n();
        }
    }

    public static /* synthetic */ int g(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9805883", new Object[]{cartThemeManager})).intValue() : cartThemeManager.o();
    }

    public static /* synthetic */ void h(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39bd72f", new Object[]{cartThemeManager});
        } else {
            cartThemeManager.q();
        }
    }

    public static /* synthetic */ View i(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("38055690", new Object[]{cartThemeManager}) : cartThemeManager.i;
    }

    public static /* synthetic */ int j(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f7d2d460", new Object[]{cartThemeManager})).intValue() : cartThemeManager.k;
    }

    public static /* synthetic */ void k(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ee530c", new Object[]{cartThemeManager});
        } else {
            cartThemeManager.e();
        }
    }

    public static /* synthetic */ CartRecyclerView l(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CartRecyclerView) ipChange.ipc$dispatch("a03da324", new Object[]{cartThemeManager}) : cartThemeManager.f;
    }

    public static /* synthetic */ ThemeFrameLayout m(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThemeFrameLayout) ipChange.ipc$dispatch("b80478cd", new Object[]{cartThemeManager}) : cartThemeManager.g;
    }

    public static /* synthetic */ bbz n(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("2953aa83", new Object[]{cartThemeManager}) : cartThemeManager.e;
    }

    public CartThemeManager(bbz bbzVar) {
        this.e = bbzVar;
        this.c = bbzVar.x().c();
        this.f12856a = bbzVar.m();
        this.b = (PtrBase) this.c.findViewById(R.id.cart_refresh);
        this.i = new FrameLayout(this.f12856a);
        this.f = (CartRecyclerView) bbzVar.x().s();
        f();
        d();
        m();
        h();
        this.h = (ViewGroup) this.c.findViewById(R.id.cart_top_bg_container);
        this.b.mo1212getStartLayout().setPullBackground(new ColorDrawable(0));
        this.t = (ViewGroup) this.c.findViewById(R.id.cart_container);
        this.t.setClipChildren(false);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.B) {
        } else {
            g();
            b();
            this.B = true;
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.j = new ThemeBroadcastReceiver(this);
        LocalBroadcastManager.getInstance(this.f12856a).registerReceiver(this.j, new IntentFilter(j.ACTION_THEME_CHANGE));
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        final ViewGroup t = this.e.x().t();
        t.post(new Runnable() { // from class: com.taobao.android.icart.theme.CartThemeManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                DXWidgetNode flattenWidgetNode;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int i = 0;
                for (int i2 = 0; i2 < t.getChildCount(); i2++) {
                    View childAt = t.getChildAt(i2);
                    if (childAt instanceof DXRootView) {
                        DXRootView dXRootView = (DXRootView) childAt;
                        JSONObject data = dXRootView.getData();
                        boolean z = data != null && "hidden".equals(data.getString("status"));
                        if (dXRootView.getVisibility() != 8 && !z && (flattenWidgetNode = dXRootView.getFlattenWidgetNode()) != null) {
                            int measuredHeight = flattenWidgetNode.getMeasuredHeight();
                            i += measuredHeight;
                            if (data != null && "header".equals(data.getString("tag"))) {
                                CartThemeManager.a(CartThemeManager.this, measuredHeight);
                            }
                            if (data != null && "tabCard".equals(data.getString("tag"))) {
                                CartThemeManager.b(CartThemeManager.this, measuredHeight);
                            }
                        }
                    }
                }
                int statusBarHeight = SystemBarDecorator.SystemBarConfig.getStatusBarHeight(CartThemeManager.a(CartThemeManager.this));
                int i3 = i + statusBarHeight;
                UnifyLog.d("CartThemeManager", "actionBarHeight=" + i3 + ",statusBarHeight=" + statusBarHeight);
                CartThemeManager.c(CartThemeManager.this, i3);
                if (!CartThemeManager.b(CartThemeManager.this)) {
                    ViewGroup.LayoutParams layoutParams = CartThemeManager.c(CartThemeManager.this).getLayoutParams();
                    if (layoutParams.height != CartThemeManager.e(CartThemeManager.this)) {
                        layoutParams.height = CartThemeManager.e(CartThemeManager.this);
                        CartThemeManager.c(CartThemeManager.this).requestLayout();
                        CartThemeManager.d(CartThemeManager.this);
                    }
                }
                CartThemeManager.h(CartThemeManager.this);
            }
        });
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        bew.a().a(this.f12856a);
        this.d = bew.a().b();
        bdx.a("CartThemeManager", "skin", "useNewSkin", this.d + "");
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            SystemBarDecorator systemBarDecorator = new SystemBarDecorator((Activity) this.f12856a);
            Map<String, String> j = FestivalMgr.a().j();
            String str = j.get("navStyle");
            if (TextUtils.equals(j.get("isFestivalOn"), "1")) {
                if (!TextUtils.equals(str, "0") && !TextUtils.equals(str, "1")) {
                    if (TextUtils.equals(str, "2")) {
                        systemBarDecorator.enableImmersiveStatusBar(true);
                    }
                }
                systemBarDecorator.enableImmersiveStatusBar(false);
            } else if (this.d) {
                systemBarDecorator.enableImmersiveStatusBar(true);
            }
        } catch (Throwable unused) {
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.e.G().b(new a());
        this.u = new g("cart", bpl.b(this.f12856a));
        int j = j();
        g gVar = this.u;
        gVar.d = j;
        gVar.h = bpl.b(this.f12856a) - j;
        this.u.g = this.c.getResources().getColor(R.color.icart_background);
        g gVar2 = this.u;
        gVar2.f = true;
        gVar2.i = true;
        gVar2.j = this.e.x().a(50.0f);
    }

    private int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        int i = this.l;
        return i != 0 ? i : this.e.x().a(41.5f) + SystemBarDecorator.getStatusBarHeight(this.f12856a);
    }

    private int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        int i = this.m;
        return i != 0 ? i : this.e.x().a(125.0f) + SystemBarDecorator.getStatusBarHeight(this.f12856a);
    }

    private int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.e.x().a(130.0f);
    }

    private int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue();
        }
        int i = this.n;
        if (i == 0) {
            i = this.e.x().a(30.0f);
        }
        return i() + i;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.t.findViewWithTag("newThemeBg") == null) {
            this.g = j.a().a(this.f12856a, this.u);
            ThemeFrameLayout themeFrameLayout = this.g;
            if (themeFrameLayout != null) {
                themeFrameLayout.setTag("newThemeBg");
                this.t.addView(this.g, 0, new FrameLayout.LayoutParams(-1, bpl.b(this.f12856a) - SystemBarDecorator.getStatusBarHeight(this.f12856a)));
                if (this.e.v().i() && !this.e.v().k() && !QueryParamsManager.CartFeedFlowType.search.equals(this.e.v().w())) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, k());
                    layoutParams.topMargin = l();
                    this.i.setLayoutParams(layoutParams);
                    this.i.setBackgroundResource(R.drawable.icart_gradual_theme_bg);
                    this.i.setTag("gradualThemeBgView");
                    this.t.addView(this.i, 1, layoutParams);
                }
            }
        }
        if (this.h.findViewWithTag("actionBarBg") != null) {
            return;
        }
        int i = i();
        FrameLayout.LayoutParams layoutParams2 = this.h.getLayoutParams() instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) this.h.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.height = i;
            this.h.setLayoutParams(layoutParams2);
        }
        g gVar = new g("cart", i);
        gVar.b = 1;
        ThemeFrameLayout a2 = j.a().a(this.c.getContext(), gVar);
        if (a2 == null) {
            UnifyLog.d("CartThemeManager", "actionBarThemeView is null");
        } else {
            a2.setTag("actionBarBg");
            this.h.addView(a2, 0, new FrameLayout.LayoutParams(-1, -1));
        }
        this.h.setVisibility(8);
    }

    private void p() {
        DXRootView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (t()) {
        } else {
            if (t()) {
                a2 = bek.a(this.e.x().t(), "tabCard");
            } else {
                a2 = bek.a(this.f, "iCartTabCard");
                if (a2 == null) {
                    a2 = bek.a(this.f, "tabCard");
                }
            }
            if (a2 == null) {
                return;
            }
            this.n = a2.getMeasuredHeight();
            this.m = i() + this.n;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = l();
                marginLayoutParams.height = k();
                this.i.setLayoutParams(marginLayoutParams);
                this.i.requestLayout();
            }
            if (!dcn.a() || this.g == null) {
                return;
            }
            int j = j();
            this.g.updateImageHeight(j);
            this.g.updateCoverHeight(bpl.b(this.f12856a) - j);
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.f.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.icart.theme.CartThemeManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                } else if (i != 0) {
                } else {
                    CartThemeManager.f(CartThemeManager.this);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                } else {
                    CartThemeManager.f(CartThemeManager.this);
                }
            }
        });
        this.f.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.taobao.android.icart.theme.CartThemeManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                } else if (CartThemeManager.b(CartThemeManager.this)) {
                } else {
                    int g = CartThemeManager.g(CartThemeManager.this);
                    if (CartThemeManager.i(CartThemeManager.this) == null || g != 0 || CartThemeManager.j(CartThemeManager.this) != 0) {
                        return;
                    }
                    CartThemeManager.a(CartThemeManager.this, 0.0f);
                }
            }
        });
        this.e.n().a(new bcb.a() { // from class: com.taobao.android.icart.theme.CartThemeManager.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bcb.a
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    return;
                }
                if (CartThemeManager.b(CartThemeManager.this)) {
                    CartThemeManager.k(CartThemeManager.this);
                } else {
                    CartThemeManager.this.a(z);
                    CartThemeManager.l(CartThemeManager.this).post(new Runnable() { // from class: com.taobao.android.icart.theme.CartThemeManager.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                CartThemeManager.d(CartThemeManager.this);
                            }
                        }
                    });
                }
                gnx.a(z);
            }
        });
        this.b.addOnScrollListener(new PullBase.a() { // from class: com.taobao.android.icart.theme.CartThemeManager.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.ptr.PullBase.a
            public void a(PullBase pullBase, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6c44a54", new Object[]{this, pullBase, new Integer(i)});
                    return;
                }
                CartThemeManager.d(CartThemeManager.this, i);
                if (CartThemeManager.b(CartThemeManager.this) || CartThemeManager.g(CartThemeManager.this) >= gbg.a(CartThemeManager.a(CartThemeManager.this), 200.0f) || i > 0 || CartThemeManager.m(CartThemeManager.this) == null) {
                    return;
                }
                CartThemeManager.e(CartThemeManager.this, i);
                CartThemeManager.a(CartThemeManager.this, -i);
            }
        });
        this.e.n().a(new jnv() { // from class: com.taobao.android.icart.theme.CartThemeManager.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                }
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                } else {
                    CartThemeManager.l(CartThemeManager.this).post(new Runnable() { // from class: com.taobao.android.icart.theme.CartThemeManager.6.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            CartThemeManager.d(CartThemeManager.this);
                            CartThemeManager.k(CartThemeManager.this);
                        }
                    });
                }
            }
        });
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        Boolean bool = this.A;
        if (bool != null && bool.booleanValue() == t()) {
            return;
        }
        boolean t = t();
        if (t) {
            s();
        } else {
            r();
        }
        c();
        this.A = Boolean.valueOf(t);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ThemeData themeData = new ThemeData();
        themeData.skinColor = "#FFFFFF";
        themeData.skinPic = "";
        themeData.actionBarBackgroundColor = "#FFFFFF";
        themeData.actionBarBackgroundImage = "";
        themeData.themeLevel = "1";
        j.a().a("cart", themeData);
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        a();
        j.a().a("cart");
        n();
        View view = this.i;
        if (view != null) {
            view.setVisibility(0);
        }
        FrameLayout frameLayout = this.p;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        ThemeFrameLayout themeFrameLayout = this.g;
        if (themeFrameLayout == null) {
            return;
        }
        themeFrameLayout.setVisibility(0);
    }

    @Deprecated
    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        ThemeFrameLayout themeFrameLayout = this.g;
        if (themeFrameLayout != null) {
            themeFrameLayout.setVisibility(8);
        }
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        int statusBarHeight = SystemBarDecorator.getStatusBarHeight(this.f12856a) + this.z;
        if (this.p == null) {
            this.p = (FrameLayout) this.c.findViewById(R.id.cart_theme_container_v2);
            g gVar = new g("cart", bpl.b(this.f12856a));
            gVar.d = statusBarHeight;
            gVar.h = bpl.b(this.f12856a) - statusBarHeight;
            gVar.g = this.c.getResources().getColor(R.color.icart_background);
            gVar.f = false;
            gVar.i = false;
            gVar.j = 0;
            this.y = j.a().a(this.f12856a, gVar);
            this.p.addView(this.y, 0, new FrameLayout.LayoutParams(-1, statusBarHeight));
            this.v = new LinearLayout(this.f12856a);
            this.v.setOrientation(1);
            this.v.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            View view = new View(this.f12856a);
            view.setBackgroundResource(R.drawable.icart_gradual_theme_bg_v2_1);
            View view2 = new View(this.f12856a);
            view2.setBackgroundResource(R.drawable.icart_gradual_theme_bg_v2_2);
            this.w = view;
            this.x = view2;
            this.v.addView(view);
            this.v.addView(view2);
            this.p.addView(this.v, 1);
        }
        this.p.setVisibility(0);
        this.w.setLayoutParams(new LinearLayout.LayoutParams(-1, statusBarHeight));
        this.x.setVisibility(0);
        this.x.setLayoutParams(new LinearLayout.LayoutParams(-1, this.C + gbg.a(this.f12856a, 100.0f)));
        ThemeFrameLayout themeFrameLayout2 = this.y;
        if (themeFrameLayout2 != null) {
            if (themeFrameLayout2.getLayoutParams() != null) {
                this.y.getLayoutParams().height = statusBarHeight;
            }
            this.y.updateImageHeight(statusBarHeight);
            this.y.updateCoverHeight(bpl.b(this.f12856a) - statusBarHeight);
        }
        ViewGroup viewGroup2 = this.h;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        View view3 = this.i;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(8);
    }

    private boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.e.n().o().o();
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (t()) {
        } else {
            int o = o();
            if (this.i != null) {
                a(-o);
            }
            if (this.g != null) {
                a(o);
            }
            b(o);
        }
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else if (this.i == null || t()) {
        } else {
            this.i.setTranslationY(f);
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        ThemeFrameLayout themeFrameLayout = this.g;
        if (themeFrameLayout == null || this.q == i) {
            return;
        }
        this.q = i;
        themeFrameLayout.setOnScrollY(i);
    }

    private int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue();
        }
        int findFirstVisibleItemPosition = ((LinearLayoutManager) this.f.getLayoutManager()).findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition > this.r && this.s >= gbg.a(this.f12856a, 200.0f)) {
            return this.s;
        }
        this.r = findFirstVisibleItemPosition;
        this.s = this.e.x().a(this.r);
        return this.s;
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (this.h == null) {
        } else {
            if (Math.abs(i) >= k() - i() && !t()) {
                this.h.setVisibility(0);
            } else {
                this.h.setVisibility(8);
            }
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (t()) {
        } else {
            View view = this.i;
            if (z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* loaded from: classes5.dex */
    public static class ThemeBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<CartThemeManager> f12865a;

        static {
            kge.a(-880566712);
        }

        public ThemeBroadcastReceiver(CartThemeManager cartThemeManager) {
            this.f12865a = new WeakReference<>(cartThemeManager);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CartThemeManager cartThemeManager;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!TextUtils.equals(j.ACTION_THEME_CHANGE, intent.getAction()) || (cartThemeManager = this.f12865a.get()) == null || CartThemeManager.n(cartThemeManager).u() == null) {
            } else {
                bew.a().a(context);
                try {
                    CartThemeManager.n(cartThemeManager).x().n();
                } catch (Exception e) {
                    abj.a("themeRefreshError", e);
                }
                UnifyLog.c("CartThemeManager", "change theme refresh screen");
            }
        }
    }
}
