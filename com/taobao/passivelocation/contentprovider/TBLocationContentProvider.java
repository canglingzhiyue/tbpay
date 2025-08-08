package com.taobao.passivelocation.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.taobao.util.k;
import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes7.dex */
public class TBLocationContentProvider extends ContentProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Uri CONTENT_URI;
    public static final String KEY_CONTENT = "name";
    public static final String KEY_ID = "_id";
    private static final UriMatcher b;

    /* renamed from: a  reason: collision with root package name */
    private SQLiteDatabase f18669a;

    static {
        kge.a(312865052);
        StringBuilder sb = new StringBuilder();
        sb.append("content://");
        sb.append("com.taobao.taobao".equals(Globals.getApplication().getPackageName()) ? "com.taobao.passivelocation.provider.locations" : "com.taobao.passivelocation.provider.locations".replace("com.taobao", Globals.getApplication().getPackageName()));
        sb.append("/locations");
        CONTENT_URI = Uri.parse(sb.toString());
        b = new UriMatcher(-1);
        String packageName = Globals.getApplication().getPackageName();
        if ("com.taobao.taobao".equals(packageName)) {
            b.addURI("com.taobao.passivelocation.provider.locations", "locations", 1);
            b.addURI("com.taobao.passivelocation.provider.locations", "locations/*", 2);
            return;
        }
        String replace = "com.taobao.passivelocation.provider.locations".replace("com.taobao", packageName);
        b.addURI(replace, "locations", 1);
        b.addURI(replace, "locations/*", 2);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18a7a6c6", new Object[]{this})).booleanValue();
        }
        AppMonitor.Counter.commit("passivelocation", "TBLocationContentProvider", 1.0d);
        try {
            this.f18669a = new a(getContext(), "location.db", null, 1).getWritableDatabase();
        } catch (SQLiteException e) {
            this.f18669a = null;
            String str = "Database Opening exception: " + e.getMessage();
            e.printStackTrace();
        }
        return this.f18669a != null;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb070cb0", new Object[]{this, uri});
        }
        int match = b.match(uri);
        if (match == 1) {
            return "vnd.android.cursor.dir/vnd.passivelocation.location";
        }
        if (match == 2) {
            return "vnd.android.cursor.item/vnd.passivelocation.location";
        }
        throw new IllegalArgumentException("Unsupported URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("ad900bff", new Object[]{this, uri, strArr, str, strArr2, str2});
        }
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("locations");
        if (b.match(uri) == 2) {
            sQLiteQueryBuilder.appendWhere("_id=" + uri.getPathSegments().get(1));
        }
        if (StringUtils.isEmpty(str2)) {
            str2 = "_id ASC";
        }
        String str3 = str2;
        Cursor cursor = null;
        try {
            cursor = sQLiteQueryBuilder.query(this.f18669a, strArr, str, strArr2, null, null, str3);
            cursor.setNotificationUri(getContext().getContentResolver(), uri);
            return cursor;
        } catch (Exception e) {
            k.a("PlacesContentProvider", "query data error: " + e.getMessage());
            return cursor;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
        if (r12 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
        if (r12 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
        if (r3 <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
        r12 = android.content.ContentUris.withAppendedId(com.taobao.passivelocation.contentprovider.TBLocationContentProvider.CONTENT_URI, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
        getContext().getContentResolver().notifyChange(r12, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
        throw new android.database.SQLException("Failed to insert row into " + r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
        r0 = "Failed to insert row into " + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
        return r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc A[Catch: Exception -> 0x00d0, TryCatch #1 {Exception -> 0x00d0, blocks: (B:7:0x0021, B:19:0x007c, B:30:0x00a2, B:33:0x00b4, B:34:0x00c8, B:37:0x00cc, B:38:0x00cf), top: B:43:0x0021 }] */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.net.Uri insert(android.net.Uri r11, android.content.ContentValues r12) {
        /*
            r10 = this;
            java.lang.String r0 = "Failed to insert row into "
            java.lang.String r1 = "locations"
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.passivelocation.contentprovider.TBLocationContentProvider.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L20
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r10
            r1 = 1
            r0[r1] = r11
            r11 = 2
            r0[r11] = r12
            java.lang.String r11 = "77bd6b8c"
            java.lang.Object r11 = r2.ipc$dispatch(r11, r0)
            android.net.Uri r11 = (android.net.Uri) r11
            return r11
        L20:
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r10.f18669a     // Catch: java.lang.Exception -> Ld0
            java.lang.String r4 = "nullhack"
            long r3 = r3.insert(r1, r4, r12)     // Catch: java.lang.Exception -> Ld0
            java.lang.String r12 = "select count(*) NUM from locations"
            android.database.sqlite.SQLiteDatabase r5 = r10.f18669a     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            android.database.Cursor r12 = r5.rawQuery(r12, r2)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            if (r12 == 0) goto L7a
            r12.moveToFirst()     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> Lc9
            java.lang.String r5 = "NUM"
            int r5 = r12.getColumnIndex(r5)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> Lc9
            int r5 = r12.getInt(r5)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> Lc9
            r6 = 11
            if (r5 < r6) goto L7a
            java.lang.String r5 = "select _id from locations order by _id limit 1"
            android.database.sqlite.SQLiteDatabase r6 = r10.f18669a     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> Lc9
            android.database.Cursor r5 = r6.rawQuery(r5, r2)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> Lc9
            if (r5 == 0) goto L7a
            r5.moveToFirst()     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> Lc9
            java.lang.String r6 = "_id"
            int r6 = r5.getColumnIndex(r6)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> Lc9
            int r6 = r5.getInt(r6)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> Lc9
            android.database.sqlite.SQLiteDatabase r7 = r10.f18669a     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> Lc9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> Lc9
            r8.<init>()     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> Lc9
            java.lang.String r9 = "_id ="
            r8.append(r9)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> Lc9
            r8.append(r6)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> Lc9
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> Lc9
            r7.delete(r1, r6, r2)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> Lc9
            r5.close()     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> Lc9
            goto L7a
        L78:
            r1 = move-exception
            goto L85
        L7a:
            if (r12 == 0) goto L9c
        L7c:
            r12.close()     // Catch: java.lang.Exception -> Ld0
            goto L9c
        L80:
            r1 = move-exception
            r12 = r2
            goto Lca
        L83:
            r1 = move-exception
            r12 = r2
        L85:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc9
            r5.<init>()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r6 = "addMessage exception 2"
            r5.append(r6)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> Lc9
            r5.append(r1)     // Catch: java.lang.Throwable -> Lc9
            r5.toString()     // Catch: java.lang.Throwable -> Lc9
            if (r12 == 0) goto L9c
            goto L7c
        L9c:
            r5 = 0
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 <= 0) goto Lb4
            android.net.Uri r12 = com.taobao.passivelocation.contentprovider.TBLocationContentProvider.CONTENT_URI     // Catch: java.lang.Exception -> Ld0
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r12, r3)     // Catch: java.lang.Exception -> Ld0
            android.content.Context r1 = r10.getContext()     // Catch: java.lang.Exception -> Ld1
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> Ld1
            r1.notifyChange(r12, r2)     // Catch: java.lang.Exception -> Ld1
            return r12
        Lb4:
            android.database.SQLException r12 = new android.database.SQLException     // Catch: java.lang.Exception -> Ld0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld0
            r1.<init>()     // Catch: java.lang.Exception -> Ld0
            r1.append(r0)     // Catch: java.lang.Exception -> Ld0
            r1.append(r11)     // Catch: java.lang.Exception -> Ld0
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Ld0
            r12.<init>(r1)     // Catch: java.lang.Exception -> Ld0
            throw r12     // Catch: java.lang.Exception -> Ld0
        Lc9:
            r1 = move-exception
        Lca:
            if (r12 == 0) goto Lcf
            r12.close()     // Catch: java.lang.Exception -> Ld0
        Lcf:
            throw r1     // Catch: java.lang.Exception -> Ld0
        Ld0:
            r12 = r2
        Ld1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r11)
            r1.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.passivelocation.contentprovider.TBLocationContentProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int delete;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89592153", new Object[]{this, uri, str, strArr})).intValue();
        }
        try {
            int match = b.match(uri);
            if (match == 1) {
                delete = this.f18669a.delete("locations", str, strArr);
            } else if (match == 2) {
                SQLiteDatabase sQLiteDatabase = this.f18669a;
                StringBuilder sb = new StringBuilder();
                sb.append("_id=");
                sb.append(uri.getPathSegments().get(1));
                if (!StringUtils.isEmpty(str)) {
                    str2 = " AND (" + str + ')';
                } else {
                    str2 = "";
                }
                sb.append(str2);
                delete = sQLiteDatabase.delete("locations", sb.toString(), strArr);
            } else {
                throw new IllegalArgumentException("Unsupported URI: " + uri);
            }
            int i = delete;
            getContext().getContentResolver().notifyChange(uri, null);
            return i;
        } catch (Exception e) {
            k.a("PlacesContentProvider", "delete data error: " + e.getMessage());
            return 0;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int update;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68d633c3", new Object[]{this, uri, contentValues, str, strArr})).intValue();
        }
        try {
            int match = b.match(uri);
            if (match == 1) {
                update = this.f18669a.update("locations", contentValues, str, strArr);
            } else if (match == 2) {
                SQLiteDatabase sQLiteDatabase = this.f18669a;
                StringBuilder sb = new StringBuilder();
                sb.append("_id=");
                sb.append(uri.getPathSegments().get(1));
                if (!StringUtils.isEmpty(str)) {
                    str2 = " AND (" + str + ')';
                } else {
                    str2 = "";
                }
                sb.append(str2);
                update = sQLiteDatabase.update("locations", contentValues, sb.toString(), strArr);
            } else {
                throw new IllegalArgumentException("Unknown URI " + uri);
            }
            int i = update;
            getContext().getContentResolver().notifyChange(uri, null);
            return i;
        } catch (Exception e) {
            k.a("PlacesContentProvider", "update data error: " + e.getMessage());
            return 0;
        }
    }

    /* loaded from: classes7.dex */
    public static class a extends SQLiteOpenHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(137574173);
        }

        public a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
            super(context, str, cursorFactory, i);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
            } else {
                sQLiteDatabase.execSQL("create table locations (_id integer primary key autoincrement, name TEXT); ");
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
                return;
            }
            String str = "Upgrading database from version " + i + " to " + i2 + ", which will destroy all old data";
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS locations");
            onCreate(sQLiteDatabase);
        }
    }
}
