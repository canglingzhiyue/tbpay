package com.alipay.mobile.verifyidentity.module.fingerprint.proxy;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.mobile.verifyidentity.log.LoggerFactory;
import com.alipay.mobile.verifyidentity.sentry.ASProxy;
import com.alipay.mobile.verifyidentity.sentry.SentryDelegate;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AuthenticatorManagerProxy implements ASProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AuthenticatorManager authenticatorManager;
    private SentryDelegate delegate;

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        }
    }

    public static /* synthetic */ SentryDelegate access$000(AuthenticatorManagerProxy authenticatorManagerProxy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SentryDelegate) ipChange.ipc$dispatch("c3303d90", new Object[]{authenticatorManagerProxy}) : authenticatorManagerProxy.delegate;
    }

    public static /* synthetic */ JSONObject access$100(AuthenticatorManagerProxy authenticatorManagerProxy, AuthenticatorResponse authenticatorResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7bf5cbe5", new Object[]{authenticatorManagerProxy, authenticatorResponse}) : a(authenticatorResponse);
    }

    public AuthenticatorManagerProxy(AuthenticatorManager authenticatorManager) {
        this.authenticatorManager = authenticatorManager;
    }

    public int startAuth(Context context, AuthenticatorMessage authenticatorMessage, final AuthenticatorManager.Callback callback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae0cc09e", new Object[]{this, context, authenticatorMessage, callback, str})).intValue();
        }
        this.delegate = new SentryDelegate();
        if (this.delegate.f6066a) {
            a(authenticatorMessage).toJSONString();
        }
        return this.authenticatorManager.startAuth(context, authenticatorMessage, new AuthenticatorManager.Callback() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.proxy.AuthenticatorManagerProxy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.Callback
            public void onResult(AuthenticatorResponse authenticatorResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse});
                    return;
                }
                if (AuthenticatorManagerProxy.access$000(AuthenticatorManagerProxy.this).f6066a) {
                    if (authenticatorResponse != null) {
                        int result = authenticatorResponse.getResult();
                        JSONObject access$100 = AuthenticatorManagerProxy.access$100(AuthenticatorManagerProxy.this, authenticatorResponse);
                        if (102 != result && 109 != result) {
                            AuthenticatorManagerProxy.access$000(AuthenticatorManagerProxy.this);
                            access$100.toJSONString();
                        }
                    }
                    AuthenticatorManagerProxy.access$000(AuthenticatorManagerProxy.this);
                }
                AuthenticatorManager.Callback callback2 = callback;
                if (callback2 == null) {
                    return;
                }
                callback2.onResult(authenticatorResponse);
            }
        }, str);
    }

    private static JSONObject a(AuthenticatorMessage authenticatorMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("53e9ebe9", new Object[]{authenticatorMessage});
        }
        if (authenticatorMessage == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) (authenticatorMessage.getId()));
        StringBuilder sb = new StringBuilder();
        sb.append(authenticatorMessage.getType());
        jSONObject.put("type", (Object) sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(authenticatorMessage.getVersion());
        jSONObject.put("version", (Object) sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(authenticatorMessage.getUiType());
        jSONObject.put("uiType", (Object) sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(authenticatorMessage.getAuthenticatorType());
        jSONObject.put("authenticatorType", (Object) sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(authenticatorMessage.getSwitchBtnType());
        jSONObject.put("switchBtnType", (Object) sb5.toString());
        try {
            String data = authenticatorMessage.getData();
            if (!TextUtils.isEmpty(data)) {
                JSONObject parseObject = JSON.parseObject(data);
                if (parseObject.containsKey("signedData")) {
                    parseObject.remove("signedData");
                }
                jSONObject.put("data", (Object) parseObject);
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("Sentry", th);
        }
        return jSONObject;
    }

    private static JSONObject a(AuthenticatorResponse authenticatorResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("16e6a39f", new Object[]{authenticatorResponse});
        }
        if (authenticatorResponse == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", (Object) Integer.valueOf(authenticatorResponse.getResult()));
            jSONObject.put("resultMessage", (Object) authenticatorResponse.getResultMessage());
            String data = authenticatorResponse.getData();
            if (!TextUtils.isEmpty(data)) {
                JSONObject parseObject = JSON.parseObject(data);
                if (parseObject.containsKey("signedData")) {
                    parseObject.remove("signedData");
                }
                jSONObject.put("data", (Object) parseObject);
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("Sentry", th);
        }
        return jSONObject;
    }
}
