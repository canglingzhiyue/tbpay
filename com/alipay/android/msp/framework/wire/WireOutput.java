package com.alipay.android.msp.framework.wire;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class WireOutput {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f4912a;
    private final int b;
    private int c;

    public static int a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821974f", new Object[]{new Long(j)})).intValue();
        }
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue();
        }
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static long d(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad40212d", new Object[]{new Long(j)})).longValue() : (j >> 63) ^ (j << 1);
    }

    public static int g(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b25ea748", new Object[]{new Integer(i)})).intValue() : (i >> 31) ^ (i << 1);
    }

    public static int int32Size(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ee3b900", new Object[]{new Integer(i)})).intValue();
        }
        if (i < 0) {
            return 10;
        }
        return b(i);
    }

    public static int int64Size(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3624b742", new Object[]{new Long(j)})).intValue();
        }
        if (j < 0) {
            return 10;
        }
        return a(j);
    }

    public static int tagSize(int i, WireType wireType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("300b2c47", new Object[]{new Integer(i), wireType})).intValue() : int32Size(makeTag(i, wireType));
    }

    public static int messageSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1646b9c2", new Object[]{new Integer(i), new Integer(i2)})).intValue() : tagSize(i, WireType.LENGTH_DELIMITED) + int32Size(i2) + i2;
    }

    public static int writeTag(int i, WireType wireType, byte[] bArr, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6e35d2bb", new Object[]{new Integer(i), wireType, bArr, new Integer(i2)})).intValue() : writeVarint(makeTag(i, wireType), bArr, i2);
    }

    public static int writeVarint(long j, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39f817f9", new Object[]{new Long(j), bArr, new Integer(i)})).intValue();
        }
        int i2 = i;
        while (((-128) & j) != 0) {
            bArr[i2] = (byte) ((127 & j) | 128);
            j >>>= 7;
            i2++;
        }
        bArr[i2] = (byte) j;
        return (i2 + 1) - i;
    }

    public static int messageHeaderSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e82802ef", new Object[]{new Integer(i), new Integer(i2)})).intValue() : tagSize(i, WireType.LENGTH_DELIMITED) + int32Size(i2);
    }

    public static int writeMessageHeader(int i, byte[] bArr, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1e4e881", new Object[]{new Integer(i), bArr, new Integer(i2), new Integer(i3)})).intValue();
        }
        int writeTag = writeTag(i, WireType.LENGTH_DELIMITED, bArr, i2) + i2;
        return (writeTag + writeVarint(i3, bArr, writeTag)) - i2;
    }

    public static int makeTag(int i, WireType wireType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ef9378d6", new Object[]{new Integer(i), wireType})).intValue() : (i << 3) | wireType.value();
    }

    private WireOutput(byte[] bArr, int i, int i2) {
        this.f4912a = bArr;
        this.c = i;
        this.b = i + i2;
    }

    public static WireOutput a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WireOutput) ipChange.ipc$dispatch("b29d0473", new Object[]{bArr}) : a(bArr, 0, bArr.length);
    }

    public static WireOutput a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WireOutput) ipChange.ipc$dispatch("d15d87d3", new Object[]{bArr, new Integer(i), new Integer(i2)}) : new WireOutput(bArr, i, i2);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue() : b(makeTag(i, WireType.VARINT));
    }

    public final void a(byte b) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8217954", new Object[]{this, new Byte(b)});
            return;
        }
        int i = this.c;
        if (i == this.b) {
            throw new IOException("Out of space: position=" + this.c + ", limit=" + this.b);
        }
        byte[] bArr = this.f4912a;
        this.c = i + 1;
        bArr[i] = b;
    }

    public final void c(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            a((byte) i);
        }
    }

    public final void b(byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ffa270", new Object[]{this, bArr});
        } else {
            b(bArr, 0, bArr.length);
        }
    }

    public final void b(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4faf26d0", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = this.b;
        int i4 = this.c;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f4912a, i4, i2);
            this.c += i2;
            return;
        }
        throw new IOException("Out of space: position=" + this.c + ", limit=" + this.b);
    }

    public final void a(int i, WireType wireType) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5269e6e", new Object[]{this, new Integer(i), wireType});
        } else {
            e(makeTag(i, wireType));
        }
    }

    public final void d(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            e(i);
        } else {
            b(i);
        }
    }

    public final void e(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        while ((i & (-128)) != 0) {
            c((i & 127) | 128);
            i >>>= 7;
        }
        c(i);
    }

    public final void b(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        while (((-128) & j) != 0) {
            c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        c((int) j);
    }

    public final void f(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
            return;
        }
        c(i & 255);
        c((i >> 8) & 255);
        c((i >> 16) & 255);
        c(i >>> 24);
    }

    public final void c(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
            return;
        }
        c(((int) j) & 255);
        c(((int) (j >> 8)) & 255);
        c(((int) (j >> 16)) & 255);
        c(((int) (j >> 24)) & 255);
        c(((int) (j >> 32)) & 255);
        c(((int) (j >> 40)) & 255);
        c(((int) (j >> 48)) & 255);
        c(((int) (j >> 56)) & 255);
    }
}
