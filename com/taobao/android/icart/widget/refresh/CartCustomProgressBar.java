package com.taobao.android.icart.widget.refresh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class CartCustomProgressBar extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final float DEFAULT_START_ANGLE;
    private final float MAX_SWEEP_ANGLE;
    private Paint mPaint;
    private RectF mRectF;
    private float mStartAngle;
    private float mSweepAngle;

    static {
        kge.a(724717231);
    }

    public CartCustomProgressBar(Context context) {
        this(context, null);
        init();
    }

    public CartCustomProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        init();
    }

    public CartCustomProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MAX_SWEEP_ANGLE = 345.0f;
        this.DEFAULT_START_ANGLE = -90.0f;
        this.mStartAngle = -90.0f;
        this.mSweepAngle = 0.0f;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mPaint = new Paint();
        this.mPaint.setColor(-6710887);
        this.mPaint.setAntiAlias(true);
        this.mPaint.setFlags(1);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeWidth(3.0f);
        this.mRectF = new RectF();
    }

    public void setProgressColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5260e3e8", new Object[]{this, new Integer(i)});
        } else {
            this.mPaint.setColor(i);
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mStartAngle = -90.0f;
        this.mSweepAngle = 0.0f;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        this.mRectF.set(2.0f, 2.0f, getWidth() - 2.0f, getHeight() - 2.0f);
        canvas.drawArc(this.mRectF, this.mStartAngle, this.mSweepAngle, false, this.mPaint);
    }

    public void onPullDownDistance(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902c735e", new Object[]{this, new Float(f)});
        } else if (f < 0.0f) {
            this.mSweepAngle = 0.0f;
            invalidate();
        } else {
            this.mSweepAngle = f * 345.0f;
            this.mSweepAngle = -Math.min(this.mSweepAngle, 345.0f);
            invalidate();
        }
    }
}
