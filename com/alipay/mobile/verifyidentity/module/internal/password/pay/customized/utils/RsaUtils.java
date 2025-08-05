package com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.utils;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: classes3.dex */
public class RsaUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static PublicKey a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PublicKey) ipChange.ipc$dispatch("76a79e19", new Object[]{str, str2});
        }
        try {
            return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 2)));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (r2 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String encrypt(java.lang.String r6, java.lang.String r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.utils.RsaUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r6 = "327cf920"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L18:
            r0 = 0
            java.lang.String r1 = "RSA"
            java.security.PublicKey r7 = a(r1, r7)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L61
            java.lang.String r1 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L61
            r1.init(r2, r7)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L61
            java.lang.String r7 = "UTF-8"
            byte[] r6 = r6.getBytes(r7)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L61
            int r7 = r1.getBlockSize()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L61
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L61
            r2.<init>()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L61
        L37:
            int r5 = r6.length     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L62
            if (r3 >= r5) goto L4b
            int r5 = r6.length     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L62
            int r5 = r5 - r3
            if (r5 >= r7) goto L41
            int r5 = r6.length     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L62
            int r5 = r5 - r3
            goto L42
        L41:
            r5 = r7
        L42:
            byte[] r5 = r1.doFinal(r6, r3, r5)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L62
            r2.write(r5)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L62
            int r3 = r3 + r7
            goto L37
        L4b:
            byte[] r6 = r2.toByteArray()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L62
            java.lang.String r0 = android.util.Base64.encodeToString(r6, r4)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L62
        L53:
            r2.close()     // Catch: java.io.IOException -> L65
            goto L65
        L57:
            r6 = move-exception
            r0 = r2
            goto L5b
        L5a:
            r6 = move-exception
        L5b:
            if (r0 == 0) goto L60
            r0.close()     // Catch: java.io.IOException -> L60
        L60:
            throw r6
        L61:
            r2 = r0
        L62:
            if (r2 == 0) goto L65
            goto L53
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.utils.RsaUtils.encrypt(java.lang.String, java.lang.String):java.lang.String");
    }
}
