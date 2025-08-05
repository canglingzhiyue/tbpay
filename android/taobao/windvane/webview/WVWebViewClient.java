package android.taobao.windvane.webview;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.taobao.windvane.config.s;
import android.taobao.windvane.jsbridge.WVBridgeEngine;
import android.taobao.windvane.jsbridge.l;
import android.taobao.windvane.monitor.d;
import android.taobao.windvane.util.p;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.aem;
import tb.aeo;
import tb.aet;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class WVWebViewClient extends WebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVWebViewClient";
    public boolean isError;
    public Context mContext;
    private String currentUrl = null;
    private long mPageFinshTime = 0;
    public WebViewClient extraWebViewClient = null;

    static {
        kge.a(-143580597);
    }

    public static /* synthetic */ Object ipc$super(WVWebViewClient wVWebViewClient, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -496040708) {
            super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
            return null;
        } else if (hashCode == 61247803) {
            return super.shouldInterceptRequest((WebView) objArr[0], (String) objArr[1]);
        } else {
            if (hashCode != 1835642644) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
            return null;
        }
    }

    public static /* synthetic */ long access$000(WVWebViewClient wVWebViewClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bedeecf3", new Object[]{wVWebViewClient})).longValue() : wVWebViewClient.mPageFinshTime;
    }

    public WVWebViewClient(Context context) {
        this.mContext = context;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cead5e47", new Object[]{this, webView, str, bitmap});
            return;
        }
        this.isError = false;
        if (webView instanceof IWVWebView) {
            aem.a().a(1001, (IWVWebView) webView, str, bitmap);
        }
        if (android.taobao.windvane.util.m.a()) {
            android.taobao.windvane.util.m.c(TAG, "onPageStarted : " + str);
        }
        this.currentUrl = str;
        ((WVWebView) webView).onMessage(400, null);
        if (android.taobao.windvane.monitor.o.getPerformanceMonitor() != null) {
            android.taobao.windvane.monitor.o.getPerformanceMonitor().didPageStartLoadAtTime(str, System.currentTimeMillis());
        }
        l.b().a();
        WebViewClient webViewClient = this.extraWebViewClient;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d69af14", new Object[]{this, webView, str});
            return;
        }
        android.taobao.windvane.util.m.c(TAG, "onPageFinished : " + str);
        android.taobao.windvane.config.j.a();
        if (!TextUtils.isEmpty(android.taobao.windvane.config.j.commonConfig.ba)) {
            android.taobao.windvane.config.j.a();
            webView.evaluateJavascript(android.taobao.windvane.config.j.commonConfig.ba, new ValueCallback<String>() { // from class: android.taobao.windvane.webview.WVWebViewClient.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str2});
                        return;
                    }
                    android.taobao.windvane.util.m.e(WVWebViewClient.TAG, "JSTfsp receiveValue " + str2);
                }
            });
            android.taobao.windvane.util.m.e(TAG, "JSTfsp evaluate");
        }
        this.mPageFinshTime = System.currentTimeMillis();
        if (!this.isError && webView.getVisibility() == 4) {
            this.isError = false;
            webView.setVisibility(0);
        }
        super.onPageFinished(webView, str);
        if (webView instanceof WVWebView) {
            ((WVWebView) webView).setCurrentUrl(str, "onPageFinished");
        }
        if (webView instanceof IWVWebView) {
            aem.a().a(1002, (IWVWebView) webView, str, new Object[0]);
        }
        final WVWebView wVWebView = (WVWebView) webView;
        if (android.taobao.windvane.util.m.a()) {
            android.taobao.windvane.util.m.a(TAG, "Page finish: " + str);
        }
        String str2 = null;
        wVWebView.onMessage(401, null);
        wVWebView.fireEvent("WindVaneReady", String.format("{'version':'%s'}", android.taobao.windvane.config.a.VERSION));
        wVWebView.evaluateJavascript("(function(p){if(!p||!p.timing)return;var t=p.timing,s=t.navigationStart,sc=t.secureConnectionStart,dc=t.domComplete,lee=t.loadEventEnd;return JSON.stringify({dns:t.domainLookupEnd-t.domainLookupStart,c:t.connectEnd-t.connectStart,scs:sc>0?sc-s:0,req:t.requestStart-s,rps:t.responseStart-s,rpe:t.responseEnd-s,dl:t.domLoading-s,dcl:t.domContentLoadedEventEnd-s,dc:dc>0?dc-s:0,lee:lee>0?lee-s:0})})(window.performance)", new ValueCallback<String>() { // from class: android.taobao.windvane.webview.WVWebViewClient.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str3});
                } else if (android.taobao.windvane.monitor.o.getPerformanceMonitor() == null) {
                } else {
                    android.taobao.windvane.monitor.o.getPerformanceMonitor().didPagePerformanceInfo(str, str3);
                    android.taobao.windvane.monitor.o.getPerformanceMonitor().didPageFinishLoadAtTime(str, WVWebViewClient.access$000(WVWebViewClient.this));
                }
            }
        });
        wVWebView.evaluateJavascript("javascript:(function(f){if(f.__windvane__.call) return true; else return false})(window)", new ValueCallback<String>() { // from class: android.taobao.windvane.webview.WVWebViewClient.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str3});
                    return;
                }
                android.taobao.windvane.util.m.c("WVJsBridge", "has windvane :" + str3);
                if (!"false".equals(str3)) {
                    return;
                }
                WVWebView wVWebView2 = wVWebView;
                wVWebView2.loadUrl("javascript:" + WVBridgeEngine.WINDVANE_CORE_JS);
            }
        });
        WebViewClient webViewClient = this.extraWebViewClient;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        }
        if (android.taobao.windvane.config.j.commonConfig.cr) {
            aeo.a(webView.getContext());
            str2 = aeo.a();
        }
        if (android.taobao.windvane.monitor.o.getWvMonitorInterface() == null) {
            return;
        }
        android.taobao.windvane.monitor.n wvMonitorInterface = android.taobao.windvane.monitor.o.getWvMonitorInterface();
        String valueOf = String.valueOf(android.taobao.windvane.config.j.commonConfig.R);
        if (str2 == null) {
            str2 = "";
        }
        wvMonitorInterface.commitCoreTypeByPV(valueOf, "WVAndroid", str2, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1314a5", new Object[]{this, webView, new Integer(i), str, str2});
            return;
        }
        if (android.taobao.windvane.util.m.a()) {
            android.taobao.windvane.util.m.e(TAG, "Receive error, code: " + i + "; desc: " + str + "; url: " + str2);
        }
        if ((webView instanceof IWVWebView) && aem.a().a(1005, (IWVWebView) webView, str2, Integer.valueOf(i), str, str2).f25290a) {
            return;
        }
        String url = webView.getUrl();
        if (url == null || url.equals(str2)) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("cause", str + " [" + i + riy.ARRAY_END_STR);
            hashMap.put("url", str2);
            ((WVWebView) webView).onMessage(402, hashMap);
            this.isError = true;
            webView.setVisibility(4);
        }
        if (android.taobao.windvane.monitor.o.getErrorMonitor() != null) {
            d errorMonitor = android.taobao.windvane.monitor.o.getErrorMonitor();
            if (url == null) {
                url = str2;
            }
            errorMonitor.didOccurNativeError(url, i, str);
        }
        WebViewClient webViewClient = this.extraWebViewClient;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6488b44", new Object[]{this, webView, str})).booleanValue();
        }
        if (p.b(str) && android.taobao.windvane.config.p.c(str, (g) webView)) {
            String b = s.a().b();
            if (TextUtils.isEmpty(b)) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("cause", "ACCESS_FORBIDDEN");
                hashMap.put("url", str);
                ((WVWebView) webView).onMessage(402, hashMap);
            } else {
                webView.loadUrl(b);
            }
            return true;
        } else if (n.a(str, this.mContext, (g) webView)) {
            android.taobao.windvane.util.m.e(TAG, "shouldOverrideUrlLoading filter url=" + str);
            return true;
        } else {
            if (android.taobao.windvane.util.m.a()) {
                android.taobao.windvane.util.m.a(TAG, "shouldOverrideUrlLoading: " + str);
            }
            if ((webView instanceof IWVWebView) && aem.a().a(1003, (IWVWebView) webView, str, new Object[0]).f25290a) {
                return true;
            }
            if (str.startsWith("mailto:") || str.startsWith("tel:")) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.setFlags(268435456);
                    this.mContext.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    android.taobao.windvane.util.m.e(TAG, "shouldOverrideUrlLoading: ActivityNotFoundException, url=" + str);
                }
                return true;
            }
            try {
                if ((webView instanceof IWVWebView) && aet.c() != null && aet.c().isOpenURLIntercept()) {
                    if (aet.c().isNeedupdateURLRule(false)) {
                        aet.c().updateURLRule();
                    }
                    if (aet.c().shouldOverrideUrlLoading(this.mContext, (IWVWebView) webView, str)) {
                        if (android.taobao.windvane.util.m.a()) {
                            android.taobao.windvane.util.m.a(TAG, "intercept url: " + str);
                        }
                        return true;
                    }
                }
            } catch (Exception e) {
                android.taobao.windvane.util.m.e(TAG, "shouldOverrideUrlLoading: doFilter error, " + e.getMessage());
            }
            if (webView instanceof WVWebView) {
                ((WVWebView) webView).setCurrentUrl(str, "shouldOverrideUrlLoading");
            }
            android.taobao.windvane.util.m.c(TAG, "shouldOverrideUrlLoading : " + str);
            WebViewClient webViewClient = this.extraWebViewClient;
            if (webViewClient == null) {
                return false;
            }
            return webViewClient.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.webview.WVWebViewClient.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26f04fc", new Object[]{this, webView, sslErrorHandler, sslError});
            return;
        }
        String sslError2 = sslError.toString();
        if (android.taobao.windvane.util.m.a()) {
            android.taobao.windvane.util.m.e(TAG, "onReceivedSslError  url: " + sslError.getUrl() + "errorMsg:" + sslError2);
        }
        String url = webView.getUrl();
        if (webView instanceof IWVWebView) {
            aem.a().a(1006, (IWVWebView) webView, url, sslError2);
        }
        if (android.taobao.windvane.monitor.o.getErrorMonitor() != null) {
            android.taobao.windvane.monitor.o.getErrorMonitor().didOccurNativeError(url, 1006, sslError2);
        }
        WebViewClient webViewClient = this.extraWebViewClient;
        if (webViewClient != null) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }
}
