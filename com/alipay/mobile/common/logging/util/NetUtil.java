package com.alipay.mobile.common.logging.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class NetUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_GSM = "GSM";
    public static final String TYPE_TDS_HSDPSA = "TDS-HSDPSA";
    public static final String TYPE_TDS_HSUPA = "TDS-HSUPA";
    public static final String TYPE_TD_CDMA = "TD-CDMA";
    public static final String TYPE_WIFI = "WIFI";

    /* renamed from: a  reason: collision with root package name */
    private static long f5464a;
    private static String b;
    private static long c;
    private static String d;

    public static NetworkInfo getActiveNetworkInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkInfo) ipChange.ipc$dispatch("6ad73668", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getNetworkTypeOptimized(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("468ee0d4", new Object[]{context});
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - f5464a > 5000) {
            b = getNetworkType(context);
            f5464a = uptimeMillis;
        }
        return b;
    }

    public static String getNetworkTypeOptimizedStrict(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3c0803d", new Object[]{context});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - c > 1000) {
            d = getNetworkType(context);
            c = currentTimeMillis;
        }
        return d;
    }

    public static String getNetworkType(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("794dbb71", new Object[]{context}) : getNetworkType(getActiveNetworkInfo(context));
    }

    public static String getNetworkType(NetworkInfo networkInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("793cf962", new Object[]{networkInfo});
        }
        String str = null;
        if (networkInfo == null) {
            return null;
        }
        if ("WIFI".equalsIgnoreCase(networkInfo.getTypeName())) {
            return "WIFI";
        }
        if (!StringUtils.isEmpty(networkInfo.getSubtypeName())) {
            str = networkInfo.getSubtypeName();
        } else if (networkInfo.getSubtype() == 16) {
            str = TYPE_GSM;
        } else if (networkInfo.getSubtype() == 17) {
            str = TYPE_TD_CDMA;
        } else if (networkInfo.getSubtype() == 18) {
            str = TYPE_TDS_HSDPSA;
        } else if (networkInfo.getSubtype() == 19) {
            str = TYPE_TDS_HSUPA;
        }
        if (str == null || StringUtils.isEmpty(networkInfo.getExtraInfo())) {
            return str;
        }
        return str + "|" + networkInfo.getExtraInfo();
    }

    public static boolean isNetworkConnected(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e6e0580", new Object[]{context})).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String formatParamStringForGET(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("362d0976", new Object[]{map});
        }
        if (map != null && map.size() != 0) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    arrayList.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
                }
                return URLEncodedUtils.format(arrayList, "utf-8");
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
