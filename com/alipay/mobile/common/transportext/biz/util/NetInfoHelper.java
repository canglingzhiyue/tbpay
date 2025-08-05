package com.alipay.mobile.common.transportext.biz.util;

import android.content.Context;
import android.net.NetworkInfo;
import android.net.Proxy;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.apache.http.HttpHost;

/* loaded from: classes3.dex */
public class NetInfoHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CMWAP_PROXY_HOST = "10.0.0.172";
    public static final int CMWAP_PROXY_PORT = 80;
    public static final String NET_TYPE_CMWAP = "cmwap";

    /* renamed from: a  reason: collision with root package name */
    private static final String f5705a = LogUtilAmnet.PRETAG + NetInfoHelper.class.getSimpleName();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r5.length() > 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getActiveNetType(android.content.Context r5) {
        /*
            java.lang.String r0 = "internet"
            java.lang.String r1 = "wifi"
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.mobile.common.transportext.biz.util.NetInfoHelper.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L1b
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r5
            java.lang.String r5 = "3496af3a"
            java.lang.Object r5 = r2.ipc$dispatch(r5, r0)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L1b:
            r2 = 0
            android.net.NetworkInfo r5 = com.alipay.mobile.common.transport.utils.NetworkUtils.getActiveNetworkInfo(r5)     // Catch: java.lang.Exception -> L58
            if (r5 == 0) goto L74
            java.lang.String r3 = r5.getTypeName()     // Catch: java.lang.Exception -> L58
            if (r3 == 0) goto L54
            int r4 = r3.length()     // Catch: java.lang.Exception -> L58
            if (r4 <= 0) goto L54
            boolean r4 = r1.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> L58
            if (r4 == 0) goto L36
            r0 = r1
            goto L75
        L36:
            boolean r1 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> L58
            if (r1 == 0) goto L3d
            goto L75
        L3d:
            java.lang.String r0 = "mobile"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> L58
            if (r0 == 0) goto L74
            java.lang.String r5 = r5.getExtraInfo()     // Catch: java.lang.Exception -> L58
            if (r5 == 0) goto L74
            int r0 = r5.length()     // Catch: java.lang.Exception -> L58
            if (r0 <= 0) goto L74
        L52:
            r0 = r5
            goto L75
        L54:
            java.lang.String r5 = "unknown"
            goto L52
        L58:
            r5 = move-exception
            java.lang.String r0 = com.alipay.mobile.common.transportext.biz.util.NetInfoHelper.f5705a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "getActiveNetType: [ Exception "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r5 = " ]"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.alipay.mobile.common.transportext.biz.util.LogUtilAmnet.e(r0, r5)
        L74:
            r0 = r2
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.util.NetInfoHelper.getActiveNetType(android.content.Context):java.lang.String");
    }

    public static boolean isWifiNetType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3933ca0d", new Object[]{context})).booleanValue();
        }
        try {
            return "wifi".equals(getActiveNetType(context));
        } catch (Exception e) {
            String str = f5705a;
            LogUtilAmnet.e(str, "isWifiNetType: [ Exception " + e + " ]");
            return false;
        }
    }

    public static boolean isMobileNetType(Context context) {
        String typeName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de96fe9a", new Object[]{context})).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = NetworkUtils.getActiveNetworkInfo(context);
            if (activeNetworkInfo != null && (typeName = activeNetworkInfo.getTypeName()) != null && typeName.length() > 0) {
                if ("mobile".equalsIgnoreCase(typeName)) {
                    return true;
                }
            }
        } catch (Exception e) {
            String str = f5705a;
            LogUtilAmnet.e(str, "getActiveNetType: [ Exception " + e + " ]");
        }
        return false;
    }

    public static boolean isNetAvailable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b42cb4ef", new Object[]{context})).booleanValue();
        }
        try {
            return NetworkUtils.isNetworkAvailable(context);
        } catch (Exception e) {
            String str = f5705a;
            LogUtilAmnet.e(str, "isNetAvailable: [ Exception " + e + " ]");
            return false;
        }
    }

    public static HttpHost getProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpHost) ipChange.ipc$dispatch("aef6b165", new Object[0]);
        }
        try {
            String defaultHost = Proxy.getDefaultHost();
            int defaultPort = Proxy.getDefaultPort();
            if (defaultHost != null && defaultHost.length() > 0 && defaultPort > 0) {
                return new HttpHost(defaultHost, defaultPort);
            }
            return null;
        } catch (Exception e) {
            String str = f5705a;
            LogUtilAmnet.e(str, "getProxy: [ Exception " + e + " ]");
            return null;
        }
    }
}
