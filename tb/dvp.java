package tb;

import android.os.Build;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.autoclear.MatchBasedAutoClear;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;

/* loaded from: classes4.dex */
public class dvp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(179609760);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        DimensionSet create = DimensionSet.create();
        MeasureSet create2 = MeasureSet.create();
        create.addDimension("device_brand");
        create.addDimension("device_model");
        create.addDimension("trigger_state");
        create2.addMeasure("clear_cache_size");
        create2.addMeasure("available_size");
        create2.addMeasure("time_consuming");
        AppMonitor.register("cache_cleaner", "auto_clear", create2, create);
        DimensionSet create3 = DimensionSet.create();
        MeasureSet create4 = MeasureSet.create();
        create3.addDimension("device_brand");
        create3.addDimension("device_model");
        create4.addMeasure("clear_expired_files_size");
        AppMonitor.register("cache_cleaner", "clear_expired_files", create4, create3);
        DimensionSet create5 = DimensionSet.create();
        MeasureSet create6 = MeasureSet.create();
        create5.addDimension("device_brand");
        create5.addDimension("device_model");
        create5.addDimension("file_name");
        AppMonitor.register("cache_cleaner", "clear_expired_files_failed", create6, create5);
        DimensionSet create7 = DimensionSet.create();
        MeasureSet create8 = MeasureSet.create();
        create7.addDimension("ret_code");
        create7.addDimension("msg");
        create7.addDimension("file_list");
        create8.addMeasure("size");
        AppMonitor.register("cache_cleaner", "clear_matching_files", create8, create7);
        DimensionSet create9 = DimensionSet.create();
        MeasureSet create10 = MeasureSet.create();
        create9.addDimension("exception");
        create9.addDimension("description");
        AppMonitor.register("cache_cleaner", "clear_exception", create10, create9);
        DimensionSet create11 = DimensionSet.create();
        MeasureSet create12 = MeasureSet.create();
        create11.addDimension("biz_name");
        create11.addDimension("biz_clear_status");
        create12.addMeasure("biz_clear_size");
        AppMonitor.register("cache_cleaner", "biz_clear_size", create12, create11);
        DimensionSet create13 = DimensionSet.create();
        MeasureSet create14 = MeasureSet.create();
        create13.addDimension("biz_inner_path");
        AppMonitor.register("cache_cleaner", "biz_all_path", create14, create13);
        DimensionSet create15 = DimensionSet.create();
        MeasureSet create16 = MeasureSet.create();
        create15.addDimension("device_brand");
        create15.addDimension("device_model");
        create16.addMeasure("scan_inner_time");
        create16.addMeasure("scan_ext_cache_time");
        create16.addMeasure("scan_ext_files_time");
        AppMonitor.register("cache_cleaner", "files_scan_time", create16, create15);
        DimensionSet create17 = DimensionSet.create();
        MeasureSet create18 = MeasureSet.create();
        create17.addDimension("clean_state");
        create17.addDimension("clean_type");
        create17.addDimension("device_model");
        create18.addMeasure("clean_time");
        AppMonitor.register("cache_cleaner", "clean_time", create18, create17);
    }

    public static void a(CacheOverviewInfo cacheOverviewInfo, int i, long j, long j2, long j3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd7c1e1d", new Object[]{cacheOverviewInfo, new Integer(i), new Long(j), new Long(j2), new Long(j3), str});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("device_brand", Build.BRAND);
        create.setValue("device_model", Build.MODEL);
        create.setValue("trigger_state", String.valueOf(i));
        MeasureValueSet create2 = MeasureValueSet.create();
        create2.setValue("clear_cache_size", j);
        create2.setValue("available_size", j2);
        create2.setValue("time_consuming", j3);
        AppMonitor.Stat.commit("cache_cleaner", "auto_clear", create, create2);
        cacheOverviewInfo.setTotalUsedSize(cacheOverviewInfo.getTotalUsedSize() - j);
        a(cacheOverviewInfo, str);
        TLog.loge(CacheCleaner.MODULE, "AppMonitorUtil", "commitAutoClearMonitor: clear cache size " + j + "KB,  current available size " + j2 + "KB, trigger mode " + i + ", consume time " + j3 + "ms");
    }

    public static void a(CacheOverviewInfo cacheOverviewInfo, int i, long j, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2219755b", new Object[]{cacheOverviewInfo, new Integer(i), new Long(j), new Long(j2), str});
            return;
        }
        a(cacheOverviewInfo, i, j, j2, -1L, str);
        TLog.loge(CacheCleaner.MODULE, "AppMonitorUtil", "commitAutoClearMonitor: clear cache size " + j + "KB,  current available size " + j2 + "KB, trigger mode " + i);
    }

    public static void a(CacheOverviewInfo cacheOverviewInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5b44fc", new Object[]{cacheOverviewInfo, str});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("storage_monitor");
        uTCustomHitBuilder.setEventPage("cache_monitor_basic_info_after_clear").setProperty("basic_info", JSON.toJSONString(cacheOverviewInfo));
        uTCustomHitBuilder.setProperty("from", str);
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    public static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("device_brand", Build.BRAND);
        create.setValue("device_model", Build.MODEL);
        MeasureValueSet create2 = MeasureValueSet.create();
        create2.setValue("clear_expired_files_size", j);
        AppMonitor.Stat.commit("cache_cleaner", "clear_expired_files", create, create2);
    }

    public static void a(MatchBasedAutoClear.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548b3524", new Object[]{bVar});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        MeasureValueSet create2 = MeasureValueSet.create();
        create.setValue("ret_code", bVar.d() + "");
        create.setValue("msg", bVar.c());
        create.setValue("file_list", JSON.toJSONString(bVar.b()));
        create2.setValue("size", (double) bVar.a());
        AppMonitor.Stat.commit("cache_cleaner", "clear_matching_files", create, create2);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        MeasureValueSet create2 = MeasureValueSet.create();
        create.setValue("exception", str);
        create.setValue("description", str2);
        AppMonitor.Stat.commit("cache_cleaner", "clear_exception", create, create2);
    }

    public static void a(String str, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a2622", new Object[]{str, new Boolean(z), new Long(j)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        MeasureValueSet create2 = MeasureValueSet.create();
        create.setValue("biz_name", str);
        create.setValue("biz_clear_status", z + "");
        create2.setValue("biz_clear_size", (double) j);
        AppMonitor.Stat.commit("cache_cleaner", "biz_clear_size", create, create2);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        MeasureValueSet create2 = MeasureValueSet.create();
        create.setValue("biz_inner_path", str);
        AppMonitor.Stat.commit("cache_cleaner", "biz_all_path", create, create2);
    }

    public static void a(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262808dc", new Object[]{new Long(j), new Long(j2), new Long(j3)});
        } else if (j <= 0 && j2 <= 0 && j3 <= 0) {
        } else {
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue("device_brand", Build.BRAND);
            create.setValue("device_model", Build.MODEL);
            MeasureValueSet create2 = MeasureValueSet.create();
            create2.setValue("scan_inner_time", j);
            create2.setValue("scan_ext_cache_time", j2);
            create2.setValue("scan_ext_files_time", j3);
            AppMonitor.Stat.commit("cache_cleaner", "files_scan_time", create, create2);
            TLog.loge(CacheCleaner.MODULE, "AppMonitorUtil", "commitScanFileTime: innerTime = " + j + " extCacheTime = " + j2 + " extFilesTime = " + j3);
        }
    }

    public static void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{str, str2, new Long(j)});
        } else if (j < 0) {
        } else {
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue("clean_state", str);
            create.setValue("clean_type", str2);
            create.setValue("device_model", Build.MODEL);
            MeasureValueSet create2 = MeasureValueSet.create();
            if (str.equals("clean_success")) {
                create2.setValue("clean_time", j);
            }
            AppMonitor.Stat.commit("cache_cleaner", "clean_time", create, create2);
            TLog.loge(CacheCleaner.MODULE, "AppMonitorUtil", "commitCleanTime: state = " + str + " type = " + str2 + " cleanTime = " + j);
        }
    }
}
