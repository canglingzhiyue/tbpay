package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public final class MultiFormatWriter implements Writer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.alipay.android.msp.framework.minizxing.MultiFormatWriter$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4806a = new int[BarcodeFormat.values().length];

        static {
            try {
                f4806a[BarcodeFormat.QR_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4806a[BarcodeFormat.CODE_128.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.alipay.android.msp.framework.minizxing.Writer
    public final BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BitMatrix) ipChange.ipc$dispatch("cf5db258", new Object[]{this, str, barcodeFormat, new Integer(i), new Integer(i2)}) : encode(str, barcodeFormat, i, i2, null);
    }

    @Override // com.alipay.android.msp.framework.minizxing.Writer
    public final BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        Writer qRCodeWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitMatrix) ipChange.ipc$dispatch("7df3094f", new Object[]{this, str, barcodeFormat, new Integer(i), new Integer(i2), map});
        }
        int i3 = AnonymousClass1.f4806a[barcodeFormat.ordinal()];
        if (i3 == 1) {
            qRCodeWriter = new QRCodeWriter();
        } else if (i3 == 2) {
            qRCodeWriter = new Code128Writer();
        } else {
            throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
        }
        return qRCodeWriter.encode(str, barcodeFormat, i, i2, map);
    }
}
