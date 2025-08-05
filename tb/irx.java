package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public final class irx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1644000278);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x004a A[Catch: all -> 0x0042, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0042, blocks: (B:14:0x002a, B:32:0x004a, B:21:0x0037, B:22:0x003a, B:25:0x003e), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] a(byte[] r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.irx.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r5
            java.lang.String r5 = "27137f8e"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            byte[] r5 = (byte[]) r5
            return r5
        L15:
            r0 = 0
            if (r5 == 0) goto L56
            int r1 = r5.length
            if (r1 != 0) goto L1c
            goto L56
        L1c:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            int r4 = r5.length
            r1.<init>(r4)
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b
            r4.write(r5)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L3c
            r4.close()     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L42
            r3 = 1
            goto L44
        L2f:
            goto L44
        L31:
            r5 = move-exception
            r0 = r4
            goto L35
        L34:
            r5 = move-exception
        L35:
            if (r0 == 0) goto L3a
            r0.close()     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L42
        L3a:
            throw r5     // Catch: java.lang.Throwable -> L42
        L3b:
            r4 = r0
        L3c:
            if (r4 == 0) goto L44
            r4.close()     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L42
            goto L44
        L42:
            r5 = move-exception
            goto L52
        L44:
            if (r3 != 0) goto L4a
            r1.close()     // Catch: java.io.IOException -> L49
        L49:
            return r0
        L4a:
            byte[] r5 = r1.toByteArray()     // Catch: java.lang.Throwable -> L42
            r1.close()     // Catch: java.io.IOException -> L51
        L51:
            return r5
        L52:
            r1.close()     // Catch: java.io.IOException -> L55
        L55:
            throw r5
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.irx.a(byte[]):byte[]");
    }
}
