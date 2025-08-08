package com.taobao.android.detail.sdk.vmodel.desc;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ActionModel;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.vmodel.main.MainViewModel;
import java.util.ArrayList;
import java.util.Map;
import tb.ewe;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public abstract class e extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int i;
    public int j;
    public String k;
    public String l;
    public String m;
    public String n;
    public boolean o;
    public String p;
    public String q;
    public ArrayList<e> r;

    static {
        kge.a(2034174577);
    }

    public abstract void a(JSONObject jSONObject);

    public abstract boolean a();

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public void parseMapping() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba075a2", new Object[]{this});
        }
    }

    public e(ComponentModel componentModel) {
        super(componentModel);
        this.m = null;
        this.n = null;
        this.o = false;
        this.r = new ArrayList<>();
        tpc.a("com.taobao.android.detail.sdk.vmodel.desc.DescViewModel");
        if (componentModel == null) {
            return;
        }
        this.k = componentModel.ruleId;
        this.l = componentModel.key;
        buildChildren();
        parseMapping();
        initEvents();
        initStyle();
        if (componentModel.mapping == null) {
            return;
        }
        this.p = componentModel.mapping.getString("spm");
        this.q = componentModel.mapping.getString("scm");
        try {
            a(componentModel.mapping);
        } catch (JSONException e) {
            Log.e("DescViewModel", this.k + ":onViewModelCreate", e);
        }
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public void initEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72395e50", new Object[]{this});
        } else if (this.component != null && this.component.actionModelList != null && !this.component.actionModelList.isEmpty()) {
            if (this.component.mapping == null) {
                this.component.mapping = new JSONObject();
            }
            this.component.mapping.put("componentId", (Object) this.k);
            for (ActionModel actionModel : this.component.actionModelList) {
                JSONObject jSONObject = actionModel.params;
                if (jSONObject != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        entry.setValue(com.taobao.android.detail.sdk.utils.h.a(this.component.mapping, entry.getValue()));
                    }
                }
                this.events.add(new ewe().a(actionModel, this.component.mapping));
            }
        }
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public void initStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c821ce88", new Object[]{this});
        } else if (this.component.mapping == null || this.component.otherMapping == null || this.component.otherMapping.isEmpty()) {
        } else {
            this.component.mapping.putAll(this.component.otherMapping);
        }
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public void buildChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ccdb094", new Object[]{this});
        } else if (this.component != null && this.component.children != null) {
            com.taobao.android.detail.sdk.factory.manager.b a2 = com.taobao.android.detail.sdk.factory.manager.b.a();
            for (ComponentModel componentModel : this.component.children) {
                e a3 = a2.a(componentModel);
                if (a3 != null && !a3.a()) {
                    this.r.add(a3);
                }
            }
        }
    }

    public ArrayList<e> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("2f3d5943", new Object[]{this}) : this.r;
    }

    public g c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("a34cd836", new Object[]{this});
        }
        if (this.component.mapping == null || !this.component.mapping.containsKey("componentTitle")) {
            return null;
        }
        JSONObject jSONObject = this.component.mapping.getJSONObject("componentTitle");
        if (StringUtils.isEmpty(jSONObject.getString("text"))) {
            return null;
        }
        g gVar = new g();
        gVar.k = gVar.hashCode() + "";
        gVar.l = "desc_division_title";
        gVar.c = jSONObject.getString("text");
        gVar.e = jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO);
        gVar.g = jSONObject.getString("linkUrl");
        gVar.f = jSONObject.getString("linkText");
        gVar.d = this.component.mapping.getString("backgroundColor");
        gVar.f10370a = this.component.mapping.getString("titleColor");
        gVar.b = this.component.mapping.getString("lineColor");
        gVar.h = this.component.mapping.getString("paddingBottom");
        gVar.s = this.component.mapping.getBooleanValue("isHLine");
        return gVar;
    }
}
