package com.taobao.android.tbuprofen.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.f;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TBP_CONFIG = "tbp_config";

    static {
        kge.a(1799234929);
    }

    public static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{TBP_CONFIG}, new f() { // from class: com.taobao.android.tbuprofen.adapter.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.f
                public void onConfigUpdate(String str) {
                    String str2;
                    String str3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0b193b", new Object[]{this, str});
                        return;
                    }
                    com.taobao.android.tbuprofen.log.c.d("TBProfConfig", "DiagnoseConfigReceiver onConfigUpdate " + str, new Object[0]);
                    Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
                    if (configs == null) {
                        com.taobao.android.tbuprofen.log.c.b("TBProfConfig", "The config is null!", new Object[0]);
                        return;
                    }
                    SharedPreferences a2 = TBProfConfig.a(TBProfConfig.TBP_SP, context);
                    if (a2 == null) {
                        com.taobao.android.tbuprofen.log.c.a("TBProfConfig", "The sharedPreferences is null", new Object[0]);
                        return;
                    }
                    SharedPreferences.Editor edit = a2.edit();
                    if (!c.TBP_CONFIG.equals(str)) {
                        return;
                    }
                    String str4 = configs.get(TBProfConfig.CONFIG_IS_TBP_ENABLE);
                    String str5 = configs.get(TBProfConfig.CONFIG_BLACK_LIST);
                    String str6 = configs.get(TBProfConfig.CONFIG_MONITOR_SAMPLE);
                    String str7 = configs.get(TBProfConfig.CONFIG_PLUGIN_ARGS);
                    String str8 = configs.get(TBProfConfig.CONFIG_CAPS_LIST);
                    String str9 = configs.get(TBProfConfig.CONFIG_LOG_LEVEL);
                    String str10 = configs.get(TBProfConfig.CONFIG_BIG_MEM_MONITOR_SAMPLE);
                    String str11 = configs.get(TBProfConfig.CONFIG_MAIN_WAIT_MONITOR_SAMPLE);
                    String str12 = configs.get(TBProfConfig.CONFIG_CHECK_MUTATOR);
                    String str13 = configs.get(TBProfConfig.CONFIG_WAIT_PREVENT_GC);
                    String str14 = configs.get(TBProfConfig.CONFIG_DUMP_HEAP);
                    if (!StringUtils.isEmpty(str4)) {
                        str2 = str14;
                        edit.putBoolean(TBProfConfig.CONFIG_IS_TBP_ENABLE, "true".equals(str4));
                    } else {
                        str2 = str14;
                        edit.remove(TBProfConfig.CONFIG_IS_TBP_ENABLE);
                    }
                    if (!StringUtils.isEmpty(str5)) {
                        edit.putString(TBProfConfig.CONFIG_BLACK_LIST, str5);
                    } else {
                        edit.remove(TBProfConfig.CONFIG_BLACK_LIST);
                    }
                    if (!StringUtils.isEmpty(str6)) {
                        try {
                            edit.putInt(TBProfConfig.CONFIG_MONITOR_SAMPLE, Integer.parseInt(str6));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        edit.remove(TBProfConfig.CONFIG_MONITOR_SAMPLE);
                    }
                    if (!StringUtils.isEmpty(str7)) {
                        edit.putString(TBProfConfig.CONFIG_PLUGIN_ARGS, str7);
                    } else {
                        edit.remove(TBProfConfig.CONFIG_PLUGIN_ARGS);
                    }
                    if (!StringUtils.isEmpty(str8)) {
                        edit.putString(TBProfConfig.CONFIG_CAPS_LIST, str8);
                    } else {
                        edit.remove(TBProfConfig.CONFIG_CAPS_LIST);
                    }
                    if (!StringUtils.isEmpty(str9)) {
                        edit.putString(TBProfConfig.CONFIG_LOG_LEVEL, str9);
                    } else {
                        edit.remove(TBProfConfig.CONFIG_LOG_LEVEL);
                    }
                    if (!StringUtils.isEmpty(str10)) {
                        try {
                            edit.putInt(TBProfConfig.CONFIG_BIG_MEM_MONITOR_SAMPLE, Integer.parseInt(str10));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        edit.remove(TBProfConfig.CONFIG_BIG_MEM_MONITOR_SAMPLE);
                    }
                    if (!StringUtils.isEmpty(str11)) {
                        try {
                            edit.putInt(TBProfConfig.CONFIG_MAIN_WAIT_MONITOR_SAMPLE, Integer.parseInt(str11));
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    } else {
                        edit.remove(TBProfConfig.CONFIG_MAIN_WAIT_MONITOR_SAMPLE);
                    }
                    if (!StringUtils.isEmpty(str12)) {
                        edit.putBoolean(TBProfConfig.CONFIG_CHECK_MUTATOR, "true".equals(str12));
                    } else {
                        edit.remove(TBProfConfig.CONFIG_CHECK_MUTATOR);
                    }
                    if (!StringUtils.isEmpty(str13)) {
                        edit.putBoolean(TBProfConfig.CONFIG_WAIT_PREVENT_GC, "true".equals(str13));
                    } else {
                        edit.remove(TBProfConfig.CONFIG_WAIT_PREVENT_GC);
                    }
                    if (!StringUtils.isEmpty(str2)) {
                        str3 = str2;
                        edit.putString(TBProfConfig.CONFIG_DUMP_HEAP, str3);
                    } else {
                        str3 = str2;
                        edit.remove(TBProfConfig.CONFIG_DUMP_HEAP);
                    }
                    edit.apply();
                    String str15 = configs.get(TBProfConfig.CONFIG_ANR_PROFILER);
                    SharedPreferences a3 = TBProfConfig.a(TBProfConfig.ANR_SP, context);
                    if (a3 != null) {
                        SharedPreferences.Editor edit2 = a3.edit();
                        if (!StringUtils.isEmpty(str15)) {
                            edit2.putString(TBProfConfig.CONFIG_ANR_PROFILER, str15);
                        } else {
                            edit2.remove(TBProfConfig.CONFIG_ANR_PROFILER);
                        }
                        edit2.apply();
                    }
                    com.taobao.android.tbuprofen.log.c.a("TBProfConfig", String.format("[orange]TBP Config: TBPConfig=%s, BlackList=%s, PluginOptions=%s, MonitorSample=%s, bigMemSample=%s, mainWaitSample=%s,CapList=%s, LogLeve=%s, dumpHeapConfig=%s, anrConfig=%s", str4, str5, str7, str6, str10, str11, str8, str9, str3, str15), new Object[0]);
                }
            });
        }
    }
}
