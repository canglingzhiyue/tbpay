package com.mobile.auth.gatewayauth;

/* loaded from: classes4.dex */
public interface TokenResultListener {
    void onTokenFailed(String str);

    void onTokenSuccess(String str);
}
