package android.taobao.windvane.extra.uc;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.preRender.PreRenderWebView;
import android.taobao.windvane.ha.UCHAManager;
import android.taobao.windvane.ha.a;
import android.taobao.windvane.jsbridge.l;
import android.taobao.windvane.monitor.d;
import android.taobao.windvane.monitor.o;
import android.taobao.windvane.util.f;
import android.taobao.windvane.util.m;
import android.taobao.windvane.util.p;
import android.taobao.windvane.webview.IWVWebView;
import android.taobao.windvane.webview.e;
import android.taobao.windvane.webview.g;
import mtopsdk.common.util.StringUtils;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.n;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebView;
import com.uc.webview.export.WebViewClient;
import com.uc.webview.export.extension.RenderProcessGoneDetail;
import com.uc.webview.export.extension.StorageUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
import tb.aem;
import tb.aet;
import tb.kge;
import tb.orq;
import tb.oxv;
import tb.qgm;
import tb.riy;

/* loaded from: classes2.dex */
public class WVUCWebViewClient extends WebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SANDBOX_TAG = "WVUCWebViewClient.sandbox";
    public static final String SCHEME_GEO = "geo:0,0?q=";
    public static final String SCHEME_MAILTO = "mailto:";
    public static final String SCHEME_SMS = "sms:";
    public static final String SCHEME_TEL = "tel:";
    private static final String TAG = "WVUCWebViewClient";
    public boolean isError;
    public WeakReference<Context> mContext;
    private Handler mRenderProcessHandler;
    private String pageStartUrl;
    public int crashCount = 0;
    private boolean useOldBridge = false;
    private Runnable mCrashCountReseter = new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebViewClient.7
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            m.e(WVUCWebViewClient.SANDBOX_TAG, "crash count reset - " + WVUCWebViewClient.this.crashCount);
            WVUCWebViewClient.this.crashCount = 0;
        }
    };

    static {
        kge.a(-1730920775);
    }

    public static /* synthetic */ Object ipc$super(WVUCWebViewClient wVUCWebViewClient, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2109781315:
                return super.shouldInterceptRequest((WebView) objArr[0], (String) objArr[1]);
            case -1262473342:
                super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                return null;
            case -623958539:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
            case -486123589:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (WebResourceRequest) objArr[1]));
            case -332805219:
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public WVUCWebViewClient(Context context) {
        this.mContext = new WeakReference<>(context);
    }

    public void setPageStartUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf18aef", new Object[]{this, str});
        } else {
            this.pageStartUrl = str;
        }
    }

    @Override // com.uc.webview.export.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
            return;
        }
        if (webView instanceof e) {
            f.b(((e) webView).getFalcoSpan(), "onPageStarted");
        }
        boolean z = webView instanceof WVUCWebView;
        if (z) {
            ((WVUCWebView) webView).wpData.setPageCurrentStatus("onPageStarted");
        }
        m.e(TAG, "onPageStarted : " + str);
        this.pageStartUrl = str;
        WVUCWebView wVUCWebView = (WVUCWebView) webView;
        wVUCWebView.wvfspManager.navigationDidStart();
        wVUCWebView.wvh5PPManager.pageDidStartLoad();
        wVUCWebView.pageTracker.onPageStarted(wVUCWebView, str);
        IWVWebView iWVWebView = (IWVWebView) webView;
        Context _getContext = iWVWebView._getContext();
        if (_getContext instanceof Activity) {
            UCHAManager.getInstance().initApmCallback(str, _getContext.getClass().getSimpleName());
        }
        if (webView instanceof PreRenderWebView) {
            a.a().a(webView);
        }
        this.isError = false;
        if (o.getPerformanceMonitor() != null) {
            o.getPerformanceMonitor().didPageStartLoadAtTime(str, System.currentTimeMillis());
        }
        if (z) {
            aem.a().a(1001, iWVWebView, str, bitmap);
            wVUCWebView.onMessage(400, null);
            wVUCWebView.mPageStart = System.currentTimeMillis();
        }
        l.b().a();
    }

    public static String getMetaDataScript(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1d9058", new Object[]{strArr});
        }
        String str = "";
        String str2 = "(function(){var d=document,r={}";
        for (int i = 0; i < strArr.length; i++) {
            str2 = str2 + String.format(",n%d='%s',e%d=d.getElementById(n%d)", Integer.valueOf(i), strArr[i], Integer.valueOf(i), Integer.valueOf(i));
            str = str + String.format("if(e%d){r[n%d]=e%d.getAttribute('value')}", Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i));
        }
        return str2 + String.format(";%sreturn JSON.stringify(r);})()", str);
    }

    public static JSONObject getMetaObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e0441e19", new Object[]{str});
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("\"") && str.endsWith("\"")) {
                str = str.substring(1, str.length() - 1);
            }
            return new JSONObject(str.replace("\\", ""));
        } catch (Exception unused) {
            return null;
        }
    }

    public void getPageNameForFalco(final WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2882d8ec", new Object[]{this, wVUCWebView});
            return;
        }
        String metaDataScript = getMetaDataScript(new String[]{"WV.Meta.Falco.PageName"});
        if (StringUtils.isEmpty(metaDataScript) || wVUCWebView == null) {
            return;
        }
        wVUCWebView.evaluateJavascript(metaDataScript, new ValueCallback<String>() { // from class: android.taobao.windvane.extra.uc.WVUCWebViewClient.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                    return;
                }
                try {
                    JSONObject metaObject = WVUCWebViewClient.getMetaObject(str);
                    if (metaObject != null && wVUCWebView != null) {
                        String optString = metaObject.optString("WV.Meta.Falco.PageName");
                        if (StringUtils.isEmpty(optString)) {
                            return;
                        }
                        wVUCWebView.setFalcoPageName(optString);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    private void checkJsFspMetaInfo(final WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b67f90ed", new Object[]{this, wVUCWebView});
            return;
        }
        String metaDataScript = getMetaDataScript(new String[]{"WV.Meta.Performance.JSFSP"});
        if (metaDataScript == null || wVUCWebView == null) {
            return;
        }
        wVUCWebView.evaluateJavascript(metaDataScript, new ValueCallback<String>() { // from class: android.taobao.windvane.extra.uc.WVUCWebViewClient.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                    return;
                }
                try {
                    JSONObject metaObject = WVUCWebViewClient.getMetaObject(str);
                    if (metaObject != null && wVUCWebView != null) {
                        oxv oxvVar = (oxv) qgm.a().a(oxv.class);
                        if (oxvVar != null && metaObject.has("WV.Meta.Performance.JSFSP")) {
                            if (!StringUtils.isEmpty(metaObject.optString("WV.Meta.Performance.JSFSP"))) {
                                if (wVUCWebView.isReportedFSP()) {
                                    return;
                                }
                                wVUCWebView.setTag(oxvVar.a(), oxvVar.c());
                                return;
                            }
                            wVUCWebView.setTag(oxvVar.a(), oxvVar.d());
                            m.b(WVUCWebViewClient.TAG, "no version setTag " + SystemClock.uptimeMillis());
                            return;
                        }
                        if (oxvVar != null) {
                            wVUCWebView.setTag(oxvVar.a(), oxvVar.d());
                        }
                        m.b(WVUCWebViewClient.TAG, "no JSFSP setTag " + SystemClock.uptimeMillis());
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0282  */
    @Override // com.uc.webview.export.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPageFinished(final com.uc.webview.export.WebView r20, final java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.WVUCWebViewClient.onPageFinished(com.uc.webview.export.WebView, java.lang.String):void");
    }

    private void tryPreCacheResources(WebView webView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b895a88", new Object[]{this, webView});
            return;
        }
        if (WVUCPrecacheManager.canClearPrecache()) {
            WVUCPrecacheManager.resetClearConfig();
            StorageUtils.clearPrecacheResources(null);
            WVUCPrecacheManager.setHasPrecache(false);
        }
        if (!WVUCPrecacheManager.canPrecache()) {
            return;
        }
        WVUCPrecacheManager.resetClearConfig();
        WVUCPrecacheManager.resetPrecacheConfig();
        HashSet<String> preMemCacheUrlSet = WVUCPrecacheManager.preMemCacheUrlSet();
        if (preMemCacheUrlSet == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> it = preMemCacheUrlSet.iterator();
        while (it.hasNext()) {
            String next = it.next();
            WebResourceResponse shouldInterceptRequest = shouldInterceptRequest(webView, new WebResourceRequest(next, new HashMap()));
            if (shouldInterceptRequest != null) {
                hashMap.put(next, shouldInterceptRequest);
            }
        }
        if (hashMap.size() <= 0) {
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("maxAge", "3600");
        hashMap2.put("ignoreQuery", "1");
        StorageUtils.precacheResources(hashMap, hashMap2);
        WVUCPrecacheManager.setHasPrecache(true);
    }

    @Override // com.uc.webview.export.WebViewClient
    public boolean onRenderProcessGone(final WebView webView, final RenderProcessGoneDetail renderProcessGoneDetail) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb4378e4", new Object[]{this, webView, renderProcessGoneDetail})).booleanValue();
        }
        m.e(SANDBOX_TAG, "onRenderProcessGone webview:" + webView + ", crash:" + renderProcessGoneDetail.didCrash() + ", priority:" + renderProcessGoneDetail.rendererPriorityAtExit() + ", crash count:" + this.crashCount);
        if (this.crashCount < j.commonConfig.ak) {
            if (webView != null) {
                this.crashCount++;
                if (this.mRenderProcessHandler == null) {
                    this.mRenderProcessHandler = new Handler(Looper.getMainLooper());
                }
                this.mRenderProcessHandler.postDelayed(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebViewClient.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (webView.isDestroied()) {
                        } else {
                            if ((webView instanceof WVUCWebView) && j.commonConfig.bL) {
                                WVUCWebView wVUCWebView = (WVUCWebView) webView;
                                String currentUrl = wVUCWebView.getCurrentUrl();
                                wVUCWebView.pageTracker.onPageRenderProcessTerminate(currentUrl);
                                AppMonitor.Alarm.commitFail("WindVane", "webProcessTerminated", currentUrl, "1", renderProcessGoneDetail.didCrash() + ":" + renderProcessGoneDetail.rendererPriorityAtExit());
                            }
                            WebView webView2 = webView;
                            if (webView2 instanceof WVUCWebView) {
                                ((WVUCWebView) webView2).refreshWhenForeground();
                            } else {
                                webView2.reload();
                            }
                        }
                    }
                }, 200L);
                this.mRenderProcessHandler.removeCallbacks(this.mCrashCountReseter);
                this.mRenderProcessHandler.postDelayed(this.mCrashCountReseter, orq.FRAME_CHECK_TIMEOUT);
                return true;
            }
            m.e(SANDBOX_TAG, "onRenderProcessGone - WebView is null");
            return false;
        }
        if (o.getWvMonitorInterface() != null) {
            o.getWvMonitorInterface().commitWebMultiType(webView.getUrl(), WVCore.getInstance().getUsedWebMulti(), -1);
            WVCore.getInstance().updateIsolatePolicy(webView.getContext(), false);
        }
        this.crashCount = 0;
        m.b(SANDBOX_TAG, "onRenderProcessGone webview:" + webView.getClass().getSimpleName() + ", crash:" + renderProcessGoneDetail.didCrash(), new Throwable(), new Object[0]);
        return false;
    }

    @Override // com.uc.webview.export.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        n falcoSpan;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
            return;
        }
        m.e(TAG, "Receive error, code: " + i + "; desc: " + str + "; url: " + str2);
        String url = webView.getUrl();
        if ((webView instanceof e) && (falcoSpan = ((e) webView).getFalcoSpan()) != null) {
            f.b(falcoSpan, "onReceivedError");
            falcoSpan.a("errorCode", Integer.valueOf(i));
            falcoSpan.a("description", str);
            falcoSpan.a("failingUrl", str2);
            falcoSpan.b("onReceivedError");
        }
        WVUCWebView wVUCWebView = (WVUCWebView) webView;
        wVUCWebView.wvh5PPManager.pageDidFailLoadWithError(String.valueOf(i), str);
        wVUCWebView.pageTracker.onPageReceivedError(wVUCWebView, str, i);
        wVUCWebView.wpData.addProbableReason(str);
        if ((!URLUtil.isHttpsUrl(str2) && !URLUtil.isHttpUrl(str2)) || !android.taobao.windvane.util.a.b(str2)) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str2);
            hashMap.put("msg", "errCode = [" + i + "]; errMsg" + str);
            if (((i > -16 && i < 0) || i == -80 || i == -50) && (url == null || url.equals(str2))) {
                HashMap hashMap2 = new HashMap(2);
                hashMap2.put("cause", str + " [" + i + riy.ARRAY_END_STR);
                hashMap2.put("url", str2);
                this.isError = true;
                webView.setVisibility(4);
                wVUCWebView.onMessage(402, hashMap2);
            }
        }
        if (((webView instanceof IWVWebView) && aem.a().a(1005, (IWVWebView) webView, str2, Integer.valueOf(i), str, str2).f25290a) || o.getErrorMonitor() == null) {
            return;
        }
        d errorMonitor = o.getErrorMonitor();
        if (url != null) {
            str2 = url;
        }
        errorMonitor.didOccurNativeError(str2, i, str);
    }

    @Override // com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        m.e(TAG, "WVUCWebViewClient.shouldOverrideUrlLoading, url = " + str);
        try {
            if (webView instanceof e) {
                f.a(((e) webView).getFalcoSpan(), (String) null);
                ((e) webView).setFalcoSpan(f.a("windvaneSubPage", "H5SubPage", ((e) webView).getOpenTracingContext()));
            }
        } catch (Throwable th) {
            m.e(TAG, "getSpan failed " + android.taobao.windvane.util.a.a(th));
        }
        boolean z = webView instanceof WVUCWebView;
        if (z) {
            WVUCWebView wVUCWebView = (WVUCWebView) webView;
            wVUCWebView.wpData.setPageCurrentStatus("shouldOverrideUrlLoading");
            wVUCWebView.wpData.timeLoadurl = System.currentTimeMillis();
            try {
                ((WVUCWebView) webView).getWebViewContext().getWebViewPageModel().onPropertyIfAbsent("H5_pageRedirect", true);
            } catch (Exception e) {
                m.e(TAG, "report H5_pageRedirect error: " + android.taobao.windvane.util.a.a(e));
            }
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("_wvPgName");
                if (!StringUtils.isEmpty(queryParameter)) {
                    ((WVUCWebView) webView).setFalcoPageName(queryParameter);
                }
            } catch (Throwable th2) {
                m.e(TAG, android.taobao.windvane.util.a.a(th2));
            }
        }
        if (p.b(str) && android.taobao.windvane.config.p.c(str, (g) webView)) {
            String b = android.taobao.windvane.config.n.a().b();
            if (StringUtils.isEmpty(b)) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("cause", "ACCESS_FORBIDDEN");
                hashMap.put("url", str);
                ((WVUCWebView) webView).onMessage(402, hashMap);
            } else {
                webView.loadUrl(b);
            }
            return true;
        } else if (android.taobao.windvane.webview.n.a(str, this.mContext.get(), (g) webView)) {
            m.e(TAG, "shouldOverrideUrlLoading filter url=" + str);
            android.taobao.windvane.monitor.a.commitFail(android.taobao.windvane.monitor.a.MONITOR_POINT_URL_CONFIG_FILTER_TYPE, 3, "WVUCWebView.shouldOverrideUrlLoading", str);
            return true;
        } else if ((webView instanceof IWVWebView) && aem.a().a(1003, (IWVWebView) webView, str, new Object[0]).f25290a) {
            return true;
        } else {
            Context context = webView.getContext();
            if (str.startsWith("mailto:") || str.startsWith("tel:") || str.startsWith(SCHEME_SMS)) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.setFlags(268435456);
                    if (context != null) {
                        context.startActivity(intent);
                    }
                } catch (ActivityNotFoundException e2) {
                    m.b(TAG, "shouldOverrideUrlLoading: ActivityNotFoundException, url=" + str, e2, new Object[0]);
                }
                return true;
            }
            WVUCWebView wVUCWebView2 = (WVUCWebView) webView;
            wVUCWebView2.wvh5PPManager.receiveHtmlUrl(str);
            wVUCWebView2.pageTracker.shouldOverrideUrlLoading(wVUCWebView2, str);
            wVUCWebView2.pageTracker.blockURLStart();
            try {
                if ((webView instanceof IWVWebView) && aet.c() != null && aet.c().isOpenURLIntercept()) {
                    if (aet.c().isNeedupdateURLRule(false)) {
                        aet.c().updateURLRule();
                    }
                    if (aet.c().shouldOverrideUrlLoading(context, (IWVWebView) webView, str)) {
                        m.c(TAG, "intercept url : " + str);
                        ((WVUCWebView) webView).pageTracker.blockURLEnd();
                        return true;
                    }
                }
            } catch (Exception e3) {
                m.e(TAG, "shouldOverrideUrlLoading: doFilter error, " + e3.getMessage());
            }
            wVUCWebView2.pageTracker.blockURLEnd();
            if (z) {
                UCNetworkDelegate.getInstance().onUrlChange(wVUCWebView2, str);
                wVUCWebView2.setCachedUrl(str);
            }
            try {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("userAgent", webView.getSettings().getUserAgentString());
                com.taobao.weaver.prefetch.e.a().a(str, hashMap2);
            } catch (Throwable th3) {
                m.b(TAG, "failed to call prefetch: " + th3.getMessage(), th3, new Object[0]);
                th3.printStackTrace();
            }
            wVUCWebView2.updateCurId();
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override // com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e30657bb", new Object[]{this, webView, webResourceRequest})).booleanValue();
        }
        try {
            if (webView instanceof WVUCWebView) {
                ((WVUCWebView) webView).getWebViewContext().getWebViewPageModel().onPropertyIfAbsent("H5_pageRedirect", true);
            }
        } catch (Exception e) {
            m.e(TAG, "report H5_pageRedirect error: " + android.taobao.windvane.util.a.a(e));
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.uc.webview.export.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        IpChange ipChange = $ipChange;
        int i = 3;
        if (ipChange instanceof IpChange) {
            return (WebResourceResponse) ipChange.ipc$dispatch("992b8103", new Object[]{this, webView, webResourceRequest});
        }
        if (webView == null || webView.getCurrentViewCoreType() != 3) {
            return null;
        }
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            m.e(TAG, "shouldInterceptRequest, invalid request.");
            return null;
        }
        String uri = webResourceRequest.getUrl().toString();
        if (WVUCPrecacheManager.getInstance().hasPrecacheDoc(uri)) {
            WVUCPrecacheManager.getInstance().clearPrecacheDoc(uri);
            return null;
        } else if (!(webView instanceof IWVWebView)) {
            return null;
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!(webView instanceof WVUCWebView) || ((WVUCWebView) webView).getUCExtension() == null) {
                i = 2;
            }
            WebResourceResponse shouldInterceptRequestInternal = shouldInterceptRequestInternal(webView, uri, aem.a().a(1008, (IWVWebView) webView, uri, webResourceRequest.getRequestHeaders(), Integer.valueOf(i)));
            if (uri != null && uri.contains("x-ssr=true")) {
                com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                jSONObject.put("url", (Object) uri);
                jSONObject.put("cost", (Object) Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                android.taobao.windvane.monitor.a.commitSuccess("ssrInterceptCost", jSONObject.toJSONString());
            }
            return shouldInterceptRequestInternal;
        }
    }

    @Override // com.uc.webview.export.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            return (WebResourceResponse) ipChange.ipc$dispatch("823f4abd", new Object[]{this, webView, str});
        }
        if (webView == null || webView.getCurrentViewCoreType() == 3 || !(webView instanceof IWVWebView)) {
            return null;
        }
        if ((webView instanceof WVUCWebView) && ((WVUCWebView) webView).getUCExtension() != null) {
            i = 3;
        }
        return shouldInterceptRequestInternal(webView, str, aem.a().a(1004, (IWVWebView) webView, str, Integer.valueOf(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0387 A[Catch: Throwable -> 0x0414, TryCatch #6 {Throwable -> 0x0414, blocks: (B:90:0x02eb, B:92:0x0307, B:94:0x0311, B:95:0x032a, B:107:0x0370, B:109:0x037a, B:111:0x0387, B:115:0x03c8, B:119:0x03ed, B:121:0x03f6, B:122:0x03f8, B:118:0x03ea, B:112:0x03af, B:96:0x032b, B:98:0x0331, B:100:0x034d, B:101:0x0368), top: B:155:0x02eb, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03af A[Catch: Throwable -> 0x0414, TRY_LEAVE, TryCatch #6 {Throwable -> 0x0414, blocks: (B:90:0x02eb, B:92:0x0307, B:94:0x0311, B:95:0x032a, B:107:0x0370, B:109:0x037a, B:111:0x0387, B:115:0x03c8, B:119:0x03ed, B:121:0x03f6, B:122:0x03f8, B:118:0x03ea, B:112:0x03af, B:96:0x032b, B:98:0x0331, B:100:0x034d, B:101:0x0368), top: B:155:0x02eb, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03f6 A[Catch: Throwable -> 0x0414, TryCatch #6 {Throwable -> 0x0414, blocks: (B:90:0x02eb, B:92:0x0307, B:94:0x0311, B:95:0x032a, B:107:0x0370, B:109:0x037a, B:111:0x0387, B:115:0x03c8, B:119:0x03ed, B:121:0x03f6, B:122:0x03f8, B:118:0x03ea, B:112:0x03af, B:96:0x032b, B:98:0x0331, B:100:0x034d, B:101:0x0368), top: B:155:0x02eb, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x032b A[Catch: all -> 0x036b, TRY_ENTER, TryCatch #6 {Throwable -> 0x0414, blocks: (B:90:0x02eb, B:92:0x0307, B:94:0x0311, B:95:0x032a, B:107:0x0370, B:109:0x037a, B:111:0x0387, B:115:0x03c8, B:119:0x03ed, B:121:0x03f6, B:122:0x03f8, B:118:0x03ea, B:112:0x03af, B:96:0x032b, B:98:0x0331, B:100:0x034d, B:101:0x0368), top: B:155:0x02eb, inners: #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.uc.webview.export.WebResourceResponse shouldInterceptRequestInternal(com.uc.webview.export.WebView r16, java.lang.String r17, tb.ael r18) {
        /*
            Method dump skipped, instructions count: 1221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.WVUCWebViewClient.shouldInterceptRequestInternal(com.uc.webview.export.WebView, java.lang.String, tb.ael):com.uc.webview.export.WebResourceResponse");
    }

    @Override // com.uc.webview.export.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
            return;
        }
        if (webView instanceof e) {
            n falcoSpan = ((e) webView).getFalcoSpan();
            f.a(falcoSpan, "onReceivedSslError " + sslError.toString());
        }
        String sslError2 = sslError.toString();
        String url = sslError.getUrl();
        m.e(TAG, "onReceivedSslError  url: " + url + "errorMsg:" + sslError2);
        HashMap hashMap = new HashMap(1);
        hashMap.put("url", url);
        hashMap.put("msg", "ssl error: " + sslError2);
        WVUCWebView wVUCWebView = (WVUCWebView) webView;
        wVUCWebView.wpData.addProbableReason(hashMap.toString());
        String url2 = webView.getUrl();
        if (webView instanceof WVUCWebView) {
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("cause", "SSL_ERROR");
            hashMap2.put("url", url2);
            wVUCWebView.onMessage(402, hashMap2);
        }
        if (webView instanceof IWVWebView) {
            aem.a().a(1006, (IWVWebView) webView, url2, sslError2);
        }
        if (o.getErrorMonitor() != null) {
            o.getErrorMonitor().didOccurNativeError(url2, 1006, sslError2);
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }
}
