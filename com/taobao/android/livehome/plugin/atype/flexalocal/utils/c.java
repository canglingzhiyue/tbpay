package com.taobao.android.livehome.plugin.atype.flexalocal.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.view.Display;
import android.view.WindowManager;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.akt;
import tb.kge;
import tb.sdt;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DEVICELEVEL_SP = "taoLiveHomeDeviceLevel";
    private static volatile boolean b;
    private static volatile boolean c;
    private static volatile Point[] d;

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : 2 == f();
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : 1 == f();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        int f = f();
        return (f == 1 || f == 2) ? false : true;
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[0])).intValue();
        }
        String a2 = p.a(Globals.getApplication(), "taoLiveHomeDeviceLevel");
        if (l.a((CharSequence) a2) || a2.equals("-1")) {
            int a3 = akt.a();
            p.a(Globals.getApplication(), "taoLiveHomeDeviceLevel", String.valueOf(a3));
            return a3;
        }
        return Integer.parseInt(a2);
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue() : PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getInt(EnvironmentSwitcher.SPKEY_ENV, 0);
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]);
        }
        int globalNetworkQuality = NetworkQualityMonitor.getGlobalNetworkQuality();
        return globalNetworkQuality != 0 ? globalNetworkQuality != 1 ? globalNetworkQuality != 2 ? globalNetworkQuality != 3 ? "normal" : "excellent" : "NORMAL" : "poor" : "unknown";
    }

    public static int b(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a785794", new Object[]{context, new Float(f)})).intValue() : (int) ((f / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static float a(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f9a93", new Object[]{context, new Integer(i)})).floatValue() : (i / context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : Globals.getApplication().getResources().getDisplayMetrics().widthPixels;
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        if (!d(context)) {
            return c(context);
        }
        return b(context);
    }

    static {
        kge.a(506271533);
        d = new Point[2];
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        b = false;
        c = false;
        d = new Point[2];
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        char c2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return c(context);
        }
        if (context.getResources().getConfiguration().orientation != 1) {
            c2 = 1;
        }
        if (d[c2] == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
            if (windowManager == null) {
                return c(context);
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            d[c2] = point;
        }
        return d[c2].y;
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static boolean d(Context context) {
        float f;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        if (b) {
            return c;
        }
        b = true;
        c = false;
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (point.x < point.y) {
                f = point.x;
                i = point.y;
            } else {
                f = point.y;
                i = point.x;
            }
            if (i / f >= 1.97f) {
                c = true;
            }
        }
        return c;
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0d012cf", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(identifier);
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a17cbe7f", new Object[]{context})).booleanValue() : e(context) + c(context) < b(context);
    }

    public static int a(Activity activity) {
        int c2;
        int e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{activity})).intValue();
        }
        if (activity == null) {
            return 0;
        }
        if ("vivo X6S A".equals(Build.MODEL) || "vivo Xplay5A".equals(Build.MODEL)) {
            return c(activity);
        }
        if ("Pixel 2 XL".equals(Build.MODEL)) {
            c2 = c(activity);
            e = e(activity);
        } else if (f(activity)) {
            if (Build.VERSION.SDK_INT >= 23 && com.taobao.taolive.room.ui.a.a(activity, activity.getWindow().getDecorView().getRootWindowInsets())) {
                c2 = c(activity);
                e = e(activity);
            } else {
                return c(activity);
            }
        } else if (d(activity)) {
            return a((Context) activity);
        } else {
            if (sdt.a(activity)) {
                c2 = c(activity);
                e = e(activity);
            } else {
                return c(activity);
            }
        }
        return c2 + e;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : "MI 8".equals(Build.MODEL) || "MI 8 SE".equals(Build.MODEL);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : (Globals.getApplication().getApplicationInfo().flags & 2) != 0;
    }
}
