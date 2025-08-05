package com.alipay.mobile.common.transport.http.cookie;

import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public interface IAlipayNetCookieManager {
    void flush();

    String getCookie(String str);

    boolean hasCookies();

    void removeAllCookie();

    void removeAllCookies(ValueCallback<Boolean> valueCallback);

    void setAcceptCookie(boolean z);

    void setCookie(String str, String str2);

    void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback);
}
