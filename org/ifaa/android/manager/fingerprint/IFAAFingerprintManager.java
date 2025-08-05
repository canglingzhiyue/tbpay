package org.ifaa.android.manager.fingerprint;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes9.dex */
public abstract class IFAAFingerprintManager {
    private Context privateContext;

    /* loaded from: classes9.dex */
    public static abstract class IFAAAuthenticationCallback {
        public void onAuthenticationAcquired(int i) {
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
        }

        public void onAuthenticationSucceeded(IFAAAuthenticationResult iFAAAuthenticationResult) {
        }
    }

    /* loaded from: classes9.dex */
    public static class IFAAAuthenticationResult {
        private IFAACryptoObject mCryptoObject;
        private IFAAFingerprint mFingerprint;

        public IFAAAuthenticationResult(IFAACryptoObject iFAACryptoObject, IFAAFingerprint iFAAFingerprint) {
            this.mCryptoObject = iFAACryptoObject;
            this.mFingerprint = iFAAFingerprint;
        }

        public IFAACryptoObject getCryptoObject() {
            return this.mCryptoObject;
        }

        public IFAAFingerprint getFingerprint() {
            return this.mFingerprint;
        }
    }

    /* loaded from: classes9.dex */
    public static class IFAACryptoObject {
        private final Object mCryptoObject;

        public IFAACryptoObject(Signature signature) {
            this.mCryptoObject = signature;
        }

        public IFAACryptoObject(Cipher cipher) {
            this.mCryptoObject = cipher;
        }

        public IFAACryptoObject(Mac mac) {
            this.mCryptoObject = mac;
        }

        public Cipher getCipher() {
            Object obj = this.mCryptoObject;
            if (obj instanceof Cipher) {
                return (Cipher) obj;
            }
            return null;
        }

        public Mac getMac() {
            Object obj = this.mCryptoObject;
            if (obj instanceof Mac) {
                return (Mac) obj;
            }
            return null;
        }

        public Signature getSignature() {
            Object obj = this.mCryptoObject;
            if (obj instanceof Signature) {
                return (Signature) obj;
            }
            return null;
        }
    }

    public IFAAFingerprintManager(Context context) {
        this.privateContext = context;
    }

    public abstract void authenticate(IFAACryptoObject iFAACryptoObject, CancellationSignal cancellationSignal, int i, IFAAAuthenticationCallback iFAAAuthenticationCallback, Handler handler);

    public abstract void cancel();

    public abstract boolean hasEnrolledFingerprints();

    public abstract boolean isHardwareDetected();
}
