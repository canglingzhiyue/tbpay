package com.alibaba.ut.abtest.internal.util;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.analytics.AnalyticsMgr;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.utils.FileUtil;
import com.taobao.aranger.constant.Constants;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.io.File;
import tb.cex;
import tb.jyx;
import tb.kge;
import tb.mto;
import tb.noa;

/* loaded from: classes.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CRASH_ALARM = "CrashAlarm";
    public static final String CROWD_EFFECTIVE_COUNTER = "CrowdEffectiveCounter";
    public static final String CROWD_INVOKE_COUNTER = "CrowdInvokeCounter";
    public static final String CROWD_STAT = "CrowdStat";
    public static final String DATABASE_EXPERIMENT_GROUPS_V2_ALARM = "DatabaseExperimentGroupsV2Alarm";
    public static final String DOWNLOAD_ALARM = "DownloadAlarm";
    public static final String DOWNLOAD_STAT = "DownloadStatV2";
    public static final String EXPERIMENT_ACTIVATE_COUNTER = "ExperimentActivateCounter";
    public static final String EXPERIMENT_ACTIVATE_STAT = "ExperimentActivateStat";
    public static final String EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER = "activateServer";
    public static final String EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER_SYNC = "activateServerSync";
    public static final String EXPERIMENT_ACTIVATE_STAT_TYPE_URL = "url";
    public static final String EXPERIMENT_ACTIVATE_STAT_TYPE_VARIATION = "variation";
    public static final String EXPERIMENT_DATA_REACH_TYPE = "ExperimentDataReachType";
    public static final String EXPERIMENT_EFFECTIVE_COUNTER = "ExperimentEffectiveCounter";
    public static final String MULTI_PROCESS_ALARM = "MultiProcessAlarm";
    public static final String PARAM_HANDLE_ERROR = "paramHandleError";
    public static final String SERVICE_ALARM = "ServiceAlarm";
    public static final String TRACK_1022_BLOCK_COUNTER = "Track1022BlockCounter";
    public static final String TRACK_PAGE_COUNTER = "TrackPageCounter";
    public static final String TRACK_PAGE_COUNTER_TYPE_EVO_ACTIVE = "evoActive";
    public static final String TRACK_PAGE_COUNTER_TYPE_PLUGIN = "plugin";
    public static final String TRACK_PAGE_COUNTER_TYPE_UPDATE_PAGENAME = "updatePageName";
    public static final String TRACK_STAT = "TrackStat";
    public static final String TRACK_TYPE_ROUTING_RESULT = "routing_result";
    public static final String TRACK_TYPE_ROUTING_VALUE = "routing_value";

    static {
        kge.a(-776493634);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess("Yixiu", str, str2);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail("Yixiu", str, str2, str3, str4);
        }
    }

    public static void a(String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd749044", new Object[]{str, str2, str3, str4, new Boolean(z)});
        } else if (z && !s.a(cex.a().c())) {
        } else {
            AppMonitor.Alarm.commitFail("Yixiu", str, str2, str3, str4);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            AppMonitor.Counter.commit("Yixiu", str, str2, 1.0d);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            AppMonitor.Counter.commit("Yixiu", str, 1.0d);
        }
    }

    public static void a(final String str, final Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
        } else if (cex.a().e() && new File("/data/local/tmp/.yixiu_exception_throw").exists()) {
            throw new RuntimeException(th);
        } else {
            h.c("Analytics", th.getMessage(), th);
            if (!cex.a().j().z()) {
                return;
            }
            if (!AnalyticsMgr.c) {
                p.b(new Runnable() { // from class: com.alibaba.ut.abtest.internal.util.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            b.a(b.CRASH_ALARM, Log.getStackTraceString(th), str, "");
                        }
                    }
                });
            } else {
                a(CRASH_ALARM, Log.getStackTraceString(th), str, "");
            }
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        DimensionSet addDimension = DimensionSet.create().addDimension("type").addDimension("url").addDimension("sizeRange").addDimension("net").addDimension("success").addDimension("background");
        Measure measure = new Measure(jyx.c.POINT_NAME);
        measure.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(120000.0d));
        a(DOWNLOAD_STAT, MeasureSet.create().addMeasure(measure), addDimension);
    }

    public static void a(String str, String str2, long j, long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9869b58", new Object[]{str, str2, new Long(j), new Long(j2), new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a(DOWNLOAD_STAT, DimensionValueSet.create().setValue("type", str).setValue("url", str2).setValue("sizeRange", a(j)).setValue("net", s.b(cex.a().c())).setValue("success", String.valueOf(z)).setValue("background", String.valueOf(com.taobao.application.common.c.a().a("isInBackground", true))), MeasureValueSet.create().setValue(jyx.c.POINT_NAME, j2));
        }
    }

    private static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        if (0 == j) {
            return "0";
        }
        if (j < 1024) {
            return "<1k";
        }
        if (j < FileUtil.LOCAL_REPORT_FILE_MAX_SIZE) {
            return "1k<n<10k";
        }
        if (j < 102400) {
            return "10k<n<100k";
        }
        if (j < Constants.MAX_SIZE) {
            return "100k<n<200k";
        }
        if (j < 307200) {
            return "200k<n<300k";
        }
        if (j < 409600) {
            return "300k<n<400k";
        }
        if (j < 512000) {
            return "400k<n<500k";
        }
        if (j < 1048576) {
            return "500k<n<1M";
        }
        return (j / 1048576) + "M";
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        DimensionSet addDimension = DimensionSet.create().addDimension("type").addDimension("result");
        Measure measure = new Measure("time");
        measure.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(120000.0d));
        a(EXPERIMENT_ACTIVATE_STAT, MeasureSet.create().addMeasure(measure), addDimension);
    }

    public static void a(String str, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a2622", new Object[]{str, new Boolean(z), new Long(j)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a(EXPERIMENT_ACTIVATE_STAT, DimensionValueSet.create().setValue("type", str).setValue("result", String.valueOf(z)), MeasureValueSet.create().setValue("time", j));
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        DimensionSet addDimension = DimensionSet.create().addDimension(noa.KEY_SHOP_SEARCH_ELDER);
        Measure measure = new Measure("time");
        measure.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(120000.0d));
        a(CROWD_STAT, MeasureSet.create().addMeasure(measure), addDimension);
    }

    public static void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{str, new Long(j)});
        } else if (str == null) {
        } else {
            a(CROWD_STAT, DimensionValueSet.create().setValue(noa.KEY_SHOP_SEARCH_ELDER, str), MeasureValueSet.create().setValue("time", j));
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        DimensionSet addDimension = DimensionSet.create().addDimension("result");
        Measure measure = new Measure("time");
        measure.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(120000.0d));
        a(TRACK_STAT, MeasureSet.create().addMeasure(measure), addDimension);
    }

    public static void a(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1910d8", new Object[]{new Boolean(z), new Long(j)});
        } else {
            a(TRACK_STAT, DimensionValueSet.create().setValue("result", String.valueOf(z)), MeasureValueSet.create().setValue("time", j));
        }
    }

    public static void a(String str, MeasureSet measureSet, DimensionSet dimensionSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e4ffba", new Object[]{str, measureSet, dimensionSet});
        } else {
            AppMonitor.register("Yixiu", str, measureSet, dimensionSet);
        }
    }

    public static void a(String str, DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4e62fcc", new Object[]{str, dimensionValueSet, measureValueSet});
        } else {
            AppMonitor.Stat.commit("Yixiu", str, dimensionValueSet, measureValueSet);
        }
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
            return;
        }
        try {
            UTHitBuilders.a aVar = new UTHitBuilders.a();
            aVar.setProperty(UTHitBuilders.a.FIELD_EVENT_ID, "19999");
            aVar.setProperty(UTHitBuilders.a.FIELD_PAGE, "Yixiu");
            aVar.setProperty(UTHitBuilders.a.FIELD_ARG1, "Auge");
            aVar.setProperty(UTHitBuilders.a.FIELD_ARG2, str);
            aVar.setProperty(UTHitBuilders.a.FIELD_ARG3, String.valueOf(z));
            UTAnalytics.getInstance().getDefaultTracker().send(aVar.build());
        } catch (Throwable th) {
            h.e("Analytics", th.getMessage());
        }
    }
}
