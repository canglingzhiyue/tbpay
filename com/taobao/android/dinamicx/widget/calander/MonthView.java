package com.taobao.android.dinamicx.widget.calander;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class MonthView extends BaseMonthView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(975311172);
    }

    public static /* synthetic */ Object ipc$super(MonthView monthView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void onDrawCalendarInfo(Canvas canvas, Calendar calendar, int i, int i2);

    public abstract void onDrawCurrentDayUnSelected(Canvas canvas, Calendar calendar, int i, int i2);

    public abstract void onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z);

    public abstract void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2);

    public MonthView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (this.mLineCount != 0) {
            this.mItemWidth = ((getWidth() - this.mDelegate.E()) - this.mDelegate.F()) / 7;
            onPreviewHook();
            int i = this.mLineCount * 7;
            int i2 = 0;
            int i3 = 0;
            while (i3 < this.mLineCount) {
                int i4 = i2;
                for (int i5 = 0; i5 < 7; i5++) {
                    Calendar calendar = this.mItems.get(i4);
                    if (this.mDelegate.x() == 1) {
                        if (i4 > this.mItems.size() - this.mNextDiff) {
                            return;
                        }
                        if (!calendar.isCurrentMonth()) {
                            i4++;
                        }
                    } else if (this.mDelegate.x() == 2 && i4 >= i) {
                        return;
                    }
                    draw(canvas, calendar, i3, i5, i4);
                    i4++;
                }
                i3++;
                i2 = i4;
            }
        }
    }

    private void draw(Canvas canvas, Calendar calendar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e383be39", new Object[]{this, canvas, calendar, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        int E = (i2 * this.mItemWidth) + this.mDelegate.E();
        int i4 = i * this.mItemHeight;
        onLoopStart(E, i4);
        if (i3 == this.mCurrentItem) {
            z = true;
        }
        if (calendar.containHighLightCalendarInfo()) {
            onDrawCalendarInfo(canvas, calendar, E, i4);
        }
        if (z) {
            onDrawSelected(canvas, calendar, E, i4, false);
        } else if (calendar.isCurrentDay() && this.mDelegate.i()) {
            onDrawCurrentDayUnSelected(canvas, calendar, E, i4);
        }
        onDrawText(canvas, calendar, E, i4, false, z);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Calendar index;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!this.isClick || (index = getIndex()) == null) {
        } else {
            if ((this.mDelegate.x() == 1 && !index.isCurrentMonth()) || onCalendarIntercept(index)) {
                return;
            }
            if (!isInRange(index)) {
                if (this.mDelegate.d == null) {
                    return;
                }
                this.mDelegate.d.a(index);
                return;
            }
            if (this.mDelegate.f != null) {
                this.mDelegate.f.a(index, true);
            }
            if (this.mDelegate.d != null) {
                this.mDelegate.d.a(index, true);
            }
            this.mCurrentItem = this.mItems.indexOf(index);
            if (!this.mDelegate.h() || index.isCurrentMonth() || this.mMonthViewPager == null) {
                return;
            }
            int currentItem = this.mMonthViewPager.getCurrentItem();
            this.mMonthViewPager.setCurrentItem(this.mCurrentItem < 7 ? currentItem - 1 : currentItem + 1);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        Calendar index;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        if (this.mDelegate.e == null || !this.isClick || (index = getIndex()) == null) {
            return false;
        }
        if ((this.mDelegate.x() == 1 && !index.isCurrentMonth()) || onCalendarIntercept(index)) {
            return false;
        }
        if (!isInRange(index) || this.mDelegate.G()) {
            return true;
        }
        this.mCurrentItem = this.mItems.indexOf(index);
        if (!index.isCurrentMonth() && this.mMonthViewPager != null) {
            int currentItem = this.mMonthViewPager.getCurrentItem();
            this.mMonthViewPager.setCurrentItem(this.mCurrentItem < 7 ? currentItem - 1 : currentItem + 1);
        }
        if (this.mDelegate.f != null) {
            this.mDelegate.f.a(index, true);
        }
        if (this.mDelegate.d != null) {
            this.mDelegate.d.a(index, true);
        }
        invalidate();
        return true;
    }
}
