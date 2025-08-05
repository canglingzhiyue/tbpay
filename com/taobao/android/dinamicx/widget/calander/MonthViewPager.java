package com.taobao.android.dinamicx.widget.calander;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public final class MonthViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isUpdateMonthView;
    private boolean isUsingScrollToCalendar;
    private int mCurrentViewHeight;
    private b mDelegate;
    private int mMonthCount;
    private int mNextViewHeight;
    private int mPreViewHeight;
    public WeekBar mWeekBar;

    static {
        kge.a(1176443103);
    }

    public static /* synthetic */ Object ipc$super(MonthViewPager monthViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1695733278) {
            super.setCurrentItem(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue());
            return null;
        } else if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        } else {
            if (hashCode != -407533570) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
    }

    public static /* synthetic */ b access$100(MonthViewPager monthViewPager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a7837bf8", new Object[]{monthViewPager}) : monthViewPager.mDelegate;
    }

    public static /* synthetic */ int access$200(MonthViewPager monthViewPager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("413f9b5c", new Object[]{monthViewPager})).intValue() : monthViewPager.mPreViewHeight;
    }

    public static /* synthetic */ int access$300(MonthViewPager monthViewPager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1d01171d", new Object[]{monthViewPager})).intValue() : monthViewPager.mCurrentViewHeight;
    }

    public static /* synthetic */ int access$400(MonthViewPager monthViewPager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f8c292de", new Object[]{monthViewPager})).intValue() : monthViewPager.mNextViewHeight;
    }

    public static /* synthetic */ boolean access$500(MonthViewPager monthViewPager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d4840eb0", new Object[]{monthViewPager})).booleanValue() : monthViewPager.isUsingScrollToCalendar;
    }

    public static /* synthetic */ boolean access$502(MonthViewPager monthViewPager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("905d89ea", new Object[]{monthViewPager, new Boolean(z)})).booleanValue();
        }
        monthViewPager.isUsingScrollToCalendar = z;
        return z;
    }

    public static /* synthetic */ void access$600(MonthViewPager monthViewPager, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51b038d", new Object[]{monthViewPager, new Integer(i), new Integer(i2)});
        } else {
            monthViewPager.updateMonthViewHeight(i, i2);
        }
    }

    public static /* synthetic */ int access$700(MonthViewPager monthViewPager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8c070621", new Object[]{monthViewPager})).intValue() : monthViewPager.mMonthCount;
    }

    public static /* synthetic */ boolean access$800(MonthViewPager monthViewPager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("67c881f3", new Object[]{monthViewPager})).booleanValue() : monthViewPager.isUpdateMonthView;
    }

    public MonthViewPager(Context context) {
        this(context, null);
    }

    public MonthViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isUsingScrollToCalendar = false;
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
            return;
        }
        b bVar = this.mDelegate;
        if (bVar == null) {
            return;
        }
        bVar.c(z);
    }

    public void setup(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d9723dc", new Object[]{this, bVar});
            return;
        }
        this.mDelegate = bVar;
        updateMonthViewHeight(this.mDelegate.D().getYear(), this.mDelegate.D().getMonth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.mCurrentViewHeight;
        setLayoutParams(layoutParams);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setAdapter(new a());
        addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.taobao.android.dinamicx.widget.calander.MonthViewPager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                float access$300;
                int access$400;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                } else if (MonthViewPager.access$100(MonthViewPager.this).x() == 0) {
                } else {
                    if (i < MonthViewPager.this.getCurrentItem()) {
                        access$300 = MonthViewPager.access$200(MonthViewPager.this) * (1.0f - f);
                        access$400 = MonthViewPager.access$300(MonthViewPager.this);
                    } else {
                        access$300 = MonthViewPager.access$300(MonthViewPager.this) * (1.0f - f);
                        access$400 = MonthViewPager.access$400(MonthViewPager.this);
                    }
                    ViewGroup.LayoutParams layoutParams = MonthViewPager.this.getLayoutParams();
                    layoutParams.height = (int) (access$300 + (access$400 * f));
                    MonthViewPager.this.setLayoutParams(layoutParams);
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    return;
                }
                Calendar a2 = com.taobao.android.dinamicx.widget.calander.a.a(i, MonthViewPager.access$100(MonthViewPager.this));
                if (MonthViewPager.this.getVisibility() == 0) {
                    if (MonthViewPager.access$100(MonthViewPager.this).l != null && a2.getYear() != MonthViewPager.access$100(MonthViewPager.this).l.getYear() && MonthViewPager.access$100(MonthViewPager.this).g != null) {
                        MonthViewPager.access$100(MonthViewPager.this);
                        a2.getYear();
                    }
                    MonthViewPager.access$100(MonthViewPager.this).l = a2;
                }
                if (MonthViewPager.access$100(MonthViewPager.this).h != null) {
                    MonthViewPager.access$100(MonthViewPager.this).h.a(a2.getYear(), a2.getMonth());
                }
                if (MonthViewPager.access$100(MonthViewPager.this).C() == 0) {
                    if (!a2.isCurrentMonth()) {
                        MonthViewPager.access$100(MonthViewPager.this).k = a2;
                    } else {
                        MonthViewPager.access$100(MonthViewPager.this).k = com.taobao.android.dinamicx.widget.calander.a.c(a2, MonthViewPager.access$100(MonthViewPager.this));
                    }
                    MonthViewPager.access$100(MonthViewPager.this).l = MonthViewPager.access$100(MonthViewPager.this).k;
                } else if (a2.isSameMonth(MonthViewPager.access$100(MonthViewPager.this).k)) {
                    MonthViewPager.access$100(MonthViewPager.this).l = MonthViewPager.access$100(MonthViewPager.this).k;
                }
                if (!MonthViewPager.access$500(MonthViewPager.this) && MonthViewPager.access$100(MonthViewPager.this).C() == 0) {
                    MonthViewPager.this.mWeekBar.onDateSelected(MonthViewPager.access$100(MonthViewPager.this).k, MonthViewPager.access$100(MonthViewPager.this).z(), false);
                    if (MonthViewPager.access$100(MonthViewPager.this).d != null && MonthViewPager.access$100(MonthViewPager.this).k != null) {
                        MonthViewPager.access$100(MonthViewPager.this).d.a(MonthViewPager.access$100(MonthViewPager.this).k, false);
                    }
                }
                BaseMonthView baseMonthView = (BaseMonthView) MonthViewPager.this.findViewWithTag(Integer.valueOf(i));
                if (baseMonthView != null) {
                    int selectedIndex = baseMonthView.getSelectedIndex(MonthViewPager.access$100(MonthViewPager.this).l);
                    if (MonthViewPager.access$100(MonthViewPager.this).C() == 0) {
                        baseMonthView.mCurrentItem = selectedIndex;
                    }
                    baseMonthView.invalidate();
                    if (MonthViewPager.access$100(MonthViewPager.this).i != null) {
                        MonthViewPager.access$100(MonthViewPager.this).i.a(MonthViewPager.access$100(MonthViewPager.this).k, com.taobao.android.dinamicx.widget.calander.a.b(a2.getYear(), a2.getMonth()), MonthViewPager.access$100(MonthViewPager.this).a(a2.getYear(), a2.getMonth()));
                    }
                }
                MonthViewPager.access$600(MonthViewPager.this, a2.getYear(), a2.getMonth());
                MonthViewPager.access$502(MonthViewPager.this, false);
            }
        });
    }

    private void updateMonthViewHeight(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d357baa", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mDelegate.x() == 0) {
            this.mCurrentViewHeight = this.mDelegate.u() * 6;
            getLayoutParams().height = this.mCurrentViewHeight;
        } else {
            this.mCurrentViewHeight = com.taobao.android.dinamicx.widget.calander.a.a(i, i2, this.mDelegate.u(), this.mDelegate.z(), this.mDelegate.x());
            if (i2 == 1) {
                this.mPreViewHeight = com.taobao.android.dinamicx.widget.calander.a.a(i - 1, 12, this.mDelegate.u(), this.mDelegate.z(), this.mDelegate.x());
                this.mNextViewHeight = com.taobao.android.dinamicx.widget.calander.a.a(i, 2, this.mDelegate.u(), this.mDelegate.z(), this.mDelegate.x());
                return;
            }
            this.mPreViewHeight = com.taobao.android.dinamicx.widget.calander.a.a(i, i2 - 1, this.mDelegate.u(), this.mDelegate.z(), this.mDelegate.x());
            if (i2 == 12) {
                this.mNextViewHeight = com.taobao.android.dinamicx.widget.calander.a.a(i + 1, 1, this.mDelegate.u(), this.mDelegate.z(), this.mDelegate.x());
            } else {
                this.mNextViewHeight = com.taobao.android.dinamicx.widget.calander.a.a(i, i2 + 1, this.mDelegate.u(), this.mDelegate.z(), this.mDelegate.x());
            }
        }
    }

    public void notifyDataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
            return;
        }
        this.mMonthCount = (((this.mDelegate.r() - this.mDelegate.q()) * 12) - this.mDelegate.v()) + 1 + this.mDelegate.w();
        notifyAdapterDataSetChanged();
    }

    public final void updateRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb907b", new Object[]{this});
            return;
        }
        this.isUpdateMonthView = true;
        notifyDataSetChanged();
        this.isUpdateMonthView = false;
        if (getVisibility() != 0) {
            return;
        }
        this.isUsingScrollToCalendar = false;
        Calendar calendar = this.mDelegate.j == null ? this.mDelegate.k : this.mDelegate.j;
        if (calendar == null) {
            calendar = this.mDelegate.D();
        }
        if (calendar != this.mDelegate.j && !com.taobao.android.dinamicx.widget.calander.a.a(calendar, this.mDelegate)) {
            calendar = this.mDelegate.K();
        }
        int year = (((calendar.getYear() - this.mDelegate.q()) * 12) + calendar.getMonth()) - this.mDelegate.v();
        if (getCurrentItem() != year) {
            setCurrentItem(year, false);
        }
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(year));
        if (baseMonthView != null) {
            baseMonthView.setSelectedCalendar(this.mDelegate.l);
            baseMonthView.invalidate();
        }
        if (this.mDelegate.k != null) {
            if (this.mDelegate.f != null) {
                this.mDelegate.f.a(this.mDelegate.k, false);
            }
            if (this.mDelegate.d != null) {
                this.mDelegate.d.a(this.mDelegate.k, false);
            }
        }
        updateSelected();
    }

    public void scrollToCalendar(int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed27201e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        this.isUsingScrollToCalendar = true;
        Calendar calendar = new Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        calendar.setCurrentDay(calendar.equals(this.mDelegate.D()));
        if (z3) {
            b bVar = this.mDelegate;
            bVar.l = calendar;
            bVar.k = calendar;
        }
        int year = (((calendar.getYear() - this.mDelegate.q()) * 12) + calendar.getMonth()) - this.mDelegate.v();
        if (getCurrentItem() == year) {
            this.isUsingScrollToCalendar = false;
        }
        setCurrentItem(year, z);
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(year));
        if (baseMonthView != null && z3) {
            baseMonthView.setSelectedCalendar(this.mDelegate.l);
            baseMonthView.invalidate();
        }
        if (this.mDelegate.d != null && z2 && z3) {
            this.mDelegate.d.a(calendar, false);
        }
        if (this.mDelegate.f != null && z3) {
            this.mDelegate.f.a(calendar, false);
        }
        if (this.mDelegate.h != null) {
            this.mDelegate.h.a(calendar.getYear(), calendar.getMonth());
        }
        updateSelected();
    }

    public void scrollToCurrent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11694f9c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isUsingScrollToCalendar = true;
        int year = (((this.mDelegate.D().getYear() - this.mDelegate.q()) * 12) + this.mDelegate.D().getMonth()) - this.mDelegate.v();
        if (getCurrentItem() == year) {
            this.isUsingScrollToCalendar = false;
        }
        setCurrentItem(year, z);
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(year));
        if (baseMonthView != null && this.mDelegate.D().equals(this.mDelegate.k)) {
            baseMonthView.setSelectedCalendar(this.mDelegate.D());
            baseMonthView.invalidate();
        }
        if (this.mDelegate.d == null || getVisibility() != 0 || this.mDelegate.k == null) {
            return;
        }
        this.mDelegate.d.a(this.mDelegate.k, false);
    }

    public void updateSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d72590b", new Object[]{this});
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i);
            baseMonthView.setSelectedCalendar(this.mDelegate.k);
            baseMonthView.invalidate();
        }
    }

    public final void updateStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3631aef", new Object[]{this});
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i);
            baseMonthView.updateStyle();
            baseMonthView.invalidate();
        }
    }

    public void updateScheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98e5cd55", new Object[]{this});
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((BaseMonthView) getChildAt(i)).update();
        }
    }

    public final void updateItemHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942d76ca", new Object[]{this});
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i);
            baseMonthView.updateItemHeight();
            baseMonthView.requestLayout();
        }
        Calendar calendar = this.mDelegate.l;
        if (calendar == null) {
            calendar = this.mDelegate.D();
        }
        if (!com.taobao.android.dinamicx.widget.calander.a.a(calendar, this.mDelegate)) {
            calendar = this.mDelegate.K();
        }
        int year = calendar.getYear();
        int month = calendar.getMonth();
        this.mCurrentViewHeight = com.taobao.android.dinamicx.widget.calander.a.a(year, month, this.mDelegate.u(), this.mDelegate.z(), this.mDelegate.x());
        if (month == 1) {
            this.mPreViewHeight = com.taobao.android.dinamicx.widget.calander.a.a(year - 1, 12, this.mDelegate.u(), this.mDelegate.z(), this.mDelegate.x());
            this.mNextViewHeight = com.taobao.android.dinamicx.widget.calander.a.a(year, 2, this.mDelegate.u(), this.mDelegate.z(), this.mDelegate.x());
        } else {
            this.mPreViewHeight = com.taobao.android.dinamicx.widget.calander.a.a(year, month - 1, this.mDelegate.u(), this.mDelegate.z(), this.mDelegate.x());
            if (month == 12) {
                this.mNextViewHeight = com.taobao.android.dinamicx.widget.calander.a.a(year + 1, 1, this.mDelegate.u(), this.mDelegate.z(), this.mDelegate.x());
            } else {
                this.mNextViewHeight = com.taobao.android.dinamicx.widget.calander.a.a(year, month + 1, this.mDelegate.u(), this.mDelegate.z(), this.mDelegate.x());
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.mCurrentViewHeight;
        setLayoutParams(layoutParams);
    }

    private void notifyAdapterDataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc715829", new Object[]{this});
        } else if (getAdapter() == null) {
        } else {
            getAdapter().notifyDataSetChanged();
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue() : this.mDelegate.y() && super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue() : this.mDelegate.y() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v4.view.ViewPager
    public void setCurrentItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
        } else {
            setCurrentItem(i, true);
        }
    }

    @Override // android.support.v4.view.ViewPager
    public void setCurrentItem(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aed29e2", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (Math.abs(getCurrentItem() - i) > 1) {
            super.setCurrentItem(i, false);
        } else {
            super.setCurrentItem(i, z);
        }
    }

    /* loaded from: classes5.dex */
    public final class a extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1882528308);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 50642664) {
                return new Integer(super.getItemPosition(objArr[0]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        private a() {
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : MonthViewPager.access$700(MonthViewPager.this);
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getItemPosition(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
            }
            if (!MonthViewPager.access$800(MonthViewPager.this)) {
                return super.getItemPosition(obj);
            }
            return -2;
        }

        @Override // android.support.v4.view.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view.equals(obj);
        }

        @Override // android.support.v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            int v = (((MonthViewPager.access$100(MonthViewPager.this).v() + i) - 1) / 12) + MonthViewPager.access$100(MonthViewPager.this).q();
            int v2 = (((MonthViewPager.access$100(MonthViewPager.this).v() + i) - 1) % 12) + 1;
            CustomMonthView customMonthView = new CustomMonthView(MonthViewPager.this.getContext());
            MonthViewPager monthViewPager = MonthViewPager.this;
            customMonthView.mMonthViewPager = monthViewPager;
            customMonthView.setup(MonthViewPager.access$100(monthViewPager));
            customMonthView.setTag(Integer.valueOf(i));
            customMonthView.initMonthWithDate(v, v2);
            customMonthView.setSelectedCalendar(MonthViewPager.access$100(MonthViewPager.this).k);
            viewGroup.addView(customMonthView);
            if (i == MonthViewPager.this.getCurrentItem() && MonthViewPager.access$100(MonthViewPager.this).i != null) {
                MonthViewPager.access$100(MonthViewPager.this).i.a(MonthViewPager.access$100(MonthViewPager.this).k, com.taobao.android.dinamicx.widget.calander.a.b(v, v2), MonthViewPager.access$100(MonthViewPager.this).a(v, v2));
            }
            return customMonthView;
        }

        @Override // android.support.v4.view.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
                return;
            }
            BaseView baseView = (BaseView) obj;
            baseView.onDestroy();
            viewGroup.removeView(baseView);
        }
    }
}
