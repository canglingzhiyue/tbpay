package com.alipay.mobile.common.logging.util;

import android.os.Build;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class AESUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Cipher f5456a;
    private static Cipher b;

    public static synchronized byte[] encrypt(byte[] bArr, byte[] bArr2, int i, int i2) {
        synchronized (AESUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("b8e01003", new Object[]{bArr, bArr2, new Integer(i), new Integer(i2)});
            }
            if (f5456a == null) {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                Cipher cipher = Cipher.getInstance("AES");
                f5456a = cipher;
                cipher.init(1, secretKeySpec);
            }
            return f5456a.doFinal(bArr2, i, i2);
        }
    }

    public static synchronized byte[] decrypt(byte[] bArr, byte[] bArr2, int i, int i2) {
        synchronized (AESUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("1e555fdb", new Object[]{bArr, bArr2, new Integer(i), new Integer(i2)});
            }
            if (b == null) {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                Cipher cipher = Cipher.getInstance("AES");
                b = cipher;
                cipher.init(2, secretKeySpec);
            }
            return b.doFinal(bArr2, i, i2);
        }
    }

    public static byte[] getRawKey(byte[] bArr) {
        SecureRandom secureRandom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("90b0662", new Object[]{bArr});
        }
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            if (Build.VERSION.SDK_INT >= 17) {
                try {
                    secureRandom = SecureRandom.getInstance("SHA1PRNG", "Crypto");
                } catch (Throwable unused) {
                }
                secureRandom.setSeed(bArr);
                keyGenerator.init(128, secureRandom);
                return keyGenerator.generateKey().getEncoded();
            }
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.setSeed(bArr);
            keyGenerator.init(128, secureRandom);
            return keyGenerator.generateKey().getEncoded();
        } catch (Throwable unused2) {
            return null;
        }
    }
}
