package com.alipay.zoloz.toyger.workspace;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NavWebViewClient extends WebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HANDLE_MSG_LOAD_LOCAL_URL = 1;
    public static final int HANDLE_MSG_LOAD__URL_FAIL = 2;
    public static final int HANDLE_MSG_RECORD = 4;
    public static final int HANDLE_MSG_START_SAMPLE = 0;
    public static final int HANDLE_MSG_STOP_SAMPLE = 3;
    public Handler mHandler;
    private String mUserName;

    public static /* synthetic */ Object ipc$super(NavWebViewClient navWebViewClient, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -827498937:
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            case -496040708:
                super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                return null;
            case 756225189:
                super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            case 1835642644:
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public NavWebViewClient(Handler handler, String str) {
        this.mUserName = str;
        this.mHandler = handler;
        this.mHandler.removeMessages(1);
        Handler handler2 = this.mHandler;
        handler2.sendMessageDelayed(handler2.obtainMessage(1), 1500L);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cead5e47", new Object[]{this, webView, str, bitmap});
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d69af14", new Object[]{this, webView, str});
            return;
        }
        super.onPageFinished(webView, str);
        if (!StringUtil.isNullorEmpty(this.mUserName)) {
            webView.loadUrl("javascript:setUserName('" + this.mUserName + "')");
        }
        this.mHandler.removeMessages(1);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1314a5", new Object[]{this, webView, new Integer(i), str, str2});
            return;
        }
        super.onReceivedError(webView, i, str, str2);
        this.mHandler.sendEmptyMessage(2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26f04fc", new Object[]{this, webView, sslErrorHandler, sslError});
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }
}
