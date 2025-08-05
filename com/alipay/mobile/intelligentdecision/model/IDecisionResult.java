package com.alipay.mobile.intelligentdecision.model;

import android.os.Bundle;

/* loaded from: classes3.dex */
public class IDecisionResult {
    public static final String ADDQUEUE_ERROR = "6000";
    public static final String ENGINE_ERROR = "5000";
    public static final String IDECISION_ERROR = "2001";
    public static final String STATE_CLOSED = "closed";
    public static final String STATE_ERROR = "error";
    public static final String STATE_FAIL = "fail";
    public static final String STATE_MONITOR = "monitor";
    public static final String STATE_SUCCESS = "success";
    public String errorCode;
    public String errorMsg;
    public Bundle extra;
    public String needReport;
    public String result;
    public String state;
    public boolean success;
}
