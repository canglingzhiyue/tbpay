package tb;

import java.security.MessageDigest;

/* loaded from: classes6.dex */
public class kfp {
    static {
        kge.a(-1115077551);
    }

    public static String a(String str) {
        try {
            return a(MessageDigest.getInstance("MD5").digest(str.getBytes("utf-8")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String a(byte[] bArr) {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder(bArr.length << 1);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(charArray[(bArr[i] >> 4) & 15]);
            sb.append(charArray[bArr[i] & 15]);
        }
        return sb.toString();
    }
}
