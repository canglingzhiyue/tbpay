package com.loc;

import com.loc.bl;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes4.dex */
public final class bw {
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
        r10.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(com.loc.bv r10) {
        /*
            java.lang.String r0 = "code"
            r1 = -1
            r2 = 0
            com.loc.co r3 = r10.f     // Catch: java.lang.Throwable -> L9d
            boolean r3 = r3.c()     // Catch: java.lang.Throwable -> L9d
            if (r3 == 0) goto L8f
            com.loc.co r3 = r10.f     // Catch: java.lang.Throwable -> L9d
            r4 = 1
            r3.a(r4)     // Catch: java.lang.Throwable -> L9d
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = r10.f7709a     // Catch: java.lang.Throwable -> L9d
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L9d
            long r5 = r10.b     // Catch: java.lang.Throwable -> L9d
            com.loc.bl r3 = com.loc.bl.a(r3, r5)     // Catch: java.lang.Throwable -> L9d
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8c
            r5.<init>()     // Catch: java.lang.Throwable -> L8c
            byte[] r6 = a(r3, r10, r5)     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L7f
            int r7 = r6.length     // Catch: java.lang.Throwable -> L8c
            if (r7 != 0) goto L2e
            goto L7f
        L2e:
            com.loc.au r7 = new com.loc.au     // Catch: java.lang.Throwable -> L8c
            java.lang.String r8 = r10.c     // Catch: java.lang.Throwable -> L8c
            r7.<init>(r6, r8)     // Catch: java.lang.Throwable -> L8c
            com.loc.bo.a()     // Catch: java.lang.Throwable -> L8c
            com.loc.bu r7 = com.loc.bo.a(r7)     // Catch: java.lang.Throwable -> L8c
            byte[] r7 = r7.f7708a     // Catch: java.lang.Throwable -> L8c
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8c
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.Throwable -> L8c
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L8c
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L8c
            boolean r7 = r8.has(r0)     // Catch: java.lang.Throwable -> L8c
            if (r7 == 0) goto L7d
            int r0 = r8.getInt(r0)     // Catch: java.lang.Throwable -> L8c
            if (r0 != r4) goto L7d
            com.loc.co r0 = r10.f     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L60
            if (r6 == 0) goto L60
            com.loc.co r0 = r10.f     // Catch: java.lang.Throwable -> L8c
            int r4 = r6.length     // Catch: java.lang.Throwable -> L8c
            r0.a(r4)     // Catch: java.lang.Throwable -> L8c
        L60:
            com.loc.co r10 = r10.f     // Catch: java.lang.Throwable -> L8c
            int r10 = r10.b()     // Catch: java.lang.Throwable -> L8c
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r10 >= r0) goto L6f
            a(r3, r5)     // Catch: java.lang.Throwable -> L8c
            goto L7b
        L6f:
            r3.d()     // Catch: java.lang.Throwable -> L73
            goto L7b
        L73:
            r10 = move-exception
            java.lang.String r0 = "ofm"
            java.lang.String r4 = "dlo"
            com.loc.av.b(r10, r0, r4)     // Catch: java.lang.Throwable -> L8c
        L7b:
            int r10 = r6.length     // Catch: java.lang.Throwable -> L9d
            return r10
        L7d:
            r2 = r3
            goto L8f
        L7f:
            if (r3 == 0) goto L89
            r3.close()     // Catch: java.lang.Throwable -> L85
            goto L89
        L85:
            r10 = move-exception
            r10.printStackTrace()
        L89:
            return r1
        L8a:
            r10 = move-exception
            goto Lac
        L8c:
            r10 = move-exception
            r2 = r3
            goto L9e
        L8f:
            if (r2 == 0) goto Lab
            r2.close()     // Catch: java.lang.Throwable -> L95
            goto Lab
        L95:
            r10 = move-exception
            r10.printStackTrace()
            goto Lab
        L9a:
            r10 = move-exception
            r3 = r2
            goto Lac
        L9d:
            r10 = move-exception
        L9e:
            java.lang.String r0 = "leg"
            java.lang.String r3 = "uts"
            com.loc.av.b(r10, r0, r3)     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto Lab
            r2.close()     // Catch: java.lang.Throwable -> L95
        Lab:
            return r1
        Lac:
            if (r3 == 0) goto Lb6
            r3.close()     // Catch: java.lang.Throwable -> Lb2
            goto Lb6
        Lb2:
            r0 = move-exception
            r0.printStackTrace()
        Lb6:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bw.a(com.loc.bv):int");
    }

    private static void a(bl blVar, List<String> list) {
        if (blVar != null) {
            try {
                for (String str : list) {
                    blVar.c(str);
                }
                blVar.close();
            } catch (Throwable th) {
                av.b(th, "ofm", "dlo");
            }
        }
    }

    public static void a(String str, byte[] bArr, bv bvVar) throws IOException, CertificateException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
        bl blVar;
        OutputStream outputStream = null;
        try {
            if (a(bvVar.f7709a, str)) {
                return;
            }
            File file = new File(bvVar.f7709a);
            if (!file.exists()) {
                file.mkdirs();
            }
            blVar = bl.a(file, bvVar.b);
            try {
                blVar.a(bvVar.d);
                byte[] b = bvVar.e.b(bArr);
                bl.a b2 = blVar.b(str);
                outputStream = b2.a();
                outputStream.write(b);
                b2.b();
                blVar.c();
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                if (blVar == null) {
                    return;
                }
                try {
                    blVar.close();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                th = th3;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th4.printStackTrace();
                    }
                }
                if (blVar != null) {
                    try {
                        blVar.close();
                    } catch (Throwable th5) {
                        th5.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            blVar = null;
        }
    }

    private static boolean a(String str, String str2) {
        try {
            return new File(str, str2 + ".0").exists();
        } catch (Throwable th) {
            av.b(th, "leg", "fet");
            return false;
        }
    }

    private static byte[] a(bl blVar, bv bvVar, List<String> list) {
        String[] list2;
        try {
            File b = blVar.b();
            if (b != null && b.exists()) {
                int i = 0;
                for (String str : b.list()) {
                    if (str.contains(".0")) {
                        String str2 = str.split("\\.")[0];
                        byte[] a2 = cb.a(blVar, str2);
                        i += a2.length;
                        list.add(str2);
                        if (i > bvVar.f.b()) {
                            break;
                        }
                        bvVar.g.b(a2);
                    }
                }
                if (i > 0) {
                    return bvVar.g.a();
                }
                return null;
            }
        } catch (Throwable th) {
            av.b(th, "leg", "gCo");
        }
        return new byte[0];
    }
}
