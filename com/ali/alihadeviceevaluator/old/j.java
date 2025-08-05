package com.ali.alihadeviceevaluator.old;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f1810a = 48;
    public int b = 48;

    public int a(HardWareInfo hardWareInfo) {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5aea3420", new Object[]{this, hardWareInfo})).intValue();
        }
        if (this.f1810a <= 0) {
            this.f1810a = 48;
        }
        if (this.b <= 0) {
            this.b = 24;
        }
        int i3 = this.f1810a;
        if (i3 >= 220) {
            i = 10;
        } else if (i3 >= 100) {
            i = 9;
        } else {
            if (i3 < 80) {
                if (i3 >= 48) {
                    i = 6;
                } else if (i3 >= 24) {
                    i = 5;
                } else if (i3 >= 10) {
                    i = 2;
                } else if (i3 >= 5) {
                    i = 1;
                }
            }
            i = 8;
        }
        int i4 = (this.b * 100) / this.f1810a;
        if (i4 >= 80) {
            i2 = 10;
        } else if (i4 >= 70) {
            i2 = 9;
        } else if (i4 >= 60) {
            i2 = 8;
        } else if (i4 >= 50) {
            i2 = 7;
        } else if (i4 >= 40) {
            i2 = 6;
        } else if (i4 >= 30) {
            i2 = 5;
        } else if (i4 >= 20) {
            i2 = 4;
        } else if (i4 >= 10) {
            i2 = 3;
        } else if (i4 >= 5) {
            i2 = 2;
        } else if (i4 > 0) {
            i2 = 1;
        }
        return (i + i2) / 2;
    }
}
