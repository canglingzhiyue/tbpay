package com.taobao.tinct.impl.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.Map;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"tinct"}, new d() { // from class: com.taobao.tinct.impl.config.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    try {
                        String str2 = "TinctOrangeReceiver onConfigUpdate " + str;
                        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
                        if (configs == null) {
                            return;
                        }
                        SharedPreferences a2 = a.a(context);
                        if (a2 == null) {
                            Log.e("TinctOrangeReceiver", "The sharedPreferences is null");
                            return;
                        }
                        SharedPreferences.Editor edit = a2.edit();
                        if (!"tinct".equals(str)) {
                            return;
                        }
                        String str3 = configs.get(a.CONFIG_IS_TINCT_ENABLE);
                        String str4 = configs.get(a.CONFIG_TICNT_JSON);
                        String str5 = configs.get(a.CONFIG_ORANGE_BIZ_MAP);
                        String str6 = configs.get(a.CONFIG_IS_TINCT_LAUNCH_ENABLE);
                        if (TextUtils.isEmpty(str3)) {
                            edit.remove(a.CONFIG_IS_TINCT_ENABLE);
                        } else if ("true".equals(str3)) {
                            edit.putBoolean(a.CONFIG_IS_TINCT_ENABLE, true);
                        } else {
                            edit.putBoolean(a.CONFIG_IS_TINCT_ENABLE, false);
                        }
                        if (!TextUtils.equals(a2.getString(a.CONFIG_TICNT_JSON, null), str4)) {
                            if (!TextUtils.isEmpty(str4)) {
                                edit.putString(a.CONFIG_TICNT_JSON, str4);
                            } else {
                                edit.remove(a.CONFIG_TICNT_JSON);
                            }
                            a.a(str4);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            edit.putString(a.CONFIG_ORANGE_BIZ_MAP, str5);
                        } else {
                            edit.remove(a.CONFIG_ORANGE_BIZ_MAP);
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            edit.putBoolean(a.CONFIG_IS_TINCT_LAUNCH_ENABLE, "true".equals(str6));
                        } else {
                            edit.remove(a.CONFIG_IS_TINCT_LAUNCH_ENABLE);
                        }
                        edit.apply();
                        Log.e("TinctOrangeReceiver", String.format("[orange]Tinct Config: isTinctEnable=%s, isTinctLaunchEnable=%s, orange_biz_map=%s, tinct_json_config=%s", str3, str6, str5, str4));
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.e("TinctOrangeReceiver", "faile to get the orange config!");
                    }
                }
            }, true);
        }
    }
}
