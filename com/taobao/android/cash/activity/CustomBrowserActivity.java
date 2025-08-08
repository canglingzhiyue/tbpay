package com.taobao.android.cash.activity;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.ali.user.open.ucc.data.ApiConstants;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.uc.webview.export.JsPromptResult;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes4.dex */
public class CustomBrowserActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String i;

    /* renamed from: a  reason: collision with root package name */
    public WVUCWebView f9294a;
    public String b;
    public int c;
    public boolean d = true;
    public boolean e = true;
    public boolean f = true;
    public boolean g = false;
    public Toolbar h;
    public ViewGroup j;
    public ViewGroup k;
    private BroadcastReceiver m;

    public static /* synthetic */ Object ipc$super(CustomBrowserActivity customBrowserActivity, String str, Object... objArr) {
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
            case 143326307:
                super.onBackPressed();
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
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public boolean a(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eda1d580", new Object[]{this, webView, str})).booleanValue();
        }
        return false;
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

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ void a(CustomBrowserActivity customBrowserActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b78d88", new Object[]{customBrowserActivity});
        } else {
            customBrowserActivity.k();
        }
    }

    static {
        kge.a(1695656495);
        i = "cash.h5";
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
        try {
            Intent intent = getIntent();
            this.b = intent.getStringExtra("url");
            this.c = intent.getIntExtra("hasNavBar", 0);
            if ("false".equals(Uri.parse(this.b).getQueryParameter("dimEnabled"))) {
                getWindow().setDimAmount(0.0f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onCreate(bundle);
        l();
        try {
            if (this.c == 1) {
                f();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        a();
        i();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.m = new BroadcastReceiver() { // from class: com.taobao.android.cash.activity.CustomBrowserActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if ("com.ali.user.cash.close.all".equals(intent.getAction())) {
                    CustomBrowserActivity.this.setResult(0);
                    CustomBrowserActivity.this.finish();
                    CustomBrowserActivity.this.overridePendingTransition(0, 0);
                } else if (!"com.ali.user.cash.card.selected".equals(intent.getAction())) {
                } else {
                    CustomBrowserActivity.a(CustomBrowserActivity.this);
                    CustomBrowserActivity.this.a(new Intent("com.ali.user.cash.close.all"));
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ali.user.cash.close.all");
        intentFilter.addAction("com.ali.user.cash.card.selected");
        LocalBroadcastManager.getInstance(getApplicationContext()).registerReceiver(this.m, intentFilter);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e();
        b();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        j();
        this.k.addView(this.f9294a);
        a(this.f9294a);
        c();
        d();
        a(this.b);
    }

    private void j() {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.j.setBackgroundColor(0);
        Uri parse = Uri.parse(this.b);
        int i3 = 880;
        String queryParameter = parse.getQueryParameter("cashierHeight");
        String queryParameter2 = parse.getQueryParameter("fullPage");
        String queryParameter3 = parse.getQueryParameter("height");
        try {
            if (!StringUtils.isEmpty(queryParameter3)) {
                i3 = Integer.parseInt(queryParameter3);
            }
            if (!StringUtils.isEmpty(queryParameter)) {
                i3 = Integer.parseInt(queryParameter);
            }
        } catch (Exception e) {
            e.printStackTrace();
            String str = "pa rseInt error:" + e.getMessage();
        }
        if (!StringUtils.isEmpty(queryParameter2)) {
            i2 = Integer.parseInt(queryParameter2);
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            int i4 = displayMetrics.widthPixels;
            int i5 = displayMetrics.heightPixels;
            if (i2 == 0 || i3 <= 0) {
                this.k.setBackground(new ColorDrawable(0));
            }
            int i6 = (int) (i3 * (i4 / 750.0f));
            if (i6 > i5) {
                i6 = i5;
            }
            if (i6 <= 0) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
            layoutParams.height = i6;
            this.k.setLayoutParams(layoutParams);
            this.k.setBackground(new ColorDrawable(-1));
            return;
        }
        i2 = 0;
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        int i42 = displayMetrics2.widthPixels;
        int i52 = displayMetrics2.heightPixels;
        if (i2 == 0) {
        }
        this.k.setBackground(new ColorDrawable(0));
    }

    public static void a(WVUCWebView wVUCWebView) {
        wVUCWebView.setVerticalScrollbarOverlay(true);
        WebSettings settings = wVUCWebView.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setDomStorageEnabled(true);
        settings.setAppCachePath(wVUCWebView.getCurrentContext().getApplicationContext().getDir("cache", 0).getPath());
        settings.setAllowFileAccess(true);
        settings.setAppCacheEnabled(true);
        settings.setCacheMode(-1);
        settings.setBuiltInZoomControls(false);
        String str = "user agent=" + settings.getUserAgentString();
        if (Build.VERSION.SDK_INT >= 7) {
            try {
                Method method = wVUCWebView.getSettings().getClass().getMethod("setDomStorageEnabled", Boolean.TYPE);
                if (method != null) {
                    method.invoke(wVUCWebView.getSettings(), true);
                }
            } catch (Exception e) {
                TLog.loge("", "2.2 setDomStorageEnabled Failed!", e);
            }
        }
        try {
            wVUCWebView.removeJavascriptInterface("searchBoxJavaBridge_");
            wVUCWebView.removeJavascriptInterface("accessibility");
            wVUCWebView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        wVUCWebView.setBackgroundColor(0);
        wVUCWebView.getBackground().setAlpha(0);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.f9294a.loadUrl(str);
        }
    }

    /* loaded from: classes4.dex */
    public static class a extends WVUCWebChromeClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<CustomBrowserActivity> f9297a;

        static {
            kge.a(-2001556187);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
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

        public a(CustomBrowserActivity customBrowserActivity) {
            super(customBrowserActivity);
            this.f9297a = new WeakReference<>(customBrowserActivity);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87d6d0e5", new Object[]{this, webView, str});
                return;
            }
            CustomBrowserActivity customBrowserActivity = this.f9297a.get();
            if (customBrowserActivity != null && customBrowserActivity.d && customBrowserActivity.getSupportActionBar() != null) {
                try {
                    customBrowserActivity.getSupportActionBar().a(str);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            super.onReceivedTitle(webView, str);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d21149c", new Object[]{this, webView, str, str2, str3, jsPromptResult})).booleanValue() : super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<CustomBrowserActivity> f9298a;

        static {
            kge.a(-1534879472);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1262473342) {
                super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                return null;
            } else if (hashCode == -623958539) {
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
            } else {
                if (hashCode != -332805219) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            }
        }

        public b(CustomBrowserActivity customBrowserActivity) {
            super(customBrowserActivity);
            this.f9298a = new WeakReference<>(customBrowserActivity);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
            }
            CustomBrowserActivity customBrowserActivity = this.f9298a.get();
            if (customBrowserActivity != null) {
                try {
                    z = customBrowserActivity.a(webView, str);
                } catch (Exception e) {
                    String str2 = CustomBrowserActivity.i;
                    TLog.loge(str2, "webview内跳转地址有问题" + str, e);
                }
            }
            return z ? z : super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
                return;
            }
            TLog.loge(CustomBrowserActivity.i, "已忽略证书校验的错误！");
            final CustomBrowserActivity customBrowserActivity = this.f9298a.get();
            if (customBrowserActivity != null && !customBrowserActivity.f) {
                if (customBrowserActivity.g) {
                    sslErrorHandler.proceed();
                    return;
                } else {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    return;
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
            String string = webView.getContext().getResources().getString(R.string.cash_ssl_error_info);
            builder.setPositiveButton(webView.getContext().getResources().getString(R.string.cash_confirm), new DialogInterface.OnClickListener() { // from class: com.taobao.android.cash.activity.CustomBrowserActivity.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    sslErrorHandler.proceed();
                    CustomBrowserActivity customBrowserActivity2 = customBrowserActivity;
                    if (customBrowserActivity2 == null) {
                        return;
                    }
                    customBrowserActivity2.g = true;
                }
            });
            builder.setNeutralButton(webView.getContext().getResources().getString(R.string.cash_cancel), new DialogInterface.OnClickListener() { // from class: com.taobao.android.cash.activity.CustomBrowserActivity.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    sslErrorHandler.cancel();
                    CustomBrowserActivity customBrowserActivity2 = customBrowserActivity;
                    if (customBrowserActivity2 == null) {
                        return;
                    }
                    customBrowserActivity2.g = false;
                }
            });
            try {
                AlertDialog create = builder.create();
                create.setTitle(webView.getContext().getResources().getString(R.string.cash_ssl_error_title));
                create.setMessage(string);
                create.show();
                if (customBrowserActivity == null) {
                    return;
                }
                customBrowserActivity.f = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            this.f9298a.get();
            super.onPageFinished(webView, str);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f9294a.setWebChromeClient(new a(this));
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f9294a.setWebViewClient(new b(this));
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i2), new Integer(i3), intent});
            return;
        }
        if (i3 == -1) {
            WVUCWebView wVUCWebView = this.f9294a;
            if (wVUCWebView != null) {
                wVUCWebView.onActivityResult(i2, i3, intent);
            }
        } else {
            WVUCWebView wVUCWebView2 = this.f9294a;
            if (wVUCWebView2 != null) {
                wVUCWebView2.onActivityResult(i2, i3, intent);
            }
        }
        TLog.logd(i, "call onActivityResult");
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.e) {
            try {
                this.k.removeView(this.f9294a);
                this.f9294a.removeAllViews();
                this.f9294a.setVisibility(8);
                this.f9294a.destroy();
            } finally {
                try {
                } finally {
                }
            }
        }
        super.onDestroy();
        if (this.m == null) {
            return;
        }
        LocalBroadcastManager.getInstance(getApplicationContext()).unregisterReceiver(this.m);
    }

    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        boolean sendBroadcast = LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
        TLog.logd("cash4android", "CustomBrowserActivity", intent.getAction() + "; sendResult=" + sendBroadcast);
        return sendBroadcast;
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ApiConstants.ApiField.USER_ACTION, (Object) "1");
        WVStandardEventCenter.postNotificationToJS("ALBBCashierCloseNotification", JSONObject.toJSONString(jSONObject));
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.f9294a;
        if (wVUCWebView != null) {
            wVUCWebView.onPause();
        }
        super.onPause();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.f9294a;
        if (wVUCWebView != null) {
            wVUCWebView.onResume();
        }
        super.onResume();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            this.f9294a = new WVUCWebView(this);
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
        if (this.f9294a == null) {
            TLog.loge(i, "webview init failed, finish activity");
            finish();
        }
        this.f9294a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        setContentView(R.layout.cash_container);
        this.j = (ViewGroup) findViewById(R.id.aliuser_main_content);
        this.k = (ViewGroup) findViewById(R.id.aliuser_content);
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.cash.activity.CustomBrowserActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                CustomBrowserActivity.a(CustomBrowserActivity.this);
                CustomBrowserActivity.this.a(new Intent("com.ali.user.cash.close.all"));
            }
        });
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(R.layout.cash_toolbar, this.j, false);
        this.h = (Toolbar) viewGroup.findViewById(R.id.aliuser_toolbar);
        if (!(this.j.getChildAt(0) instanceof AppBarLayout)) {
            this.j.addView(viewGroup, 0);
        }
        setSupportActionBar(this.h);
        if (g()) {
            h();
        }
        this.h.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.cash.activity.CustomBrowserActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    CustomBrowserActivity.this.onBackPressed();
                }
            }
        });
        this.h.setNavigationContentDescription(R.string.cash_title_back);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        k();
        a(new Intent("com.ali.user.cash.close.all"));
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        Toolbar toolbar = this.h;
        if (toolbar == null) {
            return;
        }
        toolbar.setNavigationIcon(R.drawable.cash_actionbar_back);
    }
}
