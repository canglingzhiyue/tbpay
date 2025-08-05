package com.taobao.taolive.message_sdk.core;

import com.alipay.mobile.common.transport.utils.MiscUtils;
import tb.dlv;

/* loaded from: classes8.dex */
public enum LiveMessageStatus {
    error("error"),
    unSubscribe(dlv.API_UNSUBSCRIBE),
    running(MiscUtils.KEY_RUNNING),
    stop("stop");
    
    String dec;

    LiveMessageStatus(String str) {
        this.dec = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.dec;
    }
}
