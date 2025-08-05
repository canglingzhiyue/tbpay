package tb;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.taobao.windvane.jsbridge.api.WVFile;
import android.util.Log;
import com.nirvana.tools.logger.cache.db.DbException;
import com.nirvana.tools.logger.model.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

/* loaded from: classes4.dex */
public abstract class dab<T extends c> {
    public static final int DEFAULT_LIMIT = 5242880;
    private static final String b = "tb.dab";

    /* renamed from: a  reason: collision with root package name */
    protected String f26632a;
    private dad c;
    private SQLiteDatabase d;
    private Semaphore e = new Semaphore(1);

    public dab(String str, dad dadVar) {
        this.f26632a = str;
        this.c = dadVar;
        a((long) WVFile.FILE_MAX_SIZE);
    }

    private long a(Cursor cursor) {
        if (cursor == null) {
            return -1L;
        }
        return cursor.getLong(cursor.getColumnIndex("_id"));
    }

    private <G> void a(List<G> list, String[] strArr) {
        if (list.size() == strArr.length) {
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = String.valueOf(list.get(i));
            }
            return;
        }
        String str = b;
        Log.e(str, "NumberList size(" + list.size() + ") not equals results length[" + strArr.length + riy.ARRAY_END_STR);
    }

    protected int a(SQLiteDatabase sQLiteDatabase) {
        return (int) DatabaseUtils.longForQuery(sQLiteDatabase, String.format("SELECT COUNT(%s) FROM %s", "_id", this.f26632a), null);
    }

    protected abstract ContentValues a(T t);

    public synchronized SQLiteDatabase a() {
        if (this.d == null) {
            this.d = this.c.getWritableDatabase();
        }
        return this.d;
    }

    public synchronized List<T> a(int i, int i2, String str) {
        String str2;
        String[] strArr;
        ArrayList arrayList;
        String str3 = "";
        if (i2 >= 0) {
            str2 = "upload_flag = ?";
            strArr = new String[]{String.valueOf(i2)};
        } else {
            str2 = null;
            strArr = null;
        }
        cef.a(b, "query: selection=" + str2);
        if (i > 0) {
            str3 = String.valueOf(i);
        }
        arrayList = new ArrayList();
        Cursor query = b().query(this.f26632a, null, str2, strArr, null, null, str, str3);
        while (query.moveToNext()) {
            T b2 = b(query);
            if (b2 != null) {
                arrayList.add(b2);
            }
        }
        query.close();
        cef.a(b, "query: result=" + arrayList + ", size=" + arrayList.size());
        c();
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078 A[Catch: Throwable -> 0x00db, TryCatch #1 {, blocks: (B:26:0x00d1, B:3:0x0001, B:9:0x0026, B:10:0x003b, B:16:0x0063, B:18:0x0078, B:19:0x007c, B:20:0x009f, B:22:0x00a5, B:24:0x00ab, B:25:0x00af, B:12:0x0041, B:15:0x0054), top: B:39:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5 A[Catch: Throwable -> 0x00db, TryCatch #1 {, blocks: (B:26:0x00d1, B:3:0x0001, B:9:0x0026, B:10:0x003b, B:16:0x0063, B:18:0x0078, B:19:0x007c, B:20:0x009f, B:22:0x00a5, B:24:0x00ab, B:25:0x00af, B:12:0x0041, B:15:0x0054), top: B:39:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.List<T> a(long r10, long r12, int r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldb
            r1.<init>()     // Catch: java.lang.Throwable -> Ldb
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ldb
            r2.<init>()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r3 = "1"
            r2.add(r3)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r3 = "upload_flag = ?"
            r1.append(r3)     // Catch: java.lang.Throwable -> Ldb
            r3 = 0
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 < 0) goto L3f
            int r6 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r6 < 0) goto L3f
            int r6 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r6 < 0) goto L3f
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> Ldb
            r2.add(r10)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r10 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> Ldb
            r2.add(r10)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r10 = " and _id"
            r1.append(r10)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r10 = " between ? and ?"
        L3b:
            r1.append(r10)     // Catch: java.lang.Throwable -> Ldb
            goto L63
        L3f:
            if (r5 < 0) goto L50
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> Ldb
            r2.add(r10)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r10 = " and _id"
            r1.append(r10)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r10 = " >= ?"
            goto L3b
        L50:
            int r10 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r10 < 0) goto L63
            java.lang.String r10 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> Ldb
            r2.add(r10)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r10 = " and _id"
            r1.append(r10)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r10 = " <= ?"
            goto L3b
        L63:
            java.lang.String r10 = tb.dab.b     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r12 = "query: selection="
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Ldb
            r11.append(r1)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Ldb
            tb.cef.a(r10, r11)     // Catch: java.lang.Throwable -> Ldb
            if (r14 <= 0) goto L7c
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> Ldb
        L7c:
            r8 = r0
            int r10 = r2.size()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> Ldb
            r2.toArray(r4)     // Catch: java.lang.Throwable -> Ldb
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ldb
            r10.<init>()     // Catch: java.lang.Throwable -> Ldb
            android.database.sqlite.SQLiteDatabase r0 = r9.b()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r11 = r9.f26632a     // Catch: java.lang.Throwable -> Ldb
            r2 = 0
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> Ldb
            r5 = 0
            r6 = 0
            java.lang.String r7 = "_id ASC"
            r1 = r11
            android.database.Cursor r11 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Ldb
        L9f:
            boolean r12 = r11.moveToNext()     // Catch: java.lang.Throwable -> Ldb
            if (r12 == 0) goto Laf
            com.nirvana.tools.logger.model.c r12 = r9.b(r11)     // Catch: java.lang.Throwable -> Ldb
            if (r12 == 0) goto L9f
            r10.add(r12)     // Catch: java.lang.Throwable -> Ldb
            goto L9f
        Laf:
            r11.close()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r11 = tb.dab.b     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r13 = "query: result="
            r12.<init>(r13)     // Catch: java.lang.Throwable -> Ldb
            r12.append(r10)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r13 = ", size="
            r12.append(r13)     // Catch: java.lang.Throwable -> Ldb
            int r13 = r10.size()     // Catch: java.lang.Throwable -> Ldb
            r12.append(r13)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Ldb
            tb.cef.a(r11, r12)     // Catch: java.lang.Throwable -> Ldb
            r9.c()     // Catch: java.lang.Throwable -> Le1
            monitor-exit(r9)
            return r10
        Ld6:
            r10 = move-exception
            r9.c()     // Catch: java.lang.Throwable -> Le1
            throw r10     // Catch: java.lang.Throwable -> Le1
        Ldb:
            r9.c()     // Catch: java.lang.Throwable -> Le1
            r10 = 0
            monitor-exit(r9)
            return r10
        Le1:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dab.a(long, long, int):java.util.List");
    }

    public synchronized void a(long j) {
        try {
            a().setMaximumSize(j);
            c();
        } catch (Exception e) {
            e.printStackTrace();
            c();
        }
    }

    public synchronized void a(List<T> list, long j, int i) throws DbException {
        if (list != null) {
            if (list.size() != 0) {
                ArrayList<Long> arrayList = new ArrayList();
                for (T t : list) {
                    arrayList.add(Long.valueOf(t.b()));
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(String.valueOf(j));
                arrayList2.add(String.valueOf(i));
                arrayList2.add("1");
                for (Long l : arrayList) {
                    arrayList2.add(String.valueOf(l));
                }
                String[] strArr = new String[arrayList2.size()];
                String format = String.format("Update %s SET %s=?, %s=?, %s= %s+? where %s in %s", this.f26632a, "timestamp", "upload_flag", "upload_count", "upload_count", "_id", b(arrayList.size()));
                arrayList2.toArray(strArr);
                a().execSQL(format, strArr);
                c();
                return;
            }
        }
        c();
    }

    protected synchronized boolean a(SQLiteDatabase sQLiteDatabase, int i) throws DbException {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Cursor query = sQLiteDatabase.query(this.f26632a, new String[]{"_id"}, null, null, null, null, "timestamp ASC", i > 0 ? String.valueOf(i) : null);
            ArrayList arrayList = new ArrayList();
            while (query.moveToNext()) {
                Long valueOf = Long.valueOf(a(query));
                if (valueOf.longValue() != -1) {
                    arrayList.add(valueOf);
                }
            }
            query.close();
            String str = b;
            cef.a(str, "delete oldest: escape=" + (System.currentTimeMillis() - currentTimeMillis));
            if (!arrayList.isEmpty()) {
                return a(sQLiteDatabase, arrayList);
            }
        } catch (Exception e) {
            new DbException("Delete oldest exception!", e);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized boolean a(SQLiteDatabase sQLiteDatabase, List<Long> list) throws DbException {
        if (list != 0) {
            try {
                if (!list.isEmpty()) {
                    String str = b;
                    cef.a(str, "delete: size=" + list.size());
                    StringBuilder sb = new StringBuilder("_id in ");
                    sb.append(b((long) list.size()));
                    String str2 = b;
                    cef.a(str2, "delete: selection=" + ((Object) sb));
                    String[] strArr = new String[list.size()];
                    a(list, strArr);
                    int delete = sQLiteDatabase.delete(this.f26632a, sb.toString(), strArr);
                    String str3 = b;
                    cef.a(str3, "delete: count=" + delete);
                    return delete == list.size();
                }
            } catch (Exception e) {
                throw new DbException("Delete records failed!", e);
            }
        }
        return true;
    }

    public synchronized boolean a(List<T> list) throws DbException {
        long j = -1;
        boolean z = true;
        if (list != null) {
            try {
                if (list.size() != 0) {
                    if (d() >= WVFile.FILE_MAX_SIZE) {
                        cef.a(b, "Table size is limited, clear half of data!");
                        a(a(), a(a()) / 2);
                    }
                    this.e.acquire();
                    cef.a(b, "beginTransaction");
                    a().beginTransaction();
                    String str = b;
                    StringBuilder sb = new StringBuilder("writedatabase success  ");
                    sb.append(this.d == null);
                    cef.a(str, sb.toString());
                    for (T t : list) {
                        ContentValues a2 = a((dab<T>) t);
                        cef.a(b, "ContentValues");
                        j = a().insert(this.f26632a, null, a2);
                        cef.a(b, "insert");
                        if (j < 0 && a(a()) > 0) {
                            a(a(), a(a()) / 2);
                            j = a().insert(this.f26632a, null, a2);
                        }
                        String str2 = b;
                        cef.a(str2, "insert: id=" + j);
                    }
                    a().setTransactionSuccessful();
                    String str3 = b;
                    StringBuilder sb2 = new StringBuilder("final ");
                    sb2.append(a() == null);
                    cef.a(str3, sb2.toString());
                    this.d.endTransaction();
                    this.e.release();
                    c();
                    return j >= 0;
                }
            } catch (Exception e) {
                throw new DbException("Insert record failed!", e);
            }
        }
        String str4 = b;
        StringBuilder sb3 = new StringBuilder("final ");
        if (a() != null) {
            z = false;
        }
        sb3.append(z);
        cef.a(str4, sb3.toString());
        this.d.endTransaction();
        this.e.release();
        c();
        return false;
    }

    public SQLiteDatabase b() {
        if (this.d == null) {
            this.d = this.c.getReadableDatabase();
        }
        return this.d;
    }

    protected abstract T b(Cursor cursor);

    protected String b(long j) {
        if (j > 0) {
            StringBuilder sb = new StringBuilder(riy.BRACKET_START_STR);
            do {
                sb.append("?,");
                j--;
            } while (j > 0);
            sb.deleteCharAt(sb.length() - 1);
            sb.append(riy.BRACKET_END_STR);
            return sb.toString();
        }
        return null;
    }

    public synchronized boolean b(List<T> list) throws DbException {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        arrayList.add(Long.valueOf(t.b()));
                    }
                    boolean a2 = a(a(), arrayList);
                    c();
                    return a2;
                }
            } catch (DbException e) {
                throw e;
            }
        }
        c();
        return true;
    }

    public void c() {
        SQLiteDatabase sQLiteDatabase = this.d;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.d = null;
        }
    }

    public synchronized long d() {
        long pageSize;
        pageSize = b().getPageSize() * DatabaseUtils.longForQuery(this.d, "PRAGMA page_count;", null);
        c();
        return pageSize;
    }

    public synchronized long e() {
        long j;
        Cursor query = b().query(true, this.f26632a, new String[]{"_id"}, "upload_flag=?", new String[]{"1"}, null, null, "_id desc", null);
        query.moveToFirst();
        j = query.getLong(0);
        query.close();
        c();
        return j;
    }
}
