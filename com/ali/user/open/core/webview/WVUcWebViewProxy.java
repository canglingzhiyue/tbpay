package com.ali.user.open.core.webview;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class WVUcWebViewProxy implements IWebViewProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MemberUCWebView mWebView;

    static {
        kge.a(-2026192696);
        kge.a(1430237688);
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public void addBridgeObject(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4583696", new Object[]{this, str, obj});
        }
    }

    public WVUcWebViewProxy(Context context) {
        this.mWebView = new MemberUCWebView(context);
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
            return;
        }
        try {
            this.mWebView.loadUrl(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.mWebView.getUrl();
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public boolean canGoBack() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad7d9eea", new Object[]{this})).booleanValue() : this.mWebView.canGoBack();
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public void goBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156bc6f6", new Object[]{this});
        } else {
            this.mWebView.goBack();
        }
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public void resumeTimers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb9df62", new Object[]{this});
        } else {
            this.mWebView.resumeTimers();
        }
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.mWebView.onResume();
        }
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public void removeAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816149f8", new Object[]{this});
        } else {
            this.mWebView.removeAllViews();
        }
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.mWebView.destroy();
        }
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public ViewParent getParent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewParent) ipChange.ipc$dispatch("29bb769f", new Object[]{this}) : this.mWebView.getParent();
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public View getWebView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("143738ac", new Object[]{this}) : this.mWebView;
    }
}
