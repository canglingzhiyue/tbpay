package com.taobao.avplayer;

/* loaded from: classes6.dex */
public enum DWInstanceType {
    GIF("DWGif"),
    VIDEO("DWVideo"),
    PIC("DWPic");
    
    private String value;

    DWInstanceType(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
