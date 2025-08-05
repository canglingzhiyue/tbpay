package com.alipay.mobile.security.bio.utils;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ScreenUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int getScreenBrightness(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68e108a1", new Object[]{context})).intValue();
        }
        try {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Exception e) {
            BioLog.e(e.toString());
            return 255;
        }
    }

    public static void setScreenMode(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f32ec73", new Object[]{context, new Integer(i)});
            return;
        }
        try {
            Settings.System.putInt(context.getContentResolver(), "screen_brightness_mode", i);
        } catch (Exception e) {
            BioLog.e(e.toString());
        }
    }

    public static void saveScreenBrightness(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398905fc", new Object[]{context, new Integer(i)});
            return;
        }
        try {
            Settings.System.putInt(context.getContentResolver(), "screen_brightness", i);
        } catch (Exception e) {
            BioLog.e(e.toString());
        }
    }

    public static void setScreenBrightness(Activity activity, int i) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb207cb", new Object[]{activity, new Integer(i)});
        } else if (activity == null || (window = activity.getWindow()) == null) {
        } else {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = i / 255.0f;
            window.setAttributes(attributes);
        }
    }
}
