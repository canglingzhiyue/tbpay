package com.taobao.metrickit.context;

import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.mlz;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_BATTERY_REPEAT_INTERVAL = "config_battery_repeat_interval";
    public static final String CONFIG_BG_BATTERY_COLLECT_INTERVAL = "config_bg_battery_collect_interval";
    public static final String CONFIG_BG_CPU_COLLECT_INTERVAL = "config_bg_cpu_collect_interval";
    public static final String CONFIG_CPU_ABNORMAL_STACK_COUNT = "config_cpu_abnormal_stack_count";
    public static final String CONFIG_CPU_ABNORMAL_STACK_INTERVAL = "config_cpu_abnormal_stack_interval";
    public static final String CONFIG_CPU_ABNORMAL_THREAD_COUNT = "config_cpu_abnormal_thread_count";
    public static final String CONFIG_CPU_ABNORMAL_WATCH_INTERVAL = "config_cpu_abnormal_watch_interval";
    public static final String CONFIG_DEFAULT_EVENT = "switch_default_event";
    public static final String CONFIG_FG_BATTERY_COLLECT_INTERVAL = "config_fg_battery_collect_interval";
    public static final String CONFIG_FG_CPU_ABNORMAL_INTERVAL = "config_fg_cpu_abnormal_interval";
    public static final String CONFIG_FG_CPU_COLLECT_INTERVAL = "config_fg_cpu_collect_interval";
    public static final String CONFIG_HONOR_TEMPERATURE_MIN_COLLECT_LEVEL = "config_honor_temperature_min_level_ordinal";
    public static final String CONFIG_MEMORY_REPEAT_INTERVAL = "config_memory_repeat_interval";
    public static final String CONFIG_NATIVE_MEMORY_THRESHOLD = "config_native_memory_threshold";
    public static final String CONFIG_OPERATION_SCROLL_JUDGE_RATE = "config_operation_scroll_judge_rate";
    public static final String CONFIG_SP_AREA = "sp_record_data_area_name";
    public static final String SWITCH_ALARM_MANAGER_PROXY_EVENT = "switch_alarm_manager_proxy_event";
    public static final String SWITCH_APP_EXIT_METRIC = "switch_app_exit_metric";
    public static final String SWITCH_APP_TIME_METRIC = "switch_app_time_metric";
    public static final String SWITCH_BATTERY_HARDWARE_STAT_METRIC = "switch_battery_hardware_stat_metric";
    public static final String SWITCH_BG_FG_EVENT = "switch_bg_fg_event";
    public static final String SWITCH_BLOCK_STACK_DETECT_KEYWORDS = "switch_block_stack_detect_keywords";
    public static final String SWITCH_BLOCK_STACK_METRIC = "switch_block_stack_metric";
    public static final String SWITCH_BLUETOOTH_ADAPTER_PROXY_EVENT = "switch_bluetooth_adapter_proxy_event";
    public static final String SWITCH_BLUETOOTH_LE_SCANNER_PROXY_EVENT = "switch_bluetooth_le_scanner_proxy_event";
    public static final String SWITCH_CPU_CUMULATIVE_METRIC = "switch_cpu_cumulative_metric";
    public static final String SWITCH_CPU_LOAD_ABNORMAL_METRIC = "switch_cpu_load_abnormal_metric";
    public static final String SWITCH_CPU_LOAD_METRIC = "switch_cpu_load_metric";
    public static final String SWITCH_HONOR_ANR_METRIC = "switch_honor_anr_metric";
    public static final String SWITCH_HONOR_KILLED_EVENT = "switch_honor_killed_event";
    public static final String SWITCH_HONOR_KILLED_METRIC = "switch_honor_killed_metric";
    public static final String SWITCH_HONOR_POWER_THERMAL_EVENT = "switch_honor_power_thermal_event";
    public static final String SWITCH_HONOR_POWER_THERMAL_METRIC = "switch_honor_power_thermal_metric";
    public static final String SWITCH_HONOR_PRESSURE_COUNTER_METRIC = "switch_honor_pressure_counter_metric";
    public static final String SWITCH_HONOR_PRESSURE_EVENT = "switch_honor_pressure_event";
    public static final String SWITCH_HONOR_STABILITY_EVENT = "switch_honor_stability_event";
    public static final String SWITCH_HONOR_TEMPERATURE_RISE_METRIC = "switch_honor_temperature_rise_metric";
    public static final String SWITCH_HONOR_TOMBSTONE_METRIC = "switch_honor_tombstone_metric";
    public static final String SWITCH_LAUNCHER_IDLE_EVENT = "switch_launcher_idle_event";
    public static final String SWITCH_LAUNCHER_STAGE_EVENT = "switch_launcher_stage_event";
    public static final String SWITCH_LAUNCH_INTERACTIVE_EVENT = "switch_launch_interactive_event";
    public static final String SWITCH_LIFECYCLE_EVENT = "switch_lifecycle_event";
    public static final String SWITCH_LOCATION_MANAGER_PROXY_EVENT = "switch_location_manager_proxy_event";
    public static final String SWITCH_MEMORY_METRIC = "switch_memory_metric";
    public static final String SWITCH_POWER_CONNECT_EVENT = "switch_power_connect_event";
    public static final String SWITCH_POWER_CONSUME_METRIC = "switch_power_consume_metric";
    public static final String SWITCH_POWER_MANAGER_PROXY_EVENT = "switch_power_manager_proxy_event";
    public static final String SWITCH_POWER_SAVE_MODE_EVENT = "switch_power_save_mode_event";
    public static final String SWITCH_POWER_SAVE_MODE_METRIC = "switch_power_save_mode_metric";
    public static final String SWITCH_PROCESSOR_EVENT = "switch_processor_event";
    public static final String SWITCH_REACHABILITY_OBJECT_METRIC = "switch_reachability_object_metric";
    public static final String SWITCH_SCROLL_EVENT = "switch_scroll_event";
    public static final String SWITCH_SENSOR_MANAGER_PROXY_EVENT = "switch_sensor_manager_proxy_event";
    public static final String SWITCH_SYSTEM_LOW_MEMORY_EVENT = "switch_system_low_memory_event";
    public static final String SWITCH_UPLOAD = "switch_upload";
    private static Application c;
    private static boolean d;
    private static boolean e;
    private static volatile SharedPreferences f;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18075a = new File("/data/local/tmp/.metrickit/", ".metrickit_top_level_switcher").exists();
    public static boolean b = new File("/data/local/tmp/.metrickit/", ".metrickit_top_level_open_all_switcher").exists();
    private static final Set<String> g = new HashSet();
    private static final Set<String> h = new HashSet();
    private static final Set<String> i = new HashSet();

    static {
        g.add(SWITCH_BLOCK_STACK_METRIC);
        g.add(SWITCH_POWER_MANAGER_PROXY_EVENT);
        g.add(SWITCH_SENSOR_MANAGER_PROXY_EVENT);
        g.add(SWITCH_ALARM_MANAGER_PROXY_EVENT);
        g.add(SWITCH_BATTERY_HARDWARE_STAT_METRIC);
        g.add(SWITCH_BLUETOOTH_ADAPTER_PROXY_EVENT);
        g.add(SWITCH_LOCATION_MANAGER_PROXY_EVENT);
        g.add(SWITCH_BLUETOOTH_LE_SCANNER_PROXY_EVENT);
        g.add(SWITCH_CPU_LOAD_ABNORMAL_METRIC);
        h.add(SWITCH_BLOCK_STACK_METRIC);
        h.add(SWITCH_POWER_MANAGER_PROXY_EVENT);
        h.add(SWITCH_SENSOR_MANAGER_PROXY_EVENT);
        h.add(SWITCH_ALARM_MANAGER_PROXY_EVENT);
        h.add(SWITCH_BATTERY_HARDWARE_STAT_METRIC);
        h.add(SWITCH_BLUETOOTH_ADAPTER_PROXY_EVENT);
        h.add(SWITCH_LOCATION_MANAGER_PROXY_EVENT);
        h.add(SWITCH_BLUETOOTH_LE_SCANNER_PROXY_EVENT);
        h.add(SWITCH_CPU_LOAD_ABNORMAL_METRIC);
        i.add(SWITCH_BLOCK_STACK_DETECT_KEYWORDS);
        i.add(CONFIG_DEFAULT_EVENT);
        i.add(SWITCH_LAUNCHER_IDLE_EVENT);
        i.add(SWITCH_SCROLL_EVENT);
        i.add(SWITCH_SYSTEM_LOW_MEMORY_EVENT);
        i.add(SWITCH_LAUNCH_INTERACTIVE_EVENT);
        i.add(SWITCH_PROCESSOR_EVENT);
        i.add(SWITCH_HONOR_POWER_THERMAL_EVENT);
        i.add(SWITCH_HONOR_PRESSURE_EVENT);
        i.add(SWITCH_HONOR_STABILITY_EVENT);
        i.add(SWITCH_HONOR_KILLED_EVENT);
        i.add(SWITCH_POWER_CONNECT_EVENT);
        i.add(SWITCH_POWER_SAVE_MODE_EVENT);
        i.add(SWITCH_APP_TIME_METRIC);
        i.add(SWITCH_APP_EXIT_METRIC);
        i.add(SWITCH_CPU_LOAD_METRIC);
        i.add(SWITCH_REACHABILITY_OBJECT_METRIC);
        i.add(SWITCH_POWER_CONSUME_METRIC);
        i.add(SWITCH_POWER_SAVE_MODE_METRIC);
        i.add(SWITCH_HONOR_POWER_THERMAL_METRIC);
        i.add(SWITCH_HONOR_PRESSURE_COUNTER_METRIC);
        i.add(SWITCH_HONOR_KILLED_METRIC);
        i.add(SWITCH_HONOR_ANR_METRIC);
        i.add(SWITCH_HONOR_TEMPERATURE_RISE_METRIC);
    }

    public static void a(Application application) {
        String string;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
            return;
        }
        c = application;
        if ((application.getApplicationInfo().flags & 2) != 0) {
            z = true;
        }
        e = z;
        int identifier = application.getResources().getIdentifier("publish_type", "string", application.getPackageName());
        if (identifier <= 0) {
            TLog.loge("MetricKit", "MetricKit.Switcher", "can not find valid publish_type");
            string = "";
        } else {
            string = application.getString(identifier);
        }
        d = "0".equals(string);
    }

    public static SharedPreferences a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("6ebdfd34", new Object[]{context});
        }
        if (f == null) {
            synchronized (mlz.class) {
                if (f == null) {
                    f = context.getSharedPreferences("MetricKitConfig", 0);
                }
            }
        }
        return f;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (b) {
            return true;
        }
        if (!f18075a) {
            try {
                a();
                return a((Context) c).getBoolean(str, b(str));
            } catch (Exception e2) {
                TLog.loge("MetricKit", "MetricKit.Switcher", e2);
                return false;
            }
        }
        return new File("/data/local/tmp/.metrickit/", "." + str).exists();
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : (d && g.contains(str)) || (e && h.contains(str)) || i.contains(str);
    }

    public static void a(Map<String, Boolean> map, Map<String, Long> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0efabc8", new Object[]{map, map2});
            return;
        }
        try {
            a();
            SharedPreferences.Editor edit = a((Context) c).edit();
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    edit.putBoolean(entry.getKey(), entry.getValue().booleanValue());
                }
            }
            for (Map.Entry<String, Long> entry2 : map2.entrySet()) {
                if (entry2.getValue() != null) {
                    edit.putLong(entry2.getKey(), entry2.getValue().longValue());
                }
            }
            edit.apply();
        } catch (Exception e2) {
            TLog.loge("MetricKit", "MetricKit.Switcher", e2);
            e2.printStackTrace();
        }
    }

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        if (!f18075a) {
            try {
                a();
                return a((Context) c).getLong(str, j);
            } catch (Exception e2) {
                TLog.loge("MetricKit", "MetricKit.Switcher", e2);
                return j;
            }
        }
        try {
            return Long.parseLong(b("." + str, String.valueOf(j)));
        } catch (Exception e3) {
            e3.printStackTrace();
            return j;
        }
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            a();
            return a((Context) c).getString(str, str2);
        } catch (Exception e2) {
            TLog.loge("MetricKit", "MetricKit.Switcher", e2);
            return str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r3, java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.metrickit.context.c.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            java.lang.String r3 = "4204a5c3"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L18:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/data/local/tmp/.metrickit/"
            r0.<init>(r1, r3)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L26
            return r4
        L26:
            r3 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L46 java.lang.NumberFormatException -> L48 java.io.IOException -> L4a
            java.lang.String r2 = "r"
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L46 java.lang.NumberFormatException -> L48 java.io.IOException -> L4a
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Throwable -> L3c java.lang.NumberFormatException -> L40 java.io.IOException -> L42
            r1.close()     // Catch: java.io.IOException -> L37
            goto L3b
        L37:
            r4 = move-exception
            r4.printStackTrace()
        L3b:
            return r3
        L3c:
            r3 = move-exception
            r4 = r3
            r3 = r1
            goto L59
        L40:
            r3 = move-exception
            goto L43
        L42:
            r3 = move-exception
        L43:
            r0 = r3
            r3 = r1
            goto L4b
        L46:
            r4 = move-exception
            goto L59
        L48:
            r0 = move-exception
            goto L4b
        L4a:
            r0 = move-exception
        L4b:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L58
            r3.close()     // Catch: java.io.IOException -> L54
            goto L58
        L54:
            r3 = move-exception
            r3.printStackTrace()
        L58:
            return r4
        L59:
            if (r3 == 0) goto L63
            r3.close()     // Catch: java.io.IOException -> L5f
            goto L63
        L5f:
            r3 = move-exception
            r3.printStackTrace()
        L63:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.metrickit.context.c.b(java.lang.String, java.lang.String):java.lang.String");
    }

    public static void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{str, new Long(j)});
            return;
        }
        try {
            a();
            a((Context) c).edit().putLong(str, j).commit();
        } catch (Exception e2) {
            TLog.loge("MetricKit", "MetricKit.Switcher", e2);
            e2.printStackTrace();
        }
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (c != null) {
        } else {
            a(ActivityThread.currentActivityThread().getApplication());
        }
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        try {
            a();
            SharedPreferences a2 = a((Context) c);
            SharedPreferences.Editor edit = a2.edit();
            for (String str : g) {
                if (!map.containsKey(str) && a2.contains(str)) {
                    edit.remove(str);
                    z = true;
                }
            }
            for (String str2 : h) {
                if (!map.containsKey(str2) && a2.contains(str2)) {
                    edit.remove(str2);
                    z = true;
                }
            }
            for (String str3 : i) {
                if (!map.containsKey(str3) && a2.contains(str3)) {
                    edit.remove(str3);
                    z = true;
                }
            }
            if (!z) {
                return;
            }
            edit.apply();
        } catch (Exception e2) {
            TLog.loge("MetricKit", "MetricKit.Switcher", e2);
            e2.printStackTrace();
        }
    }
}
