package com.taobao.alimama.tanx;

/* loaded from: classes4.dex */
public enum TanxArgNames {
    UT_ARGS("utArgs"),
    MONITOR_ARGS("monitorArgs"),
    MACRO_ARGS("macroArgs");
    
    String key;

    TanxArgNames(String str) {
        this.key = str;
    }

    public String getKey() {
        return this.key;
    }
}
