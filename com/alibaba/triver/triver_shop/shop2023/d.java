package com.alibaba.triver.triver_shop.shop2023;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.container.shopLoft.h;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.ShopOptSwipeLayout;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.alibaba.triver.triver_shop.newShop.view.Tab3LiveContentRender;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderInfoTemplate;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderTagListTemplate;
import com.alibaba.triver.triver_shop.shop2023.template.k;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.extend.utils.DisplayUtil;
import java.util.Map;
import kotlin.j;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.ceg;
import tb.cei;
import tb.cej;
import tb.cel;
import tb.cen;
import tb.jds;
import tb.kge;
import tb.rul;
import tb.rvb;

/* loaded from: classes3.dex */
public final class d extends com.alibaba.triver.triver_shop.shop2023.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private int I;
    private int J;
    private boolean K;
    private boolean L;
    private int M;
    private com.alibaba.triver.triver_shop.shop2023.data.c N;
    private EmbedShopLoftComponent O;
    private Shop2023HeaderInfoTemplate P;
    private com.alibaba.triver.triver_shop.shop2023.template.d Q;
    private com.alibaba.triver.triver_shop.shop2023.template.g R;
    private com.alibaba.triver.triver_shop.shop2023.template.e S;
    private Shop2023HeaderTagListTemplate T;
    private int V;
    private ViewGroup W;
    private Runnable X;
    private com.alibaba.triver.triver_shop.shop2023.nativeview.b Y;
    private com.alibaba.triver.triver_shop.shop2023.nativeview.c Z;
    private com.alibaba.triver.triver_shop.shop2023.nativeview.g aa;
    private com.alibaba.triver.triver_shop.shop2023.nativeview.i ab;
    private boolean ad;
    private k ae;
    private k af;
    private com.alibaba.triver.triver_shop.shop2023.nativeview.f ag;
    private LinearLayout ah;
    private boolean ai;
    private Boolean aj;
    private FrameLayout f;
    private FrameLayout g;
    private EnhancedViewPager h;
    private ShopOptSwipeLayout i;
    private FrameLayout j;
    private FrameLayout k;
    private ViewGroup l;
    private Tab3LiveContentRender m;
    private FrameLayout n;
    private cej o;
    private TUrlImageView p;
    private View q;
    private View r;
    private View s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean x;
    private boolean w = true;
    private com.alibaba.triver.triver_shop.shop2023.data.d y = new com.alibaba.triver.triver_shop.shop2023.data.d(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    private com.alibaba.triver.triver_shop.shop2023.data.a z = new com.alibaba.triver.triver_shop.shop2023.data.a(0, 0, false, 7, null);
    private com.alibaba.triver.triver_shop.shop2023.data.d A = new com.alibaba.triver.triver_shop.shop2023.data.d(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    private com.alibaba.triver.triver_shop.shop2023.data.d B = new com.alibaba.triver.triver_shop.shop2023.data.d(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    private final int U = 3;
    private boolean ac = true;

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f4055a;
        public final /* synthetic */ d b;
        public final /* synthetic */ int c;

        /* loaded from: classes3.dex */
        public static final class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f4056a;

            public a(d dVar) {
                this.f4056a = dVar;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                d dVar = this.f4056a;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                d.a(dVar, ((Integer) animatedValue).intValue(), false, Integer.valueOf(this.f4056a.U().g()));
            }
        }

        /* renamed from: com.alibaba.triver.triver_shop.shop2023.d$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0153b extends a {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ d b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0153b(d dVar, int i) {
                super(dVar);
                this.b = dVar;
                this.c = i;
            }

            @Override // com.alibaba.triver.triver_shop.shop2023.d.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                    return;
                }
                q.d(animation, "animation");
                com.alibaba.triver.triver_shop.shop2023.nativeview.b f = d.f(this.b);
                if (f != null) {
                    f.b(d.d(this.b));
                }
                d.b(this.b, this.c);
                d.c(this.b, 0 - this.c);
                this.b.l(false);
            }
        }

        public b(int i, d dVar, int i2) {
            this.f4055a = i;
            this.b = dVar;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(this.f4055a);
            d dVar = this.b;
            int i = this.c;
            ofInt.addUpdateListener(new a(dVar));
            ofInt.setDuration(900L);
            ofInt.addListener(new a(dVar));
            ofInt.addListener(new C0153b(dVar, i));
            ofInt.start();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
            super(d.this);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.alibaba.triver.triver_shop.shop2023.d.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            super.onAnimationEnd(animation);
            FrameLayout t = d.t(d.this);
            if (t != null) {
                o.c(t, d.this.U().f());
            } else {
                q.b("navViewContainer");
                throw null;
            }
        }
    }

    /* renamed from: com.alibaba.triver.triver_shop.shop2023.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class RunnableC0154d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* renamed from: com.alibaba.triver.triver_shop.shop2023.d$d$a */
        /* loaded from: classes3.dex */
        public static final class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f4058a;

            public a(d dVar) {
                this.f4058a = dVar;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                d dVar = this.f4058a;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                d.a(dVar, ((Integer) animatedValue).intValue(), false, Integer.valueOf(this.f4058a.U().f()));
            }
        }

        /* renamed from: com.alibaba.triver.triver_shop.shop2023.d$d$b */
        /* loaded from: classes3.dex */
        public static final class b extends a {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ d b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar, int i) {
                super(dVar);
                this.b = dVar;
                this.c = i;
            }

            @Override // com.alibaba.triver.triver_shop.shop2023.d.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                    return;
                }
                q.d(animation, "animation");
                int g = d.g(this.b);
                d dVar = this.b;
                d.a(dVar, g);
                com.alibaba.triver.triver_shop.shop2023.nativeview.b f = d.f(dVar);
                if (f != null) {
                    f.a(g);
                }
                com.alibaba.triver.triver_shop.shop2023.nativeview.b f2 = d.f(this.b);
                if (f2 != null) {
                    f2.g();
                }
                d.b(this.b, this.c);
                d.c(this.b, 0 - this.c);
                this.b.l(false);
            }
        }

        public RunnableC0154d(int i, int i2, int i3) {
            this.b = i;
            this.c = i2;
            this.d = i3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            d.a(d.this, this.b);
            com.alibaba.triver.triver_shop.shop2023.nativeview.b f = d.f(d.this);
            if (f != null) {
                f.a(this.b);
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(this.c);
            d dVar = d.this;
            int i = this.d;
            ofInt.addUpdateListener(new a(dVar));
            ofInt.setDuration(900L);
            ofInt.addListener(new b(dVar, i));
            ofInt.addListener(new a(dVar));
            ofInt.start();
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
            } else {
                d.this.Q();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (!d.this.z()) {
            } else {
                d.p(d.this).finish();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class h implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public h(int i) {
            this.b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            d dVar = d.this;
            float f = this.b;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            d.a(dVar, f - ((Float) animatedValue).floatValue());
        }
    }

    /* loaded from: classes3.dex */
    public static final class i implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f4063a;
        public final /* synthetic */ d b;

        public i(int i, d dVar) {
            this.f4063a = i;
            this.b = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            com.alibaba.triver.triver_shop.shop2023.nativeview.b f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float f2 = this.f4063a;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            float floatValue = f2 - ((Float) animatedValue).floatValue();
            if (!d.s(this.b) && (f = d.f(this.b)) != null) {
                f.c((int) floatValue);
            }
            d.a(this.b, floatValue);
        }
    }

    static {
        kge.a(1697483358);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1159257535:
                super.l(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1047811585:
                super.a((FragmentActivity) objArr[0], (com.alibaba.triver.triver_shop.newShop.data.d) objArr[1], (com.alibaba.triver.triver_shop.newShop.ext.e) objArr[2]);
                return null;
            case 69750737:
                super.J();
                return null;
            case 70674258:
                super.K();
                return null;
            case 77138905:
                super.R();
                return null;
            case 407727923:
                super.onPageSelected(((Number) objArr[0]).intValue());
                return null;
            case 1359991944:
                super.a((Configuration) objArr[0]);
                return null;
            case 1735135197:
                super.b((String) objArr[0], (JSONObject) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static final /* synthetic */ void a(d dVar, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e20d79", new Object[]{dVar, new Float(f2)});
        } else {
            dVar.a(f2);
        }
    }

    public static final /* synthetic */ void a(d dVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e218bc", new Object[]{dVar, new Integer(i2)});
        } else {
            dVar.C = i2;
        }
    }

    public static final /* synthetic */ void a(d dVar, int i2, boolean z, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5e991df", new Object[]{dVar, new Integer(i2), new Boolean(z), num});
        } else {
            dVar.a(i2, z, num);
        }
    }

    public static final /* synthetic */ void a(d dVar, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bda223bd", new Object[]{dVar, aVar, layoutParams});
        } else {
            dVar.a(aVar, layoutParams);
        }
    }

    public static final /* synthetic */ void a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e2588d", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.r(z);
        }
    }

    public static final /* synthetic */ EnhancedViewPager b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EnhancedViewPager) ipChange.ipc$dispatch("39c54823", new Object[]{dVar}) : dVar.h;
    }

    public static final /* synthetic */ void b(d dVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("386bb2bd", new Object[]{dVar, new Integer(i2)});
        } else {
            dVar.E = i2;
        }
    }

    public static final /* synthetic */ void c(d dVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f54cbe", new Object[]{dVar, new Integer(i2)});
        } else {
            dVar.F = i2;
        }
    }

    public static final /* synthetic */ void c(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f58c8f", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.b(z);
        }
    }

    public static final /* synthetic */ boolean d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f14624c8", new Object[]{dVar})).booleanValue() : dVar.o();
    }

    public static final /* synthetic */ void e(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b10c6a3", new Object[]{dVar});
        } else {
            dVar.an();
        }
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.shop2023.nativeview.b f(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.shop2023.nativeview.b) ipChange.ipc$dispatch("d96d4ba2", new Object[]{dVar}) : dVar.Y;
    }

    public static final /* synthetic */ int g(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9ea60a54", new Object[]{dVar})).intValue() : dVar.aa();
    }

    public static final /* synthetic */ ShopOptSwipeLayout h(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopOptSwipeLayout) ipChange.ipc$dispatch("e35682d5", new Object[]{dVar}) : dVar.i;
    }

    public static final /* synthetic */ void i(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("123b4e1f", new Object[]{dVar});
        } else {
            dVar.ao();
        }
    }

    public static final /* synthetic */ void j(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c05effe", new Object[]{dVar});
        } else {
            dVar.aj();
        }
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.shop2023.template.g m(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.shop2023.template.g) ipChange.ipc$dispatch("b08bba06", new Object[]{dVar}) : dVar.R;
    }

    public static final /* synthetic */ EmbedShopLoftComponent o(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EmbedShopLoftComponent) ipChange.ipc$dispatch("207b07d0", new Object[]{dVar}) : dVar.O;
    }

    public static final /* synthetic */ FragmentActivity p(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentActivity) ipChange.ipc$dispatch("2ef7244b", new Object[]{dVar}) : dVar.a();
    }

    public static final /* synthetic */ void q(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0905d17", new Object[]{dVar});
        } else {
            dVar.ah();
        }
    }

    public static final /* synthetic */ boolean s(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5425a0d9", new Object[]{dVar})).booleanValue() : dVar.ac();
    }

    public static final /* synthetic */ FrameLayout t(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("be67b5a5", new Object[]{dVar}) : dVar.k;
    }

    public final com.alibaba.triver.triver_shop.shop2023.data.d U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.shop2023.data.d) ipChange.ipc$dispatch("e5d1ec18", new Object[]{this}) : this.A;
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.b, com.alibaba.triver.triver_shop.newShop.view.component.a
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
        this.ad = shopData.bu();
        ceg.Companion.b(q.a("ggg initComponent ", (Object) shopData.as()));
        super.a(context, shopData, shopDXEngine);
        context.getLifecycle().addObserver(I());
        this.ac = shopData.bc().k();
        if (g() != 0) {
            z = true;
        }
        this.w = z;
        shopData.G().a(new e());
        shopData.b(new FarmShop$initComponent$2(this, shopData));
        shopData.G().c(new FarmShop$initComponent$3(this));
        shopData.G().a(new FarmShop$initComponent$4(this));
        shopData.G().b(new FarmShop$initComponent$5(this));
        this.I = ViewConfiguration.get(context).getScaledTouchSlop();
        l.a((Activity) context, true);
        ab();
        shopData.b(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_INIT_SHOP_BASE_VIEW, Long.valueOf(ceiVar.a()));
        ceiVar.b();
        ShopOptSwipeLayout shopOptSwipeLayout = this.i;
        if (shopOptSwipeLayout == null) {
            q.b("outerSwiperLayout");
            throw null;
        }
        shopOptSwipeLayout.setScrollThreshold(this.I);
        this.ab = new com.alibaba.triver.triver_shop.shop2023.nativeview.i(this);
        X();
        W();
        aj();
        shopData.b(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_INIT_SHOP_TEMPLATE_COMPONENT_COST, Long.valueOf(ceiVar.a()));
        l(true);
    }

    private final boolean V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d169e1", new Object[]{this})).booleanValue() : q.a((Object) b().as(), (Object) "farmshop_z");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void W() {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.triver.triver_shop.shop2023.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r10
            java.lang.String r2 = "4df815e"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            com.alibaba.triver.triver_shop.newShop.data.d r0 = r10.b()
            com.alibaba.triver.triver_shop.newShop.data.d$c r0 = r0.bc()
            com.alibaba.triver.triver_shop.shop2023.data.b r0 = r0.h()
            int r1 = r0.a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = com.alibaba.triver.triver_shop.newShop.ext.o.d(r1)
            int r1 = r1 << r3
            r4 = 0
            kotlin.Result$a r5 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = r0.c()     // Catch: java.lang.Throwable -> L44
            int r5 = android.graphics.Color.parseColor(r5)     // Catch: java.lang.Throwable -> L44
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L44
            kotlin.t r6 = kotlin.t.INSTANCE     // Catch: java.lang.Throwable -> L42
            kotlin.Result.m2371constructorimpl(r6)     // Catch: java.lang.Throwable -> L42
            goto L4f
        L42:
            r6 = move-exception
            goto L46
        L44:
            r6 = move-exception
            r5 = r4
        L46:
            kotlin.Result$a r7 = kotlin.Result.Companion
            java.lang.Object r6 = kotlin.i.a(r6)
            kotlin.Result.m2371constructorimpl(r6)
        L4f:
            if (r5 != 0) goto L52
            return
        L52:
            int r5 = r5.intValue()
            r10.ai = r3
            float r6 = r0.e()
            com.alibaba.triver.triver_shop.shop2023.data.d r7 = r10.A
            int r7 = r7.f()
            float r7 = (float) r7
            float r6 = r6 * r7
            int r6 = (int) r6
            int r1 = r1 - r6
            android.view.View r7 = r10.r
            java.lang.String r8 = "shopBackgroundColorViewPart1"
            if (r7 == 0) goto Lcb
            com.alibaba.triver.triver_shop.newShop.ext.o.a(r7, r6)
            android.view.View r7 = r10.s
            java.lang.String r9 = "shopBackgroundColorViewPart2"
            if (r7 == 0) goto Lc7
            com.alibaba.triver.triver_shop.newShop.ext.o.a(r7, r1)
            android.view.View r1 = r10.s
            if (r1 == 0) goto Lc3
            r1.setBackgroundColor(r5)
            android.view.View r1 = r10.s
            if (r1 == 0) goto Lbf
            com.alibaba.triver.triver_shop.newShop.ext.o.c(r1, r6)
            float r0 = r0.d()
            r1 = 255(0xff, float:3.57E-43)
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = (int) r0
            int r1 = android.graphics.Color.red(r5)
            int r6 = android.graphics.Color.green(r5)
            int r7 = android.graphics.Color.blue(r5)
            int r0 = android.graphics.Color.argb(r0, r1, r6, r7)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r6 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP
            r7 = 2
            int[] r7 = new int[r7]
            r7[r2] = r5
            r7[r3] = r0
            r1.<init>(r6, r7)
            android.view.View r0 = r10.r
            if (r0 == 0) goto Lbb
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            com.alibaba.triver.triver_shop.newShop.ext.o.a(r0, r1)
            return
        Lbb:
            kotlin.jvm.internal.q.b(r8)
            throw r4
        Lbf:
            kotlin.jvm.internal.q.b(r9)
            throw r4
        Lc3:
            kotlin.jvm.internal.q.b(r9)
            throw r4
        Lc7:
            kotlin.jvm.internal.q.b(r9)
            throw r4
        Lcb:
            kotlin.jvm.internal.q.b(r8)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.shop2023.d.W():void");
    }

    private final void X() {
        com.alibaba.triver.triver_shop.container.shopLoft.a a2;
        b.a a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed98df", new Object[]{this});
            return;
        }
        Map<String, ShopComponentModel> g2 = b().bc().g();
        if (g2 == null) {
            ceg.Companion.b("shopComponentData null");
            return;
        }
        a(g2);
        View view = null;
        if (g2.get("tb_shop_sub_tab_2023") != null) {
            U().h(b().bc().i());
            this.Z = new com.alibaba.triver.triver_shop.shop2023.nativeview.l(a(), b(), U().e());
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.Y;
            if (bVar != null) {
                bVar.a(this.Z);
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar = this.Z;
            if (cVar != null) {
                cVar.a(false);
            }
            EnhancedViewPager enhancedViewPager = this.h;
            if (enhancedViewPager == null) {
                q.b("contentViewPager");
                throw null;
            }
            enhancedViewPager.addOnPageChangeListener(this.Z);
            com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar2 = this.Z;
            if (cVar2 != null) {
                cVar2.a(new FarmShop$initTemplateComponent$1$1(this));
            }
            FrameLayout frameLayout = this.k;
            if (frameLayout == null) {
                q.b("navViewContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar3 = this.Z;
            q.a(cVar3);
            frameLayout.addView(cVar3.a(), o.a(0, U().e(), 0, 0, 0, 0, 0, 125, null));
        }
        if (q()) {
            this.A.d(this.M);
            if (V()) {
                this.A.e(this.M);
            } else {
                this.A.e(m() + this.y.e());
            }
        } else {
            this.A.d(m() + this.y.e());
            com.alibaba.triver.triver_shop.shop2023.data.d dVar = this.A;
            dVar.e(dVar.f());
        }
        FrameLayout frameLayout2 = this.k;
        if (frameLayout2 == null) {
            q.b("navViewContainer");
            throw null;
        }
        o.a(frameLayout2, -2);
        FrameLayout frameLayout3 = this.k;
        if (frameLayout3 == null) {
            q.b("navViewContainer");
            throw null;
        }
        o.c(frameLayout3, this.A.f());
        b().bc().a(this.A.f());
        if (q()) {
            this.m = new Tab3LiveContentRender(a(), new com.alibaba.triver.triver_shop.newShop.data.g(com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("type", "nativeLiveContainer"), j.a("payload", com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("source", com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("shopLive2023", b().bc().n())))))), b(), 0, 0), true);
            ShopComponentModel f2 = b().bc().b() ? new d.c(b()).f() : b().bc().o();
            if (f2 != null) {
                this.R = new com.alibaba.triver.triver_shop.shop2023.template.g(f2, !b().bc().b(), false);
                com.alibaba.triver.triver_shop.newShop.view.component.a.a(this, this.R, (String) null, 2, (Object) null);
                com.alibaba.triver.triver_shop.shop2023.template.g gVar = this.R;
                q.a(gVar);
                gVar.a(a(), b(), c(), null);
                ViewGroup viewGroup = this.l;
                if (viewGroup == null) {
                    q.b("bigCardContainer");
                    throw null;
                }
                com.alibaba.triver.triver_shop.shop2023.template.g gVar2 = this.R;
                q.a(gVar2);
                View f3 = gVar2.f();
                com.alibaba.triver.triver_shop.shop2023.data.c cVar4 = this.N;
                viewGroup.addView(f3, o.a(0, o.e(Integer.valueOf(f2.getRenderHeight())), 0, cVar4 == null ? 0 : cVar4.b(), 0, 0, 80, 53, null));
                EmbedShopLoftComponent embedShopLoftComponent = this.O;
                if (embedShopLoftComponent != null && (a2 = embedShopLoftComponent.a()) != null && (a3 = a2.a()) != null) {
                    a3.a(h.a.class.getName(), new g());
                }
            }
        }
        b(g2);
        this.C = aa();
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar2 = this.Y;
        if (bVar2 != null) {
            bVar2.a(this.C);
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar3 = this.Y;
        if (bVar3 != null) {
            com.alibaba.triver.triver_shop.shop2023.template.d dVar2 = this.Q;
            bVar3.b(dVar2 == null ? null : dVar2.f());
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar4 = this.Y;
        if (bVar4 != null) {
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.P;
            if (shop2023HeaderInfoTemplate != null) {
                view = shop2023HeaderInfoTemplate.f();
            }
            bVar4.a(view);
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar5 = this.Y;
        if (bVar5 != null) {
            bVar5.f();
        }
        b().d(m() + this.z.j());
        com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar5 = this.Z;
        if (cVar5 != null) {
            cVar5.b(true);
        }
        F();
        com.alibaba.triver.triver_shop.shop2023.nativeview.i iVar = this.ab;
        if (iVar == null) {
            return;
        }
        iVar.a(b(), d());
    }

    /* loaded from: classes3.dex */
    public static final class g implements h.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.b.a.InterfaceC0126a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public g() {
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.h.a
        public void b() {
            View f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            com.alibaba.triver.triver_shop.shop2023.template.g m = d.m(d.this);
            if (m != null && (f = m.f()) != null) {
                o.b(f);
            }
            EmbedShopLoftComponent o = d.o(d.this);
            if (o == null) {
                return;
            }
            o.h();
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.h.a
        public void c() {
            View f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            com.alibaba.triver.triver_shop.shop2023.template.g m = d.m(d.this);
            if (m != null && (f = m.f()) != null) {
                o.d(f);
            }
            EmbedShopLoftComponent o = d.o(d.this);
            if (o == null) {
                return;
            }
            o.g();
        }
    }

    private final void a(Map<String, ShopComponentModel> map) {
        int i2;
        int i3;
        int i4;
        String string;
        Integer d;
        int intValue;
        String string2;
        Integer d2;
        Throwable th;
        JSONObject jSONObject;
        TUrlImageView b2;
        int e2;
        Integer d3;
        Integer d4;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        boolean z = map.get("tb_shop_header_shop_info_2023_native") != null;
        ShopComponentModel shopComponentModel = map.get("tb_shop_header_shop_info_2023");
        if (shopComponentModel != null) {
            if (z) {
                JSONObject data = shopComponentModel.getData();
                z = q.a((Object) "true", (Object) ((data == null || (jSONObject2 = data.getJSONObject("feature")) == null) ? null : jSONObject2.getString("showNativeShopInfo")));
            }
            this.z.a(z);
            this.P = new Shop2023HeaderInfoTemplate(shopComponentModel, new FarmShop$initHeader$1$1(this));
            com.alibaba.triver.triver_shop.newShop.view.component.a.a(this, this.P, (String) null, 2, (Object) null);
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.P;
            if (shop2023HeaderInfoTemplate != null) {
                shop2023HeaderInfoTemplate.a(new FarmShop$initHeader$1$2(this));
            }
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate2 = this.P;
            q.a(shop2023HeaderInfoTemplate2);
            shop2023HeaderInfoTemplate2.a(a(), b(), c(), null);
            JSONObject extData = shopComponentModel.getExtData();
            if (extData != null) {
                com.alibaba.triver.triver_shop.shop2023.data.a aVar = this.z;
                String string3 = extData.getString("indexPageHeaderFoldedStyleHeight");
                aVar.f((string3 == null || (d3 = n.d(string3)) == null) ? 0 : o.e(d3));
                com.alibaba.triver.triver_shop.shop2023.data.a aVar2 = this.z;
                String string4 = extData.getString("otherPageHeaderStyleHeight");
                aVar2.g((string4 == null || (d4 = n.d(string4)) == null) ? 0 : o.e(d4));
                t tVar = t.INSTANCE;
                t tVar2 = t.INSTANCE;
            }
            if (this.z.i() == 0) {
                this.z.f(o.e((Number) 182));
            }
            if (this.z.j() == 0) {
                this.z.g(o.e((Number) 121));
            }
            if (z) {
                this.z.b(o.e(Integer.valueOf(shopComponentModel.getRenderHeight())));
            } else {
                this.z.h(o.e(Integer.valueOf(shopComponentModel.getRenderHeight())));
            }
            FrameLayout frameLayout = this.g;
            if (frameLayout == null) {
                q.b("searchBarContainer");
                throw null;
            }
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate3 = this.P;
            q.a(shop2023HeaderInfoTemplate3);
            View f2 = shop2023HeaderInfoTemplate3.f();
            int d5 = o.d((Number) 11);
            if (z) {
                e2 = this.z.b();
            } else {
                e2 = this.z.e();
            }
            frameLayout.addView(f2, o.a(0, e2, d5, 0, 0, 0, 0, 121, null));
            t tVar3 = t.INSTANCE;
            t tVar4 = t.INSTANCE;
        }
        ShopComponentModel shopComponentModel2 = map.get("tb_shop_header_shop_info_2023_native");
        if (shopComponentModel2 != null) {
            int c2 = o.c(Integer.valueOf(shopComponentModel2.getRenderHeight()));
            this.Y = new com.alibaba.triver.triver_shop.shop2023.nativeview.k(a(), b(), this.ad, V(), this.z.b());
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.Y;
            if (bVar != null) {
                Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate4 = this.P;
                bVar.c(shop2023HeaderInfoTemplate4 == null ? null : shop2023HeaderInfoTemplate4.f());
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar2 = this.Y;
            if (bVar2 != null && (b2 = bVar2.b()) != null) {
                b2.setOnClickListener(new f());
                t tVar5 = t.INSTANCE;
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar3 = this.Y;
            if (bVar3 != null) {
                bVar3.a(new FarmShop$initHeader$2$2(this));
            }
            com.alibaba.triver.triver_shop.shop2023.template.e a2 = com.alibaba.triver.triver_shop.shop2023.template.e.Companion.a(b(), c());
            if (a2 != null) {
                this.S = a2;
                com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar4 = this.Y;
                if (bVar4 != null) {
                    bVar4.d(a2.f());
                    t tVar6 = t.INSTANCE;
                }
            }
            FrameLayout frameLayout2 = this.n;
            if (frameLayout2 == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar5 = this.Y;
            q.a(bVar5);
            frameLayout2.addView(bVar5.e(), o.a(0, c2, 0, 0, 0, 0, 0, 125, null));
            com.alibaba.triver.triver_shop.shop2023.data.a aVar3 = this.z;
            JSONObject extData2 = shopComponentModel2.getExtData();
            Integer valueOf = (extData2 == null || (string = extData2.getString("indexPageHeaderFoldedStyleHeight")) == null || (d = n.d(string)) == null) ? null : Integer.valueOf(o.e(d));
            if (valueOf != null) {
                intValue = valueOf.intValue();
            } else {
                intValue = o.e((Number) 134);
            }
            aVar3.f(intValue);
            com.alibaba.triver.triver_shop.shop2023.data.a aVar4 = this.z;
            JSONObject extData3 = shopComponentModel2.getExtData();
            Integer valueOf2 = (extData3 == null || (string2 = extData3.getString("otherPageHeaderStyleHeight")) == null || (d2 = n.d(string2)) == null) ? null : Integer.valueOf(o.e(d2));
            aVar4.g(valueOf2 == null ? o.e((Number) 134) : valueOf2.intValue());
            com.alibaba.triver.triver_shop.shop2023.data.a aVar5 = this.z;
            int j = aVar5.j();
            JSONObject extData4 = shopComponentModel2.getExtData();
            int i5 = 66;
            if (extData4 != null && (jSONObject = extData4.getJSONObject("otherPageStyleConfig")) != null) {
                i5 = jSONObject.getIntValue("shopIconHeight");
            }
            aVar5.g(j + ((int) (o.c(Integer.valueOf(i5)) * 0.18f)));
            this.z.a(c2);
            this.z.h(c2);
            if (!this.ad) {
                com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar6 = this.Y;
                View[] viewArr = new View[3];
                FrameLayout frameLayout3 = this.j;
                if (frameLayout3 == null) {
                    q.b("centerContainer");
                    throw null;
                }
                viewArr[0] = frameLayout3;
                FrameLayout frameLayout4 = this.k;
                if (frameLayout4 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                viewArr[1] = frameLayout4;
                FrameLayout frameLayout5 = this.n;
                if (frameLayout5 != null) {
                    viewArr[2] = frameLayout5;
                    this.aa = new com.alibaba.triver.triver_shop.shop2023.nativeview.g(bVar6, viewArr);
                    if (this.ai) {
                        com.alibaba.triver.triver_shop.shop2023.nativeview.g gVar = this.aa;
                        if (gVar != null) {
                            View view = this.q;
                            if (view == null) {
                                q.b("shopBackgroundColorViewContainer");
                                throw null;
                            }
                            gVar.a(view);
                        }
                        th = null;
                    } else {
                        th = null;
                        com.alibaba.triver.triver_shop.shop2023.nativeview.g gVar2 = this.aa;
                        if (gVar2 != null) {
                            TUrlImageView tUrlImageView = this.p;
                            if (tUrlImageView == null) {
                                q.b("shopBackgroundImg");
                                throw null;
                            }
                            gVar2.a(tUrlImageView);
                        }
                    }
                    com.alibaba.triver.triver_shop.shop2023.nativeview.g gVar3 = this.aa;
                    if (gVar3 != null) {
                        FrameLayout frameLayout6 = this.g;
                        if (frameLayout6 == null) {
                            q.b("searchBarContainer");
                            throw th;
                        } else {
                            gVar3.a(frameLayout6);
                            t tVar7 = t.INSTANCE;
                        }
                    }
                } else {
                    q.b("shopHeaderContainer");
                    throw null;
                }
            }
            this.ag = new com.alibaba.triver.triver_shop.shop2023.nativeview.f(this.Y);
            com.alibaba.triver.triver_shop.shop2023.nativeview.f fVar = this.ag;
            if (fVar != null) {
                FrameLayout frameLayout7 = this.j;
                if (frameLayout7 == null) {
                    q.b("centerContainer");
                    throw null;
                }
                fVar.a(frameLayout7);
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.f fVar2 = this.ag;
            if (fVar2 != null) {
                fVar2.b(d());
                t tVar8 = t.INSTANCE;
            }
        }
        LinearLayout linearLayout = new LinearLayout(a());
        linearLayout.setOrientation(1);
        ShopComponentModel shopComponentModel3 = map.get("tb_shop_header_farmer_endorsement_2024");
        if (shopComponentModel3 != null) {
            this.ae = new k(shopComponentModel3);
            com.alibaba.triver.triver_shop.newShop.view.component.a.a(this, this.ae, (String) null, 2, (Object) null);
            k kVar = this.ae;
            if (kVar != null) {
                kVar.a(a(), b(), c(), null);
                t tVar9 = t.INSTANCE;
            }
            ceg.Companion.a(q.a("ggg tb_shop_header_farmer_endorsement_2024 init ", (Object) Integer.valueOf(shopComponentModel3.getRenderHeight())));
            i2 = o.d(Integer.valueOf(shopComponentModel3.getRenderHeight()));
            k kVar2 = this.ae;
            linearLayout.addView(kVar2 == null ? null : kVar2.f(), o.a(0, i2, 0, 0, 0, 0, 61, null));
            t tVar10 = t.INSTANCE;
            t tVar11 = t.INSTANCE;
        } else {
            i2 = 0;
        }
        ShopComponentModel shopComponentModel4 = map.get("tb_shop_header_honor_list_2023");
        if (shopComponentModel4 != null) {
            com.alibaba.triver.triver_shop.shop2023.template.i iVar = new com.alibaba.triver.triver_shop.shop2023.template.i(shopComponentModel4);
            com.alibaba.triver.triver_shop.newShop.view.component.a.a(this, iVar, (String) null, 2, (Object) null);
            iVar.a(a(), b(), c(), null);
            i3 = o.c(Integer.valueOf(shopComponentModel4.getRenderHeight()));
            ceg.Companion.a(q.a("ggg tb_shop_header_honor_list_2023 ", (Object) Integer.valueOf(i3)));
            linearLayout.addView(iVar.f(), o.a(0, o.e(Integer.valueOf(shopComponentModel4.getRenderHeight())), 0, 0, 0, 0, 61, null));
            t tVar12 = t.INSTANCE;
            t tVar13 = t.INSTANCE;
        } else {
            i3 = 0;
        }
        ShopComponentModel shopComponentModel5 = map.get("tb_shop_header_tag_list_2023");
        if (shopComponentModel5 != null) {
            Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate = new Shop2023HeaderTagListTemplate(shopComponentModel5);
            this.T = shop2023HeaderTagListTemplate;
            com.alibaba.triver.triver_shop.newShop.view.component.a.a(this, shop2023HeaderTagListTemplate, (String) null, 2, (Object) null);
            shop2023HeaderTagListTemplate.a(new FarmShop$initHeader$5$1(this, shop2023HeaderTagListTemplate));
            shop2023HeaderTagListTemplate.a(a(), b(), c(), null);
            i4 = o.c(Integer.valueOf(shopComponentModel5.getRenderHeight()));
            ceg.Companion.a(q.a("ggg tb_shop_header_tag_list_2023 ", (Object) Integer.valueOf(i4)));
            FrameLayout frameLayout8 = new FrameLayout(a());
            o.a(frameLayout8, shop2023HeaderTagListTemplate.f());
            linearLayout.addView(frameLayout8, o.a(-2, i4, 0, 0, 0, 0, 60, null));
            t tVar14 = t.INSTANCE;
            t tVar15 = t.INSTANCE;
        } else {
            i4 = 0;
        }
        this.W = linearLayout;
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar7 = this.Y;
        if (bVar7 != null) {
            bVar7.b(linearLayout);
        }
        FrameLayout frameLayout9 = this.n;
        if (frameLayout9 != null) {
            frameLayout9.addView(linearLayout, o.a(0, 0, this.z.e(), 0, 0, 0, 0, 123, null));
            this.B.h(i2 + i3 + i4);
            this.y.h(this.z.e() + this.B.e());
            this.y.d(m());
            FrameLayout frameLayout10 = this.n;
            if (frameLayout10 == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            o.a(frameLayout10, this.y.e());
            FrameLayout frameLayout11 = this.n;
            if (frameLayout11 != null) {
                o.c(frameLayout11, this.y.f());
                return;
            } else {
                q.b("shopHeaderContainer");
                throw null;
            }
        }
        q.b("shopHeaderContainer");
        throw null;
    }

    private final void b(Map<String, ShopComponentModel> map) {
        ShopComponentModel shopComponentModel;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(a());
        this.ah = linearLayout;
        linearLayout.setOrientation(1);
        if (this.ad && V() && !q()) {
            ShopComponentModel shopComponentModel2 = map.get("tb_shop_header_new_farmers_2024");
            if (shopComponentModel2 != null) {
                k kVar = new k(shopComponentModel2);
                com.alibaba.triver.triver_shop.newShop.view.component.a.a(this, kVar, (String) null, 2, (Object) null);
                i2 = 0 + o.d(Integer.valueOf(shopComponentModel2.getRenderHeight()));
                kVar.a(a(), b(), c(), null);
                ceg.Companion.a(q.a("ggg tb_shop_header_new_farmers_2024 init ", (Object) Integer.valueOf(shopComponentModel2.getRenderHeight())));
                linearLayout.addView(kVar.f(), o.a(0, o.e(Integer.valueOf(shopComponentModel2.getRenderHeight())), 0, 0, 0, 0, 61, null));
            }
            ShopComponentModel shopComponentModel3 = map.get("tb_shop_header_live_honor_list_2024");
            if (shopComponentModel3 != null) {
                k kVar2 = new k(shopComponentModel3);
                com.alibaba.triver.triver_shop.newShop.view.component.a.a(this, kVar2, (String) null, 2, (Object) null);
                i2 += o.d(Integer.valueOf(shopComponentModel3.getRenderHeight()));
                kVar2.a(a(), b(), c(), null);
                ceg.Companion.a(q.a("ggg tb_shop_header_live_honor_list_2024 init ", (Object) Integer.valueOf(shopComponentModel3.getRenderHeight())));
                linearLayout.addView(kVar2.f(), o.a(0, o.e(Integer.valueOf(shopComponentModel3.getRenderHeight())), 0, 0, 0, 0, 61, null));
            }
        }
        if (!q() && (shopComponentModel = map.get("tb_shop_header_live_item_2024")) != null) {
            this.af = new k(shopComponentModel);
            com.alibaba.triver.triver_shop.newShop.view.component.a.a(this, this.af, (String) null, 2, (Object) null);
            i2 += o.d(Integer.valueOf(shopComponentModel.getRenderHeight()));
            k kVar3 = this.af;
            if (kVar3 != null) {
                kVar3.a(a(), b(), c(), null);
            }
            ceg.Companion.a(q.a("ggg tb_shop_header_live_item_2024 init ", (Object) Integer.valueOf(shopComponentModel.getRenderHeight())));
            k kVar4 = this.af;
            linearLayout.addView(kVar4 == null ? null : kVar4.f(), o.a(0, o.e(Integer.valueOf(shopComponentModel.getRenderHeight())), 0, 0, 0, 0, 61, null));
        }
        if (this.ad && V() && !q()) {
            FrameLayout frameLayout = this.f;
            if (frameLayout != null) {
                frameLayout.addView(linearLayout, o.a(0, 0, m() + this.z.j(), 0, 0, 0, 0, 123, null));
                this.A.d(m() + this.z.j() + i2);
                this.A.e(m() + this.z.j() + i2);
                FrameLayout frameLayout2 = this.k;
                if (frameLayout2 != null) {
                    o.c(frameLayout2, this.A.f());
                    return;
                } else {
                    q.b("navViewContainer");
                    throw null;
                }
            }
            q.b("newfarmerContainer");
            throw null;
        }
        FrameLayout frameLayout3 = this.n;
        if (frameLayout3 != null) {
            frameLayout3.addView(linearLayout, o.a(0, 0, this.y.e(), 0, 0, 0, 0, 123, null));
            com.alibaba.triver.triver_shop.shop2023.data.d dVar = this.y;
            dVar.h(dVar.e() + i2);
            com.alibaba.triver.triver_shop.shop2023.data.d dVar2 = this.A;
            dVar2.d(dVar2.f() + i2);
            com.alibaba.triver.triver_shop.shop2023.data.d dVar3 = this.A;
            dVar3.e(dVar3.g() + i2);
            FrameLayout frameLayout4 = this.n;
            if (frameLayout4 == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            o.a(frameLayout4, this.y.e());
            FrameLayout frameLayout5 = this.k;
            if (frameLayout5 != null) {
                o.c(frameLayout5, this.A.f());
                return;
            } else {
                q.b("navViewContainer");
                throw null;
            }
        }
        q.b("shopHeaderContainer");
        throw null;
    }

    private final View Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c7d2f0a2", new Object[]{this});
        }
        ViewGroup viewGroup = this.W;
        if (viewGroup != null) {
            return viewGroup;
        }
        com.alibaba.triver.triver_shop.shop2023.template.d dVar = this.Q;
        if (dVar != null) {
            return dVar.f();
        }
        return null;
    }

    private final void a(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50fe2fe", new Object[]{this, aVar, layoutParams});
            return;
        }
        int i2 = this.V;
        int i3 = this.U;
        if (i2 >= i3) {
            return;
        }
        this.V = i2 + 1;
        if (this.V < i3) {
            return;
        }
        F();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void F() {
        View Y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
        } else if (i() == 0) {
            cej cejVar = this.o;
            if (cejVar == null) {
                q.b("shopContainerPageAdapter");
                throw null;
            }
            cejVar.a(0);
            if (!q() || (Y = Y()) == null) {
                return;
            }
            o.d(Y);
        } else {
            o.a(d(), new FarmShop$allTemplateLoadFinish$1(this));
        }
    }

    private final boolean q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c36f5d60", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            if (o() || ar()) {
                return false;
            }
        } else if (!ar()) {
            return false;
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.f fVar = this.ag;
        if (fVar != null) {
            fVar.a(z);
        }
        v(z);
        aj();
        EnhancedViewPager enhancedViewPager = this.h;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCanScroll(!z);
            return true;
        }
        q.b("contentViewPager");
        throw null;
    }

    private final int Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("509c7d4", new Object[]{this})).intValue();
        }
        if (C()) {
            return this.A.f();
        }
        return this.A.g();
    }

    private final int aa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aaf2809a", new Object[]{this})).intValue() : (Z() - m()) - this.z.j();
    }

    private final void ab() {
        com.alibaba.triver.triver_shop.shop2023.data.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab009828", new Object[]{this});
            return;
        }
        View a3 = o.a(a(), R.layout.view_shop_farm_base_layout);
        if (a3 == null) {
            return;
        }
        this.i = new ShopOptSwipeLayout(a());
        View findViewById = a3.findViewById(R.id.shop_2023_search_bar_container);
        q.b(findViewById, "contentView.findViewById(R.id.shop_2023_search_bar_container)");
        this.g = (FrameLayout) findViewById;
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            q.b("searchBarContainer");
            throw null;
        }
        frameLayout.setPadding(0, m(), 0, 0);
        View findViewById2 = a3.findViewById(R.id.shop_2023_content_part);
        q.b(findViewById2, "contentView.findViewById(R.id.shop_2023_content_part)");
        this.j = (FrameLayout) findViewById2;
        View findViewById3 = a3.findViewById(R.id.shop_2023_big_card_part);
        q.b(findViewById3, "contentView.findViewById(R.id.shop_2023_big_card_part)");
        this.l = (ViewGroup) findViewById3;
        View findViewById4 = a3.findViewById(R.id.shop_new_farmer_container);
        q.b(findViewById4, "contentView.findViewById(R.id.shop_new_farmer_container)");
        this.f = (FrameLayout) findViewById4;
        View findViewById5 = a3.findViewById(R.id.shop_2023_index_nav_part);
        q.b(findViewById5, "contentView.findViewById(R.id.shop_2023_index_nav_part)");
        this.k = (FrameLayout) findViewById5;
        View findViewById6 = a3.findViewById(R.id.shop_2023_top_header_part);
        q.b(findViewById6, "contentView.findViewById(R.id.shop_2023_top_header_part)");
        this.n = (FrameLayout) findViewById6;
        View findViewById7 = a3.findViewById(R.id.shop_2023_background_img);
        q.b(findViewById7, "contentView.findViewById(R.id.shop_2023_background_img)");
        this.p = (TUrlImageView) findViewById7;
        View findViewById8 = a3.findViewById(R.id.shop_2023_background_color_view_container);
        q.b(findViewById8, "contentView.findViewById(R.id.shop_2023_background_color_view_container)");
        this.q = findViewById8;
        View findViewById9 = a3.findViewById(R.id.shop_2023_background_color_view);
        q.b(findViewById9, "contentView.findViewById(R.id.shop_2023_background_color_view)");
        this.r = findViewById9;
        View findViewById10 = a3.findViewById(R.id.shop_2023_background_color_view_2);
        q.b(findViewById10, "contentView.findViewById(R.id.shop_2023_background_color_view_2)");
        this.s = findViewById10;
        EnhancedViewPager enhancedViewPager = new EnhancedViewPager(a());
        enhancedViewPager.setId(R.id.new_shop_view_view_pager);
        com.alibaba.triver.triver_shop.newShop.view.provider.j jVar = new com.alibaba.triver.triver_shop.newShop.view.provider.j(b());
        this.h = enhancedViewPager;
        FrameLayout frameLayout2 = this.k;
        if (frameLayout2 == null) {
            q.b("navViewContainer");
            throw null;
        }
        frameLayout2.setZ(0.1f);
        EnhancedViewPager enhancedViewPager2 = enhancedViewPager;
        o.g(enhancedViewPager2);
        EnhancedViewPager enhancedViewPager3 = this.h;
        if (enhancedViewPager3 == null) {
            q.b("contentViewPager");
            throw null;
        }
        enhancedViewPager3.setOffscreenPageLimit(jVar.a() - 1);
        FragmentManager supportFragmentManager = a().getSupportFragmentManager();
        q.b(supportFragmentManager, "context.supportFragmentManager");
        this.o = new cej(supportFragmentManager);
        cej cejVar = this.o;
        if (cejVar == null) {
            q.b("shopContainerPageAdapter");
            throw null;
        }
        cejVar.a(jVar);
        cej cejVar2 = this.o;
        if (cejVar2 == null) {
            q.b("shopContainerPageAdapter");
            throw null;
        }
        enhancedViewPager.setAdapter(cejVar2);
        enhancedViewPager.addOnPageChangeListener(this);
        FrameLayout frameLayout3 = this.j;
        if (frameLayout3 == null) {
            q.b("centerContainer");
            throw null;
        }
        o.a(frameLayout3, enhancedViewPager2);
        ShopOptSwipeLayout shopOptSwipeLayout = this.i;
        if (shopOptSwipeLayout == null) {
            q.b("outerSwiperLayout");
            throw null;
        }
        shopOptSwipeLayout.setSwipeListener(this);
        ShopOptSwipeLayout shopOptSwipeLayout2 = this.i;
        if (shopOptSwipeLayout2 == null) {
            q.b("outerSwiperLayout");
            throw null;
        }
        shopOptSwipeLayout2.setEnableInterceptAllEventByDownEventIntercept(cen.Companion.aw());
        ShopOptSwipeLayout shopOptSwipeLayout3 = this.i;
        if (shopOptSwipeLayout3 == null) {
            q.b("outerSwiperLayout");
            throw null;
        }
        o.a(shopOptSwipeLayout3, a3);
        ShopOptSwipeLayout shopOptSwipeLayout4 = this.i;
        if (shopOptSwipeLayout4 == null) {
            q.b("outerSwiperLayout");
            throw null;
        }
        shopOptSwipeLayout4.setExpandedStatusGetter(new FarmShop$initView$1(this));
        FrameLayout d = d();
        ShopOptSwipeLayout shopOptSwipeLayout5 = this.i;
        if (shopOptSwipeLayout5 == null) {
            q.b("outerSwiperLayout");
            throw null;
        }
        o.a(d, shopOptSwipeLayout5);
        com.alibaba.triver.triver_shop.shop2023.data.b h2 = b().bc().h();
        String b2 = h2.b();
        if (b2 != null) {
            TUrlImageView tUrlImageView = this.p;
            if (tUrlImageView == null) {
                q.b("shopBackgroundImg");
                throw null;
            }
            tUrlImageView.setImageUrl(b2);
            TUrlImageView tUrlImageView2 = this.p;
            if (tUrlImageView2 == null) {
                q.b("shopBackgroundImg");
                throw null;
            }
            tUrlImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            TUrlImageView tUrlImageView3 = this.p;
            if (tUrlImageView3 == null) {
                q.b("shopBackgroundImg");
                throw null;
            }
            o.a(tUrlImageView3, o.e(Integer.valueOf(h2.a())));
        }
        if (!l.b()) {
            c(b().bc().d());
        }
        if (!q()) {
            return;
        }
        if (V()) {
            int screenHeight = DisplayUtil.getScreenHeight(d().getContext());
            a2 = new com.alibaba.triver.triver_shop.shop2023.data.c((int) (screenHeight * b().bc().p()), b().bc().a().b());
            this.D = screenHeight - a2.a();
        } else {
            a2 = b().bc().a();
            this.D = a2.b();
        }
        this.N = a2;
        this.M = a2.a() - a2.b();
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            q.b("bigCardContainer");
            throw null;
        }
        o.a(viewGroup, a2.a());
        if (!b().bc().m()) {
            return;
        }
        EmbedShopLoftComponent embedShopLoftComponent = new EmbedShopLoftComponent(a(), b(), c());
        if (b().bc().b()) {
            b().d(true);
            embedShopLoftComponent.a().a(true);
        }
        embedShopLoftComponent.a(new FarmShop$initView$3(this));
        ViewGroup viewGroup2 = this.l;
        if (viewGroup2 == null) {
            q.b("bigCardContainer");
            throw null;
        }
        o.a(viewGroup2, embedShopLoftComponent.i());
        try {
            embedShopLoftComponent.f();
        } catch (Exception e2) {
            embedShopLoftComponent.i().setBackgroundColor(-16777216);
            ceg.Companion.a(e2);
        }
        this.O = embedShopLoftComponent;
        if (!b().bc().b()) {
            View view = new View(a());
            o.a(view, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, kotlin.collections.g.a(new Integer[]{0, Integer.valueOf(Color.parseColor("#df000000"))})));
            ViewGroup viewGroup3 = this.l;
            if (viewGroup3 == null) {
                q.b("bigCardContainer");
                throw null;
            }
            viewGroup3.addView(view, o.a(0, o.c((Number) 152), 0, 0, 0, 0, 48, 61, null));
        }
        View view2 = new View(a());
        o.a(view2, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, kotlin.collections.g.a(new Integer[]{0, Integer.valueOf(Color.parseColor("#7f000000")), 0})));
        ViewGroup viewGroup4 = this.l;
        if (viewGroup4 != null) {
            viewGroup4.addView(view2, o.a(0, o.c((Number) 194), 0, a2.b() - o.c((Number) 90), 0, 0, 80, 53, null));
        } else {
            q.b("bigCardContainer");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeUp(View fromTargetView, MotionEvent event, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e512d9", new Object[]{this, fromTargetView, event, new Integer(i2)});
            return;
        }
        q.d(fromTargetView, "fromTargetView");
        q.d(event, "event");
        a(fromTargetView, event, i2);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown(View fromTargetView, MotionEvent event, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74251660", new Object[]{this, fromTargetView, event, new Integer(i2)});
            return;
        }
        q.d(fromTargetView, "fromTargetView");
        q.d(event, "event");
        b(fromTargetView, event, i2);
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
    public void a(View fromTargetView, MotionEvent event, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1985e4", new Object[]{this, fromTargetView, event, new Integer(i2)});
            return;
        }
        q.d(fromTargetView, "fromTargetView");
        q.d(event, "event");
        a(this, i2, false, null, 6, null);
    }

    public static /* synthetic */ void a(d dVar, int i2, boolean z, Integer num, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f00953e0", new Object[]{dVar, new Integer(i2), new Boolean(z), num, new Integer(i3), obj});
            return;
        }
        if ((i3 & 2) != 0) {
            z = true;
        }
        if ((i3 & 4) != 0) {
            num = null;
        }
        dVar.a(i2, z, num);
    }

    private final void a(int i2, boolean z, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde5e73e", new Object[]{this, new Integer(i2), new Boolean(z), num});
        } else if (this.u || !as() || n() || this.L) {
        } else {
            if (z && p()) {
                return;
            }
            if (!this.G) {
                EnhancedViewPager enhancedViewPager = this.h;
                if (enhancedViewPager == null) {
                    q.b("contentViewPager");
                    throw null;
                }
                enhancedViewPager.setCanDispatchToChild(false);
                this.J += Math.abs(i2);
                if (this.J < this.I) {
                    return;
                }
            }
            int T = (int) (i2 * T());
            com.alibaba.triver.triver_shop.shop2023.nativeview.g gVar = this.aa;
            if (gVar != null && gVar.a(T)) {
                return;
            }
            af();
            this.G = true;
            this.H = true;
            EnhancedViewPager enhancedViewPager2 = this.h;
            if (enhancedViewPager2 == null) {
                q.b("contentViewPager");
                throw null;
            }
            enhancedViewPager2.setCanScroll(false);
            if (this.E >= this.C) {
                EnhancedViewPager enhancedViewPager3 = this.h;
                if (enhancedViewPager3 != null) {
                    enhancedViewPager3.setCanDispatchToChild(true);
                    return;
                } else {
                    q.b("contentViewPager");
                    throw null;
                }
            }
            int Z = num == null ? Z() : num.intValue();
            this.E += T;
            this.F -= T;
            int i3 = this.E;
            int i4 = this.C;
            if (i3 > i4) {
                this.E = i4;
                this.F = 0 - this.E;
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.Y;
            if (bVar != null) {
                bVar.c(this.E);
            }
            a(this, 0.0f, 1, (Object) null);
            if (q()) {
                com.alibaba.triver.triver_shop.shop2023.data.c cVar = this.N;
                q.a(cVar);
                int a2 = cVar.a();
                int i5 = this.E;
                if (i5 >= 0) {
                    ViewGroup viewGroup = this.l;
                    if (viewGroup == null) {
                        q.b("bigCardContainer");
                        throw null;
                    }
                    o.a(viewGroup, a2);
                } else {
                    ViewGroup viewGroup2 = this.l;
                    if (viewGroup2 == null) {
                        q.b("bigCardContainer");
                        throw null;
                    }
                    o.a(viewGroup2, a2 - i5);
                }
            }
            FrameLayout frameLayout = this.k;
            if (frameLayout != null) {
                o.c(frameLayout, Z - this.E);
            } else {
                q.b("navViewContainer");
                throw null;
            }
        }
    }

    public static /* synthetic */ void a(d dVar, float f2, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36bee06", new Object[]{dVar, new Float(f2), new Integer(i2), obj});
            return;
        }
        if ((i2 & 1) != 0) {
            f2 = Math.abs(dVar.E);
        }
        dVar.a(f2);
    }

    private final void a(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f2)});
        } else if (ac()) {
        } else {
            float f3 = 1 - (f2 / this.C);
            if (this.ad) {
                FrameLayout frameLayout = this.f;
                if (frameLayout != null) {
                    frameLayout.setAlpha(f3);
                    return;
                } else {
                    q.b("newfarmerContainer");
                    throw null;
                }
            }
            View Y = Y();
            if (Y != null) {
                Y.setAlpha(f3);
            }
            LinearLayout linearLayout = this.ah;
            if (linearLayout != null) {
                linearLayout.setAlpha(f3);
            }
            View Y2 = Y();
            if (Y2 != null) {
                Y2.setTranslationY((-f2) / 3);
            }
            LinearLayout linearLayout2 = this.ah;
            if (linearLayout2 == null) {
                return;
            }
            linearLayout2.setTranslationY((-f2) / 3);
        }
    }

    private final boolean ac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[]{this})).booleanValue() : q() && (C() || V());
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void b(View fromTargetView, MotionEvent event, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a4a3a5", new Object[]{this, fromTargetView, event, new Integer(i2)});
            return;
        }
        q.d(fromTargetView, "fromTargetView");
        q.d(event, "event");
        a(this, i2, false, 2, (Object) null);
    }

    public static /* synthetic */ void a(d dVar, int i2, boolean z, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7abf87", new Object[]{dVar, new Integer(i2), new Boolean(z), new Integer(i3), obj});
            return;
        }
        if ((i3 & 2) != 0) {
            z = true;
        }
        dVar.a(i2, z);
    }

    private final void a(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i2), new Boolean(z)});
        } else if (this.u || !as() || n() || this.L) {
        } else {
            if ((z && p()) || !b().m(b().K())) {
                return;
            }
            if (!this.G) {
                this.J += Math.abs(i2);
                if (this.J < this.I) {
                    return;
                }
            }
            af();
            int T = (int) (i2 * T());
            if (this.E < this.C && ((C() || V()) && q())) {
                ViewGroup viewGroup = this.l;
                if (viewGroup == null) {
                    q.b("bigCardContainer");
                    throw null;
                } else if (!o.f(viewGroup)) {
                    am();
                }
            }
            int Z = Z();
            EnhancedViewPager enhancedViewPager = this.h;
            if (enhancedViewPager == null) {
                q.b("contentViewPager");
                throw null;
            }
            enhancedViewPager.setCanScroll(false);
            this.H = false;
            this.G = true;
            boolean ac = ac();
            EnhancedViewPager enhancedViewPager2 = this.h;
            if (enhancedViewPager2 == null) {
                q.b("contentViewPager");
                throw null;
            }
            enhancedViewPager2.setCanDispatchToChild(false);
            if (this.E - T <= 0 && !ac) {
                com.alibaba.triver.triver_shop.shop2023.nativeview.g gVar = this.aa;
                if (gVar != null) {
                    gVar.b(T);
                }
                this.E = 0;
                this.F = 0;
                EnhancedViewPager enhancedViewPager3 = this.h;
                if (enhancedViewPager3 == null) {
                    q.b("contentViewPager");
                    throw null;
                }
                enhancedViewPager3.setCanDispatchToChild(true);
            } else {
                this.F += T;
                this.E -= T;
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.Y;
            if (bVar != null) {
                bVar.c(this.E);
            }
            a(this, 0.0f, 1, (Object) null);
            if (q()) {
                com.alibaba.triver.triver_shop.shop2023.data.c cVar = this.N;
                q.a(cVar);
                int a2 = cVar.a();
                ViewGroup viewGroup2 = this.l;
                if (viewGroup2 == null) {
                    q.b("bigCardContainer");
                    throw null;
                } else if (viewGroup2.getHeight() + Math.abs(this.F) < a2) {
                    ViewGroup viewGroup3 = this.l;
                    if (viewGroup3 == null) {
                        q.b("bigCardContainer");
                        throw null;
                    }
                    o.a(viewGroup3, a2);
                } else if (this.E <= 0) {
                    ViewGroup viewGroup4 = this.l;
                    if (viewGroup4 == null) {
                        q.b("bigCardContainer");
                        throw null;
                    }
                    o.a(viewGroup4, Math.min(d().getHeight(), a2 + Math.abs(this.F)));
                }
            }
            FrameLayout frameLayout = this.k;
            if (frameLayout == null) {
                q.b("navViewContainer");
                throw null;
            }
            o.c(frameLayout, Z + this.F);
            if (!q() || this.F < this.D || this.v) {
                return;
            }
            o.b(a());
            this.v = true;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        this.v = false;
        EnhancedViewPager enhancedViewPager = this.h;
        Boolean bool = null;
        if (enhancedViewPager == null) {
            q.b("contentViewPager");
            throw null;
        }
        enhancedViewPager.setCanDispatchToChild(true);
        EnhancedViewPager enhancedViewPager2 = this.h;
        if (enhancedViewPager2 == null) {
            q.b("contentViewPager");
            throw null;
        }
        enhancedViewPager2.setCanScroll(!this.K);
        com.alibaba.triver.triver_shop.shop2023.nativeview.g gVar = this.aa;
        if (gVar != null && gVar.b()) {
            return;
        }
        ag();
        if (q() && this.F >= this.D / 2 && ac()) {
            if (b().bc().b()) {
                ah();
                return;
            }
            EmbedShopLoftComponent embedShopLoftComponent = this.O;
            if (embedShopLoftComponent != null) {
                embedShopLoftComponent.e();
            }
            ViewGroup viewGroup = this.l;
            if (viewGroup == null) {
                q.b("bigCardContainer");
                throw null;
            }
            ViewGroup viewGroup2 = viewGroup;
            com.alibaba.triver.triver_shop.shop2023.data.c cVar = this.N;
            o.a(viewGroup2, cVar == null ? 0 : cVar.a());
            FrameLayout frameLayout = this.k;
            if (frameLayout == null) {
                q.b("navViewContainer");
                throw null;
            }
            o.c(frameLayout, Z());
            this.E = 0;
            this.F = 0;
        } else if (n() || this.L || p()) {
        } else {
            boolean z = this.G;
            ShopOptSwipeLayout shopOptSwipeLayout = this.i;
            if (shopOptSwipeLayout == null) {
                q.b("outerSwiperLayout");
                throw null;
            }
            shopOptSwipeLayout.forceInterceptAllTouchEvent(false);
            this.G = false;
            this.J = 0;
            if (!z) {
                return;
            }
            ceg.a aVar = ceg.Companion;
            aVar.b("upDistance : " + this.E + ", downDistance : " + this.F);
            if (q()) {
                ViewGroup viewGroup3 = this.l;
                if (viewGroup3 == null) {
                    q.b("bigCardContainer");
                    throw null;
                }
                com.alibaba.triver.triver_shop.shop2023.data.c cVar2 = this.N;
                q.a(cVar2);
                o.a(viewGroup3, cVar2.a());
            }
            int i2 = this.E;
            if (i2 == 0) {
                l(true);
                ao();
                return;
            }
            int i3 = this.C;
            if (i2 == i3) {
                if (this.ac && o()) {
                    com.alibaba.triver.triver_shop.newShop.data.d b2 = b();
                    EmbedShopLoftComponent embedShopLoftComponent2 = this.O;
                    if (embedShopLoftComponent2 != null) {
                        bool = Boolean.valueOf(embedShopLoftComponent2.m());
                    }
                    com.alibaba.triver.triver_shop.newShop.ext.h.a(b2, bool);
                }
                if (o()) {
                    ae();
                }
                l(false);
                ao();
            } else if (i2 / i3 >= 0.3d && this.H) {
                k(-(i3 - i2));
                int i4 = this.C;
                this.E = i4;
                this.F = 0 - i4;
                l(false);
                if (this.ac) {
                    com.alibaba.triver.triver_shop.newShop.data.d b3 = b();
                    EmbedShopLoftComponent embedShopLoftComponent3 = this.O;
                    if (embedShopLoftComponent3 != null) {
                        bool = Boolean.valueOf(embedShopLoftComponent3.m());
                    }
                    com.alibaba.triver.triver_shop.newShop.ext.h.a(b3, bool);
                }
                ae();
            } else {
                ad();
            }
        }
    }

    private final void ad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1cc72a", new Object[]{this});
            return;
        }
        ai();
        this.E = 0;
        this.F = 0;
        l(true);
    }

    private final void ae() {
        cel fragmentViewProvider;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2adeab", new Object[]{this});
            return;
        }
        cej cejVar = this.o;
        if (cejVar == null) {
            q.b("shopContainerPageAdapter");
            throw null;
        }
        Fragment item = cejVar.getItem(b().f(b().o(), b().n()));
        if (!(item instanceof ShopStandardFragment) || (fragmentViewProvider = ((ShopStandardFragment) item).getFragmentViewProvider()) == null || !(fragmentViewProvider instanceof jds)) {
            return;
        }
        jds jdsVar = (jds) fragmentViewProvider;
        ShopOptSwipeLayout shopOptSwipeLayout = this.i;
        if (shopOptSwipeLayout != null) {
            jdsVar.a(shopOptSwipeLayout.getYSpeed());
        } else {
            q.b("outerSwiperLayout");
            throw null;
        }
    }

    private final void af() {
        com.alibaba.triver.triver_shop.shop2023.template.g gVar;
        View f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab38f62c", new Object[]{this});
        } else if (this.x || (gVar = this.R) == null || (f2 = gVar.f()) == null) {
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.n.a(f2, 0.0f, 200L, (Animator.AnimatorListener) null, 4, (Object) null).start();
            this.x = true;
        }
    }

    private final void ag() {
        com.alibaba.triver.triver_shop.shop2023.template.g gVar;
        View f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab470dad", new Object[]{this});
        } else if (!this.x || (gVar = this.R) == null || (f2 = gVar.f()) == null) {
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.n.a(f2, 1.0f, 200L, (Animator.AnimatorListener) null, 4, (Object) null).start();
            this.x = false;
        }
    }

    private final void ah() {
        View b2;
        View f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab55252e", new Object[]{this});
        } else if (this.u) {
        } else {
            this.u = true;
            al();
            com.alibaba.triver.triver_shop.newShop.event.broadcast.a z = b().z();
            if (z != null) {
                z.b(b().o(), b().n());
            }
            k kVar = this.ae;
            if (kVar != null && (f2 = kVar.f()) != null) {
                o.d(f2);
            }
            View Y = Y();
            if (Y != null) {
                o.d(Y);
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.Y;
            if (bVar != null) {
                bVar.c(this.C);
            }
            Tab3LiveContentRender tab3LiveContentRender = this.m;
            if (tab3LiveContentRender != null && (b2 = tab3LiveContentRender.b()) != null) {
                ViewGroup viewGroup = this.l;
                if (viewGroup == null) {
                    q.b("bigCardContainer");
                    throw null;
                }
                viewGroup.addView(b2);
                ViewGroup viewGroup2 = this.l;
                if (viewGroup2 == null) {
                    q.b("bigCardContainer");
                    throw null;
                }
                o.b(viewGroup2);
                ViewGroup viewGroup3 = this.l;
                if (viewGroup3 == null) {
                    q.b("bigCardContainer");
                    throw null;
                }
                o.a(viewGroup3, d().getHeight());
                FrameLayout frameLayout = this.k;
                if (frameLayout == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                o.c(frameLayout, d().getHeight());
            }
            Tab3LiveContentRender tab3LiveContentRender2 = this.m;
            if (tab3LiveContentRender2 != null) {
                tab3LiveContentRender2.c();
            }
            com.alibaba.triver.triver_shop.newShop.event.broadcast.a z2 = b().z();
            if (z2 == null) {
                return;
            }
            z2.a(99, 0);
        }
    }

    private final void ai() {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab633caf", new Object[]{this});
            return;
        }
        int i2 = this.E;
        float Z = Z();
        if (this.k == null) {
            q.b("navViewContainer");
            throw null;
        }
        float h2 = Z - o.h(frameLayout);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[1];
        FrameLayout frameLayout2 = this.k;
        if (frameLayout2 != null) {
            Animator a2 = com.alibaba.triver.triver_shop.newShop.ext.n.a(frameLayout2, h2, 0L, null, new LinearInterpolator(), 6, null);
            if (a2 instanceof ValueAnimator) {
                ((ValueAnimator) a2).addUpdateListener(new i(i2, this));
            }
            t tVar = t.INSTANCE;
            animatorArr[0] = a2;
            animatorSet.playTogether(animatorArr);
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.addListener(new a(this));
            animatorSet.start();
            return;
        }
        q.b("navViewContainer");
        throw null;
    }

    private final void k(int i2) {
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93209d1", new Object[]{this, new Integer(i2)});
            return;
        }
        if (!ac() && (bVar = this.Y) != null) {
            bVar.a(this.E, i2);
        }
        int i3 = this.E;
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[1];
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float f2 = i2;
        FrameLayout frameLayout = this.k;
        if (frameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        Animator a2 = com.alibaba.triver.triver_shop.newShop.ext.n.a(frameLayout, f2, 0L, null, linearInterpolator, 6, null);
        if (a2 instanceof ValueAnimator) {
            ((ValueAnimator) a2).addUpdateListener(new h(i3));
        }
        t tVar = t.INSTANCE;
        animatorArr[0] = a2;
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new a(this));
        animatorSet.start();
    }

    private final void a(boolean z, int i2, int i3) {
        View f2;
        FrameLayout frameLayout;
        View Y;
        View f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270908cc", new Object[]{this, new Boolean(z), new Integer(i2), new Integer(i3)});
            return;
        }
        ceg.Companion.b(q.a("changeToHomePage : lastTabFullScreen : ", (Object) Boolean.valueOf(z)));
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.P;
        if (shop2023HeaderInfoTemplate != null && (f3 = shop2023HeaderInfoTemplate.f()) != null) {
            o.b(f3);
        }
        FrameLayout frameLayout2 = this.f;
        if (frameLayout2 == null) {
            q.b("newfarmerContainer");
            throw null;
        }
        o.b(frameLayout2);
        FrameLayout frameLayout3 = this.f;
        if (frameLayout3 == null) {
            q.b("newfarmerContainer");
            throw null;
        }
        frameLayout3.setAlpha(1.0f);
        this.C = aa();
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.Y;
        if (bVar != null) {
            bVar.a(this.C);
        }
        if (this.w) {
            l(true);
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar2 = this.Y;
            if (bVar2 != null) {
                bVar2.c(true);
            }
            this.w = false;
            this.E = 0;
            this.F = 0;
            com.alibaba.triver.triver_shop.shop2023.data.d dVar = this.A;
            dVar.c(dVar.d());
            a(this, 0.0f, 1, (Object) null);
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArr = new Animator[1];
            FrameLayout frameLayout4 = this.k;
            if (frameLayout4 == null) {
                q.b("navViewContainer");
                throw null;
            }
            float f4 = U().f();
            if (this.k != null) {
                animatorArr[0] = com.alibaba.triver.triver_shop.newShop.ext.n.a(frameLayout4, f4 - o.h(frameLayout), 0L, null, null, 14, null);
                animatorSet.playTogether(animatorArr);
                animatorSet.addListener(new c());
                animatorSet.start();
                if (q()) {
                    Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate2 = this.P;
                    if (shop2023HeaderInfoTemplate2 != null) {
                        shop2023HeaderInfoTemplate2.a(Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED);
                    }
                } else {
                    View Y2 = Y();
                    if (Y2 != null) {
                        Y2.setAlpha(1.0f);
                    }
                }
                if (!q() && (Y = Y()) != null) {
                    Y.setAlpha(1.0f);
                }
            } else {
                q.b("navViewContainer");
                throw null;
            }
        } else {
            if (!ak()) {
                l(false);
                com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar3 = this.Y;
                if (bVar3 != null) {
                    bVar3.c(false);
                }
                this.E = this.C;
                this.F = 0 - this.E;
                FrameLayout frameLayout5 = this.k;
                if (frameLayout5 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                o.c(frameLayout5, this.z.j() + m());
                Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate3 = this.P;
                if (shop2023HeaderInfoTemplate3 != null) {
                    shop2023HeaderInfoTemplate3.a(Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED);
                }
            }
            if (q() && com.alibaba.triver.triver_shop.newShop.ext.i.c(b().d(i2, i3))) {
                com.alibaba.triver.triver_shop.newShop.ext.h.a(b(), (Boolean) null, 2, (Object) null);
            }
        }
        if (z) {
            FrameLayout frameLayout6 = this.n;
            if (frameLayout6 == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            frameLayout6.setZ(0.0f);
            FrameLayout frameLayout7 = this.k;
            if (frameLayout7 == null) {
                q.b("navViewContainer");
                throw null;
            }
            frameLayout7.setZ(0.1f);
        }
        View Y3 = Y();
        if (Y3 != null) {
            o.b(Y3);
        }
        this.L = false;
        if (!q()) {
            return;
        }
        View Y4 = Y();
        if (Y4 != null) {
            o.d(Y4);
        }
        k kVar = this.ae;
        if (kVar != null && (f2 = kVar.f()) != null) {
            o.d(f2);
        }
        if (!o()) {
            return;
        }
        am();
    }

    private final void a(boolean z, boolean z2, int i2, int i3) {
        View f2;
        com.alibaba.triver.triver_shop.shop2023.nativeview.c d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb081348", new Object[]{this, new Boolean(z), new Boolean(z2), new Integer(i2), new Integer(i3)});
            return;
        }
        ceg.a aVar = ceg.Companion;
        aVar.b("changeToOtherPage : lastTabFullScreen : " + z + " , targetTabFullScreen : " + z2);
        int i4 = this.C;
        this.C = aa();
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.Y;
        if (bVar != null) {
            bVar.a(this.C);
        }
        if (z2) {
            FrameLayout frameLayout = this.k;
            if (frameLayout == null) {
                q.b("navViewContainer");
                throw null;
            }
            frameLayout.setZ(0.0f);
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar2 = this.Y;
            if (bVar2 != null) {
                bVar2.g();
            }
            FrameLayout frameLayout2 = this.k;
            if (frameLayout2 == null) {
                q.b("navViewContainer");
                throw null;
            } else {
                o.c(frameLayout2, this.A.h());
                l(false);
            }
        } else {
            FrameLayout frameLayout3 = this.k;
            if (frameLayout3 == null) {
                q.b("navViewContainer");
                throw null;
            }
            frameLayout3.setZ(0.1f);
            if (!V()) {
                FrameLayout frameLayout4 = this.f;
                if (frameLayout4 == null) {
                    q.b("newfarmerContainer");
                    throw null;
                }
                o.d(frameLayout4);
            }
            int aa = aa();
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar3 = this.Y;
            if (bVar3 != null) {
                bVar3.a(aa);
            }
            int g2 = this.A.g() - aa;
            if (!o()) {
                com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar4 = this.Y;
                if (bVar4 != null) {
                    bVar4.g();
                }
                this.E = aa;
                this.F = 0 - aa;
            } else if (j()) {
                FrameLayout frameLayout5 = this.k;
                if (frameLayout5 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                o.c(frameLayout5, this.A.g());
                com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar5 = this.Y;
                if (bVar5 != null && (d = bVar5.d()) != null) {
                    d.b(true);
                }
            } else if (!ak()) {
                al();
                k kVar = this.ae;
                if (kVar != null && (f2 = kVar.f()) != null) {
                    o.b(f2);
                }
                View Y = Y();
                if (Y != null) {
                    o.b(Y);
                }
                FrameLayout frameLayout6 = this.k;
                if (frameLayout6 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                int h2 = o.h(frameLayout6) - g2;
                EnhancedViewPager enhancedViewPager = this.h;
                if (enhancedViewPager == null) {
                    q.b("contentViewPager");
                    throw null;
                }
                enhancedViewPager.post(new RunnableC0154d(i4, h2, aa));
            }
        }
        if (z2) {
            FrameLayout frameLayout7 = this.n;
            if (frameLayout7 == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            frameLayout7.setZ(1.0f);
            View Y2 = Y();
            if (Y2 != null) {
                o.d(Y2);
            }
        } else if (q() && V()) {
            View Y3 = Y();
            if (Y3 != null) {
                o.d(Y3);
            }
        } else {
            View Y4 = Y();
            if (Y4 != null) {
                o.b(Y4);
            }
        }
        if (z) {
            FrameLayout frameLayout8 = this.n;
            if (frameLayout8 == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            frameLayout8.setZ(0.0f);
            View Y5 = Y();
            if (Y5 != null) {
                o.b(Y5);
            }
        }
        this.L = z2;
    }

    private final void aj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab715430", new Object[]{this});
            return;
        }
        int height = d().getHeight();
        if (height == 0) {
            height = com.alibaba.triver.triver_shop.newShop.ext.b.b((Activity) a()).heightPixels;
        }
        if (this.L) {
            FrameLayout frameLayout = this.j;
            if (frameLayout != null) {
                o.a(frameLayout, height);
                return;
            } else {
                q.b("centerContainer");
                throw null;
            }
        }
        FrameLayout frameLayout2 = this.j;
        if (frameLayout2 != null) {
            o.a(frameLayout2, ((height - this.z.j()) - m()) + this.A.e());
        } else {
            q.b("centerContainer");
            throw null;
        }
    }

    private final void b(boolean z, boolean z2, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4c8249", new Object[]{this, new Boolean(z), new Boolean(z2), new Integer(i2), new Integer(i3)});
            return;
        }
        ceg.a aVar = ceg.Companion;
        aVar.b("changeOtherToOtherPage : lastTabFullScreen : " + z + " , targetTabFullScreen : " + z2);
        if (z2) {
            FrameLayout frameLayout = this.k;
            if (frameLayout == null) {
                q.b("navViewContainer");
                throw null;
            }
            frameLayout.setZ(0.0f);
            FrameLayout frameLayout2 = this.n;
            if (frameLayout2 == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            frameLayout2.setZ(1.0f);
            FrameLayout frameLayout3 = this.k;
            if (frameLayout3 == null) {
                q.b("navViewContainer");
                throw null;
            }
            o.c(frameLayout3, this.A.h());
            View Y = Y();
            if (Y != null) {
                o.d(Y);
            }
            l(false);
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.Y;
            if (bVar != null) {
                bVar.b(o());
            }
        } else {
            FrameLayout frameLayout4 = this.k;
            if (frameLayout4 == null) {
                q.b("navViewContainer");
                throw null;
            }
            frameLayout4.setZ(0.1f);
            FrameLayout frameLayout5 = this.n;
            if (frameLayout5 == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            frameLayout5.setZ(0.0f);
            int aa = aa();
            int g2 = this.A.g() - aa;
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar2 = this.Y;
            if (bVar2 != null) {
                bVar2.a(aa);
            }
            View Y2 = Y();
            if (Y2 != null) {
                o.b(Y2);
            }
            if (!o()) {
                this.E = aa;
                this.F = 0 - aa;
                com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar3 = this.Y;
                if (bVar3 != null) {
                    bVar3.b(o());
                }
            } else if (!ak()) {
                al();
                FrameLayout frameLayout6 = this.k;
                if (frameLayout6 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                int h2 = o.h(frameLayout6) - g2;
                EnhancedViewPager enhancedViewPager = this.h;
                if (enhancedViewPager == null) {
                    q.b("contentViewPager");
                    throw null;
                }
                enhancedViewPager.post(new b(h2, this, aa));
            }
        }
        if (com.alibaba.triver.triver_shop.newShop.ext.i.c(b().d(i2, i3))) {
            com.alibaba.triver.triver_shop.newShop.ext.h.a(b(), (Boolean) null, 2, (Object) null);
        }
        this.L = z2;
    }

    private final boolean ak() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab7f6bb5", new Object[]{this})).booleanValue() : q() && V();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void a(int i2, int i3, String targetTabName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i2), new Integer(i3), targetTabName});
            return;
        }
        q.d(targetTabName, "targetTabName");
        if (com.alibaba.triver.triver_shop.newShop.ext.i.c(targetTabName)) {
            ah();
            return;
        }
        int f2 = b().f(i2, i3);
        EnhancedViewPager enhancedViewPager = this.h;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCurrentItem(f2, false);
        } else {
            q.b("contentViewPager");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a, android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i2) {
        View f2;
        View f3;
        View f4;
        View f5;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i2)});
            return;
        }
        super.onPageSelected(i2);
        int l = l();
        if (i2 != l) {
            cej cejVar = this.o;
            if (cejVar == null) {
                q.b("shopContainerPageAdapter");
                throw null;
            }
            cejVar.b(l);
        }
        cej cejVar2 = this.o;
        if (cejVar2 == null) {
            q.b("shopContainerPageAdapter");
            throw null;
        }
        cejVar2.a(i2);
        int j = b().j(l());
        e(i2);
        int j2 = b().j(l());
        int k = k();
        int i3 = b().i(l());
        int j3 = b().j(i2);
        b().a(j3, i3);
        ceg.a aVar = ceg.Companion;
        aVar.b("flag ship , on page selected , newTab = " + i3 + ", newSub = " + j3 + " , oldTab = " + k + ", position : " + i2);
        d(i3);
        if (k() != 0) {
            this.t = true;
        }
        rvb<Integer, Integer, Integer, Integer, t> f6 = f();
        if (f6 != null) {
            f6.invoke(Integer.valueOf(i3), Integer.valueOf(j3), Integer.valueOf(k), Integer.valueOf(j));
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar = this.Z;
        if (cVar != null) {
            cVar.a(i3, j2);
        }
        boolean c2 = com.alibaba.triver.triver_shop.newShop.ext.i.c(b().d(k, j));
        boolean c3 = com.alibaba.triver.triver_shop.newShop.ext.i.c(b().d(i3, j2));
        if (k == 0 && i3 != 0) {
            a(c2, c3, k, j);
        }
        if (k != 0 && i3 == 0) {
            a(c2, k, j);
        }
        if (k != 0 && i3 != 0) {
            b(c2, c3, k, j);
        }
        aj();
        L();
        a(false);
        if (!c3 && (!q() || !o() || i3 != 0)) {
            z = false;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.P;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.d(z);
        }
        if (c2) {
            o(false);
            m(false);
            this.u = false;
        }
        if (ac()) {
            View Y = Y();
            if (Y != null) {
                o.d(Y);
            }
            k kVar = this.ae;
            if (kVar != null && (f5 = kVar.f()) != null) {
                o.d(f5);
            }
            k kVar2 = this.af;
            if (kVar2 == null || (f4 = kVar2.f()) == null) {
                return;
            }
            o.d(f4);
            return;
        }
        al();
        View Y2 = Y();
        if (Y2 != null) {
            o.b(Y2);
        }
        k kVar3 = this.ae;
        if (kVar3 != null && (f3 = kVar3.f()) != null) {
            o.b(f3);
        }
        k kVar4 = this.af;
        if (kVar4 == null || (f2 = kVar4.f()) == null) {
            return;
        }
        o.b(f2);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void l(boolean z) {
        View f2;
        View f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae72241", new Object[]{this, new Boolean(z)});
            return;
        }
        ceg.Companion.b(q.a("update expanded : ", (Object) Boolean.valueOf(z)));
        if (!q.a(this.aj, Boolean.valueOf(z))) {
            if (z) {
                i(aa());
            } else {
                i(-aa());
            }
            this.aj = Boolean.valueOf(z);
        }
        super.l(z);
        L();
        if (z) {
            if (q()) {
                if (C() || V()) {
                    am();
                    k kVar = this.ae;
                    if (kVar != null && (f2 = kVar.f()) != null) {
                        o.d(f2);
                    }
                } else {
                    k kVar2 = this.ae;
                    if (kVar2 != null && (f3 = kVar2.f()) != null) {
                        o.b(f3);
                    }
                }
                Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.P;
                if (shop2023HeaderInfoTemplate != null) {
                    shop2023HeaderInfoTemplate.a(Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED);
                }
                Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate = this.T;
                if (shop2023HeaderTagListTemplate == null) {
                    return;
                }
                shop2023HeaderTagListTemplate.r();
                return;
            }
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate2 = this.P;
            if (shop2023HeaderInfoTemplate2 != null) {
                shop2023HeaderInfoTemplate2.a(Shop2023HeaderInfoTemplate.HeaderStyle.DEFAULT);
            }
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate3 = this.P;
            if (shop2023HeaderInfoTemplate3 != null) {
                shop2023HeaderInfoTemplate3.d(false);
            }
            Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate2 = this.T;
            if (shop2023HeaderTagListTemplate2 == null) {
                return;
            }
            shop2023HeaderTagListTemplate2.s();
            return;
        }
        al();
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate4 = this.P;
        if (shop2023HeaderInfoTemplate4 != null) {
            shop2023HeaderInfoTemplate4.a(Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED);
        }
        Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate3 = this.T;
        if (shop2023HeaderTagListTemplate3 == null) {
            return;
        }
        shop2023HeaderTagListTemplate3.r();
    }

    private final void al() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8d8332", new Object[]{this});
        } else if (!q()) {
        } else {
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.P;
            if (shop2023HeaderInfoTemplate != null) {
                shop2023HeaderInfoTemplate.d(false);
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.Y;
            if (bVar != null) {
                bVar.e(false);
            }
            ViewGroup viewGroup = this.l;
            if (viewGroup == null) {
                q.b("bigCardContainer");
                throw null;
            }
            o.d(viewGroup);
            EmbedShopLoftComponent embedShopLoftComponent = this.O;
            if (embedShopLoftComponent == null) {
                return;
            }
            embedShopLoftComponent.j();
        }
    }

    private final void am() {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9b9ab3", new Object[]{this});
        } else if (!q()) {
        } else {
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.P;
            if (shop2023HeaderInfoTemplate != null) {
                shop2023HeaderInfoTemplate.d(true);
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.Y;
            if (bVar != null) {
                bVar.e(true);
            }
            ViewGroup viewGroup = this.l;
            if (viewGroup == null) {
                q.b("bigCardContainer");
                throw null;
            }
            ViewGroup viewGroup2 = viewGroup;
            com.alibaba.triver.triver_shop.shop2023.data.c cVar = this.N;
            if (cVar != null) {
                i2 = cVar.a();
            }
            o.a(viewGroup2, i2);
            ViewGroup viewGroup3 = this.l;
            if (viewGroup3 == null) {
                q.b("bigCardContainer");
                throw null;
            }
            o.b(viewGroup3);
            EmbedShopLoftComponent embedShopLoftComponent = this.O;
            if (embedShopLoftComponent == null) {
                return;
            }
            embedShopLoftComponent.k();
        }
    }

    private final void an() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba9b234", new Object[]{this});
        } else {
            ah();
        }
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.b
    public int S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4a7234d", new Object[]{this})).intValue() : d().getHeight();
    }

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f4054a;

        static {
            kge.a(-533219743);
        }

        public a(d this$0) {
            q.d(this$0, "this$0");
            this.f4054a = this$0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            d.c(this.f4054a, true);
            ShopOptSwipeLayout h = d.h(this.f4054a);
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
            ceg.Companion.b("onAnimationEnd");
            d.i(this.f4054a);
            d.c(this.f4054a, false);
            this.f4054a.y();
            ShopOptSwipeLayout h = d.h(this.f4054a);
            if (h == null) {
                q.b("outerSwiperLayout");
                throw null;
            }
            h.forceInterceptAllTouchEvent(false);
            EnhancedViewPager b = d.b(this.f4054a);
            if (b == null) {
                q.b("contentViewPager");
                throw null;
            }
            b.setCanDispatchToChild(true);
            EnhancedViewPager b2 = d.b(this.f4054a);
            if (b2 != null) {
                b2.setCanScroll(true);
            } else {
                q.b("contentViewPager");
                throw null;
            }
        }
    }

    private final void ao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb7c9b5", new Object[]{this});
            return;
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            runnable.run();
        }
        this.X = null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.P;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.a(z, jSONObject);
        }
        com.alibaba.triver.triver_shop.shop2023.template.e eVar = this.S;
        if (eVar != null) {
            eVar.c(jSONObject);
        }
        rul<Boolean, t> d = b().bb().d();
        if (d == null) {
            return;
        }
        d.mo2421invoke(Boolean.valueOf(z));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bfae0", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.P;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.a(z);
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.Y;
        if (bVar != null) {
            bVar.e(z);
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar2 = this.Y;
        if (bVar2 != null) {
            bVar2.a(z);
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.i iVar = this.ab;
        if (iVar == null) {
            return;
        }
        iVar.a(z);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be50d37f", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.P;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.b(z);
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.Y;
        if (bVar == null) {
            return;
        }
        bVar.f(z);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c005ac1e", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.P;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.c(z);
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.Y;
        if (bVar != null) {
            bVar.d(z);
        }
        EnhancedViewPager enhancedViewPager = this.h;
        if (enhancedViewPager == null) {
            q.b("contentViewPager");
            throw null;
        }
        enhancedViewPager.setCanScroll(!z);
        this.K = z;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ba84bd", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.P;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.a(z, com.alibaba.triver.triver_shop.newShop.ext.h.b(b(), z));
        }
        com.alibaba.triver.triver_shop.shop2023.template.e eVar = this.S;
        if (eVar == null) {
            return;
        }
        eVar.c(com.alibaba.triver.triver_shop.newShop.ext.h.b(b(), z));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
        } else if (q() && o()) {
            N();
        } else {
            M();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : ap();
    }

    private final boolean ap() {
        View f2;
        View b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc5e13a", new Object[]{this})).booleanValue();
        }
        if (!this.u) {
            return true;
        }
        ceg.Companion.b("goBack to shopIndex");
        this.u = false;
        o(false);
        Tab3LiveContentRender tab3LiveContentRender = this.m;
        if (tab3LiveContentRender != null && (b2 = tab3LiveContentRender.b()) != null) {
            ViewGroup viewGroup = this.l;
            if (viewGroup == null) {
                q.b("bigCardContainer");
                throw null;
            }
            viewGroup.removeView(b2);
        }
        Tab3LiveContentRender tab3LiveContentRender2 = this.m;
        if (tab3LiveContentRender2 != null) {
            tab3LiveContentRender2.d();
        }
        com.alibaba.triver.triver_shop.newShop.event.broadcast.a z = b().z();
        if (z != null) {
            z.b(99, 0);
        }
        com.alibaba.triver.triver_shop.newShop.event.broadcast.a z2 = b().z();
        if (z2 != null) {
            z2.a(b().o(), b().n());
        }
        if (ac()) {
            am();
        } else {
            ViewGroup viewGroup2 = this.l;
            if (viewGroup2 == null) {
                q.b("bigCardContainer");
                throw null;
            }
            o.d(viewGroup2);
            View Y = Y();
            if (Y != null) {
                o.b(Y);
            }
            k kVar = this.ae;
            if (kVar != null && (f2 = kVar.f()) != null) {
                o.b(f2);
            }
        }
        if (!V()) {
            aq();
        } else if (q()) {
            if (o()) {
                ad();
            } else {
                aq();
            }
        } else {
            ad();
        }
        return false;
    }

    private final void aq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd3f8b7", new Object[]{this});
            return;
        }
        l(false);
        if (C()) {
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.Y;
            if (bVar != null) {
                bVar.c(false);
            }
        } else {
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar2 = this.Y;
            if (bVar2 != null) {
                bVar2.g();
            }
        }
        this.E = this.C;
        this.F = 0 - this.E;
        FrameLayout frameLayout = this.k;
        if (frameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        o.c(frameLayout, this.z.j() + m());
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.P;
        if (shop2023HeaderInfoTemplate == null) {
            return;
        }
        shop2023HeaderInfoTemplate.a(Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
        } else {
            super.R();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[]{this});
            return;
        }
        ah();
        m.a(b(), "Page_Shop_Live_FloatWindow_Click", null, null, 8, null);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
        } else {
            super.b(str, jSONObject);
        }
    }

    private final void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52435fb", new Object[]{this, new Boolean(z)});
            return;
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.g gVar = this.aa;
        if (gVar == null) {
            return;
        }
        gVar.a(z);
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
        o.a(d(), new FarmShop$onConfigChanged$1(this));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void a(String tabName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, tabName});
            return;
        }
        q.d(tabName, "tabName");
        if (o()) {
            return;
        }
        ShopOptSwipeLayout shopOptSwipeLayout = this.i;
        if (shopOptSwipeLayout == null) {
            q.b("outerSwiperLayout");
            throw null;
        } else if (shopOptSwipeLayout.getAlreadyTouch()) {
        } else {
            ad();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public ViewPager ax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("9b14c22a", new Object[]{this});
        }
        EnhancedViewPager enhancedViewPager = this.h;
        if (enhancedViewPager != null) {
            return enhancedViewPager;
        }
        q.b("contentViewPager");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        super.J();
        Tab3LiveContentRender tab3LiveContentRender = this.m;
        if (tab3LiveContentRender == null) {
            return;
        }
        tab3LiveContentRender.f();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        super.K();
        Tab3LiveContentRender tab3LiveContentRender = this.m;
        if (tab3LiveContentRender == null) {
            return;
        }
        tab3LiveContentRender.e();
    }
}
