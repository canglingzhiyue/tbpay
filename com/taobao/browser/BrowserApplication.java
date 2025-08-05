package com.taobao.browser;

import android.taobao.windvane.util.m;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.browser.config.BrowserConfigManager;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kfb;
import tb.kge;

/* loaded from: classes6.dex */
public class BrowserApplication extends PanguApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BrowserApplication";
    private static BrowserApplication browserApplication;
    private static com.taobao.orange.d sConfigListener;
    private static volatile AtomicBoolean sHasInitAppMonitor;
    private static boolean sOpenMultiMode;

    public static /* synthetic */ Object ipc$super(BrowserApplication browserApplication2, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(477774818);
        sOpenMultiMode = false;
        sHasInitAppMonitor = new AtomicBoolean(false);
        sConfigListener = new com.taobao.orange.d() { // from class: com.taobao.browser.BrowserApplication.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    return;
                }
                m.c(BrowserApplication.TAG, "onConfigUpdate in");
                if (!"group_common_browser".equals(str)) {
                    return;
                }
                com.taobao.browser.config.a.a().c();
                BrowserApplication.setupOpenMultiMode();
                kfb.a().b();
            }
        };
    }

    @Override // com.taobao.android.lifecycle.PanguApplication, android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        registerOrangeListener();
        setupOpenMultiMode();
        super.onCreate();
        new TaoApplication().onCreate(this);
        browserApplication = this;
        initMonitor();
    }

    public static void registerConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e7f1cc", new Object[0]);
            return;
        }
        com.taobao.browser.config.a.a().b();
        BrowserConfigManager.a().a("group_common_browser", com.taobao.browser.config.a.a());
    }

    public static void registerOrangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c111c8c", new Object[0]);
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"group_common_browser"}, sConfigListener, true);
        }
    }

    public static void setupOpenMultiMode() {
        IpChange ipChange = $ipChange;
        try {
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1d1e5dc", new Object[0]);
                return;
            }
            try {
                if (!com.taobao.browser.ipc.a.a(Globals.getApplication())) {
                    sOpenMultiMode = true;
                    if (isOpenMultiMode()) {
                        UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty(com.taobao.browser.utils.i.KEY_MONITOR_HAS_OPEN_MULTI_PROCESS_MODE, "true");
                        return;
                    } else {
                        UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty(com.taobao.browser.utils.i.KEY_MONITOR_HAS_OPEN_MULTI_PROCESS_MODE, "false");
                        return;
                    }
                }
                sOpenMultiMode = false;
                m.e(TAG, "setupOpenMultiMode:sOpenMultiMode" + sOpenMultiMode);
                if (isOpenMultiMode()) {
                    UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty(com.taobao.browser.utils.i.KEY_MONITOR_HAS_OPEN_MULTI_PROCESS_MODE, "true");
                } else {
                    UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty(com.taobao.browser.utils.i.KEY_MONITOR_HAS_OPEN_MULTI_PROCESS_MODE, "false");
                }
            } catch (Exception e) {
                m.b(TAG, "setupOpenMultiMode exception:", e, new Object[0]);
                sOpenMultiMode = false;
                if (isOpenMultiMode()) {
                    UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty(com.taobao.browser.utils.i.KEY_MONITOR_HAS_OPEN_MULTI_PROCESS_MODE, "true");
                } else {
                    UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty(com.taobao.browser.utils.i.KEY_MONITOR_HAS_OPEN_MULTI_PROCESS_MODE, "false");
                }
            }
        } catch (Throwable th) {
            if (isOpenMultiMode()) {
                UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty(com.taobao.browser.utils.i.KEY_MONITOR_HAS_OPEN_MULTI_PROCESS_MODE, "true");
            } else {
                UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty(com.taobao.browser.utils.i.KEY_MONITOR_HAS_OPEN_MULTI_PROCESS_MODE, "false");
            }
            throw th;
        }
    }

    public static boolean isOpenMultiMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2fca22d3", new Object[0])).booleanValue() : sOpenMultiMode;
    }

    public static BrowserApplication getBrowserApplication() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BrowserApplication) ipChange.ipc$dispatch("f728b4d4", new Object[0]) : browserApplication;
    }

    public static void initMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa057db1", new Object[0]);
        } else if (sHasInitAppMonitor.get() || !sHasInitAppMonitor.compareAndSet(false, true)) {
        } else {
            try {
                DimensionSet create = DimensionSet.create();
                create.addDimension(com.taobao.browser.utils.i.KEY_MONITOR_IN_MAIN_PROCESS);
                create.addDimension(com.taobao.browser.utils.i.KEY_SHOULD_COLLECT_MEMORY_DATA);
                create.addDimension(com.taobao.browser.utils.i.KEY_MONITOR_URL);
                create.addDimension(com.taobao.browser.utils.i.KEY_MONITOR_PHONE_CLASS);
                create.addDimension(com.taobao.browser.utils.i.KEY_MONITOR_HAS_OPEN_MULTI_PROCESS_MODE);
                MeasureSet create2 = MeasureSet.create();
                Measure measure = new Measure(com.taobao.browser.utils.i.KEY_MONITOR_NAV_TO_ONCREATE_TIME);
                Measure measure2 = new Measure(com.taobao.browser.utils.i.KEY_MONITOR_MAIN_PROCESS_MEMORY);
                Measure measure3 = new Measure(com.taobao.browser.utils.i.KEY_MONITOR_MAIN_PROCESS_MEMORY_RATE);
                Measure measure4 = new Measure(com.taobao.browser.utils.i.KEY_MONITOR_SUB_PROCESS_MEMORY);
                Measure measure5 = new Measure(com.taobao.browser.utils.i.KEY_MONITOR_SUB_PROCESS_MEMORY_RATE);
                Measure measure6 = new Measure(com.taobao.browser.utils.i.KEY_MONITOR_DEVICE_TOTAL_MEMORY);
                create2.addMeasure(measure);
                create2.addMeasure(measure2);
                create2.addMeasure(measure4);
                create2.addMeasure(measure6);
                create2.addMeasure(measure3);
                create2.addMeasure(measure5);
                AppMonitor.register(com.taobao.browser.utils.i.KEY_MONITOR_MODULE, com.taobao.browser.utils.i.KEY_MONITOR_ENTER_ACTIVITY_MONITOR, create2, create);
                DimensionSet create3 = DimensionSet.create();
                create3.addDimension(com.taobao.browser.utils.i.KEY_MONITOR_PHONE_CLASS);
                create3.addDimension(com.taobao.browser.utils.i.KEY_MONITOR_REMOTE_INVOKE_CLASS);
                create3.addDimension(com.taobao.browser.utils.i.KEY_MONITOR_REMOTE_INVOKE_METHOD);
                MeasureSet create4 = MeasureSet.create();
                Measure measure7 = new Measure(com.taobao.browser.utils.i.KEY_MONITOR_REMOTE_INVOKE_TIME);
                Measure measure8 = new Measure(com.taobao.browser.utils.i.KEY_MONITOR_REMOTE_CONNECT_TIME);
                create4.addMeasure(measure7);
                create4.addMeasure(measure8);
                AppMonitor.register(com.taobao.browser.utils.i.KEY_MONITOR_MODULE, com.taobao.browser.utils.i.KEY_MONITOR_REMOTE_INVOKE_MONITOR, create4, create3);
            } catch (Exception unused) {
                sHasInitAppMonitor.set(false);
            }
        }
    }
}
