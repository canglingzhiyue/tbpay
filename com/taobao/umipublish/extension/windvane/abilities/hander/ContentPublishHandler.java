package com.taobao.umipublish.extension.windvane.abilities.hander;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.m;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import com.taobao.umipublish.extension.windvane.abilities.bean.Request;
import tb.kge;
import tb.rhs;
import tb.tel;

/* loaded from: classes9.dex */
public class ContentPublishHandler extends BaseHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(126902303);
    }

    public static /* synthetic */ Object ipc$super(ContentPublishHandler contentPublishHandler, String str, Object... objArr) {
        if (str.hashCode() == 1673107495) {
            super.b((JSONObject) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ContentPublishHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        super(jSONObject, jSONObject2, intermediateData);
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        Request request = new Request();
        request.data.richTitle = m.b(this.b, AbilityConst.Server.f23328a, AbilityConst.Server.g);
        request.data.title = tel.a(this.b);
        request.data.media.add(this.d.mPublishVideo);
        request.data.media.add(this.d.mPublishCover);
        JSONObject b = m.b(this.b, AbilityConst.Server.f23328a, AbilityConst.Server.j);
        if (b != null) {
            request.data.topics.add(b);
        }
        JSONArray a2 = m.a(this.b, AbilityConst.Server.k);
        if (a2 != null) {
            request.data.item.addAll(a2);
        }
        JSONObject jSONObject2 = new JSONObject();
        this.d.mPublishRequestParams = (JSONObject) JSON.toJSON(request);
        jSONObject2.put("request", (Object) this.d.mPublishRequestParams);
        jSONObject2.put("params", (Object) this.c);
        return jSONObject2;
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        super.b(jSONObject);
        d(jSONObject);
    }

    private void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            String e = e(jSONObject);
            if (StringUtils.isEmpty(e)) {
                return;
            }
            rhs.a(this.c, e);
        }
    }

    private String e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb19cf1c", new Object[]{this, jSONObject}) : jSONObject.getString("contentId");
    }
}
