package com.alibaba.security.realidentity;

import android.app.Activity;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class c5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb0489", new Object[]{activity, new Integer(i)});
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            b5.a(activity, i);
        } else if (i2 < 19) {
        } else {
            a5.a(activity, i);
        }
    }

    public static void b(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8c0be8", new Object[]{activity, new Integer(i)});
        } else if (Build.VERSION.SDK_INT < 19) {
        } else {
            if (b(activity, true) || a(activity, true)) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 21) {
                    activity.getWindow().setStatusBarColor(i);
                } else if (i2 >= 19) {
                    a(activity, i);
                }
            }
            if (Build.VERSION.SDK_INT < 23) {
                return;
            }
            activity.getWindow().setBackgroundDrawableResource(17170445);
            activity.getWindow().getDecorView().setSystemUiVisibility(9216);
            activity.getWindow().setStatusBarColor(i);
            View childAt = ((ViewGroup) activity.getWindow().findViewById(16908290)).getChildAt(0);
            if (childAt == null) {
                return;
            }
            childAt.setFitsSystemWindows(true);
            ViewCompat.requestApplyInsets(childAt);
        }
    }

    public static boolean a(Activity activity, boolean z) {
        try {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i = declaredField.getInt(null);
            int i2 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, z ? i2 | i : (~i) & i2);
            activity.getWindow().setAttributes(attributes);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(Activity activity, boolean z) {
        try {
            Class<?> cls = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            Window window = activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.getDecorView().setSystemUiVisibility(8192);
            Class<?> cls2 = activity.getWindow().getClass();
            int i = cls.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls);
            Method method = cls2.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
            Window window2 = activity.getWindow();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(z ? i : 0);
            objArr[1] = Integer.valueOf(i);
            method.invoke(window2, objArr);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
