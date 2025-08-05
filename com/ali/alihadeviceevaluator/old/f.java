package com.ali.alihadeviceevaluator.old;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f1808a = 0;
    public int b;

    public int a(HardWareInfo hardWareInfo) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5aea3420", new Object[]{this, hardWareInfo})).intValue();
        }
        int i2 = 4;
        int i3 = this.f1808a;
        if (i3 > 256) {
            i2 = 10;
        } else if (i3 >= 256) {
            i2 = 8;
        } else if (i3 >= 192) {
            i2 = 7;
        } else if (i3 >= 128) {
            i2 = 5;
        } else if (i3 >= 96) {
            i2 = 3;
        }
        int i4 = this.b;
        if (i4 >= 512) {
            i = 10;
        } else if (i4 >= 256) {
            i = 8;
        } else if (i4 >= 128) {
            i = 6;
        }
        return (i + i2) / 2;
    }
}
