package com.alipay.security.mobile.agent;

import android.content.ComponentName;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Version {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SERVICE_CLASS_NAME = "com.alipay.security.mobile.alipayauthenticatorservice.AuthenticatorService";
    public static String SERVICE_PACKAGE_NAME = "";
    public static int agentVersionCode = 4;

    public static int checkServiceVersion(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54604169", new Object[]{context})).intValue();
        }
        int readVersion = readVersion(context, new ComponentName(SERVICE_PACKAGE_NAME, SERVICE_CLASS_NAME));
        if (agentVersionCode <= readVersion) {
            return 122;
        }
        return readVersion == -1 ? 105 : 106;
    }

    public static int readServiceVersion(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("810c01b", new Object[]{context})).intValue() : readVersion(context, new ComponentName(SERVICE_PACKAGE_NAME, SERVICE_CLASS_NAME));
    }

    private static int readVersion(Context context, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dac90c83", new Object[]{context, componentName})).intValue();
        }
        try {
            return context.getPackageManager().getPackageInfo(SERVICE_PACKAGE_NAME, 0).versionCode;
        } catch (Exception unused) {
            return -1;
        }
    }
}
