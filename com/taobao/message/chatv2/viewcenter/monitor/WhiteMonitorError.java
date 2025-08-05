package com.taobao.message.chatv2.viewcenter.monitor;

import tb.kge;

/* loaded from: classes7.dex */
public class WhiteMonitorError {
    public int errCode;
    public String errMsg;
    public String widget;

    static {
        kge.a(-1493642835);
    }

    public WhiteMonitorError(String str, int i, String str2) {
        this.widget = str;
        this.errCode = i;
        this.errMsg = str2;
    }
}
