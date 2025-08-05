package com.ta.utdid2.android.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.utils.RC4;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import tb.kge;

/* loaded from: classes4.dex */
public class AESUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String IV = "IUQSvE6r1TfFPdPEjfklLw==";

    static {
        kge.a(-525085911);
    }

    public static String encrypt(String str) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9be3a42a", new Object[]{str});
        }
        try {
            bArr = encrypt(getRawKey(), str.getBytes());
        } catch (Exception unused) {
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return toHex(bArr);
    }

    public static String decrypt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c54002", new Object[]{str});
        }
        try {
            return new String(decrypt(getRawKey(), toByte(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    private static byte[] getRawKey() throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("c2344d49", new Object[0]) : RC4.rc4(new byte[]{33, 83, -50, -89, -84, -114, 80, 99, 10, 63, 22, -65, -11, 30, 101, -118});
    }

    private static byte[] encrypt(byte[] bArr, byte[] bArr2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c5518de3", new Object[]{bArr, bArr2});
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(getIvBytes()));
        return cipher.doFinal(bArr2);
    }

    private static byte[] decrypt(byte[] bArr, byte[] bArr2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bb08f3bb", new Object[]{bArr, bArr2});
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(getIvBytes()));
        return cipher.doFinal(bArr2);
    }

    private static byte[] toByte(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2080b2e9", new Object[]{str});
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    private static String toHex(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94332432", new Object[]{bArr});
        }
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            appendHex(stringBuffer, b);
        }
        return stringBuffer.toString();
    }

    private static void appendHex(StringBuffer stringBuffer, byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d182756a", new Object[]{stringBuffer, new Byte(b)});
            return;
        }
        stringBuffer.append("0123456789ABCDEF".charAt((b >> 4) & 15));
        stringBuffer.append("0123456789ABCDEF".charAt(b & 15));
    }

    private static byte[] getIvBytes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f1377f2e", new Object[0]);
        }
        try {
            byte[] decode = Base64.decode(IV.getBytes("UTF-8"), 2);
            if (decode != null) {
                return RC4.rc4(decode);
            }
        } catch (Exception unused) {
        }
        return new byte[16];
    }
}
