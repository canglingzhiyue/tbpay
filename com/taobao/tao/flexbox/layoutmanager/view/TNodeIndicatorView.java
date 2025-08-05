package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.odx;

/* loaded from: classes8.dex */
public class TNodeIndicatorView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean firstTime;
    private int indicatorCount;
    private int mDiameter;
    private int mFocusColor;
    private int mFocusIndex;
    private int mGapMargin;
    private int mIndex;
    private int mLastIndex;
    private Paint mPaint;
    private int mRadius;
    private int mStrokeColor;
    public float mStrokeWidth;
    private int mTotal;
    private int mUnfocusColor;
    private float minScale;
    private boolean minScaleFirst;
    private boolean minScaleLast;
    private boolean newControl;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f20529a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        static {
            kge.a(-1675329316);
        }

        public a(int i, int i2, int i3, boolean z, boolean z2) {
            this.f20529a = i;
            this.b = i2;
            this.c = i3;
            this.d = z;
            this.e = z2;
        }
    }

    static {
        kge.a(-178749249);
    }

    public static /* synthetic */ Object ipc$super(TNodeIndicatorView tNodeIndicatorView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode != 650865254) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public TNodeIndicatorView(Context context) {
        super(context);
        this.minScale = 1.0f;
        this.firstTime = true;
        init(context, null);
    }

    public TNodeIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.minScale = 1.0f;
        this.firstTime = true;
        init(context, attributeSet);
    }

    public TNodeIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.minScale = 1.0f;
        this.firstTime = true;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        this.mTotal = 1;
        this.mIndex = 0;
        this.mFocusColor = odx.a(context, 1, "#ff5000");
        this.mUnfocusColor = odx.a(context, 1, "#7fffffff");
        this.mStrokeColor = odx.a(context, 1, "#7f666666");
        this.mRadius = 4;
        this.mGapMargin = 8;
        this.mStrokeWidth = 1.0f;
        this.mDiameter = (this.mRadius + ((int) this.mStrokeWidth)) << 1;
        this.mPaint = new Paint();
        this.mPaint.setAntiAlias(true);
    }

    public void setRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fd848", new Object[]{this, new Integer(i)});
            return;
        }
        this.mRadius = i;
        this.mDiameter = (i << 1) + (((int) this.mStrokeWidth) * 2);
    }

    public int getTotal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dcf28f08", new Object[]{this})).intValue() : this.mTotal;
    }

    public void setTotal(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef84149a", new Object[]{this, new Integer(i)});
            return;
        }
        if (i <= 0) {
            i = 1;
        }
        this.mTotal = i;
        requestLayout();
        invalidate();
    }

    public int getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue() : this.mIndex;
    }

    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.mIndex;
        if (i == i2) {
            return;
        }
        this.mLastIndex = i2;
        this.mIndex = i;
        computeFocusIndex();
        judgeIndex();
        invalidate();
    }

    public void initWithIndicatorStatus(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50e6885", new Object[]{this, aVar});
            return;
        }
        this.mIndex = aVar.f20529a;
        this.mLastIndex = aVar.b;
        this.mFocusIndex = aVar.c;
        this.minScaleFirst = aVar.d;
        this.minScaleLast = aVar.e;
        invalidate();
    }

    public a getCurrentIndicatorStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("704d5604", new Object[]{this}) : new a(this.mIndex, this.mLastIndex, this.mFocusIndex, this.minScaleFirst, this.minScaleLast);
    }

    private void computeFocusIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee6da78", new Object[]{this});
        } else if (!this.newControl) {
        } else {
            int i = this.mIndex;
            if (i > this.mLastIndex) {
                int i2 = this.mFocusIndex;
                int i3 = this.indicatorCount;
                if (i2 == i3 - 2) {
                    if (i == this.mTotal - 1) {
                        this.mFocusIndex = i2 + 1;
                    }
                } else if (i2 < i3 - 2) {
                    this.mFocusIndex = i2 + 1;
                }
                if (!this.minScaleFirst && this.mIndex >= this.indicatorCount - 1) {
                    this.minScaleFirst = true;
                }
                if (!this.minScaleLast || this.mIndex < this.mTotal - 2) {
                    return;
                }
                this.minScaleLast = false;
                return;
            }
            int i4 = this.mFocusIndex;
            if (i4 > 1) {
                this.mFocusIndex = i4 - 1;
            } else if (i4 == 1 && i == 0) {
                this.mFocusIndex = i4 - 1;
            }
            if (this.minScaleFirst && this.mIndex <= 1) {
                this.minScaleFirst = false;
            }
            if (this.minScaleLast || this.mIndex >= this.mTotal - (this.indicatorCount - 1)) {
                return;
            }
            this.minScaleLast = true;
        }
    }

    public void setNewControlParams(boolean z, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ed7a565", new Object[]{this, new Boolean(z), new Integer(i), new Float(f)});
            return;
        }
        this.newControl = (i < this.mTotal) & z;
        this.indicatorCount = Math.min(i, this.mTotal);
        this.minScale = f;
        if (!this.firstTime) {
            return;
        }
        this.firstTime = false;
        if (!z || this.mIndex >= this.mTotal - (this.indicatorCount - 1)) {
            return;
        }
        this.minScaleLast = true;
    }

    private void judgeIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1957af02", new Object[]{this});
            return;
        }
        if (this.mIndex < 0) {
            this.mIndex = 0;
        }
        int i = this.mTotal;
        if (i - 1 >= this.mIndex) {
            return;
        }
        this.mIndex = i - 1;
    }

    public void setFocusColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c42e40f", new Object[]{this, new Integer(i)});
        } else {
            this.mFocusColor = i;
        }
    }

    public void setUnfocusColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a24d8d6", new Object[]{this, new Integer(i)});
        } else {
            this.mUnfocusColor = i;
        }
    }

    public int getGapMargin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aeb296e8", new Object[]{this})).intValue() : this.mGapMargin;
    }

    public void setGapMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef9722ba", new Object[]{this, new Integer(i)});
        } else {
            this.mGapMargin = i;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int min;
        int min2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            min = Math.max(getDesiredWidth(), size);
        } else {
            int desiredWidth = getDesiredWidth();
            min = mode == Integer.MIN_VALUE ? Math.min(desiredWidth, size) : desiredWidth;
        }
        if (mode2 == 1073741824) {
            min2 = Math.max(getDesiredHeight(), size2);
        } else {
            int desiredHeight = getDesiredHeight();
            min2 = mode2 == Integer.MIN_VALUE ? Math.min(desiredHeight, size2) : desiredHeight;
        }
        setMeasuredDimension(min, min2);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    private int getDesiredHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dfe33a5", new Object[]{this})).intValue() : this.mDiameter + getPaddingTop() + getPaddingBottom();
    }

    private int getDesiredWidth() {
        int paddingLeft;
        int paddingRight;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f17153c", new Object[]{this})).intValue();
        }
        if (this.newControl) {
            int i = this.indicatorCount;
            paddingLeft = (this.mDiameter * i) + ((i - 1) * this.mGapMargin) + getPaddingLeft();
            paddingRight = getPaddingRight();
        } else {
            int i2 = this.mTotal;
            paddingLeft = (this.mDiameter * i2) + ((i2 - 1) * this.mGapMargin) + getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        return paddingLeft + paddingRight;
    }

    private boolean isMinScaleIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff6450d0", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 0) {
            return this.minScaleFirst;
        }
        if (i != this.indicatorCount - 1) {
            return false;
        }
        return this.minScaleLast;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        canvas.drawColor(0);
        if (this.mTotal <= 1) {
            return;
        }
        int paddingTop = this.mRadius + ((int) this.mStrokeWidth) + getPaddingTop();
        int measuredWidth = ((getMeasuredWidth() - getDesiredWidth()) / 2) + getPaddingLeft() + this.mRadius + ((int) this.mStrokeWidth);
        if (this.newControl) {
            while (i < this.indicatorCount) {
                boolean isMinScaleIndex = isMinScaleIndex(i);
                this.mPaint.setColor(this.mStrokeColor);
                this.mPaint.setStyle(Paint.Style.FILL);
                if (isMinScaleIndex) {
                    canvas.drawCircle(((this.mDiameter + this.mGapMargin) * i) + measuredWidth, paddingTop, (this.mRadius * this.minScale) + this.mStrokeWidth, this.mPaint);
                } else {
                    canvas.drawCircle(((this.mDiameter + this.mGapMargin) * i) + measuredWidth, paddingTop, this.mRadius + this.mStrokeWidth, this.mPaint);
                }
                if (i == this.mFocusIndex) {
                    this.mPaint.setColor(this.mFocusColor);
                    this.mPaint.setStyle(Paint.Style.FILL);
                    canvas.drawCircle(((this.mDiameter + this.mGapMargin) * i) + measuredWidth, paddingTop, this.mRadius, this.mPaint);
                } else {
                    this.mPaint.setColor(this.mUnfocusColor);
                    this.mPaint.setStyle(Paint.Style.FILL);
                    if (isMinScaleIndex) {
                        canvas.drawCircle(((this.mDiameter + this.mGapMargin) * i) + measuredWidth, paddingTop, this.mRadius * this.minScale, this.mPaint);
                    } else {
                        canvas.drawCircle(((this.mDiameter + this.mGapMargin) * i) + measuredWidth, paddingTop, this.mRadius, this.mPaint);
                    }
                }
                i++;
            }
            return;
        }
        while (i < this.mTotal) {
            this.mPaint.setColor(this.mStrokeColor);
            this.mPaint.setStyle(Paint.Style.FILL);
            float f = paddingTop;
            canvas.drawCircle(((this.mDiameter + this.mGapMargin) * i) + measuredWidth, f, this.mRadius + this.mStrokeWidth, this.mPaint);
            if (i == this.mIndex) {
                this.mPaint.setColor(this.mFocusColor);
                this.mPaint.setStyle(Paint.Style.FILL);
                canvas.drawCircle(((this.mDiameter + this.mGapMargin) * i) + measuredWidth, f, this.mRadius, this.mPaint);
            } else {
                this.mPaint.setColor(this.mUnfocusColor);
                this.mPaint.setStyle(Paint.Style.FILL);
                canvas.drawCircle(((this.mDiameter + this.mGapMargin) * i) + measuredWidth, f, this.mRadius, this.mPaint);
            }
            i++;
        }
    }

    public void setBorderWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c811f7e1", new Object[]{this, new Float(f)});
        } else {
            this.mStrokeWidth = f;
        }
    }

    public void setBorderColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738a7ba7", new Object[]{this, new Integer(i)});
        } else {
            this.mStrokeColor = i;
        }
    }
}
