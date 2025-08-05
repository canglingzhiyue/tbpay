package com.alibaba.android.ultron.engine.logic;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.jsi.WVJsi;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.ultron.engine.a;
import com.alibaba.android.ultron.inter.UltronDebugFetcher;
import com.alibaba.android.ultron.inter.UltronDebugInterface;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.jsi.standard.JSEngine;
import com.alibaba.jsi.standard.js.h;
import com.alibaba.jsi.standard.js.i;
import com.alibaba.jsi.standard.js.j;
import com.alibaba.jsi.standard.js.o;
import com.alibaba.jsi.standard.js.s;
import com.alibaba.jsi.standard.js.w;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import tb.bpd;
import tb.bpg;
import tb.bpk;
import tb.jpx;
import tb.kge;

/* loaded from: classes2.dex */
public class e implements c<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int i;
    private static AtomicInteger m;
    private static String n;
    private static String o;
    private static Map<String, String> r;

    /* renamed from: a  reason: collision with root package name */
    private Handler f2556a;
    private Handler b;
    private Context e;
    private String f;
    private a.b h;
    private HandlerThread k;
    private com.alibaba.android.ultron.vfw.instance.d l;
    private a q;
    private JSEngine c = null;
    private com.alibaba.jsi.standard.d d = null;
    private Map<String, Queue<d<JSONObject>>> g = new HashMap();
    private boolean j = false;
    private volatile boolean p = false;

    public static /* synthetic */ Handler a(e eVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("14cb49e", new Object[]{eVar, handler});
        }
        eVar.f2556a = handler;
        return handler;
    }

    public static /* synthetic */ HandlerThread a(e eVar, HandlerThread handlerThread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("c717a89e", new Object[]{eVar, handlerThread});
        }
        eVar.k = handlerThread;
        return handlerThread;
    }

    public static /* synthetic */ JSEngine a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSEngine) ipChange.ipc$dispatch("3245dadc", new Object[]{eVar}) : eVar.c;
    }

    public static /* synthetic */ JSEngine a(e eVar, JSEngine jSEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSEngine) ipChange.ipc$dispatch("936f07e0", new Object[]{eVar, jSEngine});
        }
        eVar.c = jSEngine;
        return jSEngine;
    }

    public static /* synthetic */ void a(e eVar, UltronError ultronError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602b39cd", new Object[]{eVar, ultronError});
        } else {
            eVar.a(ultronError);
        }
    }

    public static /* synthetic */ void a(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ecb1c2", new Object[]{eVar, str});
        } else {
            eVar.b(str);
        }
    }

    public static /* synthetic */ void a(e eVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba65af0c", new Object[]{eVar, str, str2});
        } else {
            eVar.b(str, str2);
        }
    }

    public static /* synthetic */ void a(e eVar, String str, List list, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8912b26e", new Object[]{eVar, str, list, dVar});
        } else {
            eVar.b(str, list, dVar);
        }
    }

    public static /* synthetic */ boolean a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6f5be0", new Object[]{eVar, new Boolean(z)})).booleanValue();
        }
        eVar.j = z;
        return z;
    }

    public static /* synthetic */ Handler b(e eVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("6fd3c5df", new Object[]{eVar, handler});
        }
        eVar.b = handler;
        return handler;
    }

    public static /* synthetic */ String b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b14505a9", new Object[]{eVar}) : eVar.f;
    }

    public static /* synthetic */ void b(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c1c39e1", new Object[]{eVar, str});
        } else {
            eVar.c(str);
        }
    }

    public static /* synthetic */ boolean b(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf8f5e1", new Object[]{eVar, new Boolean(z)})).booleanValue();
        }
        eVar.p = z;
        return z;
    }

    public static /* synthetic */ String c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ff047daa", new Object[]{eVar}) : eVar.e();
    }

    public static /* synthetic */ void c(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864bc200", new Object[]{eVar, str});
        } else {
            eVar.d(str);
        }
    }

    public static /* synthetic */ void c(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c828fde", new Object[]{eVar, new Boolean(z)});
        } else {
            eVar.a(z);
        }
    }

    public static /* synthetic */ a d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f6eaa829", new Object[]{eVar}) : eVar.q;
    }

    public static /* synthetic */ void e(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c3e9d74", new Object[]{eVar});
        } else {
            eVar.k();
        }
    }

    public static /* synthetic */ boolean f(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b6093f57", new Object[]{eVar})).booleanValue() : eVar.j;
    }

    public static /* synthetic */ Map g(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("1d82f3e7", new Object[]{eVar}) : eVar.g;
    }

    public static /* synthetic */ com.alibaba.jsi.standard.d h(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.jsi.standard.d) ipChange.ipc$dispatch("5373bef2", new Object[]{eVar}) : eVar.d;
    }

    public static /* synthetic */ Handler i(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("98a903d6", new Object[]{eVar}) : eVar.f2556a;
    }

    public static /* synthetic */ HandlerThread j(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HandlerThread) ipChange.ipc$dispatch("4a85d5ad", new Object[]{eVar}) : eVar.k;
    }

    public static /* synthetic */ Handler k(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("502bfb58", new Object[]{eVar}) : eVar.b;
    }

    public static /* synthetic */ a.b l(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.b) ipChange.ipc$dispatch("9b9cdf12", new Object[]{eVar}) : eVar.h;
    }

    static {
        kge.a(1376369930);
        kge.a(2126352327);
        i = 3000;
        m = new AtomicInteger(0);
        n = null;
        o = null;
        r = new HashMap();
    }

    public e(Context context, com.alibaba.android.ultron.vfw.instance.d dVar, String str, a aVar, a.b bVar) {
        this.f2556a = null;
        this.b = null;
        UnifyLog.d("UltronJSIEngine", "ultronBizName:" + str + "#new instance:" + this);
        this.e = context;
        this.f = str;
        this.l = dVar;
        this.q = aVar;
        this.h = bVar;
        if (this.f2556a == null) {
            this.k = new HandlerThread("UltronJSIEngine");
            this.k.start();
            this.f2556a = new Handler(this.k.getLooper());
        }
        if (this.b == null) {
            this.b = new Handler(Looper.getMainLooper()) { // from class: com.alibaba.android.ultron.engine.logic.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                        return;
                    }
                    int i2 = message.what;
                    if (i2 != 10001) {
                        if (i2 != 10002) {
                            return;
                        }
                        e.b(e.this, true);
                        e.a(e.this, "JSI 初始化超时");
                        return;
                    }
                    e.a(e.this, true);
                    UltronError ultronError = new UltronError("js 执行超时");
                    ultronError.code = bpk.ERROR_ENGINE_JS_TIMEOUT_JSI;
                    e.a(e.this, ultronError);
                }
            };
        }
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.c != null) {
        } else {
            this.f2556a.post(new Runnable() { // from class: com.alibaba.android.ultron.engine.logic.e.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (e.a(e.this) != null) {
                    } else {
                        UnifyLog.a(e.b(e.this), "UltronJSIEngine", "initialize JSI", new String[0]);
                        boolean a2 = bpd.a(bpd.KEY_ENABLE_CREATE_JSENGINE_WITH_JSI, true);
                        String c = !a2 ? e.c(e.this) : "";
                        UnifyLog.d("UltronJSIEngine", "soExit=" + c);
                        if (!a2) {
                            try {
                                if (!Boolean.TRUE.toString().equals(c)) {
                                    String b = e.b(e.this);
                                    UnifyLog.d(b, "UltronJSIEngine", "checkJSEngineSoExist false: " + c);
                                    e.a(e.this, c);
                                    return;
                                }
                            } catch (Throwable th) {
                                String b2 = e.b(e.this);
                                UnifyLog.d(b2, "UltronJSIEngine", "initializeJSI exception: " + Log.getStackTraceString(th));
                                e.a(e.this, th.getMessage());
                                return;
                            }
                        }
                        e.c(e.this, a2);
                    }
                }
            });
        }
    }

    private void a(boolean z) {
        boolean c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            c = d();
        } else {
            c = c();
        }
        if (!c) {
            b("jsEngineSoPath is null");
            return;
        }
        JSEngine jSEngine = this.c;
        this.d = jSEngine.createContext("Context_" + this.f);
        g();
        f();
        h();
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        Bundle bundle = new Bundle();
        String v8SoPath = WVCore.getInstance().getV8SoPath();
        if (v8SoPath == null) {
            return false;
        }
        bundle.putString("jsiSoPath", v8SoPath.replace("libwebviewuc.so", "libjsi.so"));
        bundle.putString("jsEngineSoPath", v8SoPath);
        JSEngine.loadSo(this.e, bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", "new_ultron_" + m.getAndIncrement());
        bundle2.putString("version", "1.0");
        bundle2.putString("datadir", "new_ultron_" + this.f);
        this.c = JSEngine.createInstance(this.e, bundle2);
        return true;
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        WVJsi.InstanceBuilder instanceBuilder = WVJsi.instanceBuilder(this.e);
        WVJsi.InstanceBuilder name = instanceBuilder.name("new_ultron_" + m.getAndIncrement());
        WVJsi.InstanceResult build = name.dataDir("new_ultron_" + this.f).version("1.0").bizName(this.f).build();
        if (build == null || !build.isSuccess()) {
            return false;
        }
        this.c = build.getJsEngine();
        return true;
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        try {
            String v8SoPath = WVCore.getInstance().getV8SoPath();
            if (v8SoPath == null) {
                return "getV8SoPath is null";
            }
            if (new File(v8SoPath).exists()) {
                return Boolean.TRUE.toString();
            }
            l();
            long currentTimeMillis = System.currentTimeMillis();
            boolean extractWebCoreLibrary = WVCore.getInstance().extractWebCoreLibrary(this.e);
            m();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (!this.p) {
                return !extractWebCoreLibrary ? "extractWebCoreLibrary fail" : new File(WVCore.getInstance().getV8SoPath()).exists() ? Boolean.TRUE.toString() : "extractWebCoreLibrary success,but so file not exists";
            }
            return "extract success,but has timeout: " + currentTimeMillis2;
        } catch (Exception unused) {
            return "checkJSEngineSoExist exception";
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.alibaba.jsi.standard.js.c cVar = new com.alibaba.jsi.standard.js.c(this.d.g());
        try {
            o h = this.d.h();
            o oVar = new o(this.d);
            j jVar = new j(this.d, new h() { // from class: com.alibaba.android.ultron.engine.logic.e.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str, Object... objArr) {
                    if (str.hashCode() == -1888865210) {
                        return super.onCallFunction((com.alibaba.jsi.standard.js.a) objArr[0]);
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // com.alibaba.jsi.standard.js.h
                public w onCallFunction(com.alibaba.jsi.standard.js.a aVar) {
                    b a2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (w) ipChange2.ipc$dispatch("8f6a3446", new Object[]{this, aVar});
                    }
                    if (aVar == null || aVar.a() < 3) {
                        Log.e("UltronJSIEngine", "bridge.call() error: args is null or args count() < 3");
                        UnifyLog.a(e.b(e.this), "UltronJSIEngine", "bridge.call() error: args is null or args count() < 3", new String[0]);
                    }
                    try {
                        w a3 = aVar.a(0);
                        w a4 = aVar.a(1);
                        w a5 = aVar.a(2);
                        String a_ = a3.a_(aVar.b());
                        String a_2 = a4.a_(aVar.b());
                        String a_3 = a5.a_(aVar.b());
                        if (e.d(e.this) != null && (a2 = e.d(e.this).a(a_, a_2)) != null) {
                            try {
                                a2.a(a_3);
                            } catch (Throwable unused) {
                            }
                        }
                        a3.a();
                        a4.a();
                        a5.a();
                        Log.e("UltronJSIEngine", a_3 == null ? "null" : a_3);
                        String b = e.b(e.this);
                        UnifyLog.a(b, "UltronJSIEngine", "bridge.call(): " + a_3, new String[0]);
                    } catch (Throwable th) {
                        Log.e("UltronJSIEngine", "bridge.call() crashed: " + th.toString());
                        String b2 = e.b(e.this);
                        UnifyLog.a(b2, "UltronJSIEngine", "bridge.call() crashed: " + th.toString(), new String[0]);
                    }
                    return super.onCallFunction(aVar);
                }
            }, "call");
            oVar.a(this.d, "call", jVar);
            h.a(this.d, "nativeBridge", oVar);
            jVar.a();
            oVar.a();
            h.a();
        } finally {
            cVar.b();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.alibaba.jsi.standard.js.c cVar = new com.alibaba.jsi.standard.js.c(this.d.g());
        try {
            o h = this.d.h();
            o oVar = new o(this.d);
            j jVar = new j(this.d, new h() { // from class: com.alibaba.android.ultron.engine.logic.e.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass6 anonymousClass6, String str, Object... objArr) {
                    if (str.hashCode() == -1888865210) {
                        return super.onCallFunction((com.alibaba.jsi.standard.js.a) objArr[0]);
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // com.alibaba.jsi.standard.js.h
                public w onCallFunction(com.alibaba.jsi.standard.js.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (w) ipChange2.ipc$dispatch("8f6a3446", new Object[]{this, aVar});
                    }
                    try {
                        w a2 = aVar.a(0);
                        a2.a_(aVar.b());
                        a2.a();
                    } catch (Throwable th) {
                        String b = e.b(e.this);
                        UnifyLog.a(b, "UltronJSIEngine", "console.log crashed: " + th.toString(), new String[0]);
                    }
                    return super.onCallFunction(aVar);
                }
            }, "log");
            oVar.a(this.d, "log", jVar);
            h.a(this.d, "console", oVar);
            jVar.a();
            oVar.a();
            h.a();
        } finally {
            cVar.b();
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        com.alibaba.jsi.standard.js.c cVar = new com.alibaba.jsi.standard.js.c(this.d.g());
        try {
            o h = this.d.h();
            j jVar = new j(this.d, new h() { // from class: com.alibaba.android.ultron.engine.logic.e.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass7 anonymousClass7, String str, Object... objArr) {
                    if (str.hashCode() == -1888865210) {
                        return super.onCallFunction((com.alibaba.jsi.standard.js.a) objArr[0]);
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // com.alibaba.jsi.standard.js.h
                public w onCallFunction(com.alibaba.jsi.standard.js.a aVar) {
                    JSONObject parseObject;
                    String string;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (w) ipChange2.ipc$dispatch("8f6a3446", new Object[]{this, aVar});
                    }
                    e.e(e.this);
                    if (e.f(e.this)) {
                        return super.onCallFunction(aVar);
                    }
                    try {
                        w a2 = aVar.a(0);
                        String a_ = a2.a_(aVar.b());
                        a2.a();
                        parseObject = JSON.parseObject(a_);
                    } catch (Throwable th) {
                        UnifyLog.a(e.b(e.this), "UltronJSIEngine", "jsCallback exception ", th.toString());
                    }
                    if (parseObject == null || (string = parseObject.getString("method")) == null) {
                        return null;
                    }
                    Queue queue = (Queue) e.g(e.this).get(string);
                    if (queue != null) {
                        d dVar = (d) queue.poll();
                        if (dVar != null) {
                            dVar.a(parseObject.getJSONObject("methodReturn"));
                        } else {
                            UnifyLog.a(e.b(e.this), "UltronJSIEngine", "JSFunction but logicCallBack is null", new String[0]);
                        }
                    }
                    return super.onCallFunction(aVar);
                }
            }, "jsCallback");
            h.a(this.d, "jsCallback", jVar);
            jVar.a();
            h.a();
        } finally {
            cVar.b();
        }
    }

    private void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        final String str2 = this.f + "_logicFile.js";
        if (jpx.a(this.e)) {
            if (str2.equals(n)) {
                str = o;
            }
            UltronDebugFetcher.getUltronDebug(this.f).sendStatusEvent("STATUS_ENGINE_LOGIC_ENGINE_INIT_FILE", new UltronDebugInterface.a().a("content", str).a("fileName", str2).a());
            UltronDebugFetcher.getUltronDebug(this.f).registerStatusCallback("EVENT_UPDATA_JS_FILE", new com.alibaba.android.ultron.inter.a() { // from class: com.alibaba.android.ultron.engine.logic.e.8
            });
        }
        Runnable runnable = new Runnable() { // from class: com.alibaba.android.ultron.engine.logic.e.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:29:0x00e5 A[Catch: Throwable -> 0x00ee, TRY_LEAVE, TryCatch #0 {Throwable -> 0x00ee, blocks: (B:19:0x0059, B:21:0x0067, B:23:0x006d, B:29:0x00e5, B:24:0x00d3, B:25:0x00d7, B:27:0x00dd), top: B:40:0x0059 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 273
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.engine.logic.e.AnonymousClass9.run():void");
            }
        };
        Handler handler = this.f2556a;
        if (handler == null) {
            return;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f2556a.post(runnable);
        }
    }

    private void a(com.alibaba.jsi.standard.d dVar, String str) {
        Queue<d<JSONObject>> queue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7386dbbf", new Object[]{this, dVar, str});
            return;
        }
        k();
        if (this.j) {
            UnifyLog.a(this.f, "UltronJSIEngine", "jsCallback timeout, return!", new String[0]);
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject == null) {
                return;
            }
            String string = parseObject.getString("method");
            String str2 = this.f;
            UnifyLog.a(str2, "UltronJSIEngine", "onJsCallback, method:" + string, new String[0]);
            if (string == null || (queue = this.g.get(string)) == null) {
                return;
            }
            d<JSONObject> poll = queue.poll();
            if (poll != null) {
                poll.a(parseObject.getJSONObject("methodReturn"));
            } else {
                UnifyLog.a(this.f, "UltronJSIEngine", "JSFunction but logicCallBack is null", new String[0]);
            }
        } catch (Throwable th) {
            UnifyLog.a(this.f, "UltronJSIEngine", "jsCallback exception ", th.toString());
        }
    }

    @Override // com.alibaba.android.ultron.engine.logic.c
    public void a(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        Handler handler = this.f2556a;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.alibaba.android.ultron.engine.logic.e.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    e.a(e.this, str, str2);
                }
            }
        });
    }

    private void b(String str, String str2) {
        String b;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (str == null) {
            throw new IllegalArgumentException("jsFilePath can not be null");
        } else {
            String str4 = this.f;
            UnifyLog.a(str4, "UltronJSIEngine", "initLogicEngine jsFilePath:" + str, new String[0]);
            if (r.containsKey(str)) {
                str3 = r.get(str);
            } else {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                String path = parse.getPath();
                if (scheme != null && scheme.startsWith("file") && path != null && path.contains("android_asset")) {
                    b = bpg.d(this.e, path.replace("/android_asset/", ""));
                } else {
                    b = bpg.b(this.e, str);
                }
                String a2 = com.alibaba.android.ultron.engine.utils.d.a(b);
                if (TextUtils.isEmpty(str2) || !str2.equals(a2)) {
                    UltronError ultronError = new UltronError("md5 check failed");
                    ultronError.code = bpk.ERROR_ENGINE_JS_FILE_ERROR_JSI;
                    UnifyLog.a(this.f, "UltronJSIEngine", "js file md5 check failed", new String[0]);
                    a(ultronError);
                    return;
                }
                if (!TextUtils.isEmpty(b)) {
                    r.put(str, b);
                }
                str3 = b;
            }
            if (str3 != null) {
                a(str3);
            } else {
                UnifyLog.a(this.f, "UltronJSIEngine", "initLogicEngine but jsContent is null", new String[0]);
            }
        }
    }

    @Override // com.alibaba.android.ultron.engine.logic.c
    public void a(final String str, final List<String> list, final d<JSONObject> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b9d1fe", new Object[]{this, str, list, dVar});
        } else if (str == null) {
            throw new IllegalArgumentException("method can not be null");
        } else {
            if (this.f2556a == null) {
                return;
            }
            UnifyLog.d("UltronJSIEngine", "ultronBizName:" + this.f + "#callMethod:" + str + "," + this);
            this.j = false;
            this.f2556a.post(new Runnable() { // from class: com.alibaba.android.ultron.engine.logic.e.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (e.h(e.this) == null) {
                        UnifyLog.a(e.b(e.this), "UltronJSIEngine", "callMethod，mJSContext is null！", new String[0]);
                    } else {
                        UnifyLog.d("UltronJSIEngine", "ultronBizName:" + e.b(e.this) + "#real do callMethod:" + str);
                        e.a(e.this, str, list, dVar);
                    }
                }
            });
        }
    }

    private void b(String str, List<String> list, d<JSONObject> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b86b3c1d", new Object[]{this, str, list, dVar});
            return;
        }
        UnifyLog.a(this.f, "UltronJSIEngine", "callJsMethodInternal start", new String[0]);
        Queue<d<JSONObject>> queue = this.g.get(str);
        if (queue == null) {
            queue = new ArrayDeque<>();
        }
        this.g.put(str, queue);
        queue.offer(dVar);
        j();
        a(str, list);
        UnifyLog.a(this.f, "UltronJSIEngine", "callJsMethodInternal finished", new String[0]);
    }

    private void a(String str, List<String> list) {
        w[] wVarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
            return;
        }
        com.alibaba.jsi.standard.d dVar = this.d;
        if (dVar.g().isDisposed()) {
            c("JSEngine disposed");
        } else if (dVar.c()) {
            c("JSContext disposed");
        } else {
            com.alibaba.jsi.standard.js.c cVar = new com.alibaba.jsi.standard.js.c(dVar.g());
            try {
                w a2 = this.d.a(str);
                if (a2 != null) {
                    j jVar = (j) a2;
                    if (list == null || list.isEmpty()) {
                        wVarArr = null;
                    } else {
                        wVarArr = new w[list.size()];
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            wVarArr[i2] = new s(list.get(i2));
                        }
                    }
                    w a3 = jVar.a(this.d, (w) null, wVarArr);
                    if (a3 != null) {
                        a(dVar, a3.a_(dVar));
                        a3.a();
                    } else {
                        i j = this.d.j();
                        if (j != null) {
                            j.a();
                            d((((("name: " + j.b(this.d)) + "; message: ") + j.c(this.d)) + "; stack: ") + j.d(this.d));
                        } else {
                            c("get exception failed");
                        }
                        j.a();
                    }
                    if (wVarArr != null) {
                        for (w wVar : wVarArr) {
                            wVar.a();
                        }
                    }
                    a2.a();
                } else {
                    c("get global failed, method : " + str);
                }
            } catch (Throwable th) {
                try {
                    c("executeJS exception: " + th.getMessage());
                } finally {
                    cVar.b();
                }
            }
        }
    }

    @Override // com.alibaba.android.ultron.engine.logic.c
    public void a() {
        JSEngine jSEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        UnifyLog.d("UltronJSIEngine", "ultronBizName:" + this.f + "#destroy," + this + ",mJSEngine=" + this.c);
        if (jpx.a(this.e) && (jSEngine = this.c) != null) {
            jSEngine.printObjects();
        }
        Handler handler = this.f2556a;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.alibaba.android.ultron.engine.logic.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    UnifyLog.d("UltronJSIEngine", "ultronBizName:" + e.b(e.this) + "#real do destroy in thread,mJSEngine=" + e.a(e.this));
                    if (e.a(e.this) == null || e.h(e.this) == null) {
                        return;
                    }
                    e.a(e.this).removeContext(e.h(e.this));
                    e.a(e.this).dispose();
                    e.a(e.this, (JSEngine) null);
                    if (e.i(e.this) != null) {
                        e.i(e.this).removeCallbacksAndMessages(null);
                    }
                    e.a(e.this, (Handler) null);
                    e.j(e.this).quit();
                    e.a(e.this, (HandlerThread) null);
                    if (e.k(e.this) != null) {
                        e.k(e.this).removeCallbacksAndMessages(null);
                    }
                    e.b(e.this, (Handler) null);
                } catch (Throwable th) {
                    String b = e.b(e.this);
                    UnifyLog.a(b, "UltronJSIEngine", "destroy error: " + th.toString(), new String[0]);
                }
            }
        });
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        UltronError ultronError = new UltronError("js engine init error:" + str);
        ultronError.code = bpk.ERROR_ENGINE_JS_INIT_JSI;
        ultronError.domain = "client_engine";
        ultronError.extraMsg = i();
        Handler handler = this.f2556a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        a(ultronError);
    }

    private String i() {
        File parentFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        try {
            String v8SoPath = WVCore.getInstance().getV8SoPath();
            UnifyLog.a(this.f, "UltronJSIEngine", "getJSISoInfo v8SoPath", v8SoPath);
            if (v8SoPath == null || (parentFile = new File(v8SoPath).getParentFile()) == null) {
                return null;
            }
            UnifyLog.a(this.f, "UltronJSIEngine", "getJSISoInfo firstParent: ", parentFile.getAbsolutePath());
            File parentFile2 = parentFile.getParentFile();
            if (parentFile2 == null) {
                return null;
            }
            UnifyLog.a(this.f, "UltronJSIEngine", "getJSISoInfo secondParent: ", parentFile2.getAbsolutePath());
            File parentFile3 = parentFile2.getParentFile();
            if (parentFile3 == null) {
                return null;
            }
            UnifyLog.a(this.f, "UltronJSIEngine", "getJSISoInfo thirdParent: ", parentFile3.getAbsolutePath());
            JSONArray a2 = a(parentFile3);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v8SoPath", (Object) v8SoPath);
            if (a2 != null) {
                jSONObject.put("allSoInfos", (Object) a2.toJSONString());
            }
            UnifyLog.a(this.f, "UltronJSIEngine", "getJSISoInfo soInfo ", jSONObject.toJSONString());
            return jSONObject.toJSONString();
        } catch (Exception e) {
            UnifyLog.a(this.f, "UltronJSIEngine", "getJSISoInfo error", e.getMessage());
            return null;
        }
    }

    private JSONArray a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("5cbb3e7f", new Object[]{this, file});
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                JSONArray a2 = a(file2);
                if (a2 != null) {
                    jSONArray.addAll(a2);
                }
            } else {
                JSONObject b = b(file2);
                if (b != null) {
                    jSONArray.add(b);
                }
            }
        }
        return jSONArray;
    }

    private JSONObject b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("47122cc0", new Object[]{this, file});
        }
        if (file == null || !file.exists()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        long lastModified = file.lastModified();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(lastModified);
        jSONObject.put("lastModified", (Object) simpleDateFormat.format(calendar.getTime()));
        jSONObject.put("absolutePath", (Object) file.getAbsolutePath());
        jSONObject.put("fileLength", (Object) Long.valueOf(file.length()));
        return jSONObject;
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        k();
        UltronError ultronError = new UltronError("js engine error:" + str);
        ultronError.code = bpk.ERROR_ENGINE_JS_ENGINE_JSI;
        ultronError.domain = "client_engine";
        a(ultronError);
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        k();
        UltronError ultronError = new UltronError("js exception:" + str);
        ultronError.code = bpk.ERROR_ENGINE_JS_EXCEPTION_JSI;
        ultronError.domain = "client_engine";
        a(ultronError);
    }

    private void a(final UltronError ultronError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f64095d", new Object[]{this, ultronError});
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.alibaba.android.ultron.engine.logic.e.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (e.l(e.this) == null) {
                } else {
                    e.l(e.this).a(ultronError);
                }
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.b.post(runnable);
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        Handler handler = this.b;
        if (handler == null) {
            return;
        }
        this.b.sendMessageDelayed(Message.obtain(handler, 10001), i);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        Handler handler = this.b;
        if (handler == null) {
            return;
        }
        handler.removeMessages(10001);
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        Handler handler = this.b;
        if (handler == null) {
            return;
        }
        this.b.sendMessageDelayed(Message.obtain(handler, 10002), 3000L);
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        Handler handler = this.b;
        if (handler == null) {
            return;
        }
        handler.removeMessages(10002);
    }
}
