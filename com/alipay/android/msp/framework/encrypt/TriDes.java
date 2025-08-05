package com.alipay.android.msp.framework.encrypt;

import android.util.Base64;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.mobile.security.bio.utils.DESCoder;
import com.android.alibaba.ip.runtime.IpChange;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public class TriDes {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f4711a = "DESede/ECB/PKCS5Padding";

    public static String encrypt(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("327cf920", new Object[]{str, str2});
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), DESCoder.ALGORITHM);
            Cipher cipher = Cipher.getInstance(f4711a);
            cipher.init(1, secretKeySpec);
            return Base64.encodeToString(cipher.doFinal(str2.getBytes()), 2);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return null;
        }
    }

    public static String decrypt(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24104ef8", new Object[]{str, str2});
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), DESCoder.ALGORITHM);
            Cipher cipher = Cipher.getInstance(f4711a);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(Base64.decode(str2, 2)));
        } catch (Exception e) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, ErrorCode.CRYPT_TRIDES_DECRYPT_EXCEPTION, e);
            LogUtil.printExceptionStackTrace(e);
            return null;
        }
    }
}
