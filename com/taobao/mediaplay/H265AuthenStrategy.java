package com.taobao.mediaplay;

/* loaded from: classes7.dex */
public enum H265AuthenStrategy {
    WHITLIST("h265WhiteList"),
    BLACKLIST("h265BlackList");
    
    private String value;

    H265AuthenStrategy(String str) {
        this.value = "h265BlackList";
        if (str != null) {
            this.value = str;
        }
    }

    public String getValue() {
        return this.value;
    }
}
