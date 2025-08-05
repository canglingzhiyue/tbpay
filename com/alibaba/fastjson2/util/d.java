package com.alibaba.fastjson2.util;

import com.uc.webview.export.extension.UCExtension;
import java.io.Closeable;
import java.util.Arrays;
import tb.crd;
import tb.gbx;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class d {
    public static final int[] DIGITS_K;
    public static final short[] PACKED_DIGITS;
    public static final int[] PACKED_DIGITS_UTF16;

    /* renamed from: a  reason: collision with root package name */
    static final int[] f3033a;
    static final char[] b;
    static final int[] c;
    private static final byte[] d;
    private static final char[] e;
    private static final byte[] f;

    static {
        kge.a(-708043904);
        f3033a = new int[]{9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, DateUtils.MAX_VALUE, Integer.MAX_VALUE};
        DIGITS_K = new int[1000];
        d = "-2147483648".getBytes();
        e = "-2147483648".toCharArray();
        f = "-9223372036854775808".getBytes();
        b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        c = new int[256];
        short[] sArr = {12336, 12592, 12848, 13104, 13360, 13616, 13872, 14128, 14384, 14640, 12337, 12593, 12849, 13105, 13361, 13617, 13873, 14129, 14385, 14641, 12338, 12594, 12850, 13106, 13362, 13618, 13874, 14130, 14386, 14642, 12339, 12595, 12851, 13107, 13363, 13619, 13875, 14131, 14387, 14643, 12340, 12596, 12852, 13108, 13364, 13620, 13876, 14132, 14388, 14644, 12341, 12597, 12853, 13109, 13365, 13621, 13877, 14133, 14389, 14645, 12342, 12598, 12854, 13110, 13366, 13622, 13878, 14134, 14390, 14646, 12343, 12599, 12855, 13111, 13367, 13623, 13879, 14135, 14391, 14647, 12344, 12600, 12856, 13112, 13368, 13624, 13880, 14136, 14392, 14648, 12345, 12601, 12857, 13113, 13369, 13625, 13881, 14137, 14393, 14649};
        int[] iArr = {3145776, 3211312, 3276848, 3342384, 3407920, 3473456, 3538992, 3604528, 3670064, 3735600, 3145777, 3211313, 3276849, 3342385, 3407921, 3473457, 3538993, 3604529, 3670065, 3735601, 3145778, 3211314, 3276850, 3342386, 3407922, 3473458, 3538994, 3604530, 3670066, 3735602, 3145779, 3211315, 3276851, 3342387, 3407923, 3473459, 3538995, 3604531, 3670067, 3735603, 3145780, 3211316, 3276852, 3342388, 3407924, 3473460, 3538996, 3604532, 3670068, 3735604, 3145781, 3211317, 3276853, 3342389, 3407925, 3473461, 3538997, 3604533, 3670069, 3735605, 3145782, 3211318, 3276854, 3342390, 3407926, 3473462, 3538998, 3604534, 3670070, 3735606, 3145783, 3211319, 3276855, 3342391, 3407927, 3473463, 3538999, 3604535, 3670071, 3735607, 3145784, 3211320, 3276856, 3342392, 3407928, 3473464, 3539000, 3604536, 3670072, 3735608, 3145785, 3211321, 3276857, 3342393, 3407929, 3473465, 3539001, 3604537, 3670073, 3735609};
        if (e.BIG_ENDIAN) {
            for (int i = 0; i < sArr.length; i++) {
                sArr[i] = Short.reverseBytes(sArr[i]);
            }
            for (int i2 = 0; i2 < iArr.length; i2++) {
                iArr[i2] = Integer.reverseBytes(iArr[i2] << 8);
            }
        }
        PACKED_DIGITS = sArr;
        PACKED_DIGITS_UTF16 = iArr;
        Arrays.fill(c, -1);
        int length = b.length;
        for (int i3 = 0; i3 < length; i3++) {
            c[b[i3]] = i3;
        }
        c[61] = 0;
        int i4 = 0;
        while (true) {
            int[] iArr2 = DIGITS_K;
            if (i4 < iArr2.length) {
                iArr2[i4] = (i4 < 10 ? UCExtension.EXTEND_INPUT_TYPE_IDCARD : i4 < 100 ? 16777216 : 0) + (((i4 / 100) + 48) << 16) + ((((i4 / 10) % 10) + 48) << 8) + (i4 % 10) + 48;
                i4++;
            } else {
                return;
            }
        }
    }

    public static int a(int i) {
        int i2 = 0;
        while (i > f3033a[i2]) {
            i2++;
        }
        return i2 + 1;
    }

    public static int a(byte[] bArr, int i) {
        int i2 = e.UNSAFE.getInt(bArr, e.ARRAY_BYTE_BASE_OFFSET + i);
        return e.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    public static int a(byte[] bArr, int i, int i2) {
        int i3;
        if (i2 < 0) {
            if (i2 == Integer.MIN_VALUE) {
                byte[] bArr2 = d;
                System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
                return i + d.length;
            }
            i2 = -i2;
            bArr[i] = gbx.OP_CALL_FUNC;
            i++;
        }
        if (i2 < 1000) {
            int i4 = DIGITS_K[i2];
            int i5 = i4 >> 24;
            if (i5 == 0) {
                bArr[i] = (byte) (i4 >> 16);
                bArr[i + 1] = (byte) (i4 >> 8);
                i += 2;
            } else if (i5 == 1) {
                bArr[i] = (byte) (i4 >> 8);
                i++;
            }
            int i6 = i + 1;
            bArr[i] = (byte) i4;
            return i6;
        }
        int i7 = i2 / 1000;
        int[] iArr = DIGITS_K;
        int i8 = iArr[i2 - (i7 * 1000)];
        if (i2 < 1000000) {
            int i9 = iArr[i7];
            int i10 = i9 >> 24;
            if (i10 == 0) {
                bArr[i] = (byte) (i9 >> 16);
                bArr[i + 1] = (byte) (i9 >> 8);
                i += 2;
            } else if (i10 == 1) {
                bArr[i] = (byte) (i9 >> 8);
                i++;
            }
            bArr[i] = (byte) i9;
            bArr[i + 1] = (byte) (i8 >> 16);
            bArr[i + 2] = (byte) (i8 >> 8);
            bArr[i + 3] = (byte) i8;
            return i + 4;
        }
        int i11 = i7 / 1000;
        int i12 = i11 / 1000;
        int i13 = iArr[i7 - (i11 * 1000)];
        if (i12 == 0) {
            int i14 = iArr[i11];
            int i15 = i14 >> 24;
            if (i15 == 0) {
                bArr[i] = (byte) (i14 >> 16);
                bArr[i + 1] = (byte) (i14 >> 8);
                i += 2;
            } else if (i15 == 1) {
                bArr[i] = (byte) (i14 >> 8);
                i++;
            }
            i3 = i + 1;
            bArr[i] = (byte) i14;
        } else {
            bArr[i] = (byte) (i12 + 48);
            int i16 = iArr[i11 - (i12 * 1000)];
            bArr[i + 1] = (byte) (i16 >> 16);
            bArr[i + 2] = (byte) (i16 >> 8);
            bArr[i + 3] = (byte) i16;
            i3 = i + 4;
        }
        bArr[i3] = (byte) (i13 >> 16);
        bArr[i3 + 1] = (byte) (i13 >> 8);
        bArr[i3 + 2] = (byte) i13;
        bArr[i3 + 3] = (byte) (i8 >> 16);
        bArr[i3 + 4] = (byte) (i8 >> 8);
        bArr[i3 + 5] = (byte) i8;
        return i3 + 6;
    }

    public static int a(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5;
        int a2;
        if (i2 < 0) {
            i5 = i + 1;
            bArr[i] = gbx.OP_CALL_FUNC;
            i2 = -i2;
        } else if (i2 > 9999) {
            i5 = i + 1;
            bArr[i] = 43;
        } else {
            i5 = i;
        }
        if (i2 < 10000) {
            int i6 = i2 / 100;
            long j = i5;
            e.UNSAFE.putShort(bArr, e.ARRAY_BYTE_BASE_OFFSET + j, PACKED_DIGITS[i6]);
            e.UNSAFE.putShort(bArr, e.ARRAY_BYTE_BASE_OFFSET + j + 2, PACKED_DIGITS[i2 - (i6 * 100)]);
            a2 = i5 + 4;
        } else {
            a2 = a(bArr, i5, i2);
        }
        bArr[a2] = gbx.OP_CALL_FUNC;
        long j2 = a2;
        e.UNSAFE.putShort(bArr, e.ARRAY_BYTE_BASE_OFFSET + j2 + 1, PACKED_DIGITS[i3]);
        bArr[a2 + 3] = gbx.OP_CALL_FUNC;
        e.UNSAFE.putShort(bArr, e.ARRAY_BYTE_BASE_OFFSET + j2 + 4, PACKED_DIGITS[i4]);
        return a2 + 6;
    }

    public static int a(byte[] bArr, int i, long j) {
        int i2;
        int i3 = i;
        long j2 = j;
        if (j2 < 0) {
            if (j2 == Long.MIN_VALUE) {
                byte[] bArr2 = f;
                System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
                return f.length + i3;
            }
            j2 = -j2;
            bArr[i3] = gbx.OP_CALL_FUNC;
            i3++;
        }
        if (j2 < 1000) {
            int i4 = DIGITS_K[(int) j2];
            int i5 = i4 >> 24;
            if (i5 == 0) {
                bArr[i3] = (byte) (i4 >> 16);
                bArr[i3 + 1] = (byte) (i4 >> 8);
                i3 += 2;
            } else if (i5 == 1) {
                bArr[i3] = (byte) (i4 >> 8);
                i3++;
            }
            int i6 = i3 + 1;
            bArr[i3] = (byte) i4;
            return i6;
        }
        long j3 = j2 / 1000;
        int[] iArr = DIGITS_K;
        int i7 = iArr[(int) (j2 - (j3 * 1000))];
        if (j2 < 1000000) {
            int i8 = iArr[(int) j3];
            int i9 = i8 >> 24;
            if (i9 == 0) {
                bArr[i3] = (byte) (i8 >> 16);
                bArr[i3 + 1] = (byte) (i8 >> 8);
                i3 += 2;
            } else if (i9 == 1) {
                bArr[i3] = (byte) (i8 >> 8);
                i3++;
            }
            bArr[i3] = (byte) i8;
            bArr[i3 + 1] = (byte) (i7 >> 16);
            bArr[i3 + 2] = (byte) (i7 >> 8);
            bArr[i3 + 3] = (byte) i7;
            return i3 + 4;
        }
        long j4 = j3 / 1000;
        int i10 = iArr[(int) (j3 - (j4 * 1000))];
        if (j2 < 1000000000) {
            int i11 = iArr[(int) j4];
            int i12 = i11 >> 24;
            if (i12 == 0) {
                bArr[i3] = (byte) (i11 >> 16);
                bArr[i3 + 1] = (byte) (i11 >> 8);
                i3 += 2;
            } else if (i12 == 1) {
                bArr[i3] = (byte) (i11 >> 8);
                i3++;
            }
            bArr[i3] = (byte) i11;
            bArr[i3 + 1] = (byte) (i10 >> 16);
            bArr[i3 + 2] = (byte) (i10 >> 8);
            bArr[i3 + 3] = (byte) i10;
            bArr[i3 + 4] = (byte) (i7 >> 16);
            bArr[i3 + 5] = (byte) (i7 >> 8);
            bArr[i3 + 6] = (byte) i7;
            return i3 + 7;
        }
        long j5 = j4 / 1000;
        int i13 = iArr[(int) (j4 - (j5 * 1000))];
        if (j2 < 1000000000000L) {
            int i14 = iArr[(int) j5];
            int i15 = i14 >> 24;
            if (i15 == 0) {
                bArr[i3] = (byte) (i14 >> 16);
                bArr[i3 + 1] = (byte) (i14 >> 8);
                i3 += 2;
            } else if (i15 == 1) {
                bArr[i3] = (byte) (i14 >> 8);
                i3++;
            }
            bArr[i3] = (byte) i14;
            bArr[i3 + 1] = (byte) (i13 >> 16);
            bArr[i3 + 2] = (byte) (i13 >> 8);
            bArr[i3 + 3] = (byte) i13;
            bArr[i3 + 4] = (byte) (i10 >> 16);
            bArr[i3 + 5] = (byte) (i10 >> 8);
            bArr[i3 + 6] = (byte) i10;
            bArr[i3 + 7] = (byte) (i7 >> 16);
            bArr[i3 + 8] = (byte) (i7 >> 8);
            bArr[i3 + 9] = (byte) i7;
            return i3 + 10;
        }
        int i16 = (int) (j5 / 1000);
        int i17 = iArr[(int) (j5 - (i16 * 1000))];
        if (j2 < 1000000000000000L) {
            int i18 = iArr[i16];
            int i19 = i18 >> 24;
            if (i19 == 0) {
                bArr[i3] = (byte) (i18 >> 16);
                bArr[i3 + 1] = (byte) (i18 >> 8);
                i3 += 2;
            } else if (i19 == 1) {
                bArr[i3] = (byte) (i18 >> 8);
                i3++;
            }
            bArr[i3] = (byte) i18;
            bArr[i3 + 1] = (byte) (i17 >> 16);
            bArr[i3 + 2] = (byte) (i17 >> 8);
            bArr[i3 + 3] = (byte) i17;
            bArr[i3 + 4] = (byte) (i13 >> 16);
            bArr[i3 + 5] = (byte) (i13 >> 8);
            bArr[i3 + 6] = (byte) i13;
            bArr[i3 + 7] = (byte) (i10 >> 16);
            bArr[i3 + 8] = (byte) (i10 >> 8);
            bArr[i3 + 9] = (byte) i10;
            bArr[i3 + 10] = (byte) (i7 >> 16);
            bArr[i3 + 11] = (byte) (i7 >> 8);
            bArr[i3 + 12] = (byte) i7;
            return i3 + 13;
        }
        int i20 = i16 / 1000;
        int i21 = i20 / 1000;
        int i22 = iArr[i16 - (i20 * 1000)];
        if (i21 == 0) {
            int i23 = iArr[i20];
            int i24 = i23 >> 24;
            if (i24 == 0) {
                bArr[i3] = (byte) (i23 >> 16);
                bArr[i3 + 1] = (byte) (i23 >> 8);
                i3 += 2;
            } else if (i24 == 1) {
                bArr[i3] = (byte) (i23 >> 8);
                i3++;
            }
            i2 = i3 + 1;
            bArr[i3] = (byte) i23;
        } else {
            bArr[i3] = (byte) (i21 + 48);
            int i25 = iArr[i20 - (i21 * 1000)];
            bArr[i3 + 1] = (byte) (i25 >> 16);
            bArr[i3 + 2] = (byte) (i25 >> 8);
            bArr[i3 + 3] = (byte) i25;
            i2 = i3 + 4;
        }
        bArr[i2] = (byte) (i22 >> 16);
        bArr[i2 + 1] = (byte) (i22 >> 8);
        bArr[i2 + 2] = (byte) i22;
        bArr[i2 + 3] = (byte) (i17 >> 16);
        bArr[i2 + 4] = (byte) (i17 >> 8);
        bArr[i2 + 5] = (byte) i17;
        bArr[i2 + 6] = (byte) (i13 >> 16);
        bArr[i2 + 7] = (byte) (i13 >> 8);
        bArr[i2 + 8] = (byte) i13;
        bArr[i2 + 9] = (byte) (i10 >> 16);
        bArr[i2 + 10] = (byte) (i10 >> 8);
        bArr[i2 + 11] = (byte) i10;
        bArr[i2 + 12] = (byte) (i7 >> 16);
        bArr[i2 + 13] = (byte) (i7 >> 8);
        bArr[i2 + 14] = (byte) i7;
        return i2 + 15;
    }

    public static int a(byte[] bArr, int i, com.alibaba.fastjson2.time.d dVar) {
        int i2;
        int i3 = DIGITS_K[dVar.f3022a];
        bArr[i] = (byte) (i3 >> 8);
        bArr[i + 1] = (byte) i3;
        bArr[i + 2] = 58;
        int i4 = DIGITS_K[dVar.b];
        bArr[i + 3] = (byte) (i4 >> 8);
        bArr[i + 4] = (byte) i4;
        bArr[i + 5] = 58;
        int i5 = DIGITS_K[dVar.c];
        bArr[i + 6] = (byte) (i5 >> 8);
        bArr[i + 7] = (byte) i5;
        int i6 = i + 8;
        int i7 = dVar.d;
        if (i7 != 0) {
            int i8 = i7 / 1000;
            int i9 = i8 / 1000;
            int i10 = i7 - (i8 * 1000);
            bArr[i6] = gbx.OP_ASSIGN;
            int[] iArr = DIGITS_K;
            int i11 = iArr[i9];
            bArr[i6 + 1] = (byte) (i11 >> 16);
            bArr[i6 + 2] = (byte) (i11 >> 8);
            bArr[i6 + 3] = (byte) i11;
            int i12 = i6 + 4;
            if (i10 == 0) {
                int i13 = i8 - (i9 * 1000);
                if (i13 == 0) {
                    return i12;
                }
                i2 = iArr[i13];
            } else {
                i2 = iArr[i8 - (i9 * 1000)];
            }
            bArr[i12] = (byte) (i2 >> 16);
            bArr[i12 + 1] = (byte) (i2 >> 8);
            bArr[i12 + 2] = (byte) i2;
            int i14 = i12 + 3;
            if (i10 == 0) {
                return i14;
            }
            int i15 = DIGITS_K[i10];
            bArr[i14] = (byte) (i15 >> 16);
            bArr[i14 + 1] = (byte) (i15 >> 8);
            bArr[i14 + 2] = (byte) i15;
            return i14 + 3;
        }
        return i6;
    }

    public static int a(char[] cArr, int i, int i2, int i3, int i4) {
        int i5;
        int b2;
        if (i2 < 0) {
            i5 = i + 1;
            cArr[i] = '-';
            i2 = -i2;
        } else if (i2 > 9999) {
            i5 = i + 1;
            cArr[i] = '+';
        } else {
            i5 = i;
        }
        if (i2 < 10000) {
            int i6 = i2 / 100;
            e.UNSAFE.putInt(cArr, e.ARRAY_CHAR_BASE_OFFSET + (i5 << 1), PACKED_DIGITS_UTF16[i6]);
            e.UNSAFE.putInt(cArr, e.ARRAY_CHAR_BASE_OFFSET + ((i5 + 2) << 1), PACKED_DIGITS_UTF16[i2 - (i6 * 100)]);
            b2 = i5 + 4;
        } else {
            b2 = b(cArr, i5, i2);
        }
        cArr[b2] = '-';
        e.UNSAFE.putInt(cArr, e.ARRAY_CHAR_BASE_OFFSET + ((b2 + 1) << 1), PACKED_DIGITS_UTF16[i3]);
        cArr[b2 + 3] = '-';
        e.UNSAFE.putInt(cArr, e.ARRAY_CHAR_BASE_OFFSET + ((b2 + 4) << 1), PACKED_DIGITS_UTF16[i4]);
        return b2 + 6;
    }

    public static int a(char[] cArr, int i, int i2, byte[] bArr, int i3) {
        int i4;
        int i5;
        int i6 = i + i2;
        int min = Math.min(i2, bArr.length) + i3;
        while (i3 < min && cArr[i] < 128) {
            bArr[i3] = (byte) cArr[i];
            i3++;
            i++;
        }
        while (i < i6) {
            int i7 = i + 1;
            char c2 = cArr[i];
            if (c2 < 128) {
                bArr[i3] = (byte) c2;
                i = i7;
                i3++;
            } else {
                if (c2 < 2048) {
                    bArr[i3] = (byte) ((c2 >> 6) | crd.DETECT_WIDTH);
                    bArr[i3 + 1] = (byte) ((c2 & riy.CONDITION_IF) | 128);
                    i3 += 2;
                } else if (c2 < 55296 || c2 >= 57344) {
                    bArr[i3] = (byte) ((c2 >> '\f') | 224);
                    bArr[i3 + 1] = (byte) ((63 & (c2 >> 6)) | 128);
                    bArr[i3 + 2] = (byte) ((c2 & riy.CONDITION_IF) | 128);
                    i3 += 3;
                } else {
                    int i8 = i7 - 1;
                    if (c2 < 56320) {
                        if (i6 - i8 < 2) {
                            i5 = -1;
                        } else {
                            char c3 = cArr[i8 + 1];
                            if (c3 < 56320 || c3 >= 57344) {
                                i4 = i3 + 1;
                                bArr[i3] = 63;
                            } else {
                                i5 = ((c2 << '\n') + c3) - 56613888;
                            }
                        }
                        if (i5 < 0) {
                            i4 = i3 + 1;
                            bArr[i3] = 63;
                        } else {
                            bArr[i3] = (byte) ((i5 >> 18) | 240);
                            bArr[i3 + 1] = (byte) (((i5 >> 12) & 63) | 128);
                            bArr[i3 + 2] = (byte) ((63 & (i5 >> 6)) | 128);
                            bArr[i3 + 3] = (byte) ((i5 & 63) | 128);
                            i3 += 4;
                            i = i7 + 1;
                        }
                    } else {
                        i4 = i3 + 1;
                        bArr[i3] = 63;
                    }
                    i3 = i4;
                }
                i = i7;
            }
        }
        return i3;
    }

    public static int a(char[] cArr, int i, long j) {
        int i2;
        int i3;
        long j2 = j;
        if (j2 >= 0) {
            i2 = i;
        } else if (j2 == Long.MIN_VALUE) {
            int i4 = 0;
            while (true) {
                byte[] bArr = f;
                if (i4 >= bArr.length) {
                    return i + bArr.length;
                }
                cArr[i + i4] = (char) bArr[i4];
                i4++;
            }
        } else {
            j2 = -j2;
            i2 = i + 1;
            cArr[i] = '-';
        }
        if (j2 < 1000) {
            int i5 = DIGITS_K[(int) j2];
            int i6 = i5 >> 24;
            if (i6 == 0) {
                cArr[i2] = (char) ((byte) (i5 >> 16));
                cArr[i2 + 1] = (char) ((byte) (i5 >> 8));
                i2 += 2;
            } else if (i6 == 1) {
                cArr[i2] = (char) ((byte) (i5 >> 8));
                i2++;
            }
            int i7 = i2 + 1;
            cArr[i2] = (char) ((byte) i5);
            return i7;
        }
        long j3 = j2 / 1000;
        int[] iArr = DIGITS_K;
        int i8 = iArr[(int) (j2 - (j3 * 1000))];
        if (j2 < 1000000) {
            int i9 = iArr[(int) j3];
            int i10 = i9 >> 24;
            if (i10 == 0) {
                cArr[i2] = (char) ((byte) (i9 >> 16));
                cArr[i2 + 1] = (char) ((byte) (i9 >> 8));
                i2 += 2;
            } else if (i10 == 1) {
                cArr[i2] = (char) ((byte) (i9 >> 8));
                i2++;
            }
            cArr[i2] = (char) ((byte) i9);
            cArr[i2 + 1] = (char) ((byte) (i8 >> 16));
            cArr[i2 + 2] = (char) ((byte) (i8 >> 8));
            cArr[i2 + 3] = (char) ((byte) i8);
            return i2 + 4;
        }
        long j4 = j3 / 1000;
        int i11 = iArr[(int) (j3 - (j4 * 1000))];
        if (j2 < 1000000000) {
            int i12 = iArr[(int) j4];
            int i13 = i12 >> 24;
            if (i13 == 0) {
                cArr[i2] = (char) ((byte) (i12 >> 16));
                cArr[i2 + 1] = (char) ((byte) (i12 >> 8));
                i2 += 2;
            } else if (i13 == 1) {
                cArr[i2] = (char) ((byte) (i12 >> 8));
                i2++;
            }
            cArr[i2] = (char) ((byte) i12);
            cArr[i2 + 1] = (char) ((byte) (i11 >> 16));
            cArr[i2 + 2] = (char) ((byte) (i11 >> 8));
            cArr[i2 + 3] = (char) ((byte) i11);
            cArr[i2 + 4] = (char) ((byte) (i8 >> 16));
            cArr[i2 + 5] = (char) ((byte) (i8 >> 8));
            cArr[i2 + 6] = (char) ((byte) i8);
            return i2 + 7;
        }
        long j5 = j4 / 1000;
        int i14 = iArr[(int) (j4 - (j5 * 1000))];
        if (j2 < 1000000000000L) {
            int i15 = iArr[(int) j5];
            int i16 = i15 >> 24;
            if (i16 == 0) {
                cArr[i2] = (char) ((byte) (i15 >> 16));
                cArr[i2 + 1] = (char) ((byte) (i15 >> 8));
                i2 += 2;
            } else if (i16 == 1) {
                cArr[i2] = (char) ((byte) (i15 >> 8));
                i2++;
            }
            cArr[i2] = (char) ((byte) i15);
            cArr[i2 + 1] = (char) ((byte) (i14 >> 16));
            cArr[i2 + 2] = (char) ((byte) (i14 >> 8));
            cArr[i2 + 3] = (char) ((byte) i14);
            cArr[i2 + 4] = (char) ((byte) (i11 >> 16));
            cArr[i2 + 5] = (char) ((byte) (i11 >> 8));
            cArr[i2 + 6] = (char) ((byte) i11);
            cArr[i2 + 7] = (char) ((byte) (i8 >> 16));
            cArr[i2 + 8] = (char) ((byte) (i8 >> 8));
            cArr[i2 + 9] = (char) ((byte) i8);
            return i2 + 10;
        }
        int i17 = (int) (j5 / 1000);
        int i18 = iArr[(int) (j5 - (i17 * 1000))];
        if (j2 < 1000000000000000L) {
            int i19 = iArr[i17];
            int i20 = i19 >> 24;
            if (i20 == 0) {
                cArr[i2] = (char) ((byte) (i19 >> 16));
                cArr[i2 + 1] = (char) ((byte) (i19 >> 8));
                i2 += 2;
            } else if (i20 == 1) {
                cArr[i2] = (char) ((byte) (i19 >> 8));
                i2++;
            }
            cArr[i2] = (char) ((byte) i19);
            cArr[i2 + 1] = (char) ((byte) (i18 >> 16));
            cArr[i2 + 2] = (char) ((byte) (i18 >> 8));
            cArr[i2 + 3] = (char) ((byte) i18);
            cArr[i2 + 4] = (char) ((byte) (i14 >> 16));
            cArr[i2 + 5] = (char) ((byte) (i14 >> 8));
            cArr[i2 + 6] = (char) ((byte) i14);
            cArr[i2 + 7] = (char) ((byte) (i11 >> 16));
            cArr[i2 + 8] = (char) ((byte) (i11 >> 8));
            cArr[i2 + 9] = (char) ((byte) i11);
            cArr[i2 + 10] = (char) ((byte) (i8 >> 16));
            cArr[i2 + 11] = (char) ((byte) (i8 >> 8));
            cArr[i2 + 12] = (char) ((byte) i8);
            return i2 + 13;
        }
        int i21 = i17 / 1000;
        int i22 = i21 / 1000;
        int i23 = iArr[i17 - (i21 * 1000)];
        if (i22 == 0) {
            int i24 = iArr[i21];
            int i25 = i24 >> 24;
            if (i25 == 0) {
                cArr[i2] = (char) ((byte) (i24 >> 16));
                cArr[i2 + 1] = (char) ((byte) (i24 >> 8));
                i2 += 2;
            } else if (i25 == 1) {
                cArr[i2] = (char) ((byte) (i24 >> 8));
                i2++;
            }
            i3 = i2 + 1;
            cArr[i2] = (char) ((byte) i24);
        } else {
            cArr[i2] = (char) ((byte) (i22 + 48));
            int i26 = iArr[i21 - (i22 * 1000)];
            cArr[i2 + 1] = (char) ((byte) (i26 >> 16));
            cArr[i2 + 2] = (char) ((byte) (i26 >> 8));
            cArr[i2 + 3] = (char) ((byte) i26);
            i3 = i2 + 4;
        }
        cArr[i3] = (char) ((byte) (i23 >> 16));
        cArr[i3 + 1] = (char) ((byte) (i23 >> 8));
        cArr[i3 + 2] = (char) ((byte) i23);
        cArr[i3 + 3] = (char) ((byte) (i18 >> 16));
        cArr[i3 + 4] = (char) ((byte) (i18 >> 8));
        cArr[i3 + 5] = (char) ((byte) i18);
        cArr[i3 + 6] = (char) ((byte) (i14 >> 16));
        cArr[i3 + 7] = (char) ((byte) (i14 >> 8));
        cArr[i3 + 8] = (char) ((byte) i14);
        cArr[i3 + 9] = (char) ((byte) (i11 >> 16));
        cArr[i3 + 10] = (char) ((byte) (i11 >> 8));
        cArr[i3 + 11] = (char) ((byte) i11);
        cArr[i3 + 12] = (char) ((byte) (i8 >> 16));
        cArr[i3 + 13] = (char) ((byte) (i8 >> 8));
        cArr[i3 + 14] = (char) ((byte) i8);
        return i3 + 15;
    }

    public static int a(char[] cArr, int i, com.alibaba.fastjson2.time.d dVar) {
        int i2;
        int i3 = DIGITS_K[dVar.f3022a];
        cArr[i] = (char) ((byte) (i3 >> 8));
        cArr[i + 1] = (char) ((byte) i3);
        cArr[i + 2] = riy.CONDITION_IF_MIDDLE;
        int i4 = DIGITS_K[dVar.b];
        cArr[i + 3] = (char) ((byte) (i4 >> 8));
        cArr[i + 4] = (char) ((byte) i4);
        cArr[i + 5] = riy.CONDITION_IF_MIDDLE;
        int i5 = DIGITS_K[dVar.c];
        cArr[i + 6] = (char) ((byte) (i5 >> 8));
        cArr[i + 7] = (char) ((byte) i5);
        int i6 = i + 8;
        int i7 = dVar.d;
        if (i7 != 0) {
            int i8 = i7 / 1000;
            int i9 = i8 / 1000;
            int i10 = i7 - (i8 * 1000);
            cArr[i6] = '.';
            int[] iArr = DIGITS_K;
            int i11 = iArr[i9];
            cArr[i6 + 1] = (char) ((byte) (i11 >> 16));
            cArr[i6 + 2] = (char) ((byte) (i11 >> 8));
            cArr[i6 + 3] = (char) ((byte) i11);
            int i12 = i6 + 4;
            if (i10 == 0) {
                int i13 = i8 - (i9 * 1000);
                if (i13 == 0) {
                    return i12;
                }
                i2 = iArr[i13];
            } else {
                i2 = iArr[i8 - (i9 * 1000)];
            }
            cArr[i12] = (char) ((byte) (i2 >> 16));
            cArr[i12 + 1] = (char) ((byte) (i2 >> 8));
            cArr[i12 + 2] = (char) ((byte) i2);
            int i14 = i12 + 3;
            if (i10 == 0) {
                return i14;
            }
            int i15 = DIGITS_K[i10];
            cArr[i14] = (char) ((byte) (i15 >> 16));
            cArr[i14 + 1] = (char) ((byte) (i15 >> 8));
            cArr[i14 + 2] = (char) ((byte) i15);
            return i14 + 3;
        }
        return i6;
    }

    public static long a(long j, long j2) {
        long j3 = j / j2;
        return ((j ^ j2) >= 0 || j2 * j3 == j) ? j3 : j3 - 1;
    }

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }

    public static boolean a(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '+' || charAt == '-') {
                if (i != 0) {
                    return false;
                }
            } else if (charAt < '0' || charAt > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean a(char[] cArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            char c2 = cArr[i];
            if (c2 == '+' || c2 == '-') {
                if (i != 0) {
                    return false;
                }
            } else if (c2 < '0' || c2 > '9') {
                return false;
            }
            i++;
        }
        return true;
    }

    public static int b(char[] cArr, int i, int i2) {
        int i3;
        if (i2 < 0) {
            if (i2 == Integer.MIN_VALUE) {
                char[] cArr2 = e;
                System.arraycopy(cArr2, 0, cArr, i, cArr2.length);
                return i + e.length;
            }
            i2 = -i2;
            cArr[i] = '-';
            i++;
        }
        if (i2 < 1000) {
            int i4 = DIGITS_K[i2];
            int i5 = i4 >> 24;
            if (i5 == 0) {
                cArr[i] = (char) ((byte) (i4 >> 16));
                cArr[i + 1] = (char) ((byte) (i4 >> 8));
                i += 2;
            } else if (i5 == 1) {
                cArr[i] = (char) ((byte) (i4 >> 8));
                i++;
            }
            int i6 = i + 1;
            cArr[i] = (char) ((byte) i4);
            return i6;
        }
        int i7 = i2 / 1000;
        int[] iArr = DIGITS_K;
        int i8 = iArr[i2 - (i7 * 1000)];
        if (i2 < 1000000) {
            int i9 = iArr[i7];
            int i10 = i9 >> 24;
            if (i10 == 0) {
                cArr[i] = (char) ((byte) (i9 >> 16));
                cArr[i + 1] = (char) ((byte) (i9 >> 8));
                i += 2;
            } else if (i10 == 1) {
                cArr[i] = (char) ((byte) (i9 >> 8));
                i++;
            }
            cArr[i] = (char) ((byte) i9);
            cArr[i + 1] = (char) ((byte) (i8 >> 16));
            cArr[i + 2] = (char) ((byte) (i8 >> 8));
            cArr[i + 3] = (char) ((byte) i8);
            return i + 4;
        }
        int i11 = i7 / 1000;
        int i12 = i11 / 1000;
        int i13 = iArr[i7 - (i11 * 1000)];
        if (i12 == 0) {
            int i14 = iArr[i11];
            int i15 = i14 >> 24;
            if (i15 == 0) {
                cArr[i] = (char) ((byte) (i14 >> 16));
                cArr[i + 1] = (char) ((byte) (i14 >> 8));
                i += 2;
            } else if (i15 == 1) {
                cArr[i] = (char) ((byte) (i14 >> 8));
                i++;
            }
            i3 = i + 1;
            cArr[i] = (char) ((byte) i14);
        } else {
            cArr[i] = (char) ((byte) (i12 + 48));
            int i16 = iArr[i11 - (i12 * 1000)];
            cArr[i + 1] = (char) ((byte) (i16 >> 16));
            cArr[i + 2] = (char) ((byte) (i16 >> 8));
            cArr[i + 3] = (char) ((byte) i16);
            i3 = i + 4;
        }
        cArr[i3] = (char) ((byte) (i13 >> 16));
        cArr[i3 + 1] = (char) ((byte) (i13 >> 8));
        cArr[i3 + 2] = (char) ((byte) i13);
        cArr[i3 + 3] = (char) ((byte) (i8 >> 16));
        cArr[i3 + 4] = (char) ((byte) (i8 >> 8));
        cArr[i3 + 5] = (char) ((byte) i8);
        return i3 + 6;
    }

    public static long b(long j, long j2) {
        return j - (a(j, j2) * j2);
    }

    public static byte[] b(String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        if (length == 0) {
            return new byte[0];
        }
        int i3 = length - 1;
        int i4 = 0;
        while (i4 < i3 && c[str.charAt(i4) & 255] < 0) {
            i4++;
        }
        while (i3 > 0 && c[str.charAt(i3) & 255] < 0) {
            i3--;
        }
        int i5 = str.charAt(i3) == '=' ? str.charAt(i3 + (-1)) == '=' ? 2 : 1 : 0;
        int i6 = (i3 - i4) + 1;
        if (length > 76) {
            i = (str.charAt(76) == '\r' ? i6 / 78 : 0) << 1;
        } else {
            i = 0;
        }
        int i7 = (((i6 - i) * 6) >> 3) - i5;
        byte[] bArr = new byte[i7];
        int i8 = (i7 / 3) * 3;
        int i9 = i4;
        int i10 = 0;
        loop2: while (true) {
            int i11 = 0;
            while (i10 < i8) {
                int i12 = (c[str.charAt(i9)] << 18) | (c[str.charAt(i9 + 1)] << 12) | (c[str.charAt(i9 + 2)] << 6) | c[str.charAt(i9 + 3)];
                i9 += 4;
                bArr[i10] = (byte) (i12 >> 16);
                bArr[i10 + 1] = (byte) (i12 >> 8);
                bArr[i10 + 2] = (byte) i12;
                i10 += 3;
                if (i <= 0 || (i11 = i11 + 1) != 19) {
                }
            }
            i9 += 2;
        }
        if (i10 < i7) {
            int i13 = 0;
            while (i9 <= i3 - i5) {
                i2 |= c[str.charAt(i9)] << (18 - (i13 * 6));
                i13++;
                i9++;
            }
            int i14 = 16;
            while (i10 < i7) {
                bArr[i10] = (byte) (i2 >> i14);
                i14 -= 8;
                i10++;
            }
        }
        return bArr;
    }

    public static long c(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j3) & (j2 ^ j3)) >= 0) {
            return j3;
        }
        throw new ArithmeticException("long overflow");
    }

    public static long d(long j, long j2) {
        long j3 = j * j2;
        if (((Math.abs(j) | Math.abs(j2)) >>> 31) == 0 || ((j2 == 0 || j3 / j2 == j) && !(j == Long.MIN_VALUE && j2 == -1))) {
            return j3;
        }
        throw new ArithmeticException("long overflow");
    }
}
