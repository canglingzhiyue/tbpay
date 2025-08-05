package com.alibaba.android.patronus;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import tb.kgo;

/* loaded from: classes2.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
        } else if (a()) {
        } else {
            boolean a2 = a(hashMap);
            if (a(application, a2)) {
                new i().a();
            }
            if (Build.VERSION.SDK_INT > 30) {
                return;
            }
            if (b(application, a2)) {
                new h().a();
            }
            if (!c(application, a2)) {
                return;
            }
            new f(application).a();
        }
    }

    private static boolean a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue();
        }
        if (map != null) {
            Object obj = map.get("appVersion");
            if ((obj instanceof String ? (String) obj : "1.0.0").split("\\.").length > 3) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(Application application, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42e93241", new Object[]{application, new Boolean(z)})).booleanValue();
        }
        SharedPreferences a2 = kgo.a(application, "MemKeeper", 0);
        if (z) {
            return Objects.equals(a2.getString("shouldHookApkMap", "true"), "true");
        }
        return Objects.equals(a2.getString("shouldHookApkMap", "false"), "true");
    }

    private static boolean b(Application application, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57d1fa82", new Object[]{application, new Boolean(z)})).booleanValue();
        }
        SharedPreferences a2 = kgo.a(application, "MemKeeper", 0);
        if (z) {
            return Objects.equals(a2.getString("shouldHookTTF", "true"), "true");
        }
        return Objects.equals(a2.getString("shouldHookTTF", "false"), "true");
    }

    private static boolean c(Application application, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cbac2c3", new Object[]{application, new Boolean(z)})).booleanValue();
        }
        SharedPreferences a2 = kgo.a(application, "MemKeeper", 0);
        if (z) {
            return Objects.equals(a2.getString("shouldHookWebViewFactory", "true"), "true");
        }
        return Objects.equals(a2.getString("shouldHookWebViewFactory", "false"), "true");
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Process.is64Bit();
        }
        try {
            return Boolean.TRUE.equals(com.taobao.android.boutique.reflection.e.a(Class.forName("dalvik.system.VMRuntime")).c("getRuntime").c("is64Bit").a());
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }
}
