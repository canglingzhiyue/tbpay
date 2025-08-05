package com.alipay.security.mobile.auth;

import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AuthenticatorOperation implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AuthenticatorCallback mAuthenticatorCallback;
    public AuthenticatorMessage mAuthenticatorMessage;

    public AuthenticatorOperation(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback) {
        this.mAuthenticatorMessage = authenticatorMessage;
        this.mAuthenticatorCallback = authenticatorCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        }
    }
}
