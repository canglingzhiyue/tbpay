package com.alibaba.triver.triver_shop.newShop.view.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
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
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.cej;
import tb.cek;
import tb.cen;
import tb.itk;
import tb.kge;
import tb.rvb;

/* loaded from: classes3.dex */
public final class c extends com.alibaba.triver.triver_shop.newShop.view.component.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean B;
    private com.alibaba.triver.triver_shop.newShop.manager.d D;
    private EmbedShopLoftComponent F;
    private com.alibaba.triver.triver_shop.newShop.view.component.nativeview.a M;
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
    private int z;
    private boolean A = true;
    private boolean C = true;
    private final com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.f E = new com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.f(new DefaultShopV2$shopHeaderComponent$1(this), null);
    private final int G = o.c(Integer.valueOf((int) g.KEY_FLAG_SHIP_BIG_CARD_SIZE_RPX));
    private final int H = o.c(Integer.valueOf((int) g.KEY_FLAG_SHIP_SUPER_BIG_CARD_SIZE_RPX));
    private final int I = o.c((Number) 750);
    private final com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.b J = new com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.b(new DefaultShopV2$bottomBarComponent$1(this), null, 2, null);
    private final com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.e K = new com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.e();
    private final com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.g L = new com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.g();
    private final com.alibaba.triver.triver_shop.shop2023.data.f N = new com.alibaba.triver.triver_shop.shop2023.data.f(0);

    /* loaded from: classes3.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3936a;
        public final /* synthetic */ c b;

        public b(int i, c cVar) {
            this.f3936a = i;
            this.b = cVar;
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
            if (this.f3936a > 0) {
                c.k(this.b).a(-((int) floatValue));
            } else {
                c.k(this.b).a(this.f3936a - ((int) floatValue));
            }
            c.k(this.b).b();
        }
    }

    static {
        kge.a(1836618808);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
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

    public static final /* synthetic */ void a(c cVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7683f1c2", new Object[]{cVar, new Integer(i), new Boolean(z)});
        } else {
            cVar.a(i, z);
        }
    }

    public static final /* synthetic */ void a(c cVar, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed45a67", new Object[]{cVar, aVar, layoutParams});
        } else {
            cVar.a(aVar, layoutParams);
        }
    }

    public static final /* synthetic */ void a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c26b23", new Object[]{cVar, new Boolean(z)});
        } else {
            cVar.C = z;
        }
    }

    public static final /* synthetic */ View g(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("381d0b0d", new Object[]{cVar}) : cVar.r;
    }

    public static final /* synthetic */ ShopSwipeListenerLayout h(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopSwipeListenerLayout) ipChange.ipc$dispatch("5231d662", new Object[]{cVar}) : cVar.g;
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.shop2023.data.f k(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.shop2023.data.f) ipChange.ipc$dispatch("1ef5214b", new Object[]{cVar}) : cVar.N;
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
        try {
            Result.a aVar = Result.Companion;
            this.B = cen.Companion.G();
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
        }
        shopData.G().b(new DefaultShopV2$initComponent$2(this));
        context.getLifecycle().addObserver(I());
        super.a(context, shopData, shopDXEngine);
        shopData.b(o.f(Integer.valueOf(m())) + 90);
        shopData.a(SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR);
        l.a((Activity) context, true);
        X();
        S();
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            q.b("bigCardContainer");
            throw null;
        }
        o.a(viewGroup, G());
        V();
        W();
    }

    private final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
            return;
        }
        String aR = b().aR();
        ceg.Companion.b(q.a("shopSignType : ", (Object) aR));
        if (q.a((Object) aR, (Object) itk.TYPE_FOLD)) {
            return;
        }
        if (q.a((Object) aR, (Object) "loft")) {
            T();
        }
        T();
        if (!q()) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 80;
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            q.b("bigCardContainer");
            throw null;
        }
        View view = this.o;
        if (view != null) {
            viewGroup.addView(view, layoutParams);
        } else {
            q.b("bigCardBottomBlackShadowBg");
            throw null;
        }
    }

    private final void T() {
        View i;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53adb", new Object[]{this});
        } else if (q() || l.b()) {
        } else {
            c(b().ac());
            if (!q()) {
                return;
            }
            d(true);
            this.F = new EmbedShopLoftComponent(a(), b(), c());
            EmbedShopLoftComponent embedShopLoftComponent = this.F;
            if (embedShopLoftComponent != null) {
                embedShopLoftComponent.a(G() / o.a());
            }
            EmbedShopLoftComponent embedShopLoftComponent2 = this.F;
            if (embedShopLoftComponent2 != null && (i = embedShopLoftComponent2.i()) != null) {
                ViewGroup viewGroup = this.l;
                if (viewGroup == null) {
                    q.b("bigCardContainer");
                    throw null;
                }
                o.a(viewGroup, i);
            }
            this.E.b(true);
            EmbedShopLoftComponent embedShopLoftComponent3 = this.F;
            if (embedShopLoftComponent3 == null || !embedShopLoftComponent3.c()) {
                z = false;
            }
            if (!z) {
                return;
            }
            i(false);
        }
    }

    private final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3525c", new Object[]{this});
            return;
        }
        ceg.Companion.b("continueInitSHopLoftBigCard");
        this.L.a(new DefaultShopV2$continueInitShopLoftBigCard$1(this));
        this.L.a(a(), b(), c(), null);
    }

    private final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
            return;
        }
        this.D = new com.alibaba.triver.triver_shop.newShop.manager.d(a(), b(), q(), new DefaultShopV2$initTemplateComponent$1(this));
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
        if (perceptionSizeFrameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.manager.d dVar = this.D;
        if (dVar == null) {
            q.b("bottomBarAndIndexNavManager");
            throw null;
        }
        perceptionSizeFrameLayout.addView(dVar.a());
        this.w = o.a((Number) 45);
        this.J.a(new DefaultShopV2$initTemplateComponent$2(this));
        this.J.a(a(), b(), c(), null);
        ViewGroup viewGroup = this.j;
        if (viewGroup == null) {
            q.b("tabBarContainer");
            throw null;
        }
        viewGroup.addView(this.J.f());
        this.E.a(new DefaultShopV2$initTemplateComponent$3(this));
        this.E.a(a(), b(), c(), null);
        PerceptionLinearLayout perceptionLinearLayout = this.m;
        if (perceptionLinearLayout == null) {
            q.b("shopHeaderContainer");
            throw null;
        }
        perceptionLinearLayout.addView(this.E.f());
        if (u()) {
            this.K.a(new DefaultShopV2$initTemplateComponent$4(this));
            this.K.a(a(), b(), c(), null);
        }
        View f = this.E.f();
        com.alibaba.triver.triver_shop.newShop.manager.d dVar2 = this.D;
        if (dVar2 != null) {
            this.M = new com.alibaba.triver.triver_shop.newShop.view.component.nativeview.a(f, dVar2.a(), this.J.f());
            com.alibaba.triver.triver_shop.newShop.view.component.nativeview.a aVar = this.M;
            if (aVar != null) {
                ShopSwipeListenerLayout shopSwipeListenerLayout = this.i;
                if (shopSwipeListenerLayout == null) {
                    q.b("centerContainer");
                    throw null;
                }
                aVar.a(shopSwipeListenerLayout);
            }
            com.alibaba.triver.triver_shop.newShop.view.component.nativeview.a aVar2 = this.M;
            if (aVar2 == null) {
                return;
            }
            aVar2.b(d());
            return;
        }
        q.b("bottomBarAndIndexNavManager");
        throw null;
    }

    private final boolean s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6d90e9e", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            if (o() || ar()) {
                return false;
            }
        } else if (o() || !ar()) {
            return false;
        }
        com.alibaba.triver.triver_shop.newShop.view.component.nativeview.a aVar = this.M;
        if (aVar != null) {
            aVar.a(z);
        }
        v(z);
        EnhancedViewPager enhancedViewPager = this.f;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCanScroll(!z);
            return true;
        }
        q.b("contentViewPager");
        throw null;
    }

    private final void a(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50fe2fe", new Object[]{this, aVar, layoutParams});
            return;
        }
        boolean z2 = !u() || this.y != 0;
        if (this.v != 0 && this.w != 0 && this.x != 0 && z2) {
            return;
        }
        if (aVar instanceof com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.f) {
            this.v = aVar.j().height;
        }
        if (aVar instanceof com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.b) {
            this.x = aVar.j().height;
        }
        if (aVar instanceof com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.e) {
            this.y = aVar.j().height;
        }
        if (u() && this.y == 0) {
            z = false;
        }
        if (this.v == 0 || this.w == 0 || this.x == 0 || !z) {
            return;
        }
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
        if (q() && C()) {
            this.z = G() - this.w;
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
            if (perceptionSizeFrameLayout == null) {
                q.b("navViewContainer");
                throw null;
            }
            o.c(perceptionSizeFrameLayout, this.z);
            EmbedShopLoftComponent embedShopLoftComponent = this.F;
            if (embedShopLoftComponent != null) {
                embedShopLoftComponent.b(this.w);
            }
            if (u()) {
                this.K.a(q());
                PerceptionLinearLayout perceptionLinearLayout = this.m;
                if (perceptionLinearLayout == null) {
                    q.b("shopHeaderContainer");
                    throw null;
                }
                perceptionLinearLayout.addView(this.K.f());
            }
            if (r()) {
                U();
            }
        } else {
            if (u()) {
                i = this.v + m();
                m = this.y;
            } else {
                i = this.v;
                m = m();
            }
            int i2 = i + m;
            PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
            if (perceptionSizeFrameLayout2 == null) {
                q.b("navViewContainer");
                throw null;
            }
            o.c(perceptionSizeFrameLayout2, i2);
            this.z = i2;
            if (u()) {
                PerceptionLinearLayout perceptionLinearLayout2 = this.m;
                if (perceptionLinearLayout2 == null) {
                    q.b("shopHeaderContainer");
                    throw null;
                }
                perceptionLinearLayout2.addView(this.K.f());
            }
        }
        com.alibaba.triver.triver_shop.newShop.data.d b2 = b();
        int i3 = this.x;
        ViewGroup viewGroup = this.j;
        if (viewGroup == null) {
            q.b("tabBarContainer");
            throw null;
        }
        b2.a(o.f(Integer.valueOf(i3 + o.i(viewGroup))));
        if (i() == 0) {
            cej cejVar = this.p;
            if (cejVar == null) {
                q.b("shopContainerPageAdapter");
                throw null;
            }
            cejVar.a(i());
        }
        PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.k;
        if (perceptionSizeFrameLayout3 == null) {
            q.b("navViewContainer");
            throw null;
        }
        o.a(perceptionSizeFrameLayout3, new DefaultShopV2$allTemplateLoadFinish$1(this));
        y();
    }

    private final void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36f5d5c", new Object[]{this, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            if (z) {
                Object a2 = cek.a.a(cek.Companion, z, 0, false, 6, null);
                if (a2 == null || !(a2 instanceof ViewOutlineProvider)) {
                    return;
                }
                ShopSwipeListenerLayout shopSwipeListenerLayout = this.i;
                if (shopSwipeListenerLayout == null) {
                    q.b("centerContainer");
                    throw null;
                }
                shopSwipeListenerLayout.setOutlineProvider((ViewOutlineProvider) a2);
                ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.i;
                if (shopSwipeListenerLayout2 != null) {
                    shopSwipeListenerLayout2.setClipToOutline(true);
                    return;
                } else {
                    q.b("centerContainer");
                    throw null;
                }
            }
            ShopSwipeListenerLayout shopSwipeListenerLayout3 = this.i;
            if (shopSwipeListenerLayout3 == null) {
                q.b("centerContainer");
                throw null;
            }
            shopSwipeListenerLayout3.setOutlineProvider(null);
            ShopSwipeListenerLayout shopSwipeListenerLayout4 = this.i;
            if (shopSwipeListenerLayout4 != null) {
                shopSwipeListenerLayout4.setClipToOutline(false);
            } else {
                q.b("centerContainer");
                throw null;
            }
        }
    }

    private final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df815e", new Object[]{this});
            return;
        }
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
        if (perceptionSizeFrameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        o.a(perceptionSizeFrameLayout, cek.Companion.e());
        if (!q()) {
            View view = this.h;
            if (view == null) {
                q.b(a5.f3362a);
                throw null;
            }
            o.g(view);
            PerceptionLinearLayout perceptionLinearLayout = this.m;
            if (perceptionLinearLayout == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            o.g(perceptionLinearLayout);
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

    private final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed98df", new Object[]{this});
            return;
        }
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
        c cVar = this;
        perceptionSizeFrameLayout.setViewSizeChangedListener(cVar);
        t tVar2 = t.INSTANCE;
        q.b(findViewById6, "contentView.findViewById<PerceptionSizeFrameLayout?>(R.id.new_shop_view_nav_view_container).apply {\n            viewSizeChangedListener = this@DefaultShopV2\n        }");
        this.k = perceptionSizeFrameLayout;
        View findViewById7 = a2.findViewById(R.id.new_shop_view_header_view_container);
        PerceptionLinearLayout perceptionLinearLayout = (PerceptionLinearLayout) findViewById7;
        perceptionLinearLayout.setViewSizeChangedListener(cVar);
        t tVar3 = t.INSTANCE;
        q.b(findViewById7, "contentView.findViewById<PerceptionLinearLayout?>(R.id.new_shop_view_header_view_container).apply {\n            viewSizeChangedListener = this@DefaultShopV2\n        }");
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
        }
        t tVar5 = t.INSTANCE;
        q.b(findViewById10, "contentView.findViewById<TUrlImageView?>(R.id.new_shop_view_loft_atmosphere_bg).apply {\n            shopData.getLoftAtmospherePicUrl()?.isNotEmpty {\n                this.imageUrl = it\n            }\n        }");
        this.s = tUrlImageView2;
        EnhancedViewPager enhancedViewPager = new EnhancedViewPager(a());
        enhancedViewPager.setId(R.id.new_shop_view_view_pager);
        com.alibaba.triver.triver_shop.newShop.view.provider.c cVar2 = new com.alibaba.triver.triver_shop.newShop.view.provider.c(b());
        this.f = enhancedViewPager;
        EnhancedViewPager enhancedViewPager2 = this.f;
        if (enhancedViewPager2 == null) {
            q.b("contentViewPager");
            throw null;
        }
        enhancedViewPager2.setOffscreenPageLimit(cVar2.a() - 1);
        FragmentManager supportFragmentManager = a().getSupportFragmentManager();
        q.b(supportFragmentManager, "context.supportFragmentManager");
        this.p = new cej(supportFragmentManager);
        cej cejVar = this.p;
        if (cejVar == null) {
            q.b("shopContainerPageAdapter");
            throw null;
        }
        cejVar.a(cVar2);
        cej cejVar2 = this.p;
        if (cejVar2 == null) {
            q.b("shopContainerPageAdapter");
            throw null;
        }
        enhancedViewPager.setAdapter(cejVar2);
        enhancedViewPager.addOnPageChangeListener(this);
        ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.i;
        if (shopSwipeListenerLayout2 == null) {
            q.b("centerContainer");
            throw null;
        }
        o.a(shopSwipeListenerLayout2, enhancedViewPager);
        ShopSwipeListenerLayout shopSwipeListenerLayout3 = this.g;
        if (shopSwipeListenerLayout3 == null) {
            q.b("outerSwiperLayout");
            throw null;
        }
        shopSwipeListenerLayout3.setSwipeListener(this);
        ShopSwipeListenerLayout shopSwipeListenerLayout4 = this.g;
        if (shopSwipeListenerLayout4 == null) {
            q.b("outerSwiperLayout");
            throw null;
        }
        o.a(shopSwipeListenerLayout4, a2);
        FrameLayout d = d();
        ShopSwipeListenerLayout shopSwipeListenerLayout5 = this.g;
        if (shopSwipeListenerLayout5 == null) {
            q.b("outerSwiperLayout");
            throw null;
        }
        o.a(d, shopSwipeListenerLayout5);
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
        if (g() == 0) {
            return;
        }
        e().setBackgroundColor(cek.Companion.c());
        o.a(d(), e());
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
        if (!this.B || !r() || p() || !C() || !v()) {
            return;
        }
        k(false);
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
        if (perceptionSizeFrameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        int h = o.h(perceptionSizeFrameLayout) - i;
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            q.b("bigCardContainer");
            throw null;
        }
        int height = viewGroup.getHeight() - i;
        int i2 = this.z;
        if (h <= i2) {
            height = G();
            h = i2;
        }
        ViewGroup viewGroup2 = this.l;
        if (viewGroup2 == null) {
            q.b("bigCardContainer");
            throw null;
        }
        o.a(viewGroup2, height);
        PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
        if (perceptionSizeFrameLayout2 != null) {
            o.c(perceptionSizeFrameLayout2, h);
        } else {
            q.b("navViewContainer");
            throw null;
        }
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
        if (!this.B || !this.C || !r() || p() || !C() || !o() || !b().m(b().K())) {
            return;
        }
        k(false);
        h(true);
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
        if (perceptionSizeFrameLayout == null) {
            q.b("navViewContainer");
            throw null;
        } else if ((o.h(perceptionSizeFrameLayout) + i) - this.z >= 350) {
            EmbedShopLoftComponent embedShopLoftComponent = this.F;
            if (embedShopLoftComponent != null) {
                embedShopLoftComponent.e();
            }
            B();
            this.C = false;
            com.alibaba.triver.triver_shop.newShop.ext.b.a(new DefaultShopV2$onParentSwipeDown$1(this), 500L);
        } else {
            ViewGroup viewGroup = this.l;
            if (viewGroup == null) {
                q.b("bigCardContainer");
                throw null;
            }
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup == null) {
                q.b("bigCardContainer");
                throw null;
            }
            o.a(viewGroup2, viewGroup.getHeight() + i);
            PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
            if (perceptionSizeFrameLayout2 == null) {
                q.b("navViewContainer");
                throw null;
            }
            PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = perceptionSizeFrameLayout2;
            if (perceptionSizeFrameLayout2 != null) {
                o.c(perceptionSizeFrameLayout3, o.h(perceptionSizeFrameLayout2) + i);
            } else {
                q.b("navViewContainer");
                throw null;
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
        } else if (!this.B || A() || !C()) {
        } else {
            if (v()) {
                ViewGroup viewGroup = this.l;
                if (viewGroup == null) {
                    q.b("bigCardContainer");
                    throw null;
                }
                o.a(viewGroup, G());
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
                if (perceptionSizeFrameLayout == null) {
                    q.b("navViewContainer");
                    throw null;
                } else {
                    o.c(perceptionSizeFrameLayout, this.z);
                    h(false);
                }
            }
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
        Z();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54535e4", new Object[]{this});
            return;
        }
        super.onSwipeDown();
        if (!A() || !b().m(b().K())) {
            return;
        }
        aa();
    }

    private final void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        EnhancedViewPager enhancedViewPager = this.f;
        if (enhancedViewPager == null) {
            q.b("contentViewPager");
            throw null;
        } else if (enhancedViewPager.getCurrentItem() == i) {
            ceg.a aVar = ceg.Companion;
            aVar.b("switchTabToInViewPager : " + i + " , but same");
        } else {
            ceg.Companion.b(q.a("switchTabToInViewPager : ", (Object) Integer.valueOf(i)));
            EnhancedViewPager enhancedViewPager2 = this.f;
            if (enhancedViewPager2 != null) {
                enhancedViewPager2.setCurrentItem(i, z);
            } else {
                q.b("contentViewPager");
                throw null;
            }
        }
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
        com.alibaba.triver.triver_shop.newShop.manager.d dVar = this.D;
        if (dVar == null) {
            q.b("bottomBarAndIndexNavManager");
            throw null;
        }
        dVar.a(i2, i);
        this.J.a(k());
        if (k == 0 && i2 != 0) {
            Y();
        }
        if (k != 0 && i2 == 0) {
            k(k);
        }
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

    private final void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbb060", new Object[]{this});
            return;
        }
        ceg.Companion.b(q.a("changeFirstTabToOtherTab, current expanded : ", (Object) Boolean.valueOf(o())));
        if (o()) {
            if (j() && com.alibaba.triver.triver_shop.newShop.ext.i.a(b().d(g(), h()))) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
                if (perceptionSizeFrameLayout == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                perceptionSizeFrameLayout.setMarginTop(m());
                PerceptionLinearLayout perceptionLinearLayout = this.m;
                if (perceptionLinearLayout == null) {
                    q.b("shopHeaderContainer");
                    throw null;
                } else {
                    perceptionLinearLayout.setAlpha(0.0f);
                    l(false);
                }
            } else if (q()) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
                if (perceptionSizeFrameLayout2 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                int top = perceptionSizeFrameLayout2.getTop();
                PerceptionLinearLayout perceptionLinearLayout2 = this.m;
                if (perceptionLinearLayout2 == null) {
                    q.b("shopHeaderContainer");
                    throw null;
                }
                a(-(top - perceptionLinearLayout2.getBottom()), false, false);
                l(true);
                this.N.a(-D());
                this.N.b();
            } else {
                l(true);
                this.N.a(-D());
                this.N.b();
            }
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.d(new DefaultShopV2$changeFirstTabToOtherTab$1(this));
    }

    private final void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93209d1", new Object[]{this, new Integer(i)});
            return;
        }
        ceg.a aVar = ceg.Companion;
        aVar.b("changeOtherTabToFistTab, current expanded : " + o() + ' ');
        if (!o() || !q()) {
            return;
        }
        a(this, -ab(), false, false, 6, null);
        l(false);
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
        com.alibaba.triver.triver_shop.newShop.manager.d dVar = this.D;
        if (dVar == null) {
            q.b("bottomBarAndIndexNavManager");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.manager.d.a(dVar, z, null, 2, null);
        L();
        q(!z);
        if (!C()) {
            if (z) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
                if (perceptionSizeFrameLayout == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                o.a(perceptionSizeFrameLayout, cek.Companion.e());
            } else {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
                if (perceptionSizeFrameLayout2 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                o.a(perceptionSizeFrameLayout2, cek.Companion.l());
            }
            this.E.c(false);
            this.K.a(false);
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
                this.K.a(q());
            }
            if (q()) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.k;
                if (perceptionSizeFrameLayout3 == null) {
                    q.b("navViewContainer");
                    throw null;
                } else {
                    o.a(perceptionSizeFrameLayout3, cek.Companion.e());
                    com.alibaba.triver.triver_shop.newShop.ext.b.d(new DefaultShopV2$updateExpandedStatus$1(this));
                }
            } else {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout4 = this.k;
                if (perceptionSizeFrameLayout4 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                o.a(perceptionSizeFrameLayout4, cek.Companion.e());
            }
            if (r()) {
                this.E.b(true);
            } else if (!q()) {
                this.E.c(false);
            } else {
                this.E.c(true);
            }
        } else {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout5 = this.k;
            if (perceptionSizeFrameLayout5 == null) {
                q.b("navViewContainer");
                throw null;
            }
            o.a(perceptionSizeFrameLayout5, cek.Companion.l());
            com.alibaba.triver.triver_shop.newShop.ext.b.d(new DefaultShopV2$updateExpandedStatus$2(this));
            com.alibaba.triver.triver_shop.newShop.ext.b.c(new DefaultShopV2$updateExpandedStatus$3(this));
        }
    }

    private final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509c7e1", new Object[]{this});
            return;
        }
        int D = D();
        a(this, -D, true, false, 4, null);
        g(D);
        l(false);
    }

    private final void aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf280a7", new Object[]{this});
        } else if (o()) {
        } else {
            a(this, E(), false, false, 6, null);
            l(true);
        }
    }

    public static /* synthetic */ void a(c cVar, int i, boolean z, boolean z2, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("234bd98d", new Object[]{cVar, new Integer(i), new Boolean(z), new Boolean(z2), new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        cVar.a(i, z, z2);
    }

    private final void a(int i, boolean z, boolean z2) {
        float alpha;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2621735b", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
            return;
        }
        if (C() && q()) {
            ShopSwipeListenerLayout shopSwipeListenerLayout = this.g;
            if (shopSwipeListenerLayout == null) {
                q.b("outerSwiperLayout");
                throw null;
            }
            shopSwipeListenerLayout.forceInterceptAllTouchEvent(true);
        }
        if (z) {
            i(i);
        }
        ceg.a aVar = ceg.Companion;
        aVar.b("moveNavViewAndCenterContainer : " + i + " , needHeaderAlphaChanged : " + z);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
        if (perceptionSizeFrameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        Animator a2 = n.a((MarginSupportFrameLayout) perceptionSizeFrameLayout, i, 0L, (Animator.AnimatorListener) null, 6, (Object) null);
        if (z2) {
            ValueAnimator valueAnimator = a2 instanceof ValueAnimator ? (ValueAnimator) a2 : null;
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(new b(i, this));
            }
        }
        t tVar = t.INSTANCE;
        animatorArr[0] = a2;
        PerceptionLinearLayout perceptionLinearLayout = this.m;
        if (perceptionLinearLayout != null) {
            PerceptionLinearLayout perceptionLinearLayout2 = perceptionLinearLayout;
            if (z) {
                alpha = i > 0 ? 1.0f : 0.0f;
            } else if (perceptionLinearLayout != null) {
                alpha = perceptionLinearLayout.getAlpha();
            } else {
                q.b("shopHeaderContainer");
                throw null;
            }
            animatorArr[1] = n.a(perceptionLinearLayout2, alpha, 0L, (Animator.AnimatorListener) null, 6, (Object) null);
            animatorSet.playTogether(animatorArr);
            animatorSet.addListener(new a(this));
            animatorSet.start();
            return;
        }
        q.b("shopHeaderContainer");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e1da3f", new Object[]{this})).intValue();
        }
        if (C()) {
            return ae();
        }
        return ac();
    }

    private final int ab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab00981b", new Object[]{this})).intValue();
        }
        PerceptionLinearLayout perceptionLinearLayout = this.m;
        if (perceptionLinearLayout != null) {
            return perceptionLinearLayout.getHeight();
        }
        q.b("shopHeaderContainer");
        throw null;
    }

    private final int ac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab0eaf9c", new Object[]{this})).intValue();
        }
        PerceptionLinearLayout perceptionLinearLayout = this.m;
        if (perceptionLinearLayout != null) {
            return perceptionLinearLayout.getHeight();
        }
        q.b("shopHeaderContainer");
        throw null;
    }

    private final int ad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab1cc71d", new Object[]{this})).intValue();
        }
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
        if (perceptionSizeFrameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        int top = perceptionSizeFrameLayout.getTop();
        View view = this.h;
        if (view != null) {
            return top - view.getBottom();
        }
        q.b(a5.f3362a);
        throw null;
    }

    private final int ae() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab2ade9e", new Object[]{this})).intValue();
        }
        int i = this.z;
        View view = this.h;
        if (view != null) {
            return i - view.getBottom();
        }
        q.b(a5.f3362a);
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d3c2be", new Object[]{this})).intValue();
        }
        if (C()) {
            return ad();
        }
        return ab();
    }

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f3935a;

        static {
            kge.a(-1669702713);
        }

        public a(c this$0) {
            q.d(this$0, "this$0");
            this.f3935a = this$0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            this.f3935a.b(true);
            View g = c.g(this.f3935a);
            if (g == null) {
                q.b("centerContainerWhiteFrame");
                throw null;
            }
            o.b(g);
            ShopSwipeListenerLayout h = c.h(this.f3935a);
            if (h != null) {
                h.forceInterceptAllTouchEvent(true);
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
            this.f3935a.b(false);
            View g = c.g(this.f3935a);
            if (g == null) {
                q.b("centerContainerWhiteFrame");
                throw null;
            }
            o.d(g);
            this.f3935a.y();
            ShopSwipeListenerLayout h = c.h(this.f3935a);
            if (h != null) {
                h.forceInterceptAllTouchEvent(false);
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
        r(false);
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

    private final void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52435fb", new Object[]{this, new Boolean(z)});
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
        if (b().bw() && b().ae()) {
            return this.G;
        }
        if (q()) {
            EmbedShopLoftComponent embedShopLoftComponent = this.F;
            if (embedShopLoftComponent != null && embedShopLoftComponent.c()) {
                z = true;
            }
            if (z) {
                return j(this.u ? this.H : this.G);
            }
        }
        return this.I;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new DefaultShopV2$onSubscribeStatusChanged$1(this, z, jSONObject));
        }
    }
}
