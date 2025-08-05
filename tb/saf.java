package tb;

import java.io.UnsupportedEncodingException;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes9.dex */
public class saf {
    static {
        kge.a(-1220513464);
    }

    private static IllegalStateException a(String str, UnsupportedEncodingException unsupportedEncodingException) {
        return new IllegalStateException(str + ResponseProtocolType.COMMENT + unsupportedEncodingException);
    }

    public static String a(byte[] bArr) {
        return a(bArr, "UTF-8");
    }

    public static String a(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e) {
            throw a(str, e);
        }
    }

    public static byte[] a(String str) {
        return a(str, "UTF-8");
    }

    public static byte[] a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            throw a(str2, e);
        }
    }
}
