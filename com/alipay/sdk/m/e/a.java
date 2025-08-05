package com.alipay.sdk.m.e;

import com.android.alibaba.ip.runtime.IpChange;
import tb.fxb;

/* loaded from: classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f6156a = new byte[128];
    private static final char[] b = new char[64];

    static {
        int i;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < 128; i4++) {
            f6156a[i4] = -1;
        }
        for (int i5 = 90; i5 >= 65; i5--) {
            f6156a[i5] = (byte) (i5 - 65);
        }
        int i6 = 122;
        while (true) {
            i = 26;
            if (i6 < 97) {
                break;
            }
            f6156a[i6] = (byte) ((i6 - 97) + 26);
            i6--;
        }
        int i7 = 57;
        while (true) {
            i2 = 52;
            if (i7 < 48) {
                break;
            }
            f6156a[i7] = (byte) ((i7 - 48) + 52);
            i7--;
        }
        byte[] bArr = f6156a;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i8 = 0; i8 <= 25; i8++) {
            b[i8] = (char) (i8 + 65);
        }
        int i9 = 0;
        while (i <= 51) {
            b[i] = (char) (i9 + 97);
            i++;
            i9++;
        }
        while (i2 <= 61) {
            b[i2] = (char) (i3 + 48);
            i2++;
            i3++;
        }
        char[] cArr = b;
        cArr[62] = '+';
        cArr[63] = fxb.DIR;
    }

    private static boolean a(char c) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8217d19", new Object[]{new Character(c)})).booleanValue() : c == ' ' || c == '\r' || c == '\n' || c == '\t';
    }

    private static boolean b(char c) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d655b8", new Object[]{new Character(c)})).booleanValue() : c == '=';
    }

    private static boolean c(char c) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8b2e57", new Object[]{new Character(c)})).booleanValue() : c < 128 && f6156a[c] != -1;
    }

    public static byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int a2 = a(charArray);
        if (a2 % 4 != 0) {
            return null;
        }
        int i = a2 / 4;
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i * 3];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < i - 1) {
            int i5 = i3 + 1;
            char c = charArray[i3];
            if (c(c)) {
                int i6 = i5 + 1;
                char c2 = charArray[i5];
                if (c(c2)) {
                    int i7 = i6 + 1;
                    char c3 = charArray[i6];
                    if (c(c3)) {
                        int i8 = i7 + 1;
                        char c4 = charArray[i7];
                        if (c(c4)) {
                            byte[] bArr2 = f6156a;
                            byte b2 = bArr2[c];
                            byte b3 = bArr2[c2];
                            byte b4 = bArr2[c3];
                            byte b5 = bArr2[c4];
                            int i9 = i4 + 1;
                            bArr[i4] = (byte) ((b2 << 2) | (b3 >> 4));
                            int i10 = i9 + 1;
                            bArr[i9] = (byte) (((b3 & 15) << 4) | ((b4 >> 2) & 15));
                            i4 = i10 + 1;
                            bArr[i10] = (byte) ((b4 << 6) | b5);
                            i2++;
                            i3 = i8;
                        }
                    }
                }
            }
            return null;
        }
        int i11 = i3 + 1;
        char c5 = charArray[i3];
        if (!c(c5)) {
            return null;
        }
        int i12 = i11 + 1;
        char c6 = charArray[i11];
        if (!c(c6)) {
            return null;
        }
        byte[] bArr3 = f6156a;
        byte b6 = bArr3[c5];
        byte b7 = bArr3[c6];
        int i13 = i12 + 1;
        char c7 = charArray[i12];
        char c8 = charArray[i13];
        if (c(c7) && c(c8)) {
            byte b8 = bArr3[c7];
            byte b9 = bArr3[c8];
            int i14 = i4 + 1;
            bArr[i4] = (byte) ((b6 << 2) | (b7 >> 4));
            bArr[i14] = (byte) (((b7 & 15) << 4) | ((b8 >> 2) & 15));
            bArr[i14 + 1] = (byte) (b9 | (b8 << 6));
            return bArr;
        } else if (b(c7) && b(c8)) {
            if ((b7 & 15) != 0) {
                return null;
            }
            int i15 = i2 * 3;
            byte[] bArr4 = new byte[i15 + 1];
            System.arraycopy(bArr, 0, bArr4, 0, i15);
            bArr4[i4] = (byte) ((b6 << 2) | (b7 >> 4));
            return bArr4;
        } else if (b(c7) || !b(c8)) {
            return null;
        } else {
            byte b10 = bArr3[c7];
            if ((b10 & 3) != 0) {
                return null;
            }
            int i16 = i2 * 3;
            byte[] bArr5 = new byte[i16 + 2];
            System.arraycopy(bArr, 0, bArr5, 0, i16);
            bArr5[i4] = (byte) ((b6 << 2) | (b7 >> 4));
            bArr5[i4 + 1] = (byte) (((b10 >> 2) & 15) | ((b7 & 15) << 4));
            return bArr5;
        }
    }

    private static int a(char[] cArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c196ae3", new Object[]{cArr})).intValue();
        }
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!a(cArr[i2])) {
                cArr[i] = cArr[i2];
                i++;
            }
        }
        return i;
    }
}
