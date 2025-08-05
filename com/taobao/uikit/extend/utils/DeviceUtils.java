package com.taobao.uikit.extend.utils;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class DeviceUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1995854744);
    }

    public static boolean isMIUIDevice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7df980db", new Object[0])).booleanValue() : "Xiaomi".equals(Build.MANUFACTURER);
    }

    public static boolean isMeizuDevice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bdedcb43", new Object[0])).booleanValue() : "Meizu".endsWith(Build.MANUFACTURER);
    }

    public static boolean isHUWEIDevice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ea7bb325", new Object[0])).booleanValue() : "HUAWEI".equalsIgnoreCase(Build.MANUFACTURER);
    }
}
