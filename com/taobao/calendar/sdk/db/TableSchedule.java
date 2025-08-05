package com.taobao.calendar.sdk.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.task.Coordinator;
import com.taobao.calendar.sdk.TBCalendarConfig;
import com.taobao.calendar.sdk.alarm.CalendarAlarm;
import com.taobao.calendar.sdk.common.DateUtils;
import com.taobao.calendar.sdk.common.Utils;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import com.taobao.calendar.sdk.synchronize.ScheduleModel;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.android.agoo.common.AgooConstants;
import tb.kge;

/* loaded from: classes6.dex */
public class TableSchedule {
    private static final String COL_ALARM_TIME = "alarm_time";
    private static final String COL_DELETED = "deleted";
    private static final String COL_DESCRIPTION = "description";
    private static final String COL_END_TIME = "end_time";
    private static final String COL_EVENT_ID = "event_id";
    private static final String COL_ISALLDAY = "isallday";
    private static final String COL_ISEDITABLE = "iseditable";
    private static final String COL_ISREPEAT = "isrepeat";
    private static final String COL_LINK = "link";
    private static final String COL_REMIND = "remind";
    private static final String COL_REPEAT = "repeat";
    private static final String COL_SOURCE_ID = "source_id";
    private static final String COL_START_TIME = "start_time";
    private static final String COL_SYNC = "sync";
    private static final String COL_THEDATE = "thedate";
    private static final String COL_TITLE = "title";
    private static final String COL_TYPE = "type";
    private static final String COL_UID = "uid";
    private static final String COL_USER_ID = "user_id";
    public static int FAIL = 0;
    public static int SUCCESS = 0;
    public static boolean SynIngFlag = false;
    private static final String TABLE_NAME = "tsic_schedule";
    private static String TAG;
    private static String appKey;
    private static Context contextStatic;
    private static String groupName;

    /* loaded from: classes6.dex */
    public static class QueryHandler {
        static {
            kge.a(-1512681377);
        }

        public void callback(int i) {
        }

        public void callback(int i, ResultDO resultDO) {
        }

        public void callback(int i, List<ScheduleDO> list) {
        }

        public void callback(int i, List<ScheduleDO> list, String str) {
        }
    }

    static {
        kge.a(-1592812889);
        SUCCESS = 0;
        FAIL = 1;
        TAG = "TBCalendar";
        SynIngFlag = false;
        groupName = "calendar";
        appKey = null;
    }

    public static void CheckSchedule(final String str, final String str2, QueryHandler queryHandler) {
        final Handler queryHandler2 = getQueryHandler(queryHandler, 0);
        DBase.exec(new Coordinator.TaggedRunnable(TAG) { // from class: com.taobao.calendar.sdk.db.TableSchedule.7
            @Override // java.lang.Runnable
            public void run() {
                Cursor cursor = null;
                try {
                    boolean z = false;
                    cursor = DBase.getReadableDatabase(TableSchedule.contextStatic).query(TableSchedule.TABLE_NAME, new String[]{"event_id"}, "event_id = ? AND source_id = ? AND deleted = 0", new String[]{str, str2}, null, null, null);
                    if (cursor.getCount() > 0) {
                        z = true;
                    }
                    Message obtain = Message.obtain(queryHandler2);
                    obtain.what = z ? TableSchedule.SUCCESS : TableSchedule.FAIL;
                    obtain.sendToTarget();
                    if (cursor == null) {
                        return;
                    }
                    cursor.close();
                } catch (Exception unused) {
                    if (cursor == null) {
                        return;
                    }
                    cursor.close();
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
        });
    }

    public static boolean CheckSchedule(String str, String str2) {
        Cursor cursor = null;
        try {
            boolean z = true;
            cursor = DBase.getReadableDatabase(contextStatic).query(TABLE_NAME, new String[]{"event_id"}, "event_id = ? AND source_id = ? AND deleted = 0", new String[]{str, str2}, null, null, null);
            if (cursor.getCount() <= 0) {
                z = false;
            }
            if (cursor != null) {
                cursor.close();
            }
            return z;
        } catch (Exception unused) {
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static boolean cacheToDB(List<ScheduleModel> list) {
        if (list == null) {
            return false;
        }
        try {
            SQLiteDatabase writableDatabase = DBase.getWritableDatabase(contextStatic);
            boolean z = true;
            writableDatabase.beginTransaction();
            Iterator<ScheduleModel> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ScheduleModel next = it.next();
                ContentValues contentValues = new ContentValues();
                contentValues.put("uid", next.getUid());
                contentValues.put("user_id", next.getUserId());
                contentValues.put(COL_SOURCE_ID, Integer.valueOf(next.getSourceId()));
                contentValues.put("event_id", next.getEventId());
                contentValues.put("type", "");
                contentValues.put(COL_THEDATE, next.getThedate());
                contentValues.put("title", next.getTitle());
                contentValues.put("description", next.getDescription());
                contentValues.put("link", next.getLink());
                long j = 0;
                long timeInMillis = next.getStartTime() != null ? DateUtils.parseDateToCalendar(next.getStartTime()).getTimeInMillis() : 0L;
                contentValues.put(COL_START_TIME, Long.valueOf(timeInMillis));
                if (next.getEndTime() != null) {
                    j = DateUtils.parseDateToCalendar(next.getEndTime()).getTimeInMillis();
                }
                contentValues.put("end_time", Long.valueOf(j));
                contentValues.put(COL_ALARM_TIME, Long.valueOf(timeInMillis - (next.getRemind() * 1000)));
                contentValues.put(COL_REMIND, Integer.valueOf(next.getRemind()));
                Repeat repeat = new Repeat();
                repeat.parse(next.getRepeat());
                contentValues.put("repeat", repeat.toString());
                contentValues.put(COL_ISREPEAT, Integer.valueOf(next.getIsrepeat()));
                contentValues.put(COL_DELETED, Integer.valueOf(next.getDeleted()));
                contentValues.put("sync", (Integer) 2);
                contentValues.put(COL_ISALLDAY, Integer.valueOf(next.getIsallday()));
                if (writableDatabase.replace(TABLE_NAME, null, contentValues) == -1) {
                    z = false;
                    break;
                }
            }
            if (z) {
                writableDatabase.setTransactionSuccessful();
            }
            writableDatabase.endTransaction();
            CalendarAlarm.reset(DBase.getContext());
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean cacheToDB(List<ScheduleModel> list, int i) {
        long j;
        if (list == null) {
            return false;
        }
        try {
            SQLiteDatabase writableDatabase = DBase.getWritableDatabase(contextStatic);
            writableDatabase.beginTransaction();
            Iterator<ScheduleModel> it = list.iterator();
            String str = null;
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ScheduleModel next = it.next();
                ContentValues contentValues = new ContentValues();
                contentValues.put("uid", next.getUid());
                contentValues.put("user_id", next.getUserId());
                contentValues.put(COL_SOURCE_ID, Integer.valueOf(next.getSourceId()));
                contentValues.put("event_id", next.getEventId());
                contentValues.put("type", "");
                contentValues.put(COL_THEDATE, next.getThedate());
                contentValues.put("title", next.getTitle());
                contentValues.put("description", next.getDescription());
                contentValues.put("link", next.getLink());
                long j2 = 0;
                if (next.getStartTime() != null) {
                    j = DateUtils.parseDateToCalendar(next.getStartTime()).getTimeInMillis();
                    if (j < System.currentTimeMillis()) {
                        continue;
                    }
                } else {
                    j = 0;
                }
                contentValues.put(COL_START_TIME, Long.valueOf(j));
                if (next.getEndTime() != null) {
                    j2 = DateUtils.parseDateToCalendar(next.getEndTime()).getTimeInMillis();
                }
                contentValues.put("end_time", Long.valueOf(j2));
                contentValues.put(COL_ALARM_TIME, Long.valueOf(j - (next.getRemind() * 1000)));
                contentValues.put(COL_REMIND, Integer.valueOf(next.getRemind()));
                Repeat repeat = new Repeat();
                repeat.parse(next.getRepeat());
                contentValues.put("repeat", repeat.toString());
                contentValues.put(COL_ISREPEAT, Integer.valueOf(next.getIsrepeat()));
                contentValues.put(COL_DELETED, Integer.valueOf(next.getDeleted()));
                contentValues.put("sync", Integer.valueOf(i));
                contentValues.put(COL_ISALLDAY, Integer.valueOf(next.getIsallday()));
                if (writableDatabase.replace(TABLE_NAME, null, contentValues) == -1) {
                    z = false;
                    break;
                }
                z = true;
                if (TextUtils.isEmpty(str)) {
                    str = next.getUserId();
                }
            }
            if (z) {
                writableDatabase.setTransactionSuccessful();
            }
            writableDatabase.endTransaction();
            commit(str);
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void cancelSchedule(final String str, final int i, QueryHandler queryHandler, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "0";
        }
        final String str3 = str2;
        final Handler queryHandler2 = getQueryHandler(queryHandler, 2);
        DBase.exec(new Coordinator.TaggedRunnable(TAG) { // from class: com.taobao.calendar.sdk.db.TableSchedule.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SQLiteDatabase writableDatabase = DBase.getWritableDatabase(TableSchedule.contextStatic);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("sync", str3.equalsIgnoreCase("0") ? 2 : 0);
                    contentValues.put(TableSchedule.COL_DELETED, (Integer) 1);
                    Message obtain = Message.obtain(queryHandler2);
                    obtain.what = ((long) writableDatabase.update(TableSchedule.TABLE_NAME, contentValues, "user_id = ? AND event_id = ? AND source_id =? ", new String[]{str3, str, String.valueOf(i)})) != -1 ? TableSchedule.SUCCESS : TableSchedule.FAIL;
                    CT ct = CT.Button;
                    TBS.Adv.ctrlClicked("Page_Calendar", ct, "cancel_remind", "sourceId=" + i, "eventId=" + str);
                    obtain.sendToTarget();
                    TableSchedule.commit(str3);
                } catch (Exception unused) {
                }
            }
        });
    }

    public static void commit(String str) {
        CalendarAlarm.reset(DBase.getContext());
        if (!TextUtils.equals(str, "0")) {
            CalendarAlarm.syn(DBase.getContext(), str);
        }
    }

    private static JSONObject cursorToJsonObject(Cursor cursor) {
        if (cursor != null) {
            JSONObject jSONObject = new JSONObject();
            String string = cursor.getString(cursor.getColumnIndex(COL_SOURCE_ID));
            if (TextUtils.isEmpty(string)) {
                string = "0";
            }
            jSONObject.put("userId", (Object) cursor.getString(cursor.getColumnIndex("user_id")));
            jSONObject.put("sourceId", (Object) string);
            jSONObject.put("eventId", (Object) cursor.getString(cursor.getColumnIndex("event_id")));
            jSONObject.put(COL_THEDATE, (Object) cursor.getString(cursor.getColumnIndex(COL_THEDATE)));
            jSONObject.put("startTime", (Object) DateUtils.formatDate(cursor.getString(cursor.getColumnIndex(COL_START_TIME)), "yyyy-MM-dd HH:mm:ss"));
            jSONObject.put("endTime", (Object) DateUtils.formatDate(cursor.getString(cursor.getColumnIndex("end_time")), "yyyy-MM-dd HH:mm:ss"));
            jSONObject.put("type", (Object) cursor.getString(cursor.getColumnIndex("type")));
            jSONObject.put("title", (Object) cursor.getString(cursor.getColumnIndex("title")));
            jSONObject.put("description", (Object) cursor.getString(cursor.getColumnIndex("description")));
            jSONObject.put("link", (Object) cursor.getString(cursor.getColumnIndex("link")));
            jSONObject.put("alarmTime", (Object) DateUtils.formatDate(cursor.getString(cursor.getColumnIndex(COL_ALARM_TIME)), "yyyy-MM-dd HH:mm:ss"));
            jSONObject.put(COL_REMIND, (Object) cursor.getString(cursor.getColumnIndex(COL_REMIND)));
            jSONObject.put(COL_ISREPEAT, (Object) cursor.getString(cursor.getColumnIndex(COL_ISREPEAT)));
            jSONObject.put(COL_ISEDITABLE, (Object) cursor.getString(cursor.getColumnIndex(COL_ISEDITABLE)));
            jSONObject.put(COL_DELETED, (Object) cursor.getString(cursor.getColumnIndex(COL_DELETED)));
            jSONObject.put("sourceName", (Object) TBCalendarConfig.EventType.get(Long.valueOf(Long.parseLong(string)))[0]);
            return jSONObject;
        }
        return null;
    }

    public static void deleteSchedule(final String str, QueryHandler queryHandler, final String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "0";
        }
        final Handler queryHandler2 = getQueryHandler(queryHandler, 2);
        DBase.exec(new Coordinator.TaggedRunnable(TAG) { // from class: com.taobao.calendar.sdk.db.TableSchedule.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SQLiteDatabase writableDatabase = DBase.getWritableDatabase(TableSchedule.contextStatic);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("sync", (Integer) 0);
                    contentValues.put(TableSchedule.COL_DELETED, (Integer) 1);
                    Message obtain = Message.obtain(queryHandler2);
                    obtain.what = ((long) writableDatabase.update(TableSchedule.TABLE_NAME, contentValues, "event_id = ?", new String[]{str})) != -1 ? TableSchedule.SUCCESS : TableSchedule.FAIL;
                    obtain.sendToTarget();
                    TableSchedule.commit(str2);
                } catch (Exception unused) {
                }
            }
        });
    }

    public static void getCommingSchedule(QueryHandler queryHandler, String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        final String str2 = str;
        final Handler queryHandler2 = getQueryHandler(queryHandler, 0);
        DBase.exec(new Coordinator.TaggedRunnable(TAG) { // from class: com.taobao.calendar.sdk.db.TableSchedule.11
            @Override // java.lang.Runnable
            public void run() {
                SQLiteDatabase readableDatabase = DBase.getReadableDatabase(TableSchedule.contextStatic);
                Message obtain = Message.obtain(queryHandler2);
                String[] strArr = {TableSchedule.COL_SOURCE_ID, "event_id", TableSchedule.COL_ALARM_TIME, TableSchedule.COL_START_TIME, "title"};
                String[] strArr2 = {str2, currentTimeMillis + ""};
                ArrayList arrayList = new ArrayList();
                Cursor cursor = null;
                try {
                    cursor = readableDatabase.query(TableSchedule.TABLE_NAME, strArr, "user_id = ? AND start_time >= ? AND isrepeat = 0 AND deleted = 0", strArr2, null, null, "start_time ASC", "1");
                    while (cursor.moveToNext()) {
                        ScheduleDO scheduleDO = new ScheduleDO();
                        scheduleDO.sourceId = cursor.getLong(0);
                        scheduleDO.eventId = cursor.getString(1);
                        scheduleDO.alartTime = cursor.getLong(2);
                        scheduleDO.startTime = cursor.getLong(3);
                        scheduleDO.title = cursor.getString(4);
                        arrayList.add(scheduleDO);
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    obtain.what = DBase.SUCCESS;
                    obtain.obj = arrayList;
                    obtain.sendToTarget();
                } catch (Exception unused) {
                    if (cursor == null) {
                        return;
                    }
                    cursor.close();
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
        });
    }

    private static Handler getQueryHandler(final QueryHandler queryHandler, final int i) {
        return new Handler() { // from class: com.taobao.calendar.sdk.db.TableSchedule.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                List<ScheduleDO> arrayList;
                Object obj;
                if (QueryHandler.this == null) {
                    return;
                }
                int i2 = message.what;
                int i3 = i;
                if (i3 != 0) {
                    if (i3 != 1 && i3 != 2 && i3 != 3) {
                        return;
                    }
                    QueryHandler.this.callback(i2, (i2 != DBase.SUCCESS || message.obj == null) ? null : (ResultDO) message.obj);
                    QueryHandler.this.callback(i2);
                    return;
                }
                String str = "";
                if (i2 != DBase.SUCCESS || message.obj == null) {
                    arrayList = new ArrayList<>();
                } else {
                    if (message.obj instanceof HashMap) {
                        HashMap hashMap = (HashMap) message.obj;
                        str = (String) hashMap.get("guid");
                        obj = hashMap.get("data");
                    } else {
                        obj = message.obj;
                    }
                    arrayList = (List) obj;
                }
                try {
                    QueryHandler.this.callback(i2, arrayList);
                    QueryHandler.this.callback(i2, arrayList, str);
                } catch (NullPointerException unused) {
                    Log.e(TableSchedule.TAG, "h NullPointerException");
                }
            }
        };
    }

    public static void getRecentRemindSchedule(QueryHandler queryHandler) {
        final long timeInMillis = Calendar.getInstance().getTimeInMillis();
        final Handler queryHandler2 = getQueryHandler(queryHandler, 0);
        DBase.exec(new Coordinator.TaggedRunnable(TAG) { // from class: com.taobao.calendar.sdk.db.TableSchedule.10
            @Override // java.lang.Runnable
            public void run() {
                Cursor cursor;
                Cursor cursor2;
                String str = timeInMillis + "";
                SQLiteDatabase readableDatabase = DBase.getReadableDatabase(TableSchedule.contextStatic);
                Message obtain = Message.obtain(queryHandler2);
                String[] strArr = {TableSchedule.COL_SOURCE_ID, "event_id", TableSchedule.COL_ALARM_TIME, "title", "link"};
                String[] strArr2 = {timeInMillis + ""};
                ArrayList arrayList = new ArrayList();
                Cursor cursor3 = null;
                try {
                    cursor = readableDatabase.query(TableSchedule.TABLE_NAME, strArr, "alarm_time >= ? AND isrepeat = 0 AND deleted = 0", strArr2, null, null, "start_time ASC", AgooConstants.ACK_PACK_ERROR);
                    while (cursor.moveToNext()) {
                        try {
                            ScheduleDO scheduleDO = new ScheduleDO();
                            scheduleDO.sourceId = cursor.getLong(0);
                            scheduleDO.eventId = cursor.getString(1);
                            scheduleDO.alartTime = cursor.getLong(2);
                            scheduleDO.title = cursor.getString(3);
                            scheduleDO.link = cursor.getString(4);
                            arrayList.add(scheduleDO);
                        } catch (Exception unused) {
                            cursor3 = cursor;
                            if (cursor3 == null) {
                                return;
                            }
                            cursor3.close();
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    try {
                        cursor2 = readableDatabase.query(TableSchedule.TABLE_NAME, new String[]{"event_id", TableSchedule.COL_START_TIME, "repeat", TableSchedule.COL_REMIND, "title"}, "isrepeat = 1 AND deleted = 0", null, null, null, "start_time ASC", null);
                        while (cursor2.moveToNext()) {
                            try {
                                ScheduleDO scheduleDO2 = new ScheduleDO();
                                scheduleDO2.sourceId = 1L;
                                scheduleDO2.eventId = cursor2.getString(0);
                                scheduleDO2.startTime = cursor2.getLong(1);
                                scheduleDO2.repeat.parse(cursor2.getString(2));
                                scheduleDO2.remind = cursor2.getLong(3);
                                scheduleDO2.title = cursor2.getString(4);
                                scheduleDO2.processRepeat(timeInMillis);
                                scheduleDO2.alartTime = scheduleDO2.remind == -1 ? 0L : scheduleDO2.startTime - (scheduleDO2.remind * 1000);
                                if (scheduleDO2.alartTime > timeInMillis) {
                                    arrayList.add(scheduleDO2);
                                }
                            } catch (Exception unused2) {
                                cursor3 = cursor2;
                                if (cursor3 == null) {
                                    return;
                                }
                                cursor3.close();
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        }
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        obtain.what = DBase.SUCCESS;
                        obtain.obj = arrayList;
                        obtain.sendToTarget();
                    } catch (Exception unused3) {
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = null;
                    }
                } catch (Exception unused4) {
                } catch (Throwable th4) {
                    th = th4;
                    cursor = null;
                }
            }
        });
    }

    public static void getSchedule(String str, QueryHandler queryHandler) {
        getSchedule(str, null, queryHandler);
    }

    public static void getSchedule(final String str, final String str2, QueryHandler queryHandler) {
        final Handler queryHandler2 = getQueryHandler(queryHandler, 0);
        queryHandler2.post(new Coordinator.TaggedRunnable(TAG) { // from class: com.taobao.calendar.sdk.db.TableSchedule.8
            @Override // java.lang.Runnable
            public void run() {
                SQLiteDatabase readableDatabase = DBase.getReadableDatabase(TableSchedule.contextStatic);
                String[] strArr = {TableSchedule.COL_SOURCE_ID, "event_id", TableSchedule.COL_START_TIME, "title", "link"};
                String[] split = str.split(",");
                String[] strArr2 = new String[split.length];
                System.arraycopy(split, 0, strArr2, 0, split.length);
                ArrayList arrayList = new ArrayList();
                Cursor cursor = null;
                try {
                    cursor = readableDatabase.query(TableSchedule.TABLE_NAME, strArr, "event_id in (" + DBase.makePlaceholders(split.length) + ") AND deleted = 0", strArr2, null, null, null);
                    while (cursor.moveToNext()) {
                        ScheduleDO scheduleDO = new ScheduleDO();
                        scheduleDO.sourceId = cursor.getLong(0);
                        scheduleDO.eventId = cursor.getString(1);
                        scheduleDO.setStartTime(Long.valueOf(cursor.getLong(2)));
                        scheduleDO.title = cursor.getString(3);
                        scheduleDO.link = cursor.getString(4);
                        arrayList.add(scheduleDO);
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    Message obtain = Message.obtain(queryHandler2);
                    obtain.what = DBase.SUCCESS;
                    HashMap hashMap = new HashMap();
                    hashMap.put("guid", str2);
                    hashMap.put("data", arrayList);
                    obtain.obj = hashMap;
                    obtain.sendToTarget();
                } catch (Exception unused) {
                    if (cursor == null) {
                        return;
                    }
                    cursor.close();
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
        });
    }

    public static void getScheduleAll(QueryHandler queryHandler, String str) {
        getScheduleBetween("1000-01-01", "9999-12-31", queryHandler, str);
    }

    public static void getScheduleBetween(final String str, final String str2, QueryHandler queryHandler, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "0";
        }
        final String str4 = str3;
        final Handler queryHandler2 = getQueryHandler(queryHandler, 0);
        DBase.exec(new Coordinator.TaggedRunnable(TAG) { // from class: com.taobao.calendar.sdk.db.TableSchedule.9
            @Override // java.lang.Runnable
            public void run() {
                Message obtain = Message.obtain(queryHandler2);
                ArrayList scheduleListFromDB = TableSchedule.getScheduleListFromDB(str4, str, str2);
                obtain.what = DBase.SUCCESS;
                obtain.obj = scheduleListFromDB;
                obtain.sendToTarget();
            }
        });
    }

    public static void getScheduleBetweenBySourceId(final String str, final String str2, final String str3, final String str4, QueryHandler queryHandler) {
        final Handler queryHandler2 = getQueryHandler(queryHandler, 0);
        DBase.exec(new Coordinator.TaggedRunnable(TAG) { // from class: com.taobao.calendar.sdk.db.TableSchedule.3
            @Override // java.lang.Runnable
            public void run() {
                Message obtain = Message.obtain(queryHandler2);
                ArrayList scheduleListBySourceIdFromDB = TableSchedule.getScheduleListBySourceIdFromDB(str, str2, str3, str4);
                obtain.what = DBase.SUCCESS;
                obtain.obj = scheduleListBySourceIdFromDB;
                obtain.sendToTarget();
            }
        });
    }

    public static void getScheduleForDay(String str, QueryHandler queryHandler, String str2) {
        getScheduleBetween(str, str, queryHandler, str2);
    }

    public static void getScheduleForMonth(Date date, QueryHandler queryHandler) {
        Calendar.getInstance().setTime(date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0145, code lost:
        if (r10 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014f, code lost:
        if (r10 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0151, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0154, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<com.taobao.calendar.sdk.db.ScheduleDO> getScheduleListBySourceIdFromDB(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.calendar.sdk.db.TableSchedule.getScheduleListBySourceIdFromDB(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c9, code lost:
        if (r13 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d3, code lost:
        if (r13 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d5, code lost:
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d8, code lost:
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<com.taobao.calendar.sdk.db.ScheduleDO> getScheduleListFromDB(java.lang.String r15, java.lang.String r16, java.lang.String r17) {
        /*
            android.content.Context r0 = com.taobao.calendar.sdk.db.TableSchedule.contextStatic
            android.database.sqlite.SQLiteDatabase r1 = com.taobao.calendar.sdk.db.DBase.getReadableDatabase(r0)
            java.lang.String r2 = "uid"
            java.lang.String r3 = "source_id"
            java.lang.String r4 = "event_id"
            java.lang.String r5 = "title"
            java.lang.String r6 = "description"
            java.lang.String r7 = "start_time"
            java.lang.String r8 = "end_time"
            java.lang.String r9 = "repeat"
            java.lang.String r10 = "thedate"
            java.lang.String r11 = "remind"
            java.lang.String r12 = "isallday"
            java.lang.String r13 = "link"
            java.lang.String[] r3 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.lang.String r4 = "user_id = ? AND thedate >= ? AND thedate <= ? AND deleted = 0"
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 == 0) goto L35
            java.lang.String r0 = "0"
            goto L36
        L35:
            r0 = r15
        L36:
            r10 = 3
            java.lang.String[] r5 = new java.lang.String[r10]
            r11 = 0
            r5[r11] = r0
            r0 = 1
            r5[r0] = r16
            r12 = 2
            r5[r12] = r17
            java.lang.String r8 = "start_time ASC"
            r13 = 0
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.lang.String r2 = "tsic_schedule"
            r6 = 0
            r7 = 0
            r9 = 0
            android.database.Cursor r13 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
        L55:
            boolean r1 = r13.moveToNext()     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            if (r1 == 0) goto Lc9
            com.taobao.calendar.sdk.db.ScheduleDO r1 = new com.taobao.calendar.sdk.db.ScheduleDO     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r1.<init>()     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r2 = 1
            r1.sourceId = r2     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            java.lang.String r2 = r13.getString(r11)     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r1.uid = r2     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            long r2 = r13.getLong(r0)     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r1.sourceId = r2     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            java.lang.String r2 = r13.getString(r12)     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r1.eventId = r2     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            java.lang.String r2 = r13.getString(r10)     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r1.title = r2     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r2 = 4
            java.lang.String r2 = r13.getString(r2)     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r1.description = r2     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r2 = 5
            long r2 = r13.getLong(r2)     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r1.setStartTime(r2)     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r2 = 6
            long r2 = r13.getLong(r2)     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r1.endTime = r2     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            com.taobao.calendar.sdk.db.schedule.Repeat r2 = r1.repeat     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r3 = 7
            java.lang.String r3 = r13.getString(r3)     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r2.parse(r3)     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r2 = 8
            java.lang.String r2 = r13.getString(r2)     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r1.theDate = r2     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r2 = 9
            long r2 = r13.getLong(r2)     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r1.remind = r2     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r2 = 10
            int r2 = r13.getInt(r2)     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            if (r2 != r0) goto Lba
            r2 = 1
            goto Lbb
        Lba:
            r2 = 0
        Lbb:
            r1.isAllDay = r2     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r2 = 11
            java.lang.String r2 = r13.getString(r2)     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r1.link = r2     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            r14.add(r1)     // Catch: java.lang.Throwable -> Lcc java.lang.Exception -> Ld3
            goto L55
        Lc9:
            if (r13 == 0) goto Ld8
            goto Ld5
        Lcc:
            r0 = move-exception
            if (r13 == 0) goto Ld2
            r13.close()
        Ld2:
            throw r0
        Ld3:
            if (r13 == 0) goto Ld8
        Ld5:
            r13.close()
        Ld8:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.calendar.sdk.db.TableSchedule.getScheduleListFromDB(java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0143, code lost:
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0151, code lost:
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0153, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0156, code lost:
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.taobao.calendar.sdk.synchronize.ScheduleModel> getScheduleNoSynListFromDB(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.calendar.sdk.db.TableSchedule.getScheduleNoSynListFromDB(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public static String[] getSchedulesBetween(String str, String str2, String str3, String str4) {
        String[] strArr;
        String str5;
        Cursor cursor;
        SQLiteDatabase readableDatabase = DBase.getReadableDatabase(contextStatic);
        String[] strArr2 = {"link"};
        if (TextUtils.isEmpty(str3)) {
            strArr = new String[]{str, str2};
            str5 = "source_id = ? AND thedate >= ? AND deleted = 0";
        } else {
            strArr = new String[]{str, str2, str3};
            str5 = "source_id = ? AND thedate >= ? AND thedate <= ? AND deleted = 0";
        }
        try {
            cursor = readableDatabase.query(true, TABLE_NAME, strArr2, str5, strArr, null, null, "start_time " + str4, null);
        } catch (Exception unused) {
            cursor = null;
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            String[] strArr3 = new String[cursor.getCount()];
            int i = 0;
            while (cursor.moveToNext()) {
                strArr3[i] = cursor.getString(0);
                i++;
            }
            if (cursor != null) {
                cursor.close();
            }
            return strArr3;
        } catch (Exception unused2) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static String[] getSchedulesBetweenNew(String str, String str2, String str3, String str4) {
        String[] strArr;
        String str5;
        Cursor cursor;
        SQLiteDatabase readableDatabase = DBase.getReadableDatabase(contextStatic);
        String[] strArr2 = {"event_id", "link", "type", COL_ALARM_TIME, COL_START_TIME};
        if (TextUtils.isEmpty(str3)) {
            strArr = new String[]{str, str2};
            str5 = "source_id = ? AND thedate >= ? AND deleted = 0";
        } else {
            strArr = new String[]{str, str2, str3};
            str5 = "source_id = ? AND thedate >= ? AND thedate <= ? AND deleted = 0";
        }
        try {
            cursor = readableDatabase.query(true, TABLE_NAME, strArr2, str5, strArr, null, null, "start_time " + str4, null);
        } catch (Exception unused) {
            cursor = null;
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            String[] strArr3 = new String[cursor.getCount()];
            int i = 0;
            while (cursor.moveToNext()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_id", (Object) cursor.getString(0));
                jSONObject.put("link", (Object) cursor.getString(1));
                jSONObject.put("type", (Object) cursor.getString(2));
                jSONObject.put(COL_ALARM_TIME, (Object) cursor.getString(3));
                jSONObject.put(COL_START_TIME, (Object) cursor.getString(4));
                strArr3[i] = jSONObject.toString();
                i++;
            }
            if (cursor != null) {
                cursor.close();
            }
            return strArr3;
        } catch (Exception unused2) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static void init(Context context) {
        contextStatic = context;
    }

    public static void newSchedule(final ScheduleDO scheduleDO, QueryHandler queryHandler, final String str) {
        final Handler queryHandler2 = getQueryHandler(queryHandler, 2);
        DBase.exec(new Coordinator.TaggedRunnable(TAG) { // from class: com.taobao.calendar.sdk.db.TableSchedule.1
            @Override // java.lang.Runnable
            public void run() {
                long j;
                String str2;
                String str3 = TextUtils.isEmpty(str) ? "0" : str;
                try {
                    SQLiteDatabase writableDatabase = DBase.getWritableDatabase(TableSchedule.contextStatic);
                    ContentValues contentValues = new ContentValues();
                    String str4 = scheduleDO.eventId;
                    if (scheduleDO.remind == -1) {
                        j = 0;
                    } else {
                        long j2 = scheduleDO.startTime;
                        long j3 = scheduleDO.remind;
                        Long.signum(j3);
                        j = j2 - (j3 * 1000);
                    }
                    contentValues.put("uid", Utils.md5ToHex(str3 + scheduleDO.sourceId + str4));
                    contentValues.put("user_id", str3);
                    contentValues.put(TableSchedule.COL_SOURCE_ID, Long.valueOf(scheduleDO.sourceId));
                    if (str4 != null) {
                        str2 = str4;
                    } else {
                        str2 = "1" + System.currentTimeMillis();
                    }
                    contentValues.put("event_id", str2);
                    contentValues.put("type", scheduleDO.type);
                    contentValues.put(TableSchedule.COL_THEDATE, scheduleDO.theDate);
                    contentValues.put("title", scheduleDO.title);
                    contentValues.put("description", scheduleDO.description);
                    contentValues.put("link", scheduleDO.link);
                    contentValues.put(TableSchedule.COL_START_TIME, Long.valueOf(scheduleDO.startTime));
                    contentValues.put("end_time", Long.valueOf(scheduleDO.endTime));
                    contentValues.put(TableSchedule.COL_ALARM_TIME, Long.valueOf(j));
                    contentValues.put(TableSchedule.COL_REMIND, Long.valueOf(scheduleDO.remind));
                    contentValues.put("repeat", scheduleDO.repeat.toString());
                    contentValues.put(TableSchedule.COL_ISALLDAY, Integer.valueOf(scheduleDO.isAllDay ? 1 : 0));
                    contentValues.put(TableSchedule.COL_ISREPEAT, Integer.valueOf(scheduleDO.repeat.isRepeat() ? 1 : 0));
                    contentValues.put(TableSchedule.COL_ISEDITABLE, Boolean.valueOf(scheduleDO.isEditable));
                    contentValues.put("sync", TextUtils.equals(str3, "0") ? 2 : 0);
                    contentValues.put(TableSchedule.COL_DELETED, (Integer) 0);
                    long replace = writableDatabase.replace(TableSchedule.TABLE_NAME, null, contentValues);
                    String str5 = (scheduleDO.startTime - (scheduleDO.remind * 1000)) + "";
                    TBS.Adv.ctrlClicked("Page_Calendar", CT.Button, "add_remind", "sourceId=" + scheduleDO.sourceId, "eventId=" + str4, "alarmTime=" + j, "url=" + scheduleDO.link);
                    Message obtain = Message.obtain(queryHandler2);
                    obtain.what = replace != -1 ? TableSchedule.SUCCESS : TableSchedule.FAIL;
                    obtain.sendToTarget();
                    TableSchedule.commit(str3);
                } catch (SQLiteException | Exception e) {
                    Log.e(TableSchedule.TAG, "open tsic_schedule failed ! ", e);
                }
            }
        });
    }

    public static String[] queryAllReminds(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        Cursor cursor;
        SQLiteDatabase readableDatabase = DBase.getReadableDatabase(contextStatic);
        int i = 0;
        String[] strArr = {str, str2};
        String str8 = "thedate >= ? AND thedate <= ?";
        if (!TextUtils.isEmpty(str3)) {
            str8 = str8 + " AND source_id =" + str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            str7 = str8 + " AND user_id =" + str4;
        } else {
            str7 = str8;
        }
        try {
            cursor = readableDatabase.query(true, TABLE_NAME, null, str7, strArr, null, null, "start_time DESC", str6);
        } catch (Exception unused) {
            cursor = null;
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            String[] strArr2 = new String[cursor.getCount()];
            while (cursor.moveToNext()) {
                JSONObject cursorToJsonObject = cursorToJsonObject(cursor);
                strArr2[i] = cursorToJsonObject == null ? "" : cursorToJsonObject.toString();
                i++;
            }
            if (cursor != null) {
                cursor.close();
            }
            return strArr2;
        } catch (Exception unused2) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static String[] queryAllRemindsCount(String str, String str2, String str3, String str4, String str5) {
        String str6;
        Cursor cursor;
        SQLiteDatabase readableDatabase = DBase.getReadableDatabase(contextStatic);
        String[] strArr = {COL_THEDATE, "count(*) as remindCount"};
        String[] strArr2 = {str, str2};
        String str7 = "thedate >= ? AND thedate <= ?";
        if (!TextUtils.isEmpty(str3)) {
            str7 = str7 + " AND source_id =" + str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            str6 = str7 + " AND user_id =" + str4;
        } else {
            str6 = str7;
        }
        try {
            cursor = readableDatabase.query(true, TABLE_NAME, strArr, str6, strArr2, COL_THEDATE, null, null, null);
        } catch (Exception unused) {
            cursor = null;
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            String[] strArr3 = new String[cursor.getCount()];
            int i = 0;
            while (cursor.moveToNext()) {
                JSONObject jSONObject = new JSONObject();
                String string = cursor.getString(0);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put("key", (Object) string.replace("-", ""));
                    jSONObject.put("value", (Object) cursor.getString(1));
                    jSONObject.put("count", (Object) Integer.valueOf(cursor.getInt(1)));
                    strArr3[i] = jSONObject.toString();
                    i++;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return strArr3;
        } catch (Exception unused2) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static void updateSchedule(ScheduleDO scheduleDO, QueryHandler queryHandler, String str) {
        newSchedule(scheduleDO, queryHandler, str);
    }

    public static void updateScheduleByType(ArrayList<ScheduleDO> arrayList, final long[] jArr, final boolean z, QueryHandler queryHandler, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        final String str2 = str;
        final Handler queryHandler2 = getQueryHandler(queryHandler, 2);
        DBase.exec(new Coordinator.TaggedRunnable(TAG) { // from class: com.taobao.calendar.sdk.db.TableSchedule.6
            @Override // java.lang.Runnable
            public synchronized void run() {
                SQLiteDatabase readableDatabase = DBase.getReadableDatabase(TableSchedule.contextStatic);
                Message obtain = Message.obtain(queryHandler2);
                if (readableDatabase == null) {
                    obtain.what = TableSchedule.FAIL;
                    obtain.sendToTarget();
                    return;
                }
                String join = Utils.join(jArr, ",");
                if (z) {
                    String str3 = "%%%%% delete " + readableDatabase.delete(TableSchedule.TABLE_NAME, "user_id = ? AND source_id in (?)", new String[]{str2, join});
                }
                obtain.what = TableSchedule.SUCCESS;
                obtain.sendToTarget();
                TableSchedule.commit(str2);
            }
        });
    }
}
