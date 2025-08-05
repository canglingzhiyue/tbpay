package com.ali.user.open.ucc.util;

import com.ali.user.open.callback.LoginCallback;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.service.UserTrackerService;
import com.ali.user.open.oauth.OauthCallback;
import com.ali.user.open.oauth.OauthService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class MtopRemoteAuth {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-205048823);
    }

    public static /* synthetic */ void access$000(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fae181", new Object[]{str});
        } else {
            sendUT(str);
        }
    }

    public static void login(final LoginCallback loginCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705cc53b", new Object[]{loginCallback});
            return;
        }
        sendUT("OAUTH_LOGIN_ENTER");
        HashMap hashMap = new HashMap();
        hashMap.put("needSession", "1");
        ((OauthService) AliMemberSDK.getService(OauthService.class)).oauth(null, "taobao", hashMap, new OauthCallback() { // from class: com.ali.user.open.ucc.util.MtopRemoteAuth.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.open.oauth.OauthCallback
            public void onSuccess(String str, Map map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b5e17230", new Object[]{this, str, map});
                    return;
                }
                MtopRemoteAuth.access$000("OAUTH_LOGIN_SUCCESS");
                LoginCallback loginCallback2 = LoginCallback.this;
                if (loginCallback2 == null) {
                    return;
                }
                loginCallback2.onSuccess(null);
            }

            @Override // com.ali.user.open.oauth.OauthCallback
            public void onFail(String str, int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9656df", new Object[]{this, str, new Integer(i), str2});
                    return;
                }
                MtopRemoteAuth.access$000("OAUTH_LOGIN_FAIL");
                LoginCallback loginCallback2 = LoginCallback.this;
                if (loginCallback2 == null) {
                    return;
                }
                loginCallback2.onFailure(i, str2);
            }
        });
    }

    private static void sendUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c7ab78", new Object[]{str});
            return;
        }
        try {
            ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send("Page_UccMtopAuthLogin", str, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
