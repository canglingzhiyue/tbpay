package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

/* loaded from: classes3.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final b f4121a;
    private final View[] b;
    private View c;
    private TUrlImageView d;
    private TUrlImageView e;
    private boolean f;
    private int g;
    private int h;
    private ValueAnimator i;

    /* loaded from: classes3.dex */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            g gVar = g.this;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            g.a(gVar, ((Integer) animatedValue).intValue());
            g gVar2 = g.this;
            g.b(gVar2, g.c(gVar2));
        }
    }

    static {
        kge.a(-1219844597);
    }

    public g(b bVar, View[] viewsToMove) {
        q.d(viewsToMove, "viewsToMove");
        this.f4121a = bVar;
        this.b = viewsToMove;
        this.f = true;
        this.g = o.d((Number) 1000);
    }

    public static final /* synthetic */ void a(g gVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d24d8852", new Object[]{gVar, new Integer(i)});
        } else {
            gVar.c(i);
        }
    }

    public static final /* synthetic */ void b(g gVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d85153b1", new Object[]{gVar, new Integer(i)});
        } else {
            gVar.d(i);
        }
    }

    public static final /* synthetic */ int c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("938f1e46", new Object[]{gVar})).intValue() : gVar.h;
    }

    public final b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("b8abeb7c", new Object[]{this}) : this.f4121a;
    }

    public final void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        this.c = view;
        View view2 = this.c;
        if (view2 != null) {
            view2.setPivotX(o.d((Number) 750) / 2.0f);
        }
        View view3 = this.c;
        if (view3 == null) {
            return;
        }
        view3.setPivotY(0.0f);
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    private final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.g;
        if (i > i2) {
            this.h = i2;
        } else {
            this.h = i;
        }
        if (i < 0) {
            return;
        }
        float a2 = 1 + com.alibaba.triver.triver_shop.newShop.ext.b.a(Float.valueOf(i * 1.4f), Integer.valueOf(this.g));
        View view = this.c;
        if (view != null) {
            view.setScaleX(a2);
        }
        View view2 = this.c;
        if (view2 == null) {
            return;
        }
        view2.setScaleY(a2);
    }

    public final void a(FrameLayout container) {
        TUrlImageView b;
        TUrlImageView l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363e3eb", new Object[]{this, container});
            return;
        }
        q.d(container, "container");
        FrameLayout frameLayout = container;
        TUrlImageView tUrlImageView = new TUrlImageView(frameLayout.getContext());
        TUrlImageView tUrlImageView2 = tUrlImageView;
        ViewGroup.LayoutParams layoutParams = tUrlImageView2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView2.setLayoutParams(layoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar = t.INSTANCE;
            tUrlImageView2.setLayoutParams(marginLayoutParams);
        }
        this.e = tUrlImageView;
        tUrlImageView.setContentDescription("返回");
        ViewGroup.LayoutParams layoutParams2 = tUrlImageView2.getLayoutParams();
        String str = null;
        FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            layoutParams3.width = o.d((Number) 54);
            layoutParams3.height = o.d((Number) 54);
            layoutParams3.topMargin = o.d((Number) 12);
            layoutParams3.leftMargin = o.d((Number) 12);
        } else {
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams4.width = o.d((Number) 54);
            layoutParams4.height = o.d((Number) 54);
            layoutParams4.topMargin = o.d((Number) 12);
            layoutParams4.leftMargin = o.d((Number) 12);
            t tVar2 = t.INSTANCE;
            tUrlImageView2.setLayoutParams(layoutParams4);
        }
        b a2 = a();
        tUrlImageView.setImageUrl((a2 == null || (b = a2.b()) == null) ? null : b.getImageUrl());
        tUrlImageView.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023PullDownHelper$attachTo$1$1$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TUrlImageView b2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                b a3 = g.this.a();
                if (a3 == null || (b2 = a3.b()) == null) {
                    return;
                }
                b2.performClick();
            }
        });
        frameLayout.addView(tUrlImageView2);
        TUrlImageView tUrlImageView3 = new TUrlImageView(frameLayout.getContext());
        TUrlImageView tUrlImageView4 = tUrlImageView3;
        ViewGroup.LayoutParams layoutParams5 = tUrlImageView4.getLayoutParams();
        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView4.setLayoutParams(layoutParams5);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar3 = t.INSTANCE;
            tUrlImageView4.setLayoutParams(marginLayoutParams2);
        }
        this.d = tUrlImageView3;
        tUrlImageView3.setContentDescription("更多");
        ViewGroup.LayoutParams layoutParams6 = tUrlImageView4.getLayoutParams();
        FrameLayout.LayoutParams layoutParams7 = layoutParams6 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams6 : null;
        if (layoutParams7 != null) {
            layoutParams7.width = o.d((Number) 54);
            layoutParams7.height = o.d((Number) 54);
            layoutParams7.topMargin = o.d((Number) 12);
            layoutParams7.rightMargin = o.d((Number) 18);
            layoutParams7.gravity = 5;
        } else {
            FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams8.width = o.d((Number) 54);
            layoutParams8.height = o.d((Number) 54);
            layoutParams8.topMargin = o.d((Number) 12);
            layoutParams8.rightMargin = o.d((Number) 18);
            layoutParams8.gravity = 5;
            t tVar4 = t.INSTANCE;
            tUrlImageView4.setLayoutParams(layoutParams8);
        }
        b a3 = a();
        if (a3 != null && (l = a3.l()) != null) {
            str = l.getImageUrl();
        }
        tUrlImageView3.setImageUrl(str);
        tUrlImageView3.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023PullDownHelper$attachTo$1$2$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TUrlImageView l2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                b a4 = g.this.a();
                if (a4 == null || (l2 = a4.l()) == null) {
                    return;
                }
                l2.performClick();
            }
        });
        frameLayout.addView(tUrlImageView4);
        b bVar = this.f4121a;
        if (bVar == null) {
            return;
        }
        bVar.a(new Shop2023PullDownHelper$attachTo$2(this));
    }

    private final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        for (View view : this.b) {
            view.setTranslationY(i);
        }
    }

    public final boolean a(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!this.f || (i2 = this.h) <= 0) {
            return false;
        }
        c(i2 - i);
        if (this.h <= 0) {
            b bVar = this.f4121a;
            TUrlImageView tUrlImageView = null;
            TUrlImageView b = bVar == null ? null : bVar.b();
            if (b != null) {
                b.setAlpha(1.0f);
            }
            b bVar2 = this.f4121a;
            if (bVar2 != null) {
                tUrlImageView = bVar2.l();
            }
            if (tUrlImageView != null) {
                tUrlImageView.setAlpha(1.0f);
            }
            c(0);
        }
        d(this.h);
        return true;
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (!this.f) {
        } else {
            ValueAnimator valueAnimator = this.i;
            TUrlImageView tUrlImageView = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.i = null;
            }
            if (this.h <= 0) {
                c(0);
            }
            b bVar = this.f4121a;
            TUrlImageView b = bVar == null ? null : bVar.b();
            if (b != null) {
                b.setAlpha(0.0f);
            }
            b bVar2 = this.f4121a;
            if (bVar2 != null) {
                tUrlImageView = bVar2.l();
            }
            if (tUrlImageView != null) {
                tUrlImageView.setAlpha(0.0f);
            }
            int i2 = this.h;
            c(i2 + ((int) (i * (1 - (i2 / this.g)))));
            d(this.h);
        }
    }

    public final boolean b() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!this.f || (i = this.h) <= 0) {
            return false;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, 0);
        ofInt.addUpdateListener(new a());
        ofInt.start();
        t tVar = t.INSTANCE;
        this.i = ofInt;
        return true;
    }
}
