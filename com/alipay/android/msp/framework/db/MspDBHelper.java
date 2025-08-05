package com.alipay.android.msp.framework.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspDBHelper extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SQL_CREATE_ACTION_ENTRIES = "CREATE TABLE MQPBehaviorActionSeqTable (_id INTEGER PRIMARY KEY AUTOINCREMENT,trace TEXT,uid TEXT,scene_name TEXT,act_type TEXT,act_name TEXT,act_params TEXT,page_id TEXT,page_name TEXT,service_stack TEXT,time INTEGER,hh TEXT,ds TEXT,ext TEXT)";
    public static final String SQL_CREATE_BEHAVIOR_EXPERIENCE_ENTRIES = "CREATE TABLE MQPBehaviorExperienceTable (_id INTEGER PRIMARY KEY AUTOINCREMENT,uid TEXT,utdid TEXT,app_name TEXT,app_ver TEXT,sdk_ver TEXT,trade_no TEXT,out_trade_no TEXT,biz_type TEXT,end_code TEXT,ext1 TEXT,ext2 TEXT,ext3 INTEGER,date TEXT)";
    public static final String SQL_CREATE_BIZ_ENTRIES = "CREATE TABLE MQPBizInfoRecordTable (_id INTEGER PRIMARY KEY AUTOINCREMENT,trace TEXT,uid TEXT,utdid TEXT,app_name TEXT,app_ver TEXT,ext_app TEXT,platform TEXT,sdk_type TEXT,sdk_ver TEXT,locale TEXT,device TEXT,os_ver TEXT,net_type TEXT,session_id TEXT,trade_no TEXT,out_trade_no TEXT,pid TEXT,biz_type TEXT,end_code TEXT,end_page TEXT,hh TEXT,time INTEGER,ds TEXT,ext1 TEXT,ext2 TEXT,ext3 TEXT)";
    public static final String SQL_CREATE_RECORD_ENTRIES = "CREATE TABLE MQPBehaviorRecordTable (_id INTEGER PRIMARY KEY AUTOINCREMENT,trace TEXT,uid TEXT,utdid TEXT,trade_no TEXT,scene_name TEXT,features TEXT,rule_id TEXT,result TEXT,ver TEXT,time TEXT,ds TEXT,hh INTEGER,ext TEXT)";

    /* loaded from: classes3.dex */
    public static class ActionEntry implements BaseColumns {
        public static final String COLUMN_NAME_ACTION_NAME = "act_name";
        public static final String COLUMN_NAME_ACTION_PARAMS = "act_params";
        public static final String COLUMN_NAME_ACTION_TYPE = "act_type";
        public static final String COLUMN_NAME_DS = "ds";
        public static final String COLUMN_NAME_EXT = "ext";
        public static final String COLUMN_NAME_HH = "hh";
        public static final String COLUMN_NAME_PAGE_ID = "page_id";
        public static final String COLUMN_NAME_PAGE_NAME = "page_name";
        public static final String COLUMN_NAME_SCENE_NAME = "scene_name";
        public static final String COLUMN_NAME_SERVICE_STACK = "service_stack";
        public static final String COLUMN_NAME_TIME = "time";
        public static final String COLUMN_NAME_TRACE = "trace";
        public static final String COLUMN_NAME_UID = "uid";
        public static final String TABLE_NAME = "MQPBehaviorActionSeqTable";
    }

    /* loaded from: classes3.dex */
    public static class BehaviorExperienceEntry implements BaseColumns {
        public static final String COLUMN_NAME_APP_NAME = "app_name";
        public static final String COLUMN_NAME_APP_VER = "app_ver";
        public static final String COLUMN_NAME_BIZ_TYPE = "biz_type";
        public static final String COLUMN_NAME_DATE = "date";
        public static final String COLUMN_NAME_END_CODE = "end_code";
        public static final String COLUMN_NAME_EXT_1 = "ext1";
        public static final String COLUMN_NAME_EXT_2 = "ext2";
        public static final String COLUMN_NAME_EXT_3 = "ext3";
        public static final String COLUMN_NAME_OUT_TRADE_NO = "out_trade_no";
        public static final String COLUMN_NAME_SDK_VER = "sdk_ver";
        public static final String COLUMN_NAME_TRADE_NO = "trade_no";
        public static final String COLUMN_NAME_UID = "uid";
        public static final String COLUMN_NAME_UTDID = "utdid";
        public static final String TABLE_NAME = "MQPBehaviorExperienceTable";
    }

    /* loaded from: classes3.dex */
    public static class BizEntry implements BaseColumns {
        public static final String COLUMN_NAME_APP_NAME = "app_name";
        public static final String COLUMN_NAME_APP_VER = "app_ver";
        public static final String COLUMN_NAME_BIZ_TYPE = "biz_type";
        public static final String COLUMN_NAME_DEVICE = "device";
        public static final String COLUMN_NAME_DS = "ds";
        public static final String COLUMN_NAME_END_CODE = "end_code";
        public static final String COLUMN_NAME_END_PAGE = "end_page";
        public static final String COLUMN_NAME_EXT1 = "ext1";
        public static final String COLUMN_NAME_EXT2 = "ext2";
        public static final String COLUMN_NAME_EXT3 = "ext3";
        public static final String COLUMN_NAME_EXT_APP = "ext_app";
        public static final String COLUMN_NAME_HH = "hh";
        public static final String COLUMN_NAME_LOCALE = "locale";
        public static final String COLUMN_NAME_NET_TYPE = "net_type";
        public static final String COLUMN_NAME_OS_VER = "os_ver";
        public static final String COLUMN_NAME_OUT_TRADE_NO = "out_trade_no";
        public static final String COLUMN_NAME_PID = "pid";
        public static final String COLUMN_NAME_PLATFORM = "platform";
        public static final String COLUMN_NAME_SDK_TYPE = "sdk_type";
        public static final String COLUMN_NAME_SDK_VER = "sdk_ver";
        public static final String COLUMN_NAME_SESSION_ID = "session_id";
        public static final String COLUMN_NAME_TIME = "time";
        public static final String COLUMN_NAME_TRACE = "trace";
        public static final String COLUMN_NAME_TRADE_NO = "trade_no";
        public static final String COLUMN_NAME_UID = "uid";
        public static final String COLUMN_NAME_UTDID = "utdid";
        public static final String TABLE_NAME = "MQPBizInfoRecordTable";
    }

    /* loaded from: classes3.dex */
    public static class RecordEntry implements BaseColumns {
        public static final String COLUMN_NAME_DS = "ds";
        public static final String COLUMN_NAME_EXT = "ext";
        public static final String COLUMN_NAME_FEATURES = "features";
        public static final String COLUMN_NAME_HH = "hh";
        public static final String COLUMN_NAME_RESULT = "result";
        public static final String COLUMN_NAME_RULE_ID = "rule_id";
        public static final String COLUMN_NAME_SCENE_NAME = "scene_name";
        public static final String COLUMN_NAME_TIME = "time";
        public static final String COLUMN_NAME_TRACE = "trace";
        public static final String COLUMN_NAME_TRADE_NO = "trade_no";
        public static final String COLUMN_NAME_UID = "uid";
        public static final String COLUMN_NAME_UTDID = "utdid";
        public static final String COLUMN_NAME_VERSION = "ver";
        public static final String TABLE_NAME = "MQPBehaviorRecordTable";
    }

    public static /* synthetic */ Object ipc$super(MspDBHelper mspDBHelper, String str, Object... objArr) {
        if (str.hashCode() == -2000015223) {
            super.onOpen((SQLiteDatabase) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MspDBHelper(Context context) {
        super(context, "cashier.db", (SQLiteDatabase.CursorFactory) null, 5);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
            return;
        }
        sQLiteDatabase.execSQL(SQL_CREATE_ACTION_ENTRIES);
        sQLiteDatabase.execSQL(SQL_CREATE_RECORD_ENTRIES);
        sQLiteDatabase.execSQL(SQL_CREATE_BEHAVIOR_EXPERIENCE_ENTRIES);
        sQLiteDatabase.execSQL(SQL_CREATE_BIZ_ENTRIES);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        if (i == 1 || i == 2 || i == 3) {
            a(sQLiteDatabase, ActionEntry.TABLE_NAME, SQL_CREATE_ACTION_ENTRIES);
            a(sQLiteDatabase, RecordEntry.TABLE_NAME, SQL_CREATE_RECORD_ENTRIES);
            a(sQLiteDatabase, BizEntry.TABLE_NAME, SQL_CREATE_BIZ_ENTRIES);
        }
        a(sQLiteDatabase, BehaviorExperienceEntry.TABLE_NAME, SQL_CREATE_BEHAVIOR_EXPERIENCE_ENTRIES);
    }

    private static void a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ffd04b5", new Object[]{sQLiteDatabase, str, str2});
            return;
        }
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(str)));
            sQLiteDatabase.execSQL(str2);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ca3089", new Object[]{this, sQLiteDatabase});
        } else {
            super.onOpen(sQLiteDatabase);
        }
    }
}
