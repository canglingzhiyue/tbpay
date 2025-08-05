package com.taobao.themis.utils;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.tao.util.SystemBarDecorator;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0003J \u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0007J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0007J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0003J\"\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\bH\u0003J\b\u0010\u001b\u001a\u00020\bH\u0002J\b\u0010\u001c\u001a\u00020\bH\u0002J\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0002J*\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\bH\u0007J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0002J\"\u0010\u001f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bH\u0002J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u0018\u0010%\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/taobao/themis/utils/TBSystemBarUtils;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "buildSystemUIFlag", "", DxContainerActivity.PARAMS_SHOW_STATUS_BAR, "", "showNavigationBar", "changeMeizuFlag", "winParams", "Landroid/view/WindowManager$LayoutParams;", "flagName", "on", "enableFullScreenImmersive", "", "activity", "Landroid/app/Activity;", "dark", "enableStatusBarImmersive", "enableStatusBarImmersiveAndFullScreen", "hideNavigationBar", "hideStatusBar", "innerImmersiveColor", "innerImmersiveLayout", "showHomeIndicator", "isMIUIDevice", "isMeizuDevice", "miuiSetStatusBarLightMode", "setStatusBarAndHomeIndicator", "setStatusBarDarkIcon", "flag", "view", "Landroid/view/View;", a.ATOM_EXT_window, "Landroid/view/Window;", "setStatusBarTextColor", "themis_utils_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b INSTANCE;

    @JvmStatic
    private static final int a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c194cdb", new Object[]{new Boolean(z), new Boolean(z2)})).intValue();
        }
        if (z && z2) {
            return 1024;
        }
        if (z && !z2) {
            return 1026;
        }
        return (z || !z2) ? 1030 : 1028;
    }

    static {
        kge.a(1094157807);
        INSTANCE = new b();
    }

    private b() {
    }

    @JvmStatic
    private static final void g(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa17094", new Object[]{activity, new Boolean(z)});
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = activity.getWindow();
            kotlin.jvm.internal.q.b(window, "activity.window");
            window.setStatusBarColor(0);
            Window window2 = activity.getWindow();
            kotlin.jvm.internal.q.b(window2, "activity.window");
            window2.setNavigationBarColor(0);
        } else if (Build.VERSION.SDK_INT >= 19) {
            activity.getWindow().addFlags(67108864);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (z) {
                activity.getWindow().addFlags(8192);
            } else {
                activity.getWindow().clearFlags(8192);
            }
        }
        if (INSTANCE.a()) {
            INSTANCE.d(activity, z);
        } else {
            INSTANCE.e(activity, z);
        }
    }

    @JvmStatic
    private static final void b(Activity activity, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5fdde3b", new Object[]{activity, new Boolean(z), new Boolean(z2)});
            return;
        }
        Window window = activity.getWindow();
        kotlin.jvm.internal.q.b(window, "activity.window");
        View decorView = window.getDecorView();
        kotlin.jvm.internal.q.b(decorView, "activity.window.decorView");
        decorView.setSystemUiVisibility(a(z, z2));
        if (Build.VERSION.SDK_INT >= 19) {
            Window window2 = activity.getWindow();
            kotlin.jvm.internal.q.b(window2, "activity.window");
            View decorView2 = window2.getDecorView();
            kotlin.jvm.internal.q.b(decorView2, "activity.window.decorView");
            Window window3 = activity.getWindow();
            kotlin.jvm.internal.q.b(window3, "activity.window");
            View decorView3 = window3.getDecorView();
            kotlin.jvm.internal.q.b(decorView3, "activity.window.decorView");
            decorView2.setSystemUiVisibility(decorView3.getSystemUiVisibility() | 4096);
        }
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        Window window4 = activity.getWindow();
        kotlin.jvm.internal.q.b(window4, "activity.window");
        window4.getAttributes().layoutInDisplayCutoutMode = 1;
    }

    @JvmStatic
    public static final void a(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb445a", new Object[]{activity, new Boolean(z)});
            return;
        }
        kotlin.jvm.internal.q.d(activity, "activity");
        g(activity, z);
        b(activity, false, false);
    }

    @JvmStatic
    public static final void b(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8c4bb9", new Object[]{activity, new Boolean(z)});
            return;
        }
        kotlin.jvm.internal.q.d(activity, "activity");
        g(activity, z);
        b(activity, true, false);
    }

    @JvmStatic
    public static final void c(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac5d5318", new Object[]{activity, new Boolean(z)});
            return;
        }
        kotlin.jvm.internal.q.d(activity, "activity");
        new SystemBarDecorator(activity).enableImmersiveStatusBar(z);
    }

    public static /* synthetic */ void a(Activity activity, boolean z, boolean z2, boolean z3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e35a3585", new Object[]{activity, new Boolean(z), new Boolean(z2), new Boolean(z3), new Integer(i), obj});
            return;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        a(activity, z, z2, z3);
    }

    @JvmStatic
    public static final void a(Activity activity, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("911f05a", new Object[]{activity, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        kotlin.jvm.internal.q.d(activity, "activity");
        g(activity, z);
        b(activity, z2, z3);
    }

    private final boolean d(Activity activity, boolean z) {
        if (activity == null) {
            return false;
        }
        try {
            Window window = activity.getWindow();
            Class<?> cls = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            kotlin.jvm.internal.q.b(cls, "Class.forName(\"android.v…owManager\\$LayoutParams\")");
            Field field = cls.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE");
            kotlin.jvm.internal.q.b(field, "layoutParams.getField(\"E…AG_STATUS_BAR_DARK_MODE\")");
            int i = field.getInt(cls);
            Method method = window.getClass().getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
            kotlin.jvm.internal.q.b(method, "window.javaClass.getMeth…imitiveType\n            )");
            if (z) {
                method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
            } else {
                method.invoke(window, 0, Integer.valueOf(i));
            }
            return true;
        } catch (Exception e) {
            Log.getStackTraceString(e);
            return false;
        }
    }

    private final void e(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dff61d6", new Object[]{this, activity, new Boolean(z)});
        } else {
            a(activity, z, true);
        }
    }

    private final void a(Activity activity, boolean z, boolean z2) {
        if (activity == null) {
            return;
        }
        try {
            Method method = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
            kotlin.jvm.internal.q.b(method, "Activity::class.java.get…imitiveType\n            )");
            method.invoke(activity, Boolean.valueOf(z));
        } catch (IllegalAccessException e) {
            Log.getStackTraceString(e);
        } catch (NoSuchMethodException e2) {
            Log.getStackTraceString(e2);
        } catch (InvocationTargetException e3) {
            Log.getStackTraceString(e3);
        }
    }

    private final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : kotlin.jvm.internal.q.a((Object) "Xiaomi", (Object) Build.MANUFACTURER);
    }
}
