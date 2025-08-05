package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class Props2Node extends DetailNode {
    public static final String TAG = "props2";
    public ArrayList<a> importantProps;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f9988a;
        public String b;

        static {
            kge.a(-633704526);
        }

        public a(JSONObject jSONObject) {
            this.f9988a = jSONObject.getString("name");
            this.b = jSONObject.getString("value");
        }
    }

    static {
        kge.a(-1965401967);
    }

    public Props2Node(JSONObject jSONObject) {
        super(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("importantProps");
        if (jSONArray != null) {
            this.importantProps = new ArrayList<>();
            for (int i = 0; i < jSONArray.size(); i++) {
                this.importantProps.add(new a(jSONArray.getJSONObject(i)));
            }
        }
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.Props2Node");
    }
}
