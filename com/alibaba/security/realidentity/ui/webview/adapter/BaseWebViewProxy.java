package com.alibaba.security.realidentity.ui.webview.adapter;

import android.view.View;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class BaseWebViewProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract boolean canBack();

    public abstract void destroy();

    public abstract void evaluateJavascript(String str, ValueCallback<String> valueCallback);

    public abstract void fireEvent(String str, String str2);

    public abstract String getOriginalUrl();

    public abstract int getProgress();

    public abstract String getUrl();

    public abstract String getUserAgentString();

    public abstract View getWebView();

    public abstract void goBack();

    public abstract void loadUrl(String str);

    public abstract void requestLayoutParams(int i);

    public abstract void resumeTimers();

    public abstract void setUseWideViewPort(boolean z);

    public abstract void setUserAgentString(String str);

    public abstract void setWebViewClient(IWebViewClientCallback iWebViewClientCallback);

    public abstract void showLoadingView();
}
