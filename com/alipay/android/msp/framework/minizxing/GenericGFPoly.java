package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class GenericGFPoly {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final GenericGF f4804a;
    private final int[] b;

    public GenericGFPoly(GenericGF genericGF, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f4804a = genericGF;
        int length = iArr.length;
        if (length > 1 && iArr[0] == 0) {
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.b = new int[]{0};
                return;
            }
            this.b = new int[length - i];
            int[] iArr2 = this.b;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        this.b = iArr;
    }

    public final int[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a821217c", new Object[]{this}) : this.b;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b.length - 1;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b[0] == 0;
    }

    public final int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    public final GenericGFPoly a(GenericGFPoly genericGFPoly) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GenericGFPoly) ipChange.ipc$dispatch("b5518a6e", new Object[]{this, genericGFPoly});
        }
        if (!this.f4804a.equals(genericGFPoly.f4804a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c()) {
            return genericGFPoly;
        }
        if (genericGFPoly.c()) {
            return this;
        }
        int[] iArr = this.b;
        int[] iArr2 = genericGFPoly.b;
        if (iArr.length > iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr2.length];
        int length = iArr2.length - iArr.length;
        System.arraycopy(iArr2, 0, iArr3, 0, length);
        for (int i = length; i < iArr2.length; i++) {
            iArr3[i] = GenericGF.b(iArr[i - length], iArr2[i]);
        }
        return new GenericGFPoly(this.f4804a, iArr3);
    }

    public final GenericGFPoly b(GenericGFPoly genericGFPoly) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GenericGFPoly) ipChange.ipc$dispatch("14c1654d", new Object[]{this, genericGFPoly});
        }
        if (!this.f4804a.equals(genericGFPoly.f4804a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c() || genericGFPoly.c()) {
            return this.f4804a.a();
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = genericGFPoly.b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = GenericGF.b(iArr3[i4], this.f4804a.c(i2, iArr2[i3]));
            }
        }
        return new GenericGFPoly(this.f4804a, iArr3);
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
            return this.f4804a.a();
        }
        int length = this.b.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.f4804a.c(this.b[i3], i2);
        }
        return new GenericGFPoly(this.f4804a, iArr);
    }

    public final GenericGFPoly[] c(GenericGFPoly genericGFPoly) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GenericGFPoly[]) ipChange.ipc$dispatch("6eef4a27", new Object[]{this, genericGFPoly});
        }
        if (!this.f4804a.equals(genericGFPoly.f4804a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (genericGFPoly.c()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        GenericGFPoly a2 = this.f4804a.a();
        int c = this.f4804a.c(genericGFPoly.a(genericGFPoly.b()));
        GenericGFPoly genericGFPoly2 = a2;
        GenericGFPoly genericGFPoly3 = this;
        while (genericGFPoly3.b() >= genericGFPoly.b() && !genericGFPoly3.c()) {
            int b = genericGFPoly3.b() - genericGFPoly.b();
            int c2 = this.f4804a.c(genericGFPoly3.a(genericGFPoly3.b()), c);
            GenericGFPoly a3 = genericGFPoly.a(b, c2);
            genericGFPoly2 = genericGFPoly2.a(this.f4804a.a(b, c2));
            genericGFPoly3 = genericGFPoly3.a(a3);
        }
        return new GenericGFPoly[]{genericGFPoly2, genericGFPoly3};
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(b() * 8);
        for (int b = b(); b >= 0; b--) {
            int a2 = a(b);
            if (a2 != 0) {
                if (a2 < 0) {
                    sb.append(" - ");
                    a2 = -a2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (b == 0 || a2 != 1) {
                    int b2 = this.f4804a.b(a2);
                    if (b2 == 0) {
                        sb.append('1');
                    } else if (b2 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(b2);
                    }
                }
                if (b != 0) {
                    if (b == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(b);
                    }
                }
            }
        }
        return sb.toString();
    }
}
