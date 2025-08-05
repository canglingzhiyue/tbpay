package com.alibaba.wireless.aliprivacyext.recommendation;

import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;

/* loaded from: classes3.dex */
public enum e {
    INVALID(FactoryType.TYPE_INVALID),
    NO_UID("noUid"),
    OPEN("open"),
    CLOSE("close");
    
    private final String status;

    e(String str) {
        this.status = str;
    }

    public boolean getRecommendSwitchBooleanStatus() {
        return this != CLOSE;
    }

    public String getStatus() {
        return this.status;
    }

    @Override // java.lang.Enum
    public String toString() {
        return getStatus();
    }
}
