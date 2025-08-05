package com.alipay.mobile.verifyidentity.log;

import com.alipay.mobile.common.logging.api.behavor.BehavorID;

/* loaded from: classes3.dex */
public enum BehaviourIdEnum {
    NONE("none"),
    EVENT("event"),
    CLICKED(BehavorID.CLICK),
    OPENPAGE(BehavorID.OPENPAGE);
    
    private String desc;

    BehaviourIdEnum(String str) {
        this.desc = str;
    }

    public final String getDes() {
        return this.desc;
    }
}
