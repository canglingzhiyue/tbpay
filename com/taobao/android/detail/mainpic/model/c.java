package com.taobao.android.detail.mainpic.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.industry.maingallery.render.component.vessel.bridge.TBDetailPicGalleryBridge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10198a;
    public String b;
    public JSONObject c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public JSONObject i;
    public JSONObject j = new JSONObject();

    public static c a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("6ea8f7c5", new Object[]{jSONObject});
        }
        c cVar = new c();
        cVar.f10198a = jSONObject.getString(TBDetailPicGalleryBridge.TOKEN_KEY_VO_NAME);
        cVar.b = jSONObject.getString("target");
        cVar.c = jSONObject.getJSONObject("mtopConfig");
        cVar.d = jSONObject.getString("mtopConfig");
        cVar.e = jSONObject.getString("opType");
        cVar.f = jSONObject.getString("keyPath");
        cVar.g = jSONObject.getString("position");
        cVar.h = jSONObject.getString(com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT);
        cVar.i = jSONObject.getJSONObject("defaultVOData");
        if (cVar.i != null) {
            cVar.j = new JSONObject();
            cVar.j.put(cVar.f10198a, (Object) cVar.i);
        }
        return cVar;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10198a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.e;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.f;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.g;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.h;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.d;
    }

    public JSONObject h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("fa36400f", new Object[]{this}) : this.j;
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            this.j = null;
        } else if (this.j.getJSONObject(a()) != null) {
            this.j.getJSONObject(a()).putAll(jSONObject);
        } else {
            this.j.put(a(), (Object) jSONObject);
        }
    }
}
