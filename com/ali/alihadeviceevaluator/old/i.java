package com.ali.alihadeviceevaluator.old;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public int a(HardWareInfo hardWareInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5aea3420", new Object[]{this, hardWareInfo})).intValue();
        }
        if (hardWareInfo == null) {
            return 0;
        }
        if (hardWareInfo.k == 0 || hardWareInfo.l == 0) {
            return 5;
        }
        float f = 8.0f;
        float f2 = hardWareInfo.m <= 1.4f ? 1.0f : hardWareInfo.m <= 1.5f ? 2.0f : hardWareInfo.m <= 2.0f ? 4.0f : hardWareInfo.m <= 2.5f ? 6.0f : hardWareInfo.m <= 3.0f ? 8.0f : hardWareInfo.m <= 3.5f ? 9.0f : 10.0f;
        int i = hardWareInfo.k * hardWareInfo.l;
        if (i >= 8847360) {
            f = 10.0f;
        } else if (i >= 3686400) {
            f = 9.0f;
        } else if (i <= 2073600) {
            f = i == 2073600 ? 7.0f : i > 921600 ? 6.0f : i >= 921600 ? 4.0f : i >= 786432 ? 3.0f : i >= 614400 ? 2.0f : 1.0f;
        }
        return Math.round((f2 + f) / 2.0f);
    }
}
