package com.alipay.android.phone.seauthenticator.iotauth.authmanager;

import android.content.Context;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;

/* loaded from: classes3.dex */
public interface IAuthenticatorManager {

    /* loaded from: classes3.dex */
    public interface Callback {
        void onResult(AuthenticatorResponse authenticatorResponse);
    }

    String getSecData();

    int startAuth(Context context, String str, Callback callback);

    boolean startBIOManager(int i);

    int startDeReg(String str, int i, Callback callback);

    int startReg(Context context, String str, int i, Callback callback);

    void stopAuth(int i);
}
