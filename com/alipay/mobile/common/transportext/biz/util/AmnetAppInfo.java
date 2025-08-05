package com.alipay.mobile.common.transportext.biz.util;

import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AmnetAppInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getAppName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("92150ca3", new Object[0]) : "ALIPAY_WALLET";
    }

    public static String getProductVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34f467a", new Object[0]) : AppInfoUtil.getProductVersion();
    }

    public static String getProductId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d388ffc5", new Object[0]) : AppInfoUtil.getProductId();
    }

    public static String getUtdId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f9ac854f", new Object[0]) : DeviceInfoUtil.getDeviceId();
    }
}
