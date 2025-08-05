package com.alibaba.triver.triver_shop.newShop.view.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.a5;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.alibaba.triver.triver_shop.newShop.ext.k;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.alibaba.triver.triver_shop.newShop.ext.n;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.MarginSupportFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionLinearLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionSizeFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.alibaba.triver.triver_shop.newShop.view.provider.i;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.alibaba.triver.triver_shop.shop2023.nativeview.h;
import com.alibaba.triver.triver_shop.shop2023.template.OverseaShopHeaderInfoTemplate;
import com.alibaba.triver.triver_shop.shop2023.template.j;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.cej;
import tb.cek;
import tb.kge;
import tb.rvb;

/* loaded from: classes3.dex */
public final class e extends com.alibaba.triver.triver_shop.newShop.view.component.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean A;
    private OverseaShopHeaderInfoTemplate C;
    private EmbedShopLoftComponent D;
    private j H;
    private int J;
    private EnhancedViewPager f;
    private ShopSwipeListenerLayout g;
    private View h;
    private ShopSwipeListenerLayout i;
    private ViewGroup j;
    private PerceptionSizeFrameLayout k;
    private ViewGroup l;
    private PerceptionLinearLayout m;
    private View n;
    private View o;
    private cej p;
    private TUrlImageView q;
    private View r;
    private TUrlImageView s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private int y;
    private boolean z = true;
    private boolean B = true;
    private final int E = o.c(Integer.valueOf((int) g.KEY_FLAG_SHIP_BIG_CARD_SIZE_RPX));
    private final int F = o.c(Integer.valueOf((int) g.KEY_FLAG_SHIP_SUPER_BIG_CARD_SIZE_RPX));
    private final int G = o.c((Number) 750);
    private final h I = new h(0, 1, null);
    private final com.alibaba.triver.triver_shop.shop2023.data.f K = new com.alibaba.triver.triver_shop.shop2023.data.f(0);

    /* loaded from: classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUrlImageView f3942a;
        public final /* synthetic */ e b;

        public b(TUrlImageView tUrlImageView, e eVar) {
            this.f3942a = tUrlImageView;
            this.b = eVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            Context context = this.f3942a.getContext();
            q.b(context, "context");
            l.a(context, this.b.b().c());
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3943a;
        public final /* synthetic */ e b;

        public c(int i, e eVar) {
            this.f3943a = i;
            this.b = eVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            float floatValue = ((Float) animatedValue).floatValue();
            if (this.f3943a > 0) {
                e.g(this.b).a(-((int) floatValue));
            } else {
                e.g(this.b).a(this.f3943a - ((int) floatValue));
            }
            e.g(this.b).b();
        }
    }

    static {
        kge.a(1335876694);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1253755420:
                super.onSwipeDown();
                return null;
            case -1159257535:
                super.l(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1047811585:
                super.a((FragmentActivity) objArr[0], (com.alibaba.triver.triver_shop.newShop.data.d) objArr[1], (com.alibaba.triver.triver_shop.newShop.ext.e) objArr[2]);
                return null;
            case -283539996:
                super.a((View) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            case 407727923:
                super.onPageSelected(((Number) objArr[0]).intValue());
                return null;
            case 849650597:
                super.b((View) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            case 1176808989:
                super.onSwipeUp();
                return null;
            case 1703005214:
                super.onPageScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static final /* synthetic */ void a(e eVar, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db009f25", new Object[]{eVar, aVar, layoutParams});
        } else {
            eVar.a(aVar, layoutParams);
        }
    }

    public static final /* synthetic */ ShopSwipeListenerLayout e(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopSwipeListenerLayout) ipChange.ipc$dispatch("9a6a0fc3", new Object[]{eVar}) : eVar.g;
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.shop2023.data.f g(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.shop2023.data.f) ipChange.ipc$dispatch("21da72c9", new Object[]{eVar}) : eVar.K;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void a(FragmentActivity context, com.alibaba.triver.triver_shop.newShop.data.d shopData, com.alibaba.triver.triver_shop.newShop.ext.e shopDXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18ba9ff", new Object[]{this, context, shopData, shopDXEngine});
            return;
        }
        q.d(context, "context");
        q.d(shopData, "shopData");
        q.d(shopDXEngine, "shopDXEngine");
        context.getLifecycle().addObserver(I());
        super.a(context, shopData, shopDXEngine);
        o.f(Integer.valueOf(m()));
        shopData.a(SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR);
        l.a((Activity) context, true);
        U();
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            q.b("bigCardContainer");
            throw null;
        }
        o.a(viewGroup, G());
        S();
        T();
    }

    private final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
            return;
        }
        Map<String, ShopComponentModel> g = b().bc().g();
        q.a(g);
        ShopComponentModel shopComponentModel = g.get("tb_shop_multilingual_header_info");
        View view = null;
        if (shopComponentModel != null) {
            this.C = new OverseaShopHeaderInfoTemplate(shopComponentModel, new OverseaShop$initTemplateComponent$1$1(this));
            com.alibaba.triver.triver_shop.newShop.view.component.a.a(this, this.C, (String) null, 2, (Object) null);
            OverseaShopHeaderInfoTemplate overseaShopHeaderInfoTemplate = this.C;
            if (overseaShopHeaderInfoTemplate != null) {
                overseaShopHeaderInfoTemplate.a(new OverseaShop$initTemplateComponent$1$2(this));
            }
            OverseaShopHeaderInfoTemplate overseaShopHeaderInfoTemplate2 = this.C;
            q.a(overseaShopHeaderInfoTemplate2);
            overseaShopHeaderInfoTemplate2.a(a(), b(), c(), null);
            PerceptionLinearLayout perceptionLinearLayout = this.m;
            if (perceptionLinearLayout == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            OverseaShopHeaderInfoTemplate overseaShopHeaderInfoTemplate3 = this.C;
            q.a(overseaShopHeaderInfoTemplate3);
            perceptionLinearLayout.addView(overseaShopHeaderInfoTemplate3.f());
        }
        ShopComponentModel shopComponentModel2 = g.get("tb_shop_multilingual_header_endorse");
        if (shopComponentModel2 == null) {
            a((com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a) null, (ViewGroup.LayoutParams) null);
            return;
        }
        this.H = new j(shopComponentModel2);
        com.alibaba.triver.triver_shop.newShop.view.component.a.a(this, this.H, (String) null, 2, (Object) null);
        j jVar = this.H;
        if (jVar != null) {
            jVar.a(new OverseaShop$initTemplateComponent$2$1(this));
        }
        j jVar2 = this.H;
        if (jVar2 != null) {
            jVar2.a(a(), b(), c(), null);
        }
        PerceptionLinearLayout perceptionLinearLayout2 = this.m;
        if (perceptionLinearLayout2 == null) {
            q.b("shopHeaderContainer");
            throw null;
        }
        j jVar3 = this.H;
        if (jVar3 != null) {
            view = jVar3.f();
        }
        perceptionLinearLayout2.addView(view);
    }

    private final void a(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50fe2fe", new Object[]{this, aVar, layoutParams});
            return;
        }
        if (aVar instanceof OverseaShopHeaderInfoTemplate) {
            this.v = ((OverseaShopHeaderInfoTemplate) aVar).j().height;
        }
        if (aVar instanceof j) {
            this.x = ((j) aVar).j().height;
        }
        this.J++;
        if (this.J < 2) {
            return;
        }
        if (this.x != 0) {
            z = true;
        }
        g(z);
        F();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void F() {
        int i;
        int m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        ceg.Companion.b("allTemplateLoadFinish");
        if (u()) {
            i = this.v + m();
            m = this.x;
        } else {
            i = this.v;
            m = m();
        }
        int i2 = i + m;
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
        if (perceptionSizeFrameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        o.c(perceptionSizeFrameLayout, i2);
        this.y = this.v + m();
        com.alibaba.triver.triver_shop.newShop.data.d b2 = b();
        int i3 = this.w;
        ViewGroup viewGroup = this.j;
        if (viewGroup == null) {
            q.b("tabBarContainer");
            throw null;
        }
        b2.a(o.f(Integer.valueOf(i3 + o.i(viewGroup))));
        cej cejVar = this.p;
        if (cejVar == null) {
            q.b("shopContainerPageAdapter");
            throw null;
        }
        cejVar.a(0);
        onPageSelected(0);
        y();
        this.I.a(b().bn(), d());
    }

    private final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53adb", new Object[]{this});
            return;
        }
        if (!q()) {
            View view = this.h;
            if (view == null) {
                q.b(a5.f3362a);
                throw null;
            }
            o.g(view);
        }
        ViewGroup viewGroup = this.j;
        if (viewGroup == null) {
            q.b("tabBarContainer");
            throw null;
        }
        o.a(viewGroup, cek.Companion.m());
        if (Build.VERSION.SDK_INT >= 21) {
            ViewGroup viewGroup2 = this.j;
            if (viewGroup2 == null) {
                q.b("tabBarContainer");
                throw null;
            }
            viewGroup2.setElevation(o.a((Number) 30));
        }
        if (q()) {
            View view2 = this.n;
            if (view2 == null) {
                q.b("bigCardTopBlackShadowBg");
                throw null;
            }
            o.a(view2, cek.a.C1097a.INSTANCE.a());
            View view3 = this.n;
            if (view3 == null) {
                q.b("bigCardTopBlackShadowBg");
                throw null;
            }
            o.a(view3, o.c((Number) 370));
            View view4 = this.o;
            if (view4 == null) {
                q.b("bigCardBottomBlackShadowBg");
                throw null;
            }
            o.a(view4, cek.Companion.h());
            View view5 = this.o;
            if (view5 != null) {
                o.a(view5, (int) (G() * 0.35d));
                return;
            } else {
                q.b("bigCardBottomBlackShadowBg");
                throw null;
            }
        }
        View view6 = this.n;
        if (view6 == null) {
            q.b("bigCardTopBlackShadowBg");
            throw null;
        }
        o.e(view6);
        View view7 = this.o;
        if (view7 == null) {
            q.b("bigCardBottomBlackShadowBg");
            throw null;
        }
        o.e(view7);
        ViewGroup viewGroup3 = this.l;
        if (viewGroup3 == null) {
            q.b("bigCardContainer");
            throw null;
        }
        o.e(viewGroup3);
        TUrlImageView tUrlImageView = this.s;
        if (tUrlImageView != null) {
            o.e(tUrlImageView);
        } else {
            q.b("loftAtmosphereBgPic");
            throw null;
        }
    }

    private final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3525c", new Object[]{this});
            return;
        }
        d().setId(R.id.oversea_shop_root);
        View a2 = o.a(a(), R.layout.view_new_shop_view_flag_ship);
        if (a2 == null) {
            return;
        }
        this.g = new ShopSwipeListenerLayout(a());
        View findViewById = a2.findViewById(R.id.new_shop_view_center_container_white_frame);
        q.b(findViewById, "contentView.findViewById(R.id.new_shop_view_center_container_white_frame)");
        this.r = findViewById;
        View findViewById2 = a2.findViewById(R.id.new_shop_view_center_container);
        ShopSwipeListenerLayout shopSwipeListenerLayout = (ShopSwipeListenerLayout) findViewById2;
        shopSwipeListenerLayout.setNormalMode(true);
        t tVar = t.INSTANCE;
        q.b(findViewById2, "contentView.findViewById<ShopSwipeListenerLayout?>(R.id.new_shop_view_center_container).apply {\n            this.normalMode = true\n        }");
        this.i = shopSwipeListenerLayout;
        ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.i;
        FrameLayout.LayoutParams layoutParams = null;
        if (shopSwipeListenerLayout2 == null) {
            q.b("centerContainer");
            throw null;
        }
        o.a(shopSwipeListenerLayout2, o.d((Number) 30), o.d((Number) 30), 0, 0, 12, (Object) null);
        View findViewById3 = a2.findViewById(R.id.new_shop_view_status_bar_view);
        q.b(findViewById3, "contentView.findViewById(R.id.new_shop_view_status_bar_view)");
        this.h = findViewById3;
        View findViewById4 = a2.findViewById(R.id.new_shop_view_tab_bar_container);
        q.b(findViewById4, "contentView.findViewById(R.id.new_shop_view_tab_bar_container)");
        this.j = (ViewGroup) findViewById4;
        View findViewById5 = a2.findViewById(R.id.new_shop_view_big_card_view_container);
        q.b(findViewById5, "contentView.findViewById(R.id.new_shop_view_big_card_view_container)");
        this.l = (ViewGroup) findViewById5;
        View findViewById6 = a2.findViewById(R.id.new_shop_view_nav_view_container);
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = (PerceptionSizeFrameLayout) findViewById6;
        e eVar = this;
        perceptionSizeFrameLayout.setViewSizeChangedListener(eVar);
        t tVar2 = t.INSTANCE;
        q.b(findViewById6, "contentView.findViewById<PerceptionSizeFrameLayout?>(R.id.new_shop_view_nav_view_container).apply {\n            viewSizeChangedListener = this@OverseaShop\n        }");
        this.k = perceptionSizeFrameLayout;
        PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
        if (perceptionSizeFrameLayout2 == null) {
            q.b("navViewContainer");
            throw null;
        }
        o.a(perceptionSizeFrameLayout2, 0);
        View findViewById7 = a2.findViewById(R.id.new_shop_view_header_view_container);
        PerceptionLinearLayout perceptionLinearLayout = (PerceptionLinearLayout) findViewById7;
        perceptionLinearLayout.setViewSizeChangedListener(eVar);
        t tVar3 = t.INSTANCE;
        q.b(findViewById7, "contentView.findViewById<PerceptionLinearLayout?>(R.id.new_shop_view_header_view_container).apply {\n            viewSizeChangedListener = this@OverseaShop\n        }");
        this.m = perceptionLinearLayout;
        View findViewById8 = a2.findViewById(R.id.new_shop_view_backGround_img);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById8;
        String aC = b().aC();
        if (aC == null) {
            aC = g.DEFAULT_2022_BG_IMG_URL;
        }
        tUrlImageView.setImageUrl(aC);
        tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        t tVar4 = t.INSTANCE;
        q.b(findViewById8, "contentView.findViewById<TUrlImageView?>(R.id.new_shop_view_backGround_img).apply {\n            this.imageUrl = shopData.getShopCommonAtmospherePicUrl() ?: ShopExt.DEFAULT_2022_BG_IMG_URL\n            this.scaleType = ImageView.ScaleType.CENTER_CROP\n        }");
        this.q = tUrlImageView;
        View findViewById9 = a2.findViewById(R.id.new_shop_view_black_shadow_bg);
        q.b(findViewById9, "contentView.findViewById(R.id.new_shop_view_black_shadow_bg)");
        this.n = findViewById9;
        this.o = new View(a());
        View findViewById10 = a2.findViewById(R.id.new_shop_view_loft_atmosphere_bg);
        TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById10;
        String S = b().S();
        if (S != null) {
            tUrlImageView2.setImageUrl(S);
            t tVar5 = t.INSTANCE;
        }
        t tVar6 = t.INSTANCE;
        q.b(findViewById10, "contentView.findViewById<TUrlImageView?>(R.id.new_shop_view_loft_atmosphere_bg).apply {\n            shopData.getLoftAtmospherePicUrl()?.isNotEmpty {\n                this.imageUrl = it\n            }\n        }");
        this.s = tUrlImageView2;
        EnhancedViewPager enhancedViewPager = new EnhancedViewPager(a());
        enhancedViewPager.setId(R.id.new_shop_view_view_pager);
        i iVar = new i(b());
        this.f = enhancedViewPager;
        EnhancedViewPager enhancedViewPager2 = this.f;
        if (enhancedViewPager2 == null) {
            q.b("contentViewPager");
            throw null;
        }
        enhancedViewPager2.setOffscreenPageLimit(iVar.a() - 1);
        FragmentManager supportFragmentManager = a().getSupportFragmentManager();
        q.b(supportFragmentManager, "context.supportFragmentManager");
        this.p = new cej(supportFragmentManager);
        cej cejVar = this.p;
        if (cejVar == null) {
            q.b("shopContainerPageAdapter");
            throw null;
        }
        cejVar.a(iVar);
        cej cejVar2 = this.p;
        if (cejVar2 == null) {
            q.b("shopContainerPageAdapter");
            throw null;
        }
        enhancedViewPager.setAdapter(cejVar2);
        enhancedViewPager.addOnPageChangeListener(this);
        ShopSwipeListenerLayout shopSwipeListenerLayout3 = this.i;
        if (shopSwipeListenerLayout3 == null) {
            q.b("centerContainer");
            throw null;
        }
        o.a(shopSwipeListenerLayout3, enhancedViewPager);
        ShopSwipeListenerLayout shopSwipeListenerLayout4 = this.g;
        if (shopSwipeListenerLayout4 == null) {
            q.b("outerSwiperLayout");
            throw null;
        }
        shopSwipeListenerLayout4.setSwipeListener(this);
        ShopSwipeListenerLayout shopSwipeListenerLayout5 = this.g;
        if (shopSwipeListenerLayout5 == null) {
            q.b("outerSwiperLayout");
            throw null;
        }
        o.a(shopSwipeListenerLayout5, a2);
        FrameLayout d = d();
        ShopSwipeListenerLayout shopSwipeListenerLayout6 = this.g;
        if (shopSwipeListenerLayout6 == null) {
            q.b("outerSwiperLayout");
            throw null;
        }
        o.a(d, shopSwipeListenerLayout6);
        View view = this.h;
        if (view == null) {
            q.b(a5.f3362a);
            throw null;
        }
        o.a(view, m());
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            q.b("bigCardContainer");
            throw null;
        }
        o.a(viewGroup, G());
        if (g() != 0) {
            e().setBackgroundColor(cek.Companion.c());
            o.a(d(), e());
        }
        FrameLayout d2 = d();
        TUrlImageView tUrlImageView3 = new TUrlImageView(d2.getContext());
        TUrlImageView tUrlImageView4 = tUrlImageView3;
        ViewGroup.LayoutParams layoutParams2 = tUrlImageView4.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView4.setLayoutParams(layoutParams2);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar7 = t.INSTANCE;
            tUrlImageView4.setLayoutParams(marginLayoutParams);
        }
        tUrlImageView3.setBackground(o.a(o.a(0, 0.1f), null, null, o.d((Number) 44), 0, 0, 0, 0, 0, 0, 1014, null));
        tUrlImageView3.setPadding(o.d((Number) 1), o.d((Number) 1), o.d((Number) 1), o.d((Number) 1));
        ViewGroup.LayoutParams layoutParams3 = tUrlImageView4.getLayoutParams();
        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams3;
        }
        if (layoutParams != null) {
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = o.d((Number) 200);
            layoutParams.width = o.d((Number) 88);
            layoutParams.height = o.d((Number) 88);
            layoutParams.rightMargin = o.d((Number) 10);
        } else {
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 85;
            layoutParams4.bottomMargin = o.d((Number) 200);
            layoutParams4.width = o.d((Number) 88);
            layoutParams4.height = o.d((Number) 88);
            layoutParams4.rightMargin = o.d((Number) 10);
            t tVar8 = t.INSTANCE;
            tUrlImageView4.setLayoutParams(layoutParams4);
        }
        tUrlImageView3.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01GoozT11pKgkVchBTC_!!6000000005342-2-tps-132-132.png");
        tUrlImageView3.setOnClickListener(new b(tUrlImageView3, this));
        d2.addView(tUrlImageView4);
        t tVar9 = t.INSTANCE;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeUp(View fromTargetView, MotionEvent event, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e512d9", new Object[]{this, fromTargetView, event, new Integer(i)});
            return;
        }
        q.d(fromTargetView, "fromTargetView");
        q.d(event, "event");
        a(fromTargetView, event, i);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown(View fromTargetView, MotionEvent event, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74251660", new Object[]{this, fromTargetView, event, new Integer(i)});
            return;
        }
        q.d(fromTargetView, "fromTargetView");
        q.d(event, "event");
        b(fromTargetView, event, i);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeCancel(MotionEvent event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5770811", new Object[]{this, event});
            return;
        }
        q.d(event, "event");
        B();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void a(View fromTargetView, MotionEvent event, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1985e4", new Object[]{this, fromTargetView, event, new Integer(i)});
            return;
        }
        q.d(fromTargetView, "fromTargetView");
        q.d(event, "event");
        super.a(fromTargetView, event, i);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void b(View fromTargetView, MotionEvent event, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a4a3a5", new Object[]{this, fromTargetView, event, new Integer(i)});
            return;
        }
        q.d(fromTargetView, "fromTargetView");
        q.d(event, "event");
        super.b(fromTargetView, event, i);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
        } else if (!this.A || A() || !C()) {
        } else {
            k(true);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4624ae1d", new Object[]{this});
            return;
        }
        super.onSwipeUp();
        if (!A() || !o()) {
            return;
        }
        V();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54535e4", new Object[]{this});
            return;
        }
        super.onSwipeDown();
        if (!A()) {
            return;
        }
        W();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void a(int i, int i2, String targetTabName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i), new Integer(i2), targetTabName});
            return;
        }
        q.d(targetTabName, "targetTabName");
        int f = b().f(i, i2);
        EnhancedViewPager enhancedViewPager = this.f;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCurrentItem(f, false);
        } else {
            q.b("contentViewPager");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a, android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        super.onPageSelected(i);
        if (i != l()) {
            cej cejVar = this.p;
            if (cejVar == null) {
                q.b("shopContainerPageAdapter");
                throw null;
            }
            cejVar.b(l());
        }
        cej cejVar2 = this.p;
        if (cejVar2 == null) {
            q.b("shopContainerPageAdapter");
            throw null;
        }
        cejVar2.a(i);
        int j = b().j(l());
        e(i);
        b().j(l());
        int k = k();
        int i2 = b().i(l());
        int j2 = b().j(i);
        b().a(j2, i2);
        ceg.a aVar = ceg.Companion;
        aVar.b("flag ship , on page selected , newTab = " + i2 + ", newSub = " + j2 + " , oldTab = " + k + ", position : " + i);
        d(i2);
        if (k() != 0) {
            this.t = true;
        }
        b(k, i2);
        rvb<Integer, Integer, Integer, Integer, t> f = f();
        if (f != null) {
            f.invoke(Integer.valueOf(i2), Integer.valueOf(j2), Integer.valueOf(k), Integer.valueOf(j));
        }
        L();
        a(false);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a, android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else {
            super.onPageScrollStateChanged(i);
        }
    }

    private final void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            if (!u()) {
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae72241", new Object[]{this, new Boolean(z)});
            return;
        }
        ceg.Companion.b(q.a("update expanded : ", (Object) Boolean.valueOf(z)));
        super.l(z);
        L();
        if (!C()) {
            TUrlImageView tUrlImageView = this.s;
            if (tUrlImageView != null) {
                o.e(tUrlImageView);
            } else {
                q.b("loftAtmosphereBgPic");
                throw null;
            }
        } else if (z) {
            if (u()) {
                k.j(b());
            }
            if (!q()) {
                return;
            }
            com.alibaba.triver.triver_shop.newShop.ext.b.d(new OverseaShop$updateExpandedStatus$1(this));
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.d(new OverseaShop$updateExpandedStatus$2(this));
            com.alibaba.triver.triver_shop.newShop.ext.b.c(new OverseaShop$updateExpandedStatus$3(this));
        }
    }

    private final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
            return;
        }
        int D = D();
        a(this, -D, false, false, 4, null);
        g(D);
        l(false);
    }

    private final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df815e", new Object[]{this});
        } else if (o()) {
        } else {
            a(this, E(), false, false, 6, null);
            l(true);
        }
    }

    public static /* synthetic */ void a(e eVar, int i, boolean z, boolean z2, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26fe7fcb", new Object[]{eVar, new Integer(i), new Boolean(z), new Boolean(z2), new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        eVar.a(i, z, z2);
    }

    private final void a(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2621735b", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
            return;
        }
        ValueAnimator valueAnimator = null;
        if (C() && q()) {
            ShopSwipeListenerLayout shopSwipeListenerLayout = this.g;
            if (shopSwipeListenerLayout == null) {
                q.b("outerSwiperLayout");
                throw null;
            }
            shopSwipeListenerLayout.forceInterceptAllTouchEvent(true);
        }
        ceg.a aVar = ceg.Companion;
        aVar.b("moveNavViewAndCenterContainer : " + i + " , needHeaderAlphaChanged : " + z);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[1];
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
        if (perceptionSizeFrameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        Animator a2 = n.a((MarginSupportFrameLayout) perceptionSizeFrameLayout, i, 0L, (Animator.AnimatorListener) null, 6, (Object) null);
        if (z2) {
            if (a2 instanceof ValueAnimator) {
                valueAnimator = (ValueAnimator) a2;
            }
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(new c(i, this));
            }
        }
        t tVar = t.INSTANCE;
        animatorArr[0] = a2;
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new a(this));
        animatorSet.start();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public int E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e1da3f", new Object[]{this})).intValue() : Y();
    }

    private final int X() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4ed98d2", new Object[]{this})).intValue() : this.x;
    }

    private final int Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fbb053", new Object[]{this})).intValue() : this.x;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public int D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d3c2be", new Object[]{this})).intValue() : X();
    }

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f3941a;

        static {
            kge.a(2112131945);
        }

        public a(e this$0) {
            q.d(this$0, "this$0");
            this.f3941a = this$0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            this.f3941a.b(true);
            ShopSwipeListenerLayout e = e.e(this.f3941a);
            if (e != null) {
                e.forceInterceptAllTouchEvent(true);
            } else {
                q.b("outerSwiperLayout");
                throw null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            this.f3941a.b(false);
            this.f3941a.y();
            ShopSwipeListenerLayout e = e.e(this.f3941a);
            if (e != null) {
                e.forceInterceptAllTouchEvent(false);
            } else {
                q.b("outerSwiperLayout");
                throw null;
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a, com.alibaba.triver.triver_shop.newShop.view.p
    public void a(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e734472a", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        q.d(view, "view");
        ceg.Companion.b(q.a("flag ship , size changed , newHeight = ", (Object) Integer.valueOf(i2)));
        q(false);
        PerceptionLinearLayout perceptionLinearLayout = this.m;
        if (perceptionLinearLayout == null) {
            q.b("shopHeaderContainer");
            throw null;
        } else if (!q.a(view, perceptionLinearLayout)) {
        } else {
            View view2 = this.n;
            if (view2 != null) {
                o.a(view2, i2 + m() + o.c((Number) 6));
            } else {
                q.b("bigCardTopBlackShadowBg");
                throw null;
            }
        }
    }

    private final void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36f5d5c", new Object[]{this, new Boolean(z)});
            return;
        }
        ShopSwipeListenerLayout shopSwipeListenerLayout = this.i;
        if (shopSwipeListenerLayout == null) {
            q.b("centerContainer");
            throw null;
        }
        ShopSwipeListenerLayout shopSwipeListenerLayout2 = shopSwipeListenerLayout;
        int height = d().getHeight() - m();
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
        if (perceptionSizeFrameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        o.a(shopSwipeListenerLayout2, (height - perceptionSizeFrameLayout.getHeight()) + cek.Companion.a());
        ShopSwipeListenerLayout shopSwipeListenerLayout3 = this.i;
        if (shopSwipeListenerLayout3 != null) {
            shopSwipeListenerLayout3.setPadding(0, 0, 0, cek.Companion.a());
        } else {
            q.b("centerContainer");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public int G() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fe0941", new Object[]{this})).intValue();
        }
        if (q()) {
            EmbedShopLoftComponent embedShopLoftComponent = this.D;
            if (embedShopLoftComponent != null && embedShopLoftComponent.c()) {
                z = true;
            }
            if (z) {
                return j(this.u ? this.F : this.E);
            }
        }
        return this.G;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new OverseaShop$onSubscribeStatusChanged$1(this, z, jSONObject));
        }
    }
}
