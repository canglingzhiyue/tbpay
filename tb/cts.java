package tb;

import android.taobao.mulitenv.EnvironmentSwitcher;

/* loaded from: classes2.dex */
public class cts {

    /* loaded from: classes2.dex */
    public static class a {
        public static final String BIZ_CONFIRM_GOOD = "confirmGood";
        public static final String BIZ_LIGHT_BUY = "Page_LightBuy";
        public static final String BIZ_LOGISTICS = "Page_Logistics";
        public static final String BIZ_ORDER_DETAIL = "Page_OrderDetail";
        public static final String BIZ_ORDER_LIST = "Page_OrderList";
        public static final String BIZ_PAY_SUCCESS = "Page_PaySuccess";
        public static final String BIZ_REFUND_DETAIL = "Page_RefundDetail";
        public static final String BIZ_REFUND_LIST = "Page_RefundList";
        public static final String PRE_RENDER_URL_CONFIRM_GOOD;
        public static final String PRE_RENDER_URL_LIGHT_BUY = "https://meta.m.taobao.com/app/tb-trade/light-buy/home?wh_weex=true&weex_mode=dom&wx_limit_raster_cache=true&preload=true";
        public static final String PRE_RENDER_URL_LOGISTICS;
        public static final String PRE_RENDER_URL_ORDER_DETAIL;
        public static final String PRE_RENDER_URL_PAY_SUCCESS;
        public static final String PRE_RENDER_URL_REFUND_LIST;
        public static final String QUERY_ASYNC_CREATE_INSTANCE = "asyncCreateInstance";
        public static final String QUERY_HIT_PRERENDER_OPT = "hitPreRenderOpt";
        public static final String TMS_PRE_RENDER_URL_REFUND_DETAIL;

        static {
            kge.a(-578079689);
            PRE_RENDER_URL_ORDER_DETAIL = EnvironmentSwitcher.a() == 0 ? "https://meta.m.taobao.com/app/tb-trade/odetail/home?wh_weex=true&weex_mode=dom&wx_limit_raster_cache=true&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&disableNav=YES&status_bar_transparent=true&preload=true&openFrom=tradereceipt&wx_use_layoutng=true&wx_auto_back=true&tradeHybrid=true" : "https://meta.wapa.taobao.com/app/tb-trade/odetail/home?wh_weex=true&weex_mode=dom&wx_limit_raster_cache=true&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&disableNav=YES&status_bar_transparent=true&preload=true&openFrom=tradereceipt&wx_use_layoutng=true&wx_auto_back=true&tradeHybrid=true";
            PRE_RENDER_URL_PAY_SUCCESS = EnvironmentSwitcher.a() == 0 ? "https://meta.m.taobao.com/app/mtb/pay-success-v3/simple-pay-success?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&wx_use_layoutng=true&degrade=0&asyncSceneSimplePage=sceneGo&preload=true" : "https://meta.wapa.taobao.com/app/mtb/pay-success-v3/simple-pay-success?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&wx_use_layoutng=true&degrade=0&asyncSceneSimplePage=sceneGo&preload=true";
            PRE_RENDER_URL_REFUND_LIST = EnvironmentSwitcher.a() == 0 ? "https://meta.m.taobao.com/app/mtb/refund-list/home?wh_weex=true&weex_mode=dom&isFromWoTaoRefund=true&preload=true&wx_opaque=0" : "https://meta.wapa.taobao.com/app/mtb/refund-list/home?wh_weex=true&weex_mode=dom&isFromWoTaoRefund=true&preload=true&wx_opaque=0";
            PRE_RENDER_URL_CONFIRM_GOOD = EnvironmentSwitcher.a() == 0 ? "https://meta.m.taobao.com/app/mtb/pay-success-v2/confirm-success?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&status_bar_transparent=true&tradeHybrid=true&preload=true" : "https://meta.wapa.taobao.com/app/mtb/pay-success-v2/confirm-success?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&status_bar_transparent=true&tradeHybrid=true&preload=true";
            PRE_RENDER_URL_LOGISTICS = EnvironmentSwitcher.a() == 0 ? "https://meta.m.taobao.com/app/mtb/logisticsV2/detail?wh_weex=true&renderMode=texture&tradeHybrid=true&wx_opaque=1&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&wx_use_layoutng=true&viewLogisticDetail=true&preload=true" : "https://meta.wapa.taobao.com/app/mtb/logisticsV2/detail?wh_weex=true&renderMode=texture&tradeHybrid=true&wx_opaque=1&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&wx_use_layoutng=true&viewLogisticDetail=true&preload=true";
            TMS_PRE_RENDER_URL_REFUND_DETAIL = EnvironmentSwitcher.a() == 0 ? "https://pages-g.m.taobao.com/wow/z/app/mtb/refund-project/detail?isPrerender=true&x-ssr=true&disableProgress=true&x-preload=true&fcc_match_query=disputeId&disableNav=YES&forceThemis=true" : "https://pages-fast.wapa.taobao.com/wow/z/app/mtb/refund-project/detail?isPrerender=true&x-ssr=true&disableProgress=true&x-preload=true&fcc_match_query=disputeId&disableNav=YES&forceThemis=true";
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        public static final String FRONT_END_URL_CONFIRM_GOOD;
        public static final String FRONT_END_URL_PAY_SUCCESS;

        static {
            kge.a(-1057103840);
            FRONT_END_URL_PAY_SUCCESS = a.PRE_RENDER_URL_PAY_SUCCESS;
            FRONT_END_URL_CONFIRM_GOOD = a.PRE_RENDER_URL_CONFIRM_GOOD;
        }
    }

    static {
        kge.a(741975138);
    }
}
