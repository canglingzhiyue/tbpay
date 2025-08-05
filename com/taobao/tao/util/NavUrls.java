package com.taobao.tao.util;

import com.etao.feimagesearch.e;
import com.taobao.tao.shop.common.ShopConstants;
import tb.kge;

/* loaded from: classes8.dex */
public class NavUrls {
    public static final String NAV_URL_ALIPAY = "http://d.m.taobao.com/goAlipay.htm";
    public static final String NAV_URL_ALLSPARK_CONFIGURABLE = "h5.m.taobao.com/weapp/view_page.htm";
    public static final String[] NAV_URL_BIG;
    public static final String NAV_URL_CALENDAR_MY_PLAN = "http://m.taobao.com/go/CalendarMyPlan";
    public static final String NAV_URL_CAMERA = "http://m.taobao.com/go/camera";
    public static final String[] NAV_URL_CART_BASE;
    public static final String NAV_URL_CHEST_ANIMAT = "http://m.taobao.com/animat/chest.htm";
    public static final String NAV_URL_CONTECTS = "http://m.taobao.com/go/importcontacts.htm";
    public static final String NAV_URL_DELIVER_MANAGER = "http://my.m.taobao.com/deliver/wap_deliver_address_list.htm";
    public static final String[] NAV_URL_DETAIL_BASE;
    public static final String NAV_URL_FEEDBACK = "http://h5.m.taobao.com/other/feedback.html";
    public static final String NAV_URL_FIND = "http://h5.m.taobao.com/discover/index.htm";
    public static final String NAV_URL_GOLDCOINS = "http://tb.cn/x/tjb/";
    public static final String NAV_URL_HELPANDABOUT = "taobao://helpandabout";
    public static final String NAV_URL_HOME_PAGE = "http://m.taobao.com/index.htm";
    public static final String NAV_URL_HUOYAN = "taobao://huoyan";
    public static final String NAV_URL_INVALIDCART = "http://h5.m.taobao.com/invalidcart/index.htm";
    public static final String NAV_URL_LOGISTIC_DETAIL = "http://h5.m.taobao.com/awp/mtb/oper.htm";
    public static final String NAV_URL_LOGISTIC_LIST = "http://tb.cn/x/wl";
    public static final String NAV_URL_MAIN = "http://m.taobao.com/index.htm";
    public static final String NAV_URL_MSG_CENTER_CATEGORY = "http://m.taobao.com/go/msgcentercategory";
    public static final String NAV_URL_MSG_CENTER_CHAT = "http://tb.cn/n/ww/chat";
    public static final String NAV_URL_MSG_CENTER_OFFICAL = "http://tb.cn/n/ww/official";
    public static final String NAV_URL_MSG_CENTER_SETTINGS = "http://m.taobao.com/go/msgcentersettings";
    public static final String NAV_URL_MYDELIVER_MANAGER = "http://my.m.taobao.com/deliver/wap_deliver_address_list.htm";
    public static final String NAV_URL_MY_COMMENT = "http://wapp.m.taobao.com/weapp/myComment.htm";
    public static final String NAV_URL_MY_COMMENT_LIST = "http://h5.m.taobao.com/weapp/myCommentList.htm";
    public static final String[] NAV_URL_MY_FAV;
    public static final String NAV_URL_MY_PRAISE = "http://wapp.m.taobao.com/weapp/myPraise.htm";
    public static final String NAV_URL_MY_WEFAV = "http://wapp.m.taobao.com/weapp/myFavorite.htm";
    public static final String NAV_URL_ORDERQUEUE = "http://h5.m.taobao.com/awp/base/cart.htm#!/awp/core/queue.htm";
    public static final String NAV_URL_ORDER_DETAIL = "http://tm.m.taobao.com/order/order_detail.htm";
    public static final String[] NAV_URL_ORDER_LIST;
    public static final String NAV_URL_ORDER_RATE = "http://h5.m.taobao.com/awp/mtb/rate.htm";
    public static final String NAV_URL_PURCHASE = "http://h5.m.taobao.com/awp/base/buy.htm";
    public static final String NAV_URL_PURCHASE_OLD = "http://h5.m.taobao.com/awp/base/buyold.html";
    public static final String NAV_URL_REFUND_ORDER_LIST = "http://refund.taobao.com/refund/orderlist/refund_order_list.htm";
    public static final String[] NAV_URL_SEARCH_BASE;
    public static final String NAV_URL_SEARCH_HOME = "https://s.m.taobao.com/h5entry";
    public static final String NAV_URL_SETTING = "http://tb.cn/x/sz/";
    public static final String NAV_URL_VIEW_HISTORY = "taobao://viewhistory";
    public static final String NAV_URL_WANGXIN = "http://im.m.taobao.com/ww/wap_ww_my.htm";
    public static final String[] NAV_URL_YOUHAOHUO;
    public static final String[] nav_urls_auction_search;
    public static final String[] nav_urls_detail;
    public static final String[] nav_urls_mytaobao;
    public static final String[] nav_urls_shop;
    public static final String[] nav_urls_shop_search;

    static {
        kge.a(-926362374);
        nav_urls_mytaobao = new String[]{"http://i.taobao.com/my_taobao.htm", "http://h5.m.taobao.com/my/index.htm"};
        nav_urls_detail = new String[]{"http://item.tmall.com/item.htm?id=%s", "http://item.taobao.com/item.htm?id=%s", "http://a.m.tmall.com/i%s.htm", "http://a.m.taobao.com/i%s.htm", "http://a.m.taobao.com/i%s.htm?juid=%s"};
        nav_urls_auction_search = new String[]{"http://s.taobao.com/search?q=%s", "http://s.m.taobao.com/search.htm?q=%s"};
        nav_urls_shop_search = new String[]{"http://shopsearch.taobao.com/search?q=%s", "http://shop.m.taobao.com/shop/shop_search.htm?q=%s"};
        nav_urls_shop = new String[]{ShopConstants.SHOP_URI, "http://shop.m.taobao.com/shop/shop_index.htm?shop_id=%s", "http://shop.m.taobao.com/shop/shop_index.htm?uid=%s"};
        NAV_URL_SEARCH_BASE = new String[]{"http://s.m.taobao.com/search.htm", "http://shop.m.taobao.com/shop/shop_search.htm", "http://m.taobao.com/channel/act/sale/quanbuleimu.html", "http://s.taobao.com/search", "http://shopsearch.taobao.com/search"};
        NAV_URL_DETAIL_BASE = new String[]{"http://a.m.tmall.com/i", "http://a.m.taobao.com/i", "http://h5.m.taobao.com/awp/core/detail.htm", "http://item.tmall.com/item.htm", e.DETAIL_URL_PRE_1, "http://detail.tmall.com/item.htm"};
        NAV_URL_CART_BASE = new String[]{"http://h5.m.taobao.com/awp/base/cart.htm", "http://d.m.taobao.com/my_bag.htm", "http://h5.m.taobao.com/cart/index.htm", "http://cart.taobao.com/my_cart.htm"};
        NAV_URL_MY_FAV = new String[]{"http://h5.m.taobao.com/awp/base/fav.htm", "http://favorite.taobao.com/collect_list.htm", "http://fav.m.taobao.com/my_collect_list.htm", "http://tb.cn/x/scj/"};
        NAV_URL_ORDER_LIST = new String[]{"http://tm.m.taobao.com/list.htm", "http://trade.taobao.com/trade/itemlist/list_bought_items.htm", "http://h5.m.taobao.com/awp/mtb/olist.htm"};
        NAV_URL_YOUHAOHUO = new String[]{"http://h5.m.taobao.com/lanlan/index.html", "http://tb.cn/x/bjq/"};
        NAV_URL_BIG = new String[]{"http://tb.cn/x/big/recommend", "http://tb.cn/x/big/invite", "http://tb.cn/x/big/message", "http://tb.cn/x/big/post"};
    }
}
