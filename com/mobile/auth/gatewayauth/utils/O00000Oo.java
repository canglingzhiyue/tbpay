package com.mobile.auth.gatewayauth.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.mobile.auth.OoO0o;
import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import tb.czq;

/* loaded from: classes4.dex */
public class O00000Oo {
    private static String O000000o = "";
    private static volatile String O00000Oo;
    private static volatile long O00000o0;

    public static int O000000o(Context context) {
        try {
            return OoO0o.O000000o(context, 4);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
        if (r1 == 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r1 == 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
        return 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int O000000o(java.lang.String r6) {
        /*
            r0 = 4
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = -1
            int r2 = r6.hashCode()     // Catch: java.lang.Throwable -> L43
            r3 = -1350608857(0xffffffffaf7f5827, float:-2.3223433E-10)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L2f
            r3 = 95009260(0x5a9b9ec, float:1.596098E-35)
            if (r2 == r3) goto L25
            r3 = 880617272(0x347d2738, float:2.3576729E-7)
            if (r2 == r3) goto L1b
            goto L38
        L1b:
            java.lang.String r2 = "cm_zyhl"
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Throwable -> L43
            if (r6 == 0) goto L38
            r1 = 0
            goto L38
        L25:
            java.lang.String r2 = "cu_xw"
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Throwable -> L43
            if (r6 == 0) goto L38
            r1 = 1
            goto L38
        L2f:
            java.lang.String r2 = "ct_sjl"
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Throwable -> L43
            if (r6 == 0) goto L38
            r1 = 2
        L38:
            if (r1 == 0) goto L42
            if (r1 == r5) goto L41
            if (r1 == r4) goto L3f
            return r0
        L3f:
            r6 = 3
            return r6
        L41:
            return r4
        L42:
            return r5
        L43:
            r6 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r6)     // Catch: java.lang.Throwable -> L48
            return r1
        L48:
            r6 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.utils.O00000Oo.O000000o(java.lang.String):int");
    }

    public static String O000000o() {
        try {
            return O000000o;
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

    public static String O000000o(Context context, boolean z) {
        try {
            if (System.currentTimeMillis() - O00000o0 > 500 || O00000Oo == null || !z) {
                O00000Oo = O0000OoO(context);
                O00000o0 = System.currentTimeMillis();
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

    public static String O00000Oo() {
        try {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if (!nextElement.getDisplayName().contains("wlan") && !nextElement.getDisplayName().equals("eth0")) {
                        Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress nextElement2 = inetAddresses.nextElement();
                            if (!nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address)) {
                                return nextElement2.getHostAddress();
                            }
                        }
                        continue;
                    }
                }
                return "";
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        } catch (Exception e) {
            O0000Oo0.O000000o(e);
            return "";
        }
    }

    public static String O00000Oo(Context context) {
        try {
            int O000000o2 = O000000o(context);
            return O000000o2 == 4 ? "unknown" : O000000o2 != 1 ? O000000o2 != 2 ? O000000o2 != 3 ? "unknown" : Constant.VENDOR_CTCC : Constant.VENDOR_CUCC : Constant.VENDOR_CMCC;
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

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        if (r1 == 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r1 == 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
        return "unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
        return com.mobile.auth.gatewayauth.Constant.CTCC;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
        return com.mobile.auth.gatewayauth.Constant.CUCC;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String O00000Oo(java.lang.String r6) {
        /*
            java.lang.String r0 = "unknown"
            if (r6 != 0) goto L6
            return r0
        L6:
            r1 = -1
            int r2 = r6.hashCode()     // Catch: java.lang.Throwable -> L4a
            r3 = -1350608857(0xffffffffaf7f5827, float:-2.3223433E-10)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L31
            r3 = 95009260(0x5a9b9ec, float:1.596098E-35)
            if (r2 == r3) goto L27
            r3 = 880617272(0x347d2738, float:2.3576729E-7)
            if (r2 == r3) goto L1d
            goto L3a
        L1d:
            java.lang.String r2 = "cm_zyhl"
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Throwable -> L4a
            if (r6 == 0) goto L3a
            r1 = 0
            goto L3a
        L27:
            java.lang.String r2 = "cu_xw"
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Throwable -> L4a
            if (r6 == 0) goto L3a
            r1 = 1
            goto L3a
        L31:
            java.lang.String r2 = "ct_sjl"
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Throwable -> L4a
            if (r6 == 0) goto L3a
            r1 = 2
        L3a:
            if (r1 == 0) goto L47
            if (r1 == r5) goto L44
            if (r1 == r4) goto L41
            return r0
        L41:
            java.lang.String r6 = "CTCC"
            return r6
        L44:
            java.lang.String r6 = "CUCC"
            return r6
        L47:
            java.lang.String r6 = "CMCC"
            return r6
        L4a:
            r6 = move-exception
            r0 = 0
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r6)     // Catch: java.lang.Throwable -> L50
            return r0
        L50:
            r6 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.utils.O00000Oo.O00000Oo(java.lang.String):java.lang.String");
    }

    public static boolean O00000o(Context context) {
        NetworkInfo activeNetworkInfo;
        NetworkInfo networkInfo;
        NetworkInfo networkInfo2;
        NetworkInfo.State state;
        NetworkInfo.State state2;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable() && (((networkInfo = connectivityManager.getNetworkInfo(1)) == null || (state2 = networkInfo.getState()) == null || (state2 != NetworkInfo.State.CONNECTED && state2 != NetworkInfo.State.CONNECTING)) && (networkInfo2 = connectivityManager.getNetworkInfo(0)) != null && (state = networkInfo2.getState()) != null)) {
                if (state != NetworkInfo.State.CONNECTED) {
                    if (state == NetworkInfo.State.CONNECTING) {
                    }
                }
                return false;
            }
            return true;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public static String O00000o0(Context context) {
        try {
            int O000000o2 = O000000o(context);
            return O000000o2 == 4 ? "unknown" : O000000o2 != 1 ? O000000o2 != 2 ? O000000o2 != 3 ? "unknown" : Constant.CTCC : Constant.CUCC : Constant.CMCC;
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

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        if (r1 == 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r1 == 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
        return "unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
        return "46003";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
        return "46001";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String O00000o0(java.lang.String r6) {
        /*
            java.lang.String r0 = "unknown"
            if (r6 != 0) goto L6
            return r0
        L6:
            r1 = -1
            int r2 = r6.hashCode()     // Catch: java.lang.Throwable -> L4a
            r3 = -1350608857(0xffffffffaf7f5827, float:-2.3223433E-10)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L31
            r3 = 95009260(0x5a9b9ec, float:1.596098E-35)
            if (r2 == r3) goto L27
            r3 = 880617272(0x347d2738, float:2.3576729E-7)
            if (r2 == r3) goto L1d
            goto L3a
        L1d:
            java.lang.String r2 = "cm_zyhl"
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Throwable -> L4a
            if (r6 == 0) goto L3a
            r1 = 0
            goto L3a
        L27:
            java.lang.String r2 = "cu_xw"
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Throwable -> L4a
            if (r6 == 0) goto L3a
            r1 = 1
            goto L3a
        L31:
            java.lang.String r2 = "ct_sjl"
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Throwable -> L4a
            if (r6 == 0) goto L3a
            r1 = 2
        L3a:
            if (r1 == 0) goto L47
            if (r1 == r5) goto L44
            if (r1 == r4) goto L41
            return r0
        L41:
            java.lang.String r6 = "46003"
            return r6
        L44:
            java.lang.String r6 = "46001"
            return r6
        L47:
            java.lang.String r6 = "46000"
            return r6
        L4a:
            r6 = move-exception
            r0 = 0
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r6)     // Catch: java.lang.Throwable -> L50
            return r0
        L50:
            r6 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.utils.O00000Oo.O00000o0(java.lang.String):java.lang.String");
    }

    public static boolean O00000oO(Context context) {
        try {
            if (O0000Oo(context)) {
                return false;
            }
            if (O0000Oo0(context)) {
                return true;
            }
            try {
                Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((Boolean) declaredMethod.invoke((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity"), new Object[0])).booleanValue();
            } catch (Exception e) {
                O0000Oo0.O000000o(e);
                return true;
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public static boolean O00000oo(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSimState() == 5;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public static void O0000O0o(Context context) {
        try {
            O000000o = O0000OOo(context);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[Catch: Throwable -> 0x0063, Exception -> 0x0065, TryCatch #2 {Exception -> 0x0065, blocks: (B:2:0x0000, B:3:0x0004, B:5:0x000a, B:7:0x0016, B:9:0x001c, B:16:0x0044, B:17:0x0048, B:19:0x004e, B:21:0x005a, B:23:0x005e, B:12:0x002e, B:14:0x0034), top: B:39:0x0000, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String O0000OOo(android.content.Context r4) {
        /*
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
        L4:
            boolean r1 = r0.hasMoreElements()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r1 == 0) goto L69
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            boolean r2 = O00000o(r4)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r2 == 0) goto L2e
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r2 == 0) goto L44
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            java.lang.String r2 = r2.toLowerCase()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            java.lang.String r3 = "wlan"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r2 != 0) goto L44
            goto L4
        L2e:
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r2 == 0) goto L44
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            java.lang.String r2 = r2.toLowerCase()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            java.lang.String r3 = "rmnet"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r2 == 0) goto L4
        L44:
            java.util.Enumeration r1 = r1.getInetAddresses()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
        L48:
            boolean r2 = r1.hasMoreElements()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r2 == 0) goto L4
            java.lang.Object r2 = r1.nextElement()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            java.net.InetAddress r2 = (java.net.InetAddress) r2     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            boolean r3 = r2.isLoopbackAddress()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r3 != 0) goto L48
            boolean r3 = r2 instanceof java.net.Inet4Address     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r3 == 0) goto L48
            java.lang.String r4 = r2.getHostAddress()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            return r4
        L63:
            r4 = move-exception
            goto L6c
        L65:
            r4 = move-exception
            com.mobile.auth.gatewayauth.utils.O0000Oo0.O000000o(r4)     // Catch: java.lang.Throwable -> L63
        L69:
            java.lang.String r4 = ""
            return r4
        L6c:
            r0 = 0
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r4)     // Catch: java.lang.Throwable -> L71
            return r0
        L71:
            r4 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.utils.O00000Oo.O0000OOo(android.content.Context):java.lang.String");
    }

    public static boolean O0000Oo(Context context) {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 17 ? Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1 : Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1) {
                z = true;
            }
        } catch (Throwable th) {
            try {
                O0000Oo0.O000000o(th);
            } catch (Throwable th2) {
                try {
                    ExceptionProcessor.processException(th2);
                    return z;
                } catch (Throwable th3) {
                    ExceptionProcessor.processException(th3);
                    return z;
                }
            }
        }
        return z;
    }

    public static boolean O0000Oo0(Context context) {
        if (context != null) {
            try {
                NetworkInfo networkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getNetworkInfo(0);
                if (networkInfo != null && networkInfo.isAvailable()) {
                    if (networkInfo.isConnected()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return false;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
        return false;
    }

    private static String O0000OoO(Context context) {
        NetworkInfo networkInfo;
        String O0000Ooo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            if (czq.a(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                return czq.a(context, "android.permission.ACCESS_NETWORK_STATE") == 10 ? "NoClass" : "NoInternet";
            }
            if (Build.VERSION.SDK_INT >= 23) {
                Network activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork != null) {
                    networkInfo = connectivityManager.getNetworkInfo(activeNetwork);
                }
                networkInfo = null;
            } else {
                NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
                if (allNetworkInfo != null) {
                    for (NetworkInfo networkInfo2 : allNetworkInfo) {
                        if (networkInfo2 != null && networkInfo2.isAvailable() && networkInfo2.isConnected()) {
                            networkInfo = networkInfo2;
                            break;
                        }
                    }
                }
                networkInfo = null;
            }
            if (networkInfo == null || !networkInfo.isConnected()) {
                return "NoInternet";
            }
            String typeName = networkInfo.getTypeName();
            if ("WIFI".equalsIgnoreCase(typeName)) {
                if (!O00000oO(context)) {
                    return "wifi";
                }
                O0000Ooo = "wifi+mobile";
            } else if (!"MOBILE".equalsIgnoreCase(typeName)) {
                return "NoInternet";
            } else {
                O0000Ooo = TextUtils.isEmpty(Proxy.getDefaultHost()) ? O0000Ooo(context) : "wap";
            }
            return O0000Ooo;
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

    private static String O0000Ooo(Context context) {
        try {
            if (czq.a(context.getApplicationContext(), "android.permission.READ_PHONE_STATE") != 0) {
                return "unknow";
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
            int dataNetworkType = Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType(telephonyManager);
            if (dataNetworkType == 20) {
                return "5g";
            }
            switch (dataNetworkType) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return "2g";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    return "3g";
                case 13:
                    return "4g";
                default:
                    return "unknow";
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
}
