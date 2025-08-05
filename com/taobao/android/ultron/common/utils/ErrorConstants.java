package com.taobao.android.ultron.common.utils;

/* loaded from: classes6.dex */
public enum ErrorConstants {
    CONTEXT_NULL("UTR-10001", "DMContext is Null"),
    RESPONSE_JSON_EMPTY("UTR-10100", "Response JSON Empty"),
    PROTOCOL_ROOT_KEY_EMPTY("UTR-10101", "Protocol root key Empty"),
    PROTOCOL_DATA_EMPTY("UTR-10102", "Protocol data node Empty"),
    PROTOCOL_HIERARCHY_EMPTY("UTR-10103", "Protocol hierarchy node Empty"),
    PARSE_COMPONENT_LIST_EMPTY("UTR-10104", "Parse Components List Empty"),
    PARSE_DELTA_TARGET_NULL("UTR-10105", "Parse Delta Target Null"),
    PARSE_DELTA_PARENT_NULL("UTR-10106", "Parse Delta Target Parent Null"),
    SUBMIT_COMPONENT_MAP_NULL("UTR-10107", "Component map Null");
    
    private String errorCode;
    private String errorMsg;

    ErrorConstants(String str, String str2) {
        this.errorCode = str;
        this.errorMsg = str2;
    }

    public String errorCode() {
        return this.errorCode;
    }

    public String errorMessage() {
        return this.errorMsg;
    }
}
