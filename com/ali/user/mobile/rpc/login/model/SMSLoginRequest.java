package com.ali.user.mobile.rpc.login.model;

import tb.kge;

/* loaded from: classes2.dex */
public class SMSLoginRequest extends PasswordLoginRequest {
    public String codeLength;
    public String countryCode;
    public String nick;
    public String phoneCode;
    public boolean resendAlert;
    public String smsCode;
    public String smsSid;

    static {
        kge.a(1283868257);
    }
}
