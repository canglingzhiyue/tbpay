package tb;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* loaded from: classes4.dex */
public abstract class cyd {

    /* renamed from: a  reason: collision with root package name */
    private static final String f26595a = "PBKDF2";

    public static byte[] a(char[] cArr, byte[] bArr, int i, int i2) {
        return a(cArr, bArr, i, i2, false);
    }

    private static byte[] a(char[] cArr, byte[] bArr, int i, int i2, boolean z) {
        try {
            return SecretKeyFactory.getInstance(z ? "PBKDF2WithHmacSHA256" : "PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(cArr, bArr, i, i2)).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            String str = f26595a;
            cyl.b(str, "pbkdf exception : " + e.getMessage());
            return new byte[0];
        }
    }

    public static byte[] b(char[] cArr, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[0];
        if (Build.VERSION.SDK_INT < 26) {
            cyl.b(f26595a, "system version not high than 26");
            return bArr2;
        }
        return a(cArr, bArr, i, i2, true);
    }
}
