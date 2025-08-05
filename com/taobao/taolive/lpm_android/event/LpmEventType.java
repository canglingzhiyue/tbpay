package com.taobao.taolive.lpm_android.event;

import com.alibaba.android.umbrella.link.export.UMLLCons;
import com.alipay.zoloz.toyger.BuildConfig;

/* loaded from: classes8.dex */
public enum LpmEventType {
    USERACTION("UserAction"),
    MESSAGE("Message"),
    MTOP(UMLLCons.FEATURE_TYPE_MTOP),
    ORANGE(BuildConfig.UI_ORANGE),
    AB("AB"),
    MESSAGEUSERACTION("MessageUserAction"),
    VPM("VPM"),
    SYSTEM("System");
    
    private String mName;

    LpmEventType(String str) {
        this.mName = str;
    }

    public String getName() {
        return this.mName;
    }
}
