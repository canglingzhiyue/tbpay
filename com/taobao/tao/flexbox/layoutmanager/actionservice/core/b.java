package com.taobao.tao.flexbox.layoutmanager.actionservice.core;

import android.content.Context;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IWVWebView f19961a;
    private boolean b = false;

    static {
        kge.a(-375998707);
    }

    public b(Context context) {
        if ("true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("tnode", "useucwebview", "true"))) {
            this.f19961a = new BackgroundUCWebview(context);
        } else {
            this.f19961a = new BackgroundWebview(context);
        }
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        IWVWebView iWVWebView = this.f19961a;
        if (iWVWebView instanceof BackgroundUCWebview) {
            ((BackgroundUCWebview) iWVWebView).loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else if (!(iWVWebView instanceof BackgroundWebview)) {
        } else {
            ((BackgroundWebview) iWVWebView).loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    public IWVWebView a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("9565b5d2", new Object[]{this}) : this.f19961a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }
}
