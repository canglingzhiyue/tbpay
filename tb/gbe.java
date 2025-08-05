package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;

/* loaded from: classes5.dex */
public class gbe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1254484452);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
        fuw.d("shandian", "navigationBarHeight " + dimensionPixelSize);
        return dimensionPixelSize;
    }

    public static boolean c(Context context) {
        int visibility;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        Activity c = fpz.c(context);
        View view = null;
        if (c != null) {
            view = c.findViewById(16908336);
        }
        return (view == null || (visibility = view.getVisibility()) == 8 || visibility == 4) ? false : true;
    }

    public static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0236730", new Object[]{context})).intValue();
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            if (!c(context)) {
                return 0;
            }
            return a(context);
        }
        return a(context);
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0d012cf", new Object[]{context})).intValue();
        }
        if (context == null) {
            return -1;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(a.ATOM_EXT_window);
        DisplayMetrics displayMetrics = null;
        if (Build.VERSION.SDK_INT >= 17) {
            displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        if (displayMetrics != null) {
            return displayMetrics.heightPixels - d(context);
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        } catch (Exception e) {
            Log.e("CommonUtils", "getStatusBarHeight error", e);
            return 0;
        }
    }
}
