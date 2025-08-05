package com.ali.user.mobile.login.presenter;

import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginFlowReturnData implements Serializable {
    public String biometricId;
    public String countryCode;
    public Map<String, String> ext;
    public String havanaId;
    public String loginId;
    public String maskMobile;
    public String[] otherLoginFlows;
    public String phoneCode;
    public String recommendLoginFlow;

    static {
        kge.a(-511177668);
        kge.a(1028243835);
    }
}
