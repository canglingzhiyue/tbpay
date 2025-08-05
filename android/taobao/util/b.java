package android.taobao.util;

import com.alipay.mobile.security.bio.utils.DESCoder;
import com.android.alibaba.ip.runtime.IpChange;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ISO88591 = "ISO-8859-1";

    static {
        kge.a(-2041617056);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b2e6bb67", new Object[]{bArr, bArr2});
        }
        try {
            byte[] bArr3 = new byte[24];
            if (bArr.length >= 24) {
                System.arraycopy(bArr, 0, bArr3, 0, 24);
            } else {
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            }
            SecretKey generateSecret = SecretKeyFactory.getInstance(DESCoder.ALGORITHM).generateSecret(new DESedeKeySpec(bArr3));
            Cipher cipher = Cipher.getInstance(DESCoder.ALGORITHM);
            cipher.init(1, generateSecret);
            return cipher.doFinal(bArr2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a7302c86", new Object[]{bArr, bArr2});
        }
        try {
            byte[] bArr3 = new byte[24];
            if (bArr.length >= 24) {
                System.arraycopy(bArr, 0, bArr3, 0, 24);
            } else {
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            }
            SecretKey generateSecret = SecretKeyFactory.getInstance(DESCoder.ALGORITHM).generateSecret(new DESedeKeySpec(bArr3));
            Cipher cipher = Cipher.getInstance(DESCoder.ALGORITHM);
            cipher.init(2, generateSecret);
            return cipher.doFinal(bArr2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
