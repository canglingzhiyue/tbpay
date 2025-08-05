package com.ta.audid.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class NetworkInfoUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1791081877);
    }

    public static boolean isConnectInternet(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80c41504", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        return false;
                    }
                    return activeNetworkInfo.isConnected();
                }
            } catch (Exception e) {
                UtdidLogger.e("", e, new Object[0]);
            }
        }
        return true;
    }
}
