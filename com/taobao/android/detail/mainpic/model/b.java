package com.taobao.android.detail.mainpic.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10197a;
    public JSONObject b;
    public String c;
    public JSONObject d;
    public int e;
    public String f;
    public JSONObject g;
    public boolean h = true;

    public static b a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("6ea8f7a6", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        try {
            bVar.f10197a = jSONObject.getString("type");
            bVar.c = jSONObject.getString("floatType");
            bVar.f = jSONObject.getString("locator");
            bVar.e = jSONObject.getInteger("index").intValue();
            bVar.b = jSONObject.getJSONObject("data");
            bVar.d = jSONObject.getJSONObject("floatData");
            bVar.g = jSONObject.getJSONObject("events");
            if (jSONObject.getBoolean("needLightOffPage") != null) {
                bVar.h = jSONObject.getBoolean("needLightOffPage").booleanValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bVar;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10197a;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.d;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.e;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this}) : this.g;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.h;
    }
}
