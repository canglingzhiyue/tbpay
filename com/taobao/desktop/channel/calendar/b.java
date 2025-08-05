package com.taobao.desktop.channel.calendar;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson2.time.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.publisher.service.export.ayscpublish.core.PublishError;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.khc;
import tb.khu;
import tb.khw;
import tb.riy;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPPO_AUTHORITY = "com.coloros.calendar";

    /* renamed from: a  reason: collision with root package name */
    private static Uri f16941a;
    private static Uri b;
    private static Uri c;
    private static final List<String> d;
    private static final SimpleDateFormat e;
    private static Context f;

    static {
        kge.a(936667120);
        f16941a = a(CalendarContract.Calendars.CONTENT_URI, "taobao_android", "com.taobao.taobao");
        b = CalendarContract.Events.CONTENT_URI;
        c = CalendarContract.Reminders.CONTENT_URI;
        d = new ArrayList();
        e = new SimpleDateFormat("YYYYMMdd-HHmmss-");
        d.add("DAILY");
        d.add("WEEKLY");
    }

    public static Uri a(Uri uri, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("61dafaaa", new Object[]{uri, str, str2}) : uri.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", str).appendQueryParameter("account_type", str2).build();
    }

    public static boolean a(Context context) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            z2 = context.checkSelfPermission("android.permission.READ_CALENDAR") == 0;
            z = context.checkSelfPermission("android.permission.WRITE_CALENDAR") == 0;
        } else {
            z = false;
            z2 = false;
        }
        return khc.c() ? z : z2 && z;
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        if (TextUtils.isEmpty(c.a(context))) {
            b = Uri.parse("content://com.huawei.calendar/events");
        }
        if (!TextUtils.isEmpty(d.a(context))) {
            return;
        }
        f16941a = Uri.parse("content://com.coloros.calendar/calendars");
        b = Uri.parse("content://com.coloros.calendar/events");
        c = Uri.parse("content://com.coloros.calendar/reminders");
    }

    private static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        f = context;
        if (khc.c()) {
            return 1;
        }
        b(context);
        Cursor query = context.getContentResolver().query(f16941a, null, null, null, null);
        if (query == null) {
            return -1;
        }
        try {
            int count = query.getCount();
            if (count <= 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("account_name", "taobao_android");
                contentValues.put("account_type", "com.taobao.taobao");
                contentValues.put("ownerAccount", "taobao_android");
                contentValues.put("allowedReminders", "0,1");
                contentValues.put("maxReminders", "5");
                contentValues.put("isPrimary", (Integer) 0);
                contentValues.put("allowedAvailability", "0,1");
                contentValues.put("name", "Taobao Calendar");
                contentValues.put("canModifyTimeZone", (Integer) 1);
                contentValues.put("calendar_displayName", "calendar_taobao");
                contentValues.put("calendar_access_level", (Integer) 700);
                contentValues.put("canOrganizerRespond", (Integer) 0);
                context.getContentResolver().insert(f16941a, contentValues);
                query = context.getContentResolver().query(f16941a, null, null, null, null);
                if (query != null) {
                    count = query.getCount();
                }
            }
            if (count <= 0) {
                if (query != null) {
                    query.close();
                }
                return -1;
            }
            query.moveToFirst();
            int i = query.getInt(query.getColumnIndex("_id"));
            if (query != null) {
                query.close();
            }
            return i;
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        if (!a(context)) {
            return "NO_PERMISSION";
        }
        int c2 = c(context);
        if (c2 < 0) {
            return a.CALENDAR_ERROR_ACCOUNT_INVALID;
        }
        if (khc.c()) {
            List<String> b2 = b(str);
            return (b2 == null || b2.isEmpty()) ? "false" : "true";
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            return ((Integer) a(context, str, c2, currentTimeMillis - 31536000000L, currentTimeMillis + 31536000000L).first).intValue() > 0 ? "true" : "false";
        } catch (Throwable th) {
            khu.a("CalendarManager.isEventExist.error: " + th.getMessage());
            return a.CALENDAR_ERROR_CATCH;
        }
    }

    private static Pair<Integer, String> a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("e9a60023", new Object[]{context, str, new Integer(i)}) : a(context, str, i, 0L, 0L);
    }

    private static Pair<Integer, String> a(Context context, String str, int i, long j, long j2) {
        Cursor query;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("6c13a663", new Object[]{context, str, new Integer(i), new Long(j), new Long(j2)});
        }
        Cursor cursor = null;
        if (context == null || TextUtils.isEmpty(str)) {
            return Pair.create(-1, null);
        }
        try {
            if (j > 0 && j2 > 0 && j2 - j >= 0) {
                query = context.getContentResolver().query(b, null, "calendar_id='" + i + "' and title='" + str + "' and dtstart>=" + j + " and dtstart<=" + j2, null, null);
            } else {
                query = context.getContentResolver().query(b, null, String.format("%s=? and %s=?", "calendar_id", "title"), new String[]{String.valueOf(i), str}, null);
            }
            Cursor cursor2 = query;
            try {
                if (cursor2 == null) {
                    Pair<Integer, String> create = Pair.create(-1, null);
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return create;
                } else if (cursor2.getCount() > 0) {
                    cursor2.moveToFirst();
                    Pair<Integer, String> create2 = Pair.create(Integer.valueOf(cursor2.getInt(cursor2.getColumnIndex("_id"))), cursor2.getString(cursor2.getColumnIndex("rrule")));
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return create2;
                } else {
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return Pair.create(-1, null);
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursor2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static List<Pair<Integer, String>> b(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("30b03eed", new Object[]{context, str, new Integer(i)});
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        Cursor query = context.getContentResolver().query(b, null, "calendar_id=" + i + " and title like '%" + str + "%' ", null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() <= 0) {
                if (query != null) {
                    query.close();
                }
                return null;
            }
            ArrayList arrayList = new ArrayList();
            query.moveToFirst();
            while (!query.isAfterLast()) {
                arrayList.add(Pair.create(Integer.valueOf(query.getInt(query.getColumnIndex("_id"))), query.getString(query.getColumnIndex("rrule"))));
                query.moveToNext();
            }
            if (query != null) {
                query.close();
            }
            return arrayList;
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }

    private static int a(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f9e57", new Object[]{context, new Long(j)})).intValue();
        }
        if (context == null || j < 0) {
            return -1;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = c;
        Cursor query = contentResolver.query(uri, null, "event_id=" + j, null, null);
        if (query == null) {
            return -1;
        }
        try {
            if (query.getCount() <= 0) {
                if (query != null) {
                    query.close();
                }
                return -1;
            }
            query.moveToFirst();
            int i = query.getInt(query.getColumnIndex("_id"));
            if (query != null) {
                query.close();
            }
            return i;
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }

    public static String a(Context context, CalendarInsertData calendarInsertData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("676db951", new Object[]{context, calendarInsertData});
        }
        if (context == null || calendarInsertData == null) {
            return PublishError.CODE_KFC_ERROR;
        }
        if (TextUtils.isEmpty(calendarInsertData.getTitle()) || TextUtils.isEmpty(calendarInsertData.getContent()) || calendarInsertData.getReminderTime() < 0 || calendarInsertData.getKeepTime() < 0) {
            return "PARAM_INVALID";
        }
        if (!a(context)) {
            return "NO_PERMISSION";
        }
        int c2 = c(context);
        if (c2 < 0) {
            return a.CALENDAR_ERROR_ACCOUNT_INVALID;
        }
        if (!khc.d()) {
            if (khc.c()) {
                List<String> b2 = b(calendarInsertData.getTitle());
                if (b2 == null || b2.isEmpty()) {
                    return "ALREADY_ADDED";
                }
            } else if (((Integer) a(context, calendarInsertData.getTitle(), c2).first).intValue() >= 0) {
                return "ALREADY_ADDED";
            }
        }
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT+8"), Locale.CHINA);
            gregorianCalendar.setTimeInMillis(calendarInsertData.getReminderTime());
            long time = gregorianCalendar.getTime().getTime();
            gregorianCalendar.setTimeInMillis(calendarInsertData.getKeepTime() + time);
            long time2 = gregorianCalendar.getTime().getTime();
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", calendarInsertData.getTitle());
            contentValues.put("description", calendarInsertData.getContent());
            contentValues.put("calendar_id", Integer.valueOf(c2));
            contentValues.put("dtstart", Long.valueOf(time));
            contentValues.put("hasAlarm", (Integer) 0);
            contentValues.put("eventTimezone", e.SHANGHAI_ZONE_ID_NAME);
            contentValues.put("dtend", Long.valueOf(time2));
            if (d.contains(calendarInsertData.getFreq())) {
                String a2 = a(calendarInsertData.getFreq(), calendarInsertData.getByDay(), calendarInsertData.getRepeatEnd());
                contentValues.put("rrule", a2);
                khu.a("addCalendarEvent.rrule：" + a2);
            }
            a(context, contentValues, calendarInsertData.getHuaweiLink(), calendarInsertData.getHuaweiType(), calendarInsertData.getHuaweiDesc(), calendarInsertData.getHuaweiImportant());
            a(context, contentValues, calendarInsertData);
            Uri insert = context.getContentResolver().insert(b, contentValues);
            if (insert == null) {
                return a.CALENDAR_ERROR_ADD_EVENT_FAILED;
            }
            if (calendarInsertData.getPreviousMinutes() >= 0) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(UserTrackDO.COLUMN_EVENT_ID, Long.valueOf(ContentUris.parseId(insert)));
                contentValues2.put("minutes", Long.valueOf(calendarInsertData.getPreviousMinutes()));
                contentValues2.put("method", (Integer) 1);
                if (context.getContentResolver().insert(c, contentValues2) == null) {
                    return a.CALENDAR_ERROR_REMINDER_INVALID;
                }
            }
            a(calendarInsertData.getTitle(), insert.getLastPathSegment());
            return "";
        } catch (Throwable th) {
            khu.a("CalendarManager.addCalendarEvent.error: " + th.getMessage());
            return a.CALENDAR_ERROR_CATCH;
        }
    }

    private static void a(Context context, ContentValues contentValues, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cda2b84", new Object[]{context, contentValues, str, str2, str3, str4});
        } else if (!TextUtils.isEmpty(c.a(context))) {
        } else {
            contentValues.put("hwext_service_description", str3);
            if (TextUtils.isEmpty(str2)) {
                str2 = "Shopping";
            }
            contentValues.put("hwext_service_type", str2);
            if (TextUtils.isEmpty(str)) {
                str = "tbopen://m.taobao.com/tbopen/index.html?action=&module=&bootImage=&h5Url=&bc_fl_src";
            }
            contentValues.put("hwext_service_cp_bz_uri", str);
            if (!TextUtils.isEmpty(str4)) {
                contentValues.put("hwext_alert_type", str4);
            }
            khu.a("CalenderHuaweiManager.serviceEnable true");
        }
    }

    private static void a(Context context, ContentValues contentValues, CalendarInsertData calendarInsertData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f789ce2b", new Object[]{context, contentValues, calendarInsertData});
        } else if (!TextUtils.isEmpty(d.a(context))) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", (Object) "");
            jSONObject.put("deeplinkUrl", (Object) calendarInsertData.getDeepLink());
            jSONObject.put("instantUrl", (Object) "");
            jSONObject.put("targetUrl", (Object) calendarInsertData.getTargetUrl());
            jSONObject.put("packageName", (Object) context.getPackageName());
            jSONObject.put("appName", (Object) "淘宝");
            jSONObject.put("appIcon", (Object) "https://img.alicdn.com/imgextra/i2/O1CN01znGs3z1pDMFUtRqtG_!!6000000005326-2-tps-80-80.png");
            jSONObject.put("buttonText", (Object) calendarInsertData.getButtonText());
            jSONObject.put("traceId", (Object) "");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ad", (Object) jSONObject);
            contentValues.put("events_json_extensions", jSONObject2.toString());
            contentValues.put("force_reminder", (Integer) 0);
            khu.a("CalenderManager addOppoParams true");
        }
    }

    public static String a(Context context, long j, String str, String str2, long j2, long j3, long j4, String str3, String str4, long j5) {
        long j6 = j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a874f3c", new Object[]{context, new Long(j6), str, str2, new Long(j2), new Long(j3), new Long(j4), str3, str4, new Long(j5)});
        }
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || j2 < 0 || j3 < 0) {
            return "PARAM_INVALID";
        }
        if (!a(context)) {
            return "NO_PERMISSION";
        }
        int c2 = c(context);
        if (c2 < 0) {
            return a.CALENDAR_ERROR_ACCOUNT_INVALID;
        }
        if (j6 < 0) {
            j6 = ((Integer) a(context, str, c2).first).intValue();
        }
        if (j6 < 0) {
            return "CANNOT_FIND_EVENT";
        }
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT+8"), Locale.CHINA);
            gregorianCalendar.setTimeInMillis(j2);
            long time = gregorianCalendar.getTime().getTime();
            gregorianCalendar.setTimeInMillis(j3 + time);
            long time2 = gregorianCalendar.getTime().getTime();
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", str);
            contentValues.put("description", str2);
            contentValues.put("dtstart", Long.valueOf(time));
            contentValues.put("dtend", Long.valueOf(time2));
            if (d.contains(str3)) {
                String a2 = a(str3, str4, j5);
                contentValues.put("rrule", a2);
                khu.a("updateCalendarEvent.rrule：" + a2);
            } else {
                contentValues.put("rrule", "");
            }
            Uri withAppendedId = ContentUris.withAppendedId(b, j6);
            int update = context.getContentResolver().update(withAppendedId, contentValues, null, null);
            if (update == -1) {
                return "UPDATE_FAILED";
            }
            khu.a("updateCalendarEvent.rows=%s: " + update);
            if (j4 >= 0) {
                int a3 = a(context, j6);
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("minutes", Long.valueOf(j4));
                contentValues2.put("method", (Integer) 1);
                if (a3 > 0) {
                    if (context.getContentResolver().update(ContentUris.withAppendedId(c, a3), contentValues2, null, null) == -1) {
                        return "UPDATE_EVENT_REMINDER_FAILED";
                    }
                } else {
                    contentValues2.put(UserTrackDO.COLUMN_EVENT_ID, Long.valueOf(ContentUris.parseId(withAppendedId)));
                    if (context.getContentResolver().insert(c, contentValues2) == null) {
                        return a.CALENDAR_ERROR_REMINDER_INVALID;
                    }
                }
            }
            return "";
        } catch (Throwable th) {
            khu.a("CalendarManager.updateCalendarEvent.error: " + th.getMessage());
            return a.CALENDAR_ERROR_CATCH;
        }
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str}) : a(context, str, khc.d());
    }

    public static String a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d00b83f6", new Object[]{context, str, new Boolean(z)});
        }
        if (context == null) {
            return "PARAM_INVALID";
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "PARAM_INVALID";
            }
            if (!a(context)) {
                return "NO_PERMISSION";
            }
            int c2 = c(context);
            if (c2 < 0) {
                return a.CALENDAR_ERROR_ACCOUNT_INVALID;
            }
            if (khc.c()) {
                List<String> b2 = b(str);
                if (b2 != null && !b2.isEmpty()) {
                    return a(context, b2);
                }
                return "";
            } else if (z) {
                List<Pair<Integer, String>> b3 = b(context, str, c2);
                if (b3 != null && !b3.isEmpty()) {
                    khu.a("CalendarManager deleteCalendarEvent list: " + b3);
                    for (Pair<Integer, String> pair : b3) {
                        a(context, ((Integer) pair.first).intValue(), (String) pair.second);
                    }
                }
                return "";
            } else {
                Pair<Integer, String> a2 = a(context, str, c2);
                return ((Integer) a2.first).intValue() < 0 ? "" : a(context, ((Integer) a2.first).intValue(), (String) a2.second);
            }
        } catch (Throwable th) {
            khu.a("CalendarManager.deleteCalendarEvent.error: " + th.getMessage());
            return a.CALENDAR_ERROR_CATCH;
        }
    }

    private static String a(Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5a36293", new Object[]{context, new Integer(i), str});
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("rrule", "");
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = b;
                if (contentResolver.update(uri, contentValues, "_id=" + i, null) < 0) {
                    return "DELETE_FAILED_ON_UPDATE_RULE";
                }
            }
            ContentResolver contentResolver2 = context.getContentResolver();
            Uri uri2 = b;
            StringBuilder sb = new StringBuilder();
            sb.append("_id=");
            sb.append(i);
            return contentResolver2.delete(uri2, sb.toString(), null) == -1 ? a.CALENDAR_ERROR_DELETE_FAILED : "";
        } catch (Throwable th) {
            khu.a("CalendarManager.deleteSingleEvent.error; " + th.getMessage());
            return "DELETE_EXCPT";
        }
    }

    private static String a(Context context, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b136f6f", new Object[]{context, list});
        }
        try {
            for (String str : list) {
                if (context.getContentResolver().delete(ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, Long.parseLong(str)), null, null) == -1) {
                    return a.CALENDAR_ERROR_DELETE_FAILED;
                }
                c(str);
            }
            return "";
        } catch (Throwable th) {
            khu.a("CalendarManager.deleteCalendarByEventId error: " + th.getMessage());
            return "DELETE_EXCEPT";
        }
    }

    private static String a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16fb04d8", new Object[]{str, str2, new Long(j)});
        }
        try {
            StringBuilder sb = new StringBuilder("FREQ=");
            sb.append(str);
            if ("WEEKLY".equals(str)) {
                String a2 = a(str2);
                if (TextUtils.isEmpty(a2)) {
                    return "PARAM_ERR_repeatWeekList";
                }
                sb.append(";WKST=SU;BYDAY=");
                sb.append(a2);
            }
            sb.append(";UNTIL=");
            sb.append(e.format(new Date(j)).replaceFirst("-", "T").replaceFirst("-", "Z"));
            return sb.toString();
        } catch (Throwable th) {
            khu.a("CalendarManager.deleteCalendarEvent.error: " + th.getMessage());
            return null;
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.replace(riy.ARRAY_START_STR, "").replace(riy.ARRAY_END_STR, "").replaceAll(" ", "").split(",");
            StringBuilder sb = new StringBuilder();
            for (String str2 : split) {
                switch (Integer.parseInt(str2)) {
                    case 1:
                        sb.append("MO");
                        break;
                    case 2:
                        sb.append("TU");
                        break;
                    case 3:
                        sb.append("WE");
                        break;
                    case 4:
                        sb.append("TH");
                        break;
                    case 5:
                        sb.append("FR");
                        break;
                    case 6:
                        sb.append("SA");
                        break;
                    case 7:
                        sb.append("SU");
                        break;
                }
                sb.append(",");
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static List<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{str});
        }
        try {
            String str2 = (String) khw.a(f).b(a.SP_CALENDER_QUERY_LOCAL, "");
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) JSONObject.parseObject(str2, new TypeReference<CopyOnWriteArrayList<JSONObject>>() { // from class: com.taobao.desktop.channel.calendar.b.1
            }, new Feature[0]);
            khu.a("calendarManger calenderQueryLocal calenderList: " + copyOnWriteArrayList);
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                if (str.equals(jSONObject.get("calendarTitle"))) {
                    khu.a("calendarManger has title: " + str);
                    arrayList.add((String) jSONObject.get("calendarEventId"));
                }
            }
            return arrayList;
        } catch (Exception e2) {
            khu.a("calendarManger calenderQueryLocal error: " + e2.getMessage());
            return null;
        }
    }

    private static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        try {
            String str3 = (String) khw.a(f).b(a.SP_CALENDER_QUERY_LOCAL, "");
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (!TextUtils.isEmpty(str3)) {
                copyOnWriteArrayList = (CopyOnWriteArrayList) JSONObject.parseObject(str3, new TypeReference<CopyOnWriteArrayList<JSONObject>>() { // from class: com.taobao.desktop.channel.calendar.b.2
                }, new Feature[0]);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("calendarTitle", (Object) str);
            jSONObject.put("calendarEventId", (Object) str2);
            copyOnWriteArrayList.add(jSONObject);
            khu.a("calendarManger calenderSaveLocal calenderList: " + copyOnWriteArrayList);
            khw.a(f).a(a.SP_CALENDER_QUERY_LOCAL, copyOnWriteArrayList.toString());
        } catch (Exception e2) {
            khu.a("calendarManger calenderSaveLocal error: " + e2.getMessage());
        }
    }

    private static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            return;
        }
        try {
            String str2 = (String) khw.a(f).b(a.SP_CALENDER_QUERY_LOCAL, "");
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) JSONObject.parseObject(str2, new TypeReference<CopyOnWriteArrayList<JSONObject>>() { // from class: com.taobao.desktop.channel.calendar.b.3
            }, new Feature[0]);
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                if (str.equals(jSONObject.get("calendarEventId"))) {
                    copyOnWriteArrayList.remove(jSONObject);
                }
            }
            khu.a("calendarManger calenderDelLocal calenderList: " + copyOnWriteArrayList);
            khw.a(f).a(a.SP_CALENDER_QUERY_LOCAL, copyOnWriteArrayList.toString());
        } catch (Exception e2) {
            khu.a("calendarManger calenderDelLocal error: " + e2.getMessage());
        }
    }
}
