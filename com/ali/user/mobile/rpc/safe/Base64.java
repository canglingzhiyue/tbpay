package com.ali.user.mobile.rpc.safe;

import com.android.alibaba.ip.runtime.IpChange;
import tb.crd;
import tb.fxb;
import tb.kge;

/* loaded from: classes2.dex */
public final class Base64 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BASELENGTH = 128;
    private static final int EIGHTBIT = 8;
    private static final int FOURBYTE = 4;
    private static final int LOOKUPLENGTH = 64;
    private static final char PAD = '=';
    private static final int SIGN = -128;
    private static final int SIXTEENBIT = 16;
    private static final int TWENTYFOURBITGROUP = 24;
    private static final byte[] base64Alphabet;
    private static final boolean fDebug = false;
    private static final char[] lookUpBase64Alphabet;

    private static boolean isPad(char c) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fbb7c371", new Object[]{new Character(c)})).booleanValue() : c == '=';
    }

    private static boolean isWhiteSpace(char c) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5664e613", new Object[]{new Character(c)})).booleanValue() : c == ' ' || c == '\r' || c == '\n' || c == '\t';
    }

    static {
        int i;
        int i2;
        kge.a(1453074143);
        base64Alphabet = new byte[128];
        lookUpBase64Alphabet = new char[64];
        int i3 = 0;
        for (int i4 = 0; i4 < 128; i4++) {
            base64Alphabet[i4] = -1;
        }
        for (int i5 = 90; i5 >= 65; i5--) {
            base64Alphabet[i5] = (byte) (i5 - 65);
        }
        int i6 = 122;
        while (true) {
            i = 26;
            if (i6 < 97) {
                break;
            }
            base64Alphabet[i6] = (byte) ((i6 - 97) + 26);
            i6--;
        }
        int i7 = 57;
        while (true) {
            i2 = 52;
            if (i7 < 48) {
                break;
            }
            base64Alphabet[i7] = (byte) ((i7 - 48) + 52);
            i7--;
        }
        byte[] bArr = base64Alphabet;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i8 = 0; i8 <= 25; i8++) {
            lookUpBase64Alphabet[i8] = (char) (i8 + 65);
        }
        int i9 = 0;
        while (i <= 51) {
            lookUpBase64Alphabet[i] = (char) (i9 + 97);
            i++;
            i9++;
        }
        while (i2 <= 61) {
            lookUpBase64Alphabet[i2] = (char) (i3 + 48);
            i2++;
            i3++;
        }
        char[] cArr = lookUpBase64Alphabet;
        cArr[62] = '+';
        cArr[63] = fxb.DIR;
    }

    private static boolean isData(char c) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2dbef566", new Object[]{new Character(c)})).booleanValue() : c < 128 && base64Alphabet[c] != -1;
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
            byte b = bArr[i4];
            int i7 = i6 + 1;
            byte b2 = bArr[i6];
            int i8 = i7 + 1;
            byte b3 = bArr[i7];
            byte b4 = (byte) (b2 & 15);
            byte b5 = (byte) (b & 3);
            byte b6 = (byte) ((b & Byte.MIN_VALUE) == 0 ? b >> 2 : (b >> 2) ^ crd.DETECT_WIDTH);
            byte b7 = (byte) ((b2 & Byte.MIN_VALUE) == 0 ? b2 >> 4 : (b2 >> 4) ^ 240);
            int i9 = (b3 & Byte.MIN_VALUE) == 0 ? b3 >> 6 : (b3 >> 6) ^ 252;
            int i10 = i5 + 1;
            char[] cArr2 = lookUpBase64Alphabet;
            cArr[i5] = cArr2[b6];
            int i11 = i10 + 1;
            cArr[i10] = cArr2[(b5 << 4) | b7];
            int i12 = i11 + 1;
            cArr[i11] = cArr2[(b4 << 2) | ((byte) i9)];
            cArr[i12] = cArr2[b3 & 63];
            i++;
            i5 = i12 + 1;
            i4 = i8;
        }
        if (i2 == 8) {
            byte b8 = bArr[i4];
            byte b9 = (byte) (b8 & 3);
            int i13 = (b8 & Byte.MIN_VALUE) == 0 ? b8 >> 2 : (b8 >> 2) ^ crd.DETECT_WIDTH;
            int i14 = i5 + 1;
            char[] cArr3 = lookUpBase64Alphabet;
            cArr[i5] = cArr3[(byte) i13];
            int i15 = i14 + 1;
            cArr[i14] = cArr3[b9 << 4];
            cArr[i15] = PAD;
            cArr[i15 + 1] = PAD;
        } else if (i2 == 16) {
            byte b10 = bArr[i4];
            byte b11 = bArr[i4 + 1];
            byte b12 = (byte) (b11 & 15);
            byte b13 = (byte) (b10 & 3);
            byte b14 = (byte) ((b10 & Byte.MIN_VALUE) == 0 ? b10 >> 2 : (b10 >> 2) ^ crd.DETECT_WIDTH);
            int i16 = (b11 & Byte.MIN_VALUE) == 0 ? b11 >> 4 : (b11 >> 4) ^ 240;
            int i17 = i5 + 1;
            char[] cArr4 = lookUpBase64Alphabet;
            cArr[i5] = cArr4[b14];
            int i18 = i17 + 1;
            cArr[i17] = cArr4[((byte) i16) | (b13 << 4)];
            cArr[i18] = cArr4[b12 << 2];
            cArr[i18 + 1] = PAD;
        }
        return new String(cArr);
    }

    public static byte[] decode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("31493abe", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int removeWhiteSpace = removeWhiteSpace(charArray);
        if (removeWhiteSpace % 4 != 0) {
            return null;
        }
        int i = removeWhiteSpace / 4;
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
            if (isData(c)) {
                int i6 = i5 + 1;
                char c2 = charArray[i5];
                if (isData(c2)) {
                    int i7 = i6 + 1;
                    char c3 = charArray[i6];
                    if (isData(c3)) {
                        int i8 = i7 + 1;
                        char c4 = charArray[i7];
                        if (isData(c4)) {
                            byte[] bArr2 = base64Alphabet;
                            byte b = bArr2[c];
                            byte b2 = bArr2[c2];
                            byte b3 = bArr2[c3];
                            byte b4 = bArr2[c4];
                            int i9 = i4 + 1;
                            bArr[i4] = (byte) ((b << 2) | (b2 >> 4));
                            int i10 = i9 + 1;
                            bArr[i9] = (byte) (((b2 & 15) << 4) | ((b3 >> 2) & 15));
                            i4 = i10 + 1;
                            bArr[i10] = (byte) ((b3 << 6) | b4);
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
        if (!isData(c5)) {
            return null;
        }
        int i12 = i11 + 1;
        char c6 = charArray[i11];
        if (!isData(c6)) {
            return null;
        }
        byte[] bArr3 = base64Alphabet;
        byte b5 = bArr3[c5];
        byte b6 = bArr3[c6];
        int i13 = i12 + 1;
        char c7 = charArray[i12];
        char c8 = charArray[i13];
        if (!isData(c7) || !isData(c8)) {
            if (isPad(c7) && isPad(c8)) {
                if ((b6 & 15) != 0) {
                    return null;
                }
                int i14 = i2 * 3;
                byte[] bArr4 = new byte[i14 + 1];
                System.arraycopy(bArr, 0, bArr4, 0, i14);
                bArr4[i4] = (byte) ((b5 << 2) | (b6 >> 4));
                return bArr4;
            } else if (isPad(c7) || !isPad(c8)) {
                return null;
            } else {
                byte b7 = base64Alphabet[c7];
                if ((b7 & 3) != 0) {
                    return null;
                }
                int i15 = i2 * 3;
                byte[] bArr5 = new byte[i15 + 2];
                System.arraycopy(bArr, 0, bArr5, 0, i15);
                bArr5[i4] = (byte) ((b5 << 2) | (b6 >> 4));
                bArr5[i4 + 1] = (byte) (((b7 >> 2) & 15) | ((b6 & 15) << 4));
                return bArr5;
            }
        }
        byte[] bArr6 = base64Alphabet;
        byte b8 = bArr6[c7];
        byte b9 = bArr6[c8];
        int i16 = i4 + 1;
        bArr[i4] = (byte) ((b5 << 2) | (b6 >> 4));
        bArr[i16] = (byte) (((b6 & 15) << 4) | ((b8 >> 2) & 15));
        bArr[i16 + 1] = (byte) (b9 | (b8 << 6));
        return bArr;
    }

    private static int removeWhiteSpace(char[] cArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5101883", new Object[]{cArr})).intValue();
        }
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!isWhiteSpace(cArr[i2])) {
                cArr[i] = cArr[i2];
                i++;
            }
        }
        return i;
    }
}
