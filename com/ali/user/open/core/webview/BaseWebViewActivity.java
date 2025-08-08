package com.ali.user.open.core.webview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.ali.user.mobile.utils.StringUtil;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.config.WebViewOption;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.model.ResultCode;
import com.ali.user.open.core.service.UserTrackerService;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.CommonUtils;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class BaseWebViewActivity extends AppCompatActivity implements IWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;
    public String CALLBACK = StringUtil.CALLBACK;
    public boolean forceUcWebView;
    public IWebViewProxy memberWebView;

    public static /* synthetic */ Object ipc$super(BaseWebViewActivity baseWebViewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
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

    @Override // com.ali.user.open.core.webview.IWebViewClient
    public void onPageFinished(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509cd631", new Object[]{this, str});
        }
    }

    @Override // com.ali.user.open.core.webview.IWebViewClient
    public void onPageStarted(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f4c9e4", new Object[]{this, str});
        }
    }

    public String pipOrange() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e894174", new Object[]{this}) : "true";
    }

    static {
        kge.a(1887738065);
        kge.a(1009778049);
        TAG = BaseWebViewActivity.class.getSimpleName();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        if ("true".equals(pipOrange()) && Build.VERSION.SDK_INT >= 26) {
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            int height = defaultDisplay.getHeight();
            int width = defaultDisplay.getWidth();
            String str = TAG;
            Log.e(str, "height=" + height + ",width=" + width);
            if (height > width) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                String str2 = TAG;
                Log.e(str2, "height=" + i2 + ",width=" + i);
                float f = displayMetrics.density;
                int i3 = (int) (((float) i) / f);
                int i4 = (int) (((float) i2) / f);
                String str3 = TAG;
                Log.e(str3, "dp width=" + i3 + ",height=" + i4);
                Configuration configuration = getResources().getConfiguration();
                if (getResources().getConfiguration().orientation != 1) {
                    Log.e(TAG, "force portrait");
                    configuration.orientation = 1;
                    configuration.screenHeightDp = i4;
                    configuration.screenWidthDp = i3;
                    onConfigurationChanged(configuration);
                }
            }
        }
        super.onCreate(bundle);
        try {
            initParams(getIntent());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            initViews(bundle);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        IWebViewProxy iWebViewProxy = this.memberWebView;
        if (iWebViewProxy == null || iWebViewProxy.getWebView() == null) {
            SDKLogger.e(TAG, "init webview failed,finish");
            finish();
            return;
        }
        if (KernelContext.applicationContext == null) {
            KernelContext.applicationContext = getApplicationContext();
        }
        if (ConfigManager.getInstance().getWebViewOption() != WebViewOption.SYSTEM || this.memberWebView == null) {
            return;
        }
        if (AliMemberSDK.getService(UserTrackerService.class) != null) {
            ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).skipPage(this);
        }
        this.memberWebView.addBridgeObject("ALBBUserTrackJSBridge", new UserTrackBridge());
        this.memberWebView.addBridgeObject("aluWVJSBridge", new UserInfoBridge());
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        try {
            String stringExtra = intent.getStringExtra("url");
            if (StringUtils.isEmpty(stringExtra) && (data = getIntent().getData()) != null) {
                stringExtra = data.getQueryParameter("url");
                this.forceUcWebView = true;
                SDKLogger.e(TAG, "read url fomr uri:");
            }
            String str = TAG;
            SDKLogger.d(str, "onCreate url=" + stringExtra);
            if (KernelContext.checkServiceValid()) {
                if (!CommonUtils.isNetworkAvailable()) {
                    CommonUtils.toast("member_sdk_network_not_available_message");
                    return;
                }
                try {
                    this.memberWebView.resumeTimers();
                    this.memberWebView.onResume();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                loadUrl(stringExtra);
                return;
            }
            finish();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void initParams(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a658fa", new Object[]{this, intent});
        } else {
            checkWindVaneExist();
        }
    }

    public void initViews(Bundle bundle) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7002b7ef", new Object[]{this, bundle});
            return;
        }
        setContentView(getLayout());
        setActionBar();
        this.memberWebView = createWebView();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ali_user_webview_container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        IWebViewProxy iWebViewProxy = this.memberWebView;
        if (iWebViewProxy != null && iWebViewProxy.getWebView() != null) {
            frameLayout.addView(this.memberWebView.getWebView(), layoutParams);
            String stringExtra = getIntent().getStringExtra("url");
            if (StringUtils.isEmpty(stringExtra) && (data = getIntent().getData()) != null) {
                stringExtra = data.getQueryParameter("url");
                SDKLogger.e(TAG, "read url fomr uri:");
            }
            String str = TAG;
            SDKLogger.d(str, "onCreate url=" + stringExtra);
            if (KernelContext.checkServiceValid() && !StringUtils.isEmpty(stringExtra)) {
                if (!CommonUtils.isNetworkAvailable()) {
                    CommonUtils.toast("member_sdk_network_not_available_message");
                    return;
                }
                try {
                    this.memberWebView.resumeTimers();
                    this.memberWebView.onResume();
                } catch (Exception unused) {
                }
                loadUrl(stringExtra);
                return;
            }
            finish();
            return;
        }
        finish();
    }

    public void setActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef9b2c2", new Object[]{this});
            return;
        }
        AliUccCustomToolbar aliUccCustomToolbar = (AliUccCustomToolbar) findViewById(R.id.ali_user_webview_toolbar);
        setSupportActionBar(aliUccCustomToolbar);
        if (getSupportActionBar() == null) {
            return;
        }
        getSupportActionBar().c(true);
        if (aliUccCustomToolbar == null) {
            return;
        }
        aliUccCustomToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.ali.user.open.core.webview.BaseWebViewActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    BaseWebViewActivity.this.onBackHistory();
                }
            }
        });
    }

    public void loadUrl(String str) {
        IWebViewProxy iWebViewProxy;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || (iWebViewProxy = this.memberWebView) == null) {
        } else {
            iWebViewProxy.loadUrl(str);
        }
    }

    public int getLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("28b929a", new Object[]{this})).intValue() : R.layout.member_sdk_activity_webview;
    }

    public boolean checkWebviewBridge(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80b177cf", new Object[]{this, str})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        StringBuilder sb = new StringBuilder();
        sb.append(parse.getAuthority());
        sb.append(parse.getPath());
        return this.CALLBACK.contains(sb.toString());
    }

    public IWebViewProxy createWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWebViewProxy) ipChange.ipc$dispatch("d6765a09", new Object[]{this});
        }
        if (ConfigManager.getInstance().getWebViewOption() == WebViewOption.UC || this.forceUcWebView) {
            if (checkWindVaneExist()) {
                return new WVUcWebViewProxy(this);
            }
            return new SystemWebViewProxy(this);
        }
        return new SystemWebViewProxy(this);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        IWebViewProxy iWebViewProxy = this.memberWebView;
        if (iWebViewProxy != null && iWebViewProxy.getWebView() != null) {
            ViewGroup viewGroup = (ViewGroup) this.memberWebView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.memberWebView.getWebView());
            }
            this.memberWebView.removeAllViews();
            this.memberWebView.destroy();
            this.memberWebView = null;
        }
        super.onDestroy();
    }

    public void setResult(ResultCode resultCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585729bb", new Object[]{this, resultCode});
        } else {
            onFailure(resultCode);
        }
    }

    public void onFailure(ResultCode resultCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf369af", new Object[]{this, resultCode});
        } else {
            finish();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            onBackHistory();
        }
    }

    public void onBackHistory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922dabd5", new Object[]{this});
            return;
        }
        setResult(ResultCode.USER_CANCEL.code, new Intent());
        finish();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        IWebViewProxy iWebViewProxy = this.memberWebView;
        if (iWebViewProxy == null) {
            return;
        }
        try {
            iWebViewProxy.resumeTimers();
            this.memberWebView.onResume();
        } catch (Exception unused) {
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (AliMemberSDK.getService(UserTrackerService.class) == null) {
            return;
        }
        ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).pageDisAppear(this);
    }

    public boolean checkWindVaneExist() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88bfad30", new Object[]{this})).booleanValue();
        }
        try {
            Class.forName("android.taobao.windvane.WindVaneSDK");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public Bundle serialBundle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("f4537aab", new Object[]{this, str});
        }
        Bundle bundle = null;
        if (str != null && str.length() > 0) {
            String[] split = str.split("&");
            bundle = new Bundle();
            for (String str2 : split) {
                int indexOf = str2.indexOf("=");
                if (indexOf > 0 && indexOf < str2.length() - 1) {
                    bundle.putString(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                }
            }
        }
        return bundle;
    }

    @Override // com.ali.user.open.core.webview.IWebViewClient
    public boolean shouldOverrideUrlLoading(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c40e7661", new Object[]{this, str})).booleanValue();
        }
        loadUrl(str);
        return true;
    }

    @Override // com.ali.user.open.core.webview.IWebViewClient
    public void onReceivedTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("124d59e9", new Object[]{this, str});
        } else if (getSupportActionBar() == null) {
        } else {
            getSupportActionBar().a(str);
        }
    }
}
