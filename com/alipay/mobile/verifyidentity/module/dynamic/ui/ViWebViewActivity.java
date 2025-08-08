package com.alipay.mobile.verifyidentity.module.dynamic.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.ui.APTitleBar;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.uc.webview.export.media.MessageID;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ViWebViewActivity extends BaseVerifyActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_NAME_VI_WEB_VIEW_EXIT = "ACTION_VI_WEB_VIEW_EXIT";
    public static final String KEY_DO_VERIFY = "doVerify";

    /* renamed from: a  reason: collision with root package name */
    private WebView f5892a;
    private APTitleBar b;
    private BroadcastReceiver c;
    private String d;

    public static /* synthetic */ Object ipc$super(ViWebViewActivity viWebViewActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
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

    public static /* synthetic */ void access$000(ViWebViewActivity viWebViewActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6730739", new Object[]{viWebViewActivity, new Boolean(z)});
        } else {
            viWebViewActivity.a(z);
        }
    }

    public static /* synthetic */ String access$100(ViWebViewActivity viWebViewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4b4912a4", new Object[]{viWebViewActivity}) : viWebViewActivity.d;
    }

    public static /* synthetic */ APTitleBar access$200(ViWebViewActivity viWebViewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (APTitleBar) ipChange.ipc$dispatch("4f2a4f85", new Object[]{viWebViewActivity}) : viWebViewActivity.b;
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.vi_webview_layout);
        this.f5892a = (WebView) findViewById(R.id.web_view);
        this.b = (APTitleBar) findViewById(R.id.title_bar);
        WebView webView = this.f5892a;
        try {
            Method method = webView.getClass().getMethod("removeJavascriptInterface", String.class);
            if (method != null) {
                method.invoke(webView, "searchBoxJavaBridge_");
                method.invoke(webView, "accessibility");
                method.invoke(webView, "accessibilityTraversal");
            }
        } catch (Throwable unused) {
        }
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        if (getIntent() != null && getIntent().getExtras() != null) {
            this.d = getIntent().getExtras().getString("loadUrl");
        }
        if (StringUtils.isEmpty(this.d)) {
            VerifyLogCat.w("ViWebViewActivity", "invalid params");
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-20221008-1", Constants.VI_ENGINE_APPID, "asfa", "", "", null, new HashMap());
            a(false);
            return;
        }
        this.f5892a.setWebViewClient(new WebViewClient() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.ViWebViewActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 1835642644) {
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("c6488b44", new Object[]{this, webView2, str})).booleanValue();
                }
                VerifyLogCat.i("ViWebViewActivity", "shouldOverrideUrlLoading url: " + str);
                if (str.startsWith("visdk://h5verify")) {
                    ViWebViewActivity.access$000(ViWebViewActivity.this, true);
                }
                return true;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6d69af14", new Object[]{this, webView2, str});
                    return;
                }
                super.onPageFinished(webView2, str);
                String title = webView2.getTitle();
                if (StringUtils.isEmpty(title) || StringUtils.isEmpty(ViWebViewActivity.access$100(ViWebViewActivity.this))) {
                    return;
                }
                ViWebViewActivity.access$200(ViWebViewActivity.this).setTitleText(title);
            }
        });
        this.f5892a.loadUrl(this.d);
        this.b.getGenericButton().setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.ViWebViewActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    ViWebViewActivity.access$000(ViWebViewActivity.this, false);
                }
            }
        });
        if (this.c == null) {
            this.c = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.ViWebViewActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    VerifyLogCat.i("ViWebViewActivity", "receive logout, so cancel");
                    ViWebViewActivity.access$000(ViWebViewActivity.this, false);
                }
            };
        }
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.android.broadcast.FORCE_LOGOUT_ACTION");
        localBroadcastManager.registerReceiver(this.c, intentFilter);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            a(false);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        VerifyLogCat.i("ViWebViewActivity", MessageID.onDestroy);
        try {
            if (this.c != null) {
                LocalBroadcastManager.getInstance(this).unregisterReceiver(this.c);
            }
            if (this.f5892a == null) {
                return;
            }
            this.f5892a.destroy();
        } catch (Throwable th) {
            VerifyLogCat.e("ViWebViewActivity", th);
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        VerifyLogCat.i("ViWebViewActivity", "doExit doVerify: " + z);
        Intent intent = new Intent(ACTION_NAME_VI_WEB_VIEW_EXIT);
        intent.putExtra(KEY_DO_VERIFY, String.valueOf(z));
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        finish();
    }
}
