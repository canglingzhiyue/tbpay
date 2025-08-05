package com.alipay.security.mobile.auth;

import android.content.Context;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;

/* loaded from: classes3.dex */
public interface IAuthenticator {
    public static final int USER_STATUS_DATA_CORRUPT = 1;
    public static final int USER_STATUS_NOT_REGISTER = 0;
    public static final int USER_STATUS_REGISTER = 2;

    void cancel();

    void cancel(Context context);

    int checkUserStatus(String str);

    AuthInfo getAuthInfo();

    String getDeviceId();

    String getTrustDeviceToken(byte[] bArr);

    int init(Context context, AuthenticatorCallback authenticatorCallback, String str);

    boolean isIgnoreFpIndex();

    void prapareKeyPair();

    String process(AuthenticatorMessage authenticatorMessage);

    void process(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback);

    int registedFingerPrintNumber();

    void release();

    void setContext(Context context);
}
