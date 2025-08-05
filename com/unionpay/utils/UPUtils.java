package com.unionpay.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.security.MessageDigest;

/* loaded from: classes9.dex */
public class UPUtils {
    public static String a(int i) {
        try {
            return a(forUrl(i, Build.VERSION.SDK_INT >= 23));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String a(int i, String str) {
        try {
            return a(forConfig(i, str));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String a(Context context, String str) {
        if (context != null) {
            String string = context.getSharedPreferences("UnionPayPluginEx.pref", 0).getString(str, "");
            String b = b(string, ("0000000023456789abcdef12123456786789abcd").substring(0, 32));
            return (b != null && b.endsWith("00000000")) ? b.substring(0, b.length() - 8) : "";
        }
        return null;
    }

    public static String a(String str) {
        try {
            byte[] bytes = str.getBytes();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(bytes);
            return a.a(messageDigest.digest());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String a(String str, String str2) {
        try {
            return a.a(d.a(a.a(str2), str.getBytes("utf-8")));
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String a(byte[] bArr) {
        if (bArr != null) {
            try {
                return new String(bArr, "utf-8");
            } catch (Throwable unused) {
                j.c("uppay", "convert byteMsg to utf-8 String error!!!!");
                return "";
            }
        }
        return "";
    }

    public static void a(Context context, String str, String str2) {
        if (context != null) {
            String substring = ("0000000023456789abcdef12123456786789abcd").substring(0, 32);
            String a2 = a(str + "00000000", substring);
            if (a2 == null) {
                a2 = "";
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("UnionPayPluginEx.pref", 0).edit();
            edit.putString(str2, a2);
            edit.commit();
        }
    }

    public static String b(int i) {
        try {
            return a(forCallingAppUrl(i, Build.VERSION.SDK_INT >= 23));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String b(int i, String str) {
        try {
            return a(forWap(i, str));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static String b(String str, String str2) {
        try {
            return new String(d.b(a.a(str2), a.a(str)), "utf-8").trim();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void b(Context context, String str) {
        if (context != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences("UnionPayPluginEx.pref", 0).edit();
            edit.remove(str);
            edit.commit();
        }
    }

    public static String c(int i) {
        try {
            return a(forDirectAppsUrl(i, Build.VERSION.SDK_INT >= 23));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static native synchronized byte[] forCallingAppUrl(int i, boolean z);

    public static native synchronized byte[] forConfig(int i, String str);

    public static native synchronized byte[] forDirectAppsUrl(int i, boolean z);

    public static native synchronized byte[] forScanUrl(int i, boolean z);

    public static native synchronized byte[] forUrl(int i, boolean z);

    public static native synchronized byte[] forWap(int i, String str);

    public static native synchronized String getIssuer(int i);

    public static native synchronized String getSubject(int i);

    public static native synchronized String getTalkingDataIdForAssist(int i);
}
