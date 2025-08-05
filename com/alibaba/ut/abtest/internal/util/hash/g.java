package com.alibaba.ut.abtest.internal.util.hash;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1265977411);
    }

    public static int a(byte b) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8217947", new Object[]{new Byte(b)})).intValue() : b & 255;
    }
}
