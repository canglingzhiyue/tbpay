package com.ali.user.mobile.verify.model;

import com.alipay.android.msp.constants.MspFlybirdDefine;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class OpenBiometricApiRequest implements Serializable {
    public String appKey;
    public String biometricType = MspFlybirdDefine.FLYBIRD_SETTING_FINGERPRINT;
    public String havanaIvToken;
    public String loginToken;
    public String requestScene;
    public int site;

    static {
        kge.a(-1076721585);
        kge.a(1028243835);
    }
}
