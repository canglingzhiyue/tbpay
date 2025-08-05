package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.android.cachecleaner.monitor.info.node.FileNode;
import com.taobao.android.cachecleaner.monitor.info.node.a;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.io.File;
import java.util.Map;

/* loaded from: classes4.dex */
public class dvj extends dvf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f27018a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private final gtt e = new gtt();
    private final gtt f = new gtt();
    private final gtt g = new gtt();
    private final gtt h = new gtt();
    private final gtt k = new gtt();
    private final gtt i = new gtt();
    private final a j = new FileNode("", new File("other"));

    static {
        kge.a(1491824726);
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
        uTCustomHitBuilder.setEventPage("cache_monitor_file_status");
        uTCustomHitBuilder.setProperty("is_new_install", String.valueOf(cacheOverviewInfo.getIsNewInstall()));
        uTCustomHitBuilder.setProperty("file_num", String.valueOf(this.f27018a));
        uTCustomHitBuilder.setProperty("biz_dir_num", String.valueOf(this.d));
        this.h.a(this.j);
        uTCustomHitBuilder.setProperty("biz_dir_list", this.h.b());
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder2 = new UTHitBuilders.UTCustomHitBuilder("storage_monitor");
        uTCustomHitBuilder2.setEventPage("cache_monitor_sp_files");
        uTCustomHitBuilder2.setProperty("sp_file_num", String.valueOf(this.b));
        uTCustomHitBuilder2.setProperty("large_sp_file_list", this.f.b());
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder2.build());
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder3 = new UTHitBuilders.UTCustomHitBuilder("storage_monitor");
        uTCustomHitBuilder3.setEventPage("cache_monitor_large_files");
        uTCustomHitBuilder3.setProperty("large_file_num", String.valueOf(this.e.a()));
        uTCustomHitBuilder3.setProperty("large_file_list", this.e.b());
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder3.build());
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder4 = new UTHitBuilders.UTCustomHitBuilder("storage_monitor");
        uTCustomHitBuilder4.setEventPage("cache_monitor_database_files");
        uTCustomHitBuilder4.setProperty("data_base_num", String.valueOf(this.c));
        uTCustomHitBuilder4.setProperty("database_file_list", this.g.b());
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder4.build());
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder5 = new UTHitBuilders.UTCustomHitBuilder("storage_monitor");
        uTCustomHitBuilder5.setEventPage("cache_monitor_no_modified_files");
        uTCustomHitBuilder5.setProperty("long_time_no_modified_file_list", this.i.b());
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder5.build());
        Map<String, String> c = this.k.c();
        c.putAll(this.h.c());
        dvp.a(c.toString());
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.b.InterfaceC0360b
    public void a(File file, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f4b39aa", new Object[]{this, file, aVar});
            return;
        }
        this.f27018a++;
        if (file.length() > com.taobao.android.cachecleaner.monitor.config.a.a().b().getLargeFileSizeThreshold()) {
            this.e.a(aVar);
        }
        a parent = aVar.parent();
        if (parent != null && TextUtils.equals(parent.getName(), "shared_prefs")) {
            this.b++;
            if (aVar.getSize() > com.taobao.android.cachecleaner.monitor.config.a.a().b().getSpFileSizeThreshold()) {
                this.f.a(aVar);
            }
        }
        if (parent != null && TextUtils.equals(parent.getName(), "databases")) {
            this.c++;
            if (aVar.getSize() > com.taobao.android.cachecleaner.monitor.config.a.a().b().getDataBaseSizeThreshold()) {
                this.g.a(aVar);
            }
        }
        if (System.currentTimeMillis() - file.lastModified() > com.taobao.android.cachecleaner.monitor.config.a.a().b().getFileLastModifiedThreshold()) {
            this.i.a(aVar);
        }
        if (!e(aVar)) {
            return;
        }
        this.k.a(aVar);
        TLog.loge(CacheCleaner.MODULE, "SingleFileTracker", "onFileVisit: file info: " + aVar);
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.b.a
    public void a(File file, a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1c725a", new Object[]{this, file, aVar, new Long(j)});
        } else if (!c(aVar)) {
        } else {
            if (aVar.getName() != null) {
                if (aVar.getSize() > com.taobao.android.cachecleaner.monitor.config.a.a().b().getMaxReportSize()) {
                    this.h.a(aVar);
                } else {
                    a aVar2 = this.j;
                    aVar2.setSize(aVar2.getSize() + aVar.getSize());
                }
            }
            TLog.loge(CacheCleaner.MODULE, "SingleFileTracker", "onDirVisit: biz dir info: " + aVar);
            this.d = this.d + 1;
        }
    }
}
