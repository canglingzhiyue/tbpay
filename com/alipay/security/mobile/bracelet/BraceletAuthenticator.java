package com.alipay.security.mobile.bracelet;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.alipay.security.mobile.agent.AlipayAuthenticator;
import com.alipay.security.mobile.auth.AbstractAuthenticator;
import com.alipay.security.mobile.auth.AuthInfo;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BraceletAuthenticator extends AbstractAuthenticator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_DEVICEID = "profile";
    private static final String SECURITY_PREFERENCE = "securitypreference11";
    private static final int TYPE = Constants.TYPE_BRACELET;
    public int mMinServiceVersion = 4;
    private int mProtocalType;
    private int mProtocalVersion;
    private String mServerUrl;
    private int mVendor;

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    @Deprecated
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        }
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public int checkUserStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e76e2389", new Object[]{this, str})).intValue();
        }
        return 0;
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator
    @Deprecated
    public void doAuthenticate(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffdad8b3", new Object[]{this, authenticatorMessage, authenticatorCallback});
        }
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator
    @Deprecated
    public void doDeregister(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5585984", new Object[]{this, authenticatorMessage, authenticatorCallback});
        }
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator
    @Deprecated
    public void doRegister(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a1f25", new Object[]{this, authenticatorMessage, authenticatorCallback});
        }
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public int init(Context context, AuthenticatorCallback authenticatorCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("531a0767", new Object[]{this, context, authenticatorCallback, str})).intValue();
        }
        return 111;
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public String process(AuthenticatorMessage authenticatorMessage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f121a629", new Object[]{this, authenticatorMessage}) : "NOT SUPPORT";
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public void process(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb5a824", new Object[]{this, authenticatorMessage, authenticatorCallback});
        }
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    @Deprecated
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        }
    }

    public BraceletAuthenticator(int i, int i2, int i3, String str, String str2) {
        this.mVendor = -1;
        this.mProtocalType = -1;
        this.mProtocalVersion = -1;
        this.mServerUrl = null;
        this.mVendor = i;
        this.mProtocalType = i2;
        this.mProtocalVersion = i3;
        this.mServerUrl = str2;
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public String getDeviceId() {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
        }
        try {
            SharedPreferences sharedPreferences = this.context.getSharedPreferences(SECURITY_PREFERENCE, 0);
            String string2 = sharedPreferences.getString(KEY_DEVICEID, null);
            if (string2 != null) {
                return string2;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE, 12);
            bundle.putInt(AuthenticatorMessage.KEY_VENDOR_TYPE, this.mVendor);
            bundle.putInt(AuthenticatorMessage.KEY_AUTHENTICATOR_TYPE, TYPE);
            Bundle process = AlipayAuthenticator.Instance().process(bundle);
            if (process != null && (string = process.getString("DEVICEID")) != null && !string.equals("")) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(KEY_DEVICEID, string);
                edit.commit();
                return string;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public AuthInfo getAuthInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AuthInfo) ipChange.ipc$dispatch("5ac464a", new Object[]{this}) : new AuthInfo(TYPE, this.mVendor, this.mProtocalType, this.mProtocalVersion, Build.MODEL, this.mServerUrl);
    }
}
