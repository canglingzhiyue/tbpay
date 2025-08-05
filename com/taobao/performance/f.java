package com.taobao.performance;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.utils.m;
import com.taobao.homepage.utils.n;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import tb.kge;
import tb.ope;
import tb.oqc;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1940238911);
    }

    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            c();
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!n.n().a()) {
            c();
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.performance.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        f.b();
                    }
                }
            });
        }
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.taobao.tao.recommend3.tracelog.b.a().e(com.taobao.tao.recommend3.tracelog.b.HOME_DATA_PROCESS_TRIGGER);
        String m = oqc.a().m();
        ope b = oqc.a().b();
        AwesomeGetContainerData b2 = b == null ? null : b.b(m);
        if (b2 == null || b2.isEmptySync() || (!n.o() && !n.g())) {
            oqc.a().d();
            com.taobao.android.home.component.utils.e.e(m.TAG, "HomepageDataTriggerProcess error ");
            com.taobao.tao.recommend3.tracelog.b.a().f(com.taobao.tao.recommend3.tracelog.b.HOME_DATA_PROCESS_TRIGGER);
            return;
        }
        boolean z = !HomePageUtility.a(b2);
        String str = z ? "coldStart" : "loadCache";
        com.taobao.tao.recommend3.tracelog.b.a().e(com.taobao.tao.recommend3.tracelog.b.HOME_RENDER);
        oqc.a().a(z, true, str, new String[]{oqc.a().l(), oqc.a().m()});
        com.taobao.android.home.component.utils.e.e(m.TAG, "HomepageDataTriggerProcess success thread = " + Thread.currentThread().getName() + " ,type " + str + ",time =" + (System.currentTimeMillis() - currentTimeMillis));
        com.taobao.tao.recommend3.tracelog.b.a().f(com.taobao.tao.recommend3.tracelog.b.HOME_DATA_PROCESS_TRIGGER);
    }
}
