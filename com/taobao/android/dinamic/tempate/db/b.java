package com.taobao.android.dinamic.tempate.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.db.Entry;
import java.io.File;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String[] b;
    private static final String[] c;
    private static final String d;
    private final LruCache<String, a> e;
    private File f;
    private boolean g;
    private long h;
    private long i;
    private C0472b j;
    private d k;

    /* loaded from: classes5.dex */
    public interface d {
    }

    public static /* synthetic */ File a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("3c9e0ba9", new Object[]{bVar}) : bVar.f;
    }

    static {
        kge.a(-933215431);
        b = new String[]{String.format("sum(%s)", "size")};
        c = new String[]{"_id", UploadConstants.FILE_NAME, "tag", "size"};
        d = String.format("%s ASC", "last_access");
    }

    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f11764a;
        public File b;
        private long c;

        static {
            kge.a(-675579781);
        }

        public static /* synthetic */ long a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eb84bafb", new Object[]{aVar})).longValue() : aVar.c;
        }

        private a(long j, String str, File file) {
            this.c = j;
            this.f11764a = str;
            this.b = file;
        }
    }

    public b(Context context, File file, String str, long j) {
        this(context, file, str, j, 4);
    }

    public b(Context context, File file, String str, long j, int i) {
        this.g = false;
        this.f = file;
        this.h = j;
        this.e = new LruCache<>(i);
        this.j = new C0472b(context, str);
    }

    public void a(String str, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9c11629", new Object[]{this, str, file});
            return;
        }
        if (!this.g) {
            try {
                a();
            } catch (Exception e) {
                Log.e("FileCache", "file cache init exception:", e);
                return;
            }
        }
        com.taobao.android.dinamic.tempate.db.c.a(file.getParentFile().equals(this.f));
        c cVar = new c();
        cVar.b = com.taobao.android.dinamic.tempate.db.c.a(str);
        cVar.c = str;
        cVar.d = file.getName();
        cVar.e = file.length();
        cVar.f = System.currentTimeMillis();
        if (cVar.e >= this.h) {
            file.delete();
            throw new IllegalArgumentException("file too large: " + cVar.e);
        }
        synchronized (this) {
            c b2 = b(str);
            if (b2 != null) {
                cVar.d = b2.d;
                cVar.e = b2.e;
            } else {
                this.i += cVar.e;
            }
            c.SCHEMA.a(this.j.getWritableDatabase(), cVar);
            if (this.i > this.h) {
                a(16);
            }
        }
    }

    public a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("227e81d1", new Object[]{this, str});
        }
        if (!this.g) {
            try {
                a();
            } catch (Exception e) {
                Log.e("FileCache", "file cache init exception:", e);
                return null;
            }
        }
        a aVar = this.e.get(str);
        if (aVar != null) {
            if (aVar.b.isFile()) {
                synchronized (this) {
                    a(a.a(aVar));
                }
                return aVar;
            }
            this.e.remove(str);
        }
        synchronized (this) {
            c b2 = b(str);
            if (b2 == null) {
                return null;
            }
            a aVar2 = new a(b2.f11761a, str, new File(this.f, b2.d));
            if (!aVar2.b.isFile()) {
                this.j.getWritableDatabase().delete("file_cache", "_id=?", new String[]{String.valueOf(b2.f11761a)});
                this.i -= b2.e;
                return null;
            }
            this.e.put(str, aVar2);
            return aVar2;
        }
    }

    private c b(String str) {
        Cursor cursor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("703dfa10", new Object[]{this, str});
        }
        try {
            cursor = this.j.getReadableDatabase().query("file_cache", c.SCHEMA.b(), "hash_code=? AND tag=?", new String[]{String.valueOf(com.taobao.android.dinamic.tempate.db.c.a(str)), str}, null, null, null);
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
            a(cVar.f11761a);
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

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (Build.VERSION.SDK_INT == 29) {
            try {
                a(this.j.getWritableDatabase(), "file_cache", "_id=?", String.valueOf(j));
            } catch (Throwable th) {
                Log.e("FileCache", "sdk int 29 update db exception", th);
            }
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("last_access", Long.valueOf(System.currentTimeMillis()));
            try {
                this.j.getWritableDatabase().update("file_cache", contentValues, "_id=?", new String[]{String.valueOf(j)});
            } catch (Throwable th2) {
                Log.e("FileCache", "update db exception", th2);
            }
        }
    }

    private int a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0804b32", new Object[]{this, sQLiteDatabase, str, str2, str3})).intValue();
        }
        sQLiteDatabase.acquireReference();
        try {
            StringBuilder sb = new StringBuilder(120);
            sb.append("UPDATE ");
            sb.append(str);
            sb.append(" SET ");
            sb.append("last_access=?");
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(sb.toString());
            compileStatement.bindLong(1, System.currentTimeMillis());
            compileStatement.bindString(2, str3);
            int executeUpdateDelete = compileStatement.executeUpdateDelete();
            compileStatement.close();
            return executeUpdateDelete;
        } finally {
            sQLiteDatabase.releaseReference();
        }
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.g) {
        } else {
            this.g = true;
            if (!this.f.isDirectory()) {
                this.f.mkdirs();
                if (!this.f.isDirectory()) {
                    throw new RuntimeException("cannot create: " + this.f.getAbsolutePath());
                }
            }
            Cursor query = this.j.getReadableDatabase().query("file_cache", b, null, null, null, null, null);
            if (query.moveToNext()) {
                this.i = query.getLong(0);
            }
            if (query != null) {
                query.close();
            }
            if (this.i > this.h) {
                a(16);
            }
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        Cursor query = this.j.getReadableDatabase().query("file_cache", c, null, null, null, null, d);
        while (i > 0) {
            try {
                if (this.i <= this.h || !query.moveToNext()) {
                    break;
                }
                long j = query.getLong(0);
                String string = query.getString(1);
                String string2 = query.getString(2);
                long j2 = query.getLong(3);
                synchronized (this.e) {
                    if (this.e.get(string2) == null) {
                        i--;
                        if (a(new File(this.f, string))) {
                            this.i -= j2;
                            this.j.getWritableDatabase().delete("file_cache", "_id=?", new String[]{String.valueOf(j)});
                        } else {
                            String str = "unable to delete file: " + string;
                        }
                    }
                }
            } finally {
                query.close();
            }
        }
    }

    private boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{this, file})).booleanValue();
        }
        if (file == null) {
            return true;
        }
        d dVar = this.k;
        boolean delete = file.delete();
        d dVar2 = this.k;
        return delete;
    }

    @Entry.Table("file_cache")
    /* loaded from: classes.dex */
    public static class c extends Entry {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final com.taobao.android.dinamic.tempate.db.a SCHEMA;
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
            kge.a(1408534667);
            com.taobao.android.dinamic.tempate.db.a aVar = new com.taobao.android.dinamic.tempate.db.a(c.class);
            SCHEMA = aVar;
            aVar.a(c.class);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "FileEntry{hashCode=" + this.b + ", tag='" + this.c + "', filename='" + this.d + "', size=" + this.e + ", lastAccess=" + this.f + '}';
        }
    }

    /* renamed from: com.taobao.android.dinamic.tempate.db.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0472b extends SQLiteOpenHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DATABASE_VERSION = 1;

        static {
            kge.a(1986217460);
        }

        public C0472b(Context context, String str) {
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
            File[] listFiles = b.a(b.this).listFiles();
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
