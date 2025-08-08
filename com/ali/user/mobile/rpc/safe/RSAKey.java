package com.ali.user.mobile.rpc.safe;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class RSAKey {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_RSA_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC8H6Gp7XP6UvEQzvUgGnt9nPX4exn1aNlmeyloMl6g2rEggeTNMp7I3iLPzQDbt6yedCru971fducKc2DgF/y2CcwAdqaKdxm0dSI2Zs4QLNYbKwWJ65wkgUh8+TJBnk+PGTgoxZ2wzvhJyRGjGhsFvLmZkUYPPxAPSNfjB3+/4wIDAQAB";
    public static final String SSO_RSA_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCN1SZgYt8OZk+Aq8PSAR2VqLKxvxvz7ASCnCTYJx1oS3dH9y/CWPh6nK6ndAWbnQG7sLyvFBTeZIc6Y7cmUFUiWJg9IZUattq6TO1Jg9OVWun4V2N2aqnOnzzVwFFyWqLMSK7E1aVZ5AXeL4KLJx14ZCxMtbqtAKdIc4Q7y1T3ywIDAQAB";
    private static String rsaPubKey;

    static {
        kge.a(1896698255);
    }

    public static String getRsaPubkey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e95448d", new Object[0]);
        }
        if (StringUtils.isEmpty(rsaPubKey)) {
            rsaPubKey = DEFAULT_RSA_KEY;
        }
        return rsaPubKey;
    }
}
