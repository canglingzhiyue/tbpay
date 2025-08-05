package com.taobao.android.tbtheme.kit;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int F2COLOR;
    public static final int F2COLOR_TRANSPARENT;

    static {
        kge.a(1283076368);
        F2COLOR_TRANSPARENT = a("#00f2f2f2");
        F2COLOR = a("#fff2f2f2");
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        if (!str.isEmpty()) {
            try {
            } catch (Exception unused) {
                return 0;
            }
        }
        return Color.parseColor(str);
    }

    public static int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue() : Color.argb(i, Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    public static int a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acc0f2b9", new Object[]{bitmap})).intValue();
        }
        if (bitmap == null || bitmap.getHeight() <= 0 || bitmap.getWidth() <= 0) {
            return 0;
        }
        int height = bitmap.getHeight() - 1;
        int width = bitmap.getWidth();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < width; i5++) {
            int pixel = bitmap.getPixel(i5, height);
            i += Color.alpha(pixel);
            i2 += Color.red(pixel);
            i3 += Color.green(pixel);
            i4 += Color.blue(pixel);
        }
        return Color.argb(i / width, i2 / width, i3 / width, i4 / width);
    }
}
