package com.taobao.android.detail.sdk.model.sku;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ExtSkuComponentModel implements Serializable {
    public String caption;
    public Map<String, String> componentExtParams = new HashMap();
    public boolean isComplete;

    static {
        kge.a(815336960);
        kge.a(1028243835);
    }

    public ExtSkuComponentModel() {
        tpc.a("com.taobao.android.detail.sdk.model.sku.ExtSkuComponentModel");
    }
}
