package com.android.taobao.aop;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes3.dex */
public class ANDROID_OS_BUILD_PROXY {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1796743346);
    }

    public static String proxy_getSerial() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16a75c40", new Object[0]);
        }
        if (!limitedOS() && Build.VERSION.SDK_INT >= 26) {
            try {
                return Build.getSerial();
            } catch (SecurityException unused) {
            }
        }
        return "unknown";
    }

    private static boolean limitedOS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bee13689", new Object[0])).booleanValue() : Globals.getApplication().getApplicationInfo().targetSdkVersion >= 29 && Build.VERSION.SDK_INT >= 29;
    }
}
