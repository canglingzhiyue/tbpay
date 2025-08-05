package com.etao.feimagesearch.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes3.dex */
public class ScanAnimLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mAlphaDistance;
    private ValueAnimator mAnimator;
    private boolean mAttached;
    private TUrlImageView mImageView;

    static {
        kge.a(-1347867100);
    }

    public static /* synthetic */ Object ipc$super(ScanAnimLayout scanAnimLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case -270519527:
                super.onFinishTemporaryDetach();
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1861606664:
                super.onStartTemporaryDetach();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ TUrlImageView access$000(ScanAnimLayout scanAnimLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("72ecb0ba", new Object[]{scanAnimLayout}) : scanAnimLayout.mImageView;
    }

    public static /* synthetic */ float access$100(ScanAnimLayout scanAnimLayout, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c3e2d150", new Object[]{scanAnimLayout, new Integer(i)})).floatValue() : scanAnimLayout.getAlpha(i);
    }

    public ScanAnimLayout(Context context) {
        super(context);
        this.mAttached = false;
    }

    public ScanAnimLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAttached = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.mAlphaDistance = (int) (getHeight() * 0.2d);
        if (!this.mAttached) {
            return;
        }
        startAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        onAttach();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        onDetach();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef5dd08", new Object[]{this});
            return;
        }
        super.onStartTemporaryDetach();
        onDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe03319", new Object[]{this});
            return;
        }
        super.onFinishTemporaryDetach();
        onAttach();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            onAttach();
        } else {
            onDetach();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            onAttach();
        } else {
            onDetach();
        }
    }

    private void onAttach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f7278b", new Object[]{this});
        } else if (this.mAttached) {
        } else {
            this.mAttached = true;
            startAnimation();
        }
    }

    private void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
        } else if (!this.mAttached) {
        } else {
            this.mAttached = false;
            stopAnimation();
        }
    }

    private void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        } else if (getHeight() == 0 || this.mAnimator != null) {
        } else {
            if (this.mImageView == null) {
                this.mImageView = (TUrlImageView) getChildAt(0);
            }
            this.mImageView.asyncSetImageUrl("https://img.alicdn.com/tfs/TB1UzuJUaL7gK0jSZFBXXXZZpXa-1500-312.png");
            this.mAnimator = ValueAnimator.ofInt(0, getHeight() - this.mImageView.getMeasuredHeight());
            this.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.etao.feimagesearch.ui.ScanAnimLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else if (valueAnimator.getAnimatedValue() == null) {
                    } else {
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ScanAnimLayout.access$000(ScanAnimLayout.this).setTranslationY(intValue);
                        ScanAnimLayout.access$000(ScanAnimLayout.this).setAlpha(ScanAnimLayout.access$100(ScanAnimLayout.this, intValue));
                    }
                }
            });
            this.mAnimator.setDuration(1000L);
            this.mAnimator.setRepeatMode(1);
            this.mAnimator.setRepeatCount(-1);
            this.mAnimator.setInterpolator(new AccelerateInterpolator());
            this.mAnimator.start();
        }
    }

    private void stopAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e230f929", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.end();
        this.mAnimator = null;
    }

    private float getAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a320b0a4", new Object[]{this, new Integer(i)})).floatValue();
        }
        int i2 = this.mAlphaDistance;
        if (i <= i2) {
            return (i * 1.0f) / i2;
        }
        if (i < getHeight() - this.mAlphaDistance) {
            return 1.0f;
        }
        int height = getHeight();
        int i3 = this.mAlphaDistance;
        return 1.0f - (((i * 1.0f) - (height - i3)) / i3);
    }
}
