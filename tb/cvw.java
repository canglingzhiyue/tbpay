package tb;

import mtopsdk.common.util.StringUtils;
import com.heytap.msp.push.encrypt.AESEncrypt;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public class cvw {
    public static final String DES_KEY_BASE64 = "Y29tLm5lYXJtZS5tY3M=";

    /* renamed from: a  reason: collision with root package name */
    public static String f26557a;
    public static String b;

    static {
        kge.a(-1321720263);
        b = "";
    }

    private static String a() {
        if (StringUtils.isEmpty(b)) {
            b = new String(cvg.a(DES_KEY_BASE64));
        }
        byte[] a2 = a(a(b));
        return a2 != null ? new String(a2, Charset.forName("UTF-8")) : "";
    }

    public static byte[] a(String str) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new byte[0];
        }
    }

    public static byte[] a(byte[] bArr) {
        int length = bArr.length % 2 == 0 ? bArr.length : bArr.length - 1;
        for (int i = 0; i < length; i += 2) {
            byte b2 = bArr[i];
            int i2 = i + 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }
        return bArr;
    }

    public static String b(String str) {
        boolean z;
        String str2 = "";
        if (!StringUtils.isEmpty(str)) {
            boolean z2 = false;
            try {
                str2 = cvx.a(str, a());
                cvy.a("sdkDecrypt desDecrypt des data " + str2);
                z = true;
            } catch (Exception e) {
                cvy.a("sdkDecrypt DES excepiton " + e.toString());
                z = false;
            }
            if (!StringUtils.isEmpty(str2)) {
                z2 = z;
            }
            if (z2) {
                return str2;
            }
            try {
                str2 = AESEncrypt.decrypt(AESEncrypt.SDK_APP_SECRET, str);
                f26557a = "AES";
                cvz.c().a(f26557a);
                cvy.a("sdkDecrypt desDecrypt aes data " + str2);
                return str2;
            } catch (Exception e2) {
                cvy.a("sdkDecrypt AES excepiton " + e2.toString());
                return str2;
            }
        }
        return str2;
    }

    public static String c(String str) {
        boolean z;
        String str2 = "";
        if (!StringUtils.isEmpty(str)) {
            boolean z2 = false;
            try {
                str2 = AESEncrypt.decrypt(AESEncrypt.SDK_APP_SECRET, str);
                cvy.a("sdkDecrypt aesDecrypt aes data " + str2);
                z = true;
            } catch (Exception e) {
                cvy.a("sdkDecrypt AES excepiton " + e.toString());
                z = false;
            }
            if (!StringUtils.isEmpty(str2)) {
                z2 = z;
            }
            if (z2) {
                return str2;
            }
            try {
                str2 = cvx.a(str, a());
                f26557a = "DES";
                cvz.c().a(f26557a);
                cvy.a("sdkDecrypt aesDecrypt des data " + str2);
                return str2;
            } catch (Exception e2) {
                cvy.a("sdkDecrypt DES excepiton " + e2.toString());
                return str2;
            }
        }
        return str2;
    }

    public static String d(String str) {
        cvy.a("sdkDecrypt start data " + str);
        if (StringUtils.isEmpty(f26557a)) {
            f26557a = cvz.c().b();
        }
        if ("DES".equals(f26557a)) {
            cvy.a("sdkDecrypt start DES");
            return b(str);
        }
        cvy.a("sdkDecrypt start AES");
        return c(str);
    }
}
