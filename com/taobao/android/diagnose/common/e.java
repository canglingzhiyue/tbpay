package com.taobao.android.diagnose.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.model.NetInfo;
import tb.kge;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NET_STATUS_AVAILABLE = 1;
    public static final int NET_STATUS_CONNECTED = 2;
    public static final int NET_STATUS_DISCONNECTED = 3;
    public static final int NET_STATUS_UNAVAILABLE = 4;
    public static final int NET_STATUS_UNKNOWN = 0;
    public static final int NET_TYPE_CELLULAR = 1;
    public static final int NET_TYPE_CELLULAR_2G = 2;
    public static final int NET_TYPE_CELLULAR_3G = 3;
    public static final int NET_TYPE_CELLULAR_4G = 4;
    public static final int NET_TYPE_CELLULAR_5G = 5;
    public static final int NET_TYPE_ETHERNET = 8;
    public static final int NET_TYPE_OTHER = 9;
    public static final int NET_TYPE_UNKNOWN = 0;
    public static final int NET_TYPE_WIFI = 7;

    static {
        kge.a(-384958615);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        switch (i) {
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
                return 3;
            case 4:
            case 7:
            case 11:
            case 16:
            case 19:
            default:
                return 2;
            case 13:
            case 18:
                return 4;
            case 20:
                return 5;
        }
    }

    public static NetInfo a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetInfo) ipChange.ipc$dispatch("9a83ef0a", new Object[]{context});
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                if (!activeNetworkInfo.isConnected()) {
                    return new NetInfo(3, 0);
                }
                int type = activeNetworkInfo.getType();
                int i = 9;
                if (type == 0) {
                    i = a(activeNetworkInfo.getSubtype());
                } else if (type == 1) {
                    i = 7;
                } else if (type == 9) {
                    i = 8;
                }
                NetInfo netInfo = new NetInfo();
                netInfo.setStatus(2);
                netInfo.setType(i);
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    netInfo.setOperator(telephonyManager.getSimOperator());
                }
                return netInfo;
            }
            return new NetInfo(4, 0);
        } catch (Exception unused) {
            return new NetInfo(0, 0);
        }
    }
}
