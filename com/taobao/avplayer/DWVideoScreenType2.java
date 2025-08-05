package com.taobao.avplayer;

/* loaded from: classes6.dex */
public enum DWVideoScreenType2 {
    LANDSCAPE_FULL_SCREEN_90("landscape90"),
    LANDSCAPE_FULL_SCREEN_270("landscape270"),
    NORMAL("normal"),
    PORTRAIT_FULL_SCREEN("portrait");
    
    private String value;

    DWVideoScreenType2(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
