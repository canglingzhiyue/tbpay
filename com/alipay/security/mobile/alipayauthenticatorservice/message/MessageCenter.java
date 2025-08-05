package com.alipay.security.mobile.alipayauthenticatorservice.message;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.alipay.security.mobile.alipayauthenticatorservice.adapter.AuthenticatorAgent;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.AuthenticatorResponseUtil;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.cache.AuthenticatorCache;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MessageCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void sendResponseMessage(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5e765f1", new Object[]{context, bundle});
            return;
        }
        AuthenticatorCallback authenticatorCallback = AuthenticatorAgent.getInstance(context).getAuthenticatorCallback();
        Message message = new Message();
        message.setData(bundle);
        if (authenticatorCallback == null) {
            return;
        }
        AuthenticatorLOG.debug("callback: result is " + bundle.getInt(AuthenticatorMessage.KEY_RESULT));
        AuthenticatorResponse authenticatorResponse = AuthenticatorResponseUtil.getAuthenticatorResponse(message);
        if (authenticatorResponse != null && authenticatorResponse.getType() != 9 && authenticatorResponse.getResult() == 100) {
            AuthenticatorCache.getInstance().refreshCache(context, "", 5000L);
        }
        authenticatorCallback.callback(authenticatorResponse);
    }
}
