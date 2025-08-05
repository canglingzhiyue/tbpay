package tb;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
public class cyh {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26599a = false;
    private static boolean b = true;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0016 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.SecureRandom a() {
        /*
            java.lang.String r0 = "EncryptUtil"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.security.NoSuchAlgorithmException -> Ld
            r2 = 26
            if (r1 < r2) goto L12
            java.security.SecureRandom r1 = java.security.SecureRandom.getInstanceStrong()     // Catch: java.security.NoSuchAlgorithmException -> Ld
            goto L13
        Ld:
            java.lang.String r1 = "getSecureRandomBytes: NoSuchAlgorithmException"
            tb.cyl.b(r0, r1)
        L12:
            r1 = 0
        L13:
            r2 = 0
            if (r1 != 0) goto L1f
            java.lang.String r3 = "SHA1PRNG"
            java.security.SecureRandom r1 = java.security.SecureRandom.getInstance(r3)     // Catch: java.lang.Throwable -> L1d java.security.NoSuchAlgorithmException -> L62
            goto L1f
        L1d:
            r3 = move-exception
            goto L3e
        L1f:
            r3 = 1
            org.bouncycastle.crypto.engines.AESEngine r4 = new org.bouncycastle.crypto.engines.AESEngine     // Catch: java.lang.Throwable -> L1d java.security.NoSuchAlgorithmException -> L62
            r4.<init>()     // Catch: java.lang.Throwable -> L1d java.security.NoSuchAlgorithmException -> L62
            r5 = 256(0x100, float:3.59E-43)
            r6 = 384(0x180, float:5.38E-43)
            r7 = 32
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L1d java.security.NoSuchAlgorithmException -> L62
            r1.nextBytes(r7)     // Catch: java.lang.Throwable -> L1d java.security.NoSuchAlgorithmException -> L62
            org.bouncycastle.crypto.prng.SP800SecureRandomBuilder r8 = new org.bouncycastle.crypto.prng.SP800SecureRandomBuilder     // Catch: java.lang.Throwable -> L1d java.security.NoSuchAlgorithmException -> L62
            r8.<init>(r1, r3)     // Catch: java.lang.Throwable -> L1d java.security.NoSuchAlgorithmException -> L62
            org.bouncycastle.crypto.prng.SP800SecureRandomBuilder r3 = r8.setEntropyBitsRequired(r6)     // Catch: java.lang.Throwable -> L1d java.security.NoSuchAlgorithmException -> L62
            org.bouncycastle.crypto.prng.SP800SecureRandom r0 = r3.buildCTR(r4, r5, r7, r2)     // Catch: java.lang.Throwable -> L1d java.security.NoSuchAlgorithmException -> L62
            return r0
        L3e:
            boolean r4 = tb.cyh.b
            if (r4 == 0) goto L67
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "exception : "
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = " , you should implementation bcprov-jdk15on library"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            tb.cyl.b(r0, r3)
            tb.cyh.b = r2
            goto L67
        L62:
            java.lang.String r2 = "NoSuchAlgorithmException"
            tb.cyl.b(r0, r2)
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cyh.a():java.security.SecureRandom");
    }

    public static byte[] a(int i) {
        String str;
        if (!f26599a) {
            byte[] bArr = new byte[i];
            SecureRandom secureRandom = null;
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    secureRandom = SecureRandom.getInstanceStrong();
                }
            } catch (NoSuchAlgorithmException unused) {
                cyl.b("EncryptUtil", "getSecureRandomBytes: NoSuchAlgorithmException");
            }
            if (secureRandom == null) {
                try {
                    secureRandom = SecureRandom.getInstance("SHA1PRNG");
                } catch (NoSuchAlgorithmException unused2) {
                    str = "getSecureRandomBytes getInstance: NoSuchAlgorithmException";
                    cyl.b("EncryptUtil", str);
                    return new byte[0];
                } catch (Exception e) {
                    str = "getSecureRandomBytes getInstance: exception : " + e.getMessage();
                    cyl.b("EncryptUtil", str);
                    return new byte[0];
                }
            }
            secureRandom.nextBytes(bArr);
            return bArr;
        }
        return c(i);
    }

    public static String b(int i) {
        return cyi.a(a(i));
    }

    private static byte[] c(int i) {
        SecureRandom a2 = a();
        if (a2 == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        a2.nextBytes(bArr);
        return bArr;
    }
}
