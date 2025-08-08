package com.meizu.flyme.openidsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import mtopsdk.common.util.StringUtils;
import tb.kge;

/* loaded from: classes4.dex */
class f {
    private static volatile f e;
    private static boolean f;
    private BroadcastReceiver h;

    /* renamed from: a  reason: collision with root package name */
    b f8023a = new b("udid");
    b b = new b("oaid");
    b d = new b("vaid");
    b c = new b("aaid");
    private d g = new d();

    static {
        kge.a(992026163);
        f = false;
    }

    private f() {
    }

    private static e a(Cursor cursor) {
        e eVar = new e(null, 0);
        if (cursor != null && !cursor.isClosed()) {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex("value");
            if (columnIndex >= 0) {
                eVar.f8022a = cursor.getString(columnIndex);
            }
            int columnIndex2 = cursor.getColumnIndex("code");
            if (columnIndex2 >= 0) {
                eVar.b = cursor.getInt(columnIndex2);
            }
            int columnIndex3 = cursor.getColumnIndex("expired");
            if (columnIndex3 >= 0) {
                eVar.c = cursor.getLong(columnIndex3);
            }
            return eVar;
        }
        return eVar;
    }

    public static final f a() {
        if (e == null) {
            synchronized (f.class) {
                if (e == null) {
                    e = new f();
                }
            }
        }
        return e;
    }

    private static String a(PackageManager packageManager, String str) {
        ProviderInfo resolveContentProvider;
        if (packageManager == null || (resolveContentProvider = packageManager.resolveContentProvider(str, 0)) == null || (resolveContentProvider.applicationInfo.flags & 1) == 0) {
            return null;
        }
        return resolveContentProvider.packageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r7 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r7 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
        if ("0".equals(r8.f8022a) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(android.content.Context r8) {
        /*
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r0 = 0
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r3 = 0
            r4 = 0
            java.lang.String r8 = "supported"
            java.lang.String[] r5 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r6 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            if (r7 == 0) goto L37
            com.meizu.flyme.openidsdk.e r8 = a(r7)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r8.b     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            if (r1 != r2) goto L30
            java.lang.String r1 = "0"
            java.lang.String r8 = r8.f8022a     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            boolean r8 = r1.equals(r8)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            if (r8 == 0) goto L31
        L30:
            r0 = 1
        L31:
            if (r7 == 0) goto L36
            r7.close()
        L36:
            return r0
        L37:
            if (r7 == 0) goto L54
        L39:
            r7.close()
            goto L54
        L3d:
            r8 = move-exception
            goto L55
        L3f:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "querySupport, Exception : "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L3d
            r1.append(r8)     // Catch: java.lang.Throwable -> L3d
            r1.toString()     // Catch: java.lang.Throwable -> L3d
            if (r7 == 0) goto L54
            goto L39
        L54:
            return r0
        L55:
            if (r7 == 0) goto L5a
            r7.close()
        L5a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.flyme.openidsdk.f.a(android.content.Context):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String b(android.content.Context r10, com.meizu.flyme.openidsdk.b r11) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "queryId : "
            r0.<init>(r1)
            java.lang.String r1 = r11.c
            r0.append(r1)
            r0.toString()
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r0 = 0
            android.content.ContentResolver r1 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            r3 = 0
            r4 = 0
            r7 = 1
            java.lang.String[] r5 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            java.lang.String r6 = r11.c     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            r8 = 0
            r5[r8] = r6     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            if (r1 == 0) goto L72
            com.meizu.flyme.openidsdk.e r2 = a(r1)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            java.lang.String r0 = r2.f8022a     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            r11.a(r0)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            long r3 = r2.c     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            r11.a(r3)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            int r3 = r2.b     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            r11.a(r3)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            r3.<init>()     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            java.lang.String r4 = r11.c     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            r3.append(r4)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            java.lang.String r4 = " errorCode : "
            r3.append(r4)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            int r11 = r11.d     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            r3.append(r11)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            r3.toString()     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            int r11 = r2.b     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r11 == r2) goto L83
            r9.b(r10)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            boolean r11 = r9.a(r10, r8)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            if (r11 != 0) goto L83
            boolean r10 = r9.a(r10, r7)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            java.lang.String r11 = "not support, forceQuery isSupported: "
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
        L6e:
            r11.concat(r10)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            goto L83
        L72:
            boolean r11 = r9.a(r10, r8)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            if (r11 == 0) goto L83
            boolean r10 = r9.a(r10, r7)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            java.lang.String r11 = "forceQuery isSupported : "
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            goto L6e
        L83:
            if (r1 == 0) goto L88
            r1.close()
        L88:
            r11 = r0
            goto Lab
        L8a:
            r10 = move-exception
            goto Lac
        L8c:
            r10 = move-exception
            r11 = r0
            r0 = r1
            goto L95
        L90:
            r10 = move-exception
            r1 = r0
            goto Lac
        L93:
            r10 = move-exception
            r11 = r0
        L95:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = "queryId, Exception : "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L90
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L90
            r1.append(r10)     // Catch: java.lang.Throwable -> L90
            r1.toString()     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto Lab
            r0.close()
        Lab:
            return r11
        Lac:
            if (r1 == 0) goto Lb1
            r1.close()
        Lb1:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.flyme.openidsdk.f.b(android.content.Context, com.meizu.flyme.openidsdk.b):java.lang.String");
    }

    private static String b(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (Exception e2) {
            e2.printStackTrace();
            String str2 = "getAppVersion, Exception : " + e2.getMessage();
            return null;
        }
    }

    private synchronized void b(Context context) {
        if (this.h != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        this.h = new a();
        context.registerReceiver(this.h, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(Context context, b bVar) {
        if (bVar == null) {
            return null;
        }
        if (bVar.a()) {
            return bVar.b;
        }
        if (a(context, true)) {
            return b(context, bVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(Context context, boolean z) {
        if (!this.g.a() || z) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            String a2 = a(packageManager, "com.meizu.flyme.openidsdk");
            if (StringUtils.isEmpty(a2)) {
                return false;
            }
            String b = b(packageManager, a2);
            if (this.g.a() && this.g.a(b)) {
                "use same version cache, safeVersion : ".concat(String.valueOf(b));
                return this.g.b();
            }
            this.g.b(b);
            boolean a3 = a(context);
            "query support, result : ".concat(String.valueOf(a3));
            this.g.a(a3);
            return a3;
        }
        return this.g.b();
    }
}
