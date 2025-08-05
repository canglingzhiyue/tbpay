package com.taobao.mediaplay;

import com.taobao.media.MediaConstant;

/* loaded from: classes7.dex */
public enum MediaType {
    GIF("DWGif"),
    VIDEO("Video"),
    LIVE(MediaConstant.LBLIVE_SOURCE),
    PIC("Pic");
    
    private String value;

    MediaType(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
