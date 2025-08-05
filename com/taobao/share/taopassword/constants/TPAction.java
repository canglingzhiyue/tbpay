package com.taobao.share.taopassword.constants;

import com.taobao.share.taopassword.busniess.model.g;

/* loaded from: classes8.dex */
public enum TPAction {
    COPY("copy"),
    SMS("sms"),
    OTHER(g.TAO);
    
    private String type;

    TPAction(String str) {
        this.type = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }
}
