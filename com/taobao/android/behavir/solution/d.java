package com.taobao.android.behavir.solution;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.testutils.log.LogUtils;
import java.util.List;
import java.util.Map;
import tb.dqi;
import tb.hjs;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class d extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "rerank";

    static {
        kge.a(484135405);
    }

    public abstract void a(dqi dqiVar, List<JSONObject> list);

    @Override // com.taobao.android.behavir.solution.b
    public final void a(dqi dqiVar, Map<String, Object> map) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b870029", new Object[]{this, dqiVar, map});
            return;
        }
        try {
            jSONObject = JSON.parseObject((String) map.get("result"));
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        if (jSONObject == null) {
            LogUtils.a("", "BHRReRankSolution", "resultJSON null");
            return;
        }
        boolean booleanValue = jSONObject.getBooleanValue("shouldReRank");
        if (booleanValue) {
            a(dqiVar, JSON.parseArray((String) jSONObject.get(hjs.UNDER_TAKE_GOODS_LIST), JSONObject.class));
            return;
        }
        String str = "model shouldReRank is " + booleanValue;
        g gVar = new g();
        gVar.b(str);
        gVar.a(str);
        gVar.a(jSONObject);
        a(dqiVar, gVar);
    }
}
