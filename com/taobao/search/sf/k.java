package com.taobao.search.sf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.tao.util.DensityUtil;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.irr;
import tb.iru;
import tb.kge;
import tb.ntx;
import tb.nut;

/* loaded from: classes8.dex */
public final class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final int k;
    private static final LinkedList<nut> l;

    /* renamed from: a  reason: collision with root package name */
    private int f19453a;
    private final int b;
    private int c;
    private final View d;
    private boolean e;
    private boolean f;
    private View g;
    private final int h;
    private irr<?, ?, ?, ?, ?> i;
    private final BaseResultActivity j;

    /* loaded from: classes8.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                k.a(k.this, true, 300L);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                k.a(k.this, true, 0L);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class d implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ViewGroup.MarginLayoutParams b;

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.b = marginLayoutParams;
        }

        /* JADX WARN: Type inference failed for: r4v7, types: [android.view.View] */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, animation});
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = this.b;
            q.a((Object) animation, "animation");
            Object animatedValue = animation.getAnimatedValue();
            if (animatedValue == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            marginLayoutParams.topMargin = ((Integer) animatedValue).intValue();
            ?? view = k.this.d().getView();
            if (view == 0) {
                q.a();
            }
            view.requestLayout();
        }
    }

    /* loaded from: classes8.dex */
    public static final class e extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AnimatorListenerAdapter f19459a;

        public e(AnimatorListenerAdapter animatorListenerAdapter) {
            this.f19459a = animatorListenerAdapter;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            q.c(animation, "animation");
            AnimatorListenerAdapter animatorListenerAdapter = this.f19459a;
            if (animatorListenerAdapter == null) {
                return;
            }
            animatorListenerAdapter.onAnimationEnd(null);
        }
    }

    /* loaded from: classes8.dex */
    public static final class f implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View] */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, it});
                return;
            }
            q.a((Object) it, "it");
            Object animatedValue = it.getAnimatedValue();
            if (!(animatedValue instanceof Float)) {
                animatedValue = null;
            }
            Float f = (Float) animatedValue;
            if (f == null) {
                return;
            }
            float floatValue = f.floatValue();
            ?? view = k.this.d().getView();
            if (view == 0) {
                q.a();
            }
            view.setTranslationY(floatValue);
            View a2 = k.a(k.this);
            if (a2 == null) {
                return;
            }
            a2.setTranslationY(floatValue);
        }
    }

    /* loaded from: classes8.dex */
    public static final class h implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ColorDrawable f19462a;

        public h(ColorDrawable colorDrawable) {
            this.f19462a = colorDrawable;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, animation});
                return;
            }
            ColorDrawable colorDrawable = this.f19462a;
            q.a((Object) animation, "animation");
            Object animatedValue = animation.getAnimatedValue();
            if (animatedValue == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            colorDrawable.setAlpha(((Integer) animatedValue).intValue());
            this.f19462a.invalidateSelf();
        }
    }

    @JvmStatic
    public static final void a(nut nutVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f07c2b", new Object[]{nutVar});
        } else {
            Companion.a(nutVar);
        }
    }

    @JvmStatic
    public static final void b(nut nutVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e57382ac", new Object[]{nutVar});
        } else {
            Companion.b(nutVar);
        }
    }

    @JvmStatic
    public static final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
        } else {
            Companion.b();
        }
    }

    public k(irr<?, ?, ?, ?, ?> widget, BaseResultActivity activity) {
        q.c(widget, "widget");
        q.c(activity, "activity");
        this.i = widget;
        this.j = activity;
        this.f19453a = DensityUtil.dip2px(this.j, 44.0f);
        this.b = DensityUtil.dip2px(this.j, 24.0f);
        this.d = new View(this.j);
        this.g = this.j.findViewById(R.id.fl_top_header);
        this.h = (!this.j.isImmersiveStatus() || Build.VERSION.SDK_INT < 19) ? 0 : SystemBarDecorator.getStatusBarHeight(this.j);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.sf.k.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                Window window = k.this.e().getWindow();
                q.a((Object) window, "activity.window");
                View decorView = window.getDecorView();
                if (decorView == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                ((ViewGroup) decorView).removeView(k.b(k.this));
                k.Companion.b();
            }
        });
        iru iruVar = (iru) this.i.getModel();
        q.a((Object) iruVar, "widget.model");
        com.taobao.android.searchbaseframe.context.a f2 = iruVar.f();
        if (f2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.context.CommonSearchContext");
        }
        float popupHeight = ((CommonSearchContext) f2).getPopupHeight();
        if (popupHeight > 0) {
            this.f19453a = ((int) ((1.0f - popupHeight) * ntx.c())) + k;
        }
        this.c = this.f19453a;
        Intent intent = this.j.getIntent();
        q.a((Object) intent, "activity.intent");
        if (!l.a(intent)) {
            return;
        }
        View findViewById = this.j.findViewById(R.id.fl_top_header);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f19453a;
        }
        this.f19453a = -(this.h - k);
        this.f = true;
    }

    public static final /* synthetic */ View a(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("60934ad6", new Object[]{kVar}) : kVar.g;
    }

    public static final /* synthetic */ void a(k kVar, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ea7904", new Object[]{kVar, new Boolean(z), new Long(j)});
        } else {
            kVar.a(z, j);
        }
    }

    public static final /* synthetic */ View b(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d60d7117", new Object[]{kVar}) : kVar.d;
    }

    public static final /* synthetic */ int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[0])).intValue() : k;
    }

    public static final /* synthetic */ LinkedList g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedList) ipChange.ipc$dispatch("53ffa380", new Object[0]) : l;
    }

    public final irr<?, ?, ?, ?, ?> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (irr) ipChange.ipc$dispatch("261b09f2", new Object[]{this}) : this.i;
    }

    public final BaseResultActivity e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseResultActivity) ipChange.ipc$dispatch("4d3735d8", new Object[]{this}) : this.j;
    }

    /* loaded from: classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: com.taobao.search.sf.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public static final class RunnableC0786a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ nut f19455a;

            public RunnableC0786a(nut nutVar) {
                this.f19455a = nutVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                while (!k.g().isEmpty()) {
                    ((nut) k.g().pollFirst()).finish();
                }
                nut nutVar = this.f19455a;
                if (nutVar == null) {
                    return;
                }
                nutVar.m();
            }
        }

        static {
            kge.a(-312230109);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : k.f();
        }

        @JvmStatic
        public final void a(nut activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6f07c2b", new Object[]{this, activity});
                return;
            }
            q.c(activity, "activity");
            k.g().add(activity);
        }

        @JvmStatic
        public final void b(nut activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e57382ac", new Object[]{this, activity});
                return;
            }
            q.c(activity, "activity");
            k.g().remove(activity);
        }

        @JvmStatic
        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            nut nutVar = (nut) k.g().pollLast();
            Iterator it = k.g().iterator();
            while (it.hasNext()) {
                ((nut) it.next()).n();
            }
            new Handler(Looper.getMainLooper()).post(new RunnableC0786a(nutVar));
        }
    }

    static {
        kge.a(-1588143717);
        Companion = new a(null);
        k = com.taobao.search.common.util.l.a(10.0f);
        l = new LinkedList<>();
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Window window = this.j.getWindow();
        q.a((Object) window, "activity.window");
        View decorView = window.getDecorView();
        if (decorView == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ((ViewGroup) decorView).removeView(this.d);
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.h - k;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v12, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v16, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v21, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.View] */
    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        ?? view = this.i.getView();
        if (view == 0) {
            q.a();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f19453a;
        ?? view2 = this.i.getView();
        if (view2 == 0) {
            q.a();
        }
        view2.setVisibility(4);
        if (z) {
            ?? view3 = this.i.getView();
            if (view3 == 0) {
                q.a();
            }
            view3.post(new b());
        } else {
            ?? view4 = this.i.getView();
            if (view4 == 0) {
                q.a();
            }
            view4.post(new c());
        }
        i();
        if (!(this.i.getView() instanceof com.taobao.android.searchbaseframe.business.srp.page.uikit.a)) {
            return;
        }
        ROOT_VIEW view5 = this.i.getView();
        if (view5 == 0) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.page.uikit.IClipLayout");
        }
        com.taobao.android.searchbaseframe.business.srp.page.uikit.a aVar = (com.taobao.android.searchbaseframe.business.srp.page.uikit.a) view5;
        aVar.setTopRadius(this.b);
        aVar.setTopOffset(this.h - k);
        ?? view6 = this.i.getView();
        if (view6 == 0) {
            q.a();
        }
        if (!(view6.getBackground() instanceof com.taobao.android.searchbaseframe.business.srp.page.uikit.a)) {
            return;
        }
        ?? view7 = this.i.getView();
        if (view7 == 0) {
            q.a();
        }
        Drawable background = view7.getBackground();
        if (background == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.page.uikit.IClipLayout");
        }
        com.taobao.android.searchbaseframe.business.srp.page.uikit.a aVar2 = (com.taobao.android.searchbaseframe.business.srp.page.uikit.a) background;
        aVar2.setTopRadius(this.b);
        aVar2.setTopOffset(this.h - k);
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.f) {
            Window window = this.j.getWindow();
            q.a((Object) window, "activity.window");
            View decorView = window.getDecorView();
            if (decorView == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            ((ViewGroup) decorView).addView(this.d, new ViewGroup.LayoutParams(-1, this.c));
        } else {
            Window window2 = this.j.getWindow();
            q.a((Object) window2, "activity.window");
            View decorView2 = window2.getDecorView();
            if (decorView2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            ((ViewGroup) decorView2).addView(this.d, new ViewGroup.LayoutParams(-1, (this.f19453a + this.h) - k));
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a(false, 300L);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.view.View] */
    private final void a(boolean z, long j) {
        ValueAnimator ofFloat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1910d8", new Object[]{this, new Boolean(z), new Long(j)});
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            float[] fArr = new float[2];
            ?? view = this.i.getView();
            if (view == 0) {
                q.a();
            }
            fArr[0] = view.getMeasuredHeight();
            fArr[1] = 0.0f;
            ofFloat = ValueAnimator.ofFloat(fArr);
        } else {
            float[] fArr2 = new float[2];
            fArr2[0] = 0.0f;
            ?? view2 = this.i.getView();
            if (view2 == 0) {
                q.a();
            }
            fArr2[1] = view2.getMeasuredHeight();
            ofFloat = ValueAnimator.ofFloat(fArr2);
        }
        ofFloat.addUpdateListener(new f());
        ofFloat.addListener(new g(z));
        if (z) {
            Window window = this.j.getWindow();
            q.a((Object) window, "activity.window");
            window.getDecorView().setBackgroundColor(-16777216);
        }
        Window window2 = this.j.getWindow();
        q.a((Object) window2, "activity.window");
        View decorView = window2.getDecorView();
        q.a((Object) decorView, "activity.window.decorView");
        Drawable background = decorView.getBackground();
        if (!(background instanceof ColorDrawable)) {
            background = null;
        }
        ColorDrawable colorDrawable = (ColorDrawable) background;
        if (colorDrawable != null) {
            if (z) {
                colorDrawable.setAlpha(0);
            }
            ValueAnimator ofInt = z ? ValueAnimator.ofInt(0, 128) : ValueAnimator.ofInt(128, 0);
            ofInt.addUpdateListener(new h(colorDrawable));
            animatorSet.playTogether(ofFloat, ofInt);
        } else {
            animatorSet.playTogether(ofFloat);
        }
        animatorSet.setDuration(j);
        animatorSet.start();
    }

    /* loaded from: classes8.dex */
    public static final class g extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public g(boolean z) {
            this.b = z;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View] */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animation});
                return;
            }
            q.c(animation, "animation");
            ?? view = k.this.d().getView();
            if (view == 0) {
                q.a();
            }
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            q.c(animation, "animation");
            if (this.b) {
                return;
            }
            k.this.e().z();
            k.this.e().overridePendingTransition(0, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    private final void a(boolean z, AnimatorListenerAdapter animatorListenerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22d0f02c", new Object[]{this, new Boolean(z), animatorListenerAdapter});
            return;
        }
        ?? view = this.i.getView();
        if (view == 0) {
            q.a();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.topMargin < this.f19453a && z) {
            if (animatorListenerAdapter == null) {
                return;
            }
            animatorListenerAdapter.onAnimationEnd(null);
            return;
        }
        ValueAnimator translate = z ? ValueAnimator.ofInt(this.f19453a, k) : ValueAnimator.ofInt(k, this.f19453a);
        translate.addUpdateListener(new d(marginLayoutParams));
        translate.addListener(new e(animatorListenerAdapter));
        q.a((Object) translate, "translate");
        translate.setDuration(150L);
        translate.start();
        if (z) {
            Window window = this.j.getWindow();
            q.a((Object) window, "activity.window");
            View decorView = window.getDecorView();
            if (decorView == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            ((ViewGroup) decorView).removeView(this.d);
            return;
        }
        i();
    }

    public final void a(AnimatorListenerAdapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8f11b0", new Object[]{this, adapter});
            return;
        }
        q.c(adapter, "adapter");
        if (this.f) {
            adapter.onAnimationEnd(null);
            return;
        }
        a(true, adapter);
        this.e = true;
    }
}
