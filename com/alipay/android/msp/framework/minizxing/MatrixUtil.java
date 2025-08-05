package com.alipay.android.msp.framework.minizxing;

import com.alibaba.triver.triver_shop.shop2023.nativeview.a;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fxb;

/* loaded from: classes3.dex */
public final class MatrixUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int[][] b = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] c = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] d = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, SecExceptionCode.SEC_ERROR_INIT_PLUGIN_CLASS_ERROR, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, a.bottomBarHeightWithBottomMarginRpxValue}, new int[]{6, 26, 54, 82, 110, SecExceptionCode.SEC_ERROR_INIT_PLUGIN_CLASS_ERROR, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: a  reason: collision with root package name */
    private static final int[][] f4805a = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        while (i != 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    private static boolean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{new Integer(i)})).booleanValue() : i == -1;
    }

    private MatrixUtil() {
    }

    public static void a(ByteMatrix byteMatrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("526f5821", new Object[]{byteMatrix});
        } else {
            byteMatrix.clear((byte) -1);
        }
    }

    public static void a(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, int i, ByteMatrix byteMatrix) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bacd5a2", new Object[]{bitArray, errorCorrectionLevel, version, new Integer(i), byteMatrix});
            return;
        }
        a(byteMatrix);
        a(version, byteMatrix);
        a(errorCorrectionLevel, i, byteMatrix);
        b(version, byteMatrix);
        a(bitArray, i, byteMatrix);
    }

    public static void a(ErrorCorrectionLevel errorCorrectionLevel, int i, ByteMatrix byteMatrix) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb1cbf2", new Object[]{errorCorrectionLevel, new Integer(i), byteMatrix});
            return;
        }
        BitArray bitArray = new BitArray();
        a(errorCorrectionLevel, i, bitArray);
        for (int i2 = 0; i2 < bitArray.getSize(); i2++) {
            boolean z = bitArray.get((bitArray.getSize() - 1) - i2);
            int[][] iArr = f4805a;
            byteMatrix.set(iArr[i2][0], iArr[i2][1], z);
            if (i2 < 8) {
                byteMatrix.set((byteMatrix.getWidth() - i2) - 1, 8, z);
            } else {
                byteMatrix.set(8, (byteMatrix.getHeight() - 7) + (i2 - 8), z);
            }
        }
    }

    public static void b(Version version, ByteMatrix byteMatrix) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a83a5a", new Object[]{version, byteMatrix});
        } else if (version.getVersionNumber() >= 7) {
            BitArray bitArray = new BitArray();
            a(version, bitArray);
            int i = 0;
            int i2 = 17;
            while (i < 6) {
                int i3 = i2;
                for (int i4 = 0; i4 < 3; i4++) {
                    boolean z = bitArray.get(i3);
                    i3--;
                    byteMatrix.set(i, (byteMatrix.getHeight() - 11) + i4, z);
                    byteMatrix.set((byteMatrix.getHeight() - 11) + i4, i, z);
                }
                i++;
                i2 = i3;
            }
        }
    }

    public static void a(BitArray bitArray, int i, ByteMatrix byteMatrix) throws WriterException {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78f35084", new Object[]{bitArray, new Integer(i), byteMatrix});
            return;
        }
        int width = byteMatrix.getWidth() - 1;
        int height = byteMatrix.getHeight() - 1;
        int i2 = 0;
        int i3 = -1;
        while (width > 0) {
            if (width == 6) {
                width--;
            }
            while (height >= 0 && height < byteMatrix.getHeight()) {
                int i4 = i2;
                for (int i5 = 0; i5 < 2; i5++) {
                    int i6 = width - i5;
                    if (b(byteMatrix.get(i6, height))) {
                        if (i4 < bitArray.getSize()) {
                            z = bitArray.get(i4);
                            i4++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && MaskUtil.a(i, i6, height)) {
                            z = !z;
                        }
                        byteMatrix.set(i6, height, z);
                    }
                }
                height += i3;
                i2 = i4;
            }
            i3 = -i3;
            height += i3;
            width -= 2;
        }
        if (i2 == bitArray.getSize()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i2 + fxb.DIR + bitArray.getSize());
    }

    public static int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int a2 = a(i2);
        int i3 = i << (a2 - 1);
        while (a(i3) >= a2) {
            i3 ^= i2 << (a(i3) - a2);
        }
        return i3;
    }

    public static void a(ErrorCorrectionLevel errorCorrectionLevel, int i, BitArray bitArray) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4b776f", new Object[]{errorCorrectionLevel, new Integer(i), bitArray});
        } else if (!QRCode.isValidMaskPattern(i)) {
            throw new WriterException("Invalid mask pattern");
        } else {
            int bits = (errorCorrectionLevel.getBits() << 3) | i;
            bitArray.appendBits(bits, 5);
            bitArray.appendBits(a(bits, 1335), 10);
            BitArray bitArray2 = new BitArray();
            bitArray2.appendBits(21522, 15);
            bitArray.xor(bitArray2);
            if (bitArray.getSize() == 15) {
                return;
            }
            throw new WriterException("should not happen but we got: " + bitArray.getSize());
        }
    }

    public static void a(Version version, BitArray bitArray) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58df4a38", new Object[]{version, bitArray});
            return;
        }
        bitArray.appendBits(version.getVersionNumber(), 6);
        bitArray.appendBits(a(version.getVersionNumber(), 7973), 12);
        if (bitArray.getSize() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + bitArray.getSize());
    }

    private static void a(int i, int i2, ByteMatrix byteMatrix) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("961ec5c1", new Object[]{new Integer(i), new Integer(i2), byteMatrix});
            return;
        }
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!b(byteMatrix.get(i4, i2))) {
                throw new WriterException();
            }
            byteMatrix.set(i4, i2, 0);
        }
    }

    private static void b(int i, int i2, ByteMatrix byteMatrix) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5d3560", new Object[]{new Integer(i), new Integer(i2), byteMatrix});
            return;
        }
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!b(byteMatrix.get(i, i4))) {
                throw new WriterException();
            }
            byteMatrix.set(i, i4, 0);
        }
    }

    private static void c(int i, int i2, ByteMatrix byteMatrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be9ba4ff", new Object[]{new Integer(i), new Integer(i2), byteMatrix});
            return;
        }
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                byteMatrix.set(i + i4, i2 + i3, b[i3][i4]);
            }
        }
    }

    public static void a(Version version, ByteMatrix byteMatrix) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c107b", new Object[]{version, byteMatrix});
            return;
        }
        int length = b[0].length;
        c(0, 0, byteMatrix);
        c(byteMatrix.getWidth() - length, 0, byteMatrix);
        c(0, byteMatrix.getWidth() - length, byteMatrix);
        a(0, 7, byteMatrix);
        a(byteMatrix.getWidth() - 8, 7, byteMatrix);
        a(0, byteMatrix.getWidth() - 8, byteMatrix);
        b(7, 0, byteMatrix);
        b((byteMatrix.getHeight() - 7) - 1, 0, byteMatrix);
        b(7, byteMatrix.getHeight() - 7, byteMatrix);
        if (byteMatrix.get(8, byteMatrix.getHeight() - 8) == 0) {
            throw new WriterException();
        }
        byteMatrix.set(8, byteMatrix.getHeight() - 8, 1);
        if (version.getVersionNumber() >= 2) {
            int versionNumber = version.getVersionNumber() - 1;
            int[][] iArr = d;
            int[] iArr2 = iArr[versionNumber];
            int length2 = iArr[versionNumber].length;
            for (int i = 0; i < length2; i++) {
                for (int i2 = 0; i2 < length2; i2++) {
                    int i3 = iArr2[i];
                    int i4 = iArr2[i2];
                    if (i4 != -1 && i3 != -1 && b(byteMatrix.get(i4, i3))) {
                        int i5 = i4 - 2;
                        int i6 = i3 - 2;
                        for (int i7 = 0; i7 < 5; i7++) {
                            for (int i8 = 0; i8 < 5; i8++) {
                                byteMatrix.set(i5 + i8, i6 + i7, c[i7][i8]);
                            }
                        }
                    }
                }
            }
        }
        int i9 = 8;
        while (i9 < byteMatrix.getWidth() - 8) {
            int i10 = i9 + 1;
            int i11 = i10 % 2;
            if (b(byteMatrix.get(i9, 6))) {
                byteMatrix.set(i9, 6, i11);
            }
            if (b(byteMatrix.get(6, i9))) {
                byteMatrix.set(6, i9, i11);
            }
            i9 = i10;
        }
    }
}
