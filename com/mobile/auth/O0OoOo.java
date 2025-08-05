package com.mobile.auth;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.cmic.sso.sdk.a;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class O0OoOo {
    private static final boolean O00000o;
    private static final String O000000o = Build.BRAND;
    private static final String O00000Oo = Build.MODEL;
    private static final String O00000o0 = "android" + Build.VERSION.RELEASE;

    static {
        O00000o = Build.VERSION.SDK_INT <= 28;
    }

    public static int O000000o(Context context, boolean z, a aVar) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        try {
            connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            networkInfo = null;
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (networkInfo != null && networkInfo.isAvailable()) {
            int type = networkInfo.getType();
            if (type != 1) {
                if (type == 0) {
                    O0O000o.O00000Oo("TelephonyUtils", "流量");
                    return 1;
                }
                return 0;
            }
            O0O000o.O00000Oo("TelephonyUtils", "WIFI");
            boolean O000000o2 = O0O0O.O000000o(context, "android.permission.CHANGE_NETWORK_STATE");
            O0O000o.O000000o("TelephonyUtils", "CHANGE_NETWORK_STATE=" + O000000o2);
            if (!O000000o2 || !z || !O000000o(connectivityManager, context, aVar)) {
                return 2;
            }
            O0O000o.O00000Oo("TelephonyUtils", "流量数据 WIFI 同开");
            return 3;
        }
        return 0;
    }

    public static String O000000o() {
        return O000000o;
    }

    public static boolean O000000o(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager == null || 1 != telephonyManager.getSimState();
    }

    private static boolean O000000o(ConnectivityManager connectivityManager, Context context, a aVar) {
        String str;
        boolean z = false;
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            z = ((Boolean) declaredMethod.invoke(connectivityManager, new Object[0])).booleanValue();
            O0O000o.O00000Oo("TelephonyUtils", "data is on ---------" + z);
            if (Build.VERSION.SDK_INT >= 26) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null && O0O0O.O000000o(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    str = telephonyManager.createForSubscriptionId(SubscriptionManager.getDefaultSubscriptionId()).isDataEnabled() ? "1" : "0";
                }
                return z;
            }
            str = "-1";
            aVar.a("networkTypeByAPI", str);
            return z;
        } catch (Exception unused) {
            O0O000o.O000000o("TelephonyUtils", "isMobileEnabled ----反射出错-----");
            return z;
        }
    }

    public static String O00000Oo() {
        return O00000Oo;
    }

    public static boolean O00000o() {
        return O00000o;
    }

    public static String O00000o0() {
        return O00000o0;
    }

    public static boolean O00000oO() {
        String str = O000000o;
        O0O000o.O000000o("brand", str);
        return "HUAWEI".equalsIgnoreCase(str);
    }

    public static boolean O00000oo() {
        String str = O000000o;
        O0O000o.O000000o("brand", str);
        return "HONOR".equalsIgnoreCase(str);
    }
}
