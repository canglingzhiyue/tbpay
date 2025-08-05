package com.alibaba.ut.abtest.internal.util.hash;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1426113326);
    }

    public static long a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938f", new Object[]{new Integer(i)})).longValue() : i & 4294967295L;
    }
}
