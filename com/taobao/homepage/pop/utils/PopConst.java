package com.taobao.homepage.pop.utils;

import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes7.dex */
public interface PopConst {
    public static final String BIZ_PARAM = "bizParam";
    public static final String BRIDGE_KEY_BIZ_PARAMS = "bizParams";
    public static final String BRIDGE_KEY_BUSINESS_ID = "businessID";
    public static final String BRIDGE_KEY_EVENT_TYPE = "eventType";
    public static final String COLD_START_REQUEST_TYPE = "coldStart";
    public static final int DX_POP_USER_CONTEXT_TAG = R.id.tag_homepage_pop_user_context;
    public static final String LOG_TAG_HOME_POP = "homePop";
    public static final String POP_BIZ_PARAMS_KEY = "homePagePopResult";
    public static final String POP_CLIENT_PARAMS_KEY = "clientParams";
    public static final String POP_EVENT_ID_KEY = "eventID";
    public static final String POP_EXT_BUSINESS_ID = "businessId";
    public static final String POP_KEY_CLIENT_CACHE = "clientCache";
    public static final String POP_KEY_TAG_IDS = "tagIds";
    public static final String POP_MESSAGE_ID_KEY = "messageId";
    public static final String POP_UPLOAD_DATA_KEY = "uploadData";
    public static final String STATIC_KEY_ICON_SCROLL_OFFSET = "iconScrollOffsetX";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface PopDXScrollEvent {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface PopRequestType {
    }
}
