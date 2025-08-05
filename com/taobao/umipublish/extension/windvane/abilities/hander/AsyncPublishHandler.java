package com.taobao.umipublish.extension.windvane.abilities.hander;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import tb.bao;
import tb.kge;

/* loaded from: classes9.dex */
public class AsyncPublishHandler extends BaseHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1604547490);
    }

    public AsyncPublishHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        super(jSONObject, jSONObject2, intermediateData);
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        this.b.put("localMediaFiles", (Object) this.d.mDownloadedMediaList);
        this.b.put(bao.CACHE_KEY_TEMPLATE_INFO, (Object) this.d.mTemplateInfo);
        this.b.put("cover", (Object) this.d.mPublishCover);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", (Object) this.b);
        jSONObject2.put("publishParams", (Object) this.c);
        return jSONObject2;
    }
}
