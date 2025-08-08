package tb;

import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.rpc.safe.AES;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class cyc {
    private static String a(String str) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        try {
            return str.substring(6, 12) + str.substring(16, 26) + str.substring(32, 48);
        } catch (Exception e) {
            cyl.b(AES.BLOCK_MODE, "getIv exception : " + e.getMessage());
            return "";
        }
    }

    public static String a(String str, String str2) {
        String str3;
        if (StringUtils.isEmpty(str)) {
            str3 = "encrypt 1 content is null";
        } else if (StringUtils.isEmpty(str2)) {
            str3 = "encrypt 1 key is null";
        } else {
            byte[] a2 = cyi.a(str2);
            if (a2.length >= 16) {
                return a(str, a2);
            }
            str3 = "encrypt 1 key length is not right";
        }
        cyl.b(AES.BLOCK_MODE, str3);
        return "";
    }

    public static String a(String str, byte[] bArr) {
        String str2;
        if (StringUtils.isEmpty(str)) {
            str2 = "encrypt 2 content is null";
        } else if (bArr == null) {
            str2 = "encrypt 2 key is null";
        } else if (bArr.length >= 16) {
            byte[] a2 = cyh.a(16);
            byte[] b = b(str, bArr, a2);
            return (b == null || b.length == 0) ? "" : c(cyi.a(a2), cyi.a(b));
        } else {
            str2 = "encrypt 2 key lengh is not right";
        }
        cyl.b(AES.BLOCK_MODE, str2);
        return "";
    }

    public static String a(String str, byte[] bArr, byte[] bArr2) {
        String str2;
        if (StringUtils.isEmpty(str)) {
            str2 = "decrypt 4 content is null";
        } else if (bArr == null) {
            str2 = "decrypt 4 key is null";
        } else if (bArr.length < 16) {
            str2 = "decrypt 4 key lengh is not right";
        } else if (bArr2 == null) {
            str2 = "decrypt 4 iv is null";
        } else if (bArr2.length < 16) {
            str2 = "decrypt 4 iv lengh is not right";
        } else {
            try {
                return new String(b(cyi.a(str), bArr, bArr2), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                str2 = " cbc decrypt data error" + e.getMessage();
            }
        }
        cyl.b(AES.BLOCK_MODE, str2);
        return "";
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a2 = cyh.a(16);
        return b(a2, a(bArr, bArr2, a2));
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        StringBuilder sb;
        String message;
        String str;
        if (bArr == null) {
            str = "encrypt 6 content is null";
        } else if (bArr.length == 0) {
            str = "encrypt 6 content length is 0";
        } else if (bArr2 == null) {
            str = "encrypt 6 key is null";
        } else if (bArr2.length < 16) {
            str = "encrypt 6 key length is error";
        } else if (bArr3 == null) {
            str = "encrypt 6 iv is null";
        } else if (bArr3.length >= 16) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
                return cipher.doFinal(bArr);
            } catch (InvalidAlgorithmParameterException e) {
                sb = new StringBuilder();
                sb.append("InvalidAlgorithmParameterException: ");
                message = e.getMessage();
                sb.append(message);
                cyl.b(AES.BLOCK_MODE, sb.toString());
                return new byte[0];
            } catch (InvalidKeyException e2) {
                sb = new StringBuilder();
                sb.append("InvalidKeyException: ");
                message = e2.getMessage();
                sb.append(message);
                cyl.b(AES.BLOCK_MODE, sb.toString());
                return new byte[0];
            } catch (NoSuchAlgorithmException e3) {
                sb = new StringBuilder();
                sb.append("NoSuchAlgorithmException: ");
                message = e3.getMessage();
                sb.append(message);
                cyl.b(AES.BLOCK_MODE, sb.toString());
                return new byte[0];
            } catch (BadPaddingException e4) {
                sb = new StringBuilder();
                sb.append("BadPaddingException: ");
                message = e4.getMessage();
                sb.append(message);
                cyl.b(AES.BLOCK_MODE, sb.toString());
                return new byte[0];
            } catch (IllegalBlockSizeException e5) {
                sb = new StringBuilder();
                sb.append("IllegalBlockSizeException: ");
                message = e5.getMessage();
                sb.append(message);
                cyl.b(AES.BLOCK_MODE, sb.toString());
                return new byte[0];
            } catch (NoSuchPaddingException e6) {
                sb = new StringBuilder();
                sb.append("NoSuchPaddingException: ");
                message = e6.getMessage();
                sb.append(message);
                cyl.b(AES.BLOCK_MODE, sb.toString());
                return new byte[0];
            }
        } else {
            str = "encrypt 6 iv length is error";
        }
        cyl.b(AES.BLOCK_MODE, str);
        return new byte[0];
    }

    private static String b(String str) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        try {
            return str.substring(0, 6) + str.substring(12, 16) + str.substring(26, 32) + str.substring(48);
        } catch (Exception e) {
            cyl.b(AES.BLOCK_MODE, "get encryptword exception : " + e.getMessage());
            return "";
        }
    }

    public static String b(String str, String str2) {
        String str3;
        if (StringUtils.isEmpty(str)) {
            str3 = "decrypt 1 content is null";
        } else if (StringUtils.isEmpty(str2)) {
            str3 = "decrypt 1 key is null";
        } else {
            byte[] a2 = cyi.a(str2);
            if (a2.length >= 16) {
                return b(str, a2);
            }
            str3 = "decrypt 1 key length is not right";
        }
        cyl.b(AES.BLOCK_MODE, str3);
        return "";
    }

    public static String b(String str, byte[] bArr) {
        String str2;
        if (StringUtils.isEmpty(str)) {
            str2 = "decrypt 2 content is null";
        } else if (bArr == null) {
            str2 = "decrypt 2 key is null";
        } else if (bArr.length < 16) {
            str2 = "decrypt 2 key lengh is not right";
        } else {
            String a2 = a(str);
            String b = b(str);
            if (StringUtils.isEmpty(a2)) {
                str2 = "decrypt 2 iv is null";
            } else if (!StringUtils.isEmpty(b)) {
                return a(b, bArr, cyi.a(a2));
            } else {
                str2 = "decrypt 2 encrypt content is null";
            }
        }
        cyl.b(AES.BLOCK_MODE, str2);
        return "";
    }

    private static byte[] b(String str, byte[] bArr, byte[] bArr2) {
        String str2;
        if (StringUtils.isEmpty(str)) {
            str2 = "encrypt 5 content is null";
        } else if (bArr == null) {
            str2 = "encrypt 5 key is null";
        } else if (bArr.length < 16) {
            str2 = "encrypt 5 key lengh is not right";
        } else if (bArr2 == null) {
            str2 = "encrypt 5 iv is null";
        } else if (bArr2.length < 16) {
            str2 = "encrypt 5 iv lengh is not right";
        } else {
            try {
                return a(str.getBytes("UTF-8"), bArr, bArr2);
            } catch (UnsupportedEncodingException e) {
                str2 = " cbc encrypt data error" + e.getMessage();
            }
        }
        cyl.b(AES.BLOCK_MODE, str2);
        return new byte[0];
    }

    private static byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        StringBuilder sb;
        String message;
        String str;
        String str2;
        if (bArr == null) {
            str2 = "decrypt 6 content is null";
        } else if (bArr.length == 0) {
            str2 = "decrypt 6 content length is 0";
        } else if (bArr2 == null) {
            str2 = "decrypt 6 key is null";
        } else if (bArr2.length < 16) {
            str2 = "decrypt 6 key length is error";
        } else if (bArr3 == null) {
            str2 = "decrypt 6 iv is null";
        } else if (bArr3.length >= 16) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
                return cipher.doFinal(bArr);
            } catch (InvalidAlgorithmParameterException e) {
                sb = new StringBuilder();
                sb.append("InvalidAlgorithmParameterException: ");
                message = e.getMessage();
                sb.append(message);
                str = sb.toString();
                cyl.b(AES.BLOCK_MODE, str);
                return new byte[0];
            } catch (InvalidKeyException e2) {
                sb = new StringBuilder();
                sb.append("InvalidKeyException: ");
                message = e2.getMessage();
                sb.append(message);
                str = sb.toString();
                cyl.b(AES.BLOCK_MODE, str);
                return new byte[0];
            } catch (NoSuchAlgorithmException e3) {
                sb = new StringBuilder();
                sb.append("NoSuchAlgorithmException: ");
                message = e3.getMessage();
                sb.append(message);
                str = sb.toString();
                cyl.b(AES.BLOCK_MODE, str);
                return new byte[0];
            } catch (BadPaddingException e4) {
                cyl.b(AES.BLOCK_MODE, "BadPaddingException: " + e4.getMessage());
                str = "key is not right";
                cyl.b(AES.BLOCK_MODE, str);
                return new byte[0];
            } catch (IllegalBlockSizeException e5) {
                sb = new StringBuilder();
                sb.append("IllegalBlockSizeException: ");
                message = e5.getMessage();
                sb.append(message);
                str = sb.toString();
                cyl.b(AES.BLOCK_MODE, str);
                return new byte[0];
            } catch (NoSuchPaddingException e6) {
                sb = new StringBuilder();
                sb.append("NoSuchPaddingException: ");
                message = e6.getMessage();
                sb.append(message);
                str = sb.toString();
                cyl.b(AES.BLOCK_MODE, str);
                return new byte[0];
            }
        } else {
            str2 = "decrypt 6 iv length is error";
        }
        cyl.b(AES.BLOCK_MODE, str2);
        return new byte[0];
    }

    private static String c(String str, String str2) {
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            try {
                return str2.substring(0, 6) + str.substring(0, 6) + str2.substring(6, 10) + str.substring(6, 16) + str2.substring(10, 16) + str.substring(16) + str2.substring(16);
            } catch (Exception e) {
                cyl.b(AES.BLOCK_MODE, "mix exception: " + e.getMessage());
            }
        }
        return "";
    }
}
