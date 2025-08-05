package com.alipay.mobile.verifyidentity.ui.utils;

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
public class DensityUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static float getScale(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e1d6c38", new Object[]{new Integer(i)})).floatValue();
        }
        if (i == 0) {
            return 0.875f;
        }
        if (i == 1) {
            return 1.0f;
        }
        if (i == 2) {
            return 1.125f;
        }
        if (i == 3) {
            return 1.25f;
        }
        return i != 4 ? 1.0f : 1.375f;
    }

    public static boolean isValueEqule(float f, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bfcf28e6", new Object[]{new Float(f), new Float(f2)})).booleanValue() : ((int) f) == ((int) f2);
    }

    public static int dip2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        float f2 = 0.0f;
        try {
            f2 = context.getResources().getDisplayMetrics().density;
        } catch (Throwable unused) {
        }
        return (int) ((f * f2) + 0.5f);
    }

    public static float getTextSize(float f, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2888b73e", new Object[]{new Float(f), new Integer(i)})).floatValue() : getScale(i) * f;
    }

    public static float px2sp(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c6ba8776", new Object[]{context, new Float(f)})).floatValue() : f / context.getResources().getDisplayMetrics().scaledDensity;
    }

    public static int getScreenHeight(Context context) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        int i2 = a(context).heightPixels;
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
        return ((i2 - i) - getSmartBarHeight(context)) - b(context);
    }

    private static DisplayMetrics a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("1f64c183", new Object[]{context});
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

    private static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        try {
            Resources resources = context.getResources();
            return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
        } catch (Throwable unused) {
            return 0;
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
            } catch (Throwable unused) {
                z = false;
            }
            if (!z2 && !z3 && !z) {
                try {
                    Class<?> cls = Class.forName("com.android.internal.R$dimen");
                    return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("mz_action_button_min_height").get(cls.newInstance()).toString()));
                } catch (Throwable unused2) {
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
        } catch (Throwable unused) {
        }
        return 0;
    }
}
