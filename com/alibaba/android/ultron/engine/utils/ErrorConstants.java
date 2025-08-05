package com.alibaba.android.ultron.engine.utils;

/* loaded from: classes2.dex */
public enum ErrorConstants {
    ULTRON_INSTANCE_NULL("UTR-20001", "Ultron Instance Null"),
    EVENT_NULL("UTR-20100", "Event Null"),
    EVENT_FIELDS_NULL("UTR-20101", "Event Fields Null"),
    EVENT_MTOP_CONFIG_NULL("UTR-20102", "Event Mtop Config Null"),
    TEMPLATE_URL_NULL("UTR-20201", "Template Url Null"),
    TEMPLATE_FETCH_FAILED("UTR-20202", "Template Fetch Failed"),
    TEMPLATE_KEY_NOT_MATCH("UTR-20203", "Template Id and Key not match");
    
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
