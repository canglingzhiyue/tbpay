package tb;

import android.util.Base64;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes9.dex */
public class qrm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1958763666);
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str2.getBytes());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str3, 0)), "UTF-8");
        } catch (Throwable th) {
            Log.e("AESUtil", "", th);
            return "";
        }
    }
}
