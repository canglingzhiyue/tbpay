package com.alipay.mobile.verifyidentity.module.fingerprint.proxy;

import android.content.Context;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.GlobalAuthenticatorManager;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager;
import com.alipay.mobile.verifyidentity.sentry.ASProxy;
import com.alipay.mobile.verifyidentity.sentry.SentryDelegate;
import com.alipay.mobile.verifyidentity.sentry.SentryHelper;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class GlobalAuthenticatorManagerProxy implements ASProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SentryDelegate delegate;
    private GlobalAuthenticatorManager globalAuthenticatorManager;

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        }
    }

    public static /* synthetic */ SentryDelegate access$000(GlobalAuthenticatorManagerProxy globalAuthenticatorManagerProxy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SentryDelegate) ipChange.ipc$dispatch("294f282d", new Object[]{globalAuthenticatorManagerProxy}) : globalAuthenticatorManagerProxy.delegate;
    }

    public GlobalAuthenticatorManagerProxy(GlobalAuthenticatorManager globalAuthenticatorManager) {
        this.globalAuthenticatorManager = globalAuthenticatorManager;
    }

    public int startAuth(Context context, String str, final IAuthenticatorManager.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4953b1c4", new Object[]{this, context, str, callback})).intValue();
        }
        this.delegate = new SentryDelegate();
        return this.globalAuthenticatorManager.startAuth(context, str, new IAuthenticatorManager.Callback() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.proxy.GlobalAuthenticatorManagerProxy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager.Callback
            public void onResult(AuthenticatorResponse authenticatorResponse) {
                int result;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse});
                    return;
                }
                if (GlobalAuthenticatorManagerProxy.access$000(GlobalAuthenticatorManagerProxy.this).f6066a) {
                    if (authenticatorResponse == null || (result = authenticatorResponse.getResult()) == 102 || result == 109) {
                        GlobalAuthenticatorManagerProxy.access$000(GlobalAuthenticatorManagerProxy.this);
                    } else {
                        GlobalAuthenticatorManagerProxy.access$000(GlobalAuthenticatorManagerProxy.this);
                        SentryHelper.a(authenticatorResponse);
                    }
                }
                IAuthenticatorManager.Callback callback2 = callback;
                if (callback2 == null) {
                    return;
                }
                callback2.onResult(authenticatorResponse);
            }
        });
    }

    public String getSecData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5a3e4b4", new Object[]{this});
        }
        new SentryDelegate();
        return this.globalAuthenticatorManager.getSecData();
    }
}
