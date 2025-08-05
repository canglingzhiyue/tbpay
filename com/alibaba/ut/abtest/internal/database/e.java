package com.alibaba.ut.abtest.internal.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.alibaba.ut.abtest.internal.util.h;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes.dex */
public abstract class e implements Closeable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteOpenHelper f4189a;

    static {
        kge.a(-1667808918);
        kge.a(-1811054506);
    }

    public e(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f4189a = sQLiteOpenHelper;
    }

    public SQLiteDatabase b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SQLiteDatabase) ipChange.ipc$dispatch("3a215e06", new Object[]{this}) : this.f4189a.getReadableDatabase();
    }

    public SQLiteDatabase c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SQLiteDatabase) ipChange.ipc$dispatch("fd0dc765", new Object[]{this}) : this.f4189a.getWritableDatabase();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.f4189a.close();
        }
    }

    public long[] a(String str, int i, List<ContentValues> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (long[]) ipChange.ipc$dispatch("df9f0923", new Object[]{this, str, new Integer(i), list}) : b(str, i, list);
    }

    private long[] b(String str, int i, List<ContentValues> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("6c3f3424", new Object[]{this, str, new Integer(i), list});
        }
        h.a("Database", "INSERT in transaction. table: " + str + ", values: " + list + ", conflictAlgorithm: " + a(i));
        long[] jArr = new long[list.size()];
        Arrays.fill(jArr, -1L);
        SQLiteDatabase c = c();
        c.beginTransaction();
        for (int i2 = 0; i2 < list.size(); i2++) {
            try {
                jArr[i2] = c.insertWithOnConflict(str, null, list.get(i2), i);
            } catch (Throwable th) {
                c.endTransaction();
                throw th;
            }
        }
        c.setTransactionSuccessful();
        c.endTransaction();
        h.a("Database", "INSERT ids: " + Arrays.toString(jArr));
        return jArr;
    }

    public int a(String str, String str2, String... strArr) {
        int delete;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("434e6e16", new Object[]{this, str, str2, strArr})).intValue();
        }
        h.a("Database", "DELETE table: " + str + " whereClause: " + str2 + "  whereArgs: " + Arrays.toString(strArr));
        SQLiteDatabase c = c();
        if (c.isDbLockedByCurrentThread()) {
            delete = c.delete(str, str2, strArr);
        } else {
            c.beginTransaction();
            try {
                delete = c.delete(str, str2, strArr);
                c.setTransactionSuccessful();
            } finally {
                c.endTransaction();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE affected ");
        sb.append(delete);
        sb.append(delete != 1 ? " rows" : " row");
        h.a("Database", sb.toString());
        return delete;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        h.a("Database", "EXECUTE  sql: " + str);
        c().execSQL(str);
    }

    public Cursor a(String str, String[] strArr, String str2, String str3, String str4, String... strArr2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Cursor) ipChange.ipc$dispatch("a1f379fb", new Object[]{this, str, strArr, str2, str3, str4, strArr2}) : a(str, strArr, null, null, str2, str3, str4, strArr2);
    }

    public Cursor a(String str, String[] strArr, String str2, String str3, String str4, String str5, String str6, String... strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("47ea19e7", new Object[]{this, str, strArr, str2, str3, str4, str5, str6, strArr2});
        }
        long nanoTime = System.nanoTime();
        Cursor query = b().query(str, strArr, str6, strArr2, str2, str3, str4, str5);
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
        h.a("Database", "QUERY (" + millis + "ms) table: " + str + ", columns: " + Arrays.toString(strArr) + ", orderBy: " + str4 + ", limit: " + str5 + ", groupBy: " + str2 + ", having: " + str3 + ", whereClause: " + str6 + ", whereArgs: " + Arrays.toString(strArr2));
        return query;
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return "none";
        }
        if (i == 1) {
            return "rollback";
        }
        if (i == 2) {
            return BaseFBPlugin.VERIFY_STATUS.abort;
        }
        if (i == 3) {
            return "fail";
        }
        if (i == 4) {
            return com.taobao.android.fluid.framework.data.remote.newmodel.a.MATCH_IGNORE;
        }
        if (i == 5) {
            return "replace";
        }
        return "unknown (" + i + ')';
    }
}
