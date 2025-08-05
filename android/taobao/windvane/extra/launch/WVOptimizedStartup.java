package android.taobao.windvane.extra.launch;

import android.app.Application;
import android.os.SystemClock;
import android.taobao.windvane.config.WVConfigManager;
import android.taobao.windvane.config.j;
import android.taobao.windvane.config.m;
import android.taobao.windvane.config.n;
import android.taobao.windvane.config.q;
import android.taobao.windvane.config.s;
import android.taobao.windvane.extra.config.TBConfigManager;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.jsbridge.JSAPIManager;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.pool.WebViewPool;
import android.taobao.windvane.thread.WVThreadPool;
import android.taobao.windvane.util.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import com.uc.webview.export.extension.U4Engine;
import com.uc.webview.export.multiprocess.PreStartup;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes2.dex */
public class WVOptimizedStartup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WindVane/PreStartUp";
    private static final AtomicBoolean sInitialized;

    public static /* synthetic */ void access$100(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efbc5327", new Object[]{application});
        } else {
            initConfig(application);
        }
    }

    public static /* synthetic */ void access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a27df9", new Object[0]);
        } else {
            initJSAPIAndEmbed();
        }
    }

    /* loaded from: classes2.dex */
    public static class Params {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Application application;
        private boolean mPreCreateWebView = true;

        static {
            kge.a(-504124324);
        }

        public static /* synthetic */ Application access$000(Params params) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("18b82a19", new Object[]{params}) : params.application;
        }

        public static /* synthetic */ boolean access$300(Params params) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c056be11", new Object[]{params})).booleanValue() : params.mPreCreateWebView;
        }

        public Params(Application application) {
            this.application = application;
        }

        public void setPreCreateWebView(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a394291", new Object[]{this, new Boolean(z)});
            } else {
                this.mPreCreateWebView = z;
            }
        }
    }

    static {
        kge.a(1368739502);
        sInitialized = new AtomicBoolean(false);
    }

    public static void startup(final Params params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dff557", new Object[]{params});
        } else if (sInitialized.get()) {
        } else {
            if (!isParamsValid(params)) {
                e.a(RVLLevel.Error, TAG, "params is invalid");
            } else if (!sInitialized.compareAndSet(false, true)) {
            } else {
                boolean isUCStartInit = WVCore.getInstance().isUCStartInit();
                e.a(RVLLevel.Info, TAG).a("startup").a("isInitStart", Boolean.valueOf(isUCStartInit)).a();
                if (isUCStartInit) {
                    return;
                }
                WVThreadPool.getInstance().execute(new Runnable() { // from class: android.taobao.windvane.extra.launch.WVOptimizedStartup.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            PreStartup.startup(Params.access$000(Params.this));
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            U4Engine.createInitializer();
                            long uptimeMillis3 = SystemClock.uptimeMillis();
                            WVUCWebView.initUCCore();
                            e.a(RVLLevel.Info, WVOptimizedStartup.TAG).a("startup").a("preStartUpCost", Long.valueOf(uptimeMillis2 - uptimeMillis)).a("createInitializerCost", Long.valueOf(uptimeMillis3 - uptimeMillis2)).a("initUCCoreCost", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3)).a();
                        } catch (Exception e) {
                            RVLLevel rVLLevel = RVLLevel.Error;
                            e.a(rVLLevel, WVOptimizedStartup.TAG, "startup error" + e.getMessage());
                        }
                    }
                });
                WVThreadPool.getInstance().execute(new Runnable() { // from class: android.taobao.windvane.extra.launch.WVOptimizedStartup.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        long uptimeMillis = SystemClock.uptimeMillis();
                        try {
                            WVOptimizedStartup.access$100(Params.access$000(Params.this));
                        } catch (Exception e) {
                            RVLLevel rVLLevel = RVLLevel.Error;
                            e.a(rVLLevel, WVOptimizedStartup.TAG, "initConfig error" + e.getMessage());
                        }
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        WVOptimizedStartup.access$200();
                        e.a(RVLLevel.Info, WVOptimizedStartup.TAG).a("startup").a("configInitCost", Long.valueOf(uptimeMillis2 - uptimeMillis)).a("jsapiInitCost", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2)).a();
                    }
                });
                if (!Params.access$300(params)) {
                    return;
                }
                WebViewPool.setUp(Params.access$000(params));
            }
        }
    }

    private static void initConfig(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce180d06", new Object[]{application});
            return;
        }
        TBConfigManager.getInstance().initEarly(application);
        b.a();
        j.a().b();
        s.a().c();
        n.a().c();
        m.a().b();
        q.a().b();
        WVConfigManager.a().a("windvane_common", j.a());
        WVConfigManager.a().a("windvane_domain", n.a());
        WVConfigManager.a().a("WindVane_URL_config", s.a());
        WVConfigManager.a().a(WVConfigManager.CONFIGNAME_COOKIE, m.a());
        WVConfigManager.a().a("windvane_uc_core", q.a());
        TBConfigManager.getInstance().initConfig();
    }

    private static void initJSAPIAndEmbed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7f2a6a", new Object[0]);
            return;
        }
        JSAPIManager.getInstance().register();
        android.taobao.windvane.embed.b.a();
    }

    private static boolean isParamsValid(Params params) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab4a61ea", new Object[]{params})).booleanValue() : (params == null || Params.access$000(params) == null) ? false : true;
    }
}
