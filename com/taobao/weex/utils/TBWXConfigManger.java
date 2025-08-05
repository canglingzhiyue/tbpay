package com.taobao.weex.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import io.unicorn.adapter.UnicornAdapterJNI;
import java.util.Set;
import tb.kge;

/* loaded from: classes9.dex */
public class TBWXConfigManger {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HC_CONFIG = "android_weex_huichang_config";
    public static final String HC_DOMAIN = "weex_main_hc_domain";
    public static final String WX_CHECK_URL_KEY = "weex_check_url";
    public static final String WX_COMMON_CONFIG = "weex_common_config";
    public static final String WX_DEGRADE_KEY = "weex_degrade";
    public static final String WX_GET_DEEP_VIEW_LAYER = "get_deep_view_layer";
    public static final String WX_GROUP_NAME = "android_weex_degrade";
    public static final String WX_NAMEPACE_CHECK_URL = "android_weex_check_url";
    public static final String WX_NAMESPACE_EXT_CONFIG = "wx_namespace_ext_config";
    public static final String WX_NAMESPACE_RENDER = "android_weex_render";
    public static final String WX_NAMESPACE_TABLET = "weex_android_tablet";
    public static final String WX_RENDER_KEY = "weex_render";
    public static final String WX_SHOP_NAV_PROCESSOR = "weex_android_shop_nav_processor";
    public static final String WX_SUPPORT_KEY = "support";
    public static final String WX_USE_SHOP_NAV_KEY = "weex_use_shop_nav_processor";
    public static final String WX_V2_CONFIG = "weex_v2_config";

    /* renamed from: a  reason: collision with root package name */
    private static TBWXConfigManger f23535a;

    static {
        kge.a(-1425870236);
        f23535a = new TBWXConfigManger();
    }

    public static TBWXConfigManger getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBWXConfigManger) ipChange.ipc$dispatch("6d20684f", new Object[0]) : f23535a;
    }

    private TBWXConfigManger() {
    }

    public synchronized boolean isDegrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db9891f7", new Object[]{this})).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig(WX_GROUP_NAME, WX_DEGRADE_KEY, "false");
        return !TextUtils.isEmpty(config) && "true".equals(config);
    }

    public synchronized boolean isCheckUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4ca669c", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals("true", OrangeConfig.getInstance().getConfig(WX_NAMEPACE_CHECK_URL, WX_CHECK_URL_KEY, "true"));
    }

    public synchronized boolean isRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c88507eb", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals("true", OrangeConfig.getInstance().getConfig(WX_NAMESPACE_RENDER, WX_RENDER_KEY, "true"));
    }

    public synchronized boolean isGetDeepViewLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2737a3f", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals("true", OrangeConfig.getInstance().getConfig(WX_NAMESPACE_EXT_CONFIG, WX_GET_DEEP_VIEW_LAYER, "false"));
    }

    public synchronized String getMainHCUrls() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("147c804b", new Object[]{this});
        }
        return OrangeConfig.getInstance().getConfig(HC_CONFIG, "weex_main_hc_domain", "");
    }

    public synchronized boolean isSupporTablet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc1d5060", new Object[]{this})).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig(WX_NAMESPACE_TABLET, WX_SUPPORT_KEY, "false"));
    }

    public synchronized boolean isUseShopNavProcessor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("326fee6d", new Object[]{this})).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig(WX_SHOP_NAV_PROCESSOR, WX_USE_SHOP_NAV_KEY, "false"));
    }

    public static Boolean enableInitOptimalize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("55a1b99", new Object[]{context});
        }
        return true;
    }

    public static boolean enableInitV2InsideV1(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c407bb1f", new Object[]{context})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("weex_v2_config", "init_v2_inside_v1", "false"));
    }

    public static boolean enableSyncInitV2(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2944855b", new Object[]{context})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("weex_v2_config", "init_v2_sync", "false"));
    }

    public static boolean disableSyncInitV2Unicorn(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7b81df5c", new Object[]{context})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("weex_v2_config", "disable_init_v2_unicorn_sync", "false"));
    }

    public boolean isWeexV2Enable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7423e815", new Object[]{this})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("weex_v2_config", "enable", "true"));
    }

    public boolean enableRewardRemote() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("19e22a03", new Object[]{this})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig(WX_COMMON_CONFIG, "enableRewardRemote", "true"));
    }

    public String getWeexV2ZCachePrefetch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c7aa60c7", new Object[]{this}) : OrangeConfig.getInstance().getConfig("weex_v2_config", "zcache_prefetch", "secondfloor");
    }

    public boolean enableFixOrientation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("15619869", new Object[]{this})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig(WX_COMMON_CONFIG, "enableFixOrientation", "true"));
    }

    public static boolean enableOrientationLandscape() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("176f7e79", new Object[0])).booleanValue();
        }
        try {
            return "true".equals(OrangeConfig.getInstance().getConfig("weex_v2_config", "enable_orientation_landscape", "true"));
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean enableWXInitAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d9500e6", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig(WX_COMMON_CONFIG, "enableWXInitAdapter", "true"));
    }

    public String getConfigUrl(String str) {
        String replaceFirst;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b921d638", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && UnicornAdapterJNI.instance().libraryLoaded()) {
            String config = OrangeConfig.getInstance().getConfig("weex_v2_config", "url_map", "{\"market.m.taobao.com/app/newdetail/newdetail/pages/Home\":\"meta.m.taobao.com/app/detail-project/newdetail2/home201111\",\"market.m.taobao.com/app/newdetail/newdetail/pages/SuperItem\":\"meta.m.taobao.com/app/newdetail/super/home\"}");
            if (!TextUtils.isEmpty(config)) {
                try {
                    Uri parse = Uri.parse(str);
                    String uri = parse.buildUpon().clearQuery().build().toString();
                    JSONObject parseObject = JSON.parseObject(config);
                    Set<String> keySet = parseObject.keySet();
                    if (keySet != null) {
                        for (String str2 : keySet) {
                            if (uri.contains(str2)) {
                                String string = parseObject.getString(str2);
                                if (string.endsWith(".wlm")) {
                                    replaceFirst = (parse.isHierarchical() && parse.getQueryParameterNames().contains("_mus_tpl")) ? str.replaceFirst("_mus_tpl=" + parse.getQueryParameter("_mus_tpl"), "_mus_tpl=" + string) : str + "&_mus_tpl=" + string;
                                } else {
                                    replaceFirst = str.replaceFirst(str2, parseObject.getString(str2));
                                }
                                String replaceFirst2 = (parse.isHierarchical() && parse.getQueryParameterNames().contains("renderType")) ? replaceFirst.replaceFirst("renderType=" + parse.getQueryParameter("renderType"), "renderType=2") : replaceFirst + "&renderType=2";
                                String[] split2 = OrangeConfig.getInstance().getConfig("weex_v2_config", "dom_white_list", "").split(",");
                                if (split2 != null) {
                                    String str3 = replaceFirst2;
                                    for (String str4 : split2) {
                                        if (uri.contains(str4)) {
                                            str3 = (parse.isHierarchical() && parse.getQueryParameterNames().contains("weex_mode")) ? str3.replaceFirst("weex_mode=" + parse.getQueryParameter("weex_mode"), "weex_mode=dom") : str3 + "&weex_mode=dom";
                                        }
                                    }
                                    replaceFirst2 = str3;
                                }
                                String config2 = OrangeConfig.getInstance().getConfig("weex_v2_config", "transparent_url_list", "");
                                if (!TextUtils.isEmpty(config2) && (split = config2.split(",")) != null) {
                                    for (String str5 : split) {
                                        if (uri.contains(str5)) {
                                            if (parse.isHierarchical() && parse.getQueryParameterNames().contains("wx_opaque")) {
                                                return replaceFirst2.replaceFirst("wx_opaque=" + parse.getQueryParameter("wx_opaque"), "wx_opaque=0");
                                            }
                                            return replaceFirst2 + "&wx_opaque=0";
                                        }
                                    }
                                }
                                return replaceFirst2;
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    public boolean offSingleProcessTask() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff2db88", new Object[]{this})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig(WX_COMMON_CONFIG, "offSingleProcessTask", "true"));
    }
}
