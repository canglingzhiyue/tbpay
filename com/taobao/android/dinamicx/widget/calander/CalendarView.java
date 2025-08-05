package com.taobao.android.dinamicx.widget.calander;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class CalendarView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final com.taobao.android.dinamicx.widget.calander.b mDelegate;
    private MonthViewPager mMonthPager;
    private WeekBar mWeekBar;
    private View mWeekLine;

    /* loaded from: classes5.dex */
    public interface a {
        boolean a(Calendar calendar);
    }

    /* loaded from: classes5.dex */
    public interface b {
    }

    /* loaded from: classes5.dex */
    public interface c {
        void a(Calendar calendar);

        void a(Calendar calendar, boolean z);
    }

    /* loaded from: classes5.dex */
    public interface d {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface e {
        void a(Calendar calendar, boolean z);
    }

    /* loaded from: classes5.dex */
    public interface f {
        void a(int i, int i2);
    }

    /* loaded from: classes5.dex */
    public interface g {
        void a(Calendar calendar, String str, Pair<String, String> pair);
    }

    /* loaded from: classes5.dex */
    public interface h {
    }

    static {
        kge.a(1062266532);
    }

    public static /* synthetic */ Object ipc$super(CalendarView calendarView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ com.taobao.android.dinamicx.widget.calander.b access$000(CalendarView calendarView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.widget.calander.b) ipChange.ipc$dispatch("ce30f252", new Object[]{calendarView}) : calendarView.mDelegate;
    }

    public static /* synthetic */ MonthViewPager access$100(CalendarView calendarView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MonthViewPager) ipChange.ipc$dispatch("d7128823", new Object[]{calendarView}) : calendarView.mMonthPager;
    }

    public static /* synthetic */ WeekBar access$200(CalendarView calendarView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeekBar) ipChange.ipc$dispatch("82c44f37", new Object[]{calendarView}) : calendarView.mWeekBar;
    }

    public CalendarView(Context context) {
        this(context, null);
    }

    public CalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDelegate = new com.taobao.android.dinamicx.widget.calander.b(context, attributeSet);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.datepicker_layout_calendar_view, (ViewGroup) this, true);
        this.mWeekBar = new WeekBar(context);
        ((FrameLayout) findViewById(R.id.frameContent)).addView(this.mWeekBar, 2);
        this.mWeekBar.setup(this.mDelegate);
        this.mWeekBar.onWeekStartChange(this.mDelegate.z());
        this.mWeekLine = findViewById(R.id.line);
        this.mWeekLine.setBackgroundColor(this.mDelegate.n());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mWeekLine.getLayoutParams();
        layoutParams.setMargins(this.mDelegate.o(), this.mDelegate.p(), this.mDelegate.o(), 0);
        this.mWeekLine.setLayoutParams(layoutParams);
        this.mMonthPager = (MonthViewPager) findViewById(R.id.vp_month);
        this.mMonthPager.mWeekBar = this.mWeekBar;
        this.mDelegate.f = new e() { // from class: com.taobao.android.dinamicx.widget.calander.CalendarView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.widget.calander.CalendarView.e
            public void a(Calendar calendar, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b45d83bc", new Object[]{this, calendar, new Boolean(z)});
                } else if (calendar.getYear() == CalendarView.access$000(CalendarView.this).D().getYear() && calendar.getMonth() == CalendarView.access$000(CalendarView.this).D().getMonth() && CalendarView.access$100(CalendarView.this).getCurrentItem() != CalendarView.access$000(CalendarView.this).f12092a) {
                } else {
                    CalendarView.access$000(CalendarView.this).l = calendar;
                    if (CalendarView.access$000(CalendarView.this).C() == 0 || z) {
                        CalendarView.access$000(CalendarView.this).k = calendar;
                    }
                    CalendarView.access$100(CalendarView.this).updateSelected();
                    if (CalendarView.access$200(CalendarView.this) == null) {
                        return;
                    }
                    if (CalendarView.access$000(CalendarView.this).C() != 0 && !z) {
                        return;
                    }
                    CalendarView.access$200(CalendarView.this).onDateSelected(calendar, CalendarView.access$000(CalendarView.this).z(), z);
                }
            }
        };
        this.mWeekBar.onDateSelected(this.mDelegate.k, this.mDelegate.z(), false);
        this.mMonthPager.setup(this.mDelegate);
        this.mMonthPager.setCurrentItem(this.mDelegate.f12092a);
    }

    public void setRange(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c7118a2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else {
            setRange(i, i2, i3, i4, i5, i6, null);
        }
    }

    public void setRange(int i, int i2, int i3, int i4, int i5, int i6, List<Pair<Calendar, Calendar>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edae2193", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), list});
        } else {
            setRange(i, i2, i3, i4, i5, i6, list, null);
        }
    }

    public void setRange(int i, int i2, int i3, int i4, int i5, int i6, List<Pair<Calendar, Calendar>> list, HashMap<String, Calendar> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("404ae940", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), list, hashMap});
        } else if (com.taobao.android.dinamicx.widget.calander.a.a(i, i2, i3, i4, i5, i6) > 0) {
        } else {
            if (list != null && !com.taobao.android.dinamicx.widget.calander.a.a(list)) {
                return;
            }
            this.mDelegate.a(i, i2, i3, i4, i5, i6);
            this.mDelegate.a(list);
            this.mDelegate.a(hashMap);
            if (this.mDelegate.k != null && !isInRange(this.mDelegate.k)) {
                com.taobao.android.dinamicx.widget.calander.b bVar = this.mDelegate;
                bVar.k = bVar.K();
                com.taobao.android.dinamicx.widget.calander.b bVar2 = this.mDelegate;
                bVar2.l = bVar2.k;
            }
            this.mMonthPager.updateRange();
        }
    }

    public void setDisableRanges(List<Pair<Calendar, Calendar>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("391014", new Object[]{this, list});
        } else if (!com.taobao.android.dinamicx.widget.calander.a.a(list)) {
        } else {
            this.mDelegate.a(list);
            if (this.mDelegate.k != null && !isInRange(this.mDelegate.k)) {
                com.taobao.android.dinamicx.widget.calander.b bVar = this.mDelegate;
                bVar.k = bVar.K();
                com.taobao.android.dinamicx.widget.calander.b bVar2 = this.mDelegate;
                bVar2.l = bVar2.k;
            }
            this.mMonthPager.updateRange();
        }
    }

    public void setDateTextGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d078eeb", new Object[]{this, new Integer(i)});
        } else {
            this.mDelegate.a(i == CalendarDateTextGravity.Top.getCode() ? CalendarDateTextGravity.Top : CalendarDateTextGravity.Center);
        }
    }

    public void setDateTextFont(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb11bfd", new Object[]{this, str});
        } else {
            this.mDelegate.a(str);
        }
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
            return;
        }
        MonthViewPager monthViewPager = this.mMonthPager;
        if (monthViewPager == null) {
            return;
        }
        monthViewPager.setScrollable(z);
    }

    public void setAutoChangeMonth(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c570fce", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.dinamicx.widget.calander.b bVar = this.mDelegate;
        if (bVar == null) {
            return;
        }
        bVar.a(z);
    }

    public void setWeekBarTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e37903", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.android.dinamicx.widget.calander.b bVar = this.mDelegate;
        if (bVar == null || bVar.j() == i) {
            return;
        }
        this.mDelegate.d(i);
        WeekBar weekBar = this.mWeekBar;
        if (weekBar == null) {
            return;
        }
        weekBar.setTextColor(this.mDelegate.j());
    }

    public void setSelectedTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92db6963", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.android.dinamicx.widget.calander.b bVar = this.mDelegate;
        if (bVar == null || bVar.l() == i) {
            return;
        }
        this.mDelegate.e(i);
        MonthViewPager monthViewPager = this.mMonthPager;
        if (monthViewPager == null) {
            return;
        }
        monthViewPager.updateStyle();
    }

    public void setDateTopGap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a9f16b", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.android.dinamicx.widget.calander.b bVar = this.mDelegate;
        if (bVar == null) {
            return;
        }
        bVar.a(i);
        MonthViewPager monthViewPager = this.mMonthPager;
        if (monthViewPager == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = monthViewPager.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = com.taobao.android.dinamicx.widget.calander.a.a(getContext(), 41.0f) + i;
        this.mMonthPager.setLayoutParams(layoutParams2);
    }

    public void setItemTopPadding(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e84bd48b", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.android.dinamicx.widget.calander.b bVar = this.mDelegate;
        if (bVar == null) {
            return;
        }
        bVar.b(i);
    }

    public void setItemBottomPadding(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69af72b", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.android.dinamicx.widget.calander.b bVar = this.mDelegate;
        if (bVar == null) {
            return;
        }
        bVar.c(i);
    }

    public void setHighLightCurrentDayUnSelected(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c062ff44", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.dinamicx.widget.calander.b bVar = this.mDelegate;
        if (bVar == null) {
            return;
        }
        bVar.b(z);
    }

    public void scrollToCurrent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742caa38", new Object[]{this});
        } else {
            scrollToCurrent(false);
        }
    }

    public void scrollToCurrent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11694f9c", new Object[]{this, new Boolean(z)});
        } else {
            scrollToCurrent(z, false);
        }
    }

    public void scrollToCurrent(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc156b8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (!isInRange(this.mDelegate.D())) {
        } else {
            Calendar J = this.mDelegate.J();
            if (this.mDelegate.c != null && this.mDelegate.c.a(J)) {
                return;
            }
            if (!z2) {
                com.taobao.android.dinamicx.widget.calander.b bVar = this.mDelegate;
                bVar.k = bVar.J();
                com.taobao.android.dinamicx.widget.calander.b bVar2 = this.mDelegate;
                bVar2.l = bVar2.k;
                this.mWeekBar.onDateSelected(this.mDelegate.k, this.mDelegate.z(), false);
            } else {
                com.taobao.android.dinamicx.widget.calander.b bVar3 = this.mDelegate;
                bVar3.k = null;
                bVar3.l = null;
            }
            if (this.mMonthPager.getVisibility() != 0) {
                return;
            }
            this.mMonthPager.scrollToCurrent(z);
        }
    }

    public void scrollToNext(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccdcaed2", new Object[]{this, new Boolean(z)});
            return;
        }
        MonthViewPager monthViewPager = this.mMonthPager;
        monthViewPager.setCurrentItem(monthViewPager.getCurrentItem() + 1, z);
    }

    public void scrollToPre(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("490068b2", new Object[]{this, new Boolean(z)});
            return;
        }
        MonthViewPager monthViewPager = this.mMonthPager;
        monthViewPager.setCurrentItem(monthViewPager.getCurrentItem() - 1, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateMonthArrowStatus() {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.dinamicx.widget.calander.CalendarView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r5
            java.lang.String r2 = "54f5182b"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            com.taobao.android.dinamicx.widget.calander.MonthViewPager r0 = r5.mMonthPager
            android.support.v4.view.PagerAdapter r0 = r0.getAdapter()
            if (r0 == 0) goto L58
            int r1 = r0.getCount()
            r4 = 2
            if (r1 != r4) goto L36
            com.taobao.android.dinamicx.widget.calander.MonthViewPager r0 = r5.mMonthPager
            int r0 = r0.getCurrentItem()
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            com.taobao.android.dinamicx.widget.calander.MonthViewPager r1 = r5.mMonthPager
            int r1 = r1.getCurrentItem()
            if (r1 != 0) goto L59
            r3 = 1
            goto L59
        L36:
            int r1 = r0.getCount()
            r4 = 3
            if (r1 < r4) goto L58
            com.taobao.android.dinamicx.widget.calander.MonthViewPager r1 = r5.mMonthPager
            int r1 = r1.getCurrentItem()
            if (r1 == 0) goto L47
            r1 = 1
            goto L48
        L47:
            r1 = 0
        L48:
            com.taobao.android.dinamicx.widget.calander.MonthViewPager r4 = r5.mMonthPager
            int r4 = r4.getCurrentItem()
            int r0 = r0.getCount()
            int r0 = r0 - r2
            if (r4 == r0) goto L56
            r3 = 1
        L56:
            r0 = r1
            goto L59
        L58:
            r0 = 0
        L59:
            int r1 = com.taobao.taobao.R.id.iv_left
            java.lang.Object r1 = r5.getTag(r1)
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L68
            android.view.View r1 = (android.view.View) r1
            r1.setEnabled(r0)
        L68:
            int r0 = com.taobao.taobao.R.id.iv_right
            java.lang.Object r0 = r5.getTag(r0)
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L77
            android.view.View r0 = (android.view.View) r0
            r0.setEnabled(r3)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.calander.CalendarView.updateMonthArrowStatus():void");
    }

    public void scrollToCalendar(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf74ac76", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            scrollToCalendar(i, i2, i3, false, true);
        }
    }

    public void scrollToCalendar(int i, int i2, int i3, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b511c176", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2)});
        } else {
            scrollToCalendar(i, i2, i3, z, z2, true);
        }
    }

    public void scrollToCalendar(int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed27201e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        Calendar calendar = new Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        if (!calendar.isAvailable() || !isInRange(calendar)) {
            return;
        }
        if (this.mDelegate.c != null && this.mDelegate.c.a(calendar)) {
            return;
        }
        this.mMonthPager.scrollToCalendar(i, i2, i3, z, z2, z3);
    }

    public final void setCalendarItemHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6187a2", new Object[]{this, new Integer(i)});
        } else if (this.mDelegate.u() == i) {
        } else {
            this.mDelegate.f(i);
            this.mMonthPager.updateItemHeight();
        }
    }

    public void setOnMonthChangeListener(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("784e0d93", new Object[]{this, fVar});
        } else {
            this.mDelegate.h = fVar;
        }
    }

    public void setOnMonthUIRangeChangeListener(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e86afa9d", new Object[]{this, gVar});
        } else {
            this.mDelegate.i = gVar;
        }
    }

    public void setOnCalendarSelectListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d510e2", new Object[]{this, cVar});
        } else {
            this.mDelegate.d = cVar;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        if (this.mDelegate == null) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(com.taobao.android.weex_framework.util.a.ATOM_super, super.onSaveInstanceState());
        bundle.putSerializable("selected_calendar", this.mDelegate.k);
        bundle.putSerializable("index_calendar", this.mDelegate.l);
        return bundle;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable(com.taobao.android.weex_framework.util.a.ATOM_super);
        this.mDelegate.k = (Calendar) bundle.getSerializable("selected_calendar");
        this.mDelegate.l = (Calendar) bundle.getSerializable("index_calendar");
        if (this.mDelegate.d != null && this.mDelegate.k != null) {
            this.mDelegate.d.a(this.mDelegate.k, false);
        }
        if (this.mDelegate.l != null) {
            scrollToCalendar(this.mDelegate.l.getYear(), this.mDelegate.l.getMonth(), this.mDelegate.l.getDay());
        }
        update();
        super.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        com.taobao.android.dinamicx.widget.calander.b bVar = this.mDelegate;
        if (bVar == null) {
            super.onMeasure(i, i2);
            return;
        }
        setCalendarItemHeight(((size - bVar.p()) - this.mDelegate.e()) / 6);
        super.onMeasure(i, i2);
    }

    public void setBackground(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4d1657", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mWeekBar.setBackgroundColor(i);
        this.mWeekLine.setBackgroundColor(i2);
    }

    public void setTextColor(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f8eca8", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        com.taobao.android.dinamicx.widget.calander.b bVar = this.mDelegate;
        if (bVar == null || this.mMonthPager == null) {
            return;
        }
        bVar.a(i, i2, i3, i4, i5);
        this.mMonthPager.updateStyle();
    }

    public void setDayTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("918f3b94", new Object[]{this, new Integer(i)});
        } else {
            this.mDelegate.g(i);
        }
    }

    public void setCurrentDayTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100a7be9", new Object[]{this, new Integer(i)});
        } else {
            this.mDelegate.h(i);
        }
    }

    public final void update() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
            return;
        }
        this.mWeekBar.onWeekStartChange(this.mDelegate.z());
        this.mMonthPager.updateScheme();
    }

    public final boolean isInRange(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5159e209", new Object[]{this, calendar})).booleanValue();
        }
        com.taobao.android.dinamicx.widget.calander.b bVar = this.mDelegate;
        return bVar != null && com.taobao.android.dinamicx.widget.calander.a.a(calendar, bVar);
    }

    public final boolean isDisable(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ac6f5d9", new Object[]{this, calendar})).booleanValue();
        }
        com.taobao.android.dinamicx.widget.calander.b bVar = this.mDelegate;
        return bVar != null && com.taobao.android.dinamicx.widget.calander.a.a(calendar, bVar.a());
    }

    public void setAnchorCalendar(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db58facc", new Object[]{this, calendar});
            return;
        }
        com.taobao.android.dinamicx.widget.calander.b bVar = this.mDelegate;
        if (bVar == null) {
            return;
        }
        bVar.j = calendar;
    }
}
