package com.alipay.mobile.common.transport.sys.telephone;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NetTelephonyManagerFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static NetTelephonyManager f5616a;
    private static NetTelephonyManager b;

    public static final NetTelephonyManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetTelephonyManager) ipChange.ipc$dispatch("92b41e42", new Object[0]);
        }
        NetTelephonyManager netTelephonyManager = f5616a;
        if (netTelephonyManager != null) {
            return netTelephonyManager;
        }
        NetTelephonyManager netTelephonyManager2 = b;
        if (netTelephonyManager2 != null) {
            return netTelephonyManager2;
        }
        DefaultNetTelephonyManager defaultNetTelephonyManager = new DefaultNetTelephonyManager();
        b = defaultNetTelephonyManager;
        return defaultNetTelephonyManager;
    }

    public static final void setNetTelephonyManager(NetTelephonyManager netTelephonyManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c40775", new Object[]{netTelephonyManager});
        } else {
            f5616a = netTelephonyManager;
        }
    }
}
