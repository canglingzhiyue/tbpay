package com.ali.user.open.oauth.taobao;

import android.app.Activity;
import android.content.Context;
import com.ali.user.open.callback.LoginCallback;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.Site;
import com.ali.user.open.core.model.LoginReturnData;
import com.ali.user.open.oauth.AppCredential;
import com.ali.user.open.oauth.OauthCallback;
import com.ali.user.open.oauth.base.BaseOauthServiceProviderImpl;
import com.ali.user.open.service.SessionService;
import com.ali.user.open.service.impl.SessionManager;
import com.ali.user.open.session.Session;
import com.ali.user.open.tbauth.TbAuthService;
import com.ali.user.open.tbauth.callback.LogoutCallback;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class TaobaoOauthServiceProviderImpl extends BaseOauthServiceProviderImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "oa.AlipayOauthServiceProviderImpl";

    public static /* synthetic */ Object ipc$super(TaobaoOauthServiceProviderImpl taobaoOauthServiceProviderImpl, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.ali.user.open.oauth.OauthServiceProvider
    public boolean isLoginUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cf81cf25", new Object[]{this, str})).booleanValue() : ((TbAuthService) AliMemberSDK.getService(TbAuthService.class)).isLoginUrl(str);
    }

    @Override // com.ali.user.open.oauth.OauthServiceProvider
    public void oauth(Activity activity, String str, AppCredential appCredential, Map<String, String> map, OauthCallback oauthCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed2f1ff", new Object[]{this, activity, str, appCredential, map, oauthCallback});
        } else {
            authTask(activity, str, appCredential, map, oauthCallback);
        }
    }

    private void authTask(Activity activity, final String str, AppCredential appCredential, Map<String, String> map, final OauthCallback oauthCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579ada09", new Object[]{this, activity, str, appCredential, map, oauthCallback});
        } else {
            ((TbAuthService) AliMemberSDK.getService(TbAuthService.class)).auth(map, new LoginCallback() { // from class: com.ali.user.open.oauth.taobao.TaobaoOauthServiceProviderImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.callback.LoginCallback
                public void onSuccess(Session session) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c5c8819", new Object[]{this, session});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("openId", session.openId);
                    hashMap.put("accessToken", session.topAccessToken);
                    hashMap.put("authCode", session.topAuthCode);
                    if (Site.DING.equals(AliMemberSDK.getMasterSite())) {
                        hashMap.put("userId", SessionManager.INSTANCE.getInternalSession().userId);
                        hashMap.put("sid", SessionManager.INSTANCE.getInternalSession().sid);
                    }
                    hashMap.put("openSid", session.openSid);
                    oauthCallback.onSuccess(str, hashMap);
                }

                @Override // com.ali.user.open.core.callback.FailureCallback
                public void onFailure(int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i), str2});
                    } else {
                        oauthCallback.onFail(str, i, str2);
                    }
                }
            });
        }
    }

    @Override // com.ali.user.open.oauth.OauthServiceProvider
    public void logout(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d96de1", new Object[]{this, context, str});
        } else {
            ((TbAuthService) AliMemberSDK.getService(TbAuthService.class)).logout((LogoutCallback) null);
        }
    }

    @Override // com.ali.user.open.oauth.base.BaseOauthServiceProviderImpl, com.ali.user.open.oauth.OauthServiceProvider
    public boolean isAppAuthSurpport(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3275c85", new Object[]{this, context})).booleanValue();
        }
        try {
            if (AliMemberSDK.getService(TbAuthService.class) != null) {
                return ((TbAuthService) AliMemberSDK.getService(TbAuthService.class)).isAppAuthSurpport(context);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    @Override // com.ali.user.open.oauth.base.BaseOauthServiceProviderImpl, com.ali.user.open.oauth.OauthServiceProvider
    public void refreshWhenLogin(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1090042f", new Object[]{this, str, new Boolean(z)});
            return;
        }
        LoginReturnData loginReturnData = (LoginReturnData) JSON.parseObject(str, LoginReturnData.class);
        if (z) {
            ((SessionService) AliMemberSDK.getService(SessionService.class)).refreshCookie("taobao", loginReturnData);
        } else {
            ((SessionService) AliMemberSDK.getService(SessionService.class)).refreshWhenLogin("taobao", loginReturnData);
        }
    }

    @Override // com.ali.user.open.oauth.base.BaseOauthServiceProviderImpl, com.ali.user.open.oauth.OauthServiceProvider
    public void tokenLogin(String str, String str2, String str3, Map<String, String> map, final OauthCallback oauthCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bfeda8d", new Object[]{this, str, str2, str3, map, oauthCallback});
        } else {
            ((TbAuthService) AliMemberSDK.getService(TbAuthService.class)).tokenLogin(0, str, str2, str3, new LoginCallback() { // from class: com.ali.user.open.oauth.taobao.TaobaoOauthServiceProviderImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.callback.LoginCallback
                public void onSuccess(Session session) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c5c8819", new Object[]{this, session});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    if (Site.DING.equals(AliMemberSDK.getMasterSite())) {
                        hashMap.put("userId", SessionManager.INSTANCE.getInternalSession().userId);
                        hashMap.put("sid", SessionManager.INSTANCE.getInternalSession().sid);
                    }
                    oauthCallback.onSuccess("taobao", hashMap);
                }

                @Override // com.ali.user.open.core.callback.FailureCallback
                public void onFailure(int i, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i), str4});
                    } else {
                        oauthCallback.onFail("taobao", i, str4);
                    }
                }
            });
        }
    }
}
