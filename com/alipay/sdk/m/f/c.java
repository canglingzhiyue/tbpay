package com.alipay.sdk.m.f;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.taobao.windvane.export.adapter.ILocalizationService;
import mtopsdk.common.util.StringUtils;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.ImageView;
import com.alipay.sdk.auth.widget.WebViewWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
import tb.bgy;

/* loaded from: classes3.dex */
public class c extends com.alipay.sdk.m.f.b implements WebViewWindow.e, WebViewWindow.f, WebViewWindow.g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String A = "pushWindow";
    public static final String B = "h5JsFuncCallback";
    public static final String C = "sdkInfo";
    private static final String k = "sdk_result_code:";
    public static final String l = "alipayjsbridge://";
    public static final String m = "onBack";
    public static final String n = "setTitle";
    public static final String o = "onRefresh";
    public static final String p = "showBackButton";
    public static final String q = "onExit";
    public static final String r = "onLoadJs";
    public static final String s = "callNativeFunc";
    public static final String t = "back";
    public static final String u = "title";
    public static final String v = "refresh";
    public static final String w = "backButton";
    public static final String x = "refreshButton";
    public static final String y = "exit";
    public static final String z = "action";
    private boolean d;
    private String e;
    private boolean f;
    private final com.alipay.sdk.m.d.a g;
    private boolean h;
    private WebViewWindow i;
    private final com.alipay.sdk.m.f.d j;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c.this.f6160a.finish();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebViewWindow f6162a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WebViewWindow webViewWindow) {
            super(null);
            this.f6162a = webViewWindow;
        }

        @Override // com.alipay.sdk.m.f.c.e, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            this.f6162a.b();
            c.a(c.this, false);
        }
    }

    /* renamed from: com.alipay.sdk.m.f.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0200c extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebViewWindow f6163a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0200c(WebViewWindow webViewWindow, String str) {
            super(null);
            this.f6163a = webViewWindow;
            this.b = str;
        }

        @Override // com.alipay.sdk.m.f.c.e, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            c.this.removeView(this.f6163a);
            c.a(c.this).a(this.b);
            c.a(c.this, false);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f6164a;
        public final /* synthetic */ SslErrorHandler b;

        /* loaded from: classes3.dex */
        public class a implements DialogInterface.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                d.this.b.cancel();
                com.alipay.sdk.m.b.a.a(com.alipay.sdk.m.b.a.a());
                d.this.f6164a.finish();
            }
        }

        public d(Activity activity, SslErrorHandler sslErrorHandler) {
            this.f6164a = activity;
            this.b = sslErrorHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                com.alipay.sdk.m.f.a.a(this.f6164a, "安全警告", "安全连接证书校验无效，将无法保证访问数据的安全性，请安装支付宝后重试。", ILocalizationService.CONFIRM, new a(), null, null);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class e implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    public c(Activity activity, com.alipay.sdk.m.d.a aVar, String str) {
        super(activity, str);
        this.d = true;
        this.e = "GET";
        this.f = false;
        this.i = null;
        this.j = new com.alipay.sdk.m.f.d();
        this.g = aVar;
        f();
    }

    public static /* synthetic */ boolean a(c cVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe8aa96d", new Object[]{cVar, new Boolean(z2)})).booleanValue();
        }
        cVar.f = z2;
        return z2;
    }

    private synchronized boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (this.j.b()) {
            this.f6160a.finish();
        } else {
            this.f = true;
            WebViewWindow webViewWindow = this.i;
            this.i = this.j.c();
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new b(webViewWindow));
            webViewWindow.setAnimation(translateAnimation);
            removeView(webViewWindow);
            addView(this.i);
        }
        return true;
    }

    private synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Activity activity = this.f6160a;
        WebViewWindow webViewWindow = this.i;
        if (activity == null || webViewWindow == null) {
            return;
        }
        if (this.d) {
            activity.finish();
        } else {
            webViewWindow.a("javascript:window.AlipayJSBridge.callListener('h5BackAction');");
        }
    }

    private synchronized boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        try {
            WebViewWindow webViewWindow = new WebViewWindow(this.f6160a);
            this.i = webViewWindow;
            webViewWindow.setChromeProxy(this);
            this.i.setWebClientProxy(this);
            this.i.setWebEventProxy(this);
            addView(this.i);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        WebViewWindow webViewWindow = this.i;
        if (webViewWindow == null) {
            return;
        }
        webViewWindow.getWebView().loadUrl("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
    }

    private synchronized void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        WebView webView = this.i.getWebView();
        if (webView.canGoBack()) {
            webView.goBack();
            return;
        }
        com.alipay.sdk.m.f.d dVar = this.j;
        if (dVar != null && !dVar.b()) {
            d();
        } else {
            a(false);
        }
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.sdk.m.f.b
    public synchronized boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Activity activity = this.f6160a;
        if (activity == null) {
            return true;
        }
        WebViewWindow webViewWindow = this.i;
        if (webViewWindow != null && webViewWindow.getWebView() != null) {
            if (webViewWindow.getWebView().canGoBack()) {
                if (h()) {
                    com.alipay.sdk.m.b.b a2 = com.alipay.sdk.m.b.b.a(com.alipay.sdk.m.b.b.NETWORK_ERROR.b());
                    com.alipay.sdk.m.b.a.a(com.alipay.sdk.m.b.a.a(a2.b(), a2.a(), ""));
                    activity.finish();
                } else {
                    webViewWindow.getWebView().goBack();
                }
            } else {
                com.alipay.sdk.m.b.a.a(com.alipay.sdk.m.b.a.a());
                activity.finish();
            }
            return true;
        }
        activity.finish();
        return true;
    }

    @Override // com.alipay.sdk.m.f.b
    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.i.b();
        this.j.a();
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.h;
    }

    @Override // android.view.ViewGroup
    public synchronized boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return this.f || super.onInterceptTouchEvent(motionEvent);
    }

    public static /* synthetic */ WebViewWindow a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebViewWindow) ipChange.ipc$dispatch("7a4e99c1", new Object[]{cVar}) : cVar.i;
    }

    public synchronized void a(String str, String str2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z2)});
            return;
        }
        this.e = str2;
        this.i.getTitle().setText(str);
        this.d = z2;
    }

    @Override // com.alipay.sdk.auth.widget.WebViewWindow.e
    public synchronized void c(WebViewWindow webViewWindow, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146b680a", new Object[]{this, webViewWindow, str});
            return;
        }
        if (!str.startsWith("http") && !webViewWindow.getUrl().endsWith(str)) {
            this.i.getTitle().setText(str);
        }
    }

    private synchronized void a(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
            return;
        }
        com.alipay.sdk.m.b.a.a(z2);
        this.f6160a.finish();
    }

    @Override // com.alipay.sdk.m.f.b
    public synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if ("POST".equals(this.e)) {
            this.i.a(str, (byte[]) null);
        } else {
            this.i.a(str);
        }
        com.alipay.sdk.m.f.b.a(this.i.getWebView());
    }

    @Override // com.alipay.sdk.auth.widget.WebViewWindow.e
    public synchronized boolean a(WebViewWindow webViewWindow, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b532452", new Object[]{this, webViewWindow, str, str2, str3, jsPromptResult})).booleanValue();
        }
        if (str2.startsWith("<head>") && str2.contains(k)) {
            this.f6160a.runOnUiThread(new a());
        }
        jsPromptResult.cancel();
        return true;
    }

    /* loaded from: classes3.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<WebViewWindow> f6166a;
        public final String b;
        public final String c;
        public final JSONObject d;
        private boolean e = false;

        public f(WebViewWindow webViewWindow, String str, String str2, JSONObject jSONObject) {
            this.f6166a = new WeakReference<>(webViewWindow);
            this.b = str;
            this.c = str2;
            this.d = jSONObject;
        }

        public void a(JSONObject jSONObject) {
            WebViewWindow webViewWindow;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
            } else if (this.e || (webViewWindow = (WebViewWindow) com.alipay.sdk.m.e.e.a(this.f6166a)) == null) {
            } else {
                this.e = true;
                webViewWindow.a(String.format("javascript:window.AlipayJSBridge.callBackFromNativeFunc('%s','%s');", a(this.c), a(jSONObject.toString())));
            }
        }

        private static String a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : StringUtils.isEmpty(str) ? "" : str.replace("'", "");
        }
    }

    @Override // com.alipay.sdk.auth.widget.WebViewWindow.f
    public synchronized boolean d(WebViewWindow webViewWindow, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("622ae00f", new Object[]{this, webViewWindow, str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && !str.endsWith(bgy.APK_EXTENSION)) {
            g();
        }
        return false;
    }

    private synchronized boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        WebViewWindow webViewWindow = this.i;
        try {
            WebViewWindow webViewWindow2 = new WebViewWindow(this.f6160a);
            this.i = webViewWindow2;
            webViewWindow2.setChromeProxy(this);
            this.i.setWebClientProxy(this);
            this.i.setWebEventProxy(this);
            if (!StringUtils.isEmpty(str2)) {
                this.i.getTitle().setText(str2);
            }
            this.f = true;
            this.j.a(webViewWindow);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new C0200c(webViewWindow, str));
            this.i.setAnimation(translateAnimation);
            addView(this.i);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.alipay.sdk.auth.widget.WebViewWindow.f
    public synchronized boolean a(WebViewWindow webViewWindow, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78ec780c", new Object[]{this, webViewWindow, str})).booleanValue();
        }
        g();
        webViewWindow.getRefreshButton().setVisibility(0);
        return true;
    }

    @Override // com.alipay.sdk.auth.widget.WebViewWindow.f
    public synchronized boolean a(WebViewWindow webViewWindow, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a597f9d", new Object[]{this, webViewWindow, new Integer(i), str, str2})).booleanValue();
        }
        this.h = true;
        webViewWindow.getRefreshButton().setVisibility(0);
        return false;
    }

    @Override // com.alipay.sdk.auth.widget.WebViewWindow.f
    public synchronized boolean a(WebViewWindow webViewWindow, SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a6c9ac8", new Object[]{this, webViewWindow, sslErrorHandler, sslError})).booleanValue();
        }
        Activity activity = this.f6160a;
        if (activity == null) {
            return true;
        }
        activity.runOnUiThread(new d(activity, sslErrorHandler));
        return true;
    }

    private synchronized void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        char c = 3;
        int i = 4;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        WebViewWindow webViewWindow = this.i;
        if (webViewWindow == null) {
            return;
        }
        JSONObject b2 = com.alipay.sdk.m.e.e.b(str3);
        f fVar = new f(webViewWindow, str, str2, b2);
        webViewWindow.getContext();
        try {
            String str4 = fVar.b;
            switch (str4.hashCode()) {
                case 3015911:
                    if (str4.equals("back")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3127582:
                    if (str4.equals("exit")) {
                        break;
                    }
                    c = 65535;
                    break;
                case 110371416:
                    if (str4.equals("title")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1085444827:
                    if (str4.equals("refresh")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1703426986:
                    if (str4.equals("pushWindow")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1906413305:
                    if (str4.equals("backButton")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 2033767917:
                    if (str4.equals("refreshButton")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } catch (Throwable unused) {
        }
        switch (c) {
            case 0:
                if (b2.has("title")) {
                    webViewWindow.getTitle().setText(b2.optString("title", ""));
                    return;
                }
                return;
            case 1:
                webViewWindow.getWebView().reload();
                return;
            case 2:
                i();
                return;
            case 3:
                com.alipay.sdk.m.b.a.a(b2.optString("result", null));
                a(b2.optBoolean("success", false));
                return;
            case 4:
                boolean optBoolean = b2.optBoolean("show", true);
                ImageView backButton = webViewWindow.getBackButton();
                if (optBoolean) {
                    i = 0;
                }
                backButton.setVisibility(i);
                return;
            case 5:
                boolean optBoolean2 = b2.optBoolean("show", true);
                ImageView refreshButton = webViewWindow.getRefreshButton();
                if (optBoolean2) {
                    i = 0;
                }
                refreshButton.setVisibility(i);
                return;
            case 6:
                b(b2.optString("url"), b2.optString("title", ""));
                return;
            default:
                return;
        }
    }

    @Override // com.alipay.sdk.auth.widget.WebViewWindow.f
    public synchronized boolean b(WebViewWindow webViewWindow, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6abf00d", new Object[]{this, webViewWindow, str})).booleanValue();
        } else if (StringUtils.isEmpty(str)) {
            return false;
        } else {
            Activity activity = this.f6160a;
            if (activity == null) {
                return true;
            }
            if (str.startsWith(l)) {
                b(str.substring(17));
            } else if (StringUtils.equals(str, com.alipay.sdk.m.c.a.d)) {
                a(false);
            } else if (!str.startsWith(k.HTTP_PREFIX) && !str.startsWith(k.HTTPS_PREFIX)) {
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    activity.startActivity(intent);
                } catch (Throwable unused) {
                }
            } else {
                this.i.a(str);
            }
            return true;
        }
    }

    private synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        Map<String, String> c = com.alipay.sdk.m.e.e.c(str);
        if (str.startsWith("callNativeFunc")) {
            a(c.get("func"), c.get("cbId"), c.get("data"));
        } else if (str.startsWith("onBack")) {
            i();
        } else if (str.startsWith("setTitle") && c.containsKey("title")) {
            this.i.getTitle().setText(c.get("title"));
        } else if (str.startsWith("onRefresh")) {
            this.i.getWebView().reload();
        } else if (str.startsWith("showBackButton") && c.containsKey("bshow")) {
            boolean equals = StringUtils.equals("true", c.get("bshow"));
            ImageView backButton = this.i.getBackButton();
            if (!equals) {
                i = 4;
            }
            backButton.setVisibility(i);
        } else if (str.startsWith("onExit")) {
            com.alipay.sdk.m.b.a.a(c.get("result"));
            a(StringUtils.equals("true", c.get("bsucc")));
        } else {
            if (str.startsWith("onLoadJs")) {
                this.i.a("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n");
            }
        }
    }

    @Override // com.alipay.sdk.auth.widget.WebViewWindow.g
    public synchronized void a(WebViewWindow webViewWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899101be", new Object[]{this, webViewWindow});
            return;
        }
        webViewWindow.getWebView().reload();
        webViewWindow.getRefreshButton().setVisibility(4);
    }

    @Override // com.alipay.sdk.auth.widget.WebViewWindow.g
    public synchronized void b(WebViewWindow webViewWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff0b27ff", new Object[]{this, webViewWindow});
        } else {
            e();
        }
    }
}
