package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.gateway.dispatch.a;
import com.taobao.homepage.datasource.OnDataSourceUpdatedListener;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;

/* loaded from: classes7.dex */
public class lao {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1341370804);
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : d();
    }

    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            c();
        }
    }

    public static void a(OnDataSourceUpdatedListener.DataSourceType dataSourceType, lbo lboVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b061ff1c", new Object[]{dataSourceType, lboVar});
        } else if (!dataSourceType.isPresentedAsContent() || lboVar == null) {
        } else {
            a.b().a(new Runnable() { // from class: tb.lao.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    e.c("Home.ExposureTracker", "delay call recycler view onScrollStateChanged");
                    if (!lao.a()) {
                        ldf.d("Home.ExposureTracker", "新架构通知曝光，不曝光");
                        return;
                    }
                    ldf.d("Home.ExposureTracker", "新架构通知曝光");
                    lao.b();
                }
            }, 200L);
        }
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        HomeInfoFlowDataService a2 = com.taobao.tao.infoflow.commonsubservice.dataservice.a.a(oqc.a().m());
        if (a2 == null) {
            return;
        }
        a2.notifyFeedsForceExposure();
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : Boolean.parseBoolean(oog.a("enablePullRefreshExposureInfoFlow"));
    }
}
