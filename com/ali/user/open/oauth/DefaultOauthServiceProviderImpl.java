package com.ali.user.open.oauth;

import android.app.Activity;
import android.content.Context;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.oauth.base.BaseOauthServiceProviderImpl;
import com.ali.user.open.service.SessionService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public class DefaultOauthServiceProviderImpl extends BaseOauthServiceProviderImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.ali.user.open.oauth.OauthServiceProvider
    public boolean isLoginUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf81cf25", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // com.ali.user.open.oauth.OauthServiceProvider
    public void oauth(Activity activity, String str, AppCredential appCredential, Map<String, String> map, OauthCallback oauthCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed2f1ff", new Object[]{this, activity, str, appCredential, map, oauthCallback});
        }
    }

    @Override // com.ali.user.open.oauth.OauthServiceProvider
    public void logout(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d96de1", new Object[]{this, context, str});
        } else {
            ((SessionService) AliMemberSDK.getService(SessionService.class)).logout(str);
        }
    }
}
