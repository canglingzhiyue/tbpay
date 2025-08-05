package com.taobao.android.detail.datasdk.model.datamodel.sku;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class ExtSkuComponentModel implements Serializable {
    public String caption;
    public Map<String, String> componentExtParams = new HashMap();
    public boolean isComplete;

    static {
        kge.a(689320954);
        kge.a(1028243835);
    }

    public ExtSkuComponentModel() {
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.sku.ExtSkuComponentModel");
    }
}
