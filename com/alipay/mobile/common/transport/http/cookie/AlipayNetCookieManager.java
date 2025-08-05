package com.alipay.mobile.common.transport.http.cookie;

import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AlipayNetCookieManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AlipayNetCookieManager f5567a;
    private IAlipayNetCookieManager b;

    public static AlipayNetCookieManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlipayNetCookieManager) ipChange.ipc$dispatch("11505875", new Object[0]);
        }
        AlipayNetCookieManager alipayNetCookieManager = f5567a;
        if (alipayNetCookieManager != null) {
            return alipayNetCookieManager;
        }
        synchronized (AlipayNetCookieManager.class) {
            if (f5567a != null) {
                return f5567a;
            }
            f5567a = new AlipayNetCookieManager();
            return f5567a;
        }
    }

    private AlipayNetCookieManager() {
        this.b = null;
        this.b = new AlipayNetDefaultCookieManager();
    }

    public synchronized void setCustomCookieManager(IAlipayNetCookieManager iAlipayNetCookieManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68164a5", new Object[]{this, iAlipayNetCookieManager});
            return;
        }
        if (iAlipayNetCookieManager != null) {
            this.b = iAlipayNetCookieManager;
        }
    }

    public String getCookie(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3341ef95", new Object[]{this, str}) : this.b.getCookie(str);
    }

    public void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f92d587", new Object[]{this, str, str2, valueCallback});
        } else {
            this.b.setCookie(str, str2, valueCallback);
        }
    }

    public void setCookie(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42fc581", new Object[]{this, str, str2});
        } else {
            this.b.setCookie(str, str2);
        }
    }

    public void setAcceptCookie(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69d24df", new Object[]{this, new Boolean(z)});
        } else {
            this.b.setAcceptCookie(z);
        }
    }

    public void flush() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        } else {
            this.b.flush();
        }
    }

    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed82aadf", new Object[]{this, valueCallback});
        } else {
            this.b.removeAllCookies(valueCallback);
        }
    }

    public void removeAllCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e96b48", new Object[]{this});
        } else {
            this.b.removeAllCookie();
        }
    }

    public boolean hasCookies() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("943b38a0", new Object[]{this})).booleanValue() : this.b.hasCookies();
    }
}
