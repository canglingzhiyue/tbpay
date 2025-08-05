package com.taobao.android.litecreator.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.tao.Globals;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes5.dex */
public class ap {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f13488a;
    private static int b;

    static {
        kge.a(949203927);
    }

    public static void a(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb445a", new Object[]{activity, new Boolean(z)});
            return;
        }
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        if (z) {
            window.addFlags(128);
        } else {
            window.clearFlags(128);
        }
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        boolean b2 = com.taobao.android.autosize.l.b(Globals.getApplication());
        boolean d = com.taobao.android.autosize.l.d(Globals.getApplication());
        if (b2 || d) {
            return h.a().a(context);
        }
        if (f13488a == 0) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            Configuration configuration = resources.getConfiguration();
            f13488a = configuration.orientation == 1 ? displayMetrics.widthPixels : displayMetrics.heightPixels;
            b = configuration.orientation == 1 ? displayMetrics.heightPixels : displayMetrics.widthPixels;
        }
        int i = f13488a;
        if (i <= 0) {
            return 720;
        }
        return i;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        if (b == 0) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            Configuration configuration = resources.getConfiguration();
            f13488a = configuration.orientation == 1 ? displayMetrics.widthPixels : displayMetrics.heightPixels;
            b = configuration.orientation == 1 ? displayMetrics.heightPixels : displayMetrics.widthPixels;
        }
        int i = b;
        if (i <= 0) {
            return 1280;
        }
        return i;
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        if (!context.getTheme().resolveAttribute(16843499, new TypedValue(), true)) {
            return 0;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16843499});
        int dimension = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        return dimension;
    }

    public static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0236730", new Object[]{context})).intValue();
        }
        try {
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier <= 0) {
                return 0;
            }
            return context.getResources().getDimensionPixelSize(identifier);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{activity})).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{activity})).booleanValue() : (activity.getWindow().getDecorView().getSystemUiVisibility() & 1024) == 1024 && (activity.getWindow().getDecorView().getSystemUiVisibility() & 256) == 256;
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0d012cf", new Object[]{context})).intValue();
        }
        try {
            int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier <= 0) {
                return 0;
            }
            return context.getResources().getDimensionPixelSize(identifier);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static void b(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8c4bb9", new Object[]{activity, new Boolean(z)});
        } else {
            a(activity, 0, z);
        }
    }

    public static void a(Activity activity, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca63f6b", new Object[]{activity, new Integer(i), new Boolean(z)});
            return;
        }
        c(activity);
        a(activity.getWindow(), z);
        b(activity.getWindow(), z);
        activity.getWindow().clearFlags(67108864);
        activity.getWindow().setStatusBarColor(i);
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        if (Build.VERSION.SDK_INT < 23 || !z) {
            return;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 8192);
    }

    public static void d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27d57fd", new Object[]{activity});
        } else {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() & (-1025) & (-257));
        }
    }

    public static void b(Activity activity, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f623ec", new Object[]{activity, new Integer(i), new Boolean(z)});
            return;
        }
        a(activity.getWindow(), z);
        b(activity.getWindow(), z);
        View decorView = activity.getWindow().getDecorView();
        if (Build.VERSION.SDK_INT >= 23 && z) {
            decorView.setSystemUiVisibility(8192);
        }
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        activity.getWindow().setStatusBarColor(i);
    }

    public static void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792c473c", new Object[]{activity});
        } else if (!(activity instanceof AppCompatActivity) || ((AppCompatActivity) activity).getSupportActionBar() == null) {
        } else {
            try {
                ((AppCompatActivity) activity).getSupportActionBar().e();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb0489", new Object[]{activity, new Integer(i)});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            activity.getWindow().setNavigationBarColor(i);
        }
    }

    public static boolean a(Window window, boolean z) {
        if (window != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
                if (z) {
                    method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
                } else {
                    method.invoke(window, 0, Integer.valueOf(i));
                }
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean b(Window window, boolean z) {
        if (window != null) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i = declaredField.getInt(null);
                int i2 = declaredField2.getInt(attributes);
                declaredField2.setInt(attributes, z ? i2 | i : (~i) & i2);
                window.setAttributes(attributes);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
