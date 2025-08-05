package com.taobao.android.detail.core.standard.widget.anchor;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.arc;
import tb.ard;
import tb.bay;
import tb.emu;
import tb.ien;
import tb.kge;

/* loaded from: classes4.dex */
public class PicGalleryAnchorIndicatorView extends View implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG;
    private int mAnchorHeight;
    private ValueAnimator mAnimator;
    private int mCurrentAnchorWidth;
    private int mCurrentIndicatorLeft;
    private boolean mHasInit;
    private boolean mIsBottomCircle;
    private final Paint mPaint;
    private int mPreAnchorWidth;
    private int mPreIndicatorLeft;
    private int mRadius;
    private int mTargetAnchorWidth;
    private int mTargetIndicatorLeft;

    static {
        kge.a(-213228869);
        kge.a(1499308443);
        kge.a(1420754541);
    }

    public static /* synthetic */ Object ipc$super(PicGalleryAnchorIndicatorView picGalleryAnchorIndicatorView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
        }
    }

    public PicGalleryAnchorIndicatorView(Context context) {
        this(context, null);
    }

    public PicGalleryAnchorIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PicGalleryAnchorIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "PicGalleryAnchorIndicatorView";
        this.mPreAnchorWidth = -1;
        this.mTargetAnchorWidth = -1;
        this.mCurrentAnchorWidth = -1;
        this.mPreIndicatorLeft = 0;
        this.mTargetIndicatorLeft = 0;
        this.mCurrentIndicatorLeft = 0;
        this.mHasInit = false;
        this.mIsBottomCircle = false;
        this.mPaint = new Paint();
        this.mPaint.setAntiAlias(true);
        emu.a("com.taobao.android.detail.core.standard.widget.anchor.PicGalleryAnchorIndicatorView");
    }

    public void updateIndicatorStyle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62e0fc02", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsBottomCircle = z;
        if (this.mIsBottomCircle) {
            this.mPaint.setShadowLayer(4.0f, 0.0f, 2.0f, ien.DEFAULT_TINT_COLOR);
        } else {
            this.mPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 16777215);
        }
        postInvalidate();
    }

    public void updateIndicatorColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a765e9bf", new Object[]{this, new Integer(i)});
            return;
        }
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setColor(i);
    }

    public void initAnchorSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f042d", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mHasInit) {
        } else {
            this.mHasInit = true;
            this.mTargetAnchorWidth = i;
            this.mPreAnchorWidth = i;
            this.mCurrentAnchorWidth = this.mPreAnchorWidth;
            this.mAnchorHeight = i2;
            this.mRadius = this.mAnchorHeight / 2;
            postInvalidate();
            updatePreParams();
        }
    }

    public void onSelectedAnchor(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("830bd8d6", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i <= 0) {
            ard a2 = arc.a();
            a2.c("PicGalleryAnchorIndicatorView", "onSelectedAnchor", "anchorWidth is less than 0,anchorWidth=" + i);
        } else if ((i2 == this.mPreIndicatorLeft && i == this.mPreAnchorWidth) || (i2 == this.mTargetIndicatorLeft && i == this.mTargetAnchorWidth)) {
            ard a3 = arc.a();
            a3.a("PicGalleryAnchorIndicatorView", "onSelectedAnchor", "skip, same left and same width,anchorWidth=" + i + ",indicatorLeft=" + i2);
        } else {
            cancelPreAnimation();
            this.mTargetIndicatorLeft = i2;
            this.mTargetAnchorWidth = i;
            this.mAnimator = ValueAnimator.ofInt(this.mPreIndicatorLeft, i2);
            this.mAnimator.setDuration(250L);
            this.mAnimator.addUpdateListener(this);
            this.mAnimator.addListener(this);
            this.mAnimator.start();
        }
    }

    private void cancelPreAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7bb9ac2", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.cancel();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        int i = this.mCurrentAnchorWidth;
        if (i <= 0) {
            return;
        }
        int i2 = this.mCurrentIndicatorLeft;
        int i3 = this.mRadius;
        int i4 = i2 + i3;
        int i5 = (i2 + i) - i3;
        if (this.mIsBottomCircle) {
            canvas.drawCircle(i4 + ((i5 - i4) / 2.0f), (this.mAnchorHeight - bay.a(1.8f)) - 3, bay.a(1.8f), this.mPaint);
            return;
        }
        float f = i4;
        canvas.drawCircle(f, i3, i3, this.mPaint);
        float f2 = i5;
        canvas.drawRect(f, 0.0f, f2, this.mAnchorHeight, this.mPaint);
        int i6 = this.mRadius;
        canvas.drawCircle(f2, i6, i6, this.mPaint);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        this.mCurrentIndicatorLeft = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.mCurrentAnchorWidth = (int) (this.mPreAnchorWidth + (valueAnimator.getAnimatedFraction() * (this.mTargetAnchorWidth - this.mPreAnchorWidth)));
        postInvalidate();
    }

    private void updatePreParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14546fc7", new Object[]{this});
            return;
        }
        this.mPreIndicatorLeft = this.mTargetIndicatorLeft;
        this.mPreAnchorWidth = this.mTargetAnchorWidth;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
        } else {
            updatePreParams();
        }
    }
}
