package com.ali.user.mobile.rpc.login.model;

import android.os.Build;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class LoginRequestBase extends MemberRequestBase {
    public String biometricId;
    public String biometricState;
    public String deviceTokenKey;
    public String deviceTokenSign;
    public String hid;
    public String maskMobile;
    public String pageType;
    public String sid;
    public String snsToken;
    public String supportBiometricType;
    public long t;
    public boolean useDeviceToken = true;
    public String deviceName = Build.BRAND + riy.BRACKET_START_STR + Build.MODEL + riy.BRACKET_END_STR;
    public boolean useAcitonType = true;

    static {
        kge.a(-1763911787);
    }
}
