package android.taobao.windvane.extra.jsbridge;

import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.s;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.uc.webview.export.AsyncJavascriptInterface;
import com.uc.webview.export.JavascriptInterface;
import com.uc.webview.export.extension.JSInterface;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.ecg;
import tb.kge;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J0\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0007J>\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0010\u001a\u00060\u0011R\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Landroid/taobao/windvane/extra/jsbridge/CommonAsyncJSAPIBridge;", "Lcom/uc/webview/export/extension/JSInterface;", "Ljava/io/Serializable;", ecg.UMB_FEATURE_WEB_VIEW, "Landroid/taobao/windvane/extra/uc/WVUCWebView;", "(Landroid/taobao/windvane/extra/uc/WVUCWebView;)V", "getWebView", "()Landroid/taobao/windvane/extra/uc/WVUCWebView;", "invokeNativeMethod", "", DxContainerActivity.PARAMS_NAMESPACE, "", FluidException.METHOD_NAME, "methodParam", "callToken", "sendJSResult", "targetJSRoute", "Lcom/uc/webview/export/extension/JSInterface$JSRoute;", "success", "", "result", "keepAlive", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class CommonAsyncJSAPIBridge extends JSInterface implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final WVUCWebView webView;

    static {
        kge.a(-677902205);
        kge.a(1028243835);
    }

    public static /* synthetic */ Object ipc$super(CommonAsyncJSAPIBridge commonAsyncJSAPIBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public CommonAsyncJSAPIBridge(WVUCWebView webView) {
        q.d(webView, "webView");
        this.webView = webView;
    }

    public final WVUCWebView getWebView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebView) ipChange.ipc$dispatch("151ffdcd", new Object[]{this}) : this.webView;
    }

    @AsyncJavascriptInterface
    @JavascriptInterface
    public final void invokeNativeMethod(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f9221f", new Object[]{this, str, str2, str3, str4});
        } else if (this.webView.isDestroied()) {
        } else {
            final CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 = new CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1(this, str, str2, str3, str4, getJSRoute(), getUrl());
            s asyncApiProxy = this.webView.getAsyncApiProxy();
            if (asyncApiProxy == null) {
                return;
            }
            asyncApiProxy.apiCall(new Runnable() { // from class: android.taobao.windvane.extra.jsbridge.CommonAsyncJSAPIBridge$sam$java_lang_Runnable$0
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        q.b(ruk.this.mo2427invoke(), "invoke(...)");
                    }
                }
            });
        }
    }

    public static /* synthetic */ void sendJSResult$default(CommonAsyncJSAPIBridge commonAsyncJSAPIBridge, String str, JSInterface.JSRoute jSRoute, boolean z, String str2, boolean z2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819e0c48", new Object[]{commonAsyncJSAPIBridge, str, jSRoute, new Boolean(z), str2, new Boolean(z2), new Integer(i), obj});
        } else {
            commonAsyncJSAPIBridge.sendJSResult(str, jSRoute, (i & 4) != 0 ? true : z, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? false : z2);
        }
    }

    private final void sendJSResult(String str, JSInterface.JSRoute jSRoute, boolean z, String str2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e690c6e", new Object[]{this, str, jSRoute, new Boolean(z), str2, new Boolean(z2)});
        } else if (this.webView.isDestroied()) {
        } else {
            jSRoute.send(new Object[]{Boolean.valueOf(z), str2, str, Boolean.valueOf(z2)}, null);
        }
    }
}
