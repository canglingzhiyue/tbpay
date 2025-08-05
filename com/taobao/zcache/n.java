package com.taobao.zcache;

import android.app.Activity;
import android.content.Context;
import android.util.AndroidRuntimeException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.weex_framework.util.a;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.orange.OrangeConfig;
import com.taobao.zcache.api.ZCacheAPI;
import com.taobao.zcache.core.IZCacheCore;
import com.taobao.zcache.network.b;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes9.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Context e;
    private static i f;
    private static f g;
    private static h h;
    private static g i;
    private static boolean j;

    public static /* synthetic */ long c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88097ea8", new Object[]{str})).longValue() : d(str);
    }

    static {
        kge.a(788182172);
        h = new b();
        i = new d();
        j = false;
        try {
            f = u.instance;
        } catch (NoClassDefFoundError unused) {
        }
        try {
            g = new c();
        } catch (NoClassDefFoundError unused2) {
        }
    }

    public static Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[0]) : e;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
        } else {
            if (context instanceof Activity) {
                new AndroidRuntimeException("Cannot use context which instance of Activity").printStackTrace();
                return;
            }
            e = context;
            com.taobao.android.riverlogger.e.a(context);
            com.taobao.zcache.core.g.a(e);
        }
    }

    public static void a(Context context, String str, String str2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602fb80f", new Object[]{context, str, str2, new Integer(i2)});
            return;
        }
        if (context != null) {
            a(context);
        }
        IZCacheCore b = com.taobao.zcache.core.g.b();
        if (b == null) {
            com.taobao.zcache.core.g.a("ZCache/Setup").a(TBPlayerConst.TBPlayerMethodSetup).a();
        } else if (j) {
        } else {
            j = true;
            if (com.taobao.zcache.core.g.a()) {
                j();
                b.setup(str, str2, i2);
                a(true);
                f fVar = g;
                if (fVar != null) {
                    fVar.a(b);
                }
                com.taobao.android.riverlogger.e.a(RVLLevel.Info, "ZCache/Setup").a("initClientListener").a();
                com.taobao.zcache.core.e.b(new Runnable() { // from class: com.taobao.zcache.n.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            n.f();
                        }
                    }
                });
                return;
            }
            b.setupSubProcess();
            a(false);
        }
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
            return;
        }
        IZCacheCore b = com.taobao.zcache.core.g.b();
        if (b == null) {
            return;
        }
        b.startUpdate();
    }

    private static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else if (!z) {
        } else {
            try {
                android.taobao.windvane.jsbridge.q.a("ZCache", (Class<? extends android.taobao.windvane.jsbridge.e>) ZCacheAPI.class);
            } catch (Exception | NoClassDefFoundError unused) {
            }
        }
    }

    private static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[0]);
            return;
        }
        try {
            OrangeConfig.getInstance().registerListener(new String[]{"ZCache"}, new com.taobao.orange.d() { // from class: com.taobao.zcache.n.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    } else if ("ZCache".equals(str)) {
                        Map<String, String> configs = OrangeConfig.getInstance().getConfigs("ZCache");
                        String str2 = configs.get("pushService");
                        u uVar = u.instance;
                        if (str2 != null && "0".contentEquals(str2)) {
                            z = false;
                        }
                        uVar.f23660a = z;
                        configs.get("ignoreGZipFailed");
                        JSONObject jSONObject = new JSONObject();
                        try {
                            for (Map.Entry<String, String> entry : configs.entrySet()) {
                                jSONObject.put(entry.getKey(), entry.getValue());
                            }
                            long c = n.c("ZCachePacks");
                            if (c > 0) {
                                jSONObject.put("zcacheSizeLimitOpt", c);
                            }
                            long c2 = n.c("ZCacheApps");
                            if (c2 > 0) {
                                jSONObject.put("acacheSizeLimitOpt", c2);
                            }
                            long c3 = n.c("ZCacheModule");
                            if (c3 > 0) {
                                jSONObject.put("moduleCacheMaxSizeOpt", c3);
                            }
                        } catch (JSONException unused) {
                        }
                        IZCacheCore b = com.taobao.zcache.core.g.b();
                        if (b == null) {
                            com.taobao.zcache.core.g.a("ZCache/Setup").a("initOrange").a();
                        } else {
                            b.setConfig(jSONObject);
                        }
                        String str3 = configs.get("autoFetchABTestModules");
                        if (str3 == null) {
                            return;
                        }
                        try {
                            JSONObject a2 = e.f23647a.a(str3);
                            if (a2 == null || b == null) {
                                return;
                            }
                            b.autoFetch(a2);
                        } catch (Exception | NoClassDefFoundError unused2) {
                        }
                    }
                }
            }, true);
            com.taobao.android.riverlogger.e.a(RVLLevel.Info, "ZCache/Setup").a("initOrange").a();
        } catch (NoClassDefFoundError unused) {
            IZCacheCore b = com.taobao.zcache.core.g.b();
            if (b == null) {
                com.taobao.zcache.core.g.a("ZCache/Setup").a("initOrange").a();
            } else {
                b.setConfig(new JSONObject());
            }
        }
    }

    private static long d(String str) {
        try {
            Object invoke = Class.forName("com.taobao.android.cachecleaner.autoclear.biz.ConfigCenter").getDeclaredMethod("getQuotaSize", Context.class, String.class).invoke(null, e, str);
            if (invoke != null) {
                return ((Long) invoke).longValue() << 10;
            }
            return 0L;
        } catch (Throwable th) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Warn, "ZCache").a("getQuotaCleanSize").a(101, th.getLocalizedMessage()).a();
            return 0L;
        }
    }

    public static h b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("66658286", new Object[0]) : h;
    }

    public static void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed71ee66", new Object[]{gVar});
        } else if (gVar == null) {
        } else {
            i = gVar;
            com.taobao.android.riverlogger.e.a(RVLLevel.Info, "ZCache/Setup").a("registerLibraryLoader").a("type", (Object) gVar.getClass().getName()).a();
        }
    }

    public static g c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("ea95cf68", new Object[0]) : i;
    }

    public static void a(Environment environment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55535f1a", new Object[]{environment});
        } else {
            com.taobao.zcache.core.g.a(environment);
        }
    }

    public static i d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("6ec61ca7", new Object[0]) : f;
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            com.taobao.zcache.core.g.a(str, str2, str3);
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        IZCacheCore b = com.taobao.zcache.core.g.b();
        if (b == null) {
            return;
        }
        b.syncSubProcessConfig();
    }

    public static long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee7", new Object[0])).longValue();
        }
        IZCacheCore b = com.taobao.zcache.core.g.b();
        if (b != null) {
            return b.getAccessAPI();
        }
        return 0L;
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else {
            a("preload_packageapp.zip");
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!com.taobao.zcache.core.g.a()) {
        } else {
            IZCacheCore b = com.taobao.zcache.core.g.b();
            if (b == null) {
                com.taobao.zcache.core.g.a("ZCache/Preload").a("install").a("file", (Object) str).a();
            } else {
                b.installPreload(str);
            }
        }
    }

    public static void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{list});
        } else {
            a(list, (String) null);
        }
    }

    public static void a(final List<String> list, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{list, str});
        } else if (list != null && list.size() != 0) {
            if (com.taobao.zcache.core.g.b() == null) {
                com.taobao.android.riverlogger.b a2 = com.taobao.zcache.core.g.a("ZCache/Prefetch").a(JarvisConstant.KEY_JARVIS_TRIGGER).a("origin", (Object) str);
                JSONObject jSONObject = new JSONObject();
                for (String str2 : list) {
                    a2.a(str2, jSONObject);
                }
                a2.a();
                return;
            }
            com.taobao.zcache.core.e.b(new Runnable() { // from class: com.taobao.zcache.n.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        com.taobao.zcache.core.g.b().prefetch(list, str);
                    }
                }
            });
        }
    }

    public static void a(PackRequest packRequest, PackUpdateFinishedCallback packUpdateFinishedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b922b479", new Object[]{packRequest, packUpdateFinishedCallback});
        } else {
            a(packRequest, packUpdateFinishedCallback, (l) null);
        }
    }

    public static void a(final PackRequest packRequest, final PackUpdateFinishedCallback packUpdateFinishedCallback, final l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52dc50d0", new Object[]{packRequest, packUpdateFinishedCallback, lVar});
        } else if (packRequest == null) {
            if (packUpdateFinishedCallback == null) {
                return;
            }
            packUpdateFinishedCallback.finish(null, new Error(-1001, "Request is null"));
        } else {
            String name = packRequest.getName();
            if (com.taobao.zcache.core.g.b() == null) {
                com.taobao.zcache.core.g.a("ZCache/UpdatePack").a("finished").a("name", (Object) name).a();
                if (packUpdateFinishedCallback == null) {
                    return;
                }
                packUpdateFinishedCallback.finish(name, com.taobao.zcache.core.g.c());
            } else if (com.taobao.zcache.core.g.a()) {
                com.taobao.zcache.core.e.b(new Runnable() { // from class: com.taobao.zcache.n.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            com.taobao.zcache.core.g.b().updatePack(PackRequest.this, packUpdateFinishedCallback, lVar);
                        }
                    }
                });
            } else if (packUpdateFinishedCallback == null) {
            } else {
                packUpdateFinishedCallback.finish(name, k());
            }
        }
    }

    public static void a(String str, PackUpdateFinishedCallback packUpdateFinishedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8ad954", new Object[]{str, packUpdateFinishedCallback});
        } else if (str == null || packUpdateFinishedCallback == null) {
        } else {
            com.taobao.zcache.core.f.a(str, packUpdateFinishedCallback);
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
            return;
        }
        IZCacheCore b = com.taobao.zcache.core.g.b();
        if (b == null) {
            com.taobao.zcache.core.g.a("ZCache/Task").a("cleanup").a();
        } else if (com.taobao.zcache.core.g.a()) {
            b.cleanup();
        } else {
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, "ZCache/Task").a("cleanup").a(2004, "sub process cleanup disabled").a();
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
            return;
        }
        IZCacheCore b = com.taobao.zcache.core.g.b();
        if (b == null) {
            com.taobao.zcache.core.g.a("ZCache/Task").a(a.ATOM_EXT_clear).a("reason", (Object) str).a();
        } else if (com.taobao.zcache.core.g.a()) {
            b.clear(str);
        } else {
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, "ZCache/Task").a(a.ATOM_EXT_clear).a(2004, "sub process clear disabled").a("reason", (Object) str).a();
        }
    }

    public static void h() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
            return;
        }
        try {
            throw new Exception();
        } catch (Exception e2) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            if (stackTrace.length > 1) {
                str = stackTrace[1].toString();
                if (stackTrace.length > 2) {
                    str = str + "\n" + stackTrace[2].toString();
                }
            } else {
                str = "Unknown";
            }
            e(str);
        }
    }

    public static boolean b(String str) {
        IZCacheCore b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (str != null && (b = com.taobao.zcache.core.g.b()) != null) {
            return b.isResourceInstalled(new ResourceRequest(str));
        }
        return false;
    }

    public static ResourceResponse a(ResourceRequest resourceRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResourceResponse) ipChange.ipc$dispatch("fd50c536", new Object[]{resourceRequest});
        }
        IZCacheCore b = com.taobao.zcache.core.g.b();
        if (b == null) {
            return ResourceResponse.getErrorResponse(com.taobao.zcache.core.g.c());
        }
        return b.getResource(resourceRequest);
    }

    public static void a(final ResourceRequest resourceRequest, final ResourceResponseCallback resourceResponseCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3836233", new Object[]{resourceRequest, resourceResponseCallback});
        } else if (resourceResponseCallback == null) {
        } else {
            final IZCacheCore b = com.taobao.zcache.core.g.b();
            if (b == null) {
                resourceResponseCallback.finish(ResourceResponse.getErrorResponse(com.taobao.zcache.core.g.c()));
            } else {
                com.taobao.zcache.core.e.b(new Runnable() { // from class: com.taobao.zcache.n.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            IZCacheCore.this.getResource(resourceRequest, resourceResponseCallback);
                        }
                    }
                });
            }
        }
    }

    public static String a(String str, String str2) {
        IZCacheCore b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (str != null && (b = com.taobao.zcache.core.g.b()) != null) {
            return b.getACacheRootPath(str, str2);
        }
        return null;
    }

    public static void b(String str, String str2) {
        IZCacheCore b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (str == null || (b = com.taobao.zcache.core.g.b()) == null || !com.taobao.zcache.core.g.a()) {
        } else {
            b.removePack(new PackRequest(str, str2));
        }
    }

    private static Error k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Error) ipChange.ipc$dispatch("1686c80f", new Object[0]) : new Error(2004, "sub process update disabled");
    }
}
