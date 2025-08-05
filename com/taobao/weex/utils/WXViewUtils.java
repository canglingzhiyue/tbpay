package com.taobao.weex.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.weex.WXEnvironment;
import tb.kge;

/* loaded from: classes9.dex */
public class WXViewUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int b;
    private static int c;
    private static int d;
    private static int e;

    static {
        kge.a(333435442);
        d = -1;
        e = -1;
    }

    public static int getStatusBarHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return -1;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    @Deprecated
    public static int getScreenWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue() : getScreenWidth(WXEnvironment.sApplication);
    }

    public static int getScreenWidth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        int i = d;
        if (i > 0) {
            return i;
        }
        if (context != null) {
            Resources resources = context.getResources();
            b = resources.getDisplayMetrics().widthPixels;
            if (WXEnvironment.SETTING_FORCE_VERTICAL_SCREEN) {
                int i2 = resources.getDisplayMetrics().heightPixels;
                c = i2;
                int i3 = b;
                if (i2 <= i3) {
                    i3 = c;
                }
                b = i3;
            }
        }
        return b;
    }

    public static void setWindowWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd585e8", new Object[]{new Integer(i)});
        } else {
            d = i;
        }
    }

    public static void setWindowHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aef1843", new Object[]{new Integer(i)});
        } else {
            e = i;
        }
    }

    @Deprecated
    public static int getScreenHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue() : getScreenHeight(WXEnvironment.sApplication);
    }

    @Deprecated
    public static int getScreenHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        if (context != null) {
            Resources resources = context.getResources();
            c = resources.getDisplayMetrics().heightPixels;
            if (WXEnvironment.SETTING_FORCE_VERTICAL_SCREEN) {
                b = resources.getDisplayMetrics().widthPixels;
                int i = c;
                int i2 = b;
                if (i <= i2) {
                    i = i2;
                }
                c = i;
            }
        }
        return c;
    }

    public static int getFullScreenHeight(Context context) {
        WindowManager windowManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59ff1fbc", new Object[]{context})).intValue();
        }
        if (context != null) {
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT >= 17 && (windowManager = (WindowManager) context.getSystemService(a.ATOM_EXT_window)) != null && windowManager.getDefaultDisplay() != null) {
                Point point = new Point();
                windowManager.getDefaultDisplay().getRealSize(point);
                c = point.y;
            } else {
                c = context.getResources().getDisplayMetrics().heightPixels;
            }
            if (WXEnvironment.SETTING_FORCE_VERTICAL_SCREEN) {
                b = resources.getDisplayMetrics().widthPixels;
                int i = c;
                int i2 = b;
                if (i <= i2) {
                    i = i2;
                }
                c = i;
            }
        }
        return c;
    }

    public static int dip2px(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{new Float(f)})).intValue();
        }
        float f2 = 2.0f;
        try {
            f2 = WXEnvironment.getApplication().getResources().getDisplayMetrics().density;
        } catch (Exception e2) {
            WXLogUtils.e("[WXViewUtils] dip2px:", e2);
        }
        float f3 = (f * f2) + 0.5f;
        if (f3 > 0.0f && f3 < 1.0f) {
            return 1;
        }
        return (int) f3;
    }

    @Deprecated
    public static float getWebPxByWidth(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab7eba0", new Object[]{new Float(f)})).floatValue() : getWebPxByWidth(f, 750);
    }

    @Deprecated
    public static float getWebPxByWidth(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c45fd43", new Object[]{new Float(f), new Integer(i)})).floatValue();
        }
        double d2 = f;
        if (d2 < -1.9999d && d2 > -2.005d) {
            return Float.NaN;
        }
        float screenWidth = (f * i) / getScreenWidth();
        if (screenWidth > 0.005d && screenWidth < 1.0f) {
            return 1.0f;
        }
        return screenWidth;
    }

    @Deprecated
    public static float getRealPxByWidth(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a42f8b16", new Object[]{new Float(f)})).floatValue() : getRealPxByWidth(f, 750);
    }

    @Deprecated
    public static float getRealPxByWidth(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1c24c8d", new Object[]{new Float(f), new Integer(i)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        float screenWidth = (f * getScreenWidth()) / i;
        double d2 = screenWidth;
        if (d2 > 0.005d && screenWidth < 1.0f) {
            return 1.0f;
        }
        return (float) Math.rint(d2);
    }

    @Deprecated
    public static float getRealSubPxByWidth(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5e7b328e", new Object[]{new Float(f)})).floatValue() : getRealSubPxByWidth(f, 750);
    }

    @Deprecated
    public static float getRealSubPxByWidth(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70eb9415", new Object[]{new Float(f), new Integer(i)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        float screenWidth = (f * getScreenWidth()) / i;
        if (screenWidth > 0.005d && screenWidth < 1.0f) {
            return 1.0f;
        }
        return screenWidth;
    }

    @Deprecated
    public static float getWeexPxByReal(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("62085835", new Object[]{new Float(f)})).floatValue() : getWeexPxByReal(f, 750);
    }

    @Deprecated
    public static float getWeexPxByReal(float f, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("df03234e", new Object[]{new Float(f), new Integer(i)})).floatValue() : Float.isNaN(f) ? f : (f * i) / getScreenWidth();
    }
}
