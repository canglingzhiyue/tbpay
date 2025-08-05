package com.taobao.tao.flexbox.layoutmanager.ac;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import anet.channel.status.NetworkStatusHelper;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.oeb;

/* loaded from: classes8.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f19927a;

    static {
        kge.a(-2046622809);
        f19927a = oeb.a("useNewNetworkStatus", true);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (f19927a) {
            return NetworkStatusHelper.isConnected();
        }
        return b(context) != null;
    }

    public static String b(Context context) {
        NetworkInfo[] allNetworkInfo;
        NetworkInfo.State state;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        if (f19927a) {
            return a();
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null) {
            return null;
        }
        for (int i = 0; i < allNetworkInfo.length; i++) {
            if (allNetworkInfo[i] != null && ((state = allNetworkInfo[i].getState()) == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                String extraInfo = allNetworkInfo[i].getExtraInfo();
                return allNetworkInfo[i].getTypeName() + " " + allNetworkInfo[i].getSubtypeName() + extraInfo;
            }
        }
        return null;
    }

    public static String c(Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
        }
        if (f19927a) {
            return a();
        }
        return (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) ? "disconnected" : activeNetworkInfo.getTypeName();
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        boolean isConnected = NetworkStatusHelper.isConnected();
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        return (status == null || !isConnected) ? "disconnected" : status.isWifi() ? "WIFI" : status.isMobile() ? "MOBILE" : status.getType();
    }

    public static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0236730", new Object[]{context})).intValue();
        }
        if (!(!a(context))) {
            return NetworkQualityMonitor.getGlobalNetworkQuality();
        }
        return -1;
    }
}
