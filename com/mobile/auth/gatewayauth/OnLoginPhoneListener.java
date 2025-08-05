package com.mobile.auth.gatewayauth;

import com.mobile.auth.gatewayauth.model.LoginPhoneInfo;

/* loaded from: classes4.dex */
public interface OnLoginPhoneListener {
    void onGetFailed(String str);

    void onGetLoginPhone(LoginPhoneInfo loginPhoneInfo);
}
