package com.alibaba.triver.triver_shop.newShop.view.embed;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.e;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.alibaba.triver.triver_shop.newShop.view.SwipeBigCardWrapLayout;
import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.alibaba.triver.triver_shop.newShop.view.provider.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.taobao.R;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.cej;
import tb.cek;
import tb.cel;
import tb.kge;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class c implements ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a FrameType;
    public static final String IMMERSE_TYPE = "immerseType";
    public static final String LIVE_TYPE = "liveType";
    public static final String SECOND_MARKET = "secondMarketing";
    public static final String SECOND_VIDEO = "secondVideo";

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f3970a;
    public EnhancedViewPager b;
    public d c;
    public e d;
    public FragmentActivity e;
    public EmbedShopLoftComponent f;
    public com.alibaba.triver.triver_shop.newShop.view.embed.a g;
    private ruk<Boolean> h;
    private ruk<t> i;
    private rul<? super String, t> j;

    static {
        kge.a(1081679848);
        kge.a(1848919473);
        FrameType = new a(null);
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(1348768875);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }

    public final FrameLayout a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this});
        }
        FrameLayout frameLayout = this.f3970a;
        if (frameLayout != null) {
            return frameLayout;
        }
        q.b("rootLayout");
        throw null;
    }

    public final void a(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
            return;
        }
        q.d(frameLayout, "<set-?>");
        this.f3970a = frameLayout;
    }

    public final void a(EnhancedViewPager enhancedViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ecb663b", new Object[]{this, enhancedViewPager});
            return;
        }
        q.d(enhancedViewPager, "<set-?>");
        this.b = enhancedViewPager;
    }

    public final EnhancedViewPager b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnhancedViewPager) ipChange.ipc$dispatch("5bb69320", new Object[]{this});
        }
        EnhancedViewPager enhancedViewPager = this.b;
        if (enhancedViewPager != null) {
            return enhancedViewPager;
        }
        q.b(OrderConfigs.VIEWPAGER);
        throw null;
    }

    public final void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8442f9", new Object[]{this, dVar});
            return;
        }
        q.d(dVar, "<set-?>");
        this.c = dVar;
    }

    public final d c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("92127fb", new Object[]{this});
        }
        d dVar = this.c;
        if (dVar != null) {
            return dVar;
        }
        q.b("shopData");
        throw null;
    }

    public final void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a54f35a1", new Object[]{this, eVar});
            return;
        }
        q.d(eVar, "<set-?>");
        this.d = eVar;
    }

    public final void a(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831e55bb", new Object[]{this, fragmentActivity});
            return;
        }
        q.d(fragmentActivity, "<set-?>");
        this.e = fragmentActivity;
    }

    public final FragmentActivity d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("5b432cfe", new Object[]{this});
        }
        FragmentActivity fragmentActivity = this.e;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        q.b("fragmentActivity");
        throw null;
    }

    public final void a(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8fdb35b", new Object[]{this, embedShopLoftComponent});
            return;
        }
        q.d(embedShopLoftComponent, "<set-?>");
        this.f = embedShopLoftComponent;
    }

    public final EmbedShopLoftComponent e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmbedShopLoftComponent) ipChange.ipc$dispatch("1092f41d", new Object[]{this});
        }
        EmbedShopLoftComponent embedShopLoftComponent = this.f;
        if (embedShopLoftComponent != null) {
            return embedShopLoftComponent;
        }
        q.b("embedShopLoftComponent");
        throw null;
    }

    public final void a(com.alibaba.triver.triver_shop.newShop.view.embed.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5c7db7", new Object[]{this, aVar});
            return;
        }
        q.d(aVar, "<set-?>");
        this.g = aVar;
    }

    public final com.alibaba.triver.triver_shop.newShop.view.embed.a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.newShop.view.embed.a) ipChange.ipc$dispatch("ff5e1dfc", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.view.embed.a aVar = this.g;
        if (aVar != null) {
            return aVar;
        }
        q.b("indicatorComponent");
        throw null;
    }

    public final void a(ruk<Boolean> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbfc750", new Object[]{this, rukVar});
        } else {
            this.h = rukVar;
        }
    }

    public final ruk<Boolean> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("3d341bd0", new Object[]{this}) : this.h;
    }

    public final void b(ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec42cdd1", new Object[]{this, rukVar});
        } else {
            this.i = rukVar;
        }
    }

    public final ruk<t> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("44e5c12f", new Object[]{this}) : this.i;
    }

    public final void a(rul<? super String, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc03baf", new Object[]{this, rulVar});
        } else {
            this.j = rulVar;
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        rul<? super String, t> rulVar = this.j;
        if (rulVar == null) {
            return;
        }
        rulVar.mo2421invoke("NShop.Event.IndexCardAppear");
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        rul<? super String, t> rulVar = this.j;
        if (rulVar == null) {
            return;
        }
        rulVar.mo2421invoke("NShop.Event.IndexCardDisappear");
    }

    public final void a(d shopData, e shopDXEngine, FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4679def1", new Object[]{this, shopData, shopDXEngine, fragmentActivity});
            return;
        }
        q.d(shopData, "shopData");
        q.d(shopDXEngine, "shopDXEngine");
        q.d(fragmentActivity, "fragmentActivity");
        a(shopData);
        a(fragmentActivity);
        a(shopDXEngine);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        a(new SwipeBigCardWrapLayout(fragmentActivity2));
        View a2 = com.alibaba.triver.triver_shop.newShop.ext.o.a(fragmentActivity2, R.layout.view_empty_supoort_no_scroll_view_pager);
        if (a2 != null) {
            a((EnhancedViewPager) a2);
            com.alibaba.triver.triver_shop.newShop.ext.o.a(a(), b());
            b().setOffscreenPageLimit(2);
            b().addOnPageChangeListener(this);
            a(new EmbedShopLoftComponent(fragmentActivity, shopData, shopDXEngine));
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new SwipeBigCardComponent$init$1(this, fragmentActivity));
            a(new com.alibaba.triver.triver_shop.newShop.view.embed.a(shopData, this));
            LinearLayout b = f().b();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            b.setLayoutParams(layoutParams);
            LinearLayout linearLayout = b;
            com.alibaba.triver.triver_shop.newShop.ext.o.d(linearLayout, cek.Companion.a() + ((shopData.aI() || shopData.aH()) ? com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 45) : 0));
            com.alibaba.triver.triver_shop.newShop.ext.o.e(linearLayout, com.alibaba.triver.triver_shop.newShop.ext.o.a(Double.valueOf(18.5d)));
            com.alibaba.triver.triver_shop.newShop.ext.o.f(linearLayout, com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 126));
            View c = f().c();
            if (c == null) {
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, com.alibaba.triver.triver_shop.newShop.ext.o.a(Double.valueOf(16.5d)));
            layoutParams2.gravity = 8388693;
            c.setLayoutParams(layoutParams2);
            int a3 = cek.Companion.a();
            if (shopData.aI() || shopData.aH()) {
                i = com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 45) - com.alibaba.triver.triver_shop.newShop.ext.o.a(Double.valueOf(8.25d));
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.d(c, a3 + i);
            com.alibaba.triver.triver_shop.newShop.ext.o.f(c, com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 12));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager");
    }

    public final boolean k() {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        JSONArray aT = c().aT();
        String str = null;
        if (aT != null && (b = com.alibaba.triver.triver_shop.newShop.ext.d.b(aT, 0)) != null) {
            str = b.getString("type");
        }
        return q.a((Object) str, (Object) LIVE_TYPE);
    }

    private final int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue();
        }
        JSONArray aT = c().aT();
        int size = aT == null ? 0 : aT.size();
        if (size == 1) {
            return 1;
        }
        if (size <= 1) {
            return 0;
        }
        return k() ? 2 : 1;
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        if (i != 0) {
            c(0);
            b(i);
        } else {
            if (l() > 1) {
                c(1);
            }
            b(0);
        }
        f().a(i);
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!f().a()) {
            f().a(i);
        } else if (i == -1) {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new SwipeBigCardComponent$updateIndexFromWeb$1(this));
        } else {
            f().a(i + 1);
        }
    }

    private final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        PagerAdapter adapter = b().getAdapter();
        if (adapter == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.newShop.view.adapter.ShopContainerPageAdapter");
        }
        cel fragmentViewProvider = ((ShopStandardFragment) ((cej) adapter).getItem(i)).getFragmentViewProvider();
        if (fragmentViewProvider == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.newShop.view.provider.SwipeBigCardFragmentViewProvider");
        }
        ((g) fragmentViewProvider).e();
    }

    private final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        PagerAdapter adapter = b().getAdapter();
        if (adapter == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.newShop.view.adapter.ShopContainerPageAdapter");
        }
        cel fragmentViewProvider = ((ShopStandardFragment) ((cej) adapter).getItem(i)).getFragmentViewProvider();
        if (fragmentViewProvider == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.newShop.view.provider.SwipeBigCardFragmentViewProvider");
        }
        ((g) fragmentViewProvider).f();
    }
}
