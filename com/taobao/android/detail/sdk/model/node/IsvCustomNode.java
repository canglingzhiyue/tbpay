package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import tb.kge;
import tb.qpy;
import tb.tpc;

/* loaded from: classes4.dex */
public class IsvCustomNode extends DetailNode {
    public TradeBefor tradeBefor;

    /* loaded from: classes4.dex */
    public class TradeBefor {
        public JSONObject params;
        public String pluginId;

        static {
            kge.a(565508974);
        }

        public TradeBefor(JSONObject jSONObject) {
            this.pluginId = jSONObject.getString(qpy.PLUGIN_ID);
            this.params = jSONObject.getJSONObject("params");
        }
    }

    static {
        kge.a(-1358070920);
    }

    public IsvCustomNode(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.IsvCustomNode");
        JSONObject jSONObject2 = jSONObject.getJSONObject("tradeBefor");
        if (jSONObject2 == null) {
            return;
        }
        this.tradeBefor = new TradeBefor(jSONObject2);
    }
}
