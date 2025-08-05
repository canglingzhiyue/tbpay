package com.taobao.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import tb.kge;

/* loaded from: classes7.dex */
public class DWViewUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int mCutoutHeight;

    public static int getScreenWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue();
        }
        if (MediaSystemUtils.sApplication != null) {
            return ((WindowManager) MediaSystemUtils.sApplication.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getWidth();
        }
        return 600;
    }

    public static int getScreenHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        if (MediaSystemUtils.sApplication != null) {
            return ((WindowManager) MediaSystemUtils.sApplication.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getHeight();
        }
        return 600;
    }

    public static int getPortraitScreenWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c7ad2e3", new Object[0])).intValue();
        }
        int screenWidth = getScreenWidth();
        int screenHeight = getScreenHeight();
        return screenWidth < screenHeight ? screenWidth : screenHeight;
    }

    public static int getPortraitScreenHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd122ade", new Object[0])).intValue();
        }
        int screenWidth = getScreenWidth();
        int screenHeight = getScreenHeight();
        return screenWidth > screenHeight ? screenWidth : screenHeight;
    }

    public static int getContentAreaHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2abca83", new Object[]{activity})).intValue();
        }
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    public static int px2dip(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64b9c813", new Object[]{context, new Float(f)})).intValue() : (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int dip2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int getStatusBarHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(identifier);
    }

    public static int getVideoWidthInLandscape(Activity activity) {
        int realHeightInPx;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c7af2a1", new Object[]{activity})).intValue();
        }
        if (Build.VERSION.SDK_INT == 18) {
            return getScreenHeight();
        }
        if (Build.VERSION.SDK_INT < 18) {
            if (activity.getRequestedOrientation() != 1) {
                return getScreenHeight();
            }
            realHeightInPx = getScreenHeight() - getStatusBarHeight(activity);
        } else {
            realHeightInPx = getRealHeightInPx(activity);
            if (Build.VERSION.SDK_INT >= 26 && Build.VERSION.SDK_INT < 28) {
                return realHeightInPx - getDisplayCutoutHeight(activity);
            }
        }
        return realHeightInPx;
    }

    public static int getVideoWidthInActivityLandscape(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3fabb12", new Object[]{activity})).intValue();
        }
        if (Build.VERSION.SDK_INT < 18) {
            return getRealHeightInPx(activity) - getStatusBarHeight(activity);
        }
        return getRealHeightInPx(activity);
    }

    public static int getVideoHeightInActivityLandscape(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3549ea7", new Object[]{activity})).intValue();
        }
        if (Build.VERSION.SDK_INT < 18) {
            return getScreenWidth() - getStatusBarHeight(activity);
        }
        return getScreenWidth();
    }

    public static int getRealPxByWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a42f8b19", new Object[]{new Float(f)})).intValue();
        }
        if (Float.isNaN(f)) {
            return 0;
        }
        float screenWidth = (f * getScreenWidth()) / 750.0f;
        double d = screenWidth;
        if (d > 0.005d && screenWidth < 1.0f) {
            return 1;
        }
        return (int) Math.rint(d);
    }

    public static int getRealWithInPx(Context context) {
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            return displayMetrics.widthPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int getRealHeightInPx(Context context) {
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int getRealPxByHeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6dd70c92", new Object[]{new Float(f)})).intValue();
        }
        if (Float.isNaN(f)) {
            return 0;
        }
        float screenHeight = (f * getScreenHeight()) / 750.0f;
        double d = screenHeight;
        if (d > 0.005d && screenHeight < 1.0f) {
            return 1;
        }
        return (int) Math.rint(d);
    }

    public static boolean isVerticalScreen(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3cee8559", new Object[]{context})).booleanValue() : !(context instanceof Activity) || ((Activity) context).getResources().getConfiguration().orientation == 1;
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("cc237851", new Object[]{drawable});
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return createBitmap;
    }

    public static void setNavigationBar(Window window, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00d8720", new Object[]{window, new Integer(i)});
        } else if (Build.VERSION.SDK_INT <= 18) {
        } else {
            ((ViewGroup) window.getDecorView()).setSystemUiVisibility(i);
        }
    }

    public static int hideNavigationBar(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18d0ed16", new Object[]{window})).intValue();
        }
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        int systemUiVisibility = viewGroup.getSystemUiVisibility();
        if (Build.VERSION.SDK_INT > 18 && systemUiVisibility != 4102) {
            viewGroup.setSystemUiVisibility(4102);
        }
        return systemUiVisibility;
    }

    static {
        kge.a(-1793505992);
        mCutoutHeight = -1;
    }

    public static int getDisplayCutoutHeight(Activity activity) {
        View decorView;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77ad648b", new Object[]{activity})).intValue();
        }
        int i = mCutoutHeight;
        if (i != -1) {
            return i;
        }
        if (activity == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 28 && (decorView = activity.getWindow().getDecorView()) != null && (rootWindowInsets = decorView.getRootWindowInsets()) != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
            int safeInsetTop = displayCutout.getSafeInsetTop();
            mCutoutHeight = safeInsetTop;
            return safeInsetTop;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (activity.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism")) {
                mCutoutHeight = 80;
                return 80;
            } else if (hasDisplayCutoutVivo(activity)) {
                int dip2px = dip2px(activity, 27.0f);
                mCutoutHeight = dip2px;
                return dip2px;
            } else if (hasDisplayCutoutHuawei(activity)) {
                int i2 = getNotchSize(activity)[1];
                mCutoutHeight = i2;
                return i2;
            } else if (hasDisplayCutoutXiaomi(activity)) {
                int identifier = activity.getResources().getIdentifier("notch_height", "dimen", "android");
                if (identifier > 0) {
                    mCutoutHeight = activity.getResources().getDimensionPixelSize(identifier);
                }
                return mCutoutHeight;
            }
        }
        mCutoutHeight = 0;
        return 0;
    }

    private static boolean hasDisplayCutoutVivo(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean hasDisplayCutoutHuawei(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean hasDisplayCutoutXiaomi(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return ((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, "ro.miui.notch", 0)).intValue() == 1;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static int[] getNotchSize(Context context) {
        int[] iArr = {0, 0};
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return (int[]) loadClass.getMethod("getNotchSize", new Class[0]).invoke(loadClass, new Object[0]);
        } catch (Throwable unused) {
            return iArr;
        }
    }
}
