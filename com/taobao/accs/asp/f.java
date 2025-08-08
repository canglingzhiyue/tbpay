package com.taobao.accs.asp;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.utl.ALog;
import java.util.List;
import tb.jzv;
import tb.kge;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile String f8195a;
    private static volatile String b;

    static {
        kge.a(1254913270);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if (f8195a != null) {
            return f8195a;
        }
        try {
            ComponentName componentName = new ComponentName(jzv.a(), "com.taobao.accs.AccsIPCProvider");
            PackageManager packageManager = jzv.a().getPackageManager();
            if (packageManager != null) {
                f8195a = packageManager.getProviderInfo(componentName, 0).processName;
            }
        } catch (Exception e) {
            ALog.e("Utils", "getCoreProviderProcess", e, new Object[0]);
        }
        return f8195a;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        if (b != null) {
            return b;
        }
        String a2 = com.taobao.aranger.utils.c.a();
        b = a2;
        return a2;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : b().endsWith(":channel");
    }

    public static boolean d() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        String a2 = a();
        if (StringUtils.isEmpty(a2) || (runningAppProcesses = GlobalClientInfo.getInstance(jzv.a()).getActivityManager().getRunningAppProcesses()) == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(a2)) {
                return true;
            }
        }
        return false;
    }
}
