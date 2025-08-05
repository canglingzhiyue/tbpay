package com.taobao.pha.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.view.KeyEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebView;
import java.util.Map;
import java.util.TreeMap;
import tb.kge;
import tb.ngd;
import tb.nge;
import tb.ngf;
import tb.ngg;
import tb.ngm;
import tb.ngn;

/* loaded from: classes7.dex */
public class d extends WVUCWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ngg f18855a;
    private final ngf b;

    static {
        kge.a(-1337406614);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1725202173:
                return super.shouldInterceptRequest((WebView) objArr[0], (WebResourceRequest) objArr[1]);
            case -1456974963:
                super.onReceivedHttpError((WebView) objArr[0], (WebResourceRequest) objArr[1], (WebResourceResponse) objArr[2]);
                return null;
            case -1262473342:
                super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                return null;
            case -1171743094:
                super.onLoadResource((WebView) objArr[0], (String) objArr[1]);
                return null;
            case -623958539:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
            case -332805219:
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            case 211690983:
                return new Boolean(super.shouldOverrideKeyEvent((WebView) objArr[0], (KeyEvent) objArr[1]));
            case 534767588:
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public d(Context context, ngg nggVar, ngf ngfVar) {
        super(context);
        this.f18855a = nggVar;
        this.b = ngfVar;
    }

    private static ngd a(final WebResourceRequest webResourceRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ngd) ipChange.ipc$dispatch("70011423", new Object[]{webResourceRequest}) : new ngd() { // from class: com.taobao.pha.webview.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ngd
            public Uri a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Uri) ipChange2.ipc$dispatch("d258659f", new Object[]{this}) : WebResourceRequest.this.getUrl();
            }

            @Override // tb.ngd
            public String b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : WebResourceRequest.this.getMethod();
            }

            @Override // tb.ngd
            public Map<String, String> c() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Map) ipChange2.ipc$dispatch("3b696c1f", new Object[]{this}) : WebResourceRequest.this.getRequestHeaders();
            }
        };
    }

    private static WebResourceResponse a(nge ngeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebResourceResponse) ipChange.ipc$dispatch("298b658c", new Object[]{ngeVar});
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(ngeVar.a(), ngeVar.b(), ngeVar.e());
        webResourceResponse.setResponseHeaders(ngeVar.d());
        return webResourceResponse;
    }

    private static nge a(WebResourceResponse webResourceResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nge) ipChange.ipc$dispatch("da4d1392", new Object[]{webResourceResponse}) : new ngm(webResourceResponse.getMimeType(), webResourceResponse.getEncoding(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceResponse.getResponseHeaders(), webResourceResponse.getData());
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        if (!this.f18855a.a(this.b, str)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
            return;
        }
        super.onPageStarted(webView, str, bitmap);
        this.f18855a.a(this.b, str, bitmap);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
            return;
        }
        super.onPageFinished(webView, str);
        this.f18855a.b(this.b, str);
    }

    @Override // com.uc.webview.export.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba289e8a", new Object[]{this, webView, str});
        } else {
            super.onLoadResource(webView, str);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        nge a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebResourceResponse) ipChange.ipc$dispatch("992b8103", new Object[]{this, webView, webResourceRequest});
        }
        if (webResourceRequest != null && (a2 = this.f18855a.a(this.b, a(webResourceRequest))) != null) {
            return a(a2);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebResourceResponse) ipChange.ipc$dispatch("823f4abd", new Object[]{this, webView, str}) : shouldInterceptRequest(webView, new WebResourceRequest("GET", str, new TreeMap()));
    }

    @Override // com.uc.webview.export.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a928538d", new Object[]{this, webView, webResourceRequest, webResourceResponse});
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        this.f18855a.a(this.b, a(webResourceRequest), a(webResourceResponse));
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
            return;
        }
        if (!ngn.d() || sslError == null || sslError.getUrl() == null || !sslError.getUrl().startsWith("wss://appdevtools.taobao.net")) {
            z = false;
        }
        if (z && sslErrorHandler != null) {
            sslErrorHandler.proceed();
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // com.uc.webview.export.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9e25e7", new Object[]{this, webView, keyEvent})).booleanValue();
        }
        if (!this.f18855a.a(this.b, keyEvent)) {
            return super.shouldOverrideKeyEvent(webView, keyEvent);
        }
        return true;
    }
}
