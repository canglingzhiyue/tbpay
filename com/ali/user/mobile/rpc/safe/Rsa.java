package com.ali.user.mobile.rpc.safe;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import tb.kge;

/* loaded from: classes2.dex */
public class Rsa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ALGORITHM = "RSA";
    public static final String SIGN_ALGORITHMS = "SHA1WithRSA";

    static {
        kge.a(1925454512);
    }

    private static PublicKey getPublicKeyFromX509(String str, String str2) throws NoSuchAlgorithmException, Exception {
        KeyFactory keyFactory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PublicKey) ipChange.ipc$dispatch("50a9eaa8", new Object[]{str, str2});
        }
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.decode(str2));
        try {
            try {
                keyFactory = KeyFactory.getInstance(str);
            } catch (Throwable unused) {
                keyFactory = KeyFactory.getInstance(str, p1.h);
            }
        } catch (Throwable unused2) {
            keyFactory = KeyFactory.getInstance(str);
        }
        if (keyFactory == null) {
            keyFactory = KeyFactory.getInstance(str);
        }
        return keyFactory.generatePublic(x509EncodedKeySpec);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.ByteArrayOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String encrypt(java.lang.String r5, java.lang.String r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.ali.user.mobile.rpc.safe.Rsa.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            r1[r2] = r6
            java.lang.String r5 = "327cf920"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L18:
            r0 = 0
            java.lang.String r1 = "RSA"
            java.security.PublicKey r6 = getPublicKeyFromX509(r1, r6)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L68 java.lang.Exception -> L73
            java.lang.String r1 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L68 java.lang.Exception -> L73
            r1.init(r2, r6)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L68 java.lang.Exception -> L73
            java.lang.String r6 = "UTF-8"
            byte[] r5 = r5.getBytes(r6)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L68 java.lang.Exception -> L73
            int r6 = r1.getBlockSize()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L68 java.lang.Exception -> L73
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L68 java.lang.Exception -> L73
            r2.<init>()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L68 java.lang.Exception -> L73
        L37:
            int r4 = r5.length     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63 java.lang.Throwable -> L84
            if (r3 >= r4) goto L4b
            int r4 = r5.length     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63 java.lang.Throwable -> L84
            int r4 = r4 - r3
            if (r4 >= r6) goto L41
            int r4 = r5.length     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63 java.lang.Throwable -> L84
            int r4 = r4 - r3
            goto L42
        L41:
            r4 = r6
        L42:
            byte[] r4 = r1.doFinal(r5, r3, r4)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63 java.lang.Throwable -> L84
            r2.write(r4)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63 java.lang.Throwable -> L84
            int r3 = r3 + r6
            goto L37
        L4b:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63 java.lang.Throwable -> L84
            byte[] r6 = r2.toByteArray()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63 java.lang.Throwable -> L84
            java.lang.String r6 = com.ali.user.mobile.rpc.safe.Base64.encode(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63 java.lang.Throwable -> L84
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63 java.lang.Throwable -> L84
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L83
        L5c:
            r6 = move-exception
            r6.printStackTrace()
            goto L83
        L61:
            r5 = move-exception
            goto L6a
        L63:
            r5 = move-exception
            goto L75
        L65:
            r5 = move-exception
            r2 = r0
            goto L85
        L68:
            r5 = move-exception
            r2 = r0
        L6a:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L82
            r2.close()     // Catch: java.io.IOException -> L7e
            goto L82
        L73:
            r5 = move-exception
            r2 = r0
        L75:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L82
            r2.close()     // Catch: java.io.IOException -> L7e
            goto L82
        L7e:
            r5 = move-exception
            r5.printStackTrace()
        L82:
            r5 = r0
        L83:
            return r5
        L84:
            r5 = move-exception
        L85:
            if (r2 == 0) goto L8f
            r2.close()     // Catch: java.io.IOException -> L8b
            goto L8f
        L8b:
            r6 = move-exception
            r6.printStackTrace()
        L8f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.rpc.safe.Rsa.encrypt(java.lang.String, java.lang.String):java.lang.String");
    }

    public static String sign(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0aca0c8", new Object[]{str, str2});
        }
        try {
            PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2)));
            Signature signature = Signature.getInstance("SHA1WithRSA");
            signature.initSign(generatePrivate);
            signature.update(str.getBytes("utf-8"));
            return Base64.encode(signature.sign());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
