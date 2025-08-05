package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class WeAppNode extends DetailNode {
    public Map<String, WeAppItem> weappList;

    /* loaded from: classes4.dex */
    public class WeAppItem {
        public Map mtopModel;
        public Map params;

        static {
            kge.a(105438000);
        }

        public WeAppItem() {
        }
    }

    static {
        kge.a(-1061386674);
    }

    public WeAppNode(JSONObject jSONObject) {
        super(jSONObject);
        this.weappList = new HashMap();
        tpc.a("com.taobao.android.detail.sdk.model.node.WeAppNode");
        for (String str : jSONObject.keySet()) {
            WeAppItem weAppItem = new WeAppItem();
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                weAppItem.params = jSONObject2.getJSONObject("params");
                weAppItem.mtopModel = jSONObject2.getJSONObject("mtopModel");
            }
            this.weappList.put(str, weAppItem);
        }
    }
}
