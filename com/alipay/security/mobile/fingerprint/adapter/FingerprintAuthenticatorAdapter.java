package com.alipay.security.mobile.fingerprint.adapter;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.alipay.security.mobile.alipayauthenticatorservice.adapter.AuthenticatorAgent;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerAdapter;
import com.alipay.security.mobile.auth.AbstractAuthenticator;
import com.alipay.security.mobile.auth.AuthInfo;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.util.BioBehaviorUtils;
import com.alipay.security.mobile.util.CommonUtils;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class FingerprintAuthenticatorAdapter extends AbstractAuthenticator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int TYPE = Constants.TYPE_FINGERPRINT;
    private IFAAFingerprintManagerAdapter mFingerprintManagerAdapter;

    /* loaded from: classes3.dex */
    public interface InitCallback {
        void callback(int i);
    }

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

    public static /* synthetic */ Context access$000(FingerprintAuthenticatorAdapter fingerprintAuthenticatorAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("384bcf7e", new Object[]{fingerprintAuthenticatorAdapter}) : fingerprintAuthenticatorAdapter.context;
    }

    public FingerprintAuthenticatorAdapter() {
    }

    public FingerprintAuthenticatorAdapter(Context context) {
        if (context != null) {
            this.context = context.getApplicationContext();
        }
        this.mFingerprintManagerAdapter = IFAAFingerprintManagerAdapter.getInstance(this.context);
        AuthenticatorLOG.fpInfo("IFAAManager FingerprintAuthenticatorAdapter construct");
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public int init(Context context, AuthenticatorCallback authenticatorCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("531a0767", new Object[]{this, context, authenticatorCallback, str})).intValue();
        }
        this.context = context.getApplicationContext();
        try {
            this.mFingerprintManagerAdapter = IFAAFingerprintManagerAdapter.getInstance(context);
            if (this.mFingerprintManagerAdapter != null) {
                if (this.mFingerprintManagerAdapter.isHardwareDetected()) {
                    return 100;
                }
            }
        } catch (Exception unused) {
        }
        return 111;
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public void process(AuthenticatorMessage authenticatorMessage, final AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb5a824", new Object[]{this, authenticatorMessage, authenticatorCallback});
            return;
        }
        AuthenticatorLOG.debug("process new wallet path");
        authenticatorMessage.setAuthenticatorType(TYPE);
        final Bundle bundle = new Bundle();
        bundle.putInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE, authenticatorMessage.getType());
        bundle.putString(AuthenticatorMessage.KEY_MESSAGE, authenticatorMessage.getData());
        bundle.putInt(AuthenticatorMessage.KEY_AUTHENTICATOR_TYPE, authenticatorMessage.getAuthenticatorType());
        bundle.putString(AuthenticatorMessage.KEY_EXTRA_PARAMS, authenticatorMessage.getExtraParams());
        bundle.putInt("KEY_VERSION", authenticatorMessage.getVersion());
        bundle.putString(AuthenticatorMessage.KEY_VERIFY_ID, authenticatorMessage.getId());
        TrackEvent.getIns().event(bundle, "enter in bioSDK");
        BioBehaviorUtils.getInstance().add(bundle, "enter in bioSDK");
        new Thread(new Runnable() { // from class: com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticatorAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AuthenticatorAgent.getInstance(FingerprintAuthenticatorAdapter.access$000(FingerprintAuthenticatorAdapter.this)).processCommmandAsync(bundle, authenticatorCallback);
                }
            }
        }).start();
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public String process(AuthenticatorMessage authenticatorMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f121a629", new Object[]{this, authenticatorMessage});
        }
        if (authenticatorMessage == null) {
            return null;
        }
        switch (authenticatorMessage.getType()) {
            case 12:
                return getDeviceId();
            case 13:
                if (this.mFingerprintManagerAdapter != null) {
                    return "" + registedFingerPrintNumber();
                }
                break;
            case 14:
                if (CommonUtils.isBlank(authenticatorMessage.getData())) {
                    return null;
                }
                return "" + checkUserStatus(authenticatorMessage.getData());
            case 15:
            case 17:
            default:
                return null;
            case 16:
                if (this.mFingerprintManagerAdapter != null) {
                    return "" + this.mFingerprintManagerAdapter.startFingerprintManager();
                }
                break;
        }
        return null;
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
        }
        IFAAFingerprintManagerAdapter iFAAFingerprintManagerAdapter = this.mFingerprintManagerAdapter;
        if (iFAAFingerprintManagerAdapter == null) {
            return null;
        }
        return iFAAFingerprintManagerAdapter.getDeviceID();
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        IFAAFingerprintManagerAdapter iFAAFingerprintManagerAdapter = this.mFingerprintManagerAdapter;
        if (iFAAFingerprintManagerAdapter == null) {
            return;
        }
        try {
            iFAAFingerprintManagerAdapter.cancel();
        } catch (Exception unused) {
        }
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public AuthInfo getAuthInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AuthInfo) ipChange.ipc$dispatch("5ac464a", new Object[]{this}) : new AuthInfo(Constants.TYPE_FINGERPRINT, 100, 2, 20, Build.MODEL, "");
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public int checkUserStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e76e2389", new Object[]{this, str})).intValue();
        }
        IFAAFingerprintManagerAdapter iFAAFingerprintManagerAdapter = this.mFingerprintManagerAdapter;
        if (iFAAFingerprintManagerAdapter == null) {
            return 2;
        }
        return iFAAFingerprintManagerAdapter.getUserStatus(str);
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public int registedFingerPrintNumber() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f7fc392", new Object[]{this})).intValue();
        }
        IFAAFingerprintManagerAdapter iFAAFingerprintManagerAdapter = this.mFingerprintManagerAdapter;
        return (iFAAFingerprintManagerAdapter == null || !iFAAFingerprintManagerAdapter.hasEnrolledFingerprints()) ? 0 : 2;
    }
}
