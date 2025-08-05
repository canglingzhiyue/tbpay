package com.alipay.mobile.security.bio.log;

import com.alipay.mobile.common.logging.api.behavor.BehavorID;

/* loaded from: classes3.dex */
public enum BehaviourIdEnum {
    NONE("none"),
    EVENT("event"),
    CLICKED(BehavorID.CLICK),
    OPENPAGE(BehavorID.OPENPAGE),
    LONGCLICKED(BehavorID.LONGCLICK),
    DYNAMICLOADTOCHECK("dynamicLoadToCheck"),
    AUTO_CLICKED("auto_clicked"),
    AUTO_OPENPAGE(BehavorID.AUTOOPENPAGE),
    SUBMITED(BehavorID.SUBMITE),
    BIZLAUNCHED("bizLaunched"),
    ERROR("error"),
    EXCEPTION("exception"),
    SETGESTURE("setGesture"),
    CHECKGESTURE("checkGesture"),
    SLIDED(BehavorID.SLIDE),
    MONITOR("monitor"),
    EXECCOMMAND("execCommand"),
    MONITORPERF("monitorPerf");
    
    private String desc;

    BehaviourIdEnum(String str) {
        this.desc = str;
    }

    public static BehaviourIdEnum convert(String str) {
        BehaviourIdEnum[] values;
        for (BehaviourIdEnum behaviourIdEnum : values()) {
            if (behaviourIdEnum.desc.equals(str)) {
                return behaviourIdEnum;
            }
        }
        return NONE;
    }

    public String getDes() {
        return this.desc;
    }
}
