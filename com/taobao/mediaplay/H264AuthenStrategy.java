package com.taobao.mediaplay;

/* loaded from: classes7.dex */
public enum H264AuthenStrategy {
    WHITLIST("h264WhiteList"),
    BLACKLIST("h264BlackList");
    
    private String value;

    H264AuthenStrategy(String str) {
        this.value = "h264BlackList";
        if (str != null) {
            this.value = str;
        }
    }

    public String getValue() {
        return this.value;
    }
}
