package com.mobile.auth;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.HashSet;
import org.json.JSONObject;
import tb.riy;

/* loaded from: classes4.dex */
public final class OOOO00O {
    private static final char[] O000000o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static int O00000Oo = 1;
    private static int O00000o0 = 0;

    public static String O000000o() {
        try {
            return OOO.O00000o();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static String O000000o(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static String O000000o(Context context, String str, String str2) {
        String str3;
        try {
            try {
                return O000000o(O000000o(context, str), str2.toLowerCase());
            } catch (Exception e) {
                e.printStackTrace();
                return str3;
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static String O000000o(String str) {
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                messageDigest.update(str.getBytes());
                byte[] digest = messageDigest.digest();
                StringBuffer stringBuffer = new StringBuffer("");
                for (int i = 0; i < digest.length; i++) {
                    int i2 = digest[i];
                    if (i2 < 0) {
                        i2 += 256;
                    }
                    if (i2 < 16) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(Integer.toHexString(i2));
                }
                return stringBuffer.toString();
            } catch (NoSuchAlgorithmException e) {
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
            return OO0o00.O00000Oo(str, str2, str3);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    private static String O000000o(byte[] bArr, String str) {
        try {
            try {
                byte[] digest = MessageDigest.getInstance(str).digest(bArr);
                String str2 = "";
                for (int i = 0; i < digest.length; i++) {
                    if (i != 0) {
                        str2 = str2 + ":";
                    }
                    String hexString = Integer.toHexString(digest[i] & 255);
                    if (hexString.length() == 1) {
                        str2 = str2 + "0";
                    }
                    str2 = str2 + hexString;
                }
                return str2;
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    private static boolean O000000o(ConnectivityManager connectivityManager) {
        try {
            try {
                Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((Boolean) declaredMethod.invoke(connectivityManager, new Object[0])).booleanValue();
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    private static byte[] O000000o(Context context, String str) {
        try {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                if (!packageInfo.packageName.equals(str)) {
                    return null;
                }
                return packageInfo.signatures[0].toByteArray();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static int O00000Oo(Context context) {
        try {
            int O00000o = O00000o(context);
            OOO.O000000o(O00000o);
            return O00000o;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return -1;
        }
    }

    public static int O00000Oo(String str) {
        try {
            try {
                byte[] address = InetAddress.getByName(str).getAddress();
                return (address[0] & 255) | ((address[3] & 255) << 24) | ((address[2] & 255) << 16) | ((address[1] & 255) << 8);
            } catch (Throwable th) {
                ExceptionProcessor.processException(th);
                return -1;
            }
        } catch (UnknownHostException unused) {
            return -1;
        }
    }

    public static String O00000Oo(String str, String str2, String str3) {
        try {
            return OO0o00.O000000o(str, str2, str3);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static void O00000Oo() {
        try {
            OOO0o0.O000000o();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static int O00000o() {
        try {
            return O00000Oo;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return -1;
        }
    }

    private static int O00000o(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        try {
            try {
                connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
                OOO0o0.O00000o0("android Build.VERSION:" + Build.VERSION.SDK_INT);
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                if (activeNetworkInfo.getType() == 1) {
                    if (O000000o(connectivityManager)) {
                        OOO0o0.O00000o0("Data and WIFI");
                        return 1;
                    }
                    OOO0o0.O00000o0("Only WIFI");
                    return 2;
                }
                if (activeNetworkInfo.getType() == 0) {
                    OOO0o0.O00000o0("Only Data");
                    String extraInfo = activeNetworkInfo.getExtraInfo();
                    if (TextUtils.isEmpty(extraInfo)) {
                        return 0;
                    }
                    OOO.O00000oO(extraInfo);
                    OOO.O00000Oo(OOO.O00000oo(extraInfo));
                    return 0;
                }
                return -1;
            }
            return -1;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return -1;
        }
    }

    public static int O00000o0() {
        try {
            O00000o0 = 0;
            O00000Oo = 0;
            return 0;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return -1;
        }
    }

    public static String O00000o0(Context context) {
        try {
            return (String) context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0));
        } catch (Exception unused) {
            return "";
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static void O00000o0(String str) {
        try {
            OOO0o0.O00000Oo(str);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static int O00000oO() {
        try {
            return O00000o0;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return -1;
        }
    }

    public static int O00000oo() {
        try {
            if (O00000o0 < 0 || O00000o0 > O00000Oo) {
                return O00000Oo;
            }
            int i = O00000o0 + 1;
            O00000o0 = i;
            return i;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return -1;
        }
    }

    public static String O0000O0o() {
        int i;
        try {
            if (OOO.O00000o != null) {
                OO0OO0o oO0OO0o = OOO.O00000o;
                return OO0OO0o.O000000o();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (true) {
                    if (!networkInterfaces.hasMoreElements()) {
                        break;
                    }
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if (!nextElement.isVirtual() && nextElement.isUp()) {
                        Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress nextElement2 = inetAddresses.nextElement();
                            if (!nextElement2.isLoopbackAddress() && !nextElement2.isLinkLocalAddress() && !nextElement2.isMulticastAddress() && !nextElement2.isAnyLocalAddress()) {
                                if (nextElement2 instanceof Inet4Address) {
                                    hashSet.add(nextElement2.getHostAddress());
                                }
                                if (nextElement2 instanceof Inet6Address) {
                                    String hostAddress = nextElement2.getHostAddress();
                                    if (hostAddress.contains(riy.MOD)) {
                                        hostAddress = hostAddress.substring(0, hostAddress.indexOf(riy.MOD));
                                    }
                                    hashSet2.add(hostAddress);
                                }
                            }
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    Object[] array = hashSet.toArray();
                    int min = Math.min(array.length, 5);
                    for (int i2 = 0; i2 < min; i2++) {
                        sb.append((String) array[i2]);
                        if (i2 < min - 1) {
                            sb.append("-");
                        }
                    }
                    sb3.append("&private_ip=".concat(String.valueOf(sb)));
                    jSONObject.put("privateIp", sb.toString());
                }
                if (hashSet2.size() > 0) {
                    Object[] array2 = hashSet2.toArray();
                    int min2 = Math.min(array2.length, 5);
                    for (i = 0; i < min2; i++) {
                        sb2.append((String) array2[i]);
                        if (i < min2 - 1) {
                            sb2.append("-");
                        }
                    }
                    sb3.append("&private_ip_v6=".concat(String.valueOf(sb2)));
                    jSONObject.put("privateIp_v6", sb2.toString());
                }
                if (sb.length() != 0) {
                    return jSONObject.toString();
                }
            } catch (Exception unused) {
            }
            return "{\"privateIp\":\"0.0.0.0\"}";
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }
}
