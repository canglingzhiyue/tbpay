package com.taobao.metrickit.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : a(new File(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.FileInputStream] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003c -> B:41:0x004f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.io.File r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.metrickit.utils.c.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "36082ea1"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L15:
            r0 = 0
            boolean r1 = r4.exists()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L45
            if (r1 != 0) goto L1d
            return r0
        L1d:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L45
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L45
            int r4 = r1.available()     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L50
            byte[] r4 = new byte[r4]     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L50
            int r2 = r1.read(r4)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L50
            r3 = -1
            if (r2 == r3) goto L37
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L50
            java.lang.String r3 = "UTF-8"
            r2.<init>(r4, r3)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L50
            r0 = r2
        L37:
            r1.close()     // Catch: java.io.IOException -> L3b
            goto L4f
        L3b:
            r4 = move-exception
            r4.printStackTrace()
            goto L4f
        L40:
            r4 = move-exception
            goto L47
        L42:
            r4 = move-exception
            r1 = r0
            goto L51
        L45:
            r4 = move-exception
            r1 = r0
        L47:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L4f
            r1.close()     // Catch: java.io.IOException -> L3b
        L4f:
            return r0
        L50:
            r4 = move-exception
        L51:
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.io.IOException -> L57
            goto L5b
        L57:
            r0 = move-exception
            r0.printStackTrace()
        L5b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.metrickit.utils.c.a(java.io.File):java.lang.String");
    }

    public static boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                File file = new File(str);
                if (!file.exists()) {
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                }
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(str, z));
                try {
                    bufferedWriter2.write(str2);
                    bufferedWriter2.close();
                    try {
                        bufferedWriter2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return true;
                } catch (Exception e2) {
                    e = e2;
                    bufferedWriter = bufferedWriter2;
                    e.printStackTrace();
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }
}
