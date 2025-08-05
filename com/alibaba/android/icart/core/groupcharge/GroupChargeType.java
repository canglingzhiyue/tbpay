package com.alibaba.android.icart.core.groupcharge;

import com.taobao.taobao.R;

/* loaded from: classes2.dex */
public enum GroupChargeType {
    BC("B&C", com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21680), 0),
    SM("SM", com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21667), 1),
    HK("HK", com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21644), 2),
    HKDF("HKDF", com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21664), 3),
    YY("YY", com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21656), 4),
    ALITRIP("ALITRIP", com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21675), 5);
    
    private String code;
    private int priority;
    private String title;

    GroupChargeType(String str, String str2, int i) {
        this.code = str;
        this.title = str2;
        this.priority = i;
    }

    public String getCode() {
        return this.code;
    }

    public int getPriority() {
        return this.priority;
    }

    public String getTitle() {
        return this.title;
    }
}
