package com.taobao.android.detail.ttdetail.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes5.dex */
public class ba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-172670481);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 21;
    }

    public static boolean a(Window window, boolean z) {
        if (window == null) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls);
            Method method = window.getClass().getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
            if (z) {
                method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
            } else {
                method.invoke(window, 0, Integer.valueOf(i));
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static void a(Context context, Window window, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e173742d", new Object[]{context, window, new Boolean(z)});
        } else {
            a(context, window, z, true);
        }
    }

    private static void a(View view, boolean z) {
        try {
            int i = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
            int systemUiVisibility = view.getSystemUiVisibility();
            int i2 = z ? systemUiVisibility | i : (~i) & systemUiVisibility;
            if (i2 == systemUiVisibility) {
                return;
            }
            view.setSystemUiVisibility(i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void b(Window window, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2a56f6", new Object[]{window, new Boolean(z)});
        } else if (!a()) {
            a(window.getAttributes(), "MEIZU_FLAG_DARK_STATUS_BAR_ICON", z);
        } else {
            View decorView = window.getDecorView();
            if (decorView == null) {
                return;
            }
            a(decorView, z);
        }
    }

    private static void a(Context context, Window window, boolean z, boolean z2) {
        if (context == null) {
            return;
        }
        try {
            Method method = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
            if (method != null && (context instanceof Activity)) {
                method.invoke(context, Boolean.valueOf(z));
            } else if (!z2 || window == null) {
            } else {
                b(window, z);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : "Xiaomi".equals(Build.MANUFACTURER);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : "Meizu".endsWith(Build.MANUFACTURER);
    }

    private static boolean a(WindowManager.LayoutParams layoutParams, String str, boolean z) {
        try {
            Field declaredField = layoutParams.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            int i = declaredField.getInt(layoutParams);
            Field declaredField2 = layoutParams.getClass().getDeclaredField("meizuFlags");
            declaredField2.setAccessible(true);
            int i2 = declaredField2.getInt(layoutParams);
            int i3 = z ? i | i2 : (~i) & i2;
            if (i2 == i3) {
                return false;
            }
            declaredField2.setInt(layoutParams, i3);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
