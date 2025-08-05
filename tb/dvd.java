package tb;

import android.content.Context;
import android.os.Build;
import android.text.format.Time;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.monitor.config.RuleConfig;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.android.cachecleaner.monitor.info.c;
import com.taobao.android.cachecleaner.monitor.info.node.a;
import com.taobao.tao.log.TLog;
import java.io.File;
import tb.iga;

/* loaded from: classes4.dex */
public class dvd extends iga {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final c d;
    public a h;
    public a i;

    static {
        kge.a(1881562613);
    }

    public static /* synthetic */ Object ipc$super(dvd dvdVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1554832987:
                super.finalize();
                return null;
            case -1014613266:
                return super.a((CacheOverviewInfo) objArr[0]);
            case -282205224:
                super.a((iga.a) objArr[0]);
                return null;
            case 90991720:
                super.a();
                return null;
            case 899025660:
                super.a((CacheOverviewInfo) objArr[0], (CacheOverviewInfo) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public dvd(Context context) {
        super(context);
        this.d = new c();
        for (dvf dvfVar : this.f) {
            this.d.a(dvfVar);
        }
    }

    @Override // tb.iga
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        this.f.add(new dvj());
        this.f.add(new dvk());
        this.f.add(new dvi());
        this.f.add(new dvl());
        this.g.add(new dvh());
    }

    @Override // tb.iga
    public void a(iga.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef2de3d8", new Object[]{this, aVar});
            return;
        }
        RuleConfig b = com.taobao.android.cachecleaner.monitor.config.a.a().b();
        if (!b.getEnable() && !new File("/data/local/tmp/", "cache_cleaner_auto_clear_background_on").exists()) {
            TLog.loge(CacheCleaner.MODULE, f29005a, "monitor: cache monitor is disable.");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!new File("/data/local/tmp/", "cache_cleaner_auto_clear_background_on").exists() && this.m != null && !a(this.m.getUpdateTime(), currentTimeMillis)) {
            TLog.loge(CacheCleaner.MODULE, f29005a, "monitor: today's cache info has already reported.");
            return;
        }
        super.a(aVar);
        a a2 = com.taobao.android.cachecleaner.monitor.info.a.a(this.c, dvq.INNER_ROOT_NAME);
        if (b.getInnerCacheDifferEnable() && a2 != null && this.k != null) {
            this.d.a(a2, this.k);
        } else {
            String str = f29005a;
            TLog.loge(CacheCleaner.MODULE, str, "monitor: differ inner cache info failed, differ Config is " + b.getInnerCacheDifferEnable() + ", inner root node is " + a2);
        }
        com.taobao.android.cachecleaner.monitor.info.a.a(this.c, this.k, dvq.INNER_ROOT_NAME);
        com.taobao.android.cachecleaner.monitor.info.a.a(this.c, this.l, dvq.EXTERNAL_CACHE_NAME);
        com.taobao.android.cachecleaner.monitor.info.a.a(this.c, this.b, dvq.EXTERNAL_FILES_NAME);
    }

    @Override // tb.iga
    public CacheOverviewInfo a(CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheOverviewInfo) ipChange.ipc$dispatch("c3863aee", new Object[]{this, cacheOverviewInfo});
        }
        RuleConfig b = com.taobao.android.cachecleaner.monitor.config.a.a().b();
        if (b.getApkFileEnable()) {
            this.h = this.e.a(new File(this.c.getPackageResourcePath()), "");
        } else {
            TLog.loge(CacheCleaner.MODULE, f29005a, "monitor: apk file monitor is disable.");
        }
        if (b.getLibsFileEnable()) {
            try {
                this.i = this.e.a(new File(new File(this.c.getPackageResourcePath()).getParentFile(), "lib"), "");
            } catch (Throwable th) {
                String str = f29005a;
                TLog.loge(CacheCleaner.MODULE, str, "monitor: libs file is captured with " + th);
            }
        } else {
            TLog.loge(CacheCleaner.MODULE, f29005a, "monitor: libs file monitor is disable. ");
        }
        return super.a(cacheOverviewInfo);
    }

    @Override // tb.iga
    public void a(CacheOverviewInfo cacheOverviewInfo, CacheOverviewInfo cacheOverviewInfo2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35960afc", new Object[]{this, cacheOverviewInfo, cacheOverviewInfo2});
            return;
        }
        super.a(cacheOverviewInfo, cacheOverviewInfo2);
        a aVar = this.h;
        if (aVar != null) {
            cacheOverviewInfo.setApkSize(aVar.getSize() / 1024);
        }
        a aVar2 = this.i;
        if (aVar2 != null) {
            cacheOverviewInfo.setLibsSize(aVar2.getSize() / 1024);
        }
        RuleConfig b = com.taobao.android.cachecleaner.monitor.config.a.a().b();
        if (Build.VERSION.SDK_INT >= 26 && b.getEnableApkSizeMonitor()) {
            cacheOverviewInfo.setApkInstallSize(dvc.a(this.c, com.taobao.android.cachecleaner.monitor.config.a.a().c()) / 1024);
        }
        if (Build.VERSION.SDK_INT >= 26 && b.getEnableAppDataMonitor()) {
            cacheOverviewInfo.setAppDataSize(dvc.b(this.c, com.taobao.android.cachecleaner.monitor.config.a.a().c()) / 1024);
        }
        if (!b.getEnableOatMonitor()) {
            return;
        }
        cacheOverviewInfo.setOatSize(dvc.a(this.c) / 1024);
    }

    private boolean a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c11caec", new Object[]{this, new Long(j), new Long(j2)})).booleanValue();
        }
        Time time = new Time();
        Time time2 = new Time();
        time.set(j);
        time2.set(j2);
        return time2.year == time.year ? time2.yearDay > time.yearDay : time2.year > time.year;
    }

    @Override // tb.iga
    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        this.h = null;
        this.i = null;
        super.finalize();
    }
}
