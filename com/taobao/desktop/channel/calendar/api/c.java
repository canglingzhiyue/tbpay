package com.taobao.desktop.channel.calendar.api;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.calendar.CalendarInsertData;
import com.taobao.runtimepermission.f;
import tb.kge;
import tb.khc;
import tb.khu;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes7.dex */
    public interface a {
        void a();

        void b();
    }

    static {
        kge.a(1403385915);
    }

    public static void a(Context context, final a aVar) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("714af0f5", new Object[]{context, aVar});
            return;
        }
        try {
            if (khc.c()) {
                strArr = new String[]{"android.permission.WRITE_CALENDAR"};
            } else {
                strArr = new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};
            }
            f.a a2 = f.a(context, strArr);
            aVar.getClass();
            f.a a3 = a2.a(new Runnable() { // from class: com.taobao.desktop.channel.calendar.api.-$$Lambda$ndXvIinrXgYLEbD2KGrYKDxqR6E
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a();
                }
            });
            aVar.getClass();
            a3.b(new Runnable() { // from class: com.taobao.desktop.channel.calendar.api.-$$Lambda$eGq8WmIZcUTkUr1NWohyGbfXxiA
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.b();
                }
            }).a();
        } catch (Throwable th) {
            khu.a("CalendarServiceProtocol requestCalenderPermission error: " + th.getMessage());
        }
    }

    public static boolean a(Context context, String str, String str2, long j, long j2, long j3) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("133ee054", new Object[]{context, str, str2, new Long(j), new Long(j2), new Long(j3)})).booleanValue();
        }
        try {
            khu.a("CalendarServiceProtocol addCalendarEvent title: " + str + " description: " + str2 + " startTime: " + j + " endTime: " + j2 + " reminderMinutes: " + j3);
            CalendarInsertData calendarInsertData = new CalendarInsertData();
            calendarInsertData.setTitle(str);
            calendarInsertData.setContent(str2);
            calendarInsertData.setReminderTime(j);
            calendarInsertData.setKeepTime(j2 - j);
            calendarInsertData.setPreviousMinutes(j3);
            a2 = com.taobao.desktop.channel.calendar.b.a(context, calendarInsertData);
            StringBuilder sb = new StringBuilder();
            sb.append("CalendarServiceProtocol addCalendarEvent: ");
            sb.append(a2);
            khu.a(sb.toString());
        } catch (Throwable th) {
            khu.a("CalendarServiceProtocol addCalendarEvent error: " + th.getMessage());
        }
        return TextUtils.isEmpty(a2);
    }

    public static boolean a(Context context, String str, long j, long j2) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd102c2e", new Object[]{context, str, new Long(j), new Long(j2)})).booleanValue();
        }
        try {
            a2 = com.taobao.desktop.channel.calendar.b.a(context, str);
            khu.a("CalendarServiceProtocol queryResult: " + a2);
        } catch (Throwable th) {
            khu.a("CalendarServiceProtocol checkCalendarEvent error: " + th.getMessage());
        }
        return Boolean.parseBoolean(a2);
    }

    public static boolean b(Context context, String str, long j, long j2) {
        String b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beb9d24d", new Object[]{context, str, new Long(j), new Long(j2)})).booleanValue();
        }
        try {
            b = com.taobao.desktop.channel.calendar.b.b(context, str);
            khu.a("CalendarServiceProtocol delResult: " + b);
        } catch (Exception e) {
            khu.a("CalendarServiceProtocol delCalendarEvent error: " + e.getMessage());
        }
        return TextUtils.isEmpty(b);
    }
}
