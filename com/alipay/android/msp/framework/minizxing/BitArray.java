package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class BitArray implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int[] f4796a;
    private int b;

    public BitArray() {
        this.b = 0;
        this.f4796a = new int[1];
    }

    public BitArray(int[] iArr, int i) {
        this.f4796a = iArr;
        this.b = i;
    }

    public final int getSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue() : this.b;
    }

    public final int getSizeInBytes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("46062c9", new Object[]{this})).intValue() : (this.b + 7) / 8;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        int[] iArr = this.f4796a;
        if (i <= (iArr.length << 5)) {
            return;
        }
        int[] iArr2 = new int[(i + 31) / 32];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.f4796a = iArr2;
    }

    public final boolean get(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("72fc15ca", new Object[]{this, new Integer(i)})).booleanValue() : ((1 << (i & 31)) & this.f4796a[i / 32]) != 0;
    }

    public final void set(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518a303a", new Object[]{this, new Integer(i)});
            return;
        }
        int[] iArr = this.f4796a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public final void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        int length = this.f4796a.length;
        for (int i = 0; i < length; i++) {
            this.f4796a[i] = 0;
        }
    }

    public final void appendBit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa2db7a", new Object[]{this, new Boolean(z)});
            return;
        }
        a(this.b + 1);
        if (z) {
            int[] iArr = this.f4796a;
            int i = this.b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.b++;
    }

    public final void appendBits(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf2ba67", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        } else {
            a(this.b + i2);
            while (i2 > 0) {
                appendBit(((i >> (i2 + (-1))) & 1) == 1);
                i2--;
            }
        }
    }

    public final void appendBitArray(BitArray bitArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac5bcd9", new Object[]{this, bitArray});
            return;
        }
        int i = bitArray.b;
        a(this.b + i);
        for (int i2 = 0; i2 < i; i2++) {
            appendBit(bitArray.get(i2));
        }
    }

    public final void xor(BitArray bitArray) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb65e8a4", new Object[]{this, bitArray});
        } else if (this.f4796a.length != bitArray.f4796a.length) {
            throw new IllegalArgumentException("Sizes don't match");
        } else {
            while (true) {
                int[] iArr = this.f4796a;
                if (i >= iArr.length) {
                    return;
                }
                iArr[i] = iArr[i] ^ bitArray.f4796a[i];
                i++;
            }
        }
    }

    public final void toBytes(int i, byte[] bArr, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af3e2013", new Object[]{this, new Integer(i), bArr, new Integer(i2), new Integer(i3)});
            return;
        }
        int i4 = i;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = i4;
            int i7 = 0;
            for (int i8 = 0; i8 < 8; i8++) {
                if (get(i6)) {
                    i7 |= 1 << (7 - i8);
                }
                i6++;
            }
            bArr[i2 + i5] = (byte) i7;
            i5++;
            i4 = i6;
        }
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof BitArray)) {
            return false;
        }
        BitArray bitArray = (BitArray) obj;
        return this.b == bitArray.b && Arrays.equals(this.f4796a, bitArray.f4796a);
    }

    public final int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : (this.b * 31) + Arrays.hashCode(this.f4796a);
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(this.b);
        for (int i = 0; i < this.b; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(get(i) ? 'X' : '.');
        }
        return sb.toString();
    }

    /* renamed from: clone */
    public final BitArray m521clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BitArray) ipChange.ipc$dispatch("6bf7ad5a", new Object[]{this}) : new BitArray((int[]) this.f4796a.clone(), this.b);
    }
}
