package com.taobao.browser.webview;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.uc.webview.export.WebView;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class a extends WVUCWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WVUCWebView f16850a;
    private com.taobao.browser.commonUrlFilter.a b;

    static {
        kge.a(247747699);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -623958539) {
            return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a(Context context) {
        super(context);
        this.f16850a = null;
        this.b = null;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        this.f16850a = (WVUCWebView) webView;
        if (!a(str)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        AdapterForTLog.loge("BrowserCommonWebViewClient", "login check success, redirect url = [" + str + riy.ARRAY_END_STR);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[Catch: Exception -> 0x00f5, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f5, blocks: (B:6:0x001c, B:8:0x0021, B:10:0x0029, B:12:0x0035, B:13:0x003b, B:15:0x003f, B:18:0x0045), top: B:41:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.browser.webview.a.a(java.lang.String):boolean");
    }
}
