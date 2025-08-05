package com.mobile.auth;

import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class OO0o00 {
    public static String O000000o() {
        try {
            try {
                String replace = UUID.randomUUID().toString().replace("-", "");
                return (TextUtils.isEmpty(replace) || replace.length() < 32) ? OOO.O00000o0().substring(0, 32) : replace;
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static String O000000o(String str, String str2, String str3) {
        try {
            try {
                return O00000o(str, str2, str3);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static String O00000Oo(String str, String str2, String str3) {
        try {
            try {
                return O00000o0(str, str2, str3);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    private static String O00000o(String str, String str2, String str3) {
        if (str != null) {
            try {
                if (str.length() != 0 && str.trim().length() != 0) {
                    if (str2 == null) {
                        throw new Exception("decrypt key is null");
                    }
                    if (str2.length() != 16) {
                        throw new Exception("decrypt key length error");
                    }
                    if (str3.length() != 16) {
                        throw new Exception(" iv decrypt key length error");
                    }
                    byte[] O00000Oo = OO0o0.O00000Oo(str);
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher.init(2, new SecretKeySpec(str2.getBytes("utf-8"), "AES"), new IvParameterSpec(str3.getBytes("utf-8")));
                    return new String(cipher.doFinal(O00000Oo), "utf-8");
                }
            } catch (Exception e) {
                throw new Exception("decrypt error", e);
            } catch (Throwable th) {
                ExceptionProcessor.processException(th);
                return null;
            }
        }
        return null;
    }

    private static String O00000o0(String str, String str2, String str3) {
        if (str != null) {
            try {
                if (str.length() != 0 && str.trim().length() != 0) {
                    if (str2 == null) {
                        throw new Exception("encrypt key is null");
                    }
                    if (str2.length() != 16) {
                        throw new Exception("encrypt key length error");
                    }
                    if (str3.length() != 16) {
                        throw new Exception(" iv encrypt key length error");
                    }
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher.init(1, new SecretKeySpec(str2.getBytes("utf-8"), "AES"), new IvParameterSpec(str3.getBytes("utf-8")));
                    return OO0o0.O000000o(cipher.doFinal(str.getBytes("utf-8")));
                }
            } catch (Exception e) {
                throw new Exception("Encrypt error", e);
            } catch (Throwable th) {
                ExceptionProcessor.processException(th);
                return null;
            }
        }
        return null;
    }
}
