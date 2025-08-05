package com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.commonnavigator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ebp;
import tb.ebu;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class LineNavigator extends View implements ebp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private int mCurrentIndicatorIndex;
    private float mDownX;
    private float mDownY;
    private boolean mFollowTouch;
    private a mIndicatorClickListener;
    private int mIndicatorCount;
    private int mIndicatorHeight;
    private int mIndicatorHorizontalSpace;
    private int mIndicatorWidth;
    private int mLastVisiblePostion;
    private float mOffSet;
    private RectF[] mRectFs;
    private int mSelectedIndicatorColor;
    private int mSelectedIndicatorHeight;
    private int mSelectedIndicatorWidth;
    private boolean mTouchable;
    private int mUnSelectedIndicatorColor;

    /* loaded from: classes4.dex */
    public interface a {
    }

    static {
        kge.a(268843756);
        kge.a(1120256483);
    }

    public static /* synthetic */ Object ipc$super(LineNavigator lineNavigator, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode != -1117127205) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    @Override // tb.ebp
    public void onAttachToDetailIndicator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87831526", new Object[]{this});
        }
    }

    @Override // tb.ebp
    public void onDetachFromDetailIndicator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e331f89", new Object[]{this});
        }
    }

    @Override // tb.ebp
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ebp
    public void onPageScrolled(int i, int i2, float f, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a38f8204", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Integer(i3)});
        }
    }

    public LineNavigator(Context context) {
        super(context);
        this.mIndicatorWidth = 3;
        this.mIndicatorHeight = 3;
        this.mSelectedIndicatorWidth = 13;
        this.mSelectedIndicatorHeight = 3;
        this.mIndicatorHorizontalSpace = 3;
        this.mSelectedIndicatorColor = Color.parseColor("#FFFFFFFF");
        this.mUnSelectedIndicatorColor = Color.parseColor("#7EFFFFFF");
        this.mIndicatorCount = 4;
        this.mCurrentIndicatorIndex = 0;
        this.mOffSet = 0.0f;
        this.mFollowTouch = true;
        this.mLastVisiblePostion = 0;
        this.mContext = context;
        init(context);
        if (this.mIndicatorCount < 0) {
            this.mIndicatorCount = 0;
        }
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.commonnavigator.LineNavigator");
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mIndicatorWidth = ebu.a(context, this.mIndicatorWidth);
        this.mIndicatorHeight = ebu.a(context, this.mIndicatorHeight);
        this.mSelectedIndicatorWidth = ebu.a(context, this.mSelectedIndicatorWidth);
        this.mSelectedIndicatorHeight = ebu.a(context, this.mSelectedIndicatorHeight);
        this.mIndicatorHorizontalSpace = ebu.a(context, this.mIndicatorHorizontalSpace);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = this.mIndicatorCount;
        int i4 = (this.mIndicatorWidth * i3) + ((i3 - 1) * this.mIndicatorHorizontalSpace);
        int max = Math.max(this.mIndicatorHeight, this.mSelectedIndicatorHeight);
        int i5 = this.mCurrentIndicatorIndex;
        if (i5 >= 0 && i5 < this.mIndicatorCount) {
            i4 += this.mSelectedIndicatorWidth - this.mIndicatorWidth;
        }
        setMeasuredDimension(i4 + getPaddingLeft() + getPaddingRight(), max + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        calculateRectFs();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (this.mRectFs == null) {
            return;
        }
        paint.setColor(this.mUnSelectedIndicatorColor);
        while (true) {
            RectF[] rectFArr = this.mRectFs;
            if (i >= rectFArr.length) {
                break;
            }
            if (this.mCurrentIndicatorIndex != i) {
                RectF rectF = rectFArr[i];
                float min = Math.min(Math.abs((rectF.bottom - rectF.top) / 2.0f), Math.abs((rectF.right - rectF.left) / 2.0f));
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            i++;
        }
        int i2 = this.mCurrentIndicatorIndex;
        if (i2 < 0 || i2 >= this.mIndicatorCount) {
            return;
        }
        paint.setColor(this.mSelectedIndicatorColor);
        RectF rectF2 = this.mRectFs[this.mCurrentIndicatorIndex];
        float min2 = Math.min(Math.abs((rectF2.bottom - rectF2.top) / 2.0f), Math.abs((rectF2.right - rectF2.left) / 2.0f));
        canvas.drawRoundRect(rectF2, min2, min2, paint);
    }

    private void calculateRectFs() {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3f05de", new Object[]{this});
            return;
        }
        RectF[] rectFArr = this.mRectFs;
        if (rectFArr == null || rectFArr.length != this.mIndicatorCount) {
            this.mRectFs = new RectF[this.mIndicatorCount];
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        while (true) {
            i = this.mIndicatorCount;
            if (i4 >= i) {
                break;
            }
            if (i4 == this.mCurrentIndicatorIndex) {
                i2 = (height2 - this.mSelectedIndicatorHeight) / 2;
                i3 = this.mSelectedIndicatorWidth;
            } else {
                i2 = (height2 - this.mIndicatorHeight) / 2;
                i3 = this.mIndicatorWidth;
            }
            RectF rectF = new RectF(paddingLeft, paddingTop + i2, paddingLeft + i3, height - i2);
            paddingLeft += i3 + this.mIndicatorHorizontalSpace;
            this.mRectFs[i4] = rectF;
            i4++;
        }
        int i5 = this.mCurrentIndicatorIndex;
        if (i5 == i - 1) {
            return;
        }
        RectF[] rectFArr2 = this.mRectFs;
        if (i5 >= rectFArr2.length) {
            return;
        }
        RectF rectF2 = rectFArr2[i5];
        RectF rectF3 = rectFArr2[i5 + 1];
        float f = (rectF3.right - rectF2.right) * this.mOffSet;
        float f2 = (rectF2.left - rectF3.left) * this.mOffSet;
        rectF2.left += f;
        rectF2.right += f;
        rectF3.left += f2;
        rectF3.right += f2;
    }

    public int getCurrentPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue() : this.mCurrentIndicatorIndex;
    }

    @Override // tb.ebp
    public void setNoItemSelected(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0fa99c", new Object[]{this, new Boolean(z)});
        } else if (this.mContext == null || !z) {
        } else {
            setCurrentPosition(this.mIndicatorCount + 1);
        }
    }

    @Override // tb.ebp
    public void setCurrentPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed9025c", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            onPageSelected(i);
        } else {
            onPageSelected(0);
        }
    }

    public int getLastPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("73467e4f", new Object[]{this})).intValue() : this.mLastVisiblePostion;
    }

    @Override // tb.ebp
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        } else if (!this.mFollowTouch) {
        } else {
            this.mCurrentIndicatorIndex = i;
            this.mOffSet = f;
            postInvalidate();
        }
    }

    @Override // tb.ebp
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else if (!this.mFollowTouch) {
        } else {
            this.mCurrentIndicatorIndex = i;
            int i2 = this.mCurrentIndicatorIndex;
            if (i2 >= 0 && i2 < this.mIndicatorCount) {
                this.mLastVisiblePostion = i2;
            }
            postInvalidate();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.mTouchable) {
            this.mDownX = x;
            this.mDownY = y;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            calculateRectFs();
        }
    }

    public void notifyDataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
            return;
        }
        calculateRectFs();
        invalidate();
    }

    public void setIndicatorWidth(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("764e2631", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.mIndicatorWidth = i;
        if (!z) {
            return;
        }
        requestLayout();
    }

    public void setIndicatorHeight(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c9ef4c", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.mIndicatorHeight = i;
        if (!z) {
            return;
        }
        requestLayout();
    }

    public void setSelectedIndicatorWidth(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bee4f6c", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.mSelectedIndicatorWidth = i;
        if (!z) {
            return;
        }
        requestLayout();
    }

    public void setSelectedIndicatorHeight(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82eed71", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.mSelectedIndicatorHeight = i;
        if (!z) {
            return;
        }
        requestLayout();
    }

    public void setIndicatorHorizontalSpace(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56cc2ed", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.mIndicatorHorizontalSpace = i;
        if (!z) {
            return;
        }
        requestLayout();
    }

    public void setSelectedIndicatorColor(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f84e749", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.mSelectedIndicatorColor = i;
        if (!z) {
            return;
        }
        requestLayout();
    }

    public void setUnSelectedIndicatorColor(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b64202", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.mUnSelectedIndicatorColor = i;
        if (!z) {
            return;
        }
        requestLayout();
    }

    public void setIndicatorCount(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7237eeba", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.mIndicatorCount = i;
        this.mOffSet = 0.0f;
        int i2 = this.mCurrentIndicatorIndex;
        int i3 = this.mIndicatorCount;
        if (i2 > i3 - 1) {
            this.mIndicatorCount = i3 - 1;
        }
        if (this.mCurrentIndicatorIndex < 0) {
            this.mCurrentIndicatorIndex = 0;
        }
        if (!z) {
            return;
        }
        requestLayout();
    }

    public void setIndicatorIndex(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f6da83d", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.mCurrentIndicatorIndex = i;
        this.mOffSet = 0.0f;
        int i2 = this.mCurrentIndicatorIndex;
        int i3 = this.mIndicatorCount;
        if (i2 > i3 - 1) {
            this.mIndicatorCount = i3 - 1;
        }
        if (this.mCurrentIndicatorIndex < 0) {
            this.mCurrentIndicatorIndex = 0;
        }
        if (!z) {
            return;
        }
        requestLayout();
    }

    public boolean isTouchable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c3641a", new Object[]{this})).booleanValue() : this.mTouchable;
    }

    public void setTouchable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28c7eb6", new Object[]{this, new Boolean(z)});
        } else {
            this.mTouchable = z;
        }
    }

    public boolean isFollowTouch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("73f0990f", new Object[]{this})).booleanValue() : this.mFollowTouch;
    }

    public void setFollowTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0f7a61", new Object[]{this, new Boolean(z)});
        } else {
            this.mFollowTouch = z;
        }
    }

    public a getIndicatorClickListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3c856632", new Object[]{this}) : this.mIndicatorClickListener;
    }

    public void setXIndicatorClickListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aa95b50", new Object[]{this, aVar});
            return;
        }
        if (!this.mTouchable) {
            this.mTouchable = true;
        }
        this.mIndicatorClickListener = aVar;
    }

    @Override // tb.ebp
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mContext = null;
        this.mIndicatorClickListener = null;
        this.mRectFs = null;
    }
}
