package com.alibaba.triver.triver_shop.newShop.view.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.a5;
import com.alibaba.triver.triver_shop.container.shopLoft.MiniVideoLoftView;
import com.alibaba.triver.triver_shop.newShop.ClickView;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.alibaba.triver.triver_shop.newShop.ext.n;
import com.alibaba.triver.triver_shop.newShop.view.MarginSupportFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionLinearLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionSizeFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.i;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.alibaba.triver.triver_shop.newShop.view.o;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.alibaba.triver.triver_shop.shop2023.nativeview.m;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.remote.LoadConfig;
import com.taobao.appbundle.remote.view.RemoteLoadingView;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Pair;
import kotlin.Result;
import kotlin.j;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.cei;
import tb.cej;
import tb.cek;
import tb.cen;
import tb.itk;
import tb.kge;
import tb.rvb;

/* loaded from: classes3.dex */
public final class d extends com.alibaba.triver.triver_shop.newShop.view.component.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final f Companion;
    public static final int defaultBottomBarBottomMargin = 51;
    public static final int defaultBottomBarSize = 88;
    public static final int defaultHeaderSize = 88;
    private int A;
    private int B;
    private boolean E;
    private boolean G;
    private boolean J;
    private com.alibaba.triver.triver_shop.newShop.manager.d K;
    private EmbedShopLoftComponent M;
    private com.alibaba.triver.triver_shop.newShop.view.embed.c N;
    private o T;
    private boolean U;
    private com.alibaba.triver.triver_shop.newShop.view.component.nativeview.b W;
    private int X;
    private boolean Y;
    private boolean Z;
    private i aa;
    private m ab;
    private EnhancedViewPager f;
    private View g;
    private ShopSwipeListenerLayout h;
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
    private MarginSupportFrameLayout t;
    private boolean u;
    private boolean v;
    private int y;
    private int z;
    private boolean w = true;
    private int x = 45;
    private boolean C = true;
    private boolean D = true;
    private boolean F = true;
    private boolean H = true;
    private boolean I = true;
    private final com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.f L = new com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.f(new FlagShipContentComponentV2$shopHeaderComponent$1(this), new FlagShipContentComponentV2$shopHeaderComponent$2(this));
    private final int O = com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf((int) g.KEY_FLAG_SHIP_BIG_CARD_SIZE_RPX));
    private final int P = com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf((int) g.KEY_FLAG_SHIP_SUPER_BIG_CARD_SIZE_RPX));
    private final int Q = com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf((int) g.KEY_FLAG_SHIP_H5_BIG_CARD_SIZE_RPX));
    private final com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.b R = new com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.b(new FlagShipContentComponentV2$bottomBarComponent$1(this), new FlagShipContentComponentV2$bottomBarComponent$2(this));
    private final com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.g S = new com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.g();
    private boolean V = true;

    /* loaded from: classes3.dex */
    public static final class b extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
            super(d.this);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.component.d.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            PerceptionLinearLayout q;
            float z;
            IpChange ipChange = $ipChange;
            boolean z2 = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            super.onAnimationEnd(animation);
            MarginSupportFrameLayout n = d.n(d.this);
            if (n == null) {
                q.b("tab3Container");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = n.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.i = 0;
            layoutParams2.h = -1;
            layoutParams2.topMargin = 0;
            MarginSupportFrameLayout n2 = d.n(d.this);
            if (n2 == null) {
                q.b("tab3Container");
                throw null;
            }
            n2.setLayoutParams(layoutParams2);
            boolean z3 = d.r(d.this) && d.s(d.this);
            if (!d.s(d.this) || !d.j(d.this)) {
                z2 = false;
            }
            if (z3 || z2) {
                q = d.q(d.this);
                if (q == null) {
                    q.b("shopHeaderContainer");
                    throw null;
                }
                PerceptionSizeFrameLayout k = d.k(d.this);
                if (k == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                z = k.getZ();
            } else {
                q = d.q(d.this);
                if (q == null) {
                    q.b("shopHeaderContainer");
                    throw null;
                }
                z = 0.0f;
            }
            q.setZ(z);
            o p = d.p(d.this);
            if (p != null) {
                p.g();
            }
            d.a(d.this, (o) null);
            MarginSupportFrameLayout n3 = d.n(d.this);
            if (n3 != null) {
                n3.removeAllViews();
            } else {
                q.b("tab3Container");
                throw null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String aL = d.this.b().aL();
            if (aL == null) {
                return;
            }
            l.a(d.this.a(), aL);
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String aN = d.this.b().aN();
            if (aN == null) {
                return;
            }
            l.a(d.this.a(), aN);
        }
    }

    static {
        kge.a(219301283);
        Companion = new f(null);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
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
            case 61439052:
                return new Boolean(super.A());
            case 69750737:
                super.J();
                return null;
            case 70674258:
                super.K();
                return null;
            case 114079749:
                return new Boolean(super.z());
            case 407727923:
                super.onPageSelected(((Number) objArr[0]).intValue());
                return null;
            case 849650597:
                super.b((View) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            case 1176808989:
                super.onSwipeUp();
                return null;
            case 1359991944:
                super.a((Configuration) objArr[0]);
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
        return true;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be50d37f", new Object[]{this, new Boolean(z)});
        }
    }

    /* loaded from: classes3.dex */
    public static final class f {
        static {
            kge.a(1307427115);
        }

        public /* synthetic */ f(kotlin.jvm.internal.o oVar) {
            this();
        }

        private f() {
        }
    }

    public static final /* synthetic */ void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400ef630", new Object[]{dVar});
        } else {
            dVar.X();
        }
    }

    public static final /* synthetic */ void a(d dVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7838ca61", new Object[]{dVar, new Integer(i), new Boolean(z)});
        } else {
            dVar.a(i, z);
        }
    }

    public static final /* synthetic */ void a(d dVar, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64ea7cc6", new Object[]{dVar, aVar, layoutParams});
        } else {
            dVar.a(aVar, layoutParams);
        }
    }

    public static final /* synthetic */ void a(d dVar, o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b17c6a2b", new Object[]{dVar, oVar});
        } else {
            dVar.T = oVar;
        }
    }

    public static final /* synthetic */ void a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d082a4", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.D = z;
        }
    }

    public static final /* synthetic */ void b(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b56006e5", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.s(z);
        }
    }

    public static final /* synthetic */ void c(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688bd56e", new Object[]{dVar});
        } else {
            dVar.aa();
        }
    }

    public static final /* synthetic */ void c(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ef8b26", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.I = z;
        }
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.g d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.g) ipChange.ipc$dispatch("ee22f79e", new Object[]{dVar}) : dVar.S;
    }

    public static final /* synthetic */ boolean j(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7640e2cb", new Object[]{dVar})).booleanValue() : dVar.H;
    }

    public static final /* synthetic */ PerceptionSizeFrameLayout k(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PerceptionSizeFrameLayout) ipChange.ipc$dispatch("15c68f6f", new Object[]{dVar}) : dVar.k;
    }

    public static final /* synthetic */ MarginSupportFrameLayout n(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MarginSupportFrameLayout) ipChange.ipc$dispatch("585f65c3", new Object[]{dVar}) : dVar.t;
    }

    public static final /* synthetic */ o p(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("ea0e4d4c", new Object[]{dVar}) : dVar.T;
    }

    public static final /* synthetic */ PerceptionLinearLayout q(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PerceptionLinearLayout) ipChange.ipc$dispatch("39227f08", new Object[]{dVar}) : dVar.m;
    }

    public static final /* synthetic */ boolean r(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18345fc3", new Object[]{dVar})).booleanValue() : dVar.F;
    }

    public static final /* synthetic */ boolean s(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac72cf62", new Object[]{dVar})).booleanValue() : dVar.G;
    }

    public static final /* synthetic */ View v(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bfe5bdbd", new Object[]{dVar}) : dVar.r;
    }

    public static final /* synthetic */ ShopSwipeListenerLayout w(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopSwipeListenerLayout) ipChange.ipc$dispatch("824e7d12", new Object[]{dVar}) : dVar.h;
    }

    public static final /* synthetic */ void z(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba27dcb7", new Object[]{dVar});
        } else {
            dVar.af();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public com.alibaba.triver.triver_shop.newShop.view.component.f aD() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.view.component.f) ipChange.ipc$dispatch("ac9b8210", new Object[]{this}) : new com.alibaba.triver.triver_shop.newShop.view.component.f(0, SecExceptionCode.SEC_ERROR_INIT_CLAZZ_NULL_ERROR);
    }

    public final void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36f5d5c", new Object[]{this, new Boolean(z)});
        } else {
            this.w = z;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void a(FragmentActivity context, com.alibaba.triver.triver_shop.newShop.data.d shopData, com.alibaba.triver.triver_shop.newShop.ext.e shopDXEngine) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18ba9ff", new Object[]{this, context, shopData, shopDXEngine});
            return;
        }
        q.d(context, "context");
        q.d(shopData, "shopData");
        q.d(shopDXEngine, "shopDXEngine");
        cei ceiVar = new cei();
        try {
            Result.a aVar = Result.Companion;
            this.V = shopData.bc().k();
            q(cen.Companion.P());
            this.D = cen.Companion.G();
            this.F = shopData.D();
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
        this.H = shopData.aq();
        if (this.H) {
            shopData.e(false);
            this.F = false;
            ceg.Companion.b("alwaysShowHeader true , enableFullScreenPageCanPullDownHeader false");
        }
        if (shopData.aV()) {
            this.x = 0;
        }
        shopData.G().b(new FlagShipContentComponentV2$initComponent$2(this));
        context.getLifecycle().addObserver(I());
        super.a(context, shopData, shopDXEngine);
        this.E = shopData.aG();
        int f2 = (this.x << 1) + com.alibaba.triver.triver_shop.newShop.ext.o.f(Integer.valueOf(m()));
        int i = this.x;
        int i2 = (i << 1) + 50;
        if (this.H) {
            f2 += com.alibaba.triver.triver_shop.newShop.ext.o.f(Integer.valueOf(com.alibaba.triver.triver_shop.newShop.ext.o.a(Integer.valueOf(i + 8))));
        }
        shopData.b(f2);
        shopData.a(i2);
        if (cen.Companion.O() && Build.VERSION.SDK_INT >= 21) {
            z = true;
        }
        this.C = z;
        l.a((Activity) context, true);
        ae();
        shopData.b(g.KEY_INIT_SHOP_BASE_VIEW, Long.valueOf(ceiVar.a()));
        ceiVar.b();
        W();
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            q.b("bigCardContainer");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.a(viewGroup, G());
        ab();
        ad();
        shopData.b(g.KEY_INIT_SHOP_TEMPLATE_COMPONENT_COST, Long.valueOf(ceiVar.a()));
    }

    private final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df815e", new Object[]{this});
            return;
        }
        String aR = b().aR();
        if (b().bc().b()) {
            b().d(true);
        }
        ceg.Companion.b(q.a("shopSignType : ", (Object) aR));
        if (aR != null) {
            switch (aR.hashCode()) {
                case -187499722:
                    if (aR.equals("bgVideo")) {
                        V();
                        break;
                    }
                    break;
                case 2908512:
                    if (aR.equals("carousel")) {
                        Z();
                        break;
                    }
                    break;
                case 3148801:
                    if (aR.equals(itk.TYPE_FOLD)) {
                        return;
                    }
                    break;
                case 3327377:
                    if (aR.equals("loft")) {
                        S();
                        break;
                    }
                    break;
                case 93653765:
                    if (aR.equals("bgPic")) {
                        U();
                        break;
                    }
                    break;
                case 1630978260:
                    if (aR.equals("singleModule")) {
                        T();
                        break;
                    }
                    break;
            }
        }
        S();
        T();
        V();
        U();
        if ((!q() || t()) && !s()) {
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

    public final void S() {
        View i;
        EmbedShopLoftComponent embedShopLoftComponent;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
        } else if (q() || l.b()) {
        } else {
            c(b().ac());
            if (!q()) {
                return;
            }
            d(true);
            this.M = new EmbedShopLoftComponent(a(), b(), c());
            if (b().bc().b() && (embedShopLoftComponent = this.M) != null) {
                embedShopLoftComponent.a(new FlagShipContentComponentV2$createShopLoftBigCard$1(this));
            }
            EmbedShopLoftComponent embedShopLoftComponent2 = this.M;
            if (embedShopLoftComponent2 != null) {
                embedShopLoftComponent2.a(new FlagShipContentComponentV2$createShopLoftBigCard$2(this));
            }
            EmbedShopLoftComponent embedShopLoftComponent3 = this.M;
            if (embedShopLoftComponent3 != null) {
                embedShopLoftComponent3.a(G() / com.alibaba.triver.triver_shop.newShop.ext.o.a());
            }
            EmbedShopLoftComponent embedShopLoftComponent4 = this.M;
            if (embedShopLoftComponent4 != null && (i = embedShopLoftComponent4.i()) != null) {
                ViewGroup viewGroup = this.l;
                if (viewGroup == null) {
                    q.b("bigCardContainer");
                    throw null;
                }
                com.alibaba.triver.triver_shop.newShop.ext.o.a(viewGroup, i);
            }
            this.L.b(true);
            EmbedShopLoftComponent embedShopLoftComponent5 = this.M;
            if (embedShopLoftComponent5 == null || !embedShopLoftComponent5.c()) {
                z = false;
            }
            if (!z) {
                return;
            }
            i(false);
        }
    }

    private final void X() {
        EmbedShopLoftComponent e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed98df", new Object[]{this});
            return;
        }
        Pair<Integer, Integer> c2 = b().c("live");
        if (c2 != null) {
            a(c2.getFirst().intValue(), c2.getSecond().intValue(), "live");
            this.J = true;
            return;
        }
        ceg.Companion.b("do not find live tab");
        EmbedShopLoftComponent embedShopLoftComponent = this.M;
        if (embedShopLoftComponent != null) {
            embedShopLoftComponent.e();
        }
        com.alibaba.triver.triver_shop.newShop.view.embed.c cVar = this.N;
        if (cVar == null || (e2 = cVar.e()) == null) {
            return;
        }
        e2.e();
    }

    private final boolean Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4fbb064", new Object[]{this})).booleanValue() : b().o() == 0 && o();
    }

    private final void Z() {
        EnhancedViewPager b2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509c7e1", new Object[]{this});
        } else if (q() || l.b()) {
        } else {
            e(b().aY());
            if (!s()) {
                return;
            }
            c(true);
            com.alibaba.triver.triver_shop.d.INSTANCE.a(b());
            com.alibaba.triver.triver_shop.newShop.view.embed.c cVar = new com.alibaba.triver.triver_shop.newShop.view.embed.c();
            cVar.a(new FlagShipContentComponentV2$createSwipeBigCard$1(this));
            cVar.b(new FlagShipContentComponentV2$createSwipeBigCard$2(this));
            this.N = cVar;
            cVar.a(b(), c(), a());
            if (b().bc().b()) {
                cVar.e().a(new FlagShipContentComponentV2$createSwipeBigCard$3(this));
            }
            cVar.e().a(G() / com.alibaba.triver.triver_shop.newShop.ext.o.a());
            this.L.b(true);
            if (cVar.e().c()) {
                i(false);
            }
            JSONArray aT = b().aT();
            if (aT != null) {
                i = aT.size();
            }
            boolean k = cVar.k();
            if (i > 1) {
                d(k);
                f(true);
            } else if (k) {
                d(true);
            } else {
                f(true);
            }
            com.alibaba.triver.triver_shop.newShop.view.embed.c cVar2 = this.N;
            if (cVar2 != null && (b2 = cVar2.b()) != null) {
                b2.addOnPageChangeListener(new C0143d(i, k, this));
            }
            ViewGroup viewGroup = this.l;
            if (viewGroup != null) {
                com.alibaba.triver.triver_shop.newShop.ext.o.a(viewGroup, cVar.a());
            } else {
                q.b("bigCardContainer");
                throw null;
            }
        }
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.component.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0143d implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3939a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ d c;

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

        public C0143d(int i, boolean z, d dVar) {
            this.f3939a = i;
            this.b = z;
            this.c = dVar;
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            } else if (this.f3939a <= 1 || !this.b) {
            } else {
                if (!d.d(this.c).g()) {
                    ceg.Companion.b("shopHeaderLoftComponent not init , stop operation");
                    return;
                }
                d dVar = this.c;
                if (i == 0) {
                    z = true;
                }
                d.a(dVar, z);
                if (i == 0) {
                    com.alibaba.triver.triver_shop.newShop.ext.o.b(d.d(this.c).f());
                } else {
                    com.alibaba.triver.triver_shop.newShop.ext.o.e(d.d(this.c).f());
                }
            }
        }
    }

    public final void T() {
        String aO;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53adb", new Object[]{this});
        } else if (q() || (aO = b().aO()) == null || l.b()) {
        } else {
            c(true);
            f(true);
            i(false);
            com.alibaba.triver.triver_shop.newShop.view.embed.b bVar = new com.alibaba.triver.triver_shop.newShop.view.embed.b(a());
            bVar.a(b());
            String valueOf = String.valueOf(com.alibaba.triver.triver_shop.newShop.ext.o.f(Integer.valueOf(m())) + 112);
            String valueOf2 = String.valueOf((this.x << 1) + 50);
            b().c("immersive_webview_load_start", Long.valueOf(System.currentTimeMillis()));
            Uri.Builder buildUpon = Uri.parse(aO).buildUpon();
            Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("paddingTopAndBottom", valueOf + ',' + valueOf2);
            if (b().aX() > 1) {
                z = true;
            }
            bVar.a(appendQueryParameter.appendQueryParameter("hasNav", String.valueOf(z)).build().toString());
            ViewGroup viewGroup = this.l;
            if (viewGroup != null) {
                com.alibaba.triver.triver_shop.newShop.ext.o.a(viewGroup, bVar.a());
            } else {
                q.b("bigCardContainer");
                throw null;
            }
        }
    }

    private final void aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf280a7", new Object[]{this});
        } else if (b().o() != 0 || !o()) {
        } else {
            onSwipeUp();
        }
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3525c", new Object[]{this});
        } else if (q()) {
        } else {
            ClickView clickView = new ClickView(a());
            String aK = b().aK();
            if (aK == null) {
                return;
            }
            if (aK.length() == 0) {
                z = true;
            }
            if (z) {
                return;
            }
            TUrlImageView tUrlImageView = new TUrlImageView(a());
            tUrlImageView.setImageUrl(aK);
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ViewGroup viewGroup = this.l;
            if (viewGroup == null) {
                q.b("bigCardContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.a(viewGroup, tUrlImageView);
            clickView.setOnClickListener(new c());
            ViewGroup viewGroup2 = this.l;
            if (viewGroup2 == null) {
                q.b("bigCardContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.a(viewGroup2, clickView);
            c(true);
        }
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
        } else if (q()) {
        } else {
            ClickView clickView = new ClickView(a());
            String aM = b().aM();
            if (aM == null) {
                return;
            }
            if ((aM.length() == 0) || l.b()) {
                return;
            }
            c(true);
            MiniVideoLoftView miniVideoLoftView = new MiniVideoLoftView();
            miniVideoLoftView.initWithData(a(), com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("videoUrl", aM), j.a("autoRelease", true)), null, null);
            miniVideoLoftView.didAppear();
            miniVideoLoftView.mute(true);
            View view = miniVideoLoftView.getView();
            if (view == null) {
                return;
            }
            ViewGroup viewGroup = this.l;
            if (viewGroup == null) {
                q.b("bigCardContainer");
                throw null;
            }
            viewGroup.addView(view);
            clickView.setOnClickListener(new e());
            ViewGroup viewGroup2 = this.l;
            if (viewGroup2 != null) {
                com.alibaba.triver.triver_shop.newShop.ext.o.a(viewGroup2, clickView);
            } else {
                q.b("bigCardContainer");
                throw null;
            }
        }
    }

    private final void ab() {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab009828", new Object[]{this});
            return;
        }
        boolean bo = b().bo();
        this.K = new com.alibaba.triver.triver_shop.newShop.manager.d(a(), b(), q(), new FlagShipContentComponentV2$initTemplateComponent$1(this));
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
        if (perceptionSizeFrameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.manager.d dVar = this.K;
        if (dVar == null) {
            q.b("newBottomBarAndIndexNavManager");
            throw null;
        }
        perceptionSizeFrameLayout.addView(dVar.a());
        this.z = com.alibaba.triver.triver_shop.newShop.ext.o.a(Integer.valueOf(this.x));
        PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
        if (perceptionSizeFrameLayout2 == null) {
            q.b("navViewContainer");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.a(perceptionSizeFrameLayout2, this.z);
        if (this.z == 0 || bo) {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.k;
            if (perceptionSizeFrameLayout3 == null) {
                q.b("navViewContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.a(perceptionSizeFrameLayout3, 0);
        }
        this.L.a(new FlagShipContentComponentV2$initTemplateComponent$2(this));
        this.L.a(a(), b(), c(), null);
        PerceptionLinearLayout perceptionLinearLayout = this.m;
        if (perceptionLinearLayout == null) {
            q.b("shopHeaderContainer");
            throw null;
        }
        perceptionLinearLayout.addView(this.L.f());
        JSONObject V = b().V();
        if (V != null && (jSONArray = V.getJSONArray("tagList")) != null) {
            i = jSONArray.size();
        }
        if (i > 0) {
            this.Y = true;
            this.ab = new m(b());
            m mVar = this.ab;
            if (mVar != null) {
                mVar.a(new FlagShipContentComponentV2$initTemplateComponent$3(this));
            }
            m mVar2 = this.ab;
            if (mVar2 != null) {
                PerceptionLinearLayout perceptionLinearLayout2 = this.m;
                if (perceptionLinearLayout2 == null) {
                    q.b("shopHeaderContainer");
                    throw null;
                }
                mVar2.a(perceptionLinearLayout2, V, s());
            }
            this.X = m.Companion.a();
            if (q() && !s()) {
                ay();
            }
        }
        this.R.a(new FlagShipContentComponentV2$initTemplateComponent$4(this));
        this.R.a(a(), b(), c(), null);
        ViewGroup viewGroup = this.j;
        if (viewGroup == null) {
            q.b("tabBarContainer");
            throw null;
        }
        viewGroup.addView(this.R.f());
        if (bo) {
            ViewGroup viewGroup2 = this.j;
            if (viewGroup2 == null) {
                q.b("tabBarContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.d(viewGroup2);
        }
        View f2 = this.L.f();
        com.alibaba.triver.triver_shop.newShop.manager.d dVar2 = this.K;
        if (dVar2 != null) {
            this.W = new com.alibaba.triver.triver_shop.newShop.view.component.nativeview.b(f2, dVar2.a(), this.R.f());
            com.alibaba.triver.triver_shop.newShop.view.component.nativeview.b bVar = this.W;
            if (bVar != null) {
                ShopSwipeListenerLayout shopSwipeListenerLayout = this.i;
                if (shopSwipeListenerLayout == null) {
                    q.b("centerContainer");
                    throw null;
                }
                bVar.a(shopSwipeListenerLayout);
            }
            com.alibaba.triver.triver_shop.newShop.view.component.nativeview.b bVar2 = this.W;
            if (bVar2 == null) {
                return;
            }
            bVar2.b(d());
            return;
        }
        q.b("newBottomBarAndIndexNavManager");
        throw null;
    }

    private final boolean w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdac711a", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            if (ar()) {
                return false;
            }
        } else if (!ar()) {
            return false;
        }
        com.alibaba.triver.triver_shop.newShop.view.component.nativeview.b bVar = this.W;
        if (bVar != null) {
            bVar.a(z);
        }
        v(z);
        u(false);
        EnhancedViewPager enhancedViewPager = this.f;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCanScroll(!z);
            return true;
        }
        q.b("contentViewPager");
        throw null;
    }

    private final void ac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0eafa9", new Object[]{this});
            return;
        }
        ceg.Companion.b("continueInitSHopLoftBigCard");
        if (b().u()) {
            ShopComponentModel f2 = new d.c(b()).f();
            if (f2 == null) {
                return;
            }
            com.alibaba.triver.triver_shop.shop2023.template.g gVar = new com.alibaba.triver.triver_shop.shop2023.template.g(f2, false, !b().bw(), 2, null);
            gVar.a(new FlagShipContentComponentV2$continueInitShopLoftBigCard$1$1$1(this, gVar));
            gVar.a(a(), b(), c(), null);
            ViewGroup viewGroup = this.l;
            if (viewGroup != null) {
                viewGroup.addView(gVar.f(), com.alibaba.triver.triver_shop.newShop.ext.o.a(0, com.alibaba.triver.triver_shop.newShop.ext.o.e(Integer.valueOf(f2.getRenderHeight())), 0, this.z + (gVar.a().bw() ? com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 10) : cek.Companion.a()), 0, 0, 80, 53, null));
                return;
            } else {
                q.b("bigCardContainer");
                throw null;
            }
        }
        this.S.a(new FlagShipContentComponentV2$continueInitShopLoftBigCard$2(this));
        this.S.a(a(), b(), c(), null);
    }

    private final void a(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50fe2fe", new Object[]{this, aVar, layoutParams});
        } else if (this.y != 0 && this.A != 0) {
        } else {
            if (aVar instanceof com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.f) {
                this.y = aVar.j().height;
                com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.f fVar = this.L;
                a(fVar, fVar.l());
            }
            if (aVar instanceof com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.b) {
                this.A = aVar.j().height;
                com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.b bVar = this.R;
                a(bVar, bVar.l());
            }
            if (this.y == 0 || this.A == 0) {
                return;
            }
            F();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void F() {
        com.alibaba.triver.triver_shop.newShop.view.embed.c cVar;
        EmbedShopLoftComponent e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        b().d(m() + this.y);
        com.alibaba.triver.triver_shop.newShop.data.d b2 = b();
        int i = this.A;
        ViewGroup viewGroup = this.j;
        if (viewGroup == null) {
            q.b("tabBarContainer");
            throw null;
        }
        b2.c(i + com.alibaba.triver.triver_shop.newShop.ext.o.f(Integer.valueOf(com.alibaba.triver.triver_shop.newShop.ext.o.i(viewGroup))));
        if (q() && C()) {
            int G = G();
            if (t()) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
                if (perceptionSizeFrameLayout == null) {
                    q.b("navViewContainer");
                    throw null;
                } else {
                    com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionSizeFrameLayout, (G - this.z) - cek.Companion.a());
                    this.B = (G - this.z) - cek.Companion.a();
                }
            } else {
                this.B = (G - this.z) - (H() ? cek.Companion.a() : 0);
                PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
                if (perceptionSizeFrameLayout2 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionSizeFrameLayout2, this.B);
                int a2 = this.z + cek.Companion.a();
                if (s() && (cVar = this.N) != null && (e2 = cVar.e()) != null) {
                    e2.b(a2);
                }
                EmbedShopLoftComponent embedShopLoftComponent = this.M;
                if (embedShopLoftComponent != null) {
                    embedShopLoftComponent.b(a2);
                }
            }
            if (r()) {
                ac();
            }
        } else {
            int m = this.y + m() + this.X;
            PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.k;
            if (perceptionSizeFrameLayout3 == null) {
                q.b("navViewContainer");
                throw null;
            } else {
                com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionSizeFrameLayout3, m);
                this.B = m;
            }
        }
        com.alibaba.triver.triver_shop.newShop.data.d b3 = b();
        int i2 = this.A;
        ViewGroup viewGroup2 = this.j;
        if (viewGroup2 != null) {
            b3.a(com.alibaba.triver.triver_shop.newShop.ext.o.f(Integer.valueOf(i2 + com.alibaba.triver.triver_shop.newShop.ext.o.i(viewGroup2))));
            if (i() == 0) {
                cej cejVar = this.p;
                if (cejVar == null) {
                    q.b("shopContainerPageAdapter");
                    throw null;
                }
                cejVar.a(i());
            }
            if (this.E) {
                com.alibaba.triver.triver_shop.newShop.ext.b.d(new FlagShipContentComponentV2$allTemplateLoadFinish$1(this));
            }
            if (i() == 0) {
                onPageSelected(i());
                return;
            }
            if (this.H && b().p() == 0 && b().b(b().p(), b().q())) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout4 = this.k;
                if (perceptionSizeFrameLayout4 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionSizeFrameLayout4, this.y + m());
            }
            EnhancedViewPager enhancedViewPager = this.f;
            if (enhancedViewPager != null) {
                enhancedViewPager.setCurrentItem(i(), false);
                return;
            } else {
                q.b("contentViewPager");
                throw null;
            }
        }
        q.b("tabBarContainer");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ad() {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.view.component.d.ad():void");
    }

    public final void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52435fb", new Object[]{this, new Boolean(z)});
            return;
        }
        ShopSwipeListenerLayout shopSwipeListenerLayout = this.i;
        if (shopSwipeListenerLayout != null) {
            com.alibaba.triver.triver_shop.newShop.ext.o.a(shopSwipeListenerLayout, z, cek.Companion.a());
        } else {
            q.b("centerContainer");
            throw null;
        }
    }

    private final void ae() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2adeab", new Object[]{this});
            return;
        }
        View a2 = com.alibaba.triver.triver_shop.newShop.ext.o.a(a(), R.layout.view_new_shop_view_flag_ship);
        if (a2 == null) {
            return;
        }
        View findViewById = a2.findViewById(R.id.new_shop_view_center_container_white_frame);
        q.b(findViewById, "contentView.findViewById(R.id.new_shop_view_center_container_white_frame)");
        this.r = findViewById;
        View findViewById2 = a2.findViewById(R.id.new_shop_view_center_container);
        ShopSwipeListenerLayout shopSwipeListenerLayout = (ShopSwipeListenerLayout) findViewById2;
        shopSwipeListenerLayout.setNormalMode(true);
        t tVar = t.INSTANCE;
        q.b(findViewById2, "contentView.findViewById<ShopSwipeListenerLayout?>(R.id.new_shop_view_center_container)\n                .apply {\n//                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {\n//                        FlagShipDrawable.getCenterContainerOutLineProvider(true)?.let {\n//                            this.outlineProvider = it as ViewOutlineProvider\n//                        }\n//                        this.clipToOutline = true\n//                    }\n                    this.normalMode = true\n                }");
        this.i = shopSwipeListenerLayout;
        r(true);
        View findViewById3 = a2.findViewById(R.id.new_shop_view_status_bar_view);
        q.b(findViewById3, "contentView.findViewById(R.id.new_shop_view_status_bar_view)");
        this.g = findViewById3;
        View findViewById4 = a2.findViewById(R.id.new_shop_view_tab_bar_container);
        q.b(findViewById4, "contentView.findViewById(R.id.new_shop_view_tab_bar_container)");
        this.j = (ViewGroup) findViewById4;
        View findViewById5 = a2.findViewById(R.id.new_shop_view_big_card_view_container);
        q.b(findViewById5, "contentView.findViewById(R.id.new_shop_view_big_card_view_container)");
        this.l = (ViewGroup) findViewById5;
        View findViewById6 = a2.findViewById(R.id.new_shop_view_nav_view_container);
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = (PerceptionSizeFrameLayout) findViewById6;
        d dVar = this;
        perceptionSizeFrameLayout.setViewSizeChangedListener(dVar);
        t tVar2 = t.INSTANCE;
        q.b(findViewById6, "contentView.findViewById<PerceptionSizeFrameLayout?>(R.id.new_shop_view_nav_view_container)\n                .apply {\n                    viewSizeChangedListener = this@FlagShipContentComponentV2\n                }");
        this.k = perceptionSizeFrameLayout;
        View findViewById7 = a2.findViewById(R.id.new_shop_view_header_view_container);
        PerceptionLinearLayout perceptionLinearLayout = (PerceptionLinearLayout) findViewById7;
        perceptionLinearLayout.setViewSizeChangedListener(dVar);
        t tVar3 = t.INSTANCE;
        q.b(findViewById7, "contentView.findViewById<PerceptionLinearLayout?>(R.id.new_shop_view_header_view_container)\n                .apply {\n                    viewSizeChangedListener = this@FlagShipContentComponentV2\n                }");
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
        q.b(findViewById8, "contentView.findViewById<TUrlImageView?>(R.id.new_shop_view_backGround_img).apply {\n                this.imageUrl =\n                    shopData.getShopCommonAtmospherePicUrl() ?: ShopExt.DEFAULT_2022_BG_IMG_URL\n                this.scaleType = ImageView.ScaleType.CENTER_CROP\n            }");
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
        q.b(findViewById10, "contentView.findViewById<TUrlImageView?>(R.id.new_shop_view_loft_atmosphere_bg).apply {\n                shopData.getLoftAtmospherePicUrl()?.isNotEmpty {\n                    this.imageUrl = it\n                }\n            }");
        this.s = tUrlImageView2;
        View findViewById11 = a2.findViewById(R.id.new_shop_view_tab3_container);
        q.b(findViewById11, "contentView.findViewById(R.id.new_shop_view_tab3_container)");
        this.t = (MarginSupportFrameLayout) findViewById11;
        EnhancedViewPager enhancedViewPager = new EnhancedViewPager(a());
        enhancedViewPager.setId(R.id.new_shop_view_view_pager);
        com.alibaba.triver.triver_shop.newShop.view.provider.c cVar = new com.alibaba.triver.triver_shop.newShop.view.provider.c(b());
        this.v = cVar.b();
        ceg.Companion.b(q.a("hasFullScreenPage : ", (Object) Boolean.valueOf(this.v)));
        this.f = enhancedViewPager;
        EnhancedViewPager enhancedViewPager2 = this.f;
        if (enhancedViewPager2 == null) {
            q.b("contentViewPager");
            throw null;
        }
        enhancedViewPager2.setOffscreenPageLimit(cVar.a() - 1);
        FragmentManager supportFragmentManager = a().getSupportFragmentManager();
        q.b(supportFragmentManager, "context.supportFragmentManager");
        this.p = new cej(supportFragmentManager);
        cej cejVar = this.p;
        if (cejVar == null) {
            q.b("shopContainerPageAdapter");
            throw null;
        }
        cejVar.a(cVar);
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
        com.alibaba.triver.triver_shop.newShop.ext.o.a(shopSwipeListenerLayout2, enhancedViewPager);
        ShopSwipeListenerLayout shopSwipeListenerLayout3 = new ShopSwipeListenerLayout(a());
        this.h = shopSwipeListenerLayout3;
        shopSwipeListenerLayout3.setSwipeListener(this);
        com.alibaba.triver.triver_shop.newShop.ext.o.a(shopSwipeListenerLayout3, a2);
        shopSwipeListenerLayout3.setInCenterContainerFlag(false);
        shopSwipeListenerLayout3.setScrollThreshold(85);
        com.alibaba.triver.triver_shop.newShop.ext.o.a(d(), shopSwipeListenerLayout3);
        View view = this.g;
        if (view == null) {
            q.b(a5.f3362a);
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.a(view, m());
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            q.b("bigCardContainer");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.a(viewGroup, G());
        PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
        if (perceptionSizeFrameLayout2 != null) {
            com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionSizeFrameLayout2, com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 88) + m());
        } else {
            q.b("navViewContainer");
            throw null;
        }
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

    private final void aq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd3f8b7", new Object[]{this});
            return;
        }
        int aB = aB();
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
        if (perceptionSizeFrameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        float h = 1 - ((aB - com.alibaba.triver.triver_shop.newShop.ext.o.h(perceptionSizeFrameLayout)) / az());
        View aA = aA();
        if (aA == null) {
            return;
        }
        aA.setAlpha(h);
    }

    private final View aA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4fc3b509", new Object[]{this});
        }
        i iVar = this.aa;
        View f2 = iVar == null ? null : iVar.f();
        if (f2 != null) {
            return f2;
        }
        m mVar = this.ab;
        if (mVar != null) {
            return mVar.a();
        }
        return null;
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
        ShopSwipeListenerLayout shopSwipeListenerLayout = this.h;
        if (shopSwipeListenerLayout == null) {
            q.b("outerSwiperLayout");
            throw null;
        } else if (q.a((Object) shopSwipeListenerLayout.isFirstHorizontalScroll(), (Object) true) || this.U || this.G || !this.D) {
        } else {
            if ((!r() && !this.Y) || p()) {
                return;
            }
            if (!v() && (aC() || az() == 0)) {
                return;
            }
            this.Z = true;
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
            if (perceptionSizeFrameLayout == null) {
                q.b("navViewContainer");
                throw null;
            }
            int h = com.alibaba.triver.triver_shop.newShop.ext.o.h(perceptionSizeFrameLayout) - i;
            ViewGroup viewGroup = this.l;
            if (viewGroup == null) {
                q.b("bigCardContainer");
                throw null;
            }
            int height = viewGroup.getHeight() - i;
            if (h <= aB()) {
                aq();
                if (h < aB() - az()) {
                    h = aB() - az();
                }
                height = G();
            }
            ViewGroup viewGroup2 = this.l;
            if (viewGroup2 == null) {
                q.b("bigCardContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.a(viewGroup2, height);
            PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
            if (perceptionSizeFrameLayout2 != null) {
                com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionSizeFrameLayout2, h);
            } else {
                q.b("navViewContainer");
                throw null;
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void b(View fromTargetView, MotionEvent event, int i) {
        EmbedShopLoftComponent e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a4a3a5", new Object[]{this, fromTargetView, event, new Integer(i)});
            return;
        }
        q.d(fromTargetView, "fromTargetView");
        q.d(event, "event");
        super.b(fromTargetView, event, i);
        ShopSwipeListenerLayout shopSwipeListenerLayout = this.h;
        if (shopSwipeListenerLayout == null) {
            q.b("outerSwiperLayout");
            throw null;
        } else if (q.a((Object) shopSwipeListenerLayout.isFirstHorizontalScroll(), (Object) true) || this.U || this.G || !this.I || !this.D) {
        } else {
            if ((!r() && this.Y && aC()) || p() || !o() || !b().m(b().K())) {
                return;
            }
            this.Z = true;
            k(false);
            if (aC()) {
                h(true);
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
                if (perceptionSizeFrameLayout == null) {
                    q.b("navViewContainer");
                    throw null;
                } else if ((com.alibaba.triver.triver_shop.newShop.ext.o.h(perceptionSizeFrameLayout) + i) - aB() >= 350) {
                    if (b().u()) {
                        B();
                        X();
                        h.g(b());
                    } else {
                        if (s()) {
                            com.alibaba.triver.triver_shop.newShop.view.embed.c cVar = this.N;
                            if (cVar != null && (e2 = cVar.e()) != null) {
                                e2.e();
                            }
                        } else {
                            EmbedShopLoftComponent embedShopLoftComponent = this.M;
                            if (embedShopLoftComponent != null) {
                                embedShopLoftComponent.e();
                            }
                        }
                        B();
                    }
                    this.I = false;
                    com.alibaba.triver.triver_shop.newShop.ext.b.a(new FlagShipContentComponentV2$onParentSwipeDown$1(this), 500L);
                } else {
                    aq();
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
                    com.alibaba.triver.triver_shop.newShop.ext.o.a(viewGroup2, viewGroup.getHeight() + i);
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
                    if (perceptionSizeFrameLayout2 == null) {
                        q.b("navViewContainer");
                        throw null;
                    }
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = perceptionSizeFrameLayout2;
                    if (perceptionSizeFrameLayout2 != null) {
                        com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionSizeFrameLayout3, com.alibaba.triver.triver_shop.newShop.ext.o.h(perceptionSizeFrameLayout2) + i);
                    } else {
                        q.b("navViewContainer");
                        throw null;
                    }
                }
            } else if (!this.Y) {
            } else {
                h(true);
                PerceptionSizeFrameLayout perceptionSizeFrameLayout4 = this.k;
                if (perceptionSizeFrameLayout4 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                if (com.alibaba.triver.triver_shop.newShop.ext.o.h(perceptionSizeFrameLayout4) + i > aB()) {
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout5 = this.k;
                    if (perceptionSizeFrameLayout5 == null) {
                        q.b("navViewContainer");
                        throw null;
                    }
                    com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionSizeFrameLayout5, aB());
                } else {
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout6 = this.k;
                    if (perceptionSizeFrameLayout6 == null) {
                        q.b("navViewContainer");
                        throw null;
                    }
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout7 = perceptionSizeFrameLayout6;
                    if (perceptionSizeFrameLayout6 == null) {
                        q.b("navViewContainer");
                        throw null;
                    }
                    com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionSizeFrameLayout7, com.alibaba.triver.triver_shop.newShop.ext.o.h(perceptionSizeFrameLayout6) + i);
                }
                aq();
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        boolean z = this.Z;
        this.Z = false;
        k(true);
        if (!this.D) {
            return;
        }
        if (!v() && az() == 0) {
            return;
        }
        if (az() != 0 && !this.G && z) {
            if (v()) {
                at();
            } else {
                ay();
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
                if (perceptionSizeFrameLayout == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionSizeFrameLayout, aB() - az());
            }
        }
        if (!v()) {
            return;
        }
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            q.b("bigCardContainer");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.a(viewGroup, G());
        PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
        if (perceptionSizeFrameLayout2 == null) {
            q.b("navViewContainer");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionSizeFrameLayout2, aB());
        h(false);
    }

    private final int aB() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a93da7fb", new Object[]{this})).intValue();
        }
        if (C() && q()) {
            int G = G();
            if (t()) {
                return (G - this.z) - cek.Companion.a();
            }
            int i2 = G - this.z;
            if (H()) {
                i = cek.Companion.a();
            }
            return i2 - i;
        }
        return this.y + m() + this.X;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue();
        }
        if (this.U) {
            return false;
        }
        if (this.H && (!C() || !q())) {
            return false;
        }
        if (this.C && this.G && !this.F) {
            return false;
        }
        return super.A();
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
        aj();
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
        if (aC() && !b().m(b().d(k(), b().j(l())))) {
            return;
        }
        ak();
    }

    private final boolean aC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a94bbf8d", new Object[]{this})).booleanValue() : q() && C();
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
        int f2 = b().f(i, i2);
        EnhancedViewPager enhancedViewPager = this.f;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCurrentItem(f2, false);
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
        int j2 = b().j(l());
        int k = k();
        int i2 = b().i(l());
        int j3 = b().j(i);
        b().a(j3, i2);
        ceg.a aVar = ceg.Companion;
        aVar.b("flag ship , on page selected , newTab = " + i2 + ", newSub = " + j3 + " , oldTab = " + k + ", position : " + i);
        this.G = b().b(b().o(), b().n());
        r(this.G ^ true);
        boolean o = o();
        d(i2);
        if (k() != 0) {
            this.u = true;
        }
        if (!this.E) {
            af();
        }
        com.alibaba.triver.triver_shop.newShop.manager.d dVar = this.K;
        if (dVar == null) {
            q.b("newBottomBarAndIndexNavManager");
            throw null;
        }
        dVar.a(i2, i);
        this.L.d(true);
        this.R.a(k());
        if (k == 0 && i2 != 0) {
            ah();
        }
        if (k != 0 && i2 == 0) {
            b(k, j);
        }
        if (k != 0 && i2 != 0) {
            ai();
        }
        if (Build.VERSION.SDK_INT >= 21 && this.C && this.v) {
            a(k, j, i2, j2);
        } else if (i2 != k) {
            u(false);
        }
        if (!this.E) {
            rvb<Integer, Integer, Integer, Integer, t> f2 = f();
            if (f2 != null) {
                f2.invoke(Integer.valueOf(i2), Integer.valueOf(j3), Integer.valueOf(k), Integer.valueOf(j));
            }
        } else {
            this.E = false;
        }
        a(false);
        L();
        a(k, j, o);
        if (aC()) {
            m mVar = this.ab;
            if (mVar == null) {
                return;
            }
            mVar.a(true);
            return;
        }
        m mVar2 = this.ab;
        if (mVar2 == null) {
            return;
        }
        mVar2.a(false);
    }

    private final void a(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619b90c", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (com.alibaba.triver.triver_shop.newShop.ext.i.c(b().d(i, i2))) {
            o(false);
            m(false);
            if (C()) {
                if (o() && q()) {
                    return;
                }
                h.a(b(), (Boolean) null, 2, (Object) null);
                return;
            }
            h.a(b(), (Boolean) null, 2, (Object) null);
        } else {
            this.J = false;
        }
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

    public static /* synthetic */ void a(d dVar, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e65afb", new Object[]{dVar, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        dVar.s(z);
    }

    private final void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d90e9a", new Object[]{this, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            t(z);
        }
    }

    private final void af() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab38f62c", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            ag();
        }
    }

    private final void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88de739", new Object[]{this, new Boolean(z)});
        } else if (b().aU() == null || this.U) {
        } else {
            this.U = true;
            MarginSupportFrameLayout marginSupportFrameLayout = this.t;
            if (marginSupportFrameLayout == null) {
                q.b("tab3Container");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = marginSupportFrameLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.i = -1;
            layoutParams2.h = 0;
            layoutParams2.topMargin = d().getHeight();
            MarginSupportFrameLayout marginSupportFrameLayout2 = this.t;
            if (marginSupportFrameLayout2 == null) {
                q.b("tab3Container");
                throw null;
            }
            marginSupportFrameLayout2.setLayoutParams(layoutParams2);
            PerceptionLinearLayout perceptionLinearLayout = this.m;
            if (perceptionLinearLayout == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            perceptionLinearLayout.setZ(1.0f);
            if (this.G) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
                if (perceptionSizeFrameLayout == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                perceptionSizeFrameLayout.setZ(0.0f);
            }
            RemoteLoadingView remoteLoadingView = new RemoteLoadingView(a(), new LoadConfig.a().a());
            MarginSupportFrameLayout marginSupportFrameLayout3 = this.t;
            if (marginSupportFrameLayout3 == null) {
                q.b("tab3Container");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.a(marginSupportFrameLayout3, remoteLoadingView);
            l.a("shopTab3", b().T(), a(), new FlagShipContentComponentV2$openTab3$1(this, remoteLoadingView, z), new FlagShipContentComponentV2$openTab3$2(this, remoteLoadingView), new FlagShipContentComponentV2$openTab3$3(remoteLoadingView));
            this.L.c(true);
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new FlagShipContentComponentV2$openTab3$4(this, z));
        }
    }

    private final void ag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab470dad", new Object[]{this});
        } else if (!this.U) {
        } else {
            this.U = false;
            if ((!C() || !this.H) && !o()) {
                PerceptionLinearLayout perceptionLinearLayout = this.m;
                if (perceptionLinearLayout == null) {
                    q.b("shopHeaderContainer");
                    throw null;
                }
                perceptionLinearLayout.setAlpha(0.0f);
            }
            if (this.G) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
                if (perceptionSizeFrameLayout == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                perceptionSizeFrameLayout.setZ(1.0f);
            }
            if ((C() && q() && o()) || this.G) {
                this.L.b(true);
            } else {
                this.L.c(false);
            }
            o oVar = this.T;
            if (oVar != null) {
                oVar.d();
            }
            rvb<Integer, Integer, Integer, Integer, t> f2 = f();
            if (f2 != null) {
                f2.invoke(Integer.valueOf(b().o()), Integer.valueOf(b().n()), -1, -1);
            }
            o oVar2 = this.T;
            if (oVar2 != null) {
                oVar2.a();
            }
            MarginSupportFrameLayout marginSupportFrameLayout = this.t;
            if (marginSupportFrameLayout == null) {
                q.b("tab3Container");
                throw null;
            } else {
                n.a(marginSupportFrameLayout, d().getHeight(), 700L, (Animator.AnimatorListener) new b()).start();
            }
        }
    }

    private final void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        boolean b2 = b().b(i, i2);
        boolean b3 = b().b(i3, i4);
        boolean z = i3 == 2;
        boolean z2 = i == 2;
        if (b2 == b3 && ((!b2 && !b3) || z == z2)) {
            return;
        }
        ShopSwipeListenerLayout shopSwipeListenerLayout = this.i;
        if (shopSwipeListenerLayout == null) {
            q.b("centerContainer");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = shopSwipeListenerLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (this.H) {
            if (b3) {
                layoutParams2.i = -1;
                ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.i;
                if (shopSwipeListenerLayout2 == null) {
                    q.b("centerContainer");
                    throw null;
                }
                shopSwipeListenerLayout2.setLayoutParams(layoutParams2);
                if (z) {
                    PerceptionLinearLayout perceptionLinearLayout = this.m;
                    if (perceptionLinearLayout == null) {
                        q.b("shopHeaderContainer");
                        throw null;
                    }
                    perceptionLinearLayout.setZ(2.0f);
                    PerceptionLinearLayout perceptionLinearLayout2 = this.m;
                    if (perceptionLinearLayout2 == null) {
                        q.b("shopHeaderContainer");
                        throw null;
                    }
                    com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionLinearLayout2);
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
                    if (perceptionSizeFrameLayout == null) {
                        q.b("navViewContainer");
                        throw null;
                    }
                    perceptionSizeFrameLayout.setZ(0.0f);
                } else {
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
                    if (perceptionSizeFrameLayout2 == null) {
                        q.b("navViewContainer");
                        throw null;
                    }
                    perceptionSizeFrameLayout2.setZ(1.0f);
                    PerceptionLinearLayout perceptionLinearLayout3 = this.m;
                    if (perceptionLinearLayout3 == null) {
                        q.b("shopHeaderContainer");
                        throw null;
                    }
                    perceptionLinearLayout3.setZ(2.0f);
                    if (this.Y) {
                        PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.k;
                        if (perceptionSizeFrameLayout3 == null) {
                            q.b("navViewContainer");
                            throw null;
                        }
                        perceptionSizeFrameLayout3.setZ(3.0f);
                    }
                    this.L.b(true);
                }
                ay();
                PerceptionSizeFrameLayout perceptionSizeFrameLayout4 = this.k;
                if (perceptionSizeFrameLayout4 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionSizeFrameLayout4, m() + this.y);
                com.alibaba.triver.triver_shop.newShop.manager.d dVar = this.K;
                if (dVar == null) {
                    q.b("newBottomBarAndIndexNavManager");
                    throw null;
                }
                dVar.a(true);
                u(true);
                return;
            }
            PerceptionSizeFrameLayout perceptionSizeFrameLayout5 = this.k;
            if (perceptionSizeFrameLayout5 == null) {
                q.b("navViewContainer");
                throw null;
            }
            layoutParams2.i = perceptionSizeFrameLayout5.getId();
            PerceptionSizeFrameLayout perceptionSizeFrameLayout6 = this.k;
            if (perceptionSizeFrameLayout6 == null) {
                q.b("navViewContainer");
                throw null;
            }
            perceptionSizeFrameLayout6.setZ(0.0f);
            PerceptionLinearLayout perceptionLinearLayout4 = this.m;
            if (perceptionLinearLayout4 == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            perceptionLinearLayout4.setAlpha(1.0f);
            PerceptionLinearLayout perceptionLinearLayout5 = this.m;
            if (perceptionLinearLayout5 == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            perceptionLinearLayout5.setZ(0.0f);
            this.L.c(false);
            com.alibaba.triver.triver_shop.newShop.manager.d dVar2 = this.K;
            if (dVar2 == null) {
                q.b("newBottomBarAndIndexNavManager");
                throw null;
            }
            dVar2.a(false);
            u(false);
            if (!q() || b().o() != 0 || b().n() != 0) {
                return;
            }
            l(false);
        } else if (b3) {
            layoutParams2.i = -1;
            ShopSwipeListenerLayout shopSwipeListenerLayout3 = this.i;
            if (shopSwipeListenerLayout3 == null) {
                q.b("centerContainer");
                throw null;
            }
            shopSwipeListenerLayout3.setLayoutParams(layoutParams2);
            PerceptionSizeFrameLayout perceptionSizeFrameLayout7 = this.k;
            if (perceptionSizeFrameLayout7 == null) {
                q.b("navViewContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionSizeFrameLayout7, m());
            if (z) {
                PerceptionLinearLayout perceptionLinearLayout6 = this.m;
                if (perceptionLinearLayout6 == null) {
                    q.b("shopHeaderContainer");
                    throw null;
                }
                perceptionLinearLayout6.setZ(2.0f);
                PerceptionLinearLayout perceptionLinearLayout7 = this.m;
                if (perceptionLinearLayout7 == null) {
                    q.b("shopHeaderContainer");
                    throw null;
                }
                com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionLinearLayout7);
                PerceptionSizeFrameLayout perceptionSizeFrameLayout8 = this.k;
                if (perceptionSizeFrameLayout8 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                perceptionSizeFrameLayout8.setZ(0.0f);
            } else {
                if (this.F) {
                    PerceptionLinearLayout perceptionLinearLayout8 = this.m;
                    if (perceptionLinearLayout8 == null) {
                        q.b("shopHeaderContainer");
                        throw null;
                    }
                    perceptionLinearLayout8.setZ(1.0f);
                    PerceptionLinearLayout perceptionLinearLayout9 = this.m;
                    if (perceptionLinearLayout9 == null) {
                        q.b("shopHeaderContainer");
                        throw null;
                    }
                    perceptionLinearLayout9.setAlpha(0.0f);
                } else {
                    PerceptionLinearLayout perceptionLinearLayout10 = this.m;
                    if (perceptionLinearLayout10 == null) {
                        q.b("shopHeaderContainer");
                        throw null;
                    }
                    perceptionLinearLayout10.setZ(0.0f);
                }
                PerceptionSizeFrameLayout perceptionSizeFrameLayout9 = this.k;
                if (perceptionSizeFrameLayout9 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                perceptionSizeFrameLayout9.setZ(1.0f);
            }
            l(false);
            com.alibaba.triver.triver_shop.newShop.manager.d dVar3 = this.K;
            if (dVar3 == null) {
                q.b("newBottomBarAndIndexNavManager");
                throw null;
            }
            dVar3.a(true);
            u(true);
        } else {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout10 = this.k;
            if (perceptionSizeFrameLayout10 == null) {
                q.b("navViewContainer");
                throw null;
            }
            layoutParams2.i = perceptionSizeFrameLayout10.getId();
            PerceptionSizeFrameLayout perceptionSizeFrameLayout11 = this.k;
            if (perceptionSizeFrameLayout11 == null) {
                q.b("navViewContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionSizeFrameLayout11, m());
            PerceptionSizeFrameLayout perceptionSizeFrameLayout12 = this.k;
            if (perceptionSizeFrameLayout12 == null) {
                q.b("navViewContainer");
                throw null;
            }
            perceptionSizeFrameLayout12.setZ(0.0f);
            PerceptionLinearLayout perceptionLinearLayout11 = this.m;
            if (perceptionLinearLayout11 == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            perceptionLinearLayout11.setAlpha(0.0f);
            PerceptionLinearLayout perceptionLinearLayout12 = this.m;
            if (perceptionLinearLayout12 == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            perceptionLinearLayout12.setZ(0.0f);
            if (!this.F) {
                l(false);
                com.alibaba.triver.triver_shop.newShop.manager.d dVar4 = this.K;
                if (dVar4 == null) {
                    q.b("newBottomBarAndIndexNavManager");
                    throw null;
                }
                dVar4.a(false);
                u(false);
                return;
            }
            if (C()) {
                l(false);
            }
            com.alibaba.triver.triver_shop.newShop.manager.d dVar5 = this.K;
            if (dVar5 == null) {
                q.b("newBottomBarAndIndexNavManager");
                throw null;
            }
            dVar5.a(false);
            u(false);
        }
    }

    private final void at() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfe3f3a", new Object[]{this});
        } else if (C() && q() && !s()) {
            View aA = aA();
            if (aA == null) {
                return;
            }
            aA.setAlpha(0.0f);
        } else {
            View aA2 = aA();
            if (aA2 == null) {
                return;
            }
            aA2.setAlpha(1.0f);
        }
    }

    private final void ay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac44b4bf", new Object[]{this});
            return;
        }
        View aA = aA();
        if (aA == null) {
            return;
        }
        aA.setAlpha(0.0f);
    }

    private final int az() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac52cc33", new Object[]{this})).intValue() : this.X;
    }

    private final void ah() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab55252e", new Object[]{this});
            return;
        }
        ceg.Companion.b(q.a("changeFirstTabToOtherTab, current expanded : ", (Object) Boolean.valueOf(o())));
        ay();
        if (o()) {
            if (j()) {
                at();
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
                if (perceptionSizeFrameLayout == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionSizeFrameLayout, aB());
            } else {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
                if (perceptionSizeFrameLayout2 != null) {
                    b(-(perceptionSizeFrameLayout2.getTop() - (m() + this.y)), false);
                } else {
                    q.b("navViewContainer");
                    throw null;
                }
            }
            l(true);
        } else if (this.H) {
            l(true);
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.d(new FlagShipContentComponentV2$changeFirstTabToOtherTab$1(this));
    }

    private final void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        boolean b2 = b().b(i, i2);
        ceg.Companion.b(q.a("changeOtherTabToFistTab, current expanded : ", (Object) Boolean.valueOf(o())));
        if (!o()) {
            if (b2) {
            }
        } else if (!this.H) {
            a(this, -al(), false, 2, (Object) null);
            l(false);
        } else {
            if (q()) {
                l(false);
            }
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
            if (perceptionSizeFrameLayout == null) {
                q.b("navViewContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionSizeFrameLayout, m() + this.y);
            ay();
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
        com.alibaba.triver.triver_shop.newShop.manager.d dVar = this.K;
        if (dVar == null) {
            q.b("newBottomBarAndIndexNavManager");
            throw null;
        }
        dVar.a(z, Boolean.valueOf(this.H));
        L();
        if (!C()) {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
            if (perceptionSizeFrameLayout == null) {
                q.b("navViewContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.a(perceptionSizeFrameLayout, cek.Companion.l());
            if (com.alibaba.triver.triver_shop.newShop.ext.i.c(b().K())) {
                this.L.b(true);
            } else {
                this.L.c(false);
            }
            TUrlImageView tUrlImageView = this.s;
            if (tUrlImageView == null) {
                q.b("loftAtmosphereBgPic");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.e(tUrlImageView);
        } else if (z) {
            if (q()) {
                if (H()) {
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
                    if (perceptionSizeFrameLayout2 == null) {
                        q.b("navViewContainer");
                        throw null;
                    }
                    com.alibaba.triver.triver_shop.newShop.ext.o.a(perceptionSizeFrameLayout2, cek.Companion.l());
                } else {
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.k;
                    if (perceptionSizeFrameLayout3 == null) {
                        q.b("navViewContainer");
                        throw null;
                    }
                    com.alibaba.triver.triver_shop.newShop.ext.o.a(perceptionSizeFrameLayout3, cek.Companion.e());
                }
                com.alibaba.triver.triver_shop.newShop.ext.b.d(new FlagShipContentComponentV2$updateExpandedStatus$1(this));
            } else {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout4 = this.k;
                if (perceptionSizeFrameLayout4 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                com.alibaba.triver.triver_shop.newShop.ext.o.a(perceptionSizeFrameLayout4, cek.Companion.l());
            }
            if (r() || s()) {
                this.L.b(true);
            } else if (!q()) {
                this.L.c(false);
            } else {
                this.L.c(true);
            }
        } else {
            if (this.H && q()) {
                this.L.c(false);
            }
            PerceptionSizeFrameLayout perceptionSizeFrameLayout5 = this.k;
            if (perceptionSizeFrameLayout5 == null) {
                q.b("navViewContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.a(perceptionSizeFrameLayout5, cek.Companion.l());
            com.alibaba.triver.triver_shop.newShop.ext.b.d(new FlagShipContentComponentV2$updateExpandedStatus$2(this));
            com.alibaba.triver.triver_shop.newShop.ext.b.c(new FlagShipContentComponentV2$updateExpandedStatus$3(this));
        }
        if (!this.G || !this.F) {
            return;
        }
        this.L.b(true);
    }

    private final void ai() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab633caf", new Object[]{this});
        } else if (this.G) {
            this.L.b(true);
        } else {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
            if (perceptionSizeFrameLayout == null) {
                q.b("navViewContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.c(perceptionSizeFrameLayout, m() + this.y);
            ay();
        }
    }

    private final void aj() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab715430", new Object[]{this});
            return;
        }
        ay();
        if (C() && this.H) {
            z = false;
        }
        int D = D();
        b(-D, z);
        g(D);
        l(false);
        if (!this.V || !q()) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d b2 = b();
        EmbedShopLoftComponent embedShopLoftComponent = this.M;
        h.a(b2, embedShopLoftComponent == null ? null : Boolean.valueOf(embedShopLoftComponent.m()));
    }

    private final void ak() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7f6bb1", new Object[]{this});
        } else if (o()) {
        } else {
            at();
            a(this, E(), false, 2, (Object) null);
            l(true);
        }
    }

    public static /* synthetic */ void a(d dVar, int i, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6df81e", new Object[]{dVar, new Integer(i), new Boolean(z), new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        dVar.b(i, z);
    }

    private final void b(int i, boolean z) {
        float alpha;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f7cdda", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.G && !this.F) {
            ceg.Companion.b("current page full screen ， stop animation");
        } else {
            if (z) {
                i(i);
            }
            if (C() && q() && !this.G) {
                ShopSwipeListenerLayout shopSwipeListenerLayout = this.h;
                if (shopSwipeListenerLayout == null) {
                    q.b("outerSwiperLayout");
                    throw null;
                }
                shopSwipeListenerLayout.forceInterceptAllTouchEvent(true);
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
            animatorArr[0] = n.a((MarginSupportFrameLayout) perceptionSizeFrameLayout, i, 0L, (Animator.AnimatorListener) null, 6, (Object) null);
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
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e1da3f", new Object[]{this})).intValue();
        }
        if (C()) {
            if (q() && this.G && this.F) {
                return am();
            }
            return ao();
        }
        return am();
    }

    private final int al() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8d8325", new Object[]{this})).intValue() : this.y + this.X;
    }

    private final int am() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab9b9aa6", new Object[]{this})).intValue() : this.y + this.X;
    }

    private final int an() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aba9b227", new Object[]{this})).intValue();
        }
        if (this.H) {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
            if (perceptionSizeFrameLayout != null) {
                return perceptionSizeFrameLayout.getTop() - (m() + this.y);
            }
            q.b("navViewContainer");
            throw null;
        }
        PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
        if (perceptionSizeFrameLayout2 == null) {
            q.b("navViewContainer");
            throw null;
        }
        int top = perceptionSizeFrameLayout2.getTop();
        View view = this.g;
        if (view != null) {
            return top - view.getBottom();
        }
        q.b(a5.f3362a);
        throw null;
    }

    private final int ao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abb7c9a8", new Object[]{this})).intValue();
        }
        if (this.H) {
            return aB() - (m() + this.y);
        }
        int aB = aB();
        View view = this.g;
        if (view != null) {
            return aB - view.getBottom();
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
            return an();
        }
        return al();
    }

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f3937a;

        static {
            kge.a(139611580);
        }

        public a(d this$0) {
            q.d(this$0, "this$0");
            this.f3937a = this$0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            this.f3937a.b(true);
            View v = d.v(this.f3937a);
            if (v != null) {
                com.alibaba.triver.triver_shop.newShop.ext.o.b(v);
            } else {
                q.b("centerContainerWhiteFrame");
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
            this.f3937a.b(false);
            View v = d.v(this.f3937a);
            if (v == null) {
                q.b("centerContainerWhiteFrame");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.d(v);
            this.f3937a.y();
            ShopSwipeListenerLayout w = d.w(this.f3937a);
            if (w != null) {
                w.forceInterceptAllTouchEvent(false);
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
        if (this.G) {
            u(true);
        } else {
            u(false);
        }
    }

    private final void u(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca42bfd8", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            ShopSwipeListenerLayout shopSwipeListenerLayout = this.i;
            if (shopSwipeListenerLayout == null) {
                q.b("centerContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.a(shopSwipeListenerLayout, d().getHeight() + cek.Companion.a());
        } else if (this.H) {
            if (ar()) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
                if (perceptionSizeFrameLayout == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                i = perceptionSizeFrameLayout.getHeight();
            } else {
                i = 0;
            }
            ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.i;
            if (shopSwipeListenerLayout2 == null) {
                q.b("centerContainer");
                throw null;
            }
            ShopSwipeListenerLayout shopSwipeListenerLayout3 = shopSwipeListenerLayout2;
            int height = (d().getHeight() - m()) - this.y;
            PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
            if (perceptionSizeFrameLayout2 == null) {
                q.b("navViewContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.a(shopSwipeListenerLayout3, (height - perceptionSizeFrameLayout2.getHeight()) + cek.Companion.a() + i);
        } else {
            ShopSwipeListenerLayout shopSwipeListenerLayout4 = this.i;
            if (shopSwipeListenerLayout4 == null) {
                q.b("centerContainer");
                throw null;
            }
            ShopSwipeListenerLayout shopSwipeListenerLayout5 = shopSwipeListenerLayout4;
            int height2 = d().getHeight() - m();
            PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.k;
            if (perceptionSizeFrameLayout3 == null) {
                q.b("navViewContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.a(shopSwipeListenerLayout5, (height2 - perceptionSizeFrameLayout3.getHeight()) + cek.Companion.a());
        }
        ShopSwipeListenerLayout shopSwipeListenerLayout6 = this.i;
        if (shopSwipeListenerLayout6 != null) {
            shopSwipeListenerLayout6.setPadding(0, 0, 0, cek.Companion.a());
        } else {
            q.b("centerContainer");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public int G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fe0941", new Object[]{this})).intValue();
        }
        if (b().bc().b()) {
            return b().bc().a().a();
        }
        if (t() || s()) {
            return j(this.Q);
        }
        return j(this.w ? this.P : this.O);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new FlagShipContentComponentV2$onSubscribeStatusChanged$1(this, z, jSONObject));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void J() {
        com.alibaba.triver.triver_shop.newShop.view.embed.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        super.J();
        if (!C() || !o() || (cVar = this.N) == null) {
            return;
        }
        cVar.i();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        super.K();
        com.alibaba.triver.triver_shop.newShop.view.embed.c cVar = this.N;
        if (cVar == null) {
            return;
        }
        cVar.j();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (this.U) {
                ag();
                return false;
            } else if (!ap()) {
                return false;
            }
        }
        return super.z();
    }

    private final boolean ap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc5e13a", new Object[]{this})).booleanValue();
        }
        if (!this.J || !com.alibaba.triver.triver_shop.newShop.ext.i.c(b().K())) {
            return true;
        }
        this.J = false;
        a(0, 0, b().d(0, 0));
        return false;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue();
        }
        if (!this.U) {
            return false;
        }
        o oVar = this.T;
        if (oVar != null) {
            oVar.d();
        }
        return true;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[]{this})).booleanValue();
        }
        if (!this.U) {
            return false;
        }
        o oVar = this.T;
        if (oVar != null) {
            oVar.c();
        }
        return true;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c005ac1e", new Object[]{this, new Boolean(z)});
            return;
        }
        this.L.e(z);
        if (z) {
            ViewGroup viewGroup = this.j;
            if (viewGroup != null) {
                com.alibaba.triver.triver_shop.newShop.ext.o.d(viewGroup);
                return;
            } else {
                q.b("tabBarContainer");
                throw null;
            }
        }
        ViewGroup viewGroup2 = this.j;
        if (viewGroup2 != null) {
            com.alibaba.triver.triver_shop.newShop.ext.o.b(viewGroup2);
        } else {
            q.b("tabBarContainer");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ba84bd", new Object[]{this, new Boolean(z)});
        } else {
            this.L.a(z, h.b(b(), z));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bfae0", new Object[]{this, new Boolean(z)});
            return;
        }
        this.L.a(z);
        if (z) {
            ViewGroup viewGroup = this.j;
            if (viewGroup == null) {
                q.b("tabBarContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.a(viewGroup, cek.Companion.n());
        } else {
            ViewGroup viewGroup2 = this.j;
            if (viewGroup2 == null) {
                q.b("tabBarContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.a(viewGroup2, cek.Companion.m());
        }
        this.R.a(z);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[]{this});
            return;
        }
        X();
        com.alibaba.triver.triver_shop.newShop.ext.m.a(b(), "Page_Shop_Live_FloatWindow_Click", null, null, 8, null);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new FlagShipContentComponentV2$onStatusBarStyleChanged$1(this));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void a(Configuration newConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510fd488", new Object[]{this, newConfig});
            return;
        }
        q.d(newConfig, "newConfig");
        super.a(newConfig);
        com.alibaba.triver.triver_shop.newShop.ext.o.a(d(), new FlagShipContentComponentV2$onConfigChanged$1(this));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public ViewPager ax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("9b14c22a", new Object[]{this});
        }
        EnhancedViewPager enhancedViewPager = this.f;
        if (enhancedViewPager != null) {
            return enhancedViewPager;
        }
        q.b("contentViewPager");
        throw null;
    }
}
