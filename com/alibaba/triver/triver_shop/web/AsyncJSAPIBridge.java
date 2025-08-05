package com.alibaba.triver.triver_shop.web;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.AsyncJavascriptInterface;
import com.uc.webview.export.JavascriptInterface;
import com.uc.webview.export.extension.JSInterface;
import java.io.Serializable;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class AsyncJSAPIBridge extends JSInterface implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ShopBaseWebView webView;

    static {
        kge.a(1453360993);
        kge.a(1028243835);
    }

    public static /* synthetic */ Object ipc$super(AsyncJSAPIBridge asyncJSAPIBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public AsyncJSAPIBridge(ShopBaseWebView webView) {
        q.d(webView, "webView");
        this.webView = webView;
    }

    public final ShopBaseWebView getWebView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopBaseWebView) ipChange.ipc$dispatch("463804cc", new Object[]{this}) : this.webView;
    }

    @AsyncJavascriptInterface
    @JavascriptInterface
    public final void invokeNativeMethod(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f9221f", new Object[]{this, str, str2, str3, str4});
            return;
        }
        this.webView.setApiCallByAsyncBridge(true);
        this.webView.apiCall(new AsyncJSAPIBridge$invokeNativeMethod$1(this, str, str2, str3, str4, getJSRoute()));
    }

    public static /* synthetic */ void sendJSResult$default(AsyncJSAPIBridge asyncJSAPIBridge, String str, JSInterface.JSRoute jSRoute, boolean z, String str2, String str3, String str4, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6599390c", new Object[]{asyncJSAPIBridge, str, jSRoute, new Boolean(z), str2, str3, str4, new Integer(i), obj});
        } else {
            asyncJSAPIBridge.sendJSResult(str, jSRoute, (i & 4) != 0 ? true : z, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4);
        }
    }

    private final void sendJSResult(String str, JSInterface.JSRoute jSRoute, boolean z, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("319c253a", new Object[]{this, str, jSRoute, new Boolean(z), str2, str3, str4});
            return;
        }
        String[] strArr = new String[5];
        strArr[0] = z ? "true" : "false";
        String str5 = "";
        if (str2 == null) {
            str2 = str5;
        }
        strArr[1] = str2;
        if (str3 == null) {
            str3 = str5;
        }
        strArr[2] = str3;
        if (str4 != null) {
            str5 = str4;
        }
        strArr[3] = str5;
        strArr[4] = str;
        jSRoute.send(strArr, null);
    }
}
