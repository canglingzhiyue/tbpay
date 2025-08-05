package com.taobao.android.dinamicx.template.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.template.download.f;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.fxb;
import tb.kge;

/* loaded from: classes.dex */
public class DXDataBaseHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DELETE_SQL = "delete from template_info where biz_type=? AND name=? AND version=?";
    private static final String INSERT_SQL = "insert or replace into template_info(biz_type,name,version,main_path,style_files,url) values(?,?,?,?,?,?)";
    private static final String ORDER_BY = "version desc";
    private static final String[] QUERY_COLUMNS;
    private static final String[] QUERY_COLUMNS_WITH_DIRTY;
    private static final String QUERY_WHERE = "biz_type=? AND name=?";
    private static final String QUERY_WHERE_DEL = "biz_type=? AND name=? AND version=?";
    private static final String TABLE_NAME = "template_info";
    private static final String TAG = "DXDataBaseHelper";
    private static final String UPDATE_DIRTY_SQL = "update template_info set extra_1='true' where biz_type=? AND name=? AND version=?";
    private a mDbHelper;

    public static /* synthetic */ void access$000(DXDataBaseHelper dXDataBaseHelper, String str, String str2, int i, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea34700", new Object[]{dXDataBaseHelper, str, str2, new Integer(i), th});
        } else {
            dXDataBaseHelper.trackError(str, str2, i, th);
        }
    }

    public static /* synthetic */ void access$100(DXDataBaseHelper dXDataBaseHelper, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99083dbf", new Object[]{dXDataBaseHelper, str, new Long(j)});
        } else {
            dXDataBaseHelper.trackerPerform(str, j);
        }
    }

    static {
        kge.a(-1651219316);
        QUERY_COLUMNS = new String[]{"biz_type", "name", "version", "main_path", "style_files", "url"};
        QUERY_COLUMNS_WITH_DIRTY = new String[]{"biz_type", "name", "version", "main_path", "style_files", "url", "extra_1"};
    }

    public DXDataBaseHelper(Context context, String str, String str2) {
        this.mDbHelper = new a(context, str, str2);
    }

    public void store(String str, List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6cda3", new Object[]{this, str, list});
        } else if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            SQLiteDatabase a2 = this.mDbHelper.a();
            if (a2 == null || !a2.isOpen()) {
                trackError(str, DXMonitorConstant.DX_MONITOR_DB_STORE, (DXTemplateItem) null, s.DX_DB_STORE_ERROR, "SQLiteDatabase = null");
                return;
            }
            try {
                SQLiteStatement compileStatement = a2.compileStatement(INSERT_SQL);
                a2.beginTransaction();
                for (DXTemplateItem dXTemplateItem : list) {
                    if (dXTemplateItem.g != null && !TextUtils.isEmpty(dXTemplateItem.g.f11934a) && insertOrReplaceItem(compileStatement, str, dXTemplateItem)) {
                    }
                    z = false;
                }
                if (z) {
                    a2.setTransactionSuccessful();
                }
                a2.endTransaction();
            } catch (Throwable th) {
                trackError(str, DXMonitorConstant.DX_MONITOR_DB_STORE, (DXTemplateItem) null, s.DX_DB_STORE_ERROR, th);
            }
        }
    }

    public void store(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc5d8db", new Object[]{this, str, dXTemplateItem});
        } else if (TextUtils.isEmpty(str) || dXTemplateItem == null || dXTemplateItem.g == null || TextUtils.isEmpty(dXTemplateItem.g.f11934a)) {
        } else {
            SQLiteDatabase a2 = this.mDbHelper.a();
            if (a2 == null || !a2.isOpen()) {
                trackError(str, DXMonitorConstant.DX_MONITOR_DB_STORE, dXTemplateItem, s.DX_DB_STORE_ERROR, "SQLiteDatabase = null");
                return;
            }
            try {
                insertOrReplaceItem(a2.compileStatement(INSERT_SQL), str, dXTemplateItem);
            } catch (Throwable th) {
                trackError(str, DXMonitorConstant.DX_MONITOR_DB_STORE, dXTemplateItem, s.DX_DB_STORE_ERROR, th);
            }
        }
    }

    private boolean insertOrReplaceItem(SQLiteStatement sQLiteStatement, String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab576792", new Object[]{this, sQLiteStatement, str, dXTemplateItem})).booleanValue();
        }
        bindString(sQLiteStatement, 1, str);
        bindString(sQLiteStatement, 2, dXTemplateItem.f11925a);
        sQLiteStatement.bindLong(3, dXTemplateItem.b);
        bindString(sQLiteStatement, 4, dXTemplateItem.g.f11934a);
        bindString(sQLiteStatement, 5, changeMap2String(dXTemplateItem.g.b));
        bindString(sQLiteStatement, 6, dXTemplateItem.c);
        return sQLiteStatement.executeInsert() > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r1 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getDbSize() {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.dinamicx.template.db.DXDataBaseHelper.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L19
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            java.lang.String r2 = "5367468f"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L19:
            com.taobao.android.dinamicx.template.db.DXDataBaseHelper$a r0 = r6.mDbHelper
            android.database.sqlite.SQLiteDatabase r0 = r0.b()
            r1 = 0
            java.lang.String r3 = "select * from template_info"
            android.database.Cursor r1 = r0.rawQuery(r3, r1)     // Catch: java.lang.Throwable -> L36
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L36
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L44
        L30:
            r1.close()
            goto L44
        L34:
            r0 = move-exception
            goto L45
        L36:
            r0 = move-exception
            java.lang.String r3 = "DinamicX_Db"
            java.lang.String r4 = "DB_Query"
            r5 = 60015(0xea6f, float:8.4099E-41)
            r6.trackError(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L44
            goto L30
        L44:
            return r2
        L45:
            if (r1 == 0) goto L4a
            r1.close()
        L4a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.template.db.DXDataBaseHelper.getDbSize():int");
    }

    public LinkedList<DXTemplateItem> query(String str, DXTemplateItem dXTemplateItem) {
        Throwable th;
        SQLiteDatabase b2;
        String[] split;
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("a59e022c", new Object[]{this, str, dXTemplateItem});
        }
        LinkedList<DXTemplateItem> linkedList = new LinkedList<>();
        String[] strArr = {str, dXTemplateItem.f11925a};
        Cursor cursor = null;
        try {
            b2 = this.mDbHelper.b();
        } catch (Throwable th2) {
            th = th2;
        }
        if (b2 == null) {
            trackError(str, DXMonitorConstant.DX_MONITOR_DB_QUERY, dXTemplateItem, s.DX_DB_QUERY_ERROR, "SQLiteDatabase = null");
            return linkedList;
        }
        Cursor query = b2.query(TABLE_NAME, QUERY_COLUMNS, QUERY_WHERE, strArr, null, null, ORDER_BY);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    DXTemplateItem dXTemplateItem2 = new DXTemplateItem();
                    dXTemplateItem2.g = new f();
                    dXTemplateItem2.f11925a = dXTemplateItem.f11925a;
                    dXTemplateItem2.b = query.getLong(2);
                    dXTemplateItem2.g.f11934a = query.getString(3);
                    String string = query.getString(4);
                    if (!TextUtils.isEmpty(string) && (length = (split = string.split(",")).length) > 1 && length % 2 == 0) {
                        dXTemplateItem2.g.b();
                        for (int i = 0; i < length; i += 2) {
                            dXTemplateItem2.g.b.put(split[i], split[i + 1]);
                        }
                    }
                    dXTemplateItem2.c = query.getString(5);
                    linkedList.addFirst(dXTemplateItem2);
                } catch (Throwable th3) {
                    th = th3;
                    cursor = query;
                    try {
                        trackError(str, DXMonitorConstant.DX_MONITOR_DB_QUERY, dXTemplateItem, s.DX_DB_QUERY_ERROR, th);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return linkedList;
                    } catch (Throwable th4) {
                        Cursor cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th4;
                    }
                }
            }
        }
        if (query != null) {
            query.close();
        }
        return linkedList;
    }

    public LinkedList<DXTemplateItem> queryWithDirtyColumn(String str, DXTemplateItem dXTemplateItem) {
        Throwable th;
        SQLiteDatabase b2;
        String[] split;
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("28ddfffa", new Object[]{this, str, dXTemplateItem});
        }
        LinkedList<DXTemplateItem> linkedList = new LinkedList<>();
        String[] strArr = {str, dXTemplateItem.f11925a};
        Cursor cursor = null;
        try {
            b2 = this.mDbHelper.b();
        } catch (Throwable th2) {
            th = th2;
        }
        if (b2 == null) {
            trackError(str, DXMonitorConstant.DX_MONITOR_DB_QUERY, dXTemplateItem, s.DX_DB_QUERY_ERROR, "SQLiteDatabase = null");
            return linkedList;
        }
        Cursor query = b2.query(TABLE_NAME, QUERY_COLUMNS_WITH_DIRTY, QUERY_WHERE, strArr, null, null, ORDER_BY);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    DXTemplateItem dXTemplateItem2 = new DXTemplateItem();
                    dXTemplateItem2.g = new f();
                    dXTemplateItem2.f11925a = dXTemplateItem.f11925a;
                    dXTemplateItem2.b = query.getLong(2);
                    dXTemplateItem2.g.f11934a = query.getString(3);
                    String string = query.getString(4);
                    if (!TextUtils.isEmpty(string) && (length = (split = string.split(",")).length) > 1 && length % 2 == 0) {
                        dXTemplateItem2.g.b();
                        for (int i = 0; i < length; i += 2) {
                            dXTemplateItem2.g.b.put(split[i], split[i + 1]);
                        }
                    }
                    dXTemplateItem2.c = query.getString(5);
                    dXTemplateItem2.f = "true".equals(query.getString(6));
                    linkedList.addFirst(dXTemplateItem2);
                } catch (Throwable th3) {
                    th = th3;
                    cursor = query;
                    try {
                        trackError(str, DXMonitorConstant.DX_MONITOR_DB_QUERY, dXTemplateItem, s.DX_DB_QUERY_ERROR, th);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return linkedList;
                    } catch (Throwable th4) {
                        Cursor cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th4;
                    }
                }
            }
        }
        if (query != null) {
            query.close();
        }
        return linkedList;
    }

    public void delete(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e91cca5", new Object[]{this, str, dXTemplateItem});
        } else if (TextUtils.isEmpty(str) || !fxb.a(dXTemplateItem)) {
        } else {
            try {
                String[] strArr = {str, dXTemplateItem.f11925a, String.valueOf(dXTemplateItem.b)};
                SQLiteDatabase a2 = this.mDbHelper.a();
                if (a2 == null) {
                    return;
                }
                a2.delete(TABLE_NAME, QUERY_WHERE_DEL, strArr);
            } catch (Throwable th) {
                trackError(str, DXMonitorConstant.DX_MONITOR_DB_DELETE, dXTemplateItem, s.DX_DB_DELETE_ERROR, th);
            }
        }
    }

    public boolean delete(String str, List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("904c72f1", new Object[]{this, str, list})).booleanValue() : batchExecuteUpdateOrDelete(str, list, DELETE_SQL, DXMonitorConstant.DX_MONITOR_DB_DELETE, s.DX_DB_DELETE_ERROR);
    }

    public boolean updateTemplatesDirty(String str, List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b690148", new Object[]{this, str, list})).booleanValue() : batchExecuteUpdateOrDelete(str, list, UPDATE_DIRTY_SQL, DXMonitorConstant.DX_MONITOR_DB_UPDATE, s.DX_DB_UPDATE_ERROR);
    }

    public boolean batchExecuteUpdateOrDelete(String str, List<DXTemplateItem> list, String str2, String str3, int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae5c53df", new Object[]{this, str, list, str2, str3, new Integer(i)})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || list == null || list.isEmpty()) {
            return false;
        }
        SQLiteDatabase a2 = this.mDbHelper.a();
        if (a2 == null || !a2.isOpen()) {
            trackError(str, str3, (DXTemplateItem) null, i, "SQLiteDatabase = null");
            return false;
        }
        try {
            SQLiteStatement compileStatement = a2.compileStatement(str2);
            a2.beginTransaction();
            loop0: while (true) {
                z = true;
                for (DXTemplateItem dXTemplateItem : list) {
                    bindString(compileStatement, 1, str);
                    bindString(compileStatement, 2, dXTemplateItem.f11925a);
                    compileStatement.bindLong(3, dXTemplateItem.b);
                    if (compileStatement.executeUpdateDelete() > 0) {
                        break;
                    }
                    z = false;
                }
            }
            if (z) {
                a2.setTransactionSuccessful();
            }
            a2.endTransaction();
            return z;
        } catch (Throwable th) {
            trackError(str, str3, (DXTemplateItem) null, i, th);
            return false;
        }
    }

    private String changeMap2String(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35ae8a99", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(entry.getKey());
                sb.append(',');
                sb.append(entry.getValue());
                sb.append(',');
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
                return sb.toString();
            }
        }
        return null;
    }

    public void deleteAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5ab17d", new Object[]{this});
            return;
        }
        SQLiteDatabase a2 = this.mDbHelper.a();
        if (a2 == null) {
            return;
        }
        try {
            a2.execSQL("delete from template_info");
        } catch (Throwable th) {
            trackError("DinamicX_db", DXMonitorConstant.DX_MONITOR_DB_DELETE_ALL, s.DX_DB_DELETE_ALL_ERROR, th);
        }
    }

    public void closeDatabase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00f5e9a", new Object[]{this});
        } else {
            this.mDbHelper.c();
        }
    }

    public void dropTable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e7726", new Object[]{this});
            return;
        }
        SQLiteDatabase a2 = this.mDbHelper.a();
        if (a2 == null) {
            return;
        }
        DXFileDataBaseEntry.SCHEMA.dropTables(a2);
    }

    /* loaded from: classes.dex */
    public final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private b b;
        private SQLiteDatabase c;
        private String d;

        static {
            kge.a(12834828);
        }

        public a(Context context, String str, String str2) {
            this.c = null;
            this.b = new b(context, str);
            this.d = str2;
            try {
                this.c = this.b.getWritableDatabase();
            } catch (Throwable th) {
                DXDataBaseHelper.access$000(DXDataBaseHelper.this, this.d, "DB_Open60025", s.DX_DB_OPEN_ERROR, th);
            }
        }

        public SQLiteDatabase a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SQLiteDatabase) ipChange.ipc$dispatch("7734f4a7", new Object[]{this});
            }
            if (this.c == null) {
                try {
                    this.c = this.b.getWritableDatabase();
                } catch (Throwable th) {
                    DXDataBaseHelper.access$000(DXDataBaseHelper.this, this.d, "DB_Open60026", s.DX_DB_OPEN_ERROR, th);
                }
            }
            return this.c;
        }

        public SQLiteDatabase b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SQLiteDatabase) ipChange.ipc$dispatch("3a215e06", new Object[]{this});
            }
            if (this.c == null) {
                try {
                    this.c = this.b.getReadableDatabase();
                } catch (Throwable th) {
                    DXDataBaseHelper.access$000(DXDataBaseHelper.this, this.d, "DB_Open60027", s.DX_DB_OPEN_ERROR, th);
                }
            }
            return this.c;
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            try {
                if (this.c != null && this.c.isOpen()) {
                    this.c.close();
                }
            } catch (Throwable th) {
                try {
                    DXDataBaseHelper.access$000(DXDataBaseHelper.this, this.d, DXMonitorConstant.DX_MONITOR_DB_CLOSE, s.DX_DB_CLOSE_ERROR, th);
                } finally {
                    this.c = null;
                }
            }
        }
    }

    private void bindString(SQLiteStatement sQLiteStatement, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b9eb75", new Object[]{this, sQLiteStatement, new Integer(i), str});
        } else if (str == null) {
            sQLiteStatement.bindNull(i);
        } else {
            sQLiteStatement.bindString(i, str);
        }
    }

    /* loaded from: classes.dex */
    public final class b extends SQLiteOpenHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(43250753);
        }

        public b(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
                return;
            }
            long nanoTime = System.nanoTime();
            DXFileDataBaseEntry.SCHEMA.createTables(sQLiteDatabase);
            DXDataBaseHelper.access$100(DXDataBaseHelper.this, DXMonitorConstant.DX_MONITOR_DB_CREATE, System.nanoTime() - nanoTime);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
                return;
            }
            DXFileDataBaseEntry.SCHEMA.dropTables(sQLiteDatabase);
            onCreate(sQLiteDatabase);
        }
    }

    private void trackError(String str, String str2, int i, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9348d76a", new Object[]{this, str, str2, new Integer(i), th});
        } else {
            trackError(str, str2, (DXTemplateItem) null, i, th);
        }
    }

    private void trackError(String str, String str2, DXTemplateItem dXTemplateItem, int i, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c8cc853", new Object[]{this, str, str2, dXTemplateItem, new Integer(i), th});
        } else {
            trackError(str, str2, dXTemplateItem, i, com.taobao.android.dinamicx.exception.a.a(th));
        }
    }

    private void trackError(String str, String str2, DXTemplateItem dXTemplateItem, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8501e22c", new Object[]{this, str, str2, dXTemplateItem, new Integer(i), str3});
            return;
        }
        s sVar = new s(str);
        sVar.b = dXTemplateItem;
        s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_DB, str2, i);
        aVar.e = str3;
        sVar.c = new ArrayList();
        sVar.c.add(aVar);
        com.taobao.android.dinamicx.monitor.b.a(sVar);
    }

    private void trackerPerform(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d4adb2a", new Object[]{this, str, new Long(j)});
        } else {
            com.taobao.android.dinamicx.monitor.b.a(2, "DinamicX_db", DXMonitorConstant.DX_MONITOR_DB, str, (DXTemplateItem) null, (Map<String, String>) null, j, true);
        }
    }
}
