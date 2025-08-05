package com.alibaba.android.ultron.vfw.viewholder;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class BundleLineComponent extends DMComponent {
    public static final String COMPONENT_TAG = "bundleLine";
    private static final JSONObject JSON_DATA;

    static {
        kge.a(1371314187);
        JSON_DATA = JSONObject.parseObject("{\n        \"tag\" : \"bundleLine\",\n        \"type\" : \"bundleLine\",\n        \"fields\" : {}\n      }");
    }

    public BundleLineComponent() {
        this(JSON_DATA, "native", null, null);
    }

    public BundleLineComponent(JSONObject jSONObject, String str, JSONObject jSONObject2, Map<String, List<com.taobao.android.ultron.common.model.b>> map) {
        super(jSONObject, str, jSONObject2, map);
    }
}
