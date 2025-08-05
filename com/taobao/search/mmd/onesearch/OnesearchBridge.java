package com.taobao.search.mmd.onesearch;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class OnesearchBridge extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(874112791);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String action, String params, WVCallBackContext callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, action, params, callback})).booleanValue();
        }
        q.c(action, "action");
        q.c(params, "params");
        q.c(callback, "callback");
        IWVWebView webview = callback.getWebview();
        if (!(webview instanceof SearchWidgetUCWebView)) {
            webview = null;
        }
        SearchWidgetUCWebView searchWidgetUCWebView = (SearchWidgetUCWebView) webview;
        if (searchWidgetUCWebView == null) {
            callback.error("仅支持在搜索webView中调用");
            return false;
        }
        Object tag = searchWidgetUCWebView.getTag(R.id.tbsearch_webview_action_performer);
        if (!(tag instanceof f)) {
            tag = null;
        }
        f fVar = (f) tag;
        if (fVar == null) {
            callback.error("无法获取action performer");
            return false;
        }
        fVar.a(action, params, callback);
        return false;
    }
}
