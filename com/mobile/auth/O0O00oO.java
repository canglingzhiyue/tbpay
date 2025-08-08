package com.mobile.auth;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.ali.user.mobile.rpc.safe.AES;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Calendar;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.security.auth.x500.X500Principal;
import tb.jhy;

/* loaded from: classes4.dex */
public class O0O00oO {
    private static byte[] O000000o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String O000000o(Context context, String str) {
        O000000o();
        byte[] O00000Oo = O00000Oo(context);
        if (O00000Oo != null) {
            return ooooooo.O000000o(O00000Oo, str, O000000o);
        }
        O000000o();
        return null;
    }

    public static void O000000o() {
        O0O0o00.O000000o("AES_KEY");
    }

    private static boolean O000000o(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", AES.ANDROID_KEYSTORE);
                keyGenerator.init(new KeyGenParameterSpec.Builder("CMCC_SDK_V1", 3).setDigests("SHA-256", "SHA-512").setBlockModes(AES.BLOCK_MODE).setEncryptionPaddings(AES.PADDING).setRandomizedEncryptionRequired(false).setKeySize(256).build());
                Thread.sleep(1000L);
                keyGenerator.generateKey();
                return true;
            }
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 30);
            if (Build.VERSION.SDK_INT < 18) {
                return false;
            }
            KeyPairGeneratorSpec build = new KeyPairGeneratorSpec.Builder(context).setAlias("CMCC_SDK_V1").setSubject(new X500Principal("CN=CMCC_SDK_V1")).setSerialNumber(BigInteger.TEN).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(jhy.KEY_ALGORITHM, AES.ANDROID_KEYSTORE);
            keyPairGenerator.initialize(build);
            Thread.sleep(1000L);
            keyPairGenerator.generateKeyPair();
            return true;
        } catch (Exception e) {
            O0O000o.O000000o("KeystoreUtil", e.getMessage());
            return false;
        }
    }

    public static boolean O000000o(Context context, boolean z) {
        try {
            KeyStore keyStore = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            keyStore.load(null);
            if (keyStore.getKey("CMCC_SDK_V1", null) != null) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (z) {
            return O000000o(context);
        }
        return false;
    }

    private static String O00000Oo() {
        return O0O0o00.O00000Oo("AES_KEY", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String O00000Oo(Context context, String str) {
        if (!StringUtils.isEmpty(str)) {
            byte[] O00000Oo = O00000Oo(context);
            if (O00000Oo != null) {
                return ooooooo.O00000Oo(O00000Oo, str, O000000o);
            }
            O000000o();
            return null;
        }
        return null;
    }

    private static synchronized byte[] O00000Oo(Context context) {
        Cipher cipher;
        String str;
        String str2;
        byte[] doFinal;
        Cipher cipher2;
        synchronized (O0O00oO.class) {
            try {
                KeyStore keyStore = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
                keyStore.load(null);
                boolean z = false;
                if (!O000000o(context, false)) {
                    return null;
                }
                String O00000Oo = O00000Oo();
                if (StringUtils.isEmpty(O00000Oo)) {
                    doFinal = O0OO0Oo.O000000o();
                    O000000o = O0OO0Oo.O000000o();
                    Key key = keyStore.getKey("CMCC_SDK_V1", null);
                    if (key instanceof SecretKey) {
                        O0O000o.O00000Oo("KeystoreUtil", "随机生成aes秘钥");
                        cipher2 = Cipher.getInstance("AES/CBC/PKCS7Padding");
                        cipher2.init(1, key, new IvParameterSpec(O000000o));
                    } else if (!(key instanceof PrivateKey)) {
                        return null;
                    } else {
                        PublicKey publicKey = keyStore.getCertificate("CMCC_SDK_V1").getPublicKey();
                        Cipher cipher3 = Cipher.getInstance("RSA/ECB/OAEPWithSHA256AndMGF1Padding");
                        O0O000o.O00000Oo("KeystoreUtil", "生成rsa密");
                        cipher3.init(1, publicKey);
                        cipher2 = cipher3;
                    }
                    String encodeToString = Base64.encodeToString(cipher2.doFinal(doFinal), 0);
                    String encodeToString2 = Base64.encodeToString(O000000o, 0);
                    HashMap hashMap = new HashMap();
                    hashMap.put("AES_IV", encodeToString2);
                    hashMap.put("AES_KEY", encodeToString);
                    O0O0o00.O000000o(hashMap);
                } else {
                    O000000o = Base64.decode(O00000o0(), 0);
                    byte[] decode = Base64.decode(O00000Oo, 0);
                    Key key2 = keyStore.getKey("CMCC_SDK_V1", null);
                    if (key2 == null) {
                        return null;
                    }
                    if (key2 instanceof SecretKey) {
                        cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                        cipher.init(2, key2, new IvParameterSpec(O000000o));
                        str = "KeystoreUtil";
                        str2 = "使用aes";
                    } else if (!(key2 instanceof PrivateKey)) {
                        return null;
                    } else {
                        cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA256AndMGF1Padding");
                        cipher.init(2, key2);
                        str = "KeystoreUtil";
                        str2 = "使用rsa";
                    }
                    O0O000o.O00000Oo(str, str2);
                    doFinal = cipher.doFinal(decode);
                    StringBuilder sb = new StringBuilder();
                    sb.append("是否解密出秘钥：");
                    if (!StringUtils.isEmpty(Base64.encodeToString(doFinal, 0))) {
                        z = true;
                    }
                    sb.append(z);
                    O0O000o.O00000Oo("KeystoreUtil", sb.toString());
                }
                return doFinal;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    private static String O00000o0() {
        return O0O0o00.O00000Oo("AES_IV", "");
    }
}
