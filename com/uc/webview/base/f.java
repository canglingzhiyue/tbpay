package com.uc.webview.base;

import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.taobao.android.layoutmanager.module.NavigationTabHelper;
import com.taobao.artc.api.AConstants;
import com.taobao.artc.internal.ArtcParams;
import com.taobao.message.datasdk.facade.message.MessageType;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.crd;
import tb.jzk;
import tb.mln;
import tb.tof;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f23779a = {"CachePageFreeFirstThanKeep", "CustomFont", "DisableBFCache", "DiscardableReleaseFreeAfterTimeSwitch", "DistinguishJSError", "EnableAdBlock", "EnableForceDefaultVLinkColor", "EnableInRendererGpu", "EnableSameSiteCookieDegradation", "ForceEnableUserSelect", "IsHardwareAC", "IsNightMode", "IsNoFootmark", "IsRunningInWebViewSdk", "OpenCacheLog", "adaptive_layout_enable", "allow_commit_all_perf_data", "audio_output_use_aaudio", "block_background_media_play", "capture_enable_wait_load", "crjz_enbr", "crjz_nh", "crjz_nhddi", "crwp_embed_view_stats_enable", "crxr_disable_image_view", "custom_font", "decode_fail_is_on", "disable_exit_fullscreen_when_js_prompt", "disable_js_fullscreen_when_hybrid", "enable_block_navigation", "enable_con_undef_stats", "enable_debugging", "enable_fd_sanitizer", "enable_feature_stats", "enable_fit_screen_text_wrap", "enable_gpu_process_on_low_end_device", "enable_hosting_http_cache", "enable_keyword_hyperlink", "enable_keyword_hyperlink_stat", "enable_klog", "enable_lottie", "enable_lottie_stats_url", "enable_low_latency_compat", "enable_mse_use_hybrid", "enable_run_in_seperate_thread", "enable_should_intercept_request", "enable_snapshot_background_deserialize", "enable_undefine_stats", "enable_v8_context_snapshot", "enable_webrtc_h265", "enable_webview_event_empty_screen", "enalbe_mse_adaptive", "ext_img_decoder_on", "ha_use_efs", "ignore_touch_on_floating_win", "non_hybrid_for_muted_and_no_controls", "password_fill_prompt_on_load", "pin_zoom_stats_enable", "prerender_pending_load_event", "quark_ha_use_efs", "remove_image_from_cache", "send_decode_fail_webview_event", "temp_kuying_check_with_port", "u4sdk_dsal", "u4sdk_ena_sts", "u4sdk_enable_ifcl", "u4sdk_enable_wvcit", "u4sdk_enltcc", "u4sdk_enltl", "u4sdk_enncd", "u4sdk_enrlc", "u4sdk_enrne", "u4sdk_enx86d", "u4sdk_eute", "u4sdk_iffs", "u4sdk_is_interver", "u4sdk_sts_spl", "u4sdk_udc", "u4sdk_use_ucp", "u4sdk_wvls", "verbose_backtrace", "video_disable_meta_autoplay", "video_enable_auto_landscape", "video_enable_below_fixed", "video_enable_mse", "video_hardward_accelerate", "video_ignore_play_when_visible", "wpk_stat_pv", "AppMode", "BackupRenderWarmupStrategy", "CachePageNumber", "CachePageNumberOnCritical", "CachePageNumberOnModerate", "DiscardableDataKeepSecond", "DiscardableLimitBytes", "DiscardableReleaseFreeAfterSecond", "DiscardableReleaseFreeUntilByte", "FormSave", "GpuProcMode", "GrDiscardableLimitByte", "GrDiscardableLowEndLimitByte", "GrResourceCacheLimitByte", "GrResourceCacheLowEndLimitByte", "IsolateRenderWarmupStrategy", "LayoutStyle", "LinkUnderline", "MediaCodecType", "RenderPipelineType", "RenderProcMode", "UCCookieType", "activity_status", "cpn_dlt", "custom_attributes_control_type", "extend_view_auto_float_min_duration", "h264_encoder_type", "hybrid_covered_check_type", "keyword_hyperlink_count", "keyword_hyperlink_interval", "keyword_hyperlink_length", "longpress_timeout_ms", "max_dom_tree_depth", "max_web_worker_count_for_bfcache", "mse_list_type", "should_intercept_request_timeout_limit", "show_media_extend_view_type", "show_native_ctrl_when_loading_type", "t1t3detail_sample_rate", "u4sdk_ecif", "u4sdk_hcrto", "u4sdk_hcto", "u4sdk_iwvwm", "u4sdk_nldt", "u4sdk_patch_mode", "u4sdk_pincdm", "u4sdk_sts_uli", "u4sdk_vfp", "v8_code_cache_threshold_mb", "v8_snapshot_header_version", "wpk_stat_sample_rate", "xhr_sync_timeout_limit", "CommonLibDir", "CommonLibParsName", "CommonLibUrl32", "CommonLibUrl64", "CookiesBlacklistForJs", "CoreDexPath", "CoreLibPath", "CoreOdexPath", "GlobalDefaultUserAgent", "GlobalWebviewUA", "GwpAsanConfig", "UBISiLang", "UBISiVersion", "UBISn", "UBIUtdId", "apollo_settings", "ax_support_service_list", "bpg_lib_path", "core_thread_watchdog_alarm_duration", "core_thread_watchdog_dump_js_rate", "core_thread_watchdog_dump_native_rate", "core_thread_watchdog_watch_list", "cpn_dl_crest", "crjz_block_request_rule", "crjz_nh_crret", "crjz_nh_ret", "crjz_nh_usm", "crpb_ihjs", "crpb_ihjs_url", "crsp_adffso", "crsp_mpplgs", "crwp_embed_view_surface_detect_config", "crwp_embed_view_transparent_type_list", "keyword_hyperlink_channel_distribution", "keyword_hyperlink_sensitive_words", "last_user_input_time", "media_player_limits", "network_hosting_instance_v1", "private_data_dir_suffix", "snapshot_react16_urls", "snapshot_react17_urls", "snapshot_react18_urls", "t2_stat_render_process_connected", "u4sdk_aet", "u4sdk_apd", "u4sdk_ebts", "u4sdk_ests", "u4sdk_sall", "u4sdk_sts_ils", "u4sdk_sts_its", "u4sdk_sts_uct", "video_disable_extend_view_titles", "wpk_u4statline", "adaptive_layout_blacklist", "allow_js_set_info_list", "allow_popup_list", "bwlist_ewu_urls", "bwlist_upld_statkeys", "crjs_hide_ucweb_black_list", "crjz_cors_whitelist", "crpb_ihhl", "crsp_dcj_wl", "crwp_embed_view_embed_surface_enable_list", "crwp_embed_view_hybrid_render_enable_list", "crwp_embed_view_reattach_list", "disable_alive_player_limit", "disable_autoplay_mac", "disable_autoplay_man", "disable_mse_adaptive_list", "disable_show_native_ctrl_when_loading", "enable_before_play_callback_list", "enable_get_cache_file_list", "enable_preload_video_based_rh", "enable_preload_video_source_list", "enable_video_super_toolbar", "fit_screen_text_wrap_blacklist", "hybrid_covered_check_block_list", "jsapi_async_function_list", "keyword_hyperlink_blacklist", "local_enable_mse", "local_video_disable_extend_view_float", "mse_hybrid_white_list", "non_internal_bussiness_bids", "u4_focus_auto_popup_input_list", "u4sdk_fccbl", "u4xr_mse_list", "u4xr_video_st_list", "u4xr_video_stats_list", "u4xr_video_view_under_webview", "video_custom_attributes_white_list", "video_disable_embedded_floating", "video_disable_extend_view_float", "video_disable_mse", "video_enable_precise_seek", "video_ignore_first_pos", "video_ignore_seek_to_end", "video_play_gesture_whitelist", "video_popstate_disable", "video_use_surface_view", "webkitvisibilitychange_disable_whitelist"};
    public static final String[] b;
    public static final int[][] c;
    static final int[] d;
    static final Map<Integer, int[]> e;

    /* loaded from: classes9.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final Map<String, Integer> f23780a = new HashMap<String, Integer>() { // from class: com.uc.webview.base.f.a.1
            {
                put(f.f23779a[0], 0);
                put(f.f23779a[1], 1);
                put(f.f23779a[2], 2);
                put(f.f23779a[3], 3);
                put(f.f23779a[4], 4);
                put(f.f23779a[5], 5);
                put(f.f23779a[6], 6);
                put(f.f23779a[7], 7);
                put(f.f23779a[8], 8);
                put(f.f23779a[9], 9);
                put(f.f23779a[10], 10);
                put(f.f23779a[11], 11);
                put(f.f23779a[12], 12);
                put(f.f23779a[13], 13);
                put(f.f23779a[14], 14);
                put(f.f23779a[15], 15);
                put(f.f23779a[16], 16);
                put(f.f23779a[17], 17);
                put(f.f23779a[18], 18);
                put(f.f23779a[19], 19);
                put(f.f23779a[20], 20);
                put(f.f23779a[21], 21);
                put(f.f23779a[22], 22);
                put(f.f23779a[23], 23);
                put(f.f23779a[24], 24);
                put(f.f23779a[25], 25);
                put(f.f23779a[26], 26);
                put(f.f23779a[27], 27);
                put(f.f23779a[28], 28);
                put(f.f23779a[29], 29);
                put(f.f23779a[30], 30);
                put(f.f23779a[31], 31);
                put(f.f23779a[32], 32);
                put(f.f23779a[33], 33);
                put(f.f23779a[34], 34);
                put(f.f23779a[35], 35);
                put(f.f23779a[36], 36);
                put(f.f23779a[37], 37);
                put(f.f23779a[38], 38);
                put(f.f23779a[39], 39);
                put(f.f23779a[40], 40);
                put(f.f23779a[41], 41);
                put(f.f23779a[42], 42);
                put(f.f23779a[43], 43);
                put(f.f23779a[44], 44);
                put(f.f23779a[45], 45);
                put(f.f23779a[46], 46);
                put(f.f23779a[47], 47);
                put(f.f23779a[48], 48);
                put(f.f23779a[49], 49);
                put(f.f23779a[50], 50);
                put(f.f23779a[51], 51);
                put(f.f23779a[52], 52);
                put(f.f23779a[53], 53);
                put(f.f23779a[54], 54);
                put(f.f23779a[55], 55);
                put(f.f23779a[56], 56);
                put(f.f23779a[57], 57);
                put(f.f23779a[58], 58);
                put(f.f23779a[59], 59);
                put(f.f23779a[60], 60);
                put(f.f23779a[61], 61);
                put(f.f23779a[62], 62);
                put(f.f23779a[63], 63);
                put(f.f23779a[64], 64);
                put(f.f23779a[65], 65);
                put(f.f23779a[66], 66);
                put(f.f23779a[67], 67);
                put(f.f23779a[68], 68);
                put(f.f23779a[69], 69);
                put(f.f23779a[70], 70);
                put(f.f23779a[71], 71);
                put(f.f23779a[72], 72);
                put(f.f23779a[73], 73);
                put(f.f23779a[74], 74);
                put(f.f23779a[75], 75);
                put(f.f23779a[76], 76);
                put(f.f23779a[77], 77);
                put(f.f23779a[78], 78);
                put(f.f23779a[79], 79);
                put(f.f23779a[80], 80);
                put(f.f23779a[81], 81);
                put(f.f23779a[82], 82);
                put(f.f23779a[83], 83);
                put(f.f23779a[84], 84);
                put(f.f23779a[85], 85);
                put(f.f23779a[86], 86);
                put(f.f23779a[87], 87);
                put(f.f23779a[88], 88);
                put(f.f23779a[89], 89);
                put(f.f23779a[90], 90);
                put(f.f23779a[91], 91);
                put(f.f23779a[92], 92);
                put(f.f23779a[93], 93);
                put(f.f23779a[94], 94);
                put(f.f23779a[95], 95);
                put(f.f23779a[96], 96);
                put(f.f23779a[97], 97);
                put(f.f23779a[98], 98);
                put(f.f23779a[99], 99);
                put(f.f23779a[100], 100);
                put(f.f23779a[101], 101);
                put(f.f23779a[102], 102);
                put(f.f23779a[103], 103);
                put(f.f23779a[104], 104);
                put(f.f23779a[105], 105);
                put(f.f23779a[106], 106);
                put(f.f23779a[107], 107);
                put(f.f23779a[108], 108);
                put(f.f23779a[109], 109);
                put(f.f23779a[110], 110);
                put(f.f23779a[111], 111);
                put(f.f23779a[112], 112);
                put(f.f23779a[113], 113);
                put(f.f23779a[114], 114);
                put(f.f23779a[115], 115);
                put(f.f23779a[116], 116);
                put(f.f23779a[117], 117);
                put(f.f23779a[118], 118);
                put(f.f23779a[119], 119);
                put(f.f23779a[120], 120);
                put(f.f23779a[121], 121);
                put(f.f23779a[122], 122);
                put(f.f23779a[123], 123);
                put(f.f23779a[124], 124);
                put(f.f23779a[125], 125);
                put(f.f23779a[126], 126);
                put(f.f23779a[127], 127);
                put(f.f23779a[128], 128);
                put(f.f23779a[129], 129);
                put(f.f23779a[130], 130);
                put(f.f23779a[131], 131);
                put(f.f23779a[132], 132);
                put(f.f23779a[133], 133);
                put(f.f23779a[134], 134);
                put(f.f23779a[135], 135);
                put(f.f23779a[136], 136);
                put(f.f23779a[137], 137);
                put(f.f23779a[138], Integer.valueOf((int) SecExceptionCode.SEC_ERROR_INIT_PLUGIN_CLASS_ERROR));
                put(f.f23779a[139], Integer.valueOf((int) SecExceptionCode.SEC_ERROR_INIT_CLAZZ_NULL_ERROR));
                put(f.f23779a[140], Integer.valueOf((int) SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR));
                put(f.f23779a[141], Integer.valueOf((int) MessageType.WEEX_CARD_CENTER));
                put(f.f23779a[142], 142);
                put(f.f23779a[143], 143);
                put(f.f23779a[144], 144);
                put(f.f23779a[145], Integer.valueOf((int) jzk.INSTALL_PROVIDER));
                put(f.f23779a[146], 146);
                put(f.f23779a[147], 147);
                put(f.f23779a[148], 148);
                put(f.f23779a[149], 149);
                put(f.f23779a[150], 150);
                put(f.f23779a[151], 151);
                put(f.f23779a[152], 152);
                put(f.f23779a[153], 153);
                put(f.f23779a[154], 154);
                put(f.f23779a[155], Integer.valueOf((int) tof.USTAR_FILENAME_PREFIX));
                put(f.f23779a[156], 156);
                put(f.f23779a[157], 157);
                put(f.f23779a[158], 158);
                put(f.f23779a[159], 159);
                put(f.f23779a[160], 160);
                put(f.f23779a[161], 161);
                put(f.f23779a[162], Integer.valueOf((int) com.alibaba.triver.triver_shop.shop2023.nativeview.a.bottomBarHeightWithBottomMarginRpxValue));
                put(f.f23779a[163], 163);
                put(f.f23779a[164], 164);
                put(f.f23779a[165], 165);
                put(f.f23779a[166], 166);
                put(f.f23779a[167], 167);
                put(f.f23779a[168], 168);
                put(f.f23779a[169], 169);
                put(f.f23779a[170], 170);
                put(f.f23779a[171], 171);
                put(f.f23779a[172], 172);
                put(f.f23779a[173], Integer.valueOf((int) com.taobao.trtc.rtcroom.a.DEFAULT_FLOATING_WINDOW_HEIGHT));
                put(f.f23779a[174], 174);
                put(f.f23779a[175], 175);
                put(f.f23779a[176], Integer.valueOf((int) ArtcParams.SD180pVideoParams.HEIGHT));
                put(f.f23779a[177], 177);
                put(f.f23779a[178], 178);
                put(f.f23779a[179], Integer.valueOf((int) NavigationTabHelper.ALPHA_70_PERCENT));
                put(f.f23779a[180], 180);
                put(f.f23779a[181], 181);
                put(f.f23779a[182], 182);
                put(f.f23779a[183], 183);
                put(f.f23779a[184], 184);
                put(f.f23779a[185], Integer.valueOf((int) WSContextConstant.HANDSHAKE_RECEIVE_SIZE));
                put(f.f23779a[186], 186);
                put(f.f23779a[187], 187);
                put(f.f23779a[188], 188);
                put(f.f23779a[189], Integer.valueOf((int) WSContextConstant.HANDSHAKE_SEND_SIZE));
                put(f.f23779a[190], 190);
                put(f.f23779a[191], 191);
                put(f.f23779a[192], Integer.valueOf((int) crd.DETECT_WIDTH));
                put(f.f23779a[193], 193);
                put(f.f23779a[194], 194);
                put(f.f23779a[195], 195);
                put(f.f23779a[196], 196);
                put(f.f23779a[197], 197);
                put(f.f23779a[198], 198);
                put(f.f23779a[199], 199);
                put(f.f23779a[200], 200);
                put(f.f23779a[201], 201);
                put(f.f23779a[202], 202);
                put(f.f23779a[203], 203);
                put(f.f23779a[204], 204);
                put(f.f23779a[205], 205);
                put(f.f23779a[206], 206);
                put(f.f23779a[207], 207);
                put(f.f23779a[208], 208);
                put(f.f23779a[209], 209);
                put(f.f23779a[210], 210);
                put(f.f23779a[211], 211);
                put(f.f23779a[212], 212);
                put(f.f23779a[213], Integer.valueOf((int) mln.ON_FRAGMENT_DESTROYED));
                put(f.f23779a[214], 214);
                put(f.f23779a[215], 215);
                put(f.f23779a[216], 216);
                put(f.f23779a[217], 217);
                put(f.f23779a[218], 218);
                put(f.f23779a[219], 219);
                put(f.f23779a[220], 220);
                put(f.f23779a[221], Integer.valueOf((int) AConstants.ArtcErrorServerErrorDropByMobility));
                put(f.f23779a[222], 222);
                put(f.f23779a[223], 223);
                put(f.f23779a[224], 224);
                put(f.f23779a[225], 225);
                put(f.f23779a[226], 226);
                put(f.f23779a[227], 227);
                put(f.f23779a[228], 228);
                put(f.f23779a[229], 229);
                put(f.f23779a[230], 230);
                put(f.f23779a[231], 231);
                put(f.f23779a[232], 232);
                put(f.f23779a[233], 233);
                put(f.f23779a[234], 234);
                put(f.f23779a[235], 235);
                put(f.f23779a[236], 236);
                put(f.f23779a[237], 237);
                put(f.f23779a[238], 238);
                put(f.f23779a[239], 239);
            }
        };
    }

    static {
        String[] strArr = f23779a;
        b = new String[]{strArr[63], strArr[64], strArr[65], strArr[67], strArr[68], strArr[69], strArr[70], strArr[71], strArr[72], strArr[73], strArr[74], strArr[76], strArr[78], strArr[107], strArr[127], strArr[128], strArr[129], strArr[130], strArr[131], strArr[132], strArr[133], strArr[135], strArr[158], strArr[159], strArr[160], strArr[161], strArr[186], strArr[187], strArr[188], strArr[189], strArr[224]};
        e = new HashMap<Integer, int[]>() { // from class: com.uc.webview.base.f.1
            {
                put(88, new int[]{0, 1});
                put(89, new int[]{-1, 0, 1, 2});
                put(98, new int[]{-1, 0, 1, 2});
                put(103, new int[]{-1, 0, 1, 3, 4});
                put(107, new int[]{0, 1, 2});
                put(108, new int[]{-1, 0, 1, 2, 11, 12, -1, 0, 1, 2});
                put(109, new int[]{1, 2, 3, 4});
                put(110, new int[]{0, 1, 2, 3, 4, 5});
                put(131, new int[]{2, 3, 4});
                put(132, new int[]{0, 1, 2});
                put(135, new int[]{0, 1, 2});
            }
        };
        c = new int[][]{new int[]{0, 88}, new int[]{88, SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR}, new int[]{SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR, SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR}, new int[]{SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR, 193}, new int[]{193, 240}};
        d = new int[]{7, 25, 89, 103, 132, 135, 137, SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR, com.alibaba.triver.triver_shop.shop2023.nativeview.a.bottomBarHeightWithBottomMarginRpxValue, NavigationTabHelper.ALPHA_70_PERCENT, 180, 181, 197, 224};
    }

    public static int a(String str) {
        if (a.f23780a.containsKey(str)) {
            return ((Integer) a.f23780a.get(str)).intValue();
        }
        return -1;
    }

    public static Set<String> a() {
        return a.f23780a.keySet();
    }
}
