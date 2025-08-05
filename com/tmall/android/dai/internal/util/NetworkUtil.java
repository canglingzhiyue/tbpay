package com.tmall.android.dai.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import tb.kge;

/* loaded from: classes9.dex */
public class NetworkUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public enum NetworkState {
        NETWORK_UNKNOW(-1),
        NETWORK_NONE(0),
        NETWORK_WIFI(1),
        NETWORK_MOBILE(2),
        NETWORK_2G(3),
        NETWORK_3G(4),
        NETWORK_4G(5),
        NETWORK_5G(6),
        NETWORK_ALL(10);
        
        int value;

        NetworkState(int i) {
            this.value = i;
        }

        public int value() {
            return this.value;
        }

        public String value_name() {
            int i = this.value;
            return i != 0 ? i != 1 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? "unknown" : "5g" : "4g" : "3g" : "2g" : "wifi" : "unknown";
        }
    }

    static {
        kge.a(1560348029);
    }

    public static NetworkState a(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo.State state;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkState) ipChange.ipc$dispatch("e26485fb", new Object[]{context});
        }
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return NetworkState.NETWORK_NONE;
            }
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            if (networkInfo != null && (state = networkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                return NetworkState.NETWORK_WIFI;
            }
            switch (ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType((TelephonyManager) context.getSystemService("phone"))) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return NetworkState.NETWORK_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return NetworkState.NETWORK_3G;
                case 13:
                    return NetworkState.NETWORK_4G;
                default:
                    return NetworkState.NETWORK_MOBILE;
            }
        }
        return NetworkState.NETWORK_NONE;
    }
}
