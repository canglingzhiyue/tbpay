package com.mobile.auth;

import android.content.Context;
import android.content.SharedPreferences;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* loaded from: classes4.dex */
public class OO0Oo00 {
    private static final String O000000o = "OO0Oo00";
    private static Boolean O00000Oo = Boolean.TRUE;

    private static String O000000o() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                        return nextElement.getHostAddress();
                    }
                }
            }
        } catch (SocketException unused) {
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
        return null;
    }

    public static String O000000o(Context context, String str, String str2) {
        try {
            String O00000Oo2 = O00000Oo(context, str, str2);
            if (OOOO0.O000000o(O00000Oo2).booleanValue()) {
                return OO0o000.O000000o(context, O00000Oo2);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
        return null;
    }

    public static void O000000o(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("cuAuthCacheName", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String str : sharedPreferences.getAll().keySet()) {
                if (str.startsWith("accessCode")) {
                    edit.remove(str);
                }
            }
            edit.commit();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static boolean O000000o(Context context, String str, String str2, String str3) {
        try {
            if (OOOO0.O000000o(str3).booleanValue()) {
                String O00000Oo2 = O00000Oo(context, str, str2);
                if (OOOO0.O000000o(O00000Oo2).booleanValue()) {
                    return OO0o000.O000000o(context, O00000Oo2, str3);
                }
            }
            return false;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    private static String O00000Oo(Context context, String str, String str2) {
        try {
            String O000000o2 = OOOO00O.O000000o(context);
            String O000000o3 = O000000o();
            if (!OOOO0.O000000o(O000000o3).booleanValue()) {
                return null;
            }
            return "accessCode" + O000000o2 + O000000o3 + str + str2;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }
}
