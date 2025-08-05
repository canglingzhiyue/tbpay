package com.alibaba.android.patronus.simplecookie;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.ali.user.open.ucc.util.UccConstants;
import com.alibaba.android.patronus.simplecookie.c;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static f f2421a;
    private static SQLiteDatabase b;
    private static SQLiteDatabase c;
    private static final String[] e = {"cookies", "password", "formurl", "formdata", "httpauth"};
    private static final String[] f = {"_id"};
    private final Object d = new Object();

    private f() {
    }

    public static synchronized f a(Context context) {
        synchronized (f.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("a29fd422", new Object[]{context});
            }
            if (f2421a == null) {
                f2421a = new f();
                try {
                    b = context.openOrCreateDatabase("simple_webview.db", 0, null);
                } catch (SQLiteException unused) {
                    if (context.deleteDatabase("simple_webview.db")) {
                        b = context.openOrCreateDatabase("simple_webview.db", 0, null);
                    }
                }
                if (b != null && b.getVersion() != 10) {
                    b.beginTransaction();
                    d();
                    b.setTransactionSuccessful();
                    b.endTransaction();
                }
                if (b != null) {
                    b.setLockingEnabled(false);
                }
                try {
                    c = context.openOrCreateDatabase("simple_webviewCache.db", 0, null);
                } catch (SQLiteException unused2) {
                    if (context.deleteDatabase("simple_webviewCache.db")) {
                        c = context.openOrCreateDatabase("simple_webviewCache.db", 0, null);
                    }
                }
                if (c != null && c.getVersion() != 4) {
                    c.beginTransaction();
                    e();
                    f();
                    c.setTransactionSuccessful();
                    c.endTransaction();
                }
                if (c != null) {
                    c.execSQL("PRAGMA read_uncommitted = true;");
                    c.setLockingEnabled(false);
                }
            }
            return f2421a;
        }
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        int version = b.getVersion();
        if (version != 0) {
            String str = "Upgrading database from version " + version + " to 10, which will destroy old data";
        }
        if (9 == version) {
            b.execSQL("DROP TABLE IF EXISTS " + e[4]);
            b.execSQL("CREATE TABLE " + e[4] + " (_id INTEGER PRIMARY KEY, host TEXT, " + UccConstants.PARAM_REALM + " TEXT, username TEXT, password TEXT, UNIQUE (host, " + UccConstants.PARAM_REALM + ") ON CONFLICT REPLACE);");
            return;
        }
        b.execSQL("DROP TABLE IF EXISTS " + e[0]);
        b.execSQL("DROP TABLE IF EXISTS cache");
        b.execSQL("DROP TABLE IF EXISTS " + e[2]);
        b.execSQL("DROP TABLE IF EXISTS " + e[3]);
        b.execSQL("DROP TABLE IF EXISTS " + e[4]);
        b.execSQL("DROP TABLE IF EXISTS " + e[1]);
        b.setVersion(10);
        b.execSQL("CREATE TABLE " + e[0] + " (_id INTEGER PRIMARY KEY, name TEXT, value TEXT, domain TEXT, path TEXT, expires INTEGER, secure INTEGER);");
        SQLiteDatabase sQLiteDatabase = b;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE INDEX cookiesIndex ON ");
        sb.append(e[0]);
        sb.append(" (path)");
        sQLiteDatabase.execSQL(sb.toString());
        SQLiteDatabase sQLiteDatabase2 = b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CREATE TABLE ");
        sb2.append(e[2]);
        sb2.append(" (");
        sb2.append("_id");
        sb2.append(" INTEGER PRIMARY KEY, ");
        sb2.append("url");
        sb2.append(" TEXT");
        sb2.append(");");
        sQLiteDatabase2.execSQL(sb2.toString());
        b.execSQL("CREATE TABLE " + e[3] + " (_id INTEGER PRIMARY KEY, urlid INTEGER, name TEXT, value TEXT, UNIQUE (urlid, name, value) ON CONFLICT IGNORE);");
        b.execSQL("CREATE TABLE " + e[4] + " (_id INTEGER PRIMARY KEY, host TEXT, " + UccConstants.PARAM_REALM + " TEXT, username TEXT, password TEXT, UNIQUE (host, " + UccConstants.PARAM_REALM + ") ON CONFLICT REPLACE);");
        SQLiteDatabase sQLiteDatabase3 = b;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("CREATE TABLE ");
        sb3.append(e[1]);
        sb3.append(" (");
        sb3.append("_id");
        sb3.append(" INTEGER PRIMARY KEY, ");
        sb3.append("host");
        sb3.append(" TEXT, ");
        sb3.append("username");
        sb3.append(" TEXT, ");
        sb3.append("password");
        sb3.append(" TEXT,");
        sb3.append(" UNIQUE (");
        sb3.append("host");
        sb3.append(", ");
        sb3.append("username");
        sb3.append(") ON CONFLICT REPLACE);");
        sQLiteDatabase3.execSQL(sb3.toString());
    }

    private static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        int version = c.getVersion();
        if (version != 0) {
            String str = "Upgrading cache database from version " + version + " to 10, which will destroy all old data";
        }
        c.execSQL("DROP TABLE IF EXISTS cache");
        c.setVersion(4);
    }

    private static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
            return;
        }
        SQLiteDatabase sQLiteDatabase = c;
        if (sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE cache (_id INTEGER PRIMARY KEY, url TEXT, filepath TEXT, lastmodify TEXT, etag TEXT, expires INTEGER, expiresstring TEXT, mimetype TEXT, encoding TEXT,httpstatus INTEGER, location TEXT, contentlength INTEGER, contentdisposition TEXT, crossdomain TEXT, UNIQUE (url) ON CONFLICT REPLACE);");
        c.execSQL("CREATE INDEX cacheUrlIndex ON cache (url)");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(int r13) {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.android.patronus.simplecookie.f.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L21
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r12
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r13)
            r1[r2] = r3
            java.lang.String r13 = "a821939f"
            java.lang.Object r13 = r0.ipc$dispatch(r13, r1)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L21:
            android.database.sqlite.SQLiteDatabase r4 = com.alibaba.android.patronus.simplecookie.f.b
            if (r4 != 0) goto L26
            return r3
        L26:
            r0 = 0
            java.lang.String[] r1 = com.alibaba.android.patronus.simplecookie.f.e     // Catch: java.lang.Throwable -> L43 java.lang.IllegalStateException -> L45
            r5 = r1[r13]     // Catch: java.lang.Throwable -> L43 java.lang.IllegalStateException -> L45
            java.lang.String[] r6 = com.alibaba.android.patronus.simplecookie.f.f     // Catch: java.lang.Throwable -> L43 java.lang.IllegalStateException -> L45
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r0 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L43 java.lang.IllegalStateException -> L45
            boolean r13 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L43 java.lang.IllegalStateException -> L45
            if (r13 != r2) goto L3d
            r3 = 1
        L3d:
            if (r0 == 0) goto L51
        L3f:
            r0.close()
            goto L51
        L43:
            r13 = move-exception
            goto L52
        L45:
            r13 = move-exception
            java.lang.String r1 = "webviewdatabase"
            java.lang.String r2 = "hasEntries"
            android.util.Log.e(r1, r2, r13)     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L51
            goto L3f
        L51:
            return r3
        L52:
            if (r0 == 0) goto L57
            r0.close()
        L57:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.patronus.simplecookie.f.a(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
        if (r6 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
        if (r6 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<com.alibaba.android.patronus.simplecookie.c.a> a(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.patronus.simplecookie.f.a(java.lang.String):java.util.ArrayList");
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (str == null || b == null) {
        } else {
            synchronized (this.d) {
                try {
                    b.delete(e[0], "(domain == ?) AND (path == ?) AND (name == ?)", new String[]{str, str2, str3});
                }
            }
        }
    }

    public void a(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2daaf0", new Object[]{this, aVar});
        } else if (aVar.f2417a == null || aVar.b == null || aVar.c == null || b == null) {
        } else {
            synchronized (this.d) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("domain", aVar.f2417a);
                contentValues.put("path", aVar.b);
                contentValues.put("name", aVar.c);
                contentValues.put("value", aVar.d);
                if (aVar.e != -1) {
                    contentValues.put("expires", Long.valueOf(aVar.e));
                }
                contentValues.put("secure", Boolean.valueOf(aVar.h));
                b.insert(e[0], null, contentValues);
            }
        }
    }

    public boolean a() {
        boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        synchronized (this.d) {
            a2 = a(0);
        }
        return a2;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (b == null) {
        } else {
            synchronized (this.d) {
                try {
                    b.delete(e[0], null, null);
                }
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (b == null) {
        } else {
            synchronized (this.d) {
                try {
                    b.delete(e[0], "expires ISNULL", null);
                }
            }
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (b == null) {
        } else {
            synchronized (this.d) {
                try {
                    b.delete(e[0], "expires <= ?", new String[]{Long.toString(j)});
                }
            }
        }
    }
}
