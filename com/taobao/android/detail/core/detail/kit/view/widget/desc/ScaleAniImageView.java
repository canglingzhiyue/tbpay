package com.taobao.android.detail.core.detail.kit.view.widget.desc;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class ScaleAniImageView extends DetailImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ValueAnimator mAnimator;
    private Matrix mPrimaryMatrix;
    private ValueAnimator.AnimatorUpdateListener mScaleAniListener;

    static {
        kge.a(-411925853);
    }

    public static /* synthetic */ Object ipc$super(ScaleAniImageView scaleAniImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1150258430) {
            super.setImageDrawable((Drawable) objArr[0]);
            return null;
        } else if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 949399698) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDetachedFromWindow();
            return null;
        }
    }

    public static /* synthetic */ Matrix access$000(ScaleAniImageView scaleAniImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Matrix) ipChange.ipc$dispatch("a7c219af", new Object[]{scaleAniImageView}) : scaleAniImageView.mPrimaryMatrix;
    }

    public ScaleAniImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPrimaryMatrix = null;
        this.mScaleAniListener = null;
        this.mAnimator = null;
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.desc.ScaleAniImageView");
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
            return;
        }
        super.setImageDrawable(drawable);
        initDrawable();
    }

    @Override // com.taobao.android.detail.datasdk.protocol.image.DetailImageView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.cancel();
        this.mAnimator = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        initAnim();
    }

    private void initAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579f8f48", new Object[]{this});
        } else if (getDrawable() == null) {
        } else {
            if (this.mScaleAniListener == null) {
                this.mScaleAniListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.desc.ScaleAniImageView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        } else if (ScaleAniImageView.access$000(ScaleAniImageView.this) == null) {
                        } else {
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            Matrix matrix = new Matrix(ScaleAniImageView.access$000(ScaleAniImageView.this));
                            matrix.postScale(floatValue, floatValue, ScaleAniImageView.this.getWidth() / 2, ScaleAniImageView.this.getHeight() / 2);
                            ScaleAniImageView.this.setImageMatrix(matrix);
                        }
                    }
                };
            }
            if (this.mAnimator != null) {
                return;
            }
            this.mAnimator = ValueAnimator.ofFloat(1.0f, 1.2f);
            this.mAnimator.setDuration(Constants.STARTUP_TIME_LEVEL_1);
            this.mAnimator.addUpdateListener(this.mScaleAniListener);
            this.mAnimator.setRepeatMode(2);
            this.mAnimator.setRepeatCount(100);
            this.mAnimator.setInterpolator(new DecelerateInterpolator());
            this.mAnimator.start();
        }
    }

    private void initDrawable() {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7822755", new Object[]{this});
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f3 = 0.0f;
        if (intrinsicWidth * measuredHeight > measuredWidth * intrinsicHeight) {
            float f4 = measuredHeight / intrinsicHeight;
            f2 = (measuredWidth - (intrinsicWidth * f4)) * 0.5f;
            f = f4;
        } else {
            f = measuredWidth / intrinsicWidth;
            f3 = (measuredHeight - (intrinsicHeight * f)) * 0.5f;
            f2 = 0.0f;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        matrix.postTranslate(Math.round(f2), Math.round(f3));
        setImageMatrix(matrix);
        this.mPrimaryMatrix = matrix;
    }
}
