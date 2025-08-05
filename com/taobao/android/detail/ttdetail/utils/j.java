package com.taobao.android.detail.ttdetail.utils;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import mtopsdk.common.util.SymbolExpUtil;
import tb.fgo;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CLOSE_VALUE = "false";
    public static final String DEFAULT_OPEN_VALUE = "true";
    public static final String ORANGE_GROUP;

    static {
        kge.a(-246775054);
        ORANGE_GROUP = odg.q().a();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, fgo.ENABLE_VIDEO_AUTO_PLAY, "true"));
        }
        return false;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "not_auto_play_video_low_device", "false"));
        }
        return false;
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        String a3 = a2.a(ORANGE_GROUP, "close_wvhw_list", "");
        if (!TextUtils.isEmpty(a3)) {
            if (a3.contains("," + Build.MODEL.toLowerCase(Locale.getDefault()) + ",")) {
                return true;
            }
        }
        return false;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_detail_v3_preload_data_clip", "true"));
        }
        return false;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enableDetailLightoffDxNew", "true"));
        }
        return false;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_global_barrage", "true"));
        }
        return false;
    }

    public static boolean ad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        String a3 = a2.a(ORANGE_GROUP, "enable_inside_barrage", "true");
        i.a("OrangeUtils", "Orange enableInsideBarrage:" + a3);
        return Boolean.parseBoolean(a3);
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_ccrc_activate", "true"));
        }
        return false;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        String a3 = a2.a(ORANGE_GROUP, "enable_liftup_sku", "true");
        i.a("OrangeUtils", "Orange enableAutoShowSku:" + a3);
        return Boolean.parseBoolean(a3);
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_collect_use_new_favorite", "true"));
        }
        return false;
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_float_bottom_dx", "true"));
        }
        return false;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_replace_live_float", "true"));
        }
        return false;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_bottombar_cart_refresh", "true"));
        }
        return false;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_opt_bitmap_recycler", "true"));
        }
        return false;
    }

    public static boolean ag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        String a3 = a2.a(ORANGE_GROUP, "update_detail_enable_stream", "true");
        i.a("OrangeUtils", "Orange enableStreamCustomApi:" + a3);
        return Boolean.parseBoolean(a3);
    }

    public static boolean ai() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        String a3 = a2.a(ORANGE_GROUP, "enable_touchdown", "true");
        i.a("OrangeUtils", "Orange enableTouchDownEvent:" + a3);
        return Boolean.parseBoolean(a3);
    }

    public static boolean aj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab715434", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        String a3 = a2.a(ORANGE_GROUP, "enable_sku_anr_fix", "true");
        i.a("OrangeUtils", "Orange enableSkuAnrFix:" + a3);
        return Boolean.parseBoolean(a3);
    }

    public static List<String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e89f38ba", new Object[0]);
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return null;
        }
        String a3 = a2.a(ORANGE_GROUP, "append_abilitycenter_event_types", "");
        if (!TextUtils.isEmpty(a3)) {
            return am.a(a3.split(";"));
        }
        return null;
    }

    public static String[] j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("632f5980", new Object[0]);
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return "utparam,list_param,%22list_param,search_keyword,eurl,price,title,pic_path,URL_REFERER_ORIGIN,NAV_START_ACTIVITY_TIME,NAV_TO_URL_START_TIME,WEEX_NAV_PROCESSOR_TIME,afc_link,utparamcnt,tk_cps_param,tkFlag,tk_cps_ut,relationId,union_lens,NAV_START_ACTIVITY_UPTIME,NAV_TO_URL_START_UPTIME,picurl,reservePrice,p4p_url".split(",");
        }
        return a2.a(ORANGE_GROUP, "detail_request_params_black_list", "utparam,list_param,%22list_param,search_keyword,eurl,price,title,pic_path,URL_REFERER_ORIGIN,NAV_START_ACTIVITY_TIME,NAV_TO_URL_START_TIME,WEEX_NAV_PROCESSOR_TIME,afc_link,utparamcnt,tk_cps_param,tkFlag,tk_cps_ut,relationId,union_lens,NAV_START_ACTIVITY_UPTIME,NAV_TO_URL_START_UPTIME,picurl,reservePrice,p4p_url").split(",");
    }

    public static boolean aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaf280ab", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "search_channel_black2white", "true"));
        }
        return false;
    }

    public static String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[0]);
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        return a2 == null ? "search,newDetail,cart" : a2.a(ORANGE_GROUP, "batch_preload_channel_white_list", "search,newDetail,cart");
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_newArc_batch_preload", "true"));
        }
        return false;
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_delete_preload_cache", "true"));
        }
        return false;
    }

    public static String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[0]);
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        return a2 == null ? "https://pages-fast.m.taobao.com/wow/z/app/detail-next/item/index?x-ssr=true&id=" : a2.a(ORANGE_GROUP, "redirect_base_h5_url", "https://pages-fast.m.taobao.com/wow/z/app/detail-next/item/index?x-ssr=true&id=");
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_main_request_degrade", "false"));
        }
        return false;
    }

    public static boolean ak() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab7f6bb5", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        String a3 = a2.a(ORANGE_GROUP, "enable_data_cropping", "true");
        i.a("OrangeUtils", "主接口数据协议剪裁, enable_data_cropping=" + a3);
        return Boolean.parseBoolean(a3);
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_redirect_use_ssr", "false"));
        }
        return false;
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_ignore_error_receive_data", "true"));
        }
        return true;
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_test_retry", "false"));
        }
        return false;
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_pad_adapter_new_structure_2", "true"));
        }
        return true;
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_fold_device_single_column", "true"));
        }
        return true;
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_downgrade_h5_shrink", "false"));
        }
        return false;
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_set_h5_error_page", "true"));
        }
        return false;
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_scroll_log_print", "false"));
        }
        return false;
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4529658", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        String a3 = a2.a(ORANGE_GROUP, "enable_clearpreweex_onupdate", "true");
        i.a("OrangeUtils", "主屏切地址或穿越场景，清理已经预加载的weex实例，enable_clearpreweex_onupdate=" + a3);
        return Boolean.parseBoolean(a3);
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("460add9", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enableInsideNewHeightAB", "true"));
        }
        return false;
    }

    public static boolean ab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enableWeexSkuV3Preload", "true"));
        }
        return false;
    }

    public static boolean ac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        String a3 = a2.a("android_sku", "enable_weex_silent_action", "true");
        i.a("OrangeUtils", "Orange enableWeexSilentAction:" + a3);
        return Boolean.parseBoolean(a3);
    }

    public static boolean al() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8d8336", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        String a3 = a2.a(ORANGE_GROUP, "enable_mtop_header_map", "true");
        i.a("OrangeUtils", "Orange enable_mtop_header_map:" + a3);
        return Boolean.parseBoolean(a3);
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enableSinglePicCenter", "true"));
        }
        return false;
    }

    public static float D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d3c2bb", new Object[0])).floatValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Float.parseFloat(a2.a(ORANGE_GROUP, "recommend_first_request_position", "1.5"));
        }
        return 1.5f;
    }

    public static String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9567bd4", new Object[0]);
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        return a2 == null ? "12" : a2.a(ORANGE_GROUP, "recommend_paging_request_position", "12");
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_pad_adapt_new_recommend", "false"));
        }
        return false;
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_new_recommend_style", "true"));
        }
        return false;
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_rate_float", "true"));
        }
        return false;
    }

    public static boolean ao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abb7c9b9", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_obtain_keywords_from_rate_component", "true"));
        }
        return false;
    }

    public static boolean ap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc5e13a", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_fix_pad_rate_exception", "true"));
        }
        return false;
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_nav_support_festival", "true"));
        }
        return false;
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_adjust_detail_desc_height", "true"));
        }
        return false;
    }

    public static boolean ae() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab2adeaf", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_pic_container_opt", "true"));
        }
        return false;
    }

    public static boolean aq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abd3f8bb", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_gif_container_opt", "true"));
        }
        return false;
    }

    public static boolean ar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_network_error_view", "true"));
        }
        return false;
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_scroller_finish_abort", "true"));
        }
        return false;
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_report_error_use_mtop", "true"));
        }
        return false;
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("509c7e5", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        String a3 = a2.a(ORANGE_GROUP, "enable_redirect_default_url", "true");
        i.a("OrangeUtils", "重定向默认url, enable_redirect_default_url=" + a3);
        return Boolean.parseBoolean(a3);
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4366756", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_close_global_live_view", "true"));
        }
        return false;
    }

    public static boolean af() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab38f630", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "enable_openWW_with_DigitalId", "true"));
        }
        return false;
    }

    public static boolean am() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab9b9ab7", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        String a3 = a2.a(ORANGE_GROUP, "enable_component_fatigue", "true");
        i.a("OrangeUtils", "是否允许组件疲劳度功能启动: " + a3);
        return Boolean.parseBoolean(a3);
    }

    public static boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fbb064", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return s.a(a2.a(ORANGE_GROUP, "newUserBehaviorRatio", "500"));
        }
        return false;
    }

    public static boolean ah() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab552532", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        String a3 = a2.a(ORANGE_GROUP, "redirectDefaultUrlRatio", "1000");
        i.a("OrangeUtils", "重定向默认url放量, redirectDefaultUrlRatio=" + a3);
        return s.a(a3);
    }

    public static boolean an() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        String a3 = a2.a(ORANGE_GROUP, "enable2H5WhenException", "false");
        i.a("OrangeUtils", "端侧异常是否降级到H5, enable2H5WhenException = " + a3);
        return Boolean.parseBoolean(a3);
    }

    public static List<String> S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b79c4fad", new Object[0]);
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        ArrayList arrayList = null;
        if (a2 == null) {
            return null;
        }
        String a3 = a2.a(ORANGE_GROUP, "newArchScheme", "");
        if (!TextUtils.isEmpty(a3)) {
            String[] split = a3.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
            if (split.length > 0) {
                arrayList = new ArrayList(split.length);
            }
            for (String str : split) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public static boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b53adf", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return s.a(a2.a(ORANGE_GROUP, "newArchSchemeRatio", "-1"));
        }
        return false;
    }

    public static List<String> U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("86dffc6b", new Object[0]);
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        ArrayList arrayList = null;
        if (a2 == null) {
            return null;
        }
        String a3 = a2.a(ORANGE_GROUP, "newArchHostPath", "");
        if (!TextUtils.isEmpty(a3)) {
            String[] split = a3.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
            if (split.length > 0) {
                arrayList = new ArrayList(split.length);
            }
            for (String str : split) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public static boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d169e1", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return s.a(a2.a(ORANGE_GROUP, "newArchHostPathRatio", "-1"));
        }
        return false;
    }

    public static boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df8162", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return s.a(a2.a(ORANGE_GROUP, "newArchForceAllUrl", "10000"));
        }
        return true;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        String a3 = a2.a(ORANGE_GROUP, "disableNewStructure", "false");
        i.a("OrangeUtils", "关闭新架构disableNewStructure: " + a3);
        return Boolean.parseBoolean(a3);
    }

    public static JSONObject p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9774dc17", new Object[0]);
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return null;
        }
        try {
            return JSONObject.parseObject(a2.a(ORANGE_GROUP, "new_structure", ""));
        } catch (Throwable th) {
            i.a("OrangeUtils", "getNewArchitectureConfig() error", th);
            return null;
        }
    }

    public static boolean b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{jSONObject})).booleanValue();
        }
        if (Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sForceNewArchitecture))) {
            return false;
        }
        if (o()) {
            return true;
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("close")) != null) {
            String string = jSONObject2.getString("appVersion");
            if (!TextUtils.isEmpty(string)) {
                return h.a(string.split("/"));
            }
        }
        return false;
    }

    public static boolean c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{jSONObject})).booleanValue() : a(jSONObject, p());
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f32d06c", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        if (!o() && a(jSONObject) && !bp.a(jSONObject2, jSONObject) && y()) {
            return true;
        }
        return Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sForceNewArchitecture));
    }

    private static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue();
        }
        if (!e.b()) {
            return true;
        }
        return w();
    }

    private static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue();
        }
        boolean d = d.d(jSONObject);
        i.a("OrangeUtils", "服务端下发新架构标识: " + d);
        return d;
    }

    public static boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a(ORANGE_GROUP, "skipServerNewArchPreVerification", "true"));
        }
        return true;
    }
}
