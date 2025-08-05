package com.alipay.mobile.verifyidentity.safepaybase.encrypt;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import tb.jhy;

/* loaded from: classes3.dex */
public class Rsa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SIGN_ALGORITHMS = "SHA1WithRSA";

    private static PublicKey a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PublicKey) ipChange.ipc$dispatch("76a79e19", new Object[]{str, str2}) : KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 2)));
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
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.verifyidentity.safepaybase.encrypt.Rsa.$ipChange
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
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.safepaybase.encrypt.Rsa.encrypt(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
        if (r2 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] encryptToByteArray(java.lang.String r5, java.lang.String r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.verifyidentity.safepaybase.encrypt.Rsa.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            r1[r2] = r6
            java.lang.String r5 = "bbee6af1"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            byte[] r5 = (byte[]) r5
            return r5
        L18:
            r0 = 0
            java.lang.String r1 = "RSA"
            java.security.PublicKey r6 = a(r1, r6)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L5d
            java.lang.String r1 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L5d
            r1.init(r2, r6)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L5d
            java.lang.String r6 = "UTF-8"
            byte[] r5 = r5.getBytes(r6)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L5d
            int r6 = r1.getBlockSize()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L5d
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L5d
            r2.<init>()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L5d
        L37:
            int r4 = r5.length     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L5e
            if (r3 >= r4) goto L4b
            int r4 = r5.length     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L5e
            int r4 = r4 - r3
            if (r4 >= r6) goto L41
            int r4 = r5.length     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L5e
            int r4 = r4 - r3
            goto L42
        L41:
            r4 = r6
        L42:
            byte[] r4 = r1.doFinal(r5, r3, r4)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L5e
            r2.write(r4)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L5e
            int r3 = r3 + r6
            goto L37
        L4b:
            byte[] r0 = r2.toByteArray()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L5e
        L4f:
            r2.close()     // Catch: java.io.IOException -> L61
            goto L61
        L53:
            r5 = move-exception
            r0 = r2
            goto L57
        L56:
            r5 = move-exception
        L57:
            if (r0 == 0) goto L5c
            r0.close()     // Catch: java.io.IOException -> L5c
        L5c:
            throw r5
        L5d:
            r2 = r0
        L5e:
            if (r2 == 0) goto L61
            goto L4f
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.safepaybase.encrypt.Rsa.encryptToByteArray(java.lang.String, java.lang.String):byte[]");
    }

    public static String decrypt(String str, String str2) {
        ByteArrayOutputStream byteArrayOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24104ef8", new Object[]{str, str2});
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            PrivateKey generatePrivate = KeyFactory.getInstance(jhy.KEY_ALGORITHM).generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2, 2)));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, generatePrivate);
            byte[] decode = Base64.decode(str, 2);
            int blockSize = cipher.getBlockSize();
            byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i = 0; i < decode.length; i += blockSize) {
                try {
                    byteArrayOutputStream.write(cipher.doFinal(decode, i, decode.length - i < blockSize ? decode.length - i : blockSize));
                } catch (Exception unused) {
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            }
            String str3 = new String(byteArrayOutputStream.toByteArray());
            try {
                byteArrayOutputStream.close();
                return str3;
            } catch (IOException unused4) {
                return str3;
            }
        } catch (Exception unused5) {
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String sign(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0aca0c8", new Object[]{str, str2});
        }
        try {
            PrivateKey generatePrivate = KeyFactory.getInstance(jhy.KEY_ALGORITHM).generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2, 2)));
            Signature signature = Signature.getInstance("SHA1WithRSA");
            signature.initSign(generatePrivate);
            signature.update(str.getBytes("utf-8"));
            return Base64.encodeToString(signature.sign(), 2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean doCheck(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("405d4c26", new Object[]{str, str2, str3})).booleanValue();
        }
        try {
            PublicKey generatePublic = KeyFactory.getInstance(jhy.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode(str3, 2)));
            Signature signature = Signature.getInstance("SHA1WithRSA");
            signature.initVerify(generatePublic);
            signature.update(str.getBytes("utf-8"));
            return signature.verify(Base64.decode(str2, 2));
        } catch (Exception unused) {
            return false;
        }
    }
}
