package com.taobao.umipublish.extension.windvane.abilities.hander;

import com.alibaba.fastjson.JSONObject;
import com.taobao.umipublish.extension.windvane.abilities.AbilityChain;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import tb.kge;

/* loaded from: classes9.dex */
public class BaseHandler extends AbilityChain.InputAndOutputHandler {
    public JSONObject b;
    public JSONObject c;
    public IntermediateData d;

    static {
        kge.a(176890116);
    }

    public BaseHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        this.b = jSONObject;
        this.c = jSONObject2;
        this.d = intermediateData;
    }
}
