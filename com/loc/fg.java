package com.loc;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import tb.jhy;
import tb.tof;

/* loaded from: classes4.dex */
public final class fg {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f7790a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final byte[] b = {61, 61, 81, 65, 65, 69, 119, 65, 67, 48, 74, 80, 115, 116, tof.LF_FIFO, 75, 104, 76, 122, 97, 88, 99, tof.LF_DIR, 71, tof.LF_LINK, 122, 68, 70, 79, 104, 113, 113, 65, 97, 76, tof.LF_FIFO, 65, 66, 87, tof.LF_DIR, 103, 85, 84, 113, 71, 68, 69, 76, 80, 82, 106, tof.LF_CHR, 66, 75, 75, 69, 98, tof.LF_CONTIG, 84, 108, 115, 122, tof.LF_CHR, 106, 76, tof.LF_CONTIG, 88, 122, 70, 121, 73, 75, tof.LF_BLK, tof.LF_SYMLINK, 43, 101, 70, 121, 56, 105, 115, 105, 89, 120, 117, 112, tof.LF_DIR, 48, 76, 81, 70, 86, 108, 110, 73, 65, 66, 74, 65, 83, 119, 65, 119, 83, 68, 65, 81, 66, 66, 69, 81, 65, 78, 99, 118, 104, 73, 90, 111, 75, 74, 89, 81, 68, 119, 119, 70, 77};
    private static final byte[] c = {0, 1, 1, 2, 3, 5, 8, 13, 8, 7, 6, 5, 4, 3, 2, 1};
    private static final IvParameterSpec d = new IvParameterSpec(c);

    public static String a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    String a2 = a("SHA1", str);
                    return a("MD5", a2 + str);
                }
            } catch (Throwable th) {
                fr.a(th, "Encrypt", "generatorKey");
            }
        }
        return null;
    }

    public static String a(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        try {
            return c(s.a(str2.getBytes("UTF-8"), str));
        } catch (Throwable th) {
            fr.a(th, "Encrypt", "encode");
            return null;
        }
    }

    private static byte[] a() {
        return x.c();
    }

    public static byte[] a(byte[] bArr) throws Exception {
        PublicKey generatePublic = KeyFactory.getInstance(jhy.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(en.a(new StringBuilder(new String(b)).reverse().toString().getBytes())));
        Cipher cipher = Cipher.getInstance(x.c("WUlNBL0VDQi9PQUVQV0lUSFNIQS0xQU5ETUdGMVBBRERJTkc"));
        cipher.init(1, generatePublic);
        return cipher.doFinal(bArr);
    }

    public static byte[] a(byte[] bArr, String str) {
        try {
            SecretKeySpec b2 = b(str);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(a());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, b2, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            fr.a(th, "Encrypt", "aesEncrypt");
            return null;
        }
    }

    private static SecretKeySpec b(String str) {
        byte[] bArr;
        if (str == null) {
            str = "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        while (true) {
            stringBuffer.append(str);
            if (stringBuffer.length() >= 16) {
                break;
            }
            str = "0";
        }
        if (stringBuffer.length() > 16) {
            stringBuffer.setLength(16);
        }
        try {
            bArr = stringBuffer.toString().getBytes("UTF-8");
        } catch (Throwable th) {
            fr.a(th, "Encrypt", "createKey");
            bArr = null;
        }
        return new SecretKeySpec(bArr, "AES");
    }

    public static byte[] b(byte[] bArr) {
        int i = 0;
        try {
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[bArr.length - 16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            System.arraycopy(bArr, 16, bArr3, 0, bArr.length - 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(x.c()));
            return cipher.doFinal(bArr3);
        } catch (Throwable th) {
            if (bArr != null) {
                i = bArr.length;
            }
            fr.a(th, "Encrypt", "decryptRsponse length = ".concat(String.valueOf(i)));
            return null;
        }
    }

    public static byte[] b(byte[] bArr, String str) {
        try {
            SecretKeySpec b2 = b(str);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(a());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, b2, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            fr.a(th, "Encrypt", "aesDecrypt");
            return null;
        }
    }

    private static String c(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i = 0; i < length; i++) {
            sb.append(f7790a[(bArr[i] >> 4) & 15]);
            sb.append(f7790a[bArr[i] & 15]);
        }
        return sb.toString();
    }
}
