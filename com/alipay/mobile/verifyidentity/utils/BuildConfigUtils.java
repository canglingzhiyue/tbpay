package com.alipay.mobile.verifyidentity.utils;

import com.alipay.android.phone.mobilecommon.verifyidentity.BuildConfig;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BuildConfigUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_RPC_TYPE = "RPC_TYPE";
    public static final String K_RPC_TYPE_DEF = "RPC_TYPE_DEF";
    public static final String K_RPC_TYPE_TB = "RPC_TYPE_TB";

    /* renamed from: a  reason: collision with root package name */
    private static Class f6096a;

    public static String getString(String str, String str2, String str3) {
        try {
            if (f6096a == null) {
                ClassLoader classLoader = BuildConfigUtils.class.getClassLoader();
                f6096a = classLoader.loadClass(str + ".BuildConfig");
            }
        } catch (Throwable unused) {
        }
        Class cls = f6096a;
        if (cls != null) {
            try {
                return (String) cls.getField(str2).get(null);
            } catch (Throwable unused2) {
            }
        }
        return str3;
    }

    public static String getString(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ba42c148", new Object[]{str}) : getString(BuildConfig.APPLICATION_ID, str, "");
    }
}
