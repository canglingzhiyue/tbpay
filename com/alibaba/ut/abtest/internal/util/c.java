package com.alibaba.ut.abtest.internal.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1420720800);
    }

    public static int a(long[] jArr, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27179860", new Object[]{jArr, new Long(j)})).intValue();
        }
        if (jArr == null) {
            return -1;
        }
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i] == j) {
                return i;
            }
        }
        return -1;
    }
}
