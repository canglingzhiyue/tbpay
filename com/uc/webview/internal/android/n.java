package com.uc.webview.internal.android;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebViewClient;
import com.uc.webview.base.Log;
import com.uc.webview.export.WebResourceError;
import com.uc.webview.export.WebView;

/* loaded from: classes9.dex */
public final class n extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private WebView f23877a;
    private com.uc.webview.export.WebViewClient b;

    /* loaded from: classes9.dex */
    static class a extends WebResourceError {

        /* renamed from: a  reason: collision with root package name */
        private final android.webkit.WebResourceError f23879a;

        public a(android.webkit.WebResourceError webResourceError) {
            this.f23879a = webResourceError;
        }

        @Override // com.uc.webview.export.WebResourceError
        public final CharSequence getDescription() {
            return this.f23879a.getDescription();
        }

        @Override // com.uc.webview.export.WebResourceError
        public final int getErrorCode() {
            return this.f23879a.getErrorCode();
        }
    }

    public n(WebView webView, com.uc.webview.export.WebViewClient webViewClient) {
        this.f23877a = webView;
        this.b = webViewClient;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(android.webkit.WebView webView, String str, boolean z) {
        this.b.doUpdateVisitedHistory(this.f23877a, str, z);
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(android.webkit.WebView webView, Message message, Message message2) {
        this.b.onFormResubmission(this.f23877a, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(android.webkit.WebView webView, String str) {
        this.b.onLoadResource(this.f23877a, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(android.webkit.WebView webView, String str) {
        this.b.onPageCommitVisible(this.f23877a, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, String str) {
        this.b.onPageFinished(this.f23877a, str);
        com.uc.webview.internal.stats.i.a().a(0, str, true);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView webView, String str, Bitmap bitmap) {
        this.b.onPageStarted(this.f23877a, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, String str, String str2) {
        this.b.onReceivedError(this.f23877a, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            this.b.onReceivedError(this.f23877a, new com.uc.webview.export.WebResourceRequest(webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders(), webResourceRequest.getUrl(), webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame()), new a(webResourceError));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(android.webkit.WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        com.uc.webview.export.WebViewClient webViewClient = this.b;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpAuthRequest(this.f23877a, new c(httpAuthHandler), str, str2);
        } else {
            httpAuthHandler.cancel();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(android.webkit.WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        com.uc.webview.export.WebResourceRequest webResourceRequest2 = new com.uc.webview.export.WebResourceRequest(webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders(), webResourceRequest.getUrl(), webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame());
        com.uc.webview.export.WebResourceResponse webResourceResponse2 = new com.uc.webview.export.WebResourceResponse(webResourceResponse.getMimeType(), webResourceResponse.getEncoding(), webResourceResponse.getData());
        webResourceResponse2.setStatusCodeAndReasonPhrase(webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        webResourceResponse2.setResponseHeaders(webResourceResponse.getResponseHeaders());
        this.b.onReceivedHttpError(this.f23877a, webResourceRequest2, webResourceResponse2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(android.webkit.WebView webView, String str, String str2, String str3) {
        this.b.onReceivedLoginRequest(this.f23877a, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(android.webkit.WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.b.onReceivedSslError(this.f23877a, new SslErrorHandlerAndroid(sslErrorHandler), sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, final RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean onRenderProcessGone = this.b.onRenderProcessGone(this.f23877a, new com.uc.webview.export.extension.RenderProcessGoneDetail() { // from class: com.uc.webview.internal.android.n.1
            @Override // com.uc.webview.export.extension.RenderProcessGoneDetail
            public final boolean didCrash() {
                return renderProcessGoneDetail.didCrash();
            }

            @Override // com.uc.webview.export.extension.RenderProcessGoneDetail
            public final int rendererPriorityAtExit() {
                return renderProcessGoneDetail.rendererPriorityAtExit();
            }
        });
        Log.w("WebViewClientAndroid", "onRenderProcessGone, res: ".concat(String.valueOf(onRenderProcessGone)));
        return onRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(android.webkit.WebView webView, float f, float f2) {
        this.b.onScaleChanged(this.f23877a, f, f2);
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(android.webkit.WebView webView, KeyEvent keyEvent) {
        this.b.onUnhandledKeyEvent(this.f23877a, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, WebResourceRequest webResourceRequest) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        try {
            com.uc.webview.export.WebResourceResponse shouldInterceptRequest = this.b.shouldInterceptRequest(this.f23877a, Build.VERSION.SDK_INT >= 24 ? new com.uc.webview.export.WebResourceRequest(webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders(), webResourceRequest.getUrl().toString(), webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame(), webResourceRequest.isRedirect()) : new com.uc.webview.export.WebResourceRequest(webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders(), webResourceRequest.getUrl().toString(), webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame()));
            if (shouldInterceptRequest == null) {
                return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(shouldInterceptRequest.getMimeType(), shouldInterceptRequest.getEncoding(), shouldInterceptRequest.getData());
            webResourceResponse.setResponseHeaders(shouldInterceptRequest.getResponseHeaders());
            if (shouldInterceptRequest.getReasonPhrase() != null) {
                webResourceResponse.setStatusCodeAndReasonPhrase(shouldInterceptRequest.getStatusCode(), shouldInterceptRequest.getReasonPhrase());
            }
            return webResourceResponse;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, String str) {
        com.uc.webview.export.WebResourceResponse shouldInterceptRequest = this.b.shouldInterceptRequest(this.f23877a, str);
        if (shouldInterceptRequest == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(shouldInterceptRequest.getMimeType(), shouldInterceptRequest.getEncoding(), shouldInterceptRequest.getData());
        if (Build.VERSION.SDK_INT >= 21) {
            webResourceResponse.setResponseHeaders(shouldInterceptRequest.getResponseHeaders());
            if (shouldInterceptRequest.getReasonPhrase() != null) {
                webResourceResponse.setStatusCodeAndReasonPhrase(shouldInterceptRequest.getStatusCode(), shouldInterceptRequest.getReasonPhrase());
            }
        }
        return webResourceResponse;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(android.webkit.WebView webView, KeyEvent keyEvent) {
        return this.b.shouldOverrideKeyEvent(this.f23877a, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, WebResourceRequest webResourceRequest) {
        return this.b.shouldOverrideUrlLoading(this.f23877a, new com.uc.webview.export.WebResourceRequest(webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders(), webResourceRequest.getUrl().toString(), webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame()));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, String str) {
        return this.b.shouldOverrideUrlLoading(this.f23877a, str);
    }
}
