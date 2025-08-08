package com.taobao.android.weex_plugin.component;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.platform.JSMethod;
import com.taobao.android.weex_framework.platform.WXComponentProp;
import com.taobao.android.weex_plugin.component.webview.WXWebView;
import com.taobao.android.weex_plugin.component.webview.a;
import com.taobao.weex.common.Constants;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.util.Map;

/* loaded from: classes6.dex */
public class WebViewPlatformView extends WeexPlatformView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout mRootView;
    private com.taobao.android.weex_plugin.component.webview.a mWebView;

    public static /* synthetic */ Object ipc$super(WebViewPlatformView webViewPlatformView, String str, Object... objArr) {
        if (str.hashCode() == 577536806) {
            super.dispose();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(WebViewPlatformView webViewPlatformView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ad5f9e", new Object[]{webViewPlatformView, str, obj});
        } else {
            webViewPlatformView.fireEvent(str, obj);
        }
    }

    public static /* synthetic */ void access$100(WebViewPlatformView webViewPlatformView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3435029f", new Object[]{webViewPlatformView, str, obj});
        } else {
            webViewPlatformView.fireEvent(str, obj);
        }
    }

    public static /* synthetic */ void access$200(WebViewPlatformView webViewPlatformView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37bca5a0", new Object[]{webViewPlatformView, str, obj});
        } else {
            webViewPlatformView.fireEvent(str, obj);
        }
    }

    public static /* synthetic */ void access$300(WebViewPlatformView webViewPlatformView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4448a1", new Object[]{webViewPlatformView, str, obj});
        } else {
            webViewPlatformView.fireEvent(str, obj);
        }
    }

    public static /* synthetic */ void access$400(WebViewPlatformView webViewPlatformView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ecbeba2", new Object[]{webViewPlatformView, str, obj});
        } else {
            webViewPlatformView.fireEvent(str, obj);
        }
    }

    public WebViewPlatformView(Context context, int i) {
        super(context, i);
        this.mWebView = new WXWebView(context, "");
        this.mRootView = (FrameLayout) this.mWebView.a();
        this.mWebView.a(new a.InterfaceC0621a() { // from class: com.taobao.android.weex_plugin.component.WebViewPlatformView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_plugin.component.webview.a.InterfaceC0621a
            public void a(String str, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                } else {
                    WebViewPlatformView.access$000(WebViewPlatformView.this, str, obj);
                }
            }
        });
        this.mWebView.a(new a.c() { // from class: com.taobao.android.weex_plugin.component.WebViewPlatformView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_plugin.component.webview.a.c
            public void a(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("title", (Object) str);
                WebViewPlatformView.access$100(WebViewPlatformView.this, Constants.Event.RECEIVEDTITLE, jSONObject);
            }

            @Override // com.taobao.android.weex_plugin.component.webview.a.c
            public void b(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", (Object) str);
                WebViewPlatformView.access$200(WebViewPlatformView.this, Constants.Event.PAGESTART, jSONObject);
            }

            @Override // com.taobao.android.weex_plugin.component.webview.a.c
            public void a(String str, boolean z, boolean z2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a35a6232", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", (Object) str);
                jSONObject.put("canGoBack", (Object) Boolean.valueOf(z));
                jSONObject.put("canGoForward", (Object) Boolean.valueOf(z2));
                WebViewPlatformView.access$300(WebViewPlatformView.this, Constants.Event.PAGEFINISH, new JSONObject(jSONObject));
            }
        });
        this.mWebView.a(new a.b() { // from class: com.taobao.android.weex_plugin.component.WebViewPlatformView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_plugin.component.webview.a.b
            public void a(Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                } else {
                    WebViewPlatformView.access$400(WebViewPlatformView.this, "message", new JSONObject(map));
                }
            }
        });
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.mRootView;
    }

    @WXComponentProp(name = "src")
    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || getWebView() == null || StringUtils.isEmpty(str)) {
        } else {
            loadUrl(str);
        }
    }

    private void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else {
            getWebView().a(str);
        }
    }

    private void loadDataWithBaseURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c7d1f9", new Object[]{this, str});
        } else {
            getWebView().b(str);
        }
    }

    @JSMethod
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        } else {
            getWebView().c();
        }
    }

    @JSMethod
    public void goForward() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a026c4", new Object[]{this});
        } else {
            getWebView().e();
        }
    }

    @JSMethod
    public void goBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156bc6f6", new Object[]{this});
        } else {
            getWebView().d();
        }
    }

    @JSMethod
    public void postMessage(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b814caa", new Object[]{this, obj});
        } else {
            getWebView().a(obj);
        }
    }

    private com.taobao.android.weex_plugin.component.webview.a getWebView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_plugin.component.webview.a) ipChange.ipc$dispatch("a4fdf033", new Object[]{this}) : this.mWebView;
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        super.dispose();
        FrameLayout frameLayout = this.mRootView;
        if (frameLayout == null) {
            return;
        }
        frameLayout.removeAllViews();
        com.taobao.android.weex_plugin.component.webview.a aVar = this.mWebView;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }
}
