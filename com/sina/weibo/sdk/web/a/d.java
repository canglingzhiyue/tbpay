package com.sina.weibo.sdk.web.a;

import android.app.Activity;
import android.graphics.Bitmap;
import android.webkit.WebView;
import tb.kge;

/* loaded from: classes4.dex */
public final class d extends b {
    static {
        kge.a(1602310087);
    }

    public d(Activity activity, com.sina.weibo.sdk.web.a aVar, com.sina.weibo.sdk.web.b.b bVar) {
        super(activity, aVar, bVar);
    }

    @Override // com.sina.weibo.sdk.web.a.b, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    @Override // com.sina.weibo.sdk.web.a.b, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.sina.weibo.sdk.web.a.b
    public final void p(String str) {
        n(str);
    }

    @Override // com.sina.weibo.sdk.web.a.b
    public final void q() {
        o("cancel share!!!");
        if (this.az != null) {
            this.az.q();
        }
    }

    @Override // com.sina.weibo.sdk.web.a.b
    public final boolean s() {
        q();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // com.sina.weibo.sdk.web.a.b, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r2, android.webkit.WebResourceRequest r3) {
        /*
            r1 = this;
            android.net.Uri r2 = r3.getUrl()
            java.lang.String r2 = r2.toString()
            boolean r3 = android.text.StringUtils.isEmpty(r2)
            if (r3 != 0) goto L50
            java.lang.String r3 = "sinaweibo://browser/close"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L50
            android.os.Bundle r2 = com.sina.weibo.sdk.b.e.h(r2)
            if (r2 == 0) goto L40
            java.lang.String r3 = "code"
            java.lang.String r3 = r2.getString(r3)
            java.lang.String r0 = "msg"
            java.lang.String r2 = r2.getString(r0)
            boolean r0 = android.text.StringUtils.isEmpty(r3)
            if (r0 == 0) goto L34
            java.lang.String r2 = "code is null!!!"
            r1.o(r2)
            goto L45
        L34:
            java.lang.String r0 = "0"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L42
            r1.m(r2)
            goto L45
        L40:
            java.lang.String r2 = "bundle is null!!!"
        L42:
            r1.n(r2)
        L45:
            com.sina.weibo.sdk.web.a r2 = r1.az
            if (r2 == 0) goto L4e
            com.sina.weibo.sdk.web.a r2 = r1.az
            r2.q()
        L4e:
            r2 = 1
            return r2
        L50:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.web.a.d.shouldOverrideUrlLoading(android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r2, java.lang.String r3) {
        /*
            r1 = this;
            boolean r2 = android.text.StringUtils.isEmpty(r3)
            if (r2 != 0) goto L3c
            java.lang.String r2 = "sinaweibo://browser/close"
            boolean r2 = r3.startsWith(r2)
            if (r2 == 0) goto L3c
            android.os.Bundle r2 = com.sina.weibo.sdk.b.e.h(r3)
            if (r2 == 0) goto L2c
            java.lang.String r3 = "code"
            java.lang.String r3 = r2.getString(r3)
            java.lang.String r0 = "msg"
            java.lang.String r2 = r2.getString(r0)
            java.lang.String r0 = "0"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L2e
            r1.m(r2)
            goto L31
        L2c:
            java.lang.String r2 = "bundle is null!!!"
        L2e:
            r1.n(r2)
        L31:
            com.sina.weibo.sdk.web.a r2 = r1.az
            if (r2 == 0) goto L3a
            com.sina.weibo.sdk.web.a r2 = r1.az
            r2.q()
        L3a:
            r2 = 1
            return r2
        L3c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.web.a.d.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
