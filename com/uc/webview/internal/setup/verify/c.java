package com.uc.webview.internal.setup.verify;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import com.uc.webview.base.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.ByteBuffer;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f23984a = Base64.decode("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", 2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class a {
        public static final boolean a(PublicKey[] publicKeyArr) {
            return publicKeyArr == null || publicKeyArr.length <= 0;
        }

        public static Signature[] a(Context context, String str) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                if (packageInfo != null) {
                    return packageInfo.signatures;
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("Verifier.dex", e.getMessage());
                return null;
            }
        }

        public static Signature[] a(String str) {
            Signature[] signatureArr;
            boolean z = true;
            Log.d("Verifier.dex", String.format("getUninstalledAPKSignature(): archiveApkFilePath = %1s", str));
            Signature[] signatureArr2 = null;
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (!com.uc.webview.base.io.d.b(new File(str))) {
                    z = false;
                } else if (!com.uc.webview.internal.setup.verify.a.a(str)) {
                    z = e.a(str);
                }
                if (z) {
                    Log.d("Verifier.dex", "摘要校验V2!");
                    signatureArr = b(str);
                } else {
                    signatureArr = null;
                }
                if (signatureArr == null || signatureArr.length <= 0) {
                    Log.e("Verifier.dex", "摘要校验失败");
                } else {
                    try {
                        Log.d("Verifier.dex", "摘要校验成功!");
                        signatureArr2 = signatureArr;
                    } catch (Throwable th) {
                        signatureArr2 = signatureArr;
                        th = th;
                        th.printStackTrace();
                        Log.e("Verifier.dex", th.getMessage());
                        return signatureArr2;
                    }
                }
                Log.i("Verifier.dex", "耗时：" + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            } catch (Throwable th2) {
                th = th2;
            }
            return signatureArr2;
        }

        static Signature[] a(byte[] bArr) throws Exception {
            X509Certificate[][] a2 = com.uc.webview.internal.setup.verify.a.a(ByteBuffer.wrap(bArr));
            Signature[] signatureArr = new Signature[a2.length];
            for (int i = 0; i < a2.length; i++) {
                signatureArr[i] = new Signature(a2[i][0].getEncoded());
            }
            return signatureArr;
        }

        public static PublicKey[] a(Signature[] signatureArr) {
            if (signatureArr != null) {
                try {
                    if (signatureArr.length != 0) {
                        int length = signatureArr.length;
                        PublicKey[] publicKeyArr = new PublicKey[length];
                        for (int i = 0; i < length; i++) {
                            publicKeyArr[i] = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[i].toByteArray()))).getPublicKey();
                        }
                        return publicKeyArr;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e("Verifier.dex", "获取公钥异常：\n" + e.getMessage());
                }
            }
            return null;
        }

        private static Signature[] b(String str) throws Exception {
            X509Certificate[][] b = com.uc.webview.internal.setup.verify.a.b(str);
            Signature[] signatureArr = new Signature[b.length];
            for (int i = 0; i < b.length; i++) {
                signatureArr[i] = new Signature(b[i][0].getEncoded());
            }
            return signatureArr;
        }
    }

    public static boolean a(Context context, String str) {
        StringBuilder sb;
        long currentTimeMillis;
        Signature[] a2;
        StringBuilder sb2;
        StringBuilder sb3;
        if (!new File(str).exists()) {
            return false;
        }
        Log.d("Verifier.dex", "verify: file = ".concat(String.valueOf(str)));
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            currentTimeMillis = System.currentTimeMillis();
            a2 = a.a(str);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                sb = new StringBuilder("Verify: total costs:");
            } catch (Throwable th2) {
                Log.d("Verifier.dex", "Verify: total costs:" + (System.currentTimeMillis() - currentTimeMillis2) + "ms");
                throw th2;
            }
        }
        if (a2 == null || a2.length <= 0) {
            Log.d("Verifier.dex", "verify: failed: Signatures of archive is empty. Costs " + (System.currentTimeMillis() - currentTimeMillis) + "ms.");
            sb3 = new StringBuilder("Verify: total costs:");
        } else {
            PublicKey[] a3 = a.a(a2);
            if (!a.a(a3)) {
                Log.d("Verifier.dex", "verify: step 0: get PublicKeys of archive ok. Costs " + (System.currentTimeMillis() - currentTimeMillis) + "ms.");
                long currentTimeMillis3 = System.currentTimeMillis();
                if (a(a3, a.a(context, context.getPackageName()))) {
                    Log.d("Verifier.dex", "verify: step 1: get Signatures of app from current context and verify ok. Costs " + (System.currentTimeMillis() - currentTimeMillis3) + "ms.");
                    sb2 = new StringBuilder("Verify: total costs:");
                } else {
                    Log.d("Verifier.dex", "verify: step 1: get Signatures of app from current context and verify failed. Costs " + (System.currentTimeMillis() - currentTimeMillis3) + "ms.");
                    long currentTimeMillis4 = System.currentTimeMillis();
                    if (!a(a3, a.a(f23984a))) {
                        Log.d("Verifier.dex", "verify: step 2: get Signatures of app from hardcode app and verify failed. Costs " + (System.currentTimeMillis() - currentTimeMillis4) + "ms.");
                        sb = new StringBuilder("Verify: total costs:");
                        sb.append(System.currentTimeMillis() - currentTimeMillis2);
                        sb.append("ms");
                        Log.d("Verifier.dex", sb.toString());
                        return false;
                    }
                    Log.d("Verifier.dex", "verify: step 2: get Signatures of app from hardcode app and verify ok. Costs " + (System.currentTimeMillis() - currentTimeMillis4) + "ms.");
                    sb2 = new StringBuilder("Verify: total costs:");
                }
                sb2.append(System.currentTimeMillis() - currentTimeMillis2);
                sb2.append("ms");
                Log.d("Verifier.dex", sb2.toString());
                return true;
            }
            Log.d("Verifier.dex", "verify: failed: PublicKeys of archive is empty. Costs " + (System.currentTimeMillis() - currentTimeMillis) + "ms.");
            sb3 = new StringBuilder("Verify: total costs:");
        }
        sb3.append(System.currentTimeMillis() - currentTimeMillis2);
        sb3.append("ms");
        Log.d("Verifier.dex", sb3.toString());
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c A[Catch: Throwable -> 0x005a, TRY_LEAVE, TryCatch #0 {Throwable -> 0x005a, blocks: (B:3:0x0006, B:5:0x0010, B:11:0x001a, B:13:0x0023, B:14:0x002b, B:16:0x0034, B:17:0x003c, B:23:0x004c, B:20:0x0044), top: B:30:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean a(java.security.PublicKey[] r8, android.content.pm.Signature[] r9) {
        /*
            java.lang.String r0 = "公钥校验错误：Implement.isEmpty(appPublicKeys) == true"
            java.lang.String r1 = "Verifier.dex"
            r2 = 0
            java.security.PublicKey[] r9 = com.uc.webview.internal.setup.verify.c.a.a(r9)     // Catch: java.lang.Throwable -> L5a
            boolean r3 = com.uc.webview.internal.setup.verify.c.a.a(r9)     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L14
            com.uc.webview.base.Log.d(r1, r0)     // Catch: java.lang.Throwable -> L5a
            return r2
        L14:
            r3 = 1
            if (r9 == 0) goto L44
            if (r8 != 0) goto L1a
            goto L44
        L1a:
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L5a
            r4.<init>()     // Catch: java.lang.Throwable -> L5a
            int r5 = r9.length     // Catch: java.lang.Throwable -> L5a
            r6 = 0
        L21:
            if (r6 >= r5) goto L2b
            r7 = r9[r6]     // Catch: java.lang.Throwable -> L5a
            r4.add(r7)     // Catch: java.lang.Throwable -> L5a
            int r6 = r6 + 1
            goto L21
        L2b:
            java.util.HashSet r9 = new java.util.HashSet     // Catch: java.lang.Throwable -> L5a
            r9.<init>()     // Catch: java.lang.Throwable -> L5a
            int r5 = r8.length     // Catch: java.lang.Throwable -> L5a
            r6 = 0
        L32:
            if (r6 >= r5) goto L3c
            r7 = r8[r6]     // Catch: java.lang.Throwable -> L5a
            r9.add(r7)     // Catch: java.lang.Throwable -> L5a
            int r6 = r6 + 1
            goto L32
        L3c:
            boolean r8 = r4.equals(r9)     // Catch: java.lang.Throwable -> L5a
            if (r8 == 0) goto L49
            r8 = 1
            goto L4a
        L44:
            java.lang.String r8 = "Sign.equals: s1 == null || s2 == null"
            com.uc.webview.base.Log.e(r1, r8)     // Catch: java.lang.Throwable -> L5a
        L49:
            r8 = 0
        L4a:
            if (r8 != 0) goto L53
            java.lang.String r8 = "公钥校验错误：Implement.equals(appPublicKeys, archiveKeys) == false"
            com.uc.webview.base.Log.d(r1, r8)     // Catch: java.lang.Throwable -> L5a
            return r2
        L53:
            java.lang.String r8 = "公钥校验正确!"
            com.uc.webview.base.Log.d(r1, r8)
            return r3
        L5a:
            r8 = move-exception
            r8.printStackTrace()
            com.uc.webview.base.Log.d(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.verify.c.a(java.security.PublicKey[], android.content.pm.Signature[]):boolean");
    }
}
