package com.alipay.zoloz.hardware.camera.utils;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ImageUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Rect cropImage(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("92cd1f3b", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        float f = i / i2;
        float f2 = i3 / i4;
        Rect rect = new Rect();
        if (f >= f2) {
            int i5 = (i3 * i2) / i4;
            rect.left = (i - i5) / 2;
            rect.right = rect.left + i5;
            rect.top = 0;
            rect.bottom = i2;
        } else {
            rect.left = 0;
            rect.right = i;
            int i6 = (i4 * i) / i3;
            rect.top = (i2 - i6) / 2;
            rect.bottom = rect.top + i6;
        }
        return rect;
    }
}
