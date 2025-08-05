package com.taobao.android.dinamicx.widget.calander;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public final class Calendar implements Serializable, Comparable<Calendar> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 141315161718191143L;
    private boolean booked;
    private a calendarInfo;
    private int day;
    private boolean isCurrentDay;
    private boolean isCurrentMonth;
    private boolean isLeapYear;
    private boolean isWeekend;
    private int leapMonth;
    private int month;
    public RoundRectType roundRectType = RoundRectType.NONE;
    private int week;
    private int year;

    /* loaded from: classes5.dex */
    public enum RoundRectType {
        NONE,
        LEFT,
        RIGHT,
        ALL
    }

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f12088a;
        public String b;

        static {
            kge.a(1615689297);
        }
    }

    static {
        kge.a(310706015);
        kge.a(1028243835);
        kge.a(415966670);
    }

    public int getYear() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1fffe3ad", new Object[]{this})).intValue() : this.year;
    }

    public void setYear(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c50c6fd", new Object[]{this, new Integer(i)});
        } else {
            this.year = i;
        }
    }

    public int getMonth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1e1d844", new Object[]{this})).intValue() : this.month;
    }

    public void setMonth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b87df2de", new Object[]{this, new Integer(i)});
        } else {
            this.month = i;
        }
    }

    public int getDay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("940115e0", new Object[]{this})).intValue() : this.day;
    }

    public void setDay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6da7bc2", new Object[]{this, new Integer(i)});
        } else {
            this.day = i;
        }
    }

    public boolean isCurrentMonth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a03e9edc", new Object[]{this})).booleanValue() : this.isCurrentMonth;
    }

    public void setCurrentMonth(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33196c4", new Object[]{this, new Boolean(z)});
        } else {
            this.isCurrentMonth = z;
        }
    }

    public boolean isCurrentDay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1bd238", new Object[]{this})).booleanValue() : this.isCurrentDay;
    }

    public void setCurrentDay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d220e8", new Object[]{this, new Boolean(z)});
        } else {
            this.isCurrentDay = z;
        }
    }

    public boolean isWeekend() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cd7c09e8", new Object[]{this})).booleanValue() : this.isWeekend;
    }

    public void setWeekend(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6a280a8", new Object[]{this, new Boolean(z)});
        } else {
            this.isWeekend = z;
        }
    }

    public int getWeek() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56ae47e4", new Object[]{this})).intValue() : this.week;
    }

    public void setWeek(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6ee9a6", new Object[]{this, new Integer(i)});
        } else {
            this.week = i;
        }
    }

    public int getLeapMonth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("da6c78bc", new Object[]{this})).intValue() : this.leapMonth;
    }

    public void setLeapMonth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b197b66", new Object[]{this, new Integer(i)});
        } else {
            this.leapMonth = i;
        }
    }

    public boolean isLeapYear() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e58fb41a", new Object[]{this})).booleanValue() : this.isLeapYear;
    }

    public void setLeapYear(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b5e4d46", new Object[]{this, new Boolean(z)});
        } else {
            this.isLeapYear = z;
        }
    }

    public boolean isBooked() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2801ce9d", new Object[]{this})).booleanValue() : this.booked;
    }

    public void setBooked(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c7fd523", new Object[]{this, new Boolean(z)});
        } else {
            this.booked = z;
        }
    }

    public a getCalendarInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f7992580", new Object[]{this}) : this.calendarInfo;
    }

    public void setCalendarInfo(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfa0ce8", new Object[]{this, aVar});
        } else {
            this.calendarInfo = aVar;
        }
    }

    public RoundRectType getRoundRectType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RoundRectType) ipChange.ipc$dispatch("be476d41", new Object[]{this}) : this.roundRectType;
    }

    public void setRoundRectType(RoundRectType roundRectType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b34fec39", new Object[]{this, roundRectType});
        } else {
            this.roundRectType = roundRectType;
        }
    }

    public boolean containHighLightCalendarInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d0d5edd7", new Object[]{this})).booleanValue() : isBooked() || this.calendarInfo != null;
    }

    public boolean hasBackgroundInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7e629c1", new Object[]{this})).booleanValue();
        }
        a aVar = this.calendarInfo;
        return aVar != null && !TextUtils.isEmpty(aVar.f12088a);
    }

    public boolean isSameMonth(Calendar calendar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8eb0e4ab", new Object[]{this, calendar})).booleanValue() : calendar != null && this.year == calendar.getYear() && this.month == calendar.getMonth();
    }

    @Override // java.lang.Comparable
    public int compareTo(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31ff2f2a", new Object[]{this, calendar})).intValue();
        }
        if (calendar != null) {
            return toString().compareTo(calendar.toString());
        }
        return 1;
    }

    public final int differ(Calendar calendar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("20e475dc", new Object[]{this, calendar})).intValue() : com.taobao.android.dinamicx.widget.calander.a.b(this, calendar);
    }

    public boolean isAvailable() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[]{this})).booleanValue();
        }
        boolean z2 = (this.year > 0) & (this.month > 0) & (this.day > 0) & (this.day <= 31) & (this.month <= 12) & (this.year >= 1900);
        if (this.year <= 2099) {
            z = true;
        }
        return z2 & z;
    }

    public long getTimeInMillis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51dc4da9", new Object[]{this})).longValue();
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(1, this.year);
        calendar.set(2, this.month - 1);
        calendar.set(5, this.day);
        return calendar.getTimeInMillis();
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj != null && (obj instanceof Calendar)) {
            Calendar calendar = (Calendar) obj;
            if (calendar.getYear() == this.year && calendar.getMonth() == this.month && calendar.getDay() == this.day) {
                return true;
            }
        }
        return super.equals(obj);
    }

    public String toString() {
        Object valueOf;
        Object valueOf2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.year);
        sb.append("");
        int i = this.month;
        if (i < 10) {
            valueOf = "0" + this.month;
        } else {
            valueOf = Integer.valueOf(i);
        }
        sb.append(valueOf);
        sb.append("");
        int i2 = this.day;
        if (i2 < 10) {
            valueOf2 = "0" + this.day;
        } else {
            valueOf2 = Integer.valueOf(i2);
        }
        sb.append(valueOf2);
        return sb.toString();
    }

    public String getDateString() {
        Object valueOf;
        Object valueOf2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc00ccc4", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.year);
        sb.append("-");
        int i = this.month;
        if (i < 10) {
            valueOf = "0" + this.month;
        } else {
            valueOf = Integer.valueOf(i);
        }
        sb.append(valueOf);
        sb.append("-");
        int i2 = this.day;
        if (i2 < 10) {
            valueOf2 = "0" + this.day;
        } else {
            valueOf2 = Integer.valueOf(i2);
        }
        sb.append(valueOf2);
        return sb.toString();
    }
}
