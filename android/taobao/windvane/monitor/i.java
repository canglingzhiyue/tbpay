package android.taobao.windvane.monitor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int OPTION_ERROR = 2;
    public static final int OPTION_HSC = 16;
    public static final int OPTION_JSBRIDGE = 4;
    public static final int OPTION_PACKAGEAPP = 8;
    public static final int OPTION_PERFORMANCE = 1;

    static {
        kge.a(-2044292158);
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        init(23);
        k.getInstance().init();
    }

    public static void init(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcec44c", new Object[]{new Integer(i)});
            return;
        }
        m mVar = new m();
        if ((i & 1) > 0) {
            o.registerPerformanceMonitor(mVar);
            o.registerWVMonitor(mVar);
        }
        if ((i & 2) > 0) {
            o.registerErrorMonitor(mVar);
        }
        if ((i & 4) > 0) {
            o.registerJsBridgeMonitor(new h());
        }
        if ((i & 8) > 0) {
            System.currentTimeMillis();
            if (o.getPackageMonitorInterface() != null) {
                o.getPackageMonitorInterface().uploadStartAppTime(System.currentTimeMillis());
            }
        }
        e eVar = new e();
        if ((i & 16) > 0 && android.taobao.windvane.config.j.commonConfig.aR) {
            o.registerWVJsErrorMonitorInterface(eVar);
            o.registerWVWhitePageMonitorInterface(eVar);
            o.registerWVNetWorkMonitorInterface(eVar);
            o.registerWVJsBridgeMonitorInterface(eVar);
            o.registerWVZCacheMonitorInterface(eVar);
            o.registerWVPerformanceMonitorInterface(eVar);
        }
        a.init();
    }
}
