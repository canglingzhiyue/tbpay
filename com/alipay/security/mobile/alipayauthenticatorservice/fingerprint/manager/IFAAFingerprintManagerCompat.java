package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import org.ifaa.android.manager.IFAAManager;
import org.ifaa.android.manager.IFAAManagerV3;

/* loaded from: classes3.dex */
public class IFAAFingerprintManagerCompat implements IFAAFingerprintManagerFacade {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static IFAAFingerprintManagerCompat sInstance;
    private FingerprintManager.AuthenticationCallback mCallback;
    private CancellationSignal mCancellationSignal;
    private Context mContext;
    private FingerprintManager mFingerprintManager;

    private IFAAFingerprintManagerCompat(Context context) {
        this.mContext = context;
        try {
            this.mFingerprintManager = (FingerprintManager) this.mContext.getSystemService(MspFlybirdDefine.FLYBIRD_SETTING_FINGERPRINT);
        } catch (Throwable unused) {
        }
    }

    public static synchronized IFAAFingerprintManagerCompat getInstance(Context context) {
        synchronized (IFAAFingerprintManagerCompat.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IFAAFingerprintManagerCompat) ipChange.ipc$dispatch("90c4edcc", new Object[]{context});
            }
            if (sInstance == null) {
                sInstance = new IFAAFingerprintManagerCompat(context);
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
        this.mCallback = new FingerprintManager.AuthenticationCallback() { // from class: com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerCompat.1
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
                IFAAFingerprintCallback iFAAFingerprintCallback2 = iFAAFingerprintCallback;
                if (iFAAFingerprintCallback2 != null) {
                    iFAAFingerprintCallback2.onAuthenticationSucceeded();
                }
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
            this.mFingerprintManager.authenticate(null, this.mCancellationSignal, 0, this.mCallback, null);
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
}
