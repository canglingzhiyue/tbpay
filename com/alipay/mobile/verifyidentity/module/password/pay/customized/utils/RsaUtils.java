package com.alipay.mobile.verifyidentity.module.password.pay.customized.utils;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import tb.jhy;

/* loaded from: classes3.dex */
public class RsaUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5928a = "RsaUtils";

    public static String encryptPassword(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77cc8e0f", new Object[]{str}) : encrypt_Hard_RSA_Base64(str);
    }

    public static String encryptCardNoText(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a137e342", new Object[]{str, str2});
        }
        try {
            byte[] bytes = str.getBytes();
            PublicKey a2 = a(jhy.KEY_ALGORITHM, str2);
            if (a2 == null) {
                return null;
            }
            Cipher cipher = Cipher.getInstance("RSA/None/PKCS1Padding");
            cipher.init(1, a2);
            return new String(Base64.encode(cipher.doFinal(bytes), 2));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8 A[Catch: Exception -> 0x00bf, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bf, blocks: (B:6:0x0015, B:8:0x0026, B:9:0x003a, B:11:0x0042, B:13:0x004e, B:15:0x0082, B:18:0x008b, B:20:0x00a0, B:24:0x00a8, B:19:0x0096, B:12:0x004b), top: B:28:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String encrypt_Hard_RSA_Base64(java.lang.String r9) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.RsaUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r9
            java.lang.String r9 = "e709aee7"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbf
            r0.<init>()     // Catch: java.lang.Exception -> Lbf
            r1 = 256(0x100, float:3.59E-43)
            byte[] r4 = new byte[r1]     // Catch: java.lang.Exception -> Lbf
            java.util.Random r5 = new java.util.Random     // Catch: java.lang.Exception -> Lbf
            r5.<init>()     // Catch: java.lang.Exception -> Lbf
            r6 = 0
        L24:
            if (r6 >= r1) goto L3a
            r7 = 128(0x80, float:1.794E-43)
            int r8 = r5.nextInt(r7)     // Catch: java.lang.Exception -> Lbf
            int r8 = r8 - r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> Lbf
            byte r7 = r7.byteValue()     // Catch: java.lang.Exception -> Lbf
            r4[r6] = r7     // Catch: java.lang.Exception -> Lbf
            int r6 = r6 + 1
            goto L24
        L3a:
            int r1 = r9.length()     // Catch: java.lang.Exception -> Lbf
            r5 = 10
            if (r1 >= r5) goto L4b
            java.lang.String r5 = "0"
            r0.append(r5)     // Catch: java.lang.Exception -> Lbf
            r0.append(r1)     // Catch: java.lang.Exception -> Lbf
            goto L4e
        L4b:
            r0.append(r1)     // Catch: java.lang.Exception -> Lbf
        L4e:
            r0.append(r9)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Exception -> Lbf
            byte[] r9 = r9.getBytes()     // Catch: java.lang.Exception -> Lbf
            r0 = 2
            int r1 = r1 + r0
            java.lang.System.arraycopy(r9, r3, r4, r3, r1)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r9 = "RSA"
            com.alipay.mobile.verifyidentity.engine.MicroModuleContext r1 = com.alipay.mobile.verifyidentity.engine.MicroModuleContext.getInstance()     // Catch: java.lang.Exception -> Lbf
            java.lang.String r1 = r1.getEnvType()     // Catch: java.lang.Exception -> Lbf
            java.lang.String r3 = com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.RsaUtils.f5928a     // Catch: java.lang.Exception -> Lbf
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbf
            java.lang.String r6 = "pub_key_env："
            r5.<init>(r6)     // Catch: java.lang.Exception -> Lbf
            r5.append(r1)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Lbf
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r3, r5)     // Catch: java.lang.Exception -> Lbf
            boolean r3 = android.text.StringUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Lbf
            if (r3 != 0) goto L96
            java.lang.String r3 = "ONLINE"
            boolean r1 = r3.equalsIgnoreCase(r1)     // Catch: java.lang.Exception -> Lbf
            if (r1 == 0) goto L8b
            goto L96
        L8b:
            java.lang.String r1 = com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.RsaUtils.f5928a     // Catch: java.lang.Exception -> Lbf
            java.lang.String r3 = "用内置线下公钥"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r1, r3)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r1 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA+u3dJpvadxMqVJH4uEfhmY9+yjJJaplnd9iL9aX4nKty1yuRTSSDUWCaSXMF+RR/LWc1Wkt5lLWbXTZ2Bcv3vUTORrOyfRd5b3IGTJVERrcEDEJVbKN+CdX53CS18hAV3ugCUOHzI53VT4TLWh0P9OtqBXpOkBzsRvCl36Yc+L5whiBy64cTfcp+GAcRBLaUl2ZvVojg6WKwcTBinkEsGIcUdv/whftnXIWAK4jeOX7NddKcaZO7aehEq2XO1IryzgAUnRr9Og515VpRBvBYMxKBvHcXFpCGWfg8xWIalU4BiwY6etKsYyAOz9JOnt8kLMR0POyVVwRWGn20xUOuKwIDAQAB"
            goto La0
        L96:
            java.lang.String r1 = com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.RsaUtils.f5928a     // Catch: java.lang.Exception -> Lbf
            java.lang.String r3 = "用内置线上公钥"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r1, r3)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r1 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAv+8ILqsASxulyk44beo/JJeMs4l1JcrkQI6LAfxBsSVFFm0/RkRGjd9pLT0Y4VcPU/CfKvXesp2PcYOkdj+E74gZ49ePRtohCfvJmeIvNFcwT5etvDLcqxX04+MbwtrQt7gvluQaPmCoRIXXTTAZf9cSvDYoRKQZ9A64Rqrse/YpImurI1yuT8vGw5vf22/7P87C5qTT/lpqsPx9kVdDZ/pY1O72SON25VDrjEK7R5rwRxMQOY9TxCmgPJzj3uUXtYf1ZObZVlbIjpZ20rtPTmh48lyjYSToIWwJa6UzvF0NcwXWMI3DrgKLUVCUpktWqWeYgV7JGc9E8LZmMNLmYwIDAQAB"
        La0:
            java.security.PublicKey r9 = a(r9, r1)     // Catch: java.lang.Exception -> Lbf
            if (r9 != 0) goto La8
            r9 = 0
            return r9
        La8:
            java.lang.String r1 = "RSA/ECB/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: java.lang.Exception -> Lbf
            r1.init(r2, r9)     // Catch: java.lang.Exception -> Lbf
            byte[] r9 = r1.doFinal(r4)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> Lbf
            byte[] r9 = android.util.Base64.encode(r9, r0)     // Catch: java.lang.Exception -> Lbf
            r1.<init>(r9)     // Catch: java.lang.Exception -> Lbf
            return r1
        Lbf:
            java.lang.String r9 = ""
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.RsaUtils.encrypt_Hard_RSA_Base64(java.lang.String):java.lang.String");
    }

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
    public static java.lang.String encryptAlpay(java.lang.String r6, java.lang.String r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.RsaUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r6 = "47be35ad"
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
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.RsaUtils.encryptAlpay(java.lang.String, java.lang.String):java.lang.String");
    }
}
