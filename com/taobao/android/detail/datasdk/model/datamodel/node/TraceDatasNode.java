package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class TraceDatasNode extends DetailNode {
    public static final String TAG = "traceDatas";
    public Map<String, Map<String, String>> trackData;

    static {
        kge.a(-992367597);
    }

    public TraceDatasNode(JSONObject jSONObject) {
        super(jSONObject);
        this.trackData = new HashMap();
        for (String str : jSONObject.keySet()) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            if (jSONObject2 != null && jSONObject2.size() != 0) {
                this.trackData.put(str, (Map) JSONObject.toJavaObject(jSONObject2, Map.class));
            }
        }
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.TraceDatasNode");
    }
}
