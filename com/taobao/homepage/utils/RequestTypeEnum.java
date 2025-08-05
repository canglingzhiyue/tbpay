package com.taobao.homepage.utils;

import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.search.common.util.i;

/* loaded from: classes7.dex */
public enum RequestTypeEnum {
    COLD_START(i.b.MEASURE_ONCREATE, "coldStart"),
    HOT_START("fromBackground", com.taobao.android.editionswitcher.b.REFRESH_SOURCE_HOT_START),
    PULL_DOWN(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_PULL_DOWN, com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_PULL_DOWN),
    LOGIN_SUCCESS(com.taobao.android.editionswitcher.b.REFRESH_SOURCE_LOGIN_SUCCESS, com.taobao.android.editionswitcher.b.REFRESH_SOURCE_LOGIN_SUCCESS),
    PAGE_SWITCH("onResume", IMainFeedsLoopStartStopService.a.PAGE_SWITCH),
    URL_START("onNewIntent", "urlStart"),
    PREPARE_PARAMS("prepareParams", "prepareParams"),
    TAB_SELECTED("onTabSelected", "onTabSelected"),
    SWITCH_CONTAINER("switchDataWithContainerId", "switchContainer");
    
    public String behaviorName;
    public String requestName;

    RequestTypeEnum(String str, String str2) {
        this.behaviorName = str;
        this.requestName = str2;
    }
}
