package com.taobao.android.weex_framework.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile int f16093a;
    private static volatile int b;
    private static volatile float c;

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 1) {
            return 1073741824;
        }
        return i != 2 ? 0 : Integer.MIN_VALUE;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        }
    }

    static {
        kge.a(584719425);
        f16093a = 0;
        b = 0;
        c = -1.0f;
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return -1;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(identifier);
    }

    public static float c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb8e", new Object[]{context})).floatValue();
        }
        if (c < 0.0f) {
            c = context.getResources().getDisplayMetrics().density;
        }
        return c;
    }

    public static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0236730", new Object[]{context})).intValue();
        }
        if (f16093a == 0) {
            f16093a = e(context);
        }
        return f16093a;
    }

    @Deprecated
    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0d012cf", new Object[]{context})).intValue();
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(a.ATOM_EXT_window);
        if (windowManager != null && Build.VERSION.SDK_INT >= 17) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 28 && ((Activity) context).isInMultiWindowMode()) {
                return Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            return displayMetrics.widthPixels;
        } else if (context.getResources().getConfiguration().orientation == 2) {
            return context.getResources().getDisplayMetrics().heightPixels;
        } else {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a17cbe6e", new Object[]{context})).intValue();
        }
        if (b == 0) {
            b = g(context);
        }
        return b;
    }

    @Deprecated
    public static int g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2296a0d", new Object[]{context})).intValue();
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(a.ATOM_EXT_window);
        if (windowManager != null && Build.VERSION.SDK_INT >= 17) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 28 && ((Activity) context).isInMultiWindowMode()) {
                return Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            return displayMetrics.heightPixels;
        } else if (context.getResources().getConfiguration().orientation == 2) {
            return context.getResources().getDisplayMetrics().widthPixels;
        } else {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
    }

    public static void a(int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26196df8", new Object[]{new Integer(i), new Integer(i2), new Float(f)});
            return;
        }
        f16093a = i;
        b = i2;
        c = f;
    }
}
