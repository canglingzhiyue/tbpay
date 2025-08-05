package com.taobao.android.weex_framework;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.AsyncTask;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceStatus;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.bridge.WeexPlatformCommonBridge;
import com.taobao.android.weex.bridge.WeexPlatformInstanceBridge;
import com.taobao.android.weex.bridge.WeexPlatformThreadBridge;
import com.taobao.android.weex.instance.WeexDOMInstance;
import com.taobao.android.weex.util.WeexAppMonitor;
import com.taobao.android.weex.util.WeexInstanceChecker;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.jni.MUSCommonNativeBridge;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.module.b;
import com.taobao.android.weex_framework.module.builtin.MUSDevModule;
import com.taobao.android.weex_framework.module.builtin.MUSDomModule;
import com.taobao.android.weex_framework.module.builtin.MUSNativeApiModule;
import com.taobao.android.weex_framework.module.builtin.MUSNavigatorModule;
import com.taobao.android.weex_framework.module.builtin.MUSWindowModule;
import com.taobao.android.weex_framework.module.builtin.WXAppMonitorModule;
import com.taobao.android.weex_framework.module.builtin.WXAudioModule;
import com.taobao.android.weex_framework.module.builtin.WXLocalStorageModule;
import com.taobao.android.weex_framework.module.builtin.WXSessionStorageModule;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.android.weex_framework.module.builtin.stream.MUSStreamModule;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_framework.util.i;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.zcache.n;
import java.io.Serializable;
import tb.dpj;
import tb.jtz;
import tb.juk;
import tb.juw;
import tb.jux;
import tb.jvb;
import tb.jvc;
import tb.jvw;
import tb.jwd;
import tb.kge;

/* loaded from: classes.dex */
public class MUSEngine implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile boolean sApplicationInit;
    private static volatile boolean sApplicationInitCalled;
    private static volatile boolean sDelayedJobDone;
    private static volatile boolean sInit;
    private static final Object sLock;
    private static volatile boolean sZCacheAccessInit;
    private static volatile int sZCacheAccessRetry;

    /* loaded from: classes6.dex */
    public interface a {
        void afterInitFinished();
    }

    public static void setUpGlobalConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae640c1d", new Object[]{str, str2});
        }
    }

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            preloadClass();
        }
    }

    public static /* synthetic */ boolean access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f1bc42bc", new Object[0])).booleanValue() : sApplicationInitCalled;
    }

    public static /* synthetic */ void access$200(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77bb061a", new Object[]{aVar});
        } else {
            callbackInitFinished(aVar);
        }
    }

    public static /* synthetic */ Object access$300() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7164b938", new Object[0]) : sLock;
    }

    static {
        kge.a(-69773423);
        kge.a(1028243835);
        sInit = false;
        sZCacheAccessInit = false;
        sZCacheAccessRetry = 0;
        sApplicationInit = false;
        sApplicationInitCalled = false;
        sDelayedJobDone = false;
        sLock = new Object();
    }

    public static void initialize(Application application, o oVar) {
        if (application == null) {
            throw new IllegalArgumentException("application mustn't be null");
        }
        if (sInit) {
            return;
        }
        synchronized (sLock) {
            if (sInit) {
                return;
            }
            m.b = application;
            com.taobao.android.riverlogger.e.a(application);
            updateTarget30(application);
            registerInnerModule();
            l.a().a(application, oVar);
            boolean z = false;
            try {
                com.taobao.android.weex_framework.util.h.a(Class.forName("com.taobao.android.weex_uikit.UIKitEngine"), "init", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused) {
            }
            try {
                com.taobao.android.weex_framework.util.h.a(Class.forName("com.taobao.android.weex_plugin.WeexPlugin"), TBPlayerConst.TBPlayerMethodSetup, new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused2) {
            }
            if (m.c()) {
                WeexInstanceChecker.a();
            }
            if (!MUSCommonNativeBridge.b()) {
                z = true;
            }
            com.taobao.android.weex.util.c.a(z);
            MUSCommonNativeBridge.a();
            MUSCommonNativeBridge.d();
            WeexAppMonitor.a();
            try {
                n.a(application);
                n.a("Weex", com.taobao.android.weex_framework.util.p.a(), com.taobao.android.weex_framework.util.p.b());
                registerZCacheAccessApi();
            } catch (Throwable unused3) {
            }
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex_framework.MUSEngine.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        MUSEngine.access$000();
                    }
                }
            });
            sInit = true;
        }
    }

    public static void registerZCacheAccessApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("546b19b2", new Object[0]);
        } else if (sZCacheAccessInit) {
        } else {
            int i = sZCacheAccessRetry;
            sZCacheAccessRetry = i + 1;
            if (i > 5) {
                sZCacheAccessInit = true;
                return;
            }
            try {
                long l = n.l();
                if (l == 0) {
                    return;
                }
                WeexPlatformCommonBridge.registerZCacheAPI(l);
                sZCacheAccessInit = true;
            } catch (Throwable th) {
                if ((th instanceof NoClassDefFoundError) || (th instanceof NoSuchMethodError)) {
                    sZCacheAccessInit = true;
                    com.taobao.android.weex_framework.util.g.f("WeexZCacheInit", "register getAccessAPI error");
                    return;
                }
                com.taobao.android.weex_framework.util.g.c("WeexZCacheInit", "register getAccessAPI error", th);
            }
        }
    }

    public static void initApplicationSync(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136fbd3d", new Object[]{application});
        } else if (sApplicationInitCalled) {
        } else {
            synchronized (sLock) {
                if (sApplicationInitCalled) {
                    return;
                }
                String packageName = application.getPackageName();
                String str = "Try calling " + packageName + ".weex2.AppWeexEngineAutoInit to init weex2";
                if (!reflectCallAutoInitClass(application, packageName)) {
                    String str2 = "No " + packageName + ".weex2.AppWeexEngineAutoInit class, app should init weex2 manually";
                } else {
                    String str3 = "Called " + packageName + ".weex2.AppWeexEngineAutoInit to init weex2";
                    sApplicationInit = true;
                    if (!sInit) {
                        throw new IllegalStateException("AppWeexEngineAutoInit should call MUSEngin.initialize");
                    }
                }
                sApplicationInitCalled = true;
            }
        }
    }

    private static boolean reflectCallAutoInitClass(Application application, String str) {
        try {
            Class.forName(str + ".weex2.AppWeexEngineAutoInit").getDeclaredMethod("init", Application.class).invoke(null, application);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void initApplicationAsync(final Application application, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c691c037", new Object[]{application, aVar});
        } else if (sApplicationInitCalled) {
            callbackInitFinished(aVar);
        } else {
            new Thread(null, new Runnable() { // from class: com.taobao.android.weex_framework.MUSEngine.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (MUSEngine.access$100()) {
                        MUSEngine.access$200(a.this);
                    } else {
                        synchronized (MUSEngine.access$300()) {
                            if (MUSEngine.access$100()) {
                                MUSEngine.access$200(a.this);
                                return;
                            }
                            MUSEngine.initApplicationSync(application);
                            MUSEngine.access$200(a.this);
                        }
                    }
                }
            }, "Weex2Init").start();
        }
    }

    private static void callbackInitFinished(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e103e5", new Object[]{aVar});
        } else if (aVar == null) {
        } else {
            aVar.afterInitFinished();
        }
    }

    private static void updateTarget30(Application application) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c856801", new Object[]{application});
        } else if (Build.VERSION.SDK_INT < 29) {
        } else {
            ApplicationInfo applicationInfo = application.getApplicationInfo();
            if (applicationInfo != null && applicationInfo.targetSdkVersion >= 30) {
                z = true;
            }
            m.c = z;
        }
    }

    public static boolean isInitDone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9edfc287", new Object[0])).booleanValue() : sInit;
    }

    public static boolean isApplicationInitDone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b124d23", new Object[0])).booleanValue() : sApplicationInitCalled;
    }

    public static void updateLayoutParams(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5186308", new Object[]{context});
            return;
        }
        if (context == null) {
            context = m.b();
        }
        if (context == null) {
            return;
        }
        registerLayoutParamsToNative(context);
    }

    private static void registerLayoutParamsToNative(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a81a81c", new Object[]{context});
        } else {
            com.taobao.android.weex_framework.util.l.a(com.taobao.android.weex_framework.util.l.e(context), com.taobao.android.weex_framework.util.l.g(context), context.getResources().getDisplayMetrics().density);
        }
    }

    private static void registerInnerModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5cdac6", new Object[0]);
            return;
        }
        com.taobao.android.weex_framework.module.a.a(com.taobao.android.weex_framework.util.a.ATOM_EXT_window, (b) new MUSWindowModule.a(), false);
        com.taobao.android.weex_framework.module.a.a("stream", (Class<? extends MUSModule>) MUSStreamModule.class, false);
        com.taobao.android.weex_framework.module.a.a("@mus-module/stream", (Class<? extends MUSModule>) MUSStreamModule.class, false);
        com.taobao.android.weex_framework.module.a.a("dom", (Class<? extends MUSModule>) MUSDomModule.class, false);
        com.taobao.android.weex_framework.module.a.a(MUSDevModule.NAME, (Class<? extends MUSModule>) MUSDevModule.class, false);
        jux.a("sessionStorage", WXSessionStorageModule.class, WXSessionStorageModule.METHODS);
        jux.a(WXLocalStorageModule.NAME, WXLocalStorageModule.class, WXLocalStorageModule.METHODS);
        jux.a(WXStorageModule.NAME, WXStorageModule.class, WXStorageModule.METHODS);
        jux.a("MUSAppMonitor", WXAppMonitorModule.class, WXAppMonitorModule.METHODS);
        com.taobao.android.weex_framework.module.a.a("navigator", (b) new MUSNavigatorModule.a(), false);
        com.taobao.android.weex_framework.module.a.a("nativeApi", (b) new MUSNativeApiModule.a(), false);
        jux.a("audio", WXAudioModule.class, WXAudioModule.METHODS);
    }

    public static void registerUINode(String str, Class<? extends INode> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d16b93", new Object[]{str, cls});
        } else {
            com.taobao.android.weex_framework.ui.m.a(str, cls);
        }
    }

    public static void registerUINode(String str, com.taobao.android.weex_framework.ui.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac36514", new Object[]{str, dVar});
        } else {
            com.taobao.android.weex_framework.ui.m.a(str, dVar);
        }
    }

    public static void registerUINode(String str, Class<? extends INode> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("675cb9a1", new Object[]{str, cls, new Boolean(z)});
        } else {
            com.taobao.android.weex_framework.ui.m.a(str, cls, z);
        }
    }

    public static void registerPlatformView(String str, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d544f071", new Object[]{str, cls});
        } else {
            com.taobao.android.weex_framework.ui.m.a(str, new com.taobao.android.weex_framework.platform.c(cls));
        }
    }

    public static void registerPlatformView(String str, com.taobao.android.weex_framework.platform.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("553b658", new Object[]{str, cVar});
        } else {
            com.taobao.android.weex_framework.ui.m.a(str, cVar);
        }
    }

    public static boolean registerModule(String str, Class<? extends MUSModule> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("51e31701", new Object[]{str, cls})).booleanValue() : com.taobao.android.weex_framework.module.a.a(str, cls);
    }

    public static boolean registerModule(String str, Class<? extends MUSModule> cls, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ea807b7b", new Object[]{str, cls, new Boolean(z)})).booleanValue() : com.taobao.android.weex_framework.module.a.a(str, cls, z);
    }

    public static boolean registerModule(String str, b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d8ee204", new Object[]{str, bVar, new Boolean(z)})).booleanValue() : com.taobao.android.weex_framework.module.a.a(str, bVar, z);
    }

    public static boolean hasJSBindingPlugin(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8901c24a", new Object[]{str})).booleanValue() : MUSCommonNativeBridge.a(str);
    }

    public static void updateDelayedNativeRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc51a79a", new Object[0]);
        } else if (sDelayedJobDone || !com.taobao.android.weex_framework.ui.m.a()) {
        } else {
            sDelayedJobDone = true;
        }
    }

    public static void resetDelayedNativeRegisterState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50413f4b", new Object[0]);
        } else {
            sDelayedJobDone = false;
        }
    }

    private static void preloadClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
            return;
        }
        com.taobao.android.weex_framework.util.d.a();
        WeexDOMInstance.preloadClass();
        dpj.a();
        jvb.f();
        jvc.a();
        k.b();
        MUSInstanceConfig.d();
        MUSInstanceConfig.MUSRenderType.preloadClass();
        MUSInstanceConfig.RenderMode.preloadClass();
        com.taobao.android.weex.util.b.a();
        com.taobao.android.weex.g.a();
        juw.f();
        WeexInstanceStatus.preloadClass();
        com.taobao.android.weex_framework.util.l.a();
        i.a();
        WeexValueImpl.preloadClass();
        WeexPlatformInstanceBridge.preloadClass();
        WeexPlatformThreadBridge.preloadClass();
        com.taobao.android.weex.util.e.e();
        com.taobao.android.weex.util.d.a();
        jtz.b();
        juk.a();
        jvw.c();
        com.taobao.android.weex_framework.ui.b.b();
        jwd.c().b();
        WeexInstanceChecker.a();
    }
}
