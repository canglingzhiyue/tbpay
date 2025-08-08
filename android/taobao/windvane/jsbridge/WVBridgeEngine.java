package android.taobao.windvane.jsbridge;

import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import android.webkit.JavascriptInterface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import tb.adj;
import tb.adm;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class WVBridgeEngine implements Serializable, adm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FAILURE_CALLBACK_PREFIX = "javascript:window.__windvane__&&window.__windvane__.onFailure&&window.__windvane__.onFailure";
    private static final String SUCCESS_CALLBACK_PREFIX = "javascript:window.__windvane__&&window.__windvane__.onSuccess&&window.__windvane__.onSuccess";
    public static String WINDVANE_CORE_JS;
    public static String WINDVANE_MEGA_BRIDGE_JS;
    private static ExecutorService sExecutors;
    private IWVWebView mWebview;
    private String pid;
    private String uid;

    public static /* synthetic */ String access$000(WVBridgeEngine wVBridgeEngine, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("93698f6f", new Object[]{wVBridgeEngine, str}) : wVBridgeEngine.formatJsonString(str);
    }

    public static /* synthetic */ void access$100(WVBridgeEngine wVBridgeEngine, String str, String str2, h hVar, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f392ce4", new Object[]{wVBridgeEngine, str, str2, hVar, str3});
        } else {
            wVBridgeEngine.onSuccessLogger(str, str2, hVar, str3);
        }
    }

    public static /* synthetic */ String access$200(WVBridgeEngine wVBridgeEngine, boolean z, String str, String str2, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b6cc758f", new Object[]{wVBridgeEngine, new Boolean(z), str, str2, new Boolean(z2)}) : wVBridgeEngine.getCallbackJs(z, str, str2, z2);
    }

    public static /* synthetic */ void access$300(WVBridgeEngine wVBridgeEngine, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34effcae", new Object[]{wVBridgeEngine, str});
        } else {
            wVBridgeEngine.valuateJavascriptOnUiThread(str);
        }
    }

    public static /* synthetic */ IWVWebView access$400(WVBridgeEngine wVBridgeEngine) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("95608097", new Object[]{wVBridgeEngine}) : wVBridgeEngine.mWebview;
    }

    static {
        kge.a(915564803);
        kge.a(1028243835);
        kge.a(1616078155);
        WINDVANE_MEGA_BRIDGE_JS = "(function(win){win.__megability_bridge__={asyncCall:function asyncCall(a,b,c,d){if(typeof c!==\"string\"){c=JSON.stringify(c)}win.__windvane__.call(\"WVMega.call\",{ability:a,action:b,options:c},function(res){var data=res[\"data\"];if(typeof d===\"function\"){d(data)}},function(res){var data=res[\"data\"];if(typeof d===\"function\"){d(data)}})},syncCall:function syncCall(a,b,c){if(typeof c!==\"string\"){c=JSON.stringify(c)}var res=__sync_mega__.nativeCall(a,b,c);try{res=JSON.parse(res)}catch(e){console.log(\"syncCall parse data error: \"+res)}return res}}})(window);";
        WINDVANE_CORE_JS = "(function(f){try{if(f.__windvane__.nativeCall&&!f.__windvane__.call){var h=f.__windvane__||(f.__windvane__={});var c=\"wvapi:\"+(Math.floor(Math.random()*(1<<16))),a=0,b={},g=function(j){if(j&&typeof j==\"string\"){try{return JSON.parse(j)}catch(i){return{ret:\"HY_RESULT_PARSE_ERROR\"}}}else{return j||{}}};h.call=function(i,m,l,e,k){if(typeof l!=\"function\"){l=null}if(typeof e!=\"function\"){e=null}var j=c+(a++);b[j]={s:l,f:e,};if(k>0){b[j].t=setTimeout(function(){h.onFailure(j,{ret:\"HY_TIMEOUT\"});console.log('{\"WVReport.HY_TIMEOUT\":\"'+k+'\",\"name\":\"'+i+'\",\"param\":\"'+m+'\",\"url\":\"'+location.href+'\"}');},k);}if(!m){m={}}if(typeof m!=\"string\"){m=JSON.stringify(m)}f.__windvane__.nativeCall(i,m,j,location.href)};h.find=function(i,j){var e=b[i]||{};if(e.t){clearTimeout(e.t);delete e.t}if(!j){delete b[i]}return e};h.onSuccess=function(j,e,k){var i=h.find(j,k).s;if(i){i(g(e))}};h.onFailure=function(j,e){var i=h.find(j,false).f;if(i){i(g(e))}}}}catch(d){}})(window);" + WINDVANE_MEGA_BRIDGE_JS;
    }

    public WVBridgeEngine(IWVWebView iWVWebView) {
        this.mWebview = null;
        this.pid = "";
        this.uid = "";
        if (!android.taobao.windvane.config.j.commonConfig.at) {
            WINDVANE_CORE_JS = "(function(f){try{if(f.__windvane__.nativeCall&&!f.__windvane__.call){var h=f.__windvane__||(f.__windvane__={});var c=\"wvapi:\"+(Math.floor(Math.random()*(1<<16))),a=0,b={},g=function(j){if(j&&typeof j==\"string\"){try{return JSON.parse(j)}catch(i){return{ret:\"HY_RESULT_PARSE_ERROR\"}}}else{return j||{}}};h.call=function(i,m,l,e,k){if(typeof l!=\"function\"){l=null}if(typeof e!=\"function\"){e=null}var j=c+(a++);b[j]={s:l,f:e,};if(k>0){b[j].t=setTimeout(function(){h.onFailure(j,{ret:\"HY_TIMEOUT\"})},k)}if(!m){m={}}if(typeof m!=\"string\"){m=JSON.stringify(m)}f.__windvane__.nativeCall(i,m,j,location.href)};h.find=function(i,j){var e=b[i]||{};if(e.t){clearTimeout(e.t);delete e.t}if(!j){delete b[i]}return e};h.onSuccess=function(j,e,k){var i=h.find(j,k).s;if(i){i(g(e))}};h.onFailure=function(j,e){var i=h.find(j,false).f;if(i){i(g(e))}}}}catch(d){}})(window);" + WINDVANE_MEGA_BRIDGE_JS;
        }
        this.mWebview = iWVWebView;
        sExecutors = new ThreadPoolExecutor(5, 5, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new android.taobao.windvane.thread.d("WVBridgeEngine"));
        try {
            ((ThreadPoolExecutor) sExecutors).allowCoreThreadTimeOut(true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public WVBridgeEngine(IWVWebView iWVWebView, adm admVar) {
        this(iWVWebView);
        this.pid = admVar.getCurId();
        sExecutors = new ThreadPoolExecutor(5, 5, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new android.taobao.windvane.thread.d("WVBridgeEngine"));
        try {
            ((ThreadPoolExecutor) sExecutors).allowCoreThreadTimeOut(true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @JavascriptInterface
    @com.uc.webview.export.JavascriptInterface
    public void nativeCall(final String str, String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("748b0144", new Object[]{this, str, str2, str3, str4});
            return;
        }
        final h hVar = new h();
        String[] split = str.split("\\.");
        if (split != null && split.length == 2) {
            hVar.d = split[0];
            hVar.e = split[1];
            hVar.f1664a = this.mWebview;
            hVar.g = str3;
            hVar.f = str2;
            if (StringUtils.isEmpty(hVar.f)) {
                hVar.f = "{}";
            }
            final adj adjVar = new adj();
            IWVWebView iWVWebView = this.mWebview;
            if (iWVWebView instanceof android.taobao.windvane.webview.e) {
                adjVar.a(android.taobao.windvane.util.f.a("jsBridge", "JSNativeCall", ((android.taobao.windvane.webview.e) iWVWebView).getSpanWrapper()));
                adjVar.b("nativeCall " + split[0] + "." + split[1] + " token:" + str3 + " params:" + str2);
            }
            android.taobao.windvane.util.m.c("WVJsBridge", "new bridge, reqId=[" + str3 + riy.ARRAY_END_STR);
            if (android.taobao.windvane.config.j.commonConfig.bL) {
                IWVWebView iWVWebView2 = this.mWebview;
                if (iWVWebView2 instanceof adm) {
                    String curId = ((adm) iWVWebView2).getCurId();
                    hVar.a(curId);
                    try {
                        com.taobao.android.riverlogger.e.a(RVLLevel.Info, "Bridge").a("invoke", hVar.a()).b(curId).a("name", (Object) str).a("params", new JSONObject(str2)).a();
                    } catch (Exception unused) {
                        android.taobao.windvane.util.m.e("WVBridgeEngine", " invoke JOSNObject error");
                    }
                }
            }
            hVar.i = new b() { // from class: android.taobao.windvane.jsbridge.WVBridgeEngine.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
                public void succeed(String str5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e5b77b53", new Object[]{this, str5});
                    } else {
                        a(str5, false);
                    }
                }

                @Override // android.taobao.windvane.jsbridge.b
                public void a(String str5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str5});
                    } else {
                        a(str5, true);
                    }
                }

                private void a(String str5, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8123ece2", new Object[]{this, str5, new Boolean(z)});
                        return;
                    }
                    if (StringUtils.isEmpty(str5)) {
                        str5 = "{}";
                    }
                    String access$000 = WVBridgeEngine.access$000(WVBridgeEngine.this, str5);
                    if (android.taobao.windvane.config.j.commonConfig.bL) {
                        WVBridgeEngine.access$100(WVBridgeEngine.this, str, str3, hVar, access$000);
                    }
                    WVBridgeEngine.access$300(WVBridgeEngine.this, WVBridgeEngine.access$200(WVBridgeEngine.this, true, str3, access$000, z));
                    adj adjVar2 = adjVar;
                    adjVar2.c("nativeCall succeed:" + access$000);
                    adjVar.a("succeed");
                }
            };
            hVar.h = new a() { // from class: android.taobao.windvane.jsbridge.WVBridgeEngine.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.taobao.windvane.jsbridge.a
                public void a(String str5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str5});
                    } else {
                        a(str5, true);
                    }
                }

                @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
                public void fail(String str5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("534fc72f", new Object[]{this, str5});
                    } else {
                        a(str5, false);
                    }
                }

                private void a(String str5, boolean z) {
                    JSONObject jSONObject;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8123ece2", new Object[]{this, str5, new Boolean(z)});
                        return;
                    }
                    if (StringUtils.isEmpty(str5)) {
                        str5 = "{}";
                    }
                    String access$000 = WVBridgeEngine.access$000(WVBridgeEngine.this, str5);
                    if (android.taobao.windvane.config.j.commonConfig.bL) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(access$000);
                            String string = jSONObject2.getString(com.taobao.mtop.wvplugin.a.RESULT_KEY);
                            if (string.startsWith("HY_") || string.startsWith("WX_")) {
                                string = string.substring(3);
                            }
                            com.taobao.android.riverlogger.b b = com.taobao.android.riverlogger.e.a(RVLLevel.Info, "Bridge").a("callback", hVar.a()).b(hVar.getPId());
                            b.a("name", (Object) str).b(string, "").a("status", (Object) string);
                            if (android.taobao.windvane.config.j.commonConfig.bM && (jSONObject = jSONObject2.getJSONObject("info")) != null) {
                                b.a("info", jSONObject);
                            }
                            if (com.taobao.android.riverlogger.e.a().value >= RVLLevel.Debug.value) {
                                b.a("result", jSONObject2.getJSONObject("data"));
                            }
                            b.a();
                        } catch (Exception unused2) {
                            android.taobao.windvane.util.m.e("WVBridgeEngine", " log fail because of JOSNObject error");
                        }
                    }
                    WVBridgeEngine.access$300(WVBridgeEngine.this, WVBridgeEngine.access$200(WVBridgeEngine.this, false, str3, access$000, z));
                    adj adjVar2 = adjVar;
                    adjVar2.c("nativeCall fail:" + access$000);
                    adjVar.a("fail");
                }
            };
            if (needVerification(hVar)) {
                if (android.taobao.windvane.config.j.commonConfig.bG) {
                    final IWVWebView iWVWebView3 = this.mWebview;
                    if (iWVWebView3 == null) {
                        return;
                    }
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: android.taobao.windvane.jsbridge.WVBridgeEngine.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                l.b().a(hVar, iWVWebView3.getUrl());
                            }
                        }
                    });
                    return;
                }
                sExecutors.submit(new Runnable() { // from class: android.taobao.windvane.jsbridge.WVBridgeEngine.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            l.b().a(hVar, str4);
                        }
                    }
                });
                return;
            }
            hVar.k = false;
            sExecutors.submit(new Runnable() { // from class: android.taobao.windvane.jsbridge.WVBridgeEngine.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        l.b(hVar, null);
                    }
                }
            });
            return;
        }
        r rVar = new r();
        rVar.a("HY_NO_HANDLER");
        new WVCallBackContext(this.mWebview, str3, "", "", null, null).error(rVar);
    }

    public static boolean needVerification(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2dbfbc3c", new Object[]{hVar})).booleanValue() : !android.taobao.windvane.config.j.commonConfig.ca || hVar == null || !"powermsg".equals(hVar.d) || !"sendMessageByStream".equals(hVar.e);
    }

    private void onSuccessLogger(String str, String str2, h hVar, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f53dd0d9", new Object[]{this, str, str2, hVar, str3});
            return;
        }
        try {
            com.taobao.android.riverlogger.e.a(RVLLevel.Info, "Bridge").a("callback", hVar.a()).b(hVar.getPId()).a("name", (Object) str).a("status", (Object) "SUCCESS").a();
        } catch (Exception unused) {
            android.taobao.windvane.util.m.e("WVBridgeEngine", " callback success JOSNObject error");
        }
    }

    private void valuateJavascriptOnUiThread(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e93ee459", new Object[]{this, str});
        } else {
            runOnUiThread(new Runnable() { // from class: android.taobao.windvane.jsbridge.WVBridgeEngine.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WVBridgeEngine.access$400(WVBridgeEngine.this).evaluateJavascript(str);
                    }
                }
            });
        }
    }

    @JavascriptInterface
    @com.uc.webview.export.JavascriptInterface
    public String version() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("deb50921", new Object[]{this});
        }
        android.taobao.windvane.util.m.e("WVJSPlugin", "WVJSPlugin __windvane__ version 8.5.0");
        return android.taobao.windvane.config.a.VERSION;
    }

    private void runOnUiThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b7f2d", new Object[]{this, runnable});
            return;
        }
        try {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                runnable.run();
            } else if (this.mWebview == null) {
            } else {
                this.mWebview.getView().post(runnable);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private String getCallbackJs(boolean z, String str, String str2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e42e4e9", new Object[]{this, new Boolean(z), str, str2, new Boolean(z2)});
        }
        if (z) {
            return "javascript:window.__windvane__&&window.__windvane__.onSuccess&&window.__windvane__.onSuccess('" + str + "','" + str2 + "'," + z2 + ");";
        }
        return "javascript:window.__windvane__&&window.__windvane__.onFailure&&window.__windvane__.onFailure('" + str + "','" + str2 + "'," + z2 + ");";
    }

    private String formatJsonString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6f939bf", new Object[]{this, str});
        }
        if (str.contains("\u2028")) {
            try {
                str = str.replace("\u2028", "\\u2028");
            } catch (Exception unused) {
            }
        }
        if (str.contains("\u2029")) {
            try {
                str = str.replace("\u2029", "\\u2029");
            } catch (Exception unused2) {
            }
        }
        return str.replace("\\", "\\\\").replace("'", "\\'");
    }

    @JavascriptInterface
    @com.uc.webview.export.JavascriptInterface
    public String windVaneCoreJs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e0071a87", new Object[]{this}) : android.taobao.windvane.config.j.commonConfig.af ? "" : WINDVANE_CORE_JS;
    }

    public void updateCurId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ea03b9", new Object[]{this});
            return;
        }
        this.uid = "" + id.addAndGet(1);
    }

    @Override // tb.adm
    public String getCurId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24aaca54", new Object[]{this});
        }
        return "NewBridge_" + this.uid;
    }

    public String getPId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dc67dba4", new Object[]{this}) : this.pid;
    }

    public void setPid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f52579a", new Object[]{this, str});
        } else {
            this.pid = str;
        }
    }
}
