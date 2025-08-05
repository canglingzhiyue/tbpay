package com.taobao.mmad.biz.interact.controller.interact.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class BootImageWaveAnimView extends FrameLayout implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int animCycleTime;
    public final int animDuration;
    public final int animIdleDuration;
    public final int animInterval;
    private ValueAnimator animator;
    public final float initialAlpha;
    public float mAlpha1;
    public float mAlpha2;
    private Paint mPaint;
    private RectF mRectF;
    public float mScale1;
    public float mScale2;
    public int mWaveColor;
    public int mWaveRadius;
    public final float maxScale;

    static {
        kge.a(-536774408);
        kge.a(1499308443);
        kge.a(1420754541);
    }

    public static /* synthetic */ Object ipc$super(BootImageWaveAnimView bootImageWaveAnimView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 949399698) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDetachedFromWindow();
            return null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
        }
    }

    public BootImageWaveAnimView(Context context) {
        this(context, null);
    }

    public BootImageWaveAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public BootImageWaveAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.animDuration = 1500;
        this.animInterval = 600;
        this.animCycleTime = 600;
        this.animIdleDuration = 300;
        this.maxScale = 0.2f;
        this.initialAlpha = 0.6f;
        this.mWaveRadius = 20;
        this.mWaveColor = -1;
        try {
            setWillNotDraw(false);
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BootImageWaveAnimView);
                this.mWaveColor = obtainStyledAttributes.getColor(R.styleable.BootImageWaveAnimView_wave_color, this.mWaveColor);
                this.mWaveRadius = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.BootImageWaveAnimView_wave_radius, this.mWaveRadius);
                obtainStyledAttributes.recycle();
            }
            this.mRectF = new RectF();
            this.mPaint = new Paint(1);
            this.mPaint.setColor(this.mWaveColor);
            this.mPaint.setStyle(Paint.Style.FILL);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void startAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8157c9a", new Object[]{this});
            return;
        }
        try {
            this.animator = ValueAnimator.ofInt(1500);
            this.animator.setDuration(1500L);
            this.animator.setRepeatMode(1);
            this.animator.setRepeatCount(-1);
            this.animator.setInterpolator(new LinearInterpolator());
            this.animator.addUpdateListener(this);
            this.animator.addListener(this);
            this.animator.start();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void stopAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a93203a", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.animator.cancel();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        try {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (intValue >= 600) {
                this.mAlpha1 = 0.6f;
                this.mScale1 = 1.0f;
            } else {
                float f = intValue % 600;
                this.mAlpha1 = ((600.0f - f) / 600.0f) * 0.6f;
                this.mScale1 = ((f * 0.2f) / 600.0f) + 1.0f;
            }
            if (intValue >= 900) {
                this.mAlpha2 = 0.6f;
                this.mScale2 = 1.0f;
            } else if (intValue < 300) {
                this.mAlpha2 = 0.6f;
                this.mScale2 = 1.0f;
            } else {
                float f2 = (intValue - 300) % 600;
                this.mAlpha2 = ((600.0f - f2) / 600.0f) * 0.6f;
                this.mScale2 = ((f2 * 0.2f) / 600.0f) + 1.0f;
            }
            postInvalidate();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84781bba", new Object[]{this, animator, new Boolean(z)});
        } else {
            resumeStatus();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
        } else {
            resumeStatus();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
        } else {
            resumeStatus();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
        } else {
            resumeStatus();
        }
    }

    private void resumeStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e96f1b86", new Object[]{this});
            return;
        }
        this.mAlpha1 = 0.6f;
        this.mAlpha2 = 0.6f;
        this.mScale1 = 1.0f;
        this.mScale2 = 1.0f;
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0 || (rectF = this.mRectF) == null || this.mPaint == null) {
            return;
        }
        float f = this.mScale1;
        float f2 = measuredWidth;
        float f3 = measuredHeight;
        float f4 = (((f - 1.0f) * f2) / f3) + 1.0f;
        rectF.top = ((1.0f - f4) * f3) / 2.0f;
        rectF.left = ((1.0f - f) * f2) / 2.0f;
        rectF.right = rectF.left + (this.mScale1 * f2);
        RectF rectF2 = this.mRectF;
        rectF2.bottom = rectF2.top + (f4 * f3);
        this.mPaint.setAlpha((int) (this.mAlpha1 * 255.0f));
        RectF rectF3 = this.mRectF;
        int i = this.mWaveRadius;
        canvas.drawRoundRect(rectF3, i, i, this.mPaint);
        float f5 = this.mScale2;
        float f6 = (((f5 - 1.0f) * f2) / f3) + 1.0f;
        RectF rectF4 = this.mRectF;
        rectF4.top = ((1.0f - f6) * f3) / 2.0f;
        rectF4.left = ((1.0f - f5) * f2) / 2.0f;
        rectF4.right = rectF4.left + (this.mScale2 * f2);
        RectF rectF5 = this.mRectF;
        rectF5.bottom = rectF5.top + (f6 * f3);
        this.mPaint.setAlpha((int) (this.mAlpha2 * 255.0f));
        RectF rectF6 = this.mRectF;
        int i2 = this.mWaveRadius;
        canvas.drawRoundRect(rectF6, i2, i2, this.mPaint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        stopAnim();
    }
}
