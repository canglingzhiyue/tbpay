package com.alipay.android.msp.utils;

import android.app.Activity;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class StatusBarUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_STATUS_BAR_ALPHA = 112;

    private static int calculateStatusColor(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0f63a25", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 == 0) {
            return i;
        }
        float f = 1.0f - (i2 / 255.0f);
        return ((int) (((i & 255) * f) + 0.5d)) | (((int) ((((i >> 16) & 255) * f) + 0.5d)) << 16) | (-16777216) | (((int) ((((i >> 8) & 255) * f) + 0.5d)) << 8);
    }

    public static void setColor(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7503cc9", new Object[]{activity, new Integer(i)});
        } else {
            setColor(activity, i, 112);
        }
    }

    public static void setColor(Activity activity, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b7cf5a", new Object[]{activity, new Integer(i), new Integer(i2)});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            activity.getWindow().clearFlags(67108864);
            activity.getWindow().setStatusBarColor(calculateStatusColor(i, i2));
        }
    }
}
