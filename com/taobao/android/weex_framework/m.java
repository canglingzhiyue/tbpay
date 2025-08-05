package com.taobao.android.weex_framework;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.view.accessibility.AccessibilityManager;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex_framework.util.i;
import com.taobao.android.weex_framework.util.n;
import com.taobao.taobao.R;
import com.taobao.weex.common.WXConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f15996a;
    public static volatile Application b;
    public static boolean c;
    private static final Map<String, Map<String, Object>> d;
    private static final Map<String, Object> e;
    private static volatile boolean f;
    private static volatile boolean g;
    private static float h;
    private static AccessibilityManager i;
    private static volatile boolean j;

    static {
        kge.a(-628961756);
        f15996a = false;
        d = new ConcurrentHashMap();
        e = new ConcurrentHashMap();
        f = false;
        g = false;
        j = false;
        c = false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (i == null) {
            i = (AccessibilityManager) b().getSystemService("accessibility");
        }
        AccessibilityManager accessibilityManager = i;
        if (accessibilityManager == null) {
            return false;
        }
        return accessibilityManager.isEnabled();
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : j;
    }

    public static Application b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("2271dcb8", new Object[0]) : b;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : (b == null || (b.getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static Map<String, Map<String, Object>> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913cde0", new Object[0]);
        }
        if (!f) {
            synchronized (d) {
                if (!f) {
                    i();
                    f = true;
                }
            }
        }
        return d;
    }

    public static Map<String, Object> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[0]);
        }
        if (!g) {
            synchronized (e) {
                if (!g) {
                    h();
                    g = true;
                }
            }
        }
        return e;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (!g) {
            synchronized (e) {
                if (!g) {
                    h();
                    g = true;
                }
            }
        }
        Object obj = e.get(str);
        return obj == null ? "" : String.valueOf(obj);
    }

    public static String a(String str, String str2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        Map<String, Object> map = d().get(str);
        return (map == null || (obj = map.get(str2)) == null) ? "" : String.valueOf(obj);
    }

    public static WeexValueImpl b(String str, String str2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("a36e8e79", new Object[]{str, str2});
        }
        Map<String, Object> map = d().get(str);
        if (map == null) {
            return WeexValueImpl.ofUndefined();
        }
        if ("userAgent".equals(str2)) {
            obj = e.get(str2);
        } else if ("system".equals(str) && "ttid".equals(str2)) {
            obj = e.get(str2);
        } else if ("system".equals(str) && "appName".equals(str2)) {
            obj = e.get(str2);
        } else {
            obj = map.get(str2);
        }
        if (obj == null) {
            return WeexValueImpl.ofUndefined();
        }
        return WeexValueImpl.convert(obj);
    }

    private static void h() {
        Application application;
        Application application2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
            return;
        }
        e.put("platform", "Android");
        e.put("osName", "Android");
        e.put("osVersion", Build.VERSION.RELEASE);
        e.put("appVersion", j());
        e.put(WXConfig.weexVersion, "0.17.1.5-framework-android");
        e.put(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
        if (Build.VERSION.SDK_INT >= 23 && Process.is64Bit()) {
            e.put("deviceCPUArch", "64bit");
        } else {
            e.put("deviceCPUArch", "32bit");
        }
        int d2 = com.taobao.android.weex_framework.util.l.d(b);
        e.put(WXConfig.deviceWidth, Float.valueOf(i.a((Context) b, d2)));
        Map<String, Object> map = e;
        Application application3 = b;
        map.put(WXConfig.deviceHeight, Float.valueOf(i.a((Context) application3, com.taobao.android.weex_framework.util.l.f(application3))));
        float f2 = d2;
        e.put("devicePixelRatio", Double.valueOf(Math.round((f2 / n.a(b, f2)) * 100.0d) * 0.01d));
        e.put("scale", Float.valueOf(b.getResources().getDisplayMetrics().density));
        float a2 = n.a(b, com.taobao.android.weex_framework.util.l.a(application));
        e.put("navBarHeight", Float.valueOf(n.a(b, com.taobao.android.weex_framework.util.l.b(application2))));
        e.put("statusBarHeight", Float.valueOf(a2));
        e.put("statusBarHeightPx", Float.valueOf(a2));
        e.put("userAgent", String.format("Weex/%1$s %2$s/%3$s(%4$s) %5$s/%6$s", Build.MODEL, "Android", "0.17.1.5-framework-android", Build.VERSION.RELEASE, b.getPackageName(), j()));
    }

    private static void i() {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("platform", "Android");
        concurrentHashMap.put("osVersion", Build.VERSION.RELEASE);
        concurrentHashMap.put("userAgent", String.format("MUS/%1$s %2$s/%3$s(%4$s) %5$s/%6$s", "0.17.1.5-framework-android", "Android", Build.VERSION.RELEASE, Build.MODEL, b.getPackageName(), j()));
        concurrentHashMap.put(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
        Application application2 = b;
        concurrentHashMap.put(WXConfig.deviceWidth, Float.valueOf(i.a((Context) application2, com.taobao.android.weex_framework.util.l.d(application2))));
        Application application3 = b;
        concurrentHashMap.put(WXConfig.deviceHeight, Float.valueOf(i.a((Context) application3, com.taobao.android.weex_framework.util.l.f(application3))));
        float d2 = com.taobao.android.weex_framework.util.l.d(b);
        concurrentHashMap.put("devicePixelRatio", Double.valueOf(Math.round((d2 / n.a(b, d2)) * 100.0d) * 0.01d));
        concurrentHashMap.put("statusBarHeight", Integer.valueOf(com.taobao.android.weex_framework.util.l.a(b)));
        concurrentHashMap.put("statusBarHeightPx", Float.valueOf(n.a(b, com.taobao.android.weex_framework.util.l.a(application))));
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        concurrentHashMap2.put("musVersion", "0.17.1.5-framework-android");
        concurrentHashMap2.put("musGitHashTag", c.GIT_HASH_NAME);
        concurrentHashMap2.put("musApiLevel", "10");
        concurrentHashMap2.put("debug", l.a().j() ? "1" : "0");
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        concurrentHashMap3.put("appName", b.getPackageName());
        concurrentHashMap3.put("appVersion", j());
        d.put("system", concurrentHashMap);
        d.put(g4.a.f3423a, concurrentHashMap2);
        d.put("app", concurrentHashMap3);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        return b.getApplicationContext().getResources().getBoolean(R.bool.mus_is_right_to_left);
    }

    public static String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[0]);
        }
        try {
            return b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName;
        } catch (Exception e2) {
            com.taobao.android.weex_framework.util.g.a(e2);
            return "";
        }
    }

    public static float g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f95e", new Object[0])).floatValue();
        }
        if (h == 0.0f) {
            h = b.getResources().getDisplayMetrics().density;
        }
        return h;
    }
}
