package com.taobao.android.autosize;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.log.TLog;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int[] a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("258f2884", new Object[]{context});
        }
        int[] iArr = new int[2];
        Arrays.fill(iArr, -1);
        if (context == null) {
            return iArr;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(a.ATOM_EXT_window);
        if (windowManager == null) {
            Log.e("windowManager", "getScreenSize: can't find window manager.");
            return iArr;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay == null) {
            Log.e("windowManager", "getScreenSize: can't find default display.");
            return iArr;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        iArr[0] = displayMetrics.widthPixels;
        iArr[1] = displayMetrics.heightPixels;
        return iArr;
    }

    public static boolean b(Context context) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            i = Settings.Global.getInt(context.getContentResolver(), "dynamic_device_characteristics");
        } catch (Exception e) {
            TLog.loge("windowManager", "isDynamicPadLayoutNeeded", e);
            i = 0;
        }
        return i == 1;
    }

    public static boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue() : activity == null || activity.isDestroyed() || activity.isFinishing() || !l.b(activity) || l.q(activity) == 2;
    }
}
