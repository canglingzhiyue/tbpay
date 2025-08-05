package com.huawei.secure.android.common.webview;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public class a {
    public static void a(WebSettings webSettings) {
        webSettings.setAllowFileAccess(false);
        if (Build.VERSION.SDK_INT >= 16) {
            webSettings.setAllowFileAccessFromFileURLs(false);
            webSettings.setAllowUniversalAccessFromFileURLs(false);
        }
    }

    public static void a(WebView webView) {
        WebSettings settings = webView.getSettings();
        a(settings);
        b(webView);
        b(settings);
        c(settings);
        d(settings);
        e(settings);
    }

    public static void b(WebSettings webSettings) {
        if (Build.VERSION.SDK_INT <= 18) {
            webSettings.setSavePassword(false);
        }
    }

    public static void b(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        }
    }

    public static void c(WebSettings webSettings) {
        webSettings.setGeolocationEnabled(false);
    }

    public static void d(WebSettings webSettings) {
        if (Build.VERSION.SDK_INT >= 21) {
            webSettings.setMixedContentMode(1);
        }
    }

    public static void e(WebSettings webSettings) {
        if (Build.VERSION.SDK_INT >= 11) {
            webSettings.setAllowContentAccess(false);
        }
    }
}
