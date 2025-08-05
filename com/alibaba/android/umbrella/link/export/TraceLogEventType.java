package com.alibaba.android.umbrella.link.export;

/* loaded from: classes2.dex */
public enum TraceLogEventType {
    COMMON("common", 0),
    CLICK("click", 1),
    NET("net", 2),
    NET_RESPONSE("netResponse", 3),
    ERROR("error", 4);
    
    private String desc;
    private int value;

    TraceLogEventType(String str, int i) {
        this.desc = str;
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
