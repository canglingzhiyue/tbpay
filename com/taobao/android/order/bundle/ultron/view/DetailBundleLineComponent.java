package com.taobao.android.order.bundle.ultron.view;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class DetailBundleLineComponent extends DMComponent {
    public static final String COMPONENT_TAG = "orderBundleLine";
    private static final JSONObject JSON_DATA;

    static {
        kge.a(183137742);
        JSON_DATA = JSONObject.parseObject("{\n        \"tag\" : \"orderBundleLine\",\n        \"type\" : \"orderBundleLine\",\n        \"fields\" : {}\n      }");
    }

    public DetailBundleLineComponent() {
        this(JSON_DATA, "native", null, null);
    }

    public DetailBundleLineComponent(JSONObject jSONObject, String str, JSONObject jSONObject2, Map<String, List<com.taobao.android.ultron.common.model.b>> map) {
        super(jSONObject, str, jSONObject2, map);
    }
}
