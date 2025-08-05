package com.ta.audid.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class ByteUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1003239181);
    }

    public static long getLongByByte4(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("da868c05", new Object[]{bArr})).longValue() : ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
    }
}
