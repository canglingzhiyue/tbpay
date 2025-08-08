package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.android.cachecleaner.monitor.info.node.a;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.io.File;

/* loaded from: classes4.dex */
public class dvh extends dvf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final gtt f27016a = new gtt();

    static {
        kge.a(-1781362013);
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
        uTCustomHitBuilder.setEventPage("cache_monitor_ext_cache");
        uTCustomHitBuilder.setProperty("is_new_install", String.valueOf(cacheOverviewInfo.getIsNewInstall()));
        uTCustomHitBuilder.setProperty("ex_biz_dir_info_list", this.f27016a.b());
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
        dvp.a(this.f27016a.c().toString());
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.b.a
    public void a(File file, a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1c725a", new Object[]{this, file, aVar, new Long(j)});
            return;
        }
        a parent = aVar.parent();
        if (parent == null) {
            return;
        }
        if (!StringUtils.equals(parent.getName(), "/ExternalCache/cache") && !StringUtils.equals(parent.getName(), "/ExternalFiles/files")) {
            return;
        }
        this.f27016a.a(aVar);
    }
}
