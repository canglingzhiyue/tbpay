package tb;

/* loaded from: classes.dex */
public class cwz {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f26578a = "0123456789ABCDEF".toCharArray();

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length << 1);
        for (byte b : bArr) {
            sb.append(f26578a[(b >> 4) & 15]);
            sb.append(f26578a[b & 15]);
        }
        return sb.toString();
    }

    public static byte[] a(String str) {
        return a(str.toCharArray());
    }

    private static byte[] a(char[] cArr) {
        if ((cArr.length & 1) == 0) {
            byte[] bArr = new byte[cArr.length >> 1];
            int i = 0;
            int i2 = 0;
            while (i < cArr.length) {
                int digit = Character.digit(cArr[i], 16);
                if (digit == -1) {
                    throw new IllegalArgumentException("Illegal hexadecimal character at index " + i);
                }
                int i3 = i + 1;
                int digit2 = Character.digit(cArr[i3], 16);
                if (digit2 == -1) {
                    throw new IllegalArgumentException("Illegal hexadecimal character at index " + i3);
                }
                i = i3 + 1;
                bArr[i2] = (byte) ((digit << 4) | digit2);
                i2++;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Odd number of characters.");
    }
}
