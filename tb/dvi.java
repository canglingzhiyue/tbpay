package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.android.cachecleaner.monitor.info.node.a;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class dvi extends dvf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f27017a = 0;
    private long b = 0;
    private final Map<String, Long> c = new HashMap();
    private final Map<String, Long> d = new HashMap();

    static {
        kge.a(-353950506);
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.b.InterfaceC0360b
    public void a(File file, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f4b39aa", new Object[]{this, file, aVar});
        }
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.b.a
    public void a(File file, a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1c725a", new Object[]{this, file, aVar, new Long(j)});
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
        uTCustomHitBuilder.setEventPage("cache_monitor_file_differ");
        uTCustomHitBuilder.setProperty("is_new_install", String.valueOf(cacheOverviewInfo.getIsNewInstall()));
        uTCustomHitBuilder.setProperty("increased_size", String.valueOf(this.f27017a));
        uTCustomHitBuilder.setProperty("reduced_size", String.valueOf(this.b));
        uTCustomHitBuilder.setProperty("biz_dir_differ_result", JSON.toJSONString(this.c));
        uTCustomHitBuilder.setProperty("increase_file_list", JSON.toJSONString(this.d));
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.c.b
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e294b0c1", new Object[]{this, aVar});
            return;
        }
        TLog.loge(CacheCleaner.MODULE, "FileDifferTracker", "onFileDeleted: deleted file " + aVar.toString());
        this.b = this.b + aVar.getSize();
        if (!c(aVar)) {
            return;
        }
        a(this.c, aVar, -aVar.getSize());
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.c.b
    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f81c7e0", new Object[]{this, aVar});
            return;
        }
        TLog.loge(CacheCleaner.MODULE, "FileDifferTracker", "onFileAdded: added file " + aVar.toString());
        this.f27017a = this.f27017a + aVar.getSize();
        if (c(aVar) && aVar.getName() != null && !aVar.getName().startsWith(".") && aVar.getSize() > 3) {
            a(this.c, aVar, aVar.getSize());
        }
        if (aVar.type() != 1 || aVar.getSize() <= com.taobao.android.cachecleaner.monitor.config.a.a().b().getSizeIncreaseThreshold()) {
            return;
        }
        a(this.d, aVar, aVar.getSize());
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.c.b
    public void a(a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7001de23", new Object[]{this, aVar, new Long(j)});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onSizeDiffer: the size of ");
        sb.append(aVar.isDirectory() ? "directory" : "file");
        sb.append(aVar.getName());
        sb.append(" has changed by ");
        sb.append(j);
        TLog.loge(CacheCleaner.MODULE, "FileDifferTracker", sb.toString());
        if (c(aVar) && aVar.getName() != null && !aVar.getName().startsWith(".") && aVar.getSize() > 3) {
            a(this.c, aVar, j);
        }
        if (aVar.type() == 1) {
            if (j < 0) {
                this.b -= j;
            } else {
                this.f27017a += j;
            }
        }
        if (aVar.type() != 1 || j <= com.taobao.android.cachecleaner.monitor.config.a.a().b().getSizeIncreaseThreshold()) {
            return;
        }
        a(this.d, aVar, j);
    }
}
