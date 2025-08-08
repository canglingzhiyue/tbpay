package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.cart.constant.CartFrom;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes6.dex */
public class jjo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_CART_GROUP_NAME = "cart_switch";
    public static final String ORANGE_DEGRADE_H5_SCALE = "cart_degrade_to_h5_scale";
    public static final String ORANGE_TB_CART_H5 = "tb_cart_h5_url";
    public static final String ORANGE_TMS_CART_H5 = "tms_cart_h5_url";

    static {
        kge.a(352694887);
    }

    public static String a(CartFrom cartFrom, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ee8cd61", new Object[]{cartFrom, str});
        }
        if (CartFrom.TSM_NATIVE_TAOBAO.equals(cartFrom)) {
            String config = OrangeConfig.getInstance().getConfig("cart_switch", ORANGE_TMS_CART_H5, "https://cart.m.tmall.com/cart/myCart.htm");
            if (StringUtils.isEmpty(str)) {
                return config;
            }
            return config + "?tp_id=" + str;
        }
        return OrangeConfig.getInstance().getConfig("cart_switch", ORANGE_TB_CART_H5, "https://main.m.taobao.com/cart/index.html?ttid=h5&spm=a2141.7631563");
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig("cart_switch", ORANGE_DEGRADE_H5_SCALE, "0"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("cart_switch", "cart_float_weex_url", jjn.b() ? "https://meta.m.taobao.com/app/tb-trade/supercart/cart?wh_weex=true&weex_mode=dom&wx_limit_raster_cache=true&wx_navbar_hidden=true&entrance=tab&floatCart=1&nav_jump_mode=std_mega_pop&stdpop_popId=float_cart_weex&skipEnterAnimation=true&stdpop_config%3D%7B%22droidPanEnable%22%3A%22true%22%7D&skipTradeHybridContainerUt=true" : "https://meta.wapa.taobao.com/app/tb-trade/supercart/cart?wh_weex=true&weex_mode=dom&wx_limit_raster_cache=true&wx_navbar_hidden=true&entrance=tab&floatCart=1&nav_jump_mode=std_mega_pop&stdpop_popId=float_cart_weex&skipEnterAnimation=true&stdpop_config%3D%7B%22droidPanEnable%22%3A%22true%22%7D&skipTradeHybridContainerUt=true");
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("cart_switch", "tms_cart_weex_url", jjn.b() ? "https://meta.m.taobao.com/app/tb-trade/supercart/chaoshi_cart?wx_navbar_hidden=true&wh_weex=true&weex_mode=dom&entrance=tab&cartFrom=tsm_native_taobao&sceneCartType=supermarketCart_513&pageName=superCart&disableNav=YES&wx_navbar_transparent=true&_wx_statusbar_hidden=true" : "https://meta.wapa.taobao.com/app/tb-trade/supercart/chaoshi_cart?wx_navbar_hidden=true&wh_weex=true&weex_mode=dom&entrance=tab&cartFrom=tsm_native_taobao&sceneCartType=supermarketCart_513&pageName=superCart&disableNav=YES&wx_navbar_transparent=true&_wx_statusbar_hidden=true");
    }
}
