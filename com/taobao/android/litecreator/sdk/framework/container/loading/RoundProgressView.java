package com.taobao.android.litecreator.sdk.framework.container.loading;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.f;
import com.taobao.taobao.R;
import tb.kge;
import tb.riy;

/* loaded from: classes5.dex */
public class RoundProgressView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mDefaultRoundColor;
    private Paint mExternalRoundPaint;
    private int mInnerBgColor;
    private Paint mInnerRoundPaint;
    private boolean mIsNeedTextShow;
    private int mLoadingRoundColor;
    private int mMaxProgress;
    private RectF mOvalRect;
    private int mProgress;
    private int mProgressTextColor;
    private float mProgressValueSize;
    private float mRoundWidth;
    private int mStartAngle;
    public SweepGradient sweepGradient;

    static {
        kge.a(130968117);
    }

    public static /* synthetic */ Object ipc$super(RoundProgressView roundProgressView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public RoundProgressView(Context context) {
        this(context, null);
    }

    public RoundProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LCRoundProgressView);
        this.mDefaultRoundColor = obtainStyledAttributes.getColor(R.styleable.LCRoundProgressView_LCRoundColor, -65536);
        this.mRoundWidth = obtainStyledAttributes.getDimension(R.styleable.LCRoundProgressView_LCRoundWidth, f.a(3.5f));
        this.mLoadingRoundColor = obtainStyledAttributes.getColor(R.styleable.LCRoundProgressView_LCProgressColor, -16711936);
        this.mProgressTextColor = obtainStyledAttributes.getColor(R.styleable.LCRoundProgressView_LCProgressValueColor, -1);
        this.mProgressValueSize = obtainStyledAttributes.getDimension(R.styleable.LCRoundProgressView_LCProgressValueSize, f.a(14.0f));
        this.mMaxProgress = obtainStyledAttributes.getInteger(R.styleable.LCRoundProgressView_LCMaxProgress, 100);
        this.mStartAngle = obtainStyledAttributes.getInt(R.styleable.LCRoundProgressView_LCStartAngle, -90);
        this.mIsNeedTextShow = obtainStyledAttributes.getBoolean(R.styleable.LCRoundProgressView_LCProgressShow, true);
        obtainStyledAttributes.recycle();
        initData();
    }

    private void initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        this.mExternalRoundPaint = new Paint();
        this.mExternalRoundPaint.setAntiAlias(true);
        this.mExternalRoundPaint.setDither(true);
        this.mExternalRoundPaint.setStyle(Paint.Style.STROKE);
        this.mInnerRoundPaint = new Paint();
        this.mInnerRoundPaint.setAntiAlias(true);
        this.mInnerRoundPaint.setDither(true);
        this.mInnerRoundPaint.setStyle(Paint.Style.FILL);
        this.mInnerBgColor = Color.parseColor("#26FFFFFF");
        this.mExternalRoundPaint.setStrokeWidth(this.mRoundWidth);
        this.mExternalRoundPaint.setColor(this.mDefaultRoundColor);
        this.mOvalRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        int width = getWidth() / 2;
        float f = width;
        int i = (int) (f - (this.mRoundWidth / 2.0f));
        if (this.sweepGradient == null) {
            float f2 = i;
            this.sweepGradient = new SweepGradient(f2, f2, new int[]{-1, 16777215}, (float[]) null);
        }
        this.mInnerRoundPaint.setStrokeWidth(this.mRoundWidth);
        this.mInnerRoundPaint.setColor(this.mInnerBgColor);
        canvas.drawCircle(f, f, i - (this.mRoundWidth / 4.0f), this.mInnerRoundPaint);
        float f3 = width - i;
        float f4 = width + i;
        this.mOvalRect.set(f3, f3, f4, f4);
        int i2 = (this.mProgress * 360) / this.mMaxProgress;
        if (this.mIsNeedTextShow) {
            this.mExternalRoundPaint.setShader(null);
            this.mExternalRoundPaint.setColor(this.mLoadingRoundColor);
        } else {
            this.mExternalRoundPaint.setShader(this.sweepGradient);
        }
        canvas.drawArc(this.mOvalRect, this.mStartAngle, i2, false, this.mExternalRoundPaint);
        if (!this.mIsNeedTextShow) {
            return;
        }
        this.mInnerRoundPaint.setStrokeWidth(0.0f);
        this.mInnerRoundPaint.setColor(this.mProgressTextColor);
        this.mInnerRoundPaint.setTextSize(this.mProgressValueSize);
        String str = Math.max(0, (int) ((this.mProgress / this.mMaxProgress) * 100.0f)) + riy.MOD;
        canvas.drawText(str, f - (this.mInnerRoundPaint.measureText(str) / 2.0f), (getHeight() / 2) + (this.mProgressValueSize / 3.0f), this.mInnerRoundPaint);
    }

    public void setMax(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c1036fa", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.mMaxProgress = i;
    }

    public int getProgress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ba5fa9d", new Object[]{this})).intValue() : this.mProgress;
    }

    public void setIsNeedTextShow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b1aeae1", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsNeedTextShow = z;
        }
    }

    public void setProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf0340d", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
        } else {
            int i2 = this.mMaxProgress;
            if (i > i2) {
                i = i2;
            }
            this.mProgress = i;
            invalidate();
        }
    }

    public void setDefaultRoundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5efb7488", new Object[]{this, new Integer(i)});
        } else {
            this.mDefaultRoundColor = i;
        }
    }

    public void setLoadingRoundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0db42d", new Object[]{this, new Integer(i)});
        } else {
            this.mLoadingRoundColor = i;
        }
    }

    public void setInnerBgColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f0f132", new Object[]{this, new Integer(i)});
        } else {
            this.mInnerBgColor = i;
        }
    }
}
