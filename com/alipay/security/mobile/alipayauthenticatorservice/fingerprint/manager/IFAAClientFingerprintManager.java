package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager;

import android.content.Context;
import android.os.CancellationSignal;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.android.alibaba.ip.runtime.IpChange;
import org.ifaa.android.manager.fingerprint.IFAAFingerprintManager;

/* loaded from: classes3.dex */
public class IFAAClientFingerprintManager implements IFAAFingerprintManagerFacade {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static IFAAClientFingerprintManager sInstance;
    private IFAAFingerprintManager.IFAAAuthenticationCallback mCallback;
    private CancellationSignal mCancellationSignal;
    private Context mContext;
    private IFAAFingerprintManager mFingerprintManager;

    private IFAAClientFingerprintManager(Context context) {
        this.mContext = context;
        try {
            this.mFingerprintManager = IFAAFingerprintManagerFactory.getIFAAFingerprintManager(this.mContext);
        } catch (Exception unused) {
        }
    }

    public static synchronized IFAAClientFingerprintManager getInstance(Context context) {
        synchronized (IFAAClientFingerprintManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IFAAClientFingerprintManager) ipChange.ipc$dispatch("25f760a3", new Object[]{context});
            }
            if (sInstance == null) {
                sInstance = new IFAAClientFingerprintManager(context);
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
        if (this.mFingerprintManager == null && iFAAFingerprintCallback != null) {
            iFAAFingerprintCallback.onAuthenticationError(-1, "fingerprintManager is null");
        }
        this.mCancellationSignal = new CancellationSignal();
        this.mCallback = new IFAAFingerprintManager.IFAAAuthenticationCallback() { // from class: com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAClientFingerprintManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // org.ifaa.android.manager.fingerprint.IFAAFingerprintManager.IFAAAuthenticationCallback
            public void onAuthenticationHelp(int i, CharSequence charSequence) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c05e8ce8", new Object[]{this, new Integer(i), charSequence});
                }
            }

            @Override // org.ifaa.android.manager.fingerprint.IFAAFingerprintManager.IFAAAuthenticationCallback
            public void onAuthenticationError(int i, CharSequence charSequence) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4947938f", new Object[]{this, new Integer(i), charSequence});
                    return;
                }
                IFAAFingerprintCallback iFAAFingerprintCallback2 = iFAAFingerprintCallback;
                if (iFAAFingerprintCallback2 == null) {
                    return;
                }
                iFAAFingerprintCallback2.onAuthenticationError(i, charSequence);
            }

            @Override // org.ifaa.android.manager.fingerprint.IFAAFingerprintManager.IFAAAuthenticationCallback
            public void onAuthenticationSucceeded(IFAAFingerprintManager.IFAAAuthenticationResult iFAAAuthenticationResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e3b6bde4", new Object[]{this, iFAAAuthenticationResult});
                    return;
                }
                IFAAFingerprintCallback iFAAFingerprintCallback2 = iFAAFingerprintCallback;
                if (iFAAFingerprintCallback2 == null) {
                    return;
                }
                iFAAFingerprintCallback2.onAuthenticationSucceeded();
            }

            @Override // org.ifaa.android.manager.fingerprint.IFAAFingerprintManager.IFAAAuthenticationCallback
            public void onAuthenticationFailed() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d822ffdb", new Object[]{this});
                    return;
                }
                IFAAFingerprintCallback iFAAFingerprintCallback2 = iFAAFingerprintCallback;
                if (iFAAFingerprintCallback2 == null) {
                    return;
                }
                iFAAFingerprintCallback2.onAuthenticationFailed();
            }
        };
        try {
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
