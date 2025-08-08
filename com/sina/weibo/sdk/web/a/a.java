package com.sina.weibo.sdk.web.a;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.sina.weibo.sdk.auth.AccessTokenHelper;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.b.e;
import com.sina.weibo.sdk.common.UiError;
import tb.kge;

/* loaded from: classes4.dex */
public final class a extends b {
    static {
        kge.a(1602310084);
    }

    public a(Activity activity, com.sina.weibo.sdk.web.a aVar, com.sina.weibo.sdk.web.b.b bVar) {
        super(activity, aVar, bVar);
    }

    private boolean l(String str) {
        Bundle g;
        AuthInfo a2 = this.aA.u().a();
        return a2 != null && str.startsWith(a2.getRedirectUrl()) && (g = e.g(str)) != null && !StringUtils.isEmpty(g.getString("access_token"));
    }

    @Override // com.sina.weibo.sdk.web.a.b, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        WbAuthListener wbAuthListener;
        UiError uiError;
        super.onPageFinished(webView, str);
        AuthInfo a2 = this.aA.u().a();
        if (a2 == null || !str.startsWith(a2.getRedirectUrl())) {
            return;
        }
        String r = this.aA.u().r();
        if (!StringUtils.isEmpty(r)) {
            this.aB = this.ax.a(r);
            if (this.aB != null) {
                Bundle g = e.g(str);
                if (g != null) {
                    String string = g.getString("error");
                    String string2 = g.getString("error_code");
                    String string3 = g.getString("error_description");
                    if (!StringUtils.isEmpty(string) || !StringUtils.isEmpty(string2)) {
                        wbAuthListener = this.aB;
                        uiError = new UiError(-1, string2, string3);
                    } else {
                        Oauth2AccessToken parseAccessToken = Oauth2AccessToken.parseAccessToken(g);
                        AccessTokenHelper.writeAccessToken(this.ay, parseAccessToken);
                        this.aB.onComplete(parseAccessToken);
                        this.ax.b(r);
                    }
                } else {
                    wbAuthListener = this.aB;
                    uiError = new UiError(-1, "bundle is null", "parse url error");
                }
                wbAuthListener.onError(uiError);
                this.ax.b(r);
            }
        }
        if (this.az == null) {
            return;
        }
        this.az.q();
    }

    @Override // com.sina.weibo.sdk.web.a.b, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.sina.weibo.sdk.web.a.b
    public final void q() {
        super.q();
        String r = this.aA.u().r();
        if (!StringUtils.isEmpty(r)) {
            this.aB = this.ax.a(r);
            if (this.aB != null) {
                this.aB.onCancel();
            }
            this.ax.b(r);
        }
        if (this.az != null) {
            this.az.q();
        }
    }

    @Override // com.sina.weibo.sdk.web.a.b
    public final boolean s() {
        q();
        return true;
    }

    @Override // com.sina.weibo.sdk.web.a.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (Build.VERSION.SDK_INT >= 21) {
            return l(webResourceRequest.getUrl().toString());
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return l(str);
    }
}
