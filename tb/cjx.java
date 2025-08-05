package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class cjx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (r4 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r4, java.lang.String r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.cjx.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            java.lang.String r4 = "b5178ea4"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L53
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L53
            boolean r4 = r2.exists()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L53
            if (r4 != 0) goto L2a
            return r1
        L2a:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L53
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L53
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L53
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L53
            java.lang.String r2 = "UTF-8"
            r5.<init>(r3, r2)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L53
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L53
        L3b:
            java.lang.String r5 = r4.readLine()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L54
            if (r5 == 0) goto L45
            r0.append(r5)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L54
            goto L3b
        L45:
            r4.close()     // Catch: java.lang.Throwable -> L57
            goto L57
        L49:
            r5 = move-exception
            r1 = r4
            goto L4d
        L4c:
            r5 = move-exception
        L4d:
            if (r1 == 0) goto L52
            r1.close()     // Catch: java.lang.Throwable -> L52
        L52:
            throw r5
        L53:
            r4 = r1
        L54:
            if (r4 == 0) goto L57
            goto L45
        L57:
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cjx.a(java.lang.String, java.lang.String):java.lang.String");
    }
}
