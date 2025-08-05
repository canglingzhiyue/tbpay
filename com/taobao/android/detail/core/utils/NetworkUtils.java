package com.taobao.android.detail.core.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import anet.channel.monitor.NetworkSpeed;
import anetwork.channel.monitor.Monitor;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class NetworkUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public enum ConnectType {
        CONNECT_TYPE_WIFI,
        CONNECT_TYPE_MOBILE,
        CONNECT_TYPE_OTHER,
        CONNECT_TYPE_DISCONNECT
    }

    /* loaded from: classes4.dex */
    public enum MobileNetworkType {
        MOBILE_NETWORK_TYPE_2G,
        MOBILE_NETWORK_TYPE_3G,
        MOBILE_NETWORK_TYPE_4G,
        MOBILE_NETWORK_TYPE_UNKNOWN
    }

    static {
        kge.a(-766534618);
        emu.a("com.taobao.android.detail.core.utils.NetworkUtils");
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : NetworkSpeed.Slow == Monitor.getNetSpeed();
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : b(context) != null;
    }

    public static String b(Context context) {
        NetworkInfo[] allNetworkInfo;
        NetworkInfo.State state;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null) {
            return null;
        }
        for (int i = 0; i < allNetworkInfo.length; i++) {
            if (allNetworkInfo[i] != null && (NetworkInfo.State.CONNECTED == (state = allNetworkInfo[i].getState()) || NetworkInfo.State.CONNECTING == state)) {
                String extraInfo = allNetworkInfo[i].getExtraInfo();
                return allNetworkInfo[i].getTypeName() + " " + allNetworkInfo[i].getSubtypeName() + extraInfo;
            }
        }
        return null;
    }

    public static ConnectType c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnectType) ipChange.ipc$dispatch("5318f1e9", new Object[]{context});
        }
        ConnectType connectType = ConnectType.CONNECT_TYPE_DISCONNECT;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return connectType;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return ConnectType.CONNECT_TYPE_MOBILE;
        }
        if (type == 1) {
            return ConnectType.CONNECT_TYPE_WIFI;
        }
        return ConnectType.CONNECT_TYPE_OTHER;
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context});
        }
        MobileNetworkType e = e(context);
        return MobileNetworkType.MOBILE_NETWORK_TYPE_2G == e ? "2g" : MobileNetworkType.MOBILE_NETWORK_TYPE_3G == e ? "3g" : MobileNetworkType.MOBILE_NETWORK_TYPE_4G == e ? "4g" : "unknown";
    }

    public static MobileNetworkType e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MobileNetworkType) ipChange.ipc$dispatch("a56737a5", new Object[]{context});
        }
        NetworkInfo networkInfo = null;
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable unused) {
        }
        if (networkInfo != null && networkInfo.getType() == 0 && networkInfo.isConnected()) {
            return a(networkInfo.getSubtype());
        }
        return MobileNetworkType.MOBILE_NETWORK_TYPE_UNKNOWN;
    }

    private static MobileNetworkType a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MobileNetworkType) ipChange.ipc$dispatch("67d2c8e4", new Object[]{new Integer(i)});
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return MobileNetworkType.MOBILE_NETWORK_TYPE_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return MobileNetworkType.MOBILE_NETWORK_TYPE_3G;
            case 13:
                return MobileNetworkType.MOBILE_NETWORK_TYPE_4G;
            default:
                return MobileNetworkType.MOBILE_NETWORK_TYPE_UNKNOWN;
        }
    }
}
