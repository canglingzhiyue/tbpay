package com.ali.user.open.core.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.CommonUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class MemberWebView extends WebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private String appCacheDir;
    private Map<String, Object> nameToObj;

    @Override // android.webkit.WebView
    public final void addJavascriptInterface(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95c0098", new Object[]{this, obj, str});
        }
    }

    static {
        kge.a(1991761209);
        TAG = MemberWebView.class.getSimpleName();
    }

    public MemberWebView(Context context) {
        super(context);
        this.nameToObj = new HashMap();
        initSettings(context);
    }

    public MemberWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.nameToObj = new HashMap();
        initSettings(context);
    }

    private void initSettings(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("667bacae", new Object[]{this, context});
            return;
        }
        WebSettings settings = getSettings();
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception unused) {
        }
        settings.setSavePassword(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSupportZoom(false);
        settings.setSaveFormData(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setDomStorageEnabled(true);
        this.appCacheDir = context.getApplicationContext().getDir("cache", 0).getPath();
        settings.setAllowFileAccess(true);
        try {
            settings.setAppCachePath(this.appCacheDir);
            settings.setAppCacheEnabled(true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (CommonUtils.isNetworkAvailable(context)) {
            settings.setCacheMode(-1);
        } else {
            settings.setCacheMode(1);
        }
        settings.setBuiltInZoomControls(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        if (Build.VERSION.SDK_INT >= 19) {
            setWebContentsDebuggingEnabled(SDKLogger.isDebugEnabled());
        }
        try {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
                settings.setMixedContentMode(0);
            } catch (Throwable unused2) {
            }
        }
        final IWebViewClient iWebViewClient = (IWebViewClient) context;
        setWebViewClient(new BaseWebViewClient() { // from class: com.ali.user.open.core.webview.MemberWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -827498937) {
                    super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                    return null;
                } else if (hashCode != 1835642644) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c6488b44", new Object[]{this, webView, str})).booleanValue() : iWebViewClient.shouldOverrideUrlLoading(str);
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cead5e47", new Object[]{this, webView, str, bitmap});
                    return;
                }
                super.onPageStarted(webView, str, bitmap);
                iWebViewClient.onPageStarted(str);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6d69af14", new Object[]{this, webView, str});
                    return;
                }
                super.onPageFinished(webView, str);
                iWebViewClient.onPageFinished(str);
            }
        });
        setWebChromeClient(new BridgeWebChromeClient() { // from class: com.ali.user.open.core.webview.MemberWebView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == -650605876) {
                    super.onReceivedTitle((WebView) objArr[0], (String) objArr[1]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9388acc", new Object[]{this, webView, str});
                    return;
                }
                super.onReceivedTitle(webView, str);
                iWebViewClient.onReceivedTitle(str);
            }
        });
        setDownloadListener(new UccDownloadListener(context));
    }

    public final void addBridgeObject(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4583696", new Object[]{this, str, obj});
        } else {
            this.nameToObj.put(str, obj);
        }
    }

    public Object getBridgeObj(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2371ffc9", new Object[]{this, str}) : this.nameToObj.get(str);
    }
}
