package com.ali.user.mobile.verify.model;

import com.alipay.android.msp.constants.MspFlybirdDefine;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class BiometricCloseUsers implements Serializable {
    public String biometricId;
    public String biometricType = MspFlybirdDefine.FLYBIRD_SETTING_FINGERPRINT;

    static {
        kge.a(1864069332);
        kge.a(1028243835);
    }
}
