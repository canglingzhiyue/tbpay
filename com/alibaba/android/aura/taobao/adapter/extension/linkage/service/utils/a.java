package com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(34297944);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0054, blocks: (B:14:0x003e, B:36:0x006a, B:22:0x004a, B:23:0x004d, B:25:0x0050), top: B:54:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r8) {
        /*
            java.lang.String r0 = "compress"
            java.lang.String r1 = "StringUtils"
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.a.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L19
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r8
            java.lang.String r8 = "9f352ae"
            java.lang.Object r8 = r2.ipc$dispatch(r8, r0)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L19:
            java.lang.String r2 = ""
            if (r8 == 0) goto L94
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L25
            goto L94
        L25:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            int r6 = r8.length()
            r3.<init>(r6)
            r6 = 0
            java.util.zip.GZIPOutputStream r7 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4e
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4e
            java.lang.String r6 = "utf-8"
            byte[] r8 = r8.getBytes(r6)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L44
            r7.write(r8)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L44
            r7.close()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            goto L57
        L42:
            r8 = move-exception
            goto L48
        L44:
            r6 = r7
            goto L4e
        L46:
            r8 = move-exception
            r7 = r6
        L48:
            if (r7 == 0) goto L4d
            r7.close()     // Catch: java.io.IOException -> L4d java.lang.Throwable -> L54
        L4d:
            throw r8     // Catch: java.lang.Throwable -> L54
        L4e:
            if (r6 == 0) goto L56
            r6.close()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            goto L56
        L54:
            r8 = move-exception
            goto L83
        L56:
            r4 = 0
        L57:
            if (r4 != 0) goto L6a
            r3.close()     // Catch: java.io.IOException -> L5d
            goto L69
        L5d:
            r8 = move-exception
            tb.ard r3 = tb.arc.a()
            java.lang.String r8 = r8.getMessage()
            r3.c(r1, r0, r8)
        L69:
            return r2
        L6a:
            byte[] r8 = r3.toByteArray()     // Catch: java.lang.Throwable -> L54
            r3.close()     // Catch: java.io.IOException -> L72
            goto L7e
        L72:
            r2 = move-exception
            tb.ard r3 = tb.arc.a()
            java.lang.String r2 = r2.getMessage()
            r3.c(r1, r0, r2)
        L7e:
            java.lang.String r8 = android.util.Base64.encodeToString(r8, r5)
            return r8
        L83:
            r3.close()     // Catch: java.io.IOException -> L87
            goto L93
        L87:
            r2 = move-exception
            tb.ard r3 = tb.arc.a()
            java.lang.String r2 = r2.getMessage()
            r3.c(r1, r0, r2)
        L93:
            throw r8
        L94:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.a.a(java.lang.String):java.lang.String");
    }
}
