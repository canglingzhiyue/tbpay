package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.network.grs.c;
import com.loc.at;
import com.taobao.android.boutique.reflection.e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class thp implements jrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jrj f34097a;
    private final jqp b;

    static {
        kge.a(977301555);
        kge.a(1352893937);
    }

    public thp(jrj jrjVar, jqp jqpVar) {
        this.f34097a = jrjVar;
        this.b = jqpVar;
    }

    @Override // tb.jrc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f34097a.a("OptHwThread", this.b.a())) {
        } else {
            try {
                ExecutorService executorService = (ExecutorService) e.a(c.class).a(at.j).a();
                if (executorService instanceof ThreadPoolExecutor) {
                    a((ThreadPoolExecutor) executorService);
                }
                ExecutorService reportExecutor = HianalyticsHelper.getInstance().getReportExecutor();
                if (reportExecutor instanceof ThreadPoolExecutor) {
                    a((ThreadPoolExecutor) reportExecutor);
                }
                jrk.b("OptHuaweiTask", "succ");
            } catch (Throwable th) {
                jrk.a(th);
                jrk.b("OptHuaweiTask", "exception");
            }
        }
    }

    private void a(ThreadPoolExecutor threadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268a848", new Object[]{this, threadPoolExecutor});
        } else if (!threadPoolExecutor.allowsCoreThreadTimeOut() || threadPoolExecutor.getKeepAliveTime(TimeUnit.SECONDS) <= 1) {
        } else {
            threadPoolExecutor.setKeepAliveTime(1L, TimeUnit.SECONDS);
        }
    }
}
