package com.taobao.android.sku.pad;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0014J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000eJ\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/taobao/android/sku/pad/PadSkuFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mAnimation", "Landroid/animation/ValueAnimator;", "mRatio", "", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "shrinkHeight", "ratio", "withAnimation", "", "detail-sku_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class PadSkuFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ValueAnimator mAnimation;
    private float mRatio;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ValueAnimator b;

        public a(ValueAnimator valueAnimator) {
            this.b = valueAnimator;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            PadSkuFrameLayout padSkuFrameLayout = PadSkuFrameLayout.this;
            ValueAnimator animator = this.b;
            q.b(animator, "animator");
            Object animatedValue = animator.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            PadSkuFrameLayout.access$setMRatio$p(padSkuFrameLayout, ((Float) animatedValue).floatValue());
            PadSkuFrameLayout.this.requestLayout();
        }
    }

    static {
        kge.a(-1719664756);
    }

    public static /* synthetic */ Object ipc$super(PadSkuFrameLayout padSkuFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ void access$setMRatio$p(PadSkuFrameLayout padSkuFrameLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e66f5aa", new Object[]{padSkuFrameLayout, new Float(f)});
        } else {
            padSkuFrameLayout.mRatio = f;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PadSkuFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q.d(context, "context");
        this.mRatio = 0.9f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PadSkuFrameLayout(Context context) {
        this(context, null, 0);
        q.d(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PadSkuFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        q.d(context, "context");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (getLayoutParams().height != -1 && getLayoutParams().height != -2) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) * this.mRatio), View.MeasureSpec.getMode(i2)));
        }
    }

    public final void shrinkHeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd6f589", new Object[]{this, new Float(f)});
        } else {
            shrinkHeight(f, true);
        }
    }

    public final void shrinkHeight(float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d086e6b", new Object[]{this, new Float(f), new Boolean(z)});
            return;
        }
        if (f <= 1.0E-5f) {
            f = 0.0f;
        } else if (f >= 1.00001f) {
            f = 1.0f;
        }
        ValueAnimator valueAnimator = this.mAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            this.mRatio = f;
            requestLayout();
            return;
        }
        ValueAnimator animator = ValueAnimator.ofFloat(this.mRatio, f);
        q.b(animator, "animator");
        animator.setInterpolator(new AccelerateDecelerateInterpolator());
        animator.addUpdateListener(new a(animator));
        animator.start();
        this.mAnimation = animator;
    }
}
