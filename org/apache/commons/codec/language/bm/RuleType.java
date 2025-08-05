package org.apache.commons.codec.language.bm;

import com.alipay.android.msp.constants.MspGlobalDefine;
import com.etao.feimagesearch.mnn.decode.a;

/* loaded from: classes9.dex */
public enum RuleType {
    APPROX("approx"),
    EXACT(a.EXACT_STRATEGY),
    RULES(MspGlobalDefine.RULES);
    
    private final String name;

    RuleType(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
