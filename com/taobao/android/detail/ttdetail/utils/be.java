package com.taobao.android.detail.ttdetail.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class be {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1106270008);
    }

    public static void a(Window window, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d90664", new Object[]{window, new Integer(i)});
        } else if (Build.VERSION.SDK_INT < 21 || window == null) {
        } else {
            window.setNavigationBarColor(i);
        }
    }

    public static boolean a(Context context, Window window) {
        if (window == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21 || Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        if (ba.b()) {
            Class<?> cls = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            cls.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls);
            window.getClass().getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
            return true;
        }
        if (ba.c()) {
            Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
            return true;
        }
        return false;
    }

    public static boolean a(Context context, Window window, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1737431", new Object[]{context, window, new Boolean(z)})).booleanValue();
        }
        if (window == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            try {
                if (z) {
                    window.clearFlags(201326592);
                    window.getDecorView().setSystemUiVisibility(systemUiVisibility | 9472);
                    window.addFlags(Integer.MIN_VALUE);
                } else {
                    window.clearFlags(201334784);
                    window.getDecorView().setSystemUiVisibility(systemUiVisibility | 1280);
                    window.addFlags(Integer.MIN_VALUE);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            window.setStatusBarColor(0);
        } else if (Build.VERSION.SDK_INT >= 19) {
            window.addFlags(67108864);
        }
        if (ba.b()) {
            ba.a(window, z);
        } else if (ba.c()) {
            ba.a(context, window, z);
        }
        return true;
    }
}
