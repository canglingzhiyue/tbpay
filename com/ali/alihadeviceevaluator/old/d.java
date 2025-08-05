package com.ali.alihadeviceevaluator.old;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public int a(HardWareInfo hardWareInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5aea3420", new Object[]{this, hardWareInfo})).intValue();
        }
        if (hardWareInfo == null) {
            return 0;
        }
        if (hardWareInfo.c >= 16) {
            return 10;
        }
        if (hardWareInfo.c >= 8) {
            return 9;
        }
        if (hardWareInfo.c >= 6) {
            return 8;
        }
        if (hardWareInfo.c >= 4) {
            return 6;
        }
        return hardWareInfo.c >= 2 ? 4 : 2;
    }
}
