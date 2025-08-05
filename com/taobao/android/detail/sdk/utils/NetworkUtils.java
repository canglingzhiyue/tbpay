package com.taobao.android.detail.sdk.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import anet.channel.monitor.NetworkSpeed;
import anetwork.channel.monitor.Monitor;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.tpc;

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
        kge.a(1765016929);
        tpc.a("com.taobao.android.detail.sdk.utils.NetworkUtils");
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : NetworkSpeed.Slow == Monitor.getNetSpeed();
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (!b(context)) {
            return 0;
        }
        return a() ? 2 : 1;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : c(context) != null;
    }

    public static String c(Context context) {
        NetworkInfo[] allNetworkInfo;
        NetworkInfo.State state;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
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
}
