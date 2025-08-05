package com.ali.user.open.core.util;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import tb.kge;

/* loaded from: classes2.dex */
public class FileUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-772676648);
    }

    public static void writeFileData(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9fc5e10", new Object[]{context, str, str2});
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = context.openFileOutput(str, 0);
            fileOutputStream.write(str2.getBytes(Charset.forName("UTF-8")));
            fileOutputStream.flush();
            if (fileOutputStream == null) {
                return;
            }
            try {
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            if (fileOutputStream == null) {
                return;
            }
            try {
                fileOutputStream.close();
            } catch (Exception unused3) {
            }
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception unused4) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r1 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r1 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String readFileData(android.content.Context r3, java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.ali.user.open.core.util.FileUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            java.lang.String r3 = "57a44251"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L18:
            java.lang.String r0 = ""
            r1 = 0
            java.io.FileInputStream r1 = r3.openFileInput(r4)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3f
            int r3 = r1.available()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3f
            if (r3 <= 0) goto L32
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3f
            r1.read(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3f
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3f
            java.lang.String r2 = "UTF-8"
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3f
            r0 = r4
        L32:
            if (r1 == 0) goto L42
        L34:
            r1.close()     // Catch: java.lang.Exception -> L42
            goto L42
        L38:
            r3 = move-exception
            if (r1 == 0) goto L3e
            r1.close()     // Catch: java.lang.Exception -> L3e
        L3e:
            throw r3
        L3f:
            if (r1 == 0) goto L42
            goto L34
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.core.util.FileUtils.readFileData(android.content.Context, java.lang.String):java.lang.String");
    }
}
