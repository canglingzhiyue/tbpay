package com.taobao.search.mmd.onesearch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.y;
import com.taobao.search.sf.widgets.onesearch.g;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.TBDialog;
import com.taobao.taobao.R;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebView;
import tb.kge;

/* loaded from: classes7.dex */
public class b extends WVUCWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public d f19172a;
    private int b;
    private String c;
    private int d;
    private a e;
    private long f;
    private boolean g;
    private com.taobao.search.sf.widgets.onesearch.e h;

    static {
        kge.a(-1121948402);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
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

    public static /* synthetic */ a a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b1984c69", new Object[]{bVar}) : bVar.e;
    }

    public b(Context context, d dVar) {
        super(context);
        this.b = 0;
        this.d = 0;
        this.g = true;
        this.f19172a = dVar;
    }

    public void a(com.taobao.search.sf.widgets.onesearch.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9485e6db", new Object[]{this, eVar});
        } else {
            this.h = eVar;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
            return;
        }
        this.f = System.currentTimeMillis();
        d dVar = this.f19172a;
        if (dVar != null) {
            dVar.a();
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
            return;
        }
        d dVar = this.f19172a;
        if (dVar != null) {
            dVar.c();
        }
        if (!StringUtils.isEmpty(this.c)) {
            TBS.Ext.commitEvent("Page_Webview", Constants.EventID_H5_APPCACHE, str, this.c, "" + this.b, "" + this.d);
            this.c = null;
            this.b = 0;
            this.b = 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        q.c("H5Performance", "" + this.f + " " + currentTimeMillis);
        webView.loadUrl(String.format("javascript:try{var perf=window.lib.perf;var __setTime=perf.setTime;if(__setTime&&typeof(__setTime)==\"function\"){__setTime({'event':'start','type':'page','time':%s});__setTime({'event':'onWVLoadE','type':'page','time':%s});}perf.wvSetAlbum();}catch(e){}", Long.valueOf(this.f), Long.valueOf(currentTimeMillis)));
        super.onPageFinished(webView, str);
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
            d dVar = this.f19172a;
            if (dVar != null) {
                dVar.c();
            }
        } else {
            d dVar2 = this.f19172a;
            if (dVar2 != null) {
                dVar2.b();
            }
        }
        super.onReceivedError(webView, i, str, str2);
        if (i == -2) {
            return;
        }
        TBS.Ext.commitEvent("Webview", 4, "Core_Webview", "Fail", "code:" + i + ",desc:" + str, "url=" + str2);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        q.a("SearchWebViewClient", "filterUrl: " + str);
        String b = y.b(str, "_xForceInterception");
        String b2 = y.b(str, "_xDisableInterception");
        boolean equalsIgnoreCase = com.alipay.mobile.common.logging.util.perf.Constants.VAL_YES.equalsIgnoreCase(b);
        boolean equalsIgnoreCase2 = com.alipay.mobile.common.logging.util.perf.Constants.VAL_YES.equalsIgnoreCase(b2);
        boolean equalsIgnoreCase3 = "no".equalsIgnoreCase(b);
        boolean equalsIgnoreCase4 = "no".equalsIgnoreCase(b2);
        if (equalsIgnoreCase) {
            q.j("SearchWebViewClient", "local: intercept = true");
            z = true;
        } else if (equalsIgnoreCase3) {
            q.j("SearchWebViewClient", "local: intercept = false");
            z = false;
        } else {
            z = this.g;
            q.j("SearchWebViewClient", "global: intercept = " + z);
        }
        if (equalsIgnoreCase2) {
            q.j("SearchWebViewClient", "global: new intercept = false");
            this.g = false;
        } else if (equalsIgnoreCase4) {
            q.j("SearchWebViewClient", "global: new intercept = true");
            this.g = true;
        } else {
            q.j("SearchWebViewClient", "global: new intercept = unchanged " + this.g);
        }
        if (!z) {
            return super.shouldOverrideUrlLoading(webView, a(str));
        }
        try {
            if (this.f19172a != null && this.f19172a.a(a(str))) {
                q.a("SearchWebViewClient", "common url filter, filtrate true");
                return true;
            }
            if (q.a()) {
                q.a("SearchWebViewClient", "taobao all filter false");
            }
            return super.shouldOverrideUrlLoading(webView, a(str));
        } catch (Exception unused) {
            return true;
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!r.bK()) {
            return str;
        }
        try {
            if (!StringUtils.isEmpty(str) && this.h != null) {
                Uri parse = Uri.parse(str);
                if (!StringUtils.isEmpty(parse.getQueryParameter("spm"))) {
                    return str;
                }
                String a2 = g.a(this.h.getModel());
                return !StringUtils.isEmpty(a2) ? parse.buildUpon().appendQueryParameter("spm", a2).toString() : str;
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
        } else if (webView.getRootView().getContext() instanceof Activity) {
            this.e = new a((Activity) webView.getRootView().getContext(), "警告", com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16648), sslErrorHandler, webView.getUrl());
            this.e.setPositiveButton(new View.OnClickListener() { // from class: com.taobao.search.mmd.onesearch.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    b.a(b.this).b();
                    b.a(b.this).dismiss();
                }
            });
            this.e.setNegativeButton(new View.OnClickListener() { // from class: com.taobao.search.mmd.onesearch.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    b.a(b.this).a();
                    b.a(b.this).dismiss();
                }
            });
            if (this.e.isShowing()) {
                return;
            }
            this.e.show();
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
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
            this.c = str;
            this.b++;
        } else if (!StringUtils.isEmpty(this.c)) {
            this.d++;
        }
        super.onLoadResource(webView, str);
    }

    /* loaded from: classes7.dex */
    public class a extends TBDialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private SslErrorHandler b;
        private String c;

        static {
            kge.a(998828606);
        }

        public a(Activity activity, String str, String str2, SslErrorHandler sslErrorHandler, String str3) {
            super(activity, str, str2);
            this.b = sslErrorHandler;
            this.c = str3;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            TBS.Ext.commitEvent("onReceivedSslError", 26667, "doCanceled-" + this.c);
            this.b.cancel();
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            TBS.Ext.commitEvent("onReceivedSslError", 26667, "doProceed-" + this.c);
            this.b.proceed();
        }
    }
}
