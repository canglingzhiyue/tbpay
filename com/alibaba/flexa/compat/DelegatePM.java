package com.alibaba.flexa.compat;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class DelegatePM {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String sBaseVersionName;
    public static String sProxyVersionName;

    static {
        kge.a(-359973369);
        sProxyVersionName = "";
        sBaseVersionName = "";
    }

    public static PackageInfo proxy_getPackageInfo(PackageManager packageManager, String str, int i) throws PackageManager.NameNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PackageInfo) ipChange.ipc$dispatch("55c32fdc", new Object[]{packageManager, str, new Integer(i)});
        }
        PackageInfo packageInfo = packageManager.getPackageInfo(str, i);
        if (!TextUtils.isEmpty(sProxyVersionName)) {
            packageInfo.versionName = sProxyVersionName;
        }
        return packageInfo;
    }
}
