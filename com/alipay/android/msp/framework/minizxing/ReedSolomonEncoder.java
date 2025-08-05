package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ReedSolomonEncoder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final GenericGF f4808a;
    private final List<GenericGFPoly> b = new ArrayList();

    public ReedSolomonEncoder(GenericGF genericGF) {
        this.f4808a = genericGF;
        this.b.add(new GenericGFPoly(genericGF, new int[]{1}));
    }

    private GenericGFPoly a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GenericGFPoly) ipChange.ipc$dispatch("9a3b2437", new Object[]{this, new Integer(i)});
        }
        if (i >= this.b.size()) {
            List<GenericGFPoly> list = this.b;
            GenericGFPoly genericGFPoly = list.get(list.size() - 1);
            for (int size = this.b.size(); size <= i; size++) {
                GenericGF genericGF = this.f4808a;
                genericGFPoly = genericGFPoly.b(new GenericGFPoly(genericGF, new int[]{1, genericGF.a((size - 1) + genericGF.getGeneratorBase())}));
                this.b.add(genericGFPoly);
            }
        }
        return this.b.get(i);
    }

    public final void encode(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a6fcf8", new Object[]{this, iArr, new Integer(i)});
        } else if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        } else {
            int length = iArr.length - i;
            if (length <= 0) {
                throw new IllegalArgumentException("No data bytes provided");
            }
            GenericGFPoly a2 = a(i);
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            int[] a3 = new GenericGFPoly(this.f4808a, iArr2).a(i, 1).c(a2)[1].a();
            int length2 = i - a3.length;
            for (int i2 = 0; i2 < length2; i2++) {
                iArr[length + i2] = 0;
            }
            System.arraycopy(a3, 0, iArr, length + length2, a3.length);
        }
    }
}
