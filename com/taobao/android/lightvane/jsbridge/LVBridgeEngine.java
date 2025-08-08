package com.taobao.android.lightvane.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.gwn;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\bH\u0002J$\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\bH\u0002J\b\u0010\u001d\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/taobao/android/lightvane/jsbridge/LVBridgeEngine;", "", "webview", "Lcom/taobao/android/lightvane/webview/ILVWebView;", "(Lcom/taobao/android/lightvane/webview/ILVWebView;)V", "call", "", "reqId", "", "module", "method", "param", "formatJsonString", "strings", "getCallbackJs", "success", "", com.taobao.mtop.wvplugin.a.RESULT_KEY, "getFailCallback", "Lcom/taobao/android/lightvane/jsbridge/IJsApiFailCallBack;", "getParameter", "key", "getSuccessCallback", "Lcom/taobao/android/lightvane/jsbridge/IJsApiSuccessCallBack;", "runOnUiThread", "task", "Ljava/lang/Runnable;", "valuateJavascriptOnUiThread", "js", "version", "Companion", "lightvane_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class LVBridgeEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final a Companion;
    private static final String FAILURE_CALLBACK_PREFIX = "javascript:window.__lightvane__&&window.__lightvane__.onFailure&&window.__lightvane__.onFailure";
    private static final String SUCCESS_CALLBACK_PREFIX = "javascript:window.__lightvane__&&window.__lightvane__.onSuccess&&window.__lightvane__.onSuccess";
    private static final kotlin.d sExecutors$delegate;
    private final com.taobao.android.lightvane.webview.a webview;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.lightvane.jsbridge.e f13285a;

        public b(com.taobao.android.lightvane.jsbridge.e eVar) {
            this.f13285a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                f.INSTANCE.a(this.f13285a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/android/lightvane/jsbridge/LVBridgeEngine$getFailCallback$1", "Lcom/taobao/android/lightvane/jsbridge/IJsApiFailCallBack;", "fail", "", "result", "", "lightvane_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class c implements com.taobao.android.lightvane.jsbridge.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public c(String str) {
            this.b = str;
        }

        @Override // com.taobao.android.lightvane.jsbridge.a
        public void a(String str) {
            String access$formatJsonString;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            if (StringUtils.isEmpty(str)) {
                access$formatJsonString = "{}";
            } else {
                LVBridgeEngine lVBridgeEngine = LVBridgeEngine.this;
                q.a((Object) str);
                access$formatJsonString = LVBridgeEngine.access$formatJsonString(lVBridgeEngine, str);
            }
            LVBridgeEngine.access$valuateJavascriptOnUiThread(LVBridgeEngine.this, LVBridgeEngine.access$getCallbackJs(LVBridgeEngine.this, false, this.b, access$formatJsonString));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/android/lightvane/jsbridge/LVBridgeEngine$getSuccessCallback$1", "Lcom/taobao/android/lightvane/jsbridge/IJsApiSuccessCallBack;", "succeed", "", "result", "", "lightvane_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class d implements com.taobao.android.lightvane.jsbridge.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public d(String str) {
            this.b = str;
        }

        @Override // com.taobao.android.lightvane.jsbridge.b
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            LVBridgeEngine lVBridgeEngine = LVBridgeEngine.this;
            if (StringUtils.isEmpty(str)) {
                str = "{}";
            } else {
                q.a((Object) str);
            }
            LVBridgeEngine.access$valuateJavascriptOnUiThread(LVBridgeEngine.this, LVBridgeEngine.access$getCallbackJs(LVBridgeEngine.this, true, this.b, LVBridgeEngine.access$formatJsonString(lVBridgeEngine, str)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public e(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                LVBridgeEngine.access$getWebview$p(LVBridgeEngine.this).evaluateJavascript(this.b);
            }
        }
    }

    public static final /* synthetic */ a access$Companion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8a86a82d", new Object[0]) : Companion;
    }

    @JavascriptInterface
    public final String version() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("deb50921", new Object[]{this}) : "1.0.0";
    }

    public static final /* synthetic */ String access$formatJsonString(LVBridgeEngine lVBridgeEngine, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("22b73f98", new Object[]{lVBridgeEngine, str}) : lVBridgeEngine.formatJsonString(str);
    }

    public static final /* synthetic */ String access$getCallbackJs(LVBridgeEngine lVBridgeEngine, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c30ef86a", new Object[]{lVBridgeEngine, new Boolean(z), str, str2}) : lVBridgeEngine.getCallbackJs(z, str, str2);
    }

    public static final /* synthetic */ kotlin.d access$getSExecutors$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kotlin.d) ipChange.ipc$dispatch("20e365da", new Object[0]) : sExecutors$delegate;
    }

    public static final /* synthetic */ com.taobao.android.lightvane.webview.a access$getWebview$p(LVBridgeEngine lVBridgeEngine) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.lightvane.webview.a) ipChange.ipc$dispatch("4d7fb427", new Object[]{lVBridgeEngine}) : lVBridgeEngine.webview;
    }

    public static final /* synthetic */ void access$valuateJavascriptOnUiThread(LVBridgeEngine lVBridgeEngine, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("675d04e0", new Object[]{lVBridgeEngine, str});
        } else {
            lVBridgeEngine.valuateJavascriptOnUiThread(str);
        }
    }

    public LVBridgeEngine(com.taobao.android.lightvane.webview.a webview) {
        q.d(webview, "webview");
        this.webview = webview;
    }

    @JavascriptInterface
    public final void call(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2feeb30d", new Object[]{this, str, str2, str3, str4});
            return;
        }
        com.taobao.android.lightvane.jsbridge.e eVar = new com.taobao.android.lightvane.jsbridge.e(this.webview);
        String str5 = str2;
        if (StringUtils.isEmpty(str5)) {
            i iVar = new i();
            iVar.a("HY_NO_CLASS");
            new com.taobao.android.lightvane.jsbridge.d(this.webview, "null", "null", null, getFailCallback(str)).b(iVar);
        } else if (StringUtils.isEmpty(str3) && StringUtils.isEmpty(str5)) {
            i iVar2 = new i();
            iVar2.a("HY_NO_HANDLER");
            new com.taobao.android.lightvane.jsbridge.d(this.webview, "null", "null", null, getFailCallback(str)).b(iVar2);
        } else {
            eVar.a(str2);
            eVar.b(str3);
            eVar.a(this.webview);
            if (StringUtils.isEmpty(str4)) {
                str4 = "{}";
            }
            eVar.c(str4);
            eVar.a(getSuccessCallback(str));
            eVar.a(getFailCallback(str));
            a.a(Companion).submit(new b(eVar));
        }
    }

    private final com.taobao.android.lightvane.jsbridge.b getSuccessCallback(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.lightvane.jsbridge.b) ipChange.ipc$dispatch("aded1fa5", new Object[]{this, str}) : new d(str);
    }

    private final com.taobao.android.lightvane.jsbridge.a getFailCallback(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.lightvane.jsbridge.a) ipChange.ipc$dispatch("2e6bfa0d", new Object[]{this, str}) : new c(str);
    }

    @JavascriptInterface
    public final String getParameter(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("297a0ddc", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        View view = this.webview.getView();
        Context a2 = gwn.a(view != null ? view.getContext() : null);
        if (a2 instanceof Activity) {
            Intent intent = ((Activity) a2).getIntent();
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("params") : null;
            if (bundleExtra != null && (obj = bundleExtra.get(str)) != null) {
                return obj.toString();
            }
        }
        return null;
    }

    private final String getCallbackJs(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2794cc63", new Object[]{this, new Boolean(z), str, str2});
        }
        if (z) {
            return "javascript:window.__lightvane__&&window.__lightvane__.onSuccess&&window.__lightvane__.onSuccess('" + str + "','" + str2 + "');";
        }
        return "javascript:window.__lightvane__&&window.__lightvane__.onFailure&&window.__lightvane__.onFailure('" + str + "','" + str2 + "');";
    }

    private final void valuateJavascriptOnUiThread(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e93ee459", new Object[]{this, str});
        } else {
            runOnUiThread(new e(str));
        }
    }

    private final void runOnUiThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b7f2d", new Object[]{this, runnable});
            return;
        }
        try {
            if (q.a(Looper.getMainLooper(), Looper.myLooper())) {
                runnable.run();
                return;
            }
            View view = this.webview.getView();
            if (view == null) {
                return;
            }
            view.post(runnable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private final String formatJsonString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6f939bf", new Object[]{this, str});
        }
        if (n.b((CharSequence) str, (CharSequence) "\u2028", false, 2, (Object) null)) {
            try {
                str = n.a(str, "\u2028", "\\u2028", false, 4, (Object) null);
            } catch (Exception unused) {
            }
        }
        if (n.b((CharSequence) str, (CharSequence) "\u2029", false, 2, (Object) null)) {
            try {
                str = n.a(str, "\u2029", "\\u2029", false, 4, (Object) null);
            } catch (Exception unused2) {
            }
        }
        return n.a(n.a(str, "\\", "\\\\", false, 4, (Object) null), "'", "\\'", false, 4, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/taobao/android/lightvane/jsbridge/LVBridgeEngine$Companion;", "", "()V", "FAILURE_CALLBACK_PREFIX", "", "SUCCESS_CALLBACK_PREFIX", "sExecutors", "Ljava/util/concurrent/ExecutorService;", "getSExecutors", "()Ljava/util/concurrent/ExecutorService;", "sExecutors$delegate", "Lkotlin/Lazy;", "lightvane_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1861887728);
        }

        private final ExecutorService a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("13131fb3", new Object[]{this});
            } else {
                kotlin.d access$getSExecutors$cp = LVBridgeEngine.access$getSExecutors$cp();
                LVBridgeEngine.access$Companion();
                value = access$getSExecutors$cp.getValue();
            }
            return (ExecutorService) value;
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public static final /* synthetic */ ExecutorService a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("f76202c9", new Object[]{aVar}) : aVar.a();
        }
    }

    static {
        kge.a(657010088);
        Companion = new a(null);
        sExecutors$delegate = kotlin.e.a(LVBridgeEngine$Companion$sExecutors$2.INSTANCE);
    }
}
