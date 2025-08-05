package com.taobao.android.dinamicx.widget.calander;

import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.calander.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1062247425);
    }

    public static int a(String str, Date date) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cd8dc06", new Object[]{str, date})).intValue() : Integer.parseInt(new SimpleDateFormat(str).format(date));
    }

    public static int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 8 || i2 == 10 || i2 == 12) {
            i3 = 31;
        }
        if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = 30;
        }
        return i2 == 2 ? a(i) ? 29 : 28 : i3;
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;
    }

    public static int a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d16211b", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).intValue();
        }
        java.util.Calendar.getInstance().set(i, i2 - 1, 1, 12, 0, 0);
        int a2 = a(i, i2, i4);
        int a3 = a(i, i2);
        return (((a2 + a3) + b(i, i2, a3, i4)) / 7) * i3;
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5ae76ce", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue() : i5 == 0 ? i3 * 6 : a(i, i2, i3, i4);
    }

    public static int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i, i2 - 1, 1, 12, 0, 0);
        int i4 = calendar.get(7);
        if (i3 == 1) {
            return i4 - 1;
        }
        if (i3 == 2) {
            if (i4 != 1) {
                return i4 - i3;
            }
            return 6;
        } else if (i4 != 7) {
            return i4;
        } else {
            return 0;
        }
    }

    public static int b(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8dfaa60d", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue() : b(i, i2, a(i, i2), i3);
    }

    private static int b(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("315a901c", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).intValue();
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i, i2 - 1, i3);
        int i5 = calendar.get(7);
        if (i4 == 1) {
            return 7 - i5;
        }
        if (i4 == 2) {
            if (i5 != 1) {
                return (7 - i5) + 1;
            }
            return 0;
        } else if (i5 != 7) {
            return (7 - i5) - 1;
        } else {
            return 6;
        }
    }

    public static boolean a(Calendar calendar, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee36d93c", new Object[]{calendar, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)})).booleanValue();
        }
        if (calendar == null) {
            return false;
        }
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(i, i2 - 1, i3);
        long timeInMillis = calendar2.getTimeInMillis();
        calendar2.set(i4, i5 - 1, i6);
        long timeInMillis2 = calendar2.getTimeInMillis();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        long timeInMillis3 = calendar2.getTimeInMillis();
        return timeInMillis3 >= timeInMillis && timeInMillis3 <= timeInMillis2;
    }

    public static boolean a(Calendar calendar, List<Pair<Calendar, Calendar>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2388cf0d", new Object[]{calendar, list})).booleanValue();
        }
        if (list == null) {
            return false;
        }
        for (Pair<Calendar, Calendar> pair : list) {
            if (calendar.compareTo((Calendar) pair.first) >= 0 && calendar.compareTo((Calendar) pair.second) <= 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Calendar calendar, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f1645fcc", new Object[]{calendar, bVar})).booleanValue() : a(calendar, bVar.q(), bVar.v(), bVar.H(), bVar.r(), bVar.w(), bVar.I()) && !a(calendar, bVar.a());
    }

    public static void b(Calendar calendar, b bVar) {
        HashMap<String, Calendar> b;
        Calendar calendar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed11ce7", new Object[]{calendar, bVar});
        } else if (!a(calendar, bVar) || (b = bVar.b()) == null) {
        } else {
            String dateString = calendar.getDateString();
            if (!b.containsKey(dateString) || (calendar2 = b.get(dateString)) == null) {
                return;
            }
            calendar.setBooked(calendar2.isBooked());
            calendar.setCalendarInfo(calendar2.getCalendarInfo());
        }
    }

    public static void a(Calendar calendar, Calendar calendar2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81b53c8", new Object[]{calendar, calendar2});
            return;
        }
        if (calendar == null || !calendar.hasBackgroundInfo()) {
            z = false;
        }
        boolean hasBackgroundInfo = calendar2.hasBackgroundInfo();
        if (!z) {
            if (!hasBackgroundInfo) {
                return;
            }
            calendar2.setRoundRectType(hasBackgroundInfo ? Calendar.RoundRectType.ALL : Calendar.RoundRectType.NONE);
        } else if (!hasBackgroundInfo) {
        } else {
            if (calendar.getRoundRectType() == Calendar.RoundRectType.ALL) {
                calendar.setRoundRectType(Calendar.RoundRectType.LEFT);
            } else if (calendar.getRoundRectType() == Calendar.RoundRectType.RIGHT) {
                calendar.setRoundRectType(Calendar.RoundRectType.NONE);
            }
            calendar2.setRoundRectType(Calendar.RoundRectType.RIGHT);
        }
    }

    public static int b(Calendar calendar, Calendar calendar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b9465bc", new Object[]{calendar, calendar2})).intValue();
        }
        if (calendar == null) {
            return Integer.MIN_VALUE;
        }
        if (calendar2 == null) {
            return Integer.MAX_VALUE;
        }
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        calendar3.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay(), 12, 0, 0);
        long timeInMillis = calendar3.getTimeInMillis();
        calendar3.set(calendar2.getYear(), calendar2.getMonth() - 1, calendar2.getDay(), 12, 0, 0);
        return (int) ((timeInMillis - calendar3.getTimeInMillis()) / 86400000);
    }

    public static int a(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b020d77b", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)})).intValue();
        }
        Calendar calendar = new Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        Calendar calendar2 = new Calendar();
        calendar2.setYear(i4);
        calendar2.setMonth(i5);
        calendar2.setDay(i6);
        return calendar.compareTo(calendar2);
    }

    public static boolean a(List<Pair<Calendar, Calendar>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{list})).booleanValue();
        }
        if (list == null) {
            return false;
        }
        for (Pair<Calendar, Calendar> pair : list) {
            if (((Calendar) pair.second).compareTo((Calendar) pair.first) < 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Calendar> a(int i, int i2, b bVar) {
        int i3;
        int a2;
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9e4fb62f", new Object[]{new Integer(i), new Integer(i2), bVar});
        }
        int i7 = i2 - 1;
        java.util.Calendar.getInstance().set(i, i7, 1);
        int a3 = a(i, i2, bVar.z());
        int a4 = a(i, i2);
        ArrayList arrayList = new ArrayList();
        int i8 = 12;
        if (i2 == 1) {
            i5 = i - 1;
            int i9 = i2 + 1;
            a2 = a3 == 0 ? 0 : a(i5, 12);
            i4 = i9;
            i3 = i;
        } else if (i2 == 12) {
            i3 = i + 1;
            a2 = a3 == 0 ? 0 : a(i, i7);
            i4 = 1;
            i8 = i7;
            i5 = i;
        } else {
            int i10 = i2 + 1;
            i3 = i;
            a2 = a3 == 0 ? 0 : a(i, i7);
            i4 = i10;
            i8 = i7;
            i5 = i3;
        }
        Calendar[] calendarArr = new Calendar[2];
        int i11 = 1;
        int i12 = 0;
        for (int i13 = 42; i12 < i13; i13 = 42) {
            Calendar calendar = new Calendar();
            if (i12 < a3) {
                calendar.setYear(i5);
                calendar.setMonth(i8);
                i6 = i5;
                calendar.setDay((a2 - a3) + i12 + 1);
            } else {
                i6 = i5;
                if (i12 >= a4 + a3) {
                    calendar.setYear(i3);
                    calendar.setMonth(i4);
                    calendar.setDay(i11);
                    i11++;
                } else {
                    calendar.setYear(i);
                    calendar.setMonth(i2);
                    calendar.setCurrentMonth(true);
                    calendar.setDay((i12 - a3) + 1);
                }
            }
            if (calendar.equals(bVar.D())) {
                calendar.setCurrentDay(true);
            }
            b(calendar, bVar);
            a(i12 % 7 == 0 ? null : (Calendar) arrayList.get(i12 - 1), calendar);
            arrayList.add(calendar);
            if (i12 == 0) {
                calendarArr[0] = calendar;
            } else if (i12 == 41) {
                calendarArr[1] = calendar;
            }
            i12++;
            i5 = i6;
        }
        bVar.a(i, i2, calendarArr[0], calendarArr[1]);
        return arrayList;
    }

    public static Calendar a(int i, b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Calendar) ipChange.ipc$dispatch("376f2bc1", new Object[]{new Integer(i), bVar});
        }
        Calendar calendar = new Calendar();
        calendar.setYear((((bVar.v() + i) - 1) / 12) + bVar.q());
        calendar.setMonth((((i + bVar.v()) - 1) % 12) + 1);
        if (bVar.A() != 0) {
            int a2 = a(calendar.getYear(), calendar.getMonth());
            Calendar calendar2 = bVar.l;
            if (calendar2 == null || calendar2.getDay() == 0) {
                a2 = 1;
            } else if (a2 >= calendar2.getDay()) {
                a2 = calendar2.getDay();
            }
            calendar.setDay(a2);
        } else {
            calendar.setDay(1);
        }
        if (calendar.getYear() == bVar.D().getYear() && calendar.getMonth() == bVar.D().getMonth()) {
            z = true;
        }
        calendar.setCurrentMonth(z);
        calendar.setCurrentDay(calendar.equals(bVar.D()));
        return calendar;
    }

    public static Calendar c(Calendar calendar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Calendar) ipChange.ipc$dispatch("1f635840", new Object[]{calendar, bVar});
        }
        if (a(bVar.D(), bVar) && bVar.A() != 2) {
            return bVar.J();
        }
        if (a(calendar, bVar)) {
            return calendar;
        }
        if (bVar.K().isSameMonth(calendar)) {
            return bVar.K();
        }
        return bVar.L();
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b119b7", new Object[]{new Integer(i), new Integer(i2)});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("-");
        sb.append(i2 < 10 ? "0" : "");
        sb.append(i2);
        sb.append("-01");
        return sb.toString();
    }
}
