package com.alibaba.triver.triver_shop.newShop.ext;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.MarginSupportFrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MarginSupportFrameLayout f3864a;
        public final /* synthetic */ int b;

        public a(MarginSupportFrameLayout marginSupportFrameLayout, int i) {
            this.f3864a = marginSupportFrameLayout;
            this.b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            MarginSupportFrameLayout marginSupportFrameLayout = this.f3864a;
            float f = this.b;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            marginSupportFrameLayout.setMarginTop(f + ((Float) animatedValue).floatValue());
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f3865a;
        public final /* synthetic */ int b;

        public b(FrameLayout frameLayout, int i) {
            this.f3865a = frameLayout;
            this.b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            FrameLayout frameLayout = this.f3865a;
            float f = this.b;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            o.c(frameLayout, (int) (f + ((Float) animatedValue).floatValue()));
        }
    }

    static {
        kge.a(1025935738);
    }

    public static /* synthetic */ Animator b(View view, float f, long j, Animator.AnimatorListener animatorListener, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("60cf0efb", new Object[]{view, new Float(f), new Long(j), animatorListener, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            j = 300;
        }
        if ((i & 4) != 0) {
            animatorListener = null;
        }
        return b(view, f, j, animatorListener);
    }

    public static final Animator b(View view, float f, long j, Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("635cf4cc", new Object[]{view, new Float(f), new Long(j), animatorListener});
        }
        q.d(view, "<this>");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "Y", view.getY() + f);
        ofFloat.setDuration(j);
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        q.b(ofFloat, "ofFloat(this, \"Y\", this.y + moveSize).apply {\n        this.duration = duration\n        listener?.let {\n            this.addListener(it)\n        }\n    }");
        return ofFloat;
    }

    public static /* synthetic */ Animator a(MarginSupportFrameLayout marginSupportFrameLayout, float f, long j, Animator.AnimatorListener animatorListener, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("78b1a0ec", new Object[]{marginSupportFrameLayout, new Float(f), new Long(j), animatorListener, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            j = 300;
        }
        if ((i & 4) != 0) {
            animatorListener = null;
        }
        return a(marginSupportFrameLayout, f, j, animatorListener);
    }

    public static final Animator a(MarginSupportFrameLayout marginSupportFrameLayout, float f, long j, Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("7ce34e7b", new Object[]{marginSupportFrameLayout, new Float(f), new Long(j), animatorListener});
        }
        q.d(marginSupportFrameLayout, "<this>");
        int h = o.h(marginSupportFrameLayout);
        ValueAnimator animator = ValueAnimator.ofFloat(f);
        animator.addUpdateListener(new a(marginSupportFrameLayout, h));
        animator.setDuration(j);
        if (animatorListener != null) {
            animator.addListener(animatorListener);
        }
        q.b(animator, "animator");
        return animator;
    }

    public static /* synthetic */ Animator a(FrameLayout frameLayout, float f, long j, Animator.AnimatorListener animatorListener, Interpolator interpolator, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("e9d07bd4", new Object[]{frameLayout, new Float(f), new Long(j), animatorListener, interpolator, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            j = 300;
        }
        return a(frameLayout, f, j, (i & 4) != 0 ? null : animatorListener, (i & 8) != 0 ? null : interpolator);
    }

    public static final Animator a(FrameLayout frameLayout, float f, long j, Animator.AnimatorListener animatorListener, Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("2073cc93", new Object[]{frameLayout, new Float(f), new Long(j), animatorListener, interpolator});
        }
        q.d(frameLayout, "<this>");
        int h = o.h(frameLayout);
        ValueAnimator animator = ValueAnimator.ofFloat(f);
        animator.addUpdateListener(new b(frameLayout, h));
        animator.setDuration(j);
        if (animatorListener != null) {
            animator.addListener(animatorListener);
        }
        if (interpolator != null) {
            animator.setInterpolator(interpolator);
        }
        q.b(animator, "animator");
        return animator;
    }

    public static /* synthetic */ Animator a(View view, float f, long j, Animator.AnimatorListener animatorListener, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("1420e57a", new Object[]{view, new Float(f), new Long(j), animatorListener, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            j = 300;
        }
        if ((i & 4) != 0) {
            animatorListener = null;
        }
        return a(view, f, j, animatorListener);
    }

    public static final Animator a(View view, float f, long j, Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("9c2da8ad", new Object[]{view, new Float(f), new Long(j), animatorListener});
        }
        q.d(view, "<this>");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "Alpha", f);
        ofFloat.setDuration(j);
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        q.b(ofFloat, "ofFloat(this, \"Alpha\", alpha).apply {\n        this.duration = duration\n        listener?.let {\n            this.addListener(it)\n        }\n    }");
        return ofFloat;
    }

    public static final Animator a(View view, Integer num, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("195fa729", new Object[]{view, num, num2});
        }
        q.d(view, "<this>");
        int width = view.getWidth();
        int height = view.getHeight();
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, num == null ? width / 2 : num.intValue(), num2 == null ? height / 2 : num2.intValue(), Math.max(width, height), 0.0f);
        createCircularReveal.setDuration(300L);
        createCircularReveal.setInterpolator(new AccelerateDecelerateInterpolator());
        return createCircularReveal;
    }

    public static final Animator a(View view, Integer num, Integer num2, Integer num3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("761e7426", new Object[]{view, num, num2, num3});
        }
        q.d(view, "<this>");
        int width = view.getWidth();
        int height = view.getHeight();
        int intValue = num == null ? width / 2 : num.intValue();
        int intValue2 = num2 == null ? height / 2 : num2.intValue();
        Float valueOf = num3 == null ? null : Float.valueOf(num3.intValue());
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, intValue, intValue2, 0.0f, valueOf == null ? Math.max(width, height) : valueOf.floatValue());
        createCircularReveal.setDuration(300L);
        createCircularReveal.setInterpolator(new AccelerateDecelerateInterpolator());
        return createCircularReveal;
    }
}
