package com.ali.user.mobile.webview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.taobao.windvane.export.adapter.ILocalizationService;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.ValueCallback;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.eventbus.EventBus;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.AppMonitorAdapter;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.ui.WebConstant;
import com.ali.user.mobile.utils.BundleUtil;
import com.ali.user.mobile.utils.ResourceUtil;
import com.ali.user.mobile.utils.StringUtil;
import com.ali.user.mobile.verify.impl.VerifyServiceImpl;
import com.ali.user.mobile.verify.model.VerifyParam;
import com.ali.user.mobile.verify.model.VerifyTokenConsumedResponse;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.ui.activity.RPWebViewActivity;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.biz.unifysso.UnifySsoLogin;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginSceneConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.SessionManager;
import com.taobao.taobao.R;
import com.uc.webview.export.JsPromptResult;
import com.uc.webview.export.JsResult;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.UCCore;
import com.ut.mini.UTAnalytics;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import tb.icf;
import tb.kge;

/* loaded from: classes2.dex */
public class WebViewActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_LoginH5";
    public static final String TAG = "login.web";
    public static final String WINDVANECLOSEALL = "aliusersdkwindvane=closeAll";
    public String eventName;
    public RelativeLayout mAPRelativeLayout;
    private String mHelpUrl;
    public String mIVScene;
    public String mLoginId;
    public String mLoginType;
    public String mNativeLoginType;
    public String mOriginalLoginParam;
    public ProgressBar mProgressBar;
    public int mRequestCode;
    public String mSNSTrustLoginToken;
    public String mScene;
    public String mSecurityId;
    public int mSite;
    public String mToken;
    public String mTokenType;
    public String mUrl;
    public String mUserId;
    public LoginWebView mWebView;
    public boolean needCancelBroadcast;
    private LoginParam ssoLoginParam;
    public boolean allowReadTitle = true;
    public boolean isWebviewAlive = true;
    public boolean isLoginPost = false;
    public boolean needCallback = false;
    public boolean skipLogin = false;
    public boolean loadFinishedOnce = false;
    private boolean isShowHelpMenu = false;
    private boolean isShowSkipMenu = false;
    private final int SKIP_MENU_ITEM_ID = 257;

    static {
        kge.a(-1904975382);
    }

    public static /* synthetic */ Object ipc$super(WebViewActivity webViewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1824869760:
                return new Boolean(super.onPrepareOptionsMenu((Menu) objArr[0]));
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public boolean needToolbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a370e010", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void onWebViewReceivedError(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda9cf83", new Object[]{this, new Integer(i), str, str2});
        }
    }

    public static Intent getCallingIntent(Activity activity, UrlParam urlParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("1c554f0d", new Object[]{activity, urlParam});
        }
        Intent intent = new Intent(activity, WebViewActivity.class);
        intent.putExtra(WebConstant.WEBURL, urlParam.url);
        if (urlParam.loginParam != null) {
            intent.putExtra(WebConstant.WEB_NATIVE_LOGIN_TYPE, urlParam.loginParam.nativeLoginType);
            intent.putExtra(WebConstant.WEB_SNS_TRUST_LOGIN_TOKEN, urlParam.loginParam.snsTrustLoginToken);
            intent.putExtra(WebConstant.WEB_LOGIN_TOKEN_TYPE, urlParam.loginParam.tokenType);
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(urlParam.loginParam));
            intent.putExtra(WebConstant.WEB_CANCEL_BROADCAST, urlParam.loginParam.sendLoginFailWhenWebviewCancel);
        }
        intent.putExtra("scene", urlParam.scene);
        intent.putExtra("token", urlParam.token);
        if (urlParam.loginId != null) {
            intent.putExtra(WebConstant.WEB_LOGIN_ID, urlParam.loginId);
        } else if (urlParam.loginParam != null && !TextUtils.isEmpty(urlParam.loginParam.loginId)) {
            intent.putExtra(WebConstant.WEB_LOGIN_ID, urlParam.loginParam.loginId);
        }
        intent.putExtra("site", urlParam.site);
        intent.putExtra(WebConstant.WEB_ALLOW_TITLE, urlParam.needTitle);
        return intent;
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LoginParam loginParam;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        try {
            Intent intent = getIntent();
            this.mToken = intent.getStringExtra("token");
            this.mTokenType = intent.getStringExtra(WebConstant.WEB_LOGIN_TOKEN_TYPE);
            this.mUrl = intent.getStringExtra(WebConstant.WEBURL);
            this.mSecurityId = intent.getStringExtra("securityId");
            this.mLoginId = intent.getStringExtra(WebConstant.WEB_LOGIN_ID);
            this.mScene = intent.getStringExtra("scene");
            if (this.mScene == null) {
                this.mScene = "";
            }
            this.mNativeLoginType = intent.getStringExtra(WebConstant.WEB_NATIVE_LOGIN_TYPE);
            this.mSNSTrustLoginToken = intent.getStringExtra(WebConstant.WEB_SNS_TRUST_LOGIN_TOKEN);
            this.mSite = intent.getIntExtra("site", DataProviderFactory.getDataProvider().getSite());
            this.mTokenType = intent.getStringExtra(WebConstant.WEB_LOGIN_TOKEN_TYPE);
            this.mIVScene = intent.getStringExtra(WebConstant.WEB_IV_SCENE);
            this.mUserId = intent.getStringExtra(WebConstant.WEB_IV_USERID);
            this.eventName = intent.getStringExtra("eventName");
            this.mOriginalLoginParam = intent.getStringExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
            JSONObject parseObject = JSONObject.parseObject(intent.getStringExtra("ext"));
            if (parseObject != null && parseObject.containsKey(WebConstant.SHOW_SKIP_MENU)) {
                this.isShowSkipMenu = ((Boolean) parseObject.get(WebConstant.SHOW_SKIP_MENU)).booleanValue();
            }
            if (parseObject != null && parseObject.containsKey(WebConstant.SKIP_LOGIN)) {
                this.skipLogin = ((Boolean) parseObject.get(WebConstant.SKIP_LOGIN)).booleanValue();
            }
            this.needCancelBroadcast = getIntent().getBooleanExtra(WebConstant.WEB_CANCEL_BROADCAST, false);
            this.mRequestCode = intent.getIntExtra("requestCode", 0);
            this.isLoginPost = intent.getBooleanExtra(WebConstant.WEB_POST_LOGIN, false);
            this.needCallback = intent.getBooleanExtra(WebConstant.WEB_CALLBACK, false);
            if (!TextUtils.isEmpty(this.mOriginalLoginParam) && (loginParam = (LoginParam) JSON.parseObject(this.mOriginalLoginParam, LoginParam.class)) != null) {
                String loginTypeByTraceId = UTConstant.getLoginTypeByTraceId(loginParam.sdkTraceId + "");
                if (TextUtils.isEmpty(loginTypeByTraceId)) {
                    loginTypeByTraceId = UTConstant.getLoginTypeByTokenType(loginParam.tokenType);
                }
                if (!TextUtils.isEmpty(loginTypeByTraceId)) {
                    Properties properties = LoginComponent.getProperties();
                    properties.setProperty("h5_code", loginParam.errorCode + "");
                    properties.setProperty("h5_scene", this.mScene + "");
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_LOGIN_TO_H5_COMMIT, "", loginTypeByTraceId, properties);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        registerPlugin();
        initDataFromIntent();
        super.onCreate(bundle);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        initDataFromIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra(WebConstant.WEBURL);
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = this.mUrl;
            }
            this.mUrl = stringExtra;
        }
        loadUrl(this.mUrl);
    }

    public void registerPlugin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39467d3d", new Object[]{this});
        } else {
            q.a("Verify", (Class<? extends e>) SecurityGuardBridge.class);
        }
    }

    private void initDataFromIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9849fbe7", new Object[]{this});
            return;
        }
        try {
            this.ssoLoginParam = (LoginParam) getIntent().getSerializableExtra("loginParam");
            if (this.ssoLoginParam == null) {
                return;
            }
            this.mOriginalLoginParam = JSON.toJSONString(this.ssoLoginParam);
            String loginTypeByTraceId = UTConstant.getLoginTypeByTraceId(this.ssoLoginParam.sdkTraceId + "");
            if (TextUtils.isEmpty(loginTypeByTraceId)) {
                loginTypeByTraceId = UTConstant.getLoginTypeByTokenType(this.ssoLoginParam.tokenType);
            }
            if (TextUtils.isEmpty(loginTypeByTraceId)) {
                return;
            }
            Properties properties = LoginComponent.getProperties();
            properties.setProperty("h5_code", this.ssoLoginParam.errorCode + "");
            properties.setProperty("h5_scene", this.mScene + "");
            UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_LOGIN_TO_H5_COMMIT, "", loginTypeByTraceId, properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_activity_webview;
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        this.mAPRelativeLayout = (RelativeLayout) findViewById(R.id.aliuser_id_webview);
        this.mProgressBar = (ProgressBar) findViewById(R.id.aliuser_web_progress_bar);
        try {
            createWebView();
            init();
        } catch (Throwable th) {
            th.printStackTrace();
            if (!TextUtils.isEmpty(this.eventName)) {
                HashMap hashMap = new HashMap();
                hashMap.put("result", "cancel");
                EventBus.getDefault().sendEvent(this.eventName, hashMap);
            }
            finish();
        }
    }

    public void createWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a95184", new Object[]{this});
            return;
        }
        this.mWebView = new LoginWebView(this);
        this.mWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (!LoginSwitch.getSwitch("clearFocus", "true")) {
            return;
        }
        this.mWebView.clearFocus();
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mAPRelativeLayout.addView(this.mWebView);
        this.mWebView.init();
        setWebChromClient();
        setWebViewClient();
        loadUrl(this.mUrl);
    }

    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.mWebView.loadUrl(str);
        }
    }

    /* loaded from: classes2.dex */
    public static class LoginWebChromeClient extends WVUCWebChromeClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final String KEY_CONFIRM;
        private static final String KEY_FROM;
        public WeakReference<WebViewActivity> reference;

        public static /* synthetic */ Object ipc$super(LoginWebChromeClient loginWebChromeClient, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2015964955) {
                super.onReceivedTitle((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode != 220271772) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Boolean(super.onJsPrompt((WebView) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (JsPromptResult) objArr[4]));
            }
        }

        public LoginWebChromeClient(WebViewActivity webViewActivity) {
            super(webViewActivity);
            this.reference = new WeakReference<>(webViewActivity);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87d6d0e5", new Object[]{this, webView, str});
                return;
            }
            WebViewActivity webViewActivity = this.reference.get();
            if (webViewActivity != null && webViewActivity.allowReadTitle && webViewActivity.getSupportActionBar() != null) {
                try {
                    webViewActivity.getSupportActionBar().a(str);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            super.onReceivedTitle(webView, str);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d21149c", new Object[]{this, webView, str, str2, str3, jsPromptResult})).booleanValue();
            }
            try {
                return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            } catch (Throwable unused) {
                return false;
            }
        }

        static {
            kge.a(1286056010);
            KEY_FROM = android.taobao.windvane.util.e.c() ? "来自于：" : "From: ";
            KEY_CONFIRM = android.taobao.windvane.util.e.c() ? ILocalizationService.CONFIRM : icf.a.CONTROL_NAME_OK;
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("16bdf0ae", new Object[]{this, webView, str, str2, jsResult})).booleanValue();
            }
            if ((webView.getContext() instanceof Activity) && ((Activity) webView.getContext()).isFinishing()) {
                jsResult.confirm();
                return true;
            }
            try {
                AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper((Activity) webView.getContext(), 16973939));
                String host = Uri.parse(str).getHost();
                builder.setTitle(KEY_FROM + host).setMessage(str2).setPositiveButton(KEY_CONFIRM, new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.webview.WebViewActivity.LoginWebChromeClient.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else {
                            jsResult.confirm();
                        }
                    }
                });
                builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.ali.user.mobile.webview.WebViewActivity.LoginWebChromeClient.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        } else {
                            jsResult.cancel();
                        }
                    }
                });
                AlertDialog create = builder.create();
                create.setCanceledOnTouchOutside(false);
                create.show();
            } catch (Throwable th) {
                m.e(WebViewActivity.TAG, th.getMessage());
                jsResult.confirm();
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static class MyLoginWebViewClient extends LoginWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public WeakReference<WebViewActivity> reference;

        static {
            kge.a(216297921);
        }

        public static /* synthetic */ Object ipc$super(MyLoginWebViewClient myLoginWebViewClient, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode != 1373550412) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            }
        }

        public MyLoginWebViewClient(WebViewActivity webViewActivity) {
            super(webViewActivity);
            this.reference = new WeakReference<>(webViewActivity);
        }

        @Override // com.ali.user.mobile.webview.LoginWebViewClient
        public boolean overrideUrlLoading(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("adbdcb28", new Object[]{this, webView, str})).booleanValue();
            }
            WebViewActivity webViewActivity = this.reference.get();
            if (webViewActivity == null) {
                return false;
            }
            return webViewActivity.overrideUrlLoading(webView, str);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            WebViewActivity webViewActivity = this.reference.get();
            if (webViewActivity != null && webViewActivity.mProgressBar != null) {
                webViewActivity.mProgressBar.setVisibility(8);
                webViewActivity.loadFinishedOnce = true;
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            super.onReceivedError(webView, i, str, str2);
            WebViewActivity webViewActivity = this.reference.get();
            if (webViewActivity == null) {
                return;
            }
            webViewActivity.onWebViewReceivedError(i, str, str2);
        }
    }

    public void setWebViewClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be662f89", new Object[]{this});
            return;
        }
        try {
            this.mWebView.setWebViewClient(new MyLoginWebViewClient(this));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setWebChromClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ef6a8b", new Object[]{this});
        } else {
            this.mWebView.setWebChromeClient(new LoginWebChromeClient(this));
        }
    }

    public boolean overrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adbdcb28", new Object[]{this, webView, str})).booleanValue();
        }
        Log.e(TAG, "overrideUrlLoading: url=" + str);
        Uri parse = Uri.parse(str);
        Bundle serialBundle = BundleUtil.serialBundle(parse.getQuery());
        if (serialBundle == null) {
            serialBundle = new Bundle();
        }
        serialBundle.putInt("site", this.mSite);
        String string = serialBundle.getString("havana_mobile_reg_otherWebView");
        boolean startsWith = str.startsWith(WVUCWebViewClient.SCHEME_SMS);
        String str2 = PAGE_NAME;
        if (startsWith) {
            UserTrackAdapter.sendUT(str2, ModuleConstants.VI_MODULE_NAME_SMS);
            try {
                startActivity(new Intent("android.intent.action.SENDTO", Uri.parse(str)));
            } catch (Exception unused) {
                LoginTLogAdapter.e("WebViewActivity", "sms exception" + str);
            }
            return true;
        } else if (StringUtil.checkWebviewBridge(str)) {
            if (!TextUtils.isEmpty(this.mSecurityId)) {
                serialBundle.putString("securityId", this.mSecurityId);
            }
            String string2 = serialBundle.getString("action");
            String string3 = serialBundle.getString("loginId");
            String string4 = serialBundle.getString("token");
            String string5 = serialBundle.getString("scene");
            String string6 = serialBundle.getString("actionType");
            String string7 = serialBundle.getString("mergedAccount");
            String string8 = serialBundle.getString("h5Url");
            serialBundle.getString("doTokenHere");
            Log.e(TAG, "overrideUrlLoading: h5Url=" + string8);
            if ("open_password_logincheck".equals(string6)) {
                goLogin(string3, serialBundle.getString("havana_iv_token"), null, true, "open_password_logincheck", parse.getQuery(), false, true, false, this.mTokenType);
                return true;
            } else if (TextUtils.isEmpty(string2) || "quit".equals(string2) || "close".equals(string2) || "jumpH5AfterCloseView".equals(string2)) {
                if (this.isLoginPost && LoginPostHandler.sCallback != null) {
                    LoginPostHandler.sCallback.onSuccess();
                    LoginPostHandler.sCallback = null;
                    UserTrackAdapter.sendUT("QuitPostUrl");
                    if ("jumpH5AfterCloseView".equals(string2) && LoginSwitch.getSwitch("login_jumpH5AfterCloseView_enabled", "true")) {
                        UrlParam urlParam = new UrlParam();
                        urlParam.url = string8;
                        ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openWebViewPage(this, urlParam);
                    }
                    finish();
                    return true;
                }
                if (this.needCallback && LoginH5Handler.sCallback != null) {
                    LoginH5Handler.sCallback.onSuccess();
                    LoginH5Handler.sCallback = null;
                    UserTrackAdapter.sendUT("QuitUrl");
                }
                try {
                    if (!TextUtils.isEmpty(this.mOriginalLoginParam)) {
                        LoginParam loginParam = (LoginParam) JSON.parseObject(this.mOriginalLoginParam, LoginParam.class);
                        if (loginParam != null) {
                            Properties properties = new Properties();
                            properties.setProperty("sdkTraceId", loginParam.sdkTraceId + "");
                            if (!TextUtils.isEmpty(loginParam.utPageName)) {
                                str2 = loginParam.utPageName;
                            }
                            UserTrackAdapter.sendUT(str2, UTConstant.CustomEvent.UT_LOGIN_TO_H5_QUIT, properties);
                        }
                    } else {
                        UserTrackAdapter.sendUT(str2, UTConstant.CustomEvent.UT_LOGIN_TO_H5_QUIT);
                    }
                } catch (Exception unused2) {
                }
                if (this.ssoLoginParam == null) {
                    Intent intent = new Intent(LoginResActions.WEB_ACTIVITY_RESULT);
                    intent.putExtras(serialBundle);
                    BroadCastHelper.sendLocalBroadCast(intent);
                    serialBundle.putSerializable("loginParam", this.ssoLoginParam);
                    setResult(258, getIntent().putExtras(serialBundle));
                    finish();
                } else if ("quit".equals(string2)) {
                    finish();
                } else {
                    goLogin("", true, false, this.ssoLoginParam);
                    return true;
                }
                return true;
            } else if ("relogin".equals(string2)) {
                UserTrackAdapter.sendUT(str2, "LoginH5_Relogin");
                serialBundle.putString(ApiConstants.ApiField.H5_QUERY_STRING, parse.getQuery());
                setResult(257, getIntent().putExtras(serialBundle));
                finish();
                return true;
            } else if ("mobile_confirm_login".equals(string2)) {
                UserTrackAdapter.sendUT(str2, "LoginH5_MobileConfirmLogin");
                goLogin((TextUtils.isEmpty(string3) || string3.equals("null")) ? this.mLoginId : string3, string4, this.mLoginType, true, "1014", null, false, true, false, this.mTokenType);
                return true;
            } else if (ApiConstants.ApiField.TRUST_LOGIN.equals(string2)) {
                loginHit(UTConstant.CustomEvent.UT_LOGIN_TO_H5_TRUST_LOGIN, UTConstant.CustomEvent.UT_LOGIN_TO_H5_SUCCESS, ApiConstants.ApiField.TRUST_LOGIN);
                if (this.skipLogin && TextUtils.equals(this.mScene, LoginSceneConstants.SCENE_CHANGEPASSWORD)) {
                    Intent intent2 = new Intent(LoginResActions.WEB_ACTIVITY_RESULT);
                    Bundle bundle = new Bundle();
                    bundle.putString("bizType", LoginSceneConstants.SCENE_CHANGEPASSWORD);
                    bundle.putString("isSuc", "true");
                    intent2.putExtras(bundle);
                    BroadCastHelper.sendLocalBroadCast(intent2);
                    finish();
                    return true;
                }
                String str3 = (TextUtils.isEmpty(string3) || string3.equals("null")) ? this.mLoginId : string3;
                String str4 = TextUtils.isEmpty(string5) ? this.mScene : string5;
                if ("true".equals(string7)) {
                    BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_ACCOUNT_MERGERED_SUCCESS);
                    this.mTokenType = TokenType.MERGE_ACCOUNT;
                } else {
                    BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_FOUND_PASSWORD_SUCCESS);
                }
                goLogin(str3, string4, this.mLoginType, true, true, str4, null, false, true, false, this.mTokenType);
                return true;
            } else if (TextUtils.equals("continueLogin", string2)) {
                loginHit(UTConstant.CustomEvent.UT_LOGIN_TO_H5_CONTINUE_LOGIN, UTConstant.CustomEvent.UT_LOGIN_TO_H5_SUCCESS, "continueLogin");
                goLogin(this.mLoginId, this.mToken, this.mLoginType, true, true, this.mScene, parse.getQuery(), false, true, false, this.mTokenType);
                return true;
            } else if (TextUtils.equals("passIVToken", string2)) {
                UserTrackAdapter.sendUT(str2, "LoginH5_passIVToken");
                String string9 = serialBundle.getString("havana_iv_token");
                HashMap hashMap = new HashMap();
                hashMap.put("token", string9);
                hashMap.put("scene", string5);
                BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_SUCCESS, false, 0, "", (Map<String, String>) hashMap, "");
                finish();
                return true;
            } else if (TextUtils.equals("consumeIVToken", string2)) {
                VerifyParam verifyParam = new VerifyParam();
                verifyParam.userId = this.mUserId;
                verifyParam.actionType = this.mIVScene;
                verifyParam.ivToken = serialBundle.getString("havana_iv_token");
                verifyParam.fromSite = DataProviderFactory.getDataProvider().getSite();
                goConsumeIV(verifyParam);
                return true;
            } else if (TextUtils.equals("testAccountSso", string2)) {
                UnifySsoLogin.tokenLogin(DataProviderFactory.getDataProvider().getSite(), string4, SessionManager.getInstance(DataProviderFactory.getApplicationContext()));
                finish();
                return true;
            } else if (TextUtils.equals("unityTrustLogin", string2)) {
                loginHit(UTConstant.CustomEvent.UT_LOGIN_TO_H5_CONTINUE_LOGIN, UTConstant.CustomEvent.UT_LOGIN_TO_H5_SUCCESS, "unityTrustLogin");
                UnifySsoLogin.tokenLogin(DataProviderFactory.getDataProvider().getSite(), string4, SessionManager.getInstance(DataProviderFactory.getApplicationContext()));
                finish();
                return true;
            } else if ("loginAfterRegister".equals(string2)) {
                AppMonitorAdapter.commitSuccess("Page_Member_Register", "Register_Result_AutoLogin");
                finish();
                goLogin(string3, serialBundle.getString("token"), "", true, "1012", null, true, false, false, UTConstant.CustomEvent.UT_TYPE_SMS_LOGIN_TO_REG);
                return true;
            } else if ("h5_fingerprint_open".equals(string2)) {
                return sendTokenBack(serialBundle.getString("havana_iv_token"));
            } else {
                if ("jumpToLoginPage".equals(string2)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, true);
                    bundle2.putBoolean(LoginConstant.FORCE_NORMAL_MODE, true);
                    ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openLoginPage(DataProviderFactory.getApplicationContext(), ApiReferer.generateApiReferer(), bundle2);
                    return true;
                } else if (!"switchAccount".equals(string2)) {
                    return false;
                } else {
                    Bundle bundle3 = new Bundle();
                    bundle3.putBoolean(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, true);
                    bundle3.putBoolean(LoginConstant.FORCE_NORMAL_MODE, true);
                    bundle3.putString(UIBaseConstants.LoginPage.PAGE_LOGIN_TYPE, UIBaseConstants.LoginPage.PAGE_RECOMMEND_LOGIN);
                    ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openLoginPage(DataProviderFactory.getApplicationContext(), ApiReferer.generateApiReferer(), bundle3);
                    finish();
                    return true;
                }
            }
        } else if (string != null && "true".equals(string)) {
            Intent intent3 = new Intent();
            intent3.setClass(this, HtmlActivity.class);
            intent3.putExtra(WebConstant.WEBURL, str);
            startActivity(intent3);
            return true;
        } else if (!str.contains(WINDVANECLOSEALL)) {
            return false;
        } else {
            finish();
            return true;
        }
    }

    public boolean sendTokenBack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83e9206d", new Object[]{this, str})).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(this.eventName)) {
                HashMap hashMap = new HashMap();
                hashMap.put("token", str);
                hashMap.put("result", "success");
                EventBus.getDefault().sendEvent(this.eventName, hashMap);
            }
            finish();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return true;
    }

    private void loginHit(String str, String str2, String str3) {
        LoginParam loginParam;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac88ca0f", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            if (TextUtils.isEmpty(this.mOriginalLoginParam) || (loginParam = (LoginParam) JSON.parseObject(this.mOriginalLoginParam, LoginParam.class)) == null) {
                return;
            }
            Properties properties = new Properties();
            properties.setProperty("sdkTraceId", loginParam.sdkTraceId + "");
            UserTrackAdapter.sendUT(TextUtils.isEmpty(loginParam.utPageName) ? PAGE_NAME : loginParam.utPageName, str, properties);
            String loginTypeByTraceId = UTConstant.getLoginTypeByTraceId(loginParam.sdkTraceId + "");
            if (TextUtils.isEmpty(loginTypeByTraceId)) {
                loginTypeByTraceId = UTConstant.getLoginTypeByTokenType(loginParam.tokenType);
            }
            if (TextUtils.isEmpty(loginTypeByTraceId)) {
                return;
            }
            Properties properties2 = LoginComponent.getProperties();
            properties2.setProperty("scene", str3 + "");
            properties2.setProperty("h5_code", loginParam.errorCode + "");
            properties2.setProperty("h5_scene", this.mScene + "");
            UserTrackAdapter.sendExtendUT(str2, "", loginTypeByTraceId, properties2);
        } catch (Exception unused) {
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        if (i2 == 720) {
            loadUrl(intent.getStringExtra("windvane"));
        } else if (i2 == 721) {
            finish();
        } else {
            LoginWebView loginWebView = this.mWebView;
            if (loginWebView != null) {
                loginWebView.onActivityResult(i, i2, intent);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void cancleOperation() {
        LoginParam loginParam;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22aa8a82", new Object[]{this});
        } else if (onPanelKeyDown()) {
        } else {
            setResult(0);
            sendCancelBroadcast();
            if (!TextUtils.isEmpty(this.eventName)) {
                HashMap hashMap = new HashMap();
                hashMap.put("result", "cancel");
                EventBus.getDefault().sendEvent(this.eventName, hashMap);
            }
            if (!TextUtils.isEmpty(this.mOriginalLoginParam) && (loginParam = (LoginParam) JSON.parseObject(this.mOriginalLoginParam, LoginParam.class)) != null) {
                String loginTypeByTraceId = UTConstant.getLoginTypeByTraceId(loginParam.sdkTraceId + "");
                if (TextUtils.isEmpty(loginTypeByTraceId)) {
                    loginTypeByTraceId = UTConstant.getLoginTypeByTokenType(loginParam.tokenType);
                }
                if (!TextUtils.isEmpty(loginTypeByTraceId)) {
                    Properties properties = LoginComponent.getProperties(loginParam);
                    UserTrackAdapter.sendUT(TextUtils.isEmpty(loginParam.utPageName) ? PAGE_NAME : loginParam.utPageName, UTConstant.CustomEvent.UT_SINGLE_LOGIN_CANCEL, "", loginTypeByTraceId, properties);
                    properties.setProperty("h5_code", loginParam.errorCode + "");
                    properties.setProperty("h5_scene", this.mScene + "");
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_LOGIN_TO_H5_CANCEL, "", loginTypeByTraceId, properties);
                }
            }
            if (this.isLoginPost && LoginPostHandler.sCallback != null) {
                LoginPostHandler.sCallback.onSuccess();
                LoginPostHandler.sCallback = null;
                UserTrackAdapter.sendUT("UserCancelPostUrl");
            } else if (this.needCallback && LoginH5Handler.sCallback != null) {
                LoginH5Handler.sCallback.onSuccess();
                LoginH5Handler.sCallback = null;
                UserTrackAdapter.sendUT("UserCancelUrl");
            }
            finish();
        }
    }

    public void sendCancelBroadcast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330477c6", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.mIVScene)) {
            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_FAIL, false, -5, LoginConstant.FETCH_IV_FAIL_CANCEL, "");
        } else {
            Intent intent = new Intent(LoginResActions.WEB_ACTIVITY_CANCEL);
            intent.putExtra(LoginConstants.H5_SEND_CANCEL_BROADCAST, this.needCancelBroadcast);
            BroadCastHelper.sendLocalBroadCast(intent);
        }
    }

    public boolean onPanelKeyDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41116307", new Object[]{this})).booleanValue();
        }
        if (this.mWebView == null) {
            return false;
        }
        if (this.isHookNativeBack && !this.isHookNativeBackByJs) {
            this.mWebView.evaluateJavascript(RPWebViewActivity.j, new ValueCallback<String>() { // from class: com.ali.user.mobile.webview.WebViewActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                    } else if (WebViewActivity.this.mWebView == null) {
                    } else {
                        if (!TextUtils.isEmpty(str)) {
                            z = !"false".equals(str.replace("\"", "").replace("'", ""));
                        }
                        if (z) {
                            WebViewActivity.this.mWebView.getWVCallBackContext().fireEvent(RPWebViewActivity.l, "{}");
                            return;
                        }
                        try {
                            Runtime.getRuntime().exec("input keyevent 4");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        WebViewActivity.this.isHookNativeBackByJs = true;
                    }
                }
            });
            return true;
        }
        this.isHookNativeBackByJs = false;
        this.mWebView.getWVCallBackContext().fireEvent("WV.Event.Key.Back", "{}");
        return false;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            cancleOperation();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            cancleOperation();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.isWebviewAlive) {
            try {
                this.mAPRelativeLayout.removeView(this.mWebView);
                this.mWebView.removeAllViews();
                this.mWebView.setVisibility(8);
                this.mWebView.destroy();
            } finally {
                try {
                } finally {
                }
            }
        }
        if (LoginSwitch.getSwitch("reset_in_destroy", "false")) {
            LoginStatus.resetLoginFlag();
        }
        q.b("Verify");
        super.onDestroy();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
        LoginWebView loginWebView = this.mWebView;
        if (loginWebView != null) {
            loginWebView.onPause();
        }
        super.onPause();
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, PAGE_NAME);
        LoginWebView loginWebView = this.mWebView;
        if (loginWebView != null) {
            loginWebView.onResume();
        }
        super.onResume();
    }

    public void goLogin(String str, String str2, String str3, boolean z, String str4, String str5, boolean z2, boolean z3, boolean z4, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197e27fc", new Object[]{this, str, str2, str3, new Boolean(z), str4, str5, new Boolean(z2), new Boolean(z3), new Boolean(z4), str6});
        } else {
            goLogin(str2, false, z, z2, getLoginParam(str, str2, str3, str4, str5, z2, z3, str6));
        }
    }

    public void goLogin(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, boolean z3, boolean z4, boolean z5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fbc304", new Object[]{this, str, str2, str3, new Boolean(z), new Boolean(z2), str4, str5, new Boolean(z3), new Boolean(z4), new Boolean(z5), str6});
        } else {
            goLogin(str2, z, z2, z3, getLoginParam(str, str2, str3, str4, str5, z3, z4, str6));
        }
    }

    public void goLogin(String str, boolean z, boolean z2, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb8d14f", new Object[]{this, str, new Boolean(z), new Boolean(z2), loginParam});
        } else {
            goLogin(str, false, z, z2, loginParam);
        }
    }

    public void goLogin(String str, boolean z, final boolean z2, boolean z3, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4d5bff", new Object[]{this, str, new Boolean(z), new Boolean(z2), new Boolean(z3), loginParam});
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.mOriginalLoginParam)) {
                LoginParam loginParam2 = (LoginParam) JSON.parseObject(this.mOriginalLoginParam, LoginParam.class);
                loginParam.utPageName = loginParam2.utPageName;
                loginParam.loginSourceType = loginParam2.loginSourceType;
                loginParam.sdkTraceId = loginParam2.sdkTraceId;
                loginParam.source = loginParam2.source;
                String str2 = loginParam2.sdkTraceId + "";
                if (!TextUtils.isEmpty(str) && TextUtils.equals(LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, UTConstant.getLoginTypeByTraceId(str2))) {
                    UserTrackAdapter.sendUT(loginParam.utPageName, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, LoginComponent.getProperties(loginParam2));
                }
            }
            if (!TextUtils.isEmpty(this.eventName)) {
                HashMap hashMap = new HashMap();
                hashMap.put(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
                hashMap.put("result", "success");
                EventBus.getDefault().sendEvent(this.eventName, hashMap);
                finish();
            } else if (z && LoginSwitch.getSwitch("loginInWebActivity", "true")) {
                LoginApi.tokenLogin(loginParam, null, null, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.webview.WebViewActivity.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.callback.LoginTasksCallback
                    public void onCancel() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                        }
                    }

                    @Override // com.ali.user.mobile.callback.LoginTasksCallback
                    public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                        } else if (!z2) {
                        } else {
                            WebViewActivity.this.finish();
                        }
                    }

                    @Override // com.ali.user.mobile.callback.LoginTasksCallback
                    public void onFail(LoginException<LoginReturnData> loginException) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                        } else if (loginException == null) {
                        } else {
                            String msg = loginException.getMsg();
                            if (TextUtils.isEmpty(msg)) {
                                msg = ResourceUtil.getNetworkError();
                            }
                            WebViewActivity.this.toast(msg, 0);
                        }
                    }
                });
            } else {
                goFistLoginPage(this, z2, z3, loginParam);
            }
        } catch (Exception unused) {
        }
    }

    public static void goFistLoginPage(Activity activity, boolean z, boolean z2, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8036842", new Object[]{activity, new Boolean(z), new Boolean(z2), loginParam});
        } else if (activity == null) {
        } else {
            Class<?> cls = UserLoginActivity.class;
            if (AliUserLogin.mAppreanceExtentions != null && AliUserLogin.mAppreanceExtentions.getUserLoginActivity() != null) {
                cls = AliUserLogin.mAppreanceExtentions.getUserLoginActivity();
            }
            Intent intent = new Intent(activity, cls);
            intent.putExtra(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, true);
            intent.putExtra(LoginConstant.LAUCNH_MOBILE_LOGIN_FRAGMENT_LABEL, true);
            intent.putExtra(UIBaseConstants.UT_FROM_REGIST_KEY, z2);
            if (loginParam != null) {
                intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
            }
            intent.putExtra(LoginConstant.FORCE_HIDE_ALL, true);
            if (z) {
                intent.addFlags(67108864);
                intent.addFlags(UCCore.VERIFY_POLICY_PAK_QUICK);
                activity.finish();
            }
            intent.putExtra("check", true);
            intent.putExtra(LoginConstant.FORCE_NORMAL_MODE, true);
            activity.startActivity(intent);
        }
    }

    private LoginParam getLoginParam(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginParam) ipChange.ipc$dispatch("1147d436", new Object[]{this, str, str2, str3, str4, str5, new Boolean(z), new Boolean(z2), str6});
        }
        LoginParam loginParam = new LoginParam();
        if (str != null && !str.equals("null")) {
            loginParam.loginId = str;
        }
        loginParam.h5QueryString = str5;
        loginParam.isFromRegister = z;
        loginParam.isFoundPassword = z2;
        loginParam.site = this.mSite;
        if (str2 != null) {
            loginParam.token = str2;
            loginParam.scene = str4;
            loginParam.tokenType = str6;
        }
        loginParam.snsTrustLoginToken = this.mSNSTrustLoginToken;
        loginParam.nativeLoginType = this.mNativeLoginType;
        return loginParam;
    }

    public void goConsumeIV(final VerifyParam verifyParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cb17f7", new Object[]{this, verifyParam});
        } else {
            new CoordinatorWrapper().execute(new AsyncTask<Object, Void, VerifyTokenConsumedResponse>() { // from class: com.ali.user.mobile.webview.WebViewActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.AsyncTask
                /* renamed from: doInBackground */
                public VerifyTokenConsumedResponse mo113doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (VerifyTokenConsumedResponse) ipChange2.ipc$dispatch("8fb5b084", new Object[]{this, objArr});
                    }
                    try {
                        return VerifyServiceImpl.getInstance().goNonLoginConsume(verifyParam);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }

                @Override // android.os.AsyncTask
                public void onPostExecute(VerifyTokenConsumedResponse verifyTokenConsumedResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("534dc7f7", new Object[]{this, verifyTokenConsumedResponse});
                    } else if (verifyTokenConsumedResponse == null) {
                        BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_FAIL, false, -1, "RET_NULL", "");
                        WebViewActivity.this.finish();
                    } else if (verifyTokenConsumedResponse.code != 3000) {
                        BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_FAIL, false, verifyTokenConsumedResponse.code, verifyTokenConsumedResponse.message, "");
                        WebViewActivity.this.finish();
                    } else {
                        BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_SUCCESS);
                        WebViewActivity.this.finish();
                    }
                }
            }, new Object[0]);
        }
    }

    public void switchHelpMenu(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17f399a3", new Object[]{this, new Boolean(z), str});
            return;
        }
        this.mHelpUrl = str;
        this.isShowHelpMenu = z;
        invalidateOptionsMenu();
    }

    public void switchSkipMenu(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2858f39b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isShowSkipMenu = z;
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        menu.clear();
        getMenuInflater().inflate(R.menu.aliuser_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("933ab280", new Object[]{this, menu})).booleanValue();
        }
        if (menu != null && menu.findItem(R.id.aliuser_menu_item_more) != null && menu.findItem(R.id.aliuser_menu_item_help) != null) {
            menu.findItem(R.id.aliuser_menu_item_more).setVisible(false);
            if (this.isShowHelpMenu && !TextUtils.isEmpty(this.mHelpUrl)) {
                menu.findItem(R.id.aliuser_menu_item_help).setVisible(true);
            } else {
                menu.findItem(R.id.aliuser_menu_item_help).setVisible(false);
            }
            if (this.isShowSkipMenu) {
                if (menu.findItem(257) == null) {
                    menu.add(0, 257, 0, R.string.aliuser_skip).setVisible(true).setShowAsAction(1);
                }
            } else if (menu.findItem(257) != null) {
                menu.removeItem(257);
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.aliuser_menu_item_help) {
            UrlParam urlParam = new UrlParam();
            urlParam.scene = "";
            urlParam.url = this.mHelpUrl;
            urlParam.site = DataProviderFactory.getDataProvider().getSite();
            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openWebViewPage(this, urlParam);
        } else if (itemId == 257) {
            BroadCastHelper.sendBroadcast(LoginAction.WEB_ACTIVITY_SKIP);
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
