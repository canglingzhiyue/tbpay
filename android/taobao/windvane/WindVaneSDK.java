package android.taobao.windvane;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.taobao.windvane.config.EnvEnum;
import android.taobao.windvane.config.WVConfigManager;
import android.taobao.windvane.config.h;
import android.taobao.windvane.config.i;
import android.taobao.windvane.config.j;
import android.taobao.windvane.config.p;
import android.taobao.windvane.config.q;
import android.taobao.windvane.config.s;
import android.taobao.windvane.jsbridge.n;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import android.util.AndroidRuntimeException;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.File;
import java.io.IOException;
import tb.kge;

/* loaded from: classes.dex */
public class WindVaneSDK {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SPNAME_ENV = "wv_evn";
    private static final String TAG = "WindVaneSDK";
    private static final String VALUE_NAME = "evn_value";
    private static final String WV_MULT = "wv_multi_";
    private static boolean initialized;
    private static boolean settedDataDirSuffix;

    static {
        kge.a(231486380);
        initialized = false;
        settedDataDirSuffix = false;
    }

    public static void init(Context context, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8409dc1", new Object[]{context, hVar});
        } else {
            init(context, null, 0, hVar);
        }
    }

    @Deprecated
    public static void init(Context context, String str, int i, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d60ab8", new Object[]{context, str, new Integer(i), hVar});
        } else {
            init(context, str, hVar);
        }
    }

    public static void init(Context context, String str, h hVar) {
        if (initialized) {
            m.c(TAG, "WindVaneSDK has already initialized");
            return;
        }
        m.c(TAG, "WindVaneSDK init");
        if (context == null) {
            throw new NullPointerException("init error, context is null");
        }
        webviewTarget28Support(context);
        Application application = (Application) (context instanceof Application ? context : context.getApplicationContext());
        android.taobao.windvane.config.a.f = application;
        if (application == null) {
            throw new IllegalArgumentException("init error, context should be Application or its subclass");
        }
        if (StringUtils.isEmpty(str)) {
            str = "caches";
        }
        android.taobao.windvane.cache.a.a().a(context, str, 0);
        try {
            a.a(context);
        } catch (Throwable unused) {
        }
        AssetManager assets = android.taobao.windvane.config.a.f.getResources().getAssets();
        try {
            File a2 = android.taobao.windvane.file.b.a(android.taobao.windvane.config.a.f, "windvane/ucsdk");
            File[] listFiles = a2.listFiles();
            if (listFiles != null && listFiles.length == 0) {
                android.taobao.windvane.file.b.a(AssetsDelegate.proxy_open(assets, "uclibs.zip"), a2.getAbsolutePath());
            }
            hVar.l = a2.getAbsolutePath();
            m.c(TAG, "UC init by uclibs");
        } catch (IOException unused2) {
        }
        if (ABGlobal.isFeatureOpened(context, "OptInitWindVane")) {
            if (!i.a().b()) {
                android.taobao.windvane.config.a.a().a(hVar);
            }
        } else {
            android.taobao.windvane.config.a.a().a(hVar);
        }
        android.taobao.windvane.util.b.a();
        android.taobao.windvane.monitor.b.init();
        initConfig();
        n.a(new android.taobao.windvane.jsbridge.m());
        try {
            m.c(TAG, "trying to init uc core ");
            Class.forName("android.taobao.windvane.extra.uc.WVUCWebView").getDeclaredMethod("staticInitializeOnce", new Class[0]).invoke(null, new Object[0]);
            m.c(TAG, "init windvane called");
        } catch (Throwable th) {
            m.e(TAG, "failed to load WVUCWebView", th, new Object[0]);
        }
        initialized = true;
    }

    public static void webviewTarget28Support(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ff4e82", new Object[]{context});
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28) {
                return;
            }
            String c = android.taobao.windvane.util.a.c(context);
            if (StringUtils.isEmpty(c)) {
                return;
            }
            WebView.setDataDirectorySuffix(c);
            settedDataDirSuffix = true;
        } catch (Throwable th) {
            if (settedDataDirSuffix) {
                return;
            }
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("WebView Android P Support Error");
            androidRuntimeException.addSuppressed(th);
            androidRuntimeException.printStackTrace();
        }
    }

    private static void initConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[0]);
            return;
        }
        j.a().b();
        s.a().c();
        android.taobao.windvane.config.n.a().c();
        android.taobao.windvane.config.m.a().b();
        q.a().b();
        WVConfigManager.a().a("windvane_common", j.a());
        WVConfigManager.a().a("windvane_domain", android.taobao.windvane.config.n.a());
        WVConfigManager.a().a("WindVane_URL_config", s.a());
        WVConfigManager.a().a(WVConfigManager.CONFIGNAME_COOKIE, android.taobao.windvane.config.m.a());
        WVConfigManager.a().a("windvane_uc_core", q.a());
    }

    public static void initURLCache(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5293ba3b", new Object[]{context, str, new Integer(i)});
        } else {
            android.taobao.windvane.cache.a.a().a(context, str, i);
        }
    }

    public static boolean isTrustedUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2c579ad7", new Object[]{str})).booleanValue() : p.a(str);
    }

    public static void setEnvMode(EnvEnum envEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c73c191f", new Object[]{envEnum});
        } else if (envEnum == null) {
        } else {
            try {
                m.c(SPNAME_ENV, "setEnvMode : " + envEnum.getValue());
                android.taobao.windvane.config.a.f1556a = envEnum;
                if (android.taobao.windvane.util.b.c(SPNAME_ENV, VALUE_NAME) == envEnum.getKey()) {
                    return;
                }
                WVConfigManager.a().b();
                android.taobao.windvane.util.b.a(SPNAME_ENV, VALUE_NAME, envEnum.getKey());
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean isInitialized() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[0])).booleanValue() : initialized;
    }
}
