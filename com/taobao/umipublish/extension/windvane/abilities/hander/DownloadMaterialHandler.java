package com.taobao.umipublish.extension.windvane.abilities.hander;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import tb.kge;

/* loaded from: classes9.dex */
public class DownloadMaterialHandler extends BaseHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1803514938);
    }

    public DownloadMaterialHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        super(jSONObject, jSONObject2, intermediateData);
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        try {
            String string = this.b.getJSONObject(AbilityConst.Server.f23328a).getJSONArray(AbilityConst.Server.b).getJSONObject(0).getString("tid");
            JSONArray jSONArray = new JSONArray();
            jSONArray.add(string);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("materialIds", (Object) jSONArray);
            return jSONObject2;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            this.d.mTemplateInfo = jSONObject.getJSONArray("materialList").getJSONObject(0);
        }
    }
}
