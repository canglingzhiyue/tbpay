package com.taobao.android.cachecleaner.autoclear;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StatFs;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.monitor.config.RuleConfig;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.application.common.a;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import tb.dvp;
import tb.kge;

/* loaded from: classes4.dex */
public class CacheManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f9271a;
    private final a b = new b();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface TriggerState {
    }

    static {
        kge.a(-71649244);
    }

    public static /* synthetic */ a a(CacheManager cacheManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ce96575c", new Object[]{cacheManager}) : cacheManager.b;
    }

    public CacheManager(Context context) {
        this.f9271a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo r18, java.util.Map<java.lang.String, java.lang.Long> r19) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.cachecleaner.autoclear.CacheManager.a(com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo, java.util.Map):void");
    }

    private void a(CacheOverviewInfo cacheOverviewInfo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dac0591", new Object[]{this, cacheOverviewInfo, new Integer(i)});
            return;
        }
        try {
            this.b.a(i, cacheOverviewInfo);
        } catch (Throwable th) {
            TLog.loge(CacheCleaner.MODULE, "CacheManager", "autoClear: clear implement with exception " + th);
        }
        a(System.currentTimeMillis());
        a(i, cacheOverviewInfo, "clean_type_front_OLD");
    }

    private void b(final CacheOverviewInfo cacheOverviewInfo, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568c6630", new Object[]{this, cacheOverviewInfo, new Integer(i)});
            return;
        }
        com.taobao.application.common.c.a(new a.b() { // from class: com.taobao.android.cachecleaner.autoclear.CacheManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.application.common.IApmEventListener
            public void onEvent(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i2)});
                } else if (i2 != 1) {
                } else {
                    com.taobao.application.common.c.b(this);
                    try {
                        CacheManager.a(CacheManager.this).c(i, cacheOverviewInfo);
                    } catch (Throwable th) {
                        TLog.loge(CacheCleaner.MODULE, "CacheManager", "onEvent: background cache clear witch exception " + th);
                    }
                }
            }
        });
        TLog.loge(CacheCleaner.MODULE, "CacheManager", "autoClear: register switch background listener success.");
        a(System.currentTimeMillis());
    }

    private void a(int i, CacheOverviewInfo cacheOverviewInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa90d6f", new Object[]{this, new Integer(i), cacheOverviewInfo, str});
        } else if (cacheOverviewInfo == null) {
            TLog.loge(CacheCleaner.MODULE, "CacheManager", "commitMonitor: basic info is empty, exit!");
        } else {
            try {
                StatFs statFs = new StatFs(this.f9271a.getCacheDir().getParentFile().getAbsolutePath());
                long blockSize = statFs.getBlockSize() * (statFs.getAvailableBlocks() / 1024);
                long availableSize = blockSize - cacheOverviewInfo.getAvailableSize();
                dvp.a(cacheOverviewInfo, i, availableSize, blockSize, str);
                TLog.loge(CacheCleaner.MODULE, "CacheManager", "commitMonitor: clear cache complete, clear cache size " + availableSize + "KB");
            } catch (Throwable th) {
                TLog.loge(CacheCleaner.MODULE, "CacheManager", "commitMonitor: commit app monitor with exception " + th);
            }
        }
    }

    public int a(CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f070e3a5", new Object[]{this, cacheOverviewInfo})).intValue();
        }
        RuleConfig b = com.taobao.android.cachecleaner.monitor.config.a.a().b();
        if (cacheOverviewInfo == null) {
            TLog.loge(CacheCleaner.MODULE, "CacheManager", "trigger: basicInfo is empty, return false!");
            return 0;
        }
        long availableSize = cacheOverviewInfo.getAvailableSize();
        if (!cacheOverviewInfo.getIsNewInstall() && availableSize > 0 && availableSize < b.getAvailableSizeThreshold()) {
            return 1;
        }
        long totalSize = cacheOverviewInfo.getTotalSize();
        if (!cacheOverviewInfo.getIsNewInstall() && availableSize > 0 && totalSize > 0 && availableSize / totalSize < b.getAvailableSizeRateThreshold()) {
            return 3;
        }
        long totalUsedSize = cacheOverviewInfo.getTotalUsedSize();
        long appDataSize = cacheOverviewInfo.getAppDataSize();
        if (totalUsedSize > b.getOccupationSizeThreshold() || appDataSize > b.getOccupationSizeThreshold()) {
            return 2;
        }
        return new File("/data/local/tmp/", "cache_cleaner_auto_clear_background_on").exists() ? 1 : 0;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = this.f9271a.getSharedPreferences("cache_cleaner_auto_clear_sp", 0).edit();
        edit.putLong("auto_clear_update", j);
        edit.apply();
    }

    public long b(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66fef", new Object[]{this, new Long(j)})).longValue() : this.f9271a.getSharedPreferences("cache_cleaner_auto_clear_sp", 0).getLong("auto_clear_update", j);
    }

    public long a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c705294d", new Object[]{this, list})).longValue();
        }
        long j = 0;
        if (list != null && !list.isEmpty()) {
            String absolutePath = this.f9271a.getCacheDir().getParentFile().getAbsolutePath();
            for (String str : list) {
                File file = new File(absolutePath, str);
                if (file.exists() && System.currentTimeMillis() - file.lastModified() >= com.taobao.android.cachecleaner.monitor.config.a.a().b().getFileLastModifiedThreshold()) {
                    if (file.isDirectory()) {
                        j += a(file, 0);
                    } else {
                        long length = file.length();
                        if (file.delete()) {
                            j += length;
                        }
                    }
                }
            }
        }
        return j;
    }

    private long a(File file, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c85ccef8", new Object[]{this, file, new Integer(i)})).longValue();
        }
        long j = 0;
        if (i > com.taobao.android.cachecleaner.monitor.config.a.a().b().getMaxDeepLevel()) {
            TLog.loge(CacheCleaner.MODULE, "CacheManager", "deleteDir: level too deep, exit!");
            return 0L;
        } else if (!file.exists() || !file.isDirectory()) {
            TLog.loge(CacheCleaner.MODULE, "CacheManager", "deleteDir: targetDir is not exist.");
            return 0L;
        } else {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        j += a(file2, i + 1);
                    } else {
                        long length = file2.length();
                        if (file2.delete()) {
                            j += length;
                        }
                    }
                }
            }
            if (!file.delete()) {
                TLog.loge(CacheCleaner.MODULE, "CacheManager", "deleteDir: failed to delete directory " + file.getName());
            }
            return j;
        }
    }
}
