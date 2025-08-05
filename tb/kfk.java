package tb;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson2.time.e;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import com.taobao.calendar.exception.CalendarResult;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class kfk implements kfh {

    /* renamed from: a  reason: collision with root package name */
    private static String f30035a;
    private static String b;
    private Context c;
    private kfj d = new kfj();

    static {
        kge.a(-401391902);
        kge.a(355660776);
        f30035a = "content://com.android.calendar/events";
        b = "content://com.android.calendar/reminders";
    }

    public kfk(Context context) {
        this.c = context;
    }

    private void a(Map<Integer, ScheduleDTOModule> map, kfi kfiVar) {
        if (map == null || map.isEmpty()) {
            kfiVar.a(CalendarResult.kTBCALENDAR_REMINDER_NOT_EXISTS, "");
            return;
        }
        int i = -1;
        for (Map.Entry<Integer, ScheduleDTOModule> entry : map.entrySet()) {
            if (this.c.getContentResolver().delete(ContentUris.withAppendedId(Uri.parse(f30035a), entry.getKey().intValue()), null, null) != -1) {
                i = entry.getKey().intValue();
            }
        }
        if (i > 0) {
            kfiVar.a(CalendarResult.KTCALENDAR_SUCCESS, kfn.c(map.get(Integer.valueOf(i))));
        } else {
            kfiVar.a(CalendarResult.kTBCALENDAR_REMINDER_NOT_EXISTS, "");
        }
    }

    @Override // tb.kfh
    public void a(ScheduleDTOModule scheduleDTOModule, kfi kfiVar) {
        b(scheduleDTOModule, kfiVar);
    }

    @Override // tb.kfh
    public void a(String str, String str2, kfi kfiVar) {
        b(str, str2, kfiVar);
    }

    public void b(ScheduleDTOModule scheduleDTOModule, kfi kfiVar) {
        CalendarResult calendarResult;
        int a2 = this.d.a(this.c);
        if (this.c == null || kfiVar == null) {
            return;
        }
        if (!kfn.a(scheduleDTOModule)) {
            calendarResult = CalendarResult.KTCALENDAR_INVALID_PARAM;
        } else if (!kfn.b(scheduleDTOModule)) {
            calendarResult = CalendarResult.KTCALENDAR_REMINDER_DATE_ERROR;
        } else if (a2 < 0) {
            calendarResult = CalendarResult.kTBCALENDAR_SYSTEM_ACCOUNT_ERROR;
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", scheduleDTOModule.getTitle());
            String str = "";
            String subTitle = scheduleDTOModule.getSubTitle() == null ? str : scheduleDTOModule.getSubTitle();
            StringBuilder sb = new StringBuilder();
            sb.append(subTitle);
            sb.append("\n");
            Object[] objArr = new Object[3];
            objArr[0] = Uri.encode(scheduleDTOModule.getLink());
            objArr[1] = scheduleDTOModule.getBizId() != null ? scheduleDTOModule.getBizId() : str;
            if (scheduleDTOModule.getOutId() != null) {
                str = scheduleDTOModule.getOutId();
            }
            objArr[2] = str;
            sb.append(String.format("tbopen://m.taobao.com/tbopen/index.html?packageName=com.taobao.calendar&action=ali.open.nav&module=h5&h5Url=%s&bootImage=0&visa=69c03b312acd34ae&bizId=%s&outId=%s", objArr));
            contentValues.put("description", sb.toString());
            contentValues.put("calendar_id", Integer.valueOf(a2));
            int repeatDays = scheduleDTOModule.getRepeatDays();
            if (repeatDays > 30) {
                repeatDays = 30;
            }
            contentValues.put("dtstart", Long.valueOf(kfo.a(scheduleDTOModule.getStartTime()).getTimeInMillis()));
            contentValues.put("dtend", Long.valueOf(kfo.a(scheduleDTOModule.getEndTime()).getTimeInMillis()));
            contentValues.put("hasAlarm", (Integer) 1);
            contentValues.put("eventTimezone", e.SHANGHAI_ZONE_ID_NAME);
            if (repeatDays > 1) {
                contentValues.put("rrule", "FREQ=DAILY;COUNT=" + repeatDays);
            }
            Uri insert = this.c.getContentResolver().insert(Uri.parse(f30035a), contentValues);
            if (insert != null) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(UserTrackDO.COLUMN_EVENT_ID, Long.valueOf(ContentUris.parseId(insert)));
                contentValues2.put("minutes", Long.valueOf(kfn.a("remind", 180L) / 60));
                contentValues2.put("method", (Integer) 1);
                if (this.c.getContentResolver().insert(Uri.parse(b), contentValues2) != null) {
                    calendarResult = CalendarResult.KTCALENDAR_SUCCESS;
                }
            }
            calendarResult = CalendarResult.kTBCALENDAR_OTHER_ERROR;
        }
        kfiVar.a(calendarResult, kfn.c(scheduleDTOModule));
    }

    public void b(String str, String str2, kfi kfiVar) {
        Cursor query = this.c.getContentResolver().query(Uri.parse(f30035a), null, null, null, null);
        if (this.c == null || kfiVar == null) {
            return;
        }
        ScheduleDTOModule scheduleDTOModule = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            kfiVar.a(CalendarResult.KTCALENDAR_INVALID_PARAM, null);
            return;
        }
        List<ScheduleDTOModule> c = kfl.a().c();
        if (c == null) {
            kfiVar.a(CalendarResult.kTBCALENDAR_REMINDER_NOT_EXISTS, kfn.c(null));
            return;
        }
        for (ScheduleDTOModule scheduleDTOModule2 : c) {
            if (scheduleDTOModule2 != null && str.equals(scheduleDTOModule2.getBizId()) && str2.equals(scheduleDTOModule2.getOutId())) {
                scheduleDTOModule = scheduleDTOModule2;
            }
        }
        if (scheduleDTOModule == null) {
            kfiVar.a(CalendarResult.kTBCALENDAR_REMINDER_NOT_EXISTS, kfn.c(scheduleDTOModule));
            return;
        }
        HashMap hashMap = new HashMap();
        if (query == null) {
            if (query == null) {
                return;
            }
            return;
        }
        try {
            if (query.getCount() <= 0) {
                if (query == null) {
                    return;
                }
                query.close();
                return;
            }
            query.moveToFirst();
            while (!query.isAfterLast()) {
                String string = query.getString(query.getColumnIndex("title"));
                if (!TextUtils.isEmpty(scheduleDTOModule.getTitle()) && scheduleDTOModule.getTitle().equals(string)) {
                    hashMap.put(Integer.valueOf(query.getInt(query.getColumnIndex("_id"))), scheduleDTOModule);
                }
                query.moveToNext();
            }
            if (query != null) {
                query.close();
            }
            a(hashMap, kfiVar);
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }
}
