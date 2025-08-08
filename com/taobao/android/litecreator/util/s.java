package com.taobao.android.litecreator.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes5.dex */
public class s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME_SPACE = "XGuangCreatorSDK";

    static {
        kge.a(2005787498);
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(NAME_SPACE, str, "");
            return StringUtils.isEmpty(config) ? str2 : config;
        } catch (Throwable unused) {
            return str2;
        }
    }

    private static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(NAME_SPACE, str, "");
            return StringUtils.isEmpty(config) ? z : Boolean.parseBoolean(config);
        } catch (Throwable unused) {
            return z;
        }
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(NAME_SPACE, str, "");
            return StringUtils.isEmpty(config) ? i : Integer.parseInt(config);
        } catch (Throwable unused) {
            return i;
        }
    }

    private static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(NAME_SPACE, str, "");
            return StringUtils.isEmpty(config) ? f : Float.parseFloat(config);
        } catch (Throwable unused) {
            return f;
        }
    }

    private static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(NAME_SPACE, str, "");
            return StringUtils.isEmpty(config) ? j : Long.parseLong(config);
        } catch (Throwable unused) {
            return j;
        }
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : a("fast_click_interval_time", -1);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : a("enable_lc_mnn", true);
    }

    public static float a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{new Float(f)})).floatValue() : a("frame_dup_image_default_threshold", f);
    }

    public static long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[0])).longValue() : a("mnn_algo_prepare_timeout_tims_ms", 10L);
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue() : a("fullscreen_size_hq_width", 800);
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue() : a("mnn_bitmap_format", 0);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : a("enable_video_editor_new_cut", true);
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue() : a("material_task_max_channel_count", 3);
    }

    public static long h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[0])).longValue() : a("material_task_max_timeout_ms", 30000L);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : a("enable_video_editor_blur_mode", true);
    }

    public static int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[0])).intValue() : a("image_editor_sticker_top_tracker_index", 500);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : a("enable_change_layer_by_track_index", true);
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : a("use_loop_in_sub_project", true);
    }

    public static float m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158664", new Object[0])).floatValue() : a("default_text_scale", 0.8f);
    }

    public static float n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de5", new Object[0])).floatValue() : a("default_text_position_y", -0.1f);
    }

    public static int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[0])).intValue() : a("marvel_sdk_tlog_level", 3);
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : a("enable_use_biz_scene_permission", false);
    }

    public static String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[0]) : a("marvel_default_text_font_fake_path", "/fonts/fake_path");
    }

    public static String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[0]) : a("biz_permission_deny_scene_action_text", com.alibaba.ability.localization.b.a(R.string.gg_pub_open_scene_album_permission));
    }

    public static String s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("255e0466", new Object[0]) : a("biz_permission_deny_sys_action_text", com.alibaba.ability.localization.b.a(R.string.gg_pub_authorize_taobao_permission));
    }

    public static String t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("abe3bf05", new Object[0]) : a("permission_deny_default_action_text", com.alibaba.ability.localization.b.a(R.string.gg_pub_enable_permission));
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue() : a("enable_14_gallery_part_choose", true);
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : a("enable_quick_publish", false);
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : a("enable_target_sdk_33_opt", true);
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[0])).booleanValue() : a("enable_33_copy_file_opt", true);
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : a("enable_stat_save_to_album", true);
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[0])).booleanValue() : a("enable_enter_publish_need_copy", true);
    }

    public static String x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c5faa981", new Object[0]) : a("copy_sand_box_android_version", "33,34");
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue() : a("enable_cpu_checker", true);
    }

    public static int z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6ccb7f4", new Object[0])).intValue() : a("cpu_abi_not_support_value", 7);
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue() : a("enable_sandbox_copy_opt", true);
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[0])).booleanValue() : a("enable_image_exporter_recycle", true);
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[0])).booleanValue() : a("enable_permission_judge_optimize", true);
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2}) : a(str, str2, a("materialError", com.alibaba.ability.localization.b.a(R.string.gg_pub_device_support_error_0)));
    }

    private static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        try {
            String optString = new JSONObject(str3).optString(str);
            if (!StringUtils.isEmpty(optString)) {
                return String.format(optString, str2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return String.format(com.alibaba.ability.localization.b.a(R.string.gg_pub_load_failed_retry), str2);
    }

    public static String B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65c54bf7", new Object[0]) : a("contains_no_supported_key_tip", com.alibaba.ability.localization.b.a(R.string.gg_pub_suggest_update));
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[0])).booleanValue() : a("enable_thread_pool_optimize", true);
    }
}
