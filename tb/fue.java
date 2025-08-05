package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fue {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-811454219);
    }

    public static int a(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2713f1a7", new Object[]{bArr, new Integer(i)})).intValue() : bArr[i] & 255;
    }

    public static int b(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ef51e86", new Object[]{bArr, new Integer(i)})).intValue() : (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    public static int c(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f6d64b65", new Object[]{bArr, new Integer(i)})).intValue() : (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    public static int d(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb77844", new Object[]{bArr, new Integer(i)})).intValue() : (bArr[i] & 255) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    public static double e(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c698a51e", new Object[]{bArr, new Integer(i)})).doubleValue() : Double.longBitsToDouble(f(bArr, i));
    }

    public static long f(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2e79d203", new Object[]{bArr, new Integer(i)})).longValue() : (bArr[i] & 255) | ((bArr[i + 7] & 255) << 56) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }
}
