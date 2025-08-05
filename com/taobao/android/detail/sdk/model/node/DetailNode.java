package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class DetailNode implements Serializable {
    public JSONObject root;

    static {
        kge.a(-1016769574);
        kge.a(1028243835);
    }

    public DetailNode(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.root = jSONObject;
            return;
        }
        throw new IllegalArgumentException();
    }

    public DetailNode() {
    }
}
