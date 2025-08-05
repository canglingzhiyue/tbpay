package com.taobao.android.detail.core.aura.utils;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import java.util.List;
import tb.arc;
import tb.ard;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f9402a;

    static {
        kge.a(-1081172454);
        f9402a = null;
        emu.a("com.taobao.android.detail.core.aura.utils.AliDetailOrangeConfig");
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_detail_android", "enable_final_ultron", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_detail_android", "enableProtocolCompare", "true"));
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : OrangeConfig.getInstance().getConfig("aura_detail_android", "componentBlackList", "");
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : OrangeConfig.getInstance().getConfig("aura_detail_android", "componentFieldBlackList", "");
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_detail_android", "disableShopRecommendV2DependencyRequest", "false"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_detail_android", "shopRecommendV2IgnoreDependencyRequestFailed", "true"));
    }

    public static List<String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d0410f19", new Object[0]);
        }
        String config = OrangeConfig.getInstance().getConfig("aura_detail_android", "configAuraEventsBlackList", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
        try {
            return JSONArray.parseArray(config, String.class);
        } catch (Exception unused) {
            ard a2 = arc.a();
            a2.c("AliDetailOrangeConfig", "getAuraEventsBlackList", "config=" + config);
            return null;
        }
    }

    public static List<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b7e2e578", new Object[0]);
        }
        String config = OrangeConfig.getInstance().getConfig("aura_detail_android", "configAuraEventsWhiteList", "['empty']");
        try {
            return JSONArray.parseArray(config, String.class);
        } catch (Exception unused) {
            ard a2 = arc.a();
            a2.c("AliDetailOrangeConfig", "getAuraEventsWhiteList", "config=" + config);
            return null;
        }
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_detail_android", "enable_industry_pic_gallery", "true"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue();
        }
        if (f9402a == null) {
            f9402a = Boolean.valueOf(Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_detail_android", "enable_nested_scroll_dispatch", "true")));
        }
        return f9402a.booleanValue();
    }

    public static int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[0])).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig("aura_detail_android", "triver_widget_render_cover_rate", String.valueOf(10));
        try {
            return Integer.parseInt(config);
        } catch (Exception e) {
            ard a2 = arc.a();
            a2.c("AliDetailOrangeConfig", "minRenderRateTriverWidget", "config=" + config + "," + e.getMessage());
            return 10;
        }
    }

    public static List<String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("566a3ef4", new Object[0]);
        }
        try {
            return JSONArray.parseArray(OrangeConfig.getInstance().getConfig("aura_detail_android", "triver_widget_ignore_downgrade_errorcodes", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264), String.class);
        } catch (Exception e) {
            ard a2 = arc.a();
            a2.c("AliDetailOrangeConfig", "getTriverIgnoreDowngradeErrorCodes", "获取出错，" + e.getMessage());
            return null;
        }
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_detail_android", "enableIndustryLightOffReuseVideo", "true"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_detail_android", "checkTemplateBeforeProtocolCompare", "true"));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_detail_android", "enable_video_auto_play", "true"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_detail_android", "enable_low_device_video_auto_play", "true"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_detail_android", "enable_brand_video_auto_play", "true"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_detail_android", "enable_brand_video_pause_gallery_play", "true"));
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_detail_android", "enable_pic_video_placeholder_fix", "true"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_detail_android", "disable_video_auto_carousel", "false"));
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_detail_android", "enable_detail_desc_layout_fix", "true"));
    }
}
