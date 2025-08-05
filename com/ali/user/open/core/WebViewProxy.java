package com.ali.user.open.core;

/* loaded from: classes2.dex */
public interface WebViewProxy {
    void flush();

    String getCookie(String str);

    void removeAllCookie();

    void removeExpiredCookie();

    void removeSessionCookie();

    void setAcceptCookie(boolean z);

    void setCookie(String str, String str2);
}
