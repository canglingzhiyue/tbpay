package com.alipay.mobile.security.bio.utils;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DisplayUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Point getScreenMetrics(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("52cd1eb9", new Object[]{context});
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        BioLog.i("Screen---Width = " + i + " Height = " + i2 + " densityDpi = " + displayMetrics.densityDpi);
        return new Point(i, i2);
    }

    public static float getScreenRate(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3541ccef", new Object[]{context})).floatValue();
        }
        Point screenMetrics = getScreenMetrics(context);
        return screenMetrics.y / screenMetrics.x;
    }

    public static int dip2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2dip(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64b9c813", new Object[]{context, new Float(f)})).intValue() : (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
