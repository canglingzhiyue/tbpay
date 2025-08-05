package com.taobao.analysis.monitor;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class c extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATABASE_NAME = "network_analysis_flow_monitor.db";
    public static final int DATABASE_VERSION = 2;
    public static final String MULTI_PATH_FLOW_TASK_TABLE_NAME = "multi_path_flow_task";
    public static final String SQL_CREATE_MULTI_PATH_FLOW_TASK_ENTRIES = "CREATE TABLE multi_path_flow_task (_id INTEGER PRIMARY KEY AUTOINCREMENT,flowType REAL,date TEXT,host TEXT,useFlowSize REAL,flag INTEGER)";

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public c(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
        } else {
            sQLiteDatabase.execSQL(SQL_CREATE_MULTI_PATH_FLOW_TASK_ENTRIES);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        a(sQLiteDatabase, MULTI_PATH_FLOW_TASK_TABLE_NAME);
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1967076", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        a(sQLiteDatabase, MULTI_PATH_FLOW_TASK_TABLE_NAME);
        onCreate(sQLiteDatabase);
    }

    private void a(SQLiteDatabase sQLiteDatabase, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbe4fab", new Object[]{this, sQLiteDatabase, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            sQLiteDatabase.execSQL("drop table " + str);
        }
    }
}
