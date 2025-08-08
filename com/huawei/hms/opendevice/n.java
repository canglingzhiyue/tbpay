package com.huawei.hms.opendevice;

import mtopsdk.common.util.StringUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HEX;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public final class n {
    public static String a(String str, String str2) {
        String str3;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            if (StringUtils.isEmpty(str2)) {
                str2 = "SHA-256";
            }
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(bytes);
            return HEX.encodeHexString(messageDigest.digest(), false);
        } catch (UnsupportedEncodingException unused) {
            str3 = "trans failed .";
            HMSLog.e("SHACoder", str3);
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            str3 = "encrypt failed .";
            HMSLog.e("SHACoder", str3);
            return null;
        }
    }
}
