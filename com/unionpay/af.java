package com.unionpay;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class af implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f24019a;
    final /* synthetic */ WebViewJavascriptBridge b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public af(WebViewJavascriptBridge webViewJavascriptBridge, String str) {
        this.b = webViewJavascriptBridge;
        this.f24019a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.mWebView.loadUrl(this.f24019a);
    }
}
