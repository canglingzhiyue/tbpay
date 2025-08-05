package com.taobao.desktop.channel.calendar.api;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.calendar.CalendarInsertData;
import tb.kge;
import tb.kho;
import tb.khu;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(230519154);
    }

    public static /* synthetic */ void lambda$Zzjve7JRnDyrS4RoF3vIh9mVLo0(String str, Context context, JSONObject jSONObject, d dVar) {
        a(str, context, jSONObject, dVar);
    }

    public static void a(final Context context, final String str, final JSONObject jSONObject, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea9204b", new Object[]{context, str, jSONObject, dVar});
        } else {
            kho.a().execute(new Runnable() { // from class: com.taobao.desktop.channel.calendar.api.-$$Lambda$b$Zzjve7JRnDyrS4RoF3vIh9mVLo0
                @Override // java.lang.Runnable
                public final void run() {
                    b.lambda$Zzjve7JRnDyrS4RoF3vIh9mVLo0(str, context, jSONObject, dVar);
                }
            });
        }
    }

    public static /* synthetic */ void a(String str, Context context, JSONObject jSONObject, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7063f7", new Object[]{str, context, jSONObject, dVar});
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -2130661467) {
            if (hashCode != -1259780487) {
                if (hashCode == -317506442 && str.equals(com.taobao.desktop.channel.calendar.a.CALENDAR_EVENT_REMOVE)) {
                    c = 2;
                }
            } else if (str.equals(com.taobao.desktop.channel.calendar.a.CALENDAR_EVENT_ADD)) {
                c = 0;
            }
        } else if (str.equals(com.taobao.desktop.channel.calendar.a.CALENDAR_EVENT_QUERY)) {
            c = 1;
        }
        if (c == 0) {
            dVar.a(a(context, jSONObject));
        } else if (c == 1) {
            dVar.a(b(context, jSONObject));
        } else if (c == 2) {
            dVar.a(c(context, jSONObject));
        } else {
            dVar.b("api not find");
        }
    }

    private static String a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("caf28410", new Object[]{context, jSONObject});
        }
        try {
            CalendarInsertData calendarInsertData = new CalendarInsertData();
            calendarInsertData.setTitle(jSONObject.getString("title"));
            calendarInsertData.setContent(jSONObject.getString("content"));
            calendarInsertData.setReminderTime(jSONObject.getLongValue("start"));
            if (jSONObject.getLongValue("end") == 0) {
                calendarInsertData.setKeepTime(300000L);
            } else {
                calendarInsertData.setKeepTime(jSONObject.getLongValue("end") - jSONObject.getLongValue("start"));
            }
            calendarInsertData.setPreviousMinutes(jSONObject.getLongValue("alarmOffset"));
            JSONObject jSONObject2 = (JSONObject) jSONObject.get("repeatRule");
            if (jSONObject2 != null) {
                String string = jSONObject2.getString("mode");
                calendarInsertData.setFreq(jSONObject2.getString("mode"));
                if (string.equals("weekly") && TextUtils.isEmpty(jSONObject2.getString("daysOfTheWeek"))) {
                    return "PARAM_INVALID";
                }
                if (jSONObject2.getLong("end").longValue() < System.currentTimeMillis()) {
                    return com.taobao.desktop.channel.calendar.a.CALENDAR_ERROR_INVALIDATE_END_TIME;
                }
                calendarInsertData.setByDay(jSONObject2.getString("daysOfTheWeek"));
                calendarInsertData.setRepeatEnd(jSONObject2.getLong("end").longValue());
            }
            String a2 = com.taobao.desktop.channel.calendar.b.a(context, calendarInsertData);
            khu.b("CalendarServiceHub addCalendarEvent: " + a2);
            return a2;
        } catch (Exception e) {
            khu.b("CalendarServiceHub addCalenderEvent error: " + e.getMessage());
            return com.taobao.desktop.channel.calendar.a.CALENDAR_ERROR_CATCH;
        }
    }

    private static String b(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8e5e9ef", new Object[]{context, jSONObject});
        }
        try {
            String a2 = com.taobao.desktop.channel.calendar.b.a(context, jSONObject.getString("title"));
            khu.b("CalendarServiceHub queryCalendarEvent: " + a2);
            return a2;
        } catch (Exception e) {
            khu.b("CalendarServiceHub queryCalendarEvent error: " + e.getMessage());
            return com.taobao.desktop.channel.calendar.a.CALENDAR_ERROR_CATCH;
        }
    }

    private static String c(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86d94fce", new Object[]{context, jSONObject});
        }
        try {
            String b = com.taobao.desktop.channel.calendar.b.b(context, jSONObject.getString("title"));
            khu.b("CalendarServiceHub delCalendarEvent: " + b);
            return b;
        } catch (Exception e) {
            khu.b("CalendarServiceHub delCalendarEvent error: " + e.getMessage());
            return com.taobao.desktop.channel.calendar.a.CALENDAR_ERROR_CATCH;
        }
    }
}
