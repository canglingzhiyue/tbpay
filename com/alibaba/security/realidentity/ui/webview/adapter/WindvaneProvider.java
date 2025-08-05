package com.alibaba.security.realidentity.ui.webview.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.view.View;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;

/* loaded from: classes3.dex */
public class WindvaneProvider extends BaseWebViewProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ void access$000(Context context, WVUCWebView wVUCWebView, IWebViewClientCallback iWebViewClientCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6c263", new Object[]{context, wVUCWebView, iWebViewClientCallback});
        } else {
            setWindvaneClient(context, wVUCWebView, iWebViewClientCallback);
        }
    }

    public static void setWindvaneClient(Context context, final WVUCWebView wVUCWebView, final IWebViewClientCallback iWebViewClientCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9173c98a", new Object[]{context, wVUCWebView, iWebViewClientCallback});
        } else {
            wVUCWebView.setWebViewClient(new WVUCWebViewClient(context) { // from class: com.alibaba.security.realidentity.ui.webview.adapter.WindvaneProvider.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    switch (str.hashCode()) {
                        case -2109781315:
                            return super.shouldInterceptRequest((WebView) objArr[0], (String) objArr[1]);
                        case -1456974963:
                            super.onReceivedHttpError((WebView) objArr[0], (WebResourceRequest) objArr[1], (WebResourceResponse) objArr[2]);
                            return null;
                        case -1262473342:
                            super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                            return null;
                        case -332805219:
                            super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                            return null;
                        case 534767588:
                            super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                            return null;
                        case 1373550412:
                            super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                            return null;
                        default:
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }
                }

                @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                        return;
                    }
                    super.onPageFinished(webView, str);
                    iWebViewClientCallback.onPageFinished(webView, str);
                }

                @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                        return;
                    }
                    super.onPageStarted(webView, str, bitmap);
                    iWebViewClientCallback.onPageStarted(webView, str, bitmap);
                }

                @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                        return;
                    }
                    super.onReceivedError(webView, i, str, str2);
                    iWebViewClientCallback.onReceivedError(webView, i, str, str2);
                }

                @Override // com.uc.webview.export.WebViewClient
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a928538d", new Object[]{this, webView, webResourceRequest, webResourceResponse});
                        return;
                    }
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    iWebViewClientCallback.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }

                @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
                        return;
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    iWebViewClientCallback.onReceivedSslError(wVUCWebView, sslErrorHandler, sslError);
                }

                @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (WebResourceResponse) ipChange2.ipc$dispatch("823f4abd", new Object[]{this, webView, str}) : super.shouldInterceptRequest(webView, str);
                }
            });
        }
    }

    @Override // com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProvider
    public BaseWebViewProxy of(final Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseWebViewProxy) ipChange.ipc$dispatch("8d47c93", new Object[]{this, context, str});
        }
        final WVUCWebView wVUCWebView = new WVUCWebView(context);
        return new BaseWebViewProxy() { // from class: com.alibaba.security.realidentity.ui.webview.adapter.WindvaneProvider.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProxy
            public boolean canBack() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("5bdfd1e2", new Object[]{this})).booleanValue() : wVUCWebView.canGoBack();
            }

            @Override // com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProxy
            public void destroy() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("89c49781", new Object[]{this});
                    return;
                }
                wVUCWebView.clearCache(true);
                wVUCWebView.coreDestroy();
            }

            @Override // com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProxy
            public void evaluateJavascript(String str2, ValueCallback<String> valueCallback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b1bebe7d", new Object[]{this, str2, valueCallback});
                } else {
                    wVUCWebView.evaluateJavascript(str2, valueCallback);
                }
            }

            @Override // com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProxy
            public void fireEvent(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7134ec1f", new Object[]{this, str2, str3});
                } else {
                    wVUCWebView.fireEvent(str2, str3);
                }
            }

            @Override // com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProxy
            public String getOriginalUrl() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("cd9dbb51", new Object[]{this}) : wVUCWebView.getOriginalUrl();
            }

            @Override // com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProxy
            public int getProgress() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("8ba5fa9d", new Object[]{this})).intValue() : wVUCWebView.getProgress();
            }

            @Override // com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProxy
            public String getUrl() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("de8f0660", new Object[]{this}) : wVUCWebView.getUrl();
            }

            @Override // com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProxy
            public String getUserAgentString() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("a06231a4", new Object[]{this}) : wVUCWebView.getUserAgentString();
            }

            @Override // com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProxy
            public View getWebView() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("143738ac", new Object[]{this});
                }
                WebSettings settings = wVUCWebView.getSettings();
                if (settings != null) {
                    settings.setAllowFileAccess(false);
                }
                wVUCWebView.setWebChromeClient(new WVUCWebChromeClient());
                return wVUCWebView;
            }

            @Override // com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProxy
            public void goBack() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("156bc6f6", new Object[]{this});
                } else {
                    wVUCWebView.back();
                }
            }

            @Override // com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProxy
            public void loadUrl(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("89757c7a", new Object[]{this, str2});
                } else {
                    wVUCWebView.loadUrl(str2);
                }
            }

            @Override // com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProxy
            public void requestLayoutParams(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("919b553d", new Object[]{this, new Integer(i)});
                }
            }

            @Override // com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProxy
            public void resumeTimers() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3eb9df62", new Object[]{this});
                } else {
                    wVUCWebView.resumeTimers();
                }
            }

            @Override // com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProxy
            public void setUseWideViewPort(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("664b12cf", new Object[]{this, new Boolean(z)});
                    return;
                }
                WebSettings settings = wVUCWebView.getSettings();
                if (settings == null) {
                    return;
                }
                settings.setUseWideViewPort(z);
            }

            @Override // com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProxy
            public void setUserAgentString(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("260bd7ba", new Object[]{this, str2});
                } else {
                    wVUCWebView.setUserAgentString(str2);
                }
            }

            @Override // com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProxy
            public void setWebViewClient(IWebViewClientCallback iWebViewClientCallback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6bb1f50c", new Object[]{this, iWebViewClientCallback});
                } else {
                    WindvaneProvider.access$000(context, wVUCWebView, iWebViewClientCallback);
                }
            }

            @Override // com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProxy
            public void showLoadingView() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c8f114b", new Object[]{this});
                } else {
                    wVUCWebView.showLoadingView();
                }
            }
        };
    }
}
