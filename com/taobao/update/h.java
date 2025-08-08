package com.taobao.update;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.split.v;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.update.framework.UpdateRuntime;
import com.taobao.update.instantpatch.InstantPatchUpdater;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.bhm;
import tb.kge;
import tb.rfx;
import tb.rgq;

/* loaded from: classes9.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f23421a;

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f23421a;
    }

    static {
        kge.a(-759220673);
        f23421a = "UpdateSwitcherConfig";
    }

    public void initSwitchConfig(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8cbdee5", new Object[]{this, bVar});
            return;
        }
        OrangeConfig.getInstance().registerListener(new String[]{rfx.UPDATE_CONFIG_GROUP}, new com.taobao.orange.f() { // from class: com.taobao.update.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.f
            public void onConfigUpdate(String str) {
                SharedPreferences.Editor putBoolean;
                String[] split;
                List parseArray;
                List parseArray2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0b193b", new Object[]{this, str});
                    return;
                }
                String config = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.DISABLED_PATCH_CLASSES, "");
                if (!StringUtils.isEmpty(config)) {
                    InstantPatchUpdater.instance().setDisabledPatchClazzes(config);
                }
                String config2 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.UPDATE_ENABLED_INTERCEPROT, "");
                if (StringUtils.equals(config2, "false") || StringUtils.equals(config2, "true")) {
                    PreferenceManager.getDefaultSharedPreferences(bVar.application).edit().putString(rfx.UPDATE_ENABLED_INTERCEPROT, config2).apply();
                }
                String config3 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.UPDATE_DIALOG_UI_V2, "true");
                if (!StringUtils.isEmpty(config3)) {
                    PreferenceManager.getDefaultSharedPreferences(bVar.application).edit().putString(rfx.UPDATE_DIALOG_UI_V2, config3).apply();
                }
                String config4 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.FLEXA_ENABLED, "true");
                if (StringUtils.equals(config4, "false") || StringUtils.equals(config4, "true")) {
                    bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("flexa_enabled_" + rgq.getVersionName(), Boolean.parseBoolean(config4)).apply();
                }
                String config5 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.DISABLE_FEATURES_KEY, "");
                if (!StringUtils.isEmpty(config5)) {
                    bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putString("disableFeatures_" + rgq.getVersionName(), config5).apply();
                }
                String config6 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.DOWNLOAD_FEATURES_ENABLED, "true");
                if (StringUtils.equals(config6, "false") || StringUtils.equals(config6, "true")) {
                    bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("download_feature_enabled_" + rgq.getVersionName(), Boolean.parseBoolean(config6)).apply();
                }
                String config7 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.INVALID_HISTORY_FEATURES_KEY, "");
                if (!StringUtils.isEmpty(config7)) {
                    for (String str2 : config7.split(",")) {
                        bhm.a().b().a(rgq.getVersionName(), str2);
                    }
                }
                String config8 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.MERGE_HISTORY_FEATURES_ENABLED, "true");
                if (StringUtils.equals(config8, "false") || StringUtils.equals(config8, "true")) {
                    bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("merge_history_feature_enabled_" + rgq.getVersionName(), Boolean.parseBoolean(config8)).apply();
                }
                String config9 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, "features_should_remote_download", "");
                if (!StringUtils.isEmpty(config9)) {
                    bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putStringSet("features_should_remote_download_" + rgq.getVersionName(), new HashSet(Arrays.asList(config9.split(",")))).apply();
                }
                if (StringUtils.equals(OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.DISABLE_FEATUREUPDATE, ""), "true")) {
                    com.taobao.update.dynamicfeature.a.instance().rollBack();
                    putBoolean = bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("disable_featureupdate_" + rgq.getVersionName(), true);
                } else {
                    putBoolean = bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("disable_featureupdate_" + rgq.getVersionName(), false);
                }
                putBoolean.apply();
                try {
                    String config10 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, v.CAN_USE_PRELOAD_FEATURES, "");
                    if (!StringUtils.isEmpty(config10) && (parseArray2 = JSON.parseArray(config10, String.class)) != null && parseArray2.size() > 0) {
                        Iterator it = parseArray2.iterator();
                        while (it.hasNext()) {
                            v.b((Context) bVar.application, "can_use_preload_features_" + ((String) it.next()), false);
                        }
                    }
                } catch (Exception unused) {
                }
                try {
                    String config11 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, v.CAN_USE_HISTORY_FEATURES, "");
                    if (!StringUtils.isEmpty(config11) && (parseArray = JSON.parseArray(config11, String.class)) != null && parseArray.size() > 0) {
                        Iterator it2 = parseArray.iterator();
                        while (it2.hasNext()) {
                            v.a((Context) bVar.application, "can_use_history_features_" + ((String) it2.next()), false);
                        }
                    }
                } catch (Exception unused2) {
                }
                try {
                    String config12 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, v.DISABLED_USE_PRELOAD_FEATURES, "");
                    if (!StringUtils.isEmpty(config12)) {
                        Log.e(h.a(), "onreceive:" + config12);
                        Map map = (Map) JSON.parseObject(config12, new TypeReference<Map<String, List<String>>>() { // from class: com.taobao.update.h.1.1
                        }, new Feature[0]);
                        if (map != null && map.size() > 0) {
                            for (Map.Entry entry : map.entrySet()) {
                                v.b(bVar.application, "disabled_use_preload_features_" + ((String) entry.getKey()), new HashSet((Collection) entry.getValue()));
                            }
                        }
                    }
                } catch (Exception unused3) {
                }
                try {
                    String config13 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, v.DISABLED_USE_HISTORY_FEATURES, "");
                    if (!StringUtils.isEmpty(config13)) {
                        Log.e(h.a(), "onreceive:" + config13);
                        Map map2 = (Map) JSON.parseObject(config13, new TypeReference<Map<String, List<String>>>() { // from class: com.taobao.update.h.1.2
                        }, new Feature[0]);
                        if (map2 != null && map2.size() > 0) {
                            for (Map.Entry entry2 : map2.entrySet()) {
                                v.a(bVar.application, "disabled_use_history_features_" + ((String) entry2.getKey()), new HashSet((Collection) entry2.getValue()));
                            }
                        }
                    }
                } catch (Exception unused4) {
                }
                String config14 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.DISABLE_FEATURE_DOWNLOAD, "");
                if (!StringUtils.isEmpty(config14)) {
                    bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("disable_feature_download_" + rgq.getVersionName(), Boolean.parseBoolean(config14)).commit();
                }
                String config15 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, "auto_feature_download", "");
                if (!StringUtils.isEmpty(config15)) {
                    bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putStringSet("auto_feature_download_" + rgq.getVersionName(), new HashSet(Arrays.asList(config15.split(",")))).commit();
                }
                String config16 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.NEW_FEATUREUPDATE_OPENED, "");
                if (!StringUtils.isEmpty(config16)) {
                    bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("new_featureupdate_opened_" + rgq.getVersionName(), Boolean.parseBoolean(config16)).commit();
                }
                String config17 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.FLEXA_CLOSE_ACTIVITY_INSTALL_RESOURCES, "");
                if (!StringUtils.isEmpty(config17)) {
                    bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putStringSet(rfx.FLEXA_CLOSE_ACTIVITY_INSTALL_RESOURCES, new HashSet(Arrays.asList(config17.split(",")))).commit();
                }
                String config18 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.FLEXA_ANR_OPT_ENABLED, "");
                if (!StringUtils.isEmpty(config18)) {
                    bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("flexa_anr_opt_enabled_" + rgq.getVersionName(), Boolean.parseBoolean(config18)).commit();
                }
                String config19 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.FLEXA_PRE_COMPILE_FEATURES, "");
                if (!StringUtils.isEmpty(config19)) {
                    bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putStringSet("flexa_pre_compile_features_" + rgq.getVersionName(), new HashSet(Arrays.asList(config19.split(",")))).commit();
                }
                String config20 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.FLEXA_CLEAN_HISFEATURES_FEATURES, "");
                if (!StringUtils.isEmpty(config20)) {
                    bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("flexa_clean_hisfeatures_features_" + rgq.getVersionName(), Boolean.parseBoolean(config20)).commit();
                }
                String config21 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, "flexa_install_feature_from_channel", "");
                if (!StringUtils.isEmpty(config21)) {
                    bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("flexa_install_feature_from_channel_" + rgq.getVersionName(), Boolean.parseBoolean(config21)).commit();
                }
                String config22 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, "disabled_his_patch_versions", "");
                if (!StringUtils.isEmpty(config22)) {
                    bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putStringSet("disabled_his_patch_versions_" + rgq.getVersionName(), new HashSet(Arrays.asList(config22.split(",")))).commit();
                }
                String config23 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.FLEXA_ADD_SPLIT_TO_LOADEDAPK, "");
                if (!StringUtils.isEmpty(config23)) {
                    bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("flexa_add_split_to_loadedapk_" + rgq.getVersionName(), Boolean.parseBoolean(config23)).commit();
                }
                String config24 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.FLEXA_FEATURE_DIFF_CLOSED, "");
                if (!StringUtils.isEmpty(config24)) {
                    for (String str3 : config24.split(",")) {
                        bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("flexa_feature_diff_opened_" + rgq.getVersionName() + "_" + str3, false).commit();
                    }
                }
                String config25 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.FLEXA_OPT_SERVICE, "");
                if (!StringUtils.isEmpty(config25)) {
                    bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("flexa_opt_service_" + rgq.getVersionName(), Boolean.parseBoolean(config25)).commit();
                }
                String config26 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.FLEXA_DISABLED_VERIFY, "");
                if (!StringUtils.isEmpty(config26)) {
                    bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("flexa_disabled_verify_" + rgq.getVersionName(), Boolean.parseBoolean(config26)).commit();
                }
                String config27 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.OPEN_FLEXA_SCENE, "");
                if (!StringUtils.isEmpty(config27)) {
                    bVar.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("open_flexa_scene_" + rgq.getVersionName(), Boolean.parseBoolean(config27)).commit();
                }
                String config28 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.NEW_PATCH_UPDATE, "false");
                if (!StringUtils.isEmpty(config28)) {
                    bVar.application.getSharedPreferences(rfx.UPDATE_CONFIG_GROUP, 0).edit().putBoolean(rfx.NEW_PATCH_UPDATE + "_" + rgq.getVersionName(), Boolean.parseBoolean(config28)).commit();
                }
                String config29 = OrangeConfig.getInstance().getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.INIT_FLEXA_ALL, "false");
                if (StringUtils.isEmpty(config29)) {
                    return;
                }
                bVar.application.getSharedPreferences(rfx.UPDATE_CONFIG_GROUP, 0).edit().putBoolean(rfx.INIT_FLEXA_ALL + "_" + rgq.getVersionName(), Boolean.parseBoolean(config29)).commit();
            }
        });
        OrangeConfig.getInstance().registerListener(new String[]{"minitb_jijian"}, new com.taobao.orange.d() { // from class: com.taobao.update.h.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    return;
                }
                Log.e("MiniConfig", "onConfigUpdate: start update config!");
                Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
                JSONObject jSONObject = new JSONObject();
                if (configs.containsKey("sevendays_update")) {
                    UpdateRuntime.sSevenDaysUpdate = Boolean.parseBoolean(configs.get("sevendays_update"));
                }
                try {
                    for (Map.Entry<String, String> entry : configs.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                        Log.e("MiniConfig", "onConfigUpdate: put key " + entry.getKey() + " value " + entry.getValue());
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                String a2 = h.a();
                Log.e(a2, "onConfigUpdate: config json :" + jSONObject.toString());
                h.toFile(bVar.application, "minitb_configs", jSONObject.toString());
            }
        }, true);
    }

    public static void toFile(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6d1dfe", new Object[]{context, str, str2});
            return;
        }
        File file = new File(context.getDir("tombstone", 0).getAbsolutePath() + File.separator + "minisafemode" + File.separator + str);
        try {
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                if (!file.createNewFile()) {
                    Log.e(f23421a, "toFile: file is not exit!");
                    return;
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(str2.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Throwable th) {
            String str3 = f23421a;
            Log.e(str3, "toFile: occur throwable: " + th.toString());
            th.printStackTrace();
        }
    }
}
