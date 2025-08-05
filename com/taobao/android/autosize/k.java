package com.taobao.android.autosize;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes4.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Method f9113a;

    public static boolean a(Activity activity, boolean z) {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cabb445e", new Object[]{activity, new Boolean(z)})).booleanValue();
        }
        if (activity == null || (application = activity.getApplication()) == null) {
            return false;
        }
        boolean z2 = application.getSharedPreferences("AutoSizeNotch", 0).getBoolean("KEY_IS_NOTCH_SCREEN", false);
        if (z2 || !z) {
            return z2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (a(activity) || a((Context) activity) || c(activity) || b(activity) || a()) {
                a((Context) activity, true);
            }
        }
        return false;
    }

    private static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("AutoSizeNotch", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (!sharedPreferences.contains("KEY_IS_NOTCH_SCREEN")) {
            edit.putBoolean("KEY_IS_NOTCH_SCREEN", z);
        } else if (sharedPreferences.contains("KEY_IS_NOTCH_SCREEN") && !sharedPreferences.getBoolean("KEY_IS_NOTCH_SCREEN", false)) {
            edit.putBoolean("KEY_IS_NOTCH_SCREEN", z);
        }
        edit.apply();
    }

    private static boolean a(Activity activity) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue();
        }
        View decorView = activity.getWindow().getDecorView();
        return (decorView == null || Build.VERSION.SDK_INT < 30 || (rootWindowInsets = decorView.getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null || (boundingRects = displayCutout.getBoundingRects()) == null || boundingRects.size() <= 0) ? false : true;
    }

    private static boolean a(Context context) {
        boolean z;
        Boolean bool;
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            bool = (Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0]);
        } catch (ClassNotFoundException unused) {
            TLog.loge("hasNotchInScreenAtHuawei()-> ClassNotFoundException", new String[0]);
        } catch (NoSuchMethodException unused2) {
            TLog.loge("hasNotchInScreenAtHuawei()-> NoSuchMethodException", new String[0]);
        } catch (Exception unused3) {
            TLog.loge("hasNotchInScreenAtHuawei()-> Exception", new String[0]);
        }
        if (bool != null) {
            z = bool.booleanValue();
            TLog.loge("hasNotchInScreenAtHuawei()-> ClassNotFoundException", new String[0]);
            return z;
        }
        z = false;
        TLog.loge("hasNotchInScreenAtHuawei()-> ClassNotFoundException", new String[0]);
        return z;
    }

    private static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    private static boolean c(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (ClassNotFoundException unused) {
            TLog.loge("hasNotchInScreenAtVivo()-> ClassNotFoundException", new String[0]);
            return false;
        } catch (NoSuchMethodException unused2) {
            TLog.loge("hasNotchInScreenAtVivo()-> NoSuchMethodException", new String[0]);
            return false;
        } catch (Exception unused3) {
            TLog.loge("hasNotchInScreenAtVivo()-> Exception", new String[0]);
            return false;
        }
    }

    private static boolean a() {
        try {
            if (f9113a == null) {
                f9113a = Class.forName("android.os.SystemProperties").getMethod("getBoolean", String.class, Boolean.TYPE);
            }
            return ((Boolean) f9113a.invoke(null, "ro.miui.notch", false)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
