package com.taobao.themis.mix.h5_render;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.web.runtime.IWebAdapter;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebView;
import tb.kge;
import tb.qpt;
import tb.qqo;

@Deprecated
/* loaded from: classes9.dex */
public class b extends WVUCWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private qqo f22584a;
    private final Context b;
    private final String c;
    private final ITMSPage d;

    static {
        kge.a(-1012054470);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -623958539:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
            case -486123589:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (WebResourceRequest) objArr[1]));
            case -332805219:
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            case 534767588:
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public b(ITMSPage iTMSPage, qqo qqoVar, String str) {
        super(iTMSPage.b().o());
        this.f22584a = qqoVar;
        this.b = iTMSPage.b().o();
        this.c = str;
        this.d = iTMSPage;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        if (!n.e(this.c)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        IWebAdapter iWebAdapter = (IWebAdapter) qpt.b(IWebAdapter.class);
        if (iWebAdapter == null) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return iWebAdapter.shouldOverrideUrlLoading(this.d, new WebResourceRequest(str, null));
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e30657bb", new Object[]{this, webView, webResourceRequest})).booleanValue();
        }
        if (!n.e(this.c)) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        if (webResourceRequest == null) {
            return false;
        }
        Uri url = webResourceRequest.getUrl();
        IWebAdapter iWebAdapter = (IWebAdapter) qpt.b(IWebAdapter.class);
        if (iWebAdapter == null || url == null) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return iWebAdapter.shouldOverrideUrlLoading(this.d, webResourceRequest);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
            return;
        }
        super.onPageStarted(webView, str, bitmap);
        qqo qqoVar = this.f22584a;
        if (qqoVar == null) {
            return;
        }
        qqoVar.a();
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
            return;
        }
        super.onPageFinished(webView, str);
        qqo qqoVar = this.f22584a;
        if (qqoVar == null) {
            return;
        }
        qqoVar.b();
    }
}
