package com.taobao.umipublish.extension.windvane.abilities.hander;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import tb.kge;

/* loaded from: classes9.dex */
public class InsertContentListTopHandler extends BaseHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1318000350);
    }

    public InsertContentListTopHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        super(jSONObject, jSONObject2, intermediateData);
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("publishResponseData", (Object) jSONObject);
        jSONObject2.put("publishRequestData", (Object) this.d.mPublishRequestParams);
        jSONObject2.put("params", (Object) this.c);
        return jSONObject2;
    }
}
