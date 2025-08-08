package com.taobao.taobao.scancode.barcode.util;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.o;
import com.taobao.browser.BrowserHybridWebView;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.gateway.util.g;
import com.taobao.taobao.scancode.gateway.util.j;
import com.uc.webview.export.WebView;
import tb.cox;
import tb.css;
import tb.kge;
import tb.oxy;

/* loaded from: classes8.dex */
public abstract class ScancodeBaseBrowserActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACTIVITY_FINSH = 1102;
    public static final int GET_TITLE = 1104;
    public static final int PROGRESS_PAGE_FINSH = 1103;

    /* renamed from: a  reason: collision with root package name */
    public WVUCWebView f21221a;
    public ImageView b;
    private String c;
    private View e;
    private ViewGroup g;
    private boolean d = false;
    private css f = g.a("a2141.27835509");

    static {
        kge.a(839229717);
    }

    public static /* synthetic */ Object ipc$super(ScancodeBaseBrowserActivity scancodeBaseBrowserActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1281559479:
                super.onRestart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public abstract void a();

    public abstract int b();

    public static /* synthetic */ View a(ScancodeBaseBrowserActivity scancodeBaseBrowserActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("cb8a45e6", new Object[]{scancodeBaseBrowserActivity}) : scancodeBaseBrowserActivity.e;
    }

    public static /* synthetic */ css b(ScancodeBaseBrowserActivity scancodeBaseBrowserActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (css) ipChange.ipc$dispatch("1af8dbc0", new Object[]{scancodeBaseBrowserActivity}) : scancodeBaseBrowserActivity.f;
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        o.a();
        cox.a(this, "Page_BarCodeDetail");
        cox.a(getActivity(), "spm-cnt", "a2141.27835509");
        h();
        a();
        g();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        i();
        d();
        this.b = (ImageView) findViewById(R.id.scancode_browser_bg);
        this.e = findViewById(R.id.scancode_browser_progress);
        if (oxy.d()) {
            this.f21221a = (WVUCWebView) findViewById(R.id.scancode_browser_webview);
            BrowserHybridWebView browserHybridWebView = (BrowserHybridWebView) findViewById(R.id.scancode_browser_hybrid_webview);
            if (browserHybridWebView != null) {
                browserHybridWebView.setVisibility(8);
            }
        } else {
            this.f21221a = (BrowserHybridWebView) findViewById(R.id.scancode_browser_hybrid_webview);
            WVUCWebView wVUCWebView = (WVUCWebView) findViewById(R.id.scancode_browser_webview);
            if (wVUCWebView != null) {
                wVUCWebView.setVisibility(8);
            }
        }
        this.f21221a.setVisibility(0);
        this.f21221a.setWebViewClient(new WVUCWebViewClient(this) { // from class: com.taobao.taobao.scancode.barcode.util.ScancodeBaseBrowserActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -332805219) {
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                } else if (hashCode != 534767588) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                    return null;
                }
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                    return;
                }
                super.onPageFinished(webView, str);
                if (ScancodeBaseBrowserActivity.this.b.isShown()) {
                    ScancodeBaseBrowserActivity.this.b.setVisibility(8);
                }
                if (!ScancodeBaseBrowserActivity.a(ScancodeBaseBrowserActivity.this).isShown()) {
                    return;
                }
                ScancodeBaseBrowserActivity.a(ScancodeBaseBrowserActivity.this).setVisibility(4);
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
                }
                try {
                    if (StringUtils.equals(OrangeConfig.getInstance().getConfig("image_search", "disableProductCodeRedirect", "false"), "true")) {
                        return j.a(ScancodeBaseBrowserActivity.this.getApplicationContext(), ScancodeBaseBrowserActivity.b(ScancodeBaseBrowserActivity.this)).a().a(str);
                    }
                    if (str != null && str.startsWith("http")) {
                        if (!j.a(ScancodeBaseBrowserActivity.this.getApplicationContext(), ScancodeBaseBrowserActivity.b(ScancodeBaseBrowserActivity.this)).a(str)) {
                            return false;
                        }
                        ScancodeBaseBrowserActivity.this.runOnUiThread(new Runnable() { // from class: com.taobao.taobao.scancode.barcode.util.ScancodeBaseBrowserActivity.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    ScancodeBaseBrowserActivity.this.finish();
                                }
                            }
                        });
                        return true;
                    }
                    return j.a(ScancodeBaseBrowserActivity.this.getApplicationContext(), ScancodeBaseBrowserActivity.b(ScancodeBaseBrowserActivity.this)).a().a(str);
                } catch (Exception unused) {
                    return false;
                }
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                    return;
                }
                super.onPageStarted(webView, str, bitmap);
                if (ScancodeBaseBrowserActivity.a(ScancodeBaseBrowserActivity.this).isShown()) {
                    return;
                }
                ScancodeBaseBrowserActivity.a(ScancodeBaseBrowserActivity.this).setVisibility(0);
            }
        });
        this.c = c();
        getSupportActionBar().a(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18633));
        try {
            if (!StringUtils.isEmpty(this.c) && this.c.contains("setActionBarHide")) {
                getSupportActionBar().e();
                com.taobao.taobao.scancode.gateway.util.o.a("ScanBrowserActivity hide actionBar.url:" + this.c, new Object[0]);
            }
        } catch (Throwable unused) {
        }
        e();
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : getIntent().getStringExtra("target_url");
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.g = (ViewGroup) getLayoutInflater().inflate(b(), (ViewGroup) null);
        setContentView(this.g);
        this.g.addView(getLayoutInflater().inflate(R.layout.scancode_base_browser, (ViewGroup) null), 0);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            q.a("SaveScancodeHistory", "com.taobao.taobao.scancode.history.services.SaveScancodeHistory", getClassLoader());
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else {
            q.a("SaveScancodeHistory", "com.taobao.taobao.scancode.history.services.SaveScancodeHistory");
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.f21221a.loadUrl(this.c);
        }
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean onPanelKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            if (this.e.isShown()) {
                this.e.setVisibility(4);
                this.f21221a.stopLoading();
                return true;
            } else if (this.f21221a.canGoBack()) {
                this.f21221a.goBack();
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        if (Build.MANUFACTURER == null || !Build.MANUFACTURER.equalsIgnoreCase("Xiaomi") || this.d) {
            return;
        }
        supportInvalidateOptionsMenu();
        this.d = true;
    }

    @Override // android.app.Activity
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
        } else {
            super.onRestart();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.f21221a != null) {
            ViewGroup viewGroup = this.g;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            this.f21221a.removeAllViews();
            this.f21221a.clearCache(true);
            this.f21221a.destroy();
            this.f21221a = null;
        }
        super.onDestroy();
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            super.onPause();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
    }
}
