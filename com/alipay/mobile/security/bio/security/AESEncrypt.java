package com.alipay.mobile.security.bio.security;

import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public class AESEncrypt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIPARA = "4306020520119888";

    public static byte[] encrypt(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("24dc055d", new Object[]{str, str2});
        }
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec("4306020520119888".getBytes());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(str2.getBytes(), "AES"), ivParameterSpec);
            return cipher.doFinal(str.getBytes());
        } catch (InvalidAlgorithmParameterException e) {
            BioLog.e(e.toString());
            return null;
        } catch (InvalidKeyException e2) {
            BioLog.e(e2.toString());
            return null;
        } catch (NoSuchAlgorithmException e3) {
            BioLog.e(e3.toString());
            return null;
        } catch (BadPaddingException e4) {
            BioLog.e(e4.toString());
            return null;
        } catch (IllegalBlockSizeException e5) {
            BioLog.e(e5.toString());
            return null;
        } catch (NoSuchPaddingException e6) {
            BioLog.e(e6.toString());
            return null;
        }
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c5518de3", new Object[]{bArr, bArr2});
        }
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec("4306020520119888".getBytes());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(bArr2, "AES"), ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException e) {
            BioLog.e(e.toString());
            return null;
        } catch (InvalidKeyException e2) {
            BioLog.e(e2.toString());
            return null;
        } catch (NoSuchAlgorithmException e3) {
            BioLog.e(e3.toString());
            return null;
        } catch (BadPaddingException e4) {
            BioLog.e(e4.toString());
            return null;
        } catch (IllegalBlockSizeException e5) {
            BioLog.e(e5.toString());
            return null;
        } catch (NoSuchPaddingException e6) {
            BioLog.e(e6.toString());
            return null;
        }
    }

    public static byte[] decrypt(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b18cb518", new Object[]{bArr, str});
        }
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec("4306020520119888".getBytes());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(str.getBytes(), "AES"), ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException e) {
            BioLog.e(e.toString());
            return null;
        } catch (InvalidKeyException e2) {
            BioLog.e(e2.toString());
            return null;
        } catch (NoSuchAlgorithmException e3) {
            BioLog.e(e3.toString());
            return null;
        } catch (BadPaddingException e4) {
            BioLog.e(e4.toString());
            return null;
        } catch (IllegalBlockSizeException e5) {
            BioLog.e(e5.toString());
            return null;
        } catch (NoSuchPaddingException e6) {
            BioLog.e(e6.toString());
            return null;
        }
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bb08f3bb", new Object[]{bArr, bArr2});
        }
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec("4306020520119888".getBytes());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(bArr2, "AES"), ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException e) {
            BioLog.e(e.toString());
            return null;
        } catch (InvalidKeyException e2) {
            BioLog.e(e2.toString());
            return null;
        } catch (NoSuchAlgorithmException e3) {
            BioLog.e(e3.toString());
            return null;
        } catch (BadPaddingException e4) {
            BioLog.e(e4.toString());
            return null;
        } catch (IllegalBlockSizeException e5) {
            BioLog.e(e5.toString());
            return null;
        } catch (NoSuchPaddingException e6) {
            BioLog.e(e6.toString());
            return null;
        }
    }
}
