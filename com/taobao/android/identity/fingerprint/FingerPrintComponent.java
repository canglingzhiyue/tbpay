package com.taobao.android.identity.fingerprint;

import android.app.KeyguardManager;
import android.content.SharedPreferences;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.FingerCallback;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.rpc.safe.AES;
import com.ali.user.mobile.service.FingerprintService;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import tb.kge;

/* loaded from: classes5.dex */
public class FingerPrintComponent implements FingerprintService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FINGERPRINTINFO = "aliuser.login.fingerprint";
    private static final String TAG;
    private CancellationSignal mCancellationSignal = null;
    private FingerprintManager mFingerprintManager;
    private SharedPreferences storage;

    static {
        kge.a(-11920702);
        kge.a(42684947);
        TAG = FingerPrintComponent.class.getSimpleName();
    }

    public FingerPrintComponent() {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                this.mFingerprintManager = (FingerprintManager) DataProviderFactory.getApplicationContext().getSystemService(MspFlybirdDefine.FLYBIRD_SETTING_FINGERPRINT);
                this.storage = DataProviderFactory.getApplicationContext().getSharedPreferences(FINGERPRINTINFO, 4);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.ali.user.mobile.service.FingerprintService
    public boolean isFingerprintSetable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5543d8d", new Object[]{this})).booleanValue();
        }
        try {
            KeyguardManager keyguardManager = (KeyguardManager) DataProviderFactory.getApplicationContext().getSystemService("keyguard");
            if (Build.VERSION.SDK_INT < 23 || keyguardManager == null || this.mFingerprintManager == null) {
                return false;
            }
            boolean isKeyguardSecure = keyguardManager.isKeyguardSecure();
            boolean isHardwareDetected = this.mFingerprintManager.isHardwareDetected();
            if ((AppInfo.getInstance().isRoot() && LoginSwitch.getSwitch("rootCheck", "true")) || !isKeyguardSecure || !isHardwareDetected) {
                return false;
            }
            return LoginSwitch.isInABTestRegion(LoginSwitch.FINGER_ORANGE, 10000);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ali.user.mobile.service.FingerprintService
    public boolean isFingerprintAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56992f9a", new Object[]{this})).booleanValue();
        }
        try {
            KeyguardManager keyguardManager = (KeyguardManager) DataProviderFactory.getApplicationContext().getSystemService("keyguard");
            if (Build.VERSION.SDK_INT < 23 || keyguardManager == null || this.mFingerprintManager == null) {
                return false;
            }
            boolean isKeyguardSecure = keyguardManager.isKeyguardSecure();
            boolean isHardwareDetected = this.mFingerprintManager.isHardwareDetected();
            boolean hasEnrolledFingerprints = this.mFingerprintManager.hasEnrolledFingerprints();
            if (!isKeyguardSecure || !isHardwareDetected || !hasEnrolledFingerprints) {
                return false;
            }
            return LoginSwitch.isInABTestRegion(LoginSwitch.FINGER_ORANGE, 10000);
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // com.ali.user.mobile.service.FingerprintService
    public void authenticate(final FingerCallback fingerCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cecc515", new Object[]{this, fingerCallback});
        } else if (fingerCallback == null) {
        } else {
            FingerprintManager.AuthenticationCallback authenticationCallback = new FingerprintManager.AuthenticationCallback() { // from class: com.taobao.android.identity.fingerprint.FingerPrintComponent.1
                @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
                public void onAuthenticationError(int i, CharSequence charSequence) {
                    fingerCallback.onAuthenticationError(i, charSequence);
                }

                @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
                public void onAuthenticationHelp(int i, CharSequence charSequence) {
                    fingerCallback.onAuthenticationHelp(i, charSequence);
                }

                @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
                public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
                    fingerCallback.onAuthenticationSucceeded(authenticationResult);
                }

                @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
                public void onAuthenticationFailed() {
                    fingerCallback.onAuthenticationFailed();
                }
            };
            try {
                this.mCancellationSignal = new CancellationSignal();
                this.mFingerprintManager.authenticate(buildCryptoObject(), this.mCancellationSignal, 0, authenticationCallback, null);
            } catch (IllegalStateException e) {
                if (e.getLocalizedMessage().contains("Crypto primitive not initialized")) {
                    MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.android.identity.fingerprint.FingerPrintComponent.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                fingerCallback.onAuthenticationError(100, "指纹变更");
                            }
                        }
                    });
                    return;
                }
                throw new RuntimeException(e);
            } catch (SecurityException e2) {
                throw new RuntimeException(e2);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
    }

    private FingerprintManager.CryptoObject buildCryptoObject() throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintManager.CryptoObject) ipChange.ipc$dispatch("6b188007", new Object[]{this}) : new FingerprintManager.CryptoObject(new AES().getCipher(true));
    }

    @Override // com.ali.user.mobile.service.FingerprintService
    public void cancelIdentify() {
        CancellationSignal cancellationSignal;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7b9292d", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 23 || (cancellationSignal = this.mCancellationSignal) == null) {
        } else {
            try {
                cancellationSignal.cancel();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
