package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class Util {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    public static int reverseBytesInt(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c5b2a89", new Object[]{new Integer(i)})).intValue() : ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static long reverseBytesLong(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("77dd7d6c", new Object[]{new Long(j)})).longValue() : ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static short reverseBytesShort(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4973e570", new Object[]{new Short(s)})).shortValue();
        }
        int i = s & 65535;
        return (short) (((i & 255) << 8) | ((i >>> 8) & 255));
    }

    private Util() {
    }

    public static void checkOffsetAndCount(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4296aa", new Object[]{new Long(j), new Long(j2), new Long(j3)});
        } else if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
        } else {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    public static void sneakyRethrow(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("380b90a0", new Object[]{th});
            return;
        }
        throw th;
    }
}
