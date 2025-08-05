package com.taobao.umipublish.extension.windvane.abilities.hander;

import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.m;
import com.taobao.taobao.R;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import tb.kge;

/* loaded from: classes9.dex */
public class KFCHandler extends BaseHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-527330153);
    }

    public KFCHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        super(jSONObject, jSONObject2, intermediateData);
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        String a2 = m.a("", this.b, AbilityConst.Server.f23328a, AbilityConst.Server.g, AbilityConst.Server.h);
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(a2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(b.a(R.string.gg_pub_title), (Object) jSONArray);
        return jSONObject2;
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public boolean c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{this, jSONObject})).booleanValue();
        }
        if (m.a(jSONObject, "state", 0) != 1) {
            String str = "";
            String a2 = m.a(str, this.b, AbilityConst.Server.f23328a, AbilityConst.Server.g, AbilityConst.Server.h);
            if (jSONObject != null) {
                str = jSONObject.toJSONString();
            }
            UmiPublishMonitor.a().b("3001", a2, "quick_publish_kfc_error", str);
        }
        return m.a(jSONObject, "state", 0) != 1;
    }
}
