package com.taobao.umipublish.extension.windvane.abilities.hander;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.m;
import com.taobao.android.litecreator.util.u;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import tb.kge;

/* loaded from: classes9.dex */
public class CoverExportHandler extends ExportHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1941469612);
    }

    public static /* synthetic */ Object ipc$super(CoverExportHandler coverExportHandler, String str, Object... objArr) {
        if (str.hashCode() == 1117095592) {
            return super.a((JSONObject) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public CoverExportHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        super(jSONObject, jSONObject2, intermediateData);
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.hander.ExportHandler, com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add("cover");
        JSONObject a2 = super.a(jSONObject);
        a2.put("outputType", (Object) jSONArray);
        return a2;
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.hander.ExportHandler, com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("cover");
        this.d.mPublishCover.path = m.a(jSONObject2, "path", (String) null);
        this.d.mPublishCover.width = Integer.valueOf(m.a(jSONObject2, "width", 0));
        this.d.mPublishCover.height = Integer.valueOf(m.a(jSONObject2, "height", 0));
        this.d.mTemplateClipsCount = m.a(jSONObject.getJSONObject("clips"), "clips_count", 0);
        u.b("CoverExportHandler", "clipsCount out: " + this.d.mTemplateClipsCount);
    }
}
