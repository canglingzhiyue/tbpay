package com.taobao.mrt.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPythonThreadState;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.kge;
import tb.mto;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18268a;
    public static boolean b;

    private static void a(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b903f76", new Object[]{str, new Integer(i), str2, str3, str4, map});
            return;
        }
        try {
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            if (defaultTracker == null) {
                return;
            }
            defaultTracker.send(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, map).build());
            a.b("MRTMonitor", "pageName=" + str + " eventId=" + i + " arg1=" + str2 + " arg2=" + str3 + " arg3=" + str4 + " args=" + map);
        } catch (Throwable unused) {
        }
    }

    static {
        kge.a(365943040);
        f18268a = false;
        b = false;
    }

    private static synchronized void e() {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
                return;
            }
            if (!f18268a) {
                DimensionSet addDimension = DimensionSet.create().addDimension("sdk_version").addDimension("resource_type").addDimension("resource_name").addDimension("resource_url").addDimension("deploy_id").addDimension("extend_arg1").addDimension("error_code");
                MeasureSet create = MeasureSet.create();
                create.addMeasure(new Measure("succeeded_count"));
                create.addMeasure(new Measure("failed_count"));
                create.addMeasure(new Measure("time_cost"));
                AppMonitor.register("DAI", "download_stat", create, addDimension);
                f18268a = true;
            }
        }
    }

    public static void a(int i, int i2, int i3, long j, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d411", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Long(j), str, str2, str3, str4});
            return;
        }
        e();
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("sdk_version", "0.9.8.3-remoteso");
        create.setValue("resource_type", str);
        create.setValue("resource_name", str2);
        create.setValue("resource_url", str3);
        create.setValue("deploy_id", "");
        create.setValue("extend_arg1", str4);
        create.setValue("error_code", i + "");
        HashMap hashMap = new HashMap();
        hashMap.put("succeeded_count", Double.valueOf((double) i2));
        hashMap.put("failed_count", Double.valueOf((double) i3));
        hashMap.put("time_cost", Double.valueOf(j));
        AppMonitor.Stat.commit("DAI", "download_stat", create, MeasureValueSet.create(hashMap));
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        String str = null;
        a("DAI", 19999, "init", str, str, null);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        String str = null;
        a("DAI", 19999, "cv_init", str, str, null);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            a("DAI", 19999, "config_cv_request", null, null, null);
        }
    }

    public static void a(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1910d8", new Object[]{new Boolean(z), new Long(j)});
            return;
        }
        String str = z ? "Y" : "N";
        a("DAI", 19999, "config_cv_update", str, j + "", null);
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            a("DAI", 19999, "device_cv_coverage", null, null, null);
        }
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb1c29c2", new Object[]{str, str2, jSONObject});
            return;
        }
        String str3 = null;
        if (jSONObject != null) {
            try {
                str3 = jSONObject.toString();
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        AppMonitor.Alarm.commitFail("DAI", "python_exception_alarm", str3, str, str2);
    }

    private static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else if (b) {
        } else {
            synchronized (c.class) {
                if (!b) {
                    DimensionSet addDimension = DimensionSet.create().addDimension("sdk_version").addDimension("model_name").addDimension("biz_name").addDimension("alias_name").addDimension("env").addDimension("deploy_id").addDimension("extend_arg1").addDimension("error_code").addDimension("cid").addDimension("method_name").addDimension("dim1").addDimension("dim2").addDimension("dim3").addDimension("dim4").addDimension("dim5");
                    MeasureSet create = MeasureSet.create();
                    create.addMeasure(new Measure("succeeded_count"));
                    create.addMeasure(new Measure("failed_count"));
                    create.addMeasure(new Measure("time_cost"));
                    create.addMeasure(new Measure("memory_water_level"));
                    create.addMeasure(new Measure("memory_usage"));
                    create.addMeasure(new Measure("network_request_count"));
                    create.addMeasure(new Measure("data_service_rw_count"));
                    create.addMeasure(new Measure("cpu_usage"));
                    create.addMeasure(new Measure("cpu_water_level"));
                    Measure measure = new Measure("queue_time");
                    measure.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(120000.0d));
                    create.addMeasure(measure);
                    Measure measure2 = new Measure("prepare_time");
                    measure2.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(120000.0d));
                    create.addMeasure(measure2);
                    Measure measure3 = new Measure("execute_time");
                    measure3.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(120000.0d));
                    create.addMeasure(measure3);
                    Measure measure4 = new Measure("postprocess_time");
                    measure4.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(120000.0d));
                    create.addMeasure(measure4);
                    create.addMeasure(new Measure("system_cpu_usage"));
                    create.addMeasure(new Measure("system_memory_usage"));
                    create.addMeasure(new Measure("system_memory_capacity"));
                    create.addMeasure("mes1");
                    create.addMeasure("mes2");
                    create.addMeasure("mes3");
                    create.addMeasure("mes4");
                    create.addMeasure("mes5");
                    AppMonitor.register("DAI", "model_run_stat", create, addDimension);
                }
            }
            b = true;
        }
    }

    public static void a(AliNNPythonThreadState aliNNPythonThreadState, String str, String str2, String str3, String str4, int i, int i2, int i3, long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d38e3e97", new Object[]{aliNNPythonThreadState, str, str2, str3, str4, new Integer(i), new Integer(i2), new Integer(i3), new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        } else {
            a(aliNNPythonThreadState, str, str2, str3, str4, i, i2, i3, j, j2, j3, j4, null);
        }
    }

    public static void a(AliNNPythonThreadState aliNNPythonThreadState, String str, String str2, String str3, String str4, int i, int i2, int i3, long j, long j2, long j3, long j4, Map<String, Map<String, Object>> map) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        Map<String, Object> map2;
        double d8;
        Map<String, Object> map3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c9bc0e", new Object[]{aliNNPythonThreadState, str, str2, str3, str4, new Integer(i), new Integer(i2), new Integer(i3), new Long(j), new Long(j2), new Long(j3), new Long(j4), map});
            return;
        }
        f();
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("sdk_version", "0.9.8.3-remoteso");
        create.setValue("model_name", str);
        String str5 = "";
        create.setValue("biz_name", str5);
        create.setValue("alias_name", str5);
        create.setValue("env", str5);
        create.setValue("deploy_id", str5);
        create.setValue("extend_arg1", str5);
        create.setValue("error_code", i + str5);
        if (!StringUtils.isEmpty(str3)) {
            str5 = str3;
        }
        create.setValue("cid", str5);
        create.setValue("method_name", str4);
        if (map != null && map.containsKey("dims") && (map3 = map.get("dims")) != null) {
            for (String str6 : map3.keySet()) {
                create.setValue(str6, String.valueOf(map3.get(str6)));
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("succeeded_count", Double.valueOf(i2));
        hashMap.put("failed_count", Double.valueOf(i3));
        if (aliNNPythonThreadState != null) {
            double d9 = aliNNPythonThreadState.cpuTimeCost;
            d3 = aliNNPythonThreadState.memoryWaterLevel;
            double d10 = aliNNPythonThreadState.memorySize;
            double d11 = aliNNPythonThreadState.networkRequestCount;
            d4 = aliNNPythonThreadState.networkRequestSize;
            if (aliNNPythonThreadState.cpuTimeCost != mto.a.GEO_NOT_SUPPORT) {
                d5 = d9;
                d8 = aliNNPythonThreadState.cpuClockCost / aliNNPythonThreadState.cpuTimeCost;
            } else {
                d5 = d9;
                d8 = mto.a.GEO_NOT_SUPPORT;
            }
            d6 = d8;
            d7 = aliNNPythonThreadState.cpuWaterLevel;
            d = d10;
            d2 = d11;
        } else {
            d = mto.a.GEO_NOT_SUPPORT;
            d2 = mto.a.GEO_NOT_SUPPORT;
            d3 = mto.a.GEO_NOT_SUPPORT;
            d4 = mto.a.GEO_NOT_SUPPORT;
            d5 = mto.a.GEO_NOT_SUPPORT;
            d6 = mto.a.GEO_NOT_SUPPORT;
            d7 = mto.a.GEO_NOT_SUPPORT;
        }
        hashMap.put("time_cost", Double.valueOf(d5));
        hashMap.put("memory_water_level", Double.valueOf(d3));
        hashMap.put("memory_usage", Double.valueOf(d));
        hashMap.put("network_request_count", Double.valueOf(d2));
        hashMap.put("data_service_rw_count", Double.valueOf(d4));
        hashMap.put("cpu_usage", Double.valueOf(d6));
        hashMap.put("cpu_water_level", Double.valueOf(d7));
        hashMap.put("queue_time", Double.valueOf(j));
        hashMap.put("prepare_time", Double.valueOf(j2));
        hashMap.put("execute_time", Double.valueOf(j3));
        hashMap.put("postprocess_time", Double.valueOf(j4));
        hashMap.put("system_cpu_usage", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT));
        hashMap.put("system_memory_usage", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT));
        hashMap.put("system_memory_capacity", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT));
        if (map != null && map.containsKey("meas") && (map2 = map.get("meas")) != null) {
            for (String str7 : map2.keySet()) {
                if (map2.get(str7) instanceof Double) {
                    hashMap.put(str7, (Double) map2.get(str7));
                }
            }
        }
        MeasureValueSet create2 = MeasureValueSet.create(hashMap);
        a.b("MRTMonitor", "[commitModuleRunStatNew] dvs:" + create.getMap() + ",mvs:" + hashMap);
        AppMonitor.Stat.commit("DAI", "model_run_stat", create, create2);
    }
}
