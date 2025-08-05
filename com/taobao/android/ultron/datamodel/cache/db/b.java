package com.taobao.android.ultron.datamodel.cache.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.cache.db.Entry;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.jqg;
import tb.jqh;
import tb.kge;
import tb.spk;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f15742a;
    private static final String[] b;
    private final LruCache<String, a> c;
    private File d;
    private boolean e;
    private long f;
    private C0610b g;

    public static /* synthetic */ C0610b a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C0610b) ipChange.ipc$dispatch("7a428310", new Object[]{bVar}) : bVar.g;
    }

    public static /* synthetic */ File b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("7d9a41cb", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : f15742a;
    }

    static {
        kge.a(1647656762);
        f15742a = c.SCHEMA.a();
        b = new String[]{String.format("sum(%s)", "size")};
    }

    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f15744a;
        public File b;
        private long c;

        static {
            kge.a(2011341274);
        }

        public static /* synthetic */ long a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7678b0d8", new Object[]{aVar})).longValue() : aVar.c;
        }

        private a(long j, String str, File file) {
            this.c = j;
            this.f15744a = str;
            this.b = file;
        }
    }

    public a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3fb6d7e0", new Object[]{this, str});
        }
        if (!this.e) {
            try {
                b();
            } catch (Exception e) {
                Log.e("FileCache", "file cache init exception:", e);
                return null;
            }
        }
        a aVar = this.c.get(str);
        if (aVar != null) {
            if (aVar.b.isFile()) {
                synchronized (this) {
                    a(a.a(aVar));
                }
                return aVar;
            }
            this.c.remove(str);
        }
        synchronized (this) {
            c c2 = c(str);
            if (c2 == null) {
                return null;
            }
            a aVar2 = new a(c2.f15739a, str, new File(this.d, c2.d));
            if (!aVar2.b.isFile()) {
                this.g.getWritableDatabase().delete(f15742a, "_id=?", new String[]{String.valueOf(c2.f15739a)});
                return null;
            }
            this.c.put(str, aVar2);
            return aVar2;
        }
    }

    public b(Context context, File file, String str, long j) {
        this(context, file, str, j, 4);
    }

    public b(Context context, File file, String str, long j, int i) {
        this.e = false;
        this.d = file;
        this.f = j;
        this.c = new LruCache<>(i);
        this.g = new C0610b(context, str);
        if (Build.VERSION.SDK_INT >= 16) {
            this.g.setWriteAheadLoggingEnabled(false);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        synchronized (this) {
            c c2 = c(str);
            if (c2 != null) {
                a aVar = new a(c2.f15739a, str, new File(this.d, c2.d));
                this.g.getWritableDatabase().delete(f15742a, "_id=?", new String[]{String.valueOf(c2.f15739a)});
                aVar.b.delete();
            }
        }
    }

    public void a(String str, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9c11629", new Object[]{this, str, file});
            return;
        }
        if (!this.e) {
            try {
                b();
            } catch (Exception e) {
                Log.e("FileCache", "file cache init exception:", e);
                return;
            }
        }
        com.taobao.android.ultron.datamodel.cache.db.c.a(file.getParentFile().equals(this.d));
        c cVar = new c();
        cVar.b = com.taobao.android.ultron.datamodel.cache.db.c.a(str);
        cVar.c = str;
        cVar.d = file.getName();
        cVar.e = file.length();
        cVar.f = System.currentTimeMillis();
        if (cVar.e >= this.f) {
            file.delete();
            throw new IllegalArgumentException("file too large: " + cVar.e);
        }
        synchronized (this) {
            c c2 = c(str);
            if (c2 != null) {
                cVar.d = c2.d;
                cVar.e = c2.e;
            }
            c.SCHEMA.a(this.g.getWritableDatabase(), cVar);
            Log.e("detail_FileCache", "insertOrReplace entry:" + cVar);
        }
    }

    public List<a> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        if (!this.e) {
            try {
                b();
            } catch (Exception e) {
                Log.e("FileCache", "file cache init exception:", e);
                return null;
            }
        }
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            List<c> c2 = c();
            if (c2 == null) {
                return null;
            }
            for (c cVar : c2) {
                a aVar = new a(cVar.f15739a, cVar.c, new File(this.d, cVar.d));
                if (!aVar.b.isFile()) {
                    this.g.getWritableDatabase().delete(f15742a, "_id=?", new String[]{String.valueOf(cVar.f15739a)});
                } else {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<com.taobao.android.ultron.datamodel.cache.db.b.c> c() {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.ultron.datamodel.cache.db.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r12
            java.lang.String r2 = "31b9b59d"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.util.List r0 = (java.util.List) r0
            return r0
        L15:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            com.taobao.android.ultron.datamodel.cache.db.b$b r2 = r12.g     // Catch: java.lang.Throwable -> L53
            android.database.sqlite.SQLiteDatabase r3 = r2.getReadableDatabase()     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = com.taobao.android.ultron.datamodel.cache.db.b.f15742a     // Catch: java.lang.Throwable -> L53
            com.taobao.android.ultron.datamodel.cache.db.a r2 = com.taobao.android.ultron.datamodel.cache.db.b.c.SCHEMA     // Catch: java.lang.Throwable -> L53
            java.lang.String[] r5 = r2.b()     // Catch: java.lang.Throwable -> L53
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L53
        L32:
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L4b
            com.taobao.android.ultron.datamodel.cache.db.b$c r3 = new com.taobao.android.ultron.datamodel.cache.db.b$c     // Catch: java.lang.Throwable -> L4e
            r3.<init>()     // Catch: java.lang.Throwable -> L4e
            com.taobao.android.ultron.datamodel.cache.db.a r4 = com.taobao.android.ultron.datamodel.cache.db.b.c.SCHEMA     // Catch: java.lang.Throwable -> L4e
            r4.a(r2, r3)     // Catch: java.lang.Throwable -> L4e
            long r4 = r3.f15739a     // Catch: java.lang.Throwable -> L4e
            r12.a(r4)     // Catch: java.lang.Throwable -> L4e
            r0.add(r3)     // Catch: java.lang.Throwable -> L4e
            goto L32
        L4b:
            if (r2 == 0) goto L64
            goto L61
        L4e:
            r1 = move-exception
            goto L57
        L50:
            r0 = move-exception
            r2 = r1
            goto L66
        L53:
            r2 = move-exception
            r11 = r2
            r2 = r1
            r1 = r11
        L57:
            java.lang.String r3 = "FileCache"
            java.lang.String r4 = "query database exception"
            android.util.Log.e(r3, r4, r1)     // Catch: java.lang.Throwable -> L65
            if (r2 == 0) goto L64
        L61:
            r2.close()
        L64:
            return r0
        L65:
            r0 = move-exception
        L66:
            if (r2 == 0) goto L6b
            r2.close()
        L6b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.ultron.datamodel.cache.db.b.c():java.util.List");
    }

    private c c(String str) {
        Cursor cursor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("444c41dc", new Object[]{this, str});
        }
        try {
            cursor = this.g.getReadableDatabase().query(f15742a, c.SCHEMA.b(), "hash_code=? AND tag=?", new String[]{String.valueOf(com.taobao.android.ultron.datamodel.cache.db.c.a(str)), str}, null, null, null);
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            if (!cursor.moveToNext()) {
                return null;
            }
            c cVar = new c();
            c.SCHEMA.a(cursor, (Cursor) cVar);
            a(cVar.f15739a);
            if (cursor != null) {
                cursor.close();
            }
            return cVar;
        } catch (Throwable th2) {
            th = th2;
            try {
                Log.e("FileCache", "query database exception", th);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }

    private void a(final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("last_access", Long.valueOf(System.currentTimeMillis()));
        try {
            if (spk.a("newUltron_container", "asyncUpdateLastAccess", true)) {
                jqh.a(new Runnable() { // from class: com.taobao.android.ultron.datamodel.cache.db.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            b.a(b.this).getWritableDatabase().update(b.d(), contentValues, "_id=?", new String[]{String.valueOf(j)});
                        } catch (Exception e) {
                            jqg.a("ultron", "updateLastAccessError", e.getMessage());
                        }
                    }
                });
            } else {
                this.g.getWritableDatabase().update(f15742a, contentValues, "_id=?", new String[]{String.valueOf(j)});
            }
        } catch (Exception e) {
            Log.e("FileCache", "update db exception", e);
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.e) {
        } else {
            this.e = true;
            if (!this.d.isDirectory()) {
                this.d.mkdirs();
                if (!this.d.isDirectory()) {
                    throw new RuntimeException("cannot create: " + this.d.getAbsolutePath());
                }
            }
        }
    }

    @Entry.Table("file_cache")
    /* loaded from: classes6.dex */
    public static class c extends Entry {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final com.taobao.android.ultron.datamodel.cache.db.a SCHEMA;
        @Entry.Column(indexed = true, value = "hash_code")
        public long b;
        @Entry.Column("tag")
        public String c;
        @Entry.Column(UploadConstants.FILE_NAME)
        public String d;
        @Entry.Column("size")
        public long e;
        @Entry.Column(indexed = true, value = "last_access")
        public long f;

        private c() {
        }

        static {
            kge.a(1772304204);
            SCHEMA = new com.taobao.android.ultron.datamodel.cache.db.a(c.class);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "FileEntry{hashCode=" + this.b + ", tag='" + this.c + "', filename='" + this.d + "', size=" + this.e + ", lastAccess=" + this.f + '}';
        }
    }

    /* renamed from: com.taobao.android.ultron.datamodel.cache.db.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public final class C0610b extends SQLiteOpenHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DATABASE_VERSION = 1;

        static {
            kge.a(-234313773);
        }

        public C0610b(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
                return;
            }
            c.SCHEMA.a(sQLiteDatabase);
            File[] listFiles = b.b(b.this).listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file : listFiles) {
                if (!file.delete()) {
                    String str = "fail to remove: " + file.getAbsolutePath();
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
                return;
            }
            c.SCHEMA.b(sQLiteDatabase);
            onCreate(sQLiteDatabase);
        }
    }
}
