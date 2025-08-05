package com.taobao.android.tab2liveroom.liveroom.topAvatar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class ExpandingCircleView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANIMATION_DURATION = 700;
    private static final int PAINT_COLOR = -256179;
    private static final int STROKE_WIDTH = 4;
    private AnimatorSet animatorSet;
    private Paint mAnimatedCirclePaint;
    private float mExpandingRadius;
    private float mPartAlpha;
    private float mRadius;
    private Paint mStaticCirclePaint;
    private float mStaticRadius;

    static {
        kge.a(1606140044);
    }

    public static /* synthetic */ Object ipc$super(ExpandingCircleView expandingCircleView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 348684699) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public void setStaticRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e82cf37", new Object[]{this, new Float(f)});
        } else {
            this.mStaticRadius = f;
        }
    }

    public void setExpandingRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d64f621", new Object[]{this, new Float(f)});
        } else {
            this.mExpandingRadius = f;
        }
    }

    public ExpandingCircleView(Context context) {
        super(context);
        this.mStaticRadius = 50.0f;
        this.mExpandingRadius = 150.0f;
        init();
    }

    public ExpandingCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mStaticRadius = 50.0f;
        this.mExpandingRadius = 150.0f;
        init();
    }

    public ExpandingCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mStaticRadius = 50.0f;
        this.mExpandingRadius = 150.0f;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mStaticCirclePaint = new Paint();
        this.mStaticCirclePaint.setAntiAlias(true);
        this.mStaticCirclePaint.setColor(PAINT_COLOR);
        this.mStaticCirclePaint.setStyle(Paint.Style.STROKE);
        this.mStaticCirclePaint.setStrokeWidth(4.0f);
        this.mAnimatedCirclePaint = new Paint();
        this.mAnimatedCirclePaint.setAntiAlias(true);
        this.mAnimatedCirclePaint.setColor(PAINT_COLOR);
        this.mAnimatedCirclePaint.setStyle(Paint.Style.STROKE);
        this.mAnimatedCirclePaint.setStrokeWidth(4.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        this.mStaticCirclePaint.setAlpha(255);
        canvas.drawCircle(width, height, this.mStaticRadius, this.mStaticCirclePaint);
        this.mAnimatedCirclePaint.setAlpha((int) (getPartAlpha() * 255.0f));
        canvas.drawCircle(width, height, this.mRadius, this.mAnimatedCirclePaint);
    }

    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
            return;
        }
        this.mRadius = f;
        invalidate();
    }

    public float getRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f9580fff", new Object[]{this})).floatValue() : this.mRadius;
    }

    public void setPartAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7aa4ed0", new Object[]{this, new Float(f)});
        } else {
            this.mPartAlpha = f;
        }
    }

    public float getPartAlpha() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("541e906c", new Object[]{this})).floatValue() : this.mPartAlpha;
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
            startAnimation();
        } else {
            stopAnimation();
        }
    }

    private void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
            return;
        }
        if (this.animatorSet == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "partAlpha", 1.0f, 0.0f);
            ofFloat.setDuration(700L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "radius", this.mStaticRadius, this.mExpandingRadius);
            ofFloat2.setDuration(700L);
            this.animatorSet = new AnimatorSet();
            this.animatorSet.playTogether(ofFloat2, ofFloat);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
        }
        this.animatorSet.start();
    }

    private void stopAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e230f929", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        this.animatorSet.cancel();
    }
}
