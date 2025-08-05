package com.taobao.calendar.sdk.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.taobao.calendar.sdk.common.DateUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class TableOrderEvent {
    private static final String COL_END_TIME = "end_time";
    private static final String COL_ID = "uid";
    private static final String COL_MESSAGE = "message";
    private static final String COL_SOURCE_ID = "sourceid";
    private static final String COL_START_TIME = "start_time";
    private static final String COL_THEDATE = "thedate";
    private static final String COL_TITLE = "title";
    public static int FAIL = 0;
    public static int SUCCESS = 0;
    private static final String TABLE_NAME = "tsic_order_event";
    private static String TAG;
    private static Context contextStatic;
    private static DBase dbase;

    /* loaded from: classes6.dex */
    public static class QueryHandler {
        static {
            kge.a(1045060906);
        }

        public void callback(int i, ResultDO resultDO) {
        }

        public void callback(int i, List<EventDO> list) {
        }
    }

    static {
        kge.a(-265314308);
        TAG = "TableOrderEvent";
        SUCCESS = 0;
        FAIL = 1;
    }

    private static boolean cacheToDB(ArrayList<EventDO> arrayList) {
        if (arrayList == null) {
            return true;
        }
        try {
            SQLiteDatabase writableDatabase = dbase.getWritableDatabase();
            Iterator<EventDO> it = arrayList.iterator();
            while (it.hasNext()) {
                EventDO next = it.next();
                ContentValues contentValues = new ContentValues();
                contentValues.put("uid", next.uid);
                contentValues.put(COL_SOURCE_ID, Long.valueOf(next.sourceId));
                contentValues.put(COL_THEDATE, next.theDate);
                contentValues.put(COL_START_TIME, Long.valueOf(next.startTime));
                contentValues.put("end_time", Long.valueOf(next.endTime));
                contentValues.put("title", next.title);
                if (writableDatabase.replace(TABLE_NAME, "message", contentValues) == -1) {
                    return false;
                }
            }
            return true;
        } catch (SQLiteException | Exception e) {
            Log.e(TAG, "open tsic_order_event failed ! ", e);
            return false;
        }
    }

    public static void getOrderEvent(int i, String str, QueryHandler queryHandler) {
        getOrderEvent(i, str, str, queryHandler);
    }

    public static void getOrderEvent(final long j, final String str, final String str2, QueryHandler queryHandler) {
        final Handler queryHandler2 = getQueryHandler(queryHandler, 0);
        queryHandler2.post(new Runnable() { // from class: com.taobao.calendar.sdk.db.TableOrderEvent.1
            @Override // java.lang.Runnable
            public void run() {
                ArrayList orderEventFromDB = TableOrderEvent.getOrderEventFromDB(j, str, str2);
                Message obtain = Message.obtain(queryHandler2);
                obtain.what = TableOrderEvent.SUCCESS;
                obtain.obj = orderEventFromDB;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<EventDO> getOrderEventFromDB(long j, String str, String str2) {
        Cursor cursor;
        SQLiteDatabase readableDatabase = DBase.getReadableDatabase(contextStatic);
        if (readableDatabase == null) {
            return null;
        }
        ArrayList<EventDO> arrayList = new ArrayList<>();
        try {
            cursor = readableDatabase.query(TABLE_NAME, new String[]{"uid", COL_START_TIME, "end_time", "title"}, "thedate >= ? AND thedate <= ? AND sourceid = ?", new String[]{str, str2, j + ""}, null, null, "start_time ASC", null);
            while (cursor.moveToNext()) {
                try {
                    EventDO eventDO = new EventDO();
                    eventDO.uid = cursor.getString(0);
                    eventDO.startTime = cursor.getLong(1);
                    eventDO.endTime = cursor.getLong(2);
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(new Date(eventDO.startTime));
                    eventDO.theDate = DateUtils.getYYYYMMDD(calendar);
                    eventDO.title = cursor.getString(3);
                    arrayList.add(eventDO);
                } catch (Exception unused) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
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
            return arrayList;
        } catch (Exception unused2) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    private static Handler getQueryHandler(final QueryHandler queryHandler, final int i) {
        return new Handler(Looper.myLooper()) { // from class: com.taobao.calendar.sdk.db.TableOrderEvent.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (queryHandler == null) {
                    return;
                }
                int i2 = message.what;
                int i3 = i;
                if (i3 == 0) {
                    queryHandler.callback(i2, i2 == DBase.SUCCESS ? (ArrayList) message.obj : new ArrayList());
                } else if (i3 != 1 && i3 != 2) {
                } else {
                    queryHandler.callback(i2, i2 == DBase.SUCCESS ? (ResultDO) message.obj : null);
                }
            }
        };
    }

    public static void init(Context context) {
        contextStatic = context;
    }

    private static ArrayList<EventDO> parseHttpResult(JSONArray jSONArray, long j) {
        long j2;
        ArrayList<EventDO> arrayList = new ArrayList<>();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                EventDO eventDO = new EventDO();
                eventDO.uid = optJSONObject.optString("id");
                eventDO.sourceId = j;
                eventDO.title = optJSONObject.optString("title");
                Date parseDate = DateUtils.parseDate(optJSONObject.optString(COL_START_TIME, ""));
                if (parseDate != null) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(parseDate);
                    eventDO.theDate = DateUtils.getYYYYMMDD(calendar);
                    eventDO.startTime = calendar.getTimeInMillis();
                } else {
                    eventDO.theDate = null;
                }
                if (DateUtils.parseDate(optJSONObject.optString(COL_START_TIME, "")) != null) {
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTime(parseDate);
                    j2 = calendar2.getTimeInMillis();
                } else {
                    j2 = 0;
                }
                eventDO.endTime = j2;
                arrayList.add(eventDO);
            }
        }
        return arrayList;
    }
}
