package com.alibaba.triver.triver_shop.newShop.view.component.nativeview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
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
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f3945a;
    private final View b;
    private final View c;
    private final View d;
    private FrameLayout e;
    private TUrlImageView f;
    private TUrlImageView g;
    private int h;
    private int i;
    private ValueAnimator j;
    private boolean k;

    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.component.nativeview.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class RunnableC0144a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f3946a;

        public RunnableC0144a(FrameLayout frameLayout) {
            this.f3946a = frameLayout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int measuredHeight = a.this.a().getMeasuredHeight();
            if (measuredHeight <= 0) {
                measuredHeight = o.d((Number) 90);
            }
            FrameLayout frameLayout = this.f3946a;
            FrameLayout frameLayout2 = frameLayout;
            Context context = frameLayout.getContext();
            q.b(context, "context");
            o.a(frameLayout2, o.a(context) + measuredHeight);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public b(boolean z) {
            this.b = z;
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
            FrameLayout b = a.b(a.this);
            if (b == null) {
                q.b("container");
                throw null;
            }
            b.setAlpha(floatValue);
            View a2 = a.this.a();
            boolean z = this.b;
            a aVar = a.this;
            float f = 1 - floatValue;
            a2.setAlpha(f);
            if (z) {
                TUrlImageView e = aVar.e();
                if (e != null) {
                    e.setAlpha(0.0f);
                }
                TUrlImageView d = aVar.d();
                if (d != null) {
                    d.setAlpha(0.0f);
                }
            }
            a.this.b().setAlpha(f);
            ViewParent parent = a.this.c().getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            ((View) parent).setAlpha(f);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f3948a;
        public final /* synthetic */ a b;

        public c(boolean z, a aVar) {
            this.f3948a = z;
            this.b = aVar;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            if (!this.f3948a) {
                FrameLayout b = a.b(this.b);
                if (b == null) {
                    q.b("container");
                    throw null;
                }
                b.setZ(0.0f);
                TUrlImageView e = this.b.e();
                if (e != null) {
                    e.setAlpha(1.0f);
                }
                TUrlImageView d = this.b.d();
                if (d != null) {
                    d.setAlpha(1.0f);
                }
            } else {
                FrameLayout b2 = a.b(this.b);
                if (b2 == null) {
                    q.b("container");
                    throw null;
                }
                b2.setZ(2.0f);
            }
            if (a.c(this.b)) {
                ViewParent parent = this.b.c().getParent();
                if (parent == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
                o.d((View) parent);
                return;
            }
            ViewParent parent2 = this.b.c().getParent();
            if (parent2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            o.b((View) parent2);
        }
    }

    static {
        kge.a(-652240923);
    }

    public a(View headBar, View navBar, View bottomBar) {
        q.d(headBar, "headBar");
        q.d(navBar, "navBar");
        q.d(bottomBar, "bottomBar");
        this.b = headBar;
        this.c = navBar;
        this.d = bottomBar;
        this.h = -1;
        this.i = o.d((Number) 16);
    }

    public static final /* synthetic */ FrameLayout b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("98f1408a", new Object[]{aVar}) : aVar.e;
    }

    public static final /* synthetic */ boolean c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9d8651f4", new Object[]{aVar})).booleanValue() : aVar.k;
    }

    public final View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }

    public final View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.c;
    }

    public final View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.d;
    }

    public final TUrlImageView d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("45768731", new Object[]{this}) : this.f;
    }

    public final TUrlImageView e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("46acda10", new Object[]{this}) : this.g;
    }

    public final void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        q.d(view, "<set-?>");
        this.f3945a = view;
    }

    public final View f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8c57b8ef", new Object[]{this});
        }
        View view = this.f3945a;
        if (view != null) {
            return view;
        }
        q.b("centerContainer");
        throw null;
    }

    public final void b(View root) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, root});
            return;
        }
        q.d(root, "root");
        View findViewById = root.findViewById(R.id.flag_other_shop_container);
        q.b(findViewById, "root.findViewById<FrameLayout>(R.id.flag_other_shop_container)");
        this.e = (FrameLayout) findViewById;
        FrameLayout frameLayout = this.e;
        FrameLayout.LayoutParams layoutParams = null;
        if (frameLayout == null) {
            q.b("container");
            throw null;
        }
        frameLayout.setAlpha(0.0f);
        Context context = frameLayout.getContext();
        q.b(context, "context");
        o.g(frameLayout, o.a(context));
        frameLayout.post(new RunnableC0144a(frameLayout));
        frameLayout.setBackgroundColor(-1);
        FrameLayout frameLayout2 = frameLayout;
        TUrlImageView tUrlImageView = new TUrlImageView(frameLayout2.getContext());
        TUrlImageView tUrlImageView2 = tUrlImageView;
        ViewGroup.LayoutParams layoutParams2 = tUrlImageView2.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView2.setLayoutParams(layoutParams2);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar = t.INSTANCE;
            tUrlImageView2.setLayoutParams(marginLayoutParams);
        }
        ViewGroup.LayoutParams layoutParams3 = tUrlImageView2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            layoutParams4.width = o.d((Number) 54);
            layoutParams4.height = o.d((Number) 54);
            layoutParams4.topMargin = this.i;
            layoutParams4.leftMargin = o.d((Number) 5);
        } else {
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams5.width = o.d((Number) 54);
            layoutParams5.height = o.d((Number) 54);
            layoutParams5.topMargin = this.i;
            layoutParams5.leftMargin = o.d((Number) 5);
            t tVar2 = t.INSTANCE;
            tUrlImageView2.setLayoutParams(layoutParams5);
        }
        tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN013dzdLg1MxVMViYez0_!!6000000001501-2-tps-108-108.png");
        frameLayout2.addView(tUrlImageView2);
        t tVar3 = t.INSTANCE;
        LinearLayout linearLayout = new LinearLayout(frameLayout2.getContext());
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
            layoutParams8.topMargin = this.i;
        } else {
            FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams9.gravity = 1;
            layoutParams9.topMargin = this.i;
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
        frameLayout2.addView(linearLayout2);
        t tVar11 = t.INSTANCE;
        TUrlImageView tUrlImageView5 = new TUrlImageView(frameLayout2.getContext());
        TUrlImageView tUrlImageView6 = tUrlImageView5;
        ViewGroup.LayoutParams layoutParams13 = tUrlImageView6.getLayoutParams();
        if (layoutParams13 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView6.setLayoutParams(layoutParams13);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams7 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar12 = t.INSTANCE;
            tUrlImageView6.setLayoutParams(marginLayoutParams7);
        }
        ViewGroup.LayoutParams layoutParams14 = tUrlImageView6.getLayoutParams();
        if (layoutParams14 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams14;
        }
        if (layoutParams != null) {
            layoutParams.width = o.d((Number) 54);
            layoutParams.height = o.d((Number) 54);
            layoutParams.topMargin = this.i;
            layoutParams.rightMargin = o.d((Number) 18);
            layoutParams.gravity = 5;
        } else {
            FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams15.width = o.d((Number) 54);
            layoutParams15.height = o.d((Number) 54);
            layoutParams15.topMargin = this.i;
            layoutParams15.rightMargin = o.d((Number) 18);
            layoutParams15.gravity = 5;
            t tVar13 = t.INSTANCE;
            tUrlImageView6.setLayoutParams(layoutParams15);
        }
        tUrlImageView5.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01ObPozU1ErXGtZezPP_!!6000000000405-2-tps-108-108.png");
        frameLayout2.addView(tUrlImageView6);
        t tVar14 = t.INSTANCE;
        t tVar15 = t.INSTANCE;
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.h == -1) {
            this.h = f().getTop();
        }
        if (this.j == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new b(z));
            ofFloat.addListener(new c(z, this));
            t tVar = t.INSTANCE;
            this.j = ofFloat;
        }
        ValueAnimator valueAnimator4 = this.j;
        if (valueAnimator4 != null && valueAnimator4.isRunning()) {
            z2 = true;
        }
        if (z2 && (valueAnimator3 = this.j) != null) {
            valueAnimator3.cancel();
        }
        if (z) {
            if (!this.k && (valueAnimator2 = this.j) != null) {
                valueAnimator2.start();
            }
        } else if (this.k && (valueAnimator = this.j) != null) {
            valueAnimator.reverse();
        }
        this.k = z;
    }
}
