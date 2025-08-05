package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.CryptoUtils;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.KeyMasterUtils;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.security.Signature;
import java.security.SignatureException;
import org.ifaa.android.manager.IFAAManager;
import org.ifaa.android.manager.IFAAManagerV3;

/* loaded from: classes3.dex */
public class IFAAFingerprintProtectedByKMCompat implements IFAAFingerprintManagerFacade {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KM_PROTECK_IFAA_TOKEN = "ifaa_protected_alias";
    private static final String TAG = "IFAAFingerprintProtecte";
    private static IFAAFingerprintProtectedByKMCompat sInstance;
    private String authChallenge;
    private FingerprintManager.AuthenticationCallback mCallback;
    private CancellationSignal mCancellationSignal;
    private Context mContext;
    private FingerprintManager mFingerprintManager;
    private Signature mSignature = null;

    public static /* synthetic */ void access$000(IFAAFingerprintProtectedByKMCompat iFAAFingerprintProtectedByKMCompat, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4faa913", new Object[]{iFAAFingerprintProtectedByKMCompat, str});
        } else {
            iFAAFingerprintProtectedByKMCompat.addMonitor(str);
        }
    }

    public static /* synthetic */ byte[] access$100(IFAAFingerprintProtectedByKMCompat iFAAFingerprintProtectedByKMCompat) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("d7f00913", new Object[]{iFAAFingerprintProtectedByKMCompat}) : iFAAFingerprintProtectedByKMCompat.signWithKM();
    }

    public static /* synthetic */ boolean access$200(IFAAFingerprintProtectedByKMCompat iFAAFingerprintProtectedByKMCompat, byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fff14096", new Object[]{iFAAFingerprintProtectedByKMCompat, bArr})).booleanValue() : iFAAFingerprintProtectedByKMCompat.verifyWithKM(bArr);
    }

    private IFAAFingerprintProtectedByKMCompat(Context context) {
        this.mContext = context;
        try {
            this.mFingerprintManager = (FingerprintManager) this.mContext.getSystemService(MspFlybirdDefine.FLYBIRD_SETTING_FINGERPRINT);
        } catch (Throwable unused) {
        }
    }

    public static synchronized IFAAFingerprintProtectedByKMCompat getInstance(Context context) {
        synchronized (IFAAFingerprintProtectedByKMCompat.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IFAAFingerprintProtectedByKMCompat) ipChange.ipc$dispatch("6deb4772", new Object[]{context});
            }
            if (sInstance == null) {
                sInstance = new IFAAFingerprintProtectedByKMCompat(context);
            }
            if (sInstance.mFingerprintManager == null) {
                return null;
            }
            return sInstance;
        }
    }

    @Override // com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerFacade
    public void authenticate(final IFAAFingerprintCallback iFAAFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f67a94", new Object[]{this, iFAAFingerprintCallback});
            return;
        }
        this.mCancellationSignal = new CancellationSignal();
        this.mCallback = new FingerprintManager.AuthenticationCallback() { // from class: com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintProtectedByKMCompat.1
            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationHelp(int i, CharSequence charSequence) {
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationError(int i, CharSequence charSequence) {
                IFAAFingerprintCallback iFAAFingerprintCallback2 = iFAAFingerprintCallback;
                if (iFAAFingerprintCallback2 != null) {
                    iFAAFingerprintCallback2.onAuthenticationError(i, charSequence);
                }
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
                if (iFAAFingerprintCallback == null) {
                    return;
                }
                if (authenticationResult == null || authenticationResult.getCryptoObject() == null || authenticationResult.getCryptoObject().getSignature() == null) {
                    IFAAFingerprintProtectedByKMCompat.access$000(IFAAFingerprintProtectedByKMCompat.this, "result/crypto/signature is null");
                    iFAAFingerprintCallback.onAuthenticationError(-1, "result/crypto/signature is null");
                }
                byte[] access$100 = IFAAFingerprintProtectedByKMCompat.access$100(IFAAFingerprintProtectedByKMCompat.this);
                if (access$100 != null && IFAAFingerprintProtectedByKMCompat.access$200(IFAAFingerprintProtectedByKMCompat.this, access$100)) {
                    iFAAFingerprintCallback.onAuthenticationSucceeded();
                    return;
                }
                IFAAFingerprintProtectedByKMCompat.access$000(IFAAFingerprintProtectedByKMCompat.this, "sign or verify failed");
                iFAAFingerprintCallback.onAuthenticationError(-1, "sign or verify failed");
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationFailed() {
                IFAAFingerprintCallback iFAAFingerprintCallback2 = iFAAFingerprintCallback;
                if (iFAAFingerprintCallback2 != null) {
                    iFAAFingerprintCallback2.onAuthenticationFailed();
                }
            }
        };
        try {
            IFAAManager iFAAManager = IFAAFingerprintManagerFactory.getIFAAManager(this.mContext);
            if (iFAAManager != null) {
                int supportBIOTypes = iFAAManager.getSupportBIOTypes(this.mContext);
                AuthenticatorLOG.fpInfo("bioTypes: " + supportBIOTypes);
                int i = Constants.TYPE_FINGERPRINT | 16;
                if ((supportBIOTypes & i) == i) {
                    ((IFAAManagerV3) iFAAManager).setExtInfo(Constants.TYPE_FINGERPRINT, "org.ifaa.ext.key.CUSTOM_VIEW", "enable");
                }
            }
            initSignature();
            if (this.mSignature != null) {
                this.mFingerprintManager.authenticate(new FingerprintManager.CryptoObject(this.mSignature), this.mCancellationSignal, 0, this.mCallback, null);
            } else {
                this.mCallback.onAuthenticationError(-2, "km key gen failed");
            }
        } catch (Exception e) {
            AuthenticatorLOG.error(e);
            if (iFAAFingerprintCallback == null) {
                return;
            }
            iFAAFingerprintCallback.onAuthenticationError(-1, "exception when authing");
        }
    }

    @Override // com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerFacade
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        try {
            if (this.mCancellationSignal == null || this.mCancellationSignal.isCanceled()) {
                return;
            }
            this.mCancellationSignal.cancel();
        } catch (Exception e) {
            AuthenticatorLOG.error(e);
        }
    }

    @Override // com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerFacade
    public boolean isHardwareDetected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5964305f", new Object[]{this})).booleanValue();
        }
        try {
            if (this.mFingerprintManager != null) {
                return this.mFingerprintManager.isHardwareDetected();
            }
            return false;
        } catch (Exception e) {
            AuthenticatorLOG.error(e);
            return false;
        }
    }

    @Override // com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerFacade
    public boolean hasEnrolledFingerprints() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b8c7b9", new Object[]{this})).booleanValue();
        }
        try {
            if (this.mFingerprintManager != null) {
                return this.mFingerprintManager.hasEnrolledFingerprints();
            }
            return false;
        } catch (Throwable th) {
            AuthenticatorLOG.error(th);
            return false;
        }
    }

    private void initSignature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71e860f", new Object[]{this});
            return;
        }
        this.mSignature = KeyMasterUtils.getInstance().initSignature(KM_PROTECK_IFAA_TOKEN);
        if (this.mSignature != null) {
            return;
        }
        if (KeyMasterUtils.getInstance().generateKey(KM_PROTECK_IFAA_TOKEN)) {
            this.mSignature = KeyMasterUtils.getInstance().initSignature(KM_PROTECK_IFAA_TOKEN);
            if (this.mSignature != null) {
                return;
            }
            addMonitor("signature_init_failed");
            this.mCallback.onAuthenticationError(-2, "signature obj init failed");
            return;
        }
        addMonitor("signature_init_failed");
        this.mCallback.onAuthenticationError(-2, "km key gen failed");
    }

    private byte[] signWithKM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7a5d5791", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.authChallenge)) {
            this.authChallenge = initChallenge();
        }
        try {
            this.mSignature.update(this.authChallenge.getBytes());
            return this.mSignature.sign();
        } catch (Exception e) {
            if (e instanceof SignatureException) {
                AuthenticatorLOG.error(TAG, "fp changed with SignatureException");
            } else {
                AuthenticatorLOG.error(TAG, e.getMessage());
            }
            addMonitor("sign exception");
            return null;
        }
    }

    private boolean verifyWithKM(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbd86553", new Object[]{this, bArr})).booleanValue();
        }
        if (!IFAAFingerprintManagerAdapter.isKmEnhanceIFAANeedVerifySign()) {
            return true;
        }
        try {
            if (CryptoUtils.verifyECCSign(this.authChallenge, CryptoUtils.byteArray2String(bArr), CryptoUtils.byteArray2String(KeyMasterUtils.getInstance().loadPublicKey(KM_PROTECK_IFAA_TOKEN).getEncoded()))) {
                return true;
            }
            addMonitor("verify sign failed");
            return false;
        } catch (UnsupportedEncodingException unused) {
            addMonitor("pubkey bytearray 2 string err");
            return false;
        } catch (Exception unused2) {
            addMonitor("verify sign exception");
            return false;
        }
    }

    private String initChallenge() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b87713a6", new Object[]{this}) : String.valueOf(System.currentTimeMillis());
    }

    private void addMonitor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eccff4a", new Object[]{this, str});
        } else {
            TrackEvent.getIns().addMonitorKey("IFAA_PROTECTED_BY_KM", str);
        }
    }
}
