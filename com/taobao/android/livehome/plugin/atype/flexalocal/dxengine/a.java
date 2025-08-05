package com.taobao.android.livehome.plugin.atype.flexalocal.dxengine;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.live.home.dinamic.business.TemplateRequest;
import com.taobao.live.home.dinamic.model.TemplateObject;
import com.taobao.tao.Globals;
import java.util.List;
import tb.kge;
import tb.mfi;

/* loaded from: classes6.dex */
public class a extends TemplateCardListOwner {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f14188a;

    static {
        kge.a(-350795604);
    }

    public a(String str) {
        this.f14188a = str;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.TemplateCardListOwner
    public TemplateRequest a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateRequest) ipChange.ipc$dispatch("5eeb6013", new Object[]{this}) : new TemplateListRequest(this.f14188a);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.TemplateCardListOwner
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

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.TemplateCardListOwner
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : mfi.b(Globals.getApplication(), f.z().getBailoutTemplate());
    }
}
