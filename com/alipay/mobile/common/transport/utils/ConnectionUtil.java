package com.alipay.mobile.common.transport.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.alipay.mobile.common.transportext.biz.util.NetInfoHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ConnectionUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_3GNET = "3gnet";
    public static final String TYPE_3GWAP = "3gwap";
    public static final String TYPE_CMNET = "cmnet";
    public static final String TYPE_CMWAP = "cmwap";
    public static final String TYPE_CTNET = "ctnet";
    public static final String TYPE_CTWAP = "ctwap";
    public static final String TYPE_UNINET = "uninet";
    public static final String TYPE_UNIWAP = "uniwap";
    public static final String TYPE_WIFI = "wifi";

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, String> f5620a;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f5620a = hashMap;
        hashMap.clear();
        f5620a.put("wifi", "0");
        f5620a.put("cmwap", "1");
        f5620a.put(TYPE_CMNET, "2");
        f5620a.put(TYPE_UNIWAP, "3");
        f5620a.put(TYPE_UNINET, "4");
        f5620a.put(TYPE_CTNET, "5");
        f5620a.put(TYPE_CTWAP, "6");
        f5620a.put(TYPE_3GNET, "7");
        f5620a.put(TYPE_3GWAP, "8");
    }

    public static String getConnTypeName(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d47e1c2b", new Object[]{new Integer(i)}) : getConnTypeName(String.valueOf(i));
    }

    public static String getConnTypeName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c89ee5a8", new Object[]{str});
        }
        for (Map.Entry<String, String> entry : f5620a.entrySet()) {
            if (TextUtils.equals(str, entry.getValue())) {
                return entry.getValue();
            }
        }
        return "";
    }

    public static int getConnType(Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e53a7498", new Object[]{context})).intValue();
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                String typeName = activeNetworkInfo.getTypeName();
                if (!typeName.equalsIgnoreCase("WIFI")) {
                    if (typeName.equalsIgnoreCase("MOBILE")) {
                        i = Integer.valueOf(f5620a.get(activeNetworkInfo.getExtraInfo().toLowerCase())).intValue();
                    } else if (typeName.contains("777")) {
                        i = isWapAPN() ? 6 : 5;
                    } else {
                        i = -1;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return i;
    }

    public static boolean isWapAPN() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab59ae2e", new Object[0])).booleanValue();
        }
        String wapIP = getWapIP();
        return (wapIP == null || wapIP.equals("") || getWapPort() == -1) ? false : true;
    }

    public static String getWapIP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b699282", new Object[0]);
        }
        String defaultHost = Proxy.getDefaultHost();
        return defaultHost == null ? NetInfoHelper.CMWAP_PROXY_HOST : defaultHost;
    }

    public static int getWapPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad1c244b", new Object[0])).intValue();
        }
        int defaultPort = Proxy.getDefaultPort();
        if (defaultPort != -1) {
            return defaultPort;
        }
        return 80;
    }

    public static int getNetworkType(Context context) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("263d9902", new Object[]{context})).intValue();
        }
        try {
        } catch (Throwable th) {
            LogCatUtil.error("ConnectionUtil", "getNetworkType ex= " + th.toString());
        }
        if (!MiscUtils.isAtFrontDesk(context)) {
            return 0;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (Build.VERSION.SDK_INT <= 30) {
            i = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType(telephonyManager);
        } else {
            i = telephonyManager.getDataNetworkType();
        }
        return i;
    }
}
