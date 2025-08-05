package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.RenderProcessGoneDetail;

/* loaded from: classes8.dex */
public class sgl extends WVUCWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private sgk f33551a;

    static {
        kge.a(1357464146);
    }

    public static /* synthetic */ Object ipc$super(sgl sglVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1456974963:
                super.onReceivedHttpError((WebView) objArr[0], (WebResourceRequest) objArr[1], (WebResourceResponse) objArr[2]);
                return null;
            case -1262473342:
                super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                return null;
            case -623958539:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
            case -79464220:
                return new Boolean(super.onRenderProcessGone((WebView) objArr[0], (RenderProcessGoneDetail) objArr[1]));
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

    public sgl(Context context) {
        super(context);
    }

    public void a(sgk sgkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feaf56e1", new Object[]{this, sgkVar});
        } else {
            this.f33551a = sgkVar;
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        if (super.shouldOverrideUrlLoading(webView, str)) {
            return true;
        }
        WebView.HitTestResult hitTestResult = webView.getHitTestResult();
        int type = hitTestResult != null ? hitTestResult.getType() : 0;
        if (type > 0) {
            try {
                return Nav.from(ab.a()).toUri(str);
            } catch (Exception unused) {
                return true;
            }
        }
        if (type == 0) {
        }
        return false;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
            return;
        }
        super.onPageStarted(webView, str, bitmap);
        ogg.b("[webcomponent]-client", "OverrideUrlWebViewClient onPageStarted url: " + str);
        if (TextUtils.isEmpty(str) || "about:blank".equals(str)) {
            return;
        }
        this.f33551a.a(str);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
            return;
        }
        ogg.b("[webcomponent]-client", "OverrideUrlWebViewClient onPageFinished url: " + str);
        this.f33551a.b(str);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
            return;
        }
        super.onReceivedError(webView, i, str, str2);
        ogg.b("[webcomponent]-client", "OverrideUrlWebViewClient onReceivedError failingUrl: " + str2);
        sgk sgkVar = this.f33551a;
        sgkVar.c("errorCode: " + i + " desc: " + str);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        this.f33551a.c(sslError.toString());
    }

    @Override // com.uc.webview.export.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a928538d", new Object[]{this, webView, webResourceRequest, webResourceResponse});
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        ogg.a("[webcomponent]-client", "webResourceResponse statusCode: " + webResourceResponse.getStatusCode() + " data: " + webResourceResponse.getData());
        this.f33551a.c("http error");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb4378e4", new Object[]{this, webView, renderProcessGoneDetail})).booleanValue();
        }
        ogg.a("[webcomponent]-client", "onRenderProcessGone webview:" + webView + ", crash:" + renderProcessGoneDetail.didCrash() + ", priority:" + renderProcessGoneDetail.rendererPriorityAtExit());
        this.f33551a.a(renderProcessGoneDetail);
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }
}
