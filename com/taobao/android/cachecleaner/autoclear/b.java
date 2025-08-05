package com.taobao.android.cachecleaner.autoclear;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.android.protodb.LSDB;
import com.taobao.message.disk.IStorageClearService;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.tao.log.TLog;
import com.taobao.zcache.n;
import tb.dvp;
import tb.kge;

/* loaded from: classes4.dex */
public class b implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1797442021);
        kge.a(-1771205083);
    }

    @Override // com.taobao.android.cachecleaner.autoclear.a
    public void a(int i, CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1392f2e5", new Object[]{this, new Integer(i), cacheOverviewInfo});
        } else {
            a();
        }
    }

    @Override // com.taobao.android.cachecleaner.autoclear.a
    public void c(final int i, final CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8553b423", new Object[]{this, new Integer(i), cacheOverviewInfo});
            return;
        }
        long clearWaitTime = com.taobao.android.cachecleaner.monitor.config.a.a().b().getClearWaitTime();
        final HandlerThread handlerThread = new HandlerThread("AutoClearImplThread");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        CacheCleaner.a().a(com.taobao.android.cachecleaner.monitor.config.a.a().d());
        handler.postDelayed(new Runnable() { // from class: com.taobao.android.cachecleaner.autoclear.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        dvp.a(cacheOverviewInfo, i, CacheCleaner.a().b() / 1024, -1L, System.currentTimeMillis() - currentTimeMillis, "clean_type_back_OLD");
                        if (Build.VERSION.SDK_INT >= 18) {
                            handlerThread.quitSafely();
                        } else {
                            handlerThread.quit();
                        }
                    } catch (Exception e) {
                        TLog.loge(CacheCleaner.MODULE, "AutoClearImpl", "run: clear cache with exception " + e);
                        if (Build.VERSION.SDK_INT >= 18) {
                            handlerThread.quitSafely();
                        } else {
                            handlerThread.quit();
                        }
                    }
                } catch (Throwable th) {
                    if (Build.VERSION.SDK_INT >= 18) {
                        handlerThread.quitSafely();
                    } else {
                        handlerThread.quit();
                    }
                    throw th;
                }
            }
        }, clearWaitTime);
    }

    @Override // com.taobao.android.cachecleaner.autoclear.a
    public void b(int i, CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c735384", new Object[]{this, new Integer(i), cacheOverviewInfo});
        } else {
            a();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (com.taobao.android.cachecleaner.monitor.config.a.a().b().getEnableZcacheClear() && !com.taobao.android.cachecleaner.monitor.config.a.a().a(com.taobao.android.cachecleaner.monitor.config.a.BIZ_Z_CACHE)) {
            n.h();
            com.taobao.android.cachecleaner.monitor.config.a.a().b(com.taobao.android.cachecleaner.monitor.config.a.BIZ_Z_CACHE);
        }
        if (com.taobao.android.cachecleaner.monitor.config.a.a().b().getEnableVFSClear() && !com.taobao.android.cachecleaner.monitor.config.a.a().a(com.taobao.android.cachecleaner.monitor.config.a.BIZ_AVFS_CACHE)) {
            LSDB.compactAll();
            com.taobao.android.cachecleaner.monitor.config.a.a().b(com.taobao.android.cachecleaner.monitor.config.a.BIZ_AVFS_CACHE);
        }
        if (!com.taobao.android.cachecleaner.monitor.config.a.a().b().getEnableMsgClear() || com.taobao.android.cachecleaner.monitor.config.a.a().a(com.taobao.android.cachecleaner.monitor.config.a.BIZ_MSG)) {
            return;
        }
        try {
            IStorageClearService iStorageClearService = (IStorageClearService) GlobalContainer.getInstance().get(IStorageClearService.class);
            if (iStorageClearService != null) {
                IStorageClearService.Options options = new IStorageClearService.Options();
                options.daysAgo = 7;
                options.mode = 1;
                IStorageClearService.DeleteResult delete = iStorageClearService.delete(IStorageClearService.Keys.OUTER, options);
                dvp.a("msg_clear", delete.isSuccess, delete.size);
            }
            com.taobao.android.cachecleaner.monitor.config.a.a().b(com.taobao.android.cachecleaner.monitor.config.a.BIZ_MSG);
        } catch (Throwable th) {
            TLog.loge(CacheCleaner.MODULE, "AutoClearImpl", "backgroundClear: clear msg cache with " + th);
        }
    }
}
