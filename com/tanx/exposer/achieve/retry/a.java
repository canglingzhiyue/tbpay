package com.tanx.exposer.achieve.retry;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import tb.dha;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1613816558);
    }

    public a(Context context) {
        super(context, "tanx_ad_expose_sdk.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
            return;
        }
        if (dha.f26745a) {
            dha.a("RetryMonitorDbHelper", "onCreate: createRetryTableSql = CREATE TABLE IF NOT EXISTS retry_monitor_info ( id INTEGER PRIMARY KEY AUTOINCREMENT, monitor_type VARCHAR(10), monitor_url TEXT, monitor_original_url TEXT, monitor_url_hash TEXT, monitor_url_host TEXT, monitor_extra_params TEXT, retry_times INTEGER, max_retry_times INTEGER, date VARCHAR(12),expire_time INTEGER)");
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS retry_monitor_info ( id INTEGER PRIMARY KEY AUTOINCREMENT, monitor_type VARCHAR(10), monitor_url TEXT, monitor_original_url TEXT, monitor_url_hash TEXT, monitor_url_host TEXT, monitor_extra_params TEXT, retry_times INTEGER, max_retry_times INTEGER, date VARCHAR(12),expire_time INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        if (dha.f26745a) {
            dha.a("RetryMonitorDbHelper", "onUpgrade: oldVer = " + i + ", newVer = " + i2);
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS retry_monitor_info");
        onCreate(sQLiteDatabase);
    }

    public synchronized void a(com.tanx.exposer.achieve.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e962fe3e", new Object[]{this, bVar});
            return;
        }
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("monitor_type", bVar.d().name());
        contentValues.put("monitor_url", bVar.b());
        contentValues.put("monitor_original_url", bVar.c());
        contentValues.put("monitor_url_host", bVar.f());
        contentValues.put("monitor_url_hash", bVar.e());
        if (bVar.k() != null) {
            contentValues.put("monitor_extra_params", bVar.k().toString());
        }
        contentValues.put("retry_times", Integer.valueOf(bVar.j().intValue()));
        contentValues.put("max_retry_times", Integer.valueOf(bVar.i()));
        contentValues.put("date", bVar.h());
        contentValues.put(PushConstants.REGISTER_STATUS_EXPIRE_TIME, Long.valueOf(bVar.g()));
        long insert = writableDatabase.insert("retry_monitor_info", null, contentValues);
        bVar.a(insert);
        if (dha.f26745a) {
            dha.a("RetryMonitorDbHelper", "insert: index = " + insert + ", exposeDate = " + bVar.h());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
        if (r1 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.List<com.tanx.exposer.achieve.b> a(java.lang.String r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            com.android.alibaba.ip.runtime.IpChange r0 = com.tanx.exposer.achieve.retry.a.$ipChange     // Catch: java.lang.Throwable -> Lab
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: java.lang.Throwable -> Lab
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1a
            java.lang.String r1 = "287b5bd5"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lab
            r4[r3] = r13     // Catch: java.lang.Throwable -> Lab
            r4[r2] = r14     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r14 = r0.ipc$dispatch(r1, r4)     // Catch: java.lang.Throwable -> Lab
            java.util.List r14 = (java.util.List) r14     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r13)
            return r14
        L1a:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lab
            r0.<init>()     // Catch: java.lang.Throwable -> Lab
            android.database.sqlite.SQLiteDatabase r4 = r13.getReadableDatabase()     // Catch: java.lang.Throwable -> Lab
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lab
            r8[r3] = r14     // Catch: java.lang.Throwable -> Lab
            java.lang.String r5 = "retry_monitor_info"
            r6 = 0
            java.lang.String r7 = "date = ?"
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lab
        L34:
            if (r1 == 0) goto L84
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            if (r2 == 0) goto L84
            com.tanx.exposer.achieve.b r2 = new com.tanx.exposer.achieve.b     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            r0.add(r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            boolean r3 = tb.dha.f26745a     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            if (r3 == 0) goto L34
            java.lang.String r3 = "RetryMonitorDbHelper"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            r4.<init>()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            java.lang.String r5 = "query: add retryMonitorInfo = "
            r4.append(r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            r4.append(r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            tb.dha.a(r3, r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            goto L34
        L5f:
            r14 = move-exception
            goto L7e
        L61:
            r2 = move-exception
            java.lang.String r3 = "RetryMonitorDbHelper"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r4.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r5 = "query exception, date = "
            r4.append(r5)     // Catch: java.lang.Throwable -> L5f
            r4.append(r14)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5f
            tb.dha.a(r3, r4, r2)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L87
        L7a:
            r1.close()     // Catch: java.lang.Throwable -> Lab
            goto L87
        L7e:
            if (r1 == 0) goto L83
            r1.close()     // Catch: java.lang.Throwable -> Lab
        L83:
            throw r14     // Catch: java.lang.Throwable -> Lab
        L84:
            if (r1 == 0) goto L87
            goto L7a
        L87:
            boolean r1 = tb.dha.f26745a     // Catch: java.lang.Throwable -> Lab
            if (r1 == 0) goto La9
            java.lang.String r1 = "RetryMonitorDbHelper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lab
            r2.<init>()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = "query: exposeDate = "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lab
            r2.append(r14)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r14 = ", retryMonitorInfoList = "
            r2.append(r14)     // Catch: java.lang.Throwable -> Lab
            r2.append(r0)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r14 = r2.toString()     // Catch: java.lang.Throwable -> Lab
            tb.dha.a(r1, r14)     // Catch: java.lang.Throwable -> Lab
        La9:
            monitor-exit(r13)
            return r0
        Lab:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tanx.exposer.achieve.retry.a.a(java.lang.String):java.util.List");
    }

    public synchronized void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (j < 0) {
        } else {
            long delete = getWritableDatabase().delete("retry_monitor_info", "id = ?", new String[]{String.valueOf(j)});
            if (dha.f26745a) {
                dha.a("RetryMonitorDbHelper", "delete: id = " + j + ", deleteRows = " + delete);
            }
        }
    }

    public synchronized void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        long delete = getWritableDatabase().delete("retry_monitor_info", "date != ? or retry_times >= ?", new String[]{str, String.valueOf(i)});
        if (dha.f26745a) {
            dha.a("RetryMonitorDbHelper", "delete: deletedRows = " + delete + ", date = " + str + ", maxRetryTimes = " + i);
        }
    }
}
