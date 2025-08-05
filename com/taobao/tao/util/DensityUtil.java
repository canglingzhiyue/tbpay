package com.taobao.tao.util;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class DensityUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1702626339);
    }

    public static int dip2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        if (context != null) {
            return (int) (f * context.getResources().getDisplayMetrics().density);
        }
        return 0;
    }

    public static int px2dip(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9c813", new Object[]{context, new Float(f)})).intValue();
        }
        if (context != null) {
            return (int) (f / context.getResources().getDisplayMetrics().density);
        }
        return 0;
    }

    public static int px2sp(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6ba8779", new Object[]{context, new Float(f)})).intValue();
        }
        if (context != null) {
            return (int) (f / context.getResources().getDisplayMetrics().scaledDensity);
        }
        return 0;
    }

    public static int sp2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20fc282f", new Object[]{context, new Float(f)})).intValue();
        }
        if (context != null) {
            return (int) (f * context.getResources().getDisplayMetrics().scaledDensity);
        }
        return 0;
    }
}
