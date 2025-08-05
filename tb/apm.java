package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
public class apm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1570783471);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x003f -> B:63:0x0062). Please submit an issue!!! */
    public static byte[] a(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        IpChange ipChange = $ipChange;
        ?? r1 = ipChange instanceof IpChange;
        if (r1 != 0) {
            return (byte[]) ipChange.ipc$dispatch("27137f8e", new Object[]{bArr});
        }
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = null;
        bArr2 = null;
        bArr2 = null;
        r0 = null;
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
        } catch (IOException e) {
            e.printStackTrace();
            r1 = r1;
        }
        try {
            try {
                r1 = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream((OutputStream) r1, bArr.length);
                } catch (Exception e2) {
                    e = e2;
                    gZIPOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    if (gZIPOutputStream2 != null) {
                        try {
                            gZIPOutputStream2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    if (r1 != 0) {
                        try {
                            r1.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
                r1 = 0;
                gZIPOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                r1 = 0;
            }
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                bArr2 = r1.toByteArray();
                try {
                    gZIPOutputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                r1.close();
                r1 = r1;
            } catch (Exception e7) {
                e = e7;
                e.printStackTrace();
                if (gZIPOutputStream != null) {
                    try {
                        gZIPOutputStream.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                if (r1 != 0) {
                    r1.close();
                    r1 = r1;
                }
                return bArr2;
            }
            return bArr2;
        } catch (Throwable th3) {
            th = th3;
            gZIPOutputStream2 = gZIPOutputStream;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0080, code lost:
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] b(byte[] r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.apm.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            java.lang.String r7 = "8ef4ac6d"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            byte[] r7 = (byte[]) r7
            return r7
        L15:
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L6f
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L6f
            java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            r4.<init>()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
        L29:
            int r5 = r3.length     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            int r5 = r7.read(r3, r2, r5)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            r6 = -1
            if (r5 == r6) goto L35
            r4.write(r3, r2, r5)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            goto L29
        L35:
            r4.flush()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            byte[] r0 = r4.toByteArray()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            r4.close()     // Catch: java.lang.Exception -> L3f
        L3f:
            r7.close()     // Catch: java.io.IOException -> L42
        L42:
            r1.close()     // Catch: java.io.IOException -> L83
            goto L83
        L46:
            r0 = move-exception
            goto L5b
        L48:
            goto L72
        L4a:
            r2 = move-exception
            r4 = r0
            r0 = r2
            goto L5b
        L4e:
            r4 = r0
            goto L72
        L50:
            r7 = move-exception
            r4 = r0
            goto L59
        L53:
            r7 = r0
            r4 = r7
            goto L72
        L56:
            r7 = move-exception
            r1 = r0
            r4 = r1
        L59:
            r0 = r7
            r7 = r4
        L5b:
            if (r4 == 0) goto L62
            r4.close()     // Catch: java.lang.Exception -> L61
            goto L62
        L61:
        L62:
            if (r7 == 0) goto L69
            r7.close()     // Catch: java.io.IOException -> L68
            goto L69
        L68:
        L69:
            if (r1 == 0) goto L6e
            r1.close()     // Catch: java.io.IOException -> L6e
        L6e:
            throw r0
        L6f:
            r7 = r0
            r1 = r7
            r4 = r1
        L72:
            if (r4 == 0) goto L79
            r4.close()     // Catch: java.lang.Exception -> L78
            goto L79
        L78:
        L79:
            if (r7 == 0) goto L80
            r7.close()     // Catch: java.io.IOException -> L7f
            goto L80
        L7f:
        L80:
            if (r1 == 0) goto L83
            goto L42
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.apm.b(byte[]):byte[]");
    }
}
