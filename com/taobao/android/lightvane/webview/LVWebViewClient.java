package com.taobao.android.lightvane.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class LVWebViewClient extends WebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context context;

    static {
        kge.a(-1071513606);
    }

    public static /* synthetic */ Object ipc$super(LVWebViewClient lVWebViewClient, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -827498937) {
            super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
            return null;
        } else if (hashCode == -496040708) {
            super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
            return null;
        } else if (hashCode != 1835642644) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
            return null;
        }
    }

    public LVWebViewClient(Context context) {
        this.context = context;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cead5e47", new Object[]{this, webView, str, bitmap});
            return;
        }
        super.onPageStarted(webView, str, bitmap);
        if (!(webView instanceof LVWebView)) {
            return;
        }
        ((LVWebView) webView).onMessage(400, null);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d69af14", new Object[]{this, webView, str});
            return;
        }
        super.onPageFinished(webView, str);
        if (!(webView instanceof LVWebView)) {
            return;
        }
        ((LVWebView) webView).onMessage(401, null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2dd279", new Object[]{this, webView, webResourceRequest, webResourceError});
        } else {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26f04fc", new Object[]{this, webView, sslErrorHandler, sslError});
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }
}
