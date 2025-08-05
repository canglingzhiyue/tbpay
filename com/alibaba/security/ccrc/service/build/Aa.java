package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.client.smart.core.CoreVersion;
import com.alibaba.security.client.smart.core.model.client.AppInfo;
import com.alibaba.security.client.smart.core.model.client.ClientInfo;
import com.alibaba.security.client.smart.core.model.client.DeviceInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;

/* loaded from: classes3.dex */
public class Aa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3227a = "NONE";
    public static final String b = "WIFI";
    public static final String c = "2G";
    public static final String d = "3G";
    public static final String e = "4G";
    public static final String f = "5G";
    public static final String g = "UNKNOWN";

    public static ClientInfo a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientInfo) ipChange.ipc$dispatch("f1dea342", new Object[]{context});
        }
        ClientInfo clientInfo = new ClientInfo();
        clientInfo.appInfo = a();
        clientInfo.deviceInfo = b(context);
        return clientInfo;
    }

    public static DeviceInfo b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceInfo) ipChange.ipc$dispatch("85edb418", new Object[]{context});
        }
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.netWorkType = c(context);
        return deviceInfo;
    }

    public static String c(Context context) {
        NetworkInfo.State state;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
        }
        if (context == null) {
            return "UNKNOWN";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return "NONE";
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                    if (networkInfo != null && (state = networkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                        return "WIFI";
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            if (context.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                                i = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType(telephonyManager);
                            }
                        } else {
                            i = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType(telephonyManager);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    if (i == 20) {
                        return "5G";
                    }
                    switch (i) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return "2G";
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return "3G";
                        case 13:
                            return "4G";
                        default:
                            return "UNKNOWN";
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return "NONE";
    }

    public static AppInfo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfo) ipChange.ipc$dispatch("867b0b4", new Object[0]);
        }
        AppInfo appInfo = new AppInfo();
        appInfo.appName = CcrcContextImpl.getInstance().getAppName();
        appInfo.appVersion = CcrcContextImpl.getInstance().getAppVersion();
        appInfo.sdkVersion = "1.16.1";
        appInfo.wkVersion = CoreVersion.wkVersion;
        appInfo.appKey = CcrcContextImpl.getInstance().getAppKey();
        return appInfo;
    }
}
