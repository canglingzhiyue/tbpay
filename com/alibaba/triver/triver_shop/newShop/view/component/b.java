package com.alibaba.triver.triver_shop.newShop.view.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.a5;
import com.alibaba.triver.triver_shop.container.shopLoft.MiniVideoLoftView;
import com.alibaba.triver.triver_shop.newShop.ClickView;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.alibaba.triver.triver_shop.newShop.ext.n;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.MarginSupportFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionLinearLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionSizeFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.h;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Result;
import kotlin.i;
import kotlin.j;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.cej;
import tb.cek;
import tb.cen;
import tb.kge;
import tb.rvb;

/* loaded from: classes3.dex */
public class b extends com.alibaba.triver.triver_shop.newShop.view.component.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int A;
    private int B;
    private com.alibaba.triver.triver_shop.newShop.manager.d C;
    private EmbedShopLoftComponent E;
    private MiniVideoLoftView F;
    private ViewPager f;
    private View g;
    private ShopSwipeListenerLayout h;
    private ShopSwipeListenerLayout i;
    private ViewGroup j;
    private PerceptionSizeFrameLayout k;
    private ViewGroup l;
    private PerceptionLinearLayout m;
    private View n;
    private View o;
    private View p;
    private View q;
    private cej r;
    private TUrlImageView s;
    private View t;
    private TUrlImageView u;
    private boolean v;
    private int y;
    private int z;
    private boolean w = true;
    private boolean x = true;
    private final com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.f D = new com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.f(ContentShopComponent$shopHeaderComponent$1.INSTANCE, null);
    private final int G = o.c(Integer.valueOf((int) g.KEY_FLAG_SHIP_BIG_CARD_SIZE_RPX));
    private final int H = o.c(Integer.valueOf((int) g.KEY_FLAG_SHIP_SUPER_BIG_CARD_SIZE_RPX));
    private final int I = o.c(Integer.valueOf((int) g.KEY_FLAG_SHIP_H5_BIG_CARD_SIZE_RPX));
    private final com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.b J = new com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.b(new ContentShopComponent$bottomBarComponent$1(this), null, 2, null);
    private final h K = new h();
    private final com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.g L = new com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.g();

    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.component.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class View$OnClickListenerC0142b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public View$OnClickListenerC0142b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String aN = b.this.b().aN();
            if (aN == null) {
                return;
            }
            l.a(b.this.a(), aN);
        }
    }

    static {
        kge.a(-896702327);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
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
            case 407727923:
                super.onPageSelected(((Number) objArr[0]).intValue());
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
        return true;
    }

    public static final /* synthetic */ void a(b bVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74cf1923", new Object[]{bVar, new Integer(i), new Boolean(z)});
        } else {
            bVar.a(i, z);
        }
    }

    public static final /* synthetic */ void a(b bVar, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78be3808", new Object[]{bVar, aVar, layoutParams});
        } else {
            bVar.a(aVar, layoutParams);
        }
    }

    public static final /* synthetic */ ShopSwipeListenerLayout j(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopSwipeListenerLayout) ipChange.ipc$dispatch("f82541c1", new Object[]{bVar}) : bVar.i;
    }

    public static final /* synthetic */ void l(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ebcd947", new Object[]{bVar});
        } else {
            bVar.V();
        }
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
            this.w = cen.Companion.x();
            this.x = cen.Companion.w();
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
        }
        context.getLifecycle().addObserver(I());
        super.a(context, shopData, shopDXEngine);
        l.a((Activity) context, true);
        Z();
        T();
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            q.b("bigCardContainer");
            throw null;
        }
        o.a(viewGroup, G() + cek.Companion.b());
        ViewGroup viewGroup2 = this.l;
        if (viewGroup2 == null) {
            q.b("bigCardContainer");
            throw null;
        }
        viewGroup2.setPadding(0, cek.Companion.b(), 0, 0);
        ViewGroup viewGroup3 = this.l;
        if (viewGroup3 == null) {
            q.b("bigCardContainer");
            throw null;
        }
        viewGroup3.setTranslationY(-cek.Companion.b());
        X();
        Y();
        if (q()) {
            return;
        }
        ceg.Companion.b("data error : video shop has no bigCard");
        com.alibaba.triver.triver_shop.newShop.ext.b.a(context, "[DEBUG]: 状态错误，视频店无大卡");
    }

    private final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53adb", new Object[]{this});
            return;
        }
        String aR = b().aR();
        ceg.Companion.b(q.a("shopSignType : ", (Object) aR));
        if (aR != null) {
            int hashCode = aR.hashCode();
            if (hashCode != -187499722) {
                if (hashCode != 3327377) {
                    if (hashCode == 93653765 && aR.equals("bgPic")) {
                        W();
                    }
                } else if (aR.equals("loft")) {
                    U();
                }
            } else if (aR.equals("bgVideo")) {
                S();
            }
        }
        U();
        S();
        W();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 80;
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            q.b("bigCardContainer");
            throw null;
        }
        View view = this.p;
        if (view == null) {
            q.b("bigCardBottomBlackShadowBg");
            throw null;
        }
        viewGroup.addView(view, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, o.c((Number) 570));
        layoutParams2.gravity = 80;
        layoutParams2.bottomMargin = o.c((Number) 135);
        ViewGroup viewGroup2 = this.l;
        if (viewGroup2 == null) {
            q.b("bigCardContainer");
            throw null;
        }
        View view2 = this.q;
        if (view2 != null) {
            viewGroup2.addView(view2, layoutParams2);
        } else {
            q.b("bigCardBottomBlackShadowBGPart2");
            throw null;
        }
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
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
            this.F = miniVideoLoftView;
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
            clickView.setOnClickListener(new View$OnClickListenerC0142b());
            ViewGroup viewGroup2 = this.l;
            if (viewGroup2 != null) {
                o.a(viewGroup2, clickView);
            } else {
                q.b("bigCardContainer");
                throw null;
            }
        }
    }

    private final void U() {
        View i;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3525c", new Object[]{this});
        } else if (q() || l.b()) {
        } else {
            c(b().ac());
            if (!q()) {
                return;
            }
            d(true);
            this.E = new EmbedShopLoftComponent(a(), b(), c());
            EmbedShopLoftComponent embedShopLoftComponent = this.E;
            if (embedShopLoftComponent != null) {
                embedShopLoftComponent.a(G() / o.a());
            }
            EmbedShopLoftComponent embedShopLoftComponent2 = this.E;
            if (embedShopLoftComponent2 != null && (i = embedShopLoftComponent2.i()) != null) {
                ViewGroup viewGroup = this.l;
                if (viewGroup == null) {
                    q.b("bigCardContainer");
                    throw null;
                }
                o.a(viewGroup, i);
            }
            this.D.b(true);
            EmbedShopLoftComponent embedShopLoftComponent3 = this.E;
            if (embedShopLoftComponent3 == null || !embedShopLoftComponent3.c()) {
                z = false;
            }
            if (!z) {
                return;
            }
            i(false);
        }
    }

    private final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
            return;
        }
        ceg.Companion.b("continueInitSHopLoftBigCard");
        this.L.a(new ContentShopComponent$continueInitShopLoftBigCard$1(this));
        this.L.a(a(), b(), c(), null);
    }

    private final void W() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df815e", new Object[]{this});
        } else if (q()) {
        } else {
            ClickView clickView = new ClickView(a());
            String ar = b().ar();
            if (ar == null) {
                return;
            }
            if (ar.length() == 0) {
                z = true;
            }
            if (z) {
                return;
            }
            TUrlImageView tUrlImageView = new TUrlImageView(a());
            tUrlImageView.setImageUrl(ar);
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ViewGroup viewGroup = this.l;
            if (viewGroup == null) {
                q.b("bigCardContainer");
                throw null;
            }
            o.a(viewGroup, tUrlImageView);
            ViewGroup viewGroup2 = this.l;
            if (viewGroup2 == null) {
                q.b("bigCardContainer");
                throw null;
            }
            o.a(viewGroup2, clickView);
            c(true);
            final String aP = b().aP();
            if (aP == null) {
                return;
            }
            clickView.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.component.ContentShopComponent$createImageBigCard$1$1$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        l.a(b.this.a(), aP);
                    }
                }
            });
        }
    }

    private final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed98df", new Object[]{this});
            return;
        }
        this.C = new com.alibaba.triver.triver_shop.newShop.manager.d(a(), b(), q(), new ContentShopComponent$initTemplateComponent$1(this));
        this.z = o.a((Number) 45);
        this.J.a(new ContentShopComponent$initTemplateComponent$2(this));
        this.J.a(a(), b(), c(), null);
        ViewGroup viewGroup = this.j;
        if (viewGroup == null) {
            q.b("tabBarContainer");
            throw null;
        }
        viewGroup.addView(this.J.f());
        this.D.a(new ContentShopComponent$initTemplateComponent$3(this));
        this.D.a(a(), b(), c(), null);
        PerceptionLinearLayout perceptionLinearLayout = this.m;
        if (perceptionLinearLayout == null) {
            q.b("shopHeaderContainer");
            throw null;
        }
        perceptionLinearLayout.addView(this.D.f());
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
        if (perceptionSizeFrameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.manager.d dVar = this.C;
        if (dVar == null) {
            q.b("bottomBarAndIndexNavManager");
            throw null;
        }
        perceptionSizeFrameLayout.addView(dVar.a());
        h hVar = this.K;
        hVar.a(new ContentShopComponent$initTemplateComponent$4$1(this));
        hVar.a(a(), b(), c(), null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        ViewGroup viewGroup2 = this.l;
        if (viewGroup2 != null) {
            viewGroup2.addView(hVar.f(), layoutParams);
        } else {
            q.b("bigCardContainer");
            throw null;
        }
    }

    private final void a(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50fe2fe", new Object[]{this, aVar, layoutParams});
        } else if (this.y != 0 && this.z != 0 && this.A != 0) {
        } else {
            if (aVar instanceof com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.f) {
                this.y = aVar.j().height;
            }
            if (aVar instanceof com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.d) {
                this.z = aVar.j().height;
            }
            if (aVar instanceof com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.b) {
                this.A = aVar.j().height;
            }
            if (this.y == 0 || this.z == 0 || this.A == 0) {
                return;
            }
            F();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        this.B = G() + o.c((Number) 24);
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
        if (perceptionSizeFrameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        o.c(perceptionSizeFrameLayout, this.B);
        if (this.x) {
            b().a(this.y);
        } else {
            com.alibaba.triver.triver_shop.newShop.data.d b = b();
            int i = this.A;
            ViewGroup viewGroup = this.j;
            if (viewGroup != null) {
                b.a(o.f(Integer.valueOf(i + o.i(viewGroup))));
            } else {
                q.b("tabBarContainer");
                throw null;
            }
        }
        if (i() == 0) {
            cej cejVar = this.r;
            if (cejVar == null) {
                q.b("shopContainerPageAdapter");
                throw null;
            }
            cejVar.a(i());
        }
        PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
        if (perceptionSizeFrameLayout2 == null) {
            q.b("navViewContainer");
            throw null;
        }
        o.a(perceptionSizeFrameLayout2, new ContentShopComponent$allTemplateLoadFinish$1(this));
        if (g() == 0) {
            TUrlImageView tUrlImageView = this.s;
            if (tUrlImageView != null) {
                o.d(tUrlImageView);
                return;
            } else {
                q.b("shopBackgroundImg");
                throw null;
            }
        }
        TUrlImageView tUrlImageView2 = this.s;
        if (tUrlImageView2 != null) {
            o.b(tUrlImageView2);
        } else {
            q.b("shopBackgroundImg");
            throw null;
        }
    }

    private final void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbb060", new Object[]{this});
            return;
        }
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
        if (perceptionSizeFrameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        o.a(perceptionSizeFrameLayout, cek.Companion.d());
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
        View view = this.n;
        if (view == null) {
            q.b("bigCardTopBlackShadowBg");
            throw null;
        }
        o.a(view, cek.Companion.f());
        View view2 = this.n;
        if (view2 == null) {
            q.b("bigCardTopBlackShadowBg");
            throw null;
        }
        o.a(view2, o.c((Number) 370));
        View view3 = this.p;
        if (view3 == null) {
            q.b("bigCardBottomBlackShadowBg");
            throw null;
        }
        o.a(view3, cek.Companion.i());
        View view4 = this.p;
        if (view4 == null) {
            q.b("bigCardBottomBlackShadowBg");
            throw null;
        }
        o.a(view4, o.c((Number) 135));
        View view5 = this.q;
        if (view5 == null) {
            q.b("bigCardBottomBlackShadowBGPart2");
            throw null;
        }
        o.a(view5, cek.Companion.j());
        this.o = new View(a());
        View view6 = this.o;
        if (view6 != null) {
            o.a(view6, cek.Companion.k());
            View view7 = this.o;
            if (view7 == null) {
                q.b("bigCardContentFullScreenTopBlackShadow");
                throw null;
            }
            o.d(view7);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, o.c((Number) 370));
            layoutParams.gravity = 48;
            ViewGroup viewGroup3 = this.l;
            if (viewGroup3 == null) {
                q.b("bigCardContainer");
                throw null;
            }
            View view8 = this.o;
            if (view8 == null) {
                q.b("bigCardContentFullScreenTopBlackShadow");
                throw null;
            }
            viewGroup3.addView(view8, layoutParams);
            if (!this.x) {
                return;
            }
            ViewGroup viewGroup4 = this.j;
            if (viewGroup4 != null) {
                o.e(viewGroup4);
                return;
            } else {
                q.b("tabBarContainer");
                throw null;
            }
        }
        q.b("bigCardContentFullScreenTopBlackShadow");
        throw null;
    }

    private final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509c7e1", new Object[]{this});
            return;
        }
        View a2 = o.a(a(), R.layout.view_new_shop_view_flag_ship);
        if (a2 == null) {
            return;
        }
        View findViewById = a2.findViewById(R.id.new_shop_view_center_container_white_frame);
        q.b(findViewById, "contentView.findViewById(R.id.new_shop_view_center_container_white_frame)");
        this.t = findViewById;
        View findViewById2 = a2.findViewById(R.id.new_shop_view_center_container);
        ShopSwipeListenerLayout shopSwipeListenerLayout = (ShopSwipeListenerLayout) findViewById2;
        if (Build.VERSION.SDK_INT >= 21) {
            Object a3 = cek.a.a(cek.Companion, true, 0, false, 6, null);
            if (a3 != null) {
                shopSwipeListenerLayout.setOutlineProvider((ViewOutlineProvider) a3);
            }
            shopSwipeListenerLayout.setClipToOutline(true);
        }
        t tVar = t.INSTANCE;
        q.b(findViewById2, "contentView.findViewById<ShopSwipeListenerLayout?>(R.id.new_shop_view_center_container)\n                .apply {\n                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {\n                        FlagShipDrawable.getCenterContainerOutLineProvider(true)?.let {\n                            this.outlineProvider = it as ViewOutlineProvider\n                        }\n                        this.clipToOutline = true\n                    }\n                }");
        this.h = shopSwipeListenerLayout;
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
        b bVar = this;
        perceptionSizeFrameLayout.setViewSizeChangedListener(bVar);
        t tVar2 = t.INSTANCE;
        q.b(findViewById6, "contentView.findViewById<PerceptionSizeFrameLayout?>(R.id.new_shop_view_nav_view_container)\n                .apply {\n                    viewSizeChangedListener = this@ContentShopComponent\n                }");
        this.k = perceptionSizeFrameLayout;
        View findViewById7 = a2.findViewById(R.id.new_shop_view_header_view_container);
        PerceptionLinearLayout perceptionLinearLayout = (PerceptionLinearLayout) findViewById7;
        perceptionLinearLayout.setViewSizeChangedListener(bVar);
        t tVar3 = t.INSTANCE;
        q.b(findViewById7, "contentView.findViewById<PerceptionLinearLayout?>(R.id.new_shop_view_header_view_container)\n                .apply {\n                    viewSizeChangedListener = this@ContentShopComponent\n                }");
        this.m = perceptionLinearLayout;
        View findViewById8 = a2.findViewById(R.id.new_shop_view_backGround_img);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById8;
        String aC = b().aC();
        if (aC == null) {
            aC = g.DEFAULT_2022_BG_IMG_URL;
        }
        tUrlImageView.setImageUrl(aC);
        tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        q.b(tUrlImageView, "this");
        o.e(tUrlImageView);
        t tVar4 = t.INSTANCE;
        q.b(findViewById8, "contentView.findViewById<TUrlImageView?>(R.id.new_shop_view_backGround_img).apply {\n                this.imageUrl =\n                    shopData.getShopCommonAtmospherePicUrl() ?: ShopExt.DEFAULT_2022_BG_IMG_URL\n                this.scaleType = ImageView.ScaleType.CENTER_CROP\n                this.goneView()\n            }");
        this.s = tUrlImageView;
        View findViewById9 = a2.findViewById(R.id.new_shop_view_black_shadow_bg);
        q.b(findViewById9, "contentView.findViewById(R.id.new_shop_view_black_shadow_bg)");
        this.n = findViewById9;
        this.p = new View(a());
        this.q = new View(a());
        View findViewById10 = a2.findViewById(R.id.new_shop_view_loft_atmosphere_bg);
        TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById10;
        String S = b().S();
        if (S != null) {
            tUrlImageView2.setImageUrl(S);
        }
        t tVar5 = t.INSTANCE;
        q.b(findViewById10, "contentView.findViewById<TUrlImageView?>(R.id.new_shop_view_loft_atmosphere_bg).apply {\n                shopData.getLoftAtmospherePicUrl()?.isNotEmpty {\n                    this.imageUrl = it\n                }\n            }");
        this.u = tUrlImageView2;
        View a4 = o.a(a(), R.layout.view_empty_view_pager);
        if (a4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.support.v4.view.ViewPager");
        }
        ViewPager viewPager = (ViewPager) a4;
        com.alibaba.triver.triver_shop.newShop.view.provider.c cVar = new com.alibaba.triver.triver_shop.newShop.view.provider.c(b());
        this.f = viewPager;
        ViewPager viewPager2 = this.f;
        if (viewPager2 == null) {
            q.b("contentViewPager");
            throw null;
        }
        viewPager2.setOffscreenPageLimit(cVar.a() - 1);
        FragmentManager supportFragmentManager = a().getSupportFragmentManager();
        q.b(supportFragmentManager, "context.supportFragmentManager");
        this.r = new cej(supportFragmentManager);
        cej cejVar = this.r;
        if (cejVar == null) {
            q.b("shopContainerPageAdapter");
            throw null;
        }
        cejVar.a(cVar);
        cej cejVar2 = this.r;
        if (cejVar2 == null) {
            q.b("shopContainerPageAdapter");
            throw null;
        }
        viewPager.setAdapter(cejVar2);
        viewPager.addOnPageChangeListener(this);
        ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.h;
        if (shopSwipeListenerLayout2 == null) {
            q.b("centerContainer");
            throw null;
        }
        o.a(shopSwipeListenerLayout2, viewPager);
        ShopSwipeListenerLayout shopSwipeListenerLayout3 = new ShopSwipeListenerLayout(a());
        this.i = shopSwipeListenerLayout3;
        shopSwipeListenerLayout3.setSwipeListener(this);
        o.a(shopSwipeListenerLayout3, a2);
        shopSwipeListenerLayout3.setInCenterContainerFlag(false);
        o.a(d(), shopSwipeListenerLayout3);
        View view = this.g;
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
        Object a5 = cek.a.a(cek.Companion, true, cek.Companion.b(), false, 4, null);
        if (a5 != null && Build.VERSION.SDK_INT >= 21) {
            ViewGroup viewGroup2 = this.l;
            if (viewGroup2 == null) {
                q.b("bigCardContainer");
                throw null;
            }
            viewGroup2.setOutlineProvider((ViewOutlineProvider) a5);
            ViewGroup viewGroup3 = this.l;
            if (viewGroup3 == null) {
                q.b("bigCardContainer");
                throw null;
            }
            viewGroup3.setClipToOutline(true);
        }
        o.a(d(), new ColorDrawable(-16777216));
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
        ab();
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
        if (C() && !b().m(b().d(k(), b().j(l())))) {
            return;
        }
        ac();
    }

    private final void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        ViewPager viewPager = this.f;
        if (viewPager == null) {
            q.b("contentViewPager");
            throw null;
        } else if (viewPager.getCurrentItem() == i) {
            ceg.a aVar = ceg.Companion;
            aVar.b("switchTabToInViewPager : " + i + " , but same");
        } else {
            ceg.Companion.b(q.a("switchTabToInViewPager : ", (Object) Integer.valueOf(i)));
            ViewPager viewPager2 = this.f;
            if (viewPager2 != null) {
                viewPager2.setCurrentItem(i, z);
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
        ViewPager viewPager = this.f;
        if (viewPager != null) {
            viewPager.setCurrentItem(f, false);
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
            cej cejVar = this.r;
            if (cejVar == null) {
                q.b("shopContainerPageAdapter");
                throw null;
            }
            cejVar.b(l());
        }
        cej cejVar2 = this.r;
        if (cejVar2 == null) {
            q.b("shopContainerPageAdapter");
            throw null;
        }
        cejVar2.a(i);
        int j = b().j(l());
        e(i);
        int k = k();
        int i2 = b().i(l());
        int j2 = b().j(i);
        b().a(j2, i2);
        ceg.a aVar = ceg.Companion;
        aVar.b("flag ship , on page selected , newTab = " + i2 + ", newSub = " + j2 + " , oldTab = " + k + ", position : " + i);
        d(i2);
        if (k() != 0) {
            this.v = true;
        }
        com.alibaba.triver.triver_shop.newShop.manager.d dVar = this.C;
        if (dVar == null) {
            q.b("bottomBarAndIndexNavManager");
            throw null;
        }
        dVar.a(i2, l());
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
        if (perceptionSizeFrameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        o.a(perceptionSizeFrameLayout, -2);
        this.D.d(true);
        this.J.a(k());
        if (k == 0 && i2 != 0) {
            aa();
        }
        if (k != 0 && i2 == 0) {
            k(k);
        }
        rvb<Integer, Integer, Integer, Integer, t> f = f();
        if (f != null) {
            f.invoke(Integer.valueOf(i2), Integer.valueOf(j2), Integer.valueOf(k), Integer.valueOf(j));
        }
        L();
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

    private final void aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf280a7", new Object[]{this});
            return;
        }
        ceg.Companion.b(q.a("changeFirstTabToOtherTab, current expanded : ", (Object) Boolean.valueOf(o())));
        if (o()) {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
            if (perceptionSizeFrameLayout == null) {
                q.b("navViewContainer");
                throw null;
            }
            int top = perceptionSizeFrameLayout.getTop();
            PerceptionLinearLayout perceptionLinearLayout = this.m;
            if (perceptionLinearLayout != null) {
                b(-(top - perceptionLinearLayout.getBottom()), false);
                l(true);
            } else {
                q.b("shopHeaderContainer");
                throw null;
            }
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.d(new ContentShopComponent$changeFirstTabToOtherTab$1(this));
        this.D.c(false);
    }

    private final void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93209d1", new Object[]{this, new Integer(i)});
            return;
        }
        TUrlImageView tUrlImageView = this.s;
        if (tUrlImageView == null) {
            q.b("shopBackgroundImg");
            throw null;
        }
        o.d(tUrlImageView);
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            q.b("bigCardContainer");
            throw null;
        }
        o.b(viewGroup);
        View view = this.n;
        if (view == null) {
            q.b("bigCardTopBlackShadowBg");
            throw null;
        }
        o.b(view);
        ceg.Companion.b(q.a("changeOtherTabToFistTab, current expanded : ", (Object) Boolean.valueOf(o())));
        if (o()) {
            a(this, -ad(), false, 2, (Object) null);
            l(false);
        }
        this.D.b(true);
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
        com.alibaba.triver.triver_shop.newShop.manager.d dVar = this.C;
        if (dVar == null) {
            q.b("bottomBarAndIndexNavManager");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.manager.d.a(dVar, z, null, 2, null);
        L();
        if (!C()) {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
            if (perceptionSizeFrameLayout == null) {
                q.b("navViewContainer");
                throw null;
            }
            o.a(perceptionSizeFrameLayout, cek.Companion.l());
            TUrlImageView tUrlImageView = this.u;
            if (tUrlImageView != null) {
                o.e(tUrlImageView);
            } else {
                q.b("loftAtmosphereBgPic");
                throw null;
            }
        } else if (z) {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.k;
            if (perceptionSizeFrameLayout2 == null) {
                q.b("navViewContainer");
                throw null;
            }
            o.a(perceptionSizeFrameLayout2, cek.Companion.d());
            com.alibaba.triver.triver_shop.newShop.ext.b.d(new ContentShopComponent$updateExpandedStatus$1(this));
        } else {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.k;
            if (perceptionSizeFrameLayout3 == null) {
                q.b("navViewContainer");
                throw null;
            }
            o.a(perceptionSizeFrameLayout3, cek.Companion.l());
            com.alibaba.triver.triver_shop.newShop.ext.b.d(new ContentShopComponent$updateExpandedStatus$2(this));
            com.alibaba.triver.triver_shop.newShop.ext.b.c(new ContentShopComponent$updateExpandedStatus$3(this));
        }
    }

    private final void ab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab009828", new Object[]{this});
            return;
        }
        int D = D();
        b(-D, true);
        g(D);
        l(false);
    }

    private final void ac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0eafa9", new Object[]{this});
        } else if (o()) {
        } else {
            a(this, E(), false, 2, (Object) null);
            l(true);
        }
    }

    public static /* synthetic */ void a(b bVar, int i, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d5e1c", new Object[]{bVar, new Integer(i), new Boolean(z), new Integer(i2), obj});
        } else if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: moveNavViewAndCenterContainer");
        } else {
            if ((i2 & 2) != 0) {
                z = true;
            }
            bVar.b(i, z);
        }
    }

    private final void b(int i, boolean z) {
        float alpha;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f7cdda", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        if (C() && q()) {
            ShopSwipeListenerLayout shopSwipeListenerLayout = this.i;
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

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e1da3f", new Object[]{this})).intValue();
        }
        if (C()) {
            return ag();
        }
        return ae();
    }

    private final int ad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab1cc71d", new Object[]{this})).intValue();
        }
        PerceptionLinearLayout perceptionLinearLayout = this.m;
        if (perceptionLinearLayout != null) {
            return perceptionLinearLayout.getHeight();
        }
        q.b("shopHeaderContainer");
        throw null;
    }

    private final int ae() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab2ade9e", new Object[]{this})).intValue();
        }
        PerceptionLinearLayout perceptionLinearLayout = this.m;
        if (perceptionLinearLayout != null) {
            return perceptionLinearLayout.getHeight();
        }
        q.b("shopHeaderContainer");
        throw null;
    }

    private final int af() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab38f61f", new Object[]{this})).intValue();
        }
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
        if (perceptionSizeFrameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        int top = perceptionSizeFrameLayout.getTop();
        View view = this.g;
        if (view != null) {
            return top - view.getBottom();
        }
        q.b(a5.f3362a);
        throw null;
    }

    private final int ag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab470da0", new Object[]{this})).intValue();
        }
        int i = this.B;
        View view = this.g;
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
            return af();
        }
        return ad();
    }

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f3933a;

        static {
            kge.a(-1957653610);
        }

        public a(b this$0) {
            q.d(this$0, "this$0");
            this.f3933a = this$0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            this.f3933a.b(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            this.f3933a.b(false);
            this.f3933a.y();
            ShopSwipeListenerLayout j = b.j(this.f3933a);
            if (j != null) {
                j.forceInterceptAllTouchEvent(false);
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
        int m = m();
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.k;
        if (perceptionSizeFrameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        int height = m + perceptionSizeFrameLayout.getHeight();
        ShopSwipeListenerLayout shopSwipeListenerLayout = this.h;
        if (shopSwipeListenerLayout == null) {
            q.b("centerContainer");
            throw null;
        }
        o.a(shopSwipeListenerLayout, (d().getHeight() - height) + cek.Companion.a());
        ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.h;
        if (shopSwipeListenerLayout2 != null) {
            shopSwipeListenerLayout2.setPadding(0, 0, 0, cek.Companion.a());
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
        if (this.w) {
            return j(this.G);
        }
        return j(this.H);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new ContentShopComponent$onStatusBarStyleChanged$1(this));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new ContentShopComponent$onSubscribeStatusChanged$1(this, z, jSONObject));
        }
    }
}
