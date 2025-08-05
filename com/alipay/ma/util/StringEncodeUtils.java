package com.alipay.ma.util;

import com.alipay.ma.MaLogger;
import com.android.alibaba.ip.runtime.IpChange;
import tb.crd;

/* loaded from: classes3.dex */
public final class StringEncodeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean ASSUME_SHIFT_JIS;
    public static final String EUC_JP = "EUC_JP";
    public static final String GB2312 = "GB2312";
    public static final String ISO88591 = "ISO8859_1";
    public static final String SHIFT_JIS = "SJIS";
    public static final String TAG = "StringEncodeUtil";
    public static final String UTF8 = "UTF8";

    /* renamed from: a  reason: collision with root package name */
    private static final String f5318a = System.getProperty("file.encoding");

    static {
        ASSUME_SHIFT_JIS = SHIFT_JIS.equalsIgnoreCase(f5318a) || EUC_JP.equalsIgnoreCase(f5318a);
    }

    private StringEncodeUtils() {
    }

    public static String guessEncoding(byte[] bArr, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8b16aa4", new Object[]{bArr, new Boolean(z)});
        }
        int length = bArr.length;
        boolean b = b(bArr);
        boolean a2 = !z ? a(bArr) : true;
        boolean z2 = true;
        boolean z3 = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < length && ((z && a2) || z2 || z3); i9++) {
            int i10 = bArr[i9] & 255;
            if (z && a2 && i10 > 127 && i10 > 176 && i10 <= 247 && (i = i9 + 1) < length) {
                int i11 = bArr[i] & 255;
                a2 = i11 > 160 && i11 <= 247;
            }
            if (z2) {
                if (i10 > 127 && i10 < 160) {
                    z2 = false;
                } else if (i10 > 159 && (i10 < 192 || i10 == 215 || i10 == 247)) {
                    i6++;
                }
            }
            if (z3) {
                if (i2 > 0) {
                    if (i10 >= 64 && i10 != 127 && i10 <= 252) {
                        i2--;
                    }
                    z3 = false;
                } else {
                    if (i10 != 128 && i10 != 160 && i10 <= 239) {
                        if (i10 <= 160 || i10 >= 224) {
                            if (i10 > 127) {
                                i2++;
                                int i12 = i7 + 1;
                                if (i12 > i4) {
                                    i4 = i12;
                                    i7 = i4;
                                } else {
                                    i7 = i12;
                                }
                            } else {
                                i7 = 0;
                            }
                            i8 = 0;
                        } else {
                            i5++;
                            int i13 = i8 + 1;
                            if (i13 > i3) {
                                i3 = i13;
                                i8 = i3;
                            } else {
                                i8 = i13;
                            }
                            i7 = 0;
                        }
                    }
                    z3 = false;
                }
            }
        }
        if (b) {
            return "UTF8";
        }
        boolean z4 = (!z3 || i2 <= 0) ? z3 : false;
        return a2 ? GB2312 : (!z4 || (!ASSUME_SHIFT_JIS && i3 < 3 && i4 < 3)) ? (!z2 || !z4) ? z2 ? ISO88591 : z4 ? SHIFT_JIS : f5318a : (!(i3 == 2 && i5 == 2) && i6 * 10 < length) ? ISO88591 : SHIFT_JIS : SHIFT_JIS;
    }

    public static String getStringEncode(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7fb5557", new Object[]{bArr, new Boolean(z)});
        }
        if (bArr == null) {
            return null;
        }
        try {
            if (bArr.length <= 0) {
                return null;
            }
            return guessEncoding(bArr, z);
        } catch (Exception e) {
            MaLogger.e(TAG, e.getMessage());
            return null;
        }
    }

    private static boolean a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c196733", new Object[]{bArr})).booleanValue();
        }
        boolean z2 = false;
        int i = 0;
        for (byte b : bArr) {
            int i2 = b & 255;
            if (z2) {
                int i3 = ((i & 255) << 8) | (i2 & 255);
                if (i3 < 41377 || i3 > 65278) {
                    z = false;
                    break;
                }
                z2 = false;
                i = 0;
            } else if ((i2 & 128) != 0) {
                i = i2;
                z2 = true;
            }
        }
        if (i == 0) {
            return z;
        }
        return false;
    }

    private static boolean b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90ffa274", new Object[]{bArr})).booleanValue();
        }
        int length = bArr != null ? bArr.length : 0;
        int i = 0;
        boolean z = true;
        while (i < length && z) {
            int i2 = length - i;
            int i3 = bArr[i] & 255;
            int i4 = i2 > 1 ? bArr[i + 1] & 255 : 0;
            int i5 = i2 > 2 ? bArr[i + 2] & 255 : 0;
            int i6 = i2 > 3 ? bArr[i + 3] & 255 : 0;
            if ((i3 & 248) == 240 && (i4 & crd.DETECT_WIDTH) == 128 && (i5 & crd.DETECT_WIDTH) == 128 && (i6 & crd.DETECT_WIDTH) == 128) {
                i += 4;
            } else if ((i3 & 240) == 224 && (i4 & crd.DETECT_WIDTH) == 128 && (i5 & crd.DETECT_WIDTH) == 128) {
                i += 3;
            } else if ((i3 & 224) == 192 && (i4 & crd.DETECT_WIDTH) == 128) {
                i += 2;
            } else if ((i3 & 128) == 0) {
                i++;
            } else {
                z = false;
            }
        }
        return z;
    }
}
