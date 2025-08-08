package com.ali.user.open.ucc.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.ui.WebConstant;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.callback.CallbackManager;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.config.WebViewOption;
import com.ali.user.open.core.service.StatusBarService;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.DialogHelper;
import com.ali.user.open.core.util.ParamsConstants;
import com.ali.user.open.core.util.ToastUtil;
import com.ali.user.open.core.webview.BaseWebViewActivity;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.UccService;
import com.ali.user.open.ucc.biz.UccBindPresenter;
import com.ali.user.open.ucc.biz.UccTrustLoginPresenter;
import com.ali.user.open.ucc.data.ApiConstants;
import com.ali.user.open.ucc.model.UccParams;
import com.ali.user.open.ucc.util.UTHitConstants;
import com.ali.user.open.ucc.util.UTHitUtils;
import com.ali.user.open.ucc.util.UccConstants;
import com.ali.user.open.ucc.util.Utils;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class UccWebViewActivity extends BaseWebViewActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mH5RequestToken;
    public Map<String, String> mParams;
    public String mRequestToken;
    public UccParams mUccParams;
    public String scene;
    public String token;
    private final String TAG = BaseWebViewActivity.class.getSimpleName();
    public String mNeedSession = "0";
    private boolean isReassignNeedSession = false;
    public String mNeedCookieOnly = "0";
    public String mNeedToast = "0";
    public String mNeedLocalSession = "1";

    static {
        kge.a(1884274147);
    }

    public static /* synthetic */ Object ipc$super(UccWebViewActivity uccWebViewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 145119482:
                super.initParams((Intent) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.ali.user.open.core.webview.BaseWebViewActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // com.ali.user.open.core.webview.BaseWebViewActivity
    public int getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b929a", new Object[]{this})).intValue();
        }
        if (AliMemberSDK.getService(StatusBarService.class) != null && ((StatusBarService) AliMemberSDK.getService(StatusBarService.class)).getWebLayout() > 0) {
            return ((StatusBarService) AliMemberSDK.getService(StatusBarService.class)).getWebLayout();
        }
        return R.layout.member_sdk_ucc_webview;
    }

    @Override // com.ali.user.open.core.webview.BaseWebViewActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        try {
            if (AliMemberSDK.getService(StatusBarService.class) != null) {
                ((StatusBarService) AliMemberSDK.getService(StatusBarService.class)).setStatusBar(this);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.onCreate(bundle);
        if (this.memberWebView == null || this.memberWebView.getWebView() == null) {
            finish();
        } else if (ConfigManager.getInstance().getWebViewOption() != WebViewOption.SYSTEM || this.memberWebView == null) {
        } else {
            this.memberWebView.addBridgeObject(UccSystemJSBridge.ALU_SYSTEM_JSBRIDGE, new UccSystemJSBridge());
        }
    }

    @Override // com.ali.user.open.core.webview.BaseWebViewActivity
    public String pipOrange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e894174", new Object[]{this});
        }
        try {
            return OrangeConfig.getInstance().getConfig("login4android", "progress", "true");
        } catch (Throwable unused) {
            return "true";
        }
    }

    @Override // com.ali.user.open.core.webview.BaseWebViewActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        initParams(intent);
    }

    @Override // com.ali.user.open.core.webview.BaseWebViewActivity
    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
            return;
        }
        String str2 = this.TAG;
        Log.e(str2, "load url:" + str);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        if (this.memberWebView != null) {
            this.memberWebView.loadUrl(str);
        }
        Bundle serialBundle = serialBundle(Uri.parse(str).getQuery());
        if (serialBundle == null) {
            return;
        }
        this.mH5RequestToken = serialBundle.getString(ParamsConstants.UrlConstant.H5_REQUEST_TOKEN);
    }

    @Override // com.ali.user.open.core.webview.BaseWebViewActivity
    public void initParams(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a658fa", new Object[]{this, intent});
            return;
        }
        super.initParams(intent);
        if (intent == null) {
            return;
        }
        this.mUccParams = (UccParams) JSON.parseObject(intent.getStringExtra(UccConstants.PARAM_UCC_PARAMS), UccParams.class);
        this.mNeedSession = intent.getStringExtra("needSession");
        if (!StringUtils.isEmpty(this.mNeedSession)) {
            this.isReassignNeedSession = true;
        }
        this.mNeedCookieOnly = intent.getStringExtra(ParamsConstants.Key.PARAM_NEED_LOCAL_COOKIE_ONLY);
        this.token = intent.getStringExtra("token");
        this.scene = intent.getStringExtra("scene");
        this.mNeedToast = intent.getStringExtra("needToast");
        String stringExtra = intent.getStringExtra("params");
        if (!StringUtils.isEmpty(stringExtra)) {
            this.mParams = Utils.convertJsonStrToMap(stringExtra);
        }
        this.mNeedLocalSession = intent.getStringExtra(ParamsConstants.Key.PARAM_NEED_LOCAL_SESSION);
        this.mRequestToken = intent.getStringExtra("requestToken");
    }

    public void hideTitleBar(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b9e5dc3", new Object[]{this, uri});
        } else if (uri == null) {
        } else {
            String queryParameter = uri.getQueryParameter("hideTitleBar");
            if (getSupportActionBar() == null || !StringUtils.equals(queryParameter, "true")) {
                return;
            }
            getSupportActionBar().e();
        }
    }

    public void showTitleBar(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd7dde8", new Object[]{this, uri});
        } else if (uri == null) {
        } else {
            String queryParameter = uri.getQueryParameter("hideTitleBar");
            if (getSupportActionBar() == null || StringUtils.equals(queryParameter, "true")) {
                return;
            }
            getSupportActionBar().d();
        }
    }

    private boolean overrideCallback(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb98f413", new Object[]{this, uri})).booleanValue();
        }
        Bundle serialBundle = serialBundle(uri.getQuery());
        if (serialBundle == null) {
            serialBundle = new Bundle();
        }
        checkUccParam(serialBundle);
        String string = serialBundle.getString("action");
        if (StringUtils.isEmpty(string) || StringUtils.equals("quit", string)) {
            UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_Cancel", this.mUccParams, new HashMap());
            finish();
            UccCallback uccCallback = (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE));
            if (uccCallback == null || !StringUtils.equals("true", serialBundle.getString("isSuc"))) {
                return true;
            }
            uccCallback.onSuccess(this.mUccParams.bindSite, null);
            CallbackManager.unregisterCallback(UccConstants.UCC_H5_CALLBACK_TYPE);
            return true;
        } else if (StringUtils.equals("close", string)) {
            UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_Cancel", this.mUccParams, new HashMap());
            UccCallback uccCallback2 = (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE));
            finish();
            if (uccCallback2 != null) {
                uccCallback2.onFail(this.mUccParams.bindSite, 1403, getResources().getString(R.string.member_sdk_cancel));
                CallbackManager.unregisterCallback(UccConstants.UCC_H5_CALLBACK_TYPE);
            }
            return true;
        } else if (StringUtils.equals(a.ATOM_EXT_bind, string)) {
            String string2 = serialBundle.getString("requestToken");
            String string3 = serialBundle.getString("bindUserToken");
            String string4 = serialBundle.getString("type");
            if (this.mUccParams == null) {
                this.mUccParams = new UccParams();
                this.mUccParams.traceId = Utils.generateTraceId("h5");
            }
            if (ApiConstants.ApiField.BIND_NEED_UPGRADE.equals(string4)) {
                this.mUccParams.needUpgrade = "true";
            }
            if (!StringUtils.isEmpty(serialBundle.getString("scene"))) {
                this.mUccParams.scene = serialBundle.getString("scene");
            }
            UccBindPresenter.getInstance().bindAfterRecommend(this, string2, this.mUccParams, string3, this.mNeedToast, this.mParams, (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE)));
            return true;
        } else if (StringUtils.equals("bindAfterIdentify", string)) {
            String string5 = serialBundle.getString(ParamsConstants.UrlConstant.H5_REQUEST_TOKEN);
            String string6 = serialBundle.getString("havana_iv_token");
            String string7 = serialBundle.getString("userBindToken");
            addSessionParam(serialBundle);
            UccBindPresenter.getInstance().bindIdentify(this, string5, this.mUccParams, string6, string7, this.mNeedToast, this.mParams, (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE)));
            return true;
        } else if (StringUtils.equals("continueLogin", string)) {
            String query = uri.getQuery();
            addSessionParam(serialBundle);
            UccTrustLoginPresenter.getInstance().tokenLogin(this, this.mUccParams, this.scene, this.token, query, this.mParams, (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE)));
            return true;
        } else if (StringUtils.equals(ApiConstants.ApiField.TRUST_LOGIN, string)) {
            String string8 = serialBundle.getString("token");
            String string9 = serialBundle.getString("scene");
            String query2 = uri.getQuery();
            if (StringUtils.isEmpty(string9)) {
                string9 = this.scene;
            }
            UccTrustLoginPresenter.getInstance().tokenLogin(this, this.mUccParams, string9, string8, query2, null, (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE)));
            return true;
        } else if (StringUtils.equals("login", string)) {
            Map<String, String> generateMap = generateMap(serialBundle);
            generateMap.put("needSession", "1");
            UccBindPresenter.getInstance().bindByRequestToken(this, this.mUccParams, serialBundle.getString(ParamsConstants.UrlConstant.H5_REQUEST_TOKEN), serialBundle.getString("userToken"), serialBundle.getString(WebConstant.WEB_LOGIN_TOKEN_TYPE), generateMap, (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE)));
            return true;
        } else if (StringUtils.equals("taobao_auth_token", string)) {
            addSessionParam(serialBundle);
            Map<String, String> generateMap2 = generateMap(serialBundle);
            if (ApiConstants.ApiName.BIND_BY_REQUEST_TOKEN.equals(serialBundle.getString("api"))) {
                Map<String, String> map = this.mParams;
                if (map != null && StringUtils.equals(map.get("scene"), ParamsConstants.UrlConstant.NEW_YOUKU_UPGRADE)) {
                    generateMap2.put("needSession", "1");
                }
                this.mUccParams.topAuthCode = serialBundle.getString("top_auth_code");
                this.mUccParams.requestToken = serialBundle.getString(ParamsConstants.UrlConstant.H5_REQUEST_TOKEN);
                UccBindPresenter.getInstance().bindByRequestToken(this, this.mUccParams, serialBundle.getString(ParamsConstants.UrlConstant.H5_REQUEST_TOKEN), serialBundle.getString("top_auth_code"), "oauthcode", generateMap2, (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE)));
            } else {
                Map<String, String> map2 = this.mParams;
                if (map2 != null && StringUtils.equals(map2.get("scene"), ParamsConstants.UrlConstant.NEW_YOUKU_UPGRADE)) {
                    generateMap2.put("needSession", "1");
                    UccBindPresenter.getInstance().getUserInfo(this, this.mUccParams, serialBundle.getString("top_auth_code"), "oauthcode", "h5", generateMap2, (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE)));
                } else {
                    generateMap2.put("needSession", this.mNeedSession);
                    generateMap2.put(ParamsConstants.Key.PARAM_NEED_LOCAL_SESSION, this.mNeedLocalSession);
                    generateMap2.put("requestToken", this.mRequestToken);
                    Map<String, String> map3 = this.mParams;
                    if (map3 != null) {
                        generateMap2.put(ParamsConstants.Key.PARAM_NEED_LOCAL_COOKIE_ONLY, map3.get(ParamsConstants.Key.PARAM_NEED_LOCAL_COOKIE_ONLY));
                    }
                    UccBindPresenter.getInstance().bindByNativeAuth(this, this.mUccParams, serialBundle.getString("top_auth_code"), "oauthcode", generateMap2, (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE)));
                }
            }
            return true;
        } else if (StringUtils.equals("registerSuc", string) || StringUtils.equals("afterBindMobile", string)) {
            if (StringUtils.equals("registerSuc", string)) {
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_registerSuc", this.mUccParams, null);
            }
            String string10 = serialBundle.getString("message");
            if (StringUtils.equals(this.mNeedSession, "1")) {
                UccBindPresenter.getInstance().tokenLoginAfterBind(this, this.mUccParams, serialBundle.getString("trustToken"), string, this.mNeedToast, string10, this.mParams, (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE)));
                return true;
            }
            if (!StringUtils.isEmpty(string10) && StringUtils.equals(this.mNeedToast, "1")) {
                ToastUtil.showToast(getApplicationContext(), string10, 0);
            }
            UccCallback uccCallback3 = (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE));
            if (uccCallback3 != null) {
                uccCallback3.onSuccess(this.mUccParams.bindSite, null);
                CallbackManager.unregisterCallback(UccConstants.UCC_H5_CALLBACK_TYPE);
            }
            finish();
            return true;
        } else if (StringUtils.equals("UCC_ContinueLogin", string)) {
            UTHitUtils.send(UTHitConstants.PageUccBind, "UccBindWithIbb_H5Skip", this.mUccParams, null);
            String string11 = serialBundle.getString("requestToken");
            String string12 = serialBundle.getString("userToken");
            String string13 = serialBundle.getString(ApiConstants.ApiField.USER_ACTION);
            if (StringUtils.isEmpty(string11)) {
                finish();
            } else {
                Map<String, String> generateMap3 = generateMap(serialBundle);
                generateMap3.put("needSession", "1");
                generateMap3.put(ParamsConstants.Key.PARAM_NEED_LOCAL_SESSION, this.mNeedLocalSession);
                UccParams uccParams = this.mUccParams;
                uccParams.requestToken = string11;
                uccParams.userToken = string12;
                uccParams.userAction = string13;
                UccBindPresenter.getInstance().skipUpgrade(this, this.mUccParams, "h5", generateMap3, (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE)));
            }
            finish();
            return true;
        } else if (StringUtils.equals("skip_bind", string)) {
            UTHitUtils.send(UTHitConstants.PageUccBind, "UccBindWithIbb_H5Skip", this.mUccParams, null);
            UccCallback uccCallback4 = (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE));
            if (uccCallback4 != null) {
                uccCallback4.onFail(this.mUccParams.bindSite, 1011, "跳过绑定");
                CallbackManager.unregisterCallback(UccConstants.UCC_H5_CALLBACK_TYPE);
            }
            finish();
            return true;
        } else if (StringUtils.equals("UCC_Upgrade", string)) {
            if (this.mUccParams == null) {
                this.mUccParams = new UccParams();
                this.mUccParams.traceId = Utils.generateTraceId("h5");
            }
            String string14 = serialBundle.getString("bindSite");
            String string15 = serialBundle.getString("requestToken");
            String string16 = serialBundle.getString(ParamsConstants.Key.PARAM_SCENE_CODE);
            String string17 = serialBundle.getString("scene");
            String string18 = serialBundle.getString(ParamsConstants.Key.PARAM_H5ONLY);
            String string19 = serialBundle.getString("h5Url");
            Map<String, String> generateMap4 = generateMap(serialBundle);
            if (this.isReassignNeedSession && !StringUtils.isEmpty(this.mNeedSession)) {
                generateMap4.put("needSession", this.mNeedSession);
            } else {
                generateMap4.put("needSession", "1");
            }
            generateMap4.put(ParamsConstants.Key.PARAM_NEED_LOCAL_SESSION, this.mNeedLocalSession);
            if (!StringUtils.isEmpty(string16)) {
                generateMap4.put(ParamsConstants.Key.PARAM_SCENE_CODE, string16);
            }
            String string20 = serialBundle.getString("type");
            if ("rpc".equals(string20)) {
                UccTrustLoginPresenter.getInstance().upgradeLogin(this, this.mUccParams, string14, string17, string15, "h5", generateMap4, (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE)));
                return true;
            } else if ("launchTao".equals(string20)) {
                String string21 = serialBundle.getString("userToken");
                if ("true".equals(string18)) {
                    generateMap4.put(ParamsConstants.Key.PARAM_H5ONLY, "1");
                }
                if (!StringUtils.isEmpty(string19)) {
                    String str = string19 + "&request_token=" + string15;
                    String string22 = serialBundle.getString("env");
                    if (!StringUtils.isEmpty(string22)) {
                        str = str + "&env=" + string22;
                    }
                    String string23 = serialBundle.getString("appEntrance");
                    if (!StringUtils.isEmpty(string23)) {
                        str = str + "&appEntrance=" + string23;
                    }
                    String string24 = serialBundle.getString("needTopToken");
                    if (!StringUtils.isEmpty(string24)) {
                        str = str + "&needTopToken=" + string24;
                    }
                    if (!StringUtils.isEmpty(serialBundle.getString("topTokenAppName"))) {
                        str = str + "&topTokenAppName=" + serialBundle.getString("topTokenAppName");
                    }
                    String string25 = serialBundle.getString("redirectUri");
                    if (!StringUtils.isEmpty(string25)) {
                        str = str + "&redirectUri=" + string25;
                    }
                    generateMap4.put(UccConstants.PARAM_BIND_URL, str);
                }
                generateMap4.put("from", string);
                generateMap4.put("requestToken", string15);
                ((UccService) AliMemberSDK.getService(UccService.class)).bind(this, string21, string14, generateMap4, (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE)));
                return true;
            } else {
                finish();
                return true;
            }
        } else if (StringUtils.equals("agreeAuthorize", string)) {
            finish();
            UccCallback uccCallback5 = (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE));
            if (uccCallback5 == null) {
                return true;
            }
            uccCallback5.onSuccess(this.mUccParams.bindSite, null);
            CallbackManager.unregisterCallback(UccConstants.UCC_H5_CALLBACK_TYPE);
            return true;
        } else if (StringUtils.equals("refuseAuthorize", string)) {
            finish();
            UccCallback uccCallback6 = (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE));
            if (uccCallback6 == null) {
                return true;
            }
            uccCallback6.onFail(this.mUccParams.bindSite, 1201, "");
            CallbackManager.unregisterCallback(UccConstants.UCC_H5_CALLBACK_TYPE);
            return true;
        } else if (!StringUtils.equals("bindAlipayFail", string)) {
            return false;
        } else {
            finish();
            UccCallback uccCallback7 = (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE));
            if (uccCallback7 == null) {
                return true;
            }
            uccCallback7.onFail(this.mUccParams.bindSite, 1007, "");
            CallbackManager.unregisterCallback(UccConstants.UCC_H5_CALLBACK_TYPE);
            return true;
        }
    }

    private void addSessionParam(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be368315", new Object[]{this, bundle});
            return;
        }
        if (this.mParams == null) {
            this.mParams = generateMap(bundle);
        }
        this.mParams.put("needSession", this.mNeedSession);
        this.mParams.put(ParamsConstants.Key.PARAM_NEED_LOCAL_SESSION, this.mNeedLocalSession);
    }

    private void checkUccParam(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c2ecdcd", new Object[]{this, bundle});
            return;
        }
        if (this.mUccParams == null) {
            this.mUccParams = new UccParams();
            this.mUccParams.traceId = Utils.generateTraceId("h5");
        }
        String string = bundle.getString("bindSite");
        String string2 = bundle.getString("userToken");
        if (!StringUtils.isEmpty(string)) {
            this.mUccParams.bindSite = string;
        }
        if (StringUtils.isEmpty(string2)) {
            return;
        }
        this.mUccParams.userToken = string2;
    }

    private Map<String, String> generateMap(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2d5c411b", new Object[]{this, bundle});
        }
        String string = bundle.getString("scene");
        String string2 = bundle.getString("site");
        String string3 = bundle.getString("bindSite");
        HashMap hashMap = new HashMap();
        if (!StringUtils.isEmpty(string2)) {
            hashMap.put("site", string2);
        }
        if (!StringUtils.isEmpty(string3)) {
            hashMap.put("bindSite", string3);
        }
        if (!StringUtils.isEmpty(string)) {
            hashMap.put("scene", string);
        }
        return hashMap;
    }

    @Override // com.ali.user.open.core.webview.BaseWebViewActivity
    public void onBackHistory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922dabd5", new Object[]{this});
        } else if (this.memberWebView != null && this.memberWebView.canGoBack() && (this.memberWebView.getUrl().contains("authorization-notice") || this.memberWebView.getUrl().contains("agreement"))) {
            this.memberWebView.goBack();
        } else {
            UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_Cancel", this.mUccParams, new HashMap());
            UccCallback uccCallback = (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE));
            if (uccCallback != null) {
                if (this.mUccParams == null) {
                    this.mUccParams = new UccParams();
                }
                uccCallback.onFail(this.mUccParams.bindSite, 1403, getResources().getString(R.string.member_sdk_cancel));
                CallbackManager.unregisterCallback(UccConstants.UCC_H5_CALLBACK_TYPE);
            }
            finish();
        }
    }

    @Override // com.ali.user.open.core.webview.BaseWebViewActivity, com.ali.user.open.core.webview.IWebViewClient
    public boolean shouldOverrideUrlLoading(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c40e7661", new Object[]{this, str})).booleanValue();
        }
        String str2 = this.TAG;
        SDKLogger.d(str2, "shouldOverrideUrlLoading url=" + str);
        Uri parse = Uri.parse(str);
        if (checkWebviewBridge(str)) {
            return overrideCallback(parse);
        }
        if (!StringUtils.isEmpty(str) && !str.startsWith("http") && !str.startsWith("https")) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                startActivity(intent);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.memberWebView != null) {
            this.memberWebView.loadUrl(str);
        }
        return true;
    }

    @Override // com.ali.user.open.core.webview.BaseWebViewActivity, com.ali.user.open.core.webview.IWebViewClient
    public void onPageStarted(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f4c9e4", new Object[]{this, str});
            return;
        }
        hideTitleBar(Uri.parse(str));
        String str2 = this.TAG;
        SDKLogger.d(str2, "onPageStarted url=" + str);
    }

    @Override // com.ali.user.open.core.webview.BaseWebViewActivity, com.ali.user.open.core.webview.IWebViewClient
    public void onPageFinished(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509cd631", new Object[]{this, str});
            return;
        }
        String str2 = this.TAG;
        SDKLogger.d(str2, "onPageFinished url=" + str);
        showTitleBar(Uri.parse(str));
    }

    @Override // com.ali.user.open.core.webview.BaseWebViewActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        DialogHelper.getInstance().dismissAlertDialog(this);
        super.onDestroy();
    }
}
