package com.alipay.android.msp.framework.minizxing;

import android.taobao.util.b;
import com.alipay.android.msp.framework.minizxing.Version;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Encoder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f4801a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: com.alipay.android.msp.framework.minizxing.Encoder$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4802a = new int[Mode.values().length];

        static {
            try {
                f4802a[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4802a[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4802a[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4802a[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private Encoder() {
    }

    public static QRCode encode(String str, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (QRCode) ipChange.ipc$dispatch("3010eb61", new Object[]{str, errorCorrectionLevel}) : encode(str, errorCorrectionLevel, null);
    }

    public static QRCode encode(String str, ErrorCorrectionLevel errorCorrectionLevel, Map<EncodeHintType, ?> map) throws WriterException {
        CharacterSetECI characterSetECIByName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QRCode) ipChange.ipc$dispatch("ec48c4ac", new Object[]{str, errorCorrectionLevel, map});
        }
        String str2 = map == null ? null : (String) map.get(EncodeHintType.CHARACTER_SET);
        if (str2 == null) {
            str2 = b.ISO88591;
        }
        Mode a2 = a(str, str2);
        BitArray bitArray = new BitArray();
        if (a2 == Mode.BYTE && !b.ISO88591.equals(str2) && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(str2)) != null) {
            bitArray.appendBits(Mode.ECI.getBits(), 4);
            bitArray.appendBits(characterSetECIByName.getValue(), 8);
        }
        a(a2, bitArray);
        BitArray bitArray2 = new BitArray();
        a(str, a2, bitArray2, str2);
        Version a3 = a(bitArray.getSize() + a2.getCharacterCountBits(a(bitArray.getSize() + a2.getCharacterCountBits(Version.getVersionForNumber(1)) + bitArray2.getSize(), errorCorrectionLevel)) + bitArray2.getSize(), errorCorrectionLevel);
        BitArray bitArray3 = new BitArray();
        bitArray3.appendBitArray(bitArray);
        a(a2 == Mode.BYTE ? bitArray2.getSizeInBytes() : str.length(), a3, a2, bitArray3);
        bitArray3.appendBitArray(bitArray2);
        Version.ECBlocks eCBlocksForLevel = a3.getECBlocksForLevel(errorCorrectionLevel);
        int totalCodewords = a3.getTotalCodewords() - eCBlocksForLevel.getTotalECCodewords();
        a(totalCodewords, bitArray3);
        BitArray a4 = a(bitArray3, a3.getTotalCodewords(), totalCodewords, eCBlocksForLevel.getNumBlocks());
        QRCode qRCode = new QRCode();
        qRCode.setECLevel(errorCorrectionLevel);
        qRCode.setMode(a2);
        qRCode.setVersion(a3);
        int dimensionForVersion = a3.getDimensionForVersion();
        ByteMatrix byteMatrix = new ByteMatrix(dimensionForVersion, dimensionForVersion);
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            MatrixUtil.a(a4, errorCorrectionLevel, a3, i3, byteMatrix);
            int a5 = MaskUtil.a(byteMatrix) + MaskUtil.b(byteMatrix) + MaskUtil.c(byteMatrix) + MaskUtil.d(byteMatrix);
            if (a5 < i) {
                i2 = i3;
                i = a5;
            }
        }
        qRCode.setMaskPattern(i2);
        MatrixUtil.a(a4, errorCorrectionLevel, a3, i2, byteMatrix);
        qRCode.setMatrix(byteMatrix);
        return qRCode;
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        int[] iArr = f4801a;
        if (i >= iArr.length) {
            return -1;
        }
        return iArr[i];
    }

    public static Mode chooseMode(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mode) ipChange.ipc$dispatch("7c11776a", new Object[]{str}) : a(str, (String) null);
    }

    private static Mode a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mode) ipChange.ipc$dispatch("b289e37b", new Object[]{str, str2});
        }
        if ("Shift_JIS".equals(str2)) {
            return a(str) ? Mode.KANJI : Mode.BYTE;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (a(charAt) == -1) {
                return Mode.BYTE;
            } else {
                z = true;
            }
        }
        if (z) {
            return Mode.ALPHANUMERIC;
        }
        if (z2) {
            return Mode.NUMERIC;
        }
        return Mode.BYTE;
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static Version a(int i, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Version) ipChange.ipc$dispatch("d8301963", new Object[]{new Integer(i), errorCorrectionLevel});
        }
        for (int i2 = 2; i2 <= 40; i2++) {
            Version versionForNumber = Version.getVersionForNumber(i2);
            if (versionForNumber.getTotalCodewords() - versionForNumber.getECBlocksForLevel(errorCorrectionLevel).getTotalECCodewords() >= (i + 7) / 8) {
                return versionForNumber;
            }
        }
        throw new WriterException("Data too big");
    }

    public static void a(int i, BitArray bitArray) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73bb60b", new Object[]{new Integer(i), bitArray});
            return;
        }
        int i2 = i << 3;
        if (bitArray.getSize() > i2) {
            throw new WriterException("data bits cannot fit in the QR Code" + bitArray.getSize() + " > " + i2);
        }
        for (int i3 = 0; i3 < 4 && bitArray.getSize() < i2; i3++) {
            bitArray.appendBit(false);
        }
        int size = bitArray.getSize() & 7;
        if (size > 0) {
            while (size < 8) {
                bitArray.appendBit(false);
                size++;
            }
        }
        int sizeInBytes = i - bitArray.getSizeInBytes();
        for (int i4 = 0; i4 < sizeInBytes; i4++) {
            bitArray.appendBits((i4 & 1) == 0 ? 236 : 17, 8);
        }
        if (bitArray.getSize() != i2) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    public static void a(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a16dfc4", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr, iArr2});
        } else if (i4 >= i3) {
            throw new WriterException("Block ID too large");
        } else {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new WriterException("EC bytes mismatch");
            }
            if (i3 != i6 + i5) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                throw new WriterException("Total bytes mismatch");
            }
            if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
                return;
            }
            iArr[0] = i10;
            iArr2[0] = i12;
        }
    }

    public static BitArray a(BitArray bitArray, int i, int i2, int i3) throws WriterException {
        IpChange ipChange = $ipChange;
        int i4 = 1;
        if (ipChange instanceof IpChange) {
            return (BitArray) ipChange.ipc$dispatch("12b759fb", new Object[]{bitArray, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (bitArray.getSizeInBytes() != i2) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList<BlockPair> arrayList = new ArrayList(i3);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i3) {
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            a(i, i2, i3, i6, iArr, iArr2);
            int i9 = iArr[0];
            byte[] bArr = new byte[i9];
            bitArray.toBytes(i7 * 8, bArr, 0, i9);
            byte[] a2 = a(bArr, iArr2[0]);
            arrayList.add(new BlockPair(bArr, a2));
            i8 = Math.max(i8, i9);
            i5 = Math.max(i5, a2.length);
            i7 += iArr[0];
            i6++;
            i4 = 1;
        }
        int i10 = i5;
        if (i2 != i7) {
            throw new WriterException("Data bytes does not match offset");
        }
        BitArray bitArray2 = new BitArray();
        for (int i11 = 0; i11 < i8; i11++) {
            for (BlockPair blockPair : arrayList) {
                byte[] dataBytes = blockPair.getDataBytes();
                if (i11 < dataBytes.length) {
                    bitArray2.appendBits(dataBytes[i11], 8);
                }
            }
        }
        for (int i12 = 0; i12 < i10; i12++) {
            for (BlockPair blockPair2 : arrayList) {
                byte[] errorCorrectionBytes = blockPair2.getErrorCorrectionBytes();
                if (i12 < errorCorrectionBytes.length) {
                    bitArray2.appendBits(errorCorrectionBytes[i12], 8);
                }
            }
        }
        if (i == bitArray2.getSizeInBytes()) {
            return bitArray2;
        }
        throw new WriterException("Interleaving error: " + i + " and " + bitArray2.getSizeInBytes() + " differ.");
    }

    public static byte[] a(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bb6a45a9", new Object[]{bArr, new Integer(i)});
        }
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new ReedSolomonEncoder(GenericGF.QR_CODE_FIELD_256).encode(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    public static void a(Mode mode, BitArray bitArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5319c7f", new Object[]{mode, bitArray});
        } else {
            bitArray.appendBits(mode.getBits(), 4);
        }
    }

    public static void a(int i, Version version, Mode mode, BitArray bitArray) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31395a58", new Object[]{new Integer(i), version, mode, bitArray});
            return;
        }
        int characterCountBits = mode.getCharacterCountBits(version);
        int i2 = 1 << characterCountBits;
        if (i >= i2) {
            throw new WriterException(i + " is bigger than " + (i2 - 1));
        }
        bitArray.appendBits(i, characterCountBits);
    }

    public static void a(String str, Mode mode, BitArray bitArray, String str2) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7aee53", new Object[]{str, mode, bitArray, str2});
            return;
        }
        int i = AnonymousClass1.f4802a[mode.ordinal()];
        if (i == 1) {
            a((CharSequence) str, bitArray);
        } else if (i == 2) {
            b(str, bitArray);
        } else if (i == 3) {
            a(str, bitArray, str2);
        } else if (i == 4) {
            a(str, bitArray);
        } else {
            throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
        }
    }

    public static void a(CharSequence charSequence, BitArray bitArray) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a429b53a", new Object[]{charSequence, bitArray});
            return;
        }
        int length = charSequence.length();
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                bitArray.appendBits((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    bitArray.appendBits((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    bitArray.appendBits(charAt, 4);
                }
            }
        }
    }

    public static void b(CharSequence charSequence, BitArray bitArray) throws WriterException {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2db1f59", new Object[]{charSequence, bitArray});
            return;
        }
        int length = charSequence.length();
        while (i < length) {
            int a2 = a(charSequence.charAt(i));
            if (a2 == -1) {
                throw new WriterException();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int a3 = a(charSequence.charAt(i2));
                if (a3 == -1) {
                    throw new WriterException();
                }
                bitArray.appendBits((a2 * 45) + a3, 11);
                i += 2;
            } else {
                bitArray.appendBits(a2, 6);
                i = i2;
            }
        }
    }

    public static void a(String str, BitArray bitArray, String str2) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d1e8a9e", new Object[]{str, bitArray, str2});
            return;
        }
        try {
            for (byte b : str.getBytes(str2)) {
                bitArray.appendBits(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[LOOP:0: B:8:0x001c->B:21:0x0049, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r6, com.alipay.android.msp.framework.minizxing.BitArray r7) throws com.alipay.android.msp.framework.minizxing.WriterException {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.framework.minizxing.Encoder.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r6 = 1
            r1[r6] = r7
            java.lang.String r6 = "f71add4"
            r0.ipc$dispatch(r6, r1)
            return
        L15:
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L61
            int r0 = r6.length
        L1c:
            if (r2 >= r0) goto L60
            r1 = r6[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r1 < r3) goto L38
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r1 > r5) goto L38
        L36:
            int r1 = r1 - r3
            goto L47
        L38:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r1 < r3) goto L46
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r1 > r3) goto L46
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L36
        L46:
            r1 = -1
        L47:
            if (r1 == r4) goto L58
            int r3 = r1 >> 8
            int r3 = r3 * 192
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r1
            r1 = 13
            r7.appendBits(r3, r1)
            int r2 = r2 + 2
            goto L1c
        L58:
            com.alipay.android.msp.framework.minizxing.WriterException r6 = new com.alipay.android.msp.framework.minizxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L60:
            return
        L61:
            r6 = move-exception
            com.alipay.android.msp.framework.minizxing.WriterException r7 = new com.alipay.android.msp.framework.minizxing.WriterException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.minizxing.Encoder.a(java.lang.String, com.alipay.android.msp.framework.minizxing.BitArray):void");
    }
}
