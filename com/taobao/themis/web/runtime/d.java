package com.taobao.themis.web.runtime;

import android.app.Activity;
import android.taobao.windvane.extra.performance.WVWebViewPageModel;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.extension.page.ac;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.web.runtime.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.dqn;
import tb.hvw;
import tb.kge;
import tb.tmg;
import tb.tmh;
import tb.tmj;

/* loaded from: classes9.dex */
public final class d implements ac, com.taobao.themis.kernel.extension.page.tab.d, com.taobao.themis.web.runtime.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a */
    private tmg f22899a;
    private tmj b;
    private WVUCWebView c;
    private tmh d;
    private final ITMSPage e;
    private boolean f;

    static {
        kge.a(971562340);
        kge.a(16097565);
        kge.a(2002799176);
        kge.a(-1179155366);
        Companion = new a(null);
    }

    public d(ITMSPage page) {
        q.d(page, "page");
        this.e = page;
    }

    public static final /* synthetic */ void a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73c5f37", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.f = z;
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a.C0982a.c(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        a.C0982a.a(this, page);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            a.C0982a.a(this);
        }
    }

    public final ITMSPage k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("d384eccf", new Object[]{this}) : this.e;
    }

    @Override // tb.iuz
    public void a(tmj listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b84827", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        this.b = listener;
    }

    @Override // com.taobao.themis.web.runtime.a
    public void a(WVUCWebView webView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d1e4c9", new Object[]{this, webView});
            return;
        }
        q.d(webView, "webView");
        this.c = webView;
    }

    @Override // com.taobao.themis.web.runtime.a
    public tmg a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tmg) ipChange.ipc$dispatch("f0b05d0", new Object[]{this}) : this.f22899a;
    }

    @Override // com.taobao.themis.web.runtime.a
    public tmj b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tmj) ipChange.ipc$dispatch("16bcab8c", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.themis.web.runtime.a
    public tmh d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tmh) ipChange.ipc$dispatch("261ff60c", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.themis.web.runtime.a
    public Map<String, Long> e() {
        hvw webViewContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this});
        }
        WVUCWebView wVUCWebView = this.c;
        ConcurrentHashMap<String, Long> concurrentHashMap = null;
        dqn webViewPageModel = (wVUCWebView == null || (webViewContext = wVUCWebView.getWebViewContext()) == null) ? null : webViewContext.getWebViewPageModel();
        if (!(webViewPageModel instanceof WVWebViewPageModel)) {
            webViewPageModel = null;
        }
        WVWebViewPageModel wVWebViewPageModel = (WVWebViewPageModel) webViewPageModel;
        if (wVWebViewPageModel != null) {
            concurrentHashMap = wVWebViewPageModel.getStageMap();
        }
        return concurrentHashMap;
    }

    @Override // com.taobao.themis.web.runtime.a
    public Map<String, Object> f() {
        hvw webViewContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this});
        }
        WVUCWebView wVUCWebView = this.c;
        ConcurrentHashMap<String, Object> concurrentHashMap = null;
        dqn webViewPageModel = (wVUCWebView == null || (webViewContext = wVUCWebView.getWebViewContext()) == null) ? null : webViewContext.getWebViewPageModel();
        if (!(webViewPageModel instanceof WVWebViewPageModel)) {
            webViewPageModel = null;
        }
        WVWebViewPageModel wVWebViewPageModel = (WVWebViewPageModel) webViewPageModel;
        if (wVWebViewPageModel != null) {
            concurrentHashMap = wVWebViewPageModel.getPropertyMap();
        }
        return concurrentHashMap;
    }

    @Override // com.taobao.themis.kernel.extension.page.tab.d
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView == null) {
            return;
        }
        wVUCWebView.evaluateJavascript("window.scrollTo({top: 0, left: 0, behavior: 'smooth'});", null);
    }

    @Override // com.taobao.themis.kernel.extension.page.ac
    public void g() {
        final View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView == null || wVUCWebView.isDestroied() || (view = wVUCWebView.getView()) == null) {
            return;
        }
        view.requestFocus();
        wVUCWebView.evaluateJavascript("(function() { return !!document.querySelector('[autofocus]'); })();", new ValueCallback<String>() { // from class: com.taobao.themis.web.runtime.WebPageExtension$requestFocus$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                    return;
                }
                try {
                    f b = d.this.k().b();
                    if (q.a((Object) "true", (Object) str)) {
                        Activity o = b.o();
                        if (o == null) {
                            return;
                        }
                        TMSLogger.a("WebViewAutofocus", "Page contains an element with autofocus.");
                        Object systemService = o.getSystemService("input_method");
                        if (systemService == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        }
                        ((InputMethodManager) systemService).showSoftInput(view, 1);
                        d.a(d.this, true);
                        return;
                    }
                    TMSLogger.a("WebViewAutofocus", "No autofocus element on the page.");
                } catch (Exception unused) {
                    TMSLogger.d("WebViewAutofocus", "WebViewAutofocus error");
                }
            }
        });
    }

    @Override // com.taobao.themis.kernel.extension.page.ac
    public void h() {
        WVUCWebView wVUCWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!this.f || (wVUCWebView = this.c) == null) {
        } else {
            try {
                if (wVUCWebView.isDestroied()) {
                    return;
                }
                View view = wVUCWebView.getView();
                if (view != null) {
                    view.clearFocus();
                    Object systemService = view.getContext().getSystemService("input_method");
                    if (systemService == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    }
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
                this.f = false;
            } catch (Exception unused) {
                TMSLogger.d("WebPageExtension", "clearFocus error");
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(220093356);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
