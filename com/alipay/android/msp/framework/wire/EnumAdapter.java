package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.wire.ProtoEnum;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class EnumAdapter<E extends ProtoEnum> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<ProtoEnum> f4887a = new Comparator<ProtoEnum>() { // from class: com.alipay.android.msp.framework.wire.EnumAdapter.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public int compare(ProtoEnum protoEnum, ProtoEnum protoEnum2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("15075c7f", new Object[]{this, protoEnum, protoEnum2})).intValue() : protoEnum.getValue() - protoEnum2.getValue();
        }
    };
    private final Class<E> b;
    private final int[] c;
    private final E[] d;
    private final boolean e;

    public EnumAdapter(Class<E> cls) {
        this.b = cls;
        this.d = cls.getEnumConstants();
        Arrays.sort(this.d, f4887a);
        E[] eArr = this.d;
        int length = eArr.length;
        if (eArr[0].getValue() == 1 && this.d[length - 1].getValue() == length) {
            this.e = true;
            this.c = null;
            return;
        }
        this.e = false;
        this.c = new int[length];
        for (int i = 0; i < length; i++) {
            this.c[i] = this.d[i].getValue();
        }
    }

    public final int toInt(E e) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2ee9cbed", new Object[]{this, e})).intValue() : e.getValue();
    }

    public final E fromInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("7ae8389c", new Object[]{this, new Integer(i)});
        }
        try {
            return this.d[this.e ? i - 1 : Arrays.binarySearch(this.c, i)];
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("Unknown enum tag " + i + " for " + this.b.getCanonicalName());
        }
    }
}
