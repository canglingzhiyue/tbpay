package com.taobao.gateway.dispatch;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.alipay.mobile.common.logging.api.LogContext;
import com.taobao.android.editionswitcher.core.b;
import com.taobao.homepage.utils.RequestTypeEnum;
import com.taobao.search.common.util.i;

/* loaded from: classes7.dex */
public enum GatewayRequestType {
    PAGE_BACK("onResume", Constant.KEY_PAGEBACK, 1, 0),
    SCROLL_NEXT_PAGE("scroll", "scrollNextPage", 1, 0),
    AI_REFRESH("scroll", "aiRefresh", 1, 1),
    LOCATION_CHANGE(b.LOCATION_CHANGED, b.LOCATION_CHANGED, 1, 0),
    SECOND_REFRESH("secondRequest", "secondRequest", 1, 0),
    SWITCH_CONTAINER("switchDataWithContainerId", "editionSwitch", 2, 0),
    LOGIN_SUCCESS(com.taobao.android.editionswitcher.b.REFRESH_SOURCE_LOGIN_SUCCESS, LogContext.ENVENT_USERLOGIN, 1, 0),
    COLD_START(i.b.MEASURE_ONCREATE, "coldStart", 1, 0),
    HOT_START("fromBackground", com.taobao.android.editionswitcher.b.REFRESH_SOURCE_HOT_START, 1, 0),
    PULL_DOWN(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_PULL_DOWN, "pullRefresh", 1, 0),
    URL_START("onNewIntent", "preview", 1, 0),
    PAGE_ENTER("pageEnter", "pageEnter", 1, 1),
    PAGE_REFRESH("pageRefresh", "pageRefresh", 1, 1),
    PAGE_ENTER_REMIND_CLICKED("pageEnter", "pageEnter", 2, 2),
    ERROR_RETRY("errorRetry", "errorRetry", 1, 0),
    DATA_DEL("dataDel", "dataDel"),
    DATA_UPDATE("dataUpdate", "dataUpdate"),
    TIP_REPLACE("tipReplace", "tipReplace", 1, 1),
    TIP_REMOVE("tipRemove", "tipRemove", 1, 1),
    TIP_CLOSE("tipClose", "tipClose", 1, 1),
    HOME_TAB_APPEAR("onTabSelected", "homeTabAppear", 1, 0),
    RESPONSE_SUCCESS("responseSuccess", "responseSuccess"),
    RESPONSE_FAILED("responseFailed", "responseFailed"),
    LOAD_CACHE("loadCache", "loadCache"),
    FAST_LOAD_CACHE("fastLoadCache", "fastLoadCache"),
    PREPARE_PARAMS("prepareParams", "prepareParams"),
    INTERNAL_ERROR("internalError", "internalError");
    
    public String behavior;
    public int otherConflictStrategy;
    public int processType;
    public String request;
    public int selfConflictStrategy;

    GatewayRequestType(String str, String str2) {
        this.selfConflictStrategy = -1;
        this.otherConflictStrategy = -1;
        this.behavior = str;
        this.request = str2;
    }

    GatewayRequestType(String str, String str2, int i, int i2) {
        this.selfConflictStrategy = -1;
        this.otherConflictStrategy = -1;
        this.behavior = str;
        this.request = str2;
        this.selfConflictStrategy = i;
        this.otherConflictStrategy = i2;
    }

    public static GatewayRequestType getGatewayRequestType(RequestTypeEnum requestTypeEnum) {
        GatewayRequestType[] values;
        for (GatewayRequestType gatewayRequestType : values()) {
            if (StringUtils.equals(requestTypeEnum.behaviorName, gatewayRequestType.behavior)) {
                return gatewayRequestType;
            }
        }
        return null;
    }
}
