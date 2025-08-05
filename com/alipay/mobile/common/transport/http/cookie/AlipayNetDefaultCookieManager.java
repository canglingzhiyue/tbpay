package com.alipay.mobile.common.transport.http.cookie;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AlipayNetDefaultCookieManager implements IAlipayNetCookieManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static CookieManager f5569a;

    private static CookieManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CookieManager) ipChange.ipc$dispatch("febbc41", new Object[0]);
        }
        CookieManager cookieManager = f5569a;
        if (cookieManager != null) {
            return cookieManager;
        }
        synchronized (AlipayNetDefaultCookieManager.class) {
            if (f5569a != null) {
                return f5569a;
            }
            f5569a = CookieManager.getInstance();
            return f5569a;
        }
    }

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieManager
    public String getCookie(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3341ef95", new Object[]{this, str}) : a().getCookie(str);
    }

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieManager
    public void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f92d587", new Object[]{this, str, str2, valueCallback});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            a().setCookie(str, str2, valueCallback);
        }
    }

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieManager
    public void setCookie(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42fc581", new Object[]{this, str, str2});
        } else {
            a().setCookie(str, str2);
        }
    }

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieManager
    public void setAcceptCookie(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69d24df", new Object[]{this, new Boolean(z)});
        } else {
            a().setAcceptCookie(z);
        }
    }

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieManager
    public void flush() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            a().flush();
        }
    }

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieManager
    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed82aadf", new Object[]{this, valueCallback});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            a().removeAllCookies(valueCallback);
        }
    }

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieManager
    public void removeAllCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e96b48", new Object[]{this});
        } else {
            a().removeAllCookie();
        }
    }

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieManager
    public boolean hasCookies() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("943b38a0", new Object[]{this})).booleanValue() : a().hasCookies();
    }
}
