package com.taobao.taolivecontainer;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.util.m;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebView;
import com.uc.webview.export.WebViewClient;
import tb.kge;

/* loaded from: classes8.dex */
public final class d extends WVUCWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f22053a;
    private WebViewClient b;

    static {
        kge.a(-734648789);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1262473342:
                super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                return null;
            case -623958539:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
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

    public d(Context context, b bVar) {
        super(context);
        this.f22053a = bVar;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageStarted(WebView webView, final String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
            return;
        }
        b bVar = this.f22053a;
        if (bVar != null && bVar.f22051a.b()) {
            m.e("WVUCWebViewProxy", "开始注入window._tl_x_prerender " + str);
            webView.evaluateJavascript(";window._tl_x_prerender=true;\nconsole.log(\"注入_tx_x_prerender\"+window._tl_x_prerender);", new ValueCallback<String>() { // from class: com.taobao.taolivecontainer.WVUCWebViewProxy$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str2});
                        return;
                    }
                    m.e("WVUCWebViewProxy", "注入window._tl_x_prerender " + str);
                }
            });
        }
        b bVar2 = this.f22053a;
        if (bVar2 != null && bVar2.a() != null) {
            for (String str2 : this.f22053a.a()) {
                webView.evaluateJavascript(str2, new ValueCallback<String>() { // from class: com.taobao.taolivecontainer.WVUCWebViewProxy$2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str3});
                            return;
                        }
                        m.e("WVUCWebViewProxy", "js 注入" + str3);
                    }
                });
            }
        }
        WebViewClient webViewClient = this.b;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
            return;
        }
        WebViewClient webViewClient = this.b;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        } else {
            super.onPageFinished(webView, str);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
            return;
        }
        WebViewClient webViewClient = this.b;
        if (webViewClient != null) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
            return;
        }
        WebViewClient webViewClient = this.b;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, i, str, str2);
        } else {
            super.onReceivedError(webView, i, str, str2);
        }
    }

    public void a(WebViewClient webViewClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b10f0e7", new Object[]{this, webViewClient});
        } else {
            this.b = webViewClient;
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        if (super.shouldOverrideUrlLoading(webView, str)) {
            return true;
        }
        WebView.HitTestResult hitTestResult = webView.getHitTestResult();
        int type = hitTestResult != null ? hitTestResult.getType() : 0;
        if (type > 0) {
            try {
                return Nav.from(this.mContext.get()).toUri(str);
            } catch (Exception unused) {
                return true;
            }
        }
        if (type == 0) {
        }
        return false;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f22053a = null;
        this.b = null;
    }
}
