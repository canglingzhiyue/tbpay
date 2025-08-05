package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jia {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File a(java.io.File r11, java.io.File r12) throws java.lang.Exception {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.jia.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r11
            r11 = 1
            r1[r11] = r12
            java.lang.String r11 = "73f081b7"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            java.io.File r11 = (java.io.File) r11
            return r11
        L18:
            r0 = 3
            r1 = 0
            if (r3 >= r0) goto L8c
            boolean r0 = r12.exists()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            if (r0 != 0) goto L36
            java.io.File r0 = r12.getParentFile()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            if (r0 != 0) goto L33
            java.io.File r0 = r12.getParentFile()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            r0.mkdirs()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
        L33:
            r12.createNewFile()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
        L36:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L62
            r4.<init>(r12)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L62
            java.nio.channels.FileChannel r1 = r4.getChannel()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L62
            r5 = 0
            long r7 = r0.size()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L62
            r4 = r0
            r9 = r1
            r4.transferTo(r5, r7, r9)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L62
            if (r0 == 0) goto L58
            r0.close()
        L58:
            if (r1 == 0) goto L5d
            r1.close()
        L5d:
            return r12
        L5e:
            r11 = move-exception
            r4 = r1
            r1 = r0
            goto L81
        L62:
            r4 = move-exception
            r10 = r1
            r1 = r0
            r0 = r4
            r4 = r10
            goto L6d
        L68:
            r11 = move-exception
            r4 = r1
            goto L81
        L6b:
            r0 = move-exception
            r4 = r1
        L6d:
            r12.delete()     // Catch: java.lang.Throwable -> L80
            if (r3 == r2) goto L7f
            if (r1 == 0) goto L77
            r1.close()
        L77:
            if (r4 == 0) goto L7c
            r4.close()
        L7c:
            int r3 = r3 + 1
            goto L18
        L7f:
            throw r0     // Catch: java.lang.Throwable -> L80
        L80:
            r11 = move-exception
        L81:
            if (r1 == 0) goto L86
            r1.close()
        L86:
            if (r4 == 0) goto L8b
            r4.close()
        L8b:
            throw r11
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jia.a(java.io.File, java.io.File):java.io.File");
    }
}
