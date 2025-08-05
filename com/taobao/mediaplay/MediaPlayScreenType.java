package com.taobao.mediaplay;

/* loaded from: classes7.dex */
public enum MediaPlayScreenType {
    NORMAL("normal"),
    PORTRAIT_FULL_SCREEN("portrait"),
    LANDSCAPE_FULL_SCREEN("landscape");
    
    private String value;

    MediaPlayScreenType(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
