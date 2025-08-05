package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.internal.ArtcParams;
import java.util.ArrayList;
import java.util.Map;
import tb.icf;

/* loaded from: classes3.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(Code128Writer code128Writer, String str, Object... objArr) {
        if (str.hashCode() == 2113079631) {
            return super.encode((String) objArr[0], (BarcodeFormat) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), (Map) objArr[4]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.android.msp.framework.minizxing.OneDimensionalCodeWriter, com.alipay.android.msp.framework.minizxing.Writer
    public final BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitMatrix) ipChange.ipc$dispatch("7df3094f", new Object[]{this, str, barcodeFormat, new Integer(i), new Integer(i2), map});
        }
        if (barcodeFormat != BarcodeFormat.CODE_128) {
            throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
        }
        return super.encode(str, barcodeFormat, i, i2, map);
    }

    @Override // com.alipay.android.msp.framework.minizxing.OneDimensionalCodeWriter
    public final boolean[] encode(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("d1f261ae", new Object[]{this, str});
        }
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < ' ' || charAt > '~') {
                switch (charAt) {
                    case 241:
                    case 242:
                    case icf.DEFAULT_ALPHA /* 243 */:
                    case ArtcParams.SD244pVideoParams.WIDTH /* 244 */:
                        break;
                    default:
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i3 < length) {
            int i7 = 99;
            int i8 = 100;
            if (!a(str, i3, i5 == 99 ? 2 : 4)) {
                i7 = 100;
            }
            if (i7 == i5) {
                switch (str.charAt(i3)) {
                    case 241:
                        i8 = 102;
                        break;
                    case 242:
                        i8 = 97;
                        break;
                    case icf.DEFAULT_ALPHA /* 243 */:
                        i8 = 96;
                        break;
                    case ArtcParams.SD244pVideoParams.WIDTH /* 244 */:
                        break;
                    default:
                        if (i5 != 100) {
                            i8 = Integer.parseInt(str.substring(i3, i3 + 2));
                            i3++;
                            break;
                        } else {
                            i8 = str.charAt(i3) - ' ';
                            break;
                        }
                }
                i3++;
            } else {
                i8 = i5 == 0 ? i7 == 100 ? 104 : 105 : i7;
                i5 = i7;
            }
            arrayList.add(Code128Reader.f4800a[i8]);
            i4 += i8 * i6;
            if (i3 != 0) {
                i6++;
            }
        }
        arrayList.add(Code128Reader.f4800a[i4 % 103]);
        arrayList.add(Code128Reader.f4800a[106]);
        int i9 = 0;
        for (int[] iArr : arrayList) {
            int i10 = i9;
            for (int i11 : iArr) {
                i10 += i11;
            }
            i9 = i10;
        }
        boolean[] zArr = new boolean[i9];
        for (int[] iArr2 : arrayList) {
            i += a(zArr, i, iArr2, true);
        }
        return zArr;
    }

    private static boolean a(CharSequence charSequence, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be1be670", new Object[]{charSequence, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int i3 = i2 + i;
        int length = charSequence.length();
        while (i < i3 && i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < '0' || charAt > '9') {
                if (charAt != 241) {
                    return false;
                }
                i3++;
            }
            i++;
        }
        return i3 <= length;
    }
}
