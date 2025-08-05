package com.taobao.login4android.ab;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public final class MurmurHash3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-72597771);
    }

    private static int fmix32(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8003d06f", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = i ^ i2;
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return i5 ^ (i5 >>> 16);
    }

    private MurmurHash3() {
    }

    public static int hash32(long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("db46ad67", new Object[]{new Long(j), new Long(j2)})).intValue() : hash32(j, j2, 104729);
    }

    public static int hash32(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bcc03343", new Object[]{new Long(j)})).intValue() : hash32(j, 104729);
    }

    public static int hash32(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db46a9a6", new Object[]{new Long(j), new Integer(i)})).intValue();
        }
        long reverseBytes = Long.reverseBytes(j);
        return fmix32(8, mix32((int) (reverseBytes >>> 32), mix32((int) reverseBytes, i)));
    }

    public static int hash32(long j, long j2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d8f7402", new Object[]{new Long(j), new Long(j2), new Integer(i)})).intValue();
        }
        long reverseBytes = Long.reverseBytes(j);
        long reverseBytes2 = Long.reverseBytes(j2);
        return fmix32(16, mix32((int) (reverseBytes2 >>> 32), mix32((int) reverseBytes2, mix32((int) (reverseBytes >>> 32), mix32((int) reverseBytes, i)))));
    }

    public static int hash32(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("db4e49ae", new Object[]{bArr})).intValue() : hash32(bArr, 0, bArr.length, 104729);
    }

    public static int hash32(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9dbc96b1", new Object[]{str})).intValue();
        }
        byte[] bytes = str.getBytes();
        return hash32(bytes, 0, bytes.length, 104729);
    }

    public static int hash32(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8e7b609b", new Object[]{bArr, new Integer(i)})).intValue() : hash32(bArr, i, 104729);
    }

    public static int hash32(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("40f1274e", new Object[]{bArr, new Integer(i), new Integer(i2)})).intValue() : hash32(bArr, 0, i, i2);
    }

    public static int hash32(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd3436fb", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int i5 = i2 >> 2;
        int i6 = i3;
        for (int i7 = 0; i7 < i5; i7++) {
            int i8 = (i7 << 2) + i;
            i6 = mix32(((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16), i6);
        }
        int i9 = i5 << 2;
        int i10 = i2 - i9;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    i4 = 0 ^ (bArr[(i + i9) + 2] << 16);
                }
                return fmix32(i2, i6);
            }
            i4 ^= bArr[(i + i9) + 1] << 8;
        }
        i6 ^= Integer.rotateLeft((bArr[i + i9] ^ i4) * (-862048943), 15) * 461845907;
        return fmix32(i2, i6);
    }

    private static int mix32(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6f3bec95", new Object[]{new Integer(i), new Integer(i2)})).intValue() : (Integer.rotateLeft((Integer.rotateLeft(i * (-862048943), 15) * 461845907) ^ i2, 13) * 5) - 430675100;
    }
}
