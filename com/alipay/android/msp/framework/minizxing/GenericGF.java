package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class GenericGF {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final GenericGF AZTEC_DATA_8;
    public static final GenericGF DATA_MATRIX_FIELD_256;
    public static final GenericGF MAXICODE_FIELD_64;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f4803a;
    private final int[] b;
    private final GenericGFPoly c;
    private final GenericGFPoly d;
    private final int e;
    private final int f;
    private final int g;
    public static final GenericGF AZTEC_DATA_12 = new GenericGF(4201, 4096, 1);
    public static final GenericGF AZTEC_DATA_10 = new GenericGF(1033, 1024, 1);
    public static final GenericGF AZTEC_DATA_6 = new GenericGF(67, 64, 1);
    public static final GenericGF AZTEC_PARAM = new GenericGF(19, 16, 1);
    public static final GenericGF QR_CODE_FIELD_256 = new GenericGF(285, 256, 0);

    public static int b(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("90f78dfc", new Object[]{new Integer(i), new Integer(i2)})).intValue() : i ^ i2;
    }

    static {
        GenericGF genericGF = new GenericGF(301, 256, 1);
        DATA_MATRIX_FIELD_256 = genericGF;
        AZTEC_DATA_8 = genericGF;
        MAXICODE_FIELD_64 = AZTEC_DATA_6;
    }

    public GenericGF(int i, int i2, int i3) {
        this.g = i;
        this.e = i2;
        this.f = i3;
        this.b = new int[i2];
        this.f4803a = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.b[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f4803a[this.b[i6]] = i6;
        }
        this.d = new GenericGFPoly(this, new int[]{0});
        this.c = new GenericGFPoly(this, new int[]{1});
    }

    public final GenericGFPoly a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GenericGFPoly) ipChange.ipc$dispatch("718ed00a", new Object[]{this}) : this.d;
    }

    public final GenericGFPoly a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GenericGFPoly) ipChange.ipc$dispatch("871955aa", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.d;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new GenericGFPoly(this, iArr);
    }

    public final int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : this.b[i];
    }

    public final int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 0) {
            throw new IllegalArgumentException();
        }
        return this.f4803a[i];
    }

    public final int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 0) {
            throw new ArithmeticException();
        }
        return this.b[(this.e - this.f4803a[i]) - 1];
    }

    public final int c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5ddc93d", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        int[] iArr2 = this.f4803a;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.e - 1)];
    }

    public final int getSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue() : this.e;
    }

    public final int getGeneratorBase() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a6a8be08", new Object[]{this})).intValue() : this.f;
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "GF(0x" + Integer.toHexString(this.g) + ',' + this.e + ')';
    }
}
