package com.ali.user.open.ucc.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.Site;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.model.LoginDataModel;
import com.ali.user.open.core.model.LoginReturnData;
import com.ali.user.open.core.util.ParamsConstants;
import com.ali.user.open.oauth.AppCredential;
import com.ali.user.open.oauth.OauthCallback;
import com.ali.user.open.oauth.OauthService;
import com.ali.user.open.service.SessionService;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.UccServiceProvider;
import com.ali.user.open.ucc.biz.UccBindPresenter;
import com.ali.user.open.ucc.biz.UccH5Presenter;
import com.ali.user.open.ucc.model.UccParams;
import com.ali.user.open.ucc.util.UTHitConstants;
import com.ali.user.open.ucc.util.UTHitUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import tb.fjp;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class BaseUccServiceProvider implements UccServiceProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TaobaoUccServiceProviderImpl";

    static {
        kge.a(-1505669498);
        kge.a(-276509813);
    }

    @Override // com.ali.user.open.ucc.UccServiceProvider
    public void cleanUp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426bb0dd", new Object[]{this, context});
        }
    }

    public abstract boolean isAuthByNative(Context context, String str, Map<String, String> map);

    @Override // com.ali.user.open.ucc.UccServiceProvider
    public void logout(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc40ebd7", new Object[]{this, context});
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceProvider
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceProvider
    public void bind(Activity activity, UccParams uccParams, AppCredential appCredential, Map<String, String> map, UccCallback uccCallback) {
        HashMap hashMap = map;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf24a06d", new Object[]{this, activity, uccParams, appCredential, hashMap, uccCallback});
        } else if ((uccParams == null || StringUtils.isEmpty(uccParams.userToken)) && (hashMap == null || StringUtils.isEmpty(hashMap.get("requestToken")))) {
            UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_InvalidParams", uccParams, null);
            if (uccCallback == null) {
                return;
            }
            uccCallback.onFail(uccParams.bindSite, 102, "参数错误");
        } else if (hashMap != null && !StringUtils.isEmpty(hashMap.get("authCode"))) {
            HashMap hashMap2 = new HashMap();
            String str = hashMap.get("authCode");
            hashMap2.put("authCode", str);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put(ParamsConstants.Key.PARAM_ONLY_AUTHCODE, "1");
            hashMap.put(ParamsConstants.Key.PARAM_IS_BIND, "1");
            hashMap.put("traceId", uccParams.traceId);
            hashMap.put("userToken", uccParams.userToken);
            UccBindPresenter.getInstance().bindByNativeAuth(activity, uccParams, str, "oauthcode", hashMap, uccCallback);
        } else if (hashMap != null && !StringUtils.isEmpty(hashMap.get(ParamsConstants.Key.PARAM_BIND_TOKEN))) {
            hashMap.put("traceId", uccParams.traceId);
            hashMap.put("userToken", uccParams.userToken);
            String str2 = hashMap.get(ParamsConstants.Key.PARAM_BIND_TOKEN_TYPE);
            if (StringUtils.isEmpty(str2)) {
                str2 = "oauthcode";
            }
            UccBindPresenter.getInstance().bindByNativeAuth(activity, uccParams, hashMap.get(ParamsConstants.Key.PARAM_BIND_TOKEN), str2, map, uccCallback);
        } else {
            boolean isH5OnlyBindSites = ConfigManager.getInstance().isH5OnlyBindSites(uccParams.bindSite);
            if (hashMap != null && !StringUtils.isEmpty(hashMap.get(ParamsConstants.Key.PARAM_H5ONLY))) {
                if (StringUtils.equals(hashMap.get(ParamsConstants.Key.PARAM_H5ONLY), "1")) {
                    isH5OnlyBindSites = true;
                } else if (StringUtils.equals(hashMap.get(ParamsConstants.Key.PARAM_H5ONLY), "0")) {
                    isH5OnlyBindSites = false;
                }
            }
            if (!isH5OnlyBindSites && isAuthByNative(activity, uccParams.bindSite, hashMap)) {
                z = false;
            }
            if (!z && (hashMap == null || !StringUtils.equals(hashMap.get(ParamsConstants.Key.PARAM_ENABLE_RECOMMEND_BIND), "true"))) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("from", a.ATOM_EXT_bind);
                if (hashMap != null) {
                    hashMap3.put("scene", hashMap.get("scene"));
                    hashMap3.put("needSession", StringUtils.equals(hashMap.get("needSession"), "1") ? "T" : UTConstant.Args.UT_SUCCESS_F);
                }
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_GoOauthBindAction", uccParams, hashMap3);
                authByNatvie(activity, uccParams, appCredential, map, uccCallback);
                return;
            }
            UccH5Presenter.showH5BindPage(activity, uccParams, hashMap, z, uccCallback);
        }
    }

    private void authByNatvie(final Activity activity, final UccParams uccParams, AppCredential appCredential, Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5f3ec0", new Object[]{this, activity, uccParams, appCredential, map, uccCallback});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(ParamsConstants.Key.PARAM_ONLY_AUTHCODE, "1");
        map.put(ParamsConstants.Key.PARAM_IS_BIND, "1");
        map.put("traceId", uccParams.traceId);
        map.put("userToken", uccParams.userToken);
        final Map<String, String> map2 = map;
        ((OauthService) AliMemberSDK.getService(OauthService.class)).oauth(activity, uccParams.bindSite, map, new OauthCallback() { // from class: com.ali.user.open.ucc.base.BaseUccServiceProvider.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.open.oauth.OauthCallback
            public void onSuccess(String str, Map map3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b5e17230", new Object[]{this, str, map3});
                    return;
                }
                resultHit("3000");
                String str2 = (String) map3.get("authCode");
                String str3 = (String) map3.get("accessToken");
                UccBindPresenter.getInstance().bindByNativeAuth(activity, uccParams, StringUtils.isEmpty(str3) ? str2 : str3, StringUtils.isEmpty(str3) ? "oauthcode" : HttpHeaderConstant.KEY_EXTDATA_ACCESSTOKEN, map2, uccCallback);
            }

            @Override // com.ali.user.open.oauth.OauthCallback
            public void onFail(String str, int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9656df", new Object[]{this, str, new Integer(i), str2});
                    return;
                }
                resultHit(i + "");
                if (i == 10003 || i == 15) {
                    UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_Cancel", uccParams, new HashMap());
                } else if (i == 1011) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("needSession", "1");
                    UccBindPresenter uccBindPresenter = UccBindPresenter.getInstance();
                    Activity activity2 = activity;
                    UccParams uccParams2 = uccParams;
                    uccBindPresenter.getUserInfo(activity2, uccParams2, uccParams2.userToken, "userToken", "native", hashMap, uccCallback);
                }
                UccCallback uccCallback2 = uccCallback;
                if (uccCallback2 == null) {
                    return;
                }
                uccCallback2.onFail(str, i, str2);
            }

            private void resultHit(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("366f9047", new Object[]{this, str});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("code", str);
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_GoOauthResult", uccParams, hashMap);
            }
        });
    }

    private void authByNatvieWithIbb(final Activity activity, final UccParams uccParams, Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13d2276", new Object[]{this, activity, uccParams, map, uccCallback});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("traceId", uccParams.traceId);
        final Map<String, String> map2 = map;
        ((OauthService) AliMemberSDK.getService(OauthService.class)).oauth(activity, uccParams.bindSite, map, new OauthCallback() { // from class: com.ali.user.open.ucc.base.BaseUccServiceProvider.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.open.oauth.OauthCallback
            public void onSuccess(String str, Map map3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b5e17230", new Object[]{this, str, map3});
                    return;
                }
                resultHit("3000");
                UccBindPresenter.getInstance().getUserInfo(activity, uccParams, (String) map3.get("authCode"), "oauthcode", "native", map2, uccCallback);
            }

            @Override // com.ali.user.open.oauth.OauthCallback
            public void onFail(String str, int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9656df", new Object[]{this, str, new Integer(i), str2});
                    return;
                }
                resultHit(i + "");
                if (i == 10003 || i == 15) {
                    UTHitUtils.send(UTHitConstants.PageUccBind, "UccBindWithIbb_Cancel", uccParams, null);
                } else if (i == 1011) {
                    UTHitUtils.send(UTHitConstants.PageUccBind, "UccBindWithIbb_NativeSkip", uccParams, null);
                }
                UccCallback uccCallback2 = uccCallback;
                if (uccCallback2 == null) {
                    return;
                }
                uccCallback2.onFail(str, i, str2);
            }

            private void resultHit(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("366f9047", new Object[]{this, str});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("code", str);
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBindWithIbb_GoOauthResult", uccParams, hashMap);
            }
        });
    }

    @Override // com.ali.user.open.ucc.UccServiceProvider
    public void refreshWhenLogin(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("852e92e5", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            ((SessionService) AliMemberSDK.getService(SessionService.class)).refreshCookie(str, (LoginReturnData) JSON.parseObject(str2, LoginReturnData.class));
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceProvider
    public void bindWithIBB(Activity activity, UccParams uccParams, String str, Map<String, String> map, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cb3ad", new Object[]{this, activity, uccParams, str, map, uccCallback});
        } else if (uccParams == null || StringUtils.isEmpty(str)) {
            UTHitUtils.send(UTHitConstants.PageUccBind, "UccBindWithIbb_InvalidParams", uccParams, null);
            if (uccCallback == null) {
                return;
            }
            uccCallback.onFail(uccParams.bindSite, 102, "参数错误");
        } else if (isAuthByNative(activity, uccParams.bindSite, map)) {
            HashMap hashMap = new HashMap();
            hashMap.put("from", a.ATOM_EXT_bind);
            if (map != null) {
                hashMap.put("scene", map.get("scene"));
                hashMap.put("needSession", StringUtils.equals(map.get("needSession"), "1") ? "T" : UTConstant.Args.UT_SUCCESS_F);
            }
            UTHitUtils.send(UTHitConstants.PageUccBind, "UccBindWithIbb_GoOauthBindAction", uccParams, hashMap);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(ParamsConstants.Key.PARAM_SCENE_CODE, fjp.ERROR_CODE_DESC_RENDER_ERROR);
            map.put(ParamsConstants.Key.PARAM_IBB, str);
            authByNatvieWithIbb(activity, uccParams, map, uccCallback);
        } else {
            UccH5Presenter.showH5BindPageFoeNewBind(activity, uccParams, str, map, uccCallback);
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceProvider
    public Map<String, String> buildSessionInfo(String str, String str2) {
        LoginDataModel loginDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9649eda6", new Object[]{this, str, str2});
        }
        HashMap hashMap = new HashMap();
        if (Site.isHavanaSite(str)) {
            try {
                LoginReturnData loginReturnData = (LoginReturnData) JSON.parseObject(str2, LoginReturnData.class);
                if (loginReturnData != null && (loginDataModel = (LoginDataModel) JSON.parseObject(loginReturnData.data, LoginDataModel.class)) != null) {
                    hashMap.put("openId", loginDataModel.openId);
                    hashMap.put(ParamsConstants.Key.PARAM_BIND_TOKEN, loginDataModel.bindToken);
                    hashMap.put("accessToken", loginDataModel.topAccessToken);
                    hashMap.put("authCode", loginDataModel.topAuthCode);
                    hashMap.put("userId", loginDataModel.userId);
                    hashMap.put("sid", loginDataModel.sid);
                    hashMap.put("nick", loginDataModel.nick);
                    hashMap.put("avatarUrl", loginDataModel.headPicLink);
                    hashMap.put("openSid", loginDataModel.openSid);
                }
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    @Override // com.ali.user.open.ucc.UccServiceProvider
    public void applyToken(UccParams uccParams, Map<String, String> map, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fc9a730", new Object[]{this, uccParams, map, uccCallback});
        } else if (Site.isHavanaSite(uccParams.bindSite)) {
            UccBindPresenter.getInstance().applyToken(uccParams, "native", map, uccCallback);
        } else {
            uccCallback.onFail(uccParams.bindSite, 1601, "unsupportedSite");
        }
    }
}
