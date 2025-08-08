package tb;

import mtopsdk.common.util.StringUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public final class cye {

    /* renamed from: a  reason: collision with root package name */
    private static final String f26596a = "SHA";
    private static final String[] b = {"SHA-256", "SHA-384", "SHA-512"};

    public static String a(String str) {
        return a(str, "SHA-256");
    }

    public static String a(String str, String str2) {
        String str3;
        String str4;
        byte[] bArr;
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            str3 = f26596a;
            str4 = "content or algorithm is null.";
        } else if (b(str2)) {
            try {
                bArr = str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                bArr = new byte[0];
                cyl.b(f26596a, "Error in generate SHA UnsupportedEncodingException");
            }
            return cyi.a(a(bArr, str2));
        } else {
            str3 = f26596a;
            str4 = "algorithm is not safe or legal";
        }
        cyl.b(str3, str4);
        return "";
    }

    public static byte[] a(byte[] bArr, String str) {
        String str2;
        String str3;
        if (bArr == null || StringUtils.isEmpty(str)) {
            str2 = f26596a;
            str3 = "content or algorithm is null.";
        } else if (!b(str)) {
            str2 = f26596a;
            str3 = "algorithm is not safe or legal";
        } else {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException unused) {
                str2 = f26596a;
                str3 = "Error in generate SHA NoSuchAlgorithmException";
            }
        }
        cyl.b(str2, str3);
        return new byte[0];
    }

    private static boolean b(String str) {
        for (String str2 : b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
