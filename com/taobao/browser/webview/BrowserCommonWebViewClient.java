package com.taobao.browser.webview;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.taobao.windvane.webview.WVWebView;
import android.taobao.windvane.webview.WVWebViewClient;
import mtopsdk.common.util.StringUtils;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.commonUrlFilter.LoginBroadcastReceiver;
import com.taobao.browser.h;
import com.taobao.browser.utils.c;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.orange.OrangeConfig;
import tb.kge;

/* loaded from: classes6.dex */
public class BrowserCommonWebViewClient extends WVWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BrowserCommonWebViewClient";
    private com.taobao.browser.commonUrlFilter.a mHelper;
    private WVWebView mWebView;

    static {
        kge.a(952986497);
    }

    public static /* synthetic */ Object ipc$super(BrowserCommonWebViewClient browserCommonWebViewClient, String str, Object... objArr) {
        if (str.hashCode() == -968324284) {
            return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public BrowserCommonWebViewClient(Context context) {
        super(context);
        this.mWebView = null;
        this.mHelper = null;
    }

    @Override // android.taobao.windvane.webview.WVWebViewClient, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6488b44", new Object[]{this, webView, str})).booleanValue();
        }
        this.mWebView = (WVWebView) webView;
        return checkLoginIntercept(str) || super.shouldOverrideUrlLoading(webView, str);
    }

    public boolean checkLoginIntercept(String str) {
        WVWebView wVWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7c7ce56", new Object[]{this, str})).booleanValue();
        }
        if (h.b(str)) {
            this.mHelper = new com.taobao.browser.commonUrlFilter.a();
            this.mHelper.f16768a = str;
            Bundle bundle = new Bundle();
            if (this.mContext == null || (wVWebView = this.mWebView) == null) {
                return false;
            }
            String url = wVWebView.getUrl();
            if (StringUtils.isEmpty(url)) {
                String str2 = "weburl1:" + url;
                url = this.mHelper.b("");
                String str3 = "weburl2:" + url;
            }
            bundle.putString(LoginConstants.BROWSER_REF_URL, url);
            String config = OrangeConfig.getInstance().getConfig("WindVane", "enable_refresh_cookies", "true");
            if (config != null && "true".equals(config)) {
                bundle.putBoolean("com.taobao.tao.login.REFRESH_COOKIES_FIRST", true);
            }
            LoginBroadcastReceiver.a((Activity) this.mContext, this.mWebView, this.mHelper, 102);
            Login.login(true, bundle);
            return true;
        } else if (!Login.isLogoutUrl(str)) {
            return false;
        } else {
            this.mHelper = new com.taobao.browser.commonUrlFilter.a();
            this.mHelper.f16768a = str;
            LoginBroadcastReceiver.a((Activity) this.mContext, this.mWebView, this.mHelper, 103);
            Login.logout(false);
            return true;
        }
    }

    @Deprecated
    public final boolean isIndex(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dfb1822a", new Object[]{this, str, strArr})).booleanValue() : c.a(str, strArr);
    }
}
