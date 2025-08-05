package com.ali.alihadeviceevaluator.old;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f1809a = 2.0f;

    public int a(HardWareInfo hardWareInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5aea3420", new Object[]{this, hardWareInfo})).intValue();
        }
        float f = this.f1809a;
        if (f > 4.0d) {
            return 10;
        }
        if (f >= 4.0d) {
            return 9;
        }
        if (f >= 3.2d) {
            return 8;
        }
        if (f >= 3.1d) {
            return 7;
        }
        if (f >= 3.0d) {
            return 6;
        }
        return ((double) f) >= 2.0d ? 3 : 8;
    }
}
