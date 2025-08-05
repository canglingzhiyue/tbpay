package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class WeAppNode extends DetailNode {
    public static final String TAG = "weappData";
    public Map<String, a> weappList;

    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public Map f10045a;
        public Map b;

        static {
            kge.a(-20578006);
        }

        public a() {
        }
    }

    static {
        kge.a(-275252024);
    }

    public WeAppNode(JSONObject jSONObject) {
        super(jSONObject);
        this.weappList = new HashMap();
        for (String str : jSONObject.keySet()) {
            a aVar = new a();
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                aVar.f10045a = jSONObject2.getJSONObject("params");
                aVar.b = jSONObject2.getJSONObject("mtopModel");
            }
            this.weappList.put(str, aVar);
        }
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.WeAppNode");
    }
}
