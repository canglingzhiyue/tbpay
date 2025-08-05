package tb;

/* loaded from: classes.dex */
public class bzc {
    static {
        kge.a(-1119343401);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x002a -> B:51:0x004d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] a(byte[] r4) {
        /*
            if (r4 == 0) goto L65
            int r0 = r4.length
            if (r0 != 0) goto L7
            goto L65
        L7:
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            r1.<init>()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            int r3 = r4.length     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r2.write(r4)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L4e
            r2.finish()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L4e
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L4e
            r2.close()     // Catch: java.io.IOException -> L21
            goto L25
        L21:
            r4 = move-exception
            r4.printStackTrace()
        L25:
            r1.close()     // Catch: java.io.IOException -> L29
            goto L4d
        L29:
            r4 = move-exception
            r4.printStackTrace()
            goto L4d
        L2e:
            r4 = move-exception
            goto L3b
        L30:
            r4 = move-exception
            goto L50
        L32:
            r4 = move-exception
            r2 = r0
            goto L3b
        L35:
            r4 = move-exception
            r1 = r0
            goto L50
        L38:
            r4 = move-exception
            r1 = r0
            r2 = r1
        L3b:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L48
            r2.close()     // Catch: java.io.IOException -> L44
            goto L48
        L44:
            r4 = move-exception
            r4.printStackTrace()
        L48:
            if (r1 == 0) goto L4d
            r1.close()     // Catch: java.io.IOException -> L29
        L4d:
            return r0
        L4e:
            r4 = move-exception
            r0 = r2
        L50:
            if (r0 == 0) goto L5a
            r0.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r0 = move-exception
            r0.printStackTrace()
        L5a:
            if (r1 == 0) goto L64
            r1.close()     // Catch: java.io.IOException -> L60
            goto L64
        L60:
            r0 = move-exception
            r0.printStackTrace()
        L64:
            throw r4
        L65:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bzc.a(byte[]):byte[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x003d -> B:84:0x0077). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] b(byte[] r7) {
        /*
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L57
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L57
            java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            r3.<init>()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
        L14:
            int r4 = r2.length     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L78
            r5 = 0
            int r4 = r7.read(r2, r5, r4)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L78
            r6 = -1
            if (r4 == r6) goto L21
            r3.write(r2, r5, r4)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L78
            goto L14
        L21:
            r3.flush()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L78
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L78
            r3.close()     // Catch: java.lang.Exception -> L2c
            goto L30
        L2c:
            r2 = move-exception
            r2.printStackTrace()
        L30:
            r7.close()     // Catch: java.io.IOException -> L34
            goto L38
        L34:
            r7 = move-exception
            r7.printStackTrace()
        L38:
            r1.close()     // Catch: java.io.IOException -> L3c
            goto L77
        L3c:
            r7 = move-exception
            r7.printStackTrace()
            goto L77
        L41:
            r2 = move-exception
            goto L5b
        L43:
            r2 = move-exception
            r3 = r0
            r0 = r2
            goto L79
        L47:
            r2 = move-exception
            r3 = r0
            goto L5b
        L4a:
            r7 = move-exception
            r3 = r0
            goto L54
        L4d:
            r2 = move-exception
            r7 = r0
            r3 = r7
            goto L5b
        L51:
            r7 = move-exception
            r1 = r0
            r3 = r1
        L54:
            r0 = r7
            r7 = r3
            goto L79
        L57:
            r2 = move-exception
            r7 = r0
            r1 = r7
            r3 = r1
        L5b:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L68
            r3.close()     // Catch: java.lang.Exception -> L64
            goto L68
        L64:
            r2 = move-exception
            r2.printStackTrace()
        L68:
            if (r7 == 0) goto L72
            r7.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r7 = move-exception
            r7.printStackTrace()
        L72:
            if (r1 == 0) goto L77
            r1.close()     // Catch: java.io.IOException -> L3c
        L77:
            return r0
        L78:
            r0 = move-exception
        L79:
            if (r3 == 0) goto L83
            r3.close()     // Catch: java.lang.Exception -> L7f
            goto L83
        L7f:
            r2 = move-exception
            r2.printStackTrace()
        L83:
            if (r7 == 0) goto L8d
            r7.close()     // Catch: java.io.IOException -> L89
            goto L8d
        L89:
            r7 = move-exception
            r7.printStackTrace()
        L8d:
            if (r1 == 0) goto L97
            r1.close()     // Catch: java.io.IOException -> L93
            goto L97
        L93:
            r7 = move-exception
            r7.printStackTrace()
        L97:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bzc.b(byte[]):byte[]");
    }
}
