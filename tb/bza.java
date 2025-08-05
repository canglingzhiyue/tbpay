package tb;

/* loaded from: classes.dex */
public class bza {
    static {
        kge.a(-1557130775);
    }

    public static int a(byte[] bArr) {
        if (bArr == null || bArr.length > 4) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= (bArr[i2] & 255) << (((bArr.length - i2) - 1) << 3);
        }
        return i;
    }

    public static int a(byte[] bArr, int i, int i2) {
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

    public static byte[] a(int i) {
        return new byte[]{(byte) (i >> 8), (byte) i};
    }

    public static byte[] b(int i) {
        return new byte[]{(byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static byte[] c(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }
}
