package com.taobao.android.detail.wrapper;

import android.app.Application;
import android.os.AsyncTask;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.main.IndicatorBar;
import com.taobao.android.detail.core.ultronengine.c;
import com.taobao.android.detail.core.utils.e;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.wrapper.ext.dinamicx.a;
import com.taobao.tao.Globals;
import java.io.Serializable;
import java.util.HashMap;
import tb.ecj;
import tb.eik;
import tb.eip;
import tb.emu;
import tb.epv;
import tb.fac;
import tb.fgo;
import tb.kge;

/* loaded from: classes5.dex */
public final class TBDetailLauncher implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBDetailLauncher";
    public static Application mApplication;

    static {
        kge.a(1805383142);
        kge.a(1028243835);
    }

    public static void detailPerfSwitchInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3843be65", new Object[0]);
            return;
        }
        try {
            e.a();
        } catch (Throwable th) {
            i.a(TAG, "init detail perf switch error", th);
        }
    }

    public final void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (emu.c()) {
        } else {
            emu.a("com.taobao.android.detail.wrapper.TBDetailLauncher");
            i.a("DetailTime", "TBDetailLauncher Start ++");
            mApplication = application;
            long uptimeMillis = SystemClock.uptimeMillis();
            detailPerfSwitchInit();
            fac.a();
            orangeConfigInitializer();
            loadTemplate();
            IndicatorBar.preloadTypeface(application);
            fgo.f27928a = true;
            i.a("DetailTime", "TBDetailLauncher isLaunchReady" + fgo.f27928a);
            loadStaticDepend();
            c.b();
            eik.b();
            eik.a();
            preLoadClass();
            i.a("DetailTime", toString());
            long uptimeMillis2 = SystemClock.uptimeMillis();
            i.a("DetailTime", "TBDetailLauncher End ,cost " + (uptimeMillis2 - uptimeMillis) + "ms");
        }
    }

    private void preLoadClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43174dd6", new Object[]{this});
        } else if (!eip.R) {
        } else {
            try {
                Class.forName("tb.ebx");
                Class.forName("com.taobao.android.detail.core.performance.preload.k");
                Class.forName("com.taobao.android.detail.core.performance.preload.j");
                Class.forName("com.taobao.android.detail.wrapper.ext.preload.DetailPreloadRequester");
                Class.forName("com.taobao.android.detail.wrapper.ext.preload.b");
                Class.forName("tb.dya");
                Class.forName("tb.dym");
                Class.forName("tb.dyf");
                Class.forName("com.taobao.android.detail.core.detail.activity.b");
                Class.forName("tb.dyk");
                Class.forName("tb.eyq");
                Class.forName("tb.eyu");
                Class.forName("tb.fem");
                Class.forName("tb.feo");
                Class.forName("tb.fep");
                Class.forName("tb.feq");
                Class.forName("com.taobao.android.detail.wrapper.ext.request.client.newmtop.d");
                Class.forName("com.taobao.android.detail.wrapper.ext.request.client.newmtop.PrefetchMtopRequestCallback");
                i.c("DetailTime", "preloadClass done");
            } catch (Throwable th) {
                i.a("DetailTime", "preloadClass error", th);
            }
        }
    }

    private void orangeConfigInitializer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe76539", new Object[]{this});
        } else {
            fgo.a(getApplication().getApplicationContext());
        }
    }

    private void loadTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af717407", new Object[]{this});
            return;
        }
        a.a(null);
        new ecj(getApplication().getApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private void loadStaticDepend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("965c3b07", new Object[]{this});
            return;
        }
        try {
            for (String str : new String[]{"com.taobao.avplayer", "com.taobao.detail.rate", "com.taobao.taobao.home", "com.taobao.android.capsule", "com.taobao.android.interactive"}) {
                com.android.tools.ir.runtime.c.a(str, null);
            }
        } catch (Throwable unused) {
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "isOpenNaviteOptimize:" + epv.f27513a + ";DVideo:" + epv.b + ";DAsyncView:" + epv.c + ";DSkuModel:" + epv.d + ";DUltronCache:" + epv.e + ";";
    }

    public static Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        Application application = mApplication;
        return application == null ? Globals.getApplication() : application;
    }
}
