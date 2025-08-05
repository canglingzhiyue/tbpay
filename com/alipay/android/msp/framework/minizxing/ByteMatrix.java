package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public final class ByteMatrix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final byte[][] f4799a;
    private final int b;
    private final int c;

    public ByteMatrix(int i, int i2) {
        this.f4799a = (byte[][]) Array.newInstance(byte.class, i2, i);
        this.b = i;
        this.c = i2;
    }

    public final int getHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue() : this.c;
    }

    public final int getWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue() : this.b;
    }

    public final byte get(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec8715e9", new Object[]{this, new Integer(i), new Integer(i2)})).byteValue() : this.f4799a[i2][i];
    }

    public final byte[][] getArray() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[][]) ipChange.ipc$dispatch("c1966f36", new Object[]{this}) : this.f4799a;
    }

    public final void set(int i, int i2, byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17cd4fd3", new Object[]{this, new Integer(i), new Integer(i2), new Byte(b)});
        } else {
            this.f4799a[i2][i] = b;
        }
    }

    public final void set(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17cd6a1a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            this.f4799a[i2][i] = (byte) i3;
        }
    }

    public final void set(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17cda9eb", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else {
            this.f4799a[i2][i] = z ? (byte) 1 : (byte) 0;
        }
    }

    public final void clear(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17c96e8", new Object[]{this, new Byte(b)});
            return;
        }
        for (int i = 0; i < this.c; i++) {
            for (int i2 = 0; i2 < this.b; i2++) {
                this.f4799a[i][i2] = b;
            }
        }
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder((this.b * 2 * this.c) + 2);
        for (int i = 0; i < this.c; i++) {
            for (int i2 = 0; i2 < this.b; i2++) {
                byte b = this.f4799a[i][i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b == 1) {
                    sb.append(" 1");
                } else {
                    sb.append("  ");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
