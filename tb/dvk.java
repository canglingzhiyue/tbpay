package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.android.cachecleaner.monitor.info.node.a;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class dvk extends dvf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Long> f27019a = new HashMap();
    private final Map<String, Long> b = new HashMap();

    static {
        kge.a(1030201085);
    }

    public static /* synthetic */ Object ipc$super(dvk dvkVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
        } else if (this.f27019a.isEmpty() && this.b.isEmpty()) {
        } else {
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("storage_monitor");
            uTCustomHitBuilder.setEventPage("cache_monitor_huge_file_status");
            uTCustomHitBuilder.setProperty("huge_file_list", JSON.toJSONString(this.f27019a));
            uTCustomHitBuilder.setProperty("biz_sub_file_list", JSON.toJSONString(this.b));
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
        }
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.b.InterfaceC0360b
    public void a(File file, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f4b39aa", new Object[]{this, file, aVar});
            return;
        }
        if (file.length() > com.taobao.android.cachecleaner.monitor.config.a.a().b().getHugeFileSizeThreshold()) {
            a(this.f27019a, aVar, aVar.getSize());
            TLog.loge(CacheCleaner.MODULE, "HugeFileTracker", "onFileVisit: found a huge file " + aVar);
        }
        if (!d(aVar)) {
            return;
        }
        a(this.b, aVar, aVar.getSize());
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.b.a
    public void a(File file, a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1c725a", new Object[]{this, file, aVar, new Long(j)});
        } else if (aVar.getSize() <= com.taobao.android.cachecleaner.monitor.config.a.a().b().getHugeBizDirSizeThreshold() || !d(aVar)) {
        } else {
            a(this.b, aVar, aVar.getSize());
        }
    }

    private boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("895bf622", new Object[]{this, aVar})).booleanValue();
        }
        List<String> bizWhiteList = com.taobao.android.cachecleaner.monitor.config.a.a().b().getBizWhiteList();
        a parent = aVar.parent();
        if (parent != null && parent.getName() != null && bizWhiteList != null) {
            return bizWhiteList.contains(parent.path());
        }
        return false;
    }
}
