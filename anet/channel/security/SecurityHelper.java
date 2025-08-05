package anet.channel.security;

import android.util.Base64;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import tb.kge;

/* loaded from: classes2.dex */
public class SecurityHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AES = "AES";
    private static final String AES_CBC_PKCS5_PADDING = "AES/CBC/PKCS5Padding";
    private static final int IV_SIZE = 16;
    private static final String TAG = "awcn.SecurityHelper";

    static {
        kge.a(-857924514);
    }

    public static String decryptNoDeps(String str, String str2, String str3, String str4) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66d7547f", new Object[]{str, str2, str3, str4});
        }
        try {
            byte[] keyAndIvBytes = getKeyAndIvBytes(str);
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyAndIvBytes, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(keyAndIvBytes);
            Cipher cipher = Cipher.getInstance(AES_CBC_PKCS5_PADDING);
            cipher.init(2, secretKeySpec, ivParameterSpec);
            str5 = new String(cipher.doFinal(Base64.decode(str2.getBytes(Charset.forName("UTF-8")), 0)), Charset.forName("UTF-8"));
        } catch (Throwable th) {
            th = th;
            str5 = null;
        }
        try {
            ALog.e(TAG, str4 + " [decryptNoDeps] success! ", str3, "decrypt", str5);
        } catch (Throwable th2) {
            th = th2;
            ALog.e(TAG, str4 + " [decryptNoDeps] fail!  error=" + th.toString(), null, new Object[0]);
            return str5;
        }
        return str5;
    }

    public static String encryptNoDeps(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f408cca7", new Object[]{str, str2, str3, str4});
        }
        String str5 = null;
        try {
            byte[] keyAndIvBytes = getKeyAndIvBytes(str);
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyAndIvBytes, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(keyAndIvBytes);
            Cipher cipher = Cipher.getInstance(AES_CBC_PKCS5_PADDING);
            cipher.init(1, secretKeySpec, ivParameterSpec);
            str5 = Base64.encodeToString(cipher.doFinal(str2.getBytes(Charset.forName("UTF-8"))), 0);
            ALog.e(TAG, str4 + " [encryptNoDeps] success! ", str3, "encrypt", str5);
            return str5;
        } catch (Throwable th) {
            ALog.e(TAG, str4 + " [encryptNoDeps] fail!  error=" + th.toString(), str3, new Object[0]);
            return str5;
        }
    }

    public static String getSecretKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d7c7136", new Object[]{str});
        }
        return StringUtils.md5ToHex(GlobalAppRuntimeInfo.getAppkey() + str);
    }

    private static byte[] getKeyAndIvBytes(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("f690c8fc", new Object[]{str}) : StringUtils.md5ToHex(str).substring(0, 16).getBytes();
    }
}
