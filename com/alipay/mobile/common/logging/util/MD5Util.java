package com.alipay.mobile.common.logging.util;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class MD5Util {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String encrypt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9be3a42a", new Object[]{str});
        }
        if (str == null || "".equals(str.trim())) {
            throw new IllegalArgumentException("input is null");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            messageDigest.update(str.getBytes("UTF8"));
            return a(messageDigest.digest());
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(String.valueOf(hexString));
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }
}
