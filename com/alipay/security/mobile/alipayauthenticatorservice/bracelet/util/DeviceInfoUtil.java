package com.alipay.security.mobile.alipayauthenticatorservice.bracelet.util;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.alipay.security.mobile.util.CompatUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DeviceInfoUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getIMEI(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95cf663d", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return null;
            }
            return (String) CompatUtils.invoke(telephonyManager, null, TelephonyManager.class.getDeclaredMethod("getDeviceId", new Class[0]), new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
