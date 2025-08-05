package com.unionpay;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;

/* loaded from: classes9.dex */
final class ac extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WebViewJavascriptBridge f24016a;

    private ac(WebViewJavascriptBridge webViewJavascriptBridge) {
        this.f24016a = webViewJavascriptBridge;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ac(WebViewJavascriptBridge webViewJavascriptBridge, byte b) {
        this(webViewJavascriptBridge);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        com.unionpay.utils.j.a("uppay", "onPageFinished");
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.unionpay.utils.j.a("uppay", "shouldOverrideUrlLoading：" + str);
        if (WebViewJavascriptBridge.access$200(this.f24016a) && !TextUtils.isEmpty(str) && !str.startsWith("http") && !str.startsWith(WXExceptionConfig.KEY_HTTP)) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                this.f24016a.mContext.startActivity(intent);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
