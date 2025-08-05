package com.taobao.android.weex_plugin.component.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_plugin.component.webview.a;
import com.uc.webview.export.JsPromptResult;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class WXWebView implements com.taobao.android.weex_plugin.component.webview.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String g = "forceWx=true";
    private static final int h;
    private static final boolean i;

    /* renamed from: a  reason: collision with root package name */
    private Context f16115a;
    private String b;
    private AliWVUCWebView c;
    private ProgressBar d;
    private Handler f;
    private a.InterfaceC0621a k;
    private a.c l;
    private a.b m;
    private boolean e = true;
    private ArrayList<String> j = new ArrayList<>();

    /* loaded from: classes6.dex */
    public static class AliWVUCWebView extends WVUCWebView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public a onScrollChangeListener;

        /* loaded from: classes6.dex */
        public interface a {
        }

        public AliWVUCWebView(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(AliWVUCWebView aliWVUCWebView, String str, Object... objArr) {
            if (str.hashCode() == -173536977) {
                super.OnScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebView
        public void OnScrollChanged(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5a8092f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else {
                super.OnScrollChanged(i, i2, i3, i4);
            }
        }
    }

    public static /* synthetic */ a.c a(WXWebView wXWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.c) ipChange.ipc$dispatch("4911386", new Object[]{wXWebView}) : wXWebView.l;
    }

    public static /* synthetic */ void a(WXWebView wXWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8ed142", new Object[]{wXWebView, str});
        } else {
            wXWebView.c(str);
        }
    }

    public static /* synthetic */ void a(WXWebView wXWebView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("168eee8c", new Object[]{wXWebView, str, str2});
        } else {
            wXWebView.a(str, str2);
        }
    }

    public static /* synthetic */ void a(WXWebView wXWebView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("823c4c5c", new Object[]{wXWebView, new Boolean(z)});
        } else {
            wXWebView.a(z);
        }
    }

    public static /* synthetic */ a.b b(WXWebView wXWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.b) ipChange.ipc$dispatch("4da81a06", new Object[]{wXWebView}) : wXWebView.m;
    }

    public static /* synthetic */ a.InterfaceC0621a c(WXWebView wXWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.InterfaceC0621a) ipChange.ipc$dispatch("96bf2086", new Object[]{wXWebView}) : wXWebView.k;
    }

    public static /* synthetic */ ArrayList d(WXWebView wXWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("82add5d5", new Object[]{wXWebView}) : wXWebView.j;
    }

    public static /* synthetic */ boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : i;
    }

    public static /* synthetic */ String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[0]) : g;
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        h = i2;
        i = i2 < 17;
    }

    public WXWebView(Context context, String str) {
        this.f16115a = context;
        this.b = str;
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(this.f16115a);
        frameLayout.setBackgroundColor(-1);
        this.c = new AliWVUCWebView(this.f16115a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.c.setLayoutParams(layoutParams);
        frameLayout.addView(this.c);
        a((WVUCWebView) this.c);
        this.d = new ProgressBar(this.f16115a);
        a(false);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        this.d.setLayoutParams(layoutParams2);
        layoutParams2.gravity = 17;
        frameLayout.addView(this.d);
        this.f = new a();
        return frameLayout;
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (h() == null) {
        } else {
            h().destroy();
            this.c = null;
        }
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (h() == null) {
        } else {
            h().loadUrl(str);
        }
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (h() == null) {
        } else {
            h().loadDataWithBaseURL(this.b, str, "text/html", "utf-8", null);
        }
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (h() == null) {
        } else {
            h().reload();
        }
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (h() == null) {
        } else {
            h().goBack();
        }
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (h() == null) {
        } else {
            h().goForward();
        }
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (h() == null) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", (Object) "message");
                jSONObject.put("data", obj);
                jSONObject.put("origin", (Object) this.b);
                c("javascript:(function () {var initData = " + jSONObject.toString() + ";try {var event = new MessageEvent('message', initData);window.dispatchEvent(event);} catch (e) {}})();");
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void a(a.InterfaceC0621a interfaceC0621a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb3ed2", new Object[]{this, interfaceC0621a});
        } else {
            this.k = interfaceC0621a;
        }
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void a(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc2790", new Object[]{this, cVar});
        } else {
            this.l = cVar;
        }
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void a(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbbb331", new Object[]{this, bVar});
        } else {
            this.m = bVar;
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!this.e) {
        } else {
            ProgressBar progressBar = this.d;
            if (!z) {
                i2 = 8;
            }
            progressBar.setVisibility(i2);
        }
    }

    private AliWVUCWebView h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliWVUCWebView) ipChange.ipc$dispatch("fb19054d", new Object[]{this}) : this.c;
    }

    private void a(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d1e4c9", new Object[]{this, wVUCWebView});
            return;
        }
        WebSettings settings = wVUCWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        wVUCWebView.setWebViewClient(new WVUCWebViewClient(this.f16115a) { // from class: com.taobao.android.weex_plugin.component.webview.WXWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                switch (str.hashCode()) {
                    case -1262473342:
                        super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                        return null;
                    case -332805219:
                        super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                        return null;
                    case 534767588:
                        super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                        return null;
                    case 1373550412:
                        super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                        return null;
                    default:
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
                if (WXWebView.a(WXWebView.this) == null) {
                    return;
                }
                WXWebView.a(WXWebView.this).b(str);
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                    return;
                }
                super.onPageFinished(webView, str);
                if (WXWebView.a(WXWebView.this) != null) {
                    WXWebView.a(WXWebView.this).a(str, webView.canGoBack(), webView.canGoForward());
                }
                if (WXWebView.b(WXWebView.this) == null) {
                    return;
                }
                WXWebView wXWebView = WXWebView.this;
                StringBuilder sb = new StringBuilder();
                sb.append("javascript:(window.postMessage = function(message, targetOrigin) {if (message == null || !targetOrigin) return;");
                sb.append(WXWebView.f() ? "prompt('__WEEX_WEB_VIEW_BRIDGE://postMessage?message=' + JSON.stringify(message) + '&targetOrigin=' + targetOrigin)" : "__WEEX_WEB_VIEW_BRIDGE.postMessage(JSON.stringify(message), targetOrigin);");
                sb.append("})");
                WXWebView.a(wXWebView, sb.toString());
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onReceivedError(WebView webView, int i2, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i2), str, str2});
                    return;
                }
                super.onReceivedError(webView, i2, str, str2);
                if (WXWebView.c(WXWebView.this) == null) {
                    return;
                }
                WXWebView.c(WXWebView.this).a("error", "page error");
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
                }
                if (str == null || ((WXWebView.d(WXWebView.this) != null && WXWebView.d(WXWebView.this).contains(str)) || !str.contains(WXWebView.g()))) {
                }
                return false;
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
                    return;
                }
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                if (WXWebView.c(WXWebView.this) == null) {
                    return;
                }
                WXWebView.c(WXWebView.this).a("error", "ssl error");
            }
        });
        wVUCWebView.setWebChromeClient(new WVUCWebChromeClient() { // from class: com.taobao.android.weex_plugin.component.webview.WXWebView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -2015964955) {
                    super.onReceivedTitle((WebView) objArr[0], (String) objArr[1]);
                    return null;
                } else if (hashCode == -1540056808) {
                    super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                } else if (hashCode != 220271772) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    return new Boolean(super.onJsPrompt((WebView) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (JsPromptResult) objArr[4]));
                }
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
            public void onProgressChanged(WebView webView, int i2) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a4349918", new Object[]{this, webView, new Integer(i2)});
                    return;
                }
                super.onProgressChanged(webView, i2);
                WXWebView wXWebView = WXWebView.this;
                if (i2 == 100) {
                    z = false;
                }
                WXWebView.a(wXWebView, z);
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
            public void onReceivedTitle(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("87d6d0e5", new Object[]{this, webView, str});
                    return;
                }
                super.onReceivedTitle(webView, str);
                if (WXWebView.a(WXWebView.this) == null) {
                    return;
                }
                WXWebView.a(WXWebView.this).a(webView.getTitle());
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
            public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d21149c", new Object[]{this, webView, str, str2, str3, jsPromptResult})).booleanValue();
                }
                Uri parse = Uri.parse(str2);
                if (TextUtils.equals(parse.getScheme(), "__WEEX_WEB_VIEW_BRIDGE")) {
                    if (TextUtils.equals(parse.getAuthority(), "postMessage")) {
                        WXWebView.a(WXWebView.this, parse.getQueryParameter("message"), parse.getQueryParameter("targetOrigin"));
                        jsPromptResult.confirm("success");
                    } else {
                        jsPromptResult.confirm("fail");
                    }
                    return true;
                }
                return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            }
        });
        if (i) {
            return;
        }
        wVUCWebView.addJavascriptInterface(new Object() { // from class: com.taobao.android.weex_plugin.component.webview.WXWebView.3
        }, "__WEEX_WEB_VIEW_BRIDGE");
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (str == null || str2 == null || this.m == null) {
        } else {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("data", JSON.parse(str));
                hashMap.put("origin", str2);
                hashMap.put("type", "message");
                Message message = new Message();
                message.what = 1;
                message.obj = hashMap;
                this.f.sendMessage(message);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (h < 19) {
            this.c.loadUrl(str);
        } else {
            this.c.evaluateJavascript(str, null);
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<WXWebView> f16119a;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        private a(WXWebView wXWebView) {
            this.f16119a = new WeakReference<>(wXWebView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (message.what != 1 || this.f16119a.get() == null || WXWebView.b(this.f16119a.get()) == null) {
                return;
            }
            WXWebView.b(this.f16119a.get()).a((Map) message.obj);
        }
    }
}
