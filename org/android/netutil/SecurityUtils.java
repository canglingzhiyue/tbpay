package org.android.netutil;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.android.spdy.spduLog;

/* loaded from: classes.dex */
public class SecurityUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AES = "AES";
    private static final String AES_CBC_PKCS5_PADDING = "AES/CBC/PKCS5Padding";
    private static final int IV_SIZE = 16;
    private static final String TAG = "tnetsdk.SecurityHelper";

    public static String decrypt(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24104ef8", new Object[]{str, str2});
        }
        try {
            byte[] keyAndIvBytes = getKeyAndIvBytes(str);
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyAndIvBytes, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(keyAndIvBytes);
            Cipher cipher = Cipher.getInstance(AES_CBC_PKCS5_PADDING);
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str2.getBytes(Charset.forName("UTF-8")), 0)), Charset.forName("UTF-8"));
        } catch (Throwable th) {
            spduLog.Tloge(TAG, null, "decrypt fail", "e", th);
            return null;
        }
    }

    public static String encrypt(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("327cf920", new Object[]{str, str2});
        }
        try {
            byte[] keyAndIvBytes = getKeyAndIvBytes(str);
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyAndIvBytes, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(keyAndIvBytes);
            Cipher cipher = Cipher.getInstance(AES_CBC_PKCS5_PADDING);
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return Base64.encodeToString(cipher.doFinal(str2.getBytes(Charset.forName("UTF-8"))), 0);
        } catch (Throwable th) {
            spduLog.Tloge(TAG, null, "encrypt fail", "e", th);
            return null;
        }
    }

    private static byte[] getKeyAndIvBytes(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("f690c8fc", new Object[]{str}) : md5ToHex(str).substring(0, 16).getBytes();
    }

    private static String md5ToHex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("453b582d", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return bytesToHexString(MessageDigest.getInstance("MD5").digest(str.getBytes("utf-8")));
        } catch (Exception unused) {
            return null;
        }
    }

    private static String bytesToHexString(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33bf8aac", new Object[]{bArr});
        }
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder("");
        for (byte b : bArr) {
            if (Integer.toHexString(b & 255).length() < 2) {
                sb.append('0');
            }
            sb.append((int) b);
        }
        return sb.toString();
    }
}
