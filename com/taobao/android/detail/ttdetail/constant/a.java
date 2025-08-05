package com.taobao.android.detail.ttdetail.constant;

import com.alibaba.fastjson.JSONObject;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static final String DESC_INFO = "descInfo";
    public static final String DETAIL_INFO = "header";
    public static final String DIVISION_DESC = "divisionDesc";
    public static final String DIVISION_RATE = "divisionRate";
    public static final String DIVISION_RECOMMEND = "divisionDescRecmd";
    public static final String DX_EVENT_EXTRA_ARGS = "dxEventExtraArgs";
    public static final String FIND_SIMILAR_SOURCE = "detail_mainpic";
    public static final String FIND_SIMILAR_URL_PREFIX = "https://h5.m.taobao.com/tusou/image_editor/index.html";
    public static final String KEY_BROWSER_URL = "myBrowserUrl";
    public static final String KEY_COMPONENT_CREATE_INDEX = "componentCreateIndex";
    public static final String KEY_IS_LIGHT_OFF = "isLightOff";
    public static final String KEY_NAV = "detailRequestId";
    public static final String KEY_NAV_ORIGINAL_HOST = "originalHost";
    public static final String KEY_VIDEO_ID = "videoId";
    public static final String KEY_VIDEO_URL = "videoUrl";
    public static final String KEY_WEBVIEW_ITEMID = "ItemIdForceH5";
    public static final String NAV = "nav";
    public static final String RECOMMEND_INFO = "RecommendInfo";
    public static final String SKU_ACTION_SYNC_DATA = "com.taobao.sku.intent.action.syncData";
    public static final String SKU_ACTION_UPDATE_DATA = "com.taobao.sku.intent.action.updateData";
    public static final String STYLE_DOUBLE_COLUMN = "doubleColumn";
    public static final String STYLE_SINGLE_COLUMN = "singleColumn";
    public static final String UN_KNOW = "unKnow";
    public static final String USE_STREAM_API = "useStreamApi";
    public static final String VALUE_IS_LIGHT_OFF = "true";

    /* renamed from: com.taobao.android.detail.ttdetail.constant.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0407a {
        public static final String INTENT_ACTION_99_CART_UPDATE = "com.taobao.detail.inside.intent.action.cartUpdate";
        public static final String INTENT_ACTION_CLOSE_99_TM_ACTIVITY = "com.taobao.detail.inside.intent.action.closePage";
        public static final String INTENT_EXTRA_DATA = "multiDataFromWV";
        public static final String WV_ACTION_REQUEST_99_CART_UPDATE = "99tmCartUpdate";
        public static final String WV_DATA_REQUEST_99_CART_UPDATE;

        static {
            kge.a(1790538988);
            WV_DATA_REQUEST_99_CART_UPDATE = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.constant.Constants$WVActionData$1
                {
                    put("action", "requestUpdate99tmCart");
                    put("bizName", "insideDetail");
                    put("data", (Object) null);
                }
            }.toJSONString();
        }
    }

    static {
        kge.a(-276439593);
    }
}
