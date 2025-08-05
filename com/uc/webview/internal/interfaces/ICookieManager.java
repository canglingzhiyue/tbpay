package com.uc.webview.internal.interfaces;

import android.webkit.ValueCallback;
import com.uc.webview.export.WebView;

/* loaded from: classes9.dex */
public interface ICookieManager {
    boolean acceptCookie();

    boolean acceptThirdPartyCookies(WebView webView);

    boolean allowFileSchemeCookiesImpl();

    void flush();

    String getCookie(String str);

    void getCookie(String str, ValueCallback<String> valueCallback);

    void getCookiesCount(ValueCallback<Integer> valueCallback);

    boolean hasCookies();

    void removeAllCookies(ValueCallback<Boolean> valueCallback);

    void removeCookiesForDomains(String[] strArr, ValueCallback<Boolean> valueCallback);

    void removeSessionCookies(ValueCallback<Boolean> valueCallback);

    void setAcceptCookie(boolean z);

    void setAcceptFileSchemeCookiesImpl(boolean z);

    void setAcceptThirdPartyCookies(WebView webView, boolean z);

    void setCookie(String str, String str2);

    void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback);
}
