package com.unionpay;

/* loaded from: classes9.dex */
final class y implements aa {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WebViewJavascriptBridge f24054a;
    private final String b;

    public y(WebViewJavascriptBridge webViewJavascriptBridge, String str) {
        this.f24054a = webViewJavascriptBridge;
        this.b = str;
    }

    @Override // com.unionpay.aa
    public final void a(String str) {
        this.f24054a._callbackJs(this.b, str);
    }
}
