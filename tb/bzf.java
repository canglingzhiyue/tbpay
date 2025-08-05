package tb;

/* loaded from: classes.dex */
public class bzf {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int[] f26197a;
        int b;
        int c;

        static {
            kge.a(1380970845);
        }

        private a() {
            this.f26197a = new int[256];
        }
    }

    static {
        kge.a(-1919538781);
    }

    private static a a(String str) {
        if (str != null) {
            a aVar = new a();
            for (int i = 0; i < 256; i++) {
                aVar.f26197a[i] = i;
            }
            aVar.b = 0;
            aVar.c = 0;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < 256; i4++) {
                try {
                    i3 = ((str.charAt(i2) + aVar.f26197a[i4]) + i3) % 256;
                    int i5 = aVar.f26197a[i4];
                    int[] iArr = aVar.f26197a;
                    iArr[i4] = iArr[i3];
                    aVar.f26197a[i3] = i5;
                    i2 = (i2 + 1) % str.length();
                } catch (Exception unused) {
                    return null;
                }
            }
            return aVar;
        }
        return null;
    }

    public static byte[] a(byte[] bArr) {
        return a(bArr, "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK");
    }

    private static byte[] a(byte[] bArr, String str) {
        a a2;
        if (bArr == null || str == null || (a2 = a(str)) == null) {
            return null;
        }
        return a(bArr, a2);
    }

    private static byte[] a(byte[] bArr, a aVar) {
        if (bArr == null || aVar == null) {
            return null;
        }
        int i = aVar.b;
        int i2 = aVar.c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) % 256;
            i2 = (aVar.f26197a[i] + i2) % 256;
            int i4 = aVar.f26197a[i];
            int[] iArr = aVar.f26197a;
            iArr[i] = iArr[i2];
            aVar.f26197a[i2] = i4;
            bArr[i3] = (byte) (aVar.f26197a[(aVar.f26197a[i] + aVar.f26197a[i2]) % 256] ^ bArr[i3]);
        }
        aVar.b = i;
        aVar.c = i2;
        return bArr;
    }
}
