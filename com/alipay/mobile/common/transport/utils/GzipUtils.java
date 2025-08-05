package com.alipay.mobile.common.transport.utils;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class GzipUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] toGzip(byte[] r7) {
        /*
            java.lang.String r0 = "GzipUtils"
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.mobile.common.transport.utils.GzipUtils.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 0
            if (r2 == 0) goto L17
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r7
            java.lang.String r7 = "2d29cafa"
            java.lang.Object r7 = r1.ipc$dispatch(r7, r0)
            byte[] r7 = (byte[]) r7
            return r7
        L17:
            r1 = 0
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6f
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6f
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L66
            r7.<init>()     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L66
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5f
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5f
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L59 java.lang.Throwable -> L8e
        L2b:
            int r5 = r2.read(r1)     // Catch: java.io.IOException -> L59 java.lang.Throwable -> L8e
            r6 = -1
            if (r5 == r6) goto L36
            r4.write(r1, r3, r5)     // Catch: java.io.IOException -> L59 java.lang.Throwable -> L8e
            goto L2b
        L36:
            r4.flush()     // Catch: java.io.IOException -> L59 java.lang.Throwable -> L8e
            r4.finish()     // Catch: java.io.IOException -> L59 java.lang.Throwable -> L8e
            byte[] r1 = r7.toByteArray()     // Catch: java.io.IOException -> L59 java.lang.Throwable -> L8e
            r2.close()     // Catch: java.lang.Throwable -> L44
            goto L48
        L44:
            r2 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r0, r2)
        L48:
            r7.close()     // Catch: java.lang.Throwable -> L4c
            goto L50
        L4c:
            r7 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r0, r7)
        L50:
            r4.close()     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r7 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r0, r7)
        L58:
            return r1
        L59:
            r1 = move-exception
            goto L74
        L5b:
            r3 = move-exception
            r4 = r1
            r1 = r3
            goto L8f
        L5f:
            r3 = move-exception
            r4 = r1
            r1 = r3
            goto L74
        L63:
            r7 = move-exception
            r4 = r1
            goto L6c
        L66:
            r7 = move-exception
            r4 = r1
            goto L72
        L69:
            r7 = move-exception
            r2 = r1
            r4 = r2
        L6c:
            r1 = r7
            r7 = r4
            goto L8f
        L6f:
            r7 = move-exception
            r2 = r1
            r4 = r2
        L72:
            r1 = r7
            r7 = r4
        L74:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r3.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = "toGzip ex:"
            r3.append(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L8e
            r3.append(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L8e
            com.alipay.mobile.common.transport.utils.LogCatUtil.error(r0, r3)     // Catch: java.lang.Throwable -> L8e
            throw r1     // Catch: java.lang.Throwable -> L8e
        L8e:
            r1 = move-exception
        L8f:
            if (r2 == 0) goto L99
            r2.close()     // Catch: java.lang.Throwable -> L95
            goto L99
        L95:
            r2 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r0, r2)
        L99:
            if (r7 == 0) goto La3
            r7.close()     // Catch: java.lang.Throwable -> L9f
            goto La3
        L9f:
            r7 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r0, r7)
        La3:
            if (r4 == 0) goto Lad
            r4.close()     // Catch: java.lang.Throwable -> La9
            goto Lad
        La9:
            r7 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r0, r7)
        Lad:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.utils.GzipUtils.toGzip(byte[]):byte[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] unGzip(byte[] r7) {
        /*
            java.lang.String r0 = "GzipUtils"
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.mobile.common.transport.utils.GzipUtils.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 0
            if (r2 == 0) goto L17
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r7
            java.lang.String r7 = "13fb2c1c"
            java.lang.Object r7 = r1.ipc$dispatch(r7, r0)
            byte[] r7 = (byte[]) r7
            return r7
        L17:
            r1 = 0
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6d
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6d
            java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5d
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5d
            r5.<init>()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5d
        L2b:
            int r1 = r4.length     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L8c
            int r1 = r7.read(r4, r3, r1)     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L8c
            r6 = -1
            if (r1 == r6) goto L37
            r5.write(r4, r3, r1)     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L8c
            goto L2b
        L37:
            byte[] r1 = r5.toByteArray()     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L8c
            r5.flush()     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L8c
            r5.close()     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r3 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r0, r3)
        L46:
            r7.close()     // Catch: java.lang.Throwable -> L4a
            goto L4e
        L4a:
            r7 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r0, r7)
        L4e:
            r2.close()     // Catch: java.lang.Throwable -> L52
            goto L56
        L52:
            r7 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r0, r7)
        L56:
            return r1
        L57:
            r1 = move-exception
            goto L72
        L59:
            r3 = move-exception
            r5 = r1
            r1 = r3
            goto L8d
        L5d:
            r3 = move-exception
            r5 = r1
            r1 = r3
            goto L72
        L61:
            r7 = move-exception
            r5 = r1
            goto L6a
        L64:
            r7 = move-exception
            r5 = r1
            goto L70
        L67:
            r7 = move-exception
            r2 = r1
            r5 = r2
        L6a:
            r1 = r7
            r7 = r5
            goto L8d
        L6d:
            r7 = move-exception
            r2 = r1
            r5 = r2
        L70:
            r1 = r7
            r7 = r5
        L72:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r3.<init>()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r4 = "unGzip ex:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L8c
            r3.append(r4)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L8c
            com.alipay.mobile.common.transport.utils.LogCatUtil.error(r0, r3)     // Catch: java.lang.Throwable -> L8c
            throw r1     // Catch: java.lang.Throwable -> L8c
        L8c:
            r1 = move-exception
        L8d:
            if (r5 == 0) goto L97
            r5.close()     // Catch: java.lang.Throwable -> L93
            goto L97
        L93:
            r3 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r0, r3)
        L97:
            if (r7 == 0) goto La1
            r7.close()     // Catch: java.lang.Throwable -> L9d
            goto La1
        L9d:
            r7 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r0, r7)
        La1:
            if (r2 == 0) goto Lab
            r2.close()     // Catch: java.lang.Throwable -> La7
            goto Lab
        La7:
            r7 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r0, r7)
        Lab:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.utils.GzipUtils.unGzip(byte[]):byte[]");
    }
}
