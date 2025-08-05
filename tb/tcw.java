package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.d;

/* loaded from: classes4.dex */
public class tcw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f34033a;
    private static final char[] b;

    static {
        kge.a(-1896208648);
        f34033a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', d.LEVEL_D, d.LEVEL_E, 'F'};
    }

    public static char[] a(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (char[]) ipChange.ipc$dispatch("bb71fff9", new Object[]{bArr, new Boolean(z)}) : a(bArr, 0, bArr.length, z);
    }

    private static char[] a(byte[] bArr, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("8bb1a899", new Object[]{bArr, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        char[] cArr = z ? b : f34033a;
        char[] cArr2 = new char[i2 << 1];
        for (int i3 = 0; i3 < i2; i3++) {
            byte b2 = bArr[i + i3];
            int i4 = i3 * 2;
            cArr2[i4] = cArr[(b2 >> 4) & 15];
            cArr2[i4 + 1] = cArr[b2 & 15];
        }
        return cArr2;
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr}) : b(bArr, true);
    }

    public static String b(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3ce8aabc", new Object[]{bArr, new Boolean(z)}) : new String(a(bArr, z));
    }

    public static byte[] a(String str) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{str}) : a(str.toCharArray());
    }

    public static byte[] a(char[] cArr) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("2713f3ed", new Object[]{cArr}) : a(cArr, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[LOOP:0: B:14:0x0037->B:15:0x0039, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] a(char[] r6, boolean r7) throws java.lang.IllegalArgumentException {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.tcw.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r6
            java.lang.Boolean r6 = new java.lang.Boolean
            r6.<init>(r7)
            r1[r4] = r6
            java.lang.String r6 = "bb801779"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            byte[] r6 = (byte[]) r6
            return r6
        L1d:
            int r0 = r6.length
            int r1 = r0 + 1
            int r1 = r1 / r3
            byte[] r1 = new byte[r1]
            if (r7 == 0) goto L32
            int r7 = r0 % 2
            if (r7 == 0) goto L36
            int r7 = a(r6, r2)
            byte r7 = (byte) r7
            r1[r2] = r7
            r2 = 1
            goto L37
        L32:
            int r7 = r0 % 2
            if (r7 != 0) goto L50
        L36:
            r4 = 0
        L37:
            if (r2 >= r0) goto L4f
            int r7 = r4 + 1
            int r3 = a(r6, r2)
            int r3 = r3 << 4
            int r5 = r2 + 1
            int r5 = a(r6, r5)
            r3 = r3 | r5
            byte r3 = (byte) r3
            r1[r4] = r3
            int r2 = r2 + 2
            r4 = r7
            goto L37
        L4f:
            return r1
        L50:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Invalid input length: "
            r7.append(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tcw.a(char[], boolean):byte[]");
    }

    private static int a(char[] cArr, int i) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27146606", new Object[]{cArr, new Integer(i)})).intValue();
        }
        char c = cArr[i];
        if ('0' <= c && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || c > 'f') {
            c2 = 'A';
            if ('A' > c || c > 'F') {
                throw new IllegalArgumentException("Illegal char: " + cArr[i] + " at offset " + i);
            }
        }
        return (c - c2) + 10;
    }
}
