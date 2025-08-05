package com.taobao.live.home.dinamic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.live.home.dinamic.business.TemplateCardListOwner;
import com.taobao.live.home.dinamic.business.TemplateRequest;
import com.taobao.live.home.dinamic.model.TemplateObject;
import com.taobao.tao.Globals;
import java.util.List;
import tb.mfi;

/* loaded from: classes7.dex */
public class d extends TemplateCardListOwner {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.live.home.dinamic.business.TemplateCardListOwner
    public TemplateRequest a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateRequest) ipChange.ipc$dispatch("5eeb6013", new Object[]{this}) : new TemplateListRequest();
    }

    @Override // com.taobao.live.home.dinamic.business.TemplateCardListOwner
    public List<TemplateObject> a(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
            return null;
        }
        try {
            return JSON.parseArray(jSONObject.getString("result"), TemplateObject.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.taobao.live.home.dinamic.business.TemplateCardListOwner
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : mfi.b(Globals.getApplication(), f.z().getBailoutTemplate());
    }
}
