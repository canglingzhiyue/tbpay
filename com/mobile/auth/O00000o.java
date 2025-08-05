package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class O00000o {
    private static final String O000000o = "O00000o";
    private static byte[] O00000Oo = EncryptUtils.IV_PARAMETER_SPEC.getBytes();
    private static byte[] O00000o0 = "vrf5g7h0tededwx3".getBytes();

    public static String O000000o(String str, String str2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(O00000Oo);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] bytes = str.getBytes("utf-8");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return O0000Oo.O000000o(cipher.doFinal(bytes));
        } catch (Throwable th) {
            try {
                O000000o.O000000o(O000000o, "encryptAesNew error", th);
                return null;
            } catch (Throwable th2) {
                try {
                    ExceptionProcessor.processException(th2);
                    return null;
                } catch (Throwable th3) {
                    ExceptionProcessor.processException(th3);
                    return null;
                }
            }
        }
    }

    public static byte[] O00000Oo(String str, String str2) {
        try {
            byte[] bytes = str.getBytes("utf-8");
            int length = bytes.length;
            while (length % 16 != 0) {
                length++;
            }
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                if (i < bytes.length) {
                    bArr[i] = bytes[i];
                } else {
                    bArr[i] = 0;
                }
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(O00000o0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            try {
                O000000o.O000000o(O000000o, "encrypt4Ux error", th);
                return null;
            } catch (Throwable th2) {
                try {
                    ExceptionProcessor.processException(th2);
                    return null;
                } catch (Throwable th3) {
                    ExceptionProcessor.processException(th3);
                    return null;
                }
            }
        }
    }

    public static String O00000o0(String str, String str2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(O00000Oo);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            byte[] doFinal = cipher.doFinal(O0000Oo.O000000o(str));
            if (doFinal != null) {
                return new String(doFinal);
            }
            O000000o.O000000o(O000000o, "Aes decrypt result is empty");
            return "";
        } catch (Throwable th) {
            try {
                O000000o.O000000o(O000000o, "decryptAesNew error", th);
                return "";
            } catch (Throwable th2) {
                try {
                    ExceptionProcessor.processException(th2);
                    return null;
                } catch (Throwable th3) {
                    ExceptionProcessor.processException(th3);
                    return null;
                }
            }
        }
    }
}
