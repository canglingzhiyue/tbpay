package com.alipay.security.mobile.ifaa.auth;

import android.content.Context;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;

/* loaded from: classes3.dex */
public interface IAuthenticator {

    /* loaded from: classes3.dex */
    public interface Callback {
        void onAuthStatus(int i);

        void onResult(AuthenticatorResponse authenticatorResponse);
    }

    void authenticate(AuthenticatorMessage authenticatorMessage, Callback callback);

    void cancel();

    void deregister(AuthenticatorMessage authenticatorMessage, Callback callback);

    int getEnabled();

    int[] getIDList();

    int getUserStatus(String str);

    boolean hasEnroll();

    int init(Context context);

    void register(AuthenticatorMessage authenticatorMessage, Callback callback);

    int startBIOManager();
}
