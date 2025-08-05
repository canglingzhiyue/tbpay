package com.taobao.calendar.aidl.business.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Message;
import com.taobao.tao.Globals;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes6.dex */
public class DBase extends SQLiteOpenHelper {
    private static int DB_VERSION = 4;
    public static int FAIL = 1;
    public static int SUCCESS;
    private static DBase db;
    private static Context mContext;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private static ThreadPoolExecutor threadPool;

    /* loaded from: classes6.dex */
    public interface QueryAdapter {
        void transfer(Message message);
    }

    public DBase(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        mContext = context;
    }

    public static Throwable exec(Runnable runnable) {
        if (threadPool == null) {
            threadPool = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        }
        try {
            threadPool.execute(runnable);
            return null;
        } catch (RejectedExecutionException e) {
            return e;
        }
    }

    public static Context getContext() {
        return mContext;
    }

    protected static String getDate(Date date) {
        if (date == null) {
            date = new Date();
        }
        return sdf.format(date);
    }

    public static DBase getInstance(Context context) {
        if (db == null) {
            if (context == null) {
                context = Globals.getApplication();
            }
            db = new DBase(context.getApplicationContext(), "tsic.db", null, DB_VERSION);
        }
        return db;
    }

    public static SQLiteDatabase getReadableDatabase(Context context) throws SQLiteException {
        return getInstance(context).getReadableDatabase();
    }

    public static SQLiteDatabase getWritableDatabase(Context context) throws SQLiteException {
        return getInstance(context).getWritableDatabase();
    }

    protected static String makePlaceholders(int i) {
        StringBuilder sb = new StringBuilder((i << 1) - 1);
        sb.append("?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    public static void release() {
        threadPool.shutdownNow();
        threadPool = null;
        db.close();
        db = null;
    }

    @Override // com.taobao.calendar.aidl.business.db.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tsic_datasource(id INTEGER, name VARCHAR(300), uid INTEGER, themeid INTEGER, theme TEXT, author VARCHAR(300), authorid INTEGER, description TEXT, subscribe INTEGER, total_users INTEGER, remind INTEGER, score INTEGER, sync INTEGER DEFAULT 0,logo VARCAR(300),last_update INTEGER DEFAULT 0);");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS index_datasource ON tsic_datasource(id, uid)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tsic_schedule(id INTEGER, uid VARCHAR(64) UNIQUE, user_id VARCHAR(10), source_id INTEGER, event_id VARCHAR(50), thedate VARCHAR(10), start_time LONG, end_time LONG, alarm_time LONG, type VARCHAR(100), remind INTEGER, title VARCHAR(250), description VARCHAR(250), link VARCHAR(200), isallday INTEGER, iseditable INTEGER, isrepeat INTEGER, repeat VARCHAR(200), sync INTEGER DEFAULT '0', deleted INTEGER DEFAULT '0')");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_calendar_schedule ON tsic_schedule(user_id, event_id)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_schedule_uid ON tsic_schedule(uid)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_schedule_sourceid ON tsic_schedule(source_id)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_schedule_starttime ON tsic_schedule(start_time)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_schedule_starttime ON tsic_schedule(end_time)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_schedule_alarmtime ON tsic_schedule(alarm_time)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_schedule_deleted ON tsic_schedule(sync)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_schedule_isrepeat ON tsic_schedule(isrepeat)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tsic_order_event(uid VARCHAR(100) UNIQUE, sourceid INTEGER, thedate VARCHAR(10), start_time INTEGER, end_time INTEGER, title TEXT,message TEXT)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_order_thedate ON tsic_order_event(sourceid, thedate)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_order_starttime ON tsic_order_event(sourceid, start_time)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_order_endtime ON tsic_order_event(sourceid, end_time)");
    }

    @Override // com.taobao.calendar.aidl.business.db.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tsic_datasource");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS index_datasource");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tsic_schedule");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tsic_order_event");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS index_order_thedate");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS index_order_starttime");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS index_order_endtime");
        onCreate(sQLiteDatabase);
    }
}
