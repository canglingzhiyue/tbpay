package com.uc.webview.internal.android;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.uc.webview.export.WebView;
import com.uc.webview.internal.interfaces.ICookieManager;

/* loaded from: classes9.dex */
public class CookieManagerAndroid implements ICookieManager {
    private CookieManager mCookieManager = getSystemCookieManager();

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public synchronized boolean acceptCookie() {
        if (this.mCookieManager != null) {
            return this.mCookieManager.acceptCookie();
        }
        return false;
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public boolean acceptThirdPartyCookies(WebView webView) {
        if (this.mCookieManager == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return this.mCookieManager.acceptThirdPartyCookies((android.webkit.WebView) webView.getCoreView());
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public boolean allowFileSchemeCookiesImpl() {
        if (this.mCookieManager != null) {
            return CookieManager.allowFileSchemeCookies();
        }
        return false;
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void flush() {
        if (this.mCookieManager == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        this.mCookieManager.flush();
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public synchronized String getCookie(String str) {
        if (this.mCookieManager != null) {
            return this.mCookieManager.getCookie(str);
        }
        return "";
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void getCookie(String str, ValueCallback<String> valueCallback) {
        if (valueCallback != null) {
            valueCallback.onReceiveValue(getCookie(str));
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void getCookiesCount(ValueCallback<Integer> valueCallback) {
        if (valueCallback != null) {
            valueCallback.onReceiveValue(-1);
        }
    }

    public CookieManager getSystemCookieManager() {
        try {
            return CookieManager.getInstance();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public synchronized boolean hasCookies() {
        if (this.mCookieManager != null) {
            return this.mCookieManager.hasCookies();
        }
        return false;
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
        if (this.mCookieManager == null || Build.VERSION.SDK_INT < 21) {
            this.mCookieManager.removeAllCookie();
        } else {
            this.mCookieManager.removeAllCookies(valueCallback);
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void removeCookiesForDomains(String[] strArr, ValueCallback<Boolean> valueCallback) {
        if (valueCallback != null) {
            valueCallback.onReceiveValue(Boolean.FALSE);
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void removeSessionCookies(ValueCallback<Boolean> valueCallback) {
        if (this.mCookieManager == null || Build.VERSION.SDK_INT < 21) {
            this.mCookieManager.removeSessionCookie();
        } else {
            this.mCookieManager.removeSessionCookies(valueCallback);
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public synchronized void setAcceptCookie(boolean z) {
        if (this.mCookieManager != null) {
            this.mCookieManager.setAcceptCookie(z);
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void setAcceptFileSchemeCookiesImpl(boolean z) {
        if (this.mCookieManager != null) {
            CookieManager.setAcceptFileSchemeCookies(z);
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void setAcceptThirdPartyCookies(WebView webView, boolean z) {
        if (this.mCookieManager == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        this.mCookieManager.setAcceptThirdPartyCookies((android.webkit.WebView) webView.getCoreView(), z);
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void setCookie(String str, String str2) {
        CookieManager cookieManager = this.mCookieManager;
        if (cookieManager != null) {
            cookieManager.setCookie(str, str2);
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
        if (this.mCookieManager == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        this.mCookieManager.setCookie(str, str2, valueCallback);
    }
}
