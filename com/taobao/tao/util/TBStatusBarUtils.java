package com.taobao.tao.util;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class TBStatusBarUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int toGrey(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("74a51395", new Object[]{new Integer(i)})).intValue() : (((((i >> 16) & 255) * 38) + (((i >> 8) & 255) * 75)) + ((i & 255) * 15)) >> 7;
    }

    public static boolean isBlackColor(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4fd4e819", new Object[]{new Integer(i), new Integer(i2)})).booleanValue() : toGrey(i) < i2;
    }

    public static boolean isLollipop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c053d360", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 21;
    }

    public static boolean miuiSetStatusBarLightMode(Activity activity, boolean z) {
        if (activity == null) {
            return false;
        }
        try {
            Window window = activity.getWindow();
            Class<?> cls = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls);
            Method method = window.getClass().getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
            if (z) {
                method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
            } else {
                method.invoke(window, 0, Integer.valueOf(i));
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void setStatusBarDarkIcon(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a040c9ed", new Object[]{activity, new Boolean(z)});
        } else {
            setStatusBarDarkIcon(activity, z, true);
        }
    }

    private static void setStatusBarDarkIcon(View view, boolean z) {
        try {
            int i = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
            int systemUiVisibility = view.getSystemUiVisibility();
            int i2 = z ? systemUiVisibility | i : (~i) & systemUiVisibility;
            if (i2 == systemUiVisibility) {
                return;
            }
            view.setSystemUiVisibility(i2);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private static void setStatusBarDarkIcon(Window window, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93934242", new Object[]{window, new Boolean(z)});
        } else if (!isLollipop()) {
            changeMeizuFlag(window.getAttributes(), "MEIZU_FLAG_DARK_STATUS_BAR_ICON", z);
        } else {
            View decorView = window.getDecorView();
            if (decorView == null) {
                return;
            }
            setStatusBarDarkIcon(decorView, z);
        }
    }

    private static void setStatusBarDarkIcon(Activity activity, boolean z, boolean z2) {
        if (activity == null) {
            return;
        }
        try {
            Method method = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
            if (method != null) {
                method.invoke(activity, Boolean.valueOf(z));
            } else if (!z2) {
            } else {
                setStatusBarDarkIcon(activity.getWindow(), z);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    public static boolean isMIUIDevice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7df980db", new Object[0])).booleanValue() : "Xiaomi".equals(Build.MANUFACTURER);
    }

    public static boolean isMeizuDevice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bdedcb43", new Object[0])).booleanValue() : "Meizu".endsWith(Build.MANUFACTURER);
    }

    private static boolean changeMeizuFlag(WindowManager.LayoutParams layoutParams, String str, boolean z) {
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
