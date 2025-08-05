package com.android.taobao.aop;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public class ANDROID_CONTENT_PM_PACKAGEMANAGER_PROXY {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(799980642);
    }

    public static String proxy_getInstallerPackageName(PackageManager packageManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee3e66ad", new Object[]{packageManager, str});
        }
        return null;
    }

    public static List<PackageInfo> proxy_getInstalledPackages(PackageManager packageManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3918d319", new Object[]{packageManager, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(packageManager.getPackageInfo("com.taobao.taobao", i));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
