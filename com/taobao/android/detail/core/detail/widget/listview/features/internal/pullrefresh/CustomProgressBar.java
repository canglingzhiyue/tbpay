package com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class CustomProgressBar extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CustomProgressBar";
    private final float DEFAULT_START_ANGLE;
    private final float MAX_SWEEP_ANGLE;
    private final float MIN_START_ANGLE;
    private int mDistance;
    private boolean mIsLoading;
    private boolean mIsShow;
    private Paint mPaint;
    private RectF mRectF;
    private float mStartAngle;
    private float mSweepAngle;
    public float preDistance;

    static {
        kge.a(-2003028638);
    }

    public CustomProgressBar(Context context) {
        this(context, null);
    }

    public CustomProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MAX_SWEEP_ANGLE = 340.0f;
        this.MIN_START_ANGLE = -80.0f;
        this.DEFAULT_START_ANGLE = 260.0f;
        this.mIsLoading = false;
        this.mStartAngle = 260.0f;
        this.mSweepAngle = 0.0f;
        this.mIsShow = false;
        this.preDistance = 0.0f;
        init();
    }

    public void startLoadingAnimaton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d505584", new Object[]{this});
            return;
        }
        this.mSweepAngle = 340.0f;
        this.mStartAngle = -80.0f;
        this.mIsLoading = true;
        invalidate();
    }

    public void stopLoadingAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42979551", new Object[]{this});
            return;
        }
        this.mIsLoading = false;
        this.preDistance = 0.0f;
        if (this.mIsShow) {
            this.mSweepAngle = 340.0f;
            this.mStartAngle = -80.0f;
        } else {
            this.mStartAngle = 260.0f;
            this.mSweepAngle = 0.0f;
        }
        invalidate();
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
        emu.a("com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh.CustomProgressBar");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        this.mRectF.set(3.0f, 3.0f, getWidth() - 3.0f, getHeight() - 3.0f);
        canvas.drawArc(this.mRectF, this.mStartAngle, this.mSweepAngle, false, this.mPaint);
        if (!this.mIsLoading) {
            return;
        }
        this.mStartAngle += 10.0f;
        invalidate();
    }

    public void changeProgressBarState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8212e1", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
            this.mStartAngle = 260.0f;
            this.mSweepAngle = 0.0f;
            invalidate();
        } else {
            float f = i;
            float f2 = this.preDistance;
            int i2 = this.mDistance;
            float f3 = ((f - f2) / i2) * 340.0f;
            this.mStartAngle -= f3;
            this.mSweepAngle += f3;
            if (this.mStartAngle < -80.0f) {
                this.mStartAngle = -80.0f;
                this.mSweepAngle = 340.0f;
                if (f2 == i2) {
                    return;
                }
                this.preDistance = i2;
            } else {
                this.preDistance = f;
            }
            invalidate();
        }
    }

    public void setPullDownDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6120ffe", new Object[]{this, new Integer(i)});
        } else {
            this.mDistance = i;
        }
    }

    public void setPaintColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5acf5815", new Object[]{this, new Integer(i)});
            return;
        }
        Paint paint = this.mPaint;
        if (paint == null) {
            return;
        }
        paint.setColor(i);
    }

    public void isInitShow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6990fe16", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsShow = z;
        if (!z) {
            return;
        }
        this.mSweepAngle = 340.0f;
        this.mStartAngle = -80.0f;
    }
}
