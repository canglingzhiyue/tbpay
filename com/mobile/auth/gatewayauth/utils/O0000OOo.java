package com.mobile.auth.gatewayauth.utils;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import tb.jhy;

/* loaded from: classes4.dex */
public class O0000OOo {
    public static String O000000o(String str, String str2) throws Exception {
        try {
            PublicKey O000000o = O000000o(str2);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, O000000o);
            return com.mobile.auth.gatewayauth.utils.security.O000000o.O000000o(cipher.doFinal(str.getBytes()));
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

    public static PublicKey O000000o(String str) throws Exception {
        try {
            return KeyFactory.getInstance(jhy.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(com.mobile.auth.gatewayauth.utils.security.O000000o.O000000o(str)));
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
}
