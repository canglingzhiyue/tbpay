package org.ifaa.android.manager.face;

/* loaded from: classes9.dex */
public abstract class IFAAFaceManager {
    public static final int ERR_FACE_CANCEL = 102;
    public static final int ERR_FACE_LOCKED = 129;
    public static final int ERR_FACE_TIMEOUT = 113;
    public static final int FAIL_FACE_AUTHENTICATION = 103;
    public static final int STATUS_FACE_BRIGHT = 407;
    public static final int STATUS_FACE_CAPTURE = 414;
    public static final int STATUS_FACE_DARK = 406;
    public static final int STATUS_FACE_EYE_CLOSED = 403;
    public static final int STATUS_FACE_FAR = 404;
    public static final int STATUS_FACE_HACKER = 418;
    public static final int STATUS_FACE_IMAGE_DIRTY = 419;
    public static final int STATUS_FACE_INSUFFICIENT = 402;
    public static final int STATUS_FACE_MOUTH_OCCLUSION = 409;
    public static final int STATUS_FACE_NEAR = 405;
    public static final int STATUS_FACE_NO_FACE = 415;
    public static final int STATUS_FACE_OFFSET_BOTTOM = 413;
    public static final int STATUS_FACE_OFFSET_LEFT = 410;
    public static final int STATUS_FACE_OFFSET_RIGHT = 411;
    public static final int STATUS_FACE_OFFSET_TOP = 412;
    public static final int STATUS_FACE_PARTIAL = 401;
    public static final int STATUS_FACE_QUALITY = 408;
    public static final int STATUS_FACE_TOO_FAST = 417;
    public static final int STATUS_FACE_TOO_SLOW = 416;
    public static final int SUCC_FACE_AUTHENTICATION = 100;

    /* loaded from: classes9.dex */
    public static abstract class AuthenticatorCallback {
        public void onAuthenticationError(int i) {
        }

        public void onAuthenticationFailed(int i) {
        }

        public void onAuthenticationStatus(int i) {
        }

        public void onAuthenticationSucceeded() {
        }
    }

    public abstract void authenticate(int i, int i2, AuthenticatorCallback authenticatorCallback);

    public abstract int cancel(int i);

    public int getVersion() {
        return 1;
    }
}
