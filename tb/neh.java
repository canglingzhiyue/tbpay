package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONAware;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.controller.DowngradeType;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.error.a;
import com.taobao.pha.core.jsbridge.a;
import com.taobao.pha.core.jsbridge.c;
import com.taobao.pha.core.m;
import com.taobao.pha.core.manifest.ManifestProperty;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.o;
import com.taobao.pha.core.offlineresource.OfflineResourceInterceptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import tb.neq;

/* loaded from: classes7.dex */
public class neh implements c.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String d;
    public static final Handler sHandler;
    public static final HandlerThread sThread;

    /* renamed from: a  reason: collision with root package name */
    public volatile nen f31382a;
    private nei e;
    private final AppController f;
    private final List<String> g = Collections.synchronizedList(new ArrayList());
    public volatile boolean b = false;
    private final CountDownLatch h = new CountDownLatch(1);
    public int c = -1;

    public static /* synthetic */ String a(neh nehVar, ManifestModel manifestModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c762ad43", new Object[]{nehVar, manifestModel}) : nehVar.b(manifestModel);
    }

    public static /* synthetic */ void a(neh nehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6098fa7", new Object[]{nehVar});
        } else {
            nehVar.j();
        }
    }

    public static /* synthetic */ void a(neh nehVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf4ebdb1", new Object[]{nehVar, str});
        } else {
            nehVar.a(str);
        }
    }

    public static /* synthetic */ void b(neh nehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48c9628", new Object[]{nehVar});
        } else {
            nehVar.n();
        }
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : d;
    }

    public static /* synthetic */ void c(neh nehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d30f9ca9", new Object[]{nehVar});
        } else {
            nehVar.o();
        }
    }

    public static /* synthetic */ CountDownLatch d(neh nehVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CountDownLatch) ipChange.ipc$dispatch("d97aa910", new Object[]{nehVar}) : nehVar.h;
    }

    public static /* synthetic */ AppController e(neh nehVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppController) ipChange.ipc$dispatch("1c585a99", new Object[]{nehVar}) : nehVar.f;
    }

    public static /* synthetic */ void f(neh nehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e98b02c", new Object[]{nehVar});
        } else {
            nehVar.p();
        }
    }

    public static /* synthetic */ void g(neh nehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d1bb6ad", new Object[]{nehVar});
        } else {
            nehVar.q();
        }
    }

    public static /* synthetic */ List h(neh nehVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8e2b5359", new Object[]{nehVar}) : nehVar.g;
    }

    public static /* synthetic */ void i(neh nehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a21c3af", new Object[]{nehVar});
        } else {
            nehVar.e();
        }
    }

    public static /* synthetic */ void j(neh nehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a4ca30", new Object[]{nehVar});
        } else {
            nehVar.k();
        }
    }

    public static /* synthetic */ void k(neh nehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4727d0b1", new Object[]{nehVar});
        } else {
            nehVar.h();
        }
    }

    public static /* synthetic */ void l(neh nehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35aad732", new Object[]{nehVar});
        } else {
            nehVar.d();
        }
    }

    static {
        kge.a(-527601960);
        kge.a(446098399);
        d = neh.class.getSimpleName();
        HandlerThread handlerThread = new HandlerThread("AppWorkerThread");
        sThread = handlerThread;
        handlerThread.start();
        sHandler = new Handler(sThread.getLooper());
    }

    public neh(AppController appController) {
        this.f = appController;
        a(new Runnable() { // from class: tb.neh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    neh.a(neh.this);
                }
            }
        });
    }

    public Future<?> a(final ManifestModel manifestModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("7d192ef2", new Object[]{this, manifestModel}) : Cnew.a(new Runnable() { // from class: tb.neh.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                neh.b(neh.this);
                final String a2 = neh.a(neh.this, manifestModel);
                if (TextUtils.isEmpty(a2)) {
                    neh.this.a();
                    return;
                }
                neh.c(neh.this);
                try {
                    neh.d(neh.this).await(3L, TimeUnit.SECONDS);
                } catch (Exception e) {
                    ngr.b(neh.c(), e.toString());
                }
                if (neh.this.f31382a != null && neh.this.f31382a.b()) {
                    neh.this.a(new Runnable() { // from class: tb.neh.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (neh.this.f31382a == null) {
                            } else {
                                neh.f(neh.this);
                                neh.this.f31382a.a(a2);
                                neh.g(neh.this);
                            }
                        }
                    });
                    return;
                }
                neh.e(neh.this).P().a(4);
                neh.e(neh.this).P().a(nfc.PHA_MONITOR_MODULE_POINT_LOAD_APPWORKER, new a(PHAErrorType.THIRD_PARTY_ERROR, a.ERR_MSG_JSENGINE_INIT_FAILED));
                neh.e(neh.this).a(neh.e(neh.this).t(), DowngradeType.WORKER_LOAD_FAILED, (Boolean) false);
            }
        });
    }

    private String b(ManifestModel manifestModel) {
        String str;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40d96b05", new Object[]{this, manifestModel});
        }
        long currentTimeMillis = System.currentTimeMillis();
        a aVar = null;
        if (manifestModel.worker == null) {
            return null;
        }
        String str2 = manifestModel.worker.source;
        if (!TextUtils.isEmpty(str2)) {
            this.c = 4;
            return str2;
        }
        String str3 = manifestModel.worker.url;
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        OfflineResourceInterceptor n = this.f.n();
        if (manifestModel.offlineResources == null || n == null || !n.c(str3)) {
            str = null;
            z = false;
        } else {
            str = OfflineResourceInterceptor.a(str3);
            if (!TextUtils.isEmpty(str)) {
                this.c = 2;
            }
        }
        com.taobao.pha.core.tabcontainer.c v = this.f.H().v();
        if (TextUtils.isEmpty(str) && v != null) {
            str = v.a(str3);
            if (!TextUtils.isEmpty(str)) {
                this.c = 5;
            }
        }
        if (TextUtils.isEmpty(str)) {
            nfh a2 = ngs.a(str3, "GET", null);
            if (a2 == null) {
                aVar = new a(PHAErrorType.REFERENCE_ERROR, a.ERR_MSG_WORKER_DOWNLOAD_FAILED);
            } else if (a2.a() == 200) {
                str = new String(a2.c());
                if (!TextUtils.isEmpty(str)) {
                    this.c = 0;
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("statusCode", (Object) Integer.valueOf(a2.a()));
                jSONObject.put("statusMessage", (Object) a2.b());
                aVar = new a(PHAErrorType.NETWORK_ERROR, a.ERR_MSG_WORKER_DOWNLOAD_FAILED, jSONObject);
            }
            if (aVar != null) {
                this.f.P().a(nfc.PHA_MONITOR_MODULE_POINT_LOAD_APPWORKER, aVar);
            }
        }
        if (!TextUtils.isEmpty(str) && z && this.c == 0) {
            OfflineResourceInterceptor.a(str3, str);
        }
        ngr.c(d, "fetch work js, fetchType is " + this.c + ",cost " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return str;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.taobao.pha.core.c j = this.f.H().j();
        if (j == null) {
            return;
        }
        String a2 = j.a();
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        a(a2);
    }

    @Override // com.taobao.pha.core.jsbridge.c.a
    public void evaluateJavaScript(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e19fb517", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a(new Runnable() { // from class: tb.neh.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!neh.this.b) {
                        neh.h(neh.this).add(str);
                    } else {
                        neh.a(neh.this, str);
                    }
                }
            });
        }
    }

    private void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Runnable runnable = new Runnable() { // from class: tb.neh.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (neh.this.f31382a == null) {
                    } else {
                        neh.this.f31382a.a(str);
                    }
                }
            };
            if (Looper.myLooper() == sHandler.getLooper()) {
                runnable.run();
            } else {
                a(runnable);
            }
        }
    }

    public boolean a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39112ea", new Object[]{this, runnable})).booleanValue() : sHandler.post(runnable);
    }

    @Deprecated
    public void a(final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (obj == null) {
        } else {
            a(new Runnable() { // from class: tb.neh.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (neh.this.f31382a == null) {
                    } else {
                        ArrayList<Object> arrayList = new ArrayList<>();
                        Object obj2 = obj;
                        if (obj2 instanceof JSONObject) {
                            obj2 = ((JSONObject) obj2).toJSONString();
                        }
                        arrayList.add(obj2);
                        String c = neh.c();
                        ngr.c(c, "callJS: " + arrayList.toString());
                        neh.this.f31382a.a("__jsbridge__.callJS", arrayList);
                    }
                }
            });
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(new Runnable() { // from class: tb.neh.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        neh.i(neh.this);
                    }
                }
            });
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (this.f31382a != null) {
            this.f31382a.a();
            this.f31382a = null;
        }
        nei neiVar = this.e;
        if (neiVar != null) {
            neiVar.a();
            this.e = null;
        }
        ngr.c(d, "released.");
    }

    @Deprecated
    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.f31382a == null) {
        } else {
            this.f31382a.a("__nativeMessageQueue__", new nek() { // from class: tb.neh.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.nek
                public Object a(nem nemVar) {
                    String str;
                    JSONAware jSONAware;
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        return ipChange2.ipc$dispatch("b04b5f0", new Object[]{this, nemVar});
                    }
                    String b = nemVar.b(0);
                    String b2 = nemVar.b(1);
                    String c = neh.c();
                    ngr.b(c, "PHA Worker call native " + b);
                    com.taobao.pha.core.jsbridge.a o = neh.e(neh.this).H().o();
                    if (o != null) {
                        String[] split = b.split("\\.");
                        String str2 = "";
                        if (b.startsWith("bridge.") && split.length == 3) {
                            str = b.substring(7);
                            str2 = "bridge";
                            z = true;
                        } else if (split.length == 2) {
                            str2 = split[0];
                            str = split[1];
                        } else {
                            str = str2;
                        }
                        try {
                            JSONObject parseObject = JSONObject.parseObject(b2);
                            if (parseObject != null) {
                                if (z) {
                                    jSONAware = parseObject;
                                } else {
                                    Object obj = parseObject.get("data");
                                    jSONAware = obj instanceof JSON ? (JSON) obj : null;
                                }
                                final String string = parseObject.getString("callbackId");
                                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                                    a.InterfaceC0751a interfaceC0751a = new a.InterfaceC0751a() { // from class: tb.neh.8.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // com.taobao.pha.core.jsbridge.a.InterfaceC0751a
                                        public void a(JSONObject jSONObject) {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                                                return;
                                            }
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("callbackId", (Object) string);
                                            jSONObject2.put("param", (Object) jSONObject);
                                            jSONObject2.put("status", (Object) "success");
                                            this.a(jSONObject2);
                                        }

                                        @Override // com.taobao.pha.core.jsbridge.a.InterfaceC0751a
                                        public void a(PHAErrorType pHAErrorType, String str3) {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("6d80500a", new Object[]{this, pHAErrorType, str3});
                                                return;
                                            }
                                            com.taobao.pha.core.error.a aVar = new com.taobao.pha.core.error.a(pHAErrorType, str3);
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("callbackId", (Object) string);
                                            jSONObject.put("param", (Object) aVar.toString());
                                            jSONObject.put("status", (Object) "fail");
                                            this.a(jSONObject);
                                        }
                                    };
                                    if (jSONAware instanceof JSONObject) {
                                        o.a(neh.e(neh.this), this, str2, str, (JSONObject) jSONAware, interfaceC0751a);
                                    } else if (jSONAware instanceof JSONArray) {
                                        o.a(neh.e(neh.this), this, str2, str, (JSONArray) jSONAware, interfaceC0751a);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            ngr.b(neh.c(), ngn.a(th));
                        }
                    }
                    return null;
                }
            });
        }
    }

    @Deprecated
    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.f31382a == null) {
        } else {
            this.f31382a.a("__phaAppData__", new nek() { // from class: tb.neh.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.nek
                public Object a(nem nemVar) {
                    final ManifestModel manifestModel;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ipChange2.ipc$dispatch("b04b5f0", new Object[]{this, nemVar});
                    }
                    String b = nemVar.b(0);
                    if (!TextUtils.isEmpty(b)) {
                        try {
                            manifestModel = (ManifestModel) JSONObject.parseObject(b, ManifestModel.class);
                        } catch (Throwable unused) {
                            manifestModel = null;
                        }
                        if (manifestModel != null) {
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.neh.9.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        neh.e(neh.this).a(manifestModel);
                                    }
                                }
                            });
                        } else {
                            ngr.b(neh.c(), "PHA Model is null");
                        }
                    }
                    return null;
                }
            });
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            a(m.a());
        }
    }

    private String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        return "PHAEnvironment=" + o.a(this.f).toJSONString() + ";function  __pha_global_prevent_gc_function__() {}";
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        l();
        String str = null;
        if (this.f.u() != null && this.f.u().worker != null) {
            str = this.f.u().worker.url;
        }
        this.f31382a = new nen(str);
        m();
        if (!this.f31382a.b()) {
            ngr.b(d, "AppWorker failed to load the so file needed by jsi.");
            return;
        }
        this.f31382a.a(new neq.a() { // from class: tb.neh.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.neq.a
            public void a(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                } else if (TextUtils.isEmpty(str2)) {
                } else {
                    String uri = neh.e(neh.this).t().toString();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("urlKey", (Object) ngn.b(uri));
                    jSONObject.put("errorMsg", (Object) str2);
                    neh.e(neh.this).P().a(nfc.PHA_MONITOR_MODULE_POINT_WORKER_JS, new com.taobao.pha.core.error.a(PHAErrorType.JS_EXECUTE_ERROR, com.taobao.pha.core.error.a.ERR_MSG_WORKER_EXECUTE_FAILED, jSONObject));
                }
            }
        });
        this.e = new nei(this.f, this);
        this.f31382a.a("__pha_bridge__", this.e);
        this.f31382a.a("__pha_worker_bridge__", this.e);
        f();
        g();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(new Runnable() { // from class: tb.neh.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    neh.j(neh.this);
                    neh.k(neh.this);
                    neh.l(neh.this);
                    if (neh.e(neh.this).G() != null) {
                        neh.e(neh.this).G().a(neh.this);
                    }
                    neh.d(neh.this).countDown();
                }
            });
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            a(i());
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            this.f.P().b(6);
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            this.f.P().b(7);
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            this.f.P().b(8);
        }
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            this.f.P().b(9);
        }
    }

    private void p() {
        ManifestProperty z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        if (this.f31382a != null && (z = this.f.z()) != null) {
            this.f31382a.a("pha.environment.manifestCacheType=" + z.i + ";");
        }
        this.f.P().a(nfc.PHA_MONITOR_MODULE_POINT_LOAD_APPWORKER, new JSONObject());
        this.f.P().b(10);
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        this.f.P().b(11);
        this.b = true;
        for (String str : this.g) {
            evaluateJavaScript(str);
        }
        this.g.clear();
    }
}
