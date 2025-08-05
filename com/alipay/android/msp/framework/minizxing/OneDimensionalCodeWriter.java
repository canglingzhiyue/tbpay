package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class OneDimensionalCodeWriter implements Writer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract boolean[] encode(String str);

    public int getDefaultMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db439f93", new Object[]{this})).intValue();
        }
        return 10;
    }

    @Override // com.alipay.android.msp.framework.minizxing.Writer
    public final BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BitMatrix) ipChange.ipc$dispatch("cf5db258", new Object[]{this, str, barcodeFormat, new Integer(i), new Integer(i2)}) : encode(str, barcodeFormat, i, i2, null);
    }

    @Override // com.alipay.android.msp.framework.minizxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitMatrix) ipChange.ipc$dispatch("7df3094f", new Object[]{this, str, barcodeFormat, new Integer(i), new Integer(i2), map});
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        }
        int defaultMargin = getDefaultMargin();
        if (map != null && (num = (Integer) map.get(EncodeHintType.MARGIN)) != null) {
            defaultMargin = num.intValue();
        }
        return a(encode(str), i, i2, defaultMargin);
    }

    private static BitMatrix a(boolean[] zArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitMatrix) ipChange.ipc$dispatch("704eadaa", new Object[]{zArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        BitMatrix bitMatrix = new BitMatrix(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                bitMatrix.setRegion(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return bitMatrix;
    }

    public static int a(boolean[] zArr, int i, int[] iArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("823dd55d", new Object[]{zArr, new Integer(i), iArr, new Boolean(z)})).intValue();
        }
        int length = iArr.length;
        int i2 = i;
        boolean z2 = z;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            int i6 = i2;
            int i7 = 0;
            while (i7 < i5) {
                zArr[i6] = z2;
                i7++;
                i6++;
            }
            i4 += i5;
            z2 = !z2;
            i3++;
            i2 = i6;
        }
        return i4;
    }
}
