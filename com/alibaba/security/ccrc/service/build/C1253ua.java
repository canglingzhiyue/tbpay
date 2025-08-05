package com.alibaba.security.ccrc.service.build;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.alibaba.security.ccrc.service.build.ua  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1253ua extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3331a = "EasyDbHelper";
    public static final int b = 1;
    public static final String c = "wk_risk_ext.db";
    public static final String d = "easy_log";
    public static final String e = "id";
    public static final String f = "log";

    public C1253ua(Context context) {
        super(context, c, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public boolean a(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4926226", new Object[]{this, trackLog})).booleanValue();
        }
        try {
            String jSONString = JsonUtils.toJSONString(trackLog);
            ContentValues contentValues = new ContentValues();
            contentValues.put("log", jSONString);
            contentValues.put("id", trackLog.logId);
            return getWritableDatabase().replace(d, null, contentValues) != -1;
        } catch (Throwable th) {
            Logging.w(f3331a, "write db error", th);
            return false;
        }
    }

    public List<TrackLog> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        try {
            Cursor query = getWritableDatabase().query(d, null, null, null, null, null, null, null);
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                TrackLog trackLog = (TrackLog) JsonUtils.parseObject(query.getString(query.getColumnIndex("log")), (Class<Object>) TrackLog.class);
                if (trackLog != null) {
                    arrayList.add(trackLog);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            Logging.w(f3331a, "", th);
            return Collections.emptyList();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
        } else {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS easy_log ( id TEXT  PRIMARY KEY ,log TEXT)");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1967076", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
        } else {
            onUpgrade(sQLiteDatabase, i, i2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS easy_log");
        onCreate(sQLiteDatabase);
    }

    public void a(List<TrackLog> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            if (list == null || list.isEmpty()) {
                if (sQLiteDatabase == null) {
                    return;
                }
                return;
            }
            sQLiteDatabase.beginTransaction();
            Iterator<TrackLog> it = list.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.delete(d, "id=?", new String[]{it.next().logId});
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            try {
                Logging.w(f3331a, "", th);
                if (sQLiteDatabase == null) {
                    return;
                }
                sQLiteDatabase.endTransaction();
            } finally {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            getWritableDatabase().delete(d, null, null);
        } catch (Throwable th) {
            Logging.w(f3331a, "", th);
        }
    }
}
