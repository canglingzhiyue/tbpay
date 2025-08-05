package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.evo.EVO;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.autoclear.biz.ConfigCenter;
import com.taobao.android.cachecleaner.monitor.config.RuleConfig;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.android.cachecleaner.monitor.info.b;
import com.taobao.application.common.c;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class iga {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_INFO_SP_NAME = "cache_cleaner_cache_info";

    /* renamed from: a  reason: collision with root package name */
    public static String f29005a;
    public com.taobao.android.cachecleaner.monitor.info.node.a b;
    public final Context c;
    public com.taobao.android.cachecleaner.monitor.info.node.a k;
    public com.taobao.android.cachecleaner.monitor.info.node.a l;
    public CacheOverviewInfo m;
    public final List<dvf> f = new ArrayList();
    public final List<dvf> g = new ArrayList();
    public final dvg j = new dvg();
    public final b e = new b();

    /* loaded from: classes4.dex */
    public interface a {
        void a(CacheOverviewInfo cacheOverviewInfo, Map<String, Long> map);
    }

    static {
        kge.a(-524017876);
        f29005a = iga.class.getSimpleName();
    }

    public iga(Context context) {
        this.c = context;
        a();
        for (dvf dvfVar : this.f) {
            this.e.a((b.a) dvfVar);
            this.e.a((b.InterfaceC0360b) dvfVar);
        }
        this.m = com.taobao.android.cachecleaner.monitor.info.a.b(this.c);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f.add(this.j);
        this.g.add(this.j);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef2de3d8", new Object[]{this, aVar});
            return;
        }
        b();
        CacheOverviewInfo a2 = a(this.m);
        String str = f29005a;
        TLog.loge(CacheCleaner.MODULE, str, "monitor: basic cache info is " + a2);
        c(a2);
        com.taobao.android.cachecleaner.monitor.info.a.a(this.c, a2);
        if (com.taobao.android.cachecleaner.monitor.config.a.a().b().getTrackEnable()) {
            b(a2);
        } else {
            TLog.loge(CacheCleaner.MODULE, f29005a, "monitor: cache monitor track is disable.");
        }
        if (aVar == null) {
            return;
        }
        aVar.a(a2, this.j.a());
    }

    public CacheOverviewInfo a(CacheOverviewInfo cacheOverviewInfo) {
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheOverviewInfo) ipChange.ipc$dispatch("c3863aee", new Object[]{this, cacheOverviewInfo});
        }
        RuleConfig b = com.taobao.android.cachecleaner.monitor.config.a.a().b();
        long j3 = 0;
        if (b.getInnerCacheEnable()) {
            long currentTimeMillis = System.currentTimeMillis();
            this.k = this.e.a(this.c.getCacheDir().getParentFile(), dvq.INNER_ROOT_DIR);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            for (dvf dvfVar : this.f) {
                this.e.b((b.InterfaceC0360b) dvfVar);
                this.e.b((b.a) dvfVar);
            }
            j = currentTimeMillis2;
        } else {
            TLog.loge(CacheCleaner.MODULE, f29005a, "monitor: inner monitor is disable.");
            j = 0;
        }
        if (b.getExternalCacheEnable()) {
            for (dvf dvfVar2 : this.g) {
                this.e.a((b.InterfaceC0360b) dvfVar2);
                this.e.a((b.a) dvfVar2);
            }
            long currentTimeMillis3 = System.currentTimeMillis();
            this.l = this.e.a(this.c.getExternalCacheDir(), dvq.EXTERNAL_CACHE_ROOT_DIR);
            j2 = System.currentTimeMillis() - currentTimeMillis3;
            for (dvf dvfVar3 : this.g) {
                this.e.b((b.a) dvfVar3);
                this.e.b((b.InterfaceC0360b) dvfVar3);
            }
        } else {
            TLog.loge(CacheCleaner.MODULE, f29005a, "monitor: external cache monitor is disable.");
            j2 = 0;
        }
        if (b.getExternalFileEnable()) {
            for (dvf dvfVar4 : this.g) {
                this.e.a((b.InterfaceC0360b) dvfVar4);
                this.e.a((b.a) dvfVar4);
            }
            long currentTimeMillis4 = System.currentTimeMillis();
            this.b = this.e.a(this.c.getExternalFilesDir(null), dvq.EXTERNAL_FILES_ROOT_DIR);
            j3 = System.currentTimeMillis() - currentTimeMillis4;
            for (dvf dvfVar5 : this.g) {
                this.e.b((b.a) dvfVar5);
                this.e.b((b.InterfaceC0360b) dvfVar5);
            }
        } else {
            TLog.loge(CacheCleaner.MODULE, f29005a, "monitor: external files monitor is disable.");
        }
        CacheOverviewInfo cacheOverviewInfo2 = new CacheOverviewInfo();
        a(cacheOverviewInfo2, cacheOverviewInfo);
        dvp.a(j, j2, j3);
        return cacheOverviewInfo2;
    }

    public void a(CacheOverviewInfo cacheOverviewInfo, CacheOverviewInfo cacheOverviewInfo2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35960afc", new Object[]{this, cacheOverviewInfo, cacheOverviewInfo2});
            return;
        }
        RuleConfig b = com.taobao.android.cachecleaner.monitor.config.a.a().b();
        cacheOverviewInfo.setEnableCacheClean(EVO.isSwitchOpened(this.c, "cache_cleaner_auto_clear_ab_key"));
        cacheOverviewInfo.setEnableQuota(ConfigCenter.isBizClearEnable(this.c));
        cacheOverviewInfo.setTotalSize(dvq.a(this.c));
        cacheOverviewInfo.setAvailableSize(dvq.b(this.c));
        if (c.a().a("isFullNewInstall", false)) {
            cacheOverviewInfo.setIsNewInstall(true);
            cacheOverviewInfo.setInstallTime(System.currentTimeMillis());
        } else if (cacheOverviewInfo2 != null && cacheOverviewInfo2.getIsNewInstall()) {
            if (System.currentTimeMillis() - cacheOverviewInfo2.getInstallTime() >= b.getNewInstallThreshold()) {
                z = false;
            }
            cacheOverviewInfo.setIsNewInstall(z);
            cacheOverviewInfo.setInstallTime(cacheOverviewInfo2.getInstallTime());
        } else {
            cacheOverviewInfo.setIsNewInstall(false);
            if (cacheOverviewInfo2 != null) {
                cacheOverviewInfo.setInstallTime(cacheOverviewInfo2.getInstallTime());
            }
        }
        cacheOverviewInfo.setUpdateTime(System.currentTimeMillis());
        com.taobao.android.cachecleaner.monitor.info.node.a aVar = this.k;
        if (aVar != null) {
            cacheOverviewInfo.setInnerCacheSize(aVar.getSize() / 1024);
        }
        com.taobao.android.cachecleaner.monitor.info.node.a aVar2 = this.l;
        if (aVar2 != null) {
            cacheOverviewInfo.setExternalCacheSize(aVar2.getSize() / 1024);
        }
        com.taobao.android.cachecleaner.monitor.info.node.a aVar3 = this.b;
        if (aVar3 != null) {
            cacheOverviewInfo.setExternalFilesSize(aVar3.getSize() / 1024);
        }
        com.taobao.android.cachecleaner.monitor.info.node.a aVar4 = this.k;
        if (aVar4 == null || this.b == null || this.l == null) {
            return;
        }
        cacheOverviewInfo.setTotalUsedSize(((aVar4.getSize() + this.l.getSize()) + this.b.getSize()) / 1024);
    }

    private void b(CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c27333", new Object[]{this, cacheOverviewInfo});
            return;
        }
        try {
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("storage_monitor");
            uTCustomHitBuilder.setEventPage("cache_monitor_basic_info").setProperty("basic_info", JSON.toJSONString(cacheOverviewInfo));
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
            for (dvf dvfVar : this.f) {
                dvfVar.a(cacheOverviewInfo);
            }
            if (!com.taobao.android.cachecleaner.monitor.config.a.a().b().getExternalCacheEnable()) {
                return;
            }
            for (dvf dvfVar2 : this.g) {
                dvfVar2.a(cacheOverviewInfo);
            }
        } catch (Throwable th) {
            String str = f29005a;
            TLog.loge(CacheCleaner.MODULE, str, "track: monitor track with exception " + th);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("storage_monitor");
        uTCustomHitBuilder.setEventPage("start_monitor");
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    private void c(CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d31402b4", new Object[]{this, cacheOverviewInfo});
            return;
        }
        SharedPreferences.Editor edit = this.c.getSharedPreferences(CACHE_INFO_SP_NAME, 0).edit();
        edit.putLong("total_used_size", cacheOverviewInfo.getTotalUsedSize());
        edit.putLong("total_size", cacheOverviewInfo.getTotalSize());
        edit.putLong("available_size", cacheOverviewInfo.getAvailableSize());
        edit.apply();
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        this.k = null;
        this.l = null;
        this.b = null;
        super.finalize();
    }
}
