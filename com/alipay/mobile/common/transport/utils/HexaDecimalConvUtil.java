package com.alipay.mobile.common.transport.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.d;
import tb.fxb;

/* loaded from: classes3.dex */
public final class HexaDecimalConvUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f5624a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', d.LEVEL_D, d.LEVEL_E, 'F', 'G', 'H', d.LEVEL_I, 'J', 'K', d.LEVEL_L, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', d.LEVEL_V, d.LEVEL_W, 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', fxb.DIR};

    public static final String c10to64(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8e28ac1e", new Object[]{new Long(j)}) : a(j, 6);
    }

    public static final long c64to10(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8e53b000", new Object[]{str})).longValue() : a(str, 6);
    }

    private static final String a(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca488059", new Object[]{new Long(j), new Integer(i)});
        }
        int pow = (int) Math.pow(2.0d, i);
        char[] cArr = new char[pow];
        long j2 = (1 << i) - 1;
        long j3 = j;
        int i2 = pow;
        do {
            i2--;
            cArr[i2] = f5624a[(int) (j3 & j2)];
            j3 >>>= i;
        } while (j3 != 0);
        return new String(cArr, i2, pow - i2);
    }

    private static final long a(String str, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad05", new Object[]{str, new Integer(i)})).longValue();
        }
        int pow = (int) Math.pow(2.0d, i);
        long j = 0;
        int length = str.length();
        int i3 = length;
        for (int i4 = 0; i4 < length; i4++) {
            j += Integer.parseInt(String.valueOf(getNum(str.substring(i4, i2)))) * ((long) Math.pow(pow, i3 - 1));
            i3--;
        }
        return j;
    }

    public static final int getNum(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38f67ad4", new Object[]{str})).intValue();
        }
        for (int i = 0; i < 64; i++) {
            if (str.equals(String.valueOf(f5624a[i]))) {
                return i;
            }
        }
        return 0;
    }
}
