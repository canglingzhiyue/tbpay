package com.alipay.mobile.verifyidentity.info;

import android.content.Context;
import android.os.Build;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5871a = "DeviceInfo";

    public static String getOsVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5f114e1b", new Object[0]) : Build.VERSION.RELEASE;
    }

    public static String getMobileBrand() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("edf2af8a", new Object[0]) : Build.BRAND;
    }

    public static String getMobileModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("22c7928", new Object[0]) : Build.MODEL;
    }

    public static String getMobileManufacturer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("47e3e710", new Object[0]) : Build.MANUFACTURER;
    }

    public static String getUtdid(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{context});
        }
        Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.ut.device.UTDevice", "getUtdid", new Class[]{Context.class}, new Object[]{context});
        String str = f5871a;
        VerifyLogCat.i(str, "getUtdid: " + invokeStaticMethod);
        return invokeStaticMethod == null ? "" : (String) invokeStaticMethod;
    }
}
