package com.taobao.uikit.extend.utils;

import android.app.Activity;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import tb.kge;

/* loaded from: classes.dex */
public class NavigationBarUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-59913851);
    }

    public static int getNavigationBarHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a70058bc", new Object[]{activity})).intValue();
        }
        int identifier = activity.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        return activity.getResources().getDimensionPixelSize(identifier);
    }

    public static boolean isNavigationBarShown(Activity activity) {
        int visibility;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7263359", new Object[]{activity})).booleanValue();
        }
        View findViewById = activity.findViewById(16908336);
        return (findViewById == null || (visibility = findViewById.getVisibility()) == 8 || visibility == 4) ? false : true;
    }

    public static int getCurrentNavigationBarHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("882dabef", new Object[]{activity})).intValue();
        }
        if (!isNavigationBarShown(activity)) {
            return 0;
        }
        return getNavigationBarHeight(activity);
    }

    public static int getContentHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48145356", new Object[]{activity})).intValue();
        }
        WindowManager windowManager = (WindowManager) activity.getSystemService(a.ATOM_EXT_window);
        DisplayMetrics displayMetrics = null;
        if (Build.VERSION.SDK_INT >= 17) {
            displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        if (displayMetrics != null) {
            return displayMetrics.heightPixels - getCurrentNavigationBarHeight(activity);
        }
        return DisplayUtil.getScreenHeight(activity);
    }
}
