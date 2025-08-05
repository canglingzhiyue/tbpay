package com.alipay.android.msp.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.text.TextUtils;
import com.alipay.mobile.common.transportext.biz.util.NetInfoHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NetworkUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String[] MOBILE_PROXY_IPS = {NetInfoHelper.CMWAP_PROXY_HOST, "10.0.0.200"};

    private static NetworkInfo getActiveNetworkInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkInfo) ipChange.ipc$dispatch("6ad73668", new Object[]{context});
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            return connectivityManager.getActiveNetworkInfo();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }

    public static boolean isMobileWapProxy(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d72fff1", new Object[]{context})).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            String defaultHost = Proxy.getDefaultHost();
            int defaultPort = Proxy.getDefaultPort();
            if (!TextUtils.isEmpty(defaultHost) && defaultPort > 0 && defaultPort < 65535) {
                return isMobileWapProxyIp(defaultHost);
            }
            return false;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    private static boolean isMobileWapProxyIp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2fdd250", new Object[]{str})).booleanValue();
        }
        for (String str2 : MOBILE_PROXY_IPS) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
