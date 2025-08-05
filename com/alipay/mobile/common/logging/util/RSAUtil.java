package com.alipay.mobile.common.logging.util;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import javax.crypto.Cipher;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class RSAUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Cipher f5465a;
    private static Cipher b;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (r7 == null) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized byte[] encrypt(byte[] r6, java.lang.String r7) {
        /*
            java.lang.Class<com.alipay.mobile.common.logging.util.RSAUtil> r0 = com.alipay.mobile.common.logging.util.RSAUtil.class
            monitor-enter(r0)
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.mobile.common.logging.util.RSAUtil.$ipChange     // Catch: java.lang.Throwable -> L79
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: java.lang.Throwable -> L79
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1c
            java.lang.String r2 = "f5ebff40"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L79
            r5[r4] = r6     // Catch: java.lang.Throwable -> L79
            r5[r3] = r7     // Catch: java.lang.Throwable -> L79
            java.lang.Object r6 = r1.ipc$dispatch(r2, r5)     // Catch: java.lang.Throwable -> L79
            byte[] r6 = (byte[]) r6     // Catch: java.lang.Throwable -> L79
            monitor-exit(r0)
            return r6
        L1c:
            r1 = 0
            javax.crypto.Cipher r2 = com.alipay.mobile.common.logging.util.RSAUtil.f5465a     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            if (r2 != 0) goto L3f
            java.lang.String r2 = "RSA"
            byte[] r7 = com.alipay.mobile.common.logging.util.Base64.decode(r7)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.security.spec.X509EncodedKeySpec r5 = new java.security.spec.X509EncodedKeySpec     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.security.KeyFactory r7 = java.security.KeyFactory.getInstance(r2)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.security.PublicKey r7 = r7.generatePublic(r5)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.lang.String r2 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            com.alipay.mobile.common.logging.util.RSAUtil.f5465a = r2     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r2.init(r3, r7)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
        L3f:
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r7.<init>()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
        L44:
            int r2 = r6.length     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> L71
            if (r4 >= r2) goto L5c
            javax.crypto.Cipher r2 = com.alipay.mobile.common.logging.util.RSAUtil.f5465a     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> L71
            int r3 = r6.length     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> L71
            int r3 = r3 - r4
            r5 = 117(0x75, float:1.64E-43)
            if (r3 >= r5) goto L52
            int r3 = r6.length     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> L71
            int r5 = r3 - r4
        L52:
            byte[] r2 = r2.doFinal(r6, r4, r5)     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> L71
            r7.write(r2)     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> L71
            int r4 = r4 + 117
            goto L44
        L5c:
            r7.flush()     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> L71
            byte[] r1 = r7.toByteArray()     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> L71
        L63:
            r7.close()     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L79
            goto L6f
        L67:
            r6 = move-exception
            goto L73
        L69:
            r7 = r1
        L6a:
            com.alipay.mobile.common.logging.util.RSAUtil.f5465a = r1     // Catch: java.lang.Throwable -> L71
            if (r7 == 0) goto L6f
            goto L63
        L6f:
            monitor-exit(r0)
            return r1
        L71:
            r6 = move-exception
            r1 = r7
        L73:
            if (r1 == 0) goto L78
            r1.close()     // Catch: java.io.IOException -> L78 java.lang.Throwable -> L79
        L78:
            throw r6     // Catch: java.lang.Throwable -> L79
        L79:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.RSAUtil.encrypt(byte[], java.lang.String):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (r7 == null) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized byte[] decrypt(byte[] r6, java.lang.String r7) {
        /*
            java.lang.Class<com.alipay.mobile.common.logging.util.RSAUtil> r0 = com.alipay.mobile.common.logging.util.RSAUtil.class
            monitor-enter(r0)
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.mobile.common.logging.util.RSAUtil.$ipChange     // Catch: java.lang.Throwable -> L79
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: java.lang.Throwable -> L79
            r3 = 0
            r4 = 2
            if (r2 == 0) goto L1c
            java.lang.String r2 = "b18cb518"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L79
            r4[r3] = r6     // Catch: java.lang.Throwable -> L79
            r6 = 1
            r4[r6] = r7     // Catch: java.lang.Throwable -> L79
            java.lang.Object r6 = r1.ipc$dispatch(r2, r4)     // Catch: java.lang.Throwable -> L79
            byte[] r6 = (byte[]) r6     // Catch: java.lang.Throwable -> L79
            monitor-exit(r0)
            return r6
        L1c:
            r1 = 0
            javax.crypto.Cipher r2 = com.alipay.mobile.common.logging.util.RSAUtil.b     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            if (r2 != 0) goto L3f
            java.lang.String r2 = "RSA"
            byte[] r7 = com.alipay.mobile.common.logging.util.Base64.decode(r7)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.security.spec.PKCS8EncodedKeySpec r5 = new java.security.spec.PKCS8EncodedKeySpec     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.security.KeyFactory r7 = java.security.KeyFactory.getInstance(r2)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.security.PrivateKey r7 = r7.generatePrivate(r5)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.lang.String r2 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            com.alipay.mobile.common.logging.util.RSAUtil.b = r2     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r2.init(r4, r7)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
        L3f:
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r7.<init>()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
        L44:
            int r2 = r6.length     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> L71
            if (r3 >= r2) goto L5c
            javax.crypto.Cipher r2 = com.alipay.mobile.common.logging.util.RSAUtil.b     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> L71
            int r4 = r6.length     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> L71
            int r4 = r4 - r3
            r5 = 128(0x80, float:1.794E-43)
            if (r4 >= r5) goto L52
            int r4 = r6.length     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> L71
            int r5 = r4 - r3
        L52:
            byte[] r2 = r2.doFinal(r6, r3, r5)     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> L71
            r7.write(r2)     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> L71
            int r3 = r3 + 128
            goto L44
        L5c:
            r7.flush()     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> L71
            byte[] r1 = r7.toByteArray()     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> L71
        L63:
            r7.close()     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L79
            goto L6f
        L67:
            r6 = move-exception
            goto L73
        L69:
            r7 = r1
        L6a:
            com.alipay.mobile.common.logging.util.RSAUtil.b = r1     // Catch: java.lang.Throwable -> L71
            if (r7 == 0) goto L6f
            goto L63
        L6f:
            monitor-exit(r0)
            return r1
        L71:
            r6 = move-exception
            r1 = r7
        L73:
            if (r1 == 0) goto L78
            r1.close()     // Catch: java.io.IOException -> L78 java.lang.Throwable -> L79
        L78:
            throw r6     // Catch: java.lang.Throwable -> L79
        L79:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.RSAUtil.decrypt(byte[], java.lang.String):byte[]");
    }
}
