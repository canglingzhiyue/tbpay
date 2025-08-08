package com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ActionModel;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.syu;
import tb.syx;

/* loaded from: classes5.dex */
public abstract class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int i;
    public int j;
    public String k;
    public String l;
    public String p;
    public String q;
    public ArrayList<e> r;
    public ComponentModel s;
    public String t;
    public String m = null;
    public String n = null;
    public boolean o = false;
    public List<com.taobao.android.detail.ttdetail.communication.a> u = new ArrayList();

    static {
        kge.a(-633441626);
    }

    public abstract void a(JSONObject jSONObject);

    public abstract boolean a();

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public e(ComponentModel componentModel) {
        this.s = componentModel;
        if (componentModel != null) {
            this.t = componentModel.locatorId;
        }
        this.r = new ArrayList<>();
        if (componentModel == null) {
            return;
        }
        this.k = componentModel.ruleId;
        this.l = componentModel.key;
        d();
        b();
        c();
        if (componentModel.mapping == null) {
            return;
        }
        this.p = componentModel.mapping.getString("spm");
        this.q = componentModel.mapping.getString("scm");
        try {
            a(componentModel.mapping);
        } catch (JSONException e) {
            com.taobao.android.detail.ttdetail.utils.i.a("DescViewModel", this.k + ":onViewModelCreate", e);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ComponentModel componentModel = this.s;
        if (componentModel == null || componentModel.actionModelList == null || this.s.actionModelList.isEmpty()) {
            return;
        }
        if (this.s.mapping == null) {
            this.s.mapping = new JSONObject();
        }
        this.s.mapping.put("componentId", (Object) this.k);
        for (ActionModel actionModel : this.s.actionModelList) {
            JSONObject jSONObject = actionModel.params;
            if (jSONObject != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    entry.setValue(syx.a(this.s.mapping, entry.getValue()));
                }
            }
            this.u.add(syu.a(actionModel, this.s.mapping));
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.s.mapping == null || this.s.otherMapping == null || this.s.otherMapping.isEmpty()) {
        } else {
            this.s.mapping.putAll(this.s.otherMapping);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ComponentModel componentModel = this.s;
        if (componentModel == null || componentModel.children == null) {
            return;
        }
        for (ComponentModel componentModel2 : this.s.children) {
            e a2 = com.taobao.android.detail.ttdetail.skeleton.desc.natives.e.a(componentModel2);
            if (a2 != null && !a2.a()) {
                this.r.add(a2);
            }
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.l;
    }

    public ArrayList<e> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("3ffe8d47", new Object[]{this}) : this.r;
    }

    public g g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("4487d8dd", new Object[]{this});
        }
        if (this.s.mapping == null || !this.s.mapping.containsKey("componentTitle")) {
            return null;
        }
        JSONObject jSONObject = this.s.mapping.getJSONObject("componentTitle");
        if (StringUtils.isEmpty(jSONObject.getString("text"))) {
            return null;
        }
        g gVar = new g(this.s);
        gVar.k = gVar.hashCode() + "";
        gVar.l = "desc_division_title";
        gVar.c = jSONObject.getString("text");
        gVar.e = jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO);
        gVar.g = jSONObject.getString("linkUrl");
        gVar.f = jSONObject.getString("linkText");
        gVar.d = this.s.mapping.getString("backgroundColor");
        gVar.f10872a = this.s.mapping.getString("titleColor");
        gVar.b = this.s.mapping.getString("lineColor");
        gVar.h = this.s.mapping.getString("paddingBottom");
        gVar.v = this.s.mapping.getBooleanValue("isHLine");
        return gVar;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        return this.j + "";
    }
}
