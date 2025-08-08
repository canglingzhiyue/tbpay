package com.mobile.auth;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.security.MessageDigest;
import java.util.UUID;

/* loaded from: classes4.dex */
public class O000OO00 {
    private static final String O000000o = "com.mobile.auth.O000OO00";
    private static String O00000Oo = "";

    public static String O000000o() {
        try {
            String uuid = UUID.randomUUID().toString();
            String uuid2 = UUID.nameUUIDFromBytes((uuid + System.currentTimeMillis() + Math.random()).getBytes("utf8")).toString();
            return !StringUtils.isEmpty(uuid2) ? uuid2.replace("-", "") : uuid2;
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

    public static String O000000o(Context context) {
        try {
            if (StringUtils.isEmpty(O00000Oo)) {
                String O00000Oo2 = O00000Oo(context);
                O00000Oo = O00000Oo2;
                if (StringUtils.isEmpty(O00000Oo2)) {
                    O00000Oo = O00000o0(context);
                    O000000o(context, O00000Oo);
                }
            }
            return O00000Oo;
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

    private static String O000000o(String str) {
        try {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            try {
                byte[] bytes = str.getBytes();
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(bytes);
                byte[] digest = messageDigest.digest();
                char[] cArr2 = new char[digest.length << 1];
                int i = 0;
                for (byte b : digest) {
                    int i2 = i + 1;
                    cArr2[i] = cArr[(b >>> 4) & 15];
                    i = i2 + 1;
                    cArr2[i2] = cArr[b & 15];
                }
                return new String(cArr2);
            } catch (Exception unused) {
                return null;
            }
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

    private static void O000000o(Context context, String str) {
        try {
            if (!StringUtils.isEmpty(str) && context != null) {
                O000O0o.O000000o(context, "key_d_i_u", str);
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private static String O00000Oo(Context context) {
        try {
            return O000O0o.O00000Oo(context, "key_d_i_u", "");
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

    private static String O00000o0(Context context) {
        try {
            String uuid = UUID.randomUUID().toString();
            return StringUtils.isEmpty(uuid) ? "default" : O000000o(uuid + "default");
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                return "default";
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
