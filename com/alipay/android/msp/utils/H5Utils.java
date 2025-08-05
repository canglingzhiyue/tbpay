package com.alipay.android.msp.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;

/* loaded from: classes3.dex */
public class H5Utils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int getScreenHeight(Context context) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        int i2 = getDisplayMetrics(context).heightPixels;
        if (context instanceof Activity) {
            int systemUiVisibility = ((Activity) context).getWindow().getDecorView().getSystemUiVisibility();
            if ((systemUiVisibility & 2) != 2 || (systemUiVisibility & 4) != 4) {
                try {
                    int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier > 0) {
                        i = context.getResources().getDimensionPixelSize(identifier);
                    } else {
                        i = ((int) context.getResources().getDisplayMetrics().density) * 24;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return ((i2 - i) - getSmartBarHeight(context)) - getNavigationBarHeight(context);
    }

    private static int getNavigationBarHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b91d22e4", new Object[]{context})).intValue();
        }
        try {
            Resources resources = context.getResources();
            return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return 0;
        }
    }

    private static DisplayMetrics getDisplayMetrics(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("aeee540d", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics;
        } catch (Throwable unused) {
            return context.getResources().getDisplayMetrics();
        }
    }

    public static int getSmartBarHeight(Context context) {
        boolean z;
        boolean equals = Build.MANUFACTURER.equals("Meizu");
        boolean z2 = true;
        boolean z3 = Settings.System.getInt(context.getContentResolver(), "mz_smartbar_auto_hide", 0) == 1;
        if (equals) {
            if (Build.MODEL == null || !Build.MODEL.startsWith("M1 E")) {
                z2 = false;
            }
            try {
                String str = Build.VERSION.INCREMENTAL;
                z = Build.VERSION.RELEASE.startsWith("5.") | str.substring(str.indexOf("OS_") + 3).startsWith("5.") | Build.VERSION.RELEASE.startsWith("6.") | Build.VERSION.RELEASE.startsWith("7.");
            } catch (Throwable th) {
                LogUtil.record(4, "H5Utils#getSmartBarHeight()", "catch exception ".concat(String.valueOf(th)));
                z = false;
            }
            LogUtil.record(2, "H5Utils#getSmartBarHeight", "isFlyme5".concat(String.valueOf(z)));
            if (!z2 && !z3 && !z) {
                try {
                    Class<?> cls = Class.forName("com.android.internal.R$dimen");
                    return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("mz_action_button_min_height").get(cls.newInstance()).toString()));
                } catch (Throwable unused) {
                    return getNormalNavigationBarHeight(context);
                }
            }
        }
        return 0;
    }

    public static int getNormalNavigationBarHeight(Context context) {
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79e9a96b", new Object[]{context})).intValue();
        }
        try {
            Resources resources = context.getResources();
            int identifier2 = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (identifier2 > 0 && resources.getBoolean(identifier2) && (identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
        } catch (Throwable th) {
            LogUtil.record(4, "H5Utils#getNormalNavigationBarHeight()", "exception:" + th.getMessage());
        }
        return 0;
    }
}
