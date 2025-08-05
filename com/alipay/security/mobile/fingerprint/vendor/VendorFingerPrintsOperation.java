package com.alipay.security.mobile.fingerprint.vendor;

import com.alipay.security.mobile.agent.AlipayAuthenticator;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorOperation;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class VendorFingerPrintsOperation extends AuthenticatorOperation {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static boolean isInited = false;
    public final String aTAG;
    public int mVender_type;

    public VendorFingerPrintsOperation(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback, int i) {
        super(authenticatorMessage, authenticatorCallback);
        this.aTAG = VendorFingerPrintsOperation.class.getSimpleName();
        this.mVender_type = i;
    }

    @Override // com.alipay.security.mobile.auth.AuthenticatorOperation, java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            AlipayAuthenticator.Instance().processAsync(this.mAuthenticatorMessage, this.mAuthenticatorCallback, this.mVender_type);
        }
    }
}
