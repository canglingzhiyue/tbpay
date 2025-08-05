package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* loaded from: classes.dex */
public class fwr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f28170a;
    private byte[] b;
    private int c;
    private int d;

    static {
        kge.a(530799128);
    }

    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
            return;
        }
        this.b = bArr;
        byte[] bArr2 = this.b;
        if (bArr2 != null) {
            this.d = bArr2.length;
        } else {
            this.d = 0;
        }
        this.c = 0;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f28170a = i;
        }
    }

    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue() : c(this.c + i);
    }

    public boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int i2 = this.d;
        if (i > i2) {
            this.c = i2;
        } else if (i < 0) {
            this.c = 0;
        } else {
            this.c = i;
            return true;
        }
        return false;
    }

    public byte[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a8212175", new Object[]{this}) : this.b;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.c;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.d;
    }

    public byte d() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2d7", new Object[]{this})).byteValue();
        }
        byte[] bArr = this.b;
        if (bArr != null && (i = this.c) < this.d) {
            this.c = i + 1;
            return bArr[i];
        }
        Log.e("CodeReader_TMTEST", "readByte error mCode:" + this.b + "  mCurIndex:" + this.c + "  mCount:" + this.d);
        return (byte) -1;
    }

    public short e() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca69", new Object[]{this})).shortValue();
        }
        byte[] bArr = this.b;
        if (bArr != null && (i = this.c) < this.d - 1) {
            this.c = i + 1;
            int i2 = this.c;
            this.c = i2 + 1;
            return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
        }
        Log.e("CodeReader_TMTEST", "readShort error mCode:" + this.b + "  mCurIndex:" + this.c + "  mCount:" + this.d);
        return (short) -1;
    }

    public int f() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        byte[] bArr = this.b;
        if (bArr != null && (i = this.c) < this.d - 3) {
            this.c = i + 1;
            int i2 = this.c;
            this.c = i2 + 1;
            int i3 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
            int i4 = this.c;
            this.c = i4 + 1;
            int i5 = i3 | ((bArr[i4] & 255) << 8);
            int i6 = this.c;
            this.c = i6 + 1;
            return (bArr[i6] & 255) | i5;
        }
        Log.e("CodeReader_TMTEST", "readInt error mCode:" + this.b + "  mCurIndex:" + this.c + "  mCount:" + this.d);
        return -1;
    }

    public byte[] a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("26190715", new Object[]{this, new Integer(i), new Integer(i2)}) : Arrays.copyOfRange(this.b, i, i2);
    }

    public long g() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue();
        }
        byte[] bArr = this.b;
        if (bArr != null && (i = this.c) < this.d - 7) {
            this.c = i + 1;
            int i2 = this.c;
            this.c = i2 + 1;
            long j = ((bArr[i] & 255) << 56) | ((bArr[i2] & 255) << 48);
            int i3 = this.c;
            this.c = i3 + 1;
            long j2 = j | ((bArr[i3] & 255) << 40);
            int i4 = this.c;
            this.c = i4 + 1;
            long j3 = j2 | ((bArr[i4] & 255) << 32);
            int i5 = this.c;
            this.c = i5 + 1;
            long j4 = j3 | ((bArr[i5] & 255) << 24);
            int i6 = this.c;
            this.c = i6 + 1;
            long j5 = j4 | ((bArr[i6] & 255) << 16);
            int i7 = this.c;
            this.c = i7 + 1;
            long j6 = j5 | ((bArr[i7] & 255) << 8);
            int i8 = this.c;
            this.c = i8 + 1;
            return j6 | (255 & bArr[i8]);
        }
        Log.e("CodeReader_TMTEST", "readLong error mCode:" + this.b + "  mCurIndex:" + this.c + "  mCount:" + this.d);
        return -1L;
    }

    public double h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10dd", new Object[]{this})).doubleValue() : Double.longBitsToDouble(g());
    }

    public float i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue() : Float.intBitsToFloat(f());
    }
}
