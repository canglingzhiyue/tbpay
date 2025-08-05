package com.taobao.android.detail.sdk.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.detail.biz.adapter.UTAdapter;
import com.taobao.tao.detail.biz.api5.common.AsynApiTask;
import java.util.HashMap;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG3_BIZ_ERROR = "BIZ_ERR";
    public static final String ARG3_BIZ_WARN = "BIZ_WARN";
    public static final String ARG3_ENV_ERROR = "ENV_ERR";
    public static final String DETAIL_API_ERROR = "detail_api_error";
    public static final String DETAIL_API_TIME = "detail_api_time";
    public static final String DETAIL_BUY_NOT_SUPPORT = "detail_buy_not_support";
    public static final String DETAIL_CART_NOT_SUPPORT = "detail_cart_not_support";
    public static final String DETAIL_DATA_INVALID = "detail_data_invalid";
    public static final String DETAIL_FEATURE_NOT_SUPPORT = "detail_feature_not_support";
    public static final String DETAIL_GO_H5 = "detail_go_h5";
    public static final String DETAIL_HYBRID_SKU = "detail_hybrid_sku";
    public static final String DETAIL_MAIN_RATE_EMPTY = "detail_main_rate_empty";
    public static final String DETAIL_NO_SELLPOINT = "detail_title_empty";
    public static final String DETAIL_RATE_LIST_EMPTY = "detail_rate_empty";
    public static final int EVENT_ID_COUNT = 30001;
    public static final String EVENT_ID_REMOTE_DEBUG = "detail_remote_debug";
    public static final int EVENT_ID_TIME = 21034;
    public static final String PAGE_NAME = "Page_Detail";

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, String[]> f10341a;

    static {
        kge.a(2114692427);
        HashMap<String, String[]> hashMap = new HashMap<>();
        f10341a = hashMap;
        hashMap.put(DETAIL_GO_H5, new String[]{"DETAIL_NOT_NATIVE", DETAIL_GO_H5, ARG3_BIZ_WARN});
        f10341a.put(DETAIL_FEATURE_NOT_SUPPORT, new String[]{"DETAIL_NOT_NATIVE", DETAIL_FEATURE_NOT_SUPPORT, ARG3_BIZ_WARN});
        f10341a.put(DETAIL_HYBRID_SKU, new String[]{"DETAIL_NOT_NATIVE", DETAIL_HYBRID_SKU, ARG3_BIZ_WARN});
        f10341a.put(DETAIL_DATA_INVALID, new String[]{"DETAIL_DATA_CHECK", DETAIL_DATA_INVALID, ARG3_BIZ_ERROR});
        f10341a.put(DETAIL_MAIN_RATE_EMPTY, new String[]{"DETAIL_DATA_CHECK", DETAIL_MAIN_RATE_EMPTY, ARG3_BIZ_WARN});
        f10341a.put(DETAIL_RATE_LIST_EMPTY, new String[]{"DETAIL_DATA_CHECK", DETAIL_RATE_LIST_EMPTY, ARG3_BIZ_WARN});
        f10341a.put(DETAIL_NO_SELLPOINT, new String[]{"DETAIL_DATA_CHECK", DETAIL_NO_SELLPOINT, ARG3_BIZ_WARN});
        f10341a.put(DETAIL_BUY_NOT_SUPPORT, new String[]{"DETAIL_TRADE_CHECK", DETAIL_BUY_NOT_SUPPORT, ARG3_BIZ_WARN});
        f10341a.put(DETAIL_CART_NOT_SUPPORT, new String[]{"DETAIL_TRADE_CHECK", DETAIL_CART_NOT_SUPPORT, ARG3_BIZ_WARN});
        f10341a.put(DETAIL_API_ERROR, new String[]{"DETAIL_API", DETAIL_API_ERROR, "ENV_ERR"});
        tpc.a("com.taobao.android.detail.sdk.utils.DetailMonitor");
    }

    public static void a(AsynApiTask.MtopResponseWrapper mtopResponseWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3689205", new Object[]{mtopResponseWrapper});
        } else {
            UTAdapter.a("Page_Detail", EVENT_ID_REMOTE_DEBUG, mtopResponseWrapper);
        }
    }
}
