package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import tb.jhy;

/* loaded from: classes4.dex */
public class O0000Oo0 {
    private static final String O000000o = "O0000Oo0";
    private static String O00000Oo = "RSA/ECB/PKCS1Padding";

    public static String O000000o(String str, RSAPublicKey rSAPublicKey) {
        try {
            byte[] O000000o2 = O000000o(rSAPublicKey, str.getBytes());
            return O000000o2 != null ? O0000Oo.O000000o(O000000o2) : "";
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static PublicKey O000000o(String str) throws Throwable {
        try {
            return KeyFactory.getInstance(jhy.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(O0000O0o.O000000o(str)));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static RSAPublicKey O000000o() {
        try {
            return (RSAPublicKey) O000000o("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC5se07mkN71qsSJHjZ2Z0+Z+4LlLvf2sz7Md38VAa3EmAOvI7vZp3hbAxicL724ylcmisTPtZQhT/9C+25AELqy9PN9JmzKpwoVTUoJvxG4BoyT49+gGVl6s6zo1byNoHUzTfkmRfmC9MC53HvG8GwKP5xtcdptFjAIcgIR7oAWQIDAQAB");
        } catch (Throwable th) {
            try {
                O000000o.O000000o(O000000o, "getPublicKey error", th);
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

    public static byte[] O000000o(RSAPublicKey rSAPublicKey, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance(O00000Oo);
            cipher.init(1, rSAPublicKey);
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            try {
                O000000o.O000000o(O000000o, "Rsa encrypt4Ux error", th);
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
}
