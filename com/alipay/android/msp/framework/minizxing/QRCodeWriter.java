package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public final class QRCodeWriter implements Writer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.msp.framework.minizxing.Writer
    public final BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BitMatrix) ipChange.ipc$dispatch("cf5db258", new Object[]{this, str, barcodeFormat, new Integer(i), new Integer(i2)}) : encode(str, barcodeFormat, i, i2, null);
    }

    @Override // com.alipay.android.msp.framework.minizxing.Writer
    public final BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        IpChange ipChange = $ipChange;
        int i3 = 4;
        if (ipChange instanceof IpChange) {
            return (BitMatrix) ipChange.ipc$dispatch("7df3094f", new Object[]{this, str, barcodeFormat, new Integer(i), new Integer(i2), map});
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.L;
        if (map != null) {
            ErrorCorrectionLevel errorCorrectionLevel2 = (ErrorCorrectionLevel) map.get(EncodeHintType.ERROR_CORRECTION);
            if (errorCorrectionLevel2 != null) {
                errorCorrectionLevel = errorCorrectionLevel2;
            }
            Integer num = (Integer) map.get(EncodeHintType.MARGIN);
            if (num != null) {
                i3 = num.intValue();
            }
        }
        return a(Encoder.encode(str, errorCorrectionLevel, map), i, i2, i3);
    }

    private static BitMatrix a(QRCode qRCode, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitMatrix) ipChange.ipc$dispatch("bed27bbf", new Object[]{qRCode, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        ByteMatrix matrix = qRCode.getMatrix();
        if (matrix == null) {
            throw new IllegalStateException();
        }
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        int i4 = i3 << 1;
        int i5 = width + i4;
        int i6 = i4 + height;
        int max = Math.max(i, i5);
        int max2 = Math.max(i2, i6);
        int min = Math.min(max / i5, max2 / i6);
        int i7 = (max - (width * min)) / 2;
        int i8 = (max2 - (height * min)) / 2;
        BitMatrix bitMatrix = new BitMatrix(max, max2);
        int i9 = 0;
        while (i9 < height) {
            int i10 = i7;
            int i11 = 0;
            while (i11 < width) {
                if (matrix.get(i11, i9) == 1) {
                    bitMatrix.setRegion(i10, i8, min, min);
                }
                i11++;
                i10 += min;
            }
            i9++;
            i8 += min;
        }
        return bitMatrix;
    }
}
