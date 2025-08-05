package android.taobao.windvane.extra.launch;

import android.app.Application;
import android.taobao.windvane.config.WVConfigManager;
import android.taobao.windvane.config.m;
import android.taobao.windvane.config.n;
import android.taobao.windvane.config.q;
import android.taobao.windvane.config.s;
import android.taobao.windvane.extra.WVSchemeProcessor;
import android.taobao.windvane.extra.config.TBConfigManager;
import android.taobao.windvane.extra.launch.WVOptimizedStartup;
import android.taobao.windvane.extra.uc.WVLaunchTaskOptAB;
import android.taobao.windvane.extra.uc.pool.WebViewPool;
import android.taobao.windvane.monitor.i;
import android.taobao.windvane.util.b;
import android.taobao.windvane.webview.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import com.taobao.android.tbuprofen.magic.RuntimeUtils;
import com.taobao.themis.kernel.utils.v;
import com.uc.webview.export.multiprocess.PreStartup;
import java.util.HashMap;
import tb.aed;
import tb.aem;
import tb.kge;

/* loaded from: classes2.dex */
public class WindVaneHomeVisibleTask extends InitOnceTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1794789557);
    }

    public static /* synthetic */ Object ipc$super(WindVaneHomeVisibleTask windVaneHomeVisibleTask, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.extra.launch.InitOnceTask
    public void initImpl(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f761cb", new Object[]{this, application, hashMap});
            return;
        }
        v groupDetail = WVLaunchTaskOptAB.getInstance().getGroupDetail();
        boolean enablePrioritizeInitAndDelayPreCreate = LaunchTaskExperiment.enablePrioritizeInitAndDelayPreCreate(application);
        if (groupDetail.b()) {
            z = RuntimeUtils.a();
            WVOptimizedStartup.Params params = new WVOptimizedStartup.Params(application);
            params.setPreCreateWebView(!enablePrioritizeInitAndDelayPreCreate);
            WVOptimizedStartup.startup(params);
        } else {
            initWindVaneConfig(application, hashMap);
            initUCAndPreStartup(application, hashMap);
        }
        e.a(RVLLevel.Info, "WindVane/Launch").a("WVLaunchTaskOptAB", (Object) groupDetail.a()).a("disableVerifier", Boolean.valueOf(z)).a("enablePrioritizeInitAndDelayPreCreate", Boolean.valueOf(enablePrioritizeInitAndDelayPreCreate)).a();
        aem.a().a(aed.getInstance(), aem.f25291a);
        i.init();
        j.a(new WVSchemeProcessor());
        if (enablePrioritizeInitAndDelayPreCreate) {
            return;
        }
        WebViewPool.setUp(application);
    }

    private void initWindVaneConfig(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4772e957", new Object[]{this, application, hashMap});
            return;
        }
        TBConfigManager.getInstance().initEarly(application);
        b.a();
        android.taobao.windvane.config.j.a().b();
        s.a().c();
        n.a().c();
        m.a().b();
        q.a().b();
        WVConfigManager.a().a("windvane_common", android.taobao.windvane.config.j.a());
        WVConfigManager.a().a("windvane_domain", n.a());
        WVConfigManager.a().a("WindVane_URL_config", s.a());
        WVConfigManager.a().a(WVConfigManager.CONFIGNAME_COOKIE, m.a());
        WVConfigManager.a().a("windvane_uc_core", q.a());
        TBConfigManager.getInstance().initConfig();
    }

    private void initUCAndPreStartup(Application application, HashMap<String, Object> hashMap) {
        PreStartup.startup(application);
        try {
            android.taobao.windvane.util.m.c("WindVaneSDK", "trying to init uc core ");
            Class.forName("android.taobao.windvane.extra.uc.WVUCWebView").getDeclaredMethod("staticInitializeOnce", new Class[0]).invoke(null, new Object[0]);
            android.taobao.windvane.util.m.c("WindVaneSDK", "init windvane called");
        } catch (Throwable th) {
            android.taobao.windvane.util.m.e("WindVaneSDK", "failed to load WVUCWebView", th, new Object[0]);
        }
    }
}
