package com.taobao.android.diagnose.config;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.v;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.f;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIAGNOSE_CONFIG = "diagnose_config";

    static {
        kge.a(767977022);
    }

    public static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{DIAGNOSE_CONFIG}, new f() { // from class: com.taobao.android.diagnose.config.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.f
                public void onConfigUpdate(String str) {
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    String str7;
                    String str8;
                    String str9;
                    String str10;
                    String str11;
                    String str12;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0b193b", new Object[]{this, str});
                        return;
                    }
                    v.b("DiagnoseConfig", "DiagnoseConfigReceiver onConfigUpdate " + str);
                    Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
                    if (configs == null) {
                        v.b("DiagnoseConfig", "The config is null!");
                        return;
                    }
                    SharedPreferences b = a.b(context);
                    if (b == null) {
                        v.d("DiagnoseConfig", "The sharedPreferences is null");
                        return;
                    }
                    SharedPreferences.Editor edit = b.edit();
                    if (!b.DIAGNOSE_CONFIG.equals(str)) {
                        return;
                    }
                    String str13 = configs.get(a.CONFIG_IS_DIAGNOSE_ENABLE);
                    String str14 = configs.get(a.CONFIG_IS_SCENE_ENABLE);
                    String str15 = configs.get(a.CONFIG_APM_ENABLE);
                    String str16 = configs.get(a.CONFIG_COLLECT_INTERVAL);
                    String str17 = configs.get(a.CONFIG_SNAPSHOT_UPLOAD_ENABLE);
                    String str18 = configs.get(a.CONFIG_SNAPSHOT_EXPIRE_DAY);
                    String str19 = configs.get(a.CONFIG_EXCEPTION_MONITOR_ENABLE);
                    String str20 = configs.get(a.CONFIG_UT_COLLECT_CONFIG);
                    String str21 = configs.get(a.CONFIG_MONITOR_SAMPLE);
                    String str22 = configs.get(a.CONFIG_ACTION_TLOG_UPLOAD);
                    String str23 = configs.get(a.CONFIG_SCENE_AVAILABLE_LIST);
                    String str24 = configs.get(a.CONFIG_SCENE_CHECK_RULE_INTERVAL);
                    String str25 = configs.get(a.CONFIG_CHANNEL_ENABLE);
                    String str26 = configs.get(a.CONFIG_ABNORMAL_CONFIG);
                    String str27 = configs.get(a.CONFIG_RUNTIME_MONITOR_CONFIG);
                    String str28 = configs.get(a.CONFIG_NEW_FEATURE);
                    if (!StringUtils.isEmpty(str13)) {
                        edit.putBoolean(a.CONFIG_IS_DIAGNOSE_ENABLE, "true".equals(str13));
                    } else {
                        edit.remove(a.CONFIG_IS_DIAGNOSE_ENABLE);
                    }
                    if (!StringUtils.isEmpty(str14)) {
                        edit.putBoolean(a.CONFIG_IS_SCENE_ENABLE, "true".equals(str14));
                    } else {
                        edit.remove(a.CONFIG_IS_SCENE_ENABLE);
                    }
                    if (!StringUtils.isEmpty(str15)) {
                        edit.putBoolean(a.CONFIG_APM_ENABLE, "true".equals(str15));
                    } else {
                        edit.remove(a.CONFIG_APM_ENABLE);
                    }
                    if (!StringUtils.isEmpty(str16)) {
                        str2 = str15;
                        try {
                            edit.putLong(a.CONFIG_COLLECT_INTERVAL, Long.parseLong(str16));
                        } catch (Exception e) {
                            v.a("DiagnoseConfig", "onConfigUpdate", e);
                        }
                    } else {
                        str2 = str15;
                        edit.remove(a.CONFIG_COLLECT_INTERVAL);
                    }
                    if (!StringUtils.isEmpty(str17)) {
                        edit.putBoolean(a.CONFIG_SNAPSHOT_UPLOAD_ENABLE, "true".equals(str17));
                    } else {
                        edit.remove(a.CONFIG_SNAPSHOT_UPLOAD_ENABLE);
                    }
                    if (!StringUtils.isEmpty(str18)) {
                        try {
                            edit.putInt(a.CONFIG_SNAPSHOT_EXPIRE_DAY, Integer.parseInt(str18));
                        } catch (Exception e2) {
                            v.a("DiagnoseConfig", "onConfigUpdate", e2);
                        }
                    } else {
                        edit.remove(a.CONFIG_SNAPSHOT_EXPIRE_DAY);
                    }
                    if (!StringUtils.isEmpty(str19)) {
                        str3 = str19;
                        edit.putBoolean(a.CONFIG_EXCEPTION_MONITOR_ENABLE, "true".equals(str3));
                    } else {
                        str3 = str19;
                        edit.remove(a.CONFIG_EXCEPTION_MONITOR_ENABLE);
                    }
                    if (!StringUtils.isEmpty(str20)) {
                        str4 = str20;
                        edit.putString(a.CONFIG_UT_COLLECT_CONFIG, str4);
                    } else {
                        str4 = str20;
                        edit.remove(a.CONFIG_UT_COLLECT_CONFIG);
                    }
                    if (!StringUtils.isEmpty(str21)) {
                        try {
                            edit.putInt(a.CONFIG_MONITOR_SAMPLE, Integer.parseInt(str21));
                        } catch (Exception e3) {
                            v.a("DiagnoseConfig", "onConfigUpdate", e3);
                        }
                    } else {
                        edit.remove(a.CONFIG_MONITOR_SAMPLE);
                    }
                    if (!StringUtils.isEmpty(str22)) {
                        str5 = str22;
                        edit.putString(a.CONFIG_ACTION_TLOG_UPLOAD, str5);
                    } else {
                        str5 = str22;
                        edit.remove(a.CONFIG_ACTION_TLOG_UPLOAD);
                    }
                    if (!StringUtils.isEmpty(str23)) {
                        str6 = str23;
                        edit.putString(a.CONFIG_SCENE_AVAILABLE_LIST, str6);
                    } else {
                        str6 = str23;
                        edit.remove(a.CONFIG_SCENE_AVAILABLE_LIST);
                    }
                    if (!StringUtils.isEmpty(str24)) {
                        str7 = str4;
                        str8 = str5;
                        try {
                            edit.putLong(a.CONFIG_SCENE_CHECK_RULE_INTERVAL, Long.parseLong(str24));
                        } catch (Exception e4) {
                            v.a("DiagnoseConfig", "onConfigUpdate", e4);
                        }
                    } else {
                        str7 = str4;
                        str8 = str5;
                        edit.remove(a.CONFIG_SCENE_CHECK_RULE_INTERVAL);
                    }
                    if (!StringUtils.isEmpty(str25)) {
                        str9 = str25;
                        edit.putBoolean(a.CONFIG_CHANNEL_ENABLE, "true".equals(str9));
                    } else {
                        str9 = str25;
                        edit.remove(a.CONFIG_CHANNEL_ENABLE);
                    }
                    if (!StringUtils.isEmpty(str26)) {
                        str10 = str26;
                        edit.putString(a.CONFIG_ABNORMAL_CONFIG, str10);
                    } else {
                        str10 = str26;
                        edit.remove(a.CONFIG_ABNORMAL_CONFIG);
                    }
                    if (!StringUtils.isEmpty(str27)) {
                        str11 = str27;
                        edit.putString(a.CONFIG_RUNTIME_MONITOR_CONFIG, str11);
                    } else {
                        str11 = str27;
                        edit.remove(a.CONFIG_RUNTIME_MONITOR_CONFIG);
                    }
                    if (!StringUtils.isEmpty(str28)) {
                        str12 = str28;
                        edit.putBoolean(a.CONFIG_NEW_FEATURE, "true".equals(str12));
                    } else {
                        str12 = str28;
                        edit.remove(a.CONFIG_NEW_FEATURE);
                    }
                    edit.apply();
                    v.d("DiagnoseConfig", String.format("[orange]Diagnose Config: diagnoseEnable=%s, sceneEnable=%s, apmEnable=%s, collectInterval=%s, uploadEnable=%s, snapshotExpire=%s, exceptionMonitorEnable=%s,utCollectConfig=%s, tlogUploadConfig=%s, sceneAvailableList=%s, ruleCheckInterval=%s,channelEnable=%s, abnormalConfig=%s, monitorConfig=%s, newFeature1=%s", str13, str14, str2, str16, str17, str18, str3, str7, str8, str6, str24, str9, str10, str11, str12));
                }
            });
        }
    }
}
