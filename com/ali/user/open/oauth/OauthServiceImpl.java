package com.ali.user.open.oauth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.device.DeviceInfo;
import com.ali.user.open.core.service.UserTrackerService;
import com.ali.user.open.core.util.ParamsConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class OauthServiceImpl implements OauthService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.ali.user.open.oauth.OauthService
    public boolean isLoginUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c07d2af", new Object[]{this, str, str2})).booleanValue();
        }
        if (OauthServiceProviderFactory.getInstance().getOauthServiceProvider(str) == null) {
            return false;
        }
        return OauthServiceProviderFactory.getInstance().getOauthServiceProvider(str).isLoginUrl(str2);
    }

    @Override // com.ali.user.open.oauth.OauthService
    public void oauth(Activity activity, String str, OauthCallback oauthCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10b153e3", new Object[]{this, activity, str, oauthCallback});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ParamsConstants.Key.PARAM_NEED_AUTOLOGIN, "0");
        hashMap.put("needSession", "0");
        oauth(activity, str, hashMap, oauthCallback);
    }

    @Override // com.ali.user.open.oauth.OauthService
    public void oauth(Activity activity, String str, Map<String, String> map, OauthCallback oauthCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("372a0ef2", new Object[]{this, activity, str, map, oauthCallback});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("oauthsite", str);
        if (map != null && !TextUtils.isEmpty(map.get("traceId"))) {
            hashMap.put("traceId", map.get("traceId"));
        } else {
            String str2 = "oauth" + DeviceInfo.deviceId + (System.currentTimeMillis() / 1000);
            hashMap.put("traceId", str2);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("traceId", str2);
        }
        Map<String, String> map2 = map;
        ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send("Page_UccOauth", "Page_UccOauth_Invoke", hashMap);
        AppCredential oauthConfigByPlatform = OauthPlatformConfig.getOauthConfigByPlatform(str);
        if (OauthServiceProviderFactory.getInstance().getOauthServiceProvider(str) == null) {
            return;
        }
        OauthServiceProviderFactory.getInstance().getOauthServiceProvider(str).oauth(activity, str, oauthConfigByPlatform, map2, oauthCallback);
    }

    @Override // com.ali.user.open.oauth.OauthService
    public boolean isAppAuthSurpport(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5828c80f", new Object[]{this, context, str})).booleanValue();
        }
        if (OauthServiceProviderFactory.getInstance().getOauthServiceProvider(str) == null) {
            return false;
        }
        return OauthServiceProviderFactory.getInstance().getOauthServiceProvider(str).isAppAuthSurpport(context);
    }

    @Override // com.ali.user.open.oauth.OauthService
    public void refreshWhenLogin(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("852e92e5", new Object[]{this, str, str2, new Boolean(z)});
        } else if (OauthServiceProviderFactory.getInstance().getOauthServiceProvider(str) == null) {
        } else {
            OauthServiceProviderFactory.getInstance().getOauthServiceProvider(str).refreshWhenLogin(str2, z);
        }
    }

    @Override // com.ali.user.open.oauth.OauthService
    public void tokenLogin(String str, String str2, String str3, String str4, Map<String, String> map, OauthCallback oauthCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33237d97", new Object[]{this, str, str2, str3, str4, map, oauthCallback});
        } else if (OauthServiceProviderFactory.getInstance().getOauthServiceProvider(str) == null) {
        } else {
            OauthServiceProviderFactory.getInstance().getOauthServiceProvider(str).tokenLogin(str2, str3, str4, map, oauthCallback);
        }
    }

    @Override // com.ali.user.open.oauth.OauthService
    public void logout(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d96de1", new Object[]{this, context, str});
        } else if (OauthServiceProviderFactory.getInstance().getOauthServiceProvider(str) == null) {
        } else {
            OauthServiceProviderFactory.getInstance().getOauthServiceProvider(str).logout(context, str);
        }
    }

    @Override // com.ali.user.open.oauth.OauthService
    public List<String> logoutAll(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b26d803d", new Object[]{this, context}) : OauthServiceProviderFactory.getInstance().logoutAll(context);
    }

    @Override // com.ali.user.open.oauth.OauthService
    public void cleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f7d54b", new Object[]{this});
        } else {
            OauthServiceProviderFactory.getInstance().cleanUp();
        }
    }

    @Override // com.ali.user.open.oauth.OauthService
    public void onActivityResult(String str, int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cf2a539", new Object[]{this, str, new Integer(i), new Integer(i2), intent});
        } else if (OauthServiceProviderFactory.getInstance().getOauthServiceProvider(str) == null) {
        } else {
            OauthServiceProviderFactory.getInstance().getOauthServiceProvider(str).onActivityResult(i, i2, intent);
        }
    }
}
