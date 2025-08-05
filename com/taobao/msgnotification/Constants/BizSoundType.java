package com.taobao.msgnotification.Constants;

/* loaded from: classes7.dex */
public enum BizSoundType {
    HONGBAO("redpacketcome");
    
    String type;

    BizSoundType(String str) {
        this.type = str;
    }

    public String getType() {
        return this.type;
    }
}
