package com.taobao.themis.web.runtime;

import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.export.network.f;
import android.taobao.windvane.export.network.g;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.extension.page.af;
import com.taobao.themis.kernel.page.ITMSPage;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebView;
import tb.kge;
import tb.qpt;
import tb.qqo;
import tb.riy;

/* loaded from: classes9.dex */
public class c extends WVUCWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final g f22898a;
    private final qqo b;
    private final ITMSPage e;

    static {
        kge.a(-525366222);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1725202173:
                return super.shouldInterceptRequest((WebView) objArr[0], (WebResourceRequest) objArr[1]);
            case -623958539:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
            case -486123589:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (WebResourceRequest) objArr[1]));
            case 1373550412:
                super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public c(Context context, qqo qqoVar, ITMSPage iTMSPage, g gVar) {
        super(context);
        this.b = qqoVar;
        this.e = iTMSPage;
        this.f22898a = gVar;
        if (this.f22898a != null) {
            TMSLogger.a("TMSWebViewClient", "prefetchInfo: " + this.f22898a.b + ", " + this.f22898a.f1601a);
            return;
        }
        TMSLogger.a("TMSWebViewClient", "prefetchInfo: null");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebResourceResponse) ipChange.ipc$dispatch("992b8103", new Object[]{this, webView, webResourceRequest});
        }
        if (webResourceRequest == null || webView == null || (url = webResourceRequest.getUrl()) == null) {
            return null;
        }
        String uri = url.toString();
        if (TextUtils.isEmpty(uri)) {
            return null;
        }
        if (webView.getCurrentViewCoreType() == 3) {
            if (uri.contains("x-ssr=true")) {
                TMSLogger.a("TMSWebViewClient", "don't intercept ssr request: " + uri);
                return null;
            }
            g gVar = this.f22898a;
            if (gVar != null && f.b(gVar.b)) {
                TMSLogger.a("TMSWebViewClient", "don't intercept prefetch request: " + uri);
                return null;
            } else if (f.a(uri)) {
                TMSLogger.a("TMSWebViewClient", "don't intercept prefetch request: " + uri);
                return null;
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        IWebAdapter iWebAdapter = (IWebAdapter) qpt.b(IWebAdapter.class);
        if (iWebAdapter == null) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return iWebAdapter.shouldOverrideUrlLoading(this.e, new WebResourceRequest(str, null));
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e30657bb", new Object[]{this, webView, webResourceRequest})).booleanValue();
        }
        if (webResourceRequest == null) {
            return false;
        }
        Uri url = webResourceRequest.getUrl();
        IWebAdapter iWebAdapter = (IWebAdapter) qpt.b(IWebAdapter.class);
        if (iWebAdapter == null || url == null) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return iWebAdapter.shouldOverrideUrlLoading(this.e, webResourceRequest);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        String url;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
            return;
        }
        TMSLogger.a("TMSWebViewClient", "onReceivedError " + i + " " + str2);
        if (i == -205) {
            af.Companion.a().add(Integer.valueOf(i));
        }
        if (((!URLUtil.isHttpsUrl(str2) && !URLUtil.isHttpUrl(str2)) || !android.taobao.windvane.util.a.b(str2)) && (((i > -16 && i < 0) || i == -80 || i == -50) && ((url = webView.getUrl()) == null || url.equals(str2)))) {
            if (this.b == null) {
                return;
            }
            if ((webView instanceof WVUCWebView) && ((WVUCWebView) webView).getWebViewContext().isHitSnapshot()) {
                this.b.a("TMS_ERR_WEB_WIDGET", str + " [" + i + riy.ARRAY_END_STR);
                return;
            }
            webView.loadUrl("about:blank", null);
            webView.setVisibility(4);
            this.b.a("TMS_ERR_WEB_" + i, str + " [" + i + riy.ARRAY_END_STR);
            return;
        }
        super.onReceivedError(webView, i, str, str2);
    }
}
