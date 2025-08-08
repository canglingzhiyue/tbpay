package com.taobao.tlog.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.f;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.g;
import java.util.Map;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REMOTE_DEBUGER_ANDROID = "remote_debug";
    public static final String REMOTE_TLOG_CONFIG = "tlog_switch";

    public static /* synthetic */ void a(Map map, SharedPreferences.Editor editor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e57c82", new Object[]{map, editor, str});
        } else {
            b(map, editor, str);
        }
    }

    public static /* synthetic */ void c(Map map, SharedPreferences.Editor editor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cc4840", new Object[]{map, editor, str});
        } else {
            d(map, editor, str);
        }
    }

    public static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{REMOTE_DEBUGER_ANDROID, REMOTE_TLOG_CONFIG}, new f() { // from class: com.taobao.tlog.adapter.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.f
                public void onConfigUpdate(String str) {
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0b193b", new Object[]{this, str});
                        return;
                    }
                    String str3 = "TLogConfigSwitchReceiver onConfigUpdate " + str;
                    Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
                    if (configs == null) {
                        return;
                    }
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                    if (!b.REMOTE_DEBUGER_ANDROID.equals(str)) {
                        if (!b.REMOTE_TLOG_CONFIG.equals(str)) {
                            return;
                        }
                        String str4 = configs.get("tlog_file_size");
                        if (!StringUtils.isEmpty(str4)) {
                            try {
                                edit.putLong("tlog_file_size", Long.parseLong(str4));
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                        String str5 = configs.get("tlog_file_version");
                        if (!StringUtils.isEmpty(str5)) {
                            try {
                                edit.putInt("tlog_file_version", Integer.parseInt(str5));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        String str6 = configs.get("tlog_statistics_sample");
                        if (!StringUtils.isEmpty(str6)) {
                            try {
                                edit.putInt("tlog_statistics_sample", Integer.parseInt(str6));
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                        }
                        String str7 = configs.get("tlog_file_statistics_sample");
                        if (!StringUtils.isEmpty(str7)) {
                            try {
                                edit.putInt("tlog_file_statistics_sample", Integer.parseInt(str7));
                            } catch (Throwable th3) {
                                th3.printStackTrace();
                            }
                        }
                        String str8 = configs.get("tlog_buffer_size");
                        if (!StringUtils.isEmpty(str8)) {
                            try {
                                edit.putLong("tlog_buffer_size", Long.parseLong(str8));
                            } catch (Throwable th4) {
                                th4.printStackTrace();
                            }
                        }
                        String str9 = configs.get("tlog_scan_upload");
                        if (!StringUtils.isEmpty(str9)) {
                            edit.putBoolean("tlog_scan_upload", "true".equals(str9));
                        }
                        String str10 = configs.get("tlog_multi_process_notify");
                        if (!StringUtils.isEmpty(str10)) {
                            edit.putBoolean("tlog_multi_process_notify", "true".equals(str10));
                        }
                        String str11 = configs.get(e.TLOG_UDF_SWITCH);
                        if (!StringUtils.isEmpty(str11)) {
                            edit.putBoolean(e.TLOG_UDF_SWITCH, "true".equals(str11));
                        }
                        String str12 = configs.get("tlog_use_zstd");
                        if (!StringUtils.isEmpty(str12)) {
                            edit.putBoolean("tlog_use_zstd", "true".equals(str12));
                        }
                        String str13 = configs.get("tlog_intercept");
                        if (!StringUtils.isEmpty(str13)) {
                            edit.putBoolean("tlog_intercept", "true".equals(str13));
                        } else {
                            edit.remove("tlog_intercept");
                        }
                        String str14 = configs.get("tlog_real_time");
                        if (!StringUtils.isEmpty(str14)) {
                            str2 = "TLogConfigReceiver";
                            edit.putBoolean("tlog_real_time", "true".equals(str14));
                        } else {
                            str2 = "TLogConfigReceiver";
                            edit.remove("tlog_real_time");
                        }
                        String str15 = configs.get("tlog_slice_config");
                        if (!StringUtils.isEmpty(str15)) {
                            edit.putString("tlog_slice_config", str15);
                        } else {
                            edit.remove("tlog_slice_config");
                        }
                        String str16 = configs.get("tlog_main_opt");
                        if (!StringUtils.isEmpty(str16)) {
                            edit.putBoolean("tlog_main_opt", "true".equals(str16));
                        } else {
                            edit.remove("tlog_main_opt");
                        }
                        b.a(configs, edit, "tlog_threadpool_anr_opt");
                        b.c(configs, edit, "tlog_mini_blocks");
                        edit.apply();
                        Log.e(str2, String.format("[orange]tlog_switch: fileVersion=%s, tlogMaxSize=%s, utSampleRate=%s, fileStatisticsRate=%s, bufferSize=%s, scanUpload=%s, multiProcessNotify=%s, udfSwitch=%s, useZstd=%s, realtimeEnable=%s, interceptEnable=%s, sliceConfig=%s, mainOpt=%s", str5, str4, str6, str7, str8, str9, str10, str11, str12, str14, str13, str15, str16));
                        return;
                    }
                    String str17 = configs.get("tlog_destroy");
                    String str18 = configs.get(b.REMOTE_TLOG_CONFIG);
                    String str19 = configs.get(EnvironmentSwitcher.TLOG_LEVEL);
                    String str20 = configs.get("tlog_module");
                    String str21 = configs.get("tlog_start_up_sampling");
                    if (com.taobao.tao.log.e.a() == null) {
                        return;
                    }
                    Log.e("TLogConfigReceiver", "tlogDestroy is: " + str17 + "tlogSwitch is : " + str18 + "  tlogLevel is : " + str19 + "  tlogModule is : " + str20);
                    if (!StringUtils.isEmpty(str17) && "true".equals(str17)) {
                        Log.e("TLogConfigReceiver", "destroy tlog");
                        com.taobao.tao.log.e.a().c();
                        g.a(com.taobao.tao.log.utils.a.b());
                        edit.putBoolean("tlog_destroy", true).apply();
                        return;
                    }
                    edit.putBoolean("tlog_destroy", false);
                    if (StringUtils.isEmpty(str18) || !"false".equals(str18)) {
                        edit.putBoolean(b.REMOTE_TLOG_CONFIG, true);
                    } else {
                        Log.e("TLogConfigReceiver", "switch tlog function");
                        com.taobao.tao.log.e.a().c();
                        edit.putBoolean(b.REMOTE_TLOG_CONFIG, false);
                    }
                    if (!StringUtils.isEmpty(str19)) {
                        Log.e("TLogConfigReceiver", "change tlog level : " + str19);
                        LogLevel b = g.b(str19);
                        edit.putString(EnvironmentSwitcher.TLOG_LEVEL, str19);
                        com.taobao.tao.log.e.a().a(b);
                    }
                    if (!StringUtils.isEmpty(str20)) {
                        Log.e("TLogConfigReceiver", "tlog model : " + str20);
                        if ("off".equals(str20)) {
                            com.taobao.tao.log.e.a().b();
                            edit.remove("tlog_module");
                        } else {
                            Map<String, LogLevel> a2 = g.a(str20);
                            if (a2 != null && a2.size() > 0) {
                                com.taobao.tao.log.e.a().a(a2);
                                edit.putString("tlog_module", str20);
                            }
                        }
                    }
                    if (!StringUtils.isEmpty(str21)) {
                        Log.e("TLogConfigReceiver", "change tlog start up sampling : " + str21);
                        try {
                            com.taobao.tao.log.f.a().a(Integer.valueOf(Integer.parseInt(str21)));
                        } catch (NumberFormatException e2) {
                            e2.printStackTrace();
                        } catch (Throwable th5) {
                            th5.printStackTrace();
                        }
                    }
                    edit.apply();
                }
            });
        }
    }

    private static void d(Map<String, String> map, SharedPreferences.Editor editor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bfae1f", new Object[]{map, editor, str});
            return;
        }
        String str2 = map.get(str);
        if (!StringUtils.isEmpty(str2)) {
            try {
                editor.putInt(str, Integer.parseInt(str2));
                return;
            } catch (Throwable unused) {
                TLog.loge("TLOG", "TLogConfigReceiver", "Failed to parse int config, key=" + str);
                return;
            }
        }
        editor.remove(str);
    }

    private static void b(Map<String, String> map, SharedPreferences.Editor editor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d8e261", new Object[]{map, editor, str});
            return;
        }
        String str2 = map.get(str);
        if (!StringUtils.isEmpty(str2)) {
            editor.putBoolean(str, Boolean.parseBoolean(str2));
        } else {
            editor.remove(str);
        }
    }
}
