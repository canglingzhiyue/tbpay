package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

/* loaded from: classes3.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f4117a;
    private final com.alibaba.triver.triver_shop.shop2023.nativeview.b b;
    private FrameLayout c;
    private TUrlImageView d;
    private TUrlImageView e;
    private int f = -1;
    private com.alibaba.triver.triver_shop.shop2023.nativeview.a g;
    private ValueAnimator h;
    private boolean i;

    /* loaded from: classes3.dex */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public a(boolean z) {
            this.b = z;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            com.alibaba.triver.triver_shop.shop2023.nativeview.c d;
            ViewGroup a2;
            View e;
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
            FrameLayout a3 = f.a(f.this);
            FrameLayout frameLayout = null;
            if (a3 == null) {
                q.b("container");
                throw null;
            }
            a3.setAlpha(floatValue);
            com.alibaba.triver.triver_shop.shop2023.nativeview.b a4 = f.this.a();
            if (a4 != null && (e = a4.e()) != null) {
                boolean z = this.b;
                f fVar = f.this;
                e.setAlpha(1 - floatValue);
                if (z) {
                    fVar.a().b().setAlpha(0.0f);
                    fVar.a().l().setAlpha(0.0f);
                }
                FrameLayout a5 = f.a(fVar);
                if (a5 == null) {
                    q.b("container");
                    throw null;
                }
                e.setTranslationY((-a5.getHeight()) * floatValue);
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.b a6 = f.this.a();
            if (a6 != null && (d = a6.d()) != null && (a2 = d.a()) != null) {
                f fVar2 = f.this;
                a2.setTranslationY((-(a2.getHeight() + o.d((Number) 2))) * Math.min(2 * floatValue, 1.0f));
                fVar2.b().setTranslationY(a2.getTranslationY());
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.a c = f.this.c();
            if (c != null) {
                frameLayout = c.i();
            }
            if (frameLayout == null) {
                return;
            }
            frameLayout.setAlpha(1 - floatValue);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FrameLayout i;
            FrameLayout i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            TUrlImageView tUrlImageView = null;
            if (!f.b(f.this)) {
                FrameLayout a2 = f.a(f.this);
                if (a2 == null) {
                    q.b("container");
                    throw null;
                }
                a2.setZ(0.0f);
                com.alibaba.triver.triver_shop.shop2023.nativeview.b a3 = f.this.a();
                TUrlImageView b = a3 == null ? null : a3.b();
                if (b != null) {
                    b.setAlpha(1.0f);
                }
                com.alibaba.triver.triver_shop.shop2023.nativeview.b a4 = f.this.a();
                if (a4 != null) {
                    tUrlImageView = a4.l();
                }
                if (tUrlImageView != null) {
                    tUrlImageView.setAlpha(1.0f);
                }
            } else {
                FrameLayout a5 = f.a(f.this);
                if (a5 == null) {
                    q.b("container");
                    throw null;
                }
                a5.setZ(2.0f);
            }
            if (f.b(f.this)) {
                com.alibaba.triver.triver_shop.shop2023.nativeview.a c = f.this.c();
                if (c == null || (i2 = c.i()) == null) {
                    return;
                }
                o.d(i2);
                return;
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.a c2 = f.this.c();
            if (c2 == null || (i = c2.i()) == null) {
                return;
            }
            o.b(i);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TUrlImageView b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.b a2 = f.this.a();
            if (a2 == null || (b = a2.b()) == null) {
                return;
            }
            b.performClick();
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TUrlImageView l;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            com.alibaba.triver.triver_shop.shop2023.nativeview.b a2 = f.this.a();
            if (a2 == null || (l = a2.l()) == null) {
                return;
            }
            l.performClick();
        }
    }

    static {
        kge.a(-1316336874);
    }

    public f(com.alibaba.triver.triver_shop.shop2023.nativeview.b bVar) {
        this.b = bVar;
    }

    public static final /* synthetic */ FrameLayout a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("e9004127", new Object[]{fVar}) : fVar.c;
    }

    public static final /* synthetic */ boolean b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("82d8dd37", new Object[]{fVar})).booleanValue() : fVar.i;
    }

    public final com.alibaba.triver.triver_shop.shop2023.nativeview.b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.shop2023.nativeview.b) ipChange.ipc$dispatch("b8abeb7c", new Object[]{this}) : this.b;
    }

    public final void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        q.d(view, "<set-?>");
        this.f4117a = view;
    }

    public final View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        View view = this.f4117a;
        if (view != null) {
            return view;
        }
        q.b("centerContainer");
        throw null;
    }

    public final void a(com.alibaba.triver.triver_shop.shop2023.nativeview.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7220ca97", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }

    public final com.alibaba.triver.triver_shop.shop2023.nativeview.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.shop2023.nativeview.a) ipChange.ipc$dispatch("d286199b", new Object[]{this}) : this.g;
    }

    public final void b(View root) {
        com.alibaba.triver.triver_shop.shop2023.data.e m;
        com.alibaba.triver.triver_shop.shop2023.data.e m2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, root});
            return;
        }
        q.d(root, "root");
        View findViewById = root.findViewById(R.id.shop_2023_other_shop_container);
        q.b(findViewById, "root.findViewById<FrameLayout>(R.id.shop_2023_other_shop_container)");
        this.c = (FrameLayout) findViewById;
        FrameLayout frameLayout = this.c;
        FrameLayout.LayoutParams layoutParams = null;
        if (frameLayout == null) {
            q.b("container");
            throw null;
        }
        frameLayout.setAlpha(0.0f);
        FrameLayout frameLayout2 = frameLayout;
        Context context = frameLayout.getContext();
        q.b(context, "context");
        o.g(frameLayout2, o.a(context));
        Context context2 = frameLayout.getContext();
        q.b(context2, "context");
        int a2 = o.a(context2);
        com.alibaba.triver.triver_shop.shop2023.nativeview.b a3 = a();
        Integer valueOf = (a3 == null || (m = a3.m()) == null) ? null : Integer.valueOf(m.n());
        int d2 = a2 + (valueOf == null ? o.d((Number) 90) : valueOf.intValue());
        com.alibaba.triver.triver_shop.shop2023.nativeview.b a4 = a();
        int i = 66;
        if (a4 != null && (m2 = a4.m()) != null) {
            i = m2.a();
        }
        o.a(frameLayout2, d2 + ((int) (o.d(Integer.valueOf(i)) * 0.18f)));
        frameLayout.setBackgroundColor(-1);
        FrameLayout frameLayout3 = frameLayout;
        TUrlImageView tUrlImageView = new TUrlImageView(frameLayout3.getContext());
        TUrlImageView tUrlImageView2 = tUrlImageView;
        ViewGroup.LayoutParams layoutParams2 = tUrlImageView2.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView2.setLayoutParams(layoutParams2);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar = t.INSTANCE;
            tUrlImageView2.setLayoutParams(marginLayoutParams);
        }
        this.e = tUrlImageView;
        tUrlImageView.setContentDescription("返回");
        ViewGroup.LayoutParams layoutParams3 = tUrlImageView2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            layoutParams4.width = o.d((Number) 54);
            layoutParams4.height = o.d((Number) 54);
            layoutParams4.topMargin = o.d((Number) 12);
            layoutParams4.leftMargin = o.d((Number) 12);
        } else {
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams5.width = o.d((Number) 54);
            layoutParams5.height = o.d((Number) 54);
            layoutParams5.topMargin = o.d((Number) 12);
            layoutParams5.leftMargin = o.d((Number) 12);
            t tVar2 = t.INSTANCE;
            tUrlImageView2.setLayoutParams(layoutParams5);
        }
        tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN013dzdLg1MxVMViYez0_!!6000000001501-2-tps-108-108.png");
        tUrlImageView.setOnClickListener(new c());
        frameLayout3.addView(tUrlImageView2);
        t tVar3 = t.INSTANCE;
        LinearLayout linearLayout = new LinearLayout(frameLayout3.getContext());
        LinearLayout linearLayout2 = linearLayout;
        ViewGroup.LayoutParams layoutParams6 = linearLayout2.getLayoutParams();
        if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout2.setLayoutParams(layoutParams6);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar4 = t.INSTANCE;
            linearLayout2.setLayoutParams(marginLayoutParams2);
        }
        linearLayout.setGravity(17);
        ViewGroup.LayoutParams layoutParams7 = linearLayout2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams8 = layoutParams7 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams7 : null;
        if (layoutParams8 != null) {
            layoutParams8.gravity = 1;
            layoutParams8.topMargin = o.d((Number) 12);
        } else {
            FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams9.gravity = 1;
            layoutParams9.topMargin = o.d((Number) 12);
            t tVar5 = t.INSTANCE;
            linearLayout2.setLayoutParams(layoutParams9);
        }
        LinearLayout linearLayout3 = linearLayout;
        TUrlImageView tUrlImageView3 = new TUrlImageView(linearLayout3.getContext());
        TUrlImageView tUrlImageView4 = tUrlImageView3;
        ViewGroup.LayoutParams layoutParams10 = tUrlImageView4.getLayoutParams();
        if (layoutParams10 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView4.setLayoutParams(layoutParams10);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar6 = t.INSTANCE;
            tUrlImageView4.setLayoutParams(marginLayoutParams3);
        }
        tUrlImageView3.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01vCKFka1CuAMXT24wB_!!6000000000140-2-tps-34-34.png");
        ViewGroup.LayoutParams layoutParams11 = tUrlImageView4.getLayoutParams();
        if (layoutParams11 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams11;
            marginLayoutParams4.width = o.d((Number) 36);
            marginLayoutParams4.height = o.d((Number) 36);
            marginLayoutParams4.rightMargin = o.d((Number) 16);
            tUrlImageView4.setLayoutParams(layoutParams11);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams5 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams5.width = o.d((Number) 36);
            marginLayoutParams5.height = o.d((Number) 36);
            marginLayoutParams5.rightMargin = o.d((Number) 16);
            t tVar7 = t.INSTANCE;
            tUrlImageView4.setLayoutParams(marginLayoutParams5);
        }
        linearLayout3.addView(tUrlImageView4);
        t tVar8 = t.INSTANCE;
        TextView textView = new TextView(linearLayout3.getContext());
        TextView textView2 = textView;
        ViewGroup.LayoutParams layoutParams12 = textView2.getLayoutParams();
        if (layoutParams12 instanceof ViewGroup.MarginLayoutParams) {
            textView2.setLayoutParams(layoutParams12);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams6 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar9 = t.INSTANCE;
            textView2.setLayoutParams(marginLayoutParams6);
        }
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        o.a(textView, o.d((Number) 36));
        textView.setTextColor(-16777216);
        textView.setText("其他店铺的精选推荐");
        linearLayout3.addView(textView2);
        t tVar10 = t.INSTANCE;
        frameLayout3.addView(linearLayout2);
        t tVar11 = t.INSTANCE;
        TUrlImageView tUrlImageView5 = new TUrlImageView(frameLayout3.getContext());
        TUrlImageView tUrlImageView6 = tUrlImageView5;
        ViewGroup.LayoutParams layoutParams13 = tUrlImageView6.getLayoutParams();
        if (layoutParams13 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView6.setLayoutParams(layoutParams13);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams7 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar12 = t.INSTANCE;
            tUrlImageView6.setLayoutParams(marginLayoutParams7);
        }
        this.d = tUrlImageView5;
        tUrlImageView5.setContentDescription("更多");
        ViewGroup.LayoutParams layoutParams14 = tUrlImageView6.getLayoutParams();
        if (layoutParams14 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams14;
        }
        if (layoutParams != null) {
            layoutParams.width = o.d((Number) 54);
            layoutParams.height = o.d((Number) 54);
            layoutParams.topMargin = o.d((Number) 12);
            layoutParams.rightMargin = o.d((Number) 18);
            layoutParams.gravity = 5;
        } else {
            FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams15.width = o.d((Number) 54);
            layoutParams15.height = o.d((Number) 54);
            layoutParams15.topMargin = o.d((Number) 12);
            layoutParams15.rightMargin = o.d((Number) 18);
            layoutParams15.gravity = 5;
            t tVar13 = t.INSTANCE;
            tUrlImageView6.setLayoutParams(layoutParams15);
        }
        tUrlImageView5.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01ObPozU1ErXGtZezPP_!!6000000000405-2-tps-108-108.png");
        tUrlImageView5.setOnClickListener(new d());
        frameLayout3.addView(tUrlImageView6);
        t tVar14 = t.INSTANCE;
        t tVar15 = t.INSTANCE;
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.f == -1) {
            this.f = b().getTop();
        }
        if (this.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new a(z));
            ofFloat.addListener(new b());
            t tVar = t.INSTANCE;
            this.h = ofFloat;
        }
        ValueAnimator valueAnimator2 = this.h;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            z2 = true;
        }
        if (z2 && (valueAnimator = this.h) != null) {
            valueAnimator.cancel();
        }
        if (z) {
            ValueAnimator valueAnimator3 = this.h;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
        } else {
            ValueAnimator valueAnimator4 = this.h;
            if (valueAnimator4 != null) {
                valueAnimator4.reverse();
            }
        }
        this.i = z;
    }
}
