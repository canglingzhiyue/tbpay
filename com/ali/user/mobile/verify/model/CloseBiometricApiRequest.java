package com.ali.user.mobile.verify.model;

import com.alipay.android.msp.constants.MspFlybirdDefine;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class CloseBiometricApiRequest implements Serializable {
    public String appKey;
    public String biometricType = MspFlybirdDefine.FLYBIRD_SETTING_FINGERPRINT;
    public List<BiometricCloseUsers> closeUsers;
    public String requestScene;
    public int site;

    static {
        kge.a(-1990202039);
        kge.a(1028243835);
    }
}
