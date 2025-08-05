package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* loaded from: classes3.dex */
public class PackageUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static byte[] getApkKeyHashBytes(Context context, String str) throws PackageManager.NameNotFoundException, CertificateException, NoSuchAlgorithmException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("49ef77f6", new Object[]{context, str});
        }
        byte[] encoded = CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray())).getEncoded();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(encoded);
        return messageDigest.digest();
    }
}
