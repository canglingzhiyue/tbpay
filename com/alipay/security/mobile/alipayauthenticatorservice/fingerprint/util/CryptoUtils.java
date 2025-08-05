package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: classes3.dex */
public class CryptoUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean verifyECCSign(String str, String str2, String str3) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException, SignatureException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae10d612", new Object[]{str, str2, str3})).booleanValue();
        }
        byte[] string2byteArray = string2byteArray(str3);
        byte[] string2byteArray2 = string2byteArray(str2);
        PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(string2byteArray));
        Signature signature = Signature.getInstance("SHA256withECDSA");
        signature.initVerify(generatePublic);
        signature.update(str.getBytes());
        return signature.verify(string2byteArray2);
    }

    public static String byteArray2String(byte[] bArr) throws UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("80593b00", new Object[]{bArr}) : new String(Base64.encode(bArr, 0), "UTF-8");
    }

    public static byte[] string2byteArray(String str) throws UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("8560895c", new Object[]{str}) : Base64.decode(str.getBytes("UTF-8"), 0);
    }
}
