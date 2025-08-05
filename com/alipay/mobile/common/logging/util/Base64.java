package com.alipay.mobile.common.logging.util;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import tb.crd;
import tb.fxb;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public final class Base64 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f5457a = new byte[128];
    private static final char[] b = new char[64];

    private static boolean a(char c) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8217d19", new Object[]{new Character(c)})).booleanValue() : c == '=';
    }

    static {
        int i;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < 128; i4++) {
            f5457a[i4] = -1;
        }
        for (int i5 = 90; i5 >= 65; i5--) {
            f5457a[i5] = (byte) (i5 - 65);
        }
        int i6 = 122;
        while (true) {
            i = 26;
            if (i6 < 97) {
                break;
            }
            f5457a[i6] = (byte) ((i6 - 97) + 26);
            i6--;
        }
        int i7 = 57;
        while (true) {
            i2 = 52;
            if (i7 < 48) {
                break;
            }
            f5457a[i7] = (byte) ((i7 - 48) + 52);
            i7--;
        }
        byte[] bArr = f5457a;
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

    private static boolean b(char c) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d655b8", new Object[]{new Character(c)})).booleanValue() : c < 128 && f5457a[c] != -1;
    }

    public static String encode(byte[] bArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9bd317fc", new Object[]{bArr});
        }
        if (bArr == null) {
            return null;
        }
        int length = bArr.length << 3;
        if (length == 0) {
            return "";
        }
        int i2 = length % 24;
        int i3 = length / 24;
        char[] cArr = new char[(i2 != 0 ? i3 + 1 : i3) << 2];
        int i4 = 0;
        int i5 = 0;
        while (i < i3) {
            int i6 = i4 + 1;
            byte b2 = bArr[i4];
            int i7 = i6 + 1;
            byte b3 = bArr[i6];
            int i8 = i7 + 1;
            byte b4 = bArr[i7];
            byte b5 = (byte) (b3 & 15);
            byte b6 = (byte) (b2 & 3);
            byte b7 = (byte) ((b2 & Byte.MIN_VALUE) == 0 ? b2 >> 2 : (b2 >> 2) ^ crd.DETECT_WIDTH);
            byte b8 = (byte) ((b3 & Byte.MIN_VALUE) == 0 ? b3 >> 4 : (b3 >> 4) ^ 240);
            int i9 = (b4 & Byte.MIN_VALUE) == 0 ? b4 >> 6 : (b4 >> 6) ^ 252;
            int i10 = i5 + 1;
            char[] cArr2 = b;
            cArr[i5] = cArr2[b7];
            int i11 = i10 + 1;
            cArr[i10] = cArr2[(b6 << 4) | b8];
            int i12 = i11 + 1;
            cArr[i11] = cArr2[(b5 << 2) | ((byte) i9)];
            cArr[i12] = cArr2[b4 & 63];
            i++;
            i5 = i12 + 1;
            i4 = i8;
        }
        if (i2 == 8) {
            byte b9 = bArr[i4];
            byte b10 = (byte) (b9 & 3);
            int i13 = (b9 & Byte.MIN_VALUE) == 0 ? b9 >> 2 : (b9 >> 2) ^ crd.DETECT_WIDTH;
            int i14 = i5 + 1;
            char[] cArr3 = b;
            cArr[i5] = cArr3[(byte) i13];
            int i15 = i14 + 1;
            cArr[i14] = cArr3[b10 << 4];
            cArr[i15] = '=';
            cArr[i15 + 1] = '=';
        } else if (i2 == 16) {
            byte b11 = bArr[i4];
            byte b12 = bArr[i4 + 1];
            byte b13 = (byte) (b12 & 15);
            byte b14 = (byte) (b11 & 3);
            byte b15 = (byte) ((b11 & Byte.MIN_VALUE) == 0 ? b11 >> 2 : (b11 >> 2) ^ crd.DETECT_WIDTH);
            int i16 = (b12 & Byte.MIN_VALUE) == 0 ? b12 >> 4 : (b12 >> 4) ^ 240;
            int i17 = i5 + 1;
            char[] cArr4 = b;
            cArr[i5] = cArr4[b15];
            int i18 = i17 + 1;
            cArr[i17] = cArr4[((byte) i16) | (b14 << 4)];
            cArr[i18] = cArr4[b13 << 2];
            cArr[i18 + 1] = '=';
        }
        return new String(cArr);
    }

    public static byte[] decode(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("31493abe", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        if (charArray == null) {
            i = 0;
        } else {
            int length = charArray.length;
            i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char c = charArray[i2];
                if (!(c == ' ' || c == '\r' || c == '\n' || c == '\t')) {
                    charArray[i] = charArray[i2];
                    i++;
                }
            }
        }
        if (i % 4 != 0) {
            return null;
        }
        int i3 = i / 4;
        if (i3 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i3 * 3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i3 - 1) {
            int i7 = i5 + 1;
            char c2 = charArray[i5];
            if (b(c2)) {
                int i8 = i7 + 1;
                char c3 = charArray[i7];
                if (b(c3)) {
                    int i9 = i8 + 1;
                    char c4 = charArray[i8];
                    if (b(c4)) {
                        int i10 = i9 + 1;
                        char c5 = charArray[i9];
                        if (b(c5)) {
                            byte[] bArr2 = f5457a;
                            byte b2 = bArr2[c2];
                            byte b3 = bArr2[c3];
                            byte b4 = bArr2[c4];
                            byte b5 = bArr2[c5];
                            int i11 = i6 + 1;
                            bArr[i6] = (byte) ((b2 << 2) | (b3 >> 4));
                            int i12 = i11 + 1;
                            bArr[i11] = (byte) (((b3 & 15) << 4) | ((b4 >> 2) & 15));
                            i6 = i12 + 1;
                            bArr[i12] = (byte) ((b4 << 6) | b5);
                            i4++;
                            i5 = i10;
                        }
                    }
                }
            }
            return null;
        }
        int i13 = i5 + 1;
        char c6 = charArray[i5];
        if (!b(c6)) {
            return null;
        }
        int i14 = i13 + 1;
        char c7 = charArray[i13];
        if (!b(c7)) {
            return null;
        }
        byte[] bArr3 = f5457a;
        byte b6 = bArr3[c6];
        byte b7 = bArr3[c7];
        int i15 = i14 + 1;
        char c8 = charArray[i14];
        char c9 = charArray[i15];
        if (!b(c8) || !b(c9)) {
            if (a(c8) && a(c9)) {
                if ((b7 & 15) != 0) {
                    return null;
                }
                int i16 = i4 * 3;
                byte[] bArr4 = new byte[i16 + 1];
                System.arraycopy(bArr, 0, bArr4, 0, i16);
                bArr4[i6] = (byte) ((b6 << 2) | (b7 >> 4));
                return bArr4;
            } else if (a(c8) || !a(c9)) {
                return null;
            } else {
                byte b8 = f5457a[c8];
                if ((b8 & 3) != 0) {
                    return null;
                }
                int i17 = i4 * 3;
                byte[] bArr5 = new byte[i17 + 2];
                System.arraycopy(bArr, 0, bArr5, 0, i17);
                bArr5[i6] = (byte) ((b6 << 2) | (b7 >> 4));
                bArr5[i6 + 1] = (byte) (((b8 >> 2) & 15) | ((b7 & 15) << 4));
                return bArr5;
            }
        }
        byte[] bArr6 = f5457a;
        byte b9 = bArr6[c8];
        byte b10 = bArr6[c9];
        int i18 = i6 + 1;
        bArr[i6] = (byte) ((b6 << 2) | (b7 >> 4));
        bArr[i18] = (byte) (((b7 & 15) << 4) | ((b9 >> 2) & 15));
        bArr[i18 + 1] = (byte) (b10 | (b9 << 6));
        return bArr;
    }
}
