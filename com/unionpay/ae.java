package com.unionpay;

/* loaded from: classes9.dex */
final class ae implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z f24018a;
    final /* synthetic */ String b;
    final /* synthetic */ aa c;
    final /* synthetic */ WebViewJavascriptBridge d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ae(WebViewJavascriptBridge webViewJavascriptBridge, z zVar, String str, aa aaVar) {
        this.d = webViewJavascriptBridge;
        this.f24018a = zVar;
        this.b = str;
        this.c = aaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z zVar = this.f24018a;
        if (zVar != null) {
            zVar.a(this.b, this.c);
        }
    }
}
