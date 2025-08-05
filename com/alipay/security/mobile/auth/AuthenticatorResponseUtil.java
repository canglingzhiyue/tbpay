package com.alipay.security.mobile.auth;

import android.os.Message;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AuthenticatorResponseUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static AuthenticatorResponse getAuthenticatorResponse(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthenticatorResponse) ipChange.ipc$dispatch("bb47f48f", new Object[]{message});
        }
        try {
            AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse();
            authenticatorResponse.setType(message.getData().getInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE));
            authenticatorResponse.setResult(message.getData().getInt(AuthenticatorMessage.KEY_RESULT));
            authenticatorResponse.setCheckPolicyOnly(message.getData().getBoolean(AuthenticatorMessage.KEY_CHECKING_POLICY));
            authenticatorResponse.setResgistedTokens(message.getData().getStringArrayList(AuthenticatorMessage.KEY_REGISTERED_TOKENS));
            if (message.getData().getInt(AuthenticatorMessage.KEY_RESULT) != 100) {
                authenticatorResponse.setResultMessage(message.getData().getString(AuthenticatorMessage.KEY_MESSAGE));
            } else {
                authenticatorResponse.setData(message.getData().getString(AuthenticatorMessage.KEY_MESSAGE));
            }
            return authenticatorResponse;
        } catch (Exception e) {
            AuthenticatorLOG.fpInfo(e);
            return null;
        }
    }
}
