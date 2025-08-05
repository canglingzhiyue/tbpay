package com.taobao.avplayer;

/* loaded from: classes6.dex */
public enum DWVideoScreenType {
    NORMAL("normal"),
    PORTRAIT_FULL_SCREEN("portrait"),
    LANDSCAPE_FULL_SCREEN("landscape");
    
    private String value;

    DWVideoScreenType(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
