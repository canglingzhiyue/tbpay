package tb;

import com.alipay.mobile.security.bio.utils.DESCoder;
import com.taobao.tao.image.d;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class czn {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f26620a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final byte[] b = {48, 48, 48, 48, 48, 48, 48, 48};

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static char[] f26621a = {'A', 'B', 'C', d.LEVEL_D, d.LEVEL_E, 'F', 'G', 'H', d.LEVEL_I, 'J', 'K', d.LEVEL_L, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', d.LEVEL_V, d.LEVEL_W, 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', fxb.DIR};
        private static byte[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, tof.LF_BLK, tof.LF_DIR, tof.LF_FIFO, tof.LF_CONTIG, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, gbx.OP_IS_NOT, gbx.OP_CALL_FUNC, gbx.OP_ASSIGN, gbx.OP_MINIFY_CALL_FUNC, 48, tof.LF_LINK, tof.LF_SYMLINK, tof.LF_CHR, -1, -1, -1, -1, -1};

        public static String a(byte[] bArr) {
            String str;
            StringBuffer stringBuffer = new StringBuffer();
            int length = bArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                int i3 = bArr[i] & 255;
                if (i2 == length) {
                    stringBuffer.append(f26621a[i3 >>> 2]);
                    stringBuffer.append(f26621a[(i3 & 3) << 4]);
                    str = "==";
                } else {
                    int i4 = i2 + 1;
                    int i5 = bArr[i2] & 255;
                    if (i4 == length) {
                        stringBuffer.append(f26621a[i3 >>> 2]);
                        stringBuffer.append(f26621a[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
                        stringBuffer.append(f26621a[(i5 & 15) << 2]);
                        str = "=";
                    } else {
                        int i6 = i4 + 1;
                        int i7 = bArr[i4] & 255;
                        stringBuffer.append(f26621a[i3 >>> 2]);
                        stringBuffer.append(f26621a[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
                        stringBuffer.append(f26621a[((i5 & 15) << 2) | ((i7 & crd.DETECT_WIDTH) >>> 6)]);
                        stringBuffer.append(f26621a[i7 & 63]);
                        i = i6;
                    }
                }
                stringBuffer.append(str);
                break;
            }
            return stringBuffer.toString();
        }

        public static byte[] a(String str) {
            int i;
            byte b2;
            int i2;
            byte b3;
            int i3;
            byte b4;
            int i4;
            byte b5;
            byte[] bytes = str.getBytes();
            int length = bytes.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
            int i5 = 0;
            while (i5 < length) {
                while (true) {
                    i = i5 + 1;
                    b2 = b[bytes[i5]];
                    if (i >= length || b2 != -1) {
                        break;
                    }
                    i5 = i;
                }
                if (b2 == -1) {
                    break;
                }
                while (true) {
                    i2 = i + 1;
                    b3 = b[bytes[i]];
                    if (i2 >= length || b3 != -1) {
                        break;
                    }
                    i = i2;
                }
                if (b3 == -1) {
                    break;
                }
                byteArrayOutputStream.write((b2 << 2) | ((b3 & 48) >>> 4));
                while (true) {
                    i3 = i2 + 1;
                    byte b6 = bytes[i2];
                    if (b6 == 61) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    b4 = b[b6];
                    if (i3 >= length || b4 != -1) {
                        break;
                    }
                    i2 = i3;
                }
                if (b4 == -1) {
                    break;
                }
                byteArrayOutputStream.write(((b3 & 15) << 4) | ((b4 & 60) >>> 2));
                while (true) {
                    i4 = i3 + 1;
                    byte b7 = bytes[i3];
                    if (b7 == 61) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    b5 = b[b7];
                    if (i4 >= length || b5 != -1) {
                        break;
                    }
                    i3 = i4;
                }
                if (b5 == -1) {
                    break;
                }
                byteArrayOutputStream.write(b5 | ((b4 & 3) << 6));
                i5 = i4;
            }
            return byteArrayOutputStream.toByteArray();
        }
    }

    public static String a(String str) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(str.getBytes("UTF-8"));
        return new String(a(messageDigest.digest()));
    }

    public static String a(String str, String str2) throws Exception {
        return a(str, str2, "UTF-8");
    }

    public static String a(String str, String str2, String str3) throws Exception {
        int length = str.getBytes(str3).length % 8;
        if (length != 0) {
            int i = 8 - length;
            StringBuffer stringBuffer = new StringBuffer(str);
            for (int i2 = 0; i2 < i; i2++) {
                stringBuffer.append(' ');
            }
            str = new String(stringBuffer);
        }
        return a.a(a(str.getBytes(str3), str2)).replaceAll("[\\n\\r]", "");
    }

    public static byte[] a(String str, int i, byte[] bArr, byte[] bArr2) throws Exception {
        SecretKey b2 = b(str);
        IvParameterSpec b3 = bArr == null ? b(b) : b(bArr);
        Cipher cipher = Cipher.getInstance("DESede/CBC/NoPadding");
        cipher.init(i, b2, b3);
        return cipher.doFinal(bArr2);
    }

    public static byte[] a(byte[] bArr, String str) throws Exception {
        return a(str, 1, null, bArr);
    }

    public static char[] a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length << 1];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            char[] cArr2 = f26620a;
            cArr[i] = cArr2[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[bArr[i2] & 15];
        }
        return cArr;
    }

    public static String b(String str, String str2) throws Exception {
        return b(str, str2, "UTF-8");
    }

    public static String b(String str, String str2, String str3) throws Exception {
        return new String(b(a.a(str), str2), str3).trim();
    }

    private static SecretKey b(String str) throws Exception {
        return new SecretKeySpec(a(str).substring(0, 24).getBytes("UTF-8"), DESCoder.ALGORITHM);
    }

    private static IvParameterSpec b(byte[] bArr) {
        return new IvParameterSpec(bArr);
    }

    public static byte[] b(byte[] bArr, String str) throws Exception {
        return a(str, 2, null, bArr);
    }
}
