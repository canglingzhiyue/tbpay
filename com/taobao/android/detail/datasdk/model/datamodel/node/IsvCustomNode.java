package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import tb.emu;
import tb.kge;
import tb.qpy;

/* loaded from: classes4.dex */
public class IsvCustomNode extends DetailNode {
    public a tradeBefor;

    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public String f9968a;
        public JSONObject b;

        static {
            kge.a(-1119714892);
        }

        public a(JSONObject jSONObject) {
            this.f9968a = jSONObject.getString(qpy.PLUGIN_ID);
            this.b = jSONObject.getJSONObject("params");
        }
    }

    static {
        kge.a(2113217778);
    }

    public IsvCustomNode(JSONObject jSONObject) {
        super(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("tradeBefor");
        if (jSONObject2 == null) {
            return;
        }
        this.tradeBefor = new a(jSONObject2);
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.IsvCustomNode");
    }
}
