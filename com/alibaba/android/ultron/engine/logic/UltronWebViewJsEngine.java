package com.alibaba.android.ultron.engine.logic;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.JsPromptResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alibaba.android.ultron.engine.a;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import tb.bpd;
import tb.bpg;
import tb.bpk;
import tb.jpx;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class UltronWebViewJsEngine implements c<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, String> j;

    /* renamed from: a  reason: collision with root package name */
    private Context f2548a;
    private String b;
    private WebView c;
    private volatile boolean d;
    private com.alibaba.android.ultron.vfw.instance.d f;
    private a g;
    private a.b h;
    private boolean i;
    private Queue<Runnable> k = new ArrayDeque();
    private Map<String, Queue<d<JSONObject>>> l = new HashMap();
    private Handler e = new Handler(Looper.getMainLooper()) { // from class: com.alibaba.android.ultron.engine.logic.UltronWebViewJsEngine.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 10000) {
            } else {
                UltronError ultronError = new UltronError("webview js 执行超时");
                ultronError.code = bpk.ERROR_ENGINE_JS_TIMEOUT_JSI;
                UltronWebViewJsEngine.a(UltronWebViewJsEngine.this, ultronError);
            }
        }
    };

    public static /* synthetic */ a.b a(UltronWebViewJsEngine ultronWebViewJsEngine) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.b) ipChange.ipc$dispatch("f6c81912", new Object[]{ultronWebViewJsEngine}) : ultronWebViewJsEngine.h;
    }

    public static /* synthetic */ void a(UltronWebViewJsEngine ultronWebViewJsEngine, UltronError ultronError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c960fe58", new Object[]{ultronWebViewJsEngine, ultronError});
        } else {
            ultronWebViewJsEngine.a(ultronError);
        }
    }

    public static /* synthetic */ void a(UltronWebViewJsEngine ultronWebViewJsEngine, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1f3e68b", new Object[]{ultronWebViewJsEngine, runnable});
        } else {
            ultronWebViewJsEngine.a(runnable);
        }
    }

    public static /* synthetic */ void a(UltronWebViewJsEngine ultronWebViewJsEngine, String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a271518a", new Object[]{ultronWebViewJsEngine, str, dVar});
        } else {
            ultronWebViewJsEngine.a(str, dVar);
        }
    }

    public static /* synthetic */ void a(UltronWebViewJsEngine ultronWebViewJsEngine, String str, List list, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a47645f9", new Object[]{ultronWebViewJsEngine, str, list, dVar});
        } else {
            ultronWebViewJsEngine.b(str, list, dVar);
        }
    }

    public static /* synthetic */ boolean a(UltronWebViewJsEngine ultronWebViewJsEngine, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad297feb", new Object[]{ultronWebViewJsEngine, new Boolean(z)})).booleanValue();
        }
        ultronWebViewJsEngine.i = z;
        return z;
    }

    public static /* synthetic */ WebView b(UltronWebViewJsEngine ultronWebViewJsEngine) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebView) ipChange.ipc$dispatch("f6a5cd0d", new Object[]{ultronWebViewJsEngine}) : ultronWebViewJsEngine.c;
    }

    public static /* synthetic */ void c(UltronWebViewJsEngine ultronWebViewJsEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25abbd4b", new Object[]{ultronWebViewJsEngine});
        } else {
            ultronWebViewJsEngine.b();
        }
    }

    public static /* synthetic */ Map d(UltronWebViewJsEngine ultronWebViewJsEngine) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("53889a5f", new Object[]{ultronWebViewJsEngine}) : ultronWebViewJsEngine.l;
    }

    public static /* synthetic */ a e(UltronWebViewJsEngine ultronWebViewJsEngine) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b75c119d", new Object[]{ultronWebViewJsEngine}) : ultronWebViewJsEngine.g;
    }

    static {
        kge.a(1089995916);
        kge.a(2126352327);
        j = new HashMap();
    }

    public UltronWebViewJsEngine(Context context, com.alibaba.android.ultron.vfw.instance.d dVar, String str, a aVar, a.b bVar) {
        this.f2548a = context;
        this.b = str;
        this.f = dVar;
        this.g = aVar;
        this.h = bVar;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.e.sendMessageDelayed(Message.obtain(this.e, 10000), 8000L);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.e.removeMessages(10000);
        }
    }

    private void a(final UltronError ultronError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f64095d", new Object[]{this, ultronError});
            return;
        }
        this.d = true;
        c();
        this.k.clear();
        Runnable runnable = new Runnable() { // from class: com.alibaba.android.ultron.engine.logic.UltronWebViewJsEngine.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (UltronWebViewJsEngine.a(UltronWebViewJsEngine.this) == null) {
                } else {
                    UltronWebViewJsEngine.a(UltronWebViewJsEngine.this).a(ultronError);
                }
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.e.post(runnable);
        }
    }

    @Override // com.alibaba.android.ultron.engine.logic.c
    public void a(String str, String str2) {
        String b;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (this.c != null) {
        } else {
            if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
                UltronError ultronError = new UltronError("webview engine js file or md5 is empty");
                ultronError.code = bpk.ERROR_ENGINE_JS_FILE_ERROR_JSI;
                a(ultronError);
                return;
            }
            if (j.containsKey(str)) {
                str3 = j.get(str);
            } else {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                String path = parse.getPath();
                if (scheme != null && scheme.startsWith("file") && path != null && path.contains("android_asset")) {
                    b = bpg.d(this.f2548a, path.replace("/android_asset/", ""));
                } else {
                    b = bpg.b(this.f2548a, str);
                }
                if (!str2.equals(com.alibaba.android.ultron.engine.utils.d.a(b))) {
                    UltronError ultronError2 = new UltronError("webview engine md5 check failed");
                    ultronError2.code = bpk.ERROR_ENGINE_JS_FILE_ERROR_JSI;
                    a(ultronError2);
                    return;
                }
                if (!StringUtils.isEmpty(b)) {
                    j.put(str, b);
                }
                str3 = b;
            }
            if (StringUtils.isEmpty(str3)) {
                return;
            }
            this.c = new WebView(this.f2548a);
            if (jpx.a(this.f2548a) && Build.VERSION.SDK_INT >= 19) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
            WebSettings settings = this.c.getSettings();
            if (settings == null) {
                UltronError ultronError3 = new UltronError("webview engine webSettings is null");
                ultronError3.code = bpk.ERROR_ENGINE_JS_FILE_ERROR_JSI;
                a(ultronError3);
                return;
            }
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setAllowFileAccess(true);
            settings.setUseWideViewPort(false);
            settings.setJavaScriptEnabled(true);
            settings.setDisplayZoomControls(false);
            settings.setBuiltInZoomControls(false);
            settings.setDefaultTextEncodingName("utf-8");
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setCacheMode(2);
            settings.setAllowUniversalAccessFromFileURLs(false);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
            WebView webView = this.c;
            webView.loadDataWithBaseURL(null, "<!DOCTYPE html>\n<html>\n    <head>\n        <title></title>\n        <meta charset=\"utf-8\">\n        <script type=\"text/javascript\">\n" + str3 + "        </script>\n    </head>\n\n    <body>\n    </body>\n</html>", "text/html", "utf-8", null);
            this.c.addJavascriptInterface(new UltronEngineJsInterface(), "AndroidWebViewEngineInterface");
            this.c.addJavascriptInterface(new UltronEngineBridge(), "nativeBridge");
            try {
                if (bpd.h()) {
                    this.c.removeJavascriptInterface("searchBoxJavaBridge_");
                    this.c.removeJavascriptInterface("accessibilityTraversal");
                    this.c.removeJavascriptInterface("accessibility");
                }
            } catch (Exception e) {
                UnifyLog.d("UltronWebViewJsEngine", "remove jsi failed:" + e.getMessage());
            }
            this.c.setWebViewClient(new WebViewClient() { // from class: com.alibaba.android.ultron.engine.logic.UltronWebViewJsEngine.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str4, Object... objArr) {
                    int hashCode = str4.hashCode();
                    if (hashCode == 756225189) {
                        super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                        return null;
                    } else if (hashCode != 1835642644) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str4));
                    } else {
                        super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                        return null;
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView2, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6d69af14", new Object[]{this, webView2, str4});
                        return;
                    }
                    super.onPageFinished(webView2, str4);
                    UltronWebViewJsEngine.a(UltronWebViewJsEngine.this, true);
                    UltronWebViewJsEngine.a(UltronWebViewJsEngine.this, (Runnable) null);
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedError(WebView webView2, int i, String str4, String str5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2d1314a5", new Object[]{this, webView2, new Integer(i), str4, str5});
                        return;
                    }
                    super.onReceivedError(webView2, i, str4, str5);
                    Log.e("UltronWebViewJsEngine", "onReceivedError: errorCode: " + i + " description: " + str4 + " failingUrl: " + str5);
                }
            });
            this.c.setWebChromeClient(new WebChromeClient() { // from class: com.alibaba.android.ultron.engine.logic.UltronWebViewJsEngine.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str4, Object... objArr) {
                    int hashCode = str4.hashCode();
                    if (hashCode != -808898598) {
                        if (hashCode != -280149427) {
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str4));
                        }
                        super.onConsoleMessage((String) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2]);
                        return null;
                    }
                    return new Boolean(super.onJsPrompt((WebView) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (JsPromptResult) objArr[4]));
                }

                @Override // android.webkit.WebChromeClient
                public boolean onJsPrompt(WebView webView2, String str4, String str5, String str6, JsPromptResult jsPromptResult) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("cfc92fda", new Object[]{this, webView2, str4, str5, str6, jsPromptResult})).booleanValue() : super.onJsPrompt(webView2, str4, str5, str6, jsPromptResult);
                }

                @Override // android.webkit.WebChromeClient
                public void onConsoleMessage(String str4, int i, String str5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ef4d424d", new Object[]{this, str4, new Integer(i), str5});
                        return;
                    }
                    super.onConsoleMessage(str4, i, str5);
                    Log.e("UltronWebViewJsEngine", "onConsoleMessage: message: " + str4 + " lineNumber: " + i + " sourceID: " + str5);
                }
            });
        }
    }

    @Override // com.alibaba.android.ultron.engine.logic.c
    public void a(final String str, final List<String> list, final d<JSONObject> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b9d1fe", new Object[]{this, str, list, dVar});
        } else if (this.d || str == null) {
        } else {
            if (this.e.getLooper() == Looper.myLooper()) {
                b(str, list, dVar);
            } else {
                this.e.post(new Runnable() { // from class: com.alibaba.android.ultron.engine.logic.UltronWebViewJsEngine.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            UltronWebViewJsEngine.a(UltronWebViewJsEngine.this, str, list, dVar);
                        }
                    }
                });
            }
        }
    }

    private void b(String str, List<String> list, d<JSONObject> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b86b3c1d", new Object[]{this, str, list, dVar});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(riy.BRACKET_START_STR);
        if (list != null && list.size() > 0) {
            for (String str2 : list) {
                if (str2 == null) {
                    sb.append("\"null\"");
                    sb.append(",");
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", (Object) str2);
                    String jSONString = jSONObject.toJSONString();
                    String substring = jSONString.substring(9, jSONString.length() - 2);
                    sb.append("\"");
                    sb.append(substring);
                    sb.append("\"");
                    sb.append(",");
                }
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append(riy.BRACKET_END_STR);
        Runnable a2 = a(String.format("javascript: %s", sb.toString()), str, dVar);
        if (!this.i) {
            this.k.offer(a2);
        } else {
            a(a2);
        }
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        while (this.k.peek() != null) {
            Runnable poll = this.k.poll();
            if (poll != null) {
                poll.run();
            }
        }
        if (runnable == null) {
            return;
        }
        runnable.run();
    }

    private Runnable a(final String str, final String str2, final d<JSONObject> dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("4fc8396f", new Object[]{this, str, str2, dVar}) : new Runnable() { // from class: com.alibaba.android.ultron.engine.logic.UltronWebViewJsEngine.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (Build.VERSION.SDK_INT >= 19) {
                    if (UltronWebViewJsEngine.b(UltronWebViewJsEngine.this) == null) {
                        return;
                    }
                    UltronWebViewJsEngine.c(UltronWebViewJsEngine.this);
                    UltronWebViewJsEngine.b(UltronWebViewJsEngine.this).evaluateJavascript(str, new ValueCallback<String>() { // from class: com.alibaba.android.ultron.engine.logic.UltronWebViewJsEngine.6.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(String str3) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("138ac29e", new Object[]{this, str3});
                            } else {
                                UltronWebViewJsEngine.a(UltronWebViewJsEngine.this, str3, dVar);
                            }
                        }
                    });
                } else if (UltronWebViewJsEngine.b(UltronWebViewJsEngine.this) == null) {
                } else {
                    UltronWebViewJsEngine.c(UltronWebViewJsEngine.this);
                    Queue queue = (Queue) UltronWebViewJsEngine.d(UltronWebViewJsEngine.this).get(str2);
                    if (queue == null) {
                        queue = new ArrayDeque();
                    }
                    UltronWebViewJsEngine.d(UltronWebViewJsEngine.this).put(str2, queue);
                    queue.offer(dVar);
                    UltronWebViewJsEngine.b(UltronWebViewJsEngine.this).loadUrl(str);
                }
            }
        };
    }

    private void a(String str, d<JSONObject> dVar) {
        d<JSONObject> poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f878f", new Object[]{this, str, dVar});
            return;
        }
        c();
        if (this.d || this.c == null) {
            return;
        }
        try {
            if (!StringUtils.isEmpty(str) && !"null".equalsIgnoreCase(str)) {
                JSONObject parseObject = JSONObject.parseObject(JSONObject.parseObject("{\"data\":" + str + riy.BLOCK_END_STR).getString("data"));
                if (parseObject != null && !parseObject.isEmpty()) {
                    String string = parseObject.getString("method");
                    JSONObject jSONObject = parseObject.getJSONObject("methodReturn");
                    if (StringUtils.isEmpty(string) || jSONObject == null || jSONObject.isEmpty()) {
                        return;
                    }
                    if (dVar != null) {
                        dVar.a(jSONObject);
                        return;
                    }
                    Queue<d<JSONObject>> queue = this.l.get(string);
                    if (queue == null || (poll = queue.poll()) == null) {
                        return;
                    }
                    poll.a(jSONObject);
                    return;
                }
                UltronError ultronError = new UltronError("webview js return exception: result is not json");
                ultronError.code = bpk.ERROR_ENGINE_JS_EXCEPTION_JSI;
                ultronError.domain = "client_engine";
                a(ultronError);
                return;
            }
            UltronError ultronError2 = new UltronError("webview js return exception: result is empty");
            ultronError2.code = bpk.ERROR_ENGINE_JS_EXCEPTION_JSI;
            ultronError2.domain = "client_engine";
            a(ultronError2);
        } catch (Throwable th) {
            UltronError ultronError3 = new UltronError("webview js return exception:" + th.toString());
            ultronError3.code = bpk.ERROR_ENGINE_JS_EXCEPTION_JSI;
            ultronError3.domain = "client_engine";
            a(ultronError3);
        }
    }

    @Override // com.alibaba.android.ultron.engine.logic.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c();
        this.k.clear();
        WebView webView = this.c;
        if (webView == null) {
            return;
        }
        webView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
        this.c.clearHistory();
        this.c.destroy();
        this.c = null;
    }

    /* loaded from: classes2.dex */
    public class UltronEngineJsInterface {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1908750206);
        }

        public UltronEngineJsInterface() {
        }

        @JavascriptInterface
        public void onReceiveValue(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("138ac29e", new Object[]{this, str});
            } else {
                UltronWebViewJsEngine.a(UltronWebViewJsEngine.this, str, (d) null);
            }
        }

        @JavascriptInterface
        public void onJsError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2e02df1", new Object[]{this, str});
                return;
            }
            UltronError ultronError = new UltronError("webview js exception:" + str);
            ultronError.code = bpk.ERROR_ENGINE_JS_EXCEPTION_JSI;
            ultronError.domain = "client_engine";
            UltronWebViewJsEngine.a(UltronWebViewJsEngine.this, ultronError);
        }
    }

    /* loaded from: classes2.dex */
    public class UltronEngineBridge {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1666586185);
        }

        public UltronEngineBridge() {
        }

        @JavascriptInterface
        public void call(String str, String str2, String str3) {
            b a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cebb6403", new Object[]{this, str, str2, str3});
            } else if (UltronWebViewJsEngine.e(UltronWebViewJsEngine.this) == null || (a2 = UltronWebViewJsEngine.e(UltronWebViewJsEngine.this).a(str, str2)) == null) {
            } else {
                try {
                    a2.a(str3);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
