package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager;

/* loaded from: classes3.dex */
public interface IFAAFingerprintManagerFacade {
    void authenticate(IFAAFingerprintCallback iFAAFingerprintCallback);

    void cancel();

    boolean hasEnrolledFingerprints();

    boolean isHardwareDetected();
}
