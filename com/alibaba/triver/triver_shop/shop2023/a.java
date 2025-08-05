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
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.container.shopLoft.h;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.ShopOptSwipeLayout;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderInfoTemplate;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderTagListTemplate;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;
import kotlin.Pair;
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
import tb.ruk;
import tb.rul;
import tb.rvb;

/* loaded from: classes3.dex */
public final class a extends com.alibaba.triver.triver_shop.shop2023.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private boolean L;
    private boolean M;
    private int N;
    private int O;
    private boolean P;
    private boolean R;
    private int S;
    private com.alibaba.triver.triver_shop.shop2023.data.c T;
    private EmbedShopLoftComponent U;
    private Shop2023HeaderInfoTemplate V;
    private boolean W;
    private boolean X;
    private com.alibaba.triver.triver_shop.shop2023.template.d Y;
    private com.alibaba.triver.triver_shop.shop2023.template.f Z;
    private com.alibaba.triver.triver_shop.shop2023.template.c aa;
    private com.alibaba.triver.triver_shop.shop2023.template.g ab;
    private com.alibaba.triver.triver_shop.shop2023.template.e ac;
    private int ae;
    private Runnable af;
    private ShopWrapWebView ag;
    private ruk<t> ah;
    private boolean ai;
    private com.alibaba.triver.triver_shop.shop2023.nativeview.b aj;
    private com.alibaba.triver.triver_shop.shop2023.nativeview.a ak;
    private com.alibaba.triver.triver_shop.shop2023.nativeview.c al;
    private Shop2023HeaderTagListTemplate am;
    private FrameLayout an;
    private FrameLayout ap;
    private com.alibaba.triver.triver_shop.shop2023.nativeview.i aq;
    private boolean ar;
    private com.alibaba.triver.triver_shop.shop2023.nativeview.g as;
    private com.alibaba.triver.triver_shop.shop2023.nativeview.f at;
    private View av;
    private boolean aw;
    private EnhancedViewPager f;
    private ShopOptSwipeLayout g;
    private FrameLayout h;
    private ViewGroup i;
    private View j;
    private FrameLayout k;
    private ViewGroup l;
    private FrameLayout m;
    private FrameLayout n;
    private cej o;
    private TUrlImageView p;
    private View q;
    private View r;
    private View s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean Q = true;
    private com.alibaba.triver.triver_shop.shop2023.data.d w = new com.alibaba.triver.triver_shop.shop2023.data.d(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    private com.alibaba.triver.triver_shop.shop2023.data.a x = new com.alibaba.triver.triver_shop.shop2023.data.a(0, 0, false, 7, null);
    private com.alibaba.triver.triver_shop.shop2023.data.d y = new com.alibaba.triver.triver_shop.shop2023.data.d(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    private com.alibaba.triver.triver_shop.shop2023.data.d z = new com.alibaba.triver.triver_shop.shop2023.data.d(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    private com.alibaba.triver.triver_shop.shop2023.data.d A = new com.alibaba.triver.triver_shop.shop2023.data.d(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    private com.alibaba.triver.triver_shop.shop2023.data.d B = new com.alibaba.triver.triver_shop.shop2023.data.d(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    private com.alibaba.triver.triver_shop.shop2023.data.d C = new com.alibaba.triver.triver_shop.shop2023.data.d(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    private com.alibaba.triver.triver_shop.shop2023.data.d D = new com.alibaba.triver.triver_shop.shop2023.data.d(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    private final int ad = 3;
    private boolean ao = true;

    /* loaded from: classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                a.this.Q();
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
            } else if (!a.this.z()) {
            } else {
                a.f(a.this).finish();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends C0149a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
            super(a.this);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.alibaba.triver.triver_shop.shop2023.a.C0149a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            super.onAnimationEnd(animation);
            FrameLayout L = a.L(a.this);
            if (L == null) {
                q.b("navViewContainer");
                throw null;
            }
            o.c(L, a.D(a.this).f());
            FrameLayout w = a.w(a.this);
            if (w != null) {
                o.c(w, a.x(a.this).f());
            } else {
                q.b("shopRelationContainer");
                throw null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class f extends C0149a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
            super(a.this);
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.alibaba.triver.triver_shop.shop2023.a.C0149a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            float alpha;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            super.onAnimationEnd(animation);
            FrameLayout w = a.w(a.this);
            if (w == null) {
                q.b("shopRelationContainer");
                throw null;
            }
            FrameLayout w2 = a.w(a.this);
            if (w2 == null) {
                q.b("shopRelationContainer");
                throw null;
            }
            if (o.h(w2) == a.x(a.this).f()) {
                alpha = 1.0f;
            } else {
                FrameLayout w3 = a.w(a.this);
                if (w3 == null) {
                    q.b("shopRelationContainer");
                    throw null;
                }
                alpha = w3.getAlpha();
            }
            w.setAlpha(alpha);
            View K = a.K(a.this);
            if (K == null) {
                return;
            }
            FrameLayout w4 = a.w(a.this);
            if (w4 != null) {
                K.setAlpha(w4.getAlpha());
            } else {
                q.b("shopRelationContainer");
                throw null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f4046a;
        public final /* synthetic */ a b;

        public g(int i, a aVar) {
            this.f4046a = i;
            this.b = aVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float f = this.f4046a;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            float floatValue = 1 - ((f - ((Float) animatedValue).floatValue()) / a.M(this.b));
            if (a.N(this.b) >= 0) {
                FrameLayout w = a.w(this.b);
                if (w == null) {
                    q.b("shopRelationContainer");
                    throw null;
                }
                w.setAlpha(1.0f);
            } else {
                FrameLayout w2 = a.w(this.b);
                if (w2 == null) {
                    q.b("shopRelationContainer");
                    throw null;
                }
                w2.setAlpha(floatValue);
            }
            View K = a.K(this.b);
            if (K == null) {
                return;
            }
            K.setAlpha(floatValue);
        }
    }

    /* loaded from: classes3.dex */
    public static final class h extends C0149a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
            super(a.this);
        }

        @Override // com.alibaba.triver.triver_shop.shop2023.a.C0149a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            ViewGroup s = a.s(a.this);
            if (s == null) {
                q.b("bigCardContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.shop2023.data.c t = a.t(a.this);
            q.a(t);
            o.a(s, t.a());
        }
    }

    /* loaded from: classes3.dex */
    public static final class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f4047a;
        public final /* synthetic */ a b;
        public final /* synthetic */ int c;

        /* renamed from: com.alibaba.triver.triver_shop.shop2023.a$j$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0150a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a f4048a;

            public C0150a(a aVar) {
                this.f4048a = aVar;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                a aVar = this.f4048a;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                a.a(aVar, ((Integer) animatedValue).intValue(), false, Integer.valueOf(a.D(this.f4048a).g()));
            }
        }

        /* loaded from: classes3.dex */
        public static final class b extends C0149a {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ a b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, int i) {
                super(aVar);
                this.b = aVar;
                this.c = i;
            }

            @Override // com.alibaba.triver.triver_shop.shop2023.a.C0149a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                    return;
                }
                q.d(animation, "animation");
                com.alibaba.triver.triver_shop.shop2023.nativeview.b B = a.B(this.b);
                if (B != null) {
                    B.b(a.F(this.b));
                }
                FrameLayout w = a.w(this.b);
                if (w == null) {
                    q.b("shopRelationContainer");
                    throw null;
                }
                o.d(w);
                a.b(this.b, this.c);
                a.c(this.b, 0 - this.c);
            }
        }

        public j(int i, a aVar, int i2) {
            this.f4047a = i;
            this.b = aVar;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(this.f4047a);
            a aVar = this.b;
            int i = this.c;
            ofInt.addUpdateListener(new C0150a(aVar));
            ofInt.setDuration(900L);
            ofInt.addListener(new C0149a(aVar));
            ofInt.addListener(new b(aVar, i));
            ofInt.start();
        }
    }

    /* loaded from: classes3.dex */
    public static final class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* renamed from: com.alibaba.triver.triver_shop.shop2023.a$k$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0151a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a f4050a;

            public C0151a(a aVar) {
                this.f4050a = aVar;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                a aVar = this.f4050a;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                a.a(aVar, ((Integer) animatedValue).intValue(), false, Integer.valueOf(a.D(this.f4050a).f()));
            }
        }

        /* loaded from: classes3.dex */
        public static final class b extends C0149a {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ a b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, int i) {
                super(aVar);
                this.b = aVar;
                this.c = i;
            }

            @Override // com.alibaba.triver.triver_shop.shop2023.a.C0149a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                    return;
                }
                q.d(animation, "animation");
                int E = a.E(this.b);
                a aVar = this.b;
                a.a(aVar, E);
                com.alibaba.triver.triver_shop.shop2023.nativeview.b B = a.B(aVar);
                if (B != null) {
                    B.a(E);
                }
                com.alibaba.triver.triver_shop.shop2023.nativeview.b B2 = a.B(this.b);
                if (B2 != null) {
                    B2.g();
                }
                FrameLayout w = a.w(this.b);
                if (w == null) {
                    q.b("shopRelationContainer");
                    throw null;
                }
                o.d(w);
                a.b(this.b, this.c);
                a.c(this.b, 0 - this.c);
                this.b.l(false);
            }
        }

        public k(int i, int i2, int i3) {
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
            a.a(a.this, this.b);
            com.alibaba.triver.triver_shop.shop2023.nativeview.b B = a.B(a.this);
            if (B != null) {
                B.a(this.b);
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(this.c);
            a aVar = a.this;
            int i = this.d;
            ofInt.addUpdateListener(new C0151a(aVar));
            ofInt.setDuration(900L);
            ofInt.addListener(new b(aVar, i));
            ofInt.addListener(new C0149a(aVar));
            ofInt.start();
        }
    }

    /* loaded from: classes3.dex */
    public static final class l extends C0149a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
            super(a.this);
        }

        public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.alibaba.triver.triver_shop.shop2023.a.C0149a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            float alpha;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            super.onAnimationEnd(animation);
            FrameLayout w = a.w(a.this);
            if (w == null) {
                q.b("shopRelationContainer");
                throw null;
            }
            FrameLayout w2 = a.w(a.this);
            if (w2 == null) {
                q.b("shopRelationContainer");
                throw null;
            }
            if (o.h(w2) == a.x(a.this).f()) {
                alpha = 1.0f;
            } else {
                FrameLayout w3 = a.w(a.this);
                if (w3 == null) {
                    q.b("shopRelationContainer");
                    throw null;
                }
                alpha = w3.getAlpha();
            }
            w.setAlpha(alpha);
            View K = a.K(a.this);
            if (K == null) {
                return;
            }
            FrameLayout w4 = a.w(a.this);
            if (w4 != null) {
                K.setAlpha(w4.getAlpha());
            } else {
                q.b("shopRelationContainer");
                throw null;
            }
        }
    }

    static {
        kge.a(1176513412);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1159257535:
                super.l(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1047811585:
                super.a((FragmentActivity) objArr[0], (com.alibaba.triver.triver_shop.newShop.data.d) objArr[1], (com.alibaba.triver.triver_shop.newShop.ext.e) objArr[2]);
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
            case 1703005214:
                super.onPageScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            case 1735135197:
                super.b((String) objArr[0], (JSONObject) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.shop2023.nativeview.b B(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.shop2023.nativeview.b) ipChange.ipc$dispatch("e31a927b", new Object[]{aVar}) : aVar.aj;
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.shop2023.data.d D(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.shop2023.data.d) ipChange.ipc$dispatch("8cc13b4d", new Object[]{aVar}) : aVar.y;
    }

    public static final /* synthetic */ int E(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1bb2d99", new Object[]{aVar})).intValue() : aVar.Z();
    }

    public static final /* synthetic */ boolean F(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2b85cf89", new Object[]{aVar})).booleanValue() : aVar.o();
    }

    public static final /* synthetic */ ShopOptSwipeLayout G(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopOptSwipeLayout) ipChange.ipc$dispatch("a436a931", new Object[]{aVar}) : aVar.g;
    }

    public static final /* synthetic */ View K(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8e411922", new Object[]{aVar}) : aVar.aq();
    }

    public static final /* synthetic */ FrameLayout L(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("6c76aeba", new Object[]{aVar}) : aVar.k;
    }

    public static final /* synthetic */ int M(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c0103c91", new Object[]{aVar})).intValue() : aVar.G;
    }

    public static final /* synthetic */ int N(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f9dade70", new Object[]{aVar})).intValue() : aVar.J;
    }

    public static final /* synthetic */ EnhancedViewPager a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EnhancedViewPager) ipChange.ipc$dispatch("97f3699f", new Object[]{aVar}) : aVar.f;
    }

    public static final /* synthetic */ void a(a aVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b7d239", new Object[]{aVar, new Integer(i2)});
        } else {
            aVar.G = i2;
        }
    }

    public static final /* synthetic */ void a(a aVar, int i2, boolean z, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1958aadc", new Object[]{aVar, new Integer(i2), new Boolean(z), num});
        } else {
            aVar.a(i2, z, num);
        }
    }

    public static final /* synthetic */ void a(a aVar, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar2, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5fbca0", new Object[]{aVar, aVar2, layoutParams});
        } else {
            aVar.a(aVar2, layoutParams);
        }
    }

    public static final /* synthetic */ void a(a aVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37086388", new Object[]{aVar, runnable});
        } else {
            aVar.af = runnable;
        }
    }

    public static final /* synthetic */ void a(a aVar, ruk rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e417af2", new Object[]{aVar, rukVar});
        } else {
            aVar.ah = rukVar;
        }
    }

    public static final /* synthetic */ void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b8120a", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.b(z);
        }
    }

    public static final /* synthetic */ void b(a aVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38416c3a", new Object[]{aVar, new Integer(i2)});
        } else {
            aVar.I = i2;
        }
    }

    public static final /* synthetic */ void b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3841ac0b", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.W = z;
        }
    }

    public static final /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77a25c8", new Object[]{aVar});
        } else {
            aVar.ak();
        }
    }

    public static final /* synthetic */ void c(a aVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37cb063b", new Object[]{aVar, new Integer(i2)});
        } else {
            aVar.J = i2;
        }
    }

    public static final /* synthetic */ void c(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37cb460c", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.X = z;
        }
    }

    public static final /* synthetic */ void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f144c7a7", new Object[]{aVar});
        } else {
            aVar.ao();
        }
    }

    public static final /* synthetic */ void d(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3754e00d", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.s(z);
        }
    }

    public static final /* synthetic */ void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0f6986", new Object[]{aVar});
        } else {
            aVar.al();
        }
    }

    public static final /* synthetic */ FragmentActivity f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentActivity) ipChange.ipc$dispatch("ea30378", new Object[]{aVar}) : aVar.a();
    }

    public static final /* synthetic */ void g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea4ad44", new Object[]{aVar});
        } else {
            aVar.ae();
        }
    }

    public static final /* synthetic */ void j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0492e1", new Object[]{aVar});
        } else {
            aVar.W();
        }
    }

    public static final /* synthetic */ void o(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf9bc3c", new Object[]{aVar});
        } else {
            aVar.ap();
        }
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.shop2023.template.g p(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.shop2023.template.g) ipChange.ipc$dispatch("90bd6186", new Object[]{aVar}) : aVar.ab;
    }

    public static final /* synthetic */ EmbedShopLoftComponent q(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EmbedShopLoftComponent) ipChange.ipc$dispatch("3b268e4f", new Object[]{aVar}) : aVar.U;
    }

    public static final /* synthetic */ boolean r(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1a59a1dd", new Object[]{aVar})).booleanValue() : aVar.q();
    }

    public static final /* synthetic */ ViewGroup s(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("af54275d", new Object[]{aVar}) : aVar.l;
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.shop2023.data.c t(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.shop2023.data.c) ipChange.ipc$dispatch("19ed475e", new Object[]{aVar}) : aVar.T;
    }

    public static final /* synthetic */ View u(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fa0d6e38", new Object[]{aVar}) : aVar.j;
    }

    public static final /* synthetic */ FrameLayout v(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("e709b264", new Object[]{aVar}) : aVar.d();
    }

    public static final /* synthetic */ FrameLayout w(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("1ab7dd25", new Object[]{aVar}) : aVar.n;
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.shop2023.data.d x(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.shop2023.data.d) ipChange.ipc$dispatch("bb064881", new Object[]{aVar}) : aVar.D;
    }

    public static final /* synthetic */ void z(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8aeb0d1", new Object[]{aVar});
        } else {
            aVar.ag();
        }
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
        super.a(context, shopData, shopDXEngine);
        context.getLifecycle().addObserver(I());
        this.ao = shopData.bc().k();
        if (g() != 0) {
            z = true;
        }
        this.Q = z;
        shopData.G().a(new b());
        shopData.G().a(new Default2023Shop$initComponent$2(this));
        shopData.G().b(new Default2023Shop$initComponent$3(this));
        if (cen.Companion.af() && shopData.bm().b()) {
            shopData.G().a(new Default2023Shop$initComponent$4(this));
            shopData.G().b(new Default2023Shop$initComponent$5(this));
        }
        this.N = ViewConfiguration.get(context).getScaledTouchSlop();
        com.alibaba.triver.triver_shop.newShop.ext.l.a((Activity) context, true);
        ab();
        shopData.b(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_INIT_SHOP_BASE_VIEW, Long.valueOf(ceiVar.a()));
        ceiVar.b();
        ShopOptSwipeLayout shopOptSwipeLayout = this.g;
        if (shopOptSwipeLayout == null) {
            q.b("outerSwiperLayout");
            throw null;
        }
        shopOptSwipeLayout.setScrollThreshold(this.N);
        this.aq = new com.alibaba.triver.triver_shop.shop2023.nativeview.i(this);
        V();
        U();
        ag();
        shopData.b(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_INIT_SHOP_TEMPLATE_COMPONENT_COST, Long.valueOf(ceiVar.a()));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void U() {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.triver.triver_shop.shop2023.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r10
            java.lang.String r2 = "4c3525c"
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
            r10.aw = r3
            float r6 = r0.e()
            com.alibaba.triver.triver_shop.shop2023.data.d r7 = r10.y
            int r7 = r7.f()
            float r7 = (float) r7
            float r6 = r6 * r7
            int r6 = (int) r6
            int r1 = r1 - r6
            android.view.View r7 = r10.q
            java.lang.String r8 = "shopBackgroundColorViewPart1"
            if (r7 == 0) goto Lcb
            com.alibaba.triver.triver_shop.newShop.ext.o.a(r7, r6)
            android.view.View r7 = r10.r
            java.lang.String r9 = "shopBackgroundColorViewPart2"
            if (r7 == 0) goto Lc7
            com.alibaba.triver.triver_shop.newShop.ext.o.a(r7, r1)
            android.view.View r1 = r10.r
            if (r1 == 0) goto Lc3
            r1.setBackgroundColor(r5)
            android.view.View r1 = r10.r
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
            android.view.View r0 = r10.q
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
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.shop2023.a.U():void");
    }

    private final void V() {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar;
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar;
        com.alibaba.triver.triver_shop.container.shopLoft.a a2;
        b.a a3;
        String string;
        String string2;
        Integer d2;
        String string3;
        Integer d3;
        JSONObject jSONObject;
        Throwable th;
        TUrlImageView b2;
        int e2;
        Integer d4;
        Integer d5;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
            return;
        }
        Map<String, ShopComponentModel> g2 = b().bc().g();
        if (g2 == null) {
            ceg.Companion.b("shopComponentData null");
            return;
        }
        boolean z3 = g2.get("tb_shop_header_shop_info_2023_native") != null;
        ShopComponentModel shopComponentModel = g2.get("tb_shop_header_shop_info_2023");
        if (shopComponentModel != null) {
            if (z3) {
                JSONObject data = shopComponentModel.getData();
                z3 = q.a((Object) "true", (Object) ((data == null || (jSONObject2 = data.getJSONObject("feature")) == null) ? null : jSONObject2.getString("showNativeShopInfo")));
            }
            this.x.a(z3);
            this.V = new Shop2023HeaderInfoTemplate(shopComponentModel, new Default2023Shop$initTemplateComponent$1$1(this));
            com.alibaba.triver.triver_shop.newShop.view.component.a.a(this, this.V, (String) null, 2, (Object) null);
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.V;
            if (shop2023HeaderInfoTemplate != null) {
                shop2023HeaderInfoTemplate.a(new Default2023Shop$initTemplateComponent$1$2(this));
            }
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate2 = this.V;
            q.a(shop2023HeaderInfoTemplate2);
            shop2023HeaderInfoTemplate2.a(a(), b(), c(), null);
            JSONObject extData = shopComponentModel.getExtData();
            if (extData != null) {
                com.alibaba.triver.triver_shop.shop2023.data.a aVar = this.x;
                String string4 = extData.getString("indexPageHeaderFoldedStyleHeight");
                aVar.f((string4 == null || (d4 = n.d(string4)) == null) ? 0 : Integer.valueOf(o.e(d4)).intValue());
                com.alibaba.triver.triver_shop.shop2023.data.a aVar2 = this.x;
                String string5 = extData.getString("otherPageHeaderStyleHeight");
                aVar2.g((string5 == null || (d5 = n.d(string5)) == null) ? 0 : Integer.valueOf(o.e(d5)).intValue());
                t tVar = t.INSTANCE;
                t tVar2 = t.INSTANCE;
            }
            if (this.x.i() == 0) {
                this.x.f(o.e((Number) 182));
            }
            if (this.x.j() == 0) {
                this.x.g(o.e((Number) 121));
            }
            if (z3) {
                this.x.b(o.e(Integer.valueOf(shopComponentModel.getRenderHeight())));
            } else {
                this.x.h(o.e(Integer.valueOf(shopComponentModel.getRenderHeight())));
            }
            FrameLayout frameLayout = this.ap;
            if (frameLayout == null) {
                q.b("searchBarContainer");
                throw null;
            }
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate3 = this.V;
            q.a(shop2023HeaderInfoTemplate3);
            View f2 = shop2023HeaderInfoTemplate3.f();
            int d6 = o.d((Number) 11);
            if (z3) {
                e2 = this.x.b();
            } else {
                e2 = this.x.e();
            }
            frameLayout.addView(f2, o.a(0, e2, d6, 0, 0, 0, 0, 121, null));
            t tVar3 = t.INSTANCE;
            t tVar4 = t.INSTANCE;
        }
        ShopComponentModel shopComponentModel2 = g2.get("tb_shop_header_shop_info_2023_native");
        if (shopComponentModel2 != null) {
            int c2 = o.c(Integer.valueOf(shopComponentModel2.getRenderHeight()));
            this.aj = new com.alibaba.triver.triver_shop.shop2023.nativeview.b(a(), b(), this.x.b());
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar2 = this.aj;
            if (bVar2 != null) {
                Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate4 = this.V;
                bVar2.c(shop2023HeaderInfoTemplate4 == null ? null : shop2023HeaderInfoTemplate4.f());
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar3 = this.aj;
            if (bVar3 != null && (b2 = bVar3.b()) != null) {
                b2.setOnClickListener(new c());
                t tVar5 = t.INSTANCE;
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar4 = this.aj;
            if (bVar4 != null) {
                bVar4.a(new Default2023Shop$initTemplateComponent$2$2(this));
            }
            com.alibaba.triver.triver_shop.shop2023.template.e a4 = com.alibaba.triver.triver_shop.shop2023.template.e.Companion.a(b(), c());
            if (a4 != null) {
                this.ac = a4;
                com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar5 = this.aj;
                if (bVar5 != null) {
                    bVar5.d(a4.f());
                    t tVar6 = t.INSTANCE;
                }
            }
            FrameLayout frameLayout2 = this.m;
            if (frameLayout2 == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar6 = this.aj;
            q.a(bVar6);
            frameLayout2.addView(bVar6.e(), o.a(0, c2, 0, 0, 0, 0, 0, 125, null));
            com.alibaba.triver.triver_shop.shop2023.data.a aVar3 = this.x;
            JSONObject extData2 = shopComponentModel2.getExtData();
            Integer valueOf = (extData2 == null || (string2 = extData2.getString("indexPageHeaderFoldedStyleHeight")) == null || (d2 = n.d(string2)) == null) ? null : Integer.valueOf(o.e(d2));
            aVar3.f(valueOf == null ? o.e((Number) 134) : valueOf.intValue());
            com.alibaba.triver.triver_shop.shop2023.data.a aVar4 = this.x;
            JSONObject extData3 = shopComponentModel2.getExtData();
            Integer valueOf2 = (extData3 == null || (string3 = extData3.getString("otherPageHeaderStyleHeight")) == null || (d3 = n.d(string3)) == null) ? null : Integer.valueOf(o.e(d3));
            aVar4.g(valueOf2 == null ? o.e((Number) 134) : valueOf2.intValue());
            com.alibaba.triver.triver_shop.shop2023.data.a aVar5 = this.x;
            int j2 = aVar5.j();
            JSONObject extData4 = shopComponentModel2.getExtData();
            aVar5.g(j2 + ((int) (o.c(Integer.valueOf((extData4 == null || (jSONObject = extData4.getJSONObject("otherPageStyleConfig")) == null) ? 66 : jSONObject.getIntValue("shopIconHeight"))) * 0.18f)));
            this.x.a(c2);
            this.x.h(c2);
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar7 = this.aj;
            View[] viewArr = new View[4];
            FrameLayout frameLayout3 = this.h;
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
            if (frameLayout5 == null) {
                q.b("shopRelationContainer");
                throw null;
            }
            viewArr[2] = frameLayout5;
            FrameLayout frameLayout6 = this.m;
            if (frameLayout6 != null) {
                viewArr[3] = frameLayout6;
                this.as = new com.alibaba.triver.triver_shop.shop2023.nativeview.g(bVar7, viewArr);
                if (this.aw) {
                    com.alibaba.triver.triver_shop.shop2023.nativeview.g gVar = this.as;
                    if (gVar != null) {
                        View view = this.av;
                        if (view == null) {
                            q.b("shopBackgroundColorViewContainer");
                            throw null;
                        }
                        gVar.a(view);
                    }
                    th = null;
                } else {
                    th = null;
                    com.alibaba.triver.triver_shop.shop2023.nativeview.g gVar2 = this.as;
                    if (gVar2 != null) {
                        TUrlImageView tUrlImageView = this.p;
                        if (tUrlImageView == null) {
                            q.b("shopBackgroundImg");
                            throw null;
                        }
                        gVar2.a(tUrlImageView);
                    }
                }
                com.alibaba.triver.triver_shop.shop2023.nativeview.g gVar3 = this.as;
                if (gVar3 != null) {
                    FrameLayout frameLayout7 = this.ap;
                    if (frameLayout7 == null) {
                        q.b("searchBarContainer");
                        throw th;
                    } else {
                        gVar3.a(frameLayout7);
                        t tVar7 = t.INSTANCE;
                    }
                }
                this.at = new com.alibaba.triver.triver_shop.shop2023.nativeview.f(this.aj);
                com.alibaba.triver.triver_shop.shop2023.nativeview.f fVar = this.at;
                if (fVar != null) {
                    FrameLayout frameLayout8 = this.h;
                    if (frameLayout8 == null) {
                        q.b("centerContainer");
                        throw null;
                    }
                    fVar.a(frameLayout8);
                }
                com.alibaba.triver.triver_shop.shop2023.nativeview.f fVar2 = this.at;
                if (fVar2 != null) {
                    fVar2.b(d());
                    t tVar8 = t.INSTANCE;
                }
            } else {
                q.b("shopHeaderContainer");
                throw null;
            }
        }
        ShopComponentModel shopComponentModel3 = g2.get("tb_shop_header_feature_2023");
        if (shopComponentModel3 != null) {
            this.Y = new com.alibaba.triver.triver_shop.shop2023.template.d(shopComponentModel3);
            com.alibaba.triver.triver_shop.shop2023.template.d dVar = this.Y;
            q.a(dVar);
            com.alibaba.triver.triver_shop.newShop.view.component.a.a(this, dVar, (String) null, 2, (Object) null);
            com.alibaba.triver.triver_shop.shop2023.template.d dVar2 = this.Y;
            q.a(dVar2);
            dVar2.a(a(), b(), c(), null);
            this.A.h(o.e(Integer.valueOf(shopComponentModel3.getRenderHeight())));
            FrameLayout frameLayout9 = this.m;
            if (frameLayout9 == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.shop2023.template.d dVar3 = this.Y;
            q.a(dVar3);
            frameLayout9.addView(dVar3.f(), o.a(0, this.A.e(), this.x.e(), 0, 0, 0, 0, 121, null));
            t tVar9 = t.INSTANCE;
            t tVar10 = t.INSTANCE;
        }
        FrameLayout frameLayout10 = new FrameLayout(a());
        boolean z4 = (g2.get("tb_shop_header_honor_list_2023") == null && g2.get("tb_shop_header_tag_list_2023") == null) ? false : true;
        ShopComponentModel shopComponentModel4 = g2.get("tb_shop_header_honor_list_2023");
        if (shopComponentModel4 != null) {
            com.alibaba.triver.triver_shop.shop2023.template.i iVar = new com.alibaba.triver.triver_shop.shop2023.template.i(shopComponentModel4);
            com.alibaba.triver.triver_shop.newShop.view.component.a.a(this, iVar, (String) null, 2, (Object) null);
            iVar.a(a(), b(), c(), null);
            i2 = o.c(Integer.valueOf(shopComponentModel4.getRenderHeight()));
            frameLayout10.addView(iVar.f(), o.a(0, i2, 0, 0, 0, 0, 0, 121, null));
            t tVar11 = t.INSTANCE;
            t tVar12 = t.INSTANCE;
        } else {
            i2 = 0;
        }
        ShopComponentModel shopComponentModel5 = g2.get("tb_shop_header_tag_list_2023");
        if (shopComponentModel5 != null) {
            Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate = new Shop2023HeaderTagListTemplate(shopComponentModel5);
            this.am = shop2023HeaderTagListTemplate;
            com.alibaba.triver.triver_shop.newShop.view.component.a.a(this, shop2023HeaderTagListTemplate, (String) null, 2, (Object) null);
            shop2023HeaderTagListTemplate.a(new Default2023Shop$initTemplateComponent$5$1(this, shop2023HeaderTagListTemplate));
            shop2023HeaderTagListTemplate.a(a(), b(), c(), null);
            i3 = o.c(Integer.valueOf(shopComponentModel5.getRenderHeight()));
            FrameLayout frameLayout11 = new FrameLayout(a());
            o.a(frameLayout11, shop2023HeaderTagListTemplate.f());
            frameLayout10.addView(frameLayout11, o.a(-2, i3, i2, 0, 0, 0, 0, 120, null));
            t tVar13 = t.INSTANCE;
            t tVar14 = t.INSTANCE;
        } else {
            i3 = 0;
        }
        if (z4) {
            this.an = frameLayout10;
            FrameLayout frameLayout12 = this.m;
            if (frameLayout12 != null) {
                int i5 = i2 + i3;
                frameLayout12.addView(frameLayout10, o.a(0, i5, this.x.e(), 0, 0, 0, 0, 121, null));
                this.A.h(i5);
            } else {
                q.b("shopHeaderContainer");
                throw null;
            }
        }
        this.w.h(this.x.e() + this.A.e());
        this.w.d(m());
        FrameLayout frameLayout13 = this.m;
        if (frameLayout13 == null) {
            q.b("shopHeaderContainer");
            throw null;
        }
        o.a(frameLayout13, this.w.e());
        FrameLayout frameLayout14 = this.m;
        if (frameLayout14 == null) {
            q.b("shopHeaderContainer");
            throw null;
        }
        o.c(frameLayout14, this.w.f());
        ShopComponentModel shopComponentModel6 = g2.get("tb_shop_header_relation_2023");
        if (shopComponentModel6 != null) {
            z = shopComponentModel6.canRenderDXTemplate();
            this.Z = new com.alibaba.triver.triver_shop.shop2023.template.f(shopComponentModel6);
            com.alibaba.triver.triver_shop.newShop.view.component.a.a(this, this.Z, (String) null, 2, (Object) null);
            com.alibaba.triver.triver_shop.shop2023.template.f fVar3 = this.Z;
            if (fVar3 != null) {
                fVar3.a(new Default2023Shop$initTemplateComponent$6$1(this));
            }
            com.alibaba.triver.triver_shop.shop2023.template.f fVar4 = this.Z;
            q.a(fVar4);
            fVar4.a(a(), b(), c(), null);
            this.C.h(o.e(Integer.valueOf(shopComponentModel6.getRenderHeight())));
            FrameLayout frameLayout15 = this.n;
            if (frameLayout15 == null) {
                q.b("shopRelationContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.shop2023.template.f fVar5 = this.Z;
            q.a(fVar5);
            frameLayout15.addView(fVar5.f(), o.a(0, this.C.e(), 0, 0, 0, 0, 0, 125, null));
            t tVar15 = t.INSTANCE;
            t tVar16 = t.INSTANCE;
        } else {
            z = false;
        }
        ShopComponentModel shopComponentModel7 = g2.get("tb_shop_header_relation_2023_web");
        if (shopComponentModel7 != null) {
            z = shopComponentModel7.getTargetUrl() != null;
            if (z) {
                com.alibaba.triver.triver_shop.newShop.ext.h.a(shopComponentModel7, a());
            }
            b().k("shopRelationWebViewStart");
            final ShopWrapWebView shopWrapWebView = new ShopWrapWebView(a());
            shopWrapWebView.setShopData(b());
            this.ag = shopWrapWebView;
            ShopWrapWebView shopWrapWebView2 = shopWrapWebView;
            o.g(shopWrapWebView2);
            shopWrapWebView.setLoadFailedProcessor(new Runnable() { // from class: com.alibaba.triver.triver_shop.shop2023.Default2023Shop$initTemplateComponent$7$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* loaded from: classes3.dex */
                public static final class a implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ com.alibaba.triver.triver_shop.shop2023.a f4036a;
                    public final /* synthetic */ ShopWrapWebView b;

                    public a(com.alibaba.triver.triver_shop.shop2023.a aVar, ShopWrapWebView shopWrapWebView) {
                        this.f4036a = aVar;
                        this.b = shopWrapWebView;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (com.alibaba.triver.triver_shop.newShop.ext.b.c((Activity) com.alibaba.triver.triver_shop.shop2023.a.f(this.f4036a)) || this.b.isDestroied()) {
                        } else {
                            View a2 = this.b.getShopFrameworkBizAdapter().a();
                            if (a2 != null) {
                                o.j(a2);
                            }
                            o.a(this.b, 0);
                            com.alibaba.triver.triver_shop.shop2023.a aVar = this.f4036a;
                            com.alibaba.triver.triver_shop.shop2023.a.$ipChange.c(0);
                            com.alibaba.triver.triver_shop.shop2023.a aVar2 = this.f4036a;
                            com.alibaba.triver.triver_shop.shop2023.template.c cVar = com.alibaba.triver.triver_shop.shop2023.a.$ipChange;
                            if (cVar != null) {
                                cVar.o();
                            }
                            com.alibaba.triver.triver_shop.shop2023.a.j(this.f4036a);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a aVar6 = new a(com.alibaba.triver.triver_shop.shop2023.a.this, shopWrapWebView);
                    com.alibaba.triver.triver_shop.shop2023.a aVar7 = com.alibaba.triver.triver_shop.shop2023.a.this;
                    if (!com.alibaba.triver.triver_shop.shop2023.a.$ipChange) {
                        com.alibaba.triver.triver_shop.shop2023.a aVar8 = com.alibaba.triver.triver_shop.shop2023.a.this;
                        if (!com.alibaba.triver.triver_shop.shop2023.a.$ipChange) {
                            com.alibaba.triver.triver_shop.shop2023.a aVar9 = com.alibaba.triver.triver_shop.shop2023.a.this;
                            if (!com.alibaba.triver.triver_shop.shop2023.a.$ipChange) {
                                aVar6.run();
                                return;
                            }
                        }
                    }
                    com.alibaba.triver.triver_shop.shop2023.a.a(com.alibaba.triver.triver_shop.shop2023.a.this, aVar6);
                }
            });
            shopWrapWebView.render(com.alibaba.triver.triver_shop.newShop.ext.h.a(shopComponentModel7.getTargetUrl(), a().getIntent()));
            this.C.h(o.e(Integer.valueOf(shopComponentModel7.getRenderHeight())));
            FrameLayout frameLayout16 = this.n;
            if (frameLayout16 != null) {
                frameLayout16.addView(shopWrapWebView2, o.a(0, this.C.e(), 0, 0, 0, 0, 0, 125, null));
                JSONObject extData5 = shopComponentModel7.getExtData();
                if (extData5 != null && (string = extData5.getString("loadingPic")) != null) {
                    TUrlImageView tUrlImageView2 = new TUrlImageView(a());
                    tUrlImageView2.setImageUrl(string);
                    tUrlImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                    FrameLayout frameLayout17 = this.n;
                    if (frameLayout17 == null) {
                        q.b("shopRelationContainer");
                        throw null;
                    }
                    TUrlImageView tUrlImageView3 = tUrlImageView2;
                    o.a(frameLayout17, tUrlImageView3);
                    shopWrapWebView.getShopFrameworkBizAdapter().a(tUrlImageView3);
                    t tVar17 = t.INSTANCE;
                }
            } else {
                q.b("shopRelationContainer");
                throw null;
            }
        }
        ShopComponentModel shopComponentModel8 = g2.get("tb_shop_header_activity_2023");
        if (shopComponentModel8 != null) {
            this.aa = new com.alibaba.triver.triver_shop.shop2023.template.c(shopComponentModel8, z);
            z2 = shopComponentModel8.canRenderDXTemplate();
            com.alibaba.triver.triver_shop.newShop.view.component.a.a(this, this.aa, (String) null, 2, (Object) null);
            com.alibaba.triver.triver_shop.shop2023.template.c cVar2 = this.aa;
            q.a(cVar2);
            cVar2.a(a(), b(), c(), null);
            this.B.h(o.e(Integer.valueOf(shopComponentModel8.getRenderHeight())));
            this.B.d(this.C.e());
            FrameLayout frameLayout18 = this.n;
            if (frameLayout18 == null) {
                q.b("shopRelationContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.shop2023.template.c cVar3 = this.aa;
            q.a(cVar3);
            frameLayout18.addView(cVar3.f(), o.a(0, this.B.e(), this.B.f(), 0, 0, 0, 0, 121, null));
            t tVar18 = t.INSTANCE;
            t tVar19 = t.INSTANCE;
        } else {
            z2 = false;
        }
        this.D.h(this.C.e() + this.B.e());
        if (q()) {
            this.D.d(this.S);
        } else {
            this.D.d(m() + this.w.e());
        }
        FrameLayout frameLayout19 = this.n;
        if (frameLayout19 == null) {
            q.b("shopRelationContainer");
            throw null;
        }
        o.a(frameLayout19, this.D.e());
        FrameLayout frameLayout20 = this.n;
        if (frameLayout20 == null) {
            q.b("shopRelationContainer");
            throw null;
        }
        o.c(frameLayout20, this.D.f());
        if (this.D.e() == 0) {
            this.F = 0;
            this.P = true;
            View view2 = this.s;
            if (view2 == null) {
                q.b("shopCenterGrayLine");
                throw null;
            }
            view2.setBackgroundColor(0);
        } else {
            this.F = this.E;
        }
        if (g2.get("tb_shop_sub_tab_2023") != null) {
            this.y.h(b().bc().i());
            this.al = new com.alibaba.triver.triver_shop.shop2023.nativeview.c(a(), b(), this.y.e());
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar8 = this.aj;
            if (bVar8 != null) {
                bVar8.a(this.al);
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar4 = this.al;
            if (cVar4 != null) {
                cVar4.a(z);
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar5 = this.al;
            if (cVar5 != null) {
                cVar5.c(z2);
            }
            EnhancedViewPager enhancedViewPager = this.f;
            if (enhancedViewPager == null) {
                q.b("contentViewPager");
                throw null;
            }
            enhancedViewPager.addOnPageChangeListener(this.al);
            com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar6 = this.al;
            if (cVar6 != null) {
                cVar6.a(new Default2023Shop$initTemplateComponent$9$1(this));
            }
            FrameLayout frameLayout21 = this.k;
            if (frameLayout21 == null) {
                q.b("navViewContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar7 = this.al;
            q.a(cVar7);
            frameLayout21.addView(cVar7.a(), o.a(0, this.y.e(), 0, 0, 0, 0, 0, 125, null));
            t tVar20 = t.INSTANCE;
            t tVar21 = t.INSTANCE;
        }
        if (q()) {
            this.y.d(this.S + this.D.e());
        } else {
            this.y.d(m() + this.w.e() + this.D.e() + this.F);
        }
        this.y.e(m() + this.x.e() + this.A.e());
        FrameLayout frameLayout22 = this.k;
        if (frameLayout22 == null) {
            q.b("navViewContainer");
            throw null;
        }
        o.a(frameLayout22, -2);
        FrameLayout frameLayout23 = this.k;
        if (frameLayout23 == null) {
            q.b("navViewContainer");
            throw null;
        }
        o.c(frameLayout23, this.y.f());
        b().bc().a(this.y.f());
        ShopComponentModel shopComponentModel9 = g2.get("tb_shop_bottom_bar_2023");
        if (shopComponentModel9 != null) {
            this.z.c(o.e(Integer.valueOf(shopComponentModel9.getRenderHeight())));
            this.ak = new com.alibaba.triver.triver_shop.shop2023.nativeview.a(a(), b());
            com.alibaba.triver.triver_shop.shop2023.nativeview.f fVar6 = this.at;
            if (fVar6 != null) {
                fVar6.a(this.ak);
            }
            EnhancedViewPager enhancedViewPager2 = this.f;
            if (enhancedViewPager2 == null) {
                q.b("contentViewPager");
                throw null;
            }
            enhancedViewPager2.addOnPageChangeListener(this.ak);
            com.alibaba.triver.triver_shop.shop2023.nativeview.a aVar6 = this.ak;
            if (aVar6 != null) {
                aVar6.a(new Default2023Shop$initTemplateComponent$10$1(this));
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.a aVar7 = this.ak;
            if (aVar7 != null) {
                ViewGroup viewGroup = this.i;
                if (viewGroup == null) {
                    q.b("bottomBarContainer");
                    throw null;
                } else {
                    aVar7.a(viewGroup, this.z.e());
                    t tVar22 = t.INSTANCE;
                }
            }
            com.alibaba.triver.triver_shop.newShop.data.d b3 = b();
            com.alibaba.triver.triver_shop.shop2023.nativeview.a aVar8 = this.ak;
            if (aVar8 != null) {
                i4 = o.f(Integer.valueOf(aVar8.d()));
            }
            b3.a(i4);
            t tVar23 = t.INSTANCE;
            t tVar24 = t.INSTANCE;
        }
        if (q()) {
            ShopComponentModel f3 = b().bc().b() ? new d.c(b()).f() : b().bc().o();
            if (f3 != null) {
                this.ab = new com.alibaba.triver.triver_shop.shop2023.template.g(f3, !b().bc().b(), false, 4, null);
                com.alibaba.triver.triver_shop.newShop.view.component.a.a(this, this.ab, (String) null, 2, (Object) null);
                com.alibaba.triver.triver_shop.shop2023.template.g gVar4 = this.ab;
                q.a(gVar4);
                gVar4.a(a(), b(), c(), null);
                ViewGroup viewGroup2 = this.l;
                if (viewGroup2 == null) {
                    q.b("bigCardContainer");
                    throw null;
                }
                com.alibaba.triver.triver_shop.shop2023.template.g gVar5 = this.ab;
                q.a(gVar5);
                View f4 = gVar5.f();
                int e3 = o.e(Integer.valueOf(f3.getRenderHeight()));
                com.alibaba.triver.triver_shop.shop2023.data.c cVar8 = this.T;
                q.a(cVar8);
                viewGroup2.addView(f4, o.a(0, e3, 0, cVar8.b(), 0, 0, 80, 53, null));
                EmbedShopLoftComponent embedShopLoftComponent = this.U;
                if (embedShopLoftComponent != null && (a2 = embedShopLoftComponent.a()) != null && (a3 = a2.a()) != null) {
                    a3.a(h.a.class.getName(), new d());
                    t tVar25 = t.INSTANCE;
                }
            }
        }
        this.G = Z();
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar9 = this.aj;
        if (bVar9 != null) {
            bVar9.a(this.G);
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar10 = this.aj;
        if (bVar10 != null) {
            com.alibaba.triver.triver_shop.shop2023.template.d dVar4 = this.Y;
            bVar10.b(dVar4 == null ? null : dVar4.f());
        }
        if (z4 && (bVar = this.aj) != null) {
            bVar.b(frameLayout10);
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar11 = this.aj;
        if (bVar11 != null) {
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate5 = this.V;
            bVar11.a(shop2023HeaderInfoTemplate5 == null ? null : shop2023HeaderInfoTemplate5.f());
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar12 = this.aj;
        if (bVar12 != null) {
            bVar12.b(this.D.e());
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar13 = this.aj;
        if (bVar13 != null) {
            bVar13.f();
            t tVar26 = t.INSTANCE;
        }
        this.K = aa();
        ViewGroup viewGroup3 = this.i;
        if (viewGroup3 == null) {
            q.b("bottomBarContainer");
            throw null;
        }
        o.a(viewGroup3, this.z.e());
        FrameLayout frameLayout24 = this.h;
        if (frameLayout24 != null) {
            o.a(frameLayout24, ((com.alibaba.triver.triver_shop.newShop.ext.b.b((Activity) a()).heightPixels - this.x.e()) - this.z.e()) - m());
            b().c(this.z.e());
            b().d(m() + this.x.j());
            if (!z && !z2 && (cVar = this.al) != null) {
                cVar.b(true);
                t tVar27 = t.INSTANCE;
            }
            F();
            com.alibaba.triver.triver_shop.shop2023.nativeview.i iVar2 = this.aq;
            if (iVar2 == null) {
                return;
            }
            iVar2.a(b(), d());
            t tVar28 = t.INSTANCE;
            return;
        }
        q.b("centerContainer");
        throw null;
    }

    /* loaded from: classes3.dex */
    public static final class d implements h.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.b.a.InterfaceC0126a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public d() {
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.h.a
        public void b() {
            View f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            com.alibaba.triver.triver_shop.shop2023.template.g p = a.p(a.this);
            if (p != null && (f = p.f()) != null) {
                o.b(f);
            }
            EmbedShopLoftComponent q = a.q(a.this);
            if (q == null) {
                return;
            }
            q.h();
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.h.a
        public void c() {
            View f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            com.alibaba.triver.triver_shop.shop2023.template.g p = a.p(a.this);
            if (p != null && (f = p.f()) != null) {
                o.d(f);
            }
            EmbedShopLoftComponent q = a.q(a.this);
            if (q == null) {
                return;
            }
            q.g();
        }
    }

    private final boolean q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c36f5d60", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        ceg.a aVar = ceg.Companion;
        aVar.a("ggg Default2023Shop changeToCrossStoreStyle " + z + ' ' + o());
        if (z) {
            if (o() || ar()) {
                return false;
            }
        } else if (!ar()) {
            return false;
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.f fVar = this.at;
        if (fVar != null) {
            fVar.a(z);
        }
        v(z);
        ag();
        EnhancedViewPager enhancedViewPager = this.f;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCanScroll(!z);
            return true;
        }
        q.b("contentViewPager");
        throw null;
    }

    private final View aq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("39107139", new Object[]{this});
        }
        FrameLayout frameLayout = this.an;
        if (frameLayout != null) {
            return frameLayout;
        }
        com.alibaba.triver.triver_shop.shop2023.template.d dVar = this.Y;
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
        int i2 = this.ae;
        int i3 = this.ad;
        if (i2 >= i3) {
            return;
        }
        this.ae = i2 + 1;
        if (this.ae < i3) {
            return;
        }
        F();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void F() {
        View aq;
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
            if (!q() || (aq = aq()) == null) {
                return;
            }
            o.d(aq);
        } else {
            o.a(d(), new Default2023Shop$allTemplateLoadFinish$1(this));
        }
    }

    private final void W() {
        View f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df815e", new Object[]{this});
            return;
        }
        ceg.Companion.b("reCalculateHeightAndLayout");
        this.B.d(this.C.e());
        com.alibaba.triver.triver_shop.shop2023.template.c cVar = this.aa;
        if (cVar != null && (f2 = cVar.f()) != null) {
            o.c(f2, this.B.f());
        }
        this.D.c(this.C.e() + this.B.e());
        if (q()) {
            this.D.d(this.S);
        } else {
            this.D.d(m() + this.w.e());
        }
        FrameLayout frameLayout = this.n;
        if (frameLayout == null) {
            q.b("shopRelationContainer");
            throw null;
        }
        o.a(frameLayout, this.D.e());
        FrameLayout frameLayout2 = this.n;
        if (frameLayout2 == null) {
            q.b("shopRelationContainer");
            throw null;
        }
        o.c(frameLayout2, this.D.f());
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.aj;
        if (bVar != null) {
            bVar.b(this.D.e());
        }
        if (this.D.e() == 0) {
            this.F = 0;
            this.P = true;
            View view = this.s;
            if (view == null) {
                q.b("shopCenterGrayLine");
                throw null;
            }
            view.setBackgroundColor(0);
            com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar2 = this.al;
            if (cVar2 != null) {
                cVar2.a(false);
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar3 = this.al;
            if (cVar3 != null) {
                cVar3.b(!o());
            }
        } else {
            this.F = this.E;
        }
        if (q()) {
            this.y.d(this.S + this.D.e());
        } else {
            this.y.d(m() + this.w.e() + this.D.e() + this.F);
        }
        this.y.e(m() + this.x.e() + this.A.e());
        FrameLayout frameLayout3 = this.k;
        if (frameLayout3 == null) {
            q.b("navViewContainer");
            throw null;
        }
        o.a(frameLayout3, -2);
        if (this.R) {
            FrameLayout frameLayout4 = this.k;
            if (frameLayout4 == null) {
                q.b("navViewContainer");
                throw null;
            }
            o.c(frameLayout4, this.y.h());
        } else if (C()) {
            if (o()) {
                FrameLayout frameLayout5 = this.k;
                if (frameLayout5 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                o.c(frameLayout5, this.y.f());
            }
        } else if (o()) {
            FrameLayout frameLayout6 = this.k;
            if (frameLayout6 == null) {
                q.b("navViewContainer");
                throw null;
            }
            o.c(frameLayout6, this.y.g());
        }
        this.G = Z();
        if (!o()) {
            this.I = this.G;
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar2 = this.aj;
        if (bVar2 != null) {
            bVar2.a(this.G);
        }
        this.K = aa();
    }

    private final boolean X() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[]{this})).booleanValue() : b().o() == 0;
    }

    private final int Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fbb053", new Object[]{this})).intValue();
        }
        if (X()) {
            return this.y.f();
        }
        return this.y.g();
    }

    private final int Z() {
        int g2;
        int j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("509c7d4", new Object[]{this})).intValue();
        }
        if (X()) {
            if (q()) {
                return this.D.e() + ((this.S - m()) - this.x.j());
            }
            g2 = this.y.f() - m();
            j2 = this.x.j();
        } else {
            g2 = this.y.g() - m();
            j2 = this.x.j();
        }
        return g2 - j2;
    }

    private final int aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aaf2809a", new Object[]{this})).intValue();
        }
        if (!X()) {
            return 0;
        }
        if (this.x.c()) {
            return this.x.a() - this.x.i();
        }
        return this.x.e() - this.x.i();
    }

    private final void ab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab009828", new Object[]{this});
            return;
        }
        View a2 = o.a(a(), R.layout.view_shop_2023_base_layout);
        if (a2 == null) {
            return;
        }
        this.g = new ShopOptSwipeLayout(a());
        View findViewById = a2.findViewById(R.id.shop_2023_search_bar_container);
        q.b(findViewById, "contentView.findViewById(R.id.shop_2023_search_bar_container)");
        this.ap = (FrameLayout) findViewById;
        FrameLayout frameLayout = this.ap;
        if (frameLayout == null) {
            q.b("searchBarContainer");
            throw null;
        }
        frameLayout.setPadding(0, m(), 0, 0);
        View findViewById2 = a2.findViewById(R.id.shop_2023_content_part);
        q.b(findViewById2, "contentView.findViewById(R.id.shop_2023_content_part)");
        this.h = (FrameLayout) findViewById2;
        View findViewById3 = a2.findViewById(R.id.shop_2023_big_card_part);
        q.b(findViewById3, "contentView.findViewById(R.id.shop_2023_big_card_part)");
        this.l = (ViewGroup) findViewById3;
        View findViewById4 = a2.findViewById(R.id.shop_2023_index_nav_part);
        q.b(findViewById4, "contentView.findViewById(R.id.shop_2023_index_nav_part)");
        this.k = (FrameLayout) findViewById4;
        View findViewById5 = a2.findViewById(R.id.shop_2023_top_header_part);
        q.b(findViewById5, "contentView.findViewById(R.id.shop_2023_top_header_part)");
        this.m = (FrameLayout) findViewById5;
        View findViewById6 = a2.findViewById(R.id.shop_2023_background_img);
        q.b(findViewById6, "contentView.findViewById(R.id.shop_2023_background_img)");
        this.p = (TUrlImageView) findViewById6;
        View findViewById7 = a2.findViewById(R.id.shop_2023_background_color_view_container);
        q.b(findViewById7, "contentView.findViewById(R.id.shop_2023_background_color_view_container)");
        this.av = findViewById7;
        View findViewById8 = a2.findViewById(R.id.shop_2023_background_color_view);
        q.b(findViewById8, "contentView.findViewById(R.id.shop_2023_background_color_view)");
        this.q = findViewById8;
        View findViewById9 = a2.findViewById(R.id.shop_2023_background_color_view_2);
        q.b(findViewById9, "contentView.findViewById(R.id.shop_2023_background_color_view_2)");
        this.r = findViewById9;
        View findViewById10 = a2.findViewById(R.id.shop_2023_bottom_bar_part);
        q.b(findViewById10, "contentView.findViewById(R.id.shop_2023_bottom_bar_part)");
        this.i = (ViewGroup) findViewById10;
        View findViewById11 = a2.findViewById(R.id.shop_2023_bottom_bar_part_bg);
        q.b(findViewById11, "contentView.findViewById(R.id.shop_2023_bottom_bar_part_bg)");
        this.j = findViewById11;
        View findViewById12 = a2.findViewById(R.id.shop_2023_relation_part);
        q.b(findViewById12, "contentView.findViewById(R.id.shop_2023_relation_part)");
        this.n = (FrameLayout) findViewById12;
        View findViewById13 = a2.findViewById(R.id.shop_2023_center_gray_line);
        q.b(findViewById13, "contentView.findViewById(R.id.shop_2023_center_gray_line)");
        this.s = findViewById13;
        View view = this.s;
        if (view == null) {
            q.b("shopCenterGrayLine");
            throw null;
        }
        o.e(view);
        EnhancedViewPager enhancedViewPager = new EnhancedViewPager(a());
        enhancedViewPager.setId(R.id.new_shop_view_view_pager);
        com.alibaba.triver.triver_shop.newShop.view.provider.c cVar = new com.alibaba.triver.triver_shop.newShop.view.provider.c(b());
        this.f = enhancedViewPager;
        FrameLayout frameLayout2 = this.k;
        if (frameLayout2 == null) {
            q.b("navViewContainer");
            throw null;
        }
        frameLayout2.setZ(0.1f);
        EnhancedViewPager enhancedViewPager2 = enhancedViewPager;
        o.g(enhancedViewPager2);
        EnhancedViewPager enhancedViewPager3 = this.f;
        if (enhancedViewPager3 == null) {
            q.b("contentViewPager");
            throw null;
        }
        enhancedViewPager3.setOffscreenPageLimit(cVar.a() - 1);
        FragmentManager supportFragmentManager = a().getSupportFragmentManager();
        q.b(supportFragmentManager, "context.supportFragmentManager");
        this.o = new cej(supportFragmentManager);
        cej cejVar = this.o;
        if (cejVar == null) {
            q.b("shopContainerPageAdapter");
            throw null;
        }
        cejVar.a(cVar);
        cej cejVar2 = this.o;
        if (cejVar2 == null) {
            q.b("shopContainerPageAdapter");
            throw null;
        }
        enhancedViewPager.setAdapter(cejVar2);
        enhancedViewPager.addOnPageChangeListener(this);
        FrameLayout frameLayout3 = this.h;
        if (frameLayout3 == null) {
            q.b("centerContainer");
            throw null;
        }
        o.a(frameLayout3, enhancedViewPager2);
        ShopOptSwipeLayout shopOptSwipeLayout = this.g;
        if (shopOptSwipeLayout == null) {
            q.b("outerSwiperLayout");
            throw null;
        }
        shopOptSwipeLayout.setSwipeListener(this);
        ShopOptSwipeLayout shopOptSwipeLayout2 = this.g;
        if (shopOptSwipeLayout2 == null) {
            q.b("outerSwiperLayout");
            throw null;
        }
        o.a(shopOptSwipeLayout2, a2);
        ShopOptSwipeLayout shopOptSwipeLayout3 = this.g;
        if (shopOptSwipeLayout3 == null) {
            q.b("outerSwiperLayout");
            throw null;
        }
        shopOptSwipeLayout3.setExpandedStatusGetter(new Default2023Shop$initView$1(this));
        FrameLayout d2 = d();
        ShopOptSwipeLayout shopOptSwipeLayout4 = this.g;
        if (shopOptSwipeLayout4 == null) {
            q.b("outerSwiperLayout");
            throw null;
        }
        o.a(d2, shopOptSwipeLayout4);
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
        if (!com.alibaba.triver.triver_shop.newShop.ext.l.b()) {
            c(b().bc().d());
        }
        if (!q()) {
            return;
        }
        com.alibaba.triver.triver_shop.shop2023.data.c a3 = b().bc().a();
        this.T = a3;
        this.S = a3.a() - a3.b();
        this.H = a3.b();
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            q.b("bigCardContainer");
            throw null;
        }
        o.a(viewGroup, a3.a());
        if (b().bc().m()) {
            EmbedShopLoftComponent embedShopLoftComponent = new EmbedShopLoftComponent(a(), b(), c());
            if (b().bc().b()) {
                b().d(true);
                embedShopLoftComponent.a().a(true);
            }
            embedShopLoftComponent.a(new Default2023Shop$initView$3(this));
            ViewGroup viewGroup2 = this.l;
            if (viewGroup2 == null) {
                q.b("bigCardContainer");
                throw null;
            }
            o.a(viewGroup2, embedShopLoftComponent.i());
            embedShopLoftComponent.f();
            this.U = embedShopLoftComponent;
            if (!b().bc().b()) {
                View view2 = new View(a());
                o.a(view2, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, kotlin.collections.g.a(new Integer[]{0, Integer.valueOf(Color.parseColor("#df000000"))})));
                ViewGroup viewGroup3 = this.l;
                if (viewGroup3 == null) {
                    q.b("bigCardContainer");
                    throw null;
                }
                viewGroup3.addView(view2, o.a(0, o.c((Number) 152), 0, 0, 0, 0, 48, 61, null));
            }
        }
        View view3 = new View(a());
        o.a(view3, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, kotlin.collections.g.a(new Integer[]{0, Integer.valueOf(Color.parseColor("#7f000000")), 0})));
        ViewGroup viewGroup4 = this.l;
        if (viewGroup4 != null) {
            viewGroup4.addView(view3, o.a(0, o.c((Number) 194), 0, a3.b() - o.c((Number) 90), 0, 0, 80, 53, null));
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
        ShopWrapWebView shopWrapWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5770811", new Object[]{this, event});
            return;
        }
        q.d(event, "event");
        B();
        ShopOptSwipeLayout shopOptSwipeLayout = this.g;
        if (shopOptSwipeLayout == null) {
            q.b("outerSwiperLayout");
            throw null;
        } else if (!shopOptSwipeLayout.isForceIntercept() || (shopWrapWebView = this.ag) == null) {
        } else {
            shopWrapWebView.dispatchTouchEvent(event);
        }
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

    public static /* synthetic */ void a(a aVar, int i2, boolean z, Integer num, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74417c3", new Object[]{aVar, new Integer(i2), new Boolean(z), num, new Integer(i3), obj});
            return;
        }
        if ((i3 & 2) != 0) {
            z = true;
        }
        if ((i3 & 4) != 0) {
            num = null;
        }
        aVar.a(i2, z, num);
    }

    private final void a(int i2, boolean z, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde5e73e", new Object[]{this, new Integer(i2), new Boolean(z), num});
        } else if (!as() || n() || this.R) {
        } else {
            if (z && p()) {
                return;
            }
            if (!this.L) {
                EnhancedViewPager enhancedViewPager = this.f;
                if (enhancedViewPager == null) {
                    q.b("contentViewPager");
                    throw null;
                }
                enhancedViewPager.setCanDispatchToChild(false);
                this.O += Math.abs(i2);
                if (this.O < this.N) {
                    return;
                }
            }
            int T = (int) (i2 * T());
            com.alibaba.triver.triver_shop.shop2023.nativeview.g gVar = this.as;
            if (gVar != null && gVar.a(T)) {
                return;
            }
            ah();
            this.L = true;
            this.M = true;
            EnhancedViewPager enhancedViewPager2 = this.f;
            if (enhancedViewPager2 == null) {
                q.b("contentViewPager");
                throw null;
            }
            enhancedViewPager2.setCanScroll(false);
            if (this.I >= this.G) {
                EnhancedViewPager enhancedViewPager3 = this.f;
                if (enhancedViewPager3 != null) {
                    enhancedViewPager3.setCanDispatchToChild(true);
                    return;
                } else {
                    q.b("contentViewPager");
                    throw null;
                }
            }
            int Y = num == null ? Y() : num.intValue();
            this.I += T;
            this.J -= T;
            int i3 = this.I;
            int i4 = this.G;
            if (i3 > i4) {
                this.I = i4;
                this.J = 0 - this.I;
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.aj;
            if (bVar != null) {
                bVar.c(this.I);
            }
            float abs = Math.abs(this.I) / this.G;
            float f2 = 1 - abs;
            if (this.J >= 0) {
                FrameLayout frameLayout = this.n;
                if (frameLayout == null) {
                    q.b("shopRelationContainer");
                    throw null;
                }
                frameLayout.setAlpha(1.0f);
            } else {
                FrameLayout frameLayout2 = this.n;
                if (frameLayout2 == null) {
                    q.b("shopRelationContainer");
                    throw null;
                }
                frameLayout2.setAlpha(f2);
            }
            View aq = aq();
            if (aq != null) {
                aq.setAlpha(f2);
            }
            if (this.J >= 0) {
                FrameLayout frameLayout3 = this.n;
                if (frameLayout3 == null) {
                    q.b("shopRelationContainer");
                    throw null;
                }
                o.c(frameLayout3, this.D.f() - this.I);
            } else {
                FrameLayout frameLayout4 = this.n;
                if (frameLayout4 == null) {
                    q.b("shopRelationContainer");
                    throw null;
                }
                o.c(frameLayout4, this.D.f() - ((int) (this.K * abs)));
            }
            if (q()) {
                com.alibaba.triver.triver_shop.shop2023.data.c cVar = this.T;
                q.a(cVar);
                int a2 = cVar.a();
                int i5 = this.I;
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
            FrameLayout frameLayout5 = this.k;
            if (frameLayout5 != null) {
                o.c(frameLayout5, Y - this.I);
            } else {
                q.b("navViewContainer");
                throw null;
            }
        }
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

    public static /* synthetic */ void a(a aVar, int i2, boolean z, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fe9d884", new Object[]{aVar, new Integer(i2), new Boolean(z), new Integer(i3), obj});
            return;
        }
        if ((i3 & 2) != 0) {
            z = true;
        }
        aVar.a(i2, z);
    }

    private final void a(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i2), new Boolean(z)});
        } else if (!as() || n() || this.R) {
        } else {
            if ((z && p()) || !b().m(b().K())) {
                return;
            }
            if (!this.L) {
                this.O += Math.abs(i2);
                if (this.O < this.N) {
                    return;
                }
            }
            ah();
            int T = (int) (i2 * T());
            if (this.I < this.G && X() && q()) {
                ViewGroup viewGroup = this.l;
                if (viewGroup == null) {
                    q.b("bigCardContainer");
                    throw null;
                } else if (!o.f(viewGroup)) {
                    aj();
                }
            }
            int Y = Y();
            EnhancedViewPager enhancedViewPager = this.f;
            if (enhancedViewPager == null) {
                q.b("contentViewPager");
                throw null;
            }
            enhancedViewPager.setCanScroll(false);
            this.M = false;
            this.L = true;
            boolean z2 = X() && q();
            EnhancedViewPager enhancedViewPager2 = this.f;
            if (enhancedViewPager2 == null) {
                q.b("contentViewPager");
                throw null;
            }
            enhancedViewPager2.setCanDispatchToChild(false);
            if (this.I - T <= 0 && !z2) {
                com.alibaba.triver.triver_shop.shop2023.nativeview.g gVar = this.as;
                if (gVar != null) {
                    gVar.b(T);
                }
                this.I = 0;
                this.J = 0;
                EnhancedViewPager enhancedViewPager3 = this.f;
                if (enhancedViewPager3 == null) {
                    q.b("contentViewPager");
                    throw null;
                }
                enhancedViewPager3.setCanDispatchToChild(true);
            } else {
                this.J += T;
                this.I -= T;
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.aj;
            if (bVar != null) {
                bVar.c(this.I);
            }
            float abs = Math.abs(this.I) / this.G;
            float f2 = 1 - abs;
            if (this.J >= 0) {
                FrameLayout frameLayout = this.n;
                if (frameLayout == null) {
                    q.b("shopRelationContainer");
                    throw null;
                }
                frameLayout.setAlpha(1.0f);
            } else {
                FrameLayout frameLayout2 = this.n;
                if (frameLayout2 == null) {
                    q.b("shopRelationContainer");
                    throw null;
                }
                frameLayout2.setAlpha(f2);
            }
            View aq = aq();
            if (aq != null) {
                aq.setAlpha(f2);
            }
            if (q()) {
                com.alibaba.triver.triver_shop.shop2023.data.c cVar = this.T;
                q.a(cVar);
                int a2 = cVar.a();
                ViewGroup viewGroup2 = this.l;
                if (viewGroup2 == null) {
                    q.b("bigCardContainer");
                    throw null;
                } else if (viewGroup2.getHeight() + Math.abs(this.J) < a2) {
                    ViewGroup viewGroup3 = this.l;
                    if (viewGroup3 == null) {
                        q.b("bigCardContainer");
                        throw null;
                    }
                    o.a(viewGroup3, a2);
                } else if (this.I <= 0) {
                    ViewGroup viewGroup4 = this.l;
                    if (viewGroup4 == null) {
                        q.b("bigCardContainer");
                        throw null;
                    }
                    o.a(viewGroup4, Math.min(d().getHeight(), a2 + Math.abs(this.J)));
                }
            }
            if (this.J >= 0) {
                FrameLayout frameLayout3 = this.n;
                if (frameLayout3 == null) {
                    q.b("shopRelationContainer");
                    throw null;
                }
                o.c(frameLayout3, this.D.f() + this.J);
            } else {
                FrameLayout frameLayout4 = this.n;
                if (frameLayout4 == null) {
                    q.b("shopRelationContainer");
                    throw null;
                }
                o.c(frameLayout4, this.D.f() - ((int) (this.K * abs)));
            }
            FrameLayout frameLayout5 = this.k;
            if (frameLayout5 == null) {
                q.b("navViewContainer");
                throw null;
            }
            o.c(frameLayout5, Y + this.J);
            if (!q() || this.J < this.H || this.v) {
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
        EnhancedViewPager enhancedViewPager = this.f;
        Boolean bool = null;
        if (enhancedViewPager == null) {
            q.b("contentViewPager");
            throw null;
        }
        enhancedViewPager.setCanDispatchToChild(true);
        EnhancedViewPager enhancedViewPager2 = this.f;
        if (enhancedViewPager2 == null) {
            q.b("contentViewPager");
            throw null;
        }
        enhancedViewPager2.setCanScroll(!ar() && !this.ar);
        com.alibaba.triver.triver_shop.shop2023.nativeview.g gVar = this.as;
        if (gVar != null && gVar.b()) {
            return;
        }
        an();
        if (q() && this.J >= this.H && X()) {
            if (b().bc().b()) {
                r(true);
                return;
            }
            EmbedShopLoftComponent embedShopLoftComponent = this.U;
            if (embedShopLoftComponent != null) {
                embedShopLoftComponent.e();
            }
        }
        if (n() || this.R || p()) {
            return;
        }
        boolean z = this.L;
        ShopOptSwipeLayout shopOptSwipeLayout = this.g;
        if (shopOptSwipeLayout == null) {
            q.b("outerSwiperLayout");
            throw null;
        }
        shopOptSwipeLayout.forceInterceptAllTouchEvent(false);
        this.L = false;
        this.O = 0;
        if (!z) {
            return;
        }
        ceg.a aVar = ceg.Companion;
        aVar.b("upDistance : " + this.I + ", downDistance : " + this.J);
        if (q()) {
            ViewGroup viewGroup = this.l;
            if (viewGroup == null) {
                q.b("bigCardContainer");
                throw null;
            }
            com.alibaba.triver.triver_shop.shop2023.data.c cVar = this.T;
            q.a(cVar);
            o.a(viewGroup, cVar.a());
        }
        int i2 = this.I;
        if (i2 == 0) {
            l(true);
            al();
            X();
            return;
        }
        int i3 = this.G;
        if (i2 == i3) {
            if (this.ao && o()) {
                com.alibaba.triver.triver_shop.newShop.data.d b2 = b();
                EmbedShopLoftComponent embedShopLoftComponent2 = this.U;
                if (embedShopLoftComponent2 != null) {
                    bool = Boolean.valueOf(embedShopLoftComponent2.m());
                }
                com.alibaba.triver.triver_shop.newShop.ext.h.a(b2, bool);
            }
            if (o()) {
                ac();
            }
            l(false);
            al();
        } else if (i2 / i3 >= 0.3d && this.M) {
            k(-(i3 - i2));
            int i4 = this.G;
            this.I = i4;
            this.J = 0 - i4;
            l(false);
            if (this.ao) {
                com.alibaba.triver.triver_shop.newShop.data.d b3 = b();
                EmbedShopLoftComponent embedShopLoftComponent3 = this.U;
                if (embedShopLoftComponent3 != null) {
                    bool = Boolean.valueOf(embedShopLoftComponent3.m());
                }
                com.alibaba.triver.triver_shop.newShop.ext.h.a(b3, bool);
            }
            ac();
        } else {
            at();
        }
    }

    private final void at() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfe3f3a", new Object[]{this});
            return;
        }
        af();
        this.I = 0;
        this.J = 0;
        X();
        l(true);
    }

    private final void ac() {
        cel fragmentViewProvider;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0eafa9", new Object[]{this});
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
        ShopOptSwipeLayout shopOptSwipeLayout = this.g;
        if (shopOptSwipeLayout != null) {
            jdsVar.a(shopOptSwipeLayout.getYSpeed());
        } else {
            q.b("outerSwiperLayout");
            throw null;
        }
    }

    private final void ah() {
        com.alibaba.triver.triver_shop.shop2023.template.g gVar;
        View f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab55252e", new Object[]{this});
        } else if (this.ai || (gVar = this.ab) == null || (f2 = gVar.f()) == null) {
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.n.a(f2, 0.0f, 200L, (Animator.AnimatorListener) null, 4, (Object) null).start();
            this.ai = true;
        }
    }

    private final void an() {
        com.alibaba.triver.triver_shop.shop2023.template.g gVar;
        View f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba9b234", new Object[]{this});
        } else if (!this.ai || (gVar = this.ab) == null || (f2 = gVar.f()) == null) {
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.n.a(f2, 1.0f, 200L, (Animator.AnimatorListener) null, 4, (Object) null).start();
            this.ai = false;
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d9d5d5", new Object[]{aVar, new Boolean(z), new Integer(i2), obj});
            return;
        }
        if ((i2 & 1) != 0) {
            z = false;
        }
        aVar.r(z);
    }

    private final void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52435fb", new Object[]{this, new Boolean(z)});
            return;
        }
        ceg.Companion.b("start tab3 animation");
        ViewGroup viewGroup = this.i;
        if (viewGroup == null) {
            q.b("bottomBarContainer");
            throw null;
        }
        int height = viewGroup.getHeight() / 2;
        b(true);
        View view = this.j;
        if (view == null) {
            q.b("bottomBarContainerBG");
            throw null;
        }
        o.b(view);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[4];
        FrameLayout frameLayout = this.h;
        if (frameLayout == null) {
            q.b("centerContainer");
            throw null;
        }
        FrameLayout frameLayout2 = frameLayout;
        if (frameLayout == null) {
            q.b("centerContainer");
            throw null;
        }
        Integer valueOf = Integer.valueOf(frameLayout.getWidth() / 2);
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 == null) {
            q.b("bottomBarContainer");
            throw null;
        }
        int top = viewGroup2.getTop();
        FrameLayout frameLayout3 = this.h;
        if (frameLayout3 == null) {
            q.b("centerContainer");
            throw null;
        }
        animatorArr[0] = com.alibaba.triver.triver_shop.newShop.ext.n.a(frameLayout2, valueOf, Integer.valueOf((top - frameLayout3.getTop()) + height));
        FrameLayout frameLayout4 = this.k;
        if (frameLayout4 == null) {
            q.b("navViewContainer");
            throw null;
        }
        FrameLayout frameLayout5 = frameLayout4;
        if (frameLayout4 == null) {
            q.b("navViewContainer");
            throw null;
        }
        Integer valueOf2 = Integer.valueOf(frameLayout4.getWidth() / 2);
        ViewGroup viewGroup3 = this.i;
        if (viewGroup3 == null) {
            q.b("bottomBarContainer");
            throw null;
        }
        int top2 = viewGroup3.getTop();
        FrameLayout frameLayout6 = this.k;
        if (frameLayout6 == null) {
            q.b("navViewContainer");
            throw null;
        }
        animatorArr[1] = com.alibaba.triver.triver_shop.newShop.ext.n.a(frameLayout5, valueOf2, Integer.valueOf((top2 - frameLayout6.getTop()) + height));
        FrameLayout frameLayout7 = this.n;
        if (frameLayout7 == null) {
            q.b("shopRelationContainer");
            throw null;
        }
        FrameLayout frameLayout8 = frameLayout7;
        if (frameLayout7 == null) {
            q.b("shopRelationContainer");
            throw null;
        }
        Integer valueOf3 = Integer.valueOf(frameLayout7.getWidth() / 2);
        ViewGroup viewGroup4 = this.i;
        if (viewGroup4 == null) {
            q.b("bottomBarContainer");
            throw null;
        }
        int top3 = viewGroup4.getTop();
        FrameLayout frameLayout9 = this.n;
        if (frameLayout9 == null) {
            q.b("shopRelationContainer");
            throw null;
        }
        animatorArr[2] = com.alibaba.triver.triver_shop.newShop.ext.n.a(frameLayout8, valueOf3, Integer.valueOf((top3 - frameLayout9.getTop()) + height));
        View view2 = this.j;
        if (view2 != null) {
            animatorArr[3] = com.alibaba.triver.triver_shop.newShop.ext.n.a(view2, 0.0f, 0L, (Animator.AnimatorListener) null, 6, (Object) null);
            animatorSet.playTogether(animatorArr);
            animatorSet.addListener(new i());
            animatorSet.addListener(new C0149a(this));
            animatorSet.start();
            com.alibaba.triver.triver_shop.shop2023.nativeview.a aVar = this.ak;
            if (aVar != null) {
                aVar.a(2);
            }
            if (!z) {
                return;
            }
            com.alibaba.triver.triver_shop.newShop.ext.h.g(b());
            return;
        }
        q.b("bottomBarContainerBG");
        throw null;
    }

    /* loaded from: classes3.dex */
    public static final class i extends C0149a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
            super(a.this);
        }

        @Override // com.alibaba.triver.triver_shop.shop2023.a.C0149a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            a.a(a.this, false);
            EnhancedViewPager a2 = a.a(a.this);
            if (a2 == null) {
                q.b("contentViewPager");
                throw null;
            }
            a2.setCanDispatchToChild(true);
            a.g(a.this);
            if (a.r(a.this)) {
                ViewGroup s = a.s(a.this);
                if (s == null) {
                    q.b("bigCardContainer");
                    throw null;
                }
                com.alibaba.triver.triver_shop.shop2023.data.c t = a.t(a.this);
                q.a(t);
                o.a(s, t.a());
            }
            View u = a.u(a.this);
            if (u == null) {
                q.b("bottomBarContainerBG");
                throw null;
            }
            o.d(u);
            View u2 = a.u(a.this);
            if (u2 != null) {
                u2.setAlpha(1.0f);
            } else {
                q.b("bottomBarContainerBG");
                throw null;
            }
        }

        @Override // com.alibaba.triver.triver_shop.shop2023.a.C0149a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            a.a(a.this, true);
            ViewGroup s = a.s(a.this);
            if (s != null) {
                o.a(s, a.v(a.this).getHeight());
            } else {
                q.b("bigCardContainer");
                throw null;
            }
        }
    }

    private final void ad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1cc72a", new Object[]{this});
        } else if (!q()) {
        } else {
            b(true);
            ViewGroup viewGroup = this.i;
            if (viewGroup == null) {
                q.b("bottomBarContainer");
                throw null;
            }
            int height = viewGroup.getHeight() / 2;
            ViewGroup viewGroup2 = this.l;
            if (viewGroup2 == null) {
                q.b("bigCardContainer");
                throw null;
            }
            o.a(viewGroup2, d().getHeight());
            FrameLayout frameLayout = this.k;
            if (frameLayout == null) {
                q.b("navViewContainer");
                throw null;
            }
            o.c(frameLayout, this.y.f());
            FrameLayout frameLayout2 = this.n;
            if (frameLayout2 == null) {
                q.b("shopRelationContainer");
                throw null;
            }
            o.c(frameLayout2, this.D.f());
            FrameLayout frameLayout3 = this.h;
            if (frameLayout3 == null) {
                q.b("centerContainer");
                throw null;
            }
            int width = frameLayout3.getWidth() / 2;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new C0149a(this));
            Animator[] animatorArr = new Animator[3];
            FrameLayout frameLayout4 = this.h;
            if (frameLayout4 == null) {
                q.b("centerContainer");
                throw null;
            }
            int width2 = frameLayout4.getWidth() / 2;
            ViewGroup viewGroup3 = this.i;
            if (viewGroup3 == null) {
                q.b("bottomBarContainer");
                throw null;
            }
            int top = viewGroup3.getTop() - this.y.f();
            FrameLayout frameLayout5 = this.k;
            if (frameLayout5 == null) {
                q.b("navViewContainer");
                throw null;
            }
            int height2 = (top - frameLayout5.getHeight()) + height;
            FrameLayout frameLayout6 = this.h;
            if (frameLayout6 == null) {
                q.b("centerContainer");
                throw null;
            }
            animatorArr[0] = com.alibaba.triver.triver_shop.newShop.ext.n.a(frameLayout6, Integer.valueOf(width2), Integer.valueOf(height2), Integer.valueOf(width));
            FrameLayout frameLayout7 = this.k;
            if (frameLayout7 == null) {
                q.b("navViewContainer");
                throw null;
            }
            int width3 = frameLayout7.getWidth() / 2;
            ViewGroup viewGroup4 = this.i;
            if (viewGroup4 == null) {
                q.b("bottomBarContainer");
                throw null;
            }
            int top2 = (viewGroup4.getTop() - this.y.f()) + height;
            FrameLayout frameLayout8 = this.k;
            if (frameLayout8 == null) {
                q.b("navViewContainer");
                throw null;
            }
            animatorArr[1] = com.alibaba.triver.triver_shop.newShop.ext.n.a(frameLayout8, Integer.valueOf(width3), Integer.valueOf(top2), Integer.valueOf(width));
            FrameLayout frameLayout9 = this.n;
            if (frameLayout9 == null) {
                q.b("shopRelationContainer");
                throw null;
            }
            int width4 = frameLayout9.getWidth() / 2;
            ViewGroup viewGroup5 = this.i;
            if (viewGroup5 == null) {
                q.b("bottomBarContainer");
                throw null;
            }
            int top3 = (viewGroup5.getTop() - this.D.f()) + height;
            FrameLayout frameLayout10 = this.n;
            if (frameLayout10 == null) {
                q.b("shopRelationContainer");
                throw null;
            }
            animatorArr[2] = com.alibaba.triver.triver_shop.newShop.ext.n.a(frameLayout10, Integer.valueOf(width4), Integer.valueOf(top3), Integer.valueOf(width));
            animatorSet.playTogether(animatorArr);
            animatorSet.addListener(new h());
            animatorSet.setDuration(400L);
            animatorSet.start();
        }
    }

    private final void ae() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2adeab", new Object[]{this});
            return;
        }
        Pair<Integer, Integer> c2 = b().c("live");
        if (c2 != null) {
            this.u = true;
            a(c2.getFirst().intValue(), c2.getSecond().intValue(), "live");
            return;
        }
        ceg.Companion.b("do not find live tab");
    }

    private final void af() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab38f62c", new Object[]{this});
            return;
        }
        int i2 = this.I;
        float Y = Y();
        if (this.k == null) {
            q.b("navViewContainer");
            throw null;
        }
        float h2 = Y - o.h(frameLayout);
        float f2 = this.D.f();
        if (this.n == null) {
            q.b("shopRelationContainer");
            throw null;
        }
        float h3 = f2 - o.h(frameLayout2);
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.aj;
        if (bVar != null) {
            bVar.a(this.I, (int) h2);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        FrameLayout frameLayout3 = this.k;
        if (frameLayout3 != null) {
            Animator a2 = com.alibaba.triver.triver_shop.newShop.ext.n.a(frameLayout3, h2, 0L, null, new LinearInterpolator(), 6, null);
            if (a2 instanceof ValueAnimator) {
                ((ValueAnimator) a2).addUpdateListener(new g(i2, this));
            }
            t tVar = t.INSTANCE;
            animatorArr[0] = a2;
            FrameLayout frameLayout4 = this.n;
            if (frameLayout4 != null) {
                Animator a3 = com.alibaba.triver.triver_shop.newShop.ext.n.a(frameLayout4, h3, 0L, null, new LinearInterpolator(), 6, null);
                a3.addListener(new l());
                t tVar2 = t.INSTANCE;
                animatorArr[1] = a3;
                animatorSet.playTogether(animatorArr);
                animatorSet.setInterpolator(new LinearInterpolator());
                animatorSet.addListener(new C0149a(this));
                animatorSet.start();
                return;
            }
            q.b("shopRelationContainer");
            throw null;
        }
        q.b("navViewContainer");
        throw null;
    }

    private final void k(int i2) {
        int m;
        int h2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93209d1", new Object[]{this, new Integer(i2)});
            return;
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.aj;
        if (bVar != null) {
            bVar.a(this.I, i2);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float f2 = i2;
        FrameLayout frameLayout = this.k;
        if (frameLayout == null) {
            q.b("navViewContainer");
            throw null;
        }
        animatorArr[0] = com.alibaba.triver.triver_shop.newShop.ext.n.a(frameLayout, f2, 0L, null, linearInterpolator, 6, null);
        LinearInterpolator linearInterpolator2 = new LinearInterpolator();
        if (i2 > 0) {
            m = this.D.f();
            FrameLayout frameLayout2 = this.n;
            if (frameLayout2 == null) {
                q.b("shopRelationContainer");
                throw null;
            }
            h2 = o.h(frameLayout2);
        } else {
            m = m() + this.x.e();
            FrameLayout frameLayout3 = this.n;
            if (frameLayout3 == null) {
                q.b("shopRelationContainer");
                throw null;
            }
            h2 = o.h(frameLayout3);
        }
        float f3 = m - h2;
        FrameLayout frameLayout4 = this.n;
        if (frameLayout4 == null) {
            q.b("shopRelationContainer");
            throw null;
        }
        Animator a2 = com.alibaba.triver.triver_shop.newShop.ext.n.a(frameLayout4, f3, 0L, null, linearInterpolator2, 6, null);
        a2.addListener(new f());
        t tVar = t.INSTANCE;
        animatorArr[1] = a2;
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new C0149a(this));
        animatorSet.start();
    }

    private final void a(boolean z, int i2, int i3) {
        FrameLayout frameLayout;
        View f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270908cc", new Object[]{this, new Boolean(z), new Integer(i2), new Integer(i3)});
            return;
        }
        ceg.Companion.b(q.a("changeToHomePage : lastTabFullScreen : ", (Object) Boolean.valueOf(z)));
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.V;
        if (shop2023HeaderInfoTemplate != null && (f2 = shop2023HeaderInfoTemplate.f()) != null) {
            o.b(f2);
        }
        this.G = Z();
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.aj;
        if (bVar != null) {
            bVar.a(this.G);
        }
        FrameLayout frameLayout2 = this.n;
        if (frameLayout2 == null) {
            q.b("shopRelationContainer");
            throw null;
        }
        o.b(frameLayout2);
        if (this.Q) {
            l(true);
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar2 = this.aj;
            if (bVar2 != null) {
                bVar2.c(true);
            }
            this.Q = false;
            this.I = 0;
            this.J = 0;
            com.alibaba.triver.triver_shop.shop2023.data.d dVar = this.y;
            dVar.c(dVar.d());
            FrameLayout frameLayout3 = this.n;
            if (frameLayout3 == null) {
                q.b("shopRelationContainer");
                throw null;
            }
            frameLayout3.setAlpha(1.0f);
            View aq = aq();
            if (aq != null) {
                aq.setAlpha(1.0f);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArr = new Animator[2];
            FrameLayout frameLayout4 = this.k;
            if (frameLayout4 == null) {
                q.b("navViewContainer");
                throw null;
            }
            float f3 = this.y.f();
            if (this.k != null) {
                animatorArr[0] = com.alibaba.triver.triver_shop.newShop.ext.n.a(frameLayout4, f3 - o.h(frameLayout), 0L, null, null, 14, null);
                FrameLayout frameLayout5 = this.n;
                if (frameLayout5 != null) {
                    animatorArr[1] = com.alibaba.triver.triver_shop.newShop.ext.n.a(frameLayout5, 1.0f, 0L, (Animator.AnimatorListener) null, 6, (Object) null);
                    animatorSet.playTogether(animatorArr);
                    animatorSet.addListener(new e());
                    animatorSet.start();
                    if (q()) {
                        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate2 = this.V;
                        if (shop2023HeaderInfoTemplate2 != null) {
                            shop2023HeaderInfoTemplate2.a(Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED);
                        }
                    } else {
                        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate3 = this.V;
                        if (shop2023HeaderInfoTemplate3 != null) {
                            shop2023HeaderInfoTemplate3.a(Shop2023HeaderInfoTemplate.HeaderStyle.DEFAULT);
                        }
                    }
                } else {
                    q.b("shopRelationContainer");
                    throw null;
                }
            } else {
                q.b("navViewContainer");
                throw null;
            }
        } else {
            l(false);
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar3 = this.aj;
            if (bVar3 != null) {
                bVar3.c(false);
            }
            this.I = this.G;
            this.J = 0 - this.I;
            FrameLayout frameLayout6 = this.k;
            if (frameLayout6 == null) {
                q.b("navViewContainer");
                throw null;
            }
            o.c(frameLayout6, this.x.j() + m());
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate4 = this.V;
            if (shop2023HeaderInfoTemplate4 != null) {
                shop2023HeaderInfoTemplate4.a(Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED);
            }
            if (q() && com.alibaba.triver.triver_shop.newShop.ext.i.c(b().d(i2, i3))) {
                com.alibaba.triver.triver_shop.newShop.ext.h.a(b(), (Boolean) null, 2, (Object) null);
            }
        }
        if (z) {
            FrameLayout frameLayout7 = this.m;
            if (frameLayout7 == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            frameLayout7.setZ(0.0f);
            FrameLayout frameLayout8 = this.k;
            if (frameLayout8 == null) {
                q.b("navViewContainer");
                throw null;
            }
            frameLayout8.setZ(0.1f);
        }
        View aq2 = aq();
        if (aq2 != null) {
            o.b(aq2);
        }
        this.R = false;
        if (!q()) {
            return;
        }
        View aq3 = aq();
        if (aq3 != null) {
            o.d(aq3);
        }
        if (!o()) {
            return;
        }
        aj();
    }

    private final void b(boolean z, boolean z2, int i2, int i3) {
        com.alibaba.triver.triver_shop.shop2023.nativeview.c d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4c8249", new Object[]{this, new Boolean(z), new Boolean(z2), new Integer(i2), new Integer(i3)});
            return;
        }
        ceg.a aVar = ceg.Companion;
        aVar.b("changeToOtherPage : lastTabFullScreen : " + z + " , targetTabFullScreen : " + z2);
        int i4 = this.G;
        this.G = Z();
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.aj;
        if (bVar != null) {
            bVar.a(this.G);
        }
        if (z2) {
            FrameLayout frameLayout = this.k;
            if (frameLayout == null) {
                q.b("navViewContainer");
                throw null;
            }
            frameLayout.setZ(0.0f);
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar2 = this.aj;
            if (bVar2 != null) {
                bVar2.g();
            }
            FrameLayout frameLayout2 = this.k;
            if (frameLayout2 == null) {
                q.b("navViewContainer");
                throw null;
            } else {
                o.c(frameLayout2, this.y.h());
                l(false);
            }
        } else {
            FrameLayout frameLayout3 = this.k;
            if (frameLayout3 == null) {
                q.b("navViewContainer");
                throw null;
            }
            frameLayout3.setZ(0.1f);
            int Z = Z();
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar3 = this.aj;
            if (bVar3 != null) {
                bVar3.a(Z);
            }
            int g2 = this.y.g() - Z;
            if (!o()) {
                com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar4 = this.aj;
                if (bVar4 != null) {
                    bVar4.g();
                }
                FrameLayout frameLayout4 = this.k;
                if (frameLayout4 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                o.c(frameLayout4, g2);
                FrameLayout frameLayout5 = this.n;
                if (frameLayout5 == null) {
                    q.b("shopRelationContainer");
                    throw null;
                }
                o.d(frameLayout5);
                this.I = Z;
                this.J = 0 - Z;
            } else if (j()) {
                FrameLayout frameLayout6 = this.k;
                if (frameLayout6 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                o.c(frameLayout6, this.y.g());
                com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar5 = this.aj;
                if (bVar5 != null && (d2 = bVar5.d()) != null) {
                    d2.b(true);
                }
                FrameLayout frameLayout7 = this.n;
                if (frameLayout7 == null) {
                    q.b("shopRelationContainer");
                    throw null;
                }
                o.d(frameLayout7);
            } else {
                FrameLayout frameLayout8 = this.k;
                if (frameLayout8 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                int h2 = o.h(frameLayout8) - g2;
                EnhancedViewPager enhancedViewPager = this.f;
                if (enhancedViewPager == null) {
                    q.b("contentViewPager");
                    throw null;
                }
                enhancedViewPager.post(new k(i4, h2, Z));
            }
        }
        if (z2) {
            FrameLayout frameLayout9 = this.m;
            if (frameLayout9 == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            frameLayout9.setZ(1.0f);
            View aq = aq();
            if (aq != null) {
                o.d(aq);
            }
        } else {
            View aq2 = aq();
            if (aq2 != null) {
                o.b(aq2);
            }
        }
        if (z) {
            FrameLayout frameLayout10 = this.m;
            if (frameLayout10 == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            frameLayout10.setZ(0.0f);
            View aq3 = aq();
            if (aq3 != null) {
                o.b(aq3);
            }
        }
        this.R = z2;
        ai();
    }

    private final void ag() {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab470dad", new Object[]{this});
            return;
        }
        int height = d().getHeight();
        if (height == 0) {
            height = com.alibaba.triver.triver_shop.newShop.ext.b.b((Activity) a()).heightPixels;
        }
        if (ar()) {
            FrameLayout frameLayout = this.k;
            if (frameLayout == null) {
                q.b("navViewContainer");
                throw null;
            }
            i2 = frameLayout.getHeight();
        }
        if (this.R) {
            FrameLayout frameLayout2 = this.h;
            if (frameLayout2 != null) {
                o.a(frameLayout2, height);
            } else {
                q.b("centerContainer");
                throw null;
            }
        } else if (X()) {
            FrameLayout frameLayout3 = this.h;
            if (frameLayout3 != null) {
                o.a(frameLayout3, ((height - this.x.j()) - m()) + this.y.e() + i2);
            } else {
                q.b("centerContainer");
                throw null;
            }
        } else {
            FrameLayout frameLayout4 = this.h;
            if (frameLayout4 != null) {
                o.a(frameLayout4, (((height - this.x.j()) - this.y.e()) - m()) + this.y.e() + i2);
            } else {
                q.b("centerContainer");
                throw null;
            }
        }
    }

    private final void a(boolean z, boolean z2, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb081348", new Object[]{this, new Boolean(z), new Boolean(z2), new Integer(i2), new Integer(i3)});
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
            FrameLayout frameLayout2 = this.m;
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
            o.c(frameLayout3, this.y.h());
            View aq = aq();
            if (aq != null) {
                o.d(aq);
            }
            l(false);
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.aj;
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
            FrameLayout frameLayout5 = this.m;
            if (frameLayout5 == null) {
                q.b("shopHeaderContainer");
                throw null;
            }
            frameLayout5.setZ(0.0f);
            int Z = Z();
            int g2 = this.y.g() - Z;
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar2 = this.aj;
            if (bVar2 != null) {
                bVar2.a(Z);
            }
            View aq2 = aq();
            if (aq2 != null) {
                o.b(aq2);
            }
            if (!o()) {
                FrameLayout frameLayout6 = this.k;
                if (frameLayout6 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                o.c(frameLayout6, g2);
                this.I = Z;
                this.J = 0 - Z;
                com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar3 = this.aj;
                if (bVar3 != null) {
                    bVar3.b(o());
                }
            } else {
                FrameLayout frameLayout7 = this.k;
                if (frameLayout7 == null) {
                    q.b("navViewContainer");
                    throw null;
                }
                int h2 = o.h(frameLayout7) - g2;
                EnhancedViewPager enhancedViewPager = this.f;
                if (enhancedViewPager == null) {
                    q.b("contentViewPager");
                    throw null;
                }
                enhancedViewPager.post(new j(h2, this, Z));
            }
        }
        if (com.alibaba.triver.triver_shop.newShop.ext.i.c(b().d(i2, i3))) {
            com.alibaba.triver.triver_shop.newShop.ext.h.a(b(), (Boolean) null, 2, (Object) null);
        }
        this.R = z2;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void a(int i2, int i3, String targetTabName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i2), new Integer(i3), targetTabName});
            return;
        }
        q.d(targetTabName, "targetTabName");
        int f2 = b().f(i2, i3);
        EnhancedViewPager enhancedViewPager = this.f;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCurrentItem(f2, false);
        } else {
            q.b("contentViewPager");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a, android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i2)});
            return;
        }
        super.onPageSelected(i2);
        int l2 = l();
        if (i2 != l2) {
            cej cejVar = this.o;
            if (cejVar == null) {
                q.b("shopContainerPageAdapter");
                throw null;
            }
            cejVar.b(l2);
        }
        cej cejVar2 = this.o;
        if (cejVar2 == null) {
            q.b("shopContainerPageAdapter");
            throw null;
        }
        cejVar2.a(i2);
        int j2 = b().j(l());
        e(i2);
        int j3 = b().j(l());
        int k2 = k();
        int i3 = b().i(l());
        int j4 = b().j(i2);
        b().a(j4, i3);
        ceg.a aVar = ceg.Companion;
        aVar.b("flag ship , on page selected , newTab = " + i3 + ", newSub = " + j4 + " , oldTab = " + k2 + ", position : " + i2);
        d(i3);
        if (k() != 0) {
            this.t = true;
        }
        rvb<Integer, Integer, Integer, Integer, t> f2 = f();
        if (f2 != null) {
            f2.invoke(Integer.valueOf(i3), Integer.valueOf(j4), Integer.valueOf(k2), Integer.valueOf(j2));
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar = this.al;
        if (cVar != null) {
            cVar.a(i3, j3);
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.a aVar2 = this.ak;
        if (aVar2 != null) {
            aVar2.a(i3, j3);
        }
        boolean c2 = com.alibaba.triver.triver_shop.newShop.ext.i.c(b().d(k2, j2));
        boolean c3 = com.alibaba.triver.triver_shop.newShop.ext.i.c(b().d(i3, j3));
        if (k2 == 0 && i3 != 0) {
            b(c2, c3, k2, j2);
        }
        if (k2 != 0 && i3 == 0) {
            a(c2, k2, j2);
        }
        if (k2 != 0 && i3 != 0) {
            a(c2, c3, k2, j2);
        }
        ag();
        L();
        a(false);
        if (!c3 && (!q() || !o() || i3 != 0)) {
            z = false;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.V;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.d(z);
        }
        if (c2) {
            o(false);
            m(false);
            this.u = false;
        }
        if (!c2 || i3 != 0 || !b().G().b()) {
            return;
        }
        ad();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a, android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i2)});
        } else {
            super.onPageScrollStateChanged(i2);
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
        if (!X()) {
            if (z && !this.R) {
                Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate = this.am;
                if (shop2023HeaderTagListTemplate == null) {
                    return;
                }
                shop2023HeaderTagListTemplate.s();
                return;
            }
            Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate2 = this.am;
            if (shop2023HeaderTagListTemplate2 == null) {
                return;
            }
            shop2023HeaderTagListTemplate2.r();
        } else if (z) {
            if (q()) {
                aj();
                Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.V;
                if (shop2023HeaderInfoTemplate != null) {
                    shop2023HeaderInfoTemplate.a(Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED);
                }
                Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate3 = this.am;
                if (shop2023HeaderTagListTemplate3 == null) {
                    return;
                }
                shop2023HeaderTagListTemplate3.r();
                return;
            }
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate2 = this.V;
            if (shop2023HeaderInfoTemplate2 != null) {
                shop2023HeaderInfoTemplate2.a(Shop2023HeaderInfoTemplate.HeaderStyle.DEFAULT);
            }
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate3 = this.V;
            if (shop2023HeaderInfoTemplate3 != null) {
                shop2023HeaderInfoTemplate3.d(false);
            }
            Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate4 = this.am;
            if (shop2023HeaderTagListTemplate4 == null) {
                return;
            }
            shop2023HeaderTagListTemplate4.s();
        } else {
            ai();
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate4 = this.V;
            if (shop2023HeaderInfoTemplate4 != null) {
                shop2023HeaderInfoTemplate4.a(Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED);
            }
            Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate5 = this.am;
            if (shop2023HeaderTagListTemplate5 == null) {
                return;
            }
            shop2023HeaderTagListTemplate5.r();
        }
    }

    private final void ai() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab633caf", new Object[]{this});
        } else if (!q()) {
        } else {
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.V;
            if (shop2023HeaderInfoTemplate != null) {
                shop2023HeaderInfoTemplate.d(false);
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.aj;
            if (bVar != null) {
                bVar.e(false);
            }
            ViewGroup viewGroup = this.l;
            if (viewGroup == null) {
                q.b("bigCardContainer");
                throw null;
            }
            o.d(viewGroup);
            EmbedShopLoftComponent embedShopLoftComponent = this.U;
            if (embedShopLoftComponent == null) {
                return;
            }
            embedShopLoftComponent.j();
        }
    }

    private final void aj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab715430", new Object[]{this});
        } else if (!q()) {
        } else {
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.V;
            if (shop2023HeaderInfoTemplate != null) {
                shop2023HeaderInfoTemplate.d(true);
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.aj;
            if (bVar != null) {
                bVar.e(true);
            }
            ViewGroup viewGroup = this.l;
            if (viewGroup == null) {
                q.b("bigCardContainer");
                throw null;
            }
            o.b(viewGroup);
            EmbedShopLoftComponent embedShopLoftComponent = this.U;
            if (embedShopLoftComponent == null) {
                return;
            }
            embedShopLoftComponent.k();
        }
    }

    private final void ak() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7f6bb1", new Object[]{this});
        } else {
            a(this, false, 1, (Object) null);
        }
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.b
    public int S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4a7234d", new Object[]{this})).intValue() : d().getHeight();
    }

    /* renamed from: com.alibaba.triver.triver_shop.shop2023.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0149a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f4042a;

        static {
            kge.a(-1369258501);
        }

        public C0149a(a this$0) {
            q.d(this$0, "this$0");
            this.f4042a = this$0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            a.a(this.f4042a, true);
            ShopOptSwipeLayout G = a.G(this.f4042a);
            if (G != null) {
                G.forceInterceptAllTouchEvent(true);
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
            a.e(this.f4042a);
            a.a(this.f4042a, false);
            this.f4042a.y();
            ShopOptSwipeLayout G = a.G(this.f4042a);
            if (G == null) {
                q.b("outerSwiperLayout");
                throw null;
            }
            G.forceInterceptAllTouchEvent(false);
            EnhancedViewPager a2 = a.a(this.f4042a);
            if (a2 == null) {
                q.b("contentViewPager");
                throw null;
            }
            a2.setCanDispatchToChild(true);
            EnhancedViewPager a3 = a.a(this.f4042a);
            if (a3 != null) {
                a3.setCanScroll(true);
            } else {
                q.b("contentViewPager");
                throw null;
            }
        }
    }

    private final void al() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8d8332", new Object[]{this});
            return;
        }
        Runnable runnable = this.af;
        if (runnable != null) {
            runnable.run();
        }
        this.af = null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.V;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.a(z, jSONObject);
        }
        com.alibaba.triver.triver_shop.shop2023.template.e eVar = this.ac;
        if (eVar != null) {
            eVar.c(jSONObject);
        }
        rul<Boolean, t> d2 = b().bb().d();
        if (d2 == null) {
            return;
        }
        d2.mo2421invoke(Boolean.valueOf(z));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void m(boolean z) {
        com.alibaba.triver.triver_shop.shop2023.nativeview.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bfae0", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.V;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.a(z);
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.aj;
        if (bVar != null) {
            bVar.e(z);
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar2 = this.aj;
        if (bVar2 != null) {
            bVar2.a(z);
        }
        if (z && (aVar = this.ak) != null) {
            aVar.f();
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.i iVar = this.aq;
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
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.V;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.b(z);
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.aj;
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
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.V;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.c(z);
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar = this.aj;
        if (bVar != null) {
            bVar.d(z);
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.a aVar = this.ak;
        if (aVar != null) {
            aVar.a(z);
        }
        EnhancedViewPager enhancedViewPager = this.f;
        if (enhancedViewPager == null) {
            q.b("contentViewPager");
            throw null;
        }
        enhancedViewPager.setCanScroll(!z);
        this.ar = z;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ba84bd", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.V;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.a(z, com.alibaba.triver.triver_shop.newShop.ext.h.b(b(), z));
        }
        com.alibaba.triver.triver_shop.shop2023.template.e eVar = this.ac;
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
            return;
        }
        if (X()) {
            if (q() && o()) {
                N();
                return;
            }
        } else if (q.a((Object) b().K(), (Object) "live")) {
            N();
            return;
        }
        M();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : am();
    }

    private final boolean am() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab9b9ab7", new Object[]{this})).booleanValue();
        }
        if (!this.u || !com.alibaba.triver.triver_shop.newShop.ext.i.c(b().K())) {
            return true;
        }
        ceg.Companion.b("goBack to shopIndex");
        this.u = false;
        a(0, 0, b().d(0, 0));
        return false;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
            return;
        }
        super.R();
        ShopWrapWebView shopWrapWebView = this.ag;
        if (shopWrapWebView != null) {
            o.j(shopWrapWebView);
        }
        ShopWrapWebView shopWrapWebView2 = this.ag;
        if (shopWrapWebView2 == null) {
            return;
        }
        shopWrapWebView2.destroyWebView();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[]{this});
            return;
        }
        ae();
        m.a(b(), "Page_Shop_Live_FloatWindow_Click", null, null, 8, null);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void b(String str, JSONObject jSONObject) {
        com.alibaba.triver.triver_shop.shop2023.nativeview.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
            return;
        }
        super.b(str, jSONObject);
        if (!q.a((Object) str, (Object) "tb_shop_bottom_bar_2023") || (aVar = this.ak) == null) {
            return;
        }
        aVar.a(jSONObject);
    }

    private final void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d90e9a", new Object[]{this, new Boolean(z)});
            return;
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.g gVar = this.as;
        if (gVar == null) {
            return;
        }
        gVar.a(z);
    }

    private final void ao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb7c9b5", new Object[]{this});
        } else if (this.X) {
        } else {
            if (this.W) {
                this.ah = null;
                return;
            }
            this.W = true;
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new Default2023Shop$onContentPageStartScroll$1(this));
        }
    }

    private final void ap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc5e136", new Object[]{this});
            return;
        }
        Default2023Shop$onContentPageStopScroll$restoreBottomBarAction$1 default2023Shop$onContentPageStopScroll$restoreBottomBarAction$1 = new Default2023Shop$onContentPageStopScroll$restoreBottomBarAction$1(this);
        if (this.W) {
            this.ah = default2023Shop$onContentPageStopScroll$restoreBottomBarAction$1;
        } else if (!this.X) {
        } else {
            default2023Shop$onContentPageStopScroll$restoreBottomBarAction$1.mo2427invoke();
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
        o.a(d(), new Default2023Shop$onConfigChanged$1(this));
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
        ShopOptSwipeLayout shopOptSwipeLayout = this.g;
        if (shopOptSwipeLayout == null) {
            q.b("outerSwiperLayout");
            throw null;
        } else if (shopOptSwipeLayout.getAlreadyTouch()) {
        } else {
            at();
        }
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

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public com.alibaba.triver.triver_shop.newShop.view.component.f aD() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.view.component.f) ipChange.ipc$dispatch("ac9b8210", new Object[]{this}) : new com.alibaba.triver.triver_shop.newShop.view.component.f(0, com.alibaba.triver.triver_shop.shop2023.nativeview.a.bottomBarHeightWithBottomMarginRpxValue);
    }
}
