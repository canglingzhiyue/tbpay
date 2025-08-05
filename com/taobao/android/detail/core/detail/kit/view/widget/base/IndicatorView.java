package com.taobao.android.detail.core.detail.kit.view.widget.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class IndicatorView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private int TRANSPARENT_COLOR;
    private int mBgColor;
    private int mCurrentIndex;
    private int mDividerThickness;
    private Rect mDrawRect;
    private int mEndMargin;
    private int mFgColor;
    private boolean mNeedDrawBg;
    private int mOrientation;
    private Paint mPaint;
    private int mStartMargin;
    private int mTotalCount;

    static {
        kge.a(-598586327);
    }

    public static /* synthetic */ Object ipc$super(IndicatorView indicatorView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public IndicatorView(Context context) {
        super(context);
        this.mOrientation = 0;
        this.mStartMargin = 0;
        this.mEndMargin = 0;
        this.mDividerThickness = 0;
        this.mCurrentIndex = -1;
        this.TRANSPARENT_COLOR = epo.c().getColor(R.color.detail_transparent);
        init(context);
    }

    public IndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOrientation = 0;
        this.mStartMargin = 0;
        this.mEndMargin = 0;
        this.mDividerThickness = 0;
        this.mCurrentIndex = -1;
        init(context);
    }

    public IndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mOrientation = 0;
        this.mStartMargin = 0;
        this.mEndMargin = 0;
        this.mDividerThickness = 0;
        this.mCurrentIndex = -1;
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mPaint = new Paint();
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setAntiAlias(true);
        this.mDrawRect = new Rect();
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.base.IndicatorView");
    }

    public void setColors(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf475619", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mBgColor = i;
        if (this.TRANSPARENT_COLOR == this.mBgColor) {
            z = false;
        }
        this.mNeedDrawBg = z;
        this.mFgColor = i2;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
            return;
        }
        this.mBgColor = i;
        if (this.TRANSPARENT_COLOR == this.mBgColor) {
            z = false;
        }
        this.mNeedDrawBg = z;
    }

    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
        } else {
            this.mOrientation = i;
        }
    }

    public void setMargins(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c7faaa", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mStartMargin = i;
        this.mEndMargin = i2;
    }

    public void setDividerThickness(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5f949f", new Object[]{this, new Integer(i)});
        } else {
            this.mDividerThickness = i;
        }
    }

    public void setTotalCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6425d4f", new Object[]{this, new Integer(i)});
        } else {
            this.mTotalCount = i;
        }
    }

    public void setCurrentIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90cb73e1", new Object[]{this, new Integer(i)});
            return;
        }
        this.mCurrentIndex = i;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            return;
        }
        int i2 = this.mTotalCount;
        if (i2 > 0 && (i = this.mCurrentIndex) >= 0 && i < i2) {
            int i3 = this.mOrientation;
            if (i3 == 0) {
                int i4 = this.mDividerThickness;
                int i5 = (measuredWidth - ((i2 - 1) * i4)) / i2;
                Rect rect = this.mDrawRect;
                rect.top = 0;
                rect.bottom = measuredHeight;
                rect.left = 0;
                rect.right = rect.left + (i * (i4 + i5)) + this.mStartMargin;
                if (this.mNeedDrawBg) {
                    this.mPaint.setColor(this.mBgColor);
                    canvas.drawRect(this.mDrawRect, this.mPaint);
                }
                Rect rect2 = this.mDrawRect;
                rect2.left = rect2.right;
                Rect rect3 = this.mDrawRect;
                rect3.right = ((rect3.left + i5) - this.mStartMargin) - this.mEndMargin;
                this.mPaint.setColor(this.mFgColor);
                canvas.drawRect(this.mDrawRect, this.mPaint);
                Rect rect4 = this.mDrawRect;
                rect4.left = rect4.right;
                this.mDrawRect.right = measuredWidth;
                if (!this.mNeedDrawBg) {
                    return;
                }
                this.mPaint.setColor(this.mBgColor);
                canvas.drawRect(this.mDrawRect, this.mPaint);
                return;
            } else if (1 != i3) {
                return;
            } else {
                int i6 = this.mDividerThickness;
                int i7 = (measuredHeight - ((i2 - 1) * i6)) / i2;
                Rect rect5 = this.mDrawRect;
                rect5.left = 0;
                rect5.right = measuredWidth;
                rect5.top = 0;
                rect5.bottom = rect5.top + (i * (i6 + i7)) + this.mStartMargin;
                if (this.mNeedDrawBg) {
                    this.mPaint.setColor(this.mBgColor);
                    canvas.drawRect(this.mDrawRect, this.mPaint);
                }
                Rect rect6 = this.mDrawRect;
                rect6.top = rect6.bottom;
                Rect rect7 = this.mDrawRect;
                rect7.bottom = ((rect7.top + i7) - this.mStartMargin) - this.mEndMargin;
                this.mPaint.setColor(this.mFgColor);
                canvas.drawRect(this.mDrawRect, this.mPaint);
                Rect rect8 = this.mDrawRect;
                rect8.top = rect8.bottom;
                this.mDrawRect.bottom = measuredHeight;
                if (!this.mNeedDrawBg) {
                    return;
                }
                this.mPaint.setColor(this.mBgColor);
                canvas.drawRect(this.mDrawRect, this.mPaint);
                return;
            }
        }
        Rect rect9 = this.mDrawRect;
        rect9.top = 0;
        rect9.left = 0;
        rect9.right = measuredWidth;
        rect9.bottom = measuredHeight;
        this.mPaint.setColor(this.mBgColor);
        canvas.drawRect(this.mDrawRect, this.mPaint);
    }
}
