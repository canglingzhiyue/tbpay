package com.alipay.mobile.verifyidentity.log.utils;

import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.alipay.mobile.security.bio.utils.DESCoder;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public class TriDesCBC {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5882a = "TriDesCBC";
    private static String b = "DESede/CBC/PKCS5Padding";

    public static String encrypt(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("327cf920", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str2)) {
            return str2;
        }
        byte[] encrypt = encrypt(str, str2.getBytes());
        if (encrypt == null) {
            return null;
        }
        return new String(Base64.encode(encrypt, 2));
    }

    public static String decrypt(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24104ef8", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str2)) {
            return str2;
        }
        byte[] decrypt = decrypt(str, Base64.decode(str2, 2));
        if (decrypt == null) {
            return null;
        }
        return new String(decrypt);
    }

    public static byte[] encrypt(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("30c36e00", new Object[]{str, bArr});
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), DESCoder.ALGORITHM);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
            Cipher cipher = Cipher.getInstance(b);
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            VerifyLogCat.w(f5882a, e);
            return null;
        }
    }

    public static byte[] decrypt(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ec6423d8", new Object[]{str, bArr});
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), DESCoder.ALGORITHM);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
            Cipher cipher = Cipher.getInstance(b);
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            VerifyLogCat.w(f5882a, e);
            return null;
        }
    }
}
