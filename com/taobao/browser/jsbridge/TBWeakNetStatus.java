package com.taobao.browser.jsbridge;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import anetwork.channel.monitor.Monitor;
import anetwork.channel.monitor.speed.NetworkSpeed;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class TBWeakNetStatus extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int NETWORK_TYPE_GPRS = 1;
    private final int NETWORK_TYPE_EDGE = 2;
    private final int NETWORK_TYPE_UMTS = 3;
    private final int NETWORK_TYPE_CDMA = 4;
    private final int NETWORK_TYPE_EVDO_0 = 5;
    private final int NETWORK_TYPE_EVDO_A = 6;
    private final int NETWORK_TYPE_1xRTT = 7;
    private final int NETWORK_TYPE_HSDPA = 8;
    private final int NETWORK_TYPE_HSUPA = 9;
    private final int NETWORK_TYPE_HSPA = 10;
    private final int NETWORK_TYPE_IDEN = 11;
    private final int NETWORK_TYPE_EVDO_B = 12;
    private final int NETWORK_TYPE_LTE = 13;
    private final int NETWORK_TYPE_EHRPD = 14;
    private final int NETWORK_TYPE_HSPAP = 15;

    static {
        kge.a(-1698220858);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getStatus".equals(str)) {
            getStatus(wVCallBackContext);
            return true;
        } else if (!"getNetworkType".equals(str)) {
            return false;
        } else {
            getNetworkType(wVCallBackContext);
            return true;
        }
    }

    public final void getStatus(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf8da12c", new Object[]{this, wVCallBackContext});
            return;
        }
        r rVar = new r();
        NetworkSpeed networkSpeed = Monitor.getNetworkSpeed();
        if (networkSpeed != null && networkSpeed.name().equals("Fast")) {
            rVar.a("WeakNetStatus", "false");
        } else {
            rVar.a("WeakNetStatus", "true");
        }
        wVCallBackContext.success(rVar);
    }

    public final void getNetworkType(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42594596", new Object[]{this, wVCallBackContext});
            return;
        }
        r rVar = new r();
        rVar.a("networkType", networkType());
        wVCallBackContext.success(rVar);
    }

    public final String networkType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9db7d71", new Object[]{this});
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "NONE";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "UNKNOWN";
        }
    }
}
