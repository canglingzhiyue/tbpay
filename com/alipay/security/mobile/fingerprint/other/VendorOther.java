package com.alipay.security.mobile.fingerprint.other;

import android.content.Context;
import com.alipay.security.mobile.auth.AbstractAuthenticator;
import com.alipay.security.mobile.auth.AuthInfo;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class VendorOther extends AbstractAuthenticator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        }
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator
    public void doAuthenticate(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffdad8b3", new Object[]{this, authenticatorMessage, authenticatorCallback});
        }
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator
    public void doDeregister(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5585984", new Object[]{this, authenticatorMessage, authenticatorCallback});
        }
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator
    public void doRegister(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a1f25", new Object[]{this, authenticatorMessage, authenticatorCallback});
        }
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public AuthInfo getAuthInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthInfo) ipChange.ipc$dispatch("5ac464a", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public String getTrustDeviceToken(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b62f9a71", new Object[]{this, bArr});
        }
        return null;
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public int init(Context context, AuthenticatorCallback authenticatorCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("531a0767", new Object[]{this, context, authenticatorCallback, str})).intValue();
        }
        return 111;
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        }
    }
}
