package com.taobao.tao.navigation;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.speed.TBSpeed;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.Map;
import tb.omr;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f20803a = false;
    private static SharedPreferences b;

    public static /* synthetic */ SharedPreferences i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("8718bd44", new Object[0]) : b;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f20803a) {
        } else {
            Context b2 = a.b();
            if (b2 == null) {
                TLog.loge(a.a(), "NavigationSwitch", "initOrangeSwitch error. context is null");
                return;
            }
            b = b2.getSharedPreferences("uikit_sp_group", 0);
            OrangeConfig.getInstance().registerListener(new String[]{"uikit_sp_group"}, new com.taobao.orange.d() { // from class: com.taobao.tao.navigation.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    } else if (!"uikit_sp_group".equals(str)) {
                    } else {
                        if (f.i() == null) {
                            omr.a("switch_error", "sp is null");
                            TLog.loge(a.a(), "NavigationSwitch", "update switch error. sp is null");
                            return;
                        }
                        SharedPreferences.Editor edit = f.i().edit();
                        boolean parseBoolean = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_cache_tab", "true"));
                        boolean parseBoolean2 = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_hide_tab", "true"));
                        boolean parseBoolean3 = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_pre_load_indicator_view", "true"));
                        boolean parseBoolean4 = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_navigation_guardian", "true"));
                        boolean parseBoolean5 = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_new_update_message_count", "true"));
                        boolean parseBoolean6 = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_offline_init_bundle_at_tab_change", "false"));
                        String config = OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_common_mark_text_guardian_rule", "^(更新|回复).*$|^\\s*$");
                        edit.putBoolean("key_cache_tab", parseBoolean).putBoolean("key_hide_tab", parseBoolean2).putBoolean("key_pre_load_indicator_view", parseBoolean3).putBoolean("key_navigation_guardian", parseBoolean4).putBoolean("key_new_update_message_count", parseBoolean5).putBoolean("key_offline_init_bundle_at_tab_change", parseBoolean6).putString("key_common_mark_text_guardian_rule", config).commit();
                        String a2 = a.a();
                        TLog.loge(a2, "NavigationSwitch", "KEY_CACHE_TAB is:" + parseBoolean + "; KEY_HIDE_TAB is :" + parseBoolean2 + "; KEY_PRE_LOAD_INDICATOR_VIEW is :" + parseBoolean3 + "; KEY_NAVIGATION_GUARDIAN is :" + parseBoolean4 + "; KEY_NEW_UPDATE_MESSAGE_COUNT is :" + parseBoolean5 + "; KEY_COMMON_MARK_TEXT_GUARDIAN_RULE is :" + config + "; KEY_OFFLINE_INIT_BUNDLE_AT_TAB_CHANGE is :" + parseBoolean6);
                    }
                }
            }, false);
            f20803a = true;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = b;
        return sharedPreferences != null && !sharedPreferences.getBoolean("key_cache_tab", true);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("key_hide_tab", true);
        }
        return true;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : TBSpeed.isSpeedEdition(context, "key_pre_load_indicator_view");
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("key_navigation_guardian", true);
        }
        return true;
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
        }
        SharedPreferences sharedPreferences = b;
        return sharedPreferences == null ? "^(更新|回复).*$|^\\s*$" : sharedPreferences.getString("key_common_mark_text_guardian_rule", "^(更新|回复).*$|^\\s*$");
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("key_new_update_message_count", true);
        }
        return true;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("key_offline_init_bundle_at_tab_change", false);
        }
        return false;
    }
}
