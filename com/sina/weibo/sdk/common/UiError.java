package com.sina.weibo.sdk.common;

import tb.kge;

/* loaded from: classes4.dex */
public class UiError {
    public int errorCode;
    public String errorDetail;
    public String errorMessage;

    static {
        kge.a(1223636804);
    }

    public UiError(int i, String str, String str2) {
        this.errorCode = i;
        this.errorMessage = str;
        this.errorDetail = str2;
    }
}
