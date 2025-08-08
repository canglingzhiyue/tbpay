package tb;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.rpc.safe.AES;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes4.dex */
public class cyf {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, SecretKey> f26597a = new HashMap();

    public static String a(String str, String str2) {
        String str3;
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            str3 = "alias or encrypt content is null";
        } else {
            try {
                return cyi.a(a(str, str2.getBytes("UTF-8")));
            } catch (UnsupportedEncodingException e) {
                str3 = "encrypt: UnsupportedEncodingException : " + e.getMessage();
            }
        }
        cyl.b("GCMKS", str3);
        return "";
    }

    private static SecretKey a(String str) {
        StringBuilder sb;
        String message;
        cyl.a("GCMKS", "load key");
        SecretKey secretKey = null;
        try {
            KeyStore keyStore = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            keyStore.load(null);
            Key key = keyStore.getKey(str, null);
            if (key instanceof SecretKey) {
                secretKey = (SecretKey) key;
            } else {
                cyl.a("GCMKS", "generate key");
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", AES.ANDROID_KEYSTORE);
                keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
                secretKey = keyGenerator.generateKey();
            }
        } catch (IOException e) {
            sb = new StringBuilder();
            sb.append("IOException : ");
            message = e.getMessage();
            sb.append(message);
            cyl.b("GCMKS", sb.toString());
            f26597a.put(str, secretKey);
            return secretKey;
        } catch (InvalidAlgorithmParameterException e2) {
            sb = new StringBuilder();
            sb.append("InvalidAlgorithmParameterException : ");
            message = e2.getMessage();
            sb.append(message);
            cyl.b("GCMKS", sb.toString());
            f26597a.put(str, secretKey);
            return secretKey;
        } catch (KeyStoreException e3) {
            sb = new StringBuilder();
            sb.append("KeyStoreException : ");
            message = e3.getMessage();
            sb.append(message);
            cyl.b("GCMKS", sb.toString());
            f26597a.put(str, secretKey);
            return secretKey;
        } catch (NoSuchAlgorithmException e4) {
            sb = new StringBuilder();
            sb.append("NoSuchAlgorithmException : ");
            message = e4.getMessage();
            sb.append(message);
            cyl.b("GCMKS", sb.toString());
            f26597a.put(str, secretKey);
            return secretKey;
        } catch (NoSuchProviderException e5) {
            sb = new StringBuilder();
            sb.append("NoSuchProviderException : ");
            message = e5.getMessage();
            sb.append(message);
            cyl.b("GCMKS", sb.toString());
            f26597a.put(str, secretKey);
            return secretKey;
        } catch (UnrecoverableKeyException e6) {
            sb = new StringBuilder();
            sb.append("UnrecoverableKeyException : ");
            message = e6.getMessage();
            sb.append(message);
            cyl.b("GCMKS", sb.toString());
            f26597a.put(str, secretKey);
            return secretKey;
        } catch (CertificateException e7) {
            sb = new StringBuilder();
            sb.append("CertificateException : ");
            message = e7.getMessage();
            sb.append(message);
            cyl.b("GCMKS", sb.toString());
            f26597a.put(str, secretKey);
            return secretKey;
        } catch (Exception e8) {
            sb = new StringBuilder();
            sb.append("Exception: ");
            message = e8.getMessage();
            sb.append(message);
            cyl.b("GCMKS", sb.toString());
            f26597a.put(str, secretKey);
            return secretKey;
        }
        f26597a.put(str, secretKey);
        return secretKey;
    }

    private static boolean a() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static byte[] a(String str, byte[] bArr) {
        String str2;
        byte[] bArr2 = new byte[0];
        if (StringUtils.isEmpty(str) || bArr == null) {
            str2 = "alias or encrypt content is null";
        } else if (a()) {
            return a(b(str), bArr);
        } else {
            str2 = "sdk version is too low";
        }
        cyl.b("GCMKS", str2);
        return bArr2;
    }

    public static byte[] a(SecretKey secretKey, byte[] bArr) {
        StringBuilder sb;
        String message;
        String str;
        byte[] bArr2 = new byte[0];
        if (bArr == null) {
            str = "content is null";
        } else if (secretKey == null) {
            str = "secret key is null";
        } else if (a()) {
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, secretKey);
                byte[] doFinal = cipher.doFinal(bArr);
                byte[] iv = cipher.getIV();
                if (iv == null || iv.length != 12) {
                    cyl.b("GCMKS", "IV is invalid.");
                    return bArr2;
                }
                byte[] copyOf = Arrays.copyOf(iv, iv.length + doFinal.length);
                System.arraycopy(doFinal, 0, copyOf, iv.length, doFinal.length);
                return copyOf;
            } catch (InvalidKeyException e) {
                sb = new StringBuilder();
                sb.append("InvalidKeyException : ");
                message = e.getMessage();
                sb.append(message);
                cyl.b("GCMKS", sb.toString());
                return bArr2;
            } catch (NoSuchAlgorithmException e2) {
                sb = new StringBuilder();
                sb.append("NoSuchAlgorithmException : ");
                message = e2.getMessage();
                sb.append(message);
                cyl.b("GCMKS", sb.toString());
                return bArr2;
            } catch (BadPaddingException e3) {
                sb = new StringBuilder();
                sb.append("BadPaddingException : ");
                message = e3.getMessage();
                sb.append(message);
                cyl.b("GCMKS", sb.toString());
                return bArr2;
            } catch (IllegalBlockSizeException e4) {
                sb = new StringBuilder();
                sb.append("IllegalBlockSizeException : ");
                message = e4.getMessage();
                sb.append(message);
                cyl.b("GCMKS", sb.toString());
                return bArr2;
            } catch (NoSuchPaddingException e5) {
                sb = new StringBuilder();
                sb.append("NoSuchPaddingException : ");
                message = e5.getMessage();
                sb.append(message);
                cyl.b("GCMKS", sb.toString());
                return bArr2;
            } catch (Exception e6) {
                sb = new StringBuilder();
                sb.append("Exception: ");
                message = e6.getMessage();
                sb.append(message);
                cyl.b("GCMKS", sb.toString());
                return bArr2;
            }
        } else {
            str = "sdk version is too low";
        }
        cyl.b("GCMKS", str);
        return bArr2;
    }

    public static String b(String str, String str2) {
        String str3;
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            str3 = "alias or encrypt content is null";
        } else {
            try {
                return new String(b(str, cyi.a(str2)), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                str3 = "decrypt: UnsupportedEncodingException : " + e.getMessage();
            }
        }
        cyl.b("GCMKS", str3);
        return "";
    }

    private static SecretKey b(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (f26597a.get(str) == null) {
            a(str);
        }
        return f26597a.get(str);
    }

    public static byte[] b(String str, byte[] bArr) {
        String str2;
        byte[] bArr2 = new byte[0];
        if (StringUtils.isEmpty(str) || bArr == null) {
            str2 = "alias or encrypt content is null";
        } else if (!a()) {
            str2 = "sdk version is too low";
        } else if (bArr.length > 12) {
            return b(b(str), bArr);
        } else {
            str2 = "Decrypt source data is invalid.";
        }
        cyl.b("GCMKS", str2);
        return bArr2;
    }

    public static byte[] b(SecretKey secretKey, byte[] bArr) {
        StringBuilder sb;
        String message;
        String str;
        byte[] bArr2 = new byte[0];
        if (secretKey == null) {
            str = "Decrypt secret key is null";
        } else if (bArr == null) {
            str = "content is null";
        } else if (!a()) {
            str = "sdk version is too low";
        } else if (bArr.length > 12) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, secretKey, new GCMParameterSpec(128, copyOf));
                return cipher.doFinal(bArr, 12, bArr.length - 12);
            } catch (InvalidAlgorithmParameterException e) {
                sb = new StringBuilder();
                sb.append("InvalidAlgorithmParameterException : ");
                message = e.getMessage();
                sb.append(message);
                cyl.b("GCMKS", sb.toString());
                return bArr2;
            } catch (InvalidKeyException e2) {
                sb = new StringBuilder();
                sb.append("InvalidKeyException : ");
                message = e2.getMessage();
                sb.append(message);
                cyl.b("GCMKS", sb.toString());
                return bArr2;
            } catch (NoSuchAlgorithmException e3) {
                sb = new StringBuilder();
                sb.append("NoSuchAlgorithmException : ");
                message = e3.getMessage();
                sb.append(message);
                cyl.b("GCMKS", sb.toString());
                return bArr2;
            } catch (BadPaddingException e4) {
                sb = new StringBuilder();
                sb.append("BadPaddingException : ");
                message = e4.getMessage();
                sb.append(message);
                cyl.b("GCMKS", sb.toString());
                return bArr2;
            } catch (IllegalBlockSizeException e5) {
                sb = new StringBuilder();
                sb.append("IllegalBlockSizeException : ");
                message = e5.getMessage();
                sb.append(message);
                cyl.b("GCMKS", sb.toString());
                return bArr2;
            } catch (NoSuchPaddingException e6) {
                sb = new StringBuilder();
                sb.append("NoSuchPaddingException : ");
                message = e6.getMessage();
                sb.append(message);
                cyl.b("GCMKS", sb.toString());
                return bArr2;
            } catch (Exception e7) {
                sb = new StringBuilder();
                sb.append("Exception: ");
                message = e7.getMessage();
                sb.append(message);
                cyl.b("GCMKS", sb.toString());
                return bArr2;
            }
        } else {
            str = "Decrypt source data is invalid.";
        }
        cyl.b("GCMKS", str);
        return bArr2;
    }
}
