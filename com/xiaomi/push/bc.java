package com.xiaomi.push;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;

/* loaded from: classes9.dex */
class bc implements ar {

    /* renamed from: a  reason: collision with root package name */
    private static String f24368a = "content://com.vivo.vms.IdProvider/IdentifierId/";
    private static String b = f24368a + "OAID";
    private static String c = f24368a + "VAID_";
    private static String d = f24368a + "AAID_";
    private static String e = f24368a + "OAIDSTATUS";
    private static String f = "persist.sys.identifierid.supported";

    /* renamed from: a  reason: collision with other field name */
    private Context f132a;

    public bc(Context context) {
        this.f132a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r10 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r10 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 0
            android.content.Context r1 = r9.f132a     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L39
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L39
            android.net.Uri r3 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L39
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L39
            if (r10 == 0) goto L2c
            boolean r1 = r10.moveToNext()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L3a
            if (r1 == 0) goto L2c
            java.lang.String r1 = "value"
            int r1 = r10.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L3a
            java.lang.String r0 = r10.getString(r1)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L3a
            goto L2c
        L27:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto L33
        L2c:
            if (r10 == 0) goto L3d
        L2e:
            r10.close()
            goto L3d
        L32:
            r10 = move-exception
        L33:
            if (r0 == 0) goto L38
            r0.close()
        L38:
            throw r10
        L39:
            r10 = r0
        L3a:
            if (r10 == 0) goto L3d
            goto L2e
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.bc.a(java.lang.String):java.lang.String");
    }

    public static boolean a(Context context) {
        try {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(Uri.parse(f24368a).getAuthority(), 128);
            if (resolveContentProvider != null) {
                if ((resolveContentProvider.applicationInfo.flags & 1) != 0) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a */
    public String mo1730a() {
        return a(b);
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo1730a() {
        return "1".equals(q.a(f, "0"));
    }
}
