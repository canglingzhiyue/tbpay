package com.alipay.security.mobile.face;

import android.content.Context;
import android.os.Build;
import com.alipay.security.mobile.auth.AbstractAuthenticator;
import com.alipay.security.mobile.auth.AuthInfo;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.ifaa.auth.FaceAuthenticator;
import com.alipay.security.mobile.ifaa.auth.IAuthenticator;
import com.alipay.security.mobile.ifaa.device.IFAADevice;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class FaceAuthenticatorAdapter extends AbstractAuthenticator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FaceAuthenticator faceAuthenticator;

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator
    @Deprecated
    public void doAuthenticate(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffdad8b3", new Object[]{this, authenticatorMessage, authenticatorCallback});
        }
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator
    @Deprecated
    public void doDeregister(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5585984", new Object[]{this, authenticatorMessage, authenticatorCallback});
        }
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator
    @Deprecated
    public void doRegister(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a1f25", new Object[]{this, authenticatorMessage, authenticatorCallback});
        }
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public void prapareKeyPair() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7a9a6dd", new Object[]{this});
        }
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        }
    }

    public FaceAuthenticatorAdapter() {
        AuthenticatorLOG.faceInfo("IFAAManager FaceAuthenticatorAdapter construct");
        this.faceAuthenticator = new FaceAuthenticator();
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public int init(Context context, AuthenticatorCallback authenticatorCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("531a0767", new Object[]{this, context, authenticatorCallback, str})).intValue();
        }
        this.context = context.getApplicationContext();
        try {
            return this.faceAuthenticator.init(this.context) != 0 ? 111 : 100;
        } catch (Exception unused) {
            return 111;
        }
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public void process(AuthenticatorMessage authenticatorMessage, final AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb5a824", new Object[]{this, authenticatorMessage, authenticatorCallback});
        } else if (authenticatorMessage.getType() == 4) {
            AuthenticatorLOG.faceInfo("FaceAuthenticatorAdapter call process func for deregister");
            this.faceAuthenticator.deregister(authenticatorMessage, new IAuthenticator.Callback() { // from class: com.alipay.security.mobile.face.FaceAuthenticatorAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator.Callback
                public void onAuthStatus(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("50675803", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator.Callback
                public void onResult(AuthenticatorResponse authenticatorResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse});
                        return;
                    }
                    AuthenticatorCallback authenticatorCallback2 = authenticatorCallback;
                    if (authenticatorCallback2 == null) {
                        return;
                    }
                    authenticatorCallback2.callback(authenticatorResponse);
                }
            });
        } else {
            AuthenticatorLOG.faceErr("FaceAuthenticatorAdapter is not support process func");
        }
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public String process(AuthenticatorMessage authenticatorMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f121a629", new Object[]{this, authenticatorMessage});
        }
        AuthenticatorLOG.faceErr("FaceAuthenticatorAdapter is not support process func");
        return null;
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this}) : IFAADevice.getInstance(this.context).getDeviceId();
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public String getTrustDeviceToken(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b62f9a71", new Object[]{this, bArr}) : IFAADevice.getInstance(this.context).getDeviceToken(bArr);
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            AuthenticatorLOG.faceErr("FaceAuthenticatorAdapter is not support cancel func");
        }
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public void cancel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9196b8e7", new Object[]{this, context});
        } else {
            AuthenticatorLOG.faceErr("FaceAuthenticatorAdapter is not support cancel(context) func");
        }
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public AuthInfo getAuthInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AuthInfo) ipChange.ipc$dispatch("5ac464a", new Object[]{this}) : new AuthInfo(Constants.TYPE_FACE, 100, 2, 20, Build.MODEL, "");
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public int checkUserStatus(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e76e2389", new Object[]{this, str})).intValue() : this.faceAuthenticator.getUserStatus(str);
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public int registedFingerPrintNumber() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6f7fc392", new Object[]{this})).intValue() : this.faceAuthenticator.hasEnroll() ? 1 : 0;
    }
}
