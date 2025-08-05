package com.alibaba.ut.abtest.internal.util.hash;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-823407299);
    }

    public static int a(byte b, byte b2, byte b3, byte b4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("90be475b", new Object[]{new Byte(b), new Byte(b2), new Byte(b3), new Byte(b4)})).intValue() : (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }
}
