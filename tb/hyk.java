package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes6.dex */
public class hyk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPEN_NAV_PROCESSOR = "open_Nav_Processor";
    public static final String ORANGE_CONFIG_NEW_NO_MAP_WEATHER_DEVICE_CONFIG = "logistic_detail_no_map_weather_device_config";
    public static final String ORANGE_CONFIG_NEW_NO_WEATHER_DEVICE_CONFIG = "logistic_detail_no_weather_device_config";
    public static final String ORANGE_CONFIG_NEW_NO_WEATHER_DEVICE_DEAULT_CONFIG = "{\"deviceScore\":70,\"rule\":[]}";
    public static final String ORANGE_CONFIG_WEATHER_DEFAULT_URL = "{\"W01\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/gaowen.zip?__md__=gaowen\",\"W02\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/yun.zip?__md__=yun\",\"W03\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/yun.zip?__md__=yun\",\"W04\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/thunder.zip?__md__=thunder\",\"W05\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/yun.zip?__md__=yun\",\"W06\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/cold.zip?__md__=cold\",\"W07\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/yun.zip?__md__=yun\",\"W08\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/sand.zip?__md__=sand\",\"W09\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/wu.zip?__md__=wu\",\"W08_MAP\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/sand_map.zip?__md__=sand_map\",\"W09_MAP\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.62/android/wu_map.zip?__md__=wu_map\"}";
    public static final String ORANGE_CONFIG_WEATHER_URL = "logistic_detail_weather_url_20180921";
    public static final String ORANGE_NO_MAP_DEVICE_CONFIG = "logistic_detail_no_map_device_config";
    public static final String ORANGE_OD_NO_MAP_DEVICE_CONFIG = "order_detail_no_map_config";
    public static final String ORANGE_PARTICAL_WEATHER_OPENGL_CONFIG = "logistic_detail_map_partical_weather_opengl_config_521";
    public static final String O_DETAIL_NAV_H5 = "oDetail_nav_h5";
    public static final String O_LIST_H5 = "oList_h5";
    public static final String O_LIST_V2 = "oList_V2_Open";

    static {
        kge.a(239047748);
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : CoreConstants.API_NAME_LIST_V2;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : CoreConstants.API_NAME_DETAIL_V2;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("babelorder", "oDetail_use_background", "true"));
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : OrangeConfig.getInstance().getConfig("babelorder", "oDetail_NewH5Url", "https://market.m.taobao.com/app/dinamic/h5-tb-odetail/index.html?isNew=false");
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "oDetail_RecommendLoading", "true"));
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[0]) : OrangeConfig.getInstance().getConfig("babelorder", "oList_NewH5Url", "https://market.m.taobao.com/app/dinamic/h5-tb-olist/index.html?isNew=false");
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[0]) : OrangeConfig.getInstance().getConfig("babelorder", "oDetail_h5", "");
    }

    public static String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[0]) : OrangeConfig.getInstance().getConfig("babelorder", O_LIST_H5, "");
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("babelorder", "oList_dowgradeH5_retV1", "false"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("babelorder", "oDetail_dowgradeH5_retV1", "false"));
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", O_DETAIL_NAV_H5, "true"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", OPEN_NAV_PROCESSOR, "true"));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "ODetail_AssembleUrl", "true"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "OD_Preload_GD", "true"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("babelorder", "intercept_logistic_notifi", "true"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("babelorder", "catch_dispatch_dme", "true"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("babelorder", "isRemoveVHItemParentV1", "true"));
    }

    public static int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("686426f", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig("babelorder", kio.FLING_VELOCTIY, "2500"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : A() && "true".equals(OrangeConfig.getInstance().getConfig("babelorder", kio.OPEN_FLING_VELOCTIY, "false"));
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "pData", "false"));
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "useUltronParseCb", "true"));
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "asyncParseRpcResponse", "false"));
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue() : akt.a() == 2;
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", O_LIST_V2, "true"));
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "is_destroy_orderweexview", "true"));
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue() : "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("babel_order_logisitics", "logistic_enable_redirect_when_close_page", "true"));
    }

    public static String K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2078db8e", new Object[0]) : OrangeConfig.getInstance().getConfig("babel_order_logisitics", "logistic_package_list_url", "https://meta.m.taobao.com/app/dinamic/tb-logistics/home?renderType=2&is_loading=0");
    }

    public static String L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6fe962d", new Object[0]) : OrangeConfig.getInstance().getConfig("babel_order_logisitics", "logistic_detail_url", "https://page.cainiao.com/mcn/common-logistics/web/index.html?wx_navbar_transparent=true&disableNav=YES&titleVisible=false#/?source=taobao&querySourceId=68719480944&showTitle=true&tradeId=");
    }

    public static String M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2d8450cc", new Object[0]) : OrangeConfig.getInstance().getConfig("babel_order_logisitics", "logistic_detail_url", "https://m.duanqu.com/?_ariver_appid=11509317&page=pages%2Flogistic%2Flogistic%3FappName%3DTAOBAOMINIAPP%26querySourceId%3D68719480945");
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("460add9", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "reNavWhenFindDirectTo", "true"));
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "disableRecycleViewAnimator", "true"));
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "enableRedirectToOrderDetail4", "true"));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "appendRedirectOD4TradeHybridParam", "true"));
    }
}
