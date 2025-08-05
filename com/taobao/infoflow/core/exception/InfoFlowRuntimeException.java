package com.taobao.infoflow.core.exception;

import tb.kge;
import tb.ldf;

/* loaded from: classes7.dex */
public class InfoFlowRuntimeException extends RuntimeException {
    private static final String TAG = "InfoFlowRuntimeException";

    static {
        kge.a(-1992071997);
    }

    public InfoFlowRuntimeException(String str) {
        super(str);
        ldf.d(TAG, "InfoFlowRuntimeException : " + str);
    }
}
