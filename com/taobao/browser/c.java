package com.taobao.browser;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.support.v4.view.ViewCompat;
import android.taobao.windvane.config.j;
import android.taobao.windvane.config.n;
import android.taobao.windvane.config.p;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.preRender.BasePreInitManager;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import anet.channel.util.HttpConstant;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.android.app.pay.H5PayInterceptor;
import com.alipay.android.msp.model.H5PayCallback;
import com.alipay.android.msp.model.H5PayResultModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.urlFilter.UrlFilter;
import com.taobao.browser.urlFilter.UrlResourceFilter;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.browser.utils.k;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.tao.shop.common.ShopUrlFilter;
import com.taobao.tao.util.Constants;
import com.taobao.taobao.R;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebView;
import com.ut.mini.UTAnalytics;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import tb.alj;
import tb.kfb;
import tb.kfc;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class c extends com.taobao.browser.webview.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public UrlFilter f16759a;
    public List<UrlResourceFilter> b;
    private int c;
    private String d;
    private int e;
    @Deprecated
    private boolean f;
    private String g;
    private String h;
    private boolean i;
    private long j;
    private String k;
    private boolean l;

    static {
        kge.a(-1772771969);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2109781315:
                return super.shouldInterceptRequest((WebView) objArr[0], (String) objArr[1]);
            case -1262473342:
                super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                return null;
            case -1171743094:
                super.onLoadResource((WebView) objArr[0], (String) objArr[1]);
                return null;
            case -623958539:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
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

    public static /* synthetic */ void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98e69ace", new Object[]{cVar});
        } else {
            cVar.a();
        }
    }

    public c(Context context, UrlFilter urlFilter) {
        super(context);
        this.c = 0;
        this.e = 0;
        this.f = false;
        this.g = "0";
        this.h = "";
        this.i = false;
        this.j = 0L;
        this.k = "";
        this.l = false;
        this.f16759a = urlFilter;
        this.b = new ArrayList();
    }

    public void a(UrlResourceFilter urlResourceFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("503cbfa4", new Object[]{this, urlResourceFilter});
        } else {
            this.b.add(urlResourceFilter);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse doFilter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebResourceResponse) ipChange.ipc$dispatch("823f4abd", new Object[]{this, webView, str});
        }
        if (this.j == 0) {
            this.j = System.currentTimeMillis();
            kfc.a("exchain.FullTrace", "H5 start start: " + this.j);
        }
        for (UrlResourceFilter urlResourceFilter : this.b) {
            if (urlResourceFilter.match(str) && (doFilter = urlResourceFilter.doFilter(str)) != null) {
                return doFilter;
            }
        }
        return super.shouldInterceptRequest(webView, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011f A[Catch: Throwable -> 0x0167, TryCatch #1 {Throwable -> 0x0167, blocks: (B:15:0x004b, B:17:0x0053, B:19:0x0057, B:21:0x0065, B:24:0x0072, B:26:0x00f5, B:29:0x010e, B:31:0x011f, B:32:0x012e, B:34:0x0138, B:36:0x0141, B:38:0x0149, B:25:0x00a4, B:39:0x0164), top: B:71:0x004b }] */
    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPageStarted(com.uc.webview.export.WebView r11, final java.lang.String r12, android.graphics.Bitmap r13) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.browser.c.onPageStarted(com.uc.webview.export.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
            return;
        }
        kfc.a("exchain.FullTrace", "H5 start end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - this.j));
        this.l = true;
        this.j = 0L;
        Message obtain = Message.obtain();
        obtain.obj = str;
        obtain.what = 401;
        UrlFilter urlFilter = this.f16759a;
        if (urlFilter != null) {
            urlFilter.notifyParent(obtain);
        }
        if (!TextUtils.isEmpty(this.d)) {
            TBS.Ext.commitEvent("Page_Webview", Constants.EventID_H5_APPCACHE, str, this.d, "" + this.c, "" + this.e);
            this.d = null;
            this.c = 0;
            this.c = 0;
        }
        webView.evaluateJavascript("(function(p){if(!p||!p.timing)return;var t=p.timing,s=t.navigationStart,les=t.loadEventStart;return JSON.stringify({ngs:s,les:les})})(window.performance)", new ValueCallback<String>() { // from class: com.taobao.browser.CommonWebViewClient$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str2});
                    return;
                }
                JSONObject jSONObject = null;
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        if (str2.startsWith("\"") && str2.endsWith("\"")) {
                            str2 = str2.substring(1, str2.length() - 1);
                        }
                        jSONObject = new JSONObject(str2.replace("\\", ""));
                    }
                } catch (Exception unused) {
                }
                if (jSONObject == null) {
                    return;
                }
                com.taobao.browser.prefetch.a.a().a(jSONObject.optLong("ngs"));
                com.taobao.browser.prefetch.a.a().b(jSONObject.optLong("les"));
            }
        });
        super.onPageFinished(webView, str);
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("mt_scripts");
            URLDecoder.decode(queryParameter, "UTF-8");
            if (!TextUtils.isEmpty(queryParameter) && a(Uri.parse(queryParameter))) {
                ((WVUCWebView) webView).evaluateJavascript("(function(){const script=document.createElement('script');script.src='" + queryParameter + "';script.crossOrigin = 'anonymous';document.body.appendChild(script);})()");
            }
        } catch (Throwable unused) {
        }
        if ((webView instanceof BrowserHybridWebView) && ((BrowserHybridWebView) webView).isPreRender()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("attached", ViewCompat.isAttachedToWindow(webView));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            ((WVUCWebView) webView).fireEvent(BasePreInitManager.ONLOAD_EVENT, jSONObject.toString());
        }
        if (webView == null || !(webView.getContext() instanceof BrowserActivity)) {
            return;
        }
        kfb.a().b(BrowserUtil.a((Activity) webView.getContext()), str);
    }

    private boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{this, uri})).booleanValue();
        }
        String[] split = OrangeConfig.getInstance().getConfig("WindVane", "mt_scripts", "").split(",");
        if (split.length == 0) {
            return false;
        }
        String host = uri.getHost();
        for (String str : split) {
            if (host.endsWith(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.uc.webview.export.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf240677", new Object[]{this, webView, message, message2});
        } else {
            message2.sendToTarget();
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
            return;
        }
        if (i == -400) {
            webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
            Message obtain = Message.obtain();
            obtain.what = 401;
            UrlFilter urlFilter = this.f16759a;
            if (urlFilter != null) {
                urlFilter.notifyParent(obtain);
            }
        } else {
            super.onReceivedError(webView, i, str, str2);
        }
        if (i == -2) {
            return;
        }
        TBS.Ext.commitEvent("Webview", 4, "Core_Webview", "Fail", "code:" + i + ",desc:" + str, "url=" + str2);
    }

    @Override // com.taobao.browser.webview.a, android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        boolean a2 = a(webView, str, jSONObject);
        if (a2 && webView != null && (webView.getContext() instanceof BrowserActivity)) {
            kfb.a().a(BrowserUtil.a((Activity) webView.getContext()), webView.getOriginalUrl(), str);
        }
        try {
            jSONObject.put("url", (Object) str);
            jSONObject.put("overrideUrlLoading", (Object) Boolean.valueOf(a2));
            AppMonitor.Alarm.commitSuccess(com.taobao.browser.utils.i.KEY_MONITOR_MODULE, "shouldOverrideUrlLoading", jSONObject.toJSONString());
            TLog.loge("WindVane", "CommonWebViewClient", "shouldOverrideUrlLoading " + jSONObject.toJSONString());
        } catch (Exception unused) {
        }
        return a2;
    }

    private boolean a(final WebView webView, final String str, com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82be04f8", new Object[]{this, webView, str, jSONObject})).booleanValue();
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("url", this.k);
        alj.a().a("afc", hashMap);
        this.g = com.taobao.browser.utils.f.a("WindVane", com.taobao.browser.utils.i.TB_ALLOW_OPEN_CLIENT, "0");
        this.h = com.taobao.browser.utils.f.a("WindVane", com.taobao.browser.utils.i.TB_THIRD_MIDDLE_JUMP_REGEX, "");
        TLog.loge("BrowserActivity", "CommonWebViewClient", "shouldOverrideUrl: " + str);
        WVUCWebView wVUCWebView = (WVUCWebView) webView;
        wVUCWebView.bizCode = "";
        if (com.taobao.browser.utils.c.a(str) && this.mContext != null) {
            UTAnalytics.getInstance().getDefaultTracker().setPageStatusCode(this.mContext.get(), 1);
        }
        TBS.setH5Url(str);
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        try {
            if (parse.isHierarchical()) {
                String queryParameter = parse.getQueryParameter("hybrid");
                if ((TextUtils.isEmpty(queryParameter) || !"true".equals(queryParameter)) && ((this.f16759a != null && this.f16759a.filtrate(str)) || (com.taobao.browser.config.a.commonConfig.u && webView != null && new ShopUrlFilter().a(str, webView.getContext())))) {
                    StringBuilder sb = new StringBuilder();
                    for (StackTraceElement stackTraceElement : Looper.getMainLooper().getThread().getStackTrace()) {
                        sb.append(stackTraceElement.toString());
                        sb.append("\n");
                    }
                    jSONObject.put("reason", "filter");
                    return true;
                }
            }
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) & (!TextUtils.isEmpty(scheme)) & (!TextUtils.isEmpty(host))) {
                if (webView instanceof BrowserHybridWebView) {
                    BrowserHybridWebView browserHybridWebView = (BrowserHybridWebView) webView;
                    if (k.b(this.h, str)) {
                        browserHybridWebView.allowThirdMiddlePageJump = true;
                        browserHybridWebView.needNotiSafe = false;
                    }
                    this.i = browserHybridWebView.allowThirdMiddlePageJump;
                }
                if (android.taobao.windvane.util.e.b() && c(host)) {
                    TLog.logd("CommonWebViewClient", "is debug: " + android.taobao.windvane.util.e.b());
                    jSONObject.put("reason", "ipDebug");
                    return super.shouldOverrideUrlLoading(webView, str);
                } else if (!j.commonConfig.ac && p.c(str, (android.taobao.windvane.webview.g) webView)) {
                    String b = n.a().b();
                    if (TextUtils.isEmpty(b)) {
                        wVUCWebView.onMessage(402, str);
                    } else {
                        webView.loadUrl(b);
                    }
                    jSONObject.put("reason", "forbiddenAccessV1");
                    android.taobao.windvane.monitor.a.commitFail("SecurityBlock", 3, "shouldOverrideUrlLoading Black", str);
                    return true;
                } else {
                    int a2 = BrowserUtil.a((IWVWebView) webView, str);
                    if (a2 == 0) {
                        jSONObject.put("reason", "jaeState");
                        return true;
                    }
                    if (1 == a2) {
                        wVUCWebView.bizCode = "jae";
                    }
                    final Context currentContext = wVUCWebView.getCurrentContext();
                    if (!j.commonConfig.ac && b(webView, str) && "1".equals(this.g) && !this.i && (currentContext instanceof Activity)) {
                        new AlertDialog.Builder(currentContext).setTitle(R.string.browser_warning).setMessage(currentContext.getString(R.string.browser_tips) + scheme + HttpConstant.SCHEME_SPLIT + host).setPositiveButton(R.string.browser_open_url, new DialogInterface.OnClickListener() { // from class: com.taobao.browser.c.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    return;
                                }
                                currentContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                                WebView webView2 = webView;
                                if ((webView2 instanceof BrowserHybridWebView) && ((BrowserHybridWebView) webView2).getPageLoadCount() > 0) {
                                    return;
                                }
                                c.a(c.this);
                            }
                        }).setNegativeButton(R.string.browser_cancel, new DialogInterface.OnClickListener() { // from class: com.taobao.browser.c.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    return;
                                }
                                WebView webView2 = webView;
                                if (!(webView2 instanceof BrowserHybridWebView) || ((BrowserHybridWebView) webView2).getPageLoadCount() <= 0) {
                                    c.a(c.this);
                                } else {
                                    ((WVUCWebView) webView).refresh();
                                }
                            }
                        }).setCancelable(false).create().show();
                        jSONObject.put("reason", "forbiddenAccessV2");
                        return true;
                    }
                    if ("true".equals(OrangeConfig.getInstance().getConfig("WindVane", "alipayNative", "true"))) {
                        try {
                            if (currentContext instanceof Activity) {
                                H5PayInterceptor h5PayInterceptor = new H5PayInterceptor((Activity) currentContext);
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("user_token", Login.getSid());
                                hashMap2.put("user_token_type", "tbsid");
                                String str2 = "user_token=[" + Login.getSid() + "]; user_token_type=tbsid";
                                final JSONObject jSONObject2 = new JSONObject();
                                if (h5PayInterceptor.payInterceptorWithUrl(str, new H5PayCallback() { // from class: com.taobao.browser.c.5
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // com.alipay.android.msp.model.H5PayCallback
                                    public void onPayResult(H5PayResultModel h5PayResultModel) {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("e568f3e1", new Object[]{this, h5PayResultModel});
                                            return;
                                        }
                                        String str3 = "result code=[" + h5PayResultModel.getResultCode() + "],result url=[" + h5PayResultModel.getReturnUrl() + riy.ARRAY_END_STR;
                                        try {
                                            jSONObject2.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, true);
                                        } catch (JSONException e) {
                                            e.printStackTrace();
                                        }
                                        ((WVUCWebView) webView).fireEvent("nativePayDealt", jSONObject2.toString());
                                        final String returnUrl = h5PayResultModel.getReturnUrl();
                                        if (TextUtils.isEmpty(returnUrl)) {
                                            return;
                                        }
                                        ((Activity) currentContext).runOnUiThread(new Runnable() { // from class: com.taobao.browser.c.5.1
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                IpChange ipChange3 = $ipChange;
                                                if (ipChange3 instanceof IpChange) {
                                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                } else {
                                                    webView.loadUrl(returnUrl);
                                                }
                                            }
                                        });
                                    }
                                }, hashMap2)) {
                                    jSONObject.put("reason", "alipayNative");
                                    return true;
                                }
                                try {
                                    jSONObject2.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, false);
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                                ((WVUCWebView) webView).fireEvent("nativePayDealt", jSONObject2.toString());
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, str);
                    jSONObject.put("reason", com.taobao.android.weex_framework.util.a.ATOM_super);
                    return shouldOverrideUrlLoading;
                }
            } else if (TextUtils.isEmpty(scheme)) {
                return true;
            } else {
                jSONObject.put("reason", "nonHttp");
                android.taobao.windvane.monitor.a.commitFail("SecurityBlock", 5, "other scheme allow", str);
                try {
                    if (!super.shouldOverrideUrlLoading(webView, str)) {
                        Intent parseUri = Intent.parseUri(str, 1);
                        parseUri.setComponent(null);
                        if (Build.VERSION.SDK_INT >= 15) {
                            parseUri.setSelector(null);
                        }
                        android.taobao.windvane.monitor.a.commitFail("parseUri", 1, "parseUri", str);
                        if (webView.getContext() != null) {
                            webView.getContext().startActivity(parseUri);
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return true;
            }
        } catch (Exception e2) {
            android.taobao.util.k.a("CommonWebViewClient", "common url filter error:" + e2.getMessage());
            jSONObject.put("reason", "filterError");
            return true;
        }
    }

    @Override // com.uc.webview.export.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba289e8a", new Object[]{this, webView, str});
            return;
        }
        if (str.contains(".manifest")) {
            this.d = str;
            this.c++;
        } else if (!TextUtils.isEmpty(this.d)) {
            this.e++;
        }
        super.onLoadResource(webView, str);
    }

    @Deprecated
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
            return;
        }
        android.taobao.util.k.a("CommonWebViewClient", "ssl error :" + sslError.getUrl());
        String url = sslError.getUrl();
        if (b(url)) {
            sslErrorHandler.proceed();
            m.c("CommonWebViewClient", "url=[" + url + "] 域名在白名单里面，放行");
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        String[] split = OrangeConfig.getInstance().getConfig("WindVane", "ssl_white_list", "").split(",");
        if (split.length == 0) {
            return false;
        }
        boolean z = false;
        for (String str2 : split) {
            if (TextUtils.equals(str2, parse.getHost())) {
                z = true;
            }
        }
        return z;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1102;
        UrlFilter urlFilter = this.f16759a;
        if (urlFilter == null) {
            return;
        }
        urlFilter.notifyParent(obtain);
    }

    private boolean b(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bd541f", new Object[]{this, webView, str})).booleanValue();
        }
        if ((webView instanceof BrowserHybridWebView) && str != null) {
            BrowserHybridWebView browserHybridWebView = (BrowserHybridWebView) webView;
            browserHybridWebView.setWebviewMode(str, (android.taobao.windvane.webview.g) webView);
            if (browserHybridWebView.getWebviewMode() == -1) {
                return true;
            }
        }
        return false;
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue() : Pattern.matches("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$", str);
    }
}
