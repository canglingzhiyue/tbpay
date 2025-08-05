package com.mobile.auth.gatewayauth.utils.security;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class PackageUtils {
    private static String O000000o;
    private static String O00000Oo;
    private static String O00000o;
    private static String O00000o0;
    private static final char[] O00000oO = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static synchronized String getPackageName(Context context) {
        String str;
        synchronized (PackageUtils.class) {
            try {
                setupAppInfo(context);
                str = O000000o;
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
        return str;
    }

    public static synchronized String getSign(Context context) {
        String str;
        synchronized (PackageUtils.class) {
            try {
                if (O00000o == null) {
                    O00000o = hexdigest(context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures[0].toByteArray());
                }
                str = O00000o;
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }
        return str;
    }

    public static synchronized String getVersionName(Context context) {
        String str;
        synchronized (PackageUtils.class) {
            try {
                setupAppInfo(context);
                str = O00000o0;
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
        return str;
    }

    public static String hexdigest(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr = new char[32];
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                byte b = digest[i2];
                int i3 = i + 1;
                cArr[i] = O00000oO[(b >>> 4) & 15];
                i = i3 + 1;
                cArr[i3] = O00000oO[b & 15];
            }
            return new String(cArr);
        } catch (Exception unused) {
            return null;
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

    private static void setupAppInfo(Context context) {
        try {
            if (O000000o != null && O00000o0 != null) {
                return;
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                O00000o0 = packageInfo.versionName;
                O000000o = packageInfo.packageName;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
