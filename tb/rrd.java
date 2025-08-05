package tb;

import android.content.Context;

/* loaded from: classes9.dex */
public class rrd {

    /* renamed from: a  reason: collision with root package name */
    private Context f33327a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public rrd(Context context) {
        this.f33327a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (r8 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
        if (r8 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007d, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(int r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L3c
            r1 = 1
            if (r8 == r1) goto L2a
            r1 = 2
            if (r8 == r1) goto L22
            r1 = 3
            if (r8 == r1) goto L1f
            r1 = 4
            if (r8 == r1) goto L17
            r9 = 5
            if (r8 == r9) goto L14
            r2 = r0
            goto L43
        L14:
            java.lang.String r8 = "content://com.vivo.abe.exidentifier/guid"
            goto L3e
        L17:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS_"
            goto L31
        L1f:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/UDID"
            goto L3e
        L22:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"
            goto L31
        L2a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"
        L31:
            r8.append(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            goto L3e
        L3c:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
        L3e:
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r2 = r8
        L43:
            if (r2 != 0) goto L46
            return r0
        L46:
            android.content.Context r8 = r7.f33327a     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L71
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L71
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L71
            if (r8 == 0) goto L68
            boolean r9 = r8.moveToNext()     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L7e
            if (r9 == 0) goto L68
            java.lang.String r9 = "value"
            int r9 = r8.getColumnIndex(r9)     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L7e
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L7e
            r0 = r9
        L68:
            if (r8 == 0) goto L7d
        L6a:
            r8.close()
            goto L7d
        L6e:
            r9 = move-exception
            r8 = r0
            goto L7f
        L71:
            r8 = r0
        L72:
            java.lang.String r9 = "VMS_SDK_DB"
            java.lang.String r1 = "return cursor is error"
            android.util.Log.e(r9, r1)     // Catch: java.lang.Throwable -> L7e
            if (r8 == 0) goto L7d
            goto L6a
        L7d:
            return r0
        L7e:
            r9 = move-exception
        L7f:
            if (r8 == 0) goto L84
            r8.close()
        L84:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rrd.a(int, java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(int r2, java.lang.String r3, android.content.ContentValues[] r4) {
        /*
            r1 = this;
            r0 = 6
            if (r2 == r0) goto L10
            r0 = 7
            if (r2 == r0) goto L8
            r2 = 0
            goto L25
        L8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "content://com.vivo.vms.IdProvider/IdentifierId/STATISTICS_"
            goto L17
        L10:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "content://com.vivo.vms.IdProvider/IdentifierId/OAIDBLACK_"
        L17:
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
        L25:
            r3 = 0
            if (r2 != 0) goto L29
            return r3
        L29:
            android.content.Context r0 = r1.f33327a     // Catch: java.lang.Exception -> L47
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L47
            int r2 = r0.bulkInsert(r2, r4)     // Catch: java.lang.Exception -> L47
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L47
            r4.<init>()     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "insert:"
            r4.append(r0)     // Catch: java.lang.Exception -> L47
            r4.append(r2)     // Catch: java.lang.Exception -> L47
            r4.toString()     // Catch: java.lang.Exception -> L47
            if (r2 == 0) goto L4f
            r2 = 1
            return r2
        L47:
            java.lang.String r2 = "VMS_SDK_DB"
            java.lang.String r4 = "return insert is error"
            android.util.Log.e(r2, r4)
        L4f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rrd.a(int, java.lang.String, android.content.ContentValues[]):boolean");
    }
}
