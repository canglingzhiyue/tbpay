package com.taobao.android.order.bundle.constants;

import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes6.dex */
public class CoreConstants {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ABILITY_PARAM_KEY_KEY = "key";
    public static final String ABILITY_PARAM_KEY_VALUE = "value";
    public static final String ALIPAY_PAY_RESULT_FAILED_ACTION = "com.alipay.android.app.pay.ACTION_PAY_FAILED";
    public static final String ALIPAY_PAY_RESULT_SUCESS_ACTION = "com.alipay.android.app.pay.ACTION_PAY_SUCCESS";
    public static final String API_NAME_DETAIL = "mtop.taobao.query.detail";
    public static final String API_NAME_DETAIL_V2 = "mtop.taobao.order.query.detailV2";
    public static final String API_NAME_LIST = "mtop.taobao.order.queryboughtlist";
    public static final String API_NAME_LIST_V2 = "mtop.taobao.order.queryboughtlistV2";
    public static final String BATCH_CONFIRM_GOOD_ONLINE_ORDER_IDS = "batchConfirmGoodOnlineOrderIds";
    public static final String CODE_DOWN_GRADE_H5 = "ReturnH5";
    public static final String CONDITION = "condition";
    public static final String DEFAULT_TAB_INFO = "[{\"title\":\"%s\",\"isSelected\":\"true\",\"tabCode\":\"all\"},{\"title\":\"%s\",\"isSelected\":\"false\",\"tabCode\":\"waitPay\"},{\"title\":\"%s\",\"isSelected\":\"false\",\"tabCode\":\"waitSend\"},{\"title\":\"%s\",\"isSelected\":\"false\",\"tabCode\":\"waitConfirm\"},{\"title\":\"%s\",\"isSelected\":\"false\",\"tabCode\":\"reFund\"},{\"title\":\"%s\",\"isSelected\":\"false\",\"tabCode\":\"waitRate\"}]";
    public static final String DETAIL_DOWNGRADE_OPEN = "oDetail_MtopError_StayV2";
    public static final String DOWNGRADE_TYPE = "downgradeType";
    public static final String DOWNGRADLE_V2TOV1 = "ReturnV1";
    public static final String DOWNGRADLE_V2TOV1_NONE_FIRST = "ReturnV1_NonFirst";
    public static final String FROM_ORDER_LIST = "isFromOrderList";
    public static final String IN_FROM = "from";
    public static final String IN_PAGE_FROM = "pageFrom";
    public static final String IN_PARAMS_DETAILCLICK = "detailClickTime";
    public static final String IN_PARAMS_EXT = "exParams";
    public static final String IN_PARAMS_ORDER_CODE = "orderCode";
    public static final String IN_PARAMS_PAGE_FROM = "pageFrom";
    public static final String IN_PARAMS_PRESELL = "presellFilter";
    public static final String IN_PARAMS_SCROLL_COMPONENT_KEY = "scrollComponentKey";
    public static final String IN_PARAMS_SELECT_INDEX = "selectIndex";
    public static final String IN_PARAMS_VIEW_LOGISTICS = "viewLogisticDetail";
    public static final String IN_PARAM_ARCHIVE = "archive";
    public static final String IN_PARAM_BIZ_ORDER_ID = "bizOrderId";
    public static final String IN_PARAM_IS_ARCHIVE_ORDER = "isArchivedOrder";
    public static final String IN_PARAM_ORDERID_1 = "orderID";
    public static final String IN_PARAM_ORDER_ID = "orderId";
    public static final String IN_PARAM_ORDER_LIST_TYPE = "tabCode";
    public static final String IN_PARAM_ORDER_SEARCH_ID = "searchId";
    public static final String IN_PARAM_ORDER_SEARCH_KEY = "searchKey";
    public static final String IN_PARAM_PAY_ORDER_ID = "payOrderId";
    public static final String IN_PARAM_SERVER_V2 = "serverV2";
    public static final String IN_PARAM_SOURCE = "source";
    public static final String JS_TRACKER_ORDER_LIST_NOT_DOWNGRADE_H5 = "notDowngradeToH5";
    public static final String KEY_PAGE_CONTEXT = "pageContext";
    public static final String LIST_DOWNGRADE_OPEN = "oList_MtopError_StayV2";
    public static final String LOAD_FINISH;
    public static final String MARQUEE_SCROLL_ANIM = "marqueeScrollAnim";
    public static final String MTOP_BIZ_DOPAY_ERROR_CODE = "NoAlipayUserError";
    public static final String NAV_TAG = "OrderNAV";
    public static final String ORDER_AFTER_PURCHASE_COMMERCIAL_RECOMMEND = "afterPurchaseCommercialRecommend";
    public static final String ORDER_APP_NAME_KEY = "orderAppName";
    public static final String ORDER_APP_V_KEY = "orderAppVersion";
    public static final String ORDER_DEGRADE_KEY = "order";
    public static final String ORDER_LIST_FILTER = "OrderListFilter";
    public static final String ORDER_LIST_RECOMMEND = "isShowRecommend";
    public static final String ORDER_VESSEL_WV_KEY = "TBWebOrder";
    public static final String ORDER_WV_KEY = "TBRefreshOrder";
    public static final String ORDER_WV_KEY_WEEX2_MODULE = "TBRegisterWeex2Module";
    public static final String ORDER_WV_TB_ODER = "PWVTBOrder";
    public static final String PRESETRES_KEY = "presetRes";
    public static final String QUERY_PARAM_KEY_CONDITION = "orderQueryParamCondition";
    public static final int REQUEST_CODE_NOTIFICATION_SETTING = 1001;
    public static final String SEARCH_LIST_URI = "http://taobao.com/order_search_result.htm";
    public static final String USER_ORDER_TYPE = "userOrderType";
    public static final String USE_V2 = "useV2";
    public static final String UT_ORDER_LIST_SPM_CNT = "a2141.7631731.0.0";
    public static final String V2_TO_V1_DOWNGRADE_TYPE = "downgradeType";
    public static final String VERSION_DETAIL = "1.0";
    public static final String VERSION_LIST = "1.0";

    /* renamed from: a  reason: collision with root package name */
    public static String f14539a;

    /* loaded from: classes6.dex */
    public enum OrderListType {
        WAIT_TO_PAY,
        WAIT_TO_SHIPMENTS,
        WAIT_TO_CONFIRM,
        REFUNDING_ORDERS,
        WAIT_TO_EVALUATE,
        TOTAL_ORDERS,
        ALLSPAEK_SENDFINISHED_ORDERS,
        REFUND
    }

    static {
        kge.a(337978679);
        f14539a = "TBOrder";
        LOAD_FINISH = b.a(R.string.order_biz_load_completed);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : String.format(DEFAULT_TAB_INFO, b.a(R.string.order_biz_tab_all), b.a(R.string.order_biz_tab_to_pay), b.a(R.string.order_biz_tab_to_ship), b.a(R.string.order_biz_tab_to_receive), b.a(R.string.order_biz_tab_refund), b.a(R.string.order_biz_tab_to_rate));
    }
}
