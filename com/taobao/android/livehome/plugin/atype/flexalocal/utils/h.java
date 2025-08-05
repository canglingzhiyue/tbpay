package com.taobao.android.livehome.plugin.atype.flexalocal.utils;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.ien;
import tb.kge;
import tb.mfj;

/* loaded from: classes6.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f14222a;

    static {
        kge.a(1524787224);
        f14222a = h.class.getSimpleName();
    }

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
        } else if (Build.VERSION.SDK_INT >= 21) {
            Window window = activity.getWindow();
            window.clearFlags(67108864);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else if (Build.VERSION.SDK_INT < 19) {
        } else {
            activity.getWindow().setFlags(67108864, 67108864);
        }
    }

    public static void a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb0489", new Object[]{activity, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(activity.getResources().getColor(i));
        } else if (Build.VERSION.SDK_INT < 19) {
        } else {
            a(activity);
            ien ienVar = new ien(activity);
            ienVar.a(true);
            ienVar.a(i);
        }
    }

    public static void a(Activity activity, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cadb9e9", new Object[]{activity, new Boolean(z), new Integer(i)});
        } else if (activity == null) {
        } else {
            if (!z) {
                a(activity, i);
                return;
            }
            a(activity, i);
            if (Build.VERSION.SDK_INT < 19) {
                return;
            }
            if (f.b(activity.getApplicationContext())) {
                b(activity, z);
            } else if (f.a(activity.getApplicationContext())) {
                a(activity, z);
            } else if (Build.VERSION.SDK_INT >= 23) {
                Window window = activity.getWindow();
                window.addFlags(Integer.MIN_VALUE);
                window.clearFlags(67108864);
                window.getDecorView().setSystemUiVisibility(9472);
            } else {
                mfj.c(f14222a, "setStatusBarMode: system is 4.4 ~ 6.0.");
            }
        }
    }

    private static boolean a(Activity activity, boolean z) {
        Window window = activity.getWindow();
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
            } catch (Throwable th) {
                mfj.a(f14222a, "setFlymeStatusBarTextMode exp.", th);
            }
        }
        return false;
    }

    private static boolean b(Activity activity, boolean z) {
        Window window = activity.getWindow();
        boolean z2 = true;
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
            } catch (Throwable th) {
                th = th;
                z2 = false;
            }
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    if (z) {
                        activity.getWindow().getDecorView().setSystemUiVisibility(9216);
                    } else {
                        activity.getWindow().getDecorView().setSystemUiVisibility(0);
                    }
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
                String str = f14222a;
                mfj.a(str, "setMIUIStatusBarTextMode isDark=" + z, th);
                return z2;
            }
        }
        return false;
    }
}
