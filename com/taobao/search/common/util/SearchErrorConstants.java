package com.taobao.search.common.util;

import mtopsdk.mtop.util.ErrorConstant;
import tb.fjp;

/* loaded from: classes7.dex */
public enum SearchErrorConstants {
    CODE_NULL_DEFAULT(com.taobao.android.litecreator.comprehension.f.CUSTOM_ERROR_CODE, "ERRORINFO_IS_NULL"),
    CODE_SUCCESS("SUCCESS", "SUCCESS"),
    CODE_RESULT_EMPTY("10001", "EMPTY_RES"),
    CODE_SYSTEM_JSON("20001", "JSON_WRONG_FORMAT"),
    CODE_SYSTEM_PARSE_BEAN("20002", "PARSE_BEAN_ERROR"),
    CODE_NETWORK_MTOP(fjp.ERROR_CODE_CONTROL_SCROLL, "MTOP_NETWORK_ERROR"),
    CODE_NETWORK_WSEARCH("40001", "WSEARCH_NETWORK_ERROR"),
    CODE_NETWORK_MTOP_REQUEST(fjp.ERROR_CODE_IMAGE_URL_IS_NULL, "REQUEST_MTOP_ERROR"),
    ANDROID_SYS_NETWORK_ERROR("31002", "ANDROID_SYS_NETWORK_ERROR"),
    ANDROID_SYS_JSONDATA_BLANK("31003", ErrorConstant.ERRCODE_JSONDATA_BLANK),
    ANDROID_SYS_JSONDATA_PARSE_ERR("31004", ErrorConstant.ERRCODE_JSONDATA_PARSE_ERROR),
    CODE_NETWORK_WSEARCH_REQUEST("41001", "REQUEST_WSEARCH_ERROR");
    
    public String errorCode;
    public String errorMsg;

    SearchErrorConstants(String str, String str2) {
        this.errorCode = str;
        this.errorMsg = str2;
    }
}
