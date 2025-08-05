package com.ali.user.mobile.model;

import com.ali.user.mobile.rpc.login.model.WSecurityData;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginBaseParam implements Serializable, Cloneable {
    public boolean alipayInstalled;
    public String biometricId;
    public String codeLength;
    public String countryCode;
    public String deviceLevel;
    public String deviceTokenKey;
    public String emailCode;
    public String emailSid;
    public Map<String, String> ext;
    public boolean fromRecommendLogin;
    public String h5QueryString;
    public long hid;
    public boolean isFoundPassword;
    public boolean isFromRegister;
    public String loginId;
    public String loginSourceType;
    public String maskMobile;
    public String nativeLoginType;
    public String pageType;
    public String password;
    public String phoneCode;
    public boolean resendAlert;
    public String scene;
    public String sdkTraceId;
    public boolean sendLoginFailWhenWebviewCancel;
    public int site;
    public String smsCode;
    public String smsSid;
    public String snsTrustLoginToken;
    public String snsType;
    public String source;
    public String token;
    public String utPageName;
    public boolean whatsAppBusinessInstalled;
    public boolean whatsAppInstalled;
    public WSecurityData wua;
    public boolean sendAudio = false;
    public String tokenType = TokenType.LOGIN;
    public boolean isFromAccount = false;

    static {
        kge.a(-1798940735);
        kge.a(1028243835);
        kge.a(-723128125);
    }
}
