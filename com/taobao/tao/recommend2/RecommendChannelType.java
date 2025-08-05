package com.taobao.tao.recommend2;

import android.text.TextUtils;
import com.taobao.tao.favorite.FavoriteConstants;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import tb.cts;

/* loaded from: classes8.dex */
public enum RecommendChannelType {
    HOMEPAGE_R4U(NavigationTabConstraints.TAB_BIZ_HOMEPAGE, "首页", false, false, "Page_Home", "recommend_home_main", "tb_recmd_homePage"),
    HTAO_R4U("hTaoHomePage", "海淘首页", false, false, "Page_Home_H", "recommend_home_intl"),
    COUNTRYSIDE_TAO_R4U("cunHomePage", "村淘首页", false, false, "Page_Home_C", "recommend_home_cun"),
    OLD_TAO_R4U("oldHomePage", "亲情版首页", false, false, "Page_Home_O", "recommend_home_old"),
    SHOPPING_CART("TRADE_CART", "购物车", true, true, "Page_ShoppingCart", "recommend_cart_main", "tb_recmd_CART"),
    SHOPPING_CART_NEW("CART", "购物车", true, true, "Page_ShoppingCart", "recommend_cart_main", "tb_recmd_CART"),
    SHOPPING_DIRECT_SALE_CART("CART", "购物车", true, true, "Page_ShoppingCart", "recommend_intlcart_main", "tb_recmd_CART"),
    REC_ONLINE_MC_CAR("MAO_CHAO", "猫超购物车", true, true, "Page_ShoppingCartMC", "recommend_tmallcart_main", "tb_recmd_MAO_CHAO"),
    ORDER_LIST("ORDER_DETAIL", "订单列表", true, true, cts.a.BIZ_ORDER_LIST, "recommend_orderlist_main", "tb_recmd_ORDER_LIST"),
    ORDER_SEARCH_RESULTS("ORDER_DETAIL", "订单搜索结果", true, true, cts.a.BIZ_ORDER_LIST, "recommend_orderlist_main", "tb_recmd_ORDER_LIST"),
    ORDER_LIST_CATAPULT("ORDER_DETAIL_CATAPULT", "订单列表", true, true, cts.a.BIZ_ORDER_LIST, "recommend_orderlist_catapult_main", "tb_recmd_ORDER_DETAIL_CATAPULT"),
    ORDER_DETAIL("ORDER_DETAIL", "订单详情", true, true, cts.a.BIZ_ORDER_DETAIL, "recommend_orderdetail_main", "tb_recmd_ORDER_DETAIL"),
    FAVORITE("COLLECTION", "收藏夹", true, true, FavoriteConstants.UT_FAV_PAGE_NAME, "recommend_collection_main", "tb_recmd_COLLECTION"),
    LOGISTICS("WULIU", "物流详情", true, true, "Page_LogisticDetail", "recommend_logistics_main", "tb_recmd_WULIU"),
    PAY_SUCCESS("PAYSUCCESS", "支付成功", true, true, cts.a.BIZ_PAY_SUCCESS, "recommend_pay_success", "tb_recmd_PAYSUCCESS"),
    CONFIRM_RECEIPT("CONFIRMRECEIPT", "确认收货", true, true, "Page_ConfirmReceipt", "recommend_confirm_receipt", "tb_recmd_CONFIRM_RECEIPT"),
    DEFAULT(NavigationTabConstraints.TAB_BIZ_HOMEPAGE, "默认", false, false, "Unknown_page", "recommend_home_main", "tb_recmd_homePage");
    
    public String adNamespace;
    public final String awesomeChannel;
    private final String description;
    private final boolean isAfterPurchaseChannel;
    private final boolean isAutoTrack;
    public final String pageName;
    private final String requestStr;

    RecommendChannelType(String str, String str2, boolean z, boolean z2, String str3, String str4) {
        this.adNamespace = "tb_recmd_homePage";
        this.requestStr = str;
        this.description = str2;
        this.isAfterPurchaseChannel = z;
        this.isAutoTrack = z2;
        this.pageName = str3;
        this.awesomeChannel = str4;
    }

    RecommendChannelType(String str, String str2, boolean z, boolean z2, String str3, String str4, String str5) {
        this.adNamespace = "tb_recmd_homePage";
        this.requestStr = str;
        this.description = str2;
        this.isAfterPurchaseChannel = z;
        this.isAutoTrack = z2;
        this.pageName = str3;
        this.awesomeChannel = str4;
        this.adNamespace = str5;
    }

    public static RecommendChannelType getChannelType(String str) {
        RecommendChannelType[] values;
        for (RecommendChannelType recommendChannelType : values()) {
            if (TextUtils.equals(str, recommendChannelType.awesomeChannel)) {
                return recommendChannelType;
            }
        }
        return null;
    }

    public String getRequestStr() {
        return this.requestStr;
    }

    public boolean isAfterPurchase() {
        return this.isAfterPurchaseChannel;
    }

    public boolean isAutoTrack() {
        return this.isAutoTrack;
    }

    public boolean isUsingHomepageView() {
        return !isAfterPurchase() || this == ORDER_LIST || this == ORDER_SEARCH_RESULTS || this == ORDER_DETAIL || this == FAVORITE || this == LOGISTICS;
    }
}
