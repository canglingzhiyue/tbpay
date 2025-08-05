package com.alipay.mobile.security.bio.utils;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class GyroUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static double getDeviceAngle(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98c8a45c", new Object[]{new Float(f), new Float(f2)})).doubleValue();
        }
        double sqrt = f / Math.sqrt((f2 * f2) + (f * f));
        double d = -1.0d;
        if (sqrt > 1.0d) {
            d = 1.0d;
        } else if (sqrt >= -1.0d) {
            d = sqrt;
        }
        double acos = Math.acos(d);
        if (f2 < 0.0f) {
            acos = 6.283185307179586d - acos;
        }
        return (acos * 360.0d) / 6.283185307179586d;
    }
}
