package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class Props2Node extends DetailNode {
    public ArrayList<ImportantProp> importantProps;

    /* loaded from: classes4.dex */
    public static class ImportantProp {
        public String name;
        public String value;

        static {
            kge.a(1051519340);
        }

        public ImportantProp(JSONObject jSONObject) {
            this.name = jSONObject.getString("name");
            this.value = jSONObject.getString("value");
        }
    }

    static {
        kge.a(-565772341);
    }

    public Props2Node(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.Props2Node");
        JSONArray jSONArray = jSONObject.getJSONArray("importantProps");
        if (jSONArray != null) {
            this.importantProps = new ArrayList<>();
            for (int i = 0; i < jSONArray.size(); i++) {
                this.importantProps.add(new ImportantProp(jSONArray.getJSONObject(i)));
            }
        }
    }
}
