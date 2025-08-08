package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.android.cachecleaner.monitor.info.node.a;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.io.File;

/* loaded from: classes4.dex */
public class dvl extends dvf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f27020a = 0;

    static {
        kge.a(791772899);
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.c.b
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e294b0c1", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.c.b
    public void a(a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7001de23", new Object[]{this, aVar, new Long(j)});
        }
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.b.InterfaceC0360b
    public void a(File file, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f4b39aa", new Object[]{this, file, aVar});
        }
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.c.b
    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f81c7e0", new Object[]{this, aVar});
        }
    }

    @Override // tb.dvf
    public void a(CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f070e3b2", new Object[]{this, cacheOverviewInfo});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("storage_monitor");
        uTCustomHitBuilder.setEventPage("cache_monitor_mnn_file");
        uTCustomHitBuilder.setProperty("total_used_size", cacheOverviewInfo.getTotalUsedSize() + "");
        uTCustomHitBuilder.setProperty("dir_DAI_size", this.f27020a + "");
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.b.a
    public void a(File file, a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1c725a", new Object[]{this, file, aVar, new Long(j)});
        } else if (!StringUtils.equals("DAI", file.getName())) {
        } else {
            this.f27020a = j / 1024;
        }
    }
}
