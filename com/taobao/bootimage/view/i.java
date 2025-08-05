package com.taobao.bootimage.view;

import android.app.Activity;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kej;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-363603927);
    }

    public static int a(Activity activity) {
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{activity})).intValue();
        }
        if (activity == null || (identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return activity.getResources().getDimensionPixelOffset(identifier);
    }

    public static int b(Activity activity) {
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fdb366e", new Object[]{activity})).intValue();
        }
        if (activity == null || (identifier = activity.getResources().getIdentifier("navigation_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return activity.getResources().getDimensionPixelSize(identifier);
    }

    public static void a(Activity activity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628634d8", new Object[]{activity, view});
        } else if (activity == null) {
        } else {
            int e = e(activity);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, e);
            } else {
                layoutParams.height = e;
                layoutParams.width = -1;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public static int c(Activity activity) {
        DisplayMetrics displayMetrics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("792c472f", new Object[]{activity})).intValue();
        }
        if (activity == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            displayMetrics = activity.getResources().getDisplayMetrics();
        }
        return displayMetrics.heightPixels;
    }

    public static int d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b27d57f0", new Object[]{activity})).intValue();
        }
        if (activity == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ebce68b1", new Object[]{activity})).intValue();
        }
        if (activity == null) {
            return 0;
        }
        int c = c(activity);
        int d = d(activity);
        int b = b(activity);
        int a2 = a(activity);
        kej.a("CompatibleNaviBarUtils", "calculateRealHeight displayHeight = " + c + ",usefulHeight = " + d + ",naviBarHeight = " + b + ",statusBarHeight = " + a2);
        int i = c - d;
        return i > a2 + b ? c : (i <= b + 10 || b <= 100) ? i == b ? d : c : d + b;
    }
}
