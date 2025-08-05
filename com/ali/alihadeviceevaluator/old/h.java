package com.ali.alihadeviceevaluator.old;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public int a(HardWareInfo hardWareInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5aea3420", new Object[]{this, hardWareInfo})).intValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return 10;
        }
        if (i >= 24) {
            return 9;
        }
        if (i >= 23) {
            return 8;
        }
        if (i >= 21) {
            return 7;
        }
        if (i >= 19) {
            return 5;
        }
        if (i >= 18) {
            return 4;
        }
        if (i >= 17) {
            return 3;
        }
        return i >= 16 ? 2 : 1;
    }
}
