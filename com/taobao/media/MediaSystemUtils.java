package com.taobao.media;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import tb.kge;

/* loaded from: classes7.dex */
public class MediaSystemUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Application sApplication;
    public static boolean sIsApkDebug;
    public static boolean sIsSupportWeex;
    public static int sNoWifiNotice;

    static {
        kge.a(-346715620);
        sIsApkDebug = true;
        sIsSupportWeex = false;
        sNoWifiNotice = 0;
    }

    public static boolean isApkDebuggable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4aeae8b", new Object[0])).booleanValue();
        }
        Application application = sApplication;
        if (application == null || !sIsApkDebug) {
            return false;
        }
        try {
            boolean z = (application.getApplicationInfo().flags & 2) != 0;
            sIsApkDebug = z;
            return z;
        } catch (Exception e) {
            AVSDKLog.e("", e.getMessage());
            return false;
        }
    }
}
