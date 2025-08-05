package com.alibaba.security.realidentity.algo.wrapper.entity;

import com.mobile.auth.gatewayauth.ResultCode;

/* loaded from: classes3.dex */
public enum ABJniDetectState {
    DETECT_STATE_DETECTING(0),
    DETECT_STATE_SUC(1),
    DETECT_STATE_FAIL(2);
    
    public static String[] CHINESE_NAME = {"", "通过", ResultCode.MSG_FAILED};
    public int value;

    ABJniDetectState(int i) {
        this.value = i;
    }

    public String getMessage() {
        return CHINESE_NAME[ordinal()];
    }

    public int getValue() {
        return this.value;
    }
}
