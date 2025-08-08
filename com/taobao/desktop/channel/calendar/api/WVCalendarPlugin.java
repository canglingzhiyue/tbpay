package com.taobao.desktop.channel.calendar.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.calendar.CalendarInsertData;
import com.taobao.login4android.api.Login;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.kho;
import tb.khu;

/* loaded from: classes7.dex */
public class WVCalendarPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WV_CALENDAR_PLUGIN = "WVCalendarPlugin";

    static {
        kge.a(1483511620);
    }

    public static /* synthetic */ Object ipc$super(WVCalendarPlugin wVCalendarPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(final String str, final String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            kho.a().execute(new Runnable() { // from class: com.taobao.desktop.channel.calendar.api.-$$Lambda$WVCalendarPlugin$9Rmk7_z9cPWAXGMcJWOzZKqsCq0
                @Override // java.lang.Runnable
                public final void run() {
                    WVCalendarPlugin.this.lambda$execute$1$WVCalendarPlugin(str, str2, wVCallBackContext);
                }
            });
            return true;
        } catch (Throwable th) {
            khu.a("WVShortcutsPlugin.execute." + str + ".error: " + th.getMessage());
            wVCallBackContext.error();
            return false;
        }
    }

    public /* synthetic */ void lambda$execute$1$WVCalendarPlugin(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c35227d", new Object[]{this, str, str2, wVCallBackContext});
        } else {
            actionExecute(str, str2, wVCallBackContext);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0058, code lost:
        if (r11.equals("addCalendarEvent") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void actionExecute(java.lang.String r11, java.lang.String r12, final android.taobao.windvane.jsbridge.WVCallBackContext r13) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.desktop.channel.calendar.api.WVCalendarPlugin.actionExecute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):void");
    }

    public static /* synthetic */ void lambda$actionExecute$2(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3380a094", new Object[]{wVCallBackContext});
        } else {
            wVCallBackContext.success("");
        }
    }

    public static /* synthetic */ void lambda$actionExecute$3(r rVar, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd83cab", new Object[]{rVar, wVCallBackContext});
            return;
        }
        rVar.a("errorCode", "USER_NOT_GRANTED");
        wVCallBackContext.error(rVar);
    }

    private String queryCalendarEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("192a259b", new Object[]{this, str});
        }
        JSONObject parseObject = JSON.parseObject(str);
        khu.a("queryCalendarEvent.json" + parseObject);
        String a2 = com.taobao.desktop.channel.calendar.b.a(this.mContext, parseObject.getString("title"));
        khu.a("WVCalendarPlugin queryCalendarEvent: " + a2);
        return a2;
    }

    private String addCalendarEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c5b7af4", new Object[]{this, str});
        }
        JSONObject parseObject = JSON.parseObject(str);
        khu.a("addCalendarEvent.json" + parseObject);
        CalendarInsertData calendarInsertData = new CalendarInsertData();
        calendarInsertData.setTitle(parseObject.getString("title"));
        calendarInsertData.setContent(parseObject.getString("content"));
        calendarInsertData.setReminderTime(parseObject.getLongValue("reminderTime") * 1000);
        calendarInsertData.setKeepTime(parseObject.getLongValue("keepTime") * 1000);
        calendarInsertData.setPreviousMinutes(parseObject.getLongValue("previousMinutes"));
        calendarInsertData.setRepeatEnd(parseObject.getLongValue("repeatEnd") * 1000);
        calendarInsertData.setFreq(parseObject.getString("repeatUnit"));
        calendarInsertData.setByDay(parseObject.getString("repeatWeekList"));
        calendarInsertData.setDeepLink(parseObject.getString("deepLink"));
        calendarInsertData.setTargetUrl(parseObject.getString("targetUrl"));
        calendarInsertData.setHuaweiLink(parseObject.getString("huaweiLink"));
        calendarInsertData.setHuaweiType(parseObject.getString("huaweiType"));
        calendarInsertData.setHuaweiDesc(parseObject.getString("huaweiDesc"));
        calendarInsertData.setHuaweiImportant(parseObject.getString("huaweiImportant"));
        calendarInsertData.setButtonText(parseObject.getString("buttonText"));
        String a2 = com.taobao.desktop.channel.calendar.b.a(this.mContext, calendarInsertData);
        HashMap hashMap = new HashMap(8);
        hashMap.put("action", "addCalendarEvent");
        hashMap.put("title", calendarInsertData.getTitle());
        hashMap.put("content", calendarInsertData.getContent());
        hashMap.put("reminderTime", String.valueOf(calendarInsertData.getReminderTime()));
        hashMap.put("keepTime", String.valueOf(calendarInsertData.getKeepTime()));
        hashMap.put("previousMinutes", String.valueOf(calendarInsertData.getPreviousMinutes()));
        hashMap.put("failReason", a2);
        trackUT(hashMap);
        khu.a("WVCalendarPlugin addCalendarEvent: " + a2);
        return a2;
    }

    private String updateCalendarEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cda5f71c", new Object[]{this, str});
        }
        JSONObject parseObject = JSON.parseObject(str);
        String string = parseObject.getString("title");
        String string2 = parseObject.getString("content");
        long longValue = parseObject.getLongValue("reminderTime") * 1000;
        long longValue2 = parseObject.getLongValue("keepTime") * 1000;
        long longValue3 = parseObject.getLongValue("previousMinutes");
        long longValue4 = parseObject.getLongValue("repeatEnd") * 1000;
        String string3 = parseObject.getString("repeatUnit");
        if (string3 != null) {
            string3 = string3.toUpperCase();
        }
        String a2 = com.taobao.desktop.channel.calendar.b.a(this.mContext, -1L, string, string2, longValue, longValue2, longValue3, string3, parseObject.getString("repeatWeekList"), longValue4);
        HashMap hashMap = new HashMap(8);
        hashMap.put("action", "updateCalendarEvent");
        hashMap.put("title", string);
        hashMap.put("content", string2);
        hashMap.put("reminderTime", String.valueOf(longValue));
        hashMap.put("keepTime", String.valueOf(longValue2));
        hashMap.put("previousMinutes", String.valueOf(longValue3));
        hashMap.put("failReason", a2);
        trackUT(hashMap);
        khu.a("WVCalendarPlugin updateCalendarEvent: " + a2);
        return a2;
    }

    private String deleteCalendarEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("838ef6fe", new Object[]{this, str});
        }
        String string = JSON.parseObject(str).getString("title");
        String b = com.taobao.desktop.channel.calendar.b.b(this.mContext, string);
        HashMap hashMap = new HashMap(4);
        hashMap.put("action", "deleteCalendarEvent");
        hashMap.put("title", string);
        hashMap.put("failReason", b);
        trackUT(hashMap);
        khu.a("WVCalendarPlugin deleteCalendarEvent: " + b);
        return b;
    }

    private void trackUT(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17a0eb4", new Object[]{this, map});
            return;
        }
        try {
            String userId = Login.getUserId();
            if (StringUtils.isEmpty(userId)) {
                userId = "";
            }
            map.put("userId", userId);
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("calendar");
            uTCustomHitBuilder.setEventPage("TBCalendarEventManager");
            uTCustomHitBuilder.setProperties(map);
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
            khu.a("WVCalendarPlugin.trackMap: " + map.toString());
        } catch (Throwable th) {
            khu.a("WVCalendarPlugin.error: " + th.getMessage());
        }
    }
}
