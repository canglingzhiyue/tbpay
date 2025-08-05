package com.ali.user.open.cookies;

import com.ali.user.open.core.WebViewProxy;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.webview.DefaultWebViewProxy;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class CookieManagerService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private CookieManagerService() {
    }

    public static WebViewProxy getWebViewProxy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebViewProxy) ipChange.ipc$dispatch("17ce08fe", new Object[0]) : KernelContext.mWebViewProxy != null ? KernelContext.mWebViewProxy : DefaultWebViewProxy.getInstance();
    }
}
