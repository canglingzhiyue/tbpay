package com.taobao.umipublish.extension.windvane.abilities.hander;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.m;
import com.taobao.android.litecreator.util.u;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import tb.bao;
import tb.kge;

/* loaded from: classes9.dex */
public class ExportHandler extends BaseHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(112662529);
    }

    public ExportHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        super(jSONObject, jSONObject2, intermediateData);
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = this.b.getJSONObject(AbilityConst.Server.f23328a);
        JSONObject jSONObject3 = jSONObject2.getJSONObject(AbilityConst.Server.e);
        if (this.d.mTemplateInfo != null && jSONObject3 != null) {
            this.d.mTemplateInfo.put(AbilityConst.Server.e, (Object) jSONObject3);
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add("video");
        jSONArray.add("cover");
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("templateType", (Object) "video");
        jSONObject4.put("outputType", (Object) jSONArray);
        jSONObject4.put("materialList", (Object) this.d.mDownloadedMediaList);
        jSONObject4.put(bao.CACHE_KEY_TEMPLATE_INFO, (Object) this.d.mTemplateInfo);
        jSONObject4.put(AbilityConst.Server.f, (Object) jSONObject2.getJSONObject(AbilityConst.Server.f));
        return jSONObject4;
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("video");
        JSONObject jSONObject3 = jSONObject2 != null ? jSONObject2.getJSONObject("cover") : null;
        this.d.mPublishVideo.path = m.a("", jSONObject2, "path");
        this.d.mPublishCover.path = m.a("", jSONObject3, "path");
        this.d.mPublishCover.width = Integer.valueOf(m.a(jSONObject3, "width", 0));
        this.d.mPublishCover.height = Integer.valueOf(m.a(jSONObject3, "height", 0));
        this.d.mTemplateClipsCount = m.a(jSONObject.getJSONObject("clips"), "clips_count", 0);
        u.b("ExportHandler", "clipsCount out: " + this.d.mTemplateClipsCount);
    }
}
