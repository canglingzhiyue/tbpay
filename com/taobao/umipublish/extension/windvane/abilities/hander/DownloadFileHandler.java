package com.taobao.umipublish.extension.windvane.abilities.hander;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.at;
import com.taobao.android.litecreator.util.m;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import com.taobao.weex.common.Constants;
import tb.keu;
import tb.kge;

/* loaded from: classes9.dex */
public class DownloadFileHandler extends BaseHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f23353a;

    static {
        kge.a(-1521800367);
    }

    public DownloadFileHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        super(jSONObject, jSONObject2, intermediateData);
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONArray a2 = m.a(this.b, AbilityConst.Server.c, AbilityConst.Server.d);
        if (a2 == null || a2.size() == 0) {
            return null;
        }
        this.f23353a = at.a(m.a("", this.b, AbilityConst.Server.c, "minReqNum"), a2.size());
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("downloadList", (Object) jSONArray);
        for (int i = 0; i < a2.size(); i++) {
            JSONObject jSONObject3 = a2.getJSONObject(i);
            String a3 = m.a(jSONObject3, "type", "");
            String str = TextUtils.equals("video", a3) ? "video" : "image";
            String str2 = TextUtils.equals("video", a3) ? keu.SUFFIX_MP4 : ".jpg";
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("url", (Object) m.a(jSONObject3, "url", ""));
            jSONObject4.put("type", (Object) str);
            jSONObject4.put(Constants.Name.SUFFIX, (Object) str2);
            jSONObject4.put("optional", (Object) m.a(jSONObject3, "optional", "true"));
            jSONArray.add(jSONObject4);
        }
        return jSONObject2;
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("fileList");
        if (jSONArray == null) {
            return;
        }
        this.d.mDownloadedMediaList.addAll(jSONArray);
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public boolean c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{this, jSONObject})).booleanValue();
        }
        JSONArray jSONArray = jSONObject.getJSONArray("fileList");
        return jSONArray == null || jSONArray.size() < this.f23353a;
    }
}
