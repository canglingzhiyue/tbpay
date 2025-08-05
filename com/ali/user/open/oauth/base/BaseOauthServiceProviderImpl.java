package com.ali.user.open.oauth.base;

import android.content.Context;
import android.content.Intent;
import com.ali.user.open.oauth.OauthCallback;
import com.ali.user.open.oauth.OauthServiceProvider;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class BaseOauthServiceProviderImpl implements OauthServiceProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "oa.DamaiOauthServiceProviderImpl";

    @Override // com.ali.user.open.oauth.OauthServiceProvider
    public void cleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f7d54b", new Object[]{this});
        }
    }

    @Override // com.ali.user.open.oauth.OauthServiceProvider
    public boolean isAppAuthSurpport(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3275c85", new Object[]{this, context})).booleanValue();
        }
        return false;
    }

    @Override // com.ali.user.open.oauth.OauthServiceProvider
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    @Override // com.ali.user.open.oauth.OauthServiceProvider
    public void refreshWhenLogin(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1090042f", new Object[]{this, str, new Boolean(z)});
        }
    }

    @Override // com.ali.user.open.oauth.OauthServiceProvider
    public void tokenLogin(String str, String str2, String str3, Map<String, String> map, OauthCallback oauthCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bfeda8d", new Object[]{this, str, str2, str3, map, oauthCallback});
        }
    }
}
