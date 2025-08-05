package com.taobao.tao.flexbox.layoutmanager.actionservice.core;

import android.content.Context;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.webview.WVWebView;
import android.taobao.windvane.webview.WVWebViewClient;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class BackgroundWebview extends WVWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Handler handler;

    static {
        kge.a(1332042100);
    }

    public BackgroundWebview(Context context) {
        super(context);
        this.handler = new Handler(Looper.getMainLooper());
        this.webViewClient = new MyWVWebViewClient(context);
        super.setWebViewClient(this.webViewClient);
    }

    @Override // android.view.View
    public boolean post(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd609e29", new Object[]{this, runnable})).booleanValue();
        }
        this.handler.post(runnable);
        return true;
    }

    /* loaded from: classes8.dex */
    public class MyWVWebViewClient extends WVWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2144258519);
        }

        public static /* synthetic */ Object ipc$super(MyWVWebViewClient myWVWebViewClient, String str, Object... objArr) {
            if (str.hashCode() == -496040708) {
                super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public MyWVWebViewClient(Context context) {
            super(context);
        }

        @Override // android.taobao.windvane.webview.WVWebViewClient, android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e26f04fc", new Object[]{this, webView, sslErrorHandler, sslError});
            } else if (com.taobao.tao.flexbox.layoutmanager.actionservice.a.b() == 0) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                sslErrorHandler.proceed();
            }
        }
    }
}
