package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager;

/* loaded from: classes3.dex */
public interface IFAAFingerprintCallback {
    void onAuthenticationError(int i, CharSequence charSequence);

    void onAuthenticationFailed();

    void onAuthenticationSucceeded();
}
