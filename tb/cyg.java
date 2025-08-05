package tb;

/* loaded from: classes4.dex */
public class cyg {

    /* renamed from: a  reason: collision with root package name */
    private static final String f26598a = "BaseKeyUtil";

    private static int a(int i, int i2, int i3) {
        if (i2 < i) {
            i = i2;
        }
        return i3 < i ? i3 : i;
    }

    private static boolean a(int i) {
        return i >= 16;
    }

    private static boolean a(int i, byte[] bArr) {
        return a(i) & a(bArr);
    }

    private static boolean a(byte[] bArr) {
        return bArr.length >= 16;
    }

    public static byte[] a(String str, String str2, String str3, String str4, int i, boolean z) {
        return a(str, str2, str3, cyi.a(str4), i, z);
    }

    public static byte[] a(String str, String str2, String str3, byte[] bArr, int i, int i2, boolean z) {
        byte[] a2 = cyi.a(str);
        byte[] a3 = cyi.a(str2);
        byte[] a4 = cyi.a(str3);
        int a5 = a(a2.length, a3.length, a4.length);
        if (a(a5, bArr)) {
            char[] cArr = new char[a5];
            for (int i3 = 0; i3 < a5; i3++) {
                cArr[i3] = (char) ((a2[i3] ^ a3[i3]) ^ a4[i3]);
            }
            if (!z) {
                cyl.a(f26598a, "exportRootKey: sha1");
                return cyd.a(cArr, bArr, i, i2 << 3);
            }
            cyl.a(f26598a, "exportRootKey: sha256");
            return cyd.b(cArr, bArr, i, i2 << 3);
        }
        throw new IllegalArgumentException("key length must be more than 128bit.");
    }

    public static byte[] a(String str, String str2, String str3, byte[] bArr, int i, boolean z) {
        return a(str, str2, str3, bArr, 10000, i, z);
    }

    public static byte[] a(String str, String str2, String str3, byte[] bArr, boolean z) {
        return a(str, str2, str3, bArr, 16, z);
    }
}
