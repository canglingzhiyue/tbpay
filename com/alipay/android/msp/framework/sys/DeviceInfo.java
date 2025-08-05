package com.alipay.android.msp.framework.sys;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import tb.nom;

/* loaded from: classes3.dex */
public class DeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static DeviceInfo e;
    private static NetConnectionType f = NetConnectionType.NETWORK_TYPE_16;
    private static long g = 0;

    /* renamed from: a  reason: collision with root package name */
    private String f4872a;
    private String b;
    private String c;
    private WifiManager d;

    public static String getOS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50288b7f", new Object[0]) : "android";
    }

    public static /* synthetic */ void a(DeviceInfo deviceInfo, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e04b1da2", new Object[]{deviceInfo, context});
        } else {
            deviceInfo.a(context);
        }
    }

    public static DeviceInfo getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceInfo) ipChange.ipc$dispatch("905348f4", new Object[]{context});
        }
        if (e == null) {
            synchronized (DeviceInfo.class) {
                if (e == null) {
                    e = new DeviceInfo(context);
                }
            }
        }
        return e;
    }

    private DeviceInfo(Context context) {
        try {
            this.f4872a = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionName;
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
        }
        if (TextUtils.isEmpty(this.f4872a)) {
            this.f4872a = "10.0.0";
        }
        a(context);
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            if (PhoneCashierMspEngine.getMspWallet().isBackgroundRunning(context)) {
                LogUtil.record(4, "DeviceInfo:initIMEIAndIMSI", "return context: ".concat(String.valueOf(context)));
                return;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null && Build.VERSION.SDK_INT < 29 && ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0 && !TextUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_disable_imei_10556"), nom.VALUE_YES)) {
                b(ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId(telephonyManager));
            }
            boolean isSimImsi = isSimImsi();
            boolean isSimNoImsi = isSimNoImsi();
            if (isSimImsi) {
                a("460011234567890");
            } else if (isSimNoImsi) {
                a("000000000000000");
            } else if (telephonyManager == null || Build.VERSION.SDK_INT >= 29 || ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
            } else {
                if (TextUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_disable_imsi_10556"), nom.VALUE_YES)) {
                    a("000000000000000");
                } else {
                    a(ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getSubscriberId(telephonyManager));
                }
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public String getMacAddress(Context context) {
        String str = "00:00:00:00:00:00";
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c4c5fa", new Object[]{this, context});
        }
        String str2 = "";
        try {
            if (PhoneCashierMspEngine.getMspWallet().isBackgroundRunning(context)) {
                LogUtil.record(4, "DeviceInfo:setMacAddress", "return context: ".concat(String.valueOf(context)));
                return "02:00:00:00:00:00";
            } else if (Build.VERSION.SDK_INT >= 23) {
                if (!TextUtils.isEmpty(str2)) {
                    str = str2;
                }
                str.replaceAll(";", ":");
                return "02:00:00:00:00:00";
            } else if (TextUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_disable_mac_addr_10556"), nom.VALUE_YES)) {
                if (!TextUtils.isEmpty(str2)) {
                    str = str2;
                }
                str.replaceAll(";", ":");
                return "02:00:00:00:00:00";
            } else {
                if (this.d == null && context != null) {
                    this.d = PhoneCashierMspEngine.getMspWallet().getWifiManager(context);
                }
                WifiManager wifiManager = this.d;
                if (wifiManager != null) {
                    str2 = wifiManager.getConnectionInfo().getMacAddress();
                }
                if (!TextUtils.isEmpty(str2)) {
                    str2 = str2.toLowerCase();
                    char[] charArray = str2.toCharArray();
                    int length = charArray.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            char c = charArray[i];
                            if (c != ':' && ((c < '0' || c > '9') && (c < 'a' || c > 'z'))) {
                                break;
                            }
                            i++;
                        } else {
                            z = false;
                            break;
                        }
                    }
                }
                String str3 = z ? "00:00:00:00" : str2;
                if (TextUtils.isEmpty(str3)) {
                    str3 = str;
                }
                return str3.replaceAll(";", ":");
            }
        } catch (Throwable th) {
            try {
                LogUtil.printExceptionStackTrace(th);
                if (!TextUtils.isEmpty(str2)) {
                    str = str2;
                }
                return str.replaceAll(";", ":");
            } finally {
                if (!TextUtils.isEmpty(str2)) {
                    str = str2;
                }
                str.replaceAll(";", ":");
            }
        }
    }

    public String getIMSI(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bee4406f", new Object[]{this, context});
        }
        if (TextUtils.isEmpty(this.b) && !PhoneCashierMspEngine.getMspWallet().isBackgroundRunning(context)) {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.sys.DeviceInfo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        DeviceInfo.a(DeviceInfo.this, context);
                    }
                }
            });
        }
        if (TextUtils.isEmpty(this.b)) {
            this.b = "000000000000000";
        }
        return this.b;
    }

    public String getIMEI(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95cf663d", new Object[]{this, context});
        }
        if (TextUtils.isEmpty(this.c) && Build.VERSION.SDK_INT < 29 && !PhoneCashierMspEngine.getMspWallet().isBackgroundRunning(context)) {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.sys.DeviceInfo.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        DeviceInfo.a(DeviceInfo.this, context);
                    }
                }
            });
        }
        if (TextUtils.isEmpty(this.c)) {
            this.c = "000000000000000";
        }
        return this.c;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (str != null) {
            str = (str + "000000000000000").substring(0, 15);
        }
        if (!TextUtils.isEmpty(this.b)) {
            return;
        }
        this.b = str;
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        if (str != null) {
            byte[] bytes = str.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                if (bytes[i] < 48 || bytes[i] > 57) {
                    bytes[i] = 48;
                }
            }
            String str2 = new String(bytes);
            str = (str2 + "000000000000000").substring(0, 15);
        }
        if (!TextUtils.isEmpty(this.c)) {
            return;
        }
        this.c = str;
    }

    public static NetConnectionType getNetConnectionType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetConnectionType) ipChange.ipc$dispatch("8228a419", new Object[0]);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - g < 15000) {
            return f;
        }
        g = currentTimeMillis;
        ConnectivityManager connectivityManager = (ConnectivityManager) MspContextUtil.getContext().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        }
        if (networkInfo != null && networkInfo.getType() == 0) {
            f = NetConnectionType.getTypeByCode(networkInfo.getSubtype());
        } else if (networkInfo != null && networkInfo.getType() == 1) {
            f = NetConnectionType.WIFI;
        } else {
            f = NetConnectionType.NETWORK_TYPE_16;
        }
        return f;
    }

    public static String getWifiSSID(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3351f8a5", new Object[]{context});
        }
        if (context == null || PhoneCashierMspEngine.getMspWallet().isBackgroundRunning(context)) {
            LogUtil.record(4, "DeviceInfo:getWifiSSID", "getWifiSSID null by ctx + ".concat(String.valueOf(context)));
            return "00";
        } else if (TextUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_disable_ssid_10556"), nom.VALUE_YES)) {
            return "00";
        } else {
            try {
                WifiManager wifiManager = PhoneCashierMspEngine.getMspWallet().getWifiManager(context);
                WifiInfo wifiInfo = null;
                if (wifiManager != null) {
                    wifiInfo = wifiManager.getConnectionInfo();
                }
                return wifiInfo != null ? wifiInfo.getSSID() : "00";
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return "00";
            }
        }
    }

    public static boolean isInAlipayWallet(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb6da5f3", new Object[]{context})).booleanValue() : isInAlipayWallet(context.getApplicationContext().getPackageName());
    }

    public static boolean isInAlipayWallet(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79181d87", new Object[]{str})).booleanValue() : TextUtils.equals("com.eg.android.AlipayGphone", str) || TextUtils.equals("com.eg.android.AlipayGphoneRC", str);
    }

    public static boolean isInTaobao(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d4e760d2", new Object[]{str})).booleanValue() : TextUtils.equals("com.taobao.taobao", str);
    }

    public static boolean hasAlipayWallet(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d271c3a8", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            packageManager.getPackageGids("com.eg.android.AlipayGphone");
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            LogUtil.printExceptionStackTrace(e2);
            try {
                packageManager.getPackageGids("com.eg.android.AlipayGphoneRC");
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
    }

    public static boolean isSupportCertPay(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("229388a6", new Object[]{context})).booleanValue();
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.eg.android.AlipayGphone", 128);
            if (packageInfo == null) {
                return false;
            }
            String a2 = a(b(context));
            if (a2 != null && !TextUtils.equals(a2, "b6cbad6cbd5ed0d209afc69ad3b7a617efaae9b3c47eabe0be42d924936fa78c8001b1fd74b079e5ff9690061dacfa4768e981a526b9ca77156ca36251cf2f906d105481374998a7e6e6e18f75ca98b8ed2eaf86ff402c874cca0a263053f22237858206867d210020daa38c48b20cc9dfd82b44a51aeb5db459b22794e2d649")) {
                return false;
            }
            return packageInfo.versionCode >= 96;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    private static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        try {
            String obj = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey().toString();
            if (!obj.contains("modulus")) {
                return null;
            }
            return obj.substring(obj.indexOf("modulus") + 8, obj.lastIndexOf(",")).trim();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }

    private static byte[] b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3a77f0be", new Object[]{context});
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.eg.android.AlipayGphone", 64);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.signatures[0].toByteArray();
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
            return null;
        }
    }

    public static boolean canUseHardwareAcceleration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21f07dca", new Object[0])).booleanValue();
        }
        boolean z = true;
        if (Build.VERSION.SDK_INT == 16 && (Build.MODEL.contains("LG-F160") || Build.MODEL.contains("LG-F200") || Build.MODEL.contains("Z560e"))) {
            z = false;
        }
        if (Build.VERSION.SDK_INT == 15 && Build.MODEL.contains("K860")) {
            z = false;
        }
        if (Build.VERSION.SDK_INT == 16 && Build.MODEL.contains("HTC One")) {
            return false;
        }
        return z;
    }

    public static String getOsInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cad59051", new Object[0]);
        }
        return "android " + Build.VERSION.RELEASE;
    }

    public static boolean isProcessExit(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f20d9ac", new Object[]{context, str})).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT < 21) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                        if (TextUtils.equals(str, String.valueOf(runningAppProcessInfo.pid))) {
                            return true;
                        }
                    }
                }
            } else {
                File[] listFiles = new File("/proc").listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    for (File file : listFiles) {
                        if (file.isDirectory()) {
                            try {
                                if (TextUtils.equals(str, String.valueOf(Integer.parseInt(file.getName())))) {
                                    return true;
                                }
                            } catch (NumberFormatException e2) {
                                LogUtil.printExceptionStackTrace(e2);
                            }
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    public static String getOSVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3514bdfb", new Object[0]) : TextUtils.isEmpty(Build.VERSION.RELEASE) ? "unknow" : Build.VERSION.RELEASE;
    }

    public static String getModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a78b0366", new Object[0]) : TextUtils.isEmpty(Build.MODEL) ? "unknow" : Build.MODEL.replace(";", " ");
    }

    public static String getRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb1a0ca1", new Object[0]);
        }
        String[] strArr = {"/system/xbin/", "/system/bin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        for (int i = 0; i < 5; i++) {
            try {
                String str = strArr[i] + "su";
                if (new File(str).exists()) {
                    String a2 = a(new String[]{RVStartParams.KEY_LANDSCAPE_SHORT, "-l", str});
                    if (!TextUtils.isEmpty(a2)) {
                        if (a2.indexOf("root") != a2.lastIndexOf("root")) {
                            return "1";
                        }
                    }
                    return "0";
                }
            } catch (Exception e2) {
                LogUtil.printExceptionStackTrace(e2);
            }
        }
        return "0";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r1 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
        if (r1 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
        r1.destroy();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a(java.lang.String[] r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.framework.sys.DeviceInfo.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            java.lang.String r4 = "a51c09c9"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L15:
            java.lang.String r0 = ""
            r1 = 0
            java.lang.ProcessBuilder r3 = new java.lang.ProcessBuilder     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r3.redirectErrorStream(r2)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.lang.Process r1 = r3.start()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.io.OutputStream r2 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.io.InputStream r3 = r1.getInputStream()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.lang.String r2 = "exit\n"
            r4.writeBytes(r2)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r4.flush()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r1.waitFor()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            if (r1 == 0) goto L54
        L47:
            r1.destroy()     // Catch: java.lang.Exception -> L54
            goto L54
        L4b:
            r4 = move-exception
            goto L55
        L4d:
            r4 = move-exception
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r4)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L54
            goto L47
        L54:
            return r0
        L55:
            if (r1 == 0) goto L5a
            r1.destroy()     // Catch: java.lang.Exception -> L5a
        L5a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.sys.DeviceInfo.a(java.lang.String[]):java.lang.String");
    }

    public static String getLocal(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("553d2e94", new Object[]{context});
        }
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getSIM(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b881580", new Object[]{context});
        }
        if (context == null || PhoneCashierMspEngine.getMspWallet().isBackgroundRunning(context)) {
            LogUtil.record(4, "DeviceInfo:getSIM", "getSIM null ctx:".concat(String.valueOf(context)));
            return "-1";
        } else if (Build.VERSION.SDK_INT >= 29) {
            return "-1";
        } else {
            String str = null;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null && ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                    if (TextUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_disable_imsi_10556"), nom.VALUE_YES)) {
                        return "-1";
                    }
                    str = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getSubscriberId(telephonyManager);
                }
            } catch (Exception unused) {
            }
            return str != null ? (str.startsWith("46000") || str.startsWith("46002")) ? "0" : str.startsWith("46001") ? "1" : str.startsWith("46003") ? "2" : "-1" : "-1";
        }
    }

    public static String getAPN() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("902da3b0", new Object[0]);
        }
        try {
            return getNetConnectionType().getName().toLowerCase();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return "-";
        }
    }

    public static boolean isM836Device() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("94b4d759", new Object[0])).booleanValue() : Build.MODEL != null && Build.MODEL.contains("M836");
    }

    public static String getUid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea2ce1f", new Object[0]);
        }
        try {
            return String.valueOf(Process.myUid());
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return "e";
        }
    }

    public boolean isSimImsi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d14b1072", new Object[]{this})).booleanValue();
        }
        Context context = GlobalHelper.getInstance().getContext();
        if (context != null) {
            return context.getSharedPreferences(GlobalConstant.GLOBAL_SETTINGS, 0).getBoolean("is_sim_imsi", false);
        }
        return false;
    }

    public boolean isSimNoImsi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dabc4a13", new Object[]{this})).booleanValue();
        }
        Context context = GlobalHelper.getInstance().getContext();
        if (context != null) {
            return context.getSharedPreferences(GlobalConstant.GLOBAL_SETTINGS, 0).getBoolean("is_sim_no_imsi", false);
        }
        return false;
    }
}
