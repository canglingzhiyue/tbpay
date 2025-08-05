package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class njv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public byte f31508a;
    public byte b;
    public byte c;
    public byte d;
    public byte e;
    public byte f;
    public byte g;
    public byte h;
    public byte i;
    public int j;
    public int k;
    public int l;
    public int m;
    public byte[] n;

    static {
        kge.a(1167548405);
    }

    public njv() {
    }

    public njv(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f31508a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = (byte) i4;
        this.e = (byte) i5;
        this.f = (byte) i6;
        this.g = (byte) i7;
        this.h = (byte) i8;
        this.i = (byte) i9;
        this.j = i10;
    }

    public static int a(int i, njv njvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a96a684", new Object[]{new Integer(i), njvVar})).intValue() : b(i) + 1 + njvVar.k + 1;
    }

    public static List<njv> a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("29594738", new Object[]{bArr});
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < bArr.length) {
            njv njvVar = new njv();
            njvVar.d = (byte) (bArr[i] & 1);
            njvVar.c = (byte) ((bArr[i] >> 1) & 3);
            njvVar.b = (byte) ((bArr[i] >> 3) & 1);
            njvVar.f31508a = (byte) ((bArr[i] >> 4) & 15);
            int i2 = i + 1;
            njvVar.f = (byte) (bArr[i2] & 7);
            njvVar.e = (byte) ((bArr[i2] >> 3) & 31);
            int i3 = i + 2;
            njvVar.h = (byte) (bArr[i3] & 31);
            njvVar.g = (byte) ((bArr[i3] >> 5) & 7);
            int i4 = i + 3;
            njvVar.i = (byte) ((bArr[i4] >> 3) & 31);
            njvVar.j = (njvVar.a(bArr[i4] & 7) << 8) + njvVar.a(bArr[i + 4]);
            njvVar.k = njvVar.a(bArr[b(i)]) + (njvVar.a(bArr[b(i) + 1]) << 8);
            njvVar.l = njvVar.a(bArr[a(i, njvVar)]) + (njvVar.a(bArr[a(i, njvVar) + 1]) << 8);
            njvVar.m = njvVar.a(bArr[b(i, njvVar)]) + (njvVar.a(bArr[b(i, njvVar) + 1]) << 8);
            int b = b(0, njvVar) + 1 + njvVar.m + 1;
            njvVar.n = new byte[b];
            System.arraycopy(bArr, i, njvVar.n, 0, b);
            i += b;
            arrayList.add(njvVar);
        }
        return arrayList;
    }

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue() : i + 5;
    }

    public static int b(int i, njv njvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec747023", new Object[]{new Integer(i), njvVar})).intValue() : a(i, njvVar) + 1 + njvVar.l + 1;
    }

    private int b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3eebbe31", new Object[]{this, bArr, bArr2, bArr3})).intValue();
        }
        this.k = bArr == null ? 0 : bArr.length;
        this.l = bArr2 == null ? 0 : bArr2.length;
        this.m = bArr3 == null ? 0 : bArr3.length;
        return b(0, this) + 1 + this.m + 1;
    }

    public int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : i >= 0 ? i : i + 256;
    }

    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("96da6500", new Object[]{this, bArr, bArr2, bArr3});
        }
        byte[] bArr4 = new byte[b(bArr, bArr2, bArr3)];
        bArr4[0] = (byte) ((this.f31508a << 4) & 240);
        bArr4[0] = (byte) (bArr4[0] | ((byte) ((this.b << 3) & 248)));
        bArr4[0] = (byte) (bArr4[0] | ((byte) ((this.c << 1) & 254)));
        bArr4[0] = (byte) (bArr4[0] | this.d);
        bArr4[1] = (byte) ((this.e << 3) & 248);
        bArr4[1] = (byte) (bArr4[1] | this.f);
        bArr4[2] = (byte) ((this.g << 5) & 224);
        bArr4[2] = (byte) (bArr4[2] | this.h);
        bArr4[3] = (byte) ((this.i << 3) & 248);
        byte b = bArr4[3];
        int i = this.j;
        bArr4[3] = (byte) (b | ((byte) (i / 256)));
        bArr4[4] = (byte) (i % 256);
        bArr4[b(0) + 1] = (byte) (this.k / 256);
        bArr4[b(0)] = (byte) (this.k % 256);
        bArr4[a(0, this) + 1] = (byte) (this.l / 256);
        bArr4[a(0, this)] = (byte) (this.l % 256);
        bArr4[b(0, this) + 1] = (byte) (this.m / 256);
        bArr4[b(0, this)] = (byte) (this.m % 256);
        if (this.k != 0) {
            System.arraycopy(bArr, 0, bArr4, b(0) + 2, this.k);
        }
        if (this.l != 0) {
            System.arraycopy(bArr2, 0, bArr4, a(0, this) + 2, this.l);
        }
        if (this.m != 0) {
            System.arraycopy(bArr3, 0, bArr4, b(0, this) + 2, this.m);
        }
        return bArr4;
    }
}
