package com.alibaba.security.ccrc.enums;

/* loaded from: classes3.dex */
public enum Mode {
    LOCAL(1, "端处置模式"),
    DEFAULT(2, "端云模式");
    
    public int code;
    public String desc;

    Mode(int i, String str) {
        this.code = i;
        this.desc = str;
    }

    public static Mode get(int i) {
        Mode mode = LOCAL;
        return i == mode.code ? mode : DEFAULT;
    }
}
