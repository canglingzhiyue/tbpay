package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.autoclear.CacheManager;
import com.taobao.android.cachecleaner.c;
import com.taobao.android.cachecleaner.g;
import com.taobao.android.cachecleaner.monitor.config.a;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import tb.iga;

/* loaded from: classes4.dex */
public class dvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-906230049);
    }

    public static void a(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        a.a().a(application, hashMap);
        dvp.a();
        g.b().execute(new Runnable() { // from class: tb.dvb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    new dvd(application).a(new iga.a() { // from class: tb.dvb.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.iga.a
                        public void a(CacheOverviewInfo cacheOverviewInfo, Map<String, Long> map) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("890add93", new Object[]{this, cacheOverviewInfo, map});
                                return;
                            }
                            c.a().a(application.getApplicationContext(), cacheOverviewInfo);
                            new CacheManager(application).a(cacheOverviewInfo, map);
                        }
                    });
                } catch (Throwable th) {
                    TLog.loge(CacheCleaner.MODULE, "CacheCleanerIdleTask", "run: monitor failed with exception" + th);
                    dvp.a("initExecuteError", th.getMessage());
                }
            }
        });
    }
}
