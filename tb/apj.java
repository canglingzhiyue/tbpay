package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class apj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1132996097);
    }

    public static int a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb6ab7c2", new Object[]{bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        if (bArr == null || i < 0 || i2 < 0 || bArr.length < i + i2) {
            return 0;
        }
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = bArr[i];
            i++;
        }
        return a(bArr2);
    }

    public static int a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c196722", new Object[]{bArr})).intValue();
        }
        if (bArr == null || bArr.length > 4) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= (bArr[i2] & 255) << (((bArr.length - i2) - 1) << 3);
        }
        return i;
    }

    public static byte[] a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("5c10e0a2", new Object[]{new Integer(i)}) : new byte[]{(byte) i};
    }

    public static byte[] b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("90f71be3", new Object[]{new Integer(i)}) : new byte[]{(byte) (i >> 8), (byte) i};
    }

    public static byte[] c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("c5dd5724", new Object[]{new Integer(i)}) : new byte[]{(byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static byte[] d(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("fac39265", new Object[]{new Integer(i)}) : new byte[]{(byte) (i >>> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static byte[] b(byte[] bArr, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a635b40d", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        if (bArr == null || i < 0 || i2 < 0 || bArr.length < (i3 = i + i2)) {
            return null;
        }
        byte[] bArr2 = new byte[i2];
        for (int i4 = i; i4 < i3; i4++) {
            bArr2[i4 - i] = bArr[i4];
        }
        return bArr2;
    }
}
