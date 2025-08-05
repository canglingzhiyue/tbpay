package com.taobao.android.dinamicx.widget.calander;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class BaseMonthView extends BaseView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int mHeight;
    public int mLineCount;
    public int mMonth;
    public MonthViewPager mMonthViewPager;
    public int mNextDiff;
    public int mYear;

    static {
        kge.a(-596365837);
    }

    public static /* synthetic */ Object ipc$super(BaseMonthView baseMonthView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1808959798) {
            super.updateItemHeight();
            return null;
        } else if (hashCode != 650865254) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public Object getClickCalendarPaddingObject(float f, float f2, Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3869697b", new Object[]{this, new Float(f), new Float(f2), calendar});
        }
        return null;
    }

    @Override // com.taobao.android.dinamicx.widget.calander.BaseView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public void onLoopStart(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf3b4e6", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.android.dinamicx.widget.calander.BaseView
    public void onPreviewHook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e5f8033", new Object[]{this});
        }
    }

    public BaseMonthView(Context context) {
        super(context);
    }

    public final void initMonthWithDate(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b640d92b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mYear = i;
        this.mMonth = i2;
        initCalendar();
        this.mHeight = a.a(i, i2, this.mItemHeight, this.mDelegate.z(), this.mDelegate.x());
    }

    private void initCalendar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd2651f5", new Object[]{this});
            return;
        }
        this.mNextDiff = a.b(this.mYear, this.mMonth, this.mDelegate.z());
        int a2 = a.a(this.mYear, this.mMonth, this.mDelegate.z());
        int a3 = a.a(this.mYear, this.mMonth);
        this.mItems = a.a(this.mYear, this.mMonth, this.mDelegate);
        if (this.mItems.contains(this.mDelegate.D())) {
            this.mCurrentItem = this.mItems.indexOf(this.mDelegate.D());
        } else {
            this.mCurrentItem = this.mItems.indexOf(this.mDelegate.k);
        }
        if (this.mCurrentItem > 0 && this.mDelegate.c != null && this.mDelegate.c.a(this.mDelegate.k)) {
            this.mCurrentItem = -1;
        }
        if (this.mDelegate.x() == 0) {
            this.mLineCount = 6;
        } else {
            this.mLineCount = ((a2 + a3) + this.mNextDiff) / 7;
        }
        invalidate();
    }

    public Calendar getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Calendar) ipChange.ipc$dispatch("73e554c3", new Object[]{this});
        }
        if (this.mItemWidth != 0 && this.mItemHeight != 0) {
            if (this.mX <= this.mDelegate.E() || this.mX >= getWidth() - this.mDelegate.F()) {
                onClickCalendarPadding();
            } else {
                int E = ((int) (this.mX - this.mDelegate.E())) / this.mItemWidth;
                if (E >= 7) {
                    E = 6;
                }
                int i = ((((int) this.mY) / this.mItemHeight) * 7) + E;
                if (i >= 0 && i < this.mItems.size()) {
                    return this.mItems.get(i);
                }
                return null;
            }
        }
        return null;
    }

    private void onClickCalendarPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba973451", new Object[]{this});
        } else if (this.mDelegate.b == null) {
        } else {
            Calendar calendar = null;
            int E = ((int) (this.mX - this.mDelegate.E())) / this.mItemWidth;
            if (E >= 7) {
                E = 6;
            }
            int i = ((((int) this.mY) / this.mItemHeight) * 7) + E;
            if (i >= 0 && i < this.mItems.size()) {
                calendar = this.mItems.get(i);
            }
            if (calendar == null) {
                return;
            }
            getClickCalendarPaddingObject(this.mX, this.mY, calendar);
        }
    }

    public final void setSelectedCalendar(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4000b2", new Object[]{this, calendar});
        } else {
            this.mCurrentItem = this.mItems.indexOf(calendar);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.calander.BaseView
    public void updateItemHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942d76ca", new Object[]{this});
            return;
        }
        super.updateItemHeight();
        this.mHeight = a.a(this.mYear, this.mMonth, this.mItemHeight, this.mDelegate.z(), this.mDelegate.x());
    }

    @Override // com.taobao.android.dinamicx.widget.calander.BaseView
    public void updateCurrentDate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbd39c5", new Object[]{this});
        } else if (this.mItems != null) {
            if (this.mItems.contains(this.mDelegate.D())) {
                for (Calendar calendar : this.mItems) {
                    calendar.setCurrentDay(false);
                }
                this.mItems.get(this.mItems.indexOf(this.mDelegate.D())).setCurrentDay(true);
            }
            invalidate();
        }
    }

    public final int getSelectedIndex(Calendar calendar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d8a484eb", new Object[]{this, calendar})).intValue() : this.mItems.indexOf(calendar);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.mLineCount != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.mHeight, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
