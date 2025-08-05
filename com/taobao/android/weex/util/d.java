package com.taobao.android.weex.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.DataOutput;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends FilterOutputStream implements DataOutput {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f15899a;
    private byte[] b;
    private byte[] c;

    static {
        kge.a(-832874148);
        kge.a(-1379375929);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        }
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // java.io.DataOutput
    public final void writeBytes(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d6a55d", new Object[]{this, str});
        }
    }

    @Override // java.io.DataOutput
    public void writeChars(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da37bb4f", new Object[]{this, str});
        }
    }

    @Override // java.io.DataOutput
    public void writeUTF(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e40485d9", new Object[]{this, str});
        }
    }

    public d(OutputStream outputStream) {
        super(outputStream);
        this.b = null;
        this.c = new byte[8];
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.f15899a + i;
        if (i2 < 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.f15899a = i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public synchronized void write(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
            return;
        }
        this.out.write(i);
        a(1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public synchronized void write(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            return;
        }
        this.out.write(bArr, i, i2);
        a(i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        } else {
            this.out.flush();
        }
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b8184", new Object[]{this, new Boolean(z)});
            return;
        }
        this.out.write(z ? 1 : 0);
        a(1);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f43b635", new Object[]{this, new Integer(i)});
            return;
        }
        this.out.write(i);
        a(1);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398c919f", new Object[]{this, new Integer(i)});
            return;
        }
        this.out.write(i & 255);
        this.out.write((i >>> 8) & 255);
        a(2);
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6acc4a7", new Object[]{this, new Integer(i)});
            return;
        }
        this.out.write(i & 255);
        this.out.write((i >>> 8) & 255);
        a(2);
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0c8f1cc", new Object[]{this, new Integer(i)});
            return;
        }
        this.out.write(i & 255);
        this.out.write((i >>> 8) & 255);
        this.out.write((i >>> 16) & 255);
        this.out.write(i >>> 24);
        a(4);
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1289d02", new Object[]{this, new Long(j)});
            return;
        }
        byte[] bArr = this.c;
        bArr[0] = (byte) j;
        bArr[1] = (byte) (j >>> 8);
        bArr[2] = (byte) (j >>> 16);
        bArr[3] = (byte) (j >>> 24);
        bArr[4] = (byte) (j >>> 32);
        bArr[5] = (byte) (j >>> 40);
        bArr[6] = (byte) (j >>> 48);
        bArr[7] = (byte) (j >>> 56);
        this.out.write(this.c, 0, 8);
        a(8);
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f99947c", new Object[]{this, new Float(f)});
        } else {
            writeInt(Float.floatToIntBits(f));
        }
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f17aa07", new Object[]{this, new Double(d)});
        } else {
            writeLong(Double.doubleToLongBits(d));
        }
    }
}
