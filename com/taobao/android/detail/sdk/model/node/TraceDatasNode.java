package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class TraceDatasNode extends DetailNode {
    public Map<String, Map<String, String>> trackData;

    static {
        kge.a(-1228134835);
    }

    public TraceDatasNode(JSONObject jSONObject) {
        super(jSONObject);
        this.trackData = new HashMap();
        tpc.a("com.taobao.android.detail.sdk.model.node.TraceDatasNode");
        for (String str : jSONObject.keySet()) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            if (jSONObject2 != null && jSONObject2.size() != 0) {
                this.trackData.put(str, (Map) JSONObject.toJavaObject(jSONObject2, Map.class));
            }
        }
    }
}
