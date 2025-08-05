package com.taobao.android.order.core.component;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.ultron.common.model.b;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class EmptyComponent extends DMComponent {
    public static final String COMPONENT_TAG = "empty_holder";
    private static final JSONObject JSON_DATA;

    static {
        kge.a(-1535555746);
        JSON_DATA = JSONObject.parseObject("{\n        \"tag\" : \"empty_holder\",\n        \"type\" : \"empty_holder\",\n        \"fields\" : {}\n      }");
    }

    public EmptyComponent() {
        this(JSON_DATA, "native", null, null);
    }

    public EmptyComponent(JSONObject jSONObject, String str, JSONObject jSONObject2, Map<String, List<b>> map) {
        super(jSONObject, str, jSONObject2, map);
    }
}
